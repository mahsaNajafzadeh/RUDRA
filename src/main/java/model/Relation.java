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

package model;

import com.microsoft.z3.Context;
import com.microsoft.z3.Expr;
import com.microsoft.z3.SetSort;
import com.microsoft.z3.Sort;

public class Relation {

    Sort type1;
    Sort type2;
    Expr table;

    public Relation(Sort t1, Sort t2, Expr table) {
        this.table=table;
        this.type1=t1;
        this.type2=t2;
    }

    public Sort getType1() {
        return type1;
    }

    public Sort getType2() {
        return type2;
    }

    public Expr getTable() {
        return table;
    }

    public void updateTable(Expr table) {
        this.table=table;
    }

}
