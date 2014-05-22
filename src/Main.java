/**
 * Created by vootele on 5/22/14.
 */

import AST.BilboAST;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    private static ParseTree createParseTree(String program) {
        ANTLRInputStream antlrInput = new ANTLRInputStream(program);
        BilboLexer lexer = new BilboLexer(antlrInput);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BilboParser parser = new BilboParser(tokens);
        ParseTree tree = parser.source();
        // System.out.println(tree.toStringTree(parser));
        return tree;
    }

    private static BilboAST evaluateWithVisitor(ParseTree tree) {
        BilboParserVisitor<BilboAST> visitor = new BilboVisitor();
        return tree.accept(visitor);
    }

    public static void main (String[] args) throws IOException {
        String input = new String(Files.readAllBytes(Paths.get(args[0])));
        ParseTree tree = createParseTree(input);
        evaluateWithVisitor(tree);
    }
}
