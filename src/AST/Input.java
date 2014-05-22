package AST;

/**
 * Created by vootele on 5/22/14.
 */
public class Input extends BilboAST {

    private String type;
    private String name;

    public Input(String type, String name){
        this.type = type;
        this.name = name;
    }
    public String type(){
        return type;
    }

    public String getName(){
        return name;
    }

}
