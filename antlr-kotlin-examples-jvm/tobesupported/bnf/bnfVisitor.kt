// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link bnfParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
interface bnfVisitor<T> : ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link bnfParser#rulelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRulelist(ctx : bnfParser.RulelistContext) : T
	/**
	 * Visit a parse tree produced by {@link bnfParser#rule_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRule_(ctx : bnfParser.Rule_Context) : T
	/**
	 * Visit a parse tree produced by {@link bnfParser#lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLhs(ctx : bnfParser.LhsContext) : T
	/**
	 * Visit a parse tree produced by {@link bnfParser#rhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRhs(ctx : bnfParser.RhsContext) : T
	/**
	 * Visit a parse tree produced by {@link bnfParser#alternatives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAlternatives(ctx : bnfParser.AlternativesContext) : T
	/**
	 * Visit a parse tree produced by {@link bnfParser#alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAlternative(ctx : bnfParser.AlternativeContext) : T
	/**
	 * Visit a parse tree produced by {@link bnfParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitElement(ctx : bnfParser.ElementContext) : T
	/**
	 * Visit a parse tree produced by {@link bnfParser#optional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOptional(ctx : bnfParser.OptionalContext) : T
	/**
	 * Visit a parse tree produced by {@link bnfParser#zeroormore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitZeroormore(ctx : bnfParser.ZeroormoreContext) : T
	/**
	 * Visit a parse tree produced by {@link bnfParser#oneormore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOneormore(ctx : bnfParser.OneormoreContext) : T
	/**
	 * Visit a parse tree produced by {@link bnfParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitText(ctx : bnfParser.TextContext) : T
	/**
	 * Visit a parse tree produced by {@link bnfParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitId(ctx : bnfParser.IdContext) : T
	/**
	 * Visit a parse tree produced by {@link bnfParser#ruleid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRuleid(ctx : bnfParser.RuleidContext) : T
}