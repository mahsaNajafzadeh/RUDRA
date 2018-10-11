

package xpr;

import Concurrency.Uniquness;
import Concurrency.concurrencyControl;
import Concurrency.reservation;
import com.microsoft.z3.Context;
import model.*;
import model.Command.Operation;
import model.Command.Operations;
import model.Invariant.Invariant;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class testADSL {

    static int count = 0;
    static int violations = 0;

    public static void main(String[] args) throws Exception {

        Database db = new Database();

        String fileName1 = "/Users/mnajafza/Downloads/CISE-master/src/main/java/xpr/adsl.rb";
        String fileName2 = "/Users/mnajafza/Downloads/CISE-master/src/main/java/xpr/model.rb";
        File file = new File(fileName1);
        FileInputStream fis = null;
        File file2 = new File(fileName2);
        FileInputStream fis2 = null;
        Context z3ctx = Z3Utils.ctx();
        try {
            // Open the input file stream
            fis = new FileInputStream(file);

            adslLexer lexer = new adslLexer(new ANTLRInputStream(fis));

            // Get a list of matched tokens
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Pass the tokens to the parser
            adslParser parser = new adslParser(tokens);

            // Specify our entry point
            adslParser.ProgContext SentenceContext = parser.prog();

            fis.close();
            // Walk it and attach our listener
            ParseTreeWalker walker = new ParseTreeWalker();

            adslDocumentListener listener = new adslDocumentListener(z3ctx, db);
            walker.walk(listener, SentenceContext);
            fis2 = new FileInputStream(file2);
            modelLexer lexer2 = new modelLexer(new ANTLRInputStream(fis2));

            // Get a list of matched tokens
            CommonTokenStream tokens2 = new CommonTokenStream(lexer2);

            // Pass the tokens to the parser
            modelParser parser2 = new modelParser(tokens2);

            // Specify our entry point

            modelParser.ProgContext SentenceContext2 = parser2.prog();

            fis2.close();
            // Walk it and attach our listener
            ParseTreeWalker walker2 = new ParseTreeWalker();


            modelDocumentListener listener2 = new modelDocumentListener(z3ctx, db);

            walker2.walk(listener2, SentenceContext2);


            List<Operation> opCom = new ArrayList<Operation>();
            opCom.addAll(db.getOp());

            long startTime = System.currentTimeMillis();

            Operations o1 = new Operations();
            Operations o2 = new Operations();

            System.out.println("Invariants" + db.getInv().size());
            System.out.println("Commands" + db.getOp().size());

            Database db0 = new Database();

            int j = 0;
            if (!db.getInv().isEmpty()) {
                while (j < db.getInv().size()) {

                    for (int k = 0; k < 1; k = k + 1) {

                        o1 = db.getOp().get(k);
                        System.out.println("check command:" + o1.getName());

                        db0 = db.copy();
                        String table = null;
                        String unique = null;
                        String table1 = null;
                        String table2 = null;

                        for (int i = 0; i < opCom.size(); i = i + 1) {
                            if (i == k)
                                o2 = o1.copy();
                            else
                                o2 = db.getOp().get(i);
                            System.out.println("againts command:" + o2.getName());

                            if (table != null) {
                                State state = db.getTable(table);
                                state.unique.put(unique, true);
                                table = null;
                                unique = null;
                            }

                            if (table1 != null) {
                                db.getTable(table2).dependent = table1;
                                table1 = null;
                                table2 = null;
                            }

                            Invariant inv = db.getInv().get(j);
                            System.out.println(inv);

                            analysis an = new analysis(o1, o2, inv);
                            int count1 = an.proof(z3ctx, db, count);
                            if (count1 != count) {
                                violations++;
                                System.out.println(" counter example found, inject CC or weaken inv");
                                if (inv.getType() == "RL") {

                                    table1 = inv.getTable();
                                    table2 = inv.getvar0();
                                    if (db.getTable(table2).nullifies.contains(table1)) {
                                        System.out.println("Weaken invariants");
                                        i++;
                                    } else if (db.getTable(table2).dependencies.contains(table1)) {
                                        db.getTable(table2).dependent = table1;
                                    } else {
                                        concurrencyControl cc = new reservation();
                                        o1.CCS.add(cc);
                                    }

                                } else if (inv.getType() == "UQ") {
                                    table = inv.getTable();
                                    unique = inv.getvar0();
                                    o1.Uniques.add(unique);
                                }

                                i--;

                            } else {
                                System.out.println("no counter example");

                            }
                        }

                        System.out.println("###############################");
                        System.out.println("################################");
                        System.out.println("###############################");
                        db = db0.copy();
                    }
                    j++;
                }
            }

            long stopTime = System.currentTimeMillis();
            long elapsedTime = stopTime - startTime;
            System.out.println("elapsedTime:" + elapsedTime);
            System.out.println("violations:" + violations);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}
