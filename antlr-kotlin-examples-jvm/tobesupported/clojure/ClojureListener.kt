// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ClojureParser}.
 */
interface ClojureListener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ClojureParser#file}.
	 * @param ctx the parse tree
	 */
	fun enterFile(ctx: ClojureParser.FileContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#file}.
	 * @param ctx the parse tree
	 */
	fun exitFile(ctx: ClojureParser.FileContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	fun enterForm(ctx: ClojureParser.FormContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	fun exitForm(ctx: ClojureParser.FormContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#forms}.
	 * @param ctx the parse tree
	 */
	fun enterForms(ctx: ClojureParser.FormsContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#forms}.
	 * @param ctx the parse tree
	 */
	fun exitForms(ctx: ClojureParser.FormsContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#list}.
	 * @param ctx the parse tree
	 */
	fun enterList(ctx: ClojureParser.ListContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#list}.
	 * @param ctx the parse tree
	 */
	fun exitList(ctx: ClojureParser.ListContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#vector}.
	 * @param ctx the parse tree
	 */
	fun enterVector(ctx: ClojureParser.VectorContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#vector}.
	 * @param ctx the parse tree
	 */
	fun exitVector(ctx: ClojureParser.VectorContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#map}.
	 * @param ctx the parse tree
	 */
	fun enterMap(ctx: ClojureParser.MapContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#map}.
	 * @param ctx the parse tree
	 */
	fun exitMap(ctx: ClojureParser.MapContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#set}.
	 * @param ctx the parse tree
	 */
	fun enterSet(ctx: ClojureParser.SetContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#set}.
	 * @param ctx the parse tree
	 */
	fun exitSet(ctx: ClojureParser.SetContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	fun enterReader_macro(ctx: ClojureParser.Reader_macroContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	fun exitReader_macro(ctx: ClojureParser.Reader_macroContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#quote}.
	 * @param ctx the parse tree
	 */
	fun enterQuote(ctx: ClojureParser.QuoteContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#quote}.
	 * @param ctx the parse tree
	 */
	fun exitQuote(ctx: ClojureParser.QuoteContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#backtick}.
	 * @param ctx the parse tree
	 */
	fun enterBacktick(ctx: ClojureParser.BacktickContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#backtick}.
	 * @param ctx the parse tree
	 */
	fun exitBacktick(ctx: ClojureParser.BacktickContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#unquote}.
	 * @param ctx the parse tree
	 */
	fun enterUnquote(ctx: ClojureParser.UnquoteContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#unquote}.
	 * @param ctx the parse tree
	 */
	fun exitUnquote(ctx: ClojureParser.UnquoteContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#unquote_splicing}.
	 * @param ctx the parse tree
	 */
	fun enterUnquote_splicing(ctx: ClojureParser.Unquote_splicingContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#unquote_splicing}.
	 * @param ctx the parse tree
	 */
	fun exitUnquote_splicing(ctx: ClojureParser.Unquote_splicingContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#tag}.
	 * @param ctx the parse tree
	 */
	fun enterTag(ctx: ClojureParser.TagContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#tag}.
	 * @param ctx the parse tree
	 */
	fun exitTag(ctx: ClojureParser.TagContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#deref}.
	 * @param ctx the parse tree
	 */
	fun enterDeref(ctx: ClojureParser.DerefContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#deref}.
	 * @param ctx the parse tree
	 */
	fun exitDeref(ctx: ClojureParser.DerefContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#gensym}.
	 * @param ctx the parse tree
	 */
	fun enterGensym(ctx: ClojureParser.GensymContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#gensym}.
	 * @param ctx the parse tree
	 */
	fun exitGensym(ctx: ClojureParser.GensymContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#lambda}.
	 * @param ctx the parse tree
	 */
	fun enterLambda(ctx: ClojureParser.LambdaContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#lambda}.
	 * @param ctx the parse tree
	 */
	fun exitLambda(ctx: ClojureParser.LambdaContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#meta_data}.
	 * @param ctx the parse tree
	 */
	fun enterMeta_data(ctx: ClojureParser.Meta_dataContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#meta_data}.
	 * @param ctx the parse tree
	 */
	fun exitMeta_data(ctx: ClojureParser.Meta_dataContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#var_quote}.
	 * @param ctx the parse tree
	 */
	fun enterVar_quote(ctx: ClojureParser.Var_quoteContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#var_quote}.
	 * @param ctx the parse tree
	 */
	fun exitVar_quote(ctx: ClojureParser.Var_quoteContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#host_expr}.
	 * @param ctx the parse tree
	 */
	fun enterHost_expr(ctx: ClojureParser.Host_exprContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#host_expr}.
	 * @param ctx the parse tree
	 */
	fun exitHost_expr(ctx: ClojureParser.Host_exprContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#discard}.
	 * @param ctx the parse tree
	 */
	fun enterDiscard(ctx: ClojureParser.DiscardContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#discard}.
	 * @param ctx the parse tree
	 */
	fun exitDiscard(ctx: ClojureParser.DiscardContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#dispatch}.
	 * @param ctx the parse tree
	 */
	fun enterDispatch(ctx: ClojureParser.DispatchContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#dispatch}.
	 * @param ctx the parse tree
	 */
	fun exitDispatch(ctx: ClojureParser.DispatchContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#regex}.
	 * @param ctx the parse tree
	 */
	fun enterRegex(ctx: ClojureParser.RegexContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#regex}.
	 * @param ctx the parse tree
	 */
	fun exitRegex(ctx: ClojureParser.RegexContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	fun enterLiteral(ctx: ClojureParser.LiteralContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	fun exitLiteral(ctx: ClojureParser.LiteralContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#string}.
	 * @param ctx the parse tree
	 */
	fun enterString(ctx: ClojureParser.StringContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#string}.
	 * @param ctx the parse tree
	 */
	fun exitString(ctx: ClojureParser.StringContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#hex}.
	 * @param ctx the parse tree
	 */
	fun enterHex(ctx: ClojureParser.HexContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#hex}.
	 * @param ctx the parse tree
	 */
	fun exitHex(ctx: ClojureParser.HexContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#bin}.
	 * @param ctx the parse tree
	 */
	fun enterBin(ctx: ClojureParser.BinContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#bin}.
	 * @param ctx the parse tree
	 */
	fun exitBin(ctx: ClojureParser.BinContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#bign}.
	 * @param ctx the parse tree
	 */
	fun enterBign(ctx: ClojureParser.BignContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#bign}.
	 * @param ctx the parse tree
	 */
	fun exitBign(ctx: ClojureParser.BignContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 */
	fun enterNumber(ctx: ClojureParser.NumberContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 */
	fun exitNumber(ctx: ClojureParser.NumberContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#character}.
	 * @param ctx the parse tree
	 */
	fun enterCharacter(ctx: ClojureParser.CharacterContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#character}.
	 * @param ctx the parse tree
	 */
	fun exitCharacter(ctx: ClojureParser.CharacterContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#named_char}.
	 * @param ctx the parse tree
	 */
	fun enterNamed_char(ctx: ClojureParser.Named_charContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#named_char}.
	 * @param ctx the parse tree
	 */
	fun exitNamed_char(ctx: ClojureParser.Named_charContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#any_char}.
	 * @param ctx the parse tree
	 */
	fun enterAny_char(ctx: ClojureParser.Any_charContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#any_char}.
	 * @param ctx the parse tree
	 */
	fun exitAny_char(ctx: ClojureParser.Any_charContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#u_hex_quad}.
	 * @param ctx the parse tree
	 */
	fun enterU_hex_quad(ctx: ClojureParser.U_hex_quadContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#u_hex_quad}.
	 * @param ctx the parse tree
	 */
	fun exitU_hex_quad(ctx: ClojureParser.U_hex_quadContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#nil}.
	 * @param ctx the parse tree
	 */
	fun enterNil(ctx: ClojureParser.NilContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#nil}.
	 * @param ctx the parse tree
	 */
	fun exitNil(ctx: ClojureParser.NilContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#keyword}.
	 * @param ctx the parse tree
	 */
	fun enterKeyword(ctx: ClojureParser.KeywordContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#keyword}.
	 * @param ctx the parse tree
	 */
	fun exitKeyword(ctx: ClojureParser.KeywordContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#simple_keyword}.
	 * @param ctx the parse tree
	 */
	fun enterSimple_keyword(ctx: ClojureParser.Simple_keywordContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#simple_keyword}.
	 * @param ctx the parse tree
	 */
	fun exitSimple_keyword(ctx: ClojureParser.Simple_keywordContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#macro_keyword}.
	 * @param ctx the parse tree
	 */
	fun enterMacro_keyword(ctx: ClojureParser.Macro_keywordContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#macro_keyword}.
	 * @param ctx the parse tree
	 */
	fun exitMacro_keyword(ctx: ClojureParser.Macro_keywordContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 */
	fun enterSymbol(ctx: ClojureParser.SymbolContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 */
	fun exitSymbol(ctx: ClojureParser.SymbolContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#simple_sym}.
	 * @param ctx the parse tree
	 */
	fun enterSimple_sym(ctx: ClojureParser.Simple_symContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#simple_sym}.
	 * @param ctx the parse tree
	 */
	fun exitSimple_sym(ctx: ClojureParser.Simple_symContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#ns_symbol}.
	 * @param ctx the parse tree
	 */
	fun enterNs_symbol(ctx: ClojureParser.Ns_symbolContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#ns_symbol}.
	 * @param ctx the parse tree
	 */
	fun exitNs_symbol(ctx: ClojureParser.Ns_symbolContext)
	/**
	 * Enter a parse tree produced by {@link ClojureParser#param_name}.
	 * @param ctx the parse tree
	 */
	fun enterParam_name(ctx: ClojureParser.Param_nameContext)
	/**
	 * Exit a parse tree produced by {@link ClojureParser#param_name}.
	 * @param ctx the parse tree
	 */
	fun exitParam_name(ctx: ClojureParser.Param_nameContext)
}