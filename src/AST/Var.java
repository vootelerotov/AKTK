package AST;

/**
 * Created by vootele on 5/22/14.
 */
public class Var extends Arg {

    private String name;

    public String getName(){
        return name;
    }

    public Var(String name){
        this.name = name;
    }
}
