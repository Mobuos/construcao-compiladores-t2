// Generated from /home/recoaro/Codes/UFSCAR/2023/Compiladores/construcao-compiladores-t2/t2-parser/src/main/antlr4/br/ufscar/dc/compiladores/t2/parser/T2.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class T2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMENTARIO=1, ALGORITMO=2, FIM_ALGORITMO=3, DECLARE=4, CONSTANTE=5, LITERAL=6, 
		INTEIRO=7, REAL=8, LOGICO=9, TRUE=10, FALSE=11, AND=12, OR=13, NOT=14, 
		IF=15, THEN=16, ELSE=17, ENDIF=18, CASO=19, SEJA=20, FIM_CASO=21, PARA=22, 
		ATE=23, FACA=24, FIM_PARA=25, WHILE=26, ENDWHILE=27, TIPO=28, REGISTRO=29, 
		FIM_REGISTRO=30, PROCEDIMENTO=31, VAR=32, FIM_PROCEDIMENTO=33, FUNCAO=34, 
		RETORNE=35, FIM_FUNCAO=36, LEIA=37, ESCREVA=38, INTERVALO=39, MENOR=40, 
		MENORIGUAL=41, MAIOR=42, MAIORIGUAL=43, IGUAL=44, DIFERENTE=45, DELIM=46, 
		ABREPAR=47, FECHAPAR=48, ABRECHAVE=49, FECHACHAVE=50, VIRGULA=51, ASPAS=52, 
		DIVISAO=53, MOD=54, SOMA=55, SUBTRACAO=56, MULTIPLICACAO=57, ATRIBUICAO=58, 
		PONTEIRO=59, ENDERECO=60, PONTO=61, NUM_INT=62, NUM_REAL=63, IDENT=64, 
		CADEIA=65, CADEIA_N_FECHADA=66, WS=67, COMENT_N_FECHADO=68, ERRO=69;
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_declaracao_variaveis = 2, 
		RULE_variavel = 3, RULE_identificador = 4, RULE_tipo = 5, RULE_tipo_basico = 6, 
		RULE_tipo_variavel = 7, RULE_valor_constante = 8, RULE_registro = 9, RULE_parametro = 10, 
		RULE_parametros = 11, RULE_declaracao_funcoes = 12, RULE_corpo = 13, RULE_cmd = 14, 
		RULE_cmdLeia = 15, RULE_cmdEscreva = 16, RULE_cmdSe = 17, RULE_cmdCaso = 18, 
		RULE_cmdPara = 19, RULE_cmdEnquanto = 20, RULE_cmdFaca = 21, RULE_cmdAtribuicao = 22, 
		RULE_cmdChamada = 23, RULE_cmdRetorne = 24, RULE_selecao = 25, RULE_item_selecao = 26, 
		RULE_constantes = 27, RULE_numero_intervalo = 28, RULE_op_unario = 29, 
		RULE_exp_aritmetica = 30, RULE_termo = 31, RULE_fator = 32, RULE_op1 = 33, 
		RULE_op2 = 34, RULE_op3 = 35, RULE_parcela = 36, RULE_parcela_unario = 37, 
		RULE_parcela_nao_unario = 38, RULE_exp_relacional = 39, RULE_op_relacional = 40, 
		RULE_expressao = 41, RULE_termo_logico = 42, RULE_fator_logico = 43, RULE_parcela_logica = 44, 
		RULE_op_logico_1 = 45, RULE_op_logico_2 = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracoes", "declaracao_variaveis", "variavel", "identificador", 
			"tipo", "tipo_basico", "tipo_variavel", "valor_constante", "registro", 
			"parametro", "parametros", "declaracao_funcoes", "corpo", "cmd", "cmdLeia", 
			"cmdEscreva", "cmdSe", "cmdCaso", "cmdPara", "cmdEnquanto", "cmdFaca", 
			"cmdAtribuicao", "cmdChamada", "cmdRetorne", "selecao", "item_selecao", 
			"constantes", "numero_intervalo", "op_unario", "exp_aritmetica", "termo", 
			"fator", "op1", "op2", "op3", "parcela", "parcela_unario", "parcela_nao_unario", 
			"exp_relacional", "op_relacional", "expressao", "termo_logico", "fator_logico", 
			"parcela_logica", "op_logico_1", "op_logico_2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'algoritmo'", "'fim_algoritmo'", "'declare'", "'constante'", 
			"'literal'", "'inteiro'", "'real'", "'logico'", "'verdadeiro'", "'falso'", 
			"'e'", "'ou'", "'nao'", "'se'", "'entao'", "'senao'", "'fim_se'", "'caso'", 
			"'seja'", "'fim_caso'", "'para'", "'ate'", "'faca'", "'fim_para'", "'enquanto'", 
			"'fim_enquanto'", "'tipo'", "'registro'", "'fim_registro'", "'procedimento'", 
			"'var'", "'fim_procedimento'", "'funcao'", "'retorne'", "'fim_funcao'", 
			"'leia'", "'escreva'", "'..'", "'<'", "'<='", "'>'", "'>='", "'='", "'<>'", 
			"':'", "'('", "')'", "'['", "']'", "','", "'\"'", "'/'", "'%'", "'+'", 
			"'-'", "'*'", "'<-'", "'^'", "'&'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMENTARIO", "ALGORITMO", "FIM_ALGORITMO", "DECLARE", "CONSTANTE", 
			"LITERAL", "INTEIRO", "REAL", "LOGICO", "TRUE", "FALSE", "AND", "OR", 
			"NOT", "IF", "THEN", "ELSE", "ENDIF", "CASO", "SEJA", "FIM_CASO", "PARA", 
			"ATE", "FACA", "FIM_PARA", "WHILE", "ENDWHILE", "TIPO", "REGISTRO", "FIM_REGISTRO", 
			"PROCEDIMENTO", "VAR", "FIM_PROCEDIMENTO", "FUNCAO", "RETORNE", "FIM_FUNCAO", 
			"LEIA", "ESCREVA", "INTERVALO", "MENOR", "MENORIGUAL", "MAIOR", "MAIORIGUAL", 
			"IGUAL", "DIFERENTE", "DELIM", "ABREPAR", "FECHAPAR", "ABRECHAVE", "FECHACHAVE", 
			"VIRGULA", "ASPAS", "DIVISAO", "MOD", "SOMA", "SUBTRACAO", "MULTIPLICACAO", 
			"ATRIBUICAO", "PONTEIRO", "ENDERECO", "PONTO", "NUM_INT", "NUM_REAL", 
			"IDENT", "CADEIA", "CADEIA_N_FECHADA", "WS", "COMENT_N_FECHADO", "ERRO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "T2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public T2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public TerminalNode ALGORITMO() { return getToken(T2Parser.ALGORITMO, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public TerminalNode FIM_ALGORITMO() { return getToken(T2Parser.FIM_ALGORITMO, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			declaracoes();
			setState(95);
			match(ALGORITMO);
			setState(96);
			corpo();
			setState(97);
			match(FIM_ALGORITMO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracoesContext extends ParserRuleContext {
		public List<Declaracao_variaveisContext> declaracao_variaveis() {
			return getRuleContexts(Declaracao_variaveisContext.class);
		}
		public Declaracao_variaveisContext declaracao_variaveis(int i) {
			return getRuleContext(Declaracao_variaveisContext.class,i);
		}
		public List<Declaracao_funcoesContext> declaracao_funcoes() {
			return getRuleContexts(Declaracao_funcoesContext.class);
		}
		public Declaracao_funcoesContext declaracao_funcoes(int i) {
			return getRuleContext(Declaracao_funcoesContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPO) | (1L << PROCEDIMENTO) | (1L << FUNCAO))) != 0)) {
				{
				setState(101);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DECLARE:
				case CONSTANTE:
				case TIPO:
					{
					setState(99);
					declaracao_variaveis();
					}
					break;
				case PROCEDIMENTO:
				case FUNCAO:
					{
					setState(100);
					declaracao_funcoes();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracao_variaveisContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(T2Parser.DECLARE, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode CONSTANTE() { return getToken(T2Parser.CONSTANTE, 0); }
		public TerminalNode IDENT() { return getToken(T2Parser.IDENT, 0); }
		public TerminalNode DELIM() { return getToken(T2Parser.DELIM, 0); }
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(T2Parser.IGUAL, 0); }
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public TerminalNode TIPO() { return getToken(T2Parser.TIPO, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Declaracao_variaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_variaveis; }
	}

	public final Declaracao_variaveisContext declaracao_variaveis() throws RecognitionException {
		Declaracao_variaveisContext _localctx = new Declaracao_variaveisContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao_variaveis);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(DECLARE);
				setState(107);
				variavel();
				}
				break;
			case CONSTANTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(CONSTANTE);
				setState(109);
				match(IDENT);
				setState(110);
				match(DELIM);
				setState(111);
				tipo_basico();
				setState(112);
				match(IGUAL);
				setState(113);
				valor_constante();
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				match(TIPO);
				setState(116);
				match(IDENT);
				setState(117);
				match(DELIM);
				setState(118);
				tipo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariavelContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode DELIM() { return getToken(T2Parser.DELIM, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(T2Parser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(T2Parser.VIRGULA, i);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			identificador();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(122);
				match(VIRGULA);
				setState(123);
				identificador();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			match(DELIM);
			setState(130);
			tipo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentificadorContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(T2Parser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(T2Parser.IDENT, i);
		}
		public List<TerminalNode> PONTO() { return getTokens(T2Parser.PONTO); }
		public TerminalNode PONTO(int i) {
			return getToken(T2Parser.PONTO, i);
		}
		public List<TerminalNode> ABRECHAVE() { return getTokens(T2Parser.ABRECHAVE); }
		public TerminalNode ABRECHAVE(int i) {
			return getToken(T2Parser.ABRECHAVE, i);
		}
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public List<TerminalNode> FECHACHAVE() { return getTokens(T2Parser.FECHACHAVE); }
		public TerminalNode FECHACHAVE(int i) {
			return getToken(T2Parser.FECHACHAVE, i);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_identificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(IDENT);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PONTO) {
				{
				{
				setState(133);
				match(PONTO);
				setState(134);
				match(IDENT);
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABRECHAVE) {
				{
				{
				setState(140);
				match(ABRECHAVE);
				setState(141);
				exp_aritmetica();
				setState(142);
				match(FECHACHAVE);
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public Tipo_variavelContext tipo_variavel() {
			return getRuleContext(Tipo_variavelContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGISTRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				registro();
				}
				break;
			case LITERAL:
			case INTEIRO:
			case REAL:
			case LOGICO:
			case PONTEIRO:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				tipo_variavel();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_basicoContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(T2Parser.LITERAL, 0); }
		public TerminalNode INTEIRO() { return getToken(T2Parser.INTEIRO, 0); }
		public TerminalNode REAL() { return getToken(T2Parser.REAL, 0); }
		public TerminalNode LOGICO() { return getToken(T2Parser.LOGICO, 0); }
		public Tipo_basicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico; }
	}

	public final Tipo_basicoContext tipo_basico() throws RecognitionException {
		Tipo_basicoContext _localctx = new Tipo_basicoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipo_basico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LITERAL) | (1L << INTEIRO) | (1L << REAL) | (1L << LOGICO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_variavelContext extends ParserRuleContext {
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(T2Parser.IDENT, 0); }
		public TerminalNode PONTEIRO() { return getToken(T2Parser.PONTEIRO, 0); }
		public Tipo_variavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_variavel; }
	}

	public final Tipo_variavelContext tipo_variavel() throws RecognitionException {
		Tipo_variavelContext _localctx = new Tipo_variavelContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipo_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONTEIRO) {
				{
				setState(155);
				match(PONTEIRO);
				}
			}

			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
			case INTEIRO:
			case REAL:
			case LOGICO:
				{
				setState(158);
				tipo_basico();
				}
				break;
			case IDENT:
				{
				setState(159);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Valor_constanteContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(T2Parser.CADEIA, 0); }
		public TerminalNode NUM_INT() { return getToken(T2Parser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(T2Parser.NUM_REAL, 0); }
		public TerminalNode TRUE() { return getToken(T2Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(T2Parser.FALSE, 0); }
		public Valor_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_constante; }
	}

	public final Valor_constanteContext valor_constante() throws RecognitionException {
		Valor_constanteContext _localctx = new Valor_constanteContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !(((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (TRUE - 10)) | (1L << (FALSE - 10)) | (1L << (NUM_INT - 10)) | (1L << (NUM_REAL - 10)) | (1L << (CADEIA - 10)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegistroContext extends ParserRuleContext {
		public TerminalNode REGISTRO() { return getToken(T2Parser.REGISTRO, 0); }
		public TerminalNode FIM_REGISTRO() { return getToken(T2Parser.FIM_REGISTRO, 0); }
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_registro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(REGISTRO);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(165);
				variavel();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(FIM_REGISTRO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametroContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode DELIM() { return getToken(T2Parser.DELIM, 0); }
		public Tipo_variavelContext tipo_variavel() {
			return getRuleContext(Tipo_variavelContext.class,0);
		}
		public TerminalNode VAR() { return getToken(T2Parser.VAR, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(T2Parser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(T2Parser.VIRGULA, i);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(173);
				match(VAR);
				}
			}

			setState(176);
			identificador();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(177);
				match(VIRGULA);
				setState(178);
				identificador();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
			match(DELIM);
			setState(185);
			tipo_variavel();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(T2Parser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(T2Parser.VIRGULA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			parametro();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(188);
				match(VIRGULA);
				setState(189);
				parametro();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracao_funcoesContext extends ParserRuleContext {
		public TerminalNode PROCEDIMENTO() { return getToken(T2Parser.PROCEDIMENTO, 0); }
		public TerminalNode IDENT() { return getToken(T2Parser.IDENT, 0); }
		public TerminalNode ABREPAR() { return getToken(T2Parser.ABREPAR, 0); }
		public TerminalNode FECHAPAR() { return getToken(T2Parser.FECHAPAR, 0); }
		public TerminalNode FIM_PROCEDIMENTO() { return getToken(T2Parser.FIM_PROCEDIMENTO, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public List<Declaracao_variaveisContext> declaracao_variaveis() {
			return getRuleContexts(Declaracao_variaveisContext.class);
		}
		public Declaracao_variaveisContext declaracao_variaveis(int i) {
			return getRuleContext(Declaracao_variaveisContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode FUNCAO() { return getToken(T2Parser.FUNCAO, 0); }
		public TerminalNode DELIM() { return getToken(T2Parser.DELIM, 0); }
		public Tipo_variavelContext tipo_variavel() {
			return getRuleContext(Tipo_variavelContext.class,0);
		}
		public TerminalNode FIM_FUNCAO() { return getToken(T2Parser.FIM_FUNCAO, 0); }
		public Declaracao_funcoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_funcoes; }
	}

	public final Declaracao_funcoesContext declaracao_funcoes() throws RecognitionException {
		Declaracao_funcoesContext _localctx = new Declaracao_funcoesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declaracao_funcoes);
		int _la;
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(PROCEDIMENTO);
				setState(196);
				match(IDENT);
				setState(197);
				match(ABREPAR);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR || _la==IDENT) {
					{
					setState(198);
					parametros();
					}
				}

				setState(201);
				match(FECHAPAR);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPO))) != 0)) {
					{
					{
					setState(202);
					declaracao_variaveis();
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (IF - 15)) | (1L << (CASO - 15)) | (1L << (PARA - 15)) | (1L << (FACA - 15)) | (1L << (WHILE - 15)) | (1L << (RETORNE - 15)) | (1L << (LEIA - 15)) | (1L << (ESCREVA - 15)) | (1L << (PONTEIRO - 15)) | (1L << (IDENT - 15)))) != 0)) {
					{
					{
					setState(208);
					cmd();
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(214);
				match(FIM_PROCEDIMENTO);
				}
				break;
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(FUNCAO);
				setState(216);
				match(IDENT);
				setState(217);
				match(ABREPAR);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR || _la==IDENT) {
					{
					setState(218);
					parametros();
					}
				}

				setState(221);
				match(FECHAPAR);
				setState(222);
				match(DELIM);
				setState(223);
				tipo_variavel();
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPO))) != 0)) {
					{
					{
					setState(224);
					declaracao_variaveis();
					}
					}
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (IF - 15)) | (1L << (CASO - 15)) | (1L << (PARA - 15)) | (1L << (FACA - 15)) | (1L << (WHILE - 15)) | (1L << (RETORNE - 15)) | (1L << (LEIA - 15)) | (1L << (ESCREVA - 15)) | (1L << (PONTEIRO - 15)) | (1L << (IDENT - 15)))) != 0)) {
					{
					{
					setState(230);
					cmd();
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(236);
				match(FIM_FUNCAO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CorpoContext extends ParserRuleContext {
		public List<Declaracao_variaveisContext> declaracao_variaveis() {
			return getRuleContexts(Declaracao_variaveisContext.class);
		}
		public Declaracao_variaveisContext declaracao_variaveis(int i) {
			return getRuleContext(Declaracao_variaveisContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPO))) != 0)) {
				{
				{
				setState(240);
				declaracao_variaveis();
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (IF - 15)) | (1L << (CASO - 15)) | (1L << (PARA - 15)) | (1L << (FACA - 15)) | (1L << (WHILE - 15)) | (1L << (RETORNE - 15)) | (1L << (LEIA - 15)) | (1L << (ESCREVA - 15)) | (1L << (PONTEIRO - 15)) | (1L << (IDENT - 15)))) != 0)) {
				{
				{
				setState(246);
				cmd();
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdContext extends ParserRuleContext {
		public CmdLeiaContext cmdLeia() {
			return getRuleContext(CmdLeiaContext.class,0);
		}
		public CmdEscrevaContext cmdEscreva() {
			return getRuleContext(CmdEscrevaContext.class,0);
		}
		public CmdSeContext cmdSe() {
			return getRuleContext(CmdSeContext.class,0);
		}
		public CmdCasoContext cmdCaso() {
			return getRuleContext(CmdCasoContext.class,0);
		}
		public CmdParaContext cmdPara() {
			return getRuleContext(CmdParaContext.class,0);
		}
		public CmdEnquantoContext cmdEnquanto() {
			return getRuleContext(CmdEnquantoContext.class,0);
		}
		public CmdFacaContext cmdFaca() {
			return getRuleContext(CmdFacaContext.class,0);
		}
		public CmdAtribuicaoContext cmdAtribuicao() {
			return getRuleContext(CmdAtribuicaoContext.class,0);
		}
		public CmdChamadaContext cmdChamada() {
			return getRuleContext(CmdChamadaContext.class,0);
		}
		public CmdRetorneContext cmdRetorne() {
			return getRuleContext(CmdRetorneContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cmd);
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				cmdLeia();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				cmdEscreva();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				cmdSe();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				cmdCaso();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(256);
				cmdPara();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(257);
				cmdEnquanto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(258);
				cmdFaca();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(259);
				cmdAtribuicao();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(260);
				cmdChamada();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(261);
				cmdRetorne();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdLeiaContext extends ParserRuleContext {
		public TerminalNode LEIA() { return getToken(T2Parser.LEIA, 0); }
		public TerminalNode ABREPAR() { return getToken(T2Parser.ABREPAR, 0); }
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode FECHAPAR() { return getToken(T2Parser.FECHAPAR, 0); }
		public List<TerminalNode> PONTEIRO() { return getTokens(T2Parser.PONTEIRO); }
		public TerminalNode PONTEIRO(int i) {
			return getToken(T2Parser.PONTEIRO, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(T2Parser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(T2Parser.VIRGULA, i);
		}
		public CmdLeiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLeia; }
	}

	public final CmdLeiaContext cmdLeia() throws RecognitionException {
		CmdLeiaContext _localctx = new CmdLeiaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cmdLeia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(LEIA);
			setState(265);
			match(ABREPAR);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONTEIRO) {
				{
				setState(266);
				match(PONTEIRO);
				}
			}

			setState(269);
			identificador();
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(270);
				match(VIRGULA);
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PONTEIRO) {
					{
					setState(271);
					match(PONTEIRO);
					}
				}

				setState(274);
				identificador();
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			match(FECHAPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdEscrevaContext extends ParserRuleContext {
		public TerminalNode ESCREVA() { return getToken(T2Parser.ESCREVA, 0); }
		public TerminalNode ABREPAR() { return getToken(T2Parser.ABREPAR, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHAPAR() { return getToken(T2Parser.FECHAPAR, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(T2Parser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(T2Parser.VIRGULA, i);
		}
		public CmdEscrevaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEscreva; }
	}

	public final CmdEscrevaContext cmdEscreva() throws RecognitionException {
		CmdEscrevaContext _localctx = new CmdEscrevaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cmdEscreva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(ESCREVA);
			setState(283);
			match(ABREPAR);
			setState(284);
			expressao();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(285);
				match(VIRGULA);
				setState(286);
				expressao();
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
			match(FECHAPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdSeContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(T2Parser.IF, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode THEN() { return getToken(T2Parser.THEN, 0); }
		public TerminalNode ENDIF() { return getToken(T2Parser.ENDIF, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(T2Parser.ELSE, 0); }
		public CmdSeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSe; }
	}

	public final CmdSeContext cmdSe() throws RecognitionException {
		CmdSeContext _localctx = new CmdSeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cmdSe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(IF);
			setState(295);
			expressao();
			setState(296);
			match(THEN);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (IF - 15)) | (1L << (CASO - 15)) | (1L << (PARA - 15)) | (1L << (FACA - 15)) | (1L << (WHILE - 15)) | (1L << (RETORNE - 15)) | (1L << (LEIA - 15)) | (1L << (ESCREVA - 15)) | (1L << (PONTEIRO - 15)) | (1L << (IDENT - 15)))) != 0)) {
				{
				{
				setState(297);
				cmd();
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(303);
				match(ELSE);
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (IF - 15)) | (1L << (CASO - 15)) | (1L << (PARA - 15)) | (1L << (FACA - 15)) | (1L << (WHILE - 15)) | (1L << (RETORNE - 15)) | (1L << (LEIA - 15)) | (1L << (ESCREVA - 15)) | (1L << (PONTEIRO - 15)) | (1L << (IDENT - 15)))) != 0)) {
					{
					{
					setState(304);
					cmd();
					}
					}
					setState(309);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(312);
			match(ENDIF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdCasoContext extends ParserRuleContext {
		public TerminalNode CASO() { return getToken(T2Parser.CASO, 0); }
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public TerminalNode SEJA() { return getToken(T2Parser.SEJA, 0); }
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public TerminalNode FIM_CASO() { return getToken(T2Parser.FIM_CASO, 0); }
		public TerminalNode ELSE() { return getToken(T2Parser.ELSE, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdCasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdCaso; }
	}

	public final CmdCasoContext cmdCaso() throws RecognitionException {
		CmdCasoContext _localctx = new CmdCasoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cmdCaso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(CASO);
			setState(315);
			exp_aritmetica();
			setState(316);
			match(SEJA);
			setState(317);
			selecao();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(318);
				match(ELSE);
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (IF - 15)) | (1L << (CASO - 15)) | (1L << (PARA - 15)) | (1L << (FACA - 15)) | (1L << (WHILE - 15)) | (1L << (RETORNE - 15)) | (1L << (LEIA - 15)) | (1L << (ESCREVA - 15)) | (1L << (PONTEIRO - 15)) | (1L << (IDENT - 15)))) != 0)) {
					{
					{
					setState(319);
					cmd();
					}
					}
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(327);
			match(FIM_CASO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdParaContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(T2Parser.PARA, 0); }
		public TerminalNode IDENT() { return getToken(T2Parser.IDENT, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(T2Parser.ATRIBUICAO, 0); }
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public TerminalNode ATE() { return getToken(T2Parser.ATE, 0); }
		public TerminalNode FACA() { return getToken(T2Parser.FACA, 0); }
		public TerminalNode FIM_PARA() { return getToken(T2Parser.FIM_PARA, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdPara; }
	}

	public final CmdParaContext cmdPara() throws RecognitionException {
		CmdParaContext _localctx = new CmdParaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cmdPara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(PARA);
			setState(330);
			match(IDENT);
			setState(331);
			match(ATRIBUICAO);
			setState(332);
			exp_aritmetica();
			setState(333);
			match(ATE);
			setState(334);
			exp_aritmetica();
			setState(335);
			match(FACA);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (IF - 15)) | (1L << (CASO - 15)) | (1L << (PARA - 15)) | (1L << (FACA - 15)) | (1L << (WHILE - 15)) | (1L << (RETORNE - 15)) | (1L << (LEIA - 15)) | (1L << (ESCREVA - 15)) | (1L << (PONTEIRO - 15)) | (1L << (IDENT - 15)))) != 0)) {
				{
				{
				setState(336);
				cmd();
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
			match(FIM_PARA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdEnquantoContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(T2Parser.WHILE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FACA() { return getToken(T2Parser.FACA, 0); }
		public TerminalNode ENDWHILE() { return getToken(T2Parser.ENDWHILE, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdEnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEnquanto; }
	}

	public final CmdEnquantoContext cmdEnquanto() throws RecognitionException {
		CmdEnquantoContext _localctx = new CmdEnquantoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cmdEnquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(WHILE);
			setState(345);
			expressao();
			setState(346);
			match(FACA);
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (IF - 15)) | (1L << (CASO - 15)) | (1L << (PARA - 15)) | (1L << (FACA - 15)) | (1L << (WHILE - 15)) | (1L << (RETORNE - 15)) | (1L << (LEIA - 15)) | (1L << (ESCREVA - 15)) | (1L << (PONTEIRO - 15)) | (1L << (IDENT - 15)))) != 0)) {
				{
				{
				setState(347);
				cmd();
				}
				}
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(353);
			match(ENDWHILE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdFacaContext extends ParserRuleContext {
		public TerminalNode FACA() { return getToken(T2Parser.FACA, 0); }
		public TerminalNode ATE() { return getToken(T2Parser.ATE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdFacaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdFaca; }
	}

	public final CmdFacaContext cmdFaca() throws RecognitionException {
		CmdFacaContext _localctx = new CmdFacaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cmdFaca);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(FACA);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (IF - 15)) | (1L << (CASO - 15)) | (1L << (PARA - 15)) | (1L << (FACA - 15)) | (1L << (WHILE - 15)) | (1L << (RETORNE - 15)) | (1L << (LEIA - 15)) | (1L << (ESCREVA - 15)) | (1L << (PONTEIRO - 15)) | (1L << (IDENT - 15)))) != 0)) {
				{
				{
				setState(356);
				cmd();
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(362);
			match(ATE);
			setState(363);
			expressao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdAtribuicaoContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode ATRIBUICAO() { return getToken(T2Parser.ATRIBUICAO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PONTEIRO() { return getToken(T2Parser.PONTEIRO, 0); }
		public CmdAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAtribuicao; }
	}

	public final CmdAtribuicaoContext cmdAtribuicao() throws RecognitionException {
		CmdAtribuicaoContext _localctx = new CmdAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cmdAtribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONTEIRO) {
				{
				setState(365);
				match(PONTEIRO);
				}
			}

			setState(368);
			identificador();
			setState(369);
			match(ATRIBUICAO);
			setState(370);
			expressao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdChamadaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(T2Parser.IDENT, 0); }
		public TerminalNode ABREPAR() { return getToken(T2Parser.ABREPAR, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHAPAR() { return getToken(T2Parser.FECHAPAR, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(T2Parser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(T2Parser.VIRGULA, i);
		}
		public CmdChamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdChamada; }
	}

	public final CmdChamadaContext cmdChamada() throws RecognitionException {
		CmdChamadaContext _localctx = new CmdChamadaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cmdChamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(IDENT);
			setState(373);
			match(ABREPAR);
			setState(374);
			expressao();
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(375);
				match(VIRGULA);
				setState(376);
				expressao();
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(382);
			match(FECHAPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdRetorneContext extends ParserRuleContext {
		public TerminalNode RETORNE() { return getToken(T2Parser.RETORNE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CmdRetorneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRetorne; }
	}

	public final CmdRetorneContext cmdRetorne() throws RecognitionException {
		CmdRetorneContext _localctx = new CmdRetorneContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cmdRetorne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(RETORNE);
			setState(385);
			expressao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelecaoContext extends ParserRuleContext {
		public List<Item_selecaoContext> item_selecao() {
			return getRuleContexts(Item_selecaoContext.class);
		}
		public Item_selecaoContext item_selecao(int i) {
			return getRuleContext(Item_selecaoContext.class,i);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUBTRACAO || _la==NUM_INT) {
				{
				{
				setState(387);
				item_selecao();
				}
				}
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Item_selecaoContext extends ParserRuleContext {
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public TerminalNode DELIM() { return getToken(T2Parser.DELIM, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public Item_selecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item_selecao; }
	}

	public final Item_selecaoContext item_selecao() throws RecognitionException {
		Item_selecaoContext _localctx = new Item_selecaoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_item_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			constantes();
			setState(394);
			match(DELIM);
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (IF - 15)) | (1L << (CASO - 15)) | (1L << (PARA - 15)) | (1L << (FACA - 15)) | (1L << (WHILE - 15)) | (1L << (RETORNE - 15)) | (1L << (LEIA - 15)) | (1L << (ESCREVA - 15)) | (1L << (PONTEIRO - 15)) | (1L << (IDENT - 15)))) != 0)) {
				{
				{
				setState(395);
				cmd();
				}
				}
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantesContext extends ParserRuleContext {
		public List<Numero_intervaloContext> numero_intervalo() {
			return getRuleContexts(Numero_intervaloContext.class);
		}
		public Numero_intervaloContext numero_intervalo(int i) {
			return getRuleContext(Numero_intervaloContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(T2Parser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(T2Parser.VIRGULA, i);
		}
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			numero_intervalo();
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(402);
				match(VIRGULA);
				setState(403);
				numero_intervalo();
				}
				}
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numero_intervaloContext extends ParserRuleContext {
		public List<TerminalNode> NUM_INT() { return getTokens(T2Parser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(T2Parser.NUM_INT, i);
		}
		public List<Op_unarioContext> op_unario() {
			return getRuleContexts(Op_unarioContext.class);
		}
		public Op_unarioContext op_unario(int i) {
			return getRuleContext(Op_unarioContext.class,i);
		}
		public TerminalNode INTERVALO() { return getToken(T2Parser.INTERVALO, 0); }
		public Numero_intervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_intervalo; }
	}

	public final Numero_intervaloContext numero_intervalo() throws RecognitionException {
		Numero_intervaloContext _localctx = new Numero_intervaloContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_numero_intervalo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUBTRACAO) {
				{
				setState(409);
				op_unario();
				}
			}

			setState(412);
			match(NUM_INT);
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERVALO) {
				{
				setState(413);
				match(INTERVALO);
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUBTRACAO) {
					{
					setState(414);
					op_unario();
					}
				}

				setState(417);
				match(NUM_INT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_unarioContext extends ParserRuleContext {
		public TerminalNode SUBTRACAO() { return getToken(T2Parser.SUBTRACAO, 0); }
		public Op_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_unario; }
	}

	public final Op_unarioContext op_unario() throws RecognitionException {
		Op_unarioContext _localctx = new Op_unarioContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_op_unario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(SUBTRACAO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_aritmeticaContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<Op1Context> op1() {
			return getRuleContexts(Op1Context.class);
		}
		public Op1Context op1(int i) {
			return getRuleContext(Op1Context.class,i);
		}
		public Exp_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_aritmetica; }
	}

	public final Exp_aritmeticaContext exp_aritmetica() throws RecognitionException {
		Exp_aritmeticaContext _localctx = new Exp_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_exp_aritmetica);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			termo();
			setState(428);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(423);
					op1();
					setState(424);
					termo();
					}
					} 
				}
				setState(430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<Op2Context> op2() {
			return getRuleContexts(Op2Context.class);
		}
		public Op2Context op2(int i) {
			return getRuleContext(Op2Context.class,i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			fator();
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIVISAO || _la==MULTIPLICACAO) {
				{
				{
				setState(432);
				op2();
				setState(433);
				fator();
				}
				}
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FatorContext extends ParserRuleContext {
		public List<ParcelaContext> parcela() {
			return getRuleContexts(ParcelaContext.class);
		}
		public ParcelaContext parcela(int i) {
			return getRuleContext(ParcelaContext.class,i);
		}
		public List<Op3Context> op3() {
			return getRuleContexts(Op3Context.class);
		}
		public Op3Context op3(int i) {
			return getRuleContext(Op3Context.class,i);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			parcela();
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MOD) {
				{
				{
				setState(441);
				op3();
				setState(442);
				parcela();
				}
				}
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op1Context extends ParserRuleContext {
		public TerminalNode SOMA() { return getToken(T2Parser.SOMA, 0); }
		public TerminalNode SUBTRACAO() { return getToken(T2Parser.SUBTRACAO, 0); }
		public Op1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op1; }
	}

	public final Op1Context op1() throws RecognitionException {
		Op1Context _localctx = new Op1Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_op1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			_la = _input.LA(1);
			if ( !(_la==SOMA || _la==SUBTRACAO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op2Context extends ParserRuleContext {
		public TerminalNode MULTIPLICACAO() { return getToken(T2Parser.MULTIPLICACAO, 0); }
		public TerminalNode DIVISAO() { return getToken(T2Parser.DIVISAO, 0); }
		public Op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op2; }
	}

	public final Op2Context op2() throws RecognitionException {
		Op2Context _localctx = new Op2Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_op2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_la = _input.LA(1);
			if ( !(_la==DIVISAO || _la==MULTIPLICACAO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op3Context extends ParserRuleContext {
		public TerminalNode MOD() { return getToken(T2Parser.MOD, 0); }
		public Op3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op3; }
	}

	public final Op3Context op3() throws RecognitionException {
		Op3Context _localctx = new Op3Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_op3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(MOD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParcelaContext extends ParserRuleContext {
		public Parcela_unarioContext parcela_unario() {
			return getRuleContext(Parcela_unarioContext.class,0);
		}
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public Parcela_nao_unarioContext parcela_nao_unario() {
			return getRuleContext(Parcela_nao_unarioContext.class,0);
		}
		public ParcelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela; }
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_parcela);
		int _la;
		try {
			setState(460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABREPAR:
			case SUBTRACAO:
			case PONTEIRO:
			case NUM_INT:
			case NUM_REAL:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUBTRACAO) {
					{
					setState(455);
					op_unario();
					}
				}

				setState(458);
				parcela_unario();
				}
				break;
			case ENDERECO:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				parcela_nao_unario();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parcela_unarioContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode PONTEIRO() { return getToken(T2Parser.PONTEIRO, 0); }
		public TerminalNode IDENT() { return getToken(T2Parser.IDENT, 0); }
		public TerminalNode ABREPAR() { return getToken(T2Parser.ABREPAR, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHAPAR() { return getToken(T2Parser.FECHAPAR, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(T2Parser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(T2Parser.VIRGULA, i);
		}
		public TerminalNode NUM_INT() { return getToken(T2Parser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(T2Parser.NUM_REAL, 0); }
		public Parcela_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_unario; }
	}

	public final Parcela_unarioContext parcela_unario() throws RecognitionException {
		Parcela_unarioContext _localctx = new Parcela_unarioContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_parcela_unario);
		int _la;
		try {
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PONTEIRO) {
					{
					setState(462);
					match(PONTEIRO);
					}
				}

				setState(465);
				identificador();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				match(IDENT);
				setState(467);
				match(ABREPAR);
				setState(468);
				expressao();
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(469);
					match(VIRGULA);
					setState(470);
					expressao();
					}
					}
					setState(475);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(476);
				match(FECHAPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				match(NUM_INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(479);
				match(NUM_REAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(480);
				match(ABREPAR);
				setState(481);
				expressao();
				setState(482);
				match(FECHAPAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parcela_nao_unarioContext extends ParserRuleContext {
		public TerminalNode ENDERECO() { return getToken(T2Parser.ENDERECO, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(T2Parser.CADEIA, 0); }
		public Parcela_nao_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_nao_unario; }
	}

	public final Parcela_nao_unarioContext parcela_nao_unario() throws RecognitionException {
		Parcela_nao_unarioContext _localctx = new Parcela_nao_unarioContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_parcela_nao_unario);
		try {
			setState(489);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENDERECO:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				match(ENDERECO);
				setState(487);
				identificador();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				match(CADEIA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_relacionalContext extends ParserRuleContext {
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public Op_relacionalContext op_relacional() {
			return getRuleContext(Op_relacionalContext.class,0);
		}
		public Exp_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_relacional; }
	}

	public final Exp_relacionalContext exp_relacional() throws RecognitionException {
		Exp_relacionalContext _localctx = new Exp_relacionalContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_exp_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			exp_aritmetica();
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENOR) | (1L << MENORIGUAL) | (1L << MAIOR) | (1L << MAIORIGUAL) | (1L << IGUAL) | (1L << DIFERENTE))) != 0)) {
				{
				setState(492);
				op_relacional();
				setState(493);
				exp_aritmetica();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_relacionalContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(T2Parser.IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(T2Parser.DIFERENTE, 0); }
		public TerminalNode MAIORIGUAL() { return getToken(T2Parser.MAIORIGUAL, 0); }
		public TerminalNode MENORIGUAL() { return getToken(T2Parser.MENORIGUAL, 0); }
		public TerminalNode MAIOR() { return getToken(T2Parser.MAIOR, 0); }
		public TerminalNode MENOR() { return getToken(T2Parser.MENOR, 0); }
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENOR) | (1L << MENORIGUAL) | (1L << MAIOR) | (1L << MAIORIGUAL) | (1L << IGUAL) | (1L << DIFERENTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoContext extends ParserRuleContext {
		public List<Termo_logicoContext> termo_logico() {
			return getRuleContexts(Termo_logicoContext.class);
		}
		public Termo_logicoContext termo_logico(int i) {
			return getRuleContext(Termo_logicoContext.class,i);
		}
		public List<Op_logico_1Context> op_logico_1() {
			return getRuleContexts(Op_logico_1Context.class);
		}
		public Op_logico_1Context op_logico_1(int i) {
			return getRuleContext(Op_logico_1Context.class,i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			termo_logico();
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(500);
				op_logico_1();
				setState(501);
				termo_logico();
				}
				}
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Termo_logicoContext extends ParserRuleContext {
		public List<Fator_logicoContext> fator_logico() {
			return getRuleContexts(Fator_logicoContext.class);
		}
		public Fator_logicoContext fator_logico(int i) {
			return getRuleContext(Fator_logicoContext.class,i);
		}
		public List<Op_logico_2Context> op_logico_2() {
			return getRuleContexts(Op_logico_2Context.class);
		}
		public Op_logico_2Context op_logico_2(int i) {
			return getRuleContext(Op_logico_2Context.class,i);
		}
		public Termo_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_logico; }
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_termo_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			fator_logico();
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(509);
				op_logico_2();
				setState(510);
				fator_logico();
				}
				}
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fator_logicoContext extends ParserRuleContext {
		public Parcela_logicaContext parcela_logica() {
			return getRuleContext(Parcela_logicaContext.class,0);
		}
		public TerminalNode NOT() { return getToken(T2Parser.NOT, 0); }
		public Fator_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_logico; }
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_fator_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(517);
				match(NOT);
				}
			}

			setState(520);
			parcela_logica();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parcela_logicaContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(T2Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(T2Parser.FALSE, 0); }
		public Exp_relacionalContext exp_relacional() {
			return getRuleContext(Exp_relacionalContext.class,0);
		}
		public Parcela_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_logica; }
	}

	public final Parcela_logicaContext parcela_logica() throws RecognitionException {
		Parcela_logicaContext _localctx = new Parcela_logicaContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_parcela_logica);
		int _la;
		try {
			setState(524);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case ABREPAR:
			case SUBTRACAO:
			case PONTEIRO:
			case ENDERECO:
			case NUM_INT:
			case NUM_REAL:
			case IDENT:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(523);
				exp_relacional();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_logico_1Context extends ParserRuleContext {
		public TerminalNode OR() { return getToken(T2Parser.OR, 0); }
		public Op_logico_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logico_1; }
	}

	public final Op_logico_1Context op_logico_1() throws RecognitionException {
		Op_logico_1Context _localctx = new Op_logico_1Context(_ctx, getState());
		enterRule(_localctx, 90, RULE_op_logico_1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(OR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_logico_2Context extends ParserRuleContext {
		public TerminalNode AND() { return getToken(T2Parser.AND, 0); }
		public Op_logico_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logico_2; }
	}

	public final Op_logico_2Context op_logico_2() throws RecognitionException {
		Op_logico_2Context _localctx = new Op_logico_2Context(_ctx, getState());
		enterRule(_localctx, 92, RULE_op_logico_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(AND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3G\u0215\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\3\3\3\7\3h\n\3"+
		"\f\3\16\3k\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4z\n\4\3\5\3\5\3\5\7\5\177\n\5\f\5\16\5\u0082\13\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\7\6\u008a\n\6\f\6\16\6\u008d\13\6\3\6\3\6\3\6\3\6\7\6\u0093\n\6"+
		"\f\6\16\6\u0096\13\6\3\7\3\7\5\7\u009a\n\7\3\b\3\b\3\t\5\t\u009f\n\t\3"+
		"\t\3\t\5\t\u00a3\n\t\3\n\3\n\3\13\3\13\7\13\u00a9\n\13\f\13\16\13\u00ac"+
		"\13\13\3\13\3\13\3\f\5\f\u00b1\n\f\3\f\3\f\3\f\7\f\u00b6\n\f\f\f\16\f"+
		"\u00b9\13\f\3\f\3\f\3\f\3\r\3\r\3\r\7\r\u00c1\n\r\f\r\16\r\u00c4\13\r"+
		"\3\16\3\16\3\16\3\16\5\16\u00ca\n\16\3\16\3\16\7\16\u00ce\n\16\f\16\16"+
		"\16\u00d1\13\16\3\16\7\16\u00d4\n\16\f\16\16\16\u00d7\13\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u00de\n\16\3\16\3\16\3\16\3\16\7\16\u00e4\n\16\f"+
		"\16\16\16\u00e7\13\16\3\16\7\16\u00ea\n\16\f\16\16\16\u00ed\13\16\3\16"+
		"\3\16\5\16\u00f1\n\16\3\17\7\17\u00f4\n\17\f\17\16\17\u00f7\13\17\3\17"+
		"\7\17\u00fa\n\17\f\17\16\17\u00fd\13\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u0109\n\20\3\21\3\21\3\21\5\21\u010e\n\21\3"+
		"\21\3\21\3\21\5\21\u0113\n\21\3\21\7\21\u0116\n\21\f\21\16\21\u0119\13"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u0122\n\22\f\22\16\22\u0125"+
		"\13\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u012d\n\23\f\23\16\23\u0130"+
		"\13\23\3\23\3\23\7\23\u0134\n\23\f\23\16\23\u0137\13\23\5\23\u0139\n\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0143\n\24\f\24\16\24\u0146"+
		"\13\24\5\24\u0148\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\7\25\u0154\n\25\f\25\16\25\u0157\13\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\7\26\u015f\n\26\f\26\16\26\u0162\13\26\3\26\3\26\3\27\3\27\7\27\u0168"+
		"\n\27\f\27\16\27\u016b\13\27\3\27\3\27\3\27\3\30\5\30\u0171\n\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\7\31\u017c\n\31\f\31\16\31\u017f"+
		"\13\31\3\31\3\31\3\32\3\32\3\32\3\33\7\33\u0187\n\33\f\33\16\33\u018a"+
		"\13\33\3\34\3\34\3\34\7\34\u018f\n\34\f\34\16\34\u0192\13\34\3\35\3\35"+
		"\3\35\7\35\u0197\n\35\f\35\16\35\u019a\13\35\3\36\5\36\u019d\n\36\3\36"+
		"\3\36\3\36\5\36\u01a2\n\36\3\36\5\36\u01a5\n\36\3\37\3\37\3 \3 \3 \3 "+
		"\7 \u01ad\n \f \16 \u01b0\13 \3!\3!\3!\3!\7!\u01b6\n!\f!\16!\u01b9\13"+
		"!\3\"\3\"\3\"\3\"\7\"\u01bf\n\"\f\"\16\"\u01c2\13\"\3#\3#\3$\3$\3%\3%"+
		"\3&\5&\u01cb\n&\3&\3&\5&\u01cf\n&\3\'\5\'\u01d2\n\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\7\'\u01da\n\'\f\'\16\'\u01dd\13\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\5\'\u01e7\n\'\3(\3(\3(\5(\u01ec\n(\3)\3)\3)\3)\5)\u01f2\n)\3*\3*\3"+
		"+\3+\3+\3+\7+\u01fa\n+\f+\16+\u01fd\13+\3,\3,\3,\3,\7,\u0203\n,\f,\16"+
		",\u0206\13,\3-\5-\u0209\n-\3-\3-\3.\3.\5.\u020f\n.\3/\3/\3\60\3\60\3\60"+
		"\2\2\61\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>@BDFHJLNPRTVXZ\\^\2\b\3\2\b\13\5\2\f\r@ACC\3\29:\4\2\67\67;;\3\2*/\3"+
		"\2\f\r\2\u022a\2`\3\2\2\2\4i\3\2\2\2\6y\3\2\2\2\b{\3\2\2\2\n\u0086\3\2"+
		"\2\2\f\u0099\3\2\2\2\16\u009b\3\2\2\2\20\u009e\3\2\2\2\22\u00a4\3\2\2"+
		"\2\24\u00a6\3\2\2\2\26\u00b0\3\2\2\2\30\u00bd\3\2\2\2\32\u00f0\3\2\2\2"+
		"\34\u00f5\3\2\2\2\36\u0108\3\2\2\2 \u010a\3\2\2\2\"\u011c\3\2\2\2$\u0128"+
		"\3\2\2\2&\u013c\3\2\2\2(\u014b\3\2\2\2*\u015a\3\2\2\2,\u0165\3\2\2\2."+
		"\u0170\3\2\2\2\60\u0176\3\2\2\2\62\u0182\3\2\2\2\64\u0188\3\2\2\2\66\u018b"+
		"\3\2\2\28\u0193\3\2\2\2:\u019c\3\2\2\2<\u01a6\3\2\2\2>\u01a8\3\2\2\2@"+
		"\u01b1\3\2\2\2B\u01ba\3\2\2\2D\u01c3\3\2\2\2F\u01c5\3\2\2\2H\u01c7\3\2"+
		"\2\2J\u01ce\3\2\2\2L\u01e6\3\2\2\2N\u01eb\3\2\2\2P\u01ed\3\2\2\2R\u01f3"+
		"\3\2\2\2T\u01f5\3\2\2\2V\u01fe\3\2\2\2X\u0208\3\2\2\2Z\u020e\3\2\2\2\\"+
		"\u0210\3\2\2\2^\u0212\3\2\2\2`a\5\4\3\2ab\7\4\2\2bc\5\34\17\2cd\7\5\2"+
		"\2d\3\3\2\2\2eh\5\6\4\2fh\5\32\16\2ge\3\2\2\2gf\3\2\2\2hk\3\2\2\2ig\3"+
		"\2\2\2ij\3\2\2\2j\5\3\2\2\2ki\3\2\2\2lm\7\6\2\2mz\5\b\5\2no\7\7\2\2op"+
		"\7B\2\2pq\7\60\2\2qr\5\16\b\2rs\7.\2\2st\5\22\n\2tz\3\2\2\2uv\7\36\2\2"+
		"vw\7B\2\2wx\7\60\2\2xz\5\f\7\2yl\3\2\2\2yn\3\2\2\2yu\3\2\2\2z\7\3\2\2"+
		"\2{\u0080\5\n\6\2|}\7\65\2\2}\177\5\n\6\2~|\3\2\2\2\177\u0082\3\2\2\2"+
		"\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3"+
		"\2\2\2\u0083\u0084\7\60\2\2\u0084\u0085\5\f\7\2\u0085\t\3\2\2\2\u0086"+
		"\u008b\7B\2\2\u0087\u0088\7?\2\2\u0088\u008a\7B\2\2\u0089\u0087\3\2\2"+
		"\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0094"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\63\2\2\u008f\u0090\5> \2\u0090"+
		"\u0091\7\64\2\2\u0091\u0093\3\2\2\2\u0092\u008e\3\2\2\2\u0093\u0096\3"+
		"\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\13\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0097\u009a\5\24\13\2\u0098\u009a\5\20\t\2\u0099\u0097"+
		"\3\2\2\2\u0099\u0098\3\2\2\2\u009a\r\3\2\2\2\u009b\u009c\t\2\2\2\u009c"+
		"\17\3\2\2\2\u009d\u009f\7=\2\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2"+
		"\u009f\u00a2\3\2\2\2\u00a0\u00a3\5\16\b\2\u00a1\u00a3\7B\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\21\3\2\2\2\u00a4\u00a5\t\3\2\2\u00a5"+
		"\23\3\2\2\2\u00a6\u00aa\7\37\2\2\u00a7\u00a9\5\b\5\2\u00a8\u00a7\3\2\2"+
		"\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7 \2\2\u00ae\25\3\2\2\2\u00af"+
		"\u00b1\7\"\2\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b7\5\n\6\2\u00b3\u00b4\7\65\2\2\u00b4\u00b6\5\n\6\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7\60\2\2\u00bb"+
		"\u00bc\5\20\t\2\u00bc\27\3\2\2\2\u00bd\u00c2\5\26\f\2\u00be\u00bf\7\65"+
		"\2\2\u00bf\u00c1\5\26\f\2\u00c0\u00be\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\31\3\2\2\2\u00c4\u00c2\3\2\2"+
		"\2\u00c5\u00c6\7!\2\2\u00c6\u00c7\7B\2\2\u00c7\u00c9\7\61\2\2\u00c8\u00ca"+
		"\5\30\r\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2"+
		"\u00cb\u00cf\7\62\2\2\u00cc\u00ce\5\6\4\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1"+
		"\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d5\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00d4\5\36\20\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3"+
		"\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d8\u00f1\7#\2\2\u00d9\u00da\7$\2\2\u00da\u00db\7B\2"+
		"\2\u00db\u00dd\7\61\2\2\u00dc\u00de\5\30\r\2\u00dd\u00dc\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\7\62\2\2\u00e0\u00e1\7"+
		"\60\2\2\u00e1\u00e5\5\20\t\2\u00e2\u00e4\5\6\4\2\u00e3\u00e2\3\2\2\2\u00e4"+
		"\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00eb\3\2"+
		"\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ea\5\36\20\2\u00e9\u00e8\3\2\2\2\u00ea"+
		"\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2"+
		"\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\7&\2\2\u00ef\u00f1\3\2\2\2\u00f0"+
		"\u00c5\3\2\2\2\u00f0\u00d9\3\2\2\2\u00f1\33\3\2\2\2\u00f2\u00f4\5\6\4"+
		"\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6"+
		"\3\2\2\2\u00f6\u00fb\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fa\5\36\20\2"+
		"\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc"+
		"\3\2\2\2\u00fc\35\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0109\5 \21\2\u00ff"+
		"\u0109\5\"\22\2\u0100\u0109\5$\23\2\u0101\u0109\5&\24\2\u0102\u0109\5"+
		"(\25\2\u0103\u0109\5*\26\2\u0104\u0109\5,\27\2\u0105\u0109\5.\30\2\u0106"+
		"\u0109\5\60\31\2\u0107\u0109\5\62\32\2\u0108\u00fe\3\2\2\2\u0108\u00ff"+
		"\3\2\2\2\u0108\u0100\3\2\2\2\u0108\u0101\3\2\2\2\u0108\u0102\3\2\2\2\u0108"+
		"\u0103\3\2\2\2\u0108\u0104\3\2\2\2\u0108\u0105\3\2\2\2\u0108\u0106\3\2"+
		"\2\2\u0108\u0107\3\2\2\2\u0109\37\3\2\2\2\u010a\u010b\7\'\2\2\u010b\u010d"+
		"\7\61\2\2\u010c\u010e\7=\2\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u0117\5\n\6\2\u0110\u0112\7\65\2\2\u0111\u0113\7"+
		"=\2\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0116\5\n\6\2\u0115\u0110\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a"+
		"\u011b\7\62\2\2\u011b!\3\2\2\2\u011c\u011d\7(\2\2\u011d\u011e\7\61\2\2"+
		"\u011e\u0123\5T+\2\u011f\u0120\7\65\2\2\u0120\u0122\5T+\2\u0121\u011f"+
		"\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0126\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\7\62\2\2\u0127#\3\2\2\2"+
		"\u0128\u0129\7\21\2\2\u0129\u012a\5T+\2\u012a\u012e\7\22\2\2\u012b\u012d"+
		"\5\36\20\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2"+
		"\u012e\u012f\3\2\2\2\u012f\u0138\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0135"+
		"\7\23\2\2\u0132\u0134\5\36\20\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2"+
		"\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135"+
		"\3\2\2\2\u0138\u0131\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u013b\7\24\2\2\u013b%\3\2\2\2\u013c\u013d\7\25\2\2\u013d\u013e\5> \2"+
		"\u013e\u013f\7\26\2\2\u013f\u0147\5\64\33\2\u0140\u0144\7\23\2\2\u0141"+
		"\u0143\5\36\20\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3"+
		"\2\2\2\u0144\u0145\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0147"+
		"\u0140\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\7\27"+
		"\2\2\u014a\'\3\2\2\2\u014b\u014c\7\30\2\2\u014c\u014d\7B\2\2\u014d\u014e"+
		"\7<\2\2\u014e\u014f\5> \2\u014f\u0150\7\31\2\2\u0150\u0151\5> \2\u0151"+
		"\u0155\7\32\2\2\u0152\u0154\5\36\20\2\u0153\u0152\3\2\2\2\u0154\u0157"+
		"\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0158\u0159\7\33\2\2\u0159)\3\2\2\2\u015a\u015b\7\34\2"+
		"\2\u015b\u015c\5T+\2\u015c\u0160\7\32\2\2\u015d\u015f\5\36\20\2\u015e"+
		"\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2"+
		"\2\2\u0161\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164\7\35\2\2\u0164"+
		"+\3\2\2\2\u0165\u0169\7\32\2\2\u0166\u0168\5\36\20\2\u0167\u0166\3\2\2"+
		"\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c"+
		"\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016d\7\31\2\2\u016d\u016e\5T+\2\u016e"+
		"-\3\2\2\2\u016f\u0171\7=\2\2\u0170\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172\u0173\5\n\6\2\u0173\u0174\7<\2\2\u0174\u0175\5T+"+
		"\2\u0175/\3\2\2\2\u0176\u0177\7B\2\2\u0177\u0178\7\61\2\2\u0178\u017d"+
		"\5T+\2\u0179\u017a\7\65\2\2\u017a\u017c\5T+\2\u017b\u0179\3\2\2\2\u017c"+
		"\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2"+
		"\2\2\u017f\u017d\3\2\2\2\u0180\u0181\7\62\2\2\u0181\61\3\2\2\2\u0182\u0183"+
		"\7%\2\2\u0183\u0184\5T+\2\u0184\63\3\2\2\2\u0185\u0187\5\66\34\2\u0186"+
		"\u0185\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2"+
		"\2\2\u0189\65\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u018c\58\35\2\u018c\u0190"+
		"\7\60\2\2\u018d\u018f\5\36\20\2\u018e\u018d\3\2\2\2\u018f\u0192\3\2\2"+
		"\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\67\3\2\2\2\u0192\u0190"+
		"\3\2\2\2\u0193\u0198\5:\36\2\u0194\u0195\7\65\2\2\u0195\u0197\5:\36\2"+
		"\u0196\u0194\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199"+
		"\3\2\2\2\u01999\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019d\5<\37\2\u019c"+
		"\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a4\7@"+
		"\2\2\u019f\u01a1\7)\2\2\u01a0\u01a2\5<\37\2\u01a1\u01a0\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\7@\2\2\u01a4\u019f\3\2"+
		"\2\2\u01a4\u01a5\3\2\2\2\u01a5;\3\2\2\2\u01a6\u01a7\7:\2\2\u01a7=\3\2"+
		"\2\2\u01a8\u01ae\5@!\2\u01a9\u01aa\5D#\2\u01aa\u01ab\5@!\2\u01ab\u01ad"+
		"\3\2\2\2\u01ac\u01a9\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01af?\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b7\5B\"\2\u01b2"+
		"\u01b3\5F$\2\u01b3\u01b4\5B\"\2\u01b4\u01b6\3\2\2\2\u01b5\u01b2\3\2\2"+
		"\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8A"+
		"\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01c0\5J&\2\u01bb\u01bc\5H%\2\u01bc"+
		"\u01bd\5J&\2\u01bd\u01bf\3\2\2\2\u01be\u01bb\3\2\2\2\u01bf\u01c2\3\2\2"+
		"\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1C\3\2\2\2\u01c2\u01c0"+
		"\3\2\2\2\u01c3\u01c4\t\4\2\2\u01c4E\3\2\2\2\u01c5\u01c6\t\5\2\2\u01c6"+
		"G\3\2\2\2\u01c7\u01c8\78\2\2\u01c8I\3\2\2\2\u01c9\u01cb\5<\37\2\u01ca"+
		"\u01c9\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cf\5L"+
		"\'\2\u01cd\u01cf\5N(\2\u01ce\u01ca\3\2\2\2\u01ce\u01cd\3\2\2\2\u01cfK"+
		"\3\2\2\2\u01d0\u01d2\7=\2\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2"+
		"\u01d3\3\2\2\2\u01d3\u01e7\5\n\6\2\u01d4\u01d5\7B\2\2\u01d5\u01d6\7\61"+
		"\2\2\u01d6\u01db\5T+\2\u01d7\u01d8\7\65\2\2\u01d8\u01da\5T+\2\u01d9\u01d7"+
		"\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc"+
		"\u01de\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01df\7\62\2\2\u01df\u01e7\3"+
		"\2\2\2\u01e0\u01e7\7@\2\2\u01e1\u01e7\7A\2\2\u01e2\u01e3\7\61\2\2\u01e3"+
		"\u01e4\5T+\2\u01e4\u01e5\7\62\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01d1\3\2"+
		"\2\2\u01e6\u01d4\3\2\2\2\u01e6\u01e0\3\2\2\2\u01e6\u01e1\3\2\2\2\u01e6"+
		"\u01e2\3\2\2\2\u01e7M\3\2\2\2\u01e8\u01e9\7>\2\2\u01e9\u01ec\5\n\6\2\u01ea"+
		"\u01ec\7C\2\2\u01eb\u01e8\3\2\2\2\u01eb\u01ea\3\2\2\2\u01ecO\3\2\2\2\u01ed"+
		"\u01f1\5> \2\u01ee\u01ef\5R*\2\u01ef\u01f0\5> \2\u01f0\u01f2\3\2\2\2\u01f1"+
		"\u01ee\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2Q\3\2\2\2\u01f3\u01f4\t\6\2\2"+
		"\u01f4S\3\2\2\2\u01f5\u01fb\5V,\2\u01f6\u01f7\5\\/\2\u01f7\u01f8\5V,\2"+
		"\u01f8\u01fa\3\2\2\2\u01f9\u01f6\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9"+
		"\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fcU\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe"+
		"\u0204\5X-\2\u01ff\u0200\5^\60\2\u0200\u0201\5X-\2\u0201\u0203\3\2\2\2"+
		"\u0202\u01ff\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205"+
		"\3\2\2\2\u0205W\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0209\7\20\2\2\u0208"+
		"\u0207\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b\5Z"+
		".\2\u020bY\3\2\2\2\u020c\u020f\t\7\2\2\u020d\u020f\5P)\2\u020e\u020c\3"+
		"\2\2\2\u020e\u020d\3\2\2\2\u020f[\3\2\2\2\u0210\u0211\7\17\2\2\u0211]"+
		"\3\2\2\2\u0212\u0213\7\16\2\2\u0213_\3\2\2\2;giy\u0080\u008b\u0094\u0099"+
		"\u009e\u00a2\u00aa\u00b0\u00b7\u00c2\u00c9\u00cf\u00d5\u00dd\u00e5\u00eb"+
		"\u00f0\u00f5\u00fb\u0108\u010d\u0112\u0117\u0123\u012e\u0135\u0138\u0144"+
		"\u0147\u0155\u0160\u0169\u0170\u017d\u0188\u0190\u0198\u019c\u01a1\u01a4"+
		"\u01ae\u01b7\u01c0\u01ca\u01ce\u01d1\u01db\u01e6\u01eb\u01f1\u01fb\u0204"+
		"\u0208\u020e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}