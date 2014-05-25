import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


/**
 * Created by vootele on 5/25/14.
 */
public class Test {

    private static ParseTree createParseTree(String program) {
        ANTLRInputStream antlrInput = new ANTLRInputStream(program);
        AKTKLexer lexer = new AKTKLexer(antlrInput);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AKTKParser parser = new AKTKParser(tokens);
        ParseTree tree = parser.programm();
        // System.out.println(tree.toStringTree(parser));
        return tree;
    }

    @Bilbo
    static Integer evaluate(ParseTree tree) {


        AKTKParser.ArvuliteraalRContext() ~> {
            return Integer.parseInt(tree.getText());
        };



        AKTKParser.KorrutamineJagamineContext(l,"*",r) ~> {return evaluate(l)*evaluate(r);};
        AKTKParser.KorrutamineJagamineContext(l,"/",r) ~> {return evaluate(l)/evaluate(r);};
        AKTKParser.LiitmineLahutamineContext(l,"+",r) ~> {return evaluate(l)+evaluate(r);};
        AKTKParser.LiitmineLahutamineContext(l,"+",r) ~> {return evaluate(l)+evaluate(r);};



        _ ~> {
            if (tree.getChildCount() == 1){
                return evaluate(tree.getChild(0));
            }
            else{
            throw new UnsupportedOperationException
                    ("Selle tiputüübi väärtustamine ei ole praegu toetatud");
            }
        };
    }

    public static void main(String[] args){
        ParseTree tree = createParseTree("5+2*4");
        System.out.println(evaluate(tree));
    }




}
