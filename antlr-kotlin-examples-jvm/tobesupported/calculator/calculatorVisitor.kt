// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link calculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
interface calculatorVisitor<T> : ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link calculatorParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEquation(ctx : calculatorParser.EquationContext) : T
	/**
	 * Visit a parse tree produced by {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExpression(ctx : calculatorParser.ExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link calculatorParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMultiplyingExpression(ctx : calculatorParser.MultiplyingExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link calculatorParser#powExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPowExpression(ctx : calculatorParser.PowExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link calculatorParser#signedAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSignedAtom(ctx : calculatorParser.SignedAtomContext) : T
	/**
	 * Visit a parse tree produced by {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAtom(ctx : calculatorParser.AtomContext) : T
	/**
	 * Visit a parse tree produced by {@link calculatorParser#scientific}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScientific(ctx : calculatorParser.ScientificContext) : T
	/**
	 * Visit a parse tree produced by {@link calculatorParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConstant(ctx : calculatorParser.ConstantContext) : T
	/**
	 * Visit a parse tree produced by {@link calculatorParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitVariable(ctx : calculatorParser.VariableContext) : T
	/**
	 * Visit a parse tree produced by {@link calculatorParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFunc(ctx : calculatorParser.FuncContext) : T
	/**
	 * Visit a parse tree produced by {@link calculatorParser#funcname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFuncname(ctx : calculatorParser.FuncnameContext) : T
	/**
	 * Visit a parse tree produced by {@link calculatorParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRelop(ctx : calculatorParser.RelopContext) : T
}