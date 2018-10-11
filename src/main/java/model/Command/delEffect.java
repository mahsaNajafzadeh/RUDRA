

package model.Command;

import com.microsoft.z3.*;
import model.Database;
import model.State;
import model.effect;

import java.util.Map;
import java.util.Random;

public class delEffect implements effect {


    Random r = new Random();
    int index;
    int index1;
    String table;


    public delEffect(String table) {
        this.table = table;
        index = r.nextInt(10);
        index1 = r.nextInt(10);
    }

    @Override
    public State applyEffect(State state) {
        return null;
    }

    @Override
    public Database applyEffect(Database db, Context ctx) {

        State state = db.getTable(table);

        Expr item = ctx.mkConst(table + index, state.getSort(table));
        Expr val = ctx.mkSetDel(state.getExpr(state.getname()), item);

        state.putExpr(state.getname(), val);

        if (state.dependent != null) {
            State state1 = db.getTable(state.dependent);
            Sort sort2 = state1.getSort(state1.getname());
            Sort sort1 = state.getSort(state.getname());
            Expr argOwner[] = new Expr[2];
            argOwner[0] = ctx.mkConst(state.getname() + index1, state.getSort(state.getname()));
            argOwner[1] = ctx.mkConst(state1.getname() + index1, state1.getSort(state1.getname()));

            TupleSort t_sort = ctx.mkTupleSort(ctx.mkSymbol("mk_relation_tuple"), // name of
                    new Symbol[]{sort1.getName(), sort2.getName()}, // names
                    new Sort[]{sort1, sort2});

            if (state1.columns1.containsKey(state.getname())) {
                for (Map.Entry<Expr, Expr> e : state1.columns1.get(state.getname()).entrySet()) {

                    BoolExpr expr = ctx.mkEq(e.getValue(), item);
                    Expr ee = ctx.mkITE(expr, ctx.mkSetDel(state1.getExpr(state.getname()), e.getValue()),
                            state1.getExpr(state.getname()));

                    db.getTable(state1.getname()).putExpr(state.getname(), ee);

                }

            }

        }

        db.getTable(table).putExpr(table, val);
        return db;
    }

    @Override
    public effect copy() {

        delEffect f = new delEffect(table);
        return f;
    }

    @Override
    public effect copy(Object[] params) {

        delEffect f = new delEffect(table);
        return f;
    }
}
