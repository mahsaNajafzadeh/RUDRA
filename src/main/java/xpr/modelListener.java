// Generated from model.g4 by ANTLR 4.5.1
package xpr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link modelParser}.
 */
public interface modelListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link modelParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(modelParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(modelParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#class_definition}.
	 * @param ctx the parse tree
	 */
	void enterClass_definition(modelParser.Class_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#class_definition}.
	 * @param ctx the parse tree
	 */
	void exitClass_definition(modelParser.Class_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(modelParser.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(modelParser.Class_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#class_name}.
	 * @param ctx the parse tree
	 */
	void enterClass_name(modelParser.Class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#class_name}.
	 * @param ctx the parse tree
	 */
	void exitClass_name(modelParser.Class_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(modelParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(modelParser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(modelParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(modelParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#validate_function}.
	 * @param ctx the parse tree
	 */
	void enterValidate_function(modelParser.Validate_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#validate_function}.
	 * @param ctx the parse tree
	 */
	void exitValidate_function(modelParser.Validate_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#on_statement}.
	 * @param ctx the parse tree
	 */
	void enterOn_statement(modelParser.On_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#on_statement}.
	 * @param ctx the parse tree
	 */
	void exitOn_statement(modelParser.On_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#attr_statement}.
	 * @param ctx the parse tree
	 */
	void enterAttr_statement(modelParser.Attr_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#attr_statement}.
	 * @param ctx the parse tree
	 */
	void exitAttr_statement(modelParser.Attr_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#has_many_statement}.
	 * @param ctx the parse tree
	 */
	void enterHas_many_statement(modelParser.Has_many_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#has_many_statement}.
	 * @param ctx the parse tree
	 */
	void exitHas_many_statement(modelParser.Has_many_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#has_one_statement}.
	 * @param ctx the parse tree
	 */
	void enterHas_one_statement(modelParser.Has_one_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#has_one_statement}.
	 * @param ctx the parse tree
	 */
	void exitHas_one_statement(modelParser.Has_one_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#order_st}.
	 * @param ctx the parse tree
	 */
	void enterOrder_st(modelParser.Order_stContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#order_st}.
	 * @param ctx the parse tree
	 */
	void exitOrder_st(modelParser.Order_stContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#through_st}.
	 * @param ctx the parse tree
	 */
	void enterThrough_st(modelParser.Through_stContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#through_st}.
	 * @param ctx the parse tree
	 */
	void exitThrough_st(modelParser.Through_stContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#depend_st}.
	 * @param ctx the parse tree
	 */
	void enterDepend_st(modelParser.Depend_stContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#depend_st}.
	 * @param ctx the parse tree
	 */
	void exitDepend_st(modelParser.Depend_stContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#validate_u}.
	 * @param ctx the parse tree
	 */
	void enterValidate_u(modelParser.Validate_uContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#validate_u}.
	 * @param ctx the parse tree
	 */
	void exitValidate_u(modelParser.Validate_uContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#cc_statement}.
	 * @param ctx the parse tree
	 */
	void enterCc_statement(modelParser.Cc_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#cc_statement}.
	 * @param ctx the parse tree
	 */
	void exitCc_statement(modelParser.Cc_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#validate_statement}.
	 * @param ctx the parse tree
	 */
	void enterValidate_statement(modelParser.Validate_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#validate_statement}.
	 * @param ctx the parse tree
	 */
	void exitValidate_statement(modelParser.Validate_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#validates_associated}.
	 * @param ctx the parse tree
	 */
	void enterValidates_associated(modelParser.Validates_associatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#validates_associated}.
	 * @param ctx the parse tree
	 */
	void exitValidates_associated(modelParser.Validates_associatedContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#presentce}.
	 * @param ctx the parse tree
	 */
	void enterPresentce(modelParser.PresentceContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#presentce}.
	 * @param ctx the parse tree
	 */
	void exitPresentce(modelParser.PresentceContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#belong_expr}.
	 * @param ctx the parse tree
	 */
	void enterBelong_expr(modelParser.Belong_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#belong_expr}.
	 * @param ctx the parse tree
	 */
	void exitBelong_expr(modelParser.Belong_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#lengthst}.
	 * @param ctx the parse tree
	 */
	void enterLengthst(modelParser.LengthstContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#lengthst}.
	 * @param ctx the parse tree
	 */
	void exitLengthst(modelParser.LengthstContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#numericallyst}.
	 * @param ctx the parse tree
	 */
	void enterNumericallyst(modelParser.NumericallystContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#numericallyst}.
	 * @param ctx the parse tree
	 */
	void exitNumericallyst(modelParser.NumericallystContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#validate_unique}.
	 * @param ctx the parse tree
	 */
	void enterValidate_unique(modelParser.Validate_uniqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#validate_unique}.
	 * @param ctx the parse tree
	 */
	void exitValidate_unique(modelParser.Validate_uniqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#render_statement}.
	 * @param ctx the parse tree
	 */
	void enterRender_statement(modelParser.Render_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#render_statement}.
	 * @param ctx the parse tree
	 */
	void exitRender_statement(modelParser.Render_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#put_statement}.
	 * @param ctx the parse tree
	 */
	void enterPut_statement(modelParser.Put_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#put_statement}.
	 * @param ctx the parse tree
	 */
	void exitPut_statement(modelParser.Put_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#global_get}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_get(modelParser.Global_getContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#global_get}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_get(modelParser.Global_getContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#global_set}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_set(modelParser.Global_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#global_set}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_set(modelParser.Global_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#global_result}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_result(modelParser.Global_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#global_result}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_result(modelParser.Global_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#function_inline_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_inline_call(modelParser.Function_inline_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#function_inline_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_inline_call(modelParser.Function_inline_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#require_block}.
	 * @param ctx the parse tree
	 */
	void enterRequire_block(modelParser.Require_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#require_block}.
	 * @param ctx the parse tree
	 */
	void exitRequire_block(modelParser.Require_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#pir_inline}.
	 * @param ctx the parse tree
	 */
	void enterPir_inline(modelParser.Pir_inlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#pir_inline}.
	 * @param ctx the parse tree
	 */
	void exitPir_inline(modelParser.Pir_inlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#pir_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterPir_expression_list(modelParser.Pir_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#pir_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitPir_expression_list(modelParser.Pir_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(modelParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(modelParser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#function_definition_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_body(modelParser.Function_definition_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#function_definition_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_body(modelParser.Function_definition_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#set_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_statement(modelParser.Set_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#set_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_statement(modelParser.Set_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#id1}.
	 * @param ctx the parse tree
	 */
	void enterId1(modelParser.Id1Context ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#id1}.
	 * @param ctx the parse tree
	 */
	void exitId1(modelParser.Id1Context ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#id0}.
	 * @param ctx the parse tree
	 */
	void enterId0(modelParser.Id0Context ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#id0}.
	 * @param ctx the parse tree
	 */
	void exitId0(modelParser.Id0Context ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#trans_statement}.
	 * @param ctx the parse tree
	 */
	void enterTrans_statement(modelParser.Trans_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#trans_statement}.
	 * @param ctx the parse tree
	 */
	void exitTrans_statement(modelParser.Trans_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#function_definition_header}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_header(modelParser.Function_definition_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#function_definition_header}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_header(modelParser.Function_definition_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(modelParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(modelParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#function_definition_params}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_params(modelParser.Function_definition_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#function_definition_params}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_params(modelParser.Function_definition_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#function_definition_params_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_params_list(modelParser.Function_definition_params_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#function_definition_params_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_params_list(modelParser.Function_definition_params_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#function_definition_param_id}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_param_id(modelParser.Function_definition_param_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#function_definition_param_id}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_param_id(modelParser.Function_definition_param_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#new_statement}.
	 * @param ctx the parse tree
	 */
	void enterNew_statement(modelParser.New_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#new_statement}.
	 * @param ctx the parse tree
	 */
	void exitNew_statement(modelParser.New_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#remove_statement}.
	 * @param ctx the parse tree
	 */
	void enterRemove_statement(modelParser.Remove_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#remove_statement}.
	 * @param ctx the parse tree
	 */
	void exitRemove_statement(modelParser.Remove_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(modelParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(modelParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#validate_presence}.
	 * @param ctx the parse tree
	 */
	void enterValidate_presence(modelParser.Validate_presenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#validate_presence}.
	 * @param ctx the parse tree
	 */
	void exitValidate_presence(modelParser.Validate_presenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#validate_num}.
	 * @param ctx the parse tree
	 */
	void enterValidate_num(modelParser.Validate_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#validate_num}.
	 * @param ctx the parse tree
	 */
	void exitValidate_num(modelParser.Validate_numContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#cond_num}.
	 * @param ctx the parse tree
	 */
	void enterCond_num(modelParser.Cond_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#cond_num}.
	 * @param ctx the parse tree
	 */
	void exitCond_num(modelParser.Cond_numContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#belong_statement}.
	 * @param ctx the parse tree
	 */
	void enterBelong_statement(modelParser.Belong_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#belong_statement}.
	 * @param ctx the parse tree
	 */
	void exitBelong_statement(modelParser.Belong_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#belong_options}.
	 * @param ctx the parse tree
	 */
	void enterBelong_options(modelParser.Belong_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#belong_options}.
	 * @param ctx the parse tree
	 */
	void exitBelong_options(modelParser.Belong_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(modelParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(modelParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#save_statement}.
	 * @param ctx the parse tree
	 */
	void enterSave_statement(modelParser.Save_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#save_statement}.
	 * @param ctx the parse tree
	 */
	void exitSave_statement(modelParser.Save_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(modelParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(modelParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#function_call_param_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_param_list(modelParser.Function_call_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#function_call_param_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_param_list(modelParser.Function_call_param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#function_call_params}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_params(modelParser.Function_call_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#function_call_params}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_params(modelParser.Function_call_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#function_param}.
	 * @param ctx the parse tree
	 */
	void enterFunction_param(modelParser.Function_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#function_param}.
	 * @param ctx the parse tree
	 */
	void exitFunction_param(modelParser.Function_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#function_unnamed_param}.
	 * @param ctx the parse tree
	 */
	void enterFunction_unnamed_param(modelParser.Function_unnamed_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#function_unnamed_param}.
	 * @param ctx the parse tree
	 */
	void exitFunction_unnamed_param(modelParser.Function_unnamed_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#function_named_param}.
	 * @param ctx the parse tree
	 */
	void enterFunction_named_param(modelParser.Function_named_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#function_named_param}.
	 * @param ctx the parse tree
	 */
	void exitFunction_named_param(modelParser.Function_named_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#function_call_assignment}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_assignment(modelParser.Function_call_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#function_call_assignment}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_assignment(modelParser.Function_call_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#all_result}.
	 * @param ctx the parse tree
	 */
	void enterAll_result(modelParser.All_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#all_result}.
	 * @param ctx the parse tree
	 */
	void exitAll_result(modelParser.All_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#elsif_statement}.
	 * @param ctx the parse tree
	 */
	void enterElsif_statement(modelParser.Elsif_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#elsif_statement}.
	 * @param ctx the parse tree
	 */
	void exitElsif_statement(modelParser.Elsif_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#if_elsif_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_elsif_statement(modelParser.If_elsif_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#if_elsif_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_elsif_statement(modelParser.If_elsif_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(modelParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(modelParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#unless_statement}.
	 * @param ctx the parse tree
	 */
	void enterUnless_statement(modelParser.Unless_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#unless_statement}.
	 * @param ctx the parse tree
	 */
	void exitUnless_statement(modelParser.Unless_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(modelParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(modelParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(modelParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(modelParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#init_expression}.
	 * @param ctx the parse tree
	 */
	void enterInit_expression(modelParser.Init_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#init_expression}.
	 * @param ctx the parse tree
	 */
	void exitInit_expression(modelParser.Init_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#all_assignment}.
	 * @param ctx the parse tree
	 */
	void enterAll_assignment(modelParser.All_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#all_assignment}.
	 * @param ctx the parse tree
	 */
	void exitAll_assignment(modelParser.All_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#for_init_list}.
	 * @param ctx the parse tree
	 */
	void enterFor_init_list(modelParser.For_init_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#for_init_list}.
	 * @param ctx the parse tree
	 */
	void exitFor_init_list(modelParser.For_init_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#cond_expression}.
	 * @param ctx the parse tree
	 */
	void enterCond_expression(modelParser.Cond_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#cond_expression}.
	 * @param ctx the parse tree
	 */
	void exitCond_expression(modelParser.Cond_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#loop_expression}.
	 * @param ctx the parse tree
	 */
	void enterLoop_expression(modelParser.Loop_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#loop_expression}.
	 * @param ctx the parse tree
	 */
	void exitLoop_expression(modelParser.Loop_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#for_loop_list}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop_list(modelParser.For_loop_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#for_loop_list}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop_list(modelParser.For_loop_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#statement_body}.
	 * @param ctx the parse tree
	 */
	void enterStatement_body(modelParser.Statement_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#statement_body}.
	 * @param ctx the parse tree
	 */
	void exitStatement_body(modelParser.Statement_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#statement_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_expression_list(modelParser.Statement_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#statement_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_expression_list(modelParser.Statement_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(modelParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(modelParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#primary_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expr(modelParser.Primary_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#primary_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expr(modelParser.Primary_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#dynamic_assignment}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_assignment(modelParser.Dynamic_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#dynamic_assignment}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_assignment(modelParser.Dynamic_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#int_assignment}.
	 * @param ctx the parse tree
	 */
	void enterInt_assignment(modelParser.Int_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#int_assignment}.
	 * @param ctx the parse tree
	 */
	void exitInt_assignment(modelParser.Int_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#int_plus}.
	 * @param ctx the parse tree
	 */
	void enterInt_plus(modelParser.Int_plusContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#int_plus}.
	 * @param ctx the parse tree
	 */
	void exitInt_plus(modelParser.Int_plusContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#int_minus}.
	 * @param ctx the parse tree
	 */
	void enterInt_minus(modelParser.Int_minusContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#int_minus}.
	 * @param ctx the parse tree
	 */
	void exitInt_minus(modelParser.Int_minusContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#float_assignment}.
	 * @param ctx the parse tree
	 */
	void enterFloat_assignment(modelParser.Float_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#float_assignment}.
	 * @param ctx the parse tree
	 */
	void exitFloat_assignment(modelParser.Float_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#string_assignment}.
	 * @param ctx the parse tree
	 */
	void enterString_assignment(modelParser.String_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#string_assignment}.
	 * @param ctx the parse tree
	 */
	void exitString_assignment(modelParser.String_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#initial_array_assignment}.
	 * @param ctx the parse tree
	 */
	void enterInitial_array_assignment(modelParser.Initial_array_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#initial_array_assignment}.
	 * @param ctx the parse tree
	 */
	void exitInitial_array_assignment(modelParser.Initial_array_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#array_assignment}.
	 * @param ctx the parse tree
	 */
	void enterArray_assignment(modelParser.Array_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#array_assignment}.
	 * @param ctx the parse tree
	 */
	void exitArray_assignment(modelParser.Array_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#array_definition}.
	 * @param ctx the parse tree
	 */
	void enterArray_definition(modelParser.Array_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#array_definition}.
	 * @param ctx the parse tree
	 */
	void exitArray_definition(modelParser.Array_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#array_definition_elements}.
	 * @param ctx the parse tree
	 */
	void enterArray_definition_elements(modelParser.Array_definition_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#array_definition_elements}.
	 * @param ctx the parse tree
	 */
	void exitArray_definition_elements(modelParser.Array_definition_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#array_selector}.
	 * @param ctx the parse tree
	 */
	void enterArray_selector(modelParser.Array_selectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#array_selector}.
	 * @param ctx the parse tree
	 */
	void exitArray_selector(modelParser.Array_selectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#dynamic_result}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_result(modelParser.Dynamic_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#dynamic_result}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_result(modelParser.Dynamic_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#dynamic}.
	 * @param ctx the parse tree
	 */
	void enterDynamic(modelParser.DynamicContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#dynamic}.
	 * @param ctx the parse tree
	 */
	void exitDynamic(modelParser.DynamicContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#int_result}.
	 * @param ctx the parse tree
	 */
	void enterInt_result(modelParser.Int_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#int_result}.
	 * @param ctx the parse tree
	 */
	void exitInt_result(modelParser.Int_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#float_result}.
	 * @param ctx the parse tree
	 */
	void enterFloat_result(modelParser.Float_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#float_result}.
	 * @param ctx the parse tree
	 */
	void exitFloat_result(modelParser.Float_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#string_result}.
	 * @param ctx the parse tree
	 */
	void enterString_result(modelParser.String_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#string_result}.
	 * @param ctx the parse tree
	 */
	void exitString_result(modelParser.String_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#comparison_list}.
	 * @param ctx the parse tree
	 */
	void enterComparison_list(modelParser.Comparison_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#comparison_list}.
	 * @param ctx the parse tree
	 */
	void exitComparison_list(modelParser.Comparison_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(modelParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(modelParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#self_expr}.
	 * @param ctx the parse tree
	 */
	void enterSelf_expr(modelParser.Self_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#self_expr}.
	 * @param ctx the parse tree
	 */
	void exitSelf_expr(modelParser.Self_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#nil_expr}.
	 * @param ctx the parse tree
	 */
	void enterNil_expr(modelParser.Nil_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#nil_expr}.
	 * @param ctx the parse tree
	 */
	void exitNil_expr(modelParser.Nil_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#none_expr}.
	 * @param ctx the parse tree
	 */
	void enterNone_expr(modelParser.None_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#none_expr}.
	 * @param ctx the parse tree
	 */
	void exitNone_expr(modelParser.None_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#comp_var}.
	 * @param ctx the parse tree
	 */
	void enterComp_var(modelParser.Comp_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#comp_var}.
	 * @param ctx the parse tree
	 */
	void exitComp_var(modelParser.Comp_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(modelParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(modelParser.LvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void enterRvalue(modelParser.RvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void exitRvalue(modelParser.RvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#break_expression}.
	 * @param ctx the parse tree
	 */
	void enterBreak_expression(modelParser.Break_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#break_expression}.
	 * @param ctx the parse tree
	 */
	void exitBreak_expression(modelParser.Break_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#literal_t}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_t(modelParser.Literal_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#literal_t}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_t(modelParser.Literal_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#float_t}.
	 * @param ctx the parse tree
	 */
	void enterFloat_t(modelParser.Float_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#float_t}.
	 * @param ctx the parse tree
	 */
	void exitFloat_t(modelParser.Float_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#int_t}.
	 * @param ctx the parse tree
	 */
	void enterInt_t(modelParser.Int_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#int_t}.
	 * @param ctx the parse tree
	 */
	void exitInt_t(modelParser.Int_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#bool_t}.
	 * @param ctx the parse tree
	 */
	void enterBool_t(modelParser.Bool_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#bool_t}.
	 * @param ctx the parse tree
	 */
	void exitBool_t(modelParser.Bool_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#nil_t}.
	 * @param ctx the parse tree
	 */
	void enterNil_t(modelParser.Nil_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#nil_t}.
	 * @param ctx the parse tree
	 */
	void exitNil_t(modelParser.Nil_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#negid}.
	 * @param ctx the parse tree
	 */
	void enterNegid(modelParser.NegidContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#negid}.
	 * @param ctx the parse tree
	 */
	void exitNegid(modelParser.NegidContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(modelParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(modelParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#id_global}.
	 * @param ctx the parse tree
	 */
	void enterId_global(modelParser.Id_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#id_global}.
	 * @param ctx the parse tree
	 */
	void exitId_global(modelParser.Id_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#id_function}.
	 * @param ctx the parse tree
	 */
	void enterId_function(modelParser.Id_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#id_function}.
	 * @param ctx the parse tree
	 */
	void exitId_function(modelParser.Id_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#terminator}.
	 * @param ctx the parse tree
	 */
	void enterTerminator(modelParser.TerminatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#terminator}.
	 * @param ctx the parse tree
	 */
	void exitTerminator(modelParser.TerminatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#else_token}.
	 * @param ctx the parse tree
	 */
	void enterElse_token(modelParser.Else_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#else_token}.
	 * @param ctx the parse tree
	 */
	void exitElse_token(modelParser.Else_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link modelParser#crlf}.
	 * @param ctx the parse tree
	 */
	void enterCrlf(modelParser.CrlfContext ctx);
	/**
	 * Exit a parse tree produced by {@link modelParser#crlf}.
	 * @param ctx the parse tree
	 */
	void exitCrlf(modelParser.CrlfContext ctx);
}