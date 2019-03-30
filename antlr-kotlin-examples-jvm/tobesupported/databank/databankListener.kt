// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link databankParser}.
 */
interface databankListener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link databankParser#databank}.
	 * @param ctx the parse tree
	 */
	fun enterDatabank(ctx: databankParser.DatabankContext)
	/**
	 * Exit a parse tree produced by {@link databankParser#databank}.
	 * @param ctx the parse tree
	 */
	fun exitDatabank(ctx: databankParser.DatabankContext)
	/**
	 * Enter a parse tree produced by {@link databankParser#datedseries}.
	 * @param ctx the parse tree
	 */
	fun enterDatedseries(ctx: databankParser.DatedseriesContext)
	/**
	 * Exit a parse tree produced by {@link databankParser#datedseries}.
	 * @param ctx the parse tree
	 */
	fun exitDatedseries(ctx: databankParser.DatedseriesContext)
	/**
	 * Enter a parse tree produced by {@link databankParser#undatedseries}.
	 * @param ctx the parse tree
	 */
	fun enterUndatedseries(ctx: databankParser.UndatedseriesContext)
	/**
	 * Exit a parse tree produced by {@link databankParser#undatedseries}.
	 * @param ctx the parse tree
	 */
	fun exitUndatedseries(ctx: databankParser.UndatedseriesContext)
	/**
	 * Enter a parse tree produced by {@link databankParser#datatype}.
	 * @param ctx the parse tree
	 */
	fun enterDatatype(ctx: databankParser.DatatypeContext)
	/**
	 * Exit a parse tree produced by {@link databankParser#datatype}.
	 * @param ctx the parse tree
	 */
	fun exitDatatype(ctx: databankParser.DatatypeContext)
	/**
	 * Enter a parse tree produced by {@link databankParser#dateline}.
	 * @param ctx the parse tree
	 */
	fun enterDateline(ctx: databankParser.DatelineContext)
	/**
	 * Exit a parse tree produced by {@link databankParser#dateline}.
	 * @param ctx the parse tree
	 */
	fun exitDateline(ctx: databankParser.DatelineContext)
	/**
	 * Enter a parse tree produced by {@link databankParser#sample}.
	 * @param ctx the parse tree
	 */
	fun enterSample(ctx: databankParser.SampleContext)
	/**
	 * Exit a parse tree produced by {@link databankParser#sample}.
	 * @param ctx the parse tree
	 */
	fun exitSample(ctx: databankParser.SampleContext)
	/**
	 * Enter a parse tree produced by {@link databankParser#number}.
	 * @param ctx the parse tree
	 */
	fun enterNumber(ctx: databankParser.NumberContext)
	/**
	 * Exit a parse tree produced by {@link databankParser#number}.
	 * @param ctx the parse tree
	 */
	fun exitNumber(ctx: databankParser.NumberContext)
}