

package xpr;

import com.microsoft.z3.*;
import model.*;
import model.Command.*;
import org.antlr.v4.runtime.RuleContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class adslDocumentListener extends adslBaseListener {

    private List<BoolExpr> facts = new ArrayList<>();
    private final Context z3ctx;

    private Database db;
    Random r;
    public Sort Id;
    private State rootState;


    public adslDocumentListener(Context z3ctx, Database db) {

        this.z3ctx = z3ctx;
        this.db = db;
        r = new Random();
    }


    @Override
    public void enterProg(adslParser.ProgContext ctx) {

        ctx.class_definition().forEach(this::parseClass);
    }

    public void parseClass(adslParser.Class_definitionContext ctx) {

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
        for (adslParser.Action_definitionContext ctx1 : ctx.class_body().action_definition()) {
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

    private void parseLine(adslParser.Action_definitionContext ctx, State rootState) {

        adslParser.Action_bodyContext ctx1 = ctx.action_body();
        String fname = ctx.action_declaration().action_name().getText();
        Operations OP = new Operations(fname);
        for (adslParser.ExpressionContext ctx2 : ctx1.expression()) {

            parseAction(ctx2, OP, rootState);
        }
        db.addOp(OP);
    }

    private void parseAction(adslParser.ExpressionContext ctx, Operations OP, State rootState) {


        if (ctx.assignment() != null) parseAssignment(ctx.assignment(), OP, rootState);
        if (ctx.delete_statement() != null) parseDelete(ctx.delete_statement(), OP, rootState);
        if (ctx.cc_statement() != null) parseCC(ctx.cc_statement(), OP, rootState);
    }

    public void parseCC(adslParser.Cc_statementContext ctx, Operations OP, State rootState) {

        RuleContext rule = ctx.cc_unique();
        if (rule != null) {
            String id = ((adslParser.Cc_uniqueContext) rule).ID().getText();
            rootState.unique.put(id, true);
        }


    }

    public void parseAssignment(adslParser.AssignmentContext ctx, Operations OP, State rootState) {

        if (ctx.primary_expr() != null) {
            if (ctx.primary_expr().create_statement() != null) {
                effect e = new newEffect(rootState.getname(), OP);
                OP.addEffect(e);
            }

            if (ctx.primary_expr().find_statement() != null) {
                effect e = new readEffect(rootState.getname());

                OP.addEffect(e);
            }

            if (ctx.primary_expr().id() != null) {
                effect e = new readEffect(rootState.getname());
                OP.addEffect(e);
            }
        }
    }

    public void parseDelete(adslParser.Delete_statementContext ctx, Operation OP, State rootState) {

        effect e = new delEffect(rootState.getname());
        OP.addEffect(e);
    }
}
