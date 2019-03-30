// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ECMAScriptParser}.
 */
interface ECMAScriptListener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#program}.
	 * @param ctx the parse tree
	 */
	fun enterProgram(ctx: ECMAScriptParser.ProgramContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#program}.
	 * @param ctx the parse tree
	 */
	fun exitProgram(ctx: ECMAScriptParser.ProgramContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	fun enterSourceElements(ctx: ECMAScriptParser.SourceElementsContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	fun exitSourceElements(ctx: ECMAScriptParser.SourceElementsContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	fun enterSourceElement(ctx: ECMAScriptParser.SourceElementContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	fun exitSourceElement(ctx: ECMAScriptParser.SourceElementContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	fun enterStatement(ctx: ECMAScriptParser.StatementContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	fun exitStatement(ctx: ECMAScriptParser.StatementContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#block}.
	 * @param ctx the parse tree
	 */
	fun enterBlock(ctx: ECMAScriptParser.BlockContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#block}.
	 * @param ctx the parse tree
	 */
	fun exitBlock(ctx: ECMAScriptParser.BlockContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#statementList}.
	 * @param ctx the parse tree
	 */
	fun enterStatementList(ctx: ECMAScriptParser.StatementListContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#statementList}.
	 * @param ctx the parse tree
	 */
	fun exitStatementList(ctx: ECMAScriptParser.StatementListContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	fun enterVariableStatement(ctx: ECMAScriptParser.VariableStatementContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	fun exitVariableStatement(ctx: ECMAScriptParser.VariableStatementContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	fun enterVariableDeclarationList(ctx: ECMAScriptParser.VariableDeclarationListContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	fun exitVariableDeclarationList(ctx: ECMAScriptParser.VariableDeclarationListContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	fun enterVariableDeclaration(ctx: ECMAScriptParser.VariableDeclarationContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	fun exitVariableDeclaration(ctx: ECMAScriptParser.VariableDeclarationContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#initialiser}.
	 * @param ctx the parse tree
	 */
	fun enterInitialiser(ctx: ECMAScriptParser.InitialiserContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#initialiser}.
	 * @param ctx the parse tree
	 */
	fun exitInitialiser(ctx: ECMAScriptParser.InitialiserContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	fun enterEmptyStatement(ctx: ECMAScriptParser.EmptyStatementContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	fun exitEmptyStatement(ctx: ECMAScriptParser.EmptyStatementContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	fun enterExpressionStatement(ctx: ECMAScriptParser.ExpressionStatementContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	fun exitExpressionStatement(ctx: ECMAScriptParser.ExpressionStatementContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	fun enterIfStatement(ctx: ECMAScriptParser.IfStatementContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	fun exitIfStatement(ctx: ECMAScriptParser.IfStatementContext)
	/**
	 * Enter a parse tree produced by the {@code DoStatement}
	 * labeled alternative in {@link ECMAScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	fun enterDoStatement(ctx: ECMAScriptParser.DoStatementContext)
	/**
	 * Exit a parse tree produced by the {@code DoStatement}
	 * labeled alternative in {@link ECMAScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	fun exitDoStatement(ctx: ECMAScriptParser.DoStatementContext)
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link ECMAScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	fun enterWhileStatement(ctx: ECMAScriptParser.WhileStatementContext)
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link ECMAScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	fun exitWhileStatement(ctx: ECMAScriptParser.WhileStatementContext)
	/**
	 * Enter a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link ECMAScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	fun enterForStatement(ctx: ECMAScriptParser.ForStatementContext)
	/**
	 * Exit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link ECMAScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	fun exitForStatement(ctx: ECMAScriptParser.ForStatementContext)
	/**
	 * Enter a parse tree produced by the {@code ForVarStatement}
	 * labeled alternative in {@link ECMAScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	fun enterForVarStatement(ctx: ECMAScriptParser.ForVarStatementContext)
	/**
	 * Exit a parse tree produced by the {@code ForVarStatement}
	 * labeled alternative in {@link ECMAScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	fun exitForVarStatement(ctx: ECMAScriptParser.ForVarStatementContext)
	/**
	 * Enter a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link ECMAScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	fun enterForInStatement(ctx: ECMAScriptParser.ForInStatementContext)
	/**
	 * Exit a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link ECMAScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	fun exitForInStatement(ctx: ECMAScriptParser.ForInStatementContext)
	/**
	 * Enter a parse tree produced by the {@code ForVarInStatement}
	 * labeled alternative in {@link ECMAScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	fun enterForVarInStatement(ctx: ECMAScriptParser.ForVarInStatementContext)
	/**
	 * Exit a parse tree produced by the {@code ForVarInStatement}
	 * labeled alternative in {@link ECMAScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	fun exitForVarInStatement(ctx: ECMAScriptParser.ForVarInStatementContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	fun enterContinueStatement(ctx: ECMAScriptParser.ContinueStatementContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	fun exitContinueStatement(ctx: ECMAScriptParser.ContinueStatementContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	fun enterBreakStatement(ctx: ECMAScriptParser.BreakStatementContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	fun exitBreakStatement(ctx: ECMAScriptParser.BreakStatementContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	fun enterReturnStatement(ctx: ECMAScriptParser.ReturnStatementContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	fun exitReturnStatement(ctx: ECMAScriptParser.ReturnStatementContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#withStatement}.
	 * @param ctx the parse tree
	 */
	fun enterWithStatement(ctx: ECMAScriptParser.WithStatementContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#withStatement}.
	 * @param ctx the parse tree
	 */
	fun exitWithStatement(ctx: ECMAScriptParser.WithStatementContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	fun enterSwitchStatement(ctx: ECMAScriptParser.SwitchStatementContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	fun exitSwitchStatement(ctx: ECMAScriptParser.SwitchStatementContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	fun enterCaseBlock(ctx: ECMAScriptParser.CaseBlockContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	fun exitCaseBlock(ctx: ECMAScriptParser.CaseBlockContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#caseClauses}.
	 * @param ctx the parse tree
	 */
	fun enterCaseClauses(ctx: ECMAScriptParser.CaseClausesContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#caseClauses}.
	 * @param ctx the parse tree
	 */
	fun exitCaseClauses(ctx: ECMAScriptParser.CaseClausesContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#caseClause}.
	 * @param ctx the parse tree
	 */
	fun enterCaseClause(ctx: ECMAScriptParser.CaseClauseContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#caseClause}.
	 * @param ctx the parse tree
	 */
	fun exitCaseClause(ctx: ECMAScriptParser.CaseClauseContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	fun enterDefaultClause(ctx: ECMAScriptParser.DefaultClauseContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	fun exitDefaultClause(ctx: ECMAScriptParser.DefaultClauseContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#labelledStatement}.
	 * @param ctx the parse tree
	 */
	fun enterLabelledStatement(ctx: ECMAScriptParser.LabelledStatementContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#labelledStatement}.
	 * @param ctx the parse tree
	 */
	fun exitLabelledStatement(ctx: ECMAScriptParser.LabelledStatementContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	fun enterThrowStatement(ctx: ECMAScriptParser.ThrowStatementContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	fun exitThrowStatement(ctx: ECMAScriptParser.ThrowStatementContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	fun enterTryStatement(ctx: ECMAScriptParser.TryStatementContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	fun exitTryStatement(ctx: ECMAScriptParser.TryStatementContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#catchProduction}.
	 * @param ctx the parse tree
	 */
	fun enterCatchProduction(ctx: ECMAScriptParser.CatchProductionContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#catchProduction}.
	 * @param ctx the parse tree
	 */
	fun exitCatchProduction(ctx: ECMAScriptParser.CatchProductionContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#finallyProduction}.
	 * @param ctx the parse tree
	 */
	fun enterFinallyProduction(ctx: ECMAScriptParser.FinallyProductionContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#finallyProduction}.
	 * @param ctx the parse tree
	 */
	fun exitFinallyProduction(ctx: ECMAScriptParser.FinallyProductionContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#debuggerStatement}.
	 * @param ctx the parse tree
	 */
	fun enterDebuggerStatement(ctx: ECMAScriptParser.DebuggerStatementContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#debuggerStatement}.
	 * @param ctx the parse tree
	 */
	fun exitDebuggerStatement(ctx: ECMAScriptParser.DebuggerStatementContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	fun enterFunctionDeclaration(ctx: ECMAScriptParser.FunctionDeclarationContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	fun exitFunctionDeclaration(ctx: ECMAScriptParser.FunctionDeclarationContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	fun enterFormalParameterList(ctx: ECMAScriptParser.FormalParameterListContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	fun exitFormalParameterList(ctx: ECMAScriptParser.FormalParameterListContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#functionBody}.
	 * @param ctx the parse tree
	 */
	fun enterFunctionBody(ctx: ECMAScriptParser.FunctionBodyContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#functionBody}.
	 * @param ctx the parse tree
	 */
	fun exitFunctionBody(ctx: ECMAScriptParser.FunctionBodyContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	fun enterArrayLiteral(ctx: ECMAScriptParser.ArrayLiteralContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	fun exitArrayLiteral(ctx: ECMAScriptParser.ArrayLiteralContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#elementList}.
	 * @param ctx the parse tree
	 */
	fun enterElementList(ctx: ECMAScriptParser.ElementListContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#elementList}.
	 * @param ctx the parse tree
	 */
	fun exitElementList(ctx: ECMAScriptParser.ElementListContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#elision}.
	 * @param ctx the parse tree
	 */
	fun enterElision(ctx: ECMAScriptParser.ElisionContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#elision}.
	 * @param ctx the parse tree
	 */
	fun exitElision(ctx: ECMAScriptParser.ElisionContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	fun enterObjectLiteral(ctx: ECMAScriptParser.ObjectLiteralContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	fun exitObjectLiteral(ctx: ECMAScriptParser.ObjectLiteralContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#propertyNameAndValueList}.
	 * @param ctx the parse tree
	 */
	fun enterPropertyNameAndValueList(ctx: ECMAScriptParser.PropertyNameAndValueListContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#propertyNameAndValueList}.
	 * @param ctx the parse tree
	 */
	fun exitPropertyNameAndValueList(ctx: ECMAScriptParser.PropertyNameAndValueListContext)
	/**
	 * Enter a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link ECMAScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	fun enterPropertyExpressionAssignment(ctx: ECMAScriptParser.PropertyExpressionAssignmentContext)
	/**
	 * Exit a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link ECMAScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	fun exitPropertyExpressionAssignment(ctx: ECMAScriptParser.PropertyExpressionAssignmentContext)
	/**
	 * Enter a parse tree produced by the {@code PropertyGetter}
	 * labeled alternative in {@link ECMAScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	fun enterPropertyGetter(ctx: ECMAScriptParser.PropertyGetterContext)
	/**
	 * Exit a parse tree produced by the {@code PropertyGetter}
	 * labeled alternative in {@link ECMAScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	fun exitPropertyGetter(ctx: ECMAScriptParser.PropertyGetterContext)
	/**
	 * Enter a parse tree produced by the {@code PropertySetter}
	 * labeled alternative in {@link ECMAScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	fun enterPropertySetter(ctx: ECMAScriptParser.PropertySetterContext)
	/**
	 * Exit a parse tree produced by the {@code PropertySetter}
	 * labeled alternative in {@link ECMAScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	fun exitPropertySetter(ctx: ECMAScriptParser.PropertySetterContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#propertyName}.
	 * @param ctx the parse tree
	 */
	fun enterPropertyName(ctx: ECMAScriptParser.PropertyNameContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#propertyName}.
	 * @param ctx the parse tree
	 */
	fun exitPropertyName(ctx: ECMAScriptParser.PropertyNameContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#propertySetParameterList}.
	 * @param ctx the parse tree
	 */
	fun enterPropertySetParameterList(ctx: ECMAScriptParser.PropertySetParameterListContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#propertySetParameterList}.
	 * @param ctx the parse tree
	 */
	fun exitPropertySetParameterList(ctx: ECMAScriptParser.PropertySetParameterListContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#arguments}.
	 * @param ctx the parse tree
	 */
	fun enterArguments(ctx: ECMAScriptParser.ArgumentsContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#arguments}.
	 * @param ctx the parse tree
	 */
	fun exitArguments(ctx: ECMAScriptParser.ArgumentsContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#argumentList}.
	 * @param ctx the parse tree
	 */
	fun enterArgumentList(ctx: ECMAScriptParser.ArgumentListContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#argumentList}.
	 * @param ctx the parse tree
	 */
	fun exitArgumentList(ctx: ECMAScriptParser.ArgumentListContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	fun enterExpressionSequence(ctx: ECMAScriptParser.ExpressionSequenceContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	fun exitExpressionSequence(ctx: ECMAScriptParser.ExpressionSequenceContext)
	/**
	 * Enter a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterTernaryExpression(ctx: ECMAScriptParser.TernaryExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitTernaryExpression(ctx: ECMAScriptParser.TernaryExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterLogicalAndExpression(ctx: ECMAScriptParser.LogicalAndExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitLogicalAndExpression(ctx: ECMAScriptParser.LogicalAndExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterPreIncrementExpression(ctx: ECMAScriptParser.PreIncrementExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitPreIncrementExpression(ctx: ECMAScriptParser.PreIncrementExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterObjectLiteralExpression(ctx: ECMAScriptParser.ObjectLiteralExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitObjectLiteralExpression(ctx: ECMAScriptParser.ObjectLiteralExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterInExpression(ctx: ECMAScriptParser.InExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitInExpression(ctx: ECMAScriptParser.InExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterLogicalOrExpression(ctx: ECMAScriptParser.LogicalOrExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitLogicalOrExpression(ctx: ECMAScriptParser.LogicalOrExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterNotExpression(ctx: ECMAScriptParser.NotExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitNotExpression(ctx: ECMAScriptParser.NotExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterPreDecreaseExpression(ctx: ECMAScriptParser.PreDecreaseExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitPreDecreaseExpression(ctx: ECMAScriptParser.PreDecreaseExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterArgumentsExpression(ctx: ECMAScriptParser.ArgumentsExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitArgumentsExpression(ctx: ECMAScriptParser.ArgumentsExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterThisExpression(ctx: ECMAScriptParser.ThisExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitThisExpression(ctx: ECMAScriptParser.ThisExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterFunctionExpression(ctx: ECMAScriptParser.FunctionExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitFunctionExpression(ctx: ECMAScriptParser.FunctionExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterUnaryMinusExpression(ctx: ECMAScriptParser.UnaryMinusExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitUnaryMinusExpression(ctx: ECMAScriptParser.UnaryMinusExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterAssignmentExpression(ctx: ECMAScriptParser.AssignmentExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitAssignmentExpression(ctx: ECMAScriptParser.AssignmentExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterPostDecreaseExpression(ctx: ECMAScriptParser.PostDecreaseExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitPostDecreaseExpression(ctx: ECMAScriptParser.PostDecreaseExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code TypeofExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterTypeofExpression(ctx: ECMAScriptParser.TypeofExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code TypeofExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitTypeofExpression(ctx: ECMAScriptParser.TypeofExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code InstanceofExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterInstanceofExpression(ctx: ECMAScriptParser.InstanceofExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code InstanceofExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitInstanceofExpression(ctx: ECMAScriptParser.InstanceofExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterUnaryPlusExpression(ctx: ECMAScriptParser.UnaryPlusExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitUnaryPlusExpression(ctx: ECMAScriptParser.UnaryPlusExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code DeleteExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterDeleteExpression(ctx: ECMAScriptParser.DeleteExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code DeleteExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitDeleteExpression(ctx: ECMAScriptParser.DeleteExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterEqualityExpression(ctx: ECMAScriptParser.EqualityExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitEqualityExpression(ctx: ECMAScriptParser.EqualityExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code BitXOrExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterBitXOrExpression(ctx: ECMAScriptParser.BitXOrExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code BitXOrExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitBitXOrExpression(ctx: ECMAScriptParser.BitXOrExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterMultiplicativeExpression(ctx: ECMAScriptParser.MultiplicativeExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitMultiplicativeExpression(ctx: ECMAScriptParser.MultiplicativeExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code BitShiftExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterBitShiftExpression(ctx: ECMAScriptParser.BitShiftExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code BitShiftExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitBitShiftExpression(ctx: ECMAScriptParser.BitShiftExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterParenthesizedExpression(ctx: ECMAScriptParser.ParenthesizedExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitParenthesizedExpression(ctx: ECMAScriptParser.ParenthesizedExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterAdditiveExpression(ctx: ECMAScriptParser.AdditiveExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitAdditiveExpression(ctx: ECMAScriptParser.AdditiveExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterRelationalExpression(ctx: ECMAScriptParser.RelationalExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitRelationalExpression(ctx: ECMAScriptParser.RelationalExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterPostIncrementExpression(ctx: ECMAScriptParser.PostIncrementExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitPostIncrementExpression(ctx: ECMAScriptParser.PostIncrementExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code BitNotExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterBitNotExpression(ctx: ECMAScriptParser.BitNotExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code BitNotExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitBitNotExpression(ctx: ECMAScriptParser.BitNotExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterNewExpression(ctx: ECMAScriptParser.NewExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitNewExpression(ctx: ECMAScriptParser.NewExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterLiteralExpression(ctx: ECMAScriptParser.LiteralExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitLiteralExpression(ctx: ECMAScriptParser.LiteralExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterArrayLiteralExpression(ctx: ECMAScriptParser.ArrayLiteralExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitArrayLiteralExpression(ctx: ECMAScriptParser.ArrayLiteralExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterMemberDotExpression(ctx: ECMAScriptParser.MemberDotExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitMemberDotExpression(ctx: ECMAScriptParser.MemberDotExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterMemberIndexExpression(ctx: ECMAScriptParser.MemberIndexExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitMemberIndexExpression(ctx: ECMAScriptParser.MemberIndexExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterIdentifierExpression(ctx: ECMAScriptParser.IdentifierExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitIdentifierExpression(ctx: ECMAScriptParser.IdentifierExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code BitAndExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterBitAndExpression(ctx: ECMAScriptParser.BitAndExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code BitAndExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitBitAndExpression(ctx: ECMAScriptParser.BitAndExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code BitOrExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterBitOrExpression(ctx: ECMAScriptParser.BitOrExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code BitOrExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitBitOrExpression(ctx: ECMAScriptParser.BitOrExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code AssignmentOperatorExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterAssignmentOperatorExpression(ctx: ECMAScriptParser.AssignmentOperatorExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code AssignmentOperatorExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitAssignmentOperatorExpression(ctx: ECMAScriptParser.AssignmentOperatorExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code VoidExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun enterVoidExpression(ctx: ECMAScriptParser.VoidExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code VoidExpression}
	 * labeled alternative in {@link ECMAScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	fun exitVoidExpression(ctx: ECMAScriptParser.VoidExpressionContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	fun enterAssignmentOperator(ctx: ECMAScriptParser.AssignmentOperatorContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	fun exitAssignmentOperator(ctx: ECMAScriptParser.AssignmentOperatorContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	fun enterLiteral(ctx: ECMAScriptParser.LiteralContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	fun exitLiteral(ctx: ECMAScriptParser.LiteralContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	fun enterNumericLiteral(ctx: ECMAScriptParser.NumericLiteralContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	fun exitNumericLiteral(ctx: ECMAScriptParser.NumericLiteralContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#identifierName}.
	 * @param ctx the parse tree
	 */
	fun enterIdentifierName(ctx: ECMAScriptParser.IdentifierNameContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#identifierName}.
	 * @param ctx the parse tree
	 */
	fun exitIdentifierName(ctx: ECMAScriptParser.IdentifierNameContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	fun enterReservedWord(ctx: ECMAScriptParser.ReservedWordContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	fun exitReservedWord(ctx: ECMAScriptParser.ReservedWordContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#keyword}.
	 * @param ctx the parse tree
	 */
	fun enterKeyword(ctx: ECMAScriptParser.KeywordContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#keyword}.
	 * @param ctx the parse tree
	 */
	fun exitKeyword(ctx: ECMAScriptParser.KeywordContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#futureReservedWord}.
	 * @param ctx the parse tree
	 */
	fun enterFutureReservedWord(ctx: ECMAScriptParser.FutureReservedWordContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#futureReservedWord}.
	 * @param ctx the parse tree
	 */
	fun exitFutureReservedWord(ctx: ECMAScriptParser.FutureReservedWordContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#getter}.
	 * @param ctx the parse tree
	 */
	fun enterGetter(ctx: ECMAScriptParser.GetterContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#getter}.
	 * @param ctx the parse tree
	 */
	fun exitGetter(ctx: ECMAScriptParser.GetterContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#setter}.
	 * @param ctx the parse tree
	 */
	fun enterSetter(ctx: ECMAScriptParser.SetterContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#setter}.
	 * @param ctx the parse tree
	 */
	fun exitSetter(ctx: ECMAScriptParser.SetterContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#eos}.
	 * @param ctx the parse tree
	 */
	fun enterEos(ctx: ECMAScriptParser.EosContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#eos}.
	 * @param ctx the parse tree
	 */
	fun exitEos(ctx: ECMAScriptParser.EosContext)
	/**
	 * Enter a parse tree produced by {@link ECMAScriptParser#eof}.
	 * @param ctx the parse tree
	 */
	fun enterEof(ctx: ECMAScriptParser.EofContext)
	/**
	 * Exit a parse tree produced by {@link ECMAScriptParser#eof}.
	 * @param ctx the parse tree
	 */
	fun exitEof(ctx: ECMAScriptParser.EofContext)
}