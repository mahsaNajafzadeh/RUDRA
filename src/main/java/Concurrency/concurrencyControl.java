

package Concurrency;

import Commands.Command;
import Invariant.*;
import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Context;
import com.microsoft.z3.Expr;
import model.Database;

import java.util.HashMap;
import java.util.Set;

public interface concurrencyControl {

    Invariant getInvariant();

    Command getCommand1();

    Command getCommand2();

    void setCommand1(Command c1);

    void setCommand2(Command c2);

    HashMap<String, Expr> getDelta();

    HashMap<String, Expr> getDeltaCC(Context ctx, HashMap<String, Expr> state);

    Set<String> getKeys();

    BoolExpr cc(Context ctx, Database db);

    String getType();
}
