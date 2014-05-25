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

    private static class Bilbo0 {
private static ParseTree tree; 
private static Integer method0( ) {
            return Integer.parseInt(tree.getText());
        }
private static Integer method1(  ParseTree l, ParseTree r ) {return evaluate(l)*evaluate(r);}
private static Integer method2(  ParseTree l, ParseTree r ) {return evaluate(l)/evaluate(r);}
private static Integer method3(  ParseTree l, ParseTree r ) {return evaluate(l)+evaluate(r);}
private static Integer method4(  ParseTree l, ParseTree r ) {return evaluate(l)+evaluate(r);}
private static Integer method5( ) {
            if (tree.getChildCount() == 1){
                return evaluate(tree.getChild(0));
            }
            else{
            throw new UnsupportedOperationException
                    ("Selle tiputüübi väärtustamine ei ole praegu toetatud");
            }
        }
 static Integer evaluate ( ParseTree tree){ 
Bilbo0.tree=tree; 
if ( tree instanceof AKTKParser.ArvuliteraalRContext ){
return method0( );}
if ( tree instanceof AKTKParser.KorrutamineJagamineContext && tree.getChild(1).getText().equals("*") ){
return method1(  tree.getChild(0), tree.getChild(2) );}
if ( tree instanceof AKTKParser.KorrutamineJagamineContext && tree.getChild(1).getText().equals("/") ){
return method2(  tree.getChild(0), tree.getChild(2) );}
if ( tree instanceof AKTKParser.LiitmineLahutamineContext && tree.getChild(1).getText().equals("+") ){
return method3(  tree.getChild(0), tree.getChild(2) );}
if ( tree instanceof AKTKParser.LiitmineLahutamineContext && tree.getChild(1).getText().equals("+") ){
return method4(  tree.getChild(0), tree.getChild(2) );}
{
return method5( );}
}
 } 
static Integer evaluate ( ParseTree tree ) {
return Bilbo0.evaluate(tree);
}

    public static void main(String[] args){
        ParseTree tree = createParseTree("5+2*4");
        System.out.println(evaluate(tree));
    }




}
