// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link cookieParser}.
 */
interface cookieListener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link cookieParser#cookie}.
	 * @param ctx the parse tree
	 */
	fun enterCookie(ctx: cookieParser.CookieContext)
	/**
	 * Exit a parse tree produced by {@link cookieParser#cookie}.
	 * @param ctx the parse tree
	 */
	fun exitCookie(ctx: cookieParser.CookieContext)
	/**
	 * Enter a parse tree produced by {@link cookieParser#name}.
	 * @param ctx the parse tree
	 */
	fun enterName(ctx: cookieParser.NameContext)
	/**
	 * Exit a parse tree produced by {@link cookieParser#name}.
	 * @param ctx the parse tree
	 */
	fun exitName(ctx: cookieParser.NameContext)
	/**
	 * Enter a parse tree produced by {@link cookieParser#av_pairs}.
	 * @param ctx the parse tree
	 */
	fun enterAv_pairs(ctx: cookieParser.Av_pairsContext)
	/**
	 * Exit a parse tree produced by {@link cookieParser#av_pairs}.
	 * @param ctx the parse tree
	 */
	fun exitAv_pairs(ctx: cookieParser.Av_pairsContext)
	/**
	 * Enter a parse tree produced by {@link cookieParser#av_pair}.
	 * @param ctx the parse tree
	 */
	fun enterAv_pair(ctx: cookieParser.Av_pairContext)
	/**
	 * Exit a parse tree produced by {@link cookieParser#av_pair}.
	 * @param ctx the parse tree
	 */
	fun exitAv_pair(ctx: cookieParser.Av_pairContext)
	/**
	 * Enter a parse tree produced by {@link cookieParser#attr}.
	 * @param ctx the parse tree
	 */
	fun enterAttr(ctx: cookieParser.AttrContext)
	/**
	 * Exit a parse tree produced by {@link cookieParser#attr}.
	 * @param ctx the parse tree
	 */
	fun exitAttr(ctx: cookieParser.AttrContext)
	/**
	 * Enter a parse tree produced by {@link cookieParser#value}.
	 * @param ctx the parse tree
	 */
	fun enterValue(ctx: cookieParser.ValueContext)
	/**
	 * Exit a parse tree produced by {@link cookieParser#value}.
	 * @param ctx the parse tree
	 */
	fun exitValue(ctx: cookieParser.ValueContext)
	/**
	 * Enter a parse tree produced by {@link cookieParser#word}.
	 * @param ctx the parse tree
	 */
	fun enterWord(ctx: cookieParser.WordContext)
	/**
	 * Exit a parse tree produced by {@link cookieParser#word}.
	 * @param ctx the parse tree
	 */
	fun exitWord(ctx: cookieParser.WordContext)
	/**
	 * Enter a parse tree produced by {@link cookieParser#token}.
	 * @param ctx the parse tree
	 */
	fun enterToken(ctx: cookieParser.TokenContext)
	/**
	 * Exit a parse tree produced by {@link cookieParser#token}.
	 * @param ctx the parse tree
	 */
	fun exitToken(ctx: cookieParser.TokenContext)
	/**
	 * Enter a parse tree produced by {@link cookieParser#quoted_string}.
	 * @param ctx the parse tree
	 */
	fun enterQuoted_string(ctx: cookieParser.Quoted_stringContext)
	/**
	 * Exit a parse tree produced by {@link cookieParser#quoted_string}.
	 * @param ctx the parse tree
	 */
	fun exitQuoted_string(ctx: cookieParser.Quoted_stringContext)
}