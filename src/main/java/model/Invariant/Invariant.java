
package model.Invariant;

import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Context;
import model.Database;

public interface Invariant {

    BoolExpr getInv(Context ctx, Database db);

    String getType();

    String getvar0();

    String getTable();
}
