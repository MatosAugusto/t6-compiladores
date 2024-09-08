// Generated from br\u005Cufscar\dc\compiladores\comidalang\ComidaLang.g4 by ANTLR 4.9.2
package br.ufscar.dc.compiladores.comidalang;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ComidaLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ComidaLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ComidaLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ComidaLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComidaLangParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(ComidaLangParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComidaLangParser#info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfo(ComidaLangParser.InfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComidaLangParser#bloco_refeicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco_refeicao(ComidaLangParser.Bloco_refeicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComidaLangParser#alimentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlimentos(ComidaLangParser.AlimentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComidaLangParser#bloco_gostos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco_gostos(ComidaLangParser.Bloco_gostosContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComidaLangParser#gosto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGosto(ComidaLangParser.GostoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComidaLangParser#bloco_planejamento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco_planejamento(ComidaLangParser.Bloco_planejamentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComidaLangParser#planejamento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlanejamento(ComidaLangParser.PlanejamentoContext ctx);
}