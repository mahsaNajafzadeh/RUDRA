

package Proof;

import Commands.Command;
import Invariant.Invariant;
import Test.database;
import com.microsoft.z3.*;

import java.util.HashMap;
import java.util.Set;

public class analysis {
    public static HashMap<String, Expr> stateDelta;
    public static HashMap<String, Expr> stateCC;
    public Command c;
    public Command concur;
    public Invariant in;
    public Set<Invariant> invSet;
    public database db;


    public analysis() {
    }

    public analysis(HashMap<String, Expr> state1, Invariant inv, Command c, Command concur) {

        this.stateDelta = state1;
        this.in = inv;
        this.c = c;
        this.concur = concur;

    }

    public Expr checkProof(Context ctx) {

        // invariant on delta
        BoolExpr exTrue = ctx.mkTrue();
        BoolExpr invDelta = null;
        for (Invariant inv : invSet) {
            invDelta = ctx.mkAnd(inv.getInvariant(ctx, stateDelta), exTrue);
            exTrue = invDelta;
        }


        this.stateCC = concur.applyEffect(stateDelta, ctx);

        System.out.println("stateCC:" + this.stateCC);

        if (c.getCC(concur, in) != null) {
            this.stateCC = c.getCC(concur, in).getDeltaCC(ctx, stateCC);

        }


        BoolExpr invCC = null;
        exTrue = ctx.mkTrue();
        for (Invariant inv : invSet) {
            invCC = ctx.mkAnd(inv.getInvariant(ctx, stateCC), exTrue);
            exTrue = invCC;
        }


        HashMap<String, Expr> res = c.applyEffect(stateDelta, ctx);


        BoolExpr invEff = null;
        exTrue = ctx.mkTrue();
        for (Invariant inv : invSet) {
            invEff = ctx.mkAnd(inv.getInvariant(ctx, res), exTrue);
            exTrue = invEff;
        }


        // apply c on  state from CC
        HashMap<String, Expr> result = c.applyEffect(stateCC, ctx);

        // check invariant on  state result
        BoolExpr invConcurEff = null;
        exTrue = ctx.mkTrue();
        for (Invariant inv : invSet) {
            invConcurEff = ctx.mkAnd(inv.getInvariant(ctx, result), exTrue);
            exTrue = invConcurEff;
        }


        // the implication rule
        BoolExpr expr = ctx.mkImplies(ctx.mkAnd(invDelta, invCC, invEff), invConcurEff);

        return expr;

    }

    public void checkInvaraint(Context ctx) {


        // get state from CC

        HashMap<String, Expr> res = c.applyEffect(stateDelta, ctx);
        System.out.println("stateEFF:" + res);

        this.stateCC = concur.applyEffect(stateDelta, ctx);

        System.out.println("stateCC:" + this.stateCC);

        for (Invariant inv : invSet) {
            if (c.getCC(concur, inv) != null) {
                this.stateCC = c.getCC(concur, in).getDeltaCC(ctx, stateCC);
                System.out.println("stateCC:" + this.stateCC);
            }
        }


        // apply c on  state from CC
        HashMap<String, Expr> result = c.applyEffect(stateCC, ctx);
        System.out.println("stateCC:" + result);


        for (Invariant inv : invSet) {
            System.out.println("Invariant:  " + inv.getName());
            // invariant on delta
            BoolExpr invDelta = inv.getInvariant(ctx, stateDelta);
            System.out.println("invDelta:  " + invDelta);

            BoolExpr invCC = inv.getInvariant(ctx, stateCC);
            System.out.println("invCC:  " + invCC);

            BoolExpr invEff = inv.getInvariant(ctx, res);
            System.out.println("invEff:  " + invEff);

            // check invariant on  state result
            BoolExpr invConcurEff = inv.getInvariant(ctx, result);
            System.out.println("invConcurEff:  " + invConcurEff);


            // the implication rule
            BoolExpr expr = ctx.mkImplies(ctx.mkAnd(invDelta, invCC, invEff), invConcurEff);
            Solver s = ctx.mkSolver();


            System.out.println(expr);
            s.add(ctx.mkNot((BoolExpr) expr));

            Status st = s.check();
            System.out.println("result: " + st);

            if (st == Status.SATISFIABLE)
                System.out.println("result: " + s.getModel());

        }
    }

    public void setCommand(Command c) {

        this.c = c;
    }

    public void setConcurr(Command c2) {

        this.concur = c2;
    }

    public void setState1(HashMap<String, Expr> stateDelta) {

        this.stateDelta = stateDelta;
    }

    public void setInv(Invariant inv) {

        this.in = inv;
    }


    public void setInvSet(Set<Invariant> invSet) {

        this.invSet = invSet;
    }

    public void setDataBase(database db) {

        this.db = db;
    }


}
