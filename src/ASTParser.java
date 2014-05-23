

import java.io.InvalidClassException;
import java.util.ArrayList;
import java.util.List;

import ast.*;
import ast.Arg;
import codeGenInput.*;
import com.sun.javaws.exceptions.InvalidArgumentException;
import implementations.ArgImpl;
import implementations.BilboImpl;
import implementations.InstanceOfBlockImpl;
import implementations.JavaOutSideBlockImpl;

/**
 * Created by vootele on 5/23/14.
 */
public class ASTParser {
    public static List<codeGenInput.Source> parseProgram (BilboAST ast) throws Exception {
        List<Source> src = new ArrayList<Source>();
        if (ast instanceof Program){
            Program b =(Program) ast;
            for (BilboAST s :b.getList()){
                parseBilboOrOutsideJava(s);
            }
        }
        return src;
    }

    private static Source parseBilboOrOutsideJava(BilboAST s) throws Exception {
        if (s instanceof OutsideJava){
            OutsideJava o = (OutsideJava) s;
            return new JavaOutSideBlockImpl(o.getValue());
        }
        else if (s instanceof BilboBlock){
            BilboBlock b = (BilboBlock) s;
            List<InstanceOfBlock> blocks = new ArrayList<InstanceOfBlock>();
            for (Line l : b.body().getLines()){
                blocks.add(parseLine(l));
            }
            codeGenInput.Input input = new implementations.InputImpl(b.getInput().getType(),b.getInput().getName());
            return new BilboImpl(b.getVisibility(),b.isStatic(),b.getType(),b.getName(),input,blocks);
        }
        throw new Exception("Invalid argument class");
    }

    private static InstanceOfBlock parseLine(Line l) throws Exception {
        List<codeGenInput.Arg> list = new ArrayList<codeGenInput.Arg>();
        if (l != null && l.getHead() !=null && l.getHead().getArgs() != null && l.getHead().getArgs().getList() != null){
            for (Arg arg : l.getHead().getArgs().getList()){
                list.add(parseArg(arg));
            }
        }
        String type = null;
        if (l.getHead() != null && l.getHead().getType() != null){
            type = l.getHead().getType();
        }
        return new InstanceOfBlockImpl(type,list,l.getJavaCode());
    }

    private static codeGenInput.Arg parseArg(Arg arg) throws Exception {
       if (arg instanceof Var){
           return new ArgImpl(arg.getPosition(),arg.getValue(),false);
       }
       else if (arg instanceof Match){
           return new ArgImpl(arg.getPosition(),arg.getValue(),true);
       }
       else {
           throw new Exception("Arg should be either Match or Var");
       }
    }
}
