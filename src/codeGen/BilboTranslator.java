package codeGen;

import codeGenInput.Bilbo;
import codeGenInput.InstanceOfBlock;

import java.util.List;

/**
 * Created by Innar Hallik on 23.05.2014.
 */
public class BilboTranslator {
    public String TranslateBilbo(Bilbo bilboBlock) throws notSupportedMethodException {
        String bilbo = null;
        if (bilboBlock.hasVisibility() != null){
            bilbo += bilboBlock.getVisibility()+' ';
        }
        if (bilboBlock.isStatic()){
            bilbo += "static ";
        }
        else{
            throw new notSupportedMethodException("Non static methods not yet supported for Bilbo");
        }
        bilbo += bilboBlock.getMethodType() + ' ';
        bilbo += bilboBlock.getName();
        bilbo += "(" + bilboBlock.getInput() + "){" + '\n';
        bilbo += TeanslateBlocks(bilboBlock.getInstancesOfBlocks(),bilboBlock.getInput().getName());
        bilbo += '}';
        return bilbo;
    }

    private String TeanslateBlocks(List<InstanceOfBlock> Blocks,String treeName) {
        String oneRing = null;
        for(InstanceOfBlock block: Blocks){
            //bilbo to instanceOf style
            String statment= null;
            statment += "if (" + treeName +" instanceof "+block.getInstanceType()+ "){" +'\n';

            statment += "}";
        }

        return oneRing;
    }

    private class notSupportedMethodException extends Throwable {
        public notSupportedMethodException(String s) {
        }
    }
}
