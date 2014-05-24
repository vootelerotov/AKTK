package codeGen;

import codeGenInput.Bilbo;
import codeGenInput.JavaOutSideBlock;
import codeGenInput.Source;

import java.io.*;
import java.util.List;

/**
 * Created by Innar Hallik on 23.05.2014.
 */
public class CodeGenerator {

    public static void generateCode(List<Source> sourceList, String fileName) throws NotSupportedMethodException {
        StringBuffer new_code = new StringBuffer();
        int i = 0;
        for (Source s : sourceList){
            if (s instanceof JavaOutSideBlock){
                JavaOutSideBlock jb = (JavaOutSideBlock) s;
                new_code.append(jb.getValue());
            }
            else if (s instanceof Bilbo){
                Bilbo b = (Bilbo) s;
                BilboTranslator bt = new BilboTranslator(b,i++);
                new_code.append(bt.getCode());
            }

        }
        // for each element in source
        //      if not outsidejava
        //          String bilbo = TranslateBilbo(element)
        //          new_code add bilbo
        //      else
        //          new_code add element

        Writer writer = null;

        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(fileName), "utf-8"));
            writer.write(new_code.toString());
        } catch (IOException ex) {
            // report
        } finally {
            try {writer.close();} catch (Exception ex) {}
        }
    }

}
