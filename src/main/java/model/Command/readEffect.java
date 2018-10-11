

package model.Command;

import com.microsoft.z3.Context;
import model.Database;
import model.State;
import model.effect;

public class readEffect implements effect {

    String table;

    public readEffect(String name) {
        this.table = name;
    }

    @Override
    public State applyEffect(State state) {
        return state;
    }

    @Override
    public Database applyEffect(Database db, Context ctx) {
        return db;
    }

    @Override
    public effect copy() {

        effect e = new readEffect(table);
        return e;
    }

    @Override
    public effect copy(Object[] params) {

        effect e = new readEffect(table);
        return e;
    }
}
