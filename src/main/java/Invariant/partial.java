

package Invariant;

import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Context;
import com.microsoft.z3.Expr;
import com.microsoft.z3.IntExpr;

import java.util.HashMap;

public class partial extends InvariantImp {


    public String getName() {
        return "Partial";
    }


    public BoolExpr getInvariant(Context ctx, Expr[] state) {

        Expr x = state[0];
        Expr y = state[1];
        return ctx.mkGe((IntExpr) x, (IntExpr) y);
    }


    public BoolExpr getInvariant(Context ctx, HashMap<String, Expr> state) {

        Expr x = state.get("x");
        Expr y = state.get("y");
        return ctx.mkGe((IntExpr) x, (IntExpr) y);
    }


}
