
package Invariant;

import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Context;
import com.microsoft.z3.Expr;

import java.util.HashMap;

public interface Invariant {
    String getName();

    BoolExpr getInvariant(Expr state, Context ctx);

    BoolExpr getInvariant(Context ctx, Expr... state);

    BoolExpr getInvariant(Context ctx, HashMap<String, Expr> state);

    BoolExpr getInvariant(Context ctx, String sym);


}
