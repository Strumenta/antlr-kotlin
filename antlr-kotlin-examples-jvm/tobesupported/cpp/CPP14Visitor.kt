// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CPP14Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
interface CPP14Visitor<T> : ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#translationunit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTranslationunit(ctx : CPP14Parser.TranslationunitContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#primaryexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPrimaryexpression(ctx : CPP14Parser.PrimaryexpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#idexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIdexpression(ctx : CPP14Parser.IdexpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#unqualifiedid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnqualifiedid(ctx : CPP14Parser.UnqualifiedidContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#qualifiedid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitQualifiedid(ctx : CPP14Parser.QualifiedidContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#nestednamespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNestednamespecifier(ctx : CPP14Parser.NestednamespecifierContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#lambdaexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLambdaexpression(ctx : CPP14Parser.LambdaexpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#lambdaintroducer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLambdaintroducer(ctx : CPP14Parser.LambdaintroducerContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#lambdacapture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLambdacapture(ctx : CPP14Parser.LambdacaptureContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#capturedefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCapturedefault(ctx : CPP14Parser.CapturedefaultContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#capturelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCapturelist(ctx : CPP14Parser.CapturelistContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#capture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCapture(ctx : CPP14Parser.CaptureContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#simplecapture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSimplecapture(ctx : CPP14Parser.SimplecaptureContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#initcapture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInitcapture(ctx : CPP14Parser.InitcaptureContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#lambdadeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLambdadeclarator(ctx : CPP14Parser.LambdadeclaratorContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#postfixexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPostfixexpression(ctx : CPP14Parser.PostfixexpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#typeidofexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTypeidofexpr(ctx : CPP14Parser.TypeidofexprContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#typeidofthetypeid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTypeidofthetypeid(ctx : CPP14Parser.TypeidofthetypeidContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#expressionlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExpressionlist(ctx : CPP14Parser.ExpressionlistContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#pseudodestructorname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPseudodestructorname(ctx : CPP14Parser.PseudodestructornameContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#unaryexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnaryexpression(ctx : CPP14Parser.UnaryexpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#unaryoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnaryoperator(ctx : CPP14Parser.UnaryoperatorContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#newexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNewexpression(ctx : CPP14Parser.NewexpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#newplacement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNewplacement(ctx : CPP14Parser.NewplacementContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#newtypeid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNewtypeid(ctx : CPP14Parser.NewtypeidContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#newdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNewdeclarator(ctx : CPP14Parser.NewdeclaratorContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#noptrnewdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNoptrnewdeclarator(ctx : CPP14Parser.NoptrnewdeclaratorContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#newinitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNewinitializer(ctx : CPP14Parser.NewinitializerContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#deleteexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDeleteexpression(ctx : CPP14Parser.DeleteexpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#noexceptexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNoexceptexpression(ctx : CPP14Parser.NoexceptexpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#castexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCastexpression(ctx : CPP14Parser.CastexpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#pmexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPmexpression(ctx : CPP14Parser.PmexpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#multiplicativeexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMultiplicativeexpression(ctx : CPP14Parser.MultiplicativeexpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#additiveexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAdditiveexpression(ctx : CPP14Parser.AdditiveexpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#shiftexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitShiftexpression(ctx : CPP14Parser.ShiftexpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#relationalexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRelationalexpression(ctx : CPP14Parser.RelationalexpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#equalityexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEqualityexpression(ctx : CPP14Parser.EqualityexpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#andexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAndexpression(ctx : CPP14Parser.AndexpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#exclusiveorexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExclusiveorexpression(ctx : CPP14Parser.ExclusiveorexpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#inclusiveorexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInclusiveorexpression(ctx : CPP14Parser.InclusiveorexpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#logicalandexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLogicalandexpression(ctx : CPP14Parser.LogicalandexpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#logicalorexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLogicalorexpression(ctx : CPP14Parser.LogicalorexpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#conditionalexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConditionalexpression(ctx : CPP14Parser.ConditionalexpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#assignmentexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAssignmentexpression(ctx : CPP14Parser.AssignmentexpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#assignmentoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAssignmentoperator(ctx : CPP14Parser.AssignmentoperatorContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExpression(ctx : CPP14Parser.ExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#constantexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConstantexpression(ctx : CPP14Parser.ConstantexpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStatement(ctx : CPP14Parser.StatementContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#labeledstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLabeledstatement(ctx : CPP14Parser.LabeledstatementContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#expressionstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExpressionstatement(ctx : CPP14Parser.ExpressionstatementContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#compoundstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCompoundstatement(ctx : CPP14Parser.CompoundstatementContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#statementseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStatementseq(ctx : CPP14Parser.StatementseqContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#selectionstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSelectionstatement(ctx : CPP14Parser.SelectionstatementContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCondition(ctx : CPP14Parser.ConditionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#iterationstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIterationstatement(ctx : CPP14Parser.IterationstatementContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#forinitstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitForinitstatement(ctx : CPP14Parser.ForinitstatementContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#forrangedeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitForrangedeclaration(ctx : CPP14Parser.ForrangedeclarationContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#forrangeinitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitForrangeinitializer(ctx : CPP14Parser.ForrangeinitializerContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#jumpstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitJumpstatement(ctx : CPP14Parser.JumpstatementContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#declarationstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDeclarationstatement(ctx : CPP14Parser.DeclarationstatementContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#declarationseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDeclarationseq(ctx : CPP14Parser.DeclarationseqContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDeclaration(ctx : CPP14Parser.DeclarationContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#blockdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBlockdeclaration(ctx : CPP14Parser.BlockdeclarationContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#aliasdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAliasdeclaration(ctx : CPP14Parser.AliasdeclarationContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#simpledeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSimpledeclaration(ctx : CPP14Parser.SimpledeclarationContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#static_assertdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStatic_assertdeclaration(ctx : CPP14Parser.Static_assertdeclarationContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#emptydeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEmptydeclaration(ctx : CPP14Parser.EmptydeclarationContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#attributedeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAttributedeclaration(ctx : CPP14Parser.AttributedeclarationContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#declspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDeclspecifier(ctx : CPP14Parser.DeclspecifierContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#declspecifierseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDeclspecifierseq(ctx : CPP14Parser.DeclspecifierseqContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#storageclassspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStorageclassspecifier(ctx : CPP14Parser.StorageclassspecifierContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#functionspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFunctionspecifier(ctx : CPP14Parser.FunctionspecifierContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#typedefname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTypedefname(ctx : CPP14Parser.TypedefnameContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#typespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTypespecifier(ctx : CPP14Parser.TypespecifierContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#trailingtypespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTrailingtypespecifier(ctx : CPP14Parser.TrailingtypespecifierContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#typespecifierseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTypespecifierseq(ctx : CPP14Parser.TypespecifierseqContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#trailingtypespecifierseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTrailingtypespecifierseq(ctx : CPP14Parser.TrailingtypespecifierseqContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#simpletypespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSimpletypespecifier(ctx : CPP14Parser.SimpletypespecifierContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#thetypename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitThetypename(ctx : CPP14Parser.ThetypenameContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#decltypespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDecltypespecifier(ctx : CPP14Parser.DecltypespecifierContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#elaboratedtypespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitElaboratedtypespecifier(ctx : CPP14Parser.ElaboratedtypespecifierContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#enumname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEnumname(ctx : CPP14Parser.EnumnameContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#enumspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEnumspecifier(ctx : CPP14Parser.EnumspecifierContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#enumhead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEnumhead(ctx : CPP14Parser.EnumheadContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#opaqueenumdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOpaqueenumdeclaration(ctx : CPP14Parser.OpaqueenumdeclarationContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#enumkey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEnumkey(ctx : CPP14Parser.EnumkeyContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#enumbase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEnumbase(ctx : CPP14Parser.EnumbaseContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#enumeratorlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEnumeratorlist(ctx : CPP14Parser.EnumeratorlistContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#enumeratordefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEnumeratordefinition(ctx : CPP14Parser.EnumeratordefinitionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEnumerator(ctx : CPP14Parser.EnumeratorContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#namespacename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNamespacename(ctx : CPP14Parser.NamespacenameContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#originalnamespacename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOriginalnamespacename(ctx : CPP14Parser.OriginalnamespacenameContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#namespacedefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNamespacedefinition(ctx : CPP14Parser.NamespacedefinitionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#namednamespacedefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNamednamespacedefinition(ctx : CPP14Parser.NamednamespacedefinitionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#originalnamespacedefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOriginalnamespacedefinition(ctx : CPP14Parser.OriginalnamespacedefinitionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#extensionnamespacedefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExtensionnamespacedefinition(ctx : CPP14Parser.ExtensionnamespacedefinitionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#unnamednamespacedefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnnamednamespacedefinition(ctx : CPP14Parser.UnnamednamespacedefinitionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#namespacebody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNamespacebody(ctx : CPP14Parser.NamespacebodyContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#namespacealias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNamespacealias(ctx : CPP14Parser.NamespacealiasContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#namespacealiasdefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNamespacealiasdefinition(ctx : CPP14Parser.NamespacealiasdefinitionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitQualifiednamespacespecifier(ctx : CPP14Parser.QualifiednamespacespecifierContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#usingdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUsingdeclaration(ctx : CPP14Parser.UsingdeclarationContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#usingdirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUsingdirective(ctx : CPP14Parser.UsingdirectiveContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#asmdefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAsmdefinition(ctx : CPP14Parser.AsmdefinitionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#linkagespecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLinkagespecification(ctx : CPP14Parser.LinkagespecificationContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#attributespecifierseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAttributespecifierseq(ctx : CPP14Parser.AttributespecifierseqContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#attributespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAttributespecifier(ctx : CPP14Parser.AttributespecifierContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#alignmentspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAlignmentspecifier(ctx : CPP14Parser.AlignmentspecifierContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#attributelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAttributelist(ctx : CPP14Parser.AttributelistContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAttribute(ctx : CPP14Parser.AttributeContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#attributetoken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAttributetoken(ctx : CPP14Parser.AttributetokenContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#attributescopedtoken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAttributescopedtoken(ctx : CPP14Parser.AttributescopedtokenContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#attributenamespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAttributenamespace(ctx : CPP14Parser.AttributenamespaceContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#attributeargumentclause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAttributeargumentclause(ctx : CPP14Parser.AttributeargumentclauseContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#balancedtokenseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBalancedtokenseq(ctx : CPP14Parser.BalancedtokenseqContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#balancedtoken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBalancedtoken(ctx : CPP14Parser.BalancedtokenContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#initdeclaratorlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInitdeclaratorlist(ctx : CPP14Parser.InitdeclaratorlistContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#initdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInitdeclarator(ctx : CPP14Parser.InitdeclaratorContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDeclarator(ctx : CPP14Parser.DeclaratorContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#ptrdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPtrdeclarator(ctx : CPP14Parser.PtrdeclaratorContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#noptrdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNoptrdeclarator(ctx : CPP14Parser.NoptrdeclaratorContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#parametersandqualifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitParametersandqualifiers(ctx : CPP14Parser.ParametersandqualifiersContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#trailingreturntype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTrailingreturntype(ctx : CPP14Parser.TrailingreturntypeContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#ptroperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPtroperator(ctx : CPP14Parser.PtroperatorContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#cvqualifierseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCvqualifierseq(ctx : CPP14Parser.CvqualifierseqContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#cvqualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCvqualifier(ctx : CPP14Parser.CvqualifierContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#refqualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRefqualifier(ctx : CPP14Parser.RefqualifierContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#declaratorid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDeclaratorid(ctx : CPP14Parser.DeclaratoridContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#thetypeid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitThetypeid(ctx : CPP14Parser.ThetypeidContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#abstractdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAbstractdeclarator(ctx : CPP14Parser.AbstractdeclaratorContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#ptrabstractdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPtrabstractdeclarator(ctx : CPP14Parser.PtrabstractdeclaratorContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#noptrabstractdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNoptrabstractdeclarator(ctx : CPP14Parser.NoptrabstractdeclaratorContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#abstractpackdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAbstractpackdeclarator(ctx : CPP14Parser.AbstractpackdeclaratorContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#noptrabstractpackdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNoptrabstractpackdeclarator(ctx : CPP14Parser.NoptrabstractpackdeclaratorContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#parameterdeclarationclause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitParameterdeclarationclause(ctx : CPP14Parser.ParameterdeclarationclauseContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#parameterdeclarationlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitParameterdeclarationlist(ctx : CPP14Parser.ParameterdeclarationlistContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#parameterdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitParameterdeclaration(ctx : CPP14Parser.ParameterdeclarationContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#functiondefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFunctiondefinition(ctx : CPP14Parser.FunctiondefinitionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#functionbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFunctionbody(ctx : CPP14Parser.FunctionbodyContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInitializer(ctx : CPP14Parser.InitializerContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#braceorequalinitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBraceorequalinitializer(ctx : CPP14Parser.BraceorequalinitializerContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#initializerclause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInitializerclause(ctx : CPP14Parser.InitializerclauseContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#initializerlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInitializerlist(ctx : CPP14Parser.InitializerlistContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#bracedinitlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBracedinitlist(ctx : CPP14Parser.BracedinitlistContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#classname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClassname(ctx : CPP14Parser.ClassnameContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#classspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClassspecifier(ctx : CPP14Parser.ClassspecifierContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#classhead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClasshead(ctx : CPP14Parser.ClassheadContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#classheadname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClassheadname(ctx : CPP14Parser.ClassheadnameContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#classvirtspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClassvirtspecifier(ctx : CPP14Parser.ClassvirtspecifierContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#classkey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClasskey(ctx : CPP14Parser.ClasskeyContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#memberspecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMemberspecification(ctx : CPP14Parser.MemberspecificationContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#memberdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMemberdeclaration(ctx : CPP14Parser.MemberdeclarationContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#memberdeclaratorlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMemberdeclaratorlist(ctx : CPP14Parser.MemberdeclaratorlistContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#memberdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMemberdeclarator(ctx : CPP14Parser.MemberdeclaratorContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#virtspecifierseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitVirtspecifierseq(ctx : CPP14Parser.VirtspecifierseqContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#virtspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitVirtspecifier(ctx : CPP14Parser.VirtspecifierContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#purespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPurespecifier(ctx : CPP14Parser.PurespecifierContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#baseclause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBaseclause(ctx : CPP14Parser.BaseclauseContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#basespecifierlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBasespecifierlist(ctx : CPP14Parser.BasespecifierlistContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#basespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBasespecifier(ctx : CPP14Parser.BasespecifierContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#classordecltype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClassordecltype(ctx : CPP14Parser.ClassordecltypeContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#basetypespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBasetypespecifier(ctx : CPP14Parser.BasetypespecifierContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#accessspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAccessspecifier(ctx : CPP14Parser.AccessspecifierContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#conversionfunctionid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConversionfunctionid(ctx : CPP14Parser.ConversionfunctionidContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#conversiontypeid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConversiontypeid(ctx : CPP14Parser.ConversiontypeidContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#conversiondeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConversiondeclarator(ctx : CPP14Parser.ConversiondeclaratorContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#ctorinitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCtorinitializer(ctx : CPP14Parser.CtorinitializerContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#meminitializerlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMeminitializerlist(ctx : CPP14Parser.MeminitializerlistContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#meminitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMeminitializer(ctx : CPP14Parser.MeminitializerContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#meminitializerid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMeminitializerid(ctx : CPP14Parser.MeminitializeridContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#operatorfunctionid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOperatorfunctionid(ctx : CPP14Parser.OperatorfunctionidContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#literaloperatorid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLiteraloperatorid(ctx : CPP14Parser.LiteraloperatoridContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#templatedeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTemplatedeclaration(ctx : CPP14Parser.TemplatedeclarationContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#templateparameterlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTemplateparameterlist(ctx : CPP14Parser.TemplateparameterlistContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#templateparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTemplateparameter(ctx : CPP14Parser.TemplateparameterContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#typeparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTypeparameter(ctx : CPP14Parser.TypeparameterContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#simpletemplateid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSimpletemplateid(ctx : CPP14Parser.SimpletemplateidContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#templateid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTemplateid(ctx : CPP14Parser.TemplateidContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#templatename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTemplatename(ctx : CPP14Parser.TemplatenameContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#templateargumentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTemplateargumentlist(ctx : CPP14Parser.TemplateargumentlistContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#templateargument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTemplateargument(ctx : CPP14Parser.TemplateargumentContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#typenamespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTypenamespecifier(ctx : CPP14Parser.TypenamespecifierContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#explicitinstantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExplicitinstantiation(ctx : CPP14Parser.ExplicitinstantiationContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#explicitspecialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExplicitspecialization(ctx : CPP14Parser.ExplicitspecializationContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#tryblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTryblock(ctx : CPP14Parser.TryblockContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#functiontryblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFunctiontryblock(ctx : CPP14Parser.FunctiontryblockContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#handlerseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitHandlerseq(ctx : CPP14Parser.HandlerseqContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#handler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitHandler(ctx : CPP14Parser.HandlerContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#exceptiondeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExceptiondeclaration(ctx : CPP14Parser.ExceptiondeclarationContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#throwexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitThrowexpression(ctx : CPP14Parser.ThrowexpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#exceptionspecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExceptionspecification(ctx : CPP14Parser.ExceptionspecificationContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#dynamicexceptionspecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDynamicexceptionspecification(ctx : CPP14Parser.DynamicexceptionspecificationContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#typeidlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTypeidlist(ctx : CPP14Parser.TypeidlistContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#noexceptspecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNoexceptspecification(ctx : CPP14Parser.NoexceptspecificationContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#rightShift}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRightShift(ctx : CPP14Parser.RightShiftContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#rightShiftAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRightShiftAssign(ctx : CPP14Parser.RightShiftAssignContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#theoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTheoperator(ctx : CPP14Parser.TheoperatorContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLiteral(ctx : CPP14Parser.LiteralContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#booleanliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBooleanliteral(ctx : CPP14Parser.BooleanliteralContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#pointerliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPointerliteral(ctx : CPP14Parser.PointerliteralContext) : T
	/**
	 * Visit a parse tree produced by {@link CPP14Parser#userdefinedliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUserdefinedliteral(ctx : CPP14Parser.UserdefinedliteralContext) : T
}