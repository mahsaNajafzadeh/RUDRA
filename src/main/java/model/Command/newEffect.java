

package model.Command;

import Concurrency.Uniquness;
import com.microsoft.z3.*;
import model.Database;
import model.Relation;
import model.State;
import model.effect;

import java.util.*;

public class newEffect implements effect {

    Expr val;
    String name;
    int index;
    boolean cc;
    String prefix;
    Operations op;
    Random r = new Random();

    Boolean once;

    public newEffect() {
        index = r.nextInt(10);
    }

    public newEffect(String name) {
        this.name = name;
        index = r.nextInt(10);
        once = false;
    }

    public newEffect(String name, Operations OP) {

        this.name = name;
        index = r.nextInt(10);
        this.op = OP;
        once = false;
    }

    public newEffect(String name, int index) {

        this.name = name;
        this.index = index;
    }

    @Override
    public State applyEffect(State state) {

        State state2 = new State();
        state2 = (State) state.copy();
        state2.putExpr(name, val);
        return state2;
    }

    @Override
    public Database applyEffect(Database db, Context ctx) {

        State state = db.getTable(name);

        Expr new_item = ctx.mkConst(name + index, state.getSort(name));

        Expr val = ctx.mkSetAdd(state.getExpr(state.getname()), new_item);
        db.getTable(name).putExpr(name, val);

        for (Map.Entry<String, Relation> entry : state.getRelations().entrySet()) {
            Sort sort1 = entry.getValue().getType1();
            Sort sort2 = entry.getValue().getType2();
            Expr item2 = ctx.mkConst(entry.getKey() + index, sort2);
            Expr item1 = ctx.mkConst(name + index, sort1);
            Expr argOwner[] = new Expr[2];
            argOwner[0] = item2;
            argOwner[1] = item1;
            TupleSort t_sort = ctx.mkTupleSort(ctx.mkSymbol("mk_relation_tuple"), // name of
                    new Symbol[]{sort2.getName(), sort1.getName()}, // names
                    new Sort[]{sort2, sort1});
            db.getTable(name).putExpr(entry.getKey(), ctx.mkSetAdd(state.getExpr(entry.getKey()), item2));

            if (!state.columns1.containsKey(entry.getKey())) {
                Map<Expr, Expr> map = new HashMap<>();
                state.columns1.put(entry.getKey(), map);
            }
            if (!state.columns1.get(entry.getKey()).containsKey(item1)) {
                Map<Expr, Expr> map = state.columns1.get(entry.getKey());
                map.put(item1, item2);
                state.columns1.put(entry.getKey(), map);
            }

        }

        for (String key : state.columns.keySet()) {

            Sort sort1 = state.getSort(key);

            Expr new_field = ctx.mkConst(key + index, sort1);
            Map<String, Expr> map = state.columns.get(key);
            map.put(key + index, new_field);
            db.getTable(name).columns.put(key, map);

            if (!once & op.Uniques.contains(key)) {
                if (state.unique.containsKey(key)) {
                    Uniquness unique = new Uniquness(key, name, new_field);
                    op.CCS.add(unique);
                    state.unique.remove(key);
                }
                once = true;
            }

        }
        return db;

    }


    @Override
    public effect copy() {
        newEffect f = new newEffect(name, op);
        return f;
    }

    @Override
    public effect copy(Object[] params) {
        newEffect f = new newEffect(name, op);
        return f;
    }
}
