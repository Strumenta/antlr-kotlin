// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link datetimeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
interface datetimeVisitor<T> : ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link datetimeParser#date_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDate_time(ctx : datetimeParser.Date_timeContext) : T
	/**
	 * Visit a parse tree produced by {@link datetimeParser#day}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDay(ctx : datetimeParser.DayContext) : T
	/**
	 * Visit a parse tree produced by {@link datetimeParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDate(ctx : datetimeParser.DateContext) : T
	/**
	 * Visit a parse tree produced by {@link datetimeParser#month}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMonth(ctx : datetimeParser.MonthContext) : T
	/**
	 * Visit a parse tree produced by {@link datetimeParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTime(ctx : datetimeParser.TimeContext) : T
	/**
	 * Visit a parse tree produced by {@link datetimeParser#hour}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitHour(ctx : datetimeParser.HourContext) : T
	/**
	 * Visit a parse tree produced by {@link datetimeParser#zone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitZone(ctx : datetimeParser.ZoneContext) : T
	/**
	 * Visit a parse tree produced by {@link datetimeParser#two_digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTwo_digit(ctx : datetimeParser.Two_digitContext) : T
	/**
	 * Visit a parse tree produced by {@link datetimeParser#four_digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFour_digit(ctx : datetimeParser.Four_digitContext) : T
	/**
	 * Visit a parse tree produced by {@link datetimeParser#alphanumeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAlphanumeric(ctx : datetimeParser.AlphanumericContext) : T
}