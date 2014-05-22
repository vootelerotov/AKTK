package AST;

import java.util.List;

/**
 * Created by vootele on 5/22/14.
 */
public class Args extends BilboAST {
    List<Arg> list;

    public List<Arg> getList(){
        return this.list;
    }

    public Args(List<Arg> list){
        this.list = list;
    }
}
