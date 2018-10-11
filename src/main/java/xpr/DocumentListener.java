
package xpr;


import Concurrency.escrow;
import com.microsoft.z3.*;
import model.*;
import model.Command.*;
import model.Invariant.Invariant;
import model.Invariant.boundInv;
import model.Invariant.checkFieldInv;
import model.Invariant.presenceInv;
import model.precondition.Precondition_numeric;
import org.antlr.v4.runtime.RuleContext;

import java.util.*;

public class DocumentListener extends XPRBaseListener {


    private List<BoolExpr> facts = new ArrayList<>();
    private final Context z3ctx;

    private Database db;
    Random r;
    public Sort Id;
    private State rootState;


    public DocumentListener(Context z3ctx, Database db) {

        this.z3ctx = z3ctx;
        this.db = db;
        r = new Random();
    }


    @Override
    public void enterProg(XPRParser.ProgContext ctx) {

        ctx.class_definition().forEach(this::parseClass);
    }

    public void parseClass(XPRParser.Class_definitionContext ctx) {

        String name_state = ctx.class_declaration().class_name().getText().toLowerCase();
        State rootState = db.getTable(name_state);
        if (rootState == null) {
            rootState = new State();
            db.addState(name_state, rootState);

        }
        rootState.putname(name_state);
        Id = z3ctx.mkUninterpretedSort(name_state + "Id");
        SetSort ss = z3ctx.mkSetSort(Id);
        Expr set = z3ctx.mkConst(name_state + "_set", ss);
        db.ids.put(name_state, set);
        initilize(name_state, rootState);
        for (XPRParser.ExpressionContext ctx1 : ctx.class_body().expression()) {
            parseLine(ctx1, rootState);
        }
    }

    public void initilize(String name_state, State rootState) {

        Sort sort = z3ctx.mkUninterpretedSort(z3ctx.mkSymbol(name_state));
        rootState.putSort(name_state, sort);
        SetSort ss = z3ctx.mkSetSort(sort);
        Expr item_set = z3ctx.mkConst(name_state, ss);
        rootState.putExpr(name_state, item_set);
    }

    private void parseLine(XPRParser.ExpressionContext ctx, State rootState) {

        //log.debug("Parsing line: {}", ctx.getText());model
        if (ctx.belong_statement() != null) parseBelong(ctx.belong_statement(), rootState);
        if (ctx.has_many_statement() != null) parseHasMany(ctx.has_many_statement(), rootState);

        if (ctx.validate_presence() != null) parseValidPres(ctx.validate_presence(), rootState);
        if (ctx.validate_num() != null) parseValidNum(ctx.validate_num(), rootState);
        if (ctx.function_definition() != null) parseFunction(ctx.function_definition(), rootState);
    }

    public void parseHasMany(XPRParser.Has_many_statementContext ctx, State rootState) {

        if (ctx.del_expr() != null) {
            String str = ctx.lvalue().getText();
            String table = str.substring(1, str.length() - 1);
            rootState.dependent = table;
        }
    }

    public void parseBelong(XPRParser.Belong_statementContext ctx, State rootState) {

        String name2 = ctx.lvalue().getText().substring(1);
        rootState.belongs.add(name2);
        String name_state = rootState.getname();
        Sort sort1 = rootState.getSort(name_state);
        Sort sort2 = z3ctx.mkUninterpretedSort(z3ctx.mkSymbol(name2));

        TupleSort t_sort = z3ctx.mkTupleSort(z3ctx.mkSymbol("mk_relation_tuple"), // name of
                new Symbol[]{sort2.getName(), sort1.getName()}, // names
                new Sort[]{sort2, sort1});

        SetSort sort = z3ctx.mkSetSort(sort2);
        Expr field_set = z3ctx.mkConst(name2, sort);
        rootState.putExpr(name2, field_set);

        Expr relation1 = z3ctx.mkConst(name2 + "_relation", sort);
        rootState.putExpr(name2, relation1);

        Relation rel = new Relation(sort1, sort2, relation1);
        rootState.putRelation(name2, rel);

    }

    // we assume that all association rules come before validations
    public void parseValidPres(XPRParser.Validate_presenceContext ctx, State rootState) {

        String name_state = rootState.getname();
        for (int i = 0; i < ctx.ID_GLOBAL().size(); i++) {
            String name = ctx.ID_GLOBAL().get(i).getText().substring(1);

            Sort sort1 = rootState.getSort(name_state);
            // this field is related to one of association rules
            if (rootState.getRelation(name) != null) {
                Sort sort2 = z3ctx.mkUninterpretedSort(z3ctx.mkSymbol(name));


                Expr item1 = z3ctx.mkConst(sort2.getName(), sort2);
                Expr item2 = z3ctx.mkConst(sort1.getName(), sort1);

                Expr[] argOwner = new Expr[2];
                argOwner[0] = item1;
                argOwner[1] = item2;

                Invariant inv = new presenceInv(sort1, sort2, name_state, name);
                db.addInv(inv);
            } else {
                Sort sort2 = z3ctx.mkUninterpretedSort(z3ctx.mkSymbol(name));
                if (rootState.getSort(name) == null) {
                    rootState.addSort(sort2);
                }
                TupleSort t_sort = z3ctx.mkTupleSort(z3ctx.mkSymbol("mk_field_tuple"), // name of
                        new Symbol[]{sort2.getName(), sort1.getName()}, // names
                        new Sort[]{sort2, sort1});

                SetSort sortRel = z3ctx.mkSetSort(t_sort);
                Expr relation = z3ctx.mkConst(name + "_field", sortRel);
                rootState.putSort(name, sort2);
                rootState.addFileds(name);

                rootState.putSort(rootState + name, sortRel);

                SetSort ss = z3ctx.mkSetSort(sort2);
                Expr field_set = z3ctx.mkConst(name, ss);
                rootState.putExpr(name, field_set);
                rootState.putExpr(name_state + name, relation);
                Invariant inv = new checkFieldInv(sort1, sort2, name_state, name);
                db.addInv(inv);
            }
        }
    }

    // we assume that all association rules come before validations
    public void parseValidNum(XPRParser.Validate_numContext ctx, State rootState) {

        String name = ctx.ID_GLOBAL().getText().substring(1);
        Expr val = rootState.getExpr(name);
        if (val == null) {
            val = z3ctx.mkConst(name, z3ctx.mkIntSort());
            rootState.putExpr(name, z3ctx.mkConst(name, z3ctx.mkIntSort()));
        }
        if (!rootState.columns.containsKey(name)) {
            HashMap<String, Expr> field = new HashMap();
            field.put(rootState.getname(), val);
            rootState.columns.put(name, field);
        }
        IntExpr bound = null;
        Invariant inv = null;

        if (ctx.all_result().int_result() != null) {
            bound = z3ctx.mkInt(ctx.all_result().int_result().int_t().getText());

        }
        if (ctx.all_result().dynamic_result() != null)
            bound = (IntExpr) z3ctx.mkConst(ctx.all_result().dynamic_result().dynamic().id().ID().getText(), z3ctx.mkIntSort());

        if (ctx.cond_num().VGE() != null)
            inv = new boundInv(name, bound, "GE", rootState.getname());
        else if (ctx.cond_num().VGT() != null)
            inv = new boundInv(name, bound, "GT", rootState.getname());
        else if (ctx.cond_num().VLE() != null)
            inv = new boundInv(name, bound, "LE", rootState.getname());
        else if (ctx.cond_num().VLT() != null)
            inv = new boundInv(name, bound, "LT", rootState.getname());
        db.addInv(inv);

    }


    public void parseFunction(XPRParser.Function_definitionContext ctx, State rootState) {

        String name_state = rootState.getname();
        String fname = ctx.function_definition_header().function_name().getText();
        Operations OP = new Operations(fname);
        if (fname.contains("?")) {
            parseQueryFunctions(ctx, rootState, OP);
            return;
        }
        List<effect> assign = new ArrayList<>();
        List<effect> neweff = new ArrayList<>();
        RuleContext rule = ctx.function_definition_header().function_definition_params();
        String obj = null;
        List<String> params = new ArrayList<>();
        if (rule != null) {
            obj = ((XPRParser.Function_definition_paramsContext) rule).id().ID().getText();
            for (int i = 0; i < ((XPRParser.Function_definition_paramsContext) rule).function_definition_param_id().size(); i++) {
                String st = ((XPRParser.Function_definition_paramsContext) rule).function_definition_param_id().get(i).id().ID().getText();
                params.add(st);
            }

        }

        for (int i = 0; i < ctx.function_definition_body().size(); i++) {
            RuleContext rule6 = ctx.function_definition_body().get(i).return_statement();
            if (rule6 != null) {
                if (((XPRParser.Return_statementContext) rule6).all_result().expression().unless_statement().function_call() != null) {
                    RuleContext ctx1 = ((XPRParser.Return_statementContext) rule6).all_result().expression().unless_statement().function_call();
                    OP.addPrecondition(((XPRParser.Function_callContext) ctx1).name.getText(), rootState.getname());
                }

            }
            RuleContext rule1 = ctx.function_definition_body().get(i).assignment();

            if (rule1 != null)
                assign.add(parseAssignment(ctx, (XPRParser.AssignmentContext) rule1, OP, rootState, params));

            RuleContext rule2 = ctx.function_definition_body().get(i).new_statement();
            if (rule2 != null) {
                effect e = new newEffect(name_state);
                neweff.add(e);
            }

            RuleContext rule3 = ctx.function_definition_body().get(i).remove_statement();
            if (rule3 != null) {
                effect e = new delEffect(name_state);
                OP.addEffect(e);
            }

            for (effect nas : neweff) {
                OP.addEffect(nas);
            }
            RuleContext rule5 = ctx.function_definition_body().get(i).trans_statement();
            if (rule5 != null) {
                for (XPRParser.Function_definition_bodyContext ctx1 : ((XPRParser.Trans_statementContext) rule5).function_definition_body()) {
                    parseTrans(ctx1, rootState, OP);
                }

            }
            RuleContext rule7 = ctx.function_definition_body().get(i).function_inline_call();
            if (rule7 != null) {

                parseFunction_call(((XPRParser.Function_inline_callContext) rule7).function_call(), rootState, OP);
            }

        }
        rootState.functions.put(fname, OP);
        db.addOp(OP);
    }

    public void parseFunction_call(XPRParser.Function_callContext ctx, State rootState, Operations OP) {


        if (ctx.function_name().getText().equals("demarcation_presence")) {
            String table = ctx.params.function_call_params().function_param().get(0).getText();
            int index = r.nextInt(10);
            effect e = new newEffect(table, index);
            OP.index = index;
            OP.addEffect(e);
        }

        if (ctx.function_name().getText().equals("acquire_escrow")) {
            String name = ctx.params.function_call_params().function_param().get(0).getText();
            String obj = ctx.params.function_call_params().function_param().get(1).getText();
            String bound = ctx.params.function_call_params().function_param().get(2).getText();
            String relation = ctx.params.function_call_params().function_param().get(3).getText();


            if (!rootState.columns.containsKey("escrow")) {
                HashMap<String, Expr> field = new HashMap();
                IntExpr val = (IntExpr) z3ctx.mkConst("escrow", z3ctx.mkIntSort());
                if (relation.equals("GE"))
                    val = (IntExpr) z3ctx.mkAdd(val, z3ctx.mkIntConst(bound));
                else
                    val = (IntExpr) z3ctx.mkSub(z3ctx.mkIntConst(bound), val);
                field.put(name, val);
                rootState.columns.put("escrow", field);
                OP.addCC(((XPRParser.Function_callContext) ctx).name.getText(), rootState.getname());
                escrow cc = new escrow(rootState.getname(), name, obj, val, relation);
                rootState.ConcurrencyControls.put(((XPRParser.Function_callContext) ctx).name.getText(), cc);
            }
        }


    }

    public void parseQueryFunctions(XPRParser.Function_definitionContext ctx, State rootState, Operation OP) {


        for (int i = 0; i < ctx.function_definition_body().size(); i++) {
            RuleContext rule1 = ctx.function_definition_body().get(i).if_statement();
            if (rule1 != null) {
                String left = ((XPRParser.If_statementContext) rule1).cond_expression().comparison_list().comparison().left.getText();

                String op = ((XPRParser.If_statementContext) rule1).cond_expression().comparison_list().comparison().op.getText();

                Expr l = z3ctx.mkConst(left, z3ctx.mkIntSort());
                IntExpr r = null;

                if (((XPRParser.If_statementContext) rule1).cond_expression().comparison_list().comparison().right.all_result().int_result() != null)
                    r = z3ctx.mkInt(((XPRParser.If_statementContext) rule1).cond_expression().comparison_list().comparison().right.all_result().int_result().int_t().getText());

                else if (((XPRParser.If_statementContext) rule1).cond_expression().comparison_list().comparison().right.all_result().dynamic_result() != null) {
                    String str = ((XPRParser.If_statementContext) rule1).cond_expression().comparison_list().comparison().right.all_result().dynamic_result().dynamic().id().getText();
                    if (str.contains("."))
                        r = (IntExpr) z3ctx.mkConst(str.split("\\.")[1], z3ctx.mkIntSort());
                    else
                        r = (IntExpr) z3ctx.mkConst(str, z3ctx.mkIntSort());
                }
                Precondition_numeric pre = new Precondition_numeric(left, r, op);
                String name = ctx.function_definition_header().function_name().getText();

                rootState.preconditions.put(name, pre);
            }
        }

    }


    public void parseTrans(XPRParser.Function_definition_bodyContext ctx1, State rootState, Operations OP) {

        RuleContext rule1 = ctx1.function_inline_call();
        if (rule1 != null) {
            String name = (((XPRParser.Function_inline_callContext) rule1).function_call().function_name().getText());
            Operations o = rootState.functions.get(name);
            for (effect e : o.effects) {
                Object params[] = null;

                if (ctx1.function_inline_call().function_call().params.function_call_params().function_param() != null) {
                    int size = ctx1.function_inline_call().function_call().params.function_call_params().function_param().size();
                    params = new Object[size];
                    for (int i = 0; i < size; i++) {
                        params[i] = ctx1.function_inline_call().function_call().params.function_call_params().function_param().get(i).getText();

                    }

                }
                effect e1 = e.copy(params);
                OP.addEffect(e1);
            }

        }

    }

    public effect parseAssignment(XPRParser.Function_definitionContext ctx,
                                  XPRParser.AssignmentContext rule, Operations OP, State rootState, List<String> params) {

        effect e = null;
        String name_state = rootState.getname();
        if (rule.primary_expr().int_result() != null) {
            String vname = rule.lvalue().id().ID().getText();
            Expr val1 = z3ctx.mkIntConst(rule.primary_expr().int_result().int_t().getText());

            rootState.putExpr(vname, z3ctx.mkIntConst(vname));

            e = new assignEffect(vname, val1);

            // OP.addEffect(e);
        }

        if (rule.primary_expr().int_plus() != null) {

            String vname = rule.lvalue().getText();
            String field = rule.lvalue().id().ID().getText();
            String key = vname.split("\\.")[0];


            String amount = null;
            if (rule.primary_expr().int_plus().int_result() != null) {
                amount = rule.primary_expr().int_plus().int_result().int_t().getText();
            }

            if (rule.primary_expr().int_plus().dynamic_result() != null) {
                String dynamic = rule.primary_expr().int_plus().dynamic_result().dynamic().id().ID().getText();
                int i;
                amount = dynamic;

            }
            e = new pluEff(key, amount, field, name_state, z3ctx);

        }
        if (rule.primary_expr().int_minus() != null) {

            String vname = rule.lvalue().getText();
            String field = rule.lvalue().id().ID().getText();
            String key = vname.split("\\.")[0];


            String amount = null;
            if (rule.primary_expr().int_minus().int_result() != null) {
                amount = rule.primary_expr().int_minus().int_result().int_t().getText();
            }

            if (rule.primary_expr().int_minus().dynamic_result() != null) {
                String dynamic = rule.primary_expr().int_minus().dynamic_result().dynamic().id().ID().getText();
                amount = dynamic;

            }

            e = new minusEffect(key, amount, field, name_state, z3ctx);
            OP.addEffect(e);
        }

        if (rule.primary_expr().new_statement() != null) {
            if (OP.index == -1) {
                e = new newEffect(name_state);

            } else {
                e = new newEffect(name_state, OP.index);
            }
        }

        if (rule.primary_expr().function_call() != null) {

            if (rule.primary_expr().function_call().function_name().getText().contains(".")) {
                String table2 = rule.primary_expr().function_call().function_name().getText().split("\\.")[0];
                String fname = rule.primary_expr().function_call().function_name().getText().split("\\.")[1];
                if (fname == "find") {
                    String key = rule.primary_expr().function_call().params.function_call_params().function_param().get(0).getText();
                    Sort sort1 = z3ctx.mkUninterpretedSort(z3ctx.mkSymbol(table2));
                    Expr item = z3ctx.mkConst(key, sort1);
                    if (table2 == "self") {

                    } else {
                        Expr ee = z3ctx.mkSetMembership(db.getTable(table2).getExpr(table2), item);


                    }

                }

            }
        }

        return e;
    }
}

