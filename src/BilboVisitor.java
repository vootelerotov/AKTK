import AST.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vootele on 5/22/14.
 */
public class BilboVisitor extends BilboParserBaseVisitor<BilboAST>{

    @Override
    public BilboAST visitSource(@NotNull BilboParser.SourceContext ctx){
        List<BilboAST> list = new ArrayList<BilboAST>();
        for (ParseTree c : ctx.children ){
            list.add(visit(c));
        }
        return new Program(list);
    };

    @Override
    public BilboAST visitNonFinalOutsideBlock(@NotNull BilboParser.NonFinalOutsideBlockContext ctx) {
        return new AST.OutsideJava(ctx.JavaBlockOutSide().getText().substring(
                0,ctx.JavaBlockOutSide().getText().length()-BilboConstants.ANNOTATION.length()));
    }

    @Override
    public BilboAST visitFinalOutsideBlock(@NotNull BilboParser.FinalOutsideBlockContext ctx) {
        return new OutsideJava(ctx.FinalJavaBlock().getText());
    }

    @Override
    public BilboAST visitHeader(@NotNull BilboParser.HeaderContext ctx ){
        String visibility;
        if (ctx.Visibility() == null){
            visibility = null;
        }
        else{
            visibility = ctx.Visibility().getText();
        }

        return new BilboBlock(visibility,ctx.Static().getText().equals("static"),ctx.type(0).TypeName().getText(),ctx.nimi(0).Name().getText(),
                new Input(ctx.type(1).TypeName().getText(),ctx.nimi(1).Name().getText()), (Body) visit(ctx.body()) );
    }

    @Override
    public BilboAST visitBody(@NotNull BilboParser.BodyContext ctx){
        List<Line> lines = new ArrayList<Line>();
        for (BilboParser.LineContext c : ctx.line()){
            lines.add((Line) visit(c));
        }
        return new Body(lines);
    }

    @Override
    public BilboAST visitLine(@NotNull BilboParser.LineContext ctx){
        BilboAST head = visit(ctx.head());
        if (head instanceof Bottom){
            return new Line(null, ctx.java().JavaBlock().getText());
        }
        else{
            return new Line((Head) head, ctx.java().JavaBlock().getText());
        }

    }

    @Override
    public BilboAST visitHeadWithType(@NotNull BilboParser.HeadWithTypeContext ctx){
        if (ctx.args() == null){
            return new Head(ctx.type().TypeName().getText(),null);
        }
        else{
            return new Head(ctx.type().TypeName().getText(),(Args) visit(ctx.args()));
        }

    }

    @Override
    public BilboAST visitBottom(BilboParser.BottomContext ctx){
        return new Bottom();
    }

    @Override
    public BilboAST visitArgs(@NotNull BilboParser.ArgsContext ctx){
        List<Arg> list = new ArrayList<Arg>();
        int counter= 0;
        for (BilboParser.ArgContext c : ctx.arg()){
            Arg arg = (Arg) visit(c);
            arg.setPosition(counter++);
            list.add(arg);

        }
        return new Args(list);
    }

    @Override
    public BilboAST visitVarArg(@NotNull BilboParser.VarArgContext ctx){
        return new Var(ctx.var().Name().getText());
    }


    /*
    Not supporting int at the moment, although grammar does!
     */
    @Override
    public BilboAST visitVarMatch(@NotNull BilboParser.VarMatchContext ctx){
        return new Match(ctx.match().String().getText());
    }

}
