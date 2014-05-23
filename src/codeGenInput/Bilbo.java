package codeGenInput;

import java.util.List;

/**
 * Created by vootele on 5/22/14.
 */
public interface Bilbo extends Source {

    public String getMethodType();

    public Input getInput();

    public String getVisibility();

    public Boolean hasVisibility();

    public String getName();

    public Boolean isStatic();

    public List<InstanceOfBlock> getInstancesOfBlocks();

}
