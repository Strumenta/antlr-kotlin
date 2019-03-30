// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
interface CVisitor<T> : ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPrimaryExpression(ctx : CParser.PrimaryExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#genericSelection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGenericSelection(ctx : CParser.GenericSelectionContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#genericAssocList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGenericAssocList(ctx : CParser.GenericAssocListContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#genericAssociation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGenericAssociation(ctx : CParser.GenericAssociationContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPostfixExpression(ctx : CParser.PostfixExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitArgumentExpressionList(ctx : CParser.ArgumentExpressionListContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnaryExpression(ctx : CParser.UnaryExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnaryOperator(ctx : CParser.UnaryOperatorContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCastExpression(ctx : CParser.CastExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMultiplicativeExpression(ctx : CParser.MultiplicativeExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAdditiveExpression(ctx : CParser.AdditiveExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitShiftExpression(ctx : CParser.ShiftExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRelationalExpression(ctx : CParser.RelationalExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEqualityExpression(ctx : CParser.EqualityExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAndExpression(ctx : CParser.AndExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExclusiveOrExpression(ctx : CParser.ExclusiveOrExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInclusiveOrExpression(ctx : CParser.InclusiveOrExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLogicalAndExpression(ctx : CParser.LogicalAndExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLogicalOrExpression(ctx : CParser.LogicalOrExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConditionalExpression(ctx : CParser.ConditionalExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAssignmentExpression(ctx : CParser.AssignmentExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAssignmentOperator(ctx : CParser.AssignmentOperatorContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExpression(ctx : CParser.ExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConstantExpression(ctx : CParser.ConstantExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDeclaration(ctx : CParser.DeclarationContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDeclarationSpecifiers(ctx : CParser.DeclarationSpecifiersContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDeclarationSpecifiers2(ctx : CParser.DeclarationSpecifiers2Context) : T
	/**
	 * Visit a parse tree produced by {@link CParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDeclarationSpecifier(ctx : CParser.DeclarationSpecifierContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInitDeclaratorList(ctx : CParser.InitDeclaratorListContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInitDeclarator(ctx : CParser.InitDeclaratorContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStorageClassSpecifier(ctx : CParser.StorageClassSpecifierContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTypeSpecifier(ctx : CParser.TypeSpecifierContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStructOrUnionSpecifier(ctx : CParser.StructOrUnionSpecifierContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#structOrUnion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStructOrUnion(ctx : CParser.StructOrUnionContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#structDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStructDeclarationList(ctx : CParser.StructDeclarationListContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStructDeclaration(ctx : CParser.StructDeclarationContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSpecifierQualifierList(ctx : CParser.SpecifierQualifierListContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStructDeclaratorList(ctx : CParser.StructDeclaratorListContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#structDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStructDeclarator(ctx : CParser.StructDeclaratorContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#enumSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEnumSpecifier(ctx : CParser.EnumSpecifierContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#enumeratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEnumeratorList(ctx : CParser.EnumeratorListContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEnumerator(ctx : CParser.EnumeratorContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#enumerationConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEnumerationConstant(ctx : CParser.EnumerationConstantContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAtomicTypeSpecifier(ctx : CParser.AtomicTypeSpecifierContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#typeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTypeQualifier(ctx : CParser.TypeQualifierContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#functionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFunctionSpecifier(ctx : CParser.FunctionSpecifierContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAlignmentSpecifier(ctx : CParser.AlignmentSpecifierContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDeclarator(ctx : CParser.DeclaratorContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDirectDeclarator(ctx : CParser.DirectDeclaratorContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGccDeclaratorExtension(ctx : CParser.GccDeclaratorExtensionContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGccAttributeSpecifier(ctx : CParser.GccAttributeSpecifierContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#gccAttributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGccAttributeList(ctx : CParser.GccAttributeListContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#gccAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGccAttribute(ctx : CParser.GccAttributeContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNestedParenthesesBlock(ctx : CParser.NestedParenthesesBlockContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPointer(ctx : CParser.PointerContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#typeQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTypeQualifierList(ctx : CParser.TypeQualifierListContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#parameterTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitParameterTypeList(ctx : CParser.ParameterTypeListContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitParameterList(ctx : CParser.ParameterListContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitParameterDeclaration(ctx : CParser.ParameterDeclarationContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIdentifierList(ctx : CParser.IdentifierListContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTypeName(ctx : CParser.TypeNameContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAbstractDeclarator(ctx : CParser.AbstractDeclaratorContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDirectAbstractDeclarator(ctx : CParser.DirectAbstractDeclaratorContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#typedefName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTypedefName(ctx : CParser.TypedefNameContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInitializer(ctx : CParser.InitializerContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInitializerList(ctx : CParser.InitializerListContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#designation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDesignation(ctx : CParser.DesignationContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#designatorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDesignatorList(ctx : CParser.DesignatorListContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDesignator(ctx : CParser.DesignatorContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStaticAssertDeclaration(ctx : CParser.StaticAssertDeclarationContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStatement(ctx : CParser.StatementContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLabeledStatement(ctx : CParser.LabeledStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCompoundStatement(ctx : CParser.CompoundStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#blockItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBlockItemList(ctx : CParser.BlockItemListContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBlockItem(ctx : CParser.BlockItemContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExpressionStatement(ctx : CParser.ExpressionStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSelectionStatement(ctx : CParser.SelectionStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIterationStatement(ctx : CParser.IterationStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitForCondition(ctx : CParser.ForConditionContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#forDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitForDeclaration(ctx : CParser.ForDeclarationContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#forExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitForExpression(ctx : CParser.ForExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitJumpStatement(ctx : CParser.JumpStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCompilationUnit(ctx : CParser.CompilationUnitContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTranslationUnit(ctx : CParser.TranslationUnitContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#externalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExternalDeclaration(ctx : CParser.ExternalDeclarationContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFunctionDefinition(ctx : CParser.FunctionDefinitionContext) : T
	/**
	 * Visit a parse tree produced by {@link CParser#declarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDeclarationList(ctx : CParser.DeclarationListContext) : T
}