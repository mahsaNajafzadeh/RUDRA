

package model.Command;

import com.microsoft.z3.Context;
import com.microsoft.z3.Expr;
import model.Database;
import model.State;
import model.effect;

public class assignEffect implements effect {
    String key;
    Expr val;

    public assignEffect(String key, Expr val) {
        this.key = key;
        this.val = val;
    }

    @Override
    public State applyEffect(State state) {

        State state2 = new State();
        state2 = (State) state.copy();
        state2.putExpr(key, val);
        return state2;
    }

    @Override
    public Database applyEffect(Database db, Context ctx) {
        return null;
    }


    @Override
    public effect copy() {
        assignEffect f = new assignEffect(key, val);
        return f;
    }

    @Override
    public effect copy(Object[] params) {
        return null;
    }
}

