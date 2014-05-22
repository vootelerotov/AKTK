package AST;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vootele on 5/22/14.
 */
public class Program extends BilboAST {
    private List<BilboAST> list = new ArrayList<BilboAST>();

    public List<BilboAST> getList(){
        return list;
    }

    public Program(List<BilboAST> list){
        this.list = list;
    }
}
