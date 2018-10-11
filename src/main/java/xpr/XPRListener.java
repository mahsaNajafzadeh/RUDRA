// Generated from XPR.g4 by ANTLR 4.5.1
package xpr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XPRParser}.
 */
public interface XPRListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XPRParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(XPRParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(XPRParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#class_definition}.
	 * @param ctx the parse tree
	 */
	void enterClass_definition(XPRParser.Class_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#class_definition}.
	 * @param ctx the parse tree
	 */
	void exitClass_definition(XPRParser.Class_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(XPRParser.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(XPRParser.Class_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#class_name}.
	 * @param ctx the parse tree
	 */
	void enterClass_name(XPRParser.Class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#class_name}.
	 * @param ctx the parse tree
	 */
	void exitClass_name(XPRParser.Class_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(XPRParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(XPRParser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(XPRParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(XPRParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#put_statement}.
	 * @param ctx the parse tree
	 */
	void enterPut_statement(XPRParser.Put_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#put_statement}.
	 * @param ctx the parse tree
	 */
	void exitPut_statement(XPRParser.Put_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#global_get}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_get(XPRParser.Global_getContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#global_get}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_get(XPRParser.Global_getContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#global_set}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_set(XPRParser.Global_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#global_set}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_set(XPRParser.Global_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#global_result}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_result(XPRParser.Global_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#global_result}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_result(XPRParser.Global_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#function_inline_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_inline_call(XPRParser.Function_inline_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#function_inline_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_inline_call(XPRParser.Function_inline_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#require_block}.
	 * @param ctx the parse tree
	 */
	void enterRequire_block(XPRParser.Require_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#require_block}.
	 * @param ctx the parse tree
	 */
	void exitRequire_block(XPRParser.Require_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#pir_inline}.
	 * @param ctx the parse tree
	 */
	void enterPir_inline(XPRParser.Pir_inlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#pir_inline}.
	 * @param ctx the parse tree
	 */
	void exitPir_inline(XPRParser.Pir_inlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#pir_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterPir_expression_list(XPRParser.Pir_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#pir_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitPir_expression_list(XPRParser.Pir_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(XPRParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(XPRParser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#function_definition_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_body(XPRParser.Function_definition_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#function_definition_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_body(XPRParser.Function_definition_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#trans_statement}.
	 * @param ctx the parse tree
	 */
	void enterTrans_statement(XPRParser.Trans_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#trans_statement}.
	 * @param ctx the parse tree
	 */
	void exitTrans_statement(XPRParser.Trans_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#function_definition_header}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_header(XPRParser.Function_definition_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#function_definition_header}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_header(XPRParser.Function_definition_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(XPRParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(XPRParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#function_definition_params}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_params(XPRParser.Function_definition_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#function_definition_params}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_params(XPRParser.Function_definition_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#function_definition_params_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_params_list(XPRParser.Function_definition_params_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#function_definition_params_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_params_list(XPRParser.Function_definition_params_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#function_definition_param_id}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_param_id(XPRParser.Function_definition_param_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#function_definition_param_id}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_param_id(XPRParser.Function_definition_param_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#new_statement}.
	 * @param ctx the parse tree
	 */
	void enterNew_statement(XPRParser.New_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#new_statement}.
	 * @param ctx the parse tree
	 */
	void exitNew_statement(XPRParser.New_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#remove_statement}.
	 * @param ctx the parse tree
	 */
	void enterRemove_statement(XPRParser.Remove_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#remove_statement}.
	 * @param ctx the parse tree
	 */
	void exitRemove_statement(XPRParser.Remove_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(XPRParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(XPRParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#validate_presence}.
	 * @param ctx the parse tree
	 */
	void enterValidate_presence(XPRParser.Validate_presenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#validate_presence}.
	 * @param ctx the parse tree
	 */
	void exitValidate_presence(XPRParser.Validate_presenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#validate_num}.
	 * @param ctx the parse tree
	 */
	void enterValidate_num(XPRParser.Validate_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#validate_num}.
	 * @param ctx the parse tree
	 */
	void exitValidate_num(XPRParser.Validate_numContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#cond_num}.
	 * @param ctx the parse tree
	 */
	void enterCond_num(XPRParser.Cond_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#cond_num}.
	 * @param ctx the parse tree
	 */
	void exitCond_num(XPRParser.Cond_numContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#belong_statement}.
	 * @param ctx the parse tree
	 */
	void enterBelong_statement(XPRParser.Belong_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#belong_statement}.
	 * @param ctx the parse tree
	 */
	void exitBelong_statement(XPRParser.Belong_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#has_many_statement}.
	 * @param ctx the parse tree
	 */
	void enterHas_many_statement(XPRParser.Has_many_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#has_many_statement}.
	 * @param ctx the parse tree
	 */
	void exitHas_many_statement(XPRParser.Has_many_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#del_expr}.
	 * @param ctx the parse tree
	 */
	void enterDel_expr(XPRParser.Del_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#del_expr}.
	 * @param ctx the parse tree
	 */
	void exitDel_expr(XPRParser.Del_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(XPRParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(XPRParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#save_statement}.
	 * @param ctx the parse tree
	 */
	void enterSave_statement(XPRParser.Save_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#save_statement}.
	 * @param ctx the parse tree
	 */
	void exitSave_statement(XPRParser.Save_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(XPRParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(XPRParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#function_call_param_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_param_list(XPRParser.Function_call_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#function_call_param_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_param_list(XPRParser.Function_call_param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#function_call_params}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_params(XPRParser.Function_call_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#function_call_params}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_params(XPRParser.Function_call_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#function_param}.
	 * @param ctx the parse tree
	 */
	void enterFunction_param(XPRParser.Function_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#function_param}.
	 * @param ctx the parse tree
	 */
	void exitFunction_param(XPRParser.Function_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#function_unnamed_param}.
	 * @param ctx the parse tree
	 */
	void enterFunction_unnamed_param(XPRParser.Function_unnamed_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#function_unnamed_param}.
	 * @param ctx the parse tree
	 */
	void exitFunction_unnamed_param(XPRParser.Function_unnamed_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#function_named_param}.
	 * @param ctx the parse tree
	 */
	void enterFunction_named_param(XPRParser.Function_named_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#function_named_param}.
	 * @param ctx the parse tree
	 */
	void exitFunction_named_param(XPRParser.Function_named_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#function_call_assignment}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_assignment(XPRParser.Function_call_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#function_call_assignment}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_assignment(XPRParser.Function_call_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#all_result}.
	 * @param ctx the parse tree
	 */
	void enterAll_result(XPRParser.All_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#all_result}.
	 * @param ctx the parse tree
	 */
	void exitAll_result(XPRParser.All_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#elsif_statement}.
	 * @param ctx the parse tree
	 */
	void enterElsif_statement(XPRParser.Elsif_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#elsif_statement}.
	 * @param ctx the parse tree
	 */
	void exitElsif_statement(XPRParser.Elsif_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#if_elsif_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_elsif_statement(XPRParser.If_elsif_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#if_elsif_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_elsif_statement(XPRParser.If_elsif_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(XPRParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(XPRParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#unless_statement}.
	 * @param ctx the parse tree
	 */
	void enterUnless_statement(XPRParser.Unless_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#unless_statement}.
	 * @param ctx the parse tree
	 */
	void exitUnless_statement(XPRParser.Unless_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(XPRParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(XPRParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(XPRParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(XPRParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#init_expression}.
	 * @param ctx the parse tree
	 */
	void enterInit_expression(XPRParser.Init_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#init_expression}.
	 * @param ctx the parse tree
	 */
	void exitInit_expression(XPRParser.Init_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#all_assignment}.
	 * @param ctx the parse tree
	 */
	void enterAll_assignment(XPRParser.All_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#all_assignment}.
	 * @param ctx the parse tree
	 */
	void exitAll_assignment(XPRParser.All_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#for_init_list}.
	 * @param ctx the parse tree
	 */
	void enterFor_init_list(XPRParser.For_init_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#for_init_list}.
	 * @param ctx the parse tree
	 */
	void exitFor_init_list(XPRParser.For_init_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#cond_expression}.
	 * @param ctx the parse tree
	 */
	void enterCond_expression(XPRParser.Cond_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#cond_expression}.
	 * @param ctx the parse tree
	 */
	void exitCond_expression(XPRParser.Cond_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#loop_expression}.
	 * @param ctx the parse tree
	 */
	void enterLoop_expression(XPRParser.Loop_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#loop_expression}.
	 * @param ctx the parse tree
	 */
	void exitLoop_expression(XPRParser.Loop_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#for_loop_list}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop_list(XPRParser.For_loop_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#for_loop_list}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop_list(XPRParser.For_loop_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#statement_body}.
	 * @param ctx the parse tree
	 */
	void enterStatement_body(XPRParser.Statement_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#statement_body}.
	 * @param ctx the parse tree
	 */
	void exitStatement_body(XPRParser.Statement_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#statement_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_expression_list(XPRParser.Statement_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#statement_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_expression_list(XPRParser.Statement_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(XPRParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(XPRParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#primary_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expr(XPRParser.Primary_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#primary_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expr(XPRParser.Primary_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#dynamic_assignment}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_assignment(XPRParser.Dynamic_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#dynamic_assignment}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_assignment(XPRParser.Dynamic_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#int_assignment}.
	 * @param ctx the parse tree
	 */
	void enterInt_assignment(XPRParser.Int_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#int_assignment}.
	 * @param ctx the parse tree
	 */
	void exitInt_assignment(XPRParser.Int_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#int_plus}.
	 * @param ctx the parse tree
	 */
	void enterInt_plus(XPRParser.Int_plusContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#int_plus}.
	 * @param ctx the parse tree
	 */
	void exitInt_plus(XPRParser.Int_plusContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#int_minus}.
	 * @param ctx the parse tree
	 */
	void enterInt_minus(XPRParser.Int_minusContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#int_minus}.
	 * @param ctx the parse tree
	 */
	void exitInt_minus(XPRParser.Int_minusContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#float_assignment}.
	 * @param ctx the parse tree
	 */
	void enterFloat_assignment(XPRParser.Float_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#float_assignment}.
	 * @param ctx the parse tree
	 */
	void exitFloat_assignment(XPRParser.Float_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#string_assignment}.
	 * @param ctx the parse tree
	 */
	void enterString_assignment(XPRParser.String_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#string_assignment}.
	 * @param ctx the parse tree
	 */
	void exitString_assignment(XPRParser.String_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#initial_array_assignment}.
	 * @param ctx the parse tree
	 */
	void enterInitial_array_assignment(XPRParser.Initial_array_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#initial_array_assignment}.
	 * @param ctx the parse tree
	 */
	void exitInitial_array_assignment(XPRParser.Initial_array_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#array_assignment}.
	 * @param ctx the parse tree
	 */
	void enterArray_assignment(XPRParser.Array_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#array_assignment}.
	 * @param ctx the parse tree
	 */
	void exitArray_assignment(XPRParser.Array_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#array_definition}.
	 * @param ctx the parse tree
	 */
	void enterArray_definition(XPRParser.Array_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#array_definition}.
	 * @param ctx the parse tree
	 */
	void exitArray_definition(XPRParser.Array_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#array_definition_elements}.
	 * @param ctx the parse tree
	 */
	void enterArray_definition_elements(XPRParser.Array_definition_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#array_definition_elements}.
	 * @param ctx the parse tree
	 */
	void exitArray_definition_elements(XPRParser.Array_definition_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#array_selector}.
	 * @param ctx the parse tree
	 */
	void enterArray_selector(XPRParser.Array_selectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#array_selector}.
	 * @param ctx the parse tree
	 */
	void exitArray_selector(XPRParser.Array_selectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#dynamic_result}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_result(XPRParser.Dynamic_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#dynamic_result}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_result(XPRParser.Dynamic_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#dynamic}.
	 * @param ctx the parse tree
	 */
	void enterDynamic(XPRParser.DynamicContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#dynamic}.
	 * @param ctx the parse tree
	 */
	void exitDynamic(XPRParser.DynamicContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#int_result}.
	 * @param ctx the parse tree
	 */
	void enterInt_result(XPRParser.Int_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#int_result}.
	 * @param ctx the parse tree
	 */
	void exitInt_result(XPRParser.Int_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#float_result}.
	 * @param ctx the parse tree
	 */
	void enterFloat_result(XPRParser.Float_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#float_result}.
	 * @param ctx the parse tree
	 */
	void exitFloat_result(XPRParser.Float_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#string_result}.
	 * @param ctx the parse tree
	 */
	void enterString_result(XPRParser.String_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#string_result}.
	 * @param ctx the parse tree
	 */
	void exitString_result(XPRParser.String_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#comparison_list}.
	 * @param ctx the parse tree
	 */
	void enterComparison_list(XPRParser.Comparison_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#comparison_list}.
	 * @param ctx the parse tree
	 */
	void exitComparison_list(XPRParser.Comparison_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#nil_check}.
	 * @param ctx the parse tree
	 */
	void enterNil_check(XPRParser.Nil_checkContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#nil_check}.
	 * @param ctx the parse tree
	 */
	void exitNil_check(XPRParser.Nil_checkContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(XPRParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(XPRParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#comp_var}.
	 * @param ctx the parse tree
	 */
	void enterComp_var(XPRParser.Comp_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#comp_var}.
	 * @param ctx the parse tree
	 */
	void exitComp_var(XPRParser.Comp_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(XPRParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(XPRParser.LvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void enterRvalue(XPRParser.RvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void exitRvalue(XPRParser.RvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#break_expression}.
	 * @param ctx the parse tree
	 */
	void enterBreak_expression(XPRParser.Break_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#break_expression}.
	 * @param ctx the parse tree
	 */
	void exitBreak_expression(XPRParser.Break_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#literal_t}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_t(XPRParser.Literal_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#literal_t}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_t(XPRParser.Literal_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#float_t}.
	 * @param ctx the parse tree
	 */
	void enterFloat_t(XPRParser.Float_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#float_t}.
	 * @param ctx the parse tree
	 */
	void exitFloat_t(XPRParser.Float_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#int_t}.
	 * @param ctx the parse tree
	 */
	void enterInt_t(XPRParser.Int_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#int_t}.
	 * @param ctx the parse tree
	 */
	void exitInt_t(XPRParser.Int_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#bool_t}.
	 * @param ctx the parse tree
	 */
	void enterBool_t(XPRParser.Bool_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#bool_t}.
	 * @param ctx the parse tree
	 */
	void exitBool_t(XPRParser.Bool_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#nil_t}.
	 * @param ctx the parse tree
	 */
	void enterNil_t(XPRParser.Nil_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#nil_t}.
	 * @param ctx the parse tree
	 */
	void exitNil_t(XPRParser.Nil_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(XPRParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(XPRParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#id_global}.
	 * @param ctx the parse tree
	 */
	void enterId_global(XPRParser.Id_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#id_global}.
	 * @param ctx the parse tree
	 */
	void exitId_global(XPRParser.Id_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#id_function}.
	 * @param ctx the parse tree
	 */
	void enterId_function(XPRParser.Id_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#id_function}.
	 * @param ctx the parse tree
	 */
	void exitId_function(XPRParser.Id_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#terminator}.
	 * @param ctx the parse tree
	 */
	void enterTerminator(XPRParser.TerminatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#terminator}.
	 * @param ctx the parse tree
	 */
	void exitTerminator(XPRParser.TerminatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#else_token}.
	 * @param ctx the parse tree
	 */
	void enterElse_token(XPRParser.Else_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#else_token}.
	 * @param ctx the parse tree
	 */
	void exitElse_token(XPRParser.Else_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPRParser#crlf}.
	 * @param ctx the parse tree
	 */
	void enterCrlf(XPRParser.CrlfContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPRParser#crlf}.
	 * @param ctx the parse tree
	 */
	void exitCrlf(XPRParser.CrlfContext ctx);
}