// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link brainfuckParser}.
 */
interface brainfuckListener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link brainfuckParser#file}.
	 * @param ctx the parse tree
	 */
	fun enterFile(ctx: brainfuckParser.FileContext)
	/**
	 * Exit a parse tree produced by {@link brainfuckParser#file}.
	 * @param ctx the parse tree
	 */
	fun exitFile(ctx: brainfuckParser.FileContext)
	/**
	 * Enter a parse tree produced by {@link brainfuckParser#opcode}.
	 * @param ctx the parse tree
	 */
	fun enterOpcode(ctx: brainfuckParser.OpcodeContext)
	/**
	 * Exit a parse tree produced by {@link brainfuckParser#opcode}.
	 * @param ctx the parse tree
	 */
	fun exitOpcode(ctx: brainfuckParser.OpcodeContext)
}