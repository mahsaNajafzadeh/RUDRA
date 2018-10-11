/*******************************************************************************
 * ===========================================================
 * This file is part of the CISE tool software.
 *
 * The CISE tool software contains proprietary and confidential information of Inria.
 * All rights reserved. Reproduction, adaptation or distribution, in whole or in part, is
 * forbidden except by express written permission of Inria.
 * Version V1.5.1., July 2017
 * Authors: Mahsa Najafzadeh, Michał Jabczyński, Marc Shapiro
 * Copyright (C) 2017, Inria
 * ===========================================================
 ******************************************************************************/

package Concurrency;

import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Context;
import com.microsoft.z3.Expr;
import com.microsoft.z3.IntExpr;
import model.ConcurrencyControl;
import model.Database;
import model.State;

public class escrow implements ConcurrencyControl {


    String key;
    String obj;
    IntExpr escrow;
    String state;
    String relation;

    @Override
    public void repair() {

    }

    @Override
    public void disallow() {

    }

    @Override
    public boolean conflict(ConcurrencyControl c1, ConcurrencyControl c2) {
        return false;
    }

    @Override
    public String getName() {
        return "escrow";
    }


    public escrow(String state, String key, String obj, IntExpr val, String relation) {

        this.state = state;
        this.key = key;
        this.obj = obj;
        this.escrow = val;
        this.relation = relation;
    }

    @Override
    public BoolExpr applyCC(Database db, Context ctx) {

        State s = db.getTable(state);
        Expr e = s.columns.get(obj).get(key);
        BoolExpr cc = null;
        if (relation.equals("GE"))
            cc = ctx.mkGe((IntExpr) e, escrow);
        else
            cc = ctx.mkLe((IntExpr) e, escrow);
        // cc=ctx.mkAnd(cc, ctx.mkGe(escrow, ctx.mkInt(0)));

        return cc;
    }
}
