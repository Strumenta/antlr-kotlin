// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CSVParser}.
 */
interface CSVListener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CSVParser#csvFile}.
	 * @param ctx the parse tree
	 */
	fun enterCsvFile(ctx: CSVParser.CsvFileContext)
	/**
	 * Exit a parse tree produced by {@link CSVParser#csvFile}.
	 * @param ctx the parse tree
	 */
	fun exitCsvFile(ctx: CSVParser.CsvFileContext)
	/**
	 * Enter a parse tree produced by {@link CSVParser#hdr}.
	 * @param ctx the parse tree
	 */
	fun enterHdr(ctx: CSVParser.HdrContext)
	/**
	 * Exit a parse tree produced by {@link CSVParser#hdr}.
	 * @param ctx the parse tree
	 */
	fun exitHdr(ctx: CSVParser.HdrContext)
	/**
	 * Enter a parse tree produced by {@link CSVParser#row}.
	 * @param ctx the parse tree
	 */
	fun enterRow(ctx: CSVParser.RowContext)
	/**
	 * Exit a parse tree produced by {@link CSVParser#row}.
	 * @param ctx the parse tree
	 */
	fun exitRow(ctx: CSVParser.RowContext)
	/**
	 * Enter a parse tree produced by {@link CSVParser#field}.
	 * @param ctx the parse tree
	 */
	fun enterField(ctx: CSVParser.FieldContext)
	/**
	 * Exit a parse tree produced by {@link CSVParser#field}.
	 * @param ctx the parse tree
	 */
	fun exitField(ctx: CSVParser.FieldContext)
}