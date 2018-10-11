

package Proof;

import com.microsoft.z3.*;

public class testAnalysis {


    public static void main(String[] args) {

        Context ctx = new Context();

        Expr e1=ctx.mkIntConst("x");

        Expr e2=ctx.mkIntConst("x");

        BoolExpr expr=ctx.mkNot(ctx.mkEq(e1, e2));

        Solver solver = ctx.mkSolver();


        System.out.println(expr);
        solver.add((BoolExpr) expr);

        Status st = solver.check();
        System.out.println("result: " + st);

        if (st == Status.SATISFIABLE)
            System.out.println("result: " + solver.getModel());

    }
}

