

package Commands;

import Concurrency.concurrencyControl;
import Invariant.Invariant;
import com.microsoft.z3.ArithExpr;
import com.microsoft.z3.Context;
import com.microsoft.z3.Expr;
import com.microsoft.z3.IntExpr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Decrement implements Command {

    public HashMap<Command, HashMap<Invariant, concurrencyControl>> map;
    public List<Command> concurrents;

    Expr state;
    public String key;


    public Decrement(String key) {

        this.key = key;
        concurrents = new ArrayList<>();
        map = new HashMap<Command, HashMap<Invariant, concurrencyControl>>();
    }

    public Decrement(Context ctx) {

        this.state = (IntExpr) ctx.mkConst("value", ctx.mkIntSort());
        concurrents = new ArrayList<>();
        map = new HashMap<Command, HashMap<Invariant, concurrencyControl>>();
    }

    public Decrement(Expr state) {

        this.state = state;
        concurrents = new ArrayList<>();
        map = new HashMap<Command, HashMap<Invariant, concurrencyControl>>();
    }

    @Override
    public Expr applyEffect(Expr state, Context ctx) {

        return (IntExpr) ctx.mkAdd(new ArithExpr[]{(IntExpr) state, ctx.mkInt(1)});
    }

    @Override
    public String getName() {
        return "Decrement";
    }

    @Override
    public HashMap<String, Expr> applyEffect(HashMap<String, Expr> state, Context ctx) {

        HashMap<String, Expr> hashMap1 = new HashMap();
        hashMap1 = (HashMap) state.clone();
        Expr x = hashMap1.get(key);
        hashMap1.put(key, (IntExpr) ctx.mkSub(new ArithExpr[]{(IntExpr) x, ctx.mkInt(1)}));
        return hashMap1;
    }

    @Override
    public String getState() {
        return null;
    }

    @Override
    public concurrencyControl getCC(Command concur, Invariant inv) {

        if (map.containsKey(concur))
            return map.get(concur).get(inv);
        else
            return null;
    }

    @Override
    public List<Command> getConcurrentCs() {
        return concurrents;
    }

    @Override
    public void addConcurrentCs(Command concur) {
        concurrents.add(concur);
    }

    @Override
    public void putCC(Command concur, concurrencyControl cc, Invariant inv) {

        if (map.containsKey(concur)) {
            HashMap<Invariant, concurrencyControl> mp = map.get(concur);
            mp.put(inv, cc);
            map.put(concur, mp);
        } else {
            HashMap<Invariant, concurrencyControl> mp = new HashMap<Invariant, concurrencyControl>();
            mp.put(inv, cc);
            map.put(concur, mp);
        }
    }

}


