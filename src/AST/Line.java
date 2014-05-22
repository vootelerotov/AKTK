package AST;

/**
 * Created by vootele on 5/22/14.
 */
public class Line extends BilboAST {

    private Head head;
    private String javaCode;


    public Head getHead() {
        return head;
    }

    public String getJavaCode() {
        return javaCode;
    }

    public Line(Head head, String code){
        this.head = head;
        this.javaCode = code;
    }
}
