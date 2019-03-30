// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.AbstractParseTreeVisitor

/**
 * This class provides an empty implementation of {@link ClojureVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
open class ClojureBaseVisitor<T> : AbstractParseTreeVisitor<T>(), ClojureVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitFile(ctx : ClojureParser.FileContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitForm(ctx : ClojureParser.FormContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitForms(ctx : ClojureParser.FormsContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitList(ctx : ClojureParser.ListContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitVector(ctx : ClojureParser.VectorContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitMap(ctx : ClojureParser.MapContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitSet(ctx : ClojureParser.SetContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitReader_macro(ctx : ClojureParser.Reader_macroContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitQuote(ctx : ClojureParser.QuoteContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitBacktick(ctx : ClojureParser.BacktickContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitUnquote(ctx : ClojureParser.UnquoteContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitUnquote_splicing(ctx : ClojureParser.Unquote_splicingContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitTag(ctx : ClojureParser.TagContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitDeref(ctx : ClojureParser.DerefContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitGensym(ctx : ClojureParser.GensymContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitLambda(ctx : ClojureParser.LambdaContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitMeta_data(ctx : ClojureParser.Meta_dataContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitVar_quote(ctx : ClojureParser.Var_quoteContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitHost_expr(ctx : ClojureParser.Host_exprContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitDiscard(ctx : ClojureParser.DiscardContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitDispatch(ctx : ClojureParser.DispatchContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitRegex(ctx : ClojureParser.RegexContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitLiteral(ctx : ClojureParser.LiteralContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitString(ctx : ClojureParser.StringContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitHex(ctx : ClojureParser.HexContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitBin(ctx : ClojureParser.BinContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitBign(ctx : ClojureParser.BignContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitNumber(ctx : ClojureParser.NumberContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitCharacter(ctx : ClojureParser.CharacterContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitNamed_char(ctx : ClojureParser.Named_charContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitAny_char(ctx : ClojureParser.Any_charContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitU_hex_quad(ctx : ClojureParser.U_hex_quadContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitNil(ctx : ClojureParser.NilContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitKeyword(ctx : ClojureParser.KeywordContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitSimple_keyword(ctx : ClojureParser.Simple_keywordContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitMacro_keyword(ctx : ClojureParser.Macro_keywordContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitSymbol(ctx : ClojureParser.SymbolContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitSimple_sym(ctx : ClojureParser.Simple_symContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitNs_symbol(ctx : ClojureParser.Ns_symbolContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitParam_name(ctx : ClojureParser.Param_nameContext ) : T { return this!!.visitChildren(ctx)!! }
}