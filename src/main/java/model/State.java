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

import com.microsoft.z3.*;
import model.Command.Operations;
import model.Invariant.Invariant;
import model.precondition.Precondition;

import java.util.*;

public final class State {

    String name;

    public Expr set;

    public State() {
        columns = new HashMap<>();
        columns1 = new HashMap<>();
        preconditions = new HashMap<>();
        unique=new HashMap<>();
        belongs=new ArrayList<>();
        dependencies=new ArrayList<>();
        nullifies=new ArrayList<>();
    }

    public State(String name, Context ctx) {
        Sort id = ctx.mkUninterpretedSort(name);
        SetSort ss = ctx.mkSetSort(id);
        set = ctx.mkConst(name, ss);
        columns = new HashMap<>();
        columns1 = new HashMap<>();
        preconditions = new HashMap<>();
        unique=new HashMap<>();
        belongs=new ArrayList<>();
        dependencies=new ArrayList<>();
        nullifies=new ArrayList<>();
    }

    public static  String dependent;
    public  static ArrayList<String> dependencies;

    public   ArrayList<String> nullifies;

    public final Map<String, Expr> values = new HashMap<>();

    public final Map<String, Boolean> demarcation = new HashMap<>();

    public Map<String, Operations> functions = new HashMap<>();

    public HashMap<String, Map<String, Expr>> columns;
    public HashMap<String, Map<Expr, Expr>> columns1;

    public List<String> fields = new ArrayList<>();

    public Map<String, Precondition> preconditions = new HashMap<>();

    public Map<String, ConcurrencyControl> ConcurrencyControls = new HashMap<>();

    public HashMap<String, Boolean> unique;

    public void addFileds(String f) {
        fields.add(f);
    }

    public void addDependencies(String d) {
        dependencies.add(d);
    }

    public void addNullify(String n) {
        nullifies.add(n);
    }

    public List<String> getFileds() {
        return fields;
    }

    public List<String> belongs = new ArrayList<>();

    public void putname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    private final Map<String, Sort> sorts = new HashMap<>();

    private final Map<String, Relation> relations = new HashMap<>();

    private final Map<String, Expr> exprs = new HashMap<>();



    private final Map<String, Expr> tokens = new HashMap<>();

    public  Map<String, Invariant> validations = new HashMap<>();

    private final List<Sort> sortss = new ArrayList<>();
    private final List<Expr> exprss = new ArrayList<>();

    private final List<Expr> tokenss = new ArrayList<>();

    public Sort getSort(String name) {
        return sorts.get(name);
    }

    public Relation getRelation(String name) {
        return relations.get(name);
    }

    public Map<String, Relation> getRelations() {
        return relations;
    }

    public void putRelation(String name, Relation relation) {
        relations.put(name, relation);
    }

    public Expr getExpr(String name) {
        return exprs.get(name);
    }

    public Expr getToken(String name) {
        return tokens.get(name);
    }

    public void putSort(String name, Sort value) {
        sorts.put(name, value);
    }


    public void putExpr(String name, Expr value) {
        exprs.put(name, value);
    }

    public Collection<Sort> getSorts() {
        return sorts.values();
    }

    public Collection<Expr> getExprs() {
        return exprs.values();
    }

    public void addExpr(Expr e) {
        exprss.add(e);
    }

    public void addToken(Expr e) {
        tokenss.add(e);
    }

    public void addSort(Sort s) {
        sortss.add(s);
    }

    public List<Expr> getExprss() {
        return exprss;
    }

    public List<Sort> getSortss() {
        return sortss;
    }


    public State copy() {
        State s = new State();

        s.putname(this.name);
        for (String f : fields) {
            s.addFileds(f);
        }

        for (String d : dependencies) {
            s.addDependencies(d);
        }

        for (String n : nullifies) {
            s.addNullify(n);
        }


        for (Map.Entry e : sorts.entrySet())
            s.sorts.put((String) e.getKey(), (Sort) e.getValue());
        //s.sorts.putAll(sorts);
        for (Map.Entry e : exprs.entrySet()) {
            s.exprs.put((String) e.getKey(), (Expr) e.getValue());
        }

        for (Map.Entry e : relations.entrySet())
            s.relations.put((String) e.getKey(), (Relation) e.getValue());
        //  s.exprs.putAll(exprs);

        for (Map.Entry e : values.entrySet()) {
            s.values.put((String) e.getKey(), (Expr) e.getValue());
        }

        for (Map.Entry e : validations.entrySet()) {
            s.validations.put((String) e.getKey(), (Invariant) e.getValue());
        }


        Map<String,Map<String,Expr>> newMap = new HashMap<String, Map<String,Expr>>();
        for (Map.Entry<String, Map<String, Expr>> entry : columns.entrySet()) {
            s.columns.put(entry.getKey(),  (Map<String, Expr>) ((HashMap<String, Expr>) columns.get(entry.getKey())).clone());
        }
        for (Map.Entry e : preconditions.entrySet()) {
            s.preconditions.put((String) e.getKey(), (Precondition) e.getValue());
        }

        for (Map.Entry e : ConcurrencyControls.entrySet()) {
            s.ConcurrencyControls.put((String) e.getKey(), (ConcurrencyControl) e.getValue());
        }

        for (Map.Entry e : unique.entrySet()) {
            s.unique.put((String) e.getKey(), (boolean) e.getValue());
        }


        for (Map.Entry<String, Map<Expr, Expr>> entry : columns1.entrySet()) {
            s.columns1.put(entry.getKey(),  (Map<Expr, Expr>) ((HashMap<Expr, Expr>) columns1.get(entry.getKey())).clone());
        }
        return s;
    }

    public BoolExpr compareTo(State s) {

        if (s.exprs.values().size() != this.exprs.size())
            return Z3Utils.ctx().mkFalse();
        Iterator itr1 = s.exprs.values().iterator();
        Iterator itr2 = this.exprs.values().iterator();
        BoolExpr result = Z3Utils.ctx().mkTrue();


        while (itr1.hasNext()) {
            Expr element1 = (Expr) itr1.next();
            Expr element2 = (Expr) itr2.next();
            result = Z3Utils.ctx().mkAnd(Z3Utils.ctx().mkEq(element1, element2), result);

        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        sorts.entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(e -> s.append("type ").append(e.getKey()).append(" ").append(e.getValue()).append('\n'));

        exprs.entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(e -> s.append(e.getValue().getSort()).append(" ").append(e.getKey()).append(" := ").append(e.getValue()).append('\n'));

        return s.toString();
    }

}
