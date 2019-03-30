// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CSVParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
interface CSVVisitor<T> : ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CSVParser#csvFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCsvFile(ctx : CSVParser.CsvFileContext) : T
	/**
	 * Visit a parse tree produced by {@link CSVParser#hdr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitHdr(ctx : CSVParser.HdrContext) : T
	/**
	 * Visit a parse tree produced by {@link CSVParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRow(ctx : CSVParser.RowContext) : T
	/**
	 * Visit a parse tree produced by {@link CSVParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitField(ctx : CSVParser.FieldContext) : T
}