

package model.Invariant;

import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Context;
import com.microsoft.z3.Expr;
import model.Database;
import model.Invariant.Invariant;
import model.State;

import java.util.Random;

public class uniqueInv implements Invariant {

    public String var;
    String type;
    String table;
    Random rand;

    public uniqueInv(String var, String table) {

        this.var = var;
        this.table = table;
        rand = new Random();
    }

    @Override
    public BoolExpr getInv(Context ctx, Database db) {

        State state = db.getTable(table);
        BoolExpr unique = ctx.mkTrue();
        Expr arr[] = new Expr[state.columns.get(var).values().size()];
        int i = 0;

        for (Expr e1 : state.columns.get(var).values()) {
            arr[i] = e1;
            i++;
        }
        for (int k = 0; k < arr.length - 1; k++) {
            for (int j = k + 1; j < arr.length; j++) {
                unique = ctx.mkAnd(unique, ctx.mkNot(ctx.mkEq(arr[k], arr[j])));
            }
        }
        return unique;
    }

    @Override
    public String getType() {
        return "UQ";
    }

    @Override
    public String getvar0() {
        return var;
    }

    @Override
    public String getTable() {
        return table;
    }
}
