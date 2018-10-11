

package Test;

import Commands.Command;
import Commands.CommandImp;
import Concurrency.concurrencyControl;
import Invariant.Invariant;
import Test.database;
import com.microsoft.z3.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class remove extends CommandImp {


    public remove(String key) {
        super(key);
    }

    public remove(String key, String table) {

        super(key, table);
    }

    public remove(String key1, String key2, String table) {

        super(key1, key2, table);
    }


    public String getName() {
        return "remove";
    }


    public HashMap<String, Expr> applyEffect(HashMap<String, Expr> state, Context ctx) {

        Expr item;
        if (keySet.size() == 0) {
            item = ctx.mkConst(key, ctx.mkUninterpretedSort(ctx.mkSymbol(key)));

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

        hs.put(table, ctx.mkSetDel(hs.get(table), item));

        return hs;
    }
}

