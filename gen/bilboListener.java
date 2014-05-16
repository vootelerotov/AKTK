// Generated from /home/vootele/AKTK/AKTK/src/bilbo.g4 by ANTLR 4.x
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link bilboParser}.
 */
public interface bilboListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link bilboParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(@NotNull bilboParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link bilboParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(@NotNull bilboParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link bilboParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(@NotNull bilboParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link bilboParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(@NotNull bilboParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link bilboParser#trree}.
	 * @param ctx the parse tree
	 */
	void enterTrree(@NotNull bilboParser.TrreeContext ctx);
	/**
	 * Exit a parse tree produced by {@link bilboParser#trree}.
	 * @param ctx the parse tree
	 */
	void exitTrree(@NotNull bilboParser.TrreeContext ctx);
	/**
	 * Enter a parse tree produced by {@link bilboParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull bilboParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link bilboParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull bilboParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link bilboParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(@NotNull bilboParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link bilboParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(@NotNull bilboParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link bilboParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull bilboParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link bilboParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull bilboParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link bilboParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(@NotNull bilboParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link bilboParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(@NotNull bilboParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link bilboParser#java}.
	 * @param ctx the parse tree
	 */
	void enterJava(@NotNull bilboParser.JavaContext ctx);
	/**
	 * Exit a parse tree produced by {@link bilboParser#java}.
	 * @param ctx the parse tree
	 */
	void exitJava(@NotNull bilboParser.JavaContext ctx);
	/**
	 * Enter a parse tree produced by {@link bilboParser#match}.
	 * @param ctx the parse tree
	 */
	void enterMatch(@NotNull bilboParser.MatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link bilboParser#match}.
	 * @param ctx the parse tree
	 */
	void exitMatch(@NotNull bilboParser.MatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link bilboParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull bilboParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link bilboParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull bilboParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link bilboParser#head}.
	 * @param ctx the parse tree
	 */
	void enterHead(@NotNull bilboParser.HeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link bilboParser#head}.
	 * @param ctx the parse tree
	 */
	void exitHead(@NotNull bilboParser.HeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link bilboParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(@NotNull bilboParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link bilboParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(@NotNull bilboParser.HeaderContext ctx);
}