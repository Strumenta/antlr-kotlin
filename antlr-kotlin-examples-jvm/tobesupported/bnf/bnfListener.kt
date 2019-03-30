// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link bnfParser}.
 */
interface bnfListener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link bnfParser#rulelist}.
	 * @param ctx the parse tree
	 */
	fun enterRulelist(ctx: bnfParser.RulelistContext)
	/**
	 * Exit a parse tree produced by {@link bnfParser#rulelist}.
	 * @param ctx the parse tree
	 */
	fun exitRulelist(ctx: bnfParser.RulelistContext)
	/**
	 * Enter a parse tree produced by {@link bnfParser#rule_}.
	 * @param ctx the parse tree
	 */
	fun enterRule_(ctx: bnfParser.Rule_Context)
	/**
	 * Exit a parse tree produced by {@link bnfParser#rule_}.
	 * @param ctx the parse tree
	 */
	fun exitRule_(ctx: bnfParser.Rule_Context)
	/**
	 * Enter a parse tree produced by {@link bnfParser#lhs}.
	 * @param ctx the parse tree
	 */
	fun enterLhs(ctx: bnfParser.LhsContext)
	/**
	 * Exit a parse tree produced by {@link bnfParser#lhs}.
	 * @param ctx the parse tree
	 */
	fun exitLhs(ctx: bnfParser.LhsContext)
	/**
	 * Enter a parse tree produced by {@link bnfParser#rhs}.
	 * @param ctx the parse tree
	 */
	fun enterRhs(ctx: bnfParser.RhsContext)
	/**
	 * Exit a parse tree produced by {@link bnfParser#rhs}.
	 * @param ctx the parse tree
	 */
	fun exitRhs(ctx: bnfParser.RhsContext)
	/**
	 * Enter a parse tree produced by {@link bnfParser#alternatives}.
	 * @param ctx the parse tree
	 */
	fun enterAlternatives(ctx: bnfParser.AlternativesContext)
	/**
	 * Exit a parse tree produced by {@link bnfParser#alternatives}.
	 * @param ctx the parse tree
	 */
	fun exitAlternatives(ctx: bnfParser.AlternativesContext)
	/**
	 * Enter a parse tree produced by {@link bnfParser#alternative}.
	 * @param ctx the parse tree
	 */
	fun enterAlternative(ctx: bnfParser.AlternativeContext)
	/**
	 * Exit a parse tree produced by {@link bnfParser#alternative}.
	 * @param ctx the parse tree
	 */
	fun exitAlternative(ctx: bnfParser.AlternativeContext)
	/**
	 * Enter a parse tree produced by {@link bnfParser#element}.
	 * @param ctx the parse tree
	 */
	fun enterElement(ctx: bnfParser.ElementContext)
	/**
	 * Exit a parse tree produced by {@link bnfParser#element}.
	 * @param ctx the parse tree
	 */
	fun exitElement(ctx: bnfParser.ElementContext)
	/**
	 * Enter a parse tree produced by {@link bnfParser#optional}.
	 * @param ctx the parse tree
	 */
	fun enterOptional(ctx: bnfParser.OptionalContext)
	/**
	 * Exit a parse tree produced by {@link bnfParser#optional}.
	 * @param ctx the parse tree
	 */
	fun exitOptional(ctx: bnfParser.OptionalContext)
	/**
	 * Enter a parse tree produced by {@link bnfParser#zeroormore}.
	 * @param ctx the parse tree
	 */
	fun enterZeroormore(ctx: bnfParser.ZeroormoreContext)
	/**
	 * Exit a parse tree produced by {@link bnfParser#zeroormore}.
	 * @param ctx the parse tree
	 */
	fun exitZeroormore(ctx: bnfParser.ZeroormoreContext)
	/**
	 * Enter a parse tree produced by {@link bnfParser#oneormore}.
	 * @param ctx the parse tree
	 */
	fun enterOneormore(ctx: bnfParser.OneormoreContext)
	/**
	 * Exit a parse tree produced by {@link bnfParser#oneormore}.
	 * @param ctx the parse tree
	 */
	fun exitOneormore(ctx: bnfParser.OneormoreContext)
	/**
	 * Enter a parse tree produced by {@link bnfParser#text}.
	 * @param ctx the parse tree
	 */
	fun enterText(ctx: bnfParser.TextContext)
	/**
	 * Exit a parse tree produced by {@link bnfParser#text}.
	 * @param ctx the parse tree
	 */
	fun exitText(ctx: bnfParser.TextContext)
	/**
	 * Enter a parse tree produced by {@link bnfParser#id}.
	 * @param ctx the parse tree
	 */
	fun enterId(ctx: bnfParser.IdContext)
	/**
	 * Exit a parse tree produced by {@link bnfParser#id}.
	 * @param ctx the parse tree
	 */
	fun exitId(ctx: bnfParser.IdContext)
	/**
	 * Enter a parse tree produced by {@link bnfParser#ruleid}.
	 * @param ctx the parse tree
	 */
	fun enterRuleid(ctx: bnfParser.RuleidContext)
	/**
	 * Exit a parse tree produced by {@link bnfParser#ruleid}.
	 * @param ctx the parse tree
	 */
	fun exitRuleid(ctx: bnfParser.RuleidContext)
}