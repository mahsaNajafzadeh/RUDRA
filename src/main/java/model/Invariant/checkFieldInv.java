

package model.Invariant;

import com.microsoft.z3.*;
import model.Database;

public class checkFieldInv implements Invariant {

    public String name1;
    public String name2;
    public Sort key1;
    public Sort key2;


    public checkFieldInv(Sort key1, Sort key2, String name1, String name2) {

        this.name1 = name1;
        this.name2 = name2;
        this.key1 = key1;
        this.key2 = key2;
    }


    @Override
    public BoolExpr getInv(Context ctx, Database db) {

        Expr item1 = ctx.mkConst(key2.getName(), key2);
        Expr item2 = ctx.mkConst(key1.getName(), key1);

        Expr[] argOwner = new Expr[2];
        argOwner[0] = item1;
        argOwner[1] = item2;

        TupleSort t_sort = ctx.mkTupleSort(ctx.mkSymbol("mk_field_tuple"), // name of
                new Symbol[]{key2.getName(), key1.getName()}, // names
                new Sort[]{key2, key1});

        Expr owner = t_sort.mkDecl().apply(argOwner);


        Expr e1 = ctx.mkSetMembership(owner, db.getTable(name1).getExpr(name1 + name2));


        Expr e2 = ctx.mkSetMembership(item1, db.getTable(name1).getExpr(name2));


        BoolExpr owenrExist = ctx.mkImplies((BoolExpr) e1, (BoolExpr) e2);

        Sort[] args = new Sort[1];
        args[0] = key1;
        //setting names
        Symbol[] names = new Symbol[1];
        names[0] = key1.getName();

        BoolExpr inv = ctx.mkForall(args, names, owenrExist, 1, null, null, null, null);

        return inv;
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public String getvar0() {
        return null;
    }

    @Override
    public String getTable() {
        return null;
    }

}
