// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link fenParser}.
 */
interface fenListener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link fenParser#fen}.
	 * @param ctx the parse tree
	 */
	fun enterFen(ctx: fenParser.FenContext)
	/**
	 * Exit a parse tree produced by {@link fenParser#fen}.
	 * @param ctx the parse tree
	 */
	fun exitFen(ctx: fenParser.FenContext)
	/**
	 * Enter a parse tree produced by {@link fenParser#color}.
	 * @param ctx the parse tree
	 */
	fun enterColor(ctx: fenParser.ColorContext)
	/**
	 * Exit a parse tree produced by {@link fenParser#color}.
	 * @param ctx the parse tree
	 */
	fun exitColor(ctx: fenParser.ColorContext)
	/**
	 * Enter a parse tree produced by {@link fenParser#castling}.
	 * @param ctx the parse tree
	 */
	fun enterCastling(ctx: fenParser.CastlingContext)
	/**
	 * Exit a parse tree produced by {@link fenParser#castling}.
	 * @param ctx the parse tree
	 */
	fun exitCastling(ctx: fenParser.CastlingContext)
	/**
	 * Enter a parse tree produced by {@link fenParser#enpassant}.
	 * @param ctx the parse tree
	 */
	fun enterEnpassant(ctx: fenParser.EnpassantContext)
	/**
	 * Exit a parse tree produced by {@link fenParser#enpassant}.
	 * @param ctx the parse tree
	 */
	fun exitEnpassant(ctx: fenParser.EnpassantContext)
	/**
	 * Enter a parse tree produced by {@link fenParser#position}.
	 * @param ctx the parse tree
	 */
	fun enterPosition(ctx: fenParser.PositionContext)
	/**
	 * Exit a parse tree produced by {@link fenParser#position}.
	 * @param ctx the parse tree
	 */
	fun exitPosition(ctx: fenParser.PositionContext)
	/**
	 * Enter a parse tree produced by {@link fenParser#halfmoveclock}.
	 * @param ctx the parse tree
	 */
	fun enterHalfmoveclock(ctx: fenParser.HalfmoveclockContext)
	/**
	 * Exit a parse tree produced by {@link fenParser#halfmoveclock}.
	 * @param ctx the parse tree
	 */
	fun exitHalfmoveclock(ctx: fenParser.HalfmoveclockContext)
	/**
	 * Enter a parse tree produced by {@link fenParser#fullmoveclock}.
	 * @param ctx the parse tree
	 */
	fun enterFullmoveclock(ctx: fenParser.FullmoveclockContext)
	/**
	 * Exit a parse tree produced by {@link fenParser#fullmoveclock}.
	 * @param ctx the parse tree
	 */
	fun exitFullmoveclock(ctx: fenParser.FullmoveclockContext)
	/**
	 * Enter a parse tree produced by {@link fenParser#placement}.
	 * @param ctx the parse tree
	 */
	fun enterPlacement(ctx: fenParser.PlacementContext)
	/**
	 * Exit a parse tree produced by {@link fenParser#placement}.
	 * @param ctx the parse tree
	 */
	fun exitPlacement(ctx: fenParser.PlacementContext)
	/**
	 * Enter a parse tree produced by {@link fenParser#rank}.
	 * @param ctx the parse tree
	 */
	fun enterRank(ctx: fenParser.RankContext)
	/**
	 * Exit a parse tree produced by {@link fenParser#rank}.
	 * @param ctx the parse tree
	 */
	fun exitRank(ctx: fenParser.RankContext)
	/**
	 * Enter a parse tree produced by {@link fenParser#piece}.
	 * @param ctx the parse tree
	 */
	fun enterPiece(ctx: fenParser.PieceContext)
	/**
	 * Exit a parse tree produced by {@link fenParser#piece}.
	 * @param ctx the parse tree
	 */
	fun exitPiece(ctx: fenParser.PieceContext)
}