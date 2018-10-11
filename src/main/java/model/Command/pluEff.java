

package model.Command;

import com.microsoft.z3.ArithExpr;
import com.microsoft.z3.Context;
import com.microsoft.z3.Expr;
import com.microsoft.z3.IntExpr;
import model.Database;
import model.State;
import model.effect;

import java.util.HashMap;
import java.util.Map;


public class pluEff implements effect {

    String key;
    String val;
    String table;
    String obj;
    Expr val_expr;
    Context ctx;

    public pluEff(String key, String val, String obj, String table, Context ctx) {
        this.key = key;
        this.val = val;
        this.obj = obj;
        this.table = table;
        this.ctx = ctx;

        this.val_expr = ctx.mkConst(val, ctx.mkIntSort());
        System.out.println("here");

    }

    @Override
    public State applyEffect(State state) {

        State state2 = new State();
        state2 = (State) state.copy();
        return state2;
    }

    public Database applyEffect(Database db, Context ctx) {

        State state = db.getTable(table);
        if (!state.columns.containsKey(obj)) {
            Map<String, Expr> map = new HashMap<>();
            state.columns.put(obj, map);
        }

        if (!state.columns.get(obj).containsKey(key)) {
            Map<String, Expr> map = state.columns.get(obj);
            Expr x = ctx.mkConst(obj, ctx.mkIntSort());
            state.putExpr(key, x);
            map.put(key, x);
            state.columns.put(obj, map);
        }

        Expr e = state.columns.get(obj).get(key);
        Expr res = ctx.mkAdd(new ArithExpr[]{(IntExpr) e, (IntExpr) val_expr});
        Map<String, Expr> map = state.columns.get(obj);
        map.put(key, res);
        db.getTable(table).columns.put(obj, map);
        return db;
    }


    @Override
    public effect copy() {
        return null;
    }

    @Override
    public effect copy(Object[] params) {

        String key1 = (String) params[0];
        String val1 = (String) params[1];
        pluEff f = new pluEff(key1, val1, obj, table, ctx);
        return f;
    }
}

