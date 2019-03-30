// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.ParserRuleContext
import org.antlr.v4.kotlinruntime.tree.ErrorNode
import org.antlr.v4.kotlinruntime.tree.TerminalNode

/**
 * This class provides an empty implementation of {@link FusionTablesSqlListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
open class FusionTablesSqlBaseListener : FusionTablesSqlListener {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterFusionTablesSql(ctx: FusionTablesSqlParser.FusionTablesSqlContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitFusionTablesSql(ctx: FusionTablesSqlParser.FusionTablesSqlContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterSql_stmt(ctx: FusionTablesSqlParser.Sql_stmtContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitSql_stmt(ctx: FusionTablesSqlParser.Sql_stmtContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterTable_name_in_ddl(ctx: FusionTablesSqlParser.Table_name_in_ddlContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitTable_name_in_ddl(ctx: FusionTablesSqlParser.Table_name_in_ddlContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterTable_name_in_dml(ctx: FusionTablesSqlParser.Table_name_in_dmlContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitTable_name_in_dml(ctx: FusionTablesSqlParser.Table_name_in_dmlContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterCreate_table_as_select_stmt(ctx: FusionTablesSqlParser.Create_table_as_select_stmtContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitCreate_table_as_select_stmt(ctx: FusionTablesSqlParser.Create_table_as_select_stmtContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterDescribe_stmt(ctx: FusionTablesSqlParser.Describe_stmtContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitDescribe_stmt(ctx: FusionTablesSqlParser.Describe_stmtContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterShow_tables_stmt(ctx: FusionTablesSqlParser.Show_tables_stmtContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitShow_tables_stmt(ctx: FusionTablesSqlParser.Show_tables_stmtContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterAlter_table_stmt(ctx: FusionTablesSqlParser.Alter_table_stmtContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitAlter_table_stmt(ctx: FusionTablesSqlParser.Alter_table_stmtContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterCreate_view_stmt(ctx: FusionTablesSqlParser.Create_view_stmtContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitCreate_view_stmt(ctx: FusionTablesSqlParser.Create_view_stmtContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterDrop_table_stmt(ctx: FusionTablesSqlParser.Drop_table_stmtContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitDrop_table_stmt(ctx: FusionTablesSqlParser.Drop_table_stmtContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterInsert_stmt(ctx: FusionTablesSqlParser.Insert_stmtContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitInsert_stmt(ctx: FusionTablesSqlParser.Insert_stmtContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterUpdate_stmt(ctx: FusionTablesSqlParser.Update_stmtContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitUpdate_stmt(ctx: FusionTablesSqlParser.Update_stmtContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterColumn_assignment(ctx: FusionTablesSqlParser.Column_assignmentContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitColumn_assignment(ctx: FusionTablesSqlParser.Column_assignmentContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterDelete_stmt(ctx: FusionTablesSqlParser.Delete_stmtContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitDelete_stmt(ctx: FusionTablesSqlParser.Delete_stmtContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterEq_comparison(ctx: FusionTablesSqlParser.Eq_comparisonContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitEq_comparison(ctx: FusionTablesSqlParser.Eq_comparisonContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterTable_name_with_alias(ctx: FusionTablesSqlParser.Table_name_with_aliasContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitTable_name_with_alias(ctx: FusionTablesSqlParser.Table_name_with_aliasContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterSelect_stmt(ctx: FusionTablesSqlParser.Select_stmtContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitSelect_stmt(ctx: FusionTablesSqlParser.Select_stmtContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterOrdering_term(ctx: FusionTablesSqlParser.Ordering_termContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitOrdering_term(ctx: FusionTablesSqlParser.Ordering_termContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterJoin_clause(ctx: FusionTablesSqlParser.Join_clauseContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitJoin_clause(ctx: FusionTablesSqlParser.Join_clauseContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterResult_column(ctx: FusionTablesSqlParser.Result_columnContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitResult_column(ctx: FusionTablesSqlParser.Result_columnContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterQualified_column_name(ctx: FusionTablesSqlParser.Qualified_column_nameContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitQualified_column_name(ctx: FusionTablesSqlParser.Qualified_column_nameContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterAggregate_exp(ctx: FusionTablesSqlParser.Aggregate_expContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitAggregate_exp(ctx: FusionTablesSqlParser.Aggregate_expContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterExpr(ctx: FusionTablesSqlParser.ExprContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitExpr(ctx: FusionTablesSqlParser.ExprContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterColumn_name_beginning_expr(ctx: FusionTablesSqlParser.Column_name_beginning_exprContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitColumn_name_beginning_expr(ctx: FusionTablesSqlParser.Column_name_beginning_exprContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterColumn_name_in_dml(ctx: FusionTablesSqlParser.Column_name_in_dmlContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitColumn_name_in_dml(ctx: FusionTablesSqlParser.Column_name_in_dmlContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterAnd_or_or(ctx: FusionTablesSqlParser.And_or_orContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitAnd_or_or(ctx: FusionTablesSqlParser.And_or_orContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterGeometry(ctx: FusionTablesSqlParser.GeometryContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitGeometry(ctx: FusionTablesSqlParser.GeometryContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterCircle(ctx: FusionTablesSqlParser.CircleContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitCircle(ctx: FusionTablesSqlParser.CircleContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterRectangle(ctx: FusionTablesSqlParser.RectangleContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitRectangle(ctx: FusionTablesSqlParser.RectangleContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterCoordinate(ctx: FusionTablesSqlParser.CoordinateContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitCoordinate(ctx: FusionTablesSqlParser.CoordinateContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterKeyword(ctx: FusionTablesSqlParser.KeywordContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitKeyword(ctx: FusionTablesSqlParser.KeywordContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterOperator(ctx: FusionTablesSqlParser.OperatorContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitOperator(ctx: FusionTablesSqlParser.OperatorContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterLiteral(ctx: FusionTablesSqlParser.LiteralContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitLiteral(ctx: FusionTablesSqlParser.LiteralContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterError_message(ctx: FusionTablesSqlParser.Error_messageContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitError_message(ctx: FusionTablesSqlParser.Error_messageContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterIdentifier(ctx: FusionTablesSqlParser.IdentifierContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitIdentifier(ctx: FusionTablesSqlParser.IdentifierContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterColumn_alias(ctx: FusionTablesSqlParser.Column_aliasContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitColumn_alias(ctx: FusionTablesSqlParser.Column_aliasContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterTable_name(ctx: FusionTablesSqlParser.Table_nameContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitTable_name(ctx: FusionTablesSqlParser.Table_nameContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterColumn_name(ctx: FusionTablesSqlParser.Column_nameContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitColumn_name(ctx: FusionTablesSqlParser.Column_nameContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterNew_table_name(ctx: FusionTablesSqlParser.New_table_nameContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitNew_table_name(ctx: FusionTablesSqlParser.New_table_nameContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterView_name(ctx: FusionTablesSqlParser.View_nameContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitView_name(ctx: FusionTablesSqlParser.View_nameContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterTable_alias(ctx: FusionTablesSqlParser.Table_aliasContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitTable_alias(ctx: FusionTablesSqlParser.Table_aliasContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterNumeric_literal(ctx: FusionTablesSqlParser.Numeric_literalContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitNumeric_literal(ctx: FusionTablesSqlParser.Numeric_literalContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterString_literal(ctx: FusionTablesSqlParser.String_literalContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitString_literal(ctx: FusionTablesSqlParser.String_literalContext) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun enterEveryRule(ctx: ParserRuleContext) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun exitEveryRule(ctx: ParserRuleContext ) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun visitTerminal(node: TerminalNode ) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	override fun visitErrorNode(node: ErrorNode) { }
}