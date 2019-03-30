// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ECMAScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
interface ECMAScriptVisitor<T> : ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitProgram(ctx : ECMAScriptParser.ProgramContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#sourceElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSourceElements(ctx : ECMAScriptParser.SourceElementsContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#sourceElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSourceElement(ctx : ECMAScriptParser.SourceElementContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStatement(ctx : ECMAScriptParser.StatementContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBlock(ctx : ECMAScriptParser.BlockContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStatementList(ctx : ECMAScriptParser.StatementListContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#variableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitVariableStatement(ctx : ECMAScriptParser.VariableStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitVariableDeclarationList(ctx : ECMAScriptParser.VariableDeclarationListContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitVariableDeclaration(ctx : ECMAScriptParser.VariableDeclarationContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#initialiser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInitialiser(ctx : ECMAScriptParser.InitialiserContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEmptyStatement(ctx : ECMAScriptParser.EmptyStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExpressionStatement(ctx : ECMAScriptParser.ExpressionStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIfStatement(ctx : ECMAScriptParser.IfStatementContext) : T
	/**
	 * Visit a parse tree produced by the {@code DoStatement}
	 * labeled alternative in {@link ECMAScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDoStatement(ctx : ECMAScriptParser.DoStatementContext) : T
	/**
	 * Visit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link ECMAScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitWhileStatement(ctx : ECMAScriptParser.WhileStatementContext) : T
	/**
	 * Visit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link ECMAScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitForStatement(ctx : ECMAScriptParser.ForStatementContext) : T
	/**
	 * Visit a parse tree produced by the {@code ForVarStatement}
	 * labeled alternative in {@link ECMAScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitForVarStatement(ctx : ECMAScriptParser.ForVarStatementContext) : T
	/**
	 * Visit a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link ECMAScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitForInStatement(ctx : ECMAScriptParser.ForInStatementContext) : T
	/**
	 * Visit a parse tree produced by the {@code ForVarInStatement}
	 * labeled alternative in {@link ECMAScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitForVarInStatement(ctx : ECMAScriptParser.ForVarInStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitContinueStatement(ctx : ECMAScriptParser.ContinueStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBreakStatement(ctx : ECMAScriptParser.BreakStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReturnStatement(ctx : ECMAScriptParser.ReturnStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#withStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitWithStatement(ctx : ECMAScriptParser.WithStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSwitchStatement(ctx : ECMAScriptParser.SwitchStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#caseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCaseBlock(ctx : ECMAScriptParser.CaseBlockContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#caseClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCaseClauses(ctx : ECMAScriptParser.CaseClausesContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#caseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCaseClause(ctx : ECMAScriptParser.CaseClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#defaultClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDefaultClause(ctx : ECMAScriptParser.DefaultClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#labelledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLabelledStatement(ctx : ECMAScriptParser.LabelledStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitThrowStatement(ctx : ECMAScriptParser.ThrowStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTryStatement(ctx : ECMAScriptParser.TryStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#catchProduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCatchProduction(ctx : ECMAScriptParser.CatchProductionContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#finallyProduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFinallyProduction(ctx : ECMAScriptParser.FinallyProductionContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#debuggerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDebuggerStatement(ctx : ECMAScriptParser.DebuggerStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFunctionDeclaration(ctx : ECMAScriptParser.FunctionDeclarationContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFormalParameterList(ctx : ECMAScriptParser.FormalParameterListContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFunctionBody(ctx : ECMAScriptParser.FunctionBodyContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitArrayLiteral(ctx : ECMAScriptParser.ArrayLiteralContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#elementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitElementList(ctx : ECMAScriptParser.ElementListContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#elision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitElision(ctx : ECMAScriptParser.ElisionContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitObjectLiteral(ctx : ECMAScriptParser.ObjectLiteralContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#propertyNameAndValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPropertyNameAndValueList(ctx : ECMAScriptParser.PropertyNameAndValueListContext) : T
	/**
	 * Visit a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link ECMAScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPropertyExpressionAssignment(ctx : ECMAScriptParser.PropertyExpressionAssignmentContext) : T
	/**
	 * Visit a parse tree produced by the {@code PropertyGetter}
	 * labeled alternative in {@link ECMAScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPropertyGetter(ctx : ECMAScriptParser.PropertyGetterContext) : T
	/**
	 * Visit a parse tree produced by the {@code PropertySetter}
	 * labeled alternative in {@link ECMAScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPropertySetter(ctx : ECMAScriptParser.PropertySetterContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#propertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPropertyName(ctx : ECMAScriptParser.PropertyNameContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#propertySetParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPropertySetParameterList(ctx : ECMAScriptParser.PropertySetParameterListContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitArguments(ctx : ECMAScriptParser.ArgumentsContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitArgumentList(ctx : ECMAScriptParser.ArgumentListContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#expressionSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExpressionSequence(ctx : ECMAScriptParser.ExpressionSequenceContext) : T
	/**
	 * Visit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTernaryExpression(ctx : ECMAScriptParser.TernaryExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLogicalAndExpression(ctx : ECMAScriptParser.LogicalAndExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPreIncrementExpression(ctx : ECMAScriptParser.PreIncrementExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitObjectLiteralExpression(ctx : ECMAScriptParser.ObjectLiteralExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInExpression(ctx : ECMAScriptParser.InExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLogicalOrExpression(ctx : ECMAScriptParser.LogicalOrExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNotExpression(ctx : ECMAScriptParser.NotExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPreDecreaseExpression(ctx : ECMAScriptParser.PreDecreaseExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitArgumentsExpression(ctx : ECMAScriptParser.ArgumentsExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitThisExpression(ctx : ECMAScriptParser.ThisExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFunctionExpression(ctx : ECMAScriptParser.FunctionExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnaryMinusExpression(ctx : ECMAScriptParser.UnaryMinusExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAssignmentExpression(ctx : ECMAScriptParser.AssignmentExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPostDecreaseExpression(ctx : ECMAScriptParser.PostDecreaseExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code TypeofExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTypeofExpression(ctx : ECMAScriptParser.TypeofExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code InstanceofExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInstanceofExpression(ctx : ECMAScriptParser.InstanceofExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnaryPlusExpression(ctx : ECMAScriptParser.UnaryPlusExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code DeleteExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDeleteExpression(ctx : ECMAScriptParser.DeleteExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEqualityExpression(ctx : ECMAScriptParser.EqualityExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code BitXOrExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBitXOrExpression(ctx : ECMAScriptParser.BitXOrExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMultiplicativeExpression(ctx : ECMAScriptParser.MultiplicativeExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code BitShiftExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBitShiftExpression(ctx : ECMAScriptParser.BitShiftExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitParenthesizedExpression(ctx : ECMAScriptParser.ParenthesizedExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAdditiveExpression(ctx : ECMAScriptParser.AdditiveExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRelationalExpression(ctx : ECMAScriptParser.RelationalExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPostIncrementExpression(ctx : ECMAScriptParser.PostIncrementExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code BitNotExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBitNotExpression(ctx : ECMAScriptParser.BitNotExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNewExpression(ctx : ECMAScriptParser.NewExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLiteralExpression(ctx : ECMAScriptParser.LiteralExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitArrayLiteralExpression(ctx : ECMAScriptParser.ArrayLiteralExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMemberDotExpression(ctx : ECMAScriptParser.MemberDotExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMemberIndexExpression(ctx : ECMAScriptParser.MemberIndexExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIdentifierExpression(ctx : ECMAScriptParser.IdentifierExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code BitAndExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBitAndExpression(ctx : ECMAScriptParser.BitAndExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code BitOrExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBitOrExpression(ctx : ECMAScriptParser.BitOrExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code AssignmentOperatorExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAssignmentOperatorExpression(ctx : ECMAScriptParser.AssignmentOperatorExpressionContext) : T
	/**
	 * Visit a parse tree produced by the {@code VoidExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitVoidExpression(ctx : ECMAScriptParser.VoidExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAssignmentOperator(ctx : ECMAScriptParser.AssignmentOperatorContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLiteral(ctx : ECMAScriptParser.LiteralContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#numericLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNumericLiteral(ctx : ECMAScriptParser.NumericLiteralContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#identifierName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIdentifierName(ctx : ECMAScriptParser.IdentifierNameContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#reservedWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReservedWord(ctx : ECMAScriptParser.ReservedWordContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitKeyword(ctx : ECMAScriptParser.KeywordContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#futureReservedWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFutureReservedWord(ctx : ECMAScriptParser.FutureReservedWordContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#getter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGetter(ctx : ECMAScriptParser.GetterContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#setter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSetter(ctx : ECMAScriptParser.SetterContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEos(ctx : ECMAScriptParser.EosContext) : T
	/**
	 * Visit a parse tree produced by {@link ECMAScriptParser#eof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEof(ctx : ECMAScriptParser.EofContext) : T
}