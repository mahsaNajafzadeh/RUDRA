

package model.precondition;

import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Context;
import com.microsoft.z3.Expr;
import com.microsoft.z3.IntExpr;
import model.precondition.Precondition;

public class Precondition_numeric implements Precondition {


    String key;
    String op;
    IntExpr val;
    Expr key_expr;


    public Precondition_numeric(String key, IntExpr val, String op) {

        this.key = key;
        this.val = val;
        this.op = op;
    }

    @Override
    public String getName() {
        return "numeric";
    }


    @Override
    public BoolExpr applyPrecondition(Context ctx) {

        this.key_expr = ctx.mkConst(key, ctx.mkIntSort());
        BoolExpr pre = null;
        switch (op) {
            case ">=":
                pre = ctx.mkLt((IntExpr) key_expr, val);
                break;
            case ">":
                pre = ctx.mkLe((IntExpr) key_expr, val);
                break;
            case "<=":
                pre = ctx.mkGe((IntExpr) key_expr, val);
                break;
            case "<":
                pre = ctx.mkGt((IntExpr) key_expr, val);
                break;
            default:
                break;
        }
        return pre;
    }

}
