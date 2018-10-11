
package xpr;

import com.microsoft.z3.Context;
import model.*;
import model.Command.Operations;
import model.Invariant.Invariant;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;

public class test {
    static int count = 0;

    public static void main(String[] args) throws Exception {
        State s = new State();
        Database db = new Database();

        String fileName1 = "/Users/mnajafza/Downloads/CISE-master/src/main/java/xpr/test.rb";
        File file = new File(fileName1);
        FileInputStream fis = null;
        Context z3ctx = Z3Utils.ctx();
        try {
            // Open the input file stream
            fis = new FileInputStream(file);
            XPRLexer lexer = new XPRLexer(new ANTLRInputStream(fis));

            // Get a list of matched tokens
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Pass the tokens to the parser
            XPRParser parser = new XPRParser(tokens);

            // Specify our entry point
            XPRParser.ProgContext SentenceContext = parser.prog();

            fis.close();
            // Walk it and attach our listener
            ParseTreeWalker walker = new ParseTreeWalker();
            DocumentListener listener = new DocumentListener(z3ctx, db);
            walker.walk(listener, SentenceContext);

            Operations o1 = new Operations();
            o1 = db.getOp().get(1);
            System.out.println(o1.getName());

            Operations o2 = new Operations();
            o2 = db.getOp().get(1).copy();
            System.out.println(o2.getName());

            Invariant i = db.getInv().get(0);
            System.out.println(i);
            analysis an = new analysis(o1, o2, i);

            an.proof(z3ctx, db, count);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}
