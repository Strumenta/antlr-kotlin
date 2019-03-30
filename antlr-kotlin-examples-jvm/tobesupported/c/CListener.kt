// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CParser}.
 */
interface CListener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	fun enterPrimaryExpression(ctx: CParser.PrimaryExpressionContext)
	/**
	 * Exit a parse tree produced by {@link CParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	fun exitPrimaryExpression(ctx: CParser.PrimaryExpressionContext)
	/**
	 * Enter a parse tree produced by {@link CParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	fun enterGenericSelection(ctx: CParser.GenericSelectionContext)
	/**
	 * Exit a parse tree produced by {@link CParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	fun exitGenericSelection(ctx: CParser.GenericSelectionContext)
	/**
	 * Enter a parse tree produced by {@link CParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	fun enterGenericAssocList(ctx: CParser.GenericAssocListContext)
	/**
	 * Exit a parse tree produced by {@link CParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	fun exitGenericAssocList(ctx: CParser.GenericAssocListContext)
	/**
	 * Enter a parse tree produced by {@link CParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	fun enterGenericAssociation(ctx: CParser.GenericAssociationContext)
	/**
	 * Exit a parse tree produced by {@link CParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	fun exitGenericAssociation(ctx: CParser.GenericAssociationContext)
	/**
	 * Enter a parse tree produced by {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	fun enterPostfixExpression(ctx: CParser.PostfixExpressionContext)
	/**
	 * Exit a parse tree produced by {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	fun exitPostfixExpression(ctx: CParser.PostfixExpressionContext)
	/**
	 * Enter a parse tree produced by {@link CParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	fun enterArgumentExpressionList(ctx: CParser.ArgumentExpressionListContext)
	/**
	 * Exit a parse tree produced by {@link CParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	fun exitArgumentExpressionList(ctx: CParser.ArgumentExpressionListContext)
	/**
	 * Enter a parse tree produced by {@link CParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	fun enterUnaryExpression(ctx: CParser.UnaryExpressionContext)
	/**
	 * Exit a parse tree produced by {@link CParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	fun exitUnaryExpression(ctx: CParser.UnaryExpressionContext)
	/**
	 * Enter a parse tree produced by {@link CParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	fun enterUnaryOperator(ctx: CParser.UnaryOperatorContext)
	/**
	 * Exit a parse tree produced by {@link CParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	fun exitUnaryOperator(ctx: CParser.UnaryOperatorContext)
	/**
	 * Enter a parse tree produced by {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 */
	fun enterCastExpression(ctx: CParser.CastExpressionContext)
	/**
	 * Exit a parse tree produced by {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 */
	fun exitCastExpression(ctx: CParser.CastExpressionContext)
	/**
	 * Enter a parse tree produced by {@link CParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	fun enterMultiplicativeExpression(ctx: CParser.MultiplicativeExpressionContext)
	/**
	 * Exit a parse tree produced by {@link CParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	fun exitMultiplicativeExpression(ctx: CParser.MultiplicativeExpressionContext)
	/**
	 * Enter a parse tree produced by {@link CParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	fun enterAdditiveExpression(ctx: CParser.AdditiveExpressionContext)
	/**
	 * Exit a parse tree produced by {@link CParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	fun exitAdditiveExpression(ctx: CParser.AdditiveExpressionContext)
	/**
	 * Enter a parse tree produced by {@link CParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	fun enterShiftExpression(ctx: CParser.ShiftExpressionContext)
	/**
	 * Exit a parse tree produced by {@link CParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	fun exitShiftExpression(ctx: CParser.ShiftExpressionContext)
	/**
	 * Enter a parse tree produced by {@link CParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	fun enterRelationalExpression(ctx: CParser.RelationalExpressionContext)
	/**
	 * Exit a parse tree produced by {@link CParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	fun exitRelationalExpression(ctx: CParser.RelationalExpressionContext)
	/**
	 * Enter a parse tree produced by {@link CParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	fun enterEqualityExpression(ctx: CParser.EqualityExpressionContext)
	/**
	 * Exit a parse tree produced by {@link CParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	fun exitEqualityExpression(ctx: CParser.EqualityExpressionContext)
	/**
	 * Enter a parse tree produced by {@link CParser#andExpression}.
	 * @param ctx the parse tree
	 */
	fun enterAndExpression(ctx: CParser.AndExpressionContext)
	/**
	 * Exit a parse tree produced by {@link CParser#andExpression}.
	 * @param ctx the parse tree
	 */
	fun exitAndExpression(ctx: CParser.AndExpressionContext)
	/**
	 * Enter a parse tree produced by {@link CParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	fun enterExclusiveOrExpression(ctx: CParser.ExclusiveOrExpressionContext)
	/**
	 * Exit a parse tree produced by {@link CParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	fun exitExclusiveOrExpression(ctx: CParser.ExclusiveOrExpressionContext)
	/**
	 * Enter a parse tree produced by {@link CParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	fun enterInclusiveOrExpression(ctx: CParser.InclusiveOrExpressionContext)
	/**
	 * Exit a parse tree produced by {@link CParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	fun exitInclusiveOrExpression(ctx: CParser.InclusiveOrExpressionContext)
	/**
	 * Enter a parse tree produced by {@link CParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	fun enterLogicalAndExpression(ctx: CParser.LogicalAndExpressionContext)
	/**
	 * Exit a parse tree produced by {@link CParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	fun exitLogicalAndExpression(ctx: CParser.LogicalAndExpressionContext)
	/**
	 * Enter a parse tree produced by {@link CParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	fun enterLogicalOrExpression(ctx: CParser.LogicalOrExpressionContext)
	/**
	 * Exit a parse tree produced by {@link CParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	fun exitLogicalOrExpression(ctx: CParser.LogicalOrExpressionContext)
	/**
	 * Enter a parse tree produced by {@link CParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	fun enterConditionalExpression(ctx: CParser.ConditionalExpressionContext)
	/**
	 * Exit a parse tree produced by {@link CParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	fun exitConditionalExpression(ctx: CParser.ConditionalExpressionContext)
	/**
	 * Enter a parse tree produced by {@link CParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	fun enterAssignmentExpression(ctx: CParser.AssignmentExpressionContext)
	/**
	 * Exit a parse tree produced by {@link CParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	fun exitAssignmentExpression(ctx: CParser.AssignmentExpressionContext)
	/**
	 * Enter a parse tree produced by {@link CParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	fun enterAssignmentOperator(ctx: CParser.AssignmentOperatorContext)
	/**
	 * Exit a parse tree produced by {@link CParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	fun exitAssignmentOperator(ctx: CParser.AssignmentOperatorContext)
	/**
	 * Enter a parse tree produced by {@link CParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterExpression(ctx: CParser.ExpressionContext)
	/**
	 * Exit a parse tree produced by {@link CParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitExpression(ctx: CParser.ExpressionContext)
	/**
	 * Enter a parse tree produced by {@link CParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	fun enterConstantExpression(ctx: CParser.ConstantExpressionContext)
	/**
	 * Exit a parse tree produced by {@link CParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	fun exitConstantExpression(ctx: CParser.ConstantExpressionContext)
	/**
	 * Enter a parse tree produced by {@link CParser#declaration}.
	 * @param ctx the parse tree
	 */
	fun enterDeclaration(ctx: CParser.DeclarationContext)
	/**
	 * Exit a parse tree produced by {@link CParser#declaration}.
	 * @param ctx the parse tree
	 */
	fun exitDeclaration(ctx: CParser.DeclarationContext)
	/**
	 * Enter a parse tree produced by {@link CParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	fun enterDeclarationSpecifiers(ctx: CParser.DeclarationSpecifiersContext)
	/**
	 * Exit a parse tree produced by {@link CParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	fun exitDeclarationSpecifiers(ctx: CParser.DeclarationSpecifiersContext)
	/**
	 * Enter a parse tree produced by {@link CParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	fun enterDeclarationSpecifiers2(ctx: CParser.DeclarationSpecifiers2Context)
	/**
	 * Exit a parse tree produced by {@link CParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	fun exitDeclarationSpecifiers2(ctx: CParser.DeclarationSpecifiers2Context)
	/**
	 * Enter a parse tree produced by {@link CParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	fun enterDeclarationSpecifier(ctx: CParser.DeclarationSpecifierContext)
	/**
	 * Exit a parse tree produced by {@link CParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	fun exitDeclarationSpecifier(ctx: CParser.DeclarationSpecifierContext)
	/**
	 * Enter a parse tree produced by {@link CParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	fun enterInitDeclaratorList(ctx: CParser.InitDeclaratorListContext)
	/**
	 * Exit a parse tree produced by {@link CParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	fun exitInitDeclaratorList(ctx: CParser.InitDeclaratorListContext)
	/**
	 * Enter a parse tree produced by {@link CParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	fun enterInitDeclarator(ctx: CParser.InitDeclaratorContext)
	/**
	 * Exit a parse tree produced by {@link CParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	fun exitInitDeclarator(ctx: CParser.InitDeclaratorContext)
	/**
	 * Enter a parse tree produced by {@link CParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	fun enterStorageClassSpecifier(ctx: CParser.StorageClassSpecifierContext)
	/**
	 * Exit a parse tree produced by {@link CParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	fun exitStorageClassSpecifier(ctx: CParser.StorageClassSpecifierContext)
	/**
	 * Enter a parse tree produced by {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	fun enterTypeSpecifier(ctx: CParser.TypeSpecifierContext)
	/**
	 * Exit a parse tree produced by {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	fun exitTypeSpecifier(ctx: CParser.TypeSpecifierContext)
	/**
	 * Enter a parse tree produced by {@link CParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	fun enterStructOrUnionSpecifier(ctx: CParser.StructOrUnionSpecifierContext)
	/**
	 * Exit a parse tree produced by {@link CParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	fun exitStructOrUnionSpecifier(ctx: CParser.StructOrUnionSpecifierContext)
	/**
	 * Enter a parse tree produced by {@link CParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	fun enterStructOrUnion(ctx: CParser.StructOrUnionContext)
	/**
	 * Exit a parse tree produced by {@link CParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	fun exitStructOrUnion(ctx: CParser.StructOrUnionContext)
	/**
	 * Enter a parse tree produced by {@link CParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	fun enterStructDeclarationList(ctx: CParser.StructDeclarationListContext)
	/**
	 * Exit a parse tree produced by {@link CParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	fun exitStructDeclarationList(ctx: CParser.StructDeclarationListContext)
	/**
	 * Enter a parse tree produced by {@link CParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	fun enterStructDeclaration(ctx: CParser.StructDeclarationContext)
	/**
	 * Exit a parse tree produced by {@link CParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	fun exitStructDeclaration(ctx: CParser.StructDeclarationContext)
	/**
	 * Enter a parse tree produced by {@link CParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	fun enterSpecifierQualifierList(ctx: CParser.SpecifierQualifierListContext)
	/**
	 * Exit a parse tree produced by {@link CParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	fun exitSpecifierQualifierList(ctx: CParser.SpecifierQualifierListContext)
	/**
	 * Enter a parse tree produced by {@link CParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	fun enterStructDeclaratorList(ctx: CParser.StructDeclaratorListContext)
	/**
	 * Exit a parse tree produced by {@link CParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	fun exitStructDeclaratorList(ctx: CParser.StructDeclaratorListContext)
	/**
	 * Enter a parse tree produced by {@link CParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	fun enterStructDeclarator(ctx: CParser.StructDeclaratorContext)
	/**
	 * Exit a parse tree produced by {@link CParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	fun exitStructDeclarator(ctx: CParser.StructDeclaratorContext)
	/**
	 * Enter a parse tree produced by {@link CParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	fun enterEnumSpecifier(ctx: CParser.EnumSpecifierContext)
	/**
	 * Exit a parse tree produced by {@link CParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	fun exitEnumSpecifier(ctx: CParser.EnumSpecifierContext)
	/**
	 * Enter a parse tree produced by {@link CParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	fun enterEnumeratorList(ctx: CParser.EnumeratorListContext)
	/**
	 * Exit a parse tree produced by {@link CParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	fun exitEnumeratorList(ctx: CParser.EnumeratorListContext)
	/**
	 * Enter a parse tree produced by {@link CParser#enumerator}.
	 * @param ctx the parse tree
	 */
	fun enterEnumerator(ctx: CParser.EnumeratorContext)
	/**
	 * Exit a parse tree produced by {@link CParser#enumerator}.
	 * @param ctx the parse tree
	 */
	fun exitEnumerator(ctx: CParser.EnumeratorContext)
	/**
	 * Enter a parse tree produced by {@link CParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	fun enterEnumerationConstant(ctx: CParser.EnumerationConstantContext)
	/**
	 * Exit a parse tree produced by {@link CParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	fun exitEnumerationConstant(ctx: CParser.EnumerationConstantContext)
	/**
	 * Enter a parse tree produced by {@link CParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	fun enterAtomicTypeSpecifier(ctx: CParser.AtomicTypeSpecifierContext)
	/**
	 * Exit a parse tree produced by {@link CParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	fun exitAtomicTypeSpecifier(ctx: CParser.AtomicTypeSpecifierContext)
	/**
	 * Enter a parse tree produced by {@link CParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	fun enterTypeQualifier(ctx: CParser.TypeQualifierContext)
	/**
	 * Exit a parse tree produced by {@link CParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	fun exitTypeQualifier(ctx: CParser.TypeQualifierContext)
	/**
	 * Enter a parse tree produced by {@link CParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	fun enterFunctionSpecifier(ctx: CParser.FunctionSpecifierContext)
	/**
	 * Exit a parse tree produced by {@link CParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	fun exitFunctionSpecifier(ctx: CParser.FunctionSpecifierContext)
	/**
	 * Enter a parse tree produced by {@link CParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	fun enterAlignmentSpecifier(ctx: CParser.AlignmentSpecifierContext)
	/**
	 * Exit a parse tree produced by {@link CParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	fun exitAlignmentSpecifier(ctx: CParser.AlignmentSpecifierContext)
	/**
	 * Enter a parse tree produced by {@link CParser#declarator}.
	 * @param ctx the parse tree
	 */
	fun enterDeclarator(ctx: CParser.DeclaratorContext)
	/**
	 * Exit a parse tree produced by {@link CParser#declarator}.
	 * @param ctx the parse tree
	 */
	fun exitDeclarator(ctx: CParser.DeclaratorContext)
	/**
	 * Enter a parse tree produced by {@link CParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	fun enterDirectDeclarator(ctx: CParser.DirectDeclaratorContext)
	/**
	 * Exit a parse tree produced by {@link CParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	fun exitDirectDeclarator(ctx: CParser.DirectDeclaratorContext)
	/**
	 * Enter a parse tree produced by {@link CParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	fun enterGccDeclaratorExtension(ctx: CParser.GccDeclaratorExtensionContext)
	/**
	 * Exit a parse tree produced by {@link CParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	fun exitGccDeclaratorExtension(ctx: CParser.GccDeclaratorExtensionContext)
	/**
	 * Enter a parse tree produced by {@link CParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	fun enterGccAttributeSpecifier(ctx: CParser.GccAttributeSpecifierContext)
	/**
	 * Exit a parse tree produced by {@link CParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	fun exitGccAttributeSpecifier(ctx: CParser.GccAttributeSpecifierContext)
	/**
	 * Enter a parse tree produced by {@link CParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	fun enterGccAttributeList(ctx: CParser.GccAttributeListContext)
	/**
	 * Exit a parse tree produced by {@link CParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	fun exitGccAttributeList(ctx: CParser.GccAttributeListContext)
	/**
	 * Enter a parse tree produced by {@link CParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	fun enterGccAttribute(ctx: CParser.GccAttributeContext)
	/**
	 * Exit a parse tree produced by {@link CParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	fun exitGccAttribute(ctx: CParser.GccAttributeContext)
	/**
	 * Enter a parse tree produced by {@link CParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	fun enterNestedParenthesesBlock(ctx: CParser.NestedParenthesesBlockContext)
	/**
	 * Exit a parse tree produced by {@link CParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	fun exitNestedParenthesesBlock(ctx: CParser.NestedParenthesesBlockContext)
	/**
	 * Enter a parse tree produced by {@link CParser#pointer}.
	 * @param ctx the parse tree
	 */
	fun enterPointer(ctx: CParser.PointerContext)
	/**
	 * Exit a parse tree produced by {@link CParser#pointer}.
	 * @param ctx the parse tree
	 */
	fun exitPointer(ctx: CParser.PointerContext)
	/**
	 * Enter a parse tree produced by {@link CParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	fun enterTypeQualifierList(ctx: CParser.TypeQualifierListContext)
	/**
	 * Exit a parse tree produced by {@link CParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	fun exitTypeQualifierList(ctx: CParser.TypeQualifierListContext)
	/**
	 * Enter a parse tree produced by {@link CParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	fun enterParameterTypeList(ctx: CParser.ParameterTypeListContext)
	/**
	 * Exit a parse tree produced by {@link CParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	fun exitParameterTypeList(ctx: CParser.ParameterTypeListContext)
	/**
	 * Enter a parse tree produced by {@link CParser#parameterList}.
	 * @param ctx the parse tree
	 */
	fun enterParameterList(ctx: CParser.ParameterListContext)
	/**
	 * Exit a parse tree produced by {@link CParser#parameterList}.
	 * @param ctx the parse tree
	 */
	fun exitParameterList(ctx: CParser.ParameterListContext)
	/**
	 * Enter a parse tree produced by {@link CParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	fun enterParameterDeclaration(ctx: CParser.ParameterDeclarationContext)
	/**
	 * Exit a parse tree produced by {@link CParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	fun exitParameterDeclaration(ctx: CParser.ParameterDeclarationContext)
	/**
	 * Enter a parse tree produced by {@link CParser#identifierList}.
	 * @param ctx the parse tree
	 */
	fun enterIdentifierList(ctx: CParser.IdentifierListContext)
	/**
	 * Exit a parse tree produced by {@link CParser#identifierList}.
	 * @param ctx the parse tree
	 */
	fun exitIdentifierList(ctx: CParser.IdentifierListContext)
	/**
	 * Enter a parse tree produced by {@link CParser#typeName}.
	 * @param ctx the parse tree
	 */
	fun enterTypeName(ctx: CParser.TypeNameContext)
	/**
	 * Exit a parse tree produced by {@link CParser#typeName}.
	 * @param ctx the parse tree
	 */
	fun exitTypeName(ctx: CParser.TypeNameContext)
	/**
	 * Enter a parse tree produced by {@link CParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	fun enterAbstractDeclarator(ctx: CParser.AbstractDeclaratorContext)
	/**
	 * Exit a parse tree produced by {@link CParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	fun exitAbstractDeclarator(ctx: CParser.AbstractDeclaratorContext)
	/**
	 * Enter a parse tree produced by {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	fun enterDirectAbstractDeclarator(ctx: CParser.DirectAbstractDeclaratorContext)
	/**
	 * Exit a parse tree produced by {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	fun exitDirectAbstractDeclarator(ctx: CParser.DirectAbstractDeclaratorContext)
	/**
	 * Enter a parse tree produced by {@link CParser#typedefName}.
	 * @param ctx the parse tree
	 */
	fun enterTypedefName(ctx: CParser.TypedefNameContext)
	/**
	 * Exit a parse tree produced by {@link CParser#typedefName}.
	 * @param ctx the parse tree
	 */
	fun exitTypedefName(ctx: CParser.TypedefNameContext)
	/**
	 * Enter a parse tree produced by {@link CParser#initializer}.
	 * @param ctx the parse tree
	 */
	fun enterInitializer(ctx: CParser.InitializerContext)
	/**
	 * Exit a parse tree produced by {@link CParser#initializer}.
	 * @param ctx the parse tree
	 */
	fun exitInitializer(ctx: CParser.InitializerContext)
	/**
	 * Enter a parse tree produced by {@link CParser#initializerList}.
	 * @param ctx the parse tree
	 */
	fun enterInitializerList(ctx: CParser.InitializerListContext)
	/**
	 * Exit a parse tree produced by {@link CParser#initializerList}.
	 * @param ctx the parse tree
	 */
	fun exitInitializerList(ctx: CParser.InitializerListContext)
	/**
	 * Enter a parse tree produced by {@link CParser#designation}.
	 * @param ctx the parse tree
	 */
	fun enterDesignation(ctx: CParser.DesignationContext)
	/**
	 * Exit a parse tree produced by {@link CParser#designation}.
	 * @param ctx the parse tree
	 */
	fun exitDesignation(ctx: CParser.DesignationContext)
	/**
	 * Enter a parse tree produced by {@link CParser#designatorList}.
	 * @param ctx the parse tree
	 */
	fun enterDesignatorList(ctx: CParser.DesignatorListContext)
	/**
	 * Exit a parse tree produced by {@link CParser#designatorList}.
	 * @param ctx the parse tree
	 */
	fun exitDesignatorList(ctx: CParser.DesignatorListContext)
	/**
	 * Enter a parse tree produced by {@link CParser#designator}.
	 * @param ctx the parse tree
	 */
	fun enterDesignator(ctx: CParser.DesignatorContext)
	/**
	 * Exit a parse tree produced by {@link CParser#designator}.
	 * @param ctx the parse tree
	 */
	fun exitDesignator(ctx: CParser.DesignatorContext)
	/**
	 * Enter a parse tree produced by {@link CParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	fun enterStaticAssertDeclaration(ctx: CParser.StaticAssertDeclarationContext)
	/**
	 * Exit a parse tree produced by {@link CParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	fun exitStaticAssertDeclaration(ctx: CParser.StaticAssertDeclarationContext)
	/**
	 * Enter a parse tree produced by {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	fun enterStatement(ctx: CParser.StatementContext)
	/**
	 * Exit a parse tree produced by {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	fun exitStatement(ctx: CParser.StatementContext)
	/**
	 * Enter a parse tree produced by {@link CParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	fun enterLabeledStatement(ctx: CParser.LabeledStatementContext)
	/**
	 * Exit a parse tree produced by {@link CParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	fun exitLabeledStatement(ctx: CParser.LabeledStatementContext)
	/**
	 * Enter a parse tree produced by {@link CParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	fun enterCompoundStatement(ctx: CParser.CompoundStatementContext)
	/**
	 * Exit a parse tree produced by {@link CParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	fun exitCompoundStatement(ctx: CParser.CompoundStatementContext)
	/**
	 * Enter a parse tree produced by {@link CParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	fun enterBlockItemList(ctx: CParser.BlockItemListContext)
	/**
	 * Exit a parse tree produced by {@link CParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	fun exitBlockItemList(ctx: CParser.BlockItemListContext)
	/**
	 * Enter a parse tree produced by {@link CParser#blockItem}.
	 * @param ctx the parse tree
	 */
	fun enterBlockItem(ctx: CParser.BlockItemContext)
	/**
	 * Exit a parse tree produced by {@link CParser#blockItem}.
	 * @param ctx the parse tree
	 */
	fun exitBlockItem(ctx: CParser.BlockItemContext)
	/**
	 * Enter a parse tree produced by {@link CParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	fun enterExpressionStatement(ctx: CParser.ExpressionStatementContext)
	/**
	 * Exit a parse tree produced by {@link CParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	fun exitExpressionStatement(ctx: CParser.ExpressionStatementContext)
	/**
	 * Enter a parse tree produced by {@link CParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	fun enterSelectionStatement(ctx: CParser.SelectionStatementContext)
	/**
	 * Exit a parse tree produced by {@link CParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	fun exitSelectionStatement(ctx: CParser.SelectionStatementContext)
	/**
	 * Enter a parse tree produced by {@link CParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	fun enterIterationStatement(ctx: CParser.IterationStatementContext)
	/**
	 * Exit a parse tree produced by {@link CParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	fun exitIterationStatement(ctx: CParser.IterationStatementContext)
	/**
	 * Enter a parse tree produced by {@link CParser#forCondition}.
	 * @param ctx the parse tree
	 */
	fun enterForCondition(ctx: CParser.ForConditionContext)
	/**
	 * Exit a parse tree produced by {@link CParser#forCondition}.
	 * @param ctx the parse tree
	 */
	fun exitForCondition(ctx: CParser.ForConditionContext)
	/**
	 * Enter a parse tree produced by {@link CParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	fun enterForDeclaration(ctx: CParser.ForDeclarationContext)
	/**
	 * Exit a parse tree produced by {@link CParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	fun exitForDeclaration(ctx: CParser.ForDeclarationContext)
	/**
	 * Enter a parse tree produced by {@link CParser#forExpression}.
	 * @param ctx the parse tree
	 */
	fun enterForExpression(ctx: CParser.ForExpressionContext)
	/**
	 * Exit a parse tree produced by {@link CParser#forExpression}.
	 * @param ctx the parse tree
	 */
	fun exitForExpression(ctx: CParser.ForExpressionContext)
	/**
	 * Enter a parse tree produced by {@link CParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	fun enterJumpStatement(ctx: CParser.JumpStatementContext)
	/**
	 * Exit a parse tree produced by {@link CParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	fun exitJumpStatement(ctx: CParser.JumpStatementContext)
	/**
	 * Enter a parse tree produced by {@link CParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	fun enterCompilationUnit(ctx: CParser.CompilationUnitContext)
	/**
	 * Exit a parse tree produced by {@link CParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	fun exitCompilationUnit(ctx: CParser.CompilationUnitContext)
	/**
	 * Enter a parse tree produced by {@link CParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	fun enterTranslationUnit(ctx: CParser.TranslationUnitContext)
	/**
	 * Exit a parse tree produced by {@link CParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	fun exitTranslationUnit(ctx: CParser.TranslationUnitContext)
	/**
	 * Enter a parse tree produced by {@link CParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	fun enterExternalDeclaration(ctx: CParser.ExternalDeclarationContext)
	/**
	 * Exit a parse tree produced by {@link CParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	fun exitExternalDeclaration(ctx: CParser.ExternalDeclarationContext)
	/**
	 * Enter a parse tree produced by {@link CParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	fun enterFunctionDefinition(ctx: CParser.FunctionDefinitionContext)
	/**
	 * Exit a parse tree produced by {@link CParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	fun exitFunctionDefinition(ctx: CParser.FunctionDefinitionContext)
	/**
	 * Enter a parse tree produced by {@link CParser#declarationList}.
	 * @param ctx the parse tree
	 */
	fun enterDeclarationList(ctx: CParser.DeclarationListContext)
	/**
	 * Exit a parse tree produced by {@link CParser#declarationList}.
	 * @param ctx the parse tree
	 */
	fun exitDeclarationList(ctx: CParser.DeclarationListContext)
}