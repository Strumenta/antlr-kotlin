// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link fenParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
interface fenVisitor<T> : ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link fenParser#fen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFen(ctx : fenParser.FenContext) : T
	/**
	 * Visit a parse tree produced by {@link fenParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitColor(ctx : fenParser.ColorContext) : T
	/**
	 * Visit a parse tree produced by {@link fenParser#castling}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCastling(ctx : fenParser.CastlingContext) : T
	/**
	 * Visit a parse tree produced by {@link fenParser#enpassant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEnpassant(ctx : fenParser.EnpassantContext) : T
	/**
	 * Visit a parse tree produced by {@link fenParser#position}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPosition(ctx : fenParser.PositionContext) : T
	/**
	 * Visit a parse tree produced by {@link fenParser#halfmoveclock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitHalfmoveclock(ctx : fenParser.HalfmoveclockContext) : T
	/**
	 * Visit a parse tree produced by {@link fenParser#fullmoveclock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFullmoveclock(ctx : fenParser.FullmoveclockContext) : T
	/**
	 * Visit a parse tree produced by {@link fenParser#placement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPlacement(ctx : fenParser.PlacementContext) : T
	/**
	 * Visit a parse tree produced by {@link fenParser#rank}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRank(ctx : fenParser.RankContext) : T
	/**
	 * Visit a parse tree produced by {@link fenParser#piece}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPiece(ctx : fenParser.PieceContext) : T
}