// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link databankParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
interface databankVisitor<T> : ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link databankParser#databank}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDatabank(ctx : databankParser.DatabankContext) : T
	/**
	 * Visit a parse tree produced by {@link databankParser#datedseries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDatedseries(ctx : databankParser.DatedseriesContext) : T
	/**
	 * Visit a parse tree produced by {@link databankParser#undatedseries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUndatedseries(ctx : databankParser.UndatedseriesContext) : T
	/**
	 * Visit a parse tree produced by {@link databankParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDatatype(ctx : databankParser.DatatypeContext) : T
	/**
	 * Visit a parse tree produced by {@link databankParser#dateline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDateline(ctx : databankParser.DatelineContext) : T
	/**
	 * Visit a parse tree produced by {@link databankParser#sample}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSample(ctx : databankParser.SampleContext) : T
	/**
	 * Visit a parse tree produced by {@link databankParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNumber(ctx : databankParser.NumberContext) : T
}