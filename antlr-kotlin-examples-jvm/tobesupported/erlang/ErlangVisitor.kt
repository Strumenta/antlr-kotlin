// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ErlangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
interface ErlangVisitor<T> : ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ErlangParser#forms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitForms(ctx : ErlangParser.FormsContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitForm(ctx : ErlangParser.FormContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#tokAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTokAtom(ctx : ErlangParser.TokAtomContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#tokVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTokVar(ctx : ErlangParser.TokVarContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#tokFloat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTokFloat(ctx : ErlangParser.TokFloatContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#tokInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTokInteger(ctx : ErlangParser.TokIntegerContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#tokChar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTokChar(ctx : ErlangParser.TokCharContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#tokString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTokString(ctx : ErlangParser.TokStringContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAttribute(ctx : ErlangParser.AttributeContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#typeSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTypeSpec(ctx : ErlangParser.TypeSpecContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#specFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSpecFun(ctx : ErlangParser.SpecFunContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#typedAttrVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTypedAttrVal(ctx : ErlangParser.TypedAttrValContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#typedRecordFields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTypedRecordFields(ctx : ErlangParser.TypedRecordFieldsContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#typedExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTypedExprs(ctx : ErlangParser.TypedExprsContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#typedExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTypedExpr(ctx : ErlangParser.TypedExprContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#typeSigs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTypeSigs(ctx : ErlangParser.TypeSigsContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#typeSig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTypeSig(ctx : ErlangParser.TypeSigContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#typeGuards}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTypeGuards(ctx : ErlangParser.TypeGuardsContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#typeGuard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTypeGuard(ctx : ErlangParser.TypeGuardContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#topTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTopTypes(ctx : ErlangParser.TopTypesContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#topType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTopType(ctx : ErlangParser.TopTypeContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#topType100}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTopType100(ctx : ErlangParser.TopType100Context) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#type200}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitType200(ctx : ErlangParser.Type200Context) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#type300}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitType300(ctx : ErlangParser.Type300Context) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#type400}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitType400(ctx : ErlangParser.Type400Context) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#type500}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitType500(ctx : ErlangParser.Type500Context) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitType(ctx : ErlangParser.TypeContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#funType100}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFunType100(ctx : ErlangParser.FunType100Context) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#funType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFunType(ctx : ErlangParser.FunTypeContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#fieldTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFieldTypes(ctx : ErlangParser.FieldTypesContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#fieldType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFieldType(ctx : ErlangParser.FieldTypeContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#binaryType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBinaryType(ctx : ErlangParser.BinaryTypeContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#binBaseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBinBaseType(ctx : ErlangParser.BinBaseTypeContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#binUnitType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBinUnitType(ctx : ErlangParser.BinUnitTypeContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#attrVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAttrVal(ctx : ErlangParser.AttrValContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFunction(ctx : ErlangParser.FunctionContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#functionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFunctionClause(ctx : ErlangParser.FunctionClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#clauseArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClauseArgs(ctx : ErlangParser.ClauseArgsContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#clauseGuard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClauseGuard(ctx : ErlangParser.ClauseGuardContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#clauseBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClauseBody(ctx : ErlangParser.ClauseBodyContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExpr(ctx : ErlangParser.ExprContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#expr100}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExpr100(ctx : ErlangParser.Expr100Context) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#expr150}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExpr150(ctx : ErlangParser.Expr150Context) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#expr160}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExpr160(ctx : ErlangParser.Expr160Context) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#expr200}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExpr200(ctx : ErlangParser.Expr200Context) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#expr300}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExpr300(ctx : ErlangParser.Expr300Context) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#expr400}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExpr400(ctx : ErlangParser.Expr400Context) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#expr500}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExpr500(ctx : ErlangParser.Expr500Context) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#expr600}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExpr600(ctx : ErlangParser.Expr600Context) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#expr700}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExpr700(ctx : ErlangParser.Expr700Context) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#expr800}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExpr800(ctx : ErlangParser.Expr800Context) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#exprMax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExprMax(ctx : ErlangParser.ExprMaxContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitList(ctx : ErlangParser.ListContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTail(ctx : ErlangParser.TailContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBinary(ctx : ErlangParser.BinaryContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#binElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBinElements(ctx : ErlangParser.BinElementsContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#binElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBinElement(ctx : ErlangParser.BinElementContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#bitExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBitExpr(ctx : ErlangParser.BitExprContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#optBitSizeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOptBitSizeExpr(ctx : ErlangParser.OptBitSizeExprContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#optBitTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOptBitTypeList(ctx : ErlangParser.OptBitTypeListContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#bitTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBitTypeList(ctx : ErlangParser.BitTypeListContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#bitType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBitType(ctx : ErlangParser.BitTypeContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#bitSizeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBitSizeExpr(ctx : ErlangParser.BitSizeExprContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#listComprehension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitListComprehension(ctx : ErlangParser.ListComprehensionContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#binaryComprehension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBinaryComprehension(ctx : ErlangParser.BinaryComprehensionContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#lcExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLcExprs(ctx : ErlangParser.LcExprsContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#lcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLcExpr(ctx : ErlangParser.LcExprContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTuple(ctx : ErlangParser.TupleContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#recordExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRecordExpr(ctx : ErlangParser.RecordExprContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#recordTuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRecordTuple(ctx : ErlangParser.RecordTupleContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#recordFields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRecordFields(ctx : ErlangParser.RecordFieldsContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#recordField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRecordField(ctx : ErlangParser.RecordFieldContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFunctionCall(ctx : ErlangParser.FunctionCallContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#ifExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIfExpr(ctx : ErlangParser.IfExprContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#ifClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIfClauses(ctx : ErlangParser.IfClausesContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#ifClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIfClause(ctx : ErlangParser.IfClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#caseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCaseExpr(ctx : ErlangParser.CaseExprContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#crClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCrClauses(ctx : ErlangParser.CrClausesContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#crClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCrClause(ctx : ErlangParser.CrClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#receiveExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReceiveExpr(ctx : ErlangParser.ReceiveExprContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#funExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFunExpr(ctx : ErlangParser.FunExprContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#atomOrVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAtomOrVar(ctx : ErlangParser.AtomOrVarContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#integerOrVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIntegerOrVar(ctx : ErlangParser.IntegerOrVarContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#funClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFunClauses(ctx : ErlangParser.FunClausesContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#funClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFunClause(ctx : ErlangParser.FunClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#tryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTryExpr(ctx : ErlangParser.TryExprContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#tryCatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTryCatch(ctx : ErlangParser.TryCatchContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#tryClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTryClauses(ctx : ErlangParser.TryClausesContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#tryClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTryClause(ctx : ErlangParser.TryClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitArgumentList(ctx : ErlangParser.ArgumentListContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#exprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExprs(ctx : ErlangParser.ExprsContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#guard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGuard(ctx : ErlangParser.GuardContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAtomic(ctx : ErlangParser.AtomicContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#prefixOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPrefixOp(ctx : ErlangParser.PrefixOpContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#multOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMultOp(ctx : ErlangParser.MultOpContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAddOp(ctx : ErlangParser.AddOpContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#listOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitListOp(ctx : ErlangParser.ListOpContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCompOp(ctx : ErlangParser.CompOpContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#ruleClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRuleClauses(ctx : ErlangParser.RuleClausesContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#ruleClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRuleClause(ctx : ErlangParser.RuleClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link ErlangParser#ruleBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRuleBody(ctx : ErlangParser.RuleBodyContext) : T
}