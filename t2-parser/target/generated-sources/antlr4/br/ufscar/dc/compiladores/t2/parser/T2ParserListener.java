// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.t2.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link T2ParserParser}.
 */
public interface T2ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(T2ParserParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(T2ParserParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void enterListaDeclaracoes(T2ParserParser.ListaDeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void exitListaDeclaracoes(T2ParserParser.ListaDeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(T2ParserParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(T2ParserParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmetica(T2ParserParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmetica(T2ParserParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#termoAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterTermoAritmetico(T2ParserParser.TermoAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#termoAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitTermoAritmetico(T2ParserParser.TermoAritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterFatorAritmetico(T2ParserParser.FatorAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitFatorAritmetico(T2ParserParser.FatorAritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoRelacional(T2ParserParser.ExpressaoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoRelacional(T2ParserParser.ExpressaoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#termoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterTermoRelacional(T2ParserParser.TermoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#termoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitTermoRelacional(T2ParserParser.TermoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void enterListaComandos(T2ParserParser.ListaComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void exitListaComandos(T2ParserParser.ListaComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(T2ParserParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(T2ParserParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoAtribuicao(T2ParserParser.ComandoAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoAtribuicao(T2ParserParser.ComandoAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#comandoEntrada}.
	 * @param ctx the parse tree
	 */
	void enterComandoEntrada(T2ParserParser.ComandoEntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#comandoEntrada}.
	 * @param ctx the parse tree
	 */
	void exitComandoEntrada(T2ParserParser.ComandoEntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#comandoSaida}.
	 * @param ctx the parse tree
	 */
	void enterComandoSaida(T2ParserParser.ComandoSaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#comandoSaida}.
	 * @param ctx the parse tree
	 */
	void exitComandoSaida(T2ParserParser.ComandoSaidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#comandoCondicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoCondicao(T2ParserParser.ComandoCondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#comandoCondicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoCondicao(T2ParserParser.ComandoCondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 */
	void enterComandoRepeticao(T2ParserParser.ComandoRepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 */
	void exitComandoRepeticao(T2ParserParser.ComandoRepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 */
	void enterSubAlgoritmo(T2ParserParser.SubAlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 */
	void exitSubAlgoritmo(T2ParserParser.SubAlgoritmoContext ctx);
}