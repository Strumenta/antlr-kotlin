// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link folParser}.
 */
interface folListener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link folParser#condition}.
	 * @param ctx the parse tree
	 */
	fun enterCondition(ctx: folParser.ConditionContext)
	/**
	 * Exit a parse tree produced by {@link folParser#condition}.
	 * @param ctx the parse tree
	 */
	fun exitCondition(ctx: folParser.ConditionContext)
	/**
	 * Enter a parse tree produced by {@link folParser#formula}.
	 * @param ctx the parse tree
	 */
	fun enterFormula(ctx: folParser.FormulaContext)
	/**
	 * Exit a parse tree produced by {@link folParser#formula}.
	 * @param ctx the parse tree
	 */
	fun exitFormula(ctx: folParser.FormulaContext)
	/**
	 * Enter a parse tree produced by {@link folParser#term}.
	 * @param ctx the parse tree
	 */
	fun enterTerm(ctx: folParser.TermContext)
	/**
	 * Exit a parse tree produced by {@link folParser#term}.
	 * @param ctx the parse tree
	 */
	fun exitTerm(ctx: folParser.TermContext)
	/**
	 * Enter a parse tree produced by {@link folParser#bin_connective}.
	 * @param ctx the parse tree
	 */
	fun enterBin_connective(ctx: folParser.Bin_connectiveContext)
	/**
	 * Exit a parse tree produced by {@link folParser#bin_connective}.
	 * @param ctx the parse tree
	 */
	fun exitBin_connective(ctx: folParser.Bin_connectiveContext)
	/**
	 * Enter a parse tree produced by {@link folParser#variable}.
	 * @param ctx the parse tree
	 */
	fun enterVariable(ctx: folParser.VariableContext)
	/**
	 * Exit a parse tree produced by {@link folParser#variable}.
	 * @param ctx the parse tree
	 */
	fun exitVariable(ctx: folParser.VariableContext)
	/**
	 * Enter a parse tree produced by {@link folParser#pred_constant}.
	 * @param ctx the parse tree
	 */
	fun enterPred_constant(ctx: folParser.Pred_constantContext)
	/**
	 * Exit a parse tree produced by {@link folParser#pred_constant}.
	 * @param ctx the parse tree
	 */
	fun exitPred_constant(ctx: folParser.Pred_constantContext)
	/**
	 * Enter a parse tree produced by {@link folParser#ind_constant}.
	 * @param ctx the parse tree
	 */
	fun enterInd_constant(ctx: folParser.Ind_constantContext)
	/**
	 * Exit a parse tree produced by {@link folParser#ind_constant}.
	 * @param ctx the parse tree
	 */
	fun exitInd_constant(ctx: folParser.Ind_constantContext)
	/**
	 * Enter a parse tree produced by {@link folParser#func_constant}.
	 * @param ctx the parse tree
	 */
	fun enterFunc_constant(ctx: folParser.Func_constantContext)
	/**
	 * Exit a parse tree produced by {@link folParser#func_constant}.
	 * @param ctx the parse tree
	 */
	fun exitFunc_constant(ctx: folParser.Func_constantContext)
	/**
	 * Enter a parse tree produced by {@link folParser#separator}.
	 * @param ctx the parse tree
	 */
	fun enterSeparator(ctx: folParser.SeparatorContext)
	/**
	 * Exit a parse tree produced by {@link folParser#separator}.
	 * @param ctx the parse tree
	 */
	fun exitSeparator(ctx: folParser.SeparatorContext)
}