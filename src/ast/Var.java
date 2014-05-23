package ast;

/**
 * Created by vootele on 5/22/14.
 */
public class Var extends Arg {

    private String name;

    public String getValue(){
        return name;
    }

    public Var(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Var{" +
                "name='" + name + '\'' +
                '}';
    }
}
