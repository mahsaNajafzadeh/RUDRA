

package Invariant;

import com.microsoft.z3.*;

import java.util.HashMap;

public class presence extends InvariantImp {

    public String table1;
    public String table2;
    public String key1;
    public String key2;


    public presence(String key1, String key2, String table1, String table2) {
        this.table1 = table1;
        this.table2 = table2;
        this.key1 = key1;
        this.key2 = key2;
    }

    public String getName() {
        return "presence";
    }


    public BoolExpr getInvariant(Context ctx, HashMap<String, Expr> state) {

        Expr item1 = ctx.mkConst(key1, ctx.mkUninterpretedSort(ctx.mkSymbol(key1)));
        Expr item2 = ctx.mkConst(key2, ctx.mkUninterpretedSort(ctx.mkSymbol(key2)));

        Expr[] argOwner = new Expr[2];
        argOwner[0] = item1;
        argOwner[1] = item2;

        TupleSort t_sort = ctx.mkTupleSort(ctx.mkSymbol("mk_relation_tuple"), // name of
                new Symbol[]{ctx.mkSymbol("first"), ctx.mkSymbol("second")}, // names
                new Sort[]{ctx.mkUninterpretedSort(ctx.mkSymbol(key1)), ctx.mkUninterpretedSort(ctx.mkSymbol(key2))});

        Expr owner = t_sort.mkDecl().apply(argOwner);
        Expr e1 = ctx.mkSetMembership(owner, state.get(table1));
        Expr e2 = ctx.mkSetMembership(item2, state.get(table2));
        BoolExpr owenrExist = ctx.mkImplies((BoolExpr) e1, (BoolExpr) e2);

        return owenrExist;
    }
}
