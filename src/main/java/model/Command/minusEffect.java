

package model.Command;

import com.microsoft.z3.*;
import model.Database;
import model.State;
import model.effect;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class minusEffect implements effect {

    String key;
    String val;
    String table;
    String obj;
    Expr key_expr;
    Expr val_expr;
    Context ctx;

    Random r = new Random();

    public minusEffect(String key, String val, String obj, String table, Context ctx) {

        this.key = key;
        this.val = val;
        this.obj = obj;
        this.table = table;
        this.ctx = ctx;
        this.val_expr = ctx.mkConst(val, ctx.mkIntSort());
    }

    @Override
    public State applyEffect(State state) {

        State state2 = new State();
        state2 = (State) state.copy();
        return state2;
    }

    @Override
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
        Expr res = ctx.mkSub(new ArithExpr[]{(IntExpr) e, (IntExpr) val_expr});
        Map<String, Expr> map = state.columns.get(obj);
        map.put(key, res);
        db.getTable(table).columns.put(obj, map);
        return db;

    }

    @Override
    public effect copy() {

        minusEffect f = new minusEffect(key, val + r.nextInt(10), obj, table, ctx);
        return f;
    }

    @Override
    public effect copy(Object[] params) {

        String key1 = (String) params[0];
        String val1 = (String) params[1];
        minusEffect f = new minusEffect(key1, val1, obj, table, ctx);
        return f;
    }

}

