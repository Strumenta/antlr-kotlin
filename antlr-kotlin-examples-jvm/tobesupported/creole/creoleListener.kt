// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link creoleParser}.
 */
interface creoleListener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link creoleParser#document}.
	 * @param ctx the parse tree
	 */
	fun enterDocument(ctx: creoleParser.DocumentContext)
	/**
	 * Exit a parse tree produced by {@link creoleParser#document}.
	 * @param ctx the parse tree
	 */
	fun exitDocument(ctx: creoleParser.DocumentContext)
	/**
	 * Enter a parse tree produced by {@link creoleParser#line}.
	 * @param ctx the parse tree
	 */
	fun enterLine(ctx: creoleParser.LineContext)
	/**
	 * Exit a parse tree produced by {@link creoleParser#line}.
	 * @param ctx the parse tree
	 */
	fun exitLine(ctx: creoleParser.LineContext)
	/**
	 * Enter a parse tree produced by {@link creoleParser#markup}.
	 * @param ctx the parse tree
	 */
	fun enterMarkup(ctx: creoleParser.MarkupContext)
	/**
	 * Exit a parse tree produced by {@link creoleParser#markup}.
	 * @param ctx the parse tree
	 */
	fun exitMarkup(ctx: creoleParser.MarkupContext)
	/**
	 * Enter a parse tree produced by {@link creoleParser#text}.
	 * @param ctx the parse tree
	 */
	fun enterText(ctx: creoleParser.TextContext)
	/**
	 * Exit a parse tree produced by {@link creoleParser#text}.
	 * @param ctx the parse tree
	 */
	fun exitText(ctx: creoleParser.TextContext)
	/**
	 * Enter a parse tree produced by {@link creoleParser#bold}.
	 * @param ctx the parse tree
	 */
	fun enterBold(ctx: creoleParser.BoldContext)
	/**
	 * Exit a parse tree produced by {@link creoleParser#bold}.
	 * @param ctx the parse tree
	 */
	fun exitBold(ctx: creoleParser.BoldContext)
	/**
	 * Enter a parse tree produced by {@link creoleParser#italics}.
	 * @param ctx the parse tree
	 */
	fun enterItalics(ctx: creoleParser.ItalicsContext)
	/**
	 * Exit a parse tree produced by {@link creoleParser#italics}.
	 * @param ctx the parse tree
	 */
	fun exitItalics(ctx: creoleParser.ItalicsContext)
	/**
	 * Enter a parse tree produced by {@link creoleParser#href}.
	 * @param ctx the parse tree
	 */
	fun enterHref(ctx: creoleParser.HrefContext)
	/**
	 * Exit a parse tree produced by {@link creoleParser#href}.
	 * @param ctx the parse tree
	 */
	fun exitHref(ctx: creoleParser.HrefContext)
	/**
	 * Enter a parse tree produced by {@link creoleParser#image}.
	 * @param ctx the parse tree
	 */
	fun enterImage(ctx: creoleParser.ImageContext)
	/**
	 * Exit a parse tree produced by {@link creoleParser#image}.
	 * @param ctx the parse tree
	 */
	fun exitImage(ctx: creoleParser.ImageContext)
	/**
	 * Enter a parse tree produced by {@link creoleParser#hline}.
	 * @param ctx the parse tree
	 */
	fun enterHline(ctx: creoleParser.HlineContext)
	/**
	 * Exit a parse tree produced by {@link creoleParser#hline}.
	 * @param ctx the parse tree
	 */
	fun exitHline(ctx: creoleParser.HlineContext)
	/**
	 * Enter a parse tree produced by {@link creoleParser#listitem}.
	 * @param ctx the parse tree
	 */
	fun enterListitem(ctx: creoleParser.ListitemContext)
	/**
	 * Exit a parse tree produced by {@link creoleParser#listitem}.
	 * @param ctx the parse tree
	 */
	fun exitListitem(ctx: creoleParser.ListitemContext)
	/**
	 * Enter a parse tree produced by {@link creoleParser#tableheader}.
	 * @param ctx the parse tree
	 */
	fun enterTableheader(ctx: creoleParser.TableheaderContext)
	/**
	 * Exit a parse tree produced by {@link creoleParser#tableheader}.
	 * @param ctx the parse tree
	 */
	fun exitTableheader(ctx: creoleParser.TableheaderContext)
	/**
	 * Enter a parse tree produced by {@link creoleParser#tablerow}.
	 * @param ctx the parse tree
	 */
	fun enterTablerow(ctx: creoleParser.TablerowContext)
	/**
	 * Exit a parse tree produced by {@link creoleParser#tablerow}.
	 * @param ctx the parse tree
	 */
	fun exitTablerow(ctx: creoleParser.TablerowContext)
	/**
	 * Enter a parse tree produced by {@link creoleParser#title}.
	 * @param ctx the parse tree
	 */
	fun enterTitle(ctx: creoleParser.TitleContext)
	/**
	 * Exit a parse tree produced by {@link creoleParser#title}.
	 * @param ctx the parse tree
	 */
	fun exitTitle(ctx: creoleParser.TitleContext)
	/**
	 * Enter a parse tree produced by {@link creoleParser#nowiki}.
	 * @param ctx the parse tree
	 */
	fun enterNowiki(ctx: creoleParser.NowikiContext)
	/**
	 * Exit a parse tree produced by {@link creoleParser#nowiki}.
	 * @param ctx the parse tree
	 */
	fun exitNowiki(ctx: creoleParser.NowikiContext)
}