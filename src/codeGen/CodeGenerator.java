package codeGen;

import codeGenInput.Source;

import java.io.*;

/**
 * Created by Innar Hallik on 23.05.2014.
 */
public class CodeGenerator {

    public void generateCode(Source source){
        String new_code = null;
        // for each element in source
        //      if not outsidejava
        //          String bilbo = TranslateBilbo(element)
        //          new_code add bilbo
        //      else
        //          new_code add element

        Writer writer = null;

        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("filename.txt"), "utf-8"));
            writer.write(new_code);
        } catch (IOException ex) {
            // report
        } finally {
            try {writer.close();} catch (Exception ex) {}
        }
    }

}
