// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link brainfuckParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
interface brainfuckVisitor<T> : ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link brainfuckParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFile(ctx : brainfuckParser.FileContext) : T
	/**
	 * Visit a parse tree produced by {@link brainfuckParser#opcode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOpcode(ctx : brainfuckParser.OpcodeContext) : T
}