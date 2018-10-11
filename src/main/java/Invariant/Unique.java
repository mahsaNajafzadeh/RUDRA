

package Invariant;


import com.microsoft.z3.*;

import java.util.HashMap;
import java.util.Random;

public class Unique extends InvariantImp {

    public static int i = 0;
    public Random r;

    public String getName() {
        return "Unique";
    }


    public Unique(String symbol, String table) {

        this.symbol = symbol;
        this.table = table;
        r = new Random();

    }

    public BoolExpr getInvariant(Context ctx, HashMap<String, Expr> state) {

        Expr[] arg = new Expr[2];
        int index0 = r.nextInt(10);
        int index1 = index0 + 1;
        arg[0] = ctx.mkConst("id" + index0, ctx.mkUninterpretedSort(ctx.mkSymbol(symbol)));
        arg[1] = ctx.mkConst("id" + index1, ctx.mkUninterpretedSort(ctx.mkSymbol(symbol)));

        Sort[] set = new Sort[2];
        set[0] = ctx.mkUninterpretedSort(ctx.mkSymbol(this.symbol));
        set[1] = ctx.mkUninterpretedSort(ctx.mkSymbol(this.symbol));

        Symbol[] namess = new Symbol[2];
        namess[0] = ctx.mkSymbol("id" + index0);
        namess[1] = ctx.mkSymbol("id" + index1);

        System.out.println("statesss" + state.get(table));
        Expr e1 = (BoolExpr) ctx.mkSetMembership(arg[0], state.get(table));
        Expr e2 = (BoolExpr) ctx.mkSetMembership(arg[1], state.get(table));

        Expr body = ctx.mkImplies(ctx.mkAnd((BoolExpr) e1, (BoolExpr) e2), ctx.mkNot(ctx.mkEq(arg[0], arg[1])));
        BoolExpr mustUniqueee = ctx.mkForall(set, namess, body, 1, null, null,
                null, null);

        return mustUniqueee;

    }

}
