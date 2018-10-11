

package model.precondition;

import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Context;
import model.precondition.Precondition;

public class Precondition_delete implements Precondition {

    BoolExpr e;

    public Precondition_delete(BoolExpr e) {

        this.e = e;

    }

    @Override
    public String getName() {
        return "dependent_delete";
    }

    @Override
    public BoolExpr applyPrecondition(Context ctx) {
        return e;
    }
}
