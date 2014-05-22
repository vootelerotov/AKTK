package AST;

import java.util.List;

/**
 * Created by vootele on 5/22/14.
 */
public class Body extends BilboAST {
    private List<Line> lines;

    public List<Line> getLines(){
        return lines;
    }

    public Body(List<Line> lines){
        this.lines = lines;
    }

}
