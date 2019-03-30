// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FusionTablesSqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
interface FusionTablesSqlVisitor<T> : ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#fusionTablesSql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFusionTablesSql(ctx : FusionTablesSqlParser.FusionTablesSqlContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#sql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSql_stmt(ctx : FusionTablesSqlParser.Sql_stmtContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#table_name_in_ddl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTable_name_in_ddl(ctx : FusionTablesSqlParser.Table_name_in_ddlContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#table_name_in_dml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTable_name_in_dml(ctx : FusionTablesSqlParser.Table_name_in_dmlContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#create_table_as_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCreate_table_as_select_stmt(ctx : FusionTablesSqlParser.Create_table_as_select_stmtContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#describe_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDescribe_stmt(ctx : FusionTablesSqlParser.Describe_stmtContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#show_tables_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitShow_tables_stmt(ctx : FusionTablesSqlParser.Show_tables_stmtContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAlter_table_stmt(ctx : FusionTablesSqlParser.Alter_table_stmtContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#create_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCreate_view_stmt(ctx : FusionTablesSqlParser.Create_view_stmtContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDrop_table_stmt(ctx : FusionTablesSqlParser.Drop_table_stmtContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInsert_stmt(ctx : FusionTablesSqlParser.Insert_stmtContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUpdate_stmt(ctx : FusionTablesSqlParser.Update_stmtContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#column_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitColumn_assignment(ctx : FusionTablesSqlParser.Column_assignmentContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDelete_stmt(ctx : FusionTablesSqlParser.Delete_stmtContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#eq_comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEq_comparison(ctx : FusionTablesSqlParser.Eq_comparisonContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#table_name_with_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTable_name_with_alias(ctx : FusionTablesSqlParser.Table_name_with_aliasContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSelect_stmt(ctx : FusionTablesSqlParser.Select_stmtContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#ordering_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOrdering_term(ctx : FusionTablesSqlParser.Ordering_termContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitJoin_clause(ctx : FusionTablesSqlParser.Join_clauseContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitResult_column(ctx : FusionTablesSqlParser.Result_columnContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#qualified_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitQualified_column_name(ctx : FusionTablesSqlParser.Qualified_column_nameContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#aggregate_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAggregate_exp(ctx : FusionTablesSqlParser.Aggregate_expContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExpr(ctx : FusionTablesSqlParser.ExprContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#column_name_beginning_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitColumn_name_beginning_expr(ctx : FusionTablesSqlParser.Column_name_beginning_exprContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#column_name_in_dml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitColumn_name_in_dml(ctx : FusionTablesSqlParser.Column_name_in_dmlContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#and_or_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAnd_or_or(ctx : FusionTablesSqlParser.And_or_orContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#geometry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGeometry(ctx : FusionTablesSqlParser.GeometryContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#circle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCircle(ctx : FusionTablesSqlParser.CircleContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#rectangle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRectangle(ctx : FusionTablesSqlParser.RectangleContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#coordinate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCoordinate(ctx : FusionTablesSqlParser.CoordinateContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitKeyword(ctx : FusionTablesSqlParser.KeywordContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOperator(ctx : FusionTablesSqlParser.OperatorContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLiteral(ctx : FusionTablesSqlParser.LiteralContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#error_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitError_message(ctx : FusionTablesSqlParser.Error_messageContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIdentifier(ctx : FusionTablesSqlParser.IdentifierContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitColumn_alias(ctx : FusionTablesSqlParser.Column_aliasContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTable_name(ctx : FusionTablesSqlParser.Table_nameContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitColumn_name(ctx : FusionTablesSqlParser.Column_nameContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#new_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNew_table_name(ctx : FusionTablesSqlParser.New_table_nameContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#view_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitView_name(ctx : FusionTablesSqlParser.View_nameContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTable_alias(ctx : FusionTablesSqlParser.Table_aliasContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#numeric_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNumeric_literal(ctx : FusionTablesSqlParser.Numeric_literalContext) : T
	/**
	 * Visit a parse tree produced by {@link FusionTablesSqlParser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitString_literal(ctx : FusionTablesSqlParser.String_literalContext) : T
}