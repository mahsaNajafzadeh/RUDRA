
package Test;

import Commands.CommandImp;
import com.microsoft.z3.ArithExpr;
import com.microsoft.z3.Context;
import com.microsoft.z3.Expr;
import com.microsoft.z3.IntExpr;

import java.util.HashMap;

public class update extends CommandImp {


    public update(String key) {
        super(key);
    }

    public update(String key, String type, int value) {
        super(key, type, value);
    }

    public HashMap<String, Expr> applyEffect(HashMap<String, Expr> state, Context ctx) {
        HashMap<String, Expr> hashMap1 = new HashMap();
        hashMap1 = (HashMap) state.clone();
        Expr x = hashMap1.get(key);

        if (type == "inc")
            hashMap1.put(key, (IntExpr) ctx.mkAdd(new ArithExpr[]{(IntExpr) x, ctx.mkInt(value)}));
        else
            hashMap1.put(key, (IntExpr) ctx.mkSub(new ArithExpr[]{(IntExpr) x, ctx.mkInt(value)}));

        return hashMap1;
    }
}
