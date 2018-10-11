// Generated from /Users/mnajafza/Downloads/CISE-master/src/main/java/xpr/RubyC.g4 by ANTLR 4.7
package xpr;
package xpr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RubyCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RubyCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RubyCParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(RubyCParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#class_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_definition(RubyCParser.Class_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#class_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_declaration(RubyCParser.Class_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#class_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_name(RubyCParser.Class_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(RubyCParser.Class_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(RubyCParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#put_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPut_statement(RubyCParser.Put_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#global_get}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_get(RubyCParser.Global_getContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#global_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_set(RubyCParser.Global_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#global_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_result(RubyCParser.Global_resultContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#function_inline_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_inline_call(RubyCParser.Function_inline_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#require_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequire_block(RubyCParser.Require_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#pir_inline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPir_inline(RubyCParser.Pir_inlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#pir_expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPir_expression_list(RubyCParser.Pir_expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(RubyCParser.Function_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#function_definition_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition_body(RubyCParser.Function_definition_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#trans_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrans_statement(RubyCParser.Trans_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#function_definition_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition_header(RubyCParser.Function_definition_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(RubyCParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#function_definition_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition_params(RubyCParser.Function_definition_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#function_definition_params_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition_params_list(RubyCParser.Function_definition_params_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#function_definition_param_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition_param_id(RubyCParser.Function_definition_param_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#new_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_statement(RubyCParser.New_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#remove_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemove_statement(RubyCParser.Remove_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(RubyCParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#validate_presence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidate_presence(RubyCParser.Validate_presenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#validate_num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidate_num(RubyCParser.Validate_numContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#cond_num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_num(RubyCParser.Cond_numContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#belong_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBelong_statement(RubyCParser.Belong_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(RubyCParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#save_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSave_statement(RubyCParser.Save_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(RubyCParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#function_call_param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_param_list(RubyCParser.Function_call_param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#function_call_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_params(RubyCParser.Function_call_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#function_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_param(RubyCParser.Function_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#function_unnamed_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_unnamed_param(RubyCParser.Function_unnamed_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#function_named_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_named_param(RubyCParser.Function_named_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#function_call_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_assignment(RubyCParser.Function_call_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#all_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_result(RubyCParser.All_resultContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#elsif_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsif_statement(RubyCParser.Elsif_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#if_elsif_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_elsif_statement(RubyCParser.If_elsif_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(RubyCParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#unless_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnless_statement(RubyCParser.Unless_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(RubyCParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(RubyCParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#init_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_expression(RubyCParser.Init_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#all_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_assignment(RubyCParser.All_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#for_init_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_init_list(RubyCParser.For_init_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#cond_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_expression(RubyCParser.Cond_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#loop_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_expression(RubyCParser.Loop_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#for_loop_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop_list(RubyCParser.For_loop_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#statement_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_body(RubyCParser.Statement_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#statement_expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_expression_list(RubyCParser.Statement_expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(RubyCParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#primary_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expr(RubyCParser.Primary_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#dynamic_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_assignment(RubyCParser.Dynamic_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#int_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_assignment(RubyCParser.Int_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#int_plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_plus(RubyCParser.Int_plusContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#int_minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_minus(RubyCParser.Int_minusContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#float_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_assignment(RubyCParser.Float_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#string_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_assignment(RubyCParser.String_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#initial_array_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitial_array_assignment(RubyCParser.Initial_array_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#array_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_assignment(RubyCParser.Array_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#array_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_definition(RubyCParser.Array_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#array_definition_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_definition_elements(RubyCParser.Array_definition_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#array_selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_selector(RubyCParser.Array_selectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#dynamic_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_result(RubyCParser.Dynamic_resultContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#dynamic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic(RubyCParser.DynamicContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#int_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_result(RubyCParser.Int_resultContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#float_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_result(RubyCParser.Float_resultContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#string_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_result(RubyCParser.String_resultContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#comparison_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_list(RubyCParser.Comparison_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(RubyCParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#comp_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_var(RubyCParser.Comp_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue(RubyCParser.LvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#rvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRvalue(RubyCParser.RvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#break_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_expression(RubyCParser.Break_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#literal_t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_t(RubyCParser.Literal_tContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#float_t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_t(RubyCParser.Float_tContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#int_t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_t(RubyCParser.Int_tContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#bool_t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_t(RubyCParser.Bool_tContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#nil_t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNil_t(RubyCParser.Nil_tContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(RubyCParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#id_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_global(RubyCParser.Id_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#id_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_function(RubyCParser.Id_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#terminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminator(RubyCParser.TerminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#else_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_token(RubyCParser.Else_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link RubyCParser#crlf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrlf(RubyCParser.CrlfContext ctx);
}