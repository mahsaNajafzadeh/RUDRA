
package model.Command;

import com.microsoft.z3.ArithExpr;
import com.microsoft.z3.Context;
import com.microsoft.z3.Expr;
import com.microsoft.z3.IntExpr;
import model.Database;
import model.State;
import model.effect;

import java.util.Map;
import java.util.Random;


public class addEffect implements effect {

    String key;
    Expr val;
    String table;
    String obj;
    int index;
    Random r = new Random();

    public addEffect(String key, Expr val, String obj, String table) {

        this.key = key;
        this.val = val;
        this.obj = obj;
        this.table = table;
        index = r.nextInt(10);
    }

    @Override
    public State applyEffect(State state) {

        State state2 = new State();
        state2 = (State) state.copy();
        state2.putExpr(key, val);
        return state2;
    }

    public Database applyEffect(Database db, Context ctx) {

        State state = db.getTable(table);
        Expr e = state.columns.get(key).get(obj);
        Expr res = ctx.mkAdd(new ArithExpr[]{(IntExpr) e, (IntExpr) val});

        Map<String, Expr> map = state.columns.get(key);
        map.put(obj, res);
        db.getTable(table).columns.put(key, map);
        return db;
    }


    @Override
    public effect copy() {

        addEffect f = new addEffect(key, val, table, obj);
        return f;
    }

    @Override
    public effect copy(Object[] params) {
        return null;
    }
}

