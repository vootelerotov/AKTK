package ast;

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
    public String getType(){
        return type;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Input{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
