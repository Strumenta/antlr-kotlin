// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link datetimeParser}.
 */
interface datetimeListener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link datetimeParser#date_time}.
	 * @param ctx the parse tree
	 */
	fun enterDate_time(ctx: datetimeParser.Date_timeContext)
	/**
	 * Exit a parse tree produced by {@link datetimeParser#date_time}.
	 * @param ctx the parse tree
	 */
	fun exitDate_time(ctx: datetimeParser.Date_timeContext)
	/**
	 * Enter a parse tree produced by {@link datetimeParser#day}.
	 * @param ctx the parse tree
	 */
	fun enterDay(ctx: datetimeParser.DayContext)
	/**
	 * Exit a parse tree produced by {@link datetimeParser#day}.
	 * @param ctx the parse tree
	 */
	fun exitDay(ctx: datetimeParser.DayContext)
	/**
	 * Enter a parse tree produced by {@link datetimeParser#date}.
	 * @param ctx the parse tree
	 */
	fun enterDate(ctx: datetimeParser.DateContext)
	/**
	 * Exit a parse tree produced by {@link datetimeParser#date}.
	 * @param ctx the parse tree
	 */
	fun exitDate(ctx: datetimeParser.DateContext)
	/**
	 * Enter a parse tree produced by {@link datetimeParser#month}.
	 * @param ctx the parse tree
	 */
	fun enterMonth(ctx: datetimeParser.MonthContext)
	/**
	 * Exit a parse tree produced by {@link datetimeParser#month}.
	 * @param ctx the parse tree
	 */
	fun exitMonth(ctx: datetimeParser.MonthContext)
	/**
	 * Enter a parse tree produced by {@link datetimeParser#time}.
	 * @param ctx the parse tree
	 */
	fun enterTime(ctx: datetimeParser.TimeContext)
	/**
	 * Exit a parse tree produced by {@link datetimeParser#time}.
	 * @param ctx the parse tree
	 */
	fun exitTime(ctx: datetimeParser.TimeContext)
	/**
	 * Enter a parse tree produced by {@link datetimeParser#hour}.
	 * @param ctx the parse tree
	 */
	fun enterHour(ctx: datetimeParser.HourContext)
	/**
	 * Exit a parse tree produced by {@link datetimeParser#hour}.
	 * @param ctx the parse tree
	 */
	fun exitHour(ctx: datetimeParser.HourContext)
	/**
	 * Enter a parse tree produced by {@link datetimeParser#zone}.
	 * @param ctx the parse tree
	 */
	fun enterZone(ctx: datetimeParser.ZoneContext)
	/**
	 * Exit a parse tree produced by {@link datetimeParser#zone}.
	 * @param ctx the parse tree
	 */
	fun exitZone(ctx: datetimeParser.ZoneContext)
	/**
	 * Enter a parse tree produced by {@link datetimeParser#two_digit}.
	 * @param ctx the parse tree
	 */
	fun enterTwo_digit(ctx: datetimeParser.Two_digitContext)
	/**
	 * Exit a parse tree produced by {@link datetimeParser#two_digit}.
	 * @param ctx the parse tree
	 */
	fun exitTwo_digit(ctx: datetimeParser.Two_digitContext)
	/**
	 * Enter a parse tree produced by {@link datetimeParser#four_digit}.
	 * @param ctx the parse tree
	 */
	fun enterFour_digit(ctx: datetimeParser.Four_digitContext)
	/**
	 * Exit a parse tree produced by {@link datetimeParser#four_digit}.
	 * @param ctx the parse tree
	 */
	fun exitFour_digit(ctx: datetimeParser.Four_digitContext)
	/**
	 * Enter a parse tree produced by {@link datetimeParser#alphanumeric}.
	 * @param ctx the parse tree
	 */
	fun enterAlphanumeric(ctx: datetimeParser.AlphanumericContext)
	/**
	 * Exit a parse tree produced by {@link datetimeParser#alphanumeric}.
	 * @param ctx the parse tree
	 */
	fun exitAlphanumeric(ctx: datetimeParser.AlphanumericContext)
}