// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.AbstractParseTreeVisitor

/**
 * This class provides an empty implementation of {@link CSVVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
open class CSVBaseVisitor<T> : AbstractParseTreeVisitor<T>(), CSVVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitCsvFile(ctx : CSVParser.CsvFileContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitHdr(ctx : CSVParser.HdrContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitRow(ctx : CSVParser.RowContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitField(ctx : CSVParser.FieldContext ) : T { return this!!.visitChildren(ctx)!! }
}