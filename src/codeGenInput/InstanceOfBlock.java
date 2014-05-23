package codeGenInput;



import java.util.List;

/**
 * Created by vootele on 5/22/14.
 */
public interface InstanceOfBlock {



    public String getInstanceType(); // null if bottom

    public List<Arg> getArgs(); // empty list if non present

    public String getJava();
}
