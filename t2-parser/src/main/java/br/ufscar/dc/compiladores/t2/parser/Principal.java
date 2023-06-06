package br.ufscar.dc.compiladores.t2.parser;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
// import org.antlr.v4.runtime.Token;


public class Principal {
    public static void main(String args[]) throws IOException {
        try(PrintWriter pw = new PrintWriter(new File(args[1]))) { 
            CharStream cs = CharStreams.fromFileName(args[0]);
            T2Lexer lexer = new T2Lexer(cs);

    //        // Descomentar para depurar o Léxico
    //        Token t = null;
    //        while( (t = lexer.nextToken()).getType() != Token.EOF) {
    //            System.out.println("<" + AlgumaLexer.VOCABULARY.getDisplayName(t.getType()) + "," + t.getText() + ">");
    //        }
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            T2Parser parser = new T2Parser(tokens);

            parser.removeErrorListeners();
            MyCustomErrorListener mcel = new MyCustomErrorListener(pw);
            parser.addErrorListener(mcel);

            parser.programa();
            pw.println("Fim da compilacao");
        }
    }
}
