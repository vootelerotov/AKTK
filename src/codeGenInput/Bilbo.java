package codeGenInput;

import java.util.List;

/**
 * Created by vootele on 5/22/14.
 */
public interface Bilbo extends Source {

    public String getMethodType();

    public Input getInput();

    public String getVisibility();

    public String getName();

    public Boolean getStatic();

    public List<InstanceOfBlock> getInstancesOfBlocks();

}
