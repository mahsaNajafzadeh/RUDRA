

package Concurrency;

import Commands.Command;
import Invariant.Invariant;
import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Context;
import com.microsoft.z3.Expr;
import model.Database;
import model.State;

import java.util.HashMap;
import java.util.Set;

public class Uniquness implements concurrencyControl {
    Command c1;
    Command c2;
    HashMap<String, Expr> state0;
    HashMap<String, Expr> stateCC;
    public Set<String> keys;

    String tb;
    Expr var;
    String name;


    public Uniquness(String name, String tb) {

        this.tb = tb;
        this.name = name;
    }

    public Uniquness(String name, String tb, Expr var) {

        this.tb = tb;
        this.name = name;
        this.var = var;
    }


    public Uniquness(Command c1, Command c2, HashMap<String, Expr> state0) {

        this.c1 = c1;
        this.c2 = c2;
        this.state0 = state0;

    }

    public Uniquness(Command c1, Command c2, HashMap<String, Expr> state0, Set<String> keys) {

        this.c1 = c1;
        this.c2 = c2;
        this.state0 = state0;
        this.keys = keys;

    }

    @Override
    public Invariant getInvariant() {
        return null;
    }

    @Override
    public Command getCommand1() {
        return this.c1;
    }

    @Override
    public Command getCommand2() {
        return this.c2;
    }

    @Override
    public void setCommand1(Command c1) {
        this.c1 = c1;
    }

    @Override
    public void setCommand2(Command c2) {
        this.c2 = c2;
    }

    @Override
    public HashMap<String, Expr> getDelta() {
        return state0;
    }

    @Override
    public HashMap<String, Expr> getDeltaCC(Context ctx, HashMap<String, Expr> state) {

        HashMap<String, Expr> hashMap1 = new HashMap();
        hashMap1 = (HashMap) state.clone();
        for (String v : keys) {
            hashMap1.put(v, state0.get(v));
        }
        this.stateCC = hashMap1;
        return this.stateCC;
    }

    @Override
    public Set<String> getKeys() {
        return this.keys;
    }

    @Override
    public BoolExpr cc(Context ctx, Database db) {

        State state = db.getTable(tb);
        BoolExpr cc = ctx.mkTrue();
        System.out.println(var);
        for (Expr e : state.columns.get(name).values()) {
            if (e.getId() != var.getId())
                cc = ctx.mkAnd(cc, (BoolExpr) ctx.mkNot(ctx.mkEq(e, var)));
        }
        return cc;
    }

    @Override
    public String getType() {
        return "UQ";
    }


}


