// Generated from /Users/mnajafza/Downloads/CISE-master/src/main/java/xpr/adsl.g4 by ANTLR 4.7
package xpr;
package xpr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link adslParser}.
 */
public interface adslListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link adslParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(adslParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link adslParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(adslParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link adslParser#action_definition}.
	 * @param ctx the parse tree
	 */
	void enterAction_definition(adslParser.Action_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link adslParser#action_definition}.
	 * @param ctx the parse tree
	 */
	void exitAction_definition(adslParser.Action_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link adslParser#action_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAction_declaration(adslParser.Action_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link adslParser#action_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAction_declaration(adslParser.Action_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link adslParser#action_name}.
	 * @param ctx the parse tree
	 */
	void enterAction_name(adslParser.Action_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link adslParser#action_name}.
	 * @param ctx the parse tree
	 */
	void exitAction_name(adslParser.Action_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link adslParser#action_body}.
	 * @param ctx the parse tree
	 */
	void enterAction_body(adslParser.Action_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link adslParser#action_body}.
	 * @param ctx the parse tree
	 */
	void exitAction_body(adslParser.Action_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link adslParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(adslParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link adslParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(adslParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link adslParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(adslParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link adslParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(adslParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link adslParser#primary_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expr(adslParser.Primary_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link adslParser#primary_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expr(adslParser.Primary_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link adslParser#create_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_statement(adslParser.Create_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link adslParser#create_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_statement(adslParser.Create_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link adslParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement(adslParser.Delete_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link adslParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement(adslParser.Delete_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link adslParser#find_statement}.
	 * @param ctx the parse tree
	 */
	void enterFind_statement(adslParser.Find_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link adslParser#find_statement}.
	 * @param ctx the parse tree
	 */
	void exitFind_statement(adslParser.Find_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link adslParser#var_id}.
	 * @param ctx the parse tree
	 */
	void enterVar_id(adslParser.Var_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link adslParser#var_id}.
	 * @param ctx the parse tree
	 */
	void exitVar_id(adslParser.Var_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link adslParser#crlf}.
	 * @param ctx the parse tree
	 */
	void enterCrlf(adslParser.CrlfContext ctx);
	/**
	 * Exit a parse tree produced by {@link adslParser#crlf}.
	 * @param ctx the parse tree
	 */
	void exitCrlf(adslParser.CrlfContext ctx);
	/**
	 * Enter a parse tree produced by {@link adslParser#terminator}.
	 * @param ctx the parse tree
	 */
	void enterTerminator(adslParser.TerminatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link adslParser#terminator}.
	 * @param ctx the parse tree
	 */
	void exitTerminator(adslParser.TerminatorContext ctx);
}