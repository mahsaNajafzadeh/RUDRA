
package Invariant;

import Test.database;
import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Context;
import com.microsoft.z3.Expr;

import java.util.HashMap;

public class InvariantImp implements Invariant {

    protected String symbol;
    protected String table;


    @Override
    public String getName() {
        return null;
    }

    @Override
    public BoolExpr getInvariant(Expr state, Context ctx) {
        return null;
    }

    @Override
    public BoolExpr getInvariant(Context ctx, Expr... state) {
        return null;
    }

    @Override
    public BoolExpr getInvariant(Context ctx, HashMap<String, Expr> state) {
        // Unique u=new Unique(symbol, expr);
        //return u.get(ctx, expr);
        return null;
    }

    @Override
    public BoolExpr getInvariant(Context ctx, String sym) {
        return null;
    }
}
