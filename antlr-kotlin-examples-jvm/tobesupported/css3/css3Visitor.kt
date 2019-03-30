// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link css3Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
interface css3Visitor<T> : ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link css3Parser#stylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStylesheet(ctx : css3Parser.StylesheetContext) : T
	/**
	 * Visit a parse tree produced by the {@code goodCharset}
	 * labeled alternative in {@link css3Parser#charset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGoodCharset(ctx : css3Parser.GoodCharsetContext) : T
	/**
	 * Visit a parse tree produced by the {@code badCharset}
	 * labeled alternative in {@link css3Parser#charset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBadCharset(ctx : css3Parser.BadCharsetContext) : T
	/**
	 * Visit a parse tree produced by the {@code goodImport}
	 * labeled alternative in {@link css3Parser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGoodImport(ctx : css3Parser.GoodImportContext) : T
	/**
	 * Visit a parse tree produced by the {@code badImport}
	 * labeled alternative in {@link css3Parser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBadImport(ctx : css3Parser.BadImportContext) : T
	/**
	 * Visit a parse tree produced by the {@code goodNamespace}
	 * labeled alternative in {@link css3Parser#namespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGoodNamespace(ctx : css3Parser.GoodNamespaceContext) : T
	/**
	 * Visit a parse tree produced by the {@code badNamespace}
	 * labeled alternative in {@link css3Parser#namespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBadNamespace(ctx : css3Parser.BadNamespaceContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#namespacePrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNamespacePrefix(ctx : css3Parser.NamespacePrefixContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#media}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMedia(ctx : css3Parser.MediaContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#mediaQueryList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMediaQueryList(ctx : css3Parser.MediaQueryListContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#mediaQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMediaQuery(ctx : css3Parser.MediaQueryContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#mediaType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMediaType(ctx : css3Parser.MediaTypeContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#mediaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMediaExpression(ctx : css3Parser.MediaExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#mediaFeature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMediaFeature(ctx : css3Parser.MediaFeatureContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPage(ctx : css3Parser.PageContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#pseudoPage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPseudoPage(ctx : css3Parser.PseudoPageContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#selectorGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSelectorGroup(ctx : css3Parser.SelectorGroupContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSelector(ctx : css3Parser.SelectorContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#combinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCombinator(ctx : css3Parser.CombinatorContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#simpleSelectorSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSimpleSelectorSequence(ctx : css3Parser.SimpleSelectorSequenceContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#typeSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTypeSelector(ctx : css3Parser.TypeSelectorContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#typeNamespacePrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTypeNamespacePrefix(ctx : css3Parser.TypeNamespacePrefixContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#elementName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitElementName(ctx : css3Parser.ElementNameContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#universal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUniversal(ctx : css3Parser.UniversalContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClassName(ctx : css3Parser.ClassNameContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#attrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAttrib(ctx : css3Parser.AttribContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#pseudo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPseudo(ctx : css3Parser.PseudoContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#functionalPseudo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFunctionalPseudo(ctx : css3Parser.FunctionalPseudoContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExpression(ctx : css3Parser.ExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#negation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNegation(ctx : css3Parser.NegationContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#negationArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNegationArg(ctx : css3Parser.NegationArgContext) : T
	/**
	 * Visit a parse tree produced by the {@code goodOperator}
	 * labeled alternative in {@link css3Parser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGoodOperator(ctx : css3Parser.GoodOperatorContext) : T
	/**
	 * Visit a parse tree produced by the {@code badOperator}
	 * labeled alternative in {@link css3Parser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBadOperator(ctx : css3Parser.BadOperatorContext) : T
	/**
	 * Visit a parse tree produced by the {@code goodProperty}
	 * labeled alternative in {@link css3Parser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGoodProperty(ctx : css3Parser.GoodPropertyContext) : T
	/**
	 * Visit a parse tree produced by the {@code badProperty}
	 * labeled alternative in {@link css3Parser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBadProperty(ctx : css3Parser.BadPropertyContext) : T
	/**
	 * Visit a parse tree produced by the {@code knownRuleset}
	 * labeled alternative in {@link css3Parser#ruleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitKnownRuleset(ctx : css3Parser.KnownRulesetContext) : T
	/**
	 * Visit a parse tree produced by the {@code unknownRuleset}
	 * labeled alternative in {@link css3Parser#ruleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnknownRuleset(ctx : css3Parser.UnknownRulesetContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#declarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDeclarationList(ctx : css3Parser.DeclarationListContext) : T
	/**
	 * Visit a parse tree produced by the {@code knownDeclaration}
	 * labeled alternative in {@link css3Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitKnownDeclaration(ctx : css3Parser.KnownDeclarationContext) : T
	/**
	 * Visit a parse tree produced by the {@code unknownDeclaration}
	 * labeled alternative in {@link css3Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnknownDeclaration(ctx : css3Parser.UnknownDeclarationContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#prio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPrio(ctx : css3Parser.PrioContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitValue(ctx : css3Parser.ValueContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExpr(ctx : css3Parser.ExprContext) : T
	/**
	 * Visit a parse tree produced by the {@code knownTerm}
	 * labeled alternative in {@link css3Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitKnownTerm(ctx : css3Parser.KnownTermContext) : T
	/**
	 * Visit a parse tree produced by the {@code unknownTerm}
	 * labeled alternative in {@link css3Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnknownTerm(ctx : css3Parser.UnknownTermContext) : T
	/**
	 * Visit a parse tree produced by the {@code badTerm}
	 * labeled alternative in {@link css3Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBadTerm(ctx : css3Parser.BadTermContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFunction(ctx : css3Parser.FunctionContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#dxImageTransform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDxImageTransform(ctx : css3Parser.DxImageTransformContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#hexcolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitHexcolor(ctx : css3Parser.HexcolorContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNumber(ctx : css3Parser.NumberContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#percentage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPercentage(ctx : css3Parser.PercentageContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDimension(ctx : css3Parser.DimensionContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#unknownDimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnknownDimension(ctx : css3Parser.UnknownDimensionContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#any}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAny(ctx : css3Parser.AnyContext) : T
	/**
	 * Visit a parse tree produced by the {@code unknownAtRule}
	 * labeled alternative in {@link css3Parser#atRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnknownAtRule(ctx : css3Parser.UnknownAtRuleContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#atKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAtKeyword(ctx : css3Parser.AtKeywordContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#unused}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnused(ctx : css3Parser.UnusedContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBlock(ctx : css3Parser.BlockContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#nestedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNestedStatement(ctx : css3Parser.NestedStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#groupRuleBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGroupRuleBody(ctx : css3Parser.GroupRuleBodyContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#supportsRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSupportsRule(ctx : css3Parser.SupportsRuleContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#supportsCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSupportsCondition(ctx : css3Parser.SupportsConditionContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#supportsConditionInParens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSupportsConditionInParens(ctx : css3Parser.SupportsConditionInParensContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#supportsNegation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSupportsNegation(ctx : css3Parser.SupportsNegationContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#supportsConjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSupportsConjunction(ctx : css3Parser.SupportsConjunctionContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#supportsDisjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSupportsDisjunction(ctx : css3Parser.SupportsDisjunctionContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#supportsDeclarationCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSupportsDeclarationCondition(ctx : css3Parser.SupportsDeclarationConditionContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#generalEnclosed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGeneralEnclosed(ctx : css3Parser.GeneralEnclosedContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitVar(ctx : css3Parser.VarContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#calc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCalc(ctx : css3Parser.CalcContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#calcSum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCalcSum(ctx : css3Parser.CalcSumContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#calcProduct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCalcProduct(ctx : css3Parser.CalcProductContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#calcValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCalcValue(ctx : css3Parser.CalcValueContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#fontFaceRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFontFaceRule(ctx : css3Parser.FontFaceRuleContext) : T
	/**
	 * Visit a parse tree produced by the {@code knownFontFaceDeclaration}
	 * labeled alternative in {@link css3Parser#fontFaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitKnownFontFaceDeclaration(ctx : css3Parser.KnownFontFaceDeclarationContext) : T
	/**
	 * Visit a parse tree produced by the {@code unknownFontFaceDeclaration}
	 * labeled alternative in {@link css3Parser#fontFaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnknownFontFaceDeclaration(ctx : css3Parser.UnknownFontFaceDeclarationContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#keyframesRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitKeyframesRule(ctx : css3Parser.KeyframesRuleContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#keyframesBlocks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitKeyframesBlocks(ctx : css3Parser.KeyframesBlocksContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#keyframeSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitKeyframeSelector(ctx : css3Parser.KeyframeSelectorContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#viewport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitViewport(ctx : css3Parser.ViewportContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#counterStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCounterStyle(ctx : css3Parser.CounterStyleContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#fontFeatureValuesRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFontFeatureValuesRule(ctx : css3Parser.FontFeatureValuesRuleContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#fontFamilyNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFontFamilyNameList(ctx : css3Parser.FontFamilyNameListContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#fontFamilyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFontFamilyName(ctx : css3Parser.FontFamilyNameContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#featureValueBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFeatureValueBlock(ctx : css3Parser.FeatureValueBlockContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#featureType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFeatureType(ctx : css3Parser.FeatureTypeContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#featureValueDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFeatureValueDefinition(ctx : css3Parser.FeatureValueDefinitionContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIdent(ctx : css3Parser.IdentContext) : T
	/**
	 * Visit a parse tree produced by {@link css3Parser#ws}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitWs(ctx : css3Parser.WsContext) : T
}