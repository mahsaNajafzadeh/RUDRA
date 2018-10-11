// Generated from adsl.g4 by ANTLR 4.5.1
package xpr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link adslParser}.
 */
public interface adslListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link adslParser#prog}.
     *
     * @param ctx the parse tree
     */
    void enterProg(adslParser.ProgContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#prog}.
     *
     * @param ctx the parse tree
     */
    void exitProg(adslParser.ProgContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#class_definition}.
     *
     * @param ctx the parse tree
     */
    void enterClass_definition(adslParser.Class_definitionContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#class_definition}.
     *
     * @param ctx the parse tree
     */
    void exitClass_definition(adslParser.Class_definitionContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#class_declaration}.
     *
     * @param ctx the parse tree
     */
    void enterClass_declaration(adslParser.Class_declarationContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#class_declaration}.
     *
     * @param ctx the parse tree
     */
    void exitClass_declaration(adslParser.Class_declarationContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#class_body}.
     *
     * @param ctx the parse tree
     */
    void enterClass_body(adslParser.Class_bodyContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#class_body}.
     *
     * @param ctx the parse tree
     */
    void exitClass_body(adslParser.Class_bodyContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#class_name}.
     *
     * @param ctx the parse tree
     */
    void enterClass_name(adslParser.Class_nameContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#class_name}.
     *
     * @param ctx the parse tree
     */
    void exitClass_name(adslParser.Class_nameContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#class_parent}.
     *
     * @param ctx the parse tree
     */
    void enterClass_parent(adslParser.Class_parentContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#class_parent}.
     *
     * @param ctx the parse tree
     */
    void exitClass_parent(adslParser.Class_parentContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#action_definition}.
     *
     * @param ctx the parse tree
     */
    void enterAction_definition(adslParser.Action_definitionContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#action_definition}.
     *
     * @param ctx the parse tree
     */
    void exitAction_definition(adslParser.Action_definitionContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#action_declaration}.
     *
     * @param ctx the parse tree
     */
    void enterAction_declaration(adslParser.Action_declarationContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#action_declaration}.
     *
     * @param ctx the parse tree
     */
    void exitAction_declaration(adslParser.Action_declarationContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#action_name}.
     *
     * @param ctx the parse tree
     */
    void enterAction_name(adslParser.Action_nameContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#action_name}.
     *
     * @param ctx the parse tree
     */
    void exitAction_name(adslParser.Action_nameContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#action_body}.
     *
     * @param ctx the parse tree
     */
    void enterAction_body(adslParser.Action_bodyContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#action_body}.
     *
     * @param ctx the parse tree
     */
    void exitAction_body(adslParser.Action_bodyContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterExpression(adslParser.ExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitExpression(adslParser.ExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#bool_t}.
     *
     * @param ctx the parse tree
     */
    void enterBool_t(adslParser.Bool_tContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#bool_t}.
     *
     * @param ctx the parse tree
     */
    void exitBool_t(adslParser.Bool_tContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#dynamic_assignment}.
     *
     * @param ctx the parse tree
     */
    void enterDynamic_assignment(adslParser.Dynamic_assignmentContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#dynamic_assignment}.
     *
     * @param ctx the parse tree
     */
    void exitDynamic_assignment(adslParser.Dynamic_assignmentContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#foreach_statement}.
     *
     * @param ctx the parse tree
     */
    void enterForeach_statement(adslParser.Foreach_statementContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#foreach_statement}.
     *
     * @param ctx the parse tree
     */
    void exitForeach_statement(adslParser.Foreach_statementContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#if_statement}.
     *
     * @param ctx the parse tree
     */
    void enterIf_statement(adslParser.If_statementContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#if_statement}.
     *
     * @param ctx the parse tree
     */
    void exitIf_statement(adslParser.If_statementContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#else_token}.
     *
     * @param ctx the parse tree
     */
    void enterElse_token(adslParser.Else_tokenContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#else_token}.
     *
     * @param ctx the parse tree
     */
    void exitElse_token(adslParser.Else_tokenContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#else_statement}.
     *
     * @param ctx the parse tree
     */
    void enterElse_statement(adslParser.Else_statementContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#else_statement}.
     *
     * @param ctx the parse tree
     */
    void exitElse_statement(adslParser.Else_statementContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#cond_expression}.
     *
     * @param ctx the parse tree
     */
    void enterCond_expression(adslParser.Cond_expressionContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#cond_expression}.
     *
     * @param ctx the parse tree
     */
    void exitCond_expression(adslParser.Cond_expressionContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#inusergroup}.
     *
     * @param ctx the parse tree
     */
    void enterInusergroup(adslParser.InusergroupContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#inusergroup}.
     *
     * @param ctx the parse tree
     */
    void exitInusergroup(adslParser.InusergroupContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#block_st}.
     *
     * @param ctx the parse tree
     */
    void enterBlock_st(adslParser.Block_stContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#block_st}.
     *
     * @param ctx the parse tree
     */
    void exitBlock_st(adslParser.Block_stContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#comparison_list}.
     *
     * @param ctx the parse tree
     */
    void enterComparison_list(adslParser.Comparison_listContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#comparison_list}.
     *
     * @param ctx the parse tree
     */
    void exitComparison_list(adslParser.Comparison_listContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#com}.
     *
     * @param ctx the parse tree
     */
    void enterCom(adslParser.ComContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#com}.
     *
     * @param ctx the parse tree
     */
    void exitCom(adslParser.ComContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#in_func}.
     *
     * @param ctx the parse tree
     */
    void enterIn_func(adslParser.In_funcContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#in_func}.
     *
     * @param ctx the parse tree
     */
    void exitIn_func(adslParser.In_funcContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#equal_func}.
     *
     * @param ctx the parse tree
     */
    void enterEqual_func(adslParser.Equal_funcContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#equal_func}.
     *
     * @param ctx the parse tree
     */
    void exitEqual_func(adslParser.Equal_funcContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#isempty_st}.
     *
     * @param ctx the parse tree
     */
    void enterIsempty_st(adslParser.Isempty_stContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#isempty_st}.
     *
     * @param ctx the parse tree
     */
    void exitIsempty_st(adslParser.Isempty_stContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#assert_statement}.
     *
     * @param ctx the parse tree
     */
    void enterAssert_statement(adslParser.Assert_statementContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#assert_statement}.
     *
     * @param ctx the parse tree
     */
    void exitAssert_statement(adslParser.Assert_statementContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#assert_body}.
     *
     * @param ctx the parse tree
     */
    void enterAssert_body(adslParser.Assert_bodyContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#assert_body}.
     *
     * @param ctx the parse tree
     */
    void exitAssert_body(adslParser.Assert_bodyContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#assert_expr}.
     *
     * @param ctx the parse tree
     */
    void enterAssert_expr(adslParser.Assert_exprContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#assert_expr}.
     *
     * @param ctx the parse tree
     */
    void exitAssert_expr(adslParser.Assert_exprContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#set_expr}.
     *
     * @param ctx the parse tree
     */
    void enterSet_expr(adslParser.Set_exprContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#set_expr}.
     *
     * @param ctx the parse tree
     */
    void exitSet_expr(adslParser.Set_exprContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#exppp}.
     *
     * @param ctx the parse tree
     */
    void enterExppp(adslParser.ExpppContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#exppp}.
     *
     * @param ctx the parse tree
     */
    void exitExppp(adslParser.ExpppContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#cc_statement}.
     *
     * @param ctx the parse tree
     */
    void enterCc_statement(adslParser.Cc_statementContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#cc_statement}.
     *
     * @param ctx the parse tree
     */
    void exitCc_statement(adslParser.Cc_statementContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#cc_unique}.
     *
     * @param ctx the parse tree
     */
    void enterCc_unique(adslParser.Cc_uniqueContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#cc_unique}.
     *
     * @param ctx the parse tree
     */
    void exitCc_unique(adslParser.Cc_uniqueContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#assignment}.
     *
     * @param ctx the parse tree
     */
    void enterAssignment(adslParser.AssignmentContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#assignment}.
     *
     * @param ctx the parse tree
     */
    void exitAssignment(adslParser.AssignmentContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#multi_expr}.
     *
     * @param ctx the parse tree
     */
    void enterMulti_expr(adslParser.Multi_exprContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#multi_expr}.
     *
     * @param ctx the parse tree
     */
    void exitMulti_expr(adslParser.Multi_exprContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#primary_expr}.
     *
     * @param ctx the parse tree
     */
    void enterPrimary_expr(adslParser.Primary_exprContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#primary_expr}.
     *
     * @param ctx the parse tree
     */
    void exitPrimary_expr(adslParser.Primary_exprContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#union_st}.
     *
     * @param ctx the parse tree
     */
    void enterUnion_st(adslParser.Union_stContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#union_st}.
     *
     * @param ctx the parse tree
     */
    void exitUnion_st(adslParser.Union_stContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#element}.
     *
     * @param ctx the parse tree
     */
    void enterElement(adslParser.ElementContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#element}.
     *
     * @param ctx the parse tree
     */
    void exitElement(adslParser.ElementContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#create_statement}.
     *
     * @param ctx the parse tree
     */
    void enterCreate_statement(adslParser.Create_statementContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#create_statement}.
     *
     * @param ctx the parse tree
     */
    void exitCreate_statement(adslParser.Create_statementContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#create_expr}.
     *
     * @param ctx the parse tree
     */
    void enterCreate_expr(adslParser.Create_exprContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#create_expr}.
     *
     * @param ctx the parse tree
     */
    void exitCreate_expr(adslParser.Create_exprContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#delete_statement}.
     *
     * @param ctx the parse tree
     */
    void enterDelete_statement(adslParser.Delete_statementContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#delete_statement}.
     *
     * @param ctx the parse tree
     */
    void exitDelete_statement(adslParser.Delete_statementContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#find_statement}.
     *
     * @param ctx the parse tree
     */
    void enterFind_statement(adslParser.Find_statementContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#find_statement}.
     *
     * @param ctx the parse tree
     */
    void exitFind_statement(adslParser.Find_statementContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#crlf}.
     *
     * @param ctx the parse tree
     */
    void enterCrlf(adslParser.CrlfContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#crlf}.
     *
     * @param ctx the parse tree
     */
    void exitCrlf(adslParser.CrlfContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#terminator}.
     *
     * @param ctx the parse tree
     */
    void enterTerminator(adslParser.TerminatorContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#terminator}.
     *
     * @param ctx the parse tree
     */
    void exitTerminator(adslParser.TerminatorContext ctx);

    /**
     * Enter a parse tree produced by {@link adslParser#id}.
     *
     * @param ctx the parse tree
     */
    void enterId(adslParser.IdContext ctx);

    /**
     * Exit a parse tree produced by {@link adslParser#id}.
     *
     * @param ctx the parse tree
     */
    void exitId(adslParser.IdContext ctx);
}