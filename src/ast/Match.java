package ast;

/**
 * Created by vootele on 5/22/14.
 */
public class Match extends Arg {

    String value;

    public String getValue(){
        return value;
    }

    public Match(String value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "Match{" +
                "value='" + value + '\'' +
                '}';
    }
}
