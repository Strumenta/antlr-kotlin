// Generated from src/test/resources/MiniCalcParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniCalcParser}.
 */
public interface MiniCalcParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniCalcParser#miniCalcFile}.
	 * @param ctx the parse tree
	 */
	void enterMiniCalcFile(MiniCalcParser.MiniCalcFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCalcParser#miniCalcFile}.
	 * @param ctx the parse tree
	 */
	void exitMiniCalcFile(MiniCalcParser.MiniCalcFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCalcParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(MiniCalcParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCalcParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(MiniCalcParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inputDeclarationStatement}
	 * labeled alternative in {@link MiniCalcParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterInputDeclarationStatement(MiniCalcParser.InputDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inputDeclarationStatement}
	 * labeled alternative in {@link MiniCalcParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitInputDeclarationStatement(MiniCalcParser.InputDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDeclarationStatement}
	 * labeled alternative in {@link MiniCalcParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclarationStatement(MiniCalcParser.VarDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDeclarationStatement}
	 * labeled alternative in {@link MiniCalcParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclarationStatement(MiniCalcParser.VarDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link MiniCalcParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(MiniCalcParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link MiniCalcParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(MiniCalcParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link MiniCalcParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(MiniCalcParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link MiniCalcParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(MiniCalcParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCalcParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(MiniCalcParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCalcParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(MiniCalcParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCalcParser#inputDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInputDeclaration(MiniCalcParser.InputDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCalcParser#inputDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInputDeclaration(MiniCalcParser.InputDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCalcParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(MiniCalcParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCalcParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(MiniCalcParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCalcParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MiniCalcParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCalcParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MiniCalcParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link MiniCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(MiniCalcParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link MiniCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(MiniCalcParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusExpression}
	 * labeled alternative in {@link MiniCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpression(MiniCalcParser.MinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusExpression}
	 * labeled alternative in {@link MiniCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpression(MiniCalcParser.MinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueReference}
	 * labeled alternative in {@link MiniCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterValueReference(MiniCalcParser.ValueReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueReference}
	 * labeled alternative in {@link MiniCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitValueReference(MiniCalcParser.ValueReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link MiniCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(MiniCalcParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link MiniCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(MiniCalcParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link MiniCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(MiniCalcParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link MiniCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(MiniCalcParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link MiniCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(MiniCalcParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link MiniCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(MiniCalcParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link MiniCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperation(MiniCalcParser.BinaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link MiniCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperation(MiniCalcParser.BinaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConversion}
	 * labeled alternative in {@link MiniCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTypeConversion(MiniCalcParser.TypeConversionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConversion}
	 * labeled alternative in {@link MiniCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTypeConversion(MiniCalcParser.TypeConversionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantString}
	 * labeled alternative in {@link MiniCalcParser#stringLiteralContent}.
	 * @param ctx the parse tree
	 */
	void enterConstantString(MiniCalcParser.ConstantStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantString}
	 * labeled alternative in {@link MiniCalcParser#stringLiteralContent}.
	 * @param ctx the parse tree
	 */
	void exitConstantString(MiniCalcParser.ConstantStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code interpolatedValue}
	 * labeled alternative in {@link MiniCalcParser#stringLiteralContent}.
	 * @param ctx the parse tree
	 */
	void enterInterpolatedValue(MiniCalcParser.InterpolatedValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code interpolatedValue}
	 * labeled alternative in {@link MiniCalcParser#stringLiteralContent}.
	 * @param ctx the parse tree
	 */
	void exitInterpolatedValue(MiniCalcParser.InterpolatedValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integer}
	 * labeled alternative in {@link MiniCalcParser#type}.
	 * @param ctx the parse tree
	 */
	void enterInteger(MiniCalcParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link MiniCalcParser#type}.
	 * @param ctx the parse tree
	 */
	void exitInteger(MiniCalcParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimal}
	 * labeled alternative in {@link MiniCalcParser#type}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(MiniCalcParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimal}
	 * labeled alternative in {@link MiniCalcParser#type}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(MiniCalcParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link MiniCalcParser#type}.
	 * @param ctx the parse tree
	 */
	void enterString(MiniCalcParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link MiniCalcParser#type}.
	 * @param ctx the parse tree
	 */
	void exitString(MiniCalcParser.StringContext ctx);
}