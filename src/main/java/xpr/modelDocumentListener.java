

package xpr;

import com.microsoft.z3.*;
import model.*;
import model.Invariant.EQInv;
import model.Invariant.Invariant;
import model.Invariant.presenceInv;
import model.Invariant.uniqueInv;
import org.antlr.v4.runtime.RuleContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class modelDocumentListener extends modelBaseListener {

    private List<BoolExpr> facts = new ArrayList<>();
    private final Context z3ctx;
    private Database db;
    Random r;
    public Sort Id;
    private State rootState;

    public modelDocumentListener(Context z3ctx, Database db) {

        this.z3ctx = z3ctx;
        this.db = db;
        r = new Random();
    }

    @Override
    public void enterProg(modelParser.ProgContext ctx) {

        ctx.class_definition().forEach(this::parseClass);
    }

    public void parseClass(modelParser.Class_definitionContext ctx) {

        String name_state = ctx.class_declaration().class_name().getText().toLowerCase();
        State rootState = db.getTable(name_state);
        //  initilize(name_state, rootState);
        for (modelParser.ExpressionContext ctx1 : ctx.class_body().expression()) {
            parseLine(ctx1, rootState);
        }
    }


    private void parseLine(modelParser.ExpressionContext ctx, State rootState) {
        //log.debug("Parsing line: {}", ctx.getText());model

        if (ctx.has_one_statement() != null) parseOne(ctx.has_one_statement(), rootState);
        if (ctx.has_many_statement() != null) parseMany(ctx.has_many_statement(), rootState);
        if (ctx.belong_statement() != null) parseBelong(ctx.belong_statement(), rootState);
        if (ctx.validate_statement() != null) parseValidate(ctx.validate_statement(), rootState);
        if (ctx.validate_u() != null) parseUnique(ctx.validate_u(), rootState);
        if (ctx.validate_presence() != null) parseValidPres(ctx.validate_presence(), rootState);
        if (ctx.validates_associated() != null) parseAssociate(ctx.validates_associated(), rootState);
        if (ctx.validate_num() != null) parseValidNum(ctx.validate_num(), rootState);
        if (ctx.validate_function() != null) parseValidFunction(ctx.validate_function(), rootState);
        //    if (ctx.function_definition() != null) parseFunction(ctx.function_definition(), rootState);
        if (ctx.function_definition() != null) parseFunction(ctx.function_definition(), rootState);

    }

    public void parseValidFunction(modelParser.Validate_functionContext ctx, State rootState) {

        String name = ctx.ID_GLOBAL().getText().substring(1);
        rootState.validations.put(name, new Invariant() {
            @Override
            public BoolExpr getInv(Context ctx, Database db) {
                return null;
            }

            @Override
            public String getType() {
                return null;
            }

            @Override
            public String getvar0() {
                return null;
            }

            @Override
            public String getTable() {
                return null;
            }
        });

    }

    public void parseFunction(modelParser.Function_definitionContext ctx, State rootState) {

        String name = ctx.function_definition_header().function_name().id_function().getText();
        if (rootState.validations.containsKey(name)) {
            for (modelParser.Function_definition_bodyContext rule : ctx.function_definition_body()) {
                if (rule.set_statement() != null) {
                    if (rule.set_statement().MINUS() != null) {
                        if (rule.set_statement().EMPTY() != null) {

                            String var1 = rule.set_statement().id0().ID().getText();
                            String var2 = rule.set_statement().id1().ID().getText();

                            Expr val1 = rootState.getExpr(var1);
                            Expr val2 = rootState.getExpr(var2);
                            Sort sort1 = z3ctx.mkUninterpretedSort(z3ctx.mkSymbol(var1));
                            //    Sort sort2 = z3ctx.mkUninterpretedSort(z3ctx.mkSymbol(var2));
                            rootState.putSort(var1, sort1);
                            rootState.putSort(var2, sort1);
                            if (val1 == null) {

                                val1 = z3ctx.mkConst(name, z3ctx.mkSetSort(sort1));
                                rootState.putExpr(var1, val1);
                            }

                            if (val2 == null) {

                                val2 = z3ctx.mkConst(name, z3ctx.mkSetSort(sort1));
                                rootState.putExpr(var2, val2);
                            }

                            if (!rootState.columns.containsKey(var1)) {
                                HashMap<String, Expr> field = new HashMap();
                                field.put(rootState.getname(), val1);
                                rootState.columns.put(var1, field);
                            }
                            if (!rootState.columns.containsKey(var1)) {
                                HashMap<String, Expr> field = new HashMap();
                                field.put(rootState.getname(), val2);
                                rootState.columns.put(var2, field);
                            }


                            EQInv inv = new EQInv(val1, val2, rootState.getname(), sort1);
                            db.addInv(inv);
                        }
                    }
                }

            }

        }
    }

    public void parseMany(modelParser.Has_many_statementContext ctx, State rootState) {

        String id = ctx.ID_GLOBAL().getText().substring(1);
        if (ctx.depend_st() != null) {
            if (ctx.depend_st().NULLIFY() != null)
                rootState.nullifies.add(id);
            else if (ctx.depend_st().DESTROY() != null) {
                rootState.dependencies.add(id);
            }
        }

    }

    public void parseOne(modelParser.Has_one_statementContext ctx, State rootState) {

        String id = ctx.ID_GLOBAL().getText().substring(1);
        if (ctx.depend_st() != null) {
            rootState.dependencies.add(id);
        }

    }

    // we assume that all association rules come before validations
    public void parseAssociate(modelParser.Validates_associatedContext ctx, State rootState) {
        String name_state = rootState.getname();
        for (int i = 0; i < ctx.id_global().size(); i++) {
            String name = ctx.id_global().get(i).getText().substring(1).toLowerCase();
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

            }
        }
    }


    public void parseUnique(modelParser.Validate_uContext ctx, State rootState) {

        for (modelParser.Id_globalContext id : ctx.id_global()) {
            String name = id.getText().substring(1);
            Expr val = rootState.getExpr(name);
            rootState.addFileds(name);
            if (val == null) {
                Sort sort = z3ctx.mkUninterpretedSort(z3ctx.mkSymbol(name));
                rootState.putSort(name, sort);
                //   rootState.addSort(sort);
                SetSort sorts = z3ctx.mkSetSort(sort);
                val = z3ctx.mkConst(name, sorts);
                rootState.putExpr(name, val);
            }
            if (!rootState.columns.containsKey(name)) {
                HashMap<String, Expr> field = new HashMap();
                // field.put(rootState.getname(), val);
                rootState.columns.put(name, field);
            }
            Invariant inv = new uniqueInv(name, rootState.getname());
            ;
            db.addInv(inv);

        }

    }

    public void parseValidate(modelParser.Validate_statementContext ctx, State rootState) {

        String name_state = rootState.getname();
        for (int i = 0; i < ctx.id_global().size(); i++) {
            String name = ctx.id_global().get(i).getText().substring(1);
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

                if (ctx.validate_unique() != null) {
                    Expr val = rootState.getExpr(name);
                    rootState.addFileds(name);
                    if (val == null) {
                        Sort sort = z3ctx.mkUninterpretedSort(z3ctx.mkSymbol(name));
                        rootState.putSort(name, sort);
                        //   rootState.addSort(sort);
                        SetSort sorts = z3ctx.mkSetSort(sort);
                        val = z3ctx.mkConst(name, sorts);
                        rootState.putExpr(name, val);
                    }
                    if (!rootState.columns.containsKey(name)) {
                        HashMap<String, Expr> field = new HashMap();
                        // field.put(rootState.getname(), val);
                        rootState.columns.put(name, field);
                    }
                    Invariant inv = new uniqueInv(name, rootState.getname());
                    ;
                    db.addInv(inv);


                }

            }
        }

    }

    public void parseBelong(modelParser.Belong_statementContext ctx, State rootState) {


        String name2 = ctx.lvalue().getText().substring(1).toLowerCase();
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

        rootState.putSort(name2, sort2);
        if (!rootState.columns.containsKey(name2)) {
            HashMap<String, Expr> field = new HashMap();
            // field.put(rootState.getname(), val);
            rootState.columns.put(name2, field);
        }

        //    State s = new State(name2, z3ctx);
        //    db.addState(name2, s);
    }

    // we assume that all association rules come before validations
    public void parseValidPres(modelParser.Validate_presenceContext ctx, State rootState) {
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
               /* Sort sort2 = z3ctx.mkUninterpretedSort(z3ctx.mkSymbol(name));
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
                db.addInv(inv); */

            }
        }


    }

    // we assume that all association rules come before validations
    public void parseValidNum(modelParser.Validate_numContext ctx, State rootState) {

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
        Invariant inv = new uniqueInv(name, rootState.getname());
        db.addInv(inv);
    }


}

