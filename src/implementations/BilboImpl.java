package implementations;

import java.util.List;
import codeGenInput.*;

/**
 * Created by vootele on 5/23/14.
 */
public class BilboImpl implements Bilbo {

    private String type;
    private Input input;
    private String visibility;
    private String name;
    private boolean isStatic;
    private List<InstanceOfBlock> blocks;

    public BilboImpl(String visibility, boolean isStatic, String type, String name, Input input, List<InstanceOfBlock> blocks) {
        this.type = type;
        this.input = input;
        this.visibility = visibility;
        this.name = name;
        this.isStatic = isStatic;
        this.blocks = blocks;
    }

    @Override
    public String getMethodType() {
        return type;
    }

    @Override
    public Input getInput() {
        return input;
    }

    @Override
    public String getVisibility() {
        return visibility;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Boolean getStatic() {
        return isStatic;
    }

    @Override
    public List<InstanceOfBlock> getInstancesOfBlocks() {
        return blocks;
    }
}
