// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link clfParser}.
 */
interface clfListener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link clfParser#log}.
	 * @param ctx the parse tree
	 */
	fun enterLog(ctx: clfParser.LogContext)
	/**
	 * Exit a parse tree produced by {@link clfParser#log}.
	 * @param ctx the parse tree
	 */
	fun exitLog(ctx: clfParser.LogContext)
	/**
	 * Enter a parse tree produced by {@link clfParser#line}.
	 * @param ctx the parse tree
	 */
	fun enterLine(ctx: clfParser.LineContext)
	/**
	 * Exit a parse tree produced by {@link clfParser#line}.
	 * @param ctx the parse tree
	 */
	fun exitLine(ctx: clfParser.LineContext)
	/**
	 * Enter a parse tree produced by {@link clfParser#host}.
	 * @param ctx the parse tree
	 */
	fun enterHost(ctx: clfParser.HostContext)
	/**
	 * Exit a parse tree produced by {@link clfParser#host}.
	 * @param ctx the parse tree
	 */
	fun exitHost(ctx: clfParser.HostContext)
	/**
	 * Enter a parse tree produced by {@link clfParser#logname}.
	 * @param ctx the parse tree
	 */
	fun enterLogname(ctx: clfParser.LognameContext)
	/**
	 * Exit a parse tree produced by {@link clfParser#logname}.
	 * @param ctx the parse tree
	 */
	fun exitLogname(ctx: clfParser.LognameContext)
	/**
	 * Enter a parse tree produced by {@link clfParser#username}.
	 * @param ctx the parse tree
	 */
	fun enterUsername(ctx: clfParser.UsernameContext)
	/**
	 * Exit a parse tree produced by {@link clfParser#username}.
	 * @param ctx the parse tree
	 */
	fun exitUsername(ctx: clfParser.UsernameContext)
	/**
	 * Enter a parse tree produced by {@link clfParser#datetimetz}.
	 * @param ctx the parse tree
	 */
	fun enterDatetimetz(ctx: clfParser.DatetimetzContext)
	/**
	 * Exit a parse tree produced by {@link clfParser#datetimetz}.
	 * @param ctx the parse tree
	 */
	fun exitDatetimetz(ctx: clfParser.DatetimetzContext)
	/**
	 * Enter a parse tree produced by {@link clfParser#referer}.
	 * @param ctx the parse tree
	 */
	fun enterReferer(ctx: clfParser.RefererContext)
	/**
	 * Exit a parse tree produced by {@link clfParser#referer}.
	 * @param ctx the parse tree
	 */
	fun exitReferer(ctx: clfParser.RefererContext)
	/**
	 * Enter a parse tree produced by {@link clfParser#request}.
	 * @param ctx the parse tree
	 */
	fun enterRequest(ctx: clfParser.RequestContext)
	/**
	 * Exit a parse tree produced by {@link clfParser#request}.
	 * @param ctx the parse tree
	 */
	fun exitRequest(ctx: clfParser.RequestContext)
	/**
	 * Enter a parse tree produced by {@link clfParser#useragent}.
	 * @param ctx the parse tree
	 */
	fun enterUseragent(ctx: clfParser.UseragentContext)
	/**
	 * Exit a parse tree produced by {@link clfParser#useragent}.
	 * @param ctx the parse tree
	 */
	fun exitUseragent(ctx: clfParser.UseragentContext)
	/**
	 * Enter a parse tree produced by {@link clfParser#statuscode}.
	 * @param ctx the parse tree
	 */
	fun enterStatuscode(ctx: clfParser.StatuscodeContext)
	/**
	 * Exit a parse tree produced by {@link clfParser#statuscode}.
	 * @param ctx the parse tree
	 */
	fun exitStatuscode(ctx: clfParser.StatuscodeContext)
	/**
	 * Enter a parse tree produced by {@link clfParser#bytes}.
	 * @param ctx the parse tree
	 */
	fun enterBytes(ctx: clfParser.BytesContext)
	/**
	 * Exit a parse tree produced by {@link clfParser#bytes}.
	 * @param ctx the parse tree
	 */
	fun exitBytes(ctx: clfParser.BytesContext)
}