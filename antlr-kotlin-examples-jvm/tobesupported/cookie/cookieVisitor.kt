// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link cookieParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
interface cookieVisitor<T> : ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link cookieParser#cookie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCookie(ctx : cookieParser.CookieContext) : T
	/**
	 * Visit a parse tree produced by {@link cookieParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitName(ctx : cookieParser.NameContext) : T
	/**
	 * Visit a parse tree produced by {@link cookieParser#av_pairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAv_pairs(ctx : cookieParser.Av_pairsContext) : T
	/**
	 * Visit a parse tree produced by {@link cookieParser#av_pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAv_pair(ctx : cookieParser.Av_pairContext) : T
	/**
	 * Visit a parse tree produced by {@link cookieParser#attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAttr(ctx : cookieParser.AttrContext) : T
	/**
	 * Visit a parse tree produced by {@link cookieParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitValue(ctx : cookieParser.ValueContext) : T
	/**
	 * Visit a parse tree produced by {@link cookieParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitWord(ctx : cookieParser.WordContext) : T
	/**
	 * Visit a parse tree produced by {@link cookieParser#token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitToken(ctx : cookieParser.TokenContext) : T
	/**
	 * Visit a parse tree produced by {@link cookieParser#quoted_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitQuoted_string(ctx : cookieParser.Quoted_stringContext) : T
}