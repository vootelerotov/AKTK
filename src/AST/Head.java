package AST;

/**
 * Created by vootele on 5/22/14.
 */
public class Head extends BilboAST {

    private String type;
    private Args args;

    public String getType() {
        return type;
    }

    public Args getArgs() {
        return args;
    }

    public Head (String type, Args args){
        this.type = type;
        this.args = args;
    }
}
