package codeGen;

import codeGenInput.Bilbo;
import codeGenInput.InstanceOfBlock;

import java.util.List;

/**
 * Created by Innar Hallik on 23.05.2014.
 */
public class BilboTranslator {
    public String TranslateBilbo(Bilbo bilboBlock){
        String bilbo = null;
        if (bilboBlock.hasVisibility() != null){
            bilbo += new String(bilboBlock.getVisibility()+' ');
        }
        if (bilboBlock.isStatic()){
            bilbo += "static ";
        }
        bilbo += bilboBlock.getMethodType();
        bilbo += bilboBlock.getName();
        bilbo += new String("(" + bilboBlock.getInput() +"){");

        bilbo += TeanslateBlocks(bilboBlock.getInstancesOfBlocks());

        bilbo += '}';
        return bilbo;
    }

    private String TeanslateBlocks(List<InstanceOfBlock> Blocks) {
        String oneRing = null;
        for(InstanceOfBlock block: Blocks){
            //bilbo to instanceOf style
        }

        return oneRing;
    }

}
