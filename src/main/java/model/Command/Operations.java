

package model.Command;

import Concurrency.concurrencyControl;
import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Context;
import model.Database;
import model.State;
import model.effect;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Operations implements Operation {

    String name;
    State state;
    public List<String> pre;
    String table;
    public int index;
    String cc;
    public List<concurrencyControl> CCS;

    public Set<String> Uniques;
    public List<effect> effects;
    public List<String> args;


    public Operations() {

        this.effects = new ArrayList<>();
        this.pre = new ArrayList<>();
        this.CCS = new ArrayList<>();
        this.Uniques = new HashSet<>();
    }

    public Operations(String name) {

        this.name = name;
        this.effects = new ArrayList<>();
        this.index = -1;
        this.pre = new ArrayList<>();
        this.CCS = new ArrayList<>();
        this.Uniques = new HashSet<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addPrecondition(String pre, String table) {

        this.pre.add(pre);
        this.table = table;
    }

    @Override
    public void addCC(String cc, String table) {

        this.cc = cc;
        this.table = table;
    }

    @Override
    public BoolExpr applyPrecondition(Database db, Context ctx) {

        State s = db.getTable(table);
        BoolExpr expr = ctx.mkTrue();

        for (String p : pre) {

            System.out.println(s.preconditions);
            if (p != null && s.preconditions.containsKey(p))
                expr = ctx.mkAnd(expr, s.preconditions.get(p).applyPrecondition(ctx));
        }
        return expr;
    }

    @Override
    public BoolExpr applyCC(Database db, Context ctx) {

        State s = db.getTable(table);
        BoolExpr expr = ctx.mkTrue();

        if (cc != null && s.ConcurrencyControls.containsKey(cc))
            expr = s.ConcurrencyControls.get(cc).applyCC(db, ctx);
        return expr;
    }


    @Override
    public State applyEffect(State state) {

        State res = state.copy();
        for (effect e : effects) {
            res = e.applyEffect(res);
        }

        return res;

    }

    @Override
    public Database applyEffect(Database db, Context ctx) {

        Database res = db.copy();
        System.out.println(effects.size());
        for (effect e : effects) {
            res = e.applyEffect(res, ctx);
        }
        return res;
    }

    @Override
    public void putArguments(String args) {

    }


    @Override
    public void addEffect(effect e) {
        effects.add(e);
    }


    @Override
    public Operations copy() {

        Operations op = new Operations();

        for (effect f : effects) {
            effect e = f.copy();
            op.addEffect(e);
        }
        for (String p : pre) {
            op.pre.add(p);
        }

        for (concurrencyControl cc : CCS) {
            op.CCS.add(cc);
        }
        op.name = this.name;
        op.table = table;
        return op;
    }


}
