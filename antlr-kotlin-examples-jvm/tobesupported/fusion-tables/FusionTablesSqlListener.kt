// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FusionTablesSqlParser}.
 */
interface FusionTablesSqlListener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#fusionTablesSql}.
	 * @param ctx the parse tree
	 */
	fun enterFusionTablesSql(ctx: FusionTablesSqlParser.FusionTablesSqlContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#fusionTablesSql}.
	 * @param ctx the parse tree
	 */
	fun exitFusionTablesSql(ctx: FusionTablesSqlParser.FusionTablesSqlContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	fun enterSql_stmt(ctx: FusionTablesSqlParser.Sql_stmtContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	fun exitSql_stmt(ctx: FusionTablesSqlParser.Sql_stmtContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#table_name_in_ddl}.
	 * @param ctx the parse tree
	 */
	fun enterTable_name_in_ddl(ctx: FusionTablesSqlParser.Table_name_in_ddlContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#table_name_in_ddl}.
	 * @param ctx the parse tree
	 */
	fun exitTable_name_in_ddl(ctx: FusionTablesSqlParser.Table_name_in_ddlContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#table_name_in_dml}.
	 * @param ctx the parse tree
	 */
	fun enterTable_name_in_dml(ctx: FusionTablesSqlParser.Table_name_in_dmlContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#table_name_in_dml}.
	 * @param ctx the parse tree
	 */
	fun exitTable_name_in_dml(ctx: FusionTablesSqlParser.Table_name_in_dmlContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#create_table_as_select_stmt}.
	 * @param ctx the parse tree
	 */
	fun enterCreate_table_as_select_stmt(ctx: FusionTablesSqlParser.Create_table_as_select_stmtContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#create_table_as_select_stmt}.
	 * @param ctx the parse tree
	 */
	fun exitCreate_table_as_select_stmt(ctx: FusionTablesSqlParser.Create_table_as_select_stmtContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#describe_stmt}.
	 * @param ctx the parse tree
	 */
	fun enterDescribe_stmt(ctx: FusionTablesSqlParser.Describe_stmtContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#describe_stmt}.
	 * @param ctx the parse tree
	 */
	fun exitDescribe_stmt(ctx: FusionTablesSqlParser.Describe_stmtContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#show_tables_stmt}.
	 * @param ctx the parse tree
	 */
	fun enterShow_tables_stmt(ctx: FusionTablesSqlParser.Show_tables_stmtContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#show_tables_stmt}.
	 * @param ctx the parse tree
	 */
	fun exitShow_tables_stmt(ctx: FusionTablesSqlParser.Show_tables_stmtContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	fun enterAlter_table_stmt(ctx: FusionTablesSqlParser.Alter_table_stmtContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	fun exitAlter_table_stmt(ctx: FusionTablesSqlParser.Alter_table_stmtContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	fun enterCreate_view_stmt(ctx: FusionTablesSqlParser.Create_view_stmtContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	fun exitCreate_view_stmt(ctx: FusionTablesSqlParser.Create_view_stmtContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	fun enterDrop_table_stmt(ctx: FusionTablesSqlParser.Drop_table_stmtContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	fun exitDrop_table_stmt(ctx: FusionTablesSqlParser.Drop_table_stmtContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	fun enterInsert_stmt(ctx: FusionTablesSqlParser.Insert_stmtContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	fun exitInsert_stmt(ctx: FusionTablesSqlParser.Insert_stmtContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	fun enterUpdate_stmt(ctx: FusionTablesSqlParser.Update_stmtContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	fun exitUpdate_stmt(ctx: FusionTablesSqlParser.Update_stmtContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#column_assignment}.
	 * @param ctx the parse tree
	 */
	fun enterColumn_assignment(ctx: FusionTablesSqlParser.Column_assignmentContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#column_assignment}.
	 * @param ctx the parse tree
	 */
	fun exitColumn_assignment(ctx: FusionTablesSqlParser.Column_assignmentContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	fun enterDelete_stmt(ctx: FusionTablesSqlParser.Delete_stmtContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	fun exitDelete_stmt(ctx: FusionTablesSqlParser.Delete_stmtContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#eq_comparison}.
	 * @param ctx the parse tree
	 */
	fun enterEq_comparison(ctx: FusionTablesSqlParser.Eq_comparisonContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#eq_comparison}.
	 * @param ctx the parse tree
	 */
	fun exitEq_comparison(ctx: FusionTablesSqlParser.Eq_comparisonContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#table_name_with_alias}.
	 * @param ctx the parse tree
	 */
	fun enterTable_name_with_alias(ctx: FusionTablesSqlParser.Table_name_with_aliasContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#table_name_with_alias}.
	 * @param ctx the parse tree
	 */
	fun exitTable_name_with_alias(ctx: FusionTablesSqlParser.Table_name_with_aliasContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	fun enterSelect_stmt(ctx: FusionTablesSqlParser.Select_stmtContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	fun exitSelect_stmt(ctx: FusionTablesSqlParser.Select_stmtContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	fun enterOrdering_term(ctx: FusionTablesSqlParser.Ordering_termContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	fun exitOrdering_term(ctx: FusionTablesSqlParser.Ordering_termContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#join_clause}.
	 * @param ctx the parse tree
	 */
	fun enterJoin_clause(ctx: FusionTablesSqlParser.Join_clauseContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#join_clause}.
	 * @param ctx the parse tree
	 */
	fun exitJoin_clause(ctx: FusionTablesSqlParser.Join_clauseContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#result_column}.
	 * @param ctx the parse tree
	 */
	fun enterResult_column(ctx: FusionTablesSqlParser.Result_columnContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#result_column}.
	 * @param ctx the parse tree
	 */
	fun exitResult_column(ctx: FusionTablesSqlParser.Result_columnContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#qualified_column_name}.
	 * @param ctx the parse tree
	 */
	fun enterQualified_column_name(ctx: FusionTablesSqlParser.Qualified_column_nameContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#qualified_column_name}.
	 * @param ctx the parse tree
	 */
	fun exitQualified_column_name(ctx: FusionTablesSqlParser.Qualified_column_nameContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#aggregate_exp}.
	 * @param ctx the parse tree
	 */
	fun enterAggregate_exp(ctx: FusionTablesSqlParser.Aggregate_expContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#aggregate_exp}.
	 * @param ctx the parse tree
	 */
	fun exitAggregate_exp(ctx: FusionTablesSqlParser.Aggregate_expContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#expr}.
	 * @param ctx the parse tree
	 */
	fun enterExpr(ctx: FusionTablesSqlParser.ExprContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#expr}.
	 * @param ctx the parse tree
	 */
	fun exitExpr(ctx: FusionTablesSqlParser.ExprContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#column_name_beginning_expr}.
	 * @param ctx the parse tree
	 */
	fun enterColumn_name_beginning_expr(ctx: FusionTablesSqlParser.Column_name_beginning_exprContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#column_name_beginning_expr}.
	 * @param ctx the parse tree
	 */
	fun exitColumn_name_beginning_expr(ctx: FusionTablesSqlParser.Column_name_beginning_exprContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#column_name_in_dml}.
	 * @param ctx the parse tree
	 */
	fun enterColumn_name_in_dml(ctx: FusionTablesSqlParser.Column_name_in_dmlContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#column_name_in_dml}.
	 * @param ctx the parse tree
	 */
	fun exitColumn_name_in_dml(ctx: FusionTablesSqlParser.Column_name_in_dmlContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#and_or_or}.
	 * @param ctx the parse tree
	 */
	fun enterAnd_or_or(ctx: FusionTablesSqlParser.And_or_orContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#and_or_or}.
	 * @param ctx the parse tree
	 */
	fun exitAnd_or_or(ctx: FusionTablesSqlParser.And_or_orContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#geometry}.
	 * @param ctx the parse tree
	 */
	fun enterGeometry(ctx: FusionTablesSqlParser.GeometryContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#geometry}.
	 * @param ctx the parse tree
	 */
	fun exitGeometry(ctx: FusionTablesSqlParser.GeometryContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#circle}.
	 * @param ctx the parse tree
	 */
	fun enterCircle(ctx: FusionTablesSqlParser.CircleContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#circle}.
	 * @param ctx the parse tree
	 */
	fun exitCircle(ctx: FusionTablesSqlParser.CircleContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#rectangle}.
	 * @param ctx the parse tree
	 */
	fun enterRectangle(ctx: FusionTablesSqlParser.RectangleContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#rectangle}.
	 * @param ctx the parse tree
	 */
	fun exitRectangle(ctx: FusionTablesSqlParser.RectangleContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#coordinate}.
	 * @param ctx the parse tree
	 */
	fun enterCoordinate(ctx: FusionTablesSqlParser.CoordinateContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#coordinate}.
	 * @param ctx the parse tree
	 */
	fun exitCoordinate(ctx: FusionTablesSqlParser.CoordinateContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#keyword}.
	 * @param ctx the parse tree
	 */
	fun enterKeyword(ctx: FusionTablesSqlParser.KeywordContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#keyword}.
	 * @param ctx the parse tree
	 */
	fun exitKeyword(ctx: FusionTablesSqlParser.KeywordContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#operator}.
	 * @param ctx the parse tree
	 */
	fun enterOperator(ctx: FusionTablesSqlParser.OperatorContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#operator}.
	 * @param ctx the parse tree
	 */
	fun exitOperator(ctx: FusionTablesSqlParser.OperatorContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#literal}.
	 * @param ctx the parse tree
	 */
	fun enterLiteral(ctx: FusionTablesSqlParser.LiteralContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#literal}.
	 * @param ctx the parse tree
	 */
	fun exitLiteral(ctx: FusionTablesSqlParser.LiteralContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#error_message}.
	 * @param ctx the parse tree
	 */
	fun enterError_message(ctx: FusionTablesSqlParser.Error_messageContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#error_message}.
	 * @param ctx the parse tree
	 */
	fun exitError_message(ctx: FusionTablesSqlParser.Error_messageContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	fun enterIdentifier(ctx: FusionTablesSqlParser.IdentifierContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	fun exitIdentifier(ctx: FusionTablesSqlParser.IdentifierContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	fun enterColumn_alias(ctx: FusionTablesSqlParser.Column_aliasContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	fun exitColumn_alias(ctx: FusionTablesSqlParser.Column_aliasContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	fun enterTable_name(ctx: FusionTablesSqlParser.Table_nameContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	fun exitTable_name(ctx: FusionTablesSqlParser.Table_nameContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	fun enterColumn_name(ctx: FusionTablesSqlParser.Column_nameContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	fun exitColumn_name(ctx: FusionTablesSqlParser.Column_nameContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	fun enterNew_table_name(ctx: FusionTablesSqlParser.New_table_nameContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	fun exitNew_table_name(ctx: FusionTablesSqlParser.New_table_nameContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#view_name}.
	 * @param ctx the parse tree
	 */
	fun enterView_name(ctx: FusionTablesSqlParser.View_nameContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#view_name}.
	 * @param ctx the parse tree
	 */
	fun exitView_name(ctx: FusionTablesSqlParser.View_nameContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	fun enterTable_alias(ctx: FusionTablesSqlParser.Table_aliasContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	fun exitTable_alias(ctx: FusionTablesSqlParser.Table_aliasContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	fun enterNumeric_literal(ctx: FusionTablesSqlParser.Numeric_literalContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	fun exitNumeric_literal(ctx: FusionTablesSqlParser.Numeric_literalContext)
	/**
	 * Enter a parse tree produced by {@link FusionTablesSqlParser#string_literal}.
	 * @param ctx the parse tree
	 */
	fun enterString_literal(ctx: FusionTablesSqlParser.String_literalContext)
	/**
	 * Exit a parse tree produced by {@link FusionTablesSqlParser#string_literal}.
	 * @param ctx the parse tree
	 */
	fun exitString_literal(ctx: FusionTablesSqlParser.String_literalContext)
}