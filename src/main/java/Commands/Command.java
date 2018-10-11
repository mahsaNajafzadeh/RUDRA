

package Commands;

import Concurrency.concurrencyControl;
import Invariant.Invariant;
import com.microsoft.z3.Context;
import com.microsoft.z3.Expr;

import java.util.HashMap;
import java.util.List;

public interface Command {

    String getName();

    Expr applyEffect(Expr state, Context ctx);

    HashMap<String, Expr> applyEffect(HashMap<String, Expr> state, Context ctx);

    String getState();

    concurrencyControl getCC(Command concur, Invariant inv);

    void putCC(Command concur, concurrencyControl cc, Invariant inv);

    List<Command> getConcurrentCs();

    void addConcurrentCs(Command concur);


}
