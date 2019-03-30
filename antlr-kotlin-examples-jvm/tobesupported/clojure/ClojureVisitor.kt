// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ClojureParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
interface ClojureVisitor<T> : ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ClojureParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFile(ctx : ClojureParser.FileContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitForm(ctx : ClojureParser.FormContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#forms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitForms(ctx : ClojureParser.FormsContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitList(ctx : ClojureParser.ListContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitVector(ctx : ClojureParser.VectorContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMap(ctx : ClojureParser.MapContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSet(ctx : ClojureParser.SetContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReader_macro(ctx : ClojureParser.Reader_macroContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#quote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitQuote(ctx : ClojureParser.QuoteContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#backtick}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBacktick(ctx : ClojureParser.BacktickContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#unquote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnquote(ctx : ClojureParser.UnquoteContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#unquote_splicing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnquote_splicing(ctx : ClojureParser.Unquote_splicingContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTag(ctx : ClojureParser.TagContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#deref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDeref(ctx : ClojureParser.DerefContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#gensym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGensym(ctx : ClojureParser.GensymContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#lambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLambda(ctx : ClojureParser.LambdaContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#meta_data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMeta_data(ctx : ClojureParser.Meta_dataContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#var_quote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitVar_quote(ctx : ClojureParser.Var_quoteContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#host_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitHost_expr(ctx : ClojureParser.Host_exprContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#discard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDiscard(ctx : ClojureParser.DiscardContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#dispatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDispatch(ctx : ClojureParser.DispatchContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#regex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRegex(ctx : ClojureParser.RegexContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLiteral(ctx : ClojureParser.LiteralContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitString(ctx : ClojureParser.StringContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#hex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitHex(ctx : ClojureParser.HexContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#bin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBin(ctx : ClojureParser.BinContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#bign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBign(ctx : ClojureParser.BignContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNumber(ctx : ClojureParser.NumberContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCharacter(ctx : ClojureParser.CharacterContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#named_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNamed_char(ctx : ClojureParser.Named_charContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#any_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAny_char(ctx : ClojureParser.Any_charContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#u_hex_quad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitU_hex_quad(ctx : ClojureParser.U_hex_quadContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#nil}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNil(ctx : ClojureParser.NilContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitKeyword(ctx : ClojureParser.KeywordContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#simple_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSimple_keyword(ctx : ClojureParser.Simple_keywordContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#macro_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMacro_keyword(ctx : ClojureParser.Macro_keywordContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSymbol(ctx : ClojureParser.SymbolContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#simple_sym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSimple_sym(ctx : ClojureParser.Simple_symContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#ns_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNs_symbol(ctx : ClojureParser.Ns_symbolContext) : T
	/**
	 * Visit a parse tree produced by {@link ClojureParser#param_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitParam_name(ctx : ClojureParser.Param_nameContext) : T
}