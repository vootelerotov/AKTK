package AST;

import Interfaces.JavaOutSideBlock;

/**
 * Created by vootele on 5/22/14.
 */
public class OutsideJava extends BilboAST {

    private String val;

    public OutsideJava(String val){
        this.val = val;
    }

    public String getValue(){
        return val;
    }
}
