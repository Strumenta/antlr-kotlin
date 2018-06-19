package com.strumenta.minicalc

import org.antlr.v4.kotlinruntime.ParserRuleContext
import org.antlr.v4.kotlinruntime.tree.ErrorNode
import org.antlr.v4.kotlinruntime.tree.TerminalNode

// Generated from java-escape by ANTLR 4.7.1

/**
 * This class provides an empty implementation of {@link MiniCalcParserListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
open class MiniCalcParserBaseListener : MiniCalcParserListener {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterMiniCalcFile(ctx: MiniCalcParser.MiniCalcFileContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitMiniCalcFile(ctx: MiniCalcParser.MiniCalcFileContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterLine(ctx: MiniCalcParser.LineContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitLine(ctx: MiniCalcParser.LineContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterInputDeclarationStatement(ctx: MiniCalcParser.InputDeclarationStatementContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitInputDeclarationStatement(ctx: MiniCalcParser.InputDeclarationStatementContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterVarDeclarationStatement(ctx: MiniCalcParser.VarDeclarationStatementContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitVarDeclarationStatement(ctx: MiniCalcParser.VarDeclarationStatementContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterAssignmentStatement(ctx: MiniCalcParser.AssignmentStatementContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitAssignmentStatement(ctx: MiniCalcParser.AssignmentStatementContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterPrintStatement(ctx: MiniCalcParser.PrintStatementContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitPrintStatement(ctx: MiniCalcParser.PrintStatementContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterPrint(ctx: MiniCalcParser.PrintContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitPrint(ctx: MiniCalcParser.PrintContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterInputDeclaration(ctx: MiniCalcParser.InputDeclarationContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitInputDeclaration(ctx: MiniCalcParser.InputDeclarationContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterVarDeclaration(ctx: MiniCalcParser.VarDeclarationContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitVarDeclaration(ctx: MiniCalcParser.VarDeclarationContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterAssignment(ctx: MiniCalcParser.AssignmentContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitAssignment(ctx: MiniCalcParser.AssignmentContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterDecimalLiteral(ctx: MiniCalcParser.DecimalLiteralContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitDecimalLiteral(ctx: MiniCalcParser.DecimalLiteralContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterMinusExpression(ctx: MiniCalcParser.MinusExpressionContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitMinusExpression(ctx: MiniCalcParser.MinusExpressionContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterValueReference(ctx: MiniCalcParser.ValueReferenceContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitValueReference(ctx: MiniCalcParser.ValueReferenceContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterStringLiteral(ctx: MiniCalcParser.StringLiteralContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitStringLiteral(ctx: MiniCalcParser.StringLiteralContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterIntLiteral(ctx: MiniCalcParser.IntLiteralContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitIntLiteral(ctx: MiniCalcParser.IntLiteralContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterParenExpression(ctx: MiniCalcParser.ParenExpressionContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitParenExpression(ctx: MiniCalcParser.ParenExpressionContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterBinaryOperation(ctx: MiniCalcParser.BinaryOperationContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitBinaryOperation(ctx: MiniCalcParser.BinaryOperationContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterTypeConversion(ctx: MiniCalcParser.TypeConversionContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitTypeConversion(ctx: MiniCalcParser.TypeConversionContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterConstantString(ctx: MiniCalcParser.ConstantStringContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitConstantString(ctx: MiniCalcParser.ConstantStringContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterInterpolatedValue(ctx: MiniCalcParser.InterpolatedValueContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitInterpolatedValue(ctx: MiniCalcParser.InterpolatedValueContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterInteger(ctx: MiniCalcParser.IntegerContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitInteger(ctx: MiniCalcParser.IntegerContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterDecimal(ctx: MiniCalcParser.DecimalContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitDecimal(ctx: MiniCalcParser.DecimalContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterString(ctx: MiniCalcParser.StringContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitString(ctx: MiniCalcParser.StringContext) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterEveryRule(ctx: ParserRuleContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitEveryRule(ctx: ParserRuleContext ) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun visitTerminal(node: TerminalNode ) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun visitErrorNode(node: ErrorNode) { }
}