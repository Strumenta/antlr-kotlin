// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link COOLParser}.
 */
interface COOLListener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link COOLParser#program}.
	 * @param ctx the parse tree
	 */
	fun enterProgram(ctx: COOLParser.ProgramContext)
	/**
	 * Exit a parse tree produced by {@link COOLParser#program}.
	 * @param ctx the parse tree
	 */
	fun exitProgram(ctx: COOLParser.ProgramContext)
	/**
	 * Enter a parse tree produced by the {@code classes}
	 * labeled alternative in {@link COOLParser#programBlocks}.
	 * @param ctx the parse tree
	 */
	fun enterClasses(ctx: COOLParser.ClassesContext)
	/**
	 * Exit a parse tree produced by the {@code classes}
	 * labeled alternative in {@link COOLParser#programBlocks}.
	 * @param ctx the parse tree
	 */
	fun exitClasses(ctx: COOLParser.ClassesContext)
	/**
	 * Enter a parse tree produced by the {@code eof}
	 * labeled alternative in {@link COOLParser#programBlocks}.
	 * @param ctx the parse tree
	 */
	fun enterEof(ctx: COOLParser.EofContext)
	/**
	 * Exit a parse tree produced by the {@code eof}
	 * labeled alternative in {@link COOLParser#programBlocks}.
	 * @param ctx the parse tree
	 */
	fun exitEof(ctx: COOLParser.EofContext)
	/**
	 * Enter a parse tree produced by {@link COOLParser#classDefine}.
	 * @param ctx the parse tree
	 */
	fun enterClassDefine(ctx: COOLParser.ClassDefineContext)
	/**
	 * Exit a parse tree produced by {@link COOLParser#classDefine}.
	 * @param ctx the parse tree
	 */
	fun exitClassDefine(ctx: COOLParser.ClassDefineContext)
	/**
	 * Enter a parse tree produced by the {@code method}
	 * labeled alternative in {@link COOLParser#feature}.
	 * @param ctx the parse tree
	 */
	fun enterMethod(ctx: COOLParser.MethodContext)
	/**
	 * Exit a parse tree produced by the {@code method}
	 * labeled alternative in {@link COOLParser#feature}.
	 * @param ctx the parse tree
	 */
	fun exitMethod(ctx: COOLParser.MethodContext)
	/**
	 * Enter a parse tree produced by the {@code property}
	 * labeled alternative in {@link COOLParser#feature}.
	 * @param ctx the parse tree
	 */
	fun enterProperty(ctx: COOLParser.PropertyContext)
	/**
	 * Exit a parse tree produced by the {@code property}
	 * labeled alternative in {@link COOLParser#feature}.
	 * @param ctx the parse tree
	 */
	fun exitProperty(ctx: COOLParser.PropertyContext)
	/**
	 * Enter a parse tree produced by {@link COOLParser#formal}.
	 * @param ctx the parse tree
	 */
	fun enterFormal(ctx: COOLParser.FormalContext)
	/**
	 * Exit a parse tree produced by {@link COOLParser#formal}.
	 * @param ctx the parse tree
	 */
	fun exitFormal(ctx: COOLParser.FormalContext)
	/**
	 * Enter a parse tree produced by the {@code letIn}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterLetIn(ctx: COOLParser.LetInContext)
	/**
	 * Exit a parse tree produced by the {@code letIn}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitLetIn(ctx: COOLParser.LetInContext)
	/**
	 * Enter a parse tree produced by the {@code minus}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterMinus(ctx: COOLParser.MinusContext)
	/**
	 * Exit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitMinus(ctx: COOLParser.MinusContext)
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterString(ctx: COOLParser.StringContext)
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitString(ctx: COOLParser.StringContext)
	/**
	 * Enter a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterIsvoid(ctx: COOLParser.IsvoidContext)
	/**
	 * Exit a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitIsvoid(ctx: COOLParser.IsvoidContext)
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterWhile(ctx: COOLParser.WhileContext)
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitWhile(ctx: COOLParser.WhileContext)
	/**
	 * Enter a parse tree produced by the {@code division}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterDivision(ctx: COOLParser.DivisionContext)
	/**
	 * Exit a parse tree produced by the {@code division}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitDivision(ctx: COOLParser.DivisionContext)
	/**
	 * Enter a parse tree produced by the {@code negative}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterNegative(ctx: COOLParser.NegativeContext)
	/**
	 * Exit a parse tree produced by the {@code negative}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitNegative(ctx: COOLParser.NegativeContext)
	/**
	 * Enter a parse tree produced by the {@code boolNot}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterBoolNot(ctx: COOLParser.BoolNotContext)
	/**
	 * Exit a parse tree produced by the {@code boolNot}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitBoolNot(ctx: COOLParser.BoolNotContext)
	/**
	 * Enter a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterLessThan(ctx: COOLParser.LessThanContext)
	/**
	 * Exit a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitLessThan(ctx: COOLParser.LessThanContext)
	/**
	 * Enter a parse tree produced by the {@code block}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterBlock(ctx: COOLParser.BlockContext)
	/**
	 * Exit a parse tree produced by the {@code block}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitBlock(ctx: COOLParser.BlockContext)
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterId(ctx: COOLParser.IdContext)
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitId(ctx: COOLParser.IdContext)
	/**
	 * Enter a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterMultiply(ctx: COOLParser.MultiplyContext)
	/**
	 * Exit a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitMultiply(ctx: COOLParser.MultiplyContext)
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterIf(ctx: COOLParser.IfContext)
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitIf(ctx: COOLParser.IfContext)
	/**
	 * Enter a parse tree produced by the {@code case}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterCase(ctx: COOLParser.CaseContext)
	/**
	 * Exit a parse tree produced by the {@code case}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitCase(ctx: COOLParser.CaseContext)
	/**
	 * Enter a parse tree produced by the {@code ownMethodCall}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterOwnMethodCall(ctx: COOLParser.OwnMethodCallContext)
	/**
	 * Exit a parse tree produced by the {@code ownMethodCall}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitOwnMethodCall(ctx: COOLParser.OwnMethodCallContext)
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterAdd(ctx: COOLParser.AddContext)
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitAdd(ctx: COOLParser.AddContext)
	/**
	 * Enter a parse tree produced by the {@code new}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterNew(ctx: COOLParser.NewContext)
	/**
	 * Exit a parse tree produced by the {@code new}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitNew(ctx: COOLParser.NewContext)
	/**
	 * Enter a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterParentheses(ctx: COOLParser.ParenthesesContext)
	/**
	 * Exit a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitParentheses(ctx: COOLParser.ParenthesesContext)
	/**
	 * Enter a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterAssignment(ctx: COOLParser.AssignmentContext)
	/**
	 * Exit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitAssignment(ctx: COOLParser.AssignmentContext)
	/**
	 * Enter a parse tree produced by the {@code false}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterFalse(ctx: COOLParser.FalseContext)
	/**
	 * Exit a parse tree produced by the {@code false}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitFalse(ctx: COOLParser.FalseContext)
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterInt(ctx: COOLParser.IntContext)
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitInt(ctx: COOLParser.IntContext)
	/**
	 * Enter a parse tree produced by the {@code equal}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterEqual(ctx: COOLParser.EqualContext)
	/**
	 * Exit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitEqual(ctx: COOLParser.EqualContext)
	/**
	 * Enter a parse tree produced by the {@code true}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterTrue(ctx: COOLParser.TrueContext)
	/**
	 * Exit a parse tree produced by the {@code true}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitTrue(ctx: COOLParser.TrueContext)
	/**
	 * Enter a parse tree produced by the {@code lessEqual}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterLessEqual(ctx: COOLParser.LessEqualContext)
	/**
	 * Exit a parse tree produced by the {@code lessEqual}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitLessEqual(ctx: COOLParser.LessEqualContext)
	/**
	 * Enter a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterMethodCall(ctx: COOLParser.MethodCallContext)
	/**
	 * Exit a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitMethodCall(ctx: COOLParser.MethodCallContext)
}