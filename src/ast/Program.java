package ast;

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

    public String toString(){
        StringBuffer representation = new StringBuffer();
        representation.append("Program{");
        representation.append("list=");
        for (BilboAST l : list){
        representation.append(l);
        representation.append(" ");
        }
        representation.append('}');
        return representation.toString();
    }
}