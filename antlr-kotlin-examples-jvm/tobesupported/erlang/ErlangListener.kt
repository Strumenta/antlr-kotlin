// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ErlangParser}.
 */
interface ErlangListener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ErlangParser#forms}.
	 * @param ctx the parse tree
	 */
	fun enterForms(ctx: ErlangParser.FormsContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#forms}.
	 * @param ctx the parse tree
	 */
	fun exitForms(ctx: ErlangParser.FormsContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#form}.
	 * @param ctx the parse tree
	 */
	fun enterForm(ctx: ErlangParser.FormContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#form}.
	 * @param ctx the parse tree
	 */
	fun exitForm(ctx: ErlangParser.FormContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#tokAtom}.
	 * @param ctx the parse tree
	 */
	fun enterTokAtom(ctx: ErlangParser.TokAtomContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tokAtom}.
	 * @param ctx the parse tree
	 */
	fun exitTokAtom(ctx: ErlangParser.TokAtomContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#tokVar}.
	 * @param ctx the parse tree
	 */
	fun enterTokVar(ctx: ErlangParser.TokVarContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tokVar}.
	 * @param ctx the parse tree
	 */
	fun exitTokVar(ctx: ErlangParser.TokVarContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#tokFloat}.
	 * @param ctx the parse tree
	 */
	fun enterTokFloat(ctx: ErlangParser.TokFloatContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tokFloat}.
	 * @param ctx the parse tree
	 */
	fun exitTokFloat(ctx: ErlangParser.TokFloatContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#tokInteger}.
	 * @param ctx the parse tree
	 */
	fun enterTokInteger(ctx: ErlangParser.TokIntegerContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tokInteger}.
	 * @param ctx the parse tree
	 */
	fun exitTokInteger(ctx: ErlangParser.TokIntegerContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#tokChar}.
	 * @param ctx the parse tree
	 */
	fun enterTokChar(ctx: ErlangParser.TokCharContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tokChar}.
	 * @param ctx the parse tree
	 */
	fun exitTokChar(ctx: ErlangParser.TokCharContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#tokString}.
	 * @param ctx the parse tree
	 */
	fun enterTokString(ctx: ErlangParser.TokStringContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tokString}.
	 * @param ctx the parse tree
	 */
	fun exitTokString(ctx: ErlangParser.TokStringContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#attribute}.
	 * @param ctx the parse tree
	 */
	fun enterAttribute(ctx: ErlangParser.AttributeContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#attribute}.
	 * @param ctx the parse tree
	 */
	fun exitAttribute(ctx: ErlangParser.AttributeContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	fun enterTypeSpec(ctx: ErlangParser.TypeSpecContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	fun exitTypeSpec(ctx: ErlangParser.TypeSpecContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#specFun}.
	 * @param ctx the parse tree
	 */
	fun enterSpecFun(ctx: ErlangParser.SpecFunContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#specFun}.
	 * @param ctx the parse tree
	 */
	fun exitSpecFun(ctx: ErlangParser.SpecFunContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#typedAttrVal}.
	 * @param ctx the parse tree
	 */
	fun enterTypedAttrVal(ctx: ErlangParser.TypedAttrValContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#typedAttrVal}.
	 * @param ctx the parse tree
	 */
	fun exitTypedAttrVal(ctx: ErlangParser.TypedAttrValContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#typedRecordFields}.
	 * @param ctx the parse tree
	 */
	fun enterTypedRecordFields(ctx: ErlangParser.TypedRecordFieldsContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#typedRecordFields}.
	 * @param ctx the parse tree
	 */
	fun exitTypedRecordFields(ctx: ErlangParser.TypedRecordFieldsContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#typedExprs}.
	 * @param ctx the parse tree
	 */
	fun enterTypedExprs(ctx: ErlangParser.TypedExprsContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#typedExprs}.
	 * @param ctx the parse tree
	 */
	fun exitTypedExprs(ctx: ErlangParser.TypedExprsContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#typedExpr}.
	 * @param ctx the parse tree
	 */
	fun enterTypedExpr(ctx: ErlangParser.TypedExprContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#typedExpr}.
	 * @param ctx the parse tree
	 */
	fun exitTypedExpr(ctx: ErlangParser.TypedExprContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#typeSigs}.
	 * @param ctx the parse tree
	 */
	fun enterTypeSigs(ctx: ErlangParser.TypeSigsContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#typeSigs}.
	 * @param ctx the parse tree
	 */
	fun exitTypeSigs(ctx: ErlangParser.TypeSigsContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#typeSig}.
	 * @param ctx the parse tree
	 */
	fun enterTypeSig(ctx: ErlangParser.TypeSigContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#typeSig}.
	 * @param ctx the parse tree
	 */
	fun exitTypeSig(ctx: ErlangParser.TypeSigContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#typeGuards}.
	 * @param ctx the parse tree
	 */
	fun enterTypeGuards(ctx: ErlangParser.TypeGuardsContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#typeGuards}.
	 * @param ctx the parse tree
	 */
	fun exitTypeGuards(ctx: ErlangParser.TypeGuardsContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#typeGuard}.
	 * @param ctx the parse tree
	 */
	fun enterTypeGuard(ctx: ErlangParser.TypeGuardContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#typeGuard}.
	 * @param ctx the parse tree
	 */
	fun exitTypeGuard(ctx: ErlangParser.TypeGuardContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#topTypes}.
	 * @param ctx the parse tree
	 */
	fun enterTopTypes(ctx: ErlangParser.TopTypesContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#topTypes}.
	 * @param ctx the parse tree
	 */
	fun exitTopTypes(ctx: ErlangParser.TopTypesContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#topType}.
	 * @param ctx the parse tree
	 */
	fun enterTopType(ctx: ErlangParser.TopTypeContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#topType}.
	 * @param ctx the parse tree
	 */
	fun exitTopType(ctx: ErlangParser.TopTypeContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#topType100}.
	 * @param ctx the parse tree
	 */
	fun enterTopType100(ctx: ErlangParser.TopType100Context)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#topType100}.
	 * @param ctx the parse tree
	 */
	fun exitTopType100(ctx: ErlangParser.TopType100Context)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#type200}.
	 * @param ctx the parse tree
	 */
	fun enterType200(ctx: ErlangParser.Type200Context)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#type200}.
	 * @param ctx the parse tree
	 */
	fun exitType200(ctx: ErlangParser.Type200Context)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#type300}.
	 * @param ctx the parse tree
	 */
	fun enterType300(ctx: ErlangParser.Type300Context)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#type300}.
	 * @param ctx the parse tree
	 */
	fun exitType300(ctx: ErlangParser.Type300Context)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#type400}.
	 * @param ctx the parse tree
	 */
	fun enterType400(ctx: ErlangParser.Type400Context)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#type400}.
	 * @param ctx the parse tree
	 */
	fun exitType400(ctx: ErlangParser.Type400Context)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#type500}.
	 * @param ctx the parse tree
	 */
	fun enterType500(ctx: ErlangParser.Type500Context)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#type500}.
	 * @param ctx the parse tree
	 */
	fun exitType500(ctx: ErlangParser.Type500Context)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#type}.
	 * @param ctx the parse tree
	 */
	fun enterType(ctx: ErlangParser.TypeContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#type}.
	 * @param ctx the parse tree
	 */
	fun exitType(ctx: ErlangParser.TypeContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#funType100}.
	 * @param ctx the parse tree
	 */
	fun enterFunType100(ctx: ErlangParser.FunType100Context)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#funType100}.
	 * @param ctx the parse tree
	 */
	fun exitFunType100(ctx: ErlangParser.FunType100Context)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#funType}.
	 * @param ctx the parse tree
	 */
	fun enterFunType(ctx: ErlangParser.FunTypeContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#funType}.
	 * @param ctx the parse tree
	 */
	fun exitFunType(ctx: ErlangParser.FunTypeContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#fieldTypes}.
	 * @param ctx the parse tree
	 */
	fun enterFieldTypes(ctx: ErlangParser.FieldTypesContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#fieldTypes}.
	 * @param ctx the parse tree
	 */
	fun exitFieldTypes(ctx: ErlangParser.FieldTypesContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#fieldType}.
	 * @param ctx the parse tree
	 */
	fun enterFieldType(ctx: ErlangParser.FieldTypeContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#fieldType}.
	 * @param ctx the parse tree
	 */
	fun exitFieldType(ctx: ErlangParser.FieldTypeContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#binaryType}.
	 * @param ctx the parse tree
	 */
	fun enterBinaryType(ctx: ErlangParser.BinaryTypeContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#binaryType}.
	 * @param ctx the parse tree
	 */
	fun exitBinaryType(ctx: ErlangParser.BinaryTypeContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#binBaseType}.
	 * @param ctx the parse tree
	 */
	fun enterBinBaseType(ctx: ErlangParser.BinBaseTypeContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#binBaseType}.
	 * @param ctx the parse tree
	 */
	fun exitBinBaseType(ctx: ErlangParser.BinBaseTypeContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#binUnitType}.
	 * @param ctx the parse tree
	 */
	fun enterBinUnitType(ctx: ErlangParser.BinUnitTypeContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#binUnitType}.
	 * @param ctx the parse tree
	 */
	fun exitBinUnitType(ctx: ErlangParser.BinUnitTypeContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#attrVal}.
	 * @param ctx the parse tree
	 */
	fun enterAttrVal(ctx: ErlangParser.AttrValContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#attrVal}.
	 * @param ctx the parse tree
	 */
	fun exitAttrVal(ctx: ErlangParser.AttrValContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#function}.
	 * @param ctx the parse tree
	 */
	fun enterFunction(ctx: ErlangParser.FunctionContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#function}.
	 * @param ctx the parse tree
	 */
	fun exitFunction(ctx: ErlangParser.FunctionContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#functionClause}.
	 * @param ctx the parse tree
	 */
	fun enterFunctionClause(ctx: ErlangParser.FunctionClauseContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#functionClause}.
	 * @param ctx the parse tree
	 */
	fun exitFunctionClause(ctx: ErlangParser.FunctionClauseContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#clauseArgs}.
	 * @param ctx the parse tree
	 */
	fun enterClauseArgs(ctx: ErlangParser.ClauseArgsContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#clauseArgs}.
	 * @param ctx the parse tree
	 */
	fun exitClauseArgs(ctx: ErlangParser.ClauseArgsContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#clauseGuard}.
	 * @param ctx the parse tree
	 */
	fun enterClauseGuard(ctx: ErlangParser.ClauseGuardContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#clauseGuard}.
	 * @param ctx the parse tree
	 */
	fun exitClauseGuard(ctx: ErlangParser.ClauseGuardContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#clauseBody}.
	 * @param ctx the parse tree
	 */
	fun enterClauseBody(ctx: ErlangParser.ClauseBodyContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#clauseBody}.
	 * @param ctx the parse tree
	 */
	fun exitClauseBody(ctx: ErlangParser.ClauseBodyContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#expr}.
	 * @param ctx the parse tree
	 */
	fun enterExpr(ctx: ErlangParser.ExprContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#expr}.
	 * @param ctx the parse tree
	 */
	fun exitExpr(ctx: ErlangParser.ExprContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#expr100}.
	 * @param ctx the parse tree
	 */
	fun enterExpr100(ctx: ErlangParser.Expr100Context)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#expr100}.
	 * @param ctx the parse tree
	 */
	fun exitExpr100(ctx: ErlangParser.Expr100Context)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#expr150}.
	 * @param ctx the parse tree
	 */
	fun enterExpr150(ctx: ErlangParser.Expr150Context)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#expr150}.
	 * @param ctx the parse tree
	 */
	fun exitExpr150(ctx: ErlangParser.Expr150Context)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#expr160}.
	 * @param ctx the parse tree
	 */
	fun enterExpr160(ctx: ErlangParser.Expr160Context)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#expr160}.
	 * @param ctx the parse tree
	 */
	fun exitExpr160(ctx: ErlangParser.Expr160Context)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#expr200}.
	 * @param ctx the parse tree
	 */
	fun enterExpr200(ctx: ErlangParser.Expr200Context)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#expr200}.
	 * @param ctx the parse tree
	 */
	fun exitExpr200(ctx: ErlangParser.Expr200Context)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#expr300}.
	 * @param ctx the parse tree
	 */
	fun enterExpr300(ctx: ErlangParser.Expr300Context)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#expr300}.
	 * @param ctx the parse tree
	 */
	fun exitExpr300(ctx: ErlangParser.Expr300Context)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#expr400}.
	 * @param ctx the parse tree
	 */
	fun enterExpr400(ctx: ErlangParser.Expr400Context)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#expr400}.
	 * @param ctx the parse tree
	 */
	fun exitExpr400(ctx: ErlangParser.Expr400Context)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#expr500}.
	 * @param ctx the parse tree
	 */
	fun enterExpr500(ctx: ErlangParser.Expr500Context)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#expr500}.
	 * @param ctx the parse tree
	 */
	fun exitExpr500(ctx: ErlangParser.Expr500Context)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#expr600}.
	 * @param ctx the parse tree
	 */
	fun enterExpr600(ctx: ErlangParser.Expr600Context)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#expr600}.
	 * @param ctx the parse tree
	 */
	fun exitExpr600(ctx: ErlangParser.Expr600Context)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#expr700}.
	 * @param ctx the parse tree
	 */
	fun enterExpr700(ctx: ErlangParser.Expr700Context)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#expr700}.
	 * @param ctx the parse tree
	 */
	fun exitExpr700(ctx: ErlangParser.Expr700Context)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#expr800}.
	 * @param ctx the parse tree
	 */
	fun enterExpr800(ctx: ErlangParser.Expr800Context)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#expr800}.
	 * @param ctx the parse tree
	 */
	fun exitExpr800(ctx: ErlangParser.Expr800Context)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#exprMax}.
	 * @param ctx the parse tree
	 */
	fun enterExprMax(ctx: ErlangParser.ExprMaxContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#exprMax}.
	 * @param ctx the parse tree
	 */
	fun exitExprMax(ctx: ErlangParser.ExprMaxContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#list}.
	 * @param ctx the parse tree
	 */
	fun enterList(ctx: ErlangParser.ListContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#list}.
	 * @param ctx the parse tree
	 */
	fun exitList(ctx: ErlangParser.ListContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#tail}.
	 * @param ctx the parse tree
	 */
	fun enterTail(ctx: ErlangParser.TailContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tail}.
	 * @param ctx the parse tree
	 */
	fun exitTail(ctx: ErlangParser.TailContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#binary}.
	 * @param ctx the parse tree
	 */
	fun enterBinary(ctx: ErlangParser.BinaryContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#binary}.
	 * @param ctx the parse tree
	 */
	fun exitBinary(ctx: ErlangParser.BinaryContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#binElements}.
	 * @param ctx the parse tree
	 */
	fun enterBinElements(ctx: ErlangParser.BinElementsContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#binElements}.
	 * @param ctx the parse tree
	 */
	fun exitBinElements(ctx: ErlangParser.BinElementsContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#binElement}.
	 * @param ctx the parse tree
	 */
	fun enterBinElement(ctx: ErlangParser.BinElementContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#binElement}.
	 * @param ctx the parse tree
	 */
	fun exitBinElement(ctx: ErlangParser.BinElementContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	fun enterBitExpr(ctx: ErlangParser.BitExprContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	fun exitBitExpr(ctx: ErlangParser.BitExprContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#optBitSizeExpr}.
	 * @param ctx the parse tree
	 */
	fun enterOptBitSizeExpr(ctx: ErlangParser.OptBitSizeExprContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#optBitSizeExpr}.
	 * @param ctx the parse tree
	 */
	fun exitOptBitSizeExpr(ctx: ErlangParser.OptBitSizeExprContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#optBitTypeList}.
	 * @param ctx the parse tree
	 */
	fun enterOptBitTypeList(ctx: ErlangParser.OptBitTypeListContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#optBitTypeList}.
	 * @param ctx the parse tree
	 */
	fun exitOptBitTypeList(ctx: ErlangParser.OptBitTypeListContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#bitTypeList}.
	 * @param ctx the parse tree
	 */
	fun enterBitTypeList(ctx: ErlangParser.BitTypeListContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#bitTypeList}.
	 * @param ctx the parse tree
	 */
	fun exitBitTypeList(ctx: ErlangParser.BitTypeListContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#bitType}.
	 * @param ctx the parse tree
	 */
	fun enterBitType(ctx: ErlangParser.BitTypeContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#bitType}.
	 * @param ctx the parse tree
	 */
	fun exitBitType(ctx: ErlangParser.BitTypeContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#bitSizeExpr}.
	 * @param ctx the parse tree
	 */
	fun enterBitSizeExpr(ctx: ErlangParser.BitSizeExprContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#bitSizeExpr}.
	 * @param ctx the parse tree
	 */
	fun exitBitSizeExpr(ctx: ErlangParser.BitSizeExprContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#listComprehension}.
	 * @param ctx the parse tree
	 */
	fun enterListComprehension(ctx: ErlangParser.ListComprehensionContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#listComprehension}.
	 * @param ctx the parse tree
	 */
	fun exitListComprehension(ctx: ErlangParser.ListComprehensionContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#binaryComprehension}.
	 * @param ctx the parse tree
	 */
	fun enterBinaryComprehension(ctx: ErlangParser.BinaryComprehensionContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#binaryComprehension}.
	 * @param ctx the parse tree
	 */
	fun exitBinaryComprehension(ctx: ErlangParser.BinaryComprehensionContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#lcExprs}.
	 * @param ctx the parse tree
	 */
	fun enterLcExprs(ctx: ErlangParser.LcExprsContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#lcExprs}.
	 * @param ctx the parse tree
	 */
	fun exitLcExprs(ctx: ErlangParser.LcExprsContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#lcExpr}.
	 * @param ctx the parse tree
	 */
	fun enterLcExpr(ctx: ErlangParser.LcExprContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#lcExpr}.
	 * @param ctx the parse tree
	 */
	fun exitLcExpr(ctx: ErlangParser.LcExprContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#tuple}.
	 * @param ctx the parse tree
	 */
	fun enterTuple(ctx: ErlangParser.TupleContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tuple}.
	 * @param ctx the parse tree
	 */
	fun exitTuple(ctx: ErlangParser.TupleContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#recordExpr}.
	 * @param ctx the parse tree
	 */
	fun enterRecordExpr(ctx: ErlangParser.RecordExprContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#recordExpr}.
	 * @param ctx the parse tree
	 */
	fun exitRecordExpr(ctx: ErlangParser.RecordExprContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#recordTuple}.
	 * @param ctx the parse tree
	 */
	fun enterRecordTuple(ctx: ErlangParser.RecordTupleContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#recordTuple}.
	 * @param ctx the parse tree
	 */
	fun exitRecordTuple(ctx: ErlangParser.RecordTupleContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#recordFields}.
	 * @param ctx the parse tree
	 */
	fun enterRecordFields(ctx: ErlangParser.RecordFieldsContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#recordFields}.
	 * @param ctx the parse tree
	 */
	fun exitRecordFields(ctx: ErlangParser.RecordFieldsContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#recordField}.
	 * @param ctx the parse tree
	 */
	fun enterRecordField(ctx: ErlangParser.RecordFieldContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#recordField}.
	 * @param ctx the parse tree
	 */
	fun exitRecordField(ctx: ErlangParser.RecordFieldContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	fun enterFunctionCall(ctx: ErlangParser.FunctionCallContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	fun exitFunctionCall(ctx: ErlangParser.FunctionCallContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	fun enterIfExpr(ctx: ErlangParser.IfExprContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	fun exitIfExpr(ctx: ErlangParser.IfExprContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#ifClauses}.
	 * @param ctx the parse tree
	 */
	fun enterIfClauses(ctx: ErlangParser.IfClausesContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#ifClauses}.
	 * @param ctx the parse tree
	 */
	fun exitIfClauses(ctx: ErlangParser.IfClausesContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#ifClause}.
	 * @param ctx the parse tree
	 */
	fun enterIfClause(ctx: ErlangParser.IfClauseContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#ifClause}.
	 * @param ctx the parse tree
	 */
	fun exitIfClause(ctx: ErlangParser.IfClauseContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#caseExpr}.
	 * @param ctx the parse tree
	 */
	fun enterCaseExpr(ctx: ErlangParser.CaseExprContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#caseExpr}.
	 * @param ctx the parse tree
	 */
	fun exitCaseExpr(ctx: ErlangParser.CaseExprContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#crClauses}.
	 * @param ctx the parse tree
	 */
	fun enterCrClauses(ctx: ErlangParser.CrClausesContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#crClauses}.
	 * @param ctx the parse tree
	 */
	fun exitCrClauses(ctx: ErlangParser.CrClausesContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#crClause}.
	 * @param ctx the parse tree
	 */
	fun enterCrClause(ctx: ErlangParser.CrClauseContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#crClause}.
	 * @param ctx the parse tree
	 */
	fun exitCrClause(ctx: ErlangParser.CrClauseContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#receiveExpr}.
	 * @param ctx the parse tree
	 */
	fun enterReceiveExpr(ctx: ErlangParser.ReceiveExprContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#receiveExpr}.
	 * @param ctx the parse tree
	 */
	fun exitReceiveExpr(ctx: ErlangParser.ReceiveExprContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#funExpr}.
	 * @param ctx the parse tree
	 */
	fun enterFunExpr(ctx: ErlangParser.FunExprContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#funExpr}.
	 * @param ctx the parse tree
	 */
	fun exitFunExpr(ctx: ErlangParser.FunExprContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#atomOrVar}.
	 * @param ctx the parse tree
	 */
	fun enterAtomOrVar(ctx: ErlangParser.AtomOrVarContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#atomOrVar}.
	 * @param ctx the parse tree
	 */
	fun exitAtomOrVar(ctx: ErlangParser.AtomOrVarContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#integerOrVar}.
	 * @param ctx the parse tree
	 */
	fun enterIntegerOrVar(ctx: ErlangParser.IntegerOrVarContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#integerOrVar}.
	 * @param ctx the parse tree
	 */
	fun exitIntegerOrVar(ctx: ErlangParser.IntegerOrVarContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#funClauses}.
	 * @param ctx the parse tree
	 */
	fun enterFunClauses(ctx: ErlangParser.FunClausesContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#funClauses}.
	 * @param ctx the parse tree
	 */
	fun exitFunClauses(ctx: ErlangParser.FunClausesContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#funClause}.
	 * @param ctx the parse tree
	 */
	fun enterFunClause(ctx: ErlangParser.FunClauseContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#funClause}.
	 * @param ctx the parse tree
	 */
	fun exitFunClause(ctx: ErlangParser.FunClauseContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#tryExpr}.
	 * @param ctx the parse tree
	 */
	fun enterTryExpr(ctx: ErlangParser.TryExprContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tryExpr}.
	 * @param ctx the parse tree
	 */
	fun exitTryExpr(ctx: ErlangParser.TryExprContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#tryCatch}.
	 * @param ctx the parse tree
	 */
	fun enterTryCatch(ctx: ErlangParser.TryCatchContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tryCatch}.
	 * @param ctx the parse tree
	 */
	fun exitTryCatch(ctx: ErlangParser.TryCatchContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#tryClauses}.
	 * @param ctx the parse tree
	 */
	fun enterTryClauses(ctx: ErlangParser.TryClausesContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tryClauses}.
	 * @param ctx the parse tree
	 */
	fun exitTryClauses(ctx: ErlangParser.TryClausesContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#tryClause}.
	 * @param ctx the parse tree
	 */
	fun enterTryClause(ctx: ErlangParser.TryClauseContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tryClause}.
	 * @param ctx the parse tree
	 */
	fun exitTryClause(ctx: ErlangParser.TryClauseContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#argumentList}.
	 * @param ctx the parse tree
	 */
	fun enterArgumentList(ctx: ErlangParser.ArgumentListContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#argumentList}.
	 * @param ctx the parse tree
	 */
	fun exitArgumentList(ctx: ErlangParser.ArgumentListContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#exprs}.
	 * @param ctx the parse tree
	 */
	fun enterExprs(ctx: ErlangParser.ExprsContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#exprs}.
	 * @param ctx the parse tree
	 */
	fun exitExprs(ctx: ErlangParser.ExprsContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#guard}.
	 * @param ctx the parse tree
	 */
	fun enterGuard(ctx: ErlangParser.GuardContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#guard}.
	 * @param ctx the parse tree
	 */
	fun exitGuard(ctx: ErlangParser.GuardContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#atomic}.
	 * @param ctx the parse tree
	 */
	fun enterAtomic(ctx: ErlangParser.AtomicContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#atomic}.
	 * @param ctx the parse tree
	 */
	fun exitAtomic(ctx: ErlangParser.AtomicContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#prefixOp}.
	 * @param ctx the parse tree
	 */
	fun enterPrefixOp(ctx: ErlangParser.PrefixOpContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#prefixOp}.
	 * @param ctx the parse tree
	 */
	fun exitPrefixOp(ctx: ErlangParser.PrefixOpContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#multOp}.
	 * @param ctx the parse tree
	 */
	fun enterMultOp(ctx: ErlangParser.MultOpContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#multOp}.
	 * @param ctx the parse tree
	 */
	fun exitMultOp(ctx: ErlangParser.MultOpContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#addOp}.
	 * @param ctx the parse tree
	 */
	fun enterAddOp(ctx: ErlangParser.AddOpContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#addOp}.
	 * @param ctx the parse tree
	 */
	fun exitAddOp(ctx: ErlangParser.AddOpContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#listOp}.
	 * @param ctx the parse tree
	 */
	fun enterListOp(ctx: ErlangParser.ListOpContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#listOp}.
	 * @param ctx the parse tree
	 */
	fun exitListOp(ctx: ErlangParser.ListOpContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#compOp}.
	 * @param ctx the parse tree
	 */
	fun enterCompOp(ctx: ErlangParser.CompOpContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#compOp}.
	 * @param ctx the parse tree
	 */
	fun exitCompOp(ctx: ErlangParser.CompOpContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#ruleClauses}.
	 * @param ctx the parse tree
	 */
	fun enterRuleClauses(ctx: ErlangParser.RuleClausesContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#ruleClauses}.
	 * @param ctx the parse tree
	 */
	fun exitRuleClauses(ctx: ErlangParser.RuleClausesContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#ruleClause}.
	 * @param ctx the parse tree
	 */
	fun enterRuleClause(ctx: ErlangParser.RuleClauseContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#ruleClause}.
	 * @param ctx the parse tree
	 */
	fun exitRuleClause(ctx: ErlangParser.RuleClauseContext)
	/**
	 * Enter a parse tree produced by {@link ErlangParser#ruleBody}.
	 * @param ctx the parse tree
	 */
	fun enterRuleBody(ctx: ErlangParser.RuleBodyContext)
	/**
	 * Exit a parse tree produced by {@link ErlangParser#ruleBody}.
	 * @param ctx the parse tree
	 */
	fun exitRuleBody(ctx: ErlangParser.RuleBodyContext)
}