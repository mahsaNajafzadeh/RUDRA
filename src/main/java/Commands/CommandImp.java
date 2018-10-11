
package Commands;

import Concurrency.concurrencyControl;
import Invariant.Invariant;
import com.microsoft.z3.Context;
import com.microsoft.z3.Expr;

import java.util.*;

public class CommandImp implements Command {


    public HashMap<Command, HashMap<Invariant, concurrencyControl>> map;
    public List<Command> concurrents;

    Expr state;
    public String key;
    public String name;
    public String table;
    public HashMap<String, Expr> hashState;
    public ArrayList<String> keySet;
    public String type;
    public int value;

    public CommandImp(String key) {

        this.key = key;
        concurrents = new ArrayList<>();
        map = new HashMap<Command, HashMap<Invariant, concurrencyControl>>();

    }

    public CommandImp(String key, String table) {

        this.key = key;
        concurrents = new ArrayList<>();
        map = new HashMap<Command, HashMap<Invariant, concurrencyControl>>();
        this.table = table;

    }

    public CommandImp(String key, String type, int val) {

        this.key = key;
        concurrents = new ArrayList<>();
        map = new HashMap<Command, HashMap<Invariant, concurrencyControl>>();
        this.value = val;

    }

    public CommandImp(String key1, String key2, String table) {

        keySet = new ArrayList<>();
        keySet.add(key1);
        keySet.add(key2);
        concurrents = new ArrayList<>();
        map = new HashMap<Command, HashMap<Invariant, concurrencyControl>>();
        this.table = table;

    }

    public CommandImp(String key, Expr state) {

        this.key = key;
        concurrents = new ArrayList<>();
        map = new HashMap<Command, HashMap<Invariant, concurrencyControl>>();
        this.state = state;
    }

    public CommandImp(String key, HashMap<String, Expr> hashState) {

        this.key = key;
        concurrents = new ArrayList<>();
        map = new HashMap<Command, HashMap<Invariant, concurrencyControl>>();
        this.hashState = hashState;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Expr applyEffect(Expr state, Context ctx) {
        return null;
    }

    @Override
    public HashMap<String, Expr> applyEffect(HashMap<String, Expr> state, Context ctx) {
        return null;
    }

    @Override
    public String getState() {
        return null;
    }

    @Override
    public concurrencyControl getCC(Command concur, Invariant inv) {
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
    }
}
