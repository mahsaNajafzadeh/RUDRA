// Generated from /Users/mnajafza/Downloads/CISE-master/src/main/java/xpr/adsl.g4 by ANTLR 4.7
package xpr;
package xpr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link adslParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface adslVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link adslParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(adslParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link adslParser#action_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction_definition(adslParser.Action_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link adslParser#action_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction_declaration(adslParser.Action_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link adslParser#action_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction_name(adslParser.Action_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link adslParser#action_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction_body(adslParser.Action_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link adslParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(adslParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link adslParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(adslParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link adslParser#primary_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expr(adslParser.Primary_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link adslParser#create_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_statement(adslParser.Create_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link adslParser#delete_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_statement(adslParser.Delete_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link adslParser#find_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFind_statement(adslParser.Find_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link adslParser#var_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_id(adslParser.Var_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link adslParser#crlf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrlf(adslParser.CrlfContext ctx);
	/**
	 * Visit a parse tree produced by {@link adslParser#terminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminator(adslParser.TerminatorContext ctx);
}