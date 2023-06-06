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
	 * Enter a parse tree produced by {@link T2ParserParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(T2ParserParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(T2ParserParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void enterDecl_local_global(T2ParserParser.Decl_local_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void exitDecl_local_global(T2ParserParser.Decl_local_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(T2ParserParser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(T2ParserParser.Declaracao_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(T2ParserParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(T2ParserParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(T2ParserParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(T2ParserParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(T2ParserParser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(T2ParserParser.DimensaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(T2ParserParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(T2ParserParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(T2ParserParser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(T2ParserParser.Tipo_basicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico_ident(T2ParserParser.Tipo_basico_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico_ident(T2ParserParser.Tipo_basico_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(T2ParserParser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(T2ParserParser.Tipo_estendidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(T2ParserParser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(T2ParserParser.Valor_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(T2ParserParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(T2ParserParser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(T2ParserParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(T2ParserParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(T2ParserParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(T2ParserParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global(T2ParserParser.Declaracao_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global(T2ParserParser.Declaracao_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(T2ParserParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(T2ParserParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(T2ParserParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(T2ParserParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeia(T2ParserParser.CmdLeiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeia(T2ParserParser.CmdLeiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscreva(T2ParserParser.CmdEscrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscreva(T2ParserParser.CmdEscrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void enterCmdSe(T2ParserParser.CmdSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void exitCmdSe(T2ParserParser.CmdSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void enterCmdCaso(T2ParserParser.CmdCasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void exitCmdCaso(T2ParserParser.CmdCasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void enterCmdPara(T2ParserParser.CmdParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void exitCmdPara(T2ParserParser.CmdParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdEnquanto(T2ParserParser.CmdEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdEnquanto(T2ParserParser.CmdEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void enterCmdFaca(T2ParserParser.CmdFacaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void exitCmdFaca(T2ParserParser.CmdFacaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtribuicao(T2ParserParser.CmdAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtribuicao(T2ParserParser.CmdAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void enterCmdChamada(T2ParserParser.CmdChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void exitCmdChamada(T2ParserParser.CmdChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void enterCmdRetorne(T2ParserParser.CmdRetorneContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void exitCmdRetorne(T2ParserParser.CmdRetorneContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(T2ParserParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(T2ParserParser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void enterItem_selecao(T2ParserParser.Item_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void exitItem_selecao(T2ParserParser.Item_selecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(T2ParserParser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(T2ParserParser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(T2ParserParser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(T2ParserParser.Numero_intervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(T2ParserParser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(T2ParserParser.Op_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(T2ParserParser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(T2ParserParser.Exp_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(T2ParserParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(T2ParserParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(T2ParserParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(T2ParserParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(T2ParserParser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(T2ParserParser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(T2ParserParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(T2ParserParser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#op3}.
	 * @param ctx the parse tree
	 */
	void enterOp3(T2ParserParser.Op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#op3}.
	 * @param ctx the parse tree
	 */
	void exitOp3(T2ParserParser.Op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(T2ParserParser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(T2ParserParser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(T2ParserParser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(T2ParserParser.Parcela_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(T2ParserParser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(T2ParserParser.Parcela_nao_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(T2ParserParser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(T2ParserParser.Exp_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(T2ParserParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(T2ParserParser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(T2ParserParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(T2ParserParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(T2ParserParser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(T2ParserParser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(T2ParserParser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(T2ParserParser.Fator_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(T2ParserParser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(T2ParserParser.Parcela_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_1(T2ParserParser.Op_logico_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_1(T2ParserParser.Op_logico_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link T2ParserParser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_2(T2ParserParser.Op_logico_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link T2ParserParser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_2(T2ParserParser.Op_logico_2Context ctx);
}