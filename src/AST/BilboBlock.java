package AST;

import java.util.List;

/**
 * Created by vootele on 5/22/14.
 */
public class BilboBlock extends BilboAST {

    private String visibility;
    private boolean isStatic;
    private String type;
    private String name;
    private Input input;
    private Body body;


    public String getVisibility() {
        return visibility;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Input getInput() {
        return input;
    }

    public boolean isStatic() {
        return isStatic;
    }

    public Body body(){
        return body;
    }



    public BilboBlock(String visibility,boolean isStatic, String type, String name, Input input, Body body){
        this.visibility = visibility;
        this.isStatic = isStatic;
        this.type = type;
        this.name = name;
        this.input = input;
        this.body = body;
    }
}
