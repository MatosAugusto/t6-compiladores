// Generated from br\u005Cufscar\dc\compiladores\comidalang\ComidaLang.g4 by ANTLR 4.9.2
package br.ufscar.dc.compiladores.comidalang;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ComidaLangParser}.
 */
public interface ComidaLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ComidaLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ComidaLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComidaLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ComidaLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComidaLangParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(ComidaLangParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComidaLangParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(ComidaLangParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComidaLangParser#info}.
	 * @param ctx the parse tree
	 */
	void enterInfo(ComidaLangParser.InfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComidaLangParser#info}.
	 * @param ctx the parse tree
	 */
	void exitInfo(ComidaLangParser.InfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComidaLangParser#bloco_refeicao}.
	 * @param ctx the parse tree
	 */
	void enterBloco_refeicao(ComidaLangParser.Bloco_refeicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComidaLangParser#bloco_refeicao}.
	 * @param ctx the parse tree
	 */
	void exitBloco_refeicao(ComidaLangParser.Bloco_refeicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComidaLangParser#alimentos}.
	 * @param ctx the parse tree
	 */
	void enterAlimentos(ComidaLangParser.AlimentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComidaLangParser#alimentos}.
	 * @param ctx the parse tree
	 */
	void exitAlimentos(ComidaLangParser.AlimentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComidaLangParser#bloco_gostos}.
	 * @param ctx the parse tree
	 */
	void enterBloco_gostos(ComidaLangParser.Bloco_gostosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComidaLangParser#bloco_gostos}.
	 * @param ctx the parse tree
	 */
	void exitBloco_gostos(ComidaLangParser.Bloco_gostosContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComidaLangParser#gosto}.
	 * @param ctx the parse tree
	 */
	void enterGosto(ComidaLangParser.GostoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComidaLangParser#gosto}.
	 * @param ctx the parse tree
	 */
	void exitGosto(ComidaLangParser.GostoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComidaLangParser#bloco_planejamento}.
	 * @param ctx the parse tree
	 */
	void enterBloco_planejamento(ComidaLangParser.Bloco_planejamentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComidaLangParser#bloco_planejamento}.
	 * @param ctx the parse tree
	 */
	void exitBloco_planejamento(ComidaLangParser.Bloco_planejamentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComidaLangParser#planejamento}.
	 * @param ctx the parse tree
	 */
	void enterPlanejamento(ComidaLangParser.PlanejamentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComidaLangParser#planejamento}.
	 * @param ctx the parse tree
	 */
	void exitPlanejamento(ComidaLangParser.PlanejamentoContext ctx);
}