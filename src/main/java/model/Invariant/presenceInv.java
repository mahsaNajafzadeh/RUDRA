

package model.Invariant;

import com.microsoft.z3.*;
import model.Database;
import model.State;

import java.util.Map;

public class presenceInv implements Invariant {

    public String table1;
    public String table2;
    public Sort key1;
    public Sort key2;
    public String type;


    public presenceInv(Sort key1, Sort key2, String table1, String table2) {
        this.table1 = table1;
        this.table2 = table2;
        this.key1 = key1;
        this.key2 = key2;
        this.type = "RL";
    }


    @Override
    public BoolExpr getInv(Context ctx, Database db) {

        State state = db.getTable(table1);
        Expr item1 = ctx.mkConst(key2.getName(), key2);
        Expr item2 = ctx.mkConst(key1.getName(), key1);
        Expr[] argOwner = new Expr[2];
        argOwner[0] = item1;
        argOwner[1] = item2;
        TupleSort t_sort = ctx.mkTupleSort(ctx.mkSymbol("mk_relation_tuple"), // name of
                new Symbol[]{key2.getName(), key1.getName()}, // names
                new Sort[]{key2, key1});

        if (db.getTable(table2) == null) {
            System.out.println(table1);
            System.out.println(table2);
            System.out.println("ERROR: incorrect model:  missing table");
            throw new IllegalStateException();
        }

        Sort[] args = new Sort[2];
        args[0] = key1;
        args[1] = key2;
        //setting names
        Symbol[] names = new Symbol[2];
        names[0] = key1.getName();
        names[1] = key2.getName();


        BoolExpr own = ctx.mkTrue();

        if (state.columns1.containsKey(table2)) {
            for (Map.Entry<String, Expr> e : state.columns.get(table2).entrySet()) {
                BoolExpr eee1 = (BoolExpr) ctx.mkSetMembership(e.getValue(), state.getExpr(table2));
                BoolExpr eee2 = (BoolExpr) ctx.mkSetMembership(e.getValue(), db.getTable(table2).getExpr(table2));
                BoolExpr imp = ctx.mkImplies(eee1, eee2);
                own = ctx.mkAnd(own, imp);
            }
        }
        return own;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getvar0() {
        return table2;
    }

    @Override
    public String getTable() {
        return table1;
    }

}
