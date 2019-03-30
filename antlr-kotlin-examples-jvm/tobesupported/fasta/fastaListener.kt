// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link fastaParser}.
 */
interface fastaListener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link fastaParser#sequence}.
	 * @param ctx the parse tree
	 */
	fun enterSequence(ctx: fastaParser.SequenceContext)
	/**
	 * Exit a parse tree produced by {@link fastaParser#sequence}.
	 * @param ctx the parse tree
	 */
	fun exitSequence(ctx: fastaParser.SequenceContext)
	/**
	 * Enter a parse tree produced by {@link fastaParser#section}.
	 * @param ctx the parse tree
	 */
	fun enterSection(ctx: fastaParser.SectionContext)
	/**
	 * Exit a parse tree produced by {@link fastaParser#section}.
	 * @param ctx the parse tree
	 */
	fun exitSection(ctx: fastaParser.SectionContext)
	/**
	 * Enter a parse tree produced by {@link fastaParser#sequencelines}.
	 * @param ctx the parse tree
	 */
	fun enterSequencelines(ctx: fastaParser.SequencelinesContext)
	/**
	 * Exit a parse tree produced by {@link fastaParser#sequencelines}.
	 * @param ctx the parse tree
	 */
	fun exitSequencelines(ctx: fastaParser.SequencelinesContext)
	/**
	 * Enter a parse tree produced by {@link fastaParser#descriptionline}.
	 * @param ctx the parse tree
	 */
	fun enterDescriptionline(ctx: fastaParser.DescriptionlineContext)
	/**
	 * Exit a parse tree produced by {@link fastaParser#descriptionline}.
	 * @param ctx the parse tree
	 */
	fun exitDescriptionline(ctx: fastaParser.DescriptionlineContext)
	/**
	 * Enter a parse tree produced by {@link fastaParser#commentline}.
	 * @param ctx the parse tree
	 */
	fun enterCommentline(ctx: fastaParser.CommentlineContext)
	/**
	 * Exit a parse tree produced by {@link fastaParser#commentline}.
	 * @param ctx the parse tree
	 */
	fun exitCommentline(ctx: fastaParser.CommentlineContext)
}