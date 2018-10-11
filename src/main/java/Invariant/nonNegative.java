

package Invariant;

import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Context;
import com.microsoft.z3.Expr;
import com.microsoft.z3.IntExpr;

import java.util.HashMap;

public class nonNegative extends InvariantImp {

    public nonNegative() {
    }


    public String getName() {
        return "Non-negative";
    }


    public BoolExpr getInvariant(Expr state, Context ctx) {
        return ctx.mkGe((IntExpr) state, ctx.mkInt(0));
    }


    @Override
    public BoolExpr getInvariant(Context ctx, HashMap<String, Expr> state) {

        //  Expr x=state.get("x");
        BoolExpr b = ctx.mkTrue();
        BoolExpr capacityBound = ctx.mkTrue();
        for (Expr e : state.values()) {
            capacityBound = ctx.mkAnd(b, ctx.mkGe((IntExpr) e, ctx.mkInt("0")));
            b = capacityBound;
        }
        return capacityBound;
    }


}
