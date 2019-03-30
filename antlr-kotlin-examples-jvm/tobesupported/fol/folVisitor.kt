// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link folParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
interface folVisitor<T> : ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link folParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCondition(ctx : folParser.ConditionContext) : T
	/**
	 * Visit a parse tree produced by {@link folParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFormula(ctx : folParser.FormulaContext) : T
	/**
	 * Visit a parse tree produced by {@link folParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTerm(ctx : folParser.TermContext) : T
	/**
	 * Visit a parse tree produced by {@link folParser#bin_connective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBin_connective(ctx : folParser.Bin_connectiveContext) : T
	/**
	 * Visit a parse tree produced by {@link folParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitVariable(ctx : folParser.VariableContext) : T
	/**
	 * Visit a parse tree produced by {@link folParser#pred_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPred_constant(ctx : folParser.Pred_constantContext) : T
	/**
	 * Visit a parse tree produced by {@link folParser#ind_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInd_constant(ctx : folParser.Ind_constantContext) : T
	/**
	 * Visit a parse tree produced by {@link folParser#func_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFunc_constant(ctx : folParser.Func_constantContext) : T
	/**
	 * Visit a parse tree produced by {@link folParser#separator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSeparator(ctx : folParser.SeparatorContext) : T
}