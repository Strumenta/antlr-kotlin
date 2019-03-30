// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link fastaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
interface fastaVisitor<T> : ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link fastaParser#sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSequence(ctx : fastaParser.SequenceContext) : T
	/**
	 * Visit a parse tree produced by {@link fastaParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSection(ctx : fastaParser.SectionContext) : T
	/**
	 * Visit a parse tree produced by {@link fastaParser#sequencelines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSequencelines(ctx : fastaParser.SequencelinesContext) : T
	/**
	 * Visit a parse tree produced by {@link fastaParser#descriptionline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDescriptionline(ctx : fastaParser.DescriptionlineContext) : T
	/**
	 * Visit a parse tree produced by {@link fastaParser#commentline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCommentline(ctx : fastaParser.CommentlineContext) : T
}