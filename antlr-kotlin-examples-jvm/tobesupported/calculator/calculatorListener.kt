// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calculatorParser}.
 */
interface calculatorListener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link calculatorParser#equation}.
	 * @param ctx the parse tree
	 */
	fun enterEquation(ctx: calculatorParser.EquationContext)
	/**
	 * Exit a parse tree produced by {@link calculatorParser#equation}.
	 * @param ctx the parse tree
	 */
	fun exitEquation(ctx: calculatorParser.EquationContext)
	/**
	 * Enter a parse tree produced by {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterExpression(ctx: calculatorParser.ExpressionContext)
	/**
	 * Exit a parse tree produced by {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitExpression(ctx: calculatorParser.ExpressionContext)
	/**
	 * Enter a parse tree produced by {@link calculatorParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	fun enterMultiplyingExpression(ctx: calculatorParser.MultiplyingExpressionContext)
	/**
	 * Exit a parse tree produced by {@link calculatorParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	fun exitMultiplyingExpression(ctx: calculatorParser.MultiplyingExpressionContext)
	/**
	 * Enter a parse tree produced by {@link calculatorParser#powExpression}.
	 * @param ctx the parse tree
	 */
	fun enterPowExpression(ctx: calculatorParser.PowExpressionContext)
	/**
	 * Exit a parse tree produced by {@link calculatorParser#powExpression}.
	 * @param ctx the parse tree
	 */
	fun exitPowExpression(ctx: calculatorParser.PowExpressionContext)
	/**
	 * Enter a parse tree produced by {@link calculatorParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	fun enterSignedAtom(ctx: calculatorParser.SignedAtomContext)
	/**
	 * Exit a parse tree produced by {@link calculatorParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	fun exitSignedAtom(ctx: calculatorParser.SignedAtomContext)
	/**
	 * Enter a parse tree produced by {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	fun enterAtom(ctx: calculatorParser.AtomContext)
	/**
	 * Exit a parse tree produced by {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	fun exitAtom(ctx: calculatorParser.AtomContext)
	/**
	 * Enter a parse tree produced by {@link calculatorParser#scientific}.
	 * @param ctx the parse tree
	 */
	fun enterScientific(ctx: calculatorParser.ScientificContext)
	/**
	 * Exit a parse tree produced by {@link calculatorParser#scientific}.
	 * @param ctx the parse tree
	 */
	fun exitScientific(ctx: calculatorParser.ScientificContext)
	/**
	 * Enter a parse tree produced by {@link calculatorParser#constant}.
	 * @param ctx the parse tree
	 */
	fun enterConstant(ctx: calculatorParser.ConstantContext)
	/**
	 * Exit a parse tree produced by {@link calculatorParser#constant}.
	 * @param ctx the parse tree
	 */
	fun exitConstant(ctx: calculatorParser.ConstantContext)
	/**
	 * Enter a parse tree produced by {@link calculatorParser#variable}.
	 * @param ctx the parse tree
	 */
	fun enterVariable(ctx: calculatorParser.VariableContext)
	/**
	 * Exit a parse tree produced by {@link calculatorParser#variable}.
	 * @param ctx the parse tree
	 */
	fun exitVariable(ctx: calculatorParser.VariableContext)
	/**
	 * Enter a parse tree produced by {@link calculatorParser#func}.
	 * @param ctx the parse tree
	 */
	fun enterFunc(ctx: calculatorParser.FuncContext)
	/**
	 * Exit a parse tree produced by {@link calculatorParser#func}.
	 * @param ctx the parse tree
	 */
	fun exitFunc(ctx: calculatorParser.FuncContext)
	/**
	 * Enter a parse tree produced by {@link calculatorParser#funcname}.
	 * @param ctx the parse tree
	 */
	fun enterFuncname(ctx: calculatorParser.FuncnameContext)
	/**
	 * Exit a parse tree produced by {@link calculatorParser#funcname}.
	 * @param ctx the parse tree
	 */
	fun exitFuncname(ctx: calculatorParser.FuncnameContext)
	/**
	 * Enter a parse tree produced by {@link calculatorParser#relop}.
	 * @param ctx the parse tree
	 */
	fun enterRelop(ctx: calculatorParser.RelopContext)
	/**
	 * Exit a parse tree produced by {@link calculatorParser#relop}.
	 * @param ctx the parse tree
	 */
	fun exitRelop(ctx: calculatorParser.RelopContext)
}