// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.AbstractParseTreeVisitor

/**
 * This class provides an empty implementation of {@link folVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
open class folBaseVisitor<T> : AbstractParseTreeVisitor<T>(), folVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitCondition(ctx : folParser.ConditionContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitFormula(ctx : folParser.FormulaContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitTerm(ctx : folParser.TermContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitBin_connective(ctx : folParser.Bin_connectiveContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitVariable(ctx : folParser.VariableContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitPred_constant(ctx : folParser.Pred_constantContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitInd_constant(ctx : folParser.Ind_constantContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitFunc_constant(ctx : folParser.Func_constantContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitSeparator(ctx : folParser.SeparatorContext ) : T { return this!!.visitChildren(ctx)!! }
}