

package model;

import com.microsoft.z3.Expr;
import model.Command.Operations;
import model.Invariant.Invariant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Database {


    public String[] prefix;
    public HashMap<String, State> scheme;
    public HashMap<String, Relation> relation;
    public Map<String, Expr> ids;
    public List<Operations> commands = new ArrayList<>();
    List<Invariant> invs = new ArrayList<>();

    private final List<State> tables = new ArrayList<>();


    public Database() {

        scheme = new HashMap<>();
        ids = new HashMap<String, Expr>();
        prefix = new String[]{"rep1", "rep2", "rep3", "rep4", "rep5"};
    }

    public void addState(String name, State state) {
        scheme.put(name, state);
    }

    public void addRelation(String name1, String name2) {
    }

    public void addTable(String name, State state) {
        scheme.put(name, state);
    }

    public State getTable(String name) {
        return scheme.get(name);
    }

    public void addRelation(String name, Relation r) {
        relation.put(name, r);
    }

    public Relation getRelation(String name) {
        return relation.get(name);
    }


    public void addOp(Operations o) {
        commands.add(o);
    }

    public List<Operations> getOp() {
        return this.commands;
    }

    public List<Invariant> getInv() {

        return this.invs;

    }

    public void addInv(Invariant inv) {
        invs.add(inv);
    }

    public Database copy() {

        Database db = new Database();
        for (Map.Entry e : scheme.entrySet()) {
            State s = new State();
            State s1 = (State) e.getValue();

            s = s1.copy();
            db.scheme.put((String) e.getKey(), s);
        }

        for (Operations op : getOp()) {
            db.addOp(op);
        }

        for (Invariant in : getInv()) {
            db.addInv(in);
        }

        //s.sorts.putAll(sorts);
        //  for(Map.Entry e : exprs.entrySet())
        //    s.exprs.put((String) e.getKey(), (Expr) e.getValue());

        //  s.exprs.putAll(exprs);
        return db;
    }
}
