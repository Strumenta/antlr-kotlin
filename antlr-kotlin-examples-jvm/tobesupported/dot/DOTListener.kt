// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DOTParser}.
 */
interface DOTListener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DOTParser#graph}.
	 * @param ctx the parse tree
	 */
	fun enterGraph(ctx: DOTParser.GraphContext)
	/**
	 * Exit a parse tree produced by {@link DOTParser#graph}.
	 * @param ctx the parse tree
	 */
	fun exitGraph(ctx: DOTParser.GraphContext)
	/**
	 * Enter a parse tree produced by {@link DOTParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	fun enterStmt_list(ctx: DOTParser.Stmt_listContext)
	/**
	 * Exit a parse tree produced by {@link DOTParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	fun exitStmt_list(ctx: DOTParser.Stmt_listContext)
	/**
	 * Enter a parse tree produced by {@link DOTParser#stmt}.
	 * @param ctx the parse tree
	 */
	fun enterStmt(ctx: DOTParser.StmtContext)
	/**
	 * Exit a parse tree produced by {@link DOTParser#stmt}.
	 * @param ctx the parse tree
	 */
	fun exitStmt(ctx: DOTParser.StmtContext)
	/**
	 * Enter a parse tree produced by {@link DOTParser#attr_stmt}.
	 * @param ctx the parse tree
	 */
	fun enterAttr_stmt(ctx: DOTParser.Attr_stmtContext)
	/**
	 * Exit a parse tree produced by {@link DOTParser#attr_stmt}.
	 * @param ctx the parse tree
	 */
	fun exitAttr_stmt(ctx: DOTParser.Attr_stmtContext)
	/**
	 * Enter a parse tree produced by {@link DOTParser#attr_list}.
	 * @param ctx the parse tree
	 */
	fun enterAttr_list(ctx: DOTParser.Attr_listContext)
	/**
	 * Exit a parse tree produced by {@link DOTParser#attr_list}.
	 * @param ctx the parse tree
	 */
	fun exitAttr_list(ctx: DOTParser.Attr_listContext)
	/**
	 * Enter a parse tree produced by {@link DOTParser#a_list}.
	 * @param ctx the parse tree
	 */
	fun enterA_list(ctx: DOTParser.A_listContext)
	/**
	 * Exit a parse tree produced by {@link DOTParser#a_list}.
	 * @param ctx the parse tree
	 */
	fun exitA_list(ctx: DOTParser.A_listContext)
	/**
	 * Enter a parse tree produced by {@link DOTParser#edge_stmt}.
	 * @param ctx the parse tree
	 */
	fun enterEdge_stmt(ctx: DOTParser.Edge_stmtContext)
	/**
	 * Exit a parse tree produced by {@link DOTParser#edge_stmt}.
	 * @param ctx the parse tree
	 */
	fun exitEdge_stmt(ctx: DOTParser.Edge_stmtContext)
	/**
	 * Enter a parse tree produced by {@link DOTParser#edgeRHS}.
	 * @param ctx the parse tree
	 */
	fun enterEdgeRHS(ctx: DOTParser.EdgeRHSContext)
	/**
	 * Exit a parse tree produced by {@link DOTParser#edgeRHS}.
	 * @param ctx the parse tree
	 */
	fun exitEdgeRHS(ctx: DOTParser.EdgeRHSContext)
	/**
	 * Enter a parse tree produced by {@link DOTParser#edgeop}.
	 * @param ctx the parse tree
	 */
	fun enterEdgeop(ctx: DOTParser.EdgeopContext)
	/**
	 * Exit a parse tree produced by {@link DOTParser#edgeop}.
	 * @param ctx the parse tree
	 */
	fun exitEdgeop(ctx: DOTParser.EdgeopContext)
	/**
	 * Enter a parse tree produced by {@link DOTParser#node_stmt}.
	 * @param ctx the parse tree
	 */
	fun enterNode_stmt(ctx: DOTParser.Node_stmtContext)
	/**
	 * Exit a parse tree produced by {@link DOTParser#node_stmt}.
	 * @param ctx the parse tree
	 */
	fun exitNode_stmt(ctx: DOTParser.Node_stmtContext)
	/**
	 * Enter a parse tree produced by {@link DOTParser#node_id}.
	 * @param ctx the parse tree
	 */
	fun enterNode_id(ctx: DOTParser.Node_idContext)
	/**
	 * Exit a parse tree produced by {@link DOTParser#node_id}.
	 * @param ctx the parse tree
	 */
	fun exitNode_id(ctx: DOTParser.Node_idContext)
	/**
	 * Enter a parse tree produced by {@link DOTParser#port}.
	 * @param ctx the parse tree
	 */
	fun enterPort(ctx: DOTParser.PortContext)
	/**
	 * Exit a parse tree produced by {@link DOTParser#port}.
	 * @param ctx the parse tree
	 */
	fun exitPort(ctx: DOTParser.PortContext)
	/**
	 * Enter a parse tree produced by {@link DOTParser#subgraph}.
	 * @param ctx the parse tree
	 */
	fun enterSubgraph(ctx: DOTParser.SubgraphContext)
	/**
	 * Exit a parse tree produced by {@link DOTParser#subgraph}.
	 * @param ctx the parse tree
	 */
	fun exitSubgraph(ctx: DOTParser.SubgraphContext)
	/**
	 * Enter a parse tree produced by {@link DOTParser#id}.
	 * @param ctx the parse tree
	 */
	fun enterId(ctx: DOTParser.IdContext)
	/**
	 * Exit a parse tree produced by {@link DOTParser#id}.
	 * @param ctx the parse tree
	 */
	fun exitId(ctx: DOTParser.IdContext)
}