// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.AbstractParseTreeVisitor

/**
 * This class provides an empty implementation of {@link CVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
open class CBaseVisitor<T> : AbstractParseTreeVisitor<T>(), CVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitPrimaryExpression(ctx : CParser.PrimaryExpressionContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitGenericSelection(ctx : CParser.GenericSelectionContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitGenericAssocList(ctx : CParser.GenericAssocListContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitGenericAssociation(ctx : CParser.GenericAssociationContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitPostfixExpression(ctx : CParser.PostfixExpressionContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitArgumentExpressionList(ctx : CParser.ArgumentExpressionListContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitUnaryExpression(ctx : CParser.UnaryExpressionContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitUnaryOperator(ctx : CParser.UnaryOperatorContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitCastExpression(ctx : CParser.CastExpressionContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitMultiplicativeExpression(ctx : CParser.MultiplicativeExpressionContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitAdditiveExpression(ctx : CParser.AdditiveExpressionContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitShiftExpression(ctx : CParser.ShiftExpressionContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitRelationalExpression(ctx : CParser.RelationalExpressionContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitEqualityExpression(ctx : CParser.EqualityExpressionContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitAndExpression(ctx : CParser.AndExpressionContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitExclusiveOrExpression(ctx : CParser.ExclusiveOrExpressionContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitInclusiveOrExpression(ctx : CParser.InclusiveOrExpressionContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitLogicalAndExpression(ctx : CParser.LogicalAndExpressionContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitLogicalOrExpression(ctx : CParser.LogicalOrExpressionContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitConditionalExpression(ctx : CParser.ConditionalExpressionContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitAssignmentExpression(ctx : CParser.AssignmentExpressionContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitAssignmentOperator(ctx : CParser.AssignmentOperatorContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitExpression(ctx : CParser.ExpressionContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitConstantExpression(ctx : CParser.ConstantExpressionContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitDeclaration(ctx : CParser.DeclarationContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitDeclarationSpecifiers(ctx : CParser.DeclarationSpecifiersContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitDeclarationSpecifiers2(ctx : CParser.DeclarationSpecifiers2Context ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitDeclarationSpecifier(ctx : CParser.DeclarationSpecifierContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitInitDeclaratorList(ctx : CParser.InitDeclaratorListContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitInitDeclarator(ctx : CParser.InitDeclaratorContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitStorageClassSpecifier(ctx : CParser.StorageClassSpecifierContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitTypeSpecifier(ctx : CParser.TypeSpecifierContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitStructOrUnionSpecifier(ctx : CParser.StructOrUnionSpecifierContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitStructOrUnion(ctx : CParser.StructOrUnionContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitStructDeclarationList(ctx : CParser.StructDeclarationListContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitStructDeclaration(ctx : CParser.StructDeclarationContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitSpecifierQualifierList(ctx : CParser.SpecifierQualifierListContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitStructDeclaratorList(ctx : CParser.StructDeclaratorListContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitStructDeclarator(ctx : CParser.StructDeclaratorContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitEnumSpecifier(ctx : CParser.EnumSpecifierContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitEnumeratorList(ctx : CParser.EnumeratorListContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitEnumerator(ctx : CParser.EnumeratorContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitEnumerationConstant(ctx : CParser.EnumerationConstantContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitAtomicTypeSpecifier(ctx : CParser.AtomicTypeSpecifierContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitTypeQualifier(ctx : CParser.TypeQualifierContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitFunctionSpecifier(ctx : CParser.FunctionSpecifierContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitAlignmentSpecifier(ctx : CParser.AlignmentSpecifierContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitDeclarator(ctx : CParser.DeclaratorContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitDirectDeclarator(ctx : CParser.DirectDeclaratorContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitGccDeclaratorExtension(ctx : CParser.GccDeclaratorExtensionContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitGccAttributeSpecifier(ctx : CParser.GccAttributeSpecifierContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitGccAttributeList(ctx : CParser.GccAttributeListContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitGccAttribute(ctx : CParser.GccAttributeContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitNestedParenthesesBlock(ctx : CParser.NestedParenthesesBlockContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitPointer(ctx : CParser.PointerContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitTypeQualifierList(ctx : CParser.TypeQualifierListContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitParameterTypeList(ctx : CParser.ParameterTypeListContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitParameterList(ctx : CParser.ParameterListContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitParameterDeclaration(ctx : CParser.ParameterDeclarationContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitIdentifierList(ctx : CParser.IdentifierListContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitTypeName(ctx : CParser.TypeNameContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitAbstractDeclarator(ctx : CParser.AbstractDeclaratorContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitDirectAbstractDeclarator(ctx : CParser.DirectAbstractDeclaratorContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitTypedefName(ctx : CParser.TypedefNameContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitInitializer(ctx : CParser.InitializerContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitInitializerList(ctx : CParser.InitializerListContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitDesignation(ctx : CParser.DesignationContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitDesignatorList(ctx : CParser.DesignatorListContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitDesignator(ctx : CParser.DesignatorContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitStaticAssertDeclaration(ctx : CParser.StaticAssertDeclarationContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitStatement(ctx : CParser.StatementContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitLabeledStatement(ctx : CParser.LabeledStatementContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitCompoundStatement(ctx : CParser.CompoundStatementContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitBlockItemList(ctx : CParser.BlockItemListContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitBlockItem(ctx : CParser.BlockItemContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitExpressionStatement(ctx : CParser.ExpressionStatementContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitSelectionStatement(ctx : CParser.SelectionStatementContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitIterationStatement(ctx : CParser.IterationStatementContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitForCondition(ctx : CParser.ForConditionContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitForDeclaration(ctx : CParser.ForDeclarationContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitForExpression(ctx : CParser.ForExpressionContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitJumpStatement(ctx : CParser.JumpStatementContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitCompilationUnit(ctx : CParser.CompilationUnitContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitTranslationUnit(ctx : CParser.TranslationUnitContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitExternalDeclaration(ctx : CParser.ExternalDeclarationContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitFunctionDefinition(ctx : CParser.FunctionDefinitionContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitDeclarationList(ctx : CParser.DeclarationListContext ) : T { return this!!.visitChildren(ctx)!! }
}