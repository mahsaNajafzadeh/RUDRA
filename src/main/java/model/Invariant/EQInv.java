

package model.Invariant;

import com.microsoft.z3.*;
import model.Database;
import model.State;

public class EQInv implements Invariant {

    public Expr s1;
    public Expr s2;
    public String table;
    public Sort sort;

    public EQInv(Expr s1, Expr s2, String table, Sort sort) {

        this.s1 = s1;
        this.s2 = s2;
        this.table = table;
        this.sort = sort;
    }

    @Override
    public BoolExpr getInv(Context ctx, Database db) {

        BoolExpr capacityBound = ctx.mkEq(s1, s2);
        return capacityBound;
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public String getvar0() {
        return null;
    }

    @Override
    public String getTable() {
        return null;
    }
}
