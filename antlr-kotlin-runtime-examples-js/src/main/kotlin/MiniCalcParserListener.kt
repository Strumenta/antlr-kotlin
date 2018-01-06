import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

// Generated from java-escape by ANTLR 4.7.1

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniCalcParser}.
 */
interface MiniCalcParserListener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniCalcParser#miniCalcFile}.
	 * @param ctx the parse tree
	 */
	fun enterMiniCalcFile(ctx: MiniCalcParser.MiniCalcFileContext)
	/**
	 * Exit a parse tree produced by {@link MiniCalcParser#miniCalcFile}.
	 * @param ctx the parse tree
	 */
	fun exitMiniCalcFile(ctx: MiniCalcParser.MiniCalcFileContext)
	/**
	 * Enter a parse tree produced by {@link MiniCalcParser#line}.
	 * @param ctx the parse tree
	 */
	fun enterLine(ctx: MiniCalcParser.LineContext)
	/**
	 * Exit a parse tree produced by {@link MiniCalcParser#line}.
	 * @param ctx the parse tree
	 */
	fun exitLine(ctx: MiniCalcParser.LineContext)
	/**
	 * Enter a parse tree produced by the {@code inputDeclarationStatement}
	 * labeled alternative in {@link MiniCalcParser#statement}.
	 * @param ctx the parse tree
	 */
	fun enterInputDeclarationStatement(ctx: MiniCalcParser.InputDeclarationStatementContext)
	/**
	 * Exit a parse tree produced by the {@code inputDeclarationStatement}
	 * labeled alternative in {@link MiniCalcParser#statement}.
	 * @param ctx the parse tree
	 */
	fun exitInputDeclarationStatement(ctx: MiniCalcParser.InputDeclarationStatementContext)
	/**
	 * Enter a parse tree produced by the {@code varDeclarationStatement}
	 * labeled alternative in {@link MiniCalcParser#statement}.
	 * @param ctx the parse tree
	 */
	fun enterVarDeclarationStatement(ctx: MiniCalcParser.VarDeclarationStatementContext)
	/**
	 * Exit a parse tree produced by the {@code varDeclarationStatement}
	 * labeled alternative in {@link MiniCalcParser#statement}.
	 * @param ctx the parse tree
	 */
	fun exitVarDeclarationStatement(ctx: MiniCalcParser.VarDeclarationStatementContext)
	/**
	 * Enter a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link MiniCalcParser#statement}.
	 * @param ctx the parse tree
	 */
	fun enterAssignmentStatement(ctx: MiniCalcParser.AssignmentStatementContext)
	/**
	 * Exit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link MiniCalcParser#statement}.
	 * @param ctx the parse tree
	 */
	fun exitAssignmentStatement(ctx: MiniCalcParser.AssignmentStatementContext)
	/**
	 * Enter a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link MiniCalcParser#statement}.
	 * @param ctx the parse tree
	 */
	fun enterPrintStatement(ctx: MiniCalcParser.PrintStatementContext)
	/**
	 * Exit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link MiniCalcParser#statement}.
	 * @param ctx the parse tree
	 */
	fun exitPrintStatement(ctx: MiniCalcParser.PrintStatementContext)
	/**
	 * Enter a parse tree produced by {@link MiniCalcParser#print}.
	 * @param ctx the parse tree
	 */
	fun enterPrint(ctx: MiniCalcParser.PrintContext)
	/**
	 * Exit a parse tree produced by {@link MiniCalcParser#print}.
	 * @param ctx the parse tree
	 */
	fun exitPrint(ctx: MiniCalcParser.PrintContext)
	/**
	 * Enter a parse tree produced by {@link MiniCalcParser#inputDeclaration}.
	 * @param ctx the parse tree
	 */
	fun enterInputDeclaration(ctx: MiniCalcParser.InputDeclarationContext)
	/**
	 * Exit a parse tree produced by {@link MiniCalcParser#inputDeclaration}.
	 * @param ctx the parse tree
	 */
	fun exitInputDeclaration(ctx: MiniCalcParser.InputDeclarationContext)
	/**
	 * Enter a parse tree produced by {@link MiniCalcParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	fun enterVarDeclaration(ctx: MiniCalcParser.VarDeclarationContext)
	/**
	 * Exit a parse tree produced by {@link MiniCalcParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	fun exitVarDeclaration(ctx: MiniCalcParser.VarDeclarationContext)
	/**
	 * Enter a parse tree produced by {@link MiniCalcParser#assignment}.
	 * @param ctx the parse tree
	 */
	fun enterAssignment(ctx: MiniCalcParser.AssignmentContext)
	/**
	 * Exit a parse tree produced by {@link MiniCalcParser#assignment}.
	 * @param ctx the parse tree
	 */
	fun exitAssignment(ctx: MiniCalcParser.AssignmentContext)
	/**
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link MiniCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterDecimalLiteral(ctx: MiniCalcParser.DecimalLiteralContext)
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link MiniCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitDecimalLiteral(ctx: MiniCalcParser.DecimalLiteralContext)
	/**
	 * Enter a parse tree produced by the {@code minusExpression}
	 * labeled alternative in {@link MiniCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterMinusExpression(ctx: MiniCalcParser.MinusExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code minusExpression}
	 * labeled alternative in {@link MiniCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitMinusExpression(ctx: MiniCalcParser.MinusExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code valueReference}
	 * labeled alternative in {@link MiniCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterValueReference(ctx: MiniCalcParser.ValueReferenceContext)
	/**
	 * Exit a parse tree produced by the {@code valueReference}
	 * labeled alternative in {@link MiniCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitValueReference(ctx: MiniCalcParser.ValueReferenceContext)
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link MiniCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterStringLiteral(ctx: MiniCalcParser.StringLiteralContext)
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link MiniCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitStringLiteral(ctx: MiniCalcParser.StringLiteralContext)
	/**
	 * Enter a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link MiniCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterIntLiteral(ctx: MiniCalcParser.IntLiteralContext)
	/**
	 * Exit a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link MiniCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitIntLiteral(ctx: MiniCalcParser.IntLiteralContext)
	/**
	 * Enter a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link MiniCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterParenExpression(ctx: MiniCalcParser.ParenExpressionContext)
	/**
	 * Exit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link MiniCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitParenExpression(ctx: MiniCalcParser.ParenExpressionContext)
	/**
	 * Enter a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link MiniCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterBinaryOperation(ctx: MiniCalcParser.BinaryOperationContext)
	/**
	 * Exit a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link MiniCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitBinaryOperation(ctx: MiniCalcParser.BinaryOperationContext)
	/**
	 * Enter a parse tree produced by the {@code typeConversion}
	 * labeled alternative in {@link MiniCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterTypeConversion(ctx: MiniCalcParser.TypeConversionContext)
	/**
	 * Exit a parse tree produced by the {@code typeConversion}
	 * labeled alternative in {@link MiniCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitTypeConversion(ctx: MiniCalcParser.TypeConversionContext)
	/**
	 * Enter a parse tree produced by the {@code constantString}
	 * labeled alternative in {@link MiniCalcParser#stringLiteralContent}.
	 * @param ctx the parse tree
	 */
	fun enterConstantString(ctx: MiniCalcParser.ConstantStringContext)
	/**
	 * Exit a parse tree produced by the {@code constantString}
	 * labeled alternative in {@link MiniCalcParser#stringLiteralContent}.
	 * @param ctx the parse tree
	 */
	fun exitConstantString(ctx: MiniCalcParser.ConstantStringContext)
	/**
	 * Enter a parse tree produced by the {@code interpolatedValue}
	 * labeled alternative in {@link MiniCalcParser#stringLiteralContent}.
	 * @param ctx the parse tree
	 */
	fun enterInterpolatedValue(ctx: MiniCalcParser.InterpolatedValueContext)
	/**
	 * Exit a parse tree produced by the {@code interpolatedValue}
	 * labeled alternative in {@link MiniCalcParser#stringLiteralContent}.
	 * @param ctx the parse tree
	 */
	fun exitInterpolatedValue(ctx: MiniCalcParser.InterpolatedValueContext)
	/**
	 * Enter a parse tree produced by the {@code integer}
	 * labeled alternative in {@link MiniCalcParser#type}.
	 * @param ctx the parse tree
	 */
	fun enterInteger(ctx: MiniCalcParser.IntegerContext)
	/**
	 * Exit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link MiniCalcParser#type}.
	 * @param ctx the parse tree
	 */
	fun exitInteger(ctx: MiniCalcParser.IntegerContext)
	/**
	 * Enter a parse tree produced by the {@code decimal}
	 * labeled alternative in {@link MiniCalcParser#type}.
	 * @param ctx the parse tree
	 */
	fun enterDecimal(ctx: MiniCalcParser.DecimalContext)
	/**
	 * Exit a parse tree produced by the {@code decimal}
	 * labeled alternative in {@link MiniCalcParser#type}.
	 * @param ctx the parse tree
	 */
	fun exitDecimal(ctx: MiniCalcParser.DecimalContext)
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link MiniCalcParser#type}.
	 * @param ctx the parse tree
	 */
	fun enterString(ctx: MiniCalcParser.StringContext)
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link MiniCalcParser#type}.
	 * @param ctx the parse tree
	 */
	fun exitString(ctx: MiniCalcParser.StringContext)
}