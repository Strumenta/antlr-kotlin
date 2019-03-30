// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link creoleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
interface creoleVisitor<T> : ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link creoleParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDocument(ctx : creoleParser.DocumentContext) : T
	/**
	 * Visit a parse tree produced by {@link creoleParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLine(ctx : creoleParser.LineContext) : T
	/**
	 * Visit a parse tree produced by {@link creoleParser#markup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMarkup(ctx : creoleParser.MarkupContext) : T
	/**
	 * Visit a parse tree produced by {@link creoleParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitText(ctx : creoleParser.TextContext) : T
	/**
	 * Visit a parse tree produced by {@link creoleParser#bold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBold(ctx : creoleParser.BoldContext) : T
	/**
	 * Visit a parse tree produced by {@link creoleParser#italics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitItalics(ctx : creoleParser.ItalicsContext) : T
	/**
	 * Visit a parse tree produced by {@link creoleParser#href}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitHref(ctx : creoleParser.HrefContext) : T
	/**
	 * Visit a parse tree produced by {@link creoleParser#image}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitImage(ctx : creoleParser.ImageContext) : T
	/**
	 * Visit a parse tree produced by {@link creoleParser#hline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitHline(ctx : creoleParser.HlineContext) : T
	/**
	 * Visit a parse tree produced by {@link creoleParser#listitem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitListitem(ctx : creoleParser.ListitemContext) : T
	/**
	 * Visit a parse tree produced by {@link creoleParser#tableheader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTableheader(ctx : creoleParser.TableheaderContext) : T
	/**
	 * Visit a parse tree produced by {@link creoleParser#tablerow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTablerow(ctx : creoleParser.TablerowContext) : T
	/**
	 * Visit a parse tree produced by {@link creoleParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTitle(ctx : creoleParser.TitleContext) : T
	/**
	 * Visit a parse tree produced by {@link creoleParser#nowiki}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNowiki(ctx : creoleParser.NowikiContext) : T
}