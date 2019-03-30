// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.ParserRuleContext
import org.antlr.v4.kotlinruntime.tree.ErrorNode
import org.antlr.v4.kotlinruntime.tree.TerminalNode

/**
 * This class provides an empty implementation of {@link ErlangListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
open class ErlangBaseListener : ErlangListener {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterForms(ctx: ErlangParser.FormsContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitForms(ctx: ErlangParser.FormsContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterForm(ctx: ErlangParser.FormContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitForm(ctx: ErlangParser.FormContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterTokAtom(ctx: ErlangParser.TokAtomContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitTokAtom(ctx: ErlangParser.TokAtomContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterTokVar(ctx: ErlangParser.TokVarContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitTokVar(ctx: ErlangParser.TokVarContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterTokFloat(ctx: ErlangParser.TokFloatContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitTokFloat(ctx: ErlangParser.TokFloatContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterTokInteger(ctx: ErlangParser.TokIntegerContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitTokInteger(ctx: ErlangParser.TokIntegerContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterTokChar(ctx: ErlangParser.TokCharContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitTokChar(ctx: ErlangParser.TokCharContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterTokString(ctx: ErlangParser.TokStringContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitTokString(ctx: ErlangParser.TokStringContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterAttribute(ctx: ErlangParser.AttributeContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitAttribute(ctx: ErlangParser.AttributeContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterTypeSpec(ctx: ErlangParser.TypeSpecContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitTypeSpec(ctx: ErlangParser.TypeSpecContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterSpecFun(ctx: ErlangParser.SpecFunContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitSpecFun(ctx: ErlangParser.SpecFunContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterTypedAttrVal(ctx: ErlangParser.TypedAttrValContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitTypedAttrVal(ctx: ErlangParser.TypedAttrValContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterTypedRecordFields(ctx: ErlangParser.TypedRecordFieldsContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitTypedRecordFields(ctx: ErlangParser.TypedRecordFieldsContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterTypedExprs(ctx: ErlangParser.TypedExprsContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitTypedExprs(ctx: ErlangParser.TypedExprsContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterTypedExpr(ctx: ErlangParser.TypedExprContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitTypedExpr(ctx: ErlangParser.TypedExprContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterTypeSigs(ctx: ErlangParser.TypeSigsContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitTypeSigs(ctx: ErlangParser.TypeSigsContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterTypeSig(ctx: ErlangParser.TypeSigContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitTypeSig(ctx: ErlangParser.TypeSigContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterTypeGuards(ctx: ErlangParser.TypeGuardsContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitTypeGuards(ctx: ErlangParser.TypeGuardsContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterTypeGuard(ctx: ErlangParser.TypeGuardContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitTypeGuard(ctx: ErlangParser.TypeGuardContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterTopTypes(ctx: ErlangParser.TopTypesContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitTopTypes(ctx: ErlangParser.TopTypesContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterTopType(ctx: ErlangParser.TopTypeContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitTopType(ctx: ErlangParser.TopTypeContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterTopType100(ctx: ErlangParser.TopType100Context) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitTopType100(ctx: ErlangParser.TopType100Context) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterType200(ctx: ErlangParser.Type200Context) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitType200(ctx: ErlangParser.Type200Context) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterType300(ctx: ErlangParser.Type300Context) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitType300(ctx: ErlangParser.Type300Context) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterType400(ctx: ErlangParser.Type400Context) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitType400(ctx: ErlangParser.Type400Context) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterType500(ctx: ErlangParser.Type500Context) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitType500(ctx: ErlangParser.Type500Context) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterType(ctx: ErlangParser.TypeContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitType(ctx: ErlangParser.TypeContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterFunType100(ctx: ErlangParser.FunType100Context) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitFunType100(ctx: ErlangParser.FunType100Context) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterFunType(ctx: ErlangParser.FunTypeContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitFunType(ctx: ErlangParser.FunTypeContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterFieldTypes(ctx: ErlangParser.FieldTypesContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitFieldTypes(ctx: ErlangParser.FieldTypesContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterFieldType(ctx: ErlangParser.FieldTypeContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitFieldType(ctx: ErlangParser.FieldTypeContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterBinaryType(ctx: ErlangParser.BinaryTypeContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitBinaryType(ctx: ErlangParser.BinaryTypeContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterBinBaseType(ctx: ErlangParser.BinBaseTypeContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitBinBaseType(ctx: ErlangParser.BinBaseTypeContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterBinUnitType(ctx: ErlangParser.BinUnitTypeContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitBinUnitType(ctx: ErlangParser.BinUnitTypeContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterAttrVal(ctx: ErlangParser.AttrValContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitAttrVal(ctx: ErlangParser.AttrValContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterFunction(ctx: ErlangParser.FunctionContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitFunction(ctx: ErlangParser.FunctionContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterFunctionClause(ctx: ErlangParser.FunctionClauseContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitFunctionClause(ctx: ErlangParser.FunctionClauseContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterClauseArgs(ctx: ErlangParser.ClauseArgsContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitClauseArgs(ctx: ErlangParser.ClauseArgsContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterClauseGuard(ctx: ErlangParser.ClauseGuardContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitClauseGuard(ctx: ErlangParser.ClauseGuardContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterClauseBody(ctx: ErlangParser.ClauseBodyContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitClauseBody(ctx: ErlangParser.ClauseBodyContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterExpr(ctx: ErlangParser.ExprContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitExpr(ctx: ErlangParser.ExprContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterExpr100(ctx: ErlangParser.Expr100Context) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitExpr100(ctx: ErlangParser.Expr100Context) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterExpr150(ctx: ErlangParser.Expr150Context) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitExpr150(ctx: ErlangParser.Expr150Context) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterExpr160(ctx: ErlangParser.Expr160Context) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitExpr160(ctx: ErlangParser.Expr160Context) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterExpr200(ctx: ErlangParser.Expr200Context) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitExpr200(ctx: ErlangParser.Expr200Context) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterExpr300(ctx: ErlangParser.Expr300Context) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitExpr300(ctx: ErlangParser.Expr300Context) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterExpr400(ctx: ErlangParser.Expr400Context) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitExpr400(ctx: ErlangParser.Expr400Context) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterExpr500(ctx: ErlangParser.Expr500Context) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitExpr500(ctx: ErlangParser.Expr500Context) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterExpr600(ctx: ErlangParser.Expr600Context) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitExpr600(ctx: ErlangParser.Expr600Context) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterExpr700(ctx: ErlangParser.Expr700Context) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitExpr700(ctx: ErlangParser.Expr700Context) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterExpr800(ctx: ErlangParser.Expr800Context) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitExpr800(ctx: ErlangParser.Expr800Context) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterExprMax(ctx: ErlangParser.ExprMaxContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitExprMax(ctx: ErlangParser.ExprMaxContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterList(ctx: ErlangParser.ListContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitList(ctx: ErlangParser.ListContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterTail(ctx: ErlangParser.TailContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitTail(ctx: ErlangParser.TailContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterBinary(ctx: ErlangParser.BinaryContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitBinary(ctx: ErlangParser.BinaryContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterBinElements(ctx: ErlangParser.BinElementsContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitBinElements(ctx: ErlangParser.BinElementsContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterBinElement(ctx: ErlangParser.BinElementContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitBinElement(ctx: ErlangParser.BinElementContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterBitExpr(ctx: ErlangParser.BitExprContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitBitExpr(ctx: ErlangParser.BitExprContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterOptBitSizeExpr(ctx: ErlangParser.OptBitSizeExprContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitOptBitSizeExpr(ctx: ErlangParser.OptBitSizeExprContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterOptBitTypeList(ctx: ErlangParser.OptBitTypeListContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitOptBitTypeList(ctx: ErlangParser.OptBitTypeListContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterBitTypeList(ctx: ErlangParser.BitTypeListContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitBitTypeList(ctx: ErlangParser.BitTypeListContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterBitType(ctx: ErlangParser.BitTypeContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitBitType(ctx: ErlangParser.BitTypeContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterBitSizeExpr(ctx: ErlangParser.BitSizeExprContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitBitSizeExpr(ctx: ErlangParser.BitSizeExprContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterListComprehension(ctx: ErlangParser.ListComprehensionContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitListComprehension(ctx: ErlangParser.ListComprehensionContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterBinaryComprehension(ctx: ErlangParser.BinaryComprehensionContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitBinaryComprehension(ctx: ErlangParser.BinaryComprehensionContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterLcExprs(ctx: ErlangParser.LcExprsContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitLcExprs(ctx: ErlangParser.LcExprsContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterLcExpr(ctx: ErlangParser.LcExprContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitLcExpr(ctx: ErlangParser.LcExprContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterTuple(ctx: ErlangParser.TupleContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitTuple(ctx: ErlangParser.TupleContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterRecordExpr(ctx: ErlangParser.RecordExprContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitRecordExpr(ctx: ErlangParser.RecordExprContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterRecordTuple(ctx: ErlangParser.RecordTupleContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitRecordTuple(ctx: ErlangParser.RecordTupleContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterRecordFields(ctx: ErlangParser.RecordFieldsContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitRecordFields(ctx: ErlangParser.RecordFieldsContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterRecordField(ctx: ErlangParser.RecordFieldContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitRecordField(ctx: ErlangParser.RecordFieldContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterFunctionCall(ctx: ErlangParser.FunctionCallContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitFunctionCall(ctx: ErlangParser.FunctionCallContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterIfExpr(ctx: ErlangParser.IfExprContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitIfExpr(ctx: ErlangParser.IfExprContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterIfClauses(ctx: ErlangParser.IfClausesContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitIfClauses(ctx: ErlangParser.IfClausesContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterIfClause(ctx: ErlangParser.IfClauseContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitIfClause(ctx: ErlangParser.IfClauseContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterCaseExpr(ctx: ErlangParser.CaseExprContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitCaseExpr(ctx: ErlangParser.CaseExprContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterCrClauses(ctx: ErlangParser.CrClausesContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitCrClauses(ctx: ErlangParser.CrClausesContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterCrClause(ctx: ErlangParser.CrClauseContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitCrClause(ctx: ErlangParser.CrClauseContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterReceiveExpr(ctx: ErlangParser.ReceiveExprContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitReceiveExpr(ctx: ErlangParser.ReceiveExprContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterFunExpr(ctx: ErlangParser.FunExprContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitFunExpr(ctx: ErlangParser.FunExprContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterAtomOrVar(ctx: ErlangParser.AtomOrVarContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitAtomOrVar(ctx: ErlangParser.AtomOrVarContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterIntegerOrVar(ctx: ErlangParser.IntegerOrVarContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitIntegerOrVar(ctx: ErlangParser.IntegerOrVarContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterFunClauses(ctx: ErlangParser.FunClausesContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitFunClauses(ctx: ErlangParser.FunClausesContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterFunClause(ctx: ErlangParser.FunClauseContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitFunClause(ctx: ErlangParser.FunClauseContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterTryExpr(ctx: ErlangParser.TryExprContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitTryExpr(ctx: ErlangParser.TryExprContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterTryCatch(ctx: ErlangParser.TryCatchContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitTryCatch(ctx: ErlangParser.TryCatchContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterTryClauses(ctx: ErlangParser.TryClausesContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitTryClauses(ctx: ErlangParser.TryClausesContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterTryClause(ctx: ErlangParser.TryClauseContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitTryClause(ctx: ErlangParser.TryClauseContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterArgumentList(ctx: ErlangParser.ArgumentListContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitArgumentList(ctx: ErlangParser.ArgumentListContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterExprs(ctx: ErlangParser.ExprsContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitExprs(ctx: ErlangParser.ExprsContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterGuard(ctx: ErlangParser.GuardContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitGuard(ctx: ErlangParser.GuardContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterAtomic(ctx: ErlangParser.AtomicContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitAtomic(ctx: ErlangParser.AtomicContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterPrefixOp(ctx: ErlangParser.PrefixOpContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitPrefixOp(ctx: ErlangParser.PrefixOpContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterMultOp(ctx: ErlangParser.MultOpContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitMultOp(ctx: ErlangParser.MultOpContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterAddOp(ctx: ErlangParser.AddOpContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitAddOp(ctx: ErlangParser.AddOpContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterListOp(ctx: ErlangParser.ListOpContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitListOp(ctx: ErlangParser.ListOpContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterCompOp(ctx: ErlangParser.CompOpContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitCompOp(ctx: ErlangParser.CompOpContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterRuleClauses(ctx: ErlangParser.RuleClausesContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitRuleClauses(ctx: ErlangParser.RuleClausesContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterRuleClause(ctx: ErlangParser.RuleClauseContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitRuleClause(ctx: ErlangParser.RuleClauseContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterRuleBody(ctx: ErlangParser.RuleBodyContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitRuleBody(ctx: ErlangParser.RuleBodyContext) { }

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