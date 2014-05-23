package implementations;

import codeGenInput.Arg;

/**
 * Created by vootele on 5/23/14.
 */
public class ArgImpl implements Arg {

    private int pos;
    private String value;
    private boolean match;

    @Override
    public int getPosition() {
        return pos;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public boolean isMatch() {
        return match;
    }

    public ArgImpl(int pos, String value, boolean match){
        this.pos = pos;
        this.value = value;
        this.match = match;
    }
}
