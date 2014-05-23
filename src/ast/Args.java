package ast;

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

    @Override
    public String toString() {
        StringBuffer r = new StringBuffer();
        r.append("Args{");
        r.append("list=");
        for (Arg a : list){
            r.append(a);
            r.append(" ");
        }
        r.append('}');
        return r.toString();
    }
}
