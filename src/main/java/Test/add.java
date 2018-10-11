

package Test;

import Commands.CommandImp;
import Test.database;
import com.microsoft.z3.*;

import java.util.HashMap;
import java.util.Random;

public class add extends CommandImp {

    Random r;
    int id;


    public add(String key) {

        super(key);
        r = new Random();
        id = r.nextInt(10);
    }

    public add(String key, String table) {

        super(key);
        r = new Random();
        id = r.nextInt(10);
    }

    public add(String key1, String key2, String table) {

        super(key1, key2, table);
        r = new Random();
        id = r.nextInt(10);
    }


    public HashMap<String, Expr> applyEffect(HashMap<String, Expr> state, Context ctx) {

        Expr item;
        if (keySet.size() == 0) {
            item = ctx.mkConst(key + id, ctx.mkUninterpretedSort(ctx.mkSymbol(key)));

        } else {
            String key1 = keySet.get(0);
            String key2 = keySet.get(1);
            Expr item1 = ctx.mkConst(key1, ctx.mkUninterpretedSort(ctx.mkSymbol(key1)));
            Expr item2 = ctx.mkConst(key2, ctx.mkUninterpretedSort(ctx.mkSymbol(key2)));
            Expr[] argOwner = new Expr[2];
            argOwner[0] = item1;
            argOwner[1] = item2;

            TupleSort t_sort = ctx.mkTupleSort(ctx.mkSymbol("mk_relation_tuple"), // name of
                    new Symbol[]{ctx.mkSymbol("first"), ctx.mkSymbol("second")}, // names
                    new Sort[]{ctx.mkUninterpretedSort(ctx.mkSymbol(key1)), ctx.mkUninterpretedSort(ctx.mkSymbol(key2))});

            item = t_sort.mkDecl().apply(argOwner);
        }

        HashMap<String, Expr> hs = new HashMap<>();
        hs = (HashMap<String, Expr>) state.clone();
        if (hs.containsKey(name))
            hs.put(name, ctx.mkSetAdd(hs.get(name), item));

        return hs;

    }

    public String getState() {
        return "ids";
    }
}
