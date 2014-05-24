package implementations;

/**
 * Created by vootele on 5/23/14.
 */
public class InputImpl implements codeGenInput.Input {

    private String type;
    private String name;

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    public InputImpl(String type, String name){
        this.type = type;
        this.name = name;
    }
}
