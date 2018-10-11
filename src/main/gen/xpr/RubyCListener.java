// Generated from /Users/mnajafza/Downloads/CISE-master/src/main/java/xpr/RubyC.g4 by ANTLR 4.7
package xpr;
package xpr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RubyCParser}.
 */
public interface RubyCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RubyCParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(RubyCParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(RubyCParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#class_definition}.
	 * @param ctx the parse tree
	 */
	void enterClass_definition(RubyCParser.Class_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#class_definition}.
	 * @param ctx the parse tree
	 */
	void exitClass_definition(RubyCParser.Class_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(RubyCParser.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(RubyCParser.Class_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#class_name}.
	 * @param ctx the parse tree
	 */
	void enterClass_name(RubyCParser.Class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#class_name}.
	 * @param ctx the parse tree
	 */
	void exitClass_name(RubyCParser.Class_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(RubyCParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(RubyCParser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(RubyCParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(RubyCParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#render_statement}.
	 * @param ctx the parse tree
	 */
	void enterRender_statement(RubyCParser.Render_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#render_statement}.
	 * @param ctx the parse tree
	 */
	void exitRender_statement(RubyCParser.Render_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#put_statement}.
	 * @param ctx the parse tree
	 */
	void enterPut_statement(RubyCParser.Put_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#put_statement}.
	 * @param ctx the parse tree
	 */
	void exitPut_statement(RubyCParser.Put_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#global_get}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_get(RubyCParser.Global_getContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#global_get}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_get(RubyCParser.Global_getContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#global_set}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_set(RubyCParser.Global_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#global_set}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_set(RubyCParser.Global_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#global_result}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_result(RubyCParser.Global_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#global_result}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_result(RubyCParser.Global_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#function_inline_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_inline_call(RubyCParser.Function_inline_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#function_inline_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_inline_call(RubyCParser.Function_inline_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#require_block}.
	 * @param ctx the parse tree
	 */
	void enterRequire_block(RubyCParser.Require_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#require_block}.
	 * @param ctx the parse tree
	 */
	void exitRequire_block(RubyCParser.Require_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#pir_inline}.
	 * @param ctx the parse tree
	 */
	void enterPir_inline(RubyCParser.Pir_inlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#pir_inline}.
	 * @param ctx the parse tree
	 */
	void exitPir_inline(RubyCParser.Pir_inlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#pir_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterPir_expression_list(RubyCParser.Pir_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#pir_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitPir_expression_list(RubyCParser.Pir_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(RubyCParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(RubyCParser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#function_definition_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_body(RubyCParser.Function_definition_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#function_definition_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_body(RubyCParser.Function_definition_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#trans_statement}.
	 * @param ctx the parse tree
	 */
	void enterTrans_statement(RubyCParser.Trans_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#trans_statement}.
	 * @param ctx the parse tree
	 */
	void exitTrans_statement(RubyCParser.Trans_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#function_definition_header}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_header(RubyCParser.Function_definition_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#function_definition_header}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_header(RubyCParser.Function_definition_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(RubyCParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(RubyCParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#function_definition_params}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_params(RubyCParser.Function_definition_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#function_definition_params}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_params(RubyCParser.Function_definition_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#function_definition_params_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_params_list(RubyCParser.Function_definition_params_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#function_definition_params_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_params_list(RubyCParser.Function_definition_params_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#function_definition_param_id}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_param_id(RubyCParser.Function_definition_param_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#function_definition_param_id}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_param_id(RubyCParser.Function_definition_param_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#new_statement}.
	 * @param ctx the parse tree
	 */
	void enterNew_statement(RubyCParser.New_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#new_statement}.
	 * @param ctx the parse tree
	 */
	void exitNew_statement(RubyCParser.New_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#remove_statement}.
	 * @param ctx the parse tree
	 */
	void enterRemove_statement(RubyCParser.Remove_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#remove_statement}.
	 * @param ctx the parse tree
	 */
	void exitRemove_statement(RubyCParser.Remove_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(RubyCParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(RubyCParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#validate_presence}.
	 * @param ctx the parse tree
	 */
	void enterValidate_presence(RubyCParser.Validate_presenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#validate_presence}.
	 * @param ctx the parse tree
	 */
	void exitValidate_presence(RubyCParser.Validate_presenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#validate_num}.
	 * @param ctx the parse tree
	 */
	void enterValidate_num(RubyCParser.Validate_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#validate_num}.
	 * @param ctx the parse tree
	 */
	void exitValidate_num(RubyCParser.Validate_numContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#cond_num}.
	 * @param ctx the parse tree
	 */
	void enterCond_num(RubyCParser.Cond_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#cond_num}.
	 * @param ctx the parse tree
	 */
	void exitCond_num(RubyCParser.Cond_numContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#belong_statement}.
	 * @param ctx the parse tree
	 */
	void enterBelong_statement(RubyCParser.Belong_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#belong_statement}.
	 * @param ctx the parse tree
	 */
	void exitBelong_statement(RubyCParser.Belong_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(RubyCParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(RubyCParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#save_statement}.
	 * @param ctx the parse tree
	 */
	void enterSave_statement(RubyCParser.Save_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#save_statement}.
	 * @param ctx the parse tree
	 */
	void exitSave_statement(RubyCParser.Save_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(RubyCParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(RubyCParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#function_call_param_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_param_list(RubyCParser.Function_call_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#function_call_param_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_param_list(RubyCParser.Function_call_param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#function_call_params}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_params(RubyCParser.Function_call_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#function_call_params}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_params(RubyCParser.Function_call_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#function_param}.
	 * @param ctx the parse tree
	 */
	void enterFunction_param(RubyCParser.Function_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#function_param}.
	 * @param ctx the parse tree
	 */
	void exitFunction_param(RubyCParser.Function_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#function_unnamed_param}.
	 * @param ctx the parse tree
	 */
	void enterFunction_unnamed_param(RubyCParser.Function_unnamed_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#function_unnamed_param}.
	 * @param ctx the parse tree
	 */
	void exitFunction_unnamed_param(RubyCParser.Function_unnamed_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#function_named_param}.
	 * @param ctx the parse tree
	 */
	void enterFunction_named_param(RubyCParser.Function_named_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#function_named_param}.
	 * @param ctx the parse tree
	 */
	void exitFunction_named_param(RubyCParser.Function_named_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#function_call_assignment}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_assignment(RubyCParser.Function_call_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#function_call_assignment}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_assignment(RubyCParser.Function_call_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#all_result}.
	 * @param ctx the parse tree
	 */
	void enterAll_result(RubyCParser.All_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#all_result}.
	 * @param ctx the parse tree
	 */
	void exitAll_result(RubyCParser.All_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#elsif_statement}.
	 * @param ctx the parse tree
	 */
	void enterElsif_statement(RubyCParser.Elsif_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#elsif_statement}.
	 * @param ctx the parse tree
	 */
	void exitElsif_statement(RubyCParser.Elsif_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#if_elsif_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_elsif_statement(RubyCParser.If_elsif_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#if_elsif_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_elsif_statement(RubyCParser.If_elsif_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(RubyCParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(RubyCParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#unless_statement}.
	 * @param ctx the parse tree
	 */
	void enterUnless_statement(RubyCParser.Unless_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#unless_statement}.
	 * @param ctx the parse tree
	 */
	void exitUnless_statement(RubyCParser.Unless_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(RubyCParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(RubyCParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(RubyCParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(RubyCParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#init_expression}.
	 * @param ctx the parse tree
	 */
	void enterInit_expression(RubyCParser.Init_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#init_expression}.
	 * @param ctx the parse tree
	 */
	void exitInit_expression(RubyCParser.Init_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#all_assignment}.
	 * @param ctx the parse tree
	 */
	void enterAll_assignment(RubyCParser.All_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#all_assignment}.
	 * @param ctx the parse tree
	 */
	void exitAll_assignment(RubyCParser.All_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#for_init_list}.
	 * @param ctx the parse tree
	 */
	void enterFor_init_list(RubyCParser.For_init_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#for_init_list}.
	 * @param ctx the parse tree
	 */
	void exitFor_init_list(RubyCParser.For_init_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#cond_expression}.
	 * @param ctx the parse tree
	 */
	void enterCond_expression(RubyCParser.Cond_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#cond_expression}.
	 * @param ctx the parse tree
	 */
	void exitCond_expression(RubyCParser.Cond_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#loop_expression}.
	 * @param ctx the parse tree
	 */
	void enterLoop_expression(RubyCParser.Loop_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#loop_expression}.
	 * @param ctx the parse tree
	 */
	void exitLoop_expression(RubyCParser.Loop_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#for_loop_list}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop_list(RubyCParser.For_loop_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#for_loop_list}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop_list(RubyCParser.For_loop_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#statement_body}.
	 * @param ctx the parse tree
	 */
	void enterStatement_body(RubyCParser.Statement_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#statement_body}.
	 * @param ctx the parse tree
	 */
	void exitStatement_body(RubyCParser.Statement_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#statement_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_expression_list(RubyCParser.Statement_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#statement_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_expression_list(RubyCParser.Statement_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(RubyCParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(RubyCParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#primary_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expr(RubyCParser.Primary_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#primary_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expr(RubyCParser.Primary_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#dynamic_assignment}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_assignment(RubyCParser.Dynamic_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#dynamic_assignment}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_assignment(RubyCParser.Dynamic_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#int_assignment}.
	 * @param ctx the parse tree
	 */
	void enterInt_assignment(RubyCParser.Int_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#int_assignment}.
	 * @param ctx the parse tree
	 */
	void exitInt_assignment(RubyCParser.Int_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#int_plus}.
	 * @param ctx the parse tree
	 */
	void enterInt_plus(RubyCParser.Int_plusContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#int_plus}.
	 * @param ctx the parse tree
	 */
	void exitInt_plus(RubyCParser.Int_plusContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#int_minus}.
	 * @param ctx the parse tree
	 */
	void enterInt_minus(RubyCParser.Int_minusContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#int_minus}.
	 * @param ctx the parse tree
	 */
	void exitInt_minus(RubyCParser.Int_minusContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#float_assignment}.
	 * @param ctx the parse tree
	 */
	void enterFloat_assignment(RubyCParser.Float_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#float_assignment}.
	 * @param ctx the parse tree
	 */
	void exitFloat_assignment(RubyCParser.Float_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#string_assignment}.
	 * @param ctx the parse tree
	 */
	void enterString_assignment(RubyCParser.String_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#string_assignment}.
	 * @param ctx the parse tree
	 */
	void exitString_assignment(RubyCParser.String_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#initial_array_assignment}.
	 * @param ctx the parse tree
	 */
	void enterInitial_array_assignment(RubyCParser.Initial_array_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#initial_array_assignment}.
	 * @param ctx the parse tree
	 */
	void exitInitial_array_assignment(RubyCParser.Initial_array_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#array_assignment}.
	 * @param ctx the parse tree
	 */
	void enterArray_assignment(RubyCParser.Array_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#array_assignment}.
	 * @param ctx the parse tree
	 */
	void exitArray_assignment(RubyCParser.Array_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#array_definition}.
	 * @param ctx the parse tree
	 */
	void enterArray_definition(RubyCParser.Array_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#array_definition}.
	 * @param ctx the parse tree
	 */
	void exitArray_definition(RubyCParser.Array_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#array_definition_elements}.
	 * @param ctx the parse tree
	 */
	void enterArray_definition_elements(RubyCParser.Array_definition_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#array_definition_elements}.
	 * @param ctx the parse tree
	 */
	void exitArray_definition_elements(RubyCParser.Array_definition_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#array_selector}.
	 * @param ctx the parse tree
	 */
	void enterArray_selector(RubyCParser.Array_selectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#array_selector}.
	 * @param ctx the parse tree
	 */
	void exitArray_selector(RubyCParser.Array_selectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#dynamic_result}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_result(RubyCParser.Dynamic_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#dynamic_result}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_result(RubyCParser.Dynamic_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#dynamic}.
	 * @param ctx the parse tree
	 */
	void enterDynamic(RubyCParser.DynamicContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#dynamic}.
	 * @param ctx the parse tree
	 */
	void exitDynamic(RubyCParser.DynamicContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#int_result}.
	 * @param ctx the parse tree
	 */
	void enterInt_result(RubyCParser.Int_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#int_result}.
	 * @param ctx the parse tree
	 */
	void exitInt_result(RubyCParser.Int_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#float_result}.
	 * @param ctx the parse tree
	 */
	void enterFloat_result(RubyCParser.Float_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#float_result}.
	 * @param ctx the parse tree
	 */
	void exitFloat_result(RubyCParser.Float_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#string_result}.
	 * @param ctx the parse tree
	 */
	void enterString_result(RubyCParser.String_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#string_result}.
	 * @param ctx the parse tree
	 */
	void exitString_result(RubyCParser.String_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#comparison_list}.
	 * @param ctx the parse tree
	 */
	void enterComparison_list(RubyCParser.Comparison_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#comparison_list}.
	 * @param ctx the parse tree
	 */
	void exitComparison_list(RubyCParser.Comparison_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(RubyCParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(RubyCParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#comp_var}.
	 * @param ctx the parse tree
	 */
	void enterComp_var(RubyCParser.Comp_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#comp_var}.
	 * @param ctx the parse tree
	 */
	void exitComp_var(RubyCParser.Comp_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(RubyCParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(RubyCParser.LvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void enterRvalue(RubyCParser.RvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void exitRvalue(RubyCParser.RvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#break_expression}.
	 * @param ctx the parse tree
	 */
	void enterBreak_expression(RubyCParser.Break_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#break_expression}.
	 * @param ctx the parse tree
	 */
	void exitBreak_expression(RubyCParser.Break_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#literal_t}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_t(RubyCParser.Literal_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#literal_t}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_t(RubyCParser.Literal_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#float_t}.
	 * @param ctx the parse tree
	 */
	void enterFloat_t(RubyCParser.Float_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#float_t}.
	 * @param ctx the parse tree
	 */
	void exitFloat_t(RubyCParser.Float_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#int_t}.
	 * @param ctx the parse tree
	 */
	void enterInt_t(RubyCParser.Int_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#int_t}.
	 * @param ctx the parse tree
	 */
	void exitInt_t(RubyCParser.Int_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#bool_t}.
	 * @param ctx the parse tree
	 */
	void enterBool_t(RubyCParser.Bool_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#bool_t}.
	 * @param ctx the parse tree
	 */
	void exitBool_t(RubyCParser.Bool_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#nil_t}.
	 * @param ctx the parse tree
	 */
	void enterNil_t(RubyCParser.Nil_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#nil_t}.
	 * @param ctx the parse tree
	 */
	void exitNil_t(RubyCParser.Nil_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(RubyCParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(RubyCParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#id_global}.
	 * @param ctx the parse tree
	 */
	void enterId_global(RubyCParser.Id_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#id_global}.
	 * @param ctx the parse tree
	 */
	void exitId_global(RubyCParser.Id_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#id_function}.
	 * @param ctx the parse tree
	 */
	void enterId_function(RubyCParser.Id_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#id_function}.
	 * @param ctx the parse tree
	 */
	void exitId_function(RubyCParser.Id_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#terminator}.
	 * @param ctx the parse tree
	 */
	void enterTerminator(RubyCParser.TerminatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#terminator}.
	 * @param ctx the parse tree
	 */
	void exitTerminator(RubyCParser.TerminatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#else_token}.
	 * @param ctx the parse tree
	 */
	void enterElse_token(RubyCParser.Else_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#else_token}.
	 * @param ctx the parse tree
	 */
	void exitElse_token(RubyCParser.Else_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyCParser#crlf}.
	 * @param ctx the parse tree
	 */
	void enterCrlf(RubyCParser.CrlfContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyCParser#crlf}.
	 * @param ctx the parse tree
	 */
	void exitCrlf(RubyCParser.CrlfContext ctx);
}