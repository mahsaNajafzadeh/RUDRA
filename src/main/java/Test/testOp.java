

package Test;

import Commands.Command;
import Invariant.*;
import Invariant.Unique;

import Proof.analysis;
import com.microsoft.z3.Context;
import com.microsoft.z3.Expr;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class testOp {

    Command c1;
    Command c2;
    Set<Invariant> inv;

    public testOp(Command c1, Command c2, Set<Invariant> inv) {

        this.c1 = c1;
        this.c2 = c2;
        this.inv = inv;
    }

    public static void main(String[] args) {

        Context ctx = new Context();
        database db = new database(ctx);

        Command c1 = new add("order", "customer", "order_set");

        Command c2 = new remove("customer", "customer_set");

        Invariant i1 = new presence("order", "customer", "order_set", "customer_set");

        Set<Invariant> inv = new HashSet<Invariant>();
        inv.add(i1);

        testOp t = new testOp(c1, c2, inv);

        HashMap<String, Expr> state0 = db.getState(t.c1.getState());

        analysis analysis = new analysis();

        analysis.setInvSet(t.inv);

        analysis.setCommand(t.c1);

        analysis.setDataBase(db);

        System.out.println("command:     " + c2.getName());
        analysis.setState1(state0);
        System.out.println("STATE: " + state0);
        analysis.setConcurr(c2);
        analysis.checkInvaraint(ctx);

    }
}
