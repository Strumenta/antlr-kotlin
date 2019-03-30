// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link clfParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
interface clfVisitor<T> : ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link clfParser#log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLog(ctx : clfParser.LogContext) : T
	/**
	 * Visit a parse tree produced by {@link clfParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLine(ctx : clfParser.LineContext) : T
	/**
	 * Visit a parse tree produced by {@link clfParser#host}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitHost(ctx : clfParser.HostContext) : T
	/**
	 * Visit a parse tree produced by {@link clfParser#logname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLogname(ctx : clfParser.LognameContext) : T
	/**
	 * Visit a parse tree produced by {@link clfParser#username}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUsername(ctx : clfParser.UsernameContext) : T
	/**
	 * Visit a parse tree produced by {@link clfParser#datetimetz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDatetimetz(ctx : clfParser.DatetimetzContext) : T
	/**
	 * Visit a parse tree produced by {@link clfParser#referer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReferer(ctx : clfParser.RefererContext) : T
	/**
	 * Visit a parse tree produced by {@link clfParser#request}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRequest(ctx : clfParser.RequestContext) : T
	/**
	 * Visit a parse tree produced by {@link clfParser#useragent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUseragent(ctx : clfParser.UseragentContext) : T
	/**
	 * Visit a parse tree produced by {@link clfParser#statuscode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStatuscode(ctx : clfParser.StatuscodeContext) : T
	/**
	 * Visit a parse tree produced by {@link clfParser#bytes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBytes(ctx : clfParser.BytesContext) : T
}