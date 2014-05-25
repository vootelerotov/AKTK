import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Created by vootele on 5/25/14.
 */
public class Test_template {

    private static ParseTree createParseTree(String program) {
        ANTLRInputStream antlrInput = new ANTLRInputStream(program);
        AKTKLexer lexer = new AKTKLexer(antlrInput);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AKTKParser parser = new AKTKParser(tokens);
        ParseTree tree = parser.programm();
        // System.out.println(tree.toStringTree(parser));
        return tree;
    }

    static int evaluate(ParseTree tree) {

        // Tipp tüübiga ArvuliteraalRContext vastab grammatikas
        // märgendile ArvuliteraalR.
        // Siin tuleb lihtsalt küsida selle tipu tekst ja teisendada
        // see täisarvuks
        if (tree instanceof AKTKParser.ArvuliteraalRContext) {
            return Integer.parseInt(tree.getText());
        }

        // Järgmise juhtumi mõistmiseks otsi grammatikast üles
        // sildid KorrutamineJagamine ja LiitmineLahutamine --
        // loodetavasti on siis arusaadav, miks siin just nii toimitakse.
        else if (tree instanceof AKTKParser.KorrutamineJagamineContext
                || tree instanceof AKTKParser.LiitmineLahutamineContext) {

            // küsin tipu alluvad
            ParseTree leftChild  = tree.getChild(0);
            String operator      = tree.getChild(1).getText();
            ParseTree rightChild = tree.getChild(2);

            // väärtustan rekursiivselt
            int leftValue  = evaluate(leftChild);
            int rightValue = evaluate(rightChild);

            // väärtustan terve operatsiooni
            switch (operator) {
                case "+": return leftValue + rightValue;
                case "-": return leftValue - rightValue;
                case "*": return leftValue * rightValue;
                case "/": return leftValue / rightValue;
                default : throw new RuntimeException("Tundmatu operaator");
            }
        }

        // Järgmine juhtum käsitleb vahetippe, mis antud ülesande
        // puhul tähtsat rolli ei mängi. Vaata jälle näidisavaldise
        // parse-puu graafilist esitust -- kui me alustame juurtipust,
        // siis me peame nende vahetippude (lause, avaldis, avaldis5, jne)
        // kaudu jõudma millegi huvitavani. Õnneks on kõigil nendel tiputüüpidel
        // (lihtsate programmide) puhul täpselt 1 alluv ja seetõttu saame
        // kõiki neid käsitleda sama skeemiga.
        else if (tree.getChildCount() == 1) {
            return evaluate(tree.getChild(0));
        }

        // Kui me satume mingi muu tipu juurde, siis anname praegu vea,
        // sest antud ülesandes ei üritagi me toetada kõiki legaalseid
        // AKTK programme.
        else {
            throw new UnsupportedOperationException
                    ("Selle tiputüübi väärtustamine ei ole praegu toetatud");
        }
    }

    public static void main(String[] args){
        ParseTree tree = createParseTree("5+2*4");
        System.out.println(evaluate(tree));
    }




}
