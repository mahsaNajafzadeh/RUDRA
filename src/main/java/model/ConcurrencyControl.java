
package model;

import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Context;

public interface ConcurrencyControl {

    void repair();

    void disallow();

    boolean conflict(ConcurrencyControl c1, ConcurrencyControl c2);

    String getName();

    BoolExpr applyCC(Database db, Context ctx);

}
