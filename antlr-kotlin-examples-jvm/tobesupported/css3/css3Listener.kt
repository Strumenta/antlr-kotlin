// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link css3Parser}.
 */
interface css3Listener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link css3Parser#stylesheet}.
	 * @param ctx the parse tree
	 */
	fun enterStylesheet(ctx: css3Parser.StylesheetContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#stylesheet}.
	 * @param ctx the parse tree
	 */
	fun exitStylesheet(ctx: css3Parser.StylesheetContext)
	/**
	 * Enter a parse tree produced by the {@code goodCharset}
	 * labeled alternative in {@link css3Parser#charset}.
	 * @param ctx the parse tree
	 */
	fun enterGoodCharset(ctx: css3Parser.GoodCharsetContext)
	/**
	 * Exit a parse tree produced by the {@code goodCharset}
	 * labeled alternative in {@link css3Parser#charset}.
	 * @param ctx the parse tree
	 */
	fun exitGoodCharset(ctx: css3Parser.GoodCharsetContext)
	/**
	 * Enter a parse tree produced by the {@code badCharset}
	 * labeled alternative in {@link css3Parser#charset}.
	 * @param ctx the parse tree
	 */
	fun enterBadCharset(ctx: css3Parser.BadCharsetContext)
	/**
	 * Exit a parse tree produced by the {@code badCharset}
	 * labeled alternative in {@link css3Parser#charset}.
	 * @param ctx the parse tree
	 */
	fun exitBadCharset(ctx: css3Parser.BadCharsetContext)
	/**
	 * Enter a parse tree produced by the {@code goodImport}
	 * labeled alternative in {@link css3Parser#imports}.
	 * @param ctx the parse tree
	 */
	fun enterGoodImport(ctx: css3Parser.GoodImportContext)
	/**
	 * Exit a parse tree produced by the {@code goodImport}
	 * labeled alternative in {@link css3Parser#imports}.
	 * @param ctx the parse tree
	 */
	fun exitGoodImport(ctx: css3Parser.GoodImportContext)
	/**
	 * Enter a parse tree produced by the {@code badImport}
	 * labeled alternative in {@link css3Parser#imports}.
	 * @param ctx the parse tree
	 */
	fun enterBadImport(ctx: css3Parser.BadImportContext)
	/**
	 * Exit a parse tree produced by the {@code badImport}
	 * labeled alternative in {@link css3Parser#imports}.
	 * @param ctx the parse tree
	 */
	fun exitBadImport(ctx: css3Parser.BadImportContext)
	/**
	 * Enter a parse tree produced by the {@code goodNamespace}
	 * labeled alternative in {@link css3Parser#namespace}.
	 * @param ctx the parse tree
	 */
	fun enterGoodNamespace(ctx: css3Parser.GoodNamespaceContext)
	/**
	 * Exit a parse tree produced by the {@code goodNamespace}
	 * labeled alternative in {@link css3Parser#namespace}.
	 * @param ctx the parse tree
	 */
	fun exitGoodNamespace(ctx: css3Parser.GoodNamespaceContext)
	/**
	 * Enter a parse tree produced by the {@code badNamespace}
	 * labeled alternative in {@link css3Parser#namespace}.
	 * @param ctx the parse tree
	 */
	fun enterBadNamespace(ctx: css3Parser.BadNamespaceContext)
	/**
	 * Exit a parse tree produced by the {@code badNamespace}
	 * labeled alternative in {@link css3Parser#namespace}.
	 * @param ctx the parse tree
	 */
	fun exitBadNamespace(ctx: css3Parser.BadNamespaceContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#namespacePrefix}.
	 * @param ctx the parse tree
	 */
	fun enterNamespacePrefix(ctx: css3Parser.NamespacePrefixContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#namespacePrefix}.
	 * @param ctx the parse tree
	 */
	fun exitNamespacePrefix(ctx: css3Parser.NamespacePrefixContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#media}.
	 * @param ctx the parse tree
	 */
	fun enterMedia(ctx: css3Parser.MediaContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#media}.
	 * @param ctx the parse tree
	 */
	fun exitMedia(ctx: css3Parser.MediaContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#mediaQueryList}.
	 * @param ctx the parse tree
	 */
	fun enterMediaQueryList(ctx: css3Parser.MediaQueryListContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#mediaQueryList}.
	 * @param ctx the parse tree
	 */
	fun exitMediaQueryList(ctx: css3Parser.MediaQueryListContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#mediaQuery}.
	 * @param ctx the parse tree
	 */
	fun enterMediaQuery(ctx: css3Parser.MediaQueryContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#mediaQuery}.
	 * @param ctx the parse tree
	 */
	fun exitMediaQuery(ctx: css3Parser.MediaQueryContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#mediaType}.
	 * @param ctx the parse tree
	 */
	fun enterMediaType(ctx: css3Parser.MediaTypeContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#mediaType}.
	 * @param ctx the parse tree
	 */
	fun exitMediaType(ctx: css3Parser.MediaTypeContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#mediaExpression}.
	 * @param ctx the parse tree
	 */
	fun enterMediaExpression(ctx: css3Parser.MediaExpressionContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#mediaExpression}.
	 * @param ctx the parse tree
	 */
	fun exitMediaExpression(ctx: css3Parser.MediaExpressionContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#mediaFeature}.
	 * @param ctx the parse tree
	 */
	fun enterMediaFeature(ctx: css3Parser.MediaFeatureContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#mediaFeature}.
	 * @param ctx the parse tree
	 */
	fun exitMediaFeature(ctx: css3Parser.MediaFeatureContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#page}.
	 * @param ctx the parse tree
	 */
	fun enterPage(ctx: css3Parser.PageContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#page}.
	 * @param ctx the parse tree
	 */
	fun exitPage(ctx: css3Parser.PageContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#pseudoPage}.
	 * @param ctx the parse tree
	 */
	fun enterPseudoPage(ctx: css3Parser.PseudoPageContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#pseudoPage}.
	 * @param ctx the parse tree
	 */
	fun exitPseudoPage(ctx: css3Parser.PseudoPageContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#selectorGroup}.
	 * @param ctx the parse tree
	 */
	fun enterSelectorGroup(ctx: css3Parser.SelectorGroupContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#selectorGroup}.
	 * @param ctx the parse tree
	 */
	fun exitSelectorGroup(ctx: css3Parser.SelectorGroupContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#selector}.
	 * @param ctx the parse tree
	 */
	fun enterSelector(ctx: css3Parser.SelectorContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#selector}.
	 * @param ctx the parse tree
	 */
	fun exitSelector(ctx: css3Parser.SelectorContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#combinator}.
	 * @param ctx the parse tree
	 */
	fun enterCombinator(ctx: css3Parser.CombinatorContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#combinator}.
	 * @param ctx the parse tree
	 */
	fun exitCombinator(ctx: css3Parser.CombinatorContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#simpleSelectorSequence}.
	 * @param ctx the parse tree
	 */
	fun enterSimpleSelectorSequence(ctx: css3Parser.SimpleSelectorSequenceContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#simpleSelectorSequence}.
	 * @param ctx the parse tree
	 */
	fun exitSimpleSelectorSequence(ctx: css3Parser.SimpleSelectorSequenceContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#typeSelector}.
	 * @param ctx the parse tree
	 */
	fun enterTypeSelector(ctx: css3Parser.TypeSelectorContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#typeSelector}.
	 * @param ctx the parse tree
	 */
	fun exitTypeSelector(ctx: css3Parser.TypeSelectorContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#typeNamespacePrefix}.
	 * @param ctx the parse tree
	 */
	fun enterTypeNamespacePrefix(ctx: css3Parser.TypeNamespacePrefixContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#typeNamespacePrefix}.
	 * @param ctx the parse tree
	 */
	fun exitTypeNamespacePrefix(ctx: css3Parser.TypeNamespacePrefixContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#elementName}.
	 * @param ctx the parse tree
	 */
	fun enterElementName(ctx: css3Parser.ElementNameContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#elementName}.
	 * @param ctx the parse tree
	 */
	fun exitElementName(ctx: css3Parser.ElementNameContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#universal}.
	 * @param ctx the parse tree
	 */
	fun enterUniversal(ctx: css3Parser.UniversalContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#universal}.
	 * @param ctx the parse tree
	 */
	fun exitUniversal(ctx: css3Parser.UniversalContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#className}.
	 * @param ctx the parse tree
	 */
	fun enterClassName(ctx: css3Parser.ClassNameContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#className}.
	 * @param ctx the parse tree
	 */
	fun exitClassName(ctx: css3Parser.ClassNameContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#attrib}.
	 * @param ctx the parse tree
	 */
	fun enterAttrib(ctx: css3Parser.AttribContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#attrib}.
	 * @param ctx the parse tree
	 */
	fun exitAttrib(ctx: css3Parser.AttribContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#pseudo}.
	 * @param ctx the parse tree
	 */
	fun enterPseudo(ctx: css3Parser.PseudoContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#pseudo}.
	 * @param ctx the parse tree
	 */
	fun exitPseudo(ctx: css3Parser.PseudoContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#functionalPseudo}.
	 * @param ctx the parse tree
	 */
	fun enterFunctionalPseudo(ctx: css3Parser.FunctionalPseudoContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#functionalPseudo}.
	 * @param ctx the parse tree
	 */
	fun exitFunctionalPseudo(ctx: css3Parser.FunctionalPseudoContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterExpression(ctx: css3Parser.ExpressionContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitExpression(ctx: css3Parser.ExpressionContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#negation}.
	 * @param ctx the parse tree
	 */
	fun enterNegation(ctx: css3Parser.NegationContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#negation}.
	 * @param ctx the parse tree
	 */
	fun exitNegation(ctx: css3Parser.NegationContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#negationArg}.
	 * @param ctx the parse tree
	 */
	fun enterNegationArg(ctx: css3Parser.NegationArgContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#negationArg}.
	 * @param ctx the parse tree
	 */
	fun exitNegationArg(ctx: css3Parser.NegationArgContext)
	/**
	 * Enter a parse tree produced by the {@code goodOperator}
	 * labeled alternative in {@link css3Parser#operator}.
	 * @param ctx the parse tree
	 */
	fun enterGoodOperator(ctx: css3Parser.GoodOperatorContext)
	/**
	 * Exit a parse tree produced by the {@code goodOperator}
	 * labeled alternative in {@link css3Parser#operator}.
	 * @param ctx the parse tree
	 */
	fun exitGoodOperator(ctx: css3Parser.GoodOperatorContext)
	/**
	 * Enter a parse tree produced by the {@code badOperator}
	 * labeled alternative in {@link css3Parser#operator}.
	 * @param ctx the parse tree
	 */
	fun enterBadOperator(ctx: css3Parser.BadOperatorContext)
	/**
	 * Exit a parse tree produced by the {@code badOperator}
	 * labeled alternative in {@link css3Parser#operator}.
	 * @param ctx the parse tree
	 */
	fun exitBadOperator(ctx: css3Parser.BadOperatorContext)
	/**
	 * Enter a parse tree produced by the {@code goodProperty}
	 * labeled alternative in {@link css3Parser#property}.
	 * @param ctx the parse tree
	 */
	fun enterGoodProperty(ctx: css3Parser.GoodPropertyContext)
	/**
	 * Exit a parse tree produced by the {@code goodProperty}
	 * labeled alternative in {@link css3Parser#property}.
	 * @param ctx the parse tree
	 */
	fun exitGoodProperty(ctx: css3Parser.GoodPropertyContext)
	/**
	 * Enter a parse tree produced by the {@code badProperty}
	 * labeled alternative in {@link css3Parser#property}.
	 * @param ctx the parse tree
	 */
	fun enterBadProperty(ctx: css3Parser.BadPropertyContext)
	/**
	 * Exit a parse tree produced by the {@code badProperty}
	 * labeled alternative in {@link css3Parser#property}.
	 * @param ctx the parse tree
	 */
	fun exitBadProperty(ctx: css3Parser.BadPropertyContext)
	/**
	 * Enter a parse tree produced by the {@code knownRuleset}
	 * labeled alternative in {@link css3Parser#ruleset}.
	 * @param ctx the parse tree
	 */
	fun enterKnownRuleset(ctx: css3Parser.KnownRulesetContext)
	/**
	 * Exit a parse tree produced by the {@code knownRuleset}
	 * labeled alternative in {@link css3Parser#ruleset}.
	 * @param ctx the parse tree
	 */
	fun exitKnownRuleset(ctx: css3Parser.KnownRulesetContext)
	/**
	 * Enter a parse tree produced by the {@code unknownRuleset}
	 * labeled alternative in {@link css3Parser#ruleset}.
	 * @param ctx the parse tree
	 */
	fun enterUnknownRuleset(ctx: css3Parser.UnknownRulesetContext)
	/**
	 * Exit a parse tree produced by the {@code unknownRuleset}
	 * labeled alternative in {@link css3Parser#ruleset}.
	 * @param ctx the parse tree
	 */
	fun exitUnknownRuleset(ctx: css3Parser.UnknownRulesetContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#declarationList}.
	 * @param ctx the parse tree
	 */
	fun enterDeclarationList(ctx: css3Parser.DeclarationListContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#declarationList}.
	 * @param ctx the parse tree
	 */
	fun exitDeclarationList(ctx: css3Parser.DeclarationListContext)
	/**
	 * Enter a parse tree produced by the {@code knownDeclaration}
	 * labeled alternative in {@link css3Parser#declaration}.
	 * @param ctx the parse tree
	 */
	fun enterKnownDeclaration(ctx: css3Parser.KnownDeclarationContext)
	/**
	 * Exit a parse tree produced by the {@code knownDeclaration}
	 * labeled alternative in {@link css3Parser#declaration}.
	 * @param ctx the parse tree
	 */
	fun exitKnownDeclaration(ctx: css3Parser.KnownDeclarationContext)
	/**
	 * Enter a parse tree produced by the {@code unknownDeclaration}
	 * labeled alternative in {@link css3Parser#declaration}.
	 * @param ctx the parse tree
	 */
	fun enterUnknownDeclaration(ctx: css3Parser.UnknownDeclarationContext)
	/**
	 * Exit a parse tree produced by the {@code unknownDeclaration}
	 * labeled alternative in {@link css3Parser#declaration}.
	 * @param ctx the parse tree
	 */
	fun exitUnknownDeclaration(ctx: css3Parser.UnknownDeclarationContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#prio}.
	 * @param ctx the parse tree
	 */
	fun enterPrio(ctx: css3Parser.PrioContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#prio}.
	 * @param ctx the parse tree
	 */
	fun exitPrio(ctx: css3Parser.PrioContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#value}.
	 * @param ctx the parse tree
	 */
	fun enterValue(ctx: css3Parser.ValueContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#value}.
	 * @param ctx the parse tree
	 */
	fun exitValue(ctx: css3Parser.ValueContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#expr}.
	 * @param ctx the parse tree
	 */
	fun enterExpr(ctx: css3Parser.ExprContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#expr}.
	 * @param ctx the parse tree
	 */
	fun exitExpr(ctx: css3Parser.ExprContext)
	/**
	 * Enter a parse tree produced by the {@code knownTerm}
	 * labeled alternative in {@link css3Parser#term}.
	 * @param ctx the parse tree
	 */
	fun enterKnownTerm(ctx: css3Parser.KnownTermContext)
	/**
	 * Exit a parse tree produced by the {@code knownTerm}
	 * labeled alternative in {@link css3Parser#term}.
	 * @param ctx the parse tree
	 */
	fun exitKnownTerm(ctx: css3Parser.KnownTermContext)
	/**
	 * Enter a parse tree produced by the {@code unknownTerm}
	 * labeled alternative in {@link css3Parser#term}.
	 * @param ctx the parse tree
	 */
	fun enterUnknownTerm(ctx: css3Parser.UnknownTermContext)
	/**
	 * Exit a parse tree produced by the {@code unknownTerm}
	 * labeled alternative in {@link css3Parser#term}.
	 * @param ctx the parse tree
	 */
	fun exitUnknownTerm(ctx: css3Parser.UnknownTermContext)
	/**
	 * Enter a parse tree produced by the {@code badTerm}
	 * labeled alternative in {@link css3Parser#term}.
	 * @param ctx the parse tree
	 */
	fun enterBadTerm(ctx: css3Parser.BadTermContext)
	/**
	 * Exit a parse tree produced by the {@code badTerm}
	 * labeled alternative in {@link css3Parser#term}.
	 * @param ctx the parse tree
	 */
	fun exitBadTerm(ctx: css3Parser.BadTermContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#function}.
	 * @param ctx the parse tree
	 */
	fun enterFunction(ctx: css3Parser.FunctionContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#function}.
	 * @param ctx the parse tree
	 */
	fun exitFunction(ctx: css3Parser.FunctionContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#dxImageTransform}.
	 * @param ctx the parse tree
	 */
	fun enterDxImageTransform(ctx: css3Parser.DxImageTransformContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#dxImageTransform}.
	 * @param ctx the parse tree
	 */
	fun exitDxImageTransform(ctx: css3Parser.DxImageTransformContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#hexcolor}.
	 * @param ctx the parse tree
	 */
	fun enterHexcolor(ctx: css3Parser.HexcolorContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#hexcolor}.
	 * @param ctx the parse tree
	 */
	fun exitHexcolor(ctx: css3Parser.HexcolorContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#number}.
	 * @param ctx the parse tree
	 */
	fun enterNumber(ctx: css3Parser.NumberContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#number}.
	 * @param ctx the parse tree
	 */
	fun exitNumber(ctx: css3Parser.NumberContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#percentage}.
	 * @param ctx the parse tree
	 */
	fun enterPercentage(ctx: css3Parser.PercentageContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#percentage}.
	 * @param ctx the parse tree
	 */
	fun exitPercentage(ctx: css3Parser.PercentageContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#dimension}.
	 * @param ctx the parse tree
	 */
	fun enterDimension(ctx: css3Parser.DimensionContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#dimension}.
	 * @param ctx the parse tree
	 */
	fun exitDimension(ctx: css3Parser.DimensionContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#unknownDimension}.
	 * @param ctx the parse tree
	 */
	fun enterUnknownDimension(ctx: css3Parser.UnknownDimensionContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#unknownDimension}.
	 * @param ctx the parse tree
	 */
	fun exitUnknownDimension(ctx: css3Parser.UnknownDimensionContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#any}.
	 * @param ctx the parse tree
	 */
	fun enterAny(ctx: css3Parser.AnyContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#any}.
	 * @param ctx the parse tree
	 */
	fun exitAny(ctx: css3Parser.AnyContext)
	/**
	 * Enter a parse tree produced by the {@code unknownAtRule}
	 * labeled alternative in {@link css3Parser#atRule}.
	 * @param ctx the parse tree
	 */
	fun enterUnknownAtRule(ctx: css3Parser.UnknownAtRuleContext)
	/**
	 * Exit a parse tree produced by the {@code unknownAtRule}
	 * labeled alternative in {@link css3Parser#atRule}.
	 * @param ctx the parse tree
	 */
	fun exitUnknownAtRule(ctx: css3Parser.UnknownAtRuleContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#atKeyword}.
	 * @param ctx the parse tree
	 */
	fun enterAtKeyword(ctx: css3Parser.AtKeywordContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#atKeyword}.
	 * @param ctx the parse tree
	 */
	fun exitAtKeyword(ctx: css3Parser.AtKeywordContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#unused}.
	 * @param ctx the parse tree
	 */
	fun enterUnused(ctx: css3Parser.UnusedContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#unused}.
	 * @param ctx the parse tree
	 */
	fun exitUnused(ctx: css3Parser.UnusedContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#block}.
	 * @param ctx the parse tree
	 */
	fun enterBlock(ctx: css3Parser.BlockContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#block}.
	 * @param ctx the parse tree
	 */
	fun exitBlock(ctx: css3Parser.BlockContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#nestedStatement}.
	 * @param ctx the parse tree
	 */
	fun enterNestedStatement(ctx: css3Parser.NestedStatementContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#nestedStatement}.
	 * @param ctx the parse tree
	 */
	fun exitNestedStatement(ctx: css3Parser.NestedStatementContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#groupRuleBody}.
	 * @param ctx the parse tree
	 */
	fun enterGroupRuleBody(ctx: css3Parser.GroupRuleBodyContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#groupRuleBody}.
	 * @param ctx the parse tree
	 */
	fun exitGroupRuleBody(ctx: css3Parser.GroupRuleBodyContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#supportsRule}.
	 * @param ctx the parse tree
	 */
	fun enterSupportsRule(ctx: css3Parser.SupportsRuleContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#supportsRule}.
	 * @param ctx the parse tree
	 */
	fun exitSupportsRule(ctx: css3Parser.SupportsRuleContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#supportsCondition}.
	 * @param ctx the parse tree
	 */
	fun enterSupportsCondition(ctx: css3Parser.SupportsConditionContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#supportsCondition}.
	 * @param ctx the parse tree
	 */
	fun exitSupportsCondition(ctx: css3Parser.SupportsConditionContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#supportsConditionInParens}.
	 * @param ctx the parse tree
	 */
	fun enterSupportsConditionInParens(ctx: css3Parser.SupportsConditionInParensContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#supportsConditionInParens}.
	 * @param ctx the parse tree
	 */
	fun exitSupportsConditionInParens(ctx: css3Parser.SupportsConditionInParensContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#supportsNegation}.
	 * @param ctx the parse tree
	 */
	fun enterSupportsNegation(ctx: css3Parser.SupportsNegationContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#supportsNegation}.
	 * @param ctx the parse tree
	 */
	fun exitSupportsNegation(ctx: css3Parser.SupportsNegationContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#supportsConjunction}.
	 * @param ctx the parse tree
	 */
	fun enterSupportsConjunction(ctx: css3Parser.SupportsConjunctionContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#supportsConjunction}.
	 * @param ctx the parse tree
	 */
	fun exitSupportsConjunction(ctx: css3Parser.SupportsConjunctionContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#supportsDisjunction}.
	 * @param ctx the parse tree
	 */
	fun enterSupportsDisjunction(ctx: css3Parser.SupportsDisjunctionContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#supportsDisjunction}.
	 * @param ctx the parse tree
	 */
	fun exitSupportsDisjunction(ctx: css3Parser.SupportsDisjunctionContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#supportsDeclarationCondition}.
	 * @param ctx the parse tree
	 */
	fun enterSupportsDeclarationCondition(ctx: css3Parser.SupportsDeclarationConditionContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#supportsDeclarationCondition}.
	 * @param ctx the parse tree
	 */
	fun exitSupportsDeclarationCondition(ctx: css3Parser.SupportsDeclarationConditionContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#generalEnclosed}.
	 * @param ctx the parse tree
	 */
	fun enterGeneralEnclosed(ctx: css3Parser.GeneralEnclosedContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#generalEnclosed}.
	 * @param ctx the parse tree
	 */
	fun exitGeneralEnclosed(ctx: css3Parser.GeneralEnclosedContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#var}.
	 * @param ctx the parse tree
	 */
	fun enterVar(ctx: css3Parser.VarContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#var}.
	 * @param ctx the parse tree
	 */
	fun exitVar(ctx: css3Parser.VarContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#calc}.
	 * @param ctx the parse tree
	 */
	fun enterCalc(ctx: css3Parser.CalcContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#calc}.
	 * @param ctx the parse tree
	 */
	fun exitCalc(ctx: css3Parser.CalcContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#calcSum}.
	 * @param ctx the parse tree
	 */
	fun enterCalcSum(ctx: css3Parser.CalcSumContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#calcSum}.
	 * @param ctx the parse tree
	 */
	fun exitCalcSum(ctx: css3Parser.CalcSumContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#calcProduct}.
	 * @param ctx the parse tree
	 */
	fun enterCalcProduct(ctx: css3Parser.CalcProductContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#calcProduct}.
	 * @param ctx the parse tree
	 */
	fun exitCalcProduct(ctx: css3Parser.CalcProductContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#calcValue}.
	 * @param ctx the parse tree
	 */
	fun enterCalcValue(ctx: css3Parser.CalcValueContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#calcValue}.
	 * @param ctx the parse tree
	 */
	fun exitCalcValue(ctx: css3Parser.CalcValueContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#fontFaceRule}.
	 * @param ctx the parse tree
	 */
	fun enterFontFaceRule(ctx: css3Parser.FontFaceRuleContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#fontFaceRule}.
	 * @param ctx the parse tree
	 */
	fun exitFontFaceRule(ctx: css3Parser.FontFaceRuleContext)
	/**
	 * Enter a parse tree produced by the {@code knownFontFaceDeclaration}
	 * labeled alternative in {@link css3Parser#fontFaceDeclaration}.
	 * @param ctx the parse tree
	 */
	fun enterKnownFontFaceDeclaration(ctx: css3Parser.KnownFontFaceDeclarationContext)
	/**
	 * Exit a parse tree produced by the {@code knownFontFaceDeclaration}
	 * labeled alternative in {@link css3Parser#fontFaceDeclaration}.
	 * @param ctx the parse tree
	 */
	fun exitKnownFontFaceDeclaration(ctx: css3Parser.KnownFontFaceDeclarationContext)
	/**
	 * Enter a parse tree produced by the {@code unknownFontFaceDeclaration}
	 * labeled alternative in {@link css3Parser#fontFaceDeclaration}.
	 * @param ctx the parse tree
	 */
	fun enterUnknownFontFaceDeclaration(ctx: css3Parser.UnknownFontFaceDeclarationContext)
	/**
	 * Exit a parse tree produced by the {@code unknownFontFaceDeclaration}
	 * labeled alternative in {@link css3Parser#fontFaceDeclaration}.
	 * @param ctx the parse tree
	 */
	fun exitUnknownFontFaceDeclaration(ctx: css3Parser.UnknownFontFaceDeclarationContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#keyframesRule}.
	 * @param ctx the parse tree
	 */
	fun enterKeyframesRule(ctx: css3Parser.KeyframesRuleContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#keyframesRule}.
	 * @param ctx the parse tree
	 */
	fun exitKeyframesRule(ctx: css3Parser.KeyframesRuleContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#keyframesBlocks}.
	 * @param ctx the parse tree
	 */
	fun enterKeyframesBlocks(ctx: css3Parser.KeyframesBlocksContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#keyframesBlocks}.
	 * @param ctx the parse tree
	 */
	fun exitKeyframesBlocks(ctx: css3Parser.KeyframesBlocksContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#keyframeSelector}.
	 * @param ctx the parse tree
	 */
	fun enterKeyframeSelector(ctx: css3Parser.KeyframeSelectorContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#keyframeSelector}.
	 * @param ctx the parse tree
	 */
	fun exitKeyframeSelector(ctx: css3Parser.KeyframeSelectorContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#viewport}.
	 * @param ctx the parse tree
	 */
	fun enterViewport(ctx: css3Parser.ViewportContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#viewport}.
	 * @param ctx the parse tree
	 */
	fun exitViewport(ctx: css3Parser.ViewportContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#counterStyle}.
	 * @param ctx the parse tree
	 */
	fun enterCounterStyle(ctx: css3Parser.CounterStyleContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#counterStyle}.
	 * @param ctx the parse tree
	 */
	fun exitCounterStyle(ctx: css3Parser.CounterStyleContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#fontFeatureValuesRule}.
	 * @param ctx the parse tree
	 */
	fun enterFontFeatureValuesRule(ctx: css3Parser.FontFeatureValuesRuleContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#fontFeatureValuesRule}.
	 * @param ctx the parse tree
	 */
	fun exitFontFeatureValuesRule(ctx: css3Parser.FontFeatureValuesRuleContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#fontFamilyNameList}.
	 * @param ctx the parse tree
	 */
	fun enterFontFamilyNameList(ctx: css3Parser.FontFamilyNameListContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#fontFamilyNameList}.
	 * @param ctx the parse tree
	 */
	fun exitFontFamilyNameList(ctx: css3Parser.FontFamilyNameListContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#fontFamilyName}.
	 * @param ctx the parse tree
	 */
	fun enterFontFamilyName(ctx: css3Parser.FontFamilyNameContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#fontFamilyName}.
	 * @param ctx the parse tree
	 */
	fun exitFontFamilyName(ctx: css3Parser.FontFamilyNameContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#featureValueBlock}.
	 * @param ctx the parse tree
	 */
	fun enterFeatureValueBlock(ctx: css3Parser.FeatureValueBlockContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#featureValueBlock}.
	 * @param ctx the parse tree
	 */
	fun exitFeatureValueBlock(ctx: css3Parser.FeatureValueBlockContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#featureType}.
	 * @param ctx the parse tree
	 */
	fun enterFeatureType(ctx: css3Parser.FeatureTypeContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#featureType}.
	 * @param ctx the parse tree
	 */
	fun exitFeatureType(ctx: css3Parser.FeatureTypeContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#featureValueDefinition}.
	 * @param ctx the parse tree
	 */
	fun enterFeatureValueDefinition(ctx: css3Parser.FeatureValueDefinitionContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#featureValueDefinition}.
	 * @param ctx the parse tree
	 */
	fun exitFeatureValueDefinition(ctx: css3Parser.FeatureValueDefinitionContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#ident}.
	 * @param ctx the parse tree
	 */
	fun enterIdent(ctx: css3Parser.IdentContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#ident}.
	 * @param ctx the parse tree
	 */
	fun exitIdent(ctx: css3Parser.IdentContext)
	/**
	 * Enter a parse tree produced by {@link css3Parser#ws}.
	 * @param ctx the parse tree
	 */
	fun enterWs(ctx: css3Parser.WsContext)
	/**
	 * Exit a parse tree produced by {@link css3Parser#ws}.
	 * @param ctx the parse tree
	 */
	fun exitWs(ctx: css3Parser.WsContext)
}