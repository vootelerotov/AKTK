package implementations;

import codeGenInput.Arg;
import codeGenInput.InstanceOfBlock;

import java.util.List;

/**
 * Created by vootele on 5/23/14.
 */
public class InstanceOfBlockImpl implements InstanceOfBlock {

    private String type;
    private String java;
    private List<Arg> list;

    @Override
    public String getInstanceType() {
        return type;
    }

    @Override
    public List<Arg> getArgs() {
        return list;
    }

    @Override
    public String getJava() {
        return java;
    }

    public InstanceOfBlockImpl(String type, List<Arg> list, String java){
        this.type = type;
        this.list = list;
        this.java = java;
    }
}
