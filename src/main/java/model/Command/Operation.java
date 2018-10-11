

package model.Command;

import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Context;
import com.microsoft.z3.Expr;
import model.Database;
import model.State;
import model.effect;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface Operation {


    List<Expr> exprs = new ArrayList<>();

    Set<String> Uniques = new HashSet<>();

    String getName();

    void addPrecondition(String pre, String table);

    void addCC(String pre, String table);

    BoolExpr applyPrecondition(Database db, Context ctx);

    BoolExpr applyCC(Database db, Context ctx);

    State applyEffect(State state);

    Database applyEffect(Database db, Context ctx);

    void putArguments(String args);

    void addEffect(effect e);

    Operation copy();

}
