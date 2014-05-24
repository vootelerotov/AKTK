package implementations;

import codeGenInput.JavaOutSideBlock;

/**
 * Created by vootele on 5/23/14.
 */
public class JavaOutSideBlockImpl implements JavaOutSideBlock {

    private String val;

    @Override
    public String getValue() {
        return val;
    }

    public JavaOutSideBlockImpl(String val){
        this.val = val;
    }
}
