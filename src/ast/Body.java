package ast;

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

    @Override
    public String toString() {
        StringBuffer representation = new StringBuffer();
        representation.append("Body{");
        representation.append("lines=");
        for (Line l : lines){
            representation.append(l);
            representation.append(" ");
        }
        representation.append('}');
        return representation.toString();
    }
}
