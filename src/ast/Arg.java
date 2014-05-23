package ast;

/**
 * Created by vootele on 5/22/14.
 */
abstract public class Arg extends BilboAST{

    protected int pos;

    public void setPosition(int pos) {
        this.pos = pos;
    }

    public int getPosition(){
        return pos;
    }

    abstract public String getValue();


}
