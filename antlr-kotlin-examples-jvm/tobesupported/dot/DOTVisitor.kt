// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DOTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
interface DOTVisitor<T> : ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DOTParser#graph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGraph(ctx : DOTParser.GraphContext) : T
	/**
	 * Visit a parse tree produced by {@link DOTParser#stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStmt_list(ctx : DOTParser.Stmt_listContext) : T
	/**
	 * Visit a parse tree produced by {@link DOTParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStmt(ctx : DOTParser.StmtContext) : T
	/**
	 * Visit a parse tree produced by {@link DOTParser#attr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAttr_stmt(ctx : DOTParser.Attr_stmtContext) : T
	/**
	 * Visit a parse tree produced by {@link DOTParser#attr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAttr_list(ctx : DOTParser.Attr_listContext) : T
	/**
	 * Visit a parse tree produced by {@link DOTParser#a_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitA_list(ctx : DOTParser.A_listContext) : T
	/**
	 * Visit a parse tree produced by {@link DOTParser#edge_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEdge_stmt(ctx : DOTParser.Edge_stmtContext) : T
	/**
	 * Visit a parse tree produced by {@link DOTParser#edgeRHS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEdgeRHS(ctx : DOTParser.EdgeRHSContext) : T
	/**
	 * Visit a parse tree produced by {@link DOTParser#edgeop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEdgeop(ctx : DOTParser.EdgeopContext) : T
	/**
	 * Visit a parse tree produced by {@link DOTParser#node_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNode_stmt(ctx : DOTParser.Node_stmtContext) : T
	/**
	 * Visit a parse tree produced by {@link DOTParser#node_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNode_id(ctx : DOTParser.Node_idContext) : T
	/**
	 * Visit a parse tree produced by {@link DOTParser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPort(ctx : DOTParser.PortContext) : T
	/**
	 * Visit a parse tree produced by {@link DOTParser#subgraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSubgraph(ctx : DOTParser.SubgraphContext) : T
	/**
	 * Visit a parse tree produced by {@link DOTParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitId(ctx : DOTParser.IdContext) : T
}