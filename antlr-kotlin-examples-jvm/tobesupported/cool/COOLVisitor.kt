// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link COOLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
interface COOLVisitor<T> : ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link COOLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitProgram(ctx : COOLParser.ProgramContext) : T
	/**
	 * Visit a parse tree produced by the {@code classes}
	 * labeled alternative in {@link COOLParser#programBlocks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClasses(ctx : COOLParser.ClassesContext) : T
	/**
	 * Visit a parse tree produced by the {@code eof}
	 * labeled alternative in {@link COOLParser#programBlocks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEof(ctx : COOLParser.EofContext) : T
	/**
	 * Visit a parse tree produced by {@link COOLParser#classDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitClassDefine(ctx : COOLParser.ClassDefineContext) : T
	/**
	 * Visit a parse tree produced by the {@code method}
	 * labeled alternative in {@link COOLParser#feature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMethod(ctx : COOLParser.MethodContext) : T
	/**
	 * Visit a parse tree produced by the {@code property}
	 * labeled alternative in {@link COOLParser#feature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitProperty(ctx : COOLParser.PropertyContext) : T
	/**
	 * Visit a parse tree produced by {@link COOLParser#formal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFormal(ctx : COOLParser.FormalContext) : T
	/**
	 * Visit a parse tree produced by the {@code letIn}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLetIn(ctx : COOLParser.LetInContext) : T
	/**
	 * Visit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMinus(ctx : COOLParser.MinusContext) : T
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitString(ctx : COOLParser.StringContext) : T
	/**
	 * Visit a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIsvoid(ctx : COOLParser.IsvoidContext) : T
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitWhile(ctx : COOLParser.WhileContext) : T
	/**
	 * Visit a parse tree produced by the {@code division}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDivision(ctx : COOLParser.DivisionContext) : T
	/**
	 * Visit a parse tree produced by the {@code negative}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNegative(ctx : COOLParser.NegativeContext) : T
	/**
	 * Visit a parse tree produced by the {@code boolNot}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBoolNot(ctx : COOLParser.BoolNotContext) : T
	/**
	 * Visit a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLessThan(ctx : COOLParser.LessThanContext) : T
	/**
	 * Visit a parse tree produced by the {@code block}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBlock(ctx : COOLParser.BlockContext) : T
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitId(ctx : COOLParser.IdContext) : T
	/**
	 * Visit a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMultiply(ctx : COOLParser.MultiplyContext) : T
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIf(ctx : COOLParser.IfContext) : T
	/**
	 * Visit a parse tree produced by the {@code case}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCase(ctx : COOLParser.CaseContext) : T
	/**
	 * Visit a parse tree produced by the {@code ownMethodCall}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOwnMethodCall(ctx : COOLParser.OwnMethodCallContext) : T
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAdd(ctx : COOLParser.AddContext) : T
	/**
	 * Visit a parse tree produced by the {@code new}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNew(ctx : COOLParser.NewContext) : T
	/**
	 * Visit a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitParentheses(ctx : COOLParser.ParenthesesContext) : T
	/**
	 * Visit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAssignment(ctx : COOLParser.AssignmentContext) : T
	/**
	 * Visit a parse tree produced by the {@code false}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFalse(ctx : COOLParser.FalseContext) : T
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInt(ctx : COOLParser.IntContext) : T
	/**
	 * Visit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEqual(ctx : COOLParser.EqualContext) : T
	/**
	 * Visit a parse tree produced by the {@code true}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTrue(ctx : COOLParser.TrueContext) : T
	/**
	 * Visit a parse tree produced by the {@code lessEqual}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLessEqual(ctx : COOLParser.LessEqualContext) : T
	/**
	 * Visit a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMethodCall(ctx : COOLParser.MethodCallContext) : T
}