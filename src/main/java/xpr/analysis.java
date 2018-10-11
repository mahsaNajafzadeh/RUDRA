
package xpr;

import Concurrency.concurrencyControl;
import com.microsoft.z3.*;
import model.*;
import model.Command.Operations;
import model.Invariant.Invariant;

public class analysis {

    State state = new State();
    Operations o1;
    Operations o2;
    Invariant inv;
    Database db;

    public analysis(Operations o1, Operations o2, Invariant inv) {

        this.o1 = o1;
        this.o2 = o2;
        this.inv = inv;
    }

    public int proof(Context ctx, Database db, int count) {

        // invariant on delta
        BoolExpr invDelta = inv.getInv(ctx, db);
        System.out.println("invDelta:  " + invDelta);

        Database db1 = o1.applyEffect(db, ctx);
        Database db2 = o2.applyEffect(db, ctx);

        BoolExpr invEff = inv.getInv(ctx, db1);
        System.out.println("invEff:  " + invEff);

        BoolExpr invCon = inv.getInv(ctx, db2);
        System.out.println("invCon:  " + invCon);

        Database db3 = o1.applyEffect(db2, ctx);

        BoolExpr ee = ctx.mkTrue();
        for (concurrencyControl cc : o1.CCS) {

            if (cc.getType() == "RES")
                db3 = db;
            else if (cc.getType() == "UQ")
                ee = ctx.mkAnd(ee, cc.cc(ctx, db3));
        }

        BoolExpr invConcurEff = inv.getInv(ctx, db3);
        System.out.println("invConcurEff:  " + invConcurEff);
        BoolExpr pre = o1.applyPrecondition(db, ctx);

        BoolExpr expr = ctx.mkImplies(ctx.mkAnd(invDelta, invCon, invEff, ee, pre), invConcurEff);
        Solver s = ctx.mkSolver();

        System.out.println("Expr:" + expr);
        s.add(ctx.mkNot(expr));
        Status st = s.check();
        System.out.println("result: " + st);

        if (st == Status.SATISFIABLE) {
            System.out.println("result: " + s.getModel());
            count++;
        }

        return count;
    }

}
