

package model.Invariant;

import com.microsoft.z3.*;
import model.Database;
import model.Invariant.Invariant;
import model.State;

public class boundInv implements Invariant {

    public String var;
    public IntExpr bound;
    public String type;
    public String table;

    public boundInv(String var, IntExpr bound, String type, String table) {

        this.var = var;
        this.bound = bound;
        this.type = type;
        this.table = table;
    }

    @Override
    public BoolExpr getInv(Context ctx, Database db) {

        State state = db.getTable(table);
        BoolExpr capacityBound = ctx.mkTrue();
        for (Expr e : state.columns.get(var).values()) {
            switch (type) {
                case "GE":
                    capacityBound = ctx.mkAnd(capacityBound, ctx.mkGe((IntExpr) e, bound));
                    break;
                case "GT":
                    capacityBound = ctx.mkAnd(capacityBound, ctx.mkGt((IntExpr) e, bound));
                    break;
                case "LE":
                    capacityBound = ctx.mkAnd(capacityBound, ctx.mkLe((IntExpr) e, bound));
                    break;
                case "LT":
                    capacityBound = ctx.mkAnd(capacityBound, ctx.mkLt((IntExpr) e, bound));
                    break;
                default:
                    break;
            }
        }
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
