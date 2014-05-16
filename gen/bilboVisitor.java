// Generated from /home/vootele/AKTK/AKTK/src/bilbo.g4 by ANTLR 4.x
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link bilboParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface bilboVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link bilboParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(@NotNull bilboParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link bilboParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(@NotNull bilboParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link bilboParser#trree}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrree(@NotNull bilboParser.TrreeContext ctx);
	/**
	 * Visit a parse tree produced by {@link bilboParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(@NotNull bilboParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link bilboParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(@NotNull bilboParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link bilboParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull bilboParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link bilboParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(@NotNull bilboParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link bilboParser#java}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava(@NotNull bilboParser.JavaContext ctx);
	/**
	 * Visit a parse tree produced by {@link bilboParser#match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch(@NotNull bilboParser.MatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link bilboParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull bilboParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link bilboParser#head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHead(@NotNull bilboParser.HeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link bilboParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(@NotNull bilboParser.HeaderContext ctx);
}