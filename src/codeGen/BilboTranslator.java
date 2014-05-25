package codeGen;

import codeGenInput.Arg;
import codeGenInput.Bilbo;
import codeGenInput.InstanceOfBlock;

/**
 * Created by Innar Hallik on 23.05.2014.
 */
public class BilboTranslator {

    private Bilbo b;
    private StringBuffer code;
    private int number;

    public StringBuffer getCode() {
        return code;
    }


    public BilboTranslator(Bilbo b, int number) throws NotSupportedMethodException {
        this.b = b;
        this.code = new StringBuffer();
        this.number = number;

        startInnerClass();
        generateStaticFieldForInput();
        generateMethodsForInsideJava();
        generateMainMethod();
        closeInnerClass();
        generateHookToStaticClass();
    }

    private void generateMainMethod() throws NotSupportedMethodException {

        if (b.hasVisibility() != null){
            code.append(' ');
        }
        if (b.isStatic()){
            code.append("static ");
        }
        else{
            throw new NotSupportedMethodException("Non static methods not yet supported for Bilbo");
        }
        code.append(b.getMethodType());
        code.append(" ");
        code.append(b.getName());
        code.append(" ( ");
        code.append(b.getInput().getType());
        code.append(" ");
        code.append(b.getInput().getName());
        code.append( "){ \n");
        assignArgumentToClassField();
        int i= 0;
        for (InstanceOfBlock block : b.getInstancesOfBlocks()){
            generateInstanceIf(block,i++);
        }
        code.append('}');

    }

    private void assignArgumentToClassField() {
        code.append("Bilbo");
        code.append(number);
        code.append(".");
        code.append(b.getInput().getName());
        code.append("=");
        code.append(b.getInput().getName());
        code.append("; \n");
    }

    private void generateInstanceIf(InstanceOfBlock block, int i) {
        code.append("\n");
        if (block.getInstanceType() != null){
            code.append("if ( ");
            code.append(b.getInput().getName());
            code.append(" instanceof ");
            code.append(block.getInstanceType());
            code.append(" ");
            for (Arg arg : block.getArgs()){
                generateArgMatch(arg);
            }
            code.append(")");
        }
        code.append("{\n");
        code.append("return method");
        code.append(i);
        code.append("( ");
        for (Arg arg : block.getArgs()){
            generateArgValues(arg);
        }
        code.setLength(code.length() -1); //last comma;
        code.append(" );");
        code.append("}\n");

    }

    private void generateArgValues(Arg arg) {
        if (!arg.isMatch()){
            code.append(" ");
            code.append(b.getInput().getName());
            code.append(".getChild(");
            code.append(arg.getPosition());
            code.append("),");
        }
    }

    private void generateArgMatch(Arg arg) {
        if (arg.isMatch()){
            code.append("&& ");
            code.append(b.getInput().getName());
            code.append(".getChild(");
            code.append(arg.getPosition());
            code.append(").getText().equals(");
            code.append(arg.getValue());
            code.append(") ");
        }
    }

    private void startInnerClass(){
        code.append("private static class Bilbo");
        code.append(number);
        code.append(" {\n");
    }

    private void closeInnerClass(){
        code.append("\n } \n");
    }

    private void generateMethodsForInsideJava(){
        int i = 0;
        for (InstanceOfBlock block : b.getInstancesOfBlocks()){
            generateMethodForInsideJava(block,i++);
        }
    }

    private void generateMethodForInsideJava(InstanceOfBlock block, int i){
        code.append("private static ");
        code.append(b.getMethodType());
        code.append(" method");
        code.append(i);
        code.append("( ");
        for (Arg arg : block.getArgs()){
            generateArg(arg);
        }
        code.setLength(code.length() - 1); // Remove last coma
        code.append(" )");
        code.append(block.getJava());
        code.append("\n");
    }

    private void generateArg(Arg arg){
        if (!arg.isMatch()){
            code.append(" ");
            code.append(b.getInput().getType());
            code.append(" ");
            code.append(arg.getValue());
            code.append(",");
        }
    }

    private void generateStaticFieldForInput(){
        code.append("private static ");
        code.append(b.getInput().getType());
        code.append(" ");
        code.append(b.getInput().getName());
        code.append("; \n");
    }

    private void generateHookToStaticClass() throws NotSupportedMethodException {
        if (b.hasVisibility()){
            code.append(b.getVisibility());
            code.append(" ");
        }
        if (b.isStatic()){
            code.append("static ");
        }
        else{
             throw new NotSupportedMethodException("Only static supported currently");
        }
        code.append(b.getMethodType());
        code.append(" ");
        code.append(b.getName());
        code.append(" ( ");
        code.append(b.getInput().getType());
        code.append(" ");
        code.append(b.getInput().getName());
        code.append(" ) {\n");
        code.append("return Bilbo");
        code.append(number);
        code.append(".");
        code.append(b.getName());
        code.append("(");
        code.append(b.getInput().getName());
        code.append(");\n");
        code.append("}");
    }


}
