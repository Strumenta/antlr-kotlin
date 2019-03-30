// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CPP14Parser}.
 */
interface CPP14Listener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#translationunit}.
	 * @param ctx the parse tree
	 */
	fun enterTranslationunit(ctx: CPP14Parser.TranslationunitContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#translationunit}.
	 * @param ctx the parse tree
	 */
	fun exitTranslationunit(ctx: CPP14Parser.TranslationunitContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#primaryexpression}.
	 * @param ctx the parse tree
	 */
	fun enterPrimaryexpression(ctx: CPP14Parser.PrimaryexpressionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#primaryexpression}.
	 * @param ctx the parse tree
	 */
	fun exitPrimaryexpression(ctx: CPP14Parser.PrimaryexpressionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#idexpression}.
	 * @param ctx the parse tree
	 */
	fun enterIdexpression(ctx: CPP14Parser.IdexpressionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#idexpression}.
	 * @param ctx the parse tree
	 */
	fun exitIdexpression(ctx: CPP14Parser.IdexpressionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#unqualifiedid}.
	 * @param ctx the parse tree
	 */
	fun enterUnqualifiedid(ctx: CPP14Parser.UnqualifiedidContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#unqualifiedid}.
	 * @param ctx the parse tree
	 */
	fun exitUnqualifiedid(ctx: CPP14Parser.UnqualifiedidContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#qualifiedid}.
	 * @param ctx the parse tree
	 */
	fun enterQualifiedid(ctx: CPP14Parser.QualifiedidContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#qualifiedid}.
	 * @param ctx the parse tree
	 */
	fun exitQualifiedid(ctx: CPP14Parser.QualifiedidContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#nestednamespecifier}.
	 * @param ctx the parse tree
	 */
	fun enterNestednamespecifier(ctx: CPP14Parser.NestednamespecifierContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#nestednamespecifier}.
	 * @param ctx the parse tree
	 */
	fun exitNestednamespecifier(ctx: CPP14Parser.NestednamespecifierContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#lambdaexpression}.
	 * @param ctx the parse tree
	 */
	fun enterLambdaexpression(ctx: CPP14Parser.LambdaexpressionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#lambdaexpression}.
	 * @param ctx the parse tree
	 */
	fun exitLambdaexpression(ctx: CPP14Parser.LambdaexpressionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#lambdaintroducer}.
	 * @param ctx the parse tree
	 */
	fun enterLambdaintroducer(ctx: CPP14Parser.LambdaintroducerContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#lambdaintroducer}.
	 * @param ctx the parse tree
	 */
	fun exitLambdaintroducer(ctx: CPP14Parser.LambdaintroducerContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#lambdacapture}.
	 * @param ctx the parse tree
	 */
	fun enterLambdacapture(ctx: CPP14Parser.LambdacaptureContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#lambdacapture}.
	 * @param ctx the parse tree
	 */
	fun exitLambdacapture(ctx: CPP14Parser.LambdacaptureContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#capturedefault}.
	 * @param ctx the parse tree
	 */
	fun enterCapturedefault(ctx: CPP14Parser.CapturedefaultContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#capturedefault}.
	 * @param ctx the parse tree
	 */
	fun exitCapturedefault(ctx: CPP14Parser.CapturedefaultContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#capturelist}.
	 * @param ctx the parse tree
	 */
	fun enterCapturelist(ctx: CPP14Parser.CapturelistContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#capturelist}.
	 * @param ctx the parse tree
	 */
	fun exitCapturelist(ctx: CPP14Parser.CapturelistContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#capture}.
	 * @param ctx the parse tree
	 */
	fun enterCapture(ctx: CPP14Parser.CaptureContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#capture}.
	 * @param ctx the parse tree
	 */
	fun exitCapture(ctx: CPP14Parser.CaptureContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#simplecapture}.
	 * @param ctx the parse tree
	 */
	fun enterSimplecapture(ctx: CPP14Parser.SimplecaptureContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#simplecapture}.
	 * @param ctx the parse tree
	 */
	fun exitSimplecapture(ctx: CPP14Parser.SimplecaptureContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#initcapture}.
	 * @param ctx the parse tree
	 */
	fun enterInitcapture(ctx: CPP14Parser.InitcaptureContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#initcapture}.
	 * @param ctx the parse tree
	 */
	fun exitInitcapture(ctx: CPP14Parser.InitcaptureContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#lambdadeclarator}.
	 * @param ctx the parse tree
	 */
	fun enterLambdadeclarator(ctx: CPP14Parser.LambdadeclaratorContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#lambdadeclarator}.
	 * @param ctx the parse tree
	 */
	fun exitLambdadeclarator(ctx: CPP14Parser.LambdadeclaratorContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#postfixexpression}.
	 * @param ctx the parse tree
	 */
	fun enterPostfixexpression(ctx: CPP14Parser.PostfixexpressionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#postfixexpression}.
	 * @param ctx the parse tree
	 */
	fun exitPostfixexpression(ctx: CPP14Parser.PostfixexpressionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#typeidofexpr}.
	 * @param ctx the parse tree
	 */
	fun enterTypeidofexpr(ctx: CPP14Parser.TypeidofexprContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#typeidofexpr}.
	 * @param ctx the parse tree
	 */
	fun exitTypeidofexpr(ctx: CPP14Parser.TypeidofexprContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#typeidofthetypeid}.
	 * @param ctx the parse tree
	 */
	fun enterTypeidofthetypeid(ctx: CPP14Parser.TypeidofthetypeidContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#typeidofthetypeid}.
	 * @param ctx the parse tree
	 */
	fun exitTypeidofthetypeid(ctx: CPP14Parser.TypeidofthetypeidContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#expressionlist}.
	 * @param ctx the parse tree
	 */
	fun enterExpressionlist(ctx: CPP14Parser.ExpressionlistContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#expressionlist}.
	 * @param ctx the parse tree
	 */
	fun exitExpressionlist(ctx: CPP14Parser.ExpressionlistContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#pseudodestructorname}.
	 * @param ctx the parse tree
	 */
	fun enterPseudodestructorname(ctx: CPP14Parser.PseudodestructornameContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#pseudodestructorname}.
	 * @param ctx the parse tree
	 */
	fun exitPseudodestructorname(ctx: CPP14Parser.PseudodestructornameContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#unaryexpression}.
	 * @param ctx the parse tree
	 */
	fun enterUnaryexpression(ctx: CPP14Parser.UnaryexpressionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#unaryexpression}.
	 * @param ctx the parse tree
	 */
	fun exitUnaryexpression(ctx: CPP14Parser.UnaryexpressionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#unaryoperator}.
	 * @param ctx the parse tree
	 */
	fun enterUnaryoperator(ctx: CPP14Parser.UnaryoperatorContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#unaryoperator}.
	 * @param ctx the parse tree
	 */
	fun exitUnaryoperator(ctx: CPP14Parser.UnaryoperatorContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#newexpression}.
	 * @param ctx the parse tree
	 */
	fun enterNewexpression(ctx: CPP14Parser.NewexpressionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#newexpression}.
	 * @param ctx the parse tree
	 */
	fun exitNewexpression(ctx: CPP14Parser.NewexpressionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#newplacement}.
	 * @param ctx the parse tree
	 */
	fun enterNewplacement(ctx: CPP14Parser.NewplacementContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#newplacement}.
	 * @param ctx the parse tree
	 */
	fun exitNewplacement(ctx: CPP14Parser.NewplacementContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#newtypeid}.
	 * @param ctx the parse tree
	 */
	fun enterNewtypeid(ctx: CPP14Parser.NewtypeidContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#newtypeid}.
	 * @param ctx the parse tree
	 */
	fun exitNewtypeid(ctx: CPP14Parser.NewtypeidContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#newdeclarator}.
	 * @param ctx the parse tree
	 */
	fun enterNewdeclarator(ctx: CPP14Parser.NewdeclaratorContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#newdeclarator}.
	 * @param ctx the parse tree
	 */
	fun exitNewdeclarator(ctx: CPP14Parser.NewdeclaratorContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#noptrnewdeclarator}.
	 * @param ctx the parse tree
	 */
	fun enterNoptrnewdeclarator(ctx: CPP14Parser.NoptrnewdeclaratorContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#noptrnewdeclarator}.
	 * @param ctx the parse tree
	 */
	fun exitNoptrnewdeclarator(ctx: CPP14Parser.NoptrnewdeclaratorContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#newinitializer}.
	 * @param ctx the parse tree
	 */
	fun enterNewinitializer(ctx: CPP14Parser.NewinitializerContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#newinitializer}.
	 * @param ctx the parse tree
	 */
	fun exitNewinitializer(ctx: CPP14Parser.NewinitializerContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#deleteexpression}.
	 * @param ctx the parse tree
	 */
	fun enterDeleteexpression(ctx: CPP14Parser.DeleteexpressionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#deleteexpression}.
	 * @param ctx the parse tree
	 */
	fun exitDeleteexpression(ctx: CPP14Parser.DeleteexpressionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#noexceptexpression}.
	 * @param ctx the parse tree
	 */
	fun enterNoexceptexpression(ctx: CPP14Parser.NoexceptexpressionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#noexceptexpression}.
	 * @param ctx the parse tree
	 */
	fun exitNoexceptexpression(ctx: CPP14Parser.NoexceptexpressionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#castexpression}.
	 * @param ctx the parse tree
	 */
	fun enterCastexpression(ctx: CPP14Parser.CastexpressionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#castexpression}.
	 * @param ctx the parse tree
	 */
	fun exitCastexpression(ctx: CPP14Parser.CastexpressionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#pmexpression}.
	 * @param ctx the parse tree
	 */
	fun enterPmexpression(ctx: CPP14Parser.PmexpressionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#pmexpression}.
	 * @param ctx the parse tree
	 */
	fun exitPmexpression(ctx: CPP14Parser.PmexpressionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#multiplicativeexpression}.
	 * @param ctx the parse tree
	 */
	fun enterMultiplicativeexpression(ctx: CPP14Parser.MultiplicativeexpressionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#multiplicativeexpression}.
	 * @param ctx the parse tree
	 */
	fun exitMultiplicativeexpression(ctx: CPP14Parser.MultiplicativeexpressionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#additiveexpression}.
	 * @param ctx the parse tree
	 */
	fun enterAdditiveexpression(ctx: CPP14Parser.AdditiveexpressionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#additiveexpression}.
	 * @param ctx the parse tree
	 */
	fun exitAdditiveexpression(ctx: CPP14Parser.AdditiveexpressionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#shiftexpression}.
	 * @param ctx the parse tree
	 */
	fun enterShiftexpression(ctx: CPP14Parser.ShiftexpressionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#shiftexpression}.
	 * @param ctx the parse tree
	 */
	fun exitShiftexpression(ctx: CPP14Parser.ShiftexpressionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#relationalexpression}.
	 * @param ctx the parse tree
	 */
	fun enterRelationalexpression(ctx: CPP14Parser.RelationalexpressionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#relationalexpression}.
	 * @param ctx the parse tree
	 */
	fun exitRelationalexpression(ctx: CPP14Parser.RelationalexpressionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#equalityexpression}.
	 * @param ctx the parse tree
	 */
	fun enterEqualityexpression(ctx: CPP14Parser.EqualityexpressionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#equalityexpression}.
	 * @param ctx the parse tree
	 */
	fun exitEqualityexpression(ctx: CPP14Parser.EqualityexpressionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#andexpression}.
	 * @param ctx the parse tree
	 */
	fun enterAndexpression(ctx: CPP14Parser.AndexpressionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#andexpression}.
	 * @param ctx the parse tree
	 */
	fun exitAndexpression(ctx: CPP14Parser.AndexpressionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#exclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	fun enterExclusiveorexpression(ctx: CPP14Parser.ExclusiveorexpressionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#exclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	fun exitExclusiveorexpression(ctx: CPP14Parser.ExclusiveorexpressionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#inclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	fun enterInclusiveorexpression(ctx: CPP14Parser.InclusiveorexpressionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#inclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	fun exitInclusiveorexpression(ctx: CPP14Parser.InclusiveorexpressionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#logicalandexpression}.
	 * @param ctx the parse tree
	 */
	fun enterLogicalandexpression(ctx: CPP14Parser.LogicalandexpressionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#logicalandexpression}.
	 * @param ctx the parse tree
	 */
	fun exitLogicalandexpression(ctx: CPP14Parser.LogicalandexpressionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#logicalorexpression}.
	 * @param ctx the parse tree
	 */
	fun enterLogicalorexpression(ctx: CPP14Parser.LogicalorexpressionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#logicalorexpression}.
	 * @param ctx the parse tree
	 */
	fun exitLogicalorexpression(ctx: CPP14Parser.LogicalorexpressionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#conditionalexpression}.
	 * @param ctx the parse tree
	 */
	fun enterConditionalexpression(ctx: CPP14Parser.ConditionalexpressionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#conditionalexpression}.
	 * @param ctx the parse tree
	 */
	fun exitConditionalexpression(ctx: CPP14Parser.ConditionalexpressionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#assignmentexpression}.
	 * @param ctx the parse tree
	 */
	fun enterAssignmentexpression(ctx: CPP14Parser.AssignmentexpressionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#assignmentexpression}.
	 * @param ctx the parse tree
	 */
	fun exitAssignmentexpression(ctx: CPP14Parser.AssignmentexpressionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#assignmentoperator}.
	 * @param ctx the parse tree
	 */
	fun enterAssignmentoperator(ctx: CPP14Parser.AssignmentoperatorContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#assignmentoperator}.
	 * @param ctx the parse tree
	 */
	fun exitAssignmentoperator(ctx: CPP14Parser.AssignmentoperatorContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterExpression(ctx: CPP14Parser.ExpressionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitExpression(ctx: CPP14Parser.ExpressionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#constantexpression}.
	 * @param ctx the parse tree
	 */
	fun enterConstantexpression(ctx: CPP14Parser.ConstantexpressionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#constantexpression}.
	 * @param ctx the parse tree
	 */
	fun exitConstantexpression(ctx: CPP14Parser.ConstantexpressionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#statement}.
	 * @param ctx the parse tree
	 */
	fun enterStatement(ctx: CPP14Parser.StatementContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#statement}.
	 * @param ctx the parse tree
	 */
	fun exitStatement(ctx: CPP14Parser.StatementContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#labeledstatement}.
	 * @param ctx the parse tree
	 */
	fun enterLabeledstatement(ctx: CPP14Parser.LabeledstatementContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#labeledstatement}.
	 * @param ctx the parse tree
	 */
	fun exitLabeledstatement(ctx: CPP14Parser.LabeledstatementContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	fun enterExpressionstatement(ctx: CPP14Parser.ExpressionstatementContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	fun exitExpressionstatement(ctx: CPP14Parser.ExpressionstatementContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#compoundstatement}.
	 * @param ctx the parse tree
	 */
	fun enterCompoundstatement(ctx: CPP14Parser.CompoundstatementContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#compoundstatement}.
	 * @param ctx the parse tree
	 */
	fun exitCompoundstatement(ctx: CPP14Parser.CompoundstatementContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#statementseq}.
	 * @param ctx the parse tree
	 */
	fun enterStatementseq(ctx: CPP14Parser.StatementseqContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#statementseq}.
	 * @param ctx the parse tree
	 */
	fun exitStatementseq(ctx: CPP14Parser.StatementseqContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#selectionstatement}.
	 * @param ctx the parse tree
	 */
	fun enterSelectionstatement(ctx: CPP14Parser.SelectionstatementContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#selectionstatement}.
	 * @param ctx the parse tree
	 */
	fun exitSelectionstatement(ctx: CPP14Parser.SelectionstatementContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#condition}.
	 * @param ctx the parse tree
	 */
	fun enterCondition(ctx: CPP14Parser.ConditionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#condition}.
	 * @param ctx the parse tree
	 */
	fun exitCondition(ctx: CPP14Parser.ConditionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#iterationstatement}.
	 * @param ctx the parse tree
	 */
	fun enterIterationstatement(ctx: CPP14Parser.IterationstatementContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#iterationstatement}.
	 * @param ctx the parse tree
	 */
	fun exitIterationstatement(ctx: CPP14Parser.IterationstatementContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#forinitstatement}.
	 * @param ctx the parse tree
	 */
	fun enterForinitstatement(ctx: CPP14Parser.ForinitstatementContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#forinitstatement}.
	 * @param ctx the parse tree
	 */
	fun exitForinitstatement(ctx: CPP14Parser.ForinitstatementContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#forrangedeclaration}.
	 * @param ctx the parse tree
	 */
	fun enterForrangedeclaration(ctx: CPP14Parser.ForrangedeclarationContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#forrangedeclaration}.
	 * @param ctx the parse tree
	 */
	fun exitForrangedeclaration(ctx: CPP14Parser.ForrangedeclarationContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#forrangeinitializer}.
	 * @param ctx the parse tree
	 */
	fun enterForrangeinitializer(ctx: CPP14Parser.ForrangeinitializerContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#forrangeinitializer}.
	 * @param ctx the parse tree
	 */
	fun exitForrangeinitializer(ctx: CPP14Parser.ForrangeinitializerContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#jumpstatement}.
	 * @param ctx the parse tree
	 */
	fun enterJumpstatement(ctx: CPP14Parser.JumpstatementContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#jumpstatement}.
	 * @param ctx the parse tree
	 */
	fun exitJumpstatement(ctx: CPP14Parser.JumpstatementContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#declarationstatement}.
	 * @param ctx the parse tree
	 */
	fun enterDeclarationstatement(ctx: CPP14Parser.DeclarationstatementContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#declarationstatement}.
	 * @param ctx the parse tree
	 */
	fun exitDeclarationstatement(ctx: CPP14Parser.DeclarationstatementContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#declarationseq}.
	 * @param ctx the parse tree
	 */
	fun enterDeclarationseq(ctx: CPP14Parser.DeclarationseqContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#declarationseq}.
	 * @param ctx the parse tree
	 */
	fun exitDeclarationseq(ctx: CPP14Parser.DeclarationseqContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#declaration}.
	 * @param ctx the parse tree
	 */
	fun enterDeclaration(ctx: CPP14Parser.DeclarationContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#declaration}.
	 * @param ctx the parse tree
	 */
	fun exitDeclaration(ctx: CPP14Parser.DeclarationContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#blockdeclaration}.
	 * @param ctx the parse tree
	 */
	fun enterBlockdeclaration(ctx: CPP14Parser.BlockdeclarationContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#blockdeclaration}.
	 * @param ctx the parse tree
	 */
	fun exitBlockdeclaration(ctx: CPP14Parser.BlockdeclarationContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#aliasdeclaration}.
	 * @param ctx the parse tree
	 */
	fun enterAliasdeclaration(ctx: CPP14Parser.AliasdeclarationContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#aliasdeclaration}.
	 * @param ctx the parse tree
	 */
	fun exitAliasdeclaration(ctx: CPP14Parser.AliasdeclarationContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#simpledeclaration}.
	 * @param ctx the parse tree
	 */
	fun enterSimpledeclaration(ctx: CPP14Parser.SimpledeclarationContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#simpledeclaration}.
	 * @param ctx the parse tree
	 */
	fun exitSimpledeclaration(ctx: CPP14Parser.SimpledeclarationContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#static_assertdeclaration}.
	 * @param ctx the parse tree
	 */
	fun enterStatic_assertdeclaration(ctx: CPP14Parser.Static_assertdeclarationContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#static_assertdeclaration}.
	 * @param ctx the parse tree
	 */
	fun exitStatic_assertdeclaration(ctx: CPP14Parser.Static_assertdeclarationContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#emptydeclaration}.
	 * @param ctx the parse tree
	 */
	fun enterEmptydeclaration(ctx: CPP14Parser.EmptydeclarationContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#emptydeclaration}.
	 * @param ctx the parse tree
	 */
	fun exitEmptydeclaration(ctx: CPP14Parser.EmptydeclarationContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#attributedeclaration}.
	 * @param ctx the parse tree
	 */
	fun enterAttributedeclaration(ctx: CPP14Parser.AttributedeclarationContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#attributedeclaration}.
	 * @param ctx the parse tree
	 */
	fun exitAttributedeclaration(ctx: CPP14Parser.AttributedeclarationContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#declspecifier}.
	 * @param ctx the parse tree
	 */
	fun enterDeclspecifier(ctx: CPP14Parser.DeclspecifierContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#declspecifier}.
	 * @param ctx the parse tree
	 */
	fun exitDeclspecifier(ctx: CPP14Parser.DeclspecifierContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#declspecifierseq}.
	 * @param ctx the parse tree
	 */
	fun enterDeclspecifierseq(ctx: CPP14Parser.DeclspecifierseqContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#declspecifierseq}.
	 * @param ctx the parse tree
	 */
	fun exitDeclspecifierseq(ctx: CPP14Parser.DeclspecifierseqContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#storageclassspecifier}.
	 * @param ctx the parse tree
	 */
	fun enterStorageclassspecifier(ctx: CPP14Parser.StorageclassspecifierContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#storageclassspecifier}.
	 * @param ctx the parse tree
	 */
	fun exitStorageclassspecifier(ctx: CPP14Parser.StorageclassspecifierContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#functionspecifier}.
	 * @param ctx the parse tree
	 */
	fun enterFunctionspecifier(ctx: CPP14Parser.FunctionspecifierContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#functionspecifier}.
	 * @param ctx the parse tree
	 */
	fun exitFunctionspecifier(ctx: CPP14Parser.FunctionspecifierContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#typedefname}.
	 * @param ctx the parse tree
	 */
	fun enterTypedefname(ctx: CPP14Parser.TypedefnameContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#typedefname}.
	 * @param ctx the parse tree
	 */
	fun exitTypedefname(ctx: CPP14Parser.TypedefnameContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#typespecifier}.
	 * @param ctx the parse tree
	 */
	fun enterTypespecifier(ctx: CPP14Parser.TypespecifierContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#typespecifier}.
	 * @param ctx the parse tree
	 */
	fun exitTypespecifier(ctx: CPP14Parser.TypespecifierContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#trailingtypespecifier}.
	 * @param ctx the parse tree
	 */
	fun enterTrailingtypespecifier(ctx: CPP14Parser.TrailingtypespecifierContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#trailingtypespecifier}.
	 * @param ctx the parse tree
	 */
	fun exitTrailingtypespecifier(ctx: CPP14Parser.TrailingtypespecifierContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#typespecifierseq}.
	 * @param ctx the parse tree
	 */
	fun enterTypespecifierseq(ctx: CPP14Parser.TypespecifierseqContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#typespecifierseq}.
	 * @param ctx the parse tree
	 */
	fun exitTypespecifierseq(ctx: CPP14Parser.TypespecifierseqContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#trailingtypespecifierseq}.
	 * @param ctx the parse tree
	 */
	fun enterTrailingtypespecifierseq(ctx: CPP14Parser.TrailingtypespecifierseqContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#trailingtypespecifierseq}.
	 * @param ctx the parse tree
	 */
	fun exitTrailingtypespecifierseq(ctx: CPP14Parser.TrailingtypespecifierseqContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#simpletypespecifier}.
	 * @param ctx the parse tree
	 */
	fun enterSimpletypespecifier(ctx: CPP14Parser.SimpletypespecifierContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#simpletypespecifier}.
	 * @param ctx the parse tree
	 */
	fun exitSimpletypespecifier(ctx: CPP14Parser.SimpletypespecifierContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#thetypename}.
	 * @param ctx the parse tree
	 */
	fun enterThetypename(ctx: CPP14Parser.ThetypenameContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#thetypename}.
	 * @param ctx the parse tree
	 */
	fun exitThetypename(ctx: CPP14Parser.ThetypenameContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#decltypespecifier}.
	 * @param ctx the parse tree
	 */
	fun enterDecltypespecifier(ctx: CPP14Parser.DecltypespecifierContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#decltypespecifier}.
	 * @param ctx the parse tree
	 */
	fun exitDecltypespecifier(ctx: CPP14Parser.DecltypespecifierContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#elaboratedtypespecifier}.
	 * @param ctx the parse tree
	 */
	fun enterElaboratedtypespecifier(ctx: CPP14Parser.ElaboratedtypespecifierContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#elaboratedtypespecifier}.
	 * @param ctx the parse tree
	 */
	fun exitElaboratedtypespecifier(ctx: CPP14Parser.ElaboratedtypespecifierContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#enumname}.
	 * @param ctx the parse tree
	 */
	fun enterEnumname(ctx: CPP14Parser.EnumnameContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#enumname}.
	 * @param ctx the parse tree
	 */
	fun exitEnumname(ctx: CPP14Parser.EnumnameContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#enumspecifier}.
	 * @param ctx the parse tree
	 */
	fun enterEnumspecifier(ctx: CPP14Parser.EnumspecifierContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#enumspecifier}.
	 * @param ctx the parse tree
	 */
	fun exitEnumspecifier(ctx: CPP14Parser.EnumspecifierContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#enumhead}.
	 * @param ctx the parse tree
	 */
	fun enterEnumhead(ctx: CPP14Parser.EnumheadContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#enumhead}.
	 * @param ctx the parse tree
	 */
	fun exitEnumhead(ctx: CPP14Parser.EnumheadContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#opaqueenumdeclaration}.
	 * @param ctx the parse tree
	 */
	fun enterOpaqueenumdeclaration(ctx: CPP14Parser.OpaqueenumdeclarationContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#opaqueenumdeclaration}.
	 * @param ctx the parse tree
	 */
	fun exitOpaqueenumdeclaration(ctx: CPP14Parser.OpaqueenumdeclarationContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#enumkey}.
	 * @param ctx the parse tree
	 */
	fun enterEnumkey(ctx: CPP14Parser.EnumkeyContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#enumkey}.
	 * @param ctx the parse tree
	 */
	fun exitEnumkey(ctx: CPP14Parser.EnumkeyContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#enumbase}.
	 * @param ctx the parse tree
	 */
	fun enterEnumbase(ctx: CPP14Parser.EnumbaseContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#enumbase}.
	 * @param ctx the parse tree
	 */
	fun exitEnumbase(ctx: CPP14Parser.EnumbaseContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#enumeratorlist}.
	 * @param ctx the parse tree
	 */
	fun enterEnumeratorlist(ctx: CPP14Parser.EnumeratorlistContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#enumeratorlist}.
	 * @param ctx the parse tree
	 */
	fun exitEnumeratorlist(ctx: CPP14Parser.EnumeratorlistContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#enumeratordefinition}.
	 * @param ctx the parse tree
	 */
	fun enterEnumeratordefinition(ctx: CPP14Parser.EnumeratordefinitionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#enumeratordefinition}.
	 * @param ctx the parse tree
	 */
	fun exitEnumeratordefinition(ctx: CPP14Parser.EnumeratordefinitionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#enumerator}.
	 * @param ctx the parse tree
	 */
	fun enterEnumerator(ctx: CPP14Parser.EnumeratorContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#enumerator}.
	 * @param ctx the parse tree
	 */
	fun exitEnumerator(ctx: CPP14Parser.EnumeratorContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#namespacename}.
	 * @param ctx the parse tree
	 */
	fun enterNamespacename(ctx: CPP14Parser.NamespacenameContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#namespacename}.
	 * @param ctx the parse tree
	 */
	fun exitNamespacename(ctx: CPP14Parser.NamespacenameContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#originalnamespacename}.
	 * @param ctx the parse tree
	 */
	fun enterOriginalnamespacename(ctx: CPP14Parser.OriginalnamespacenameContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#originalnamespacename}.
	 * @param ctx the parse tree
	 */
	fun exitOriginalnamespacename(ctx: CPP14Parser.OriginalnamespacenameContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#namespacedefinition}.
	 * @param ctx the parse tree
	 */
	fun enterNamespacedefinition(ctx: CPP14Parser.NamespacedefinitionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#namespacedefinition}.
	 * @param ctx the parse tree
	 */
	fun exitNamespacedefinition(ctx: CPP14Parser.NamespacedefinitionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#namednamespacedefinition}.
	 * @param ctx the parse tree
	 */
	fun enterNamednamespacedefinition(ctx: CPP14Parser.NamednamespacedefinitionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#namednamespacedefinition}.
	 * @param ctx the parse tree
	 */
	fun exitNamednamespacedefinition(ctx: CPP14Parser.NamednamespacedefinitionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#originalnamespacedefinition}.
	 * @param ctx the parse tree
	 */
	fun enterOriginalnamespacedefinition(ctx: CPP14Parser.OriginalnamespacedefinitionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#originalnamespacedefinition}.
	 * @param ctx the parse tree
	 */
	fun exitOriginalnamespacedefinition(ctx: CPP14Parser.OriginalnamespacedefinitionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#extensionnamespacedefinition}.
	 * @param ctx the parse tree
	 */
	fun enterExtensionnamespacedefinition(ctx: CPP14Parser.ExtensionnamespacedefinitionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#extensionnamespacedefinition}.
	 * @param ctx the parse tree
	 */
	fun exitExtensionnamespacedefinition(ctx: CPP14Parser.ExtensionnamespacedefinitionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#unnamednamespacedefinition}.
	 * @param ctx the parse tree
	 */
	fun enterUnnamednamespacedefinition(ctx: CPP14Parser.UnnamednamespacedefinitionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#unnamednamespacedefinition}.
	 * @param ctx the parse tree
	 */
	fun exitUnnamednamespacedefinition(ctx: CPP14Parser.UnnamednamespacedefinitionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#namespacebody}.
	 * @param ctx the parse tree
	 */
	fun enterNamespacebody(ctx: CPP14Parser.NamespacebodyContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#namespacebody}.
	 * @param ctx the parse tree
	 */
	fun exitNamespacebody(ctx: CPP14Parser.NamespacebodyContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#namespacealias}.
	 * @param ctx the parse tree
	 */
	fun enterNamespacealias(ctx: CPP14Parser.NamespacealiasContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#namespacealias}.
	 * @param ctx the parse tree
	 */
	fun exitNamespacealias(ctx: CPP14Parser.NamespacealiasContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#namespacealiasdefinition}.
	 * @param ctx the parse tree
	 */
	fun enterNamespacealiasdefinition(ctx: CPP14Parser.NamespacealiasdefinitionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#namespacealiasdefinition}.
	 * @param ctx the parse tree
	 */
	fun exitNamespacealiasdefinition(ctx: CPP14Parser.NamespacealiasdefinitionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 */
	fun enterQualifiednamespacespecifier(ctx: CPP14Parser.QualifiednamespacespecifierContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 */
	fun exitQualifiednamespacespecifier(ctx: CPP14Parser.QualifiednamespacespecifierContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#usingdeclaration}.
	 * @param ctx the parse tree
	 */
	fun enterUsingdeclaration(ctx: CPP14Parser.UsingdeclarationContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#usingdeclaration}.
	 * @param ctx the parse tree
	 */
	fun exitUsingdeclaration(ctx: CPP14Parser.UsingdeclarationContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#usingdirective}.
	 * @param ctx the parse tree
	 */
	fun enterUsingdirective(ctx: CPP14Parser.UsingdirectiveContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#usingdirective}.
	 * @param ctx the parse tree
	 */
	fun exitUsingdirective(ctx: CPP14Parser.UsingdirectiveContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#asmdefinition}.
	 * @param ctx the parse tree
	 */
	fun enterAsmdefinition(ctx: CPP14Parser.AsmdefinitionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#asmdefinition}.
	 * @param ctx the parse tree
	 */
	fun exitAsmdefinition(ctx: CPP14Parser.AsmdefinitionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#linkagespecification}.
	 * @param ctx the parse tree
	 */
	fun enterLinkagespecification(ctx: CPP14Parser.LinkagespecificationContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#linkagespecification}.
	 * @param ctx the parse tree
	 */
	fun exitLinkagespecification(ctx: CPP14Parser.LinkagespecificationContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#attributespecifierseq}.
	 * @param ctx the parse tree
	 */
	fun enterAttributespecifierseq(ctx: CPP14Parser.AttributespecifierseqContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#attributespecifierseq}.
	 * @param ctx the parse tree
	 */
	fun exitAttributespecifierseq(ctx: CPP14Parser.AttributespecifierseqContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#attributespecifier}.
	 * @param ctx the parse tree
	 */
	fun enterAttributespecifier(ctx: CPP14Parser.AttributespecifierContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#attributespecifier}.
	 * @param ctx the parse tree
	 */
	fun exitAttributespecifier(ctx: CPP14Parser.AttributespecifierContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#alignmentspecifier}.
	 * @param ctx the parse tree
	 */
	fun enterAlignmentspecifier(ctx: CPP14Parser.AlignmentspecifierContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#alignmentspecifier}.
	 * @param ctx the parse tree
	 */
	fun exitAlignmentspecifier(ctx: CPP14Parser.AlignmentspecifierContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#attributelist}.
	 * @param ctx the parse tree
	 */
	fun enterAttributelist(ctx: CPP14Parser.AttributelistContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#attributelist}.
	 * @param ctx the parse tree
	 */
	fun exitAttributelist(ctx: CPP14Parser.AttributelistContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#attribute}.
	 * @param ctx the parse tree
	 */
	fun enterAttribute(ctx: CPP14Parser.AttributeContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#attribute}.
	 * @param ctx the parse tree
	 */
	fun exitAttribute(ctx: CPP14Parser.AttributeContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#attributetoken}.
	 * @param ctx the parse tree
	 */
	fun enterAttributetoken(ctx: CPP14Parser.AttributetokenContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#attributetoken}.
	 * @param ctx the parse tree
	 */
	fun exitAttributetoken(ctx: CPP14Parser.AttributetokenContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#attributescopedtoken}.
	 * @param ctx the parse tree
	 */
	fun enterAttributescopedtoken(ctx: CPP14Parser.AttributescopedtokenContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#attributescopedtoken}.
	 * @param ctx the parse tree
	 */
	fun exitAttributescopedtoken(ctx: CPP14Parser.AttributescopedtokenContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#attributenamespace}.
	 * @param ctx the parse tree
	 */
	fun enterAttributenamespace(ctx: CPP14Parser.AttributenamespaceContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#attributenamespace}.
	 * @param ctx the parse tree
	 */
	fun exitAttributenamespace(ctx: CPP14Parser.AttributenamespaceContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#attributeargumentclause}.
	 * @param ctx the parse tree
	 */
	fun enterAttributeargumentclause(ctx: CPP14Parser.AttributeargumentclauseContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#attributeargumentclause}.
	 * @param ctx the parse tree
	 */
	fun exitAttributeargumentclause(ctx: CPP14Parser.AttributeargumentclauseContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#balancedtokenseq}.
	 * @param ctx the parse tree
	 */
	fun enterBalancedtokenseq(ctx: CPP14Parser.BalancedtokenseqContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#balancedtokenseq}.
	 * @param ctx the parse tree
	 */
	fun exitBalancedtokenseq(ctx: CPP14Parser.BalancedtokenseqContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#balancedtoken}.
	 * @param ctx the parse tree
	 */
	fun enterBalancedtoken(ctx: CPP14Parser.BalancedtokenContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#balancedtoken}.
	 * @param ctx the parse tree
	 */
	fun exitBalancedtoken(ctx: CPP14Parser.BalancedtokenContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#initdeclaratorlist}.
	 * @param ctx the parse tree
	 */
	fun enterInitdeclaratorlist(ctx: CPP14Parser.InitdeclaratorlistContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#initdeclaratorlist}.
	 * @param ctx the parse tree
	 */
	fun exitInitdeclaratorlist(ctx: CPP14Parser.InitdeclaratorlistContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#initdeclarator}.
	 * @param ctx the parse tree
	 */
	fun enterInitdeclarator(ctx: CPP14Parser.InitdeclaratorContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#initdeclarator}.
	 * @param ctx the parse tree
	 */
	fun exitInitdeclarator(ctx: CPP14Parser.InitdeclaratorContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#declarator}.
	 * @param ctx the parse tree
	 */
	fun enterDeclarator(ctx: CPP14Parser.DeclaratorContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#declarator}.
	 * @param ctx the parse tree
	 */
	fun exitDeclarator(ctx: CPP14Parser.DeclaratorContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#ptrdeclarator}.
	 * @param ctx the parse tree
	 */
	fun enterPtrdeclarator(ctx: CPP14Parser.PtrdeclaratorContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#ptrdeclarator}.
	 * @param ctx the parse tree
	 */
	fun exitPtrdeclarator(ctx: CPP14Parser.PtrdeclaratorContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#noptrdeclarator}.
	 * @param ctx the parse tree
	 */
	fun enterNoptrdeclarator(ctx: CPP14Parser.NoptrdeclaratorContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#noptrdeclarator}.
	 * @param ctx the parse tree
	 */
	fun exitNoptrdeclarator(ctx: CPP14Parser.NoptrdeclaratorContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#parametersandqualifiers}.
	 * @param ctx the parse tree
	 */
	fun enterParametersandqualifiers(ctx: CPP14Parser.ParametersandqualifiersContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#parametersandqualifiers}.
	 * @param ctx the parse tree
	 */
	fun exitParametersandqualifiers(ctx: CPP14Parser.ParametersandqualifiersContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#trailingreturntype}.
	 * @param ctx the parse tree
	 */
	fun enterTrailingreturntype(ctx: CPP14Parser.TrailingreturntypeContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#trailingreturntype}.
	 * @param ctx the parse tree
	 */
	fun exitTrailingreturntype(ctx: CPP14Parser.TrailingreturntypeContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#ptroperator}.
	 * @param ctx the parse tree
	 */
	fun enterPtroperator(ctx: CPP14Parser.PtroperatorContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#ptroperator}.
	 * @param ctx the parse tree
	 */
	fun exitPtroperator(ctx: CPP14Parser.PtroperatorContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#cvqualifierseq}.
	 * @param ctx the parse tree
	 */
	fun enterCvqualifierseq(ctx: CPP14Parser.CvqualifierseqContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#cvqualifierseq}.
	 * @param ctx the parse tree
	 */
	fun exitCvqualifierseq(ctx: CPP14Parser.CvqualifierseqContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#cvqualifier}.
	 * @param ctx the parse tree
	 */
	fun enterCvqualifier(ctx: CPP14Parser.CvqualifierContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#cvqualifier}.
	 * @param ctx the parse tree
	 */
	fun exitCvqualifier(ctx: CPP14Parser.CvqualifierContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#refqualifier}.
	 * @param ctx the parse tree
	 */
	fun enterRefqualifier(ctx: CPP14Parser.RefqualifierContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#refqualifier}.
	 * @param ctx the parse tree
	 */
	fun exitRefqualifier(ctx: CPP14Parser.RefqualifierContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#declaratorid}.
	 * @param ctx the parse tree
	 */
	fun enterDeclaratorid(ctx: CPP14Parser.DeclaratoridContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#declaratorid}.
	 * @param ctx the parse tree
	 */
	fun exitDeclaratorid(ctx: CPP14Parser.DeclaratoridContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#thetypeid}.
	 * @param ctx the parse tree
	 */
	fun enterThetypeid(ctx: CPP14Parser.ThetypeidContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#thetypeid}.
	 * @param ctx the parse tree
	 */
	fun exitThetypeid(ctx: CPP14Parser.ThetypeidContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#abstractdeclarator}.
	 * @param ctx the parse tree
	 */
	fun enterAbstractdeclarator(ctx: CPP14Parser.AbstractdeclaratorContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#abstractdeclarator}.
	 * @param ctx the parse tree
	 */
	fun exitAbstractdeclarator(ctx: CPP14Parser.AbstractdeclaratorContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#ptrabstractdeclarator}.
	 * @param ctx the parse tree
	 */
	fun enterPtrabstractdeclarator(ctx: CPP14Parser.PtrabstractdeclaratorContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#ptrabstractdeclarator}.
	 * @param ctx the parse tree
	 */
	fun exitPtrabstractdeclarator(ctx: CPP14Parser.PtrabstractdeclaratorContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#noptrabstractdeclarator}.
	 * @param ctx the parse tree
	 */
	fun enterNoptrabstractdeclarator(ctx: CPP14Parser.NoptrabstractdeclaratorContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#noptrabstractdeclarator}.
	 * @param ctx the parse tree
	 */
	fun exitNoptrabstractdeclarator(ctx: CPP14Parser.NoptrabstractdeclaratorContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#abstractpackdeclarator}.
	 * @param ctx the parse tree
	 */
	fun enterAbstractpackdeclarator(ctx: CPP14Parser.AbstractpackdeclaratorContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#abstractpackdeclarator}.
	 * @param ctx the parse tree
	 */
	fun exitAbstractpackdeclarator(ctx: CPP14Parser.AbstractpackdeclaratorContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#noptrabstractpackdeclarator}.
	 * @param ctx the parse tree
	 */
	fun enterNoptrabstractpackdeclarator(ctx: CPP14Parser.NoptrabstractpackdeclaratorContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#noptrabstractpackdeclarator}.
	 * @param ctx the parse tree
	 */
	fun exitNoptrabstractpackdeclarator(ctx: CPP14Parser.NoptrabstractpackdeclaratorContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#parameterdeclarationclause}.
	 * @param ctx the parse tree
	 */
	fun enterParameterdeclarationclause(ctx: CPP14Parser.ParameterdeclarationclauseContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#parameterdeclarationclause}.
	 * @param ctx the parse tree
	 */
	fun exitParameterdeclarationclause(ctx: CPP14Parser.ParameterdeclarationclauseContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#parameterdeclarationlist}.
	 * @param ctx the parse tree
	 */
	fun enterParameterdeclarationlist(ctx: CPP14Parser.ParameterdeclarationlistContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#parameterdeclarationlist}.
	 * @param ctx the parse tree
	 */
	fun exitParameterdeclarationlist(ctx: CPP14Parser.ParameterdeclarationlistContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#parameterdeclaration}.
	 * @param ctx the parse tree
	 */
	fun enterParameterdeclaration(ctx: CPP14Parser.ParameterdeclarationContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#parameterdeclaration}.
	 * @param ctx the parse tree
	 */
	fun exitParameterdeclaration(ctx: CPP14Parser.ParameterdeclarationContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#functiondefinition}.
	 * @param ctx the parse tree
	 */
	fun enterFunctiondefinition(ctx: CPP14Parser.FunctiondefinitionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#functiondefinition}.
	 * @param ctx the parse tree
	 */
	fun exitFunctiondefinition(ctx: CPP14Parser.FunctiondefinitionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#functionbody}.
	 * @param ctx the parse tree
	 */
	fun enterFunctionbody(ctx: CPP14Parser.FunctionbodyContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#functionbody}.
	 * @param ctx the parse tree
	 */
	fun exitFunctionbody(ctx: CPP14Parser.FunctionbodyContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#initializer}.
	 * @param ctx the parse tree
	 */
	fun enterInitializer(ctx: CPP14Parser.InitializerContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#initializer}.
	 * @param ctx the parse tree
	 */
	fun exitInitializer(ctx: CPP14Parser.InitializerContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#braceorequalinitializer}.
	 * @param ctx the parse tree
	 */
	fun enterBraceorequalinitializer(ctx: CPP14Parser.BraceorequalinitializerContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#braceorequalinitializer}.
	 * @param ctx the parse tree
	 */
	fun exitBraceorequalinitializer(ctx: CPP14Parser.BraceorequalinitializerContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#initializerclause}.
	 * @param ctx the parse tree
	 */
	fun enterInitializerclause(ctx: CPP14Parser.InitializerclauseContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#initializerclause}.
	 * @param ctx the parse tree
	 */
	fun exitInitializerclause(ctx: CPP14Parser.InitializerclauseContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#initializerlist}.
	 * @param ctx the parse tree
	 */
	fun enterInitializerlist(ctx: CPP14Parser.InitializerlistContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#initializerlist}.
	 * @param ctx the parse tree
	 */
	fun exitInitializerlist(ctx: CPP14Parser.InitializerlistContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#bracedinitlist}.
	 * @param ctx the parse tree
	 */
	fun enterBracedinitlist(ctx: CPP14Parser.BracedinitlistContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#bracedinitlist}.
	 * @param ctx the parse tree
	 */
	fun exitBracedinitlist(ctx: CPP14Parser.BracedinitlistContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#classname}.
	 * @param ctx the parse tree
	 */
	fun enterClassname(ctx: CPP14Parser.ClassnameContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#classname}.
	 * @param ctx the parse tree
	 */
	fun exitClassname(ctx: CPP14Parser.ClassnameContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#classspecifier}.
	 * @param ctx the parse tree
	 */
	fun enterClassspecifier(ctx: CPP14Parser.ClassspecifierContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#classspecifier}.
	 * @param ctx the parse tree
	 */
	fun exitClassspecifier(ctx: CPP14Parser.ClassspecifierContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#classhead}.
	 * @param ctx the parse tree
	 */
	fun enterClasshead(ctx: CPP14Parser.ClassheadContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#classhead}.
	 * @param ctx the parse tree
	 */
	fun exitClasshead(ctx: CPP14Parser.ClassheadContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#classheadname}.
	 * @param ctx the parse tree
	 */
	fun enterClassheadname(ctx: CPP14Parser.ClassheadnameContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#classheadname}.
	 * @param ctx the parse tree
	 */
	fun exitClassheadname(ctx: CPP14Parser.ClassheadnameContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#classvirtspecifier}.
	 * @param ctx the parse tree
	 */
	fun enterClassvirtspecifier(ctx: CPP14Parser.ClassvirtspecifierContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#classvirtspecifier}.
	 * @param ctx the parse tree
	 */
	fun exitClassvirtspecifier(ctx: CPP14Parser.ClassvirtspecifierContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#classkey}.
	 * @param ctx the parse tree
	 */
	fun enterClasskey(ctx: CPP14Parser.ClasskeyContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#classkey}.
	 * @param ctx the parse tree
	 */
	fun exitClasskey(ctx: CPP14Parser.ClasskeyContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#memberspecification}.
	 * @param ctx the parse tree
	 */
	fun enterMemberspecification(ctx: CPP14Parser.MemberspecificationContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#memberspecification}.
	 * @param ctx the parse tree
	 */
	fun exitMemberspecification(ctx: CPP14Parser.MemberspecificationContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#memberdeclaration}.
	 * @param ctx the parse tree
	 */
	fun enterMemberdeclaration(ctx: CPP14Parser.MemberdeclarationContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#memberdeclaration}.
	 * @param ctx the parse tree
	 */
	fun exitMemberdeclaration(ctx: CPP14Parser.MemberdeclarationContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#memberdeclaratorlist}.
	 * @param ctx the parse tree
	 */
	fun enterMemberdeclaratorlist(ctx: CPP14Parser.MemberdeclaratorlistContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#memberdeclaratorlist}.
	 * @param ctx the parse tree
	 */
	fun exitMemberdeclaratorlist(ctx: CPP14Parser.MemberdeclaratorlistContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#memberdeclarator}.
	 * @param ctx the parse tree
	 */
	fun enterMemberdeclarator(ctx: CPP14Parser.MemberdeclaratorContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#memberdeclarator}.
	 * @param ctx the parse tree
	 */
	fun exitMemberdeclarator(ctx: CPP14Parser.MemberdeclaratorContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#virtspecifierseq}.
	 * @param ctx the parse tree
	 */
	fun enterVirtspecifierseq(ctx: CPP14Parser.VirtspecifierseqContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#virtspecifierseq}.
	 * @param ctx the parse tree
	 */
	fun exitVirtspecifierseq(ctx: CPP14Parser.VirtspecifierseqContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#virtspecifier}.
	 * @param ctx the parse tree
	 */
	fun enterVirtspecifier(ctx: CPP14Parser.VirtspecifierContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#virtspecifier}.
	 * @param ctx the parse tree
	 */
	fun exitVirtspecifier(ctx: CPP14Parser.VirtspecifierContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#purespecifier}.
	 * @param ctx the parse tree
	 */
	fun enterPurespecifier(ctx: CPP14Parser.PurespecifierContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#purespecifier}.
	 * @param ctx the parse tree
	 */
	fun exitPurespecifier(ctx: CPP14Parser.PurespecifierContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#baseclause}.
	 * @param ctx the parse tree
	 */
	fun enterBaseclause(ctx: CPP14Parser.BaseclauseContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#baseclause}.
	 * @param ctx the parse tree
	 */
	fun exitBaseclause(ctx: CPP14Parser.BaseclauseContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#basespecifierlist}.
	 * @param ctx the parse tree
	 */
	fun enterBasespecifierlist(ctx: CPP14Parser.BasespecifierlistContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#basespecifierlist}.
	 * @param ctx the parse tree
	 */
	fun exitBasespecifierlist(ctx: CPP14Parser.BasespecifierlistContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#basespecifier}.
	 * @param ctx the parse tree
	 */
	fun enterBasespecifier(ctx: CPP14Parser.BasespecifierContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#basespecifier}.
	 * @param ctx the parse tree
	 */
	fun exitBasespecifier(ctx: CPP14Parser.BasespecifierContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#classordecltype}.
	 * @param ctx the parse tree
	 */
	fun enterClassordecltype(ctx: CPP14Parser.ClassordecltypeContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#classordecltype}.
	 * @param ctx the parse tree
	 */
	fun exitClassordecltype(ctx: CPP14Parser.ClassordecltypeContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#basetypespecifier}.
	 * @param ctx the parse tree
	 */
	fun enterBasetypespecifier(ctx: CPP14Parser.BasetypespecifierContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#basetypespecifier}.
	 * @param ctx the parse tree
	 */
	fun exitBasetypespecifier(ctx: CPP14Parser.BasetypespecifierContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#accessspecifier}.
	 * @param ctx the parse tree
	 */
	fun enterAccessspecifier(ctx: CPP14Parser.AccessspecifierContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#accessspecifier}.
	 * @param ctx the parse tree
	 */
	fun exitAccessspecifier(ctx: CPP14Parser.AccessspecifierContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#conversionfunctionid}.
	 * @param ctx the parse tree
	 */
	fun enterConversionfunctionid(ctx: CPP14Parser.ConversionfunctionidContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#conversionfunctionid}.
	 * @param ctx the parse tree
	 */
	fun exitConversionfunctionid(ctx: CPP14Parser.ConversionfunctionidContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#conversiontypeid}.
	 * @param ctx the parse tree
	 */
	fun enterConversiontypeid(ctx: CPP14Parser.ConversiontypeidContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#conversiontypeid}.
	 * @param ctx the parse tree
	 */
	fun exitConversiontypeid(ctx: CPP14Parser.ConversiontypeidContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#conversiondeclarator}.
	 * @param ctx the parse tree
	 */
	fun enterConversiondeclarator(ctx: CPP14Parser.ConversiondeclaratorContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#conversiondeclarator}.
	 * @param ctx the parse tree
	 */
	fun exitConversiondeclarator(ctx: CPP14Parser.ConversiondeclaratorContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#ctorinitializer}.
	 * @param ctx the parse tree
	 */
	fun enterCtorinitializer(ctx: CPP14Parser.CtorinitializerContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#ctorinitializer}.
	 * @param ctx the parse tree
	 */
	fun exitCtorinitializer(ctx: CPP14Parser.CtorinitializerContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#meminitializerlist}.
	 * @param ctx the parse tree
	 */
	fun enterMeminitializerlist(ctx: CPP14Parser.MeminitializerlistContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#meminitializerlist}.
	 * @param ctx the parse tree
	 */
	fun exitMeminitializerlist(ctx: CPP14Parser.MeminitializerlistContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#meminitializer}.
	 * @param ctx the parse tree
	 */
	fun enterMeminitializer(ctx: CPP14Parser.MeminitializerContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#meminitializer}.
	 * @param ctx the parse tree
	 */
	fun exitMeminitializer(ctx: CPP14Parser.MeminitializerContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#meminitializerid}.
	 * @param ctx the parse tree
	 */
	fun enterMeminitializerid(ctx: CPP14Parser.MeminitializeridContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#meminitializerid}.
	 * @param ctx the parse tree
	 */
	fun exitMeminitializerid(ctx: CPP14Parser.MeminitializeridContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#operatorfunctionid}.
	 * @param ctx the parse tree
	 */
	fun enterOperatorfunctionid(ctx: CPP14Parser.OperatorfunctionidContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#operatorfunctionid}.
	 * @param ctx the parse tree
	 */
	fun exitOperatorfunctionid(ctx: CPP14Parser.OperatorfunctionidContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#literaloperatorid}.
	 * @param ctx the parse tree
	 */
	fun enterLiteraloperatorid(ctx: CPP14Parser.LiteraloperatoridContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#literaloperatorid}.
	 * @param ctx the parse tree
	 */
	fun exitLiteraloperatorid(ctx: CPP14Parser.LiteraloperatoridContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#templatedeclaration}.
	 * @param ctx the parse tree
	 */
	fun enterTemplatedeclaration(ctx: CPP14Parser.TemplatedeclarationContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#templatedeclaration}.
	 * @param ctx the parse tree
	 */
	fun exitTemplatedeclaration(ctx: CPP14Parser.TemplatedeclarationContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#templateparameterlist}.
	 * @param ctx the parse tree
	 */
	fun enterTemplateparameterlist(ctx: CPP14Parser.TemplateparameterlistContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#templateparameterlist}.
	 * @param ctx the parse tree
	 */
	fun exitTemplateparameterlist(ctx: CPP14Parser.TemplateparameterlistContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#templateparameter}.
	 * @param ctx the parse tree
	 */
	fun enterTemplateparameter(ctx: CPP14Parser.TemplateparameterContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#templateparameter}.
	 * @param ctx the parse tree
	 */
	fun exitTemplateparameter(ctx: CPP14Parser.TemplateparameterContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#typeparameter}.
	 * @param ctx the parse tree
	 */
	fun enterTypeparameter(ctx: CPP14Parser.TypeparameterContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#typeparameter}.
	 * @param ctx the parse tree
	 */
	fun exitTypeparameter(ctx: CPP14Parser.TypeparameterContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#simpletemplateid}.
	 * @param ctx the parse tree
	 */
	fun enterSimpletemplateid(ctx: CPP14Parser.SimpletemplateidContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#simpletemplateid}.
	 * @param ctx the parse tree
	 */
	fun exitSimpletemplateid(ctx: CPP14Parser.SimpletemplateidContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#templateid}.
	 * @param ctx the parse tree
	 */
	fun enterTemplateid(ctx: CPP14Parser.TemplateidContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#templateid}.
	 * @param ctx the parse tree
	 */
	fun exitTemplateid(ctx: CPP14Parser.TemplateidContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#templatename}.
	 * @param ctx the parse tree
	 */
	fun enterTemplatename(ctx: CPP14Parser.TemplatenameContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#templatename}.
	 * @param ctx the parse tree
	 */
	fun exitTemplatename(ctx: CPP14Parser.TemplatenameContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#templateargumentlist}.
	 * @param ctx the parse tree
	 */
	fun enterTemplateargumentlist(ctx: CPP14Parser.TemplateargumentlistContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#templateargumentlist}.
	 * @param ctx the parse tree
	 */
	fun exitTemplateargumentlist(ctx: CPP14Parser.TemplateargumentlistContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#templateargument}.
	 * @param ctx the parse tree
	 */
	fun enterTemplateargument(ctx: CPP14Parser.TemplateargumentContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#templateargument}.
	 * @param ctx the parse tree
	 */
	fun exitTemplateargument(ctx: CPP14Parser.TemplateargumentContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#typenamespecifier}.
	 * @param ctx the parse tree
	 */
	fun enterTypenamespecifier(ctx: CPP14Parser.TypenamespecifierContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#typenamespecifier}.
	 * @param ctx the parse tree
	 */
	fun exitTypenamespecifier(ctx: CPP14Parser.TypenamespecifierContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#explicitinstantiation}.
	 * @param ctx the parse tree
	 */
	fun enterExplicitinstantiation(ctx: CPP14Parser.ExplicitinstantiationContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#explicitinstantiation}.
	 * @param ctx the parse tree
	 */
	fun exitExplicitinstantiation(ctx: CPP14Parser.ExplicitinstantiationContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#explicitspecialization}.
	 * @param ctx the parse tree
	 */
	fun enterExplicitspecialization(ctx: CPP14Parser.ExplicitspecializationContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#explicitspecialization}.
	 * @param ctx the parse tree
	 */
	fun exitExplicitspecialization(ctx: CPP14Parser.ExplicitspecializationContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#tryblock}.
	 * @param ctx the parse tree
	 */
	fun enterTryblock(ctx: CPP14Parser.TryblockContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#tryblock}.
	 * @param ctx the parse tree
	 */
	fun exitTryblock(ctx: CPP14Parser.TryblockContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#functiontryblock}.
	 * @param ctx the parse tree
	 */
	fun enterFunctiontryblock(ctx: CPP14Parser.FunctiontryblockContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#functiontryblock}.
	 * @param ctx the parse tree
	 */
	fun exitFunctiontryblock(ctx: CPP14Parser.FunctiontryblockContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#handlerseq}.
	 * @param ctx the parse tree
	 */
	fun enterHandlerseq(ctx: CPP14Parser.HandlerseqContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#handlerseq}.
	 * @param ctx the parse tree
	 */
	fun exitHandlerseq(ctx: CPP14Parser.HandlerseqContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#handler}.
	 * @param ctx the parse tree
	 */
	fun enterHandler(ctx: CPP14Parser.HandlerContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#handler}.
	 * @param ctx the parse tree
	 */
	fun exitHandler(ctx: CPP14Parser.HandlerContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#exceptiondeclaration}.
	 * @param ctx the parse tree
	 */
	fun enterExceptiondeclaration(ctx: CPP14Parser.ExceptiondeclarationContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#exceptiondeclaration}.
	 * @param ctx the parse tree
	 */
	fun exitExceptiondeclaration(ctx: CPP14Parser.ExceptiondeclarationContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#throwexpression}.
	 * @param ctx the parse tree
	 */
	fun enterThrowexpression(ctx: CPP14Parser.ThrowexpressionContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#throwexpression}.
	 * @param ctx the parse tree
	 */
	fun exitThrowexpression(ctx: CPP14Parser.ThrowexpressionContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#exceptionspecification}.
	 * @param ctx the parse tree
	 */
	fun enterExceptionspecification(ctx: CPP14Parser.ExceptionspecificationContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#exceptionspecification}.
	 * @param ctx the parse tree
	 */
	fun exitExceptionspecification(ctx: CPP14Parser.ExceptionspecificationContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#dynamicexceptionspecification}.
	 * @param ctx the parse tree
	 */
	fun enterDynamicexceptionspecification(ctx: CPP14Parser.DynamicexceptionspecificationContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#dynamicexceptionspecification}.
	 * @param ctx the parse tree
	 */
	fun exitDynamicexceptionspecification(ctx: CPP14Parser.DynamicexceptionspecificationContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#typeidlist}.
	 * @param ctx the parse tree
	 */
	fun enterTypeidlist(ctx: CPP14Parser.TypeidlistContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#typeidlist}.
	 * @param ctx the parse tree
	 */
	fun exitTypeidlist(ctx: CPP14Parser.TypeidlistContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#noexceptspecification}.
	 * @param ctx the parse tree
	 */
	fun enterNoexceptspecification(ctx: CPP14Parser.NoexceptspecificationContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#noexceptspecification}.
	 * @param ctx the parse tree
	 */
	fun exitNoexceptspecification(ctx: CPP14Parser.NoexceptspecificationContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#rightShift}.
	 * @param ctx the parse tree
	 */
	fun enterRightShift(ctx: CPP14Parser.RightShiftContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#rightShift}.
	 * @param ctx the parse tree
	 */
	fun exitRightShift(ctx: CPP14Parser.RightShiftContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#rightShiftAssign}.
	 * @param ctx the parse tree
	 */
	fun enterRightShiftAssign(ctx: CPP14Parser.RightShiftAssignContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#rightShiftAssign}.
	 * @param ctx the parse tree
	 */
	fun exitRightShiftAssign(ctx: CPP14Parser.RightShiftAssignContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#theoperator}.
	 * @param ctx the parse tree
	 */
	fun enterTheoperator(ctx: CPP14Parser.TheoperatorContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#theoperator}.
	 * @param ctx the parse tree
	 */
	fun exitTheoperator(ctx: CPP14Parser.TheoperatorContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#literal}.
	 * @param ctx the parse tree
	 */
	fun enterLiteral(ctx: CPP14Parser.LiteralContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#literal}.
	 * @param ctx the parse tree
	 */
	fun exitLiteral(ctx: CPP14Parser.LiteralContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#booleanliteral}.
	 * @param ctx the parse tree
	 */
	fun enterBooleanliteral(ctx: CPP14Parser.BooleanliteralContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#booleanliteral}.
	 * @param ctx the parse tree
	 */
	fun exitBooleanliteral(ctx: CPP14Parser.BooleanliteralContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#pointerliteral}.
	 * @param ctx the parse tree
	 */
	fun enterPointerliteral(ctx: CPP14Parser.PointerliteralContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#pointerliteral}.
	 * @param ctx the parse tree
	 */
	fun exitPointerliteral(ctx: CPP14Parser.PointerliteralContext)
	/**
	 * Enter a parse tree produced by {@link CPP14Parser#userdefinedliteral}.
	 * @param ctx the parse tree
	 */
	fun enterUserdefinedliteral(ctx: CPP14Parser.UserdefinedliteralContext)
	/**
	 * Exit a parse tree produced by {@link CPP14Parser#userdefinedliteral}.
	 * @param ctx the parse tree
	 */
	fun exitUserdefinedliteral(ctx: CPP14Parser.UserdefinedliteralContext)
}