

package Test;

import com.microsoft.z3.*;

import java.util.HashMap;

public class database {

    public HashMap<String, Expr> item_order;
    public HashMap<String, Expr> order;
    public HashMap<String, Expr> product;
    public HashMap<String, Expr> user;
    public HashMap<String, Expr> ids;

    public HashMap<String, HashMap<String, Expr>> state;
    public Sort itemId;
    public Expr item_set;
    public Sort customerId;
    public Expr customer_set;
    public SetSort ss;

    public Expr order_set;
    public TupleSort order_sort;


    public database(Context ctx) {

        itemId = ctx.mkUninterpretedSort("itemId");
        ss = ctx.mkSetSort(itemId);
        item_set = ctx.mkConst("item_set", ss);

        customerId = ctx.mkUninterpretedSort("customer");
        SetSort cc = ctx.mkSetSort(customerId);
        customer_set = ctx.mkConst("customer_set", cc);


        order_sort = ctx.mkTupleSort(ctx.mkSymbol("mk_relation_tuple"), // name of
                new Symbol[]{ctx.mkSymbol("first"), ctx.mkSymbol("second")}, // names
                new Sort[]{ctx.mkUninterpretedSort(ctx.mkSymbol("order")), ctx.mkUninterpretedSort(ctx.mkSymbol("customer"))});

        SetSort or = ctx.mkSetSort(order_sort);
        order_set = ctx.mkConst("order_set", or);

        item_order = new HashMap<String, Expr>();
        order = new HashMap<String, Expr>();
        product = new HashMap<String, Expr>();
        user = new HashMap<String, Expr>();
        ids = new HashMap<String, Expr>();
        state = new HashMap<>();
        state.put("item_order", item_order);
        state.put("order", order);
        state.put("product", product);
        state.put("user", user);
        state.put("ids", ids);
        ids.put("item_set", item_set);
        ids.put("customer_set", customer_set);
        ids.put("order_set", order_set);


    }

    public HashMap<String, Expr> getState(String table) {
        return state.get(table);
    }

    public HashMap<String, HashMap<String, Expr>> getState() {
        return state;
    }
}
