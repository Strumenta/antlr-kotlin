// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc;
import com.strumenta.kotlinmultiplatform.Arrays
import com.strumenta.kotlinmultiplatform.getType
import com.strumenta.kotlinmultiplatform.TypeDeclarator
import org.antlr.v4.runtime.misc.Utils;
import org.antlr.v4.kotlinruntime.*
import org.antlr.v4.kotlinruntime.atn.*
import org.antlr.v4.kotlinruntime.atn.ATNDeserializer
import org.antlr.v4.kotlinruntime.atn.ParserATNSimulator
import org.antlr.v4.kotlinruntime.atn.PredictionContextCache
import org.antlr.v4.kotlinruntime.dfa.*
import org.antlr.v4.kotlinruntime.tree.ParseTreeListener
import org.antlr.v4.kotlinruntime.tree.TerminalNode
import org.antlr.v4.kotlinruntime.atn.ATN.Companion.INVALID_ALT_NUMBER
import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor
import kotlin.reflect.KClass

class FusionTablesSqlParser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(FusionTablesSqlParser.FusionTablesSqlContext::class,
                                                              FusionTablesSqlParser.Sql_stmtContext::class,
                                                              FusionTablesSqlParser.Table_name_in_ddlContext::class,
                                                              FusionTablesSqlParser.Table_name_in_dmlContext::class,
                                                              FusionTablesSqlParser.Create_table_as_select_stmtContext::class,
                                                              FusionTablesSqlParser.Describe_stmtContext::class,
                                                              FusionTablesSqlParser.Show_tables_stmtContext::class,
                                                              FusionTablesSqlParser.Alter_table_stmtContext::class,
                                                              FusionTablesSqlParser.Create_view_stmtContext::class,
                                                              FusionTablesSqlParser.Drop_table_stmtContext::class,
                                                              FusionTablesSqlParser.Insert_stmtContext::class,
                                                              FusionTablesSqlParser.Update_stmtContext::class,
                                                              FusionTablesSqlParser.Column_assignmentContext::class,
                                                              FusionTablesSqlParser.Delete_stmtContext::class,
                                                              FusionTablesSqlParser.Eq_comparisonContext::class,
                                                              FusionTablesSqlParser.Table_name_with_aliasContext::class,
                                                              FusionTablesSqlParser.Select_stmtContext::class,
                                                              FusionTablesSqlParser.Ordering_termContext::class,
                                                              FusionTablesSqlParser.Join_clauseContext::class,
                                                              FusionTablesSqlParser.Result_columnContext::class,
                                                              FusionTablesSqlParser.Qualified_column_nameContext::class,
                                                              FusionTablesSqlParser.Aggregate_expContext::class,
                                                              FusionTablesSqlParser.ExprContext::class,
                                                              FusionTablesSqlParser.Column_name_beginning_exprContext::class,
                                                              FusionTablesSqlParser.Column_name_in_dmlContext::class,
                                                              FusionTablesSqlParser.And_or_orContext::class,
                                                              FusionTablesSqlParser.GeometryContext::class,
                                                              FusionTablesSqlParser.CircleContext::class,
                                                              FusionTablesSqlParser.RectangleContext::class,
                                                              FusionTablesSqlParser.CoordinateContext::class,
                                                              FusionTablesSqlParser.KeywordContext::class,
                                                              FusionTablesSqlParser.OperatorContext::class,
                                                              FusionTablesSqlParser.LiteralContext::class,
                                                              FusionTablesSqlParser.Error_messageContext::class,
                                                              FusionTablesSqlParser.IdentifierContext::class,
                                                              FusionTablesSqlParser.Column_aliasContext::class,
                                                              FusionTablesSqlParser.Table_nameContext::class,
                                                              FusionTablesSqlParser.Column_nameContext::class,
                                                              FusionTablesSqlParser.New_table_nameContext::class,
                                                              FusionTablesSqlParser.View_nameContext::class,
                                                              FusionTablesSqlParser.Table_aliasContext::class,
                                                              FusionTablesSqlParser.Numeric_literalContext::class,
                                                              FusionTablesSqlParser.String_literalContext::class)
    }

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "FusionTablesSql.g4"

    override val tokenNames: Array<String?>?
        get() = FusionTablesSqlParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = FusionTablesSqlParser.Companion.ruleNames
    override val atn: ATN
        get() = FusionTablesSqlParser.Companion.ATN

    enum class Tokens(val id: Int) {
        EOF(-1),
        T__0(1),
        T__1(2),
        T__2(3),
        T__3(4),
        K_ALTER(5),
        K_AND(6),
        K_OR(7),
        K_AS(8),
        K_ASC(9),
        K_AVERAGE(10),
        K_BY(11),
        K_BETWEEN(12),
        K_CASE(13),
        K_CIRCLE(14),
        K_COLUMN(15),
        K_CONTAINS(16),
        K_COUNT(17),
        K_CREATE(18),
        K_DELETE(19),
        K_DESC(20),
        K_DESCRIBE(21),
        K_DOES(22),
        K_CONTAIN(23),
        K_DROP(24),
        K_ENDS(25),
        K_FROM(26),
        K_GROUP(27),
        K_HAVING(28),
        K_IGNORING(29),
        K_IN(30),
        K_INSERT(31),
        K_INTO(32),
        K_JOIN(33),
        K_LATLNG(34),
        K_LEFT(35),
        K_LIKE(36),
        K_LIMIT(37),
        K_MATCHES(38),
        K_MAXIMUM(39),
        K_MINIMUM(40),
        K_NOT(41),
        K_EQUAL(42),
        K_OF(43),
        K_OFFSET(44),
        K_ON(45),
        K_ORDER(46),
        K_OUTER(47),
        K_RECTANGLE(48),
        K_RENAME(49),
        K_ST_DISTANCE(50),
        K_SELECT(51),
        K_ST_INTERSECTS(52),
        K_SUM(53),
        K_SET(54),
        K_SHOW(55),
        K_STARTS(56),
        K_TABLE(57),
        K_TABLES(58),
        K_TO(59),
        K_UPDATE(60),
        K_VALUES(61),
        K_VIEW(62),
        K_WHERE(63),
        K_WITH(64),
        LT_EQ(65),
        GT_EQ(66),
        GT(67),
        EQ(68),
        LT(69),
        LPAR(70),
        RPAR(71),
        NUMERIC_LITERAL(72),
        STRING_LITERAL(73),
        STRING(74),
        QUOTED_STRING(75),
        SINGLELINE_COMMENT(76),
        MULTILINE_COMMENT(77),
        WHITESPACE(78)
    }

    enum class Rules(val id: Int) {
        RULE_fusionTablesSql(0),
        RULE_sql_stmt(1),
        RULE_table_name_in_ddl(2),
        RULE_table_name_in_dml(3),
        RULE_create_table_as_select_stmt(4),
        RULE_describe_stmt(5),
        RULE_show_tables_stmt(6),
        RULE_alter_table_stmt(7),
        RULE_create_view_stmt(8),
        RULE_drop_table_stmt(9),
        RULE_insert_stmt(10),
        RULE_update_stmt(11),
        RULE_column_assignment(12),
        RULE_delete_stmt(13),
        RULE_eq_comparison(14),
        RULE_table_name_with_alias(15),
        RULE_select_stmt(16),
        RULE_ordering_term(17),
        RULE_join_clause(18),
        RULE_result_column(19),
        RULE_qualified_column_name(20),
        RULE_aggregate_exp(21),
        RULE_expr(22),
        RULE_column_name_beginning_expr(23),
        RULE_column_name_in_dml(24),
        RULE_and_or_or(25),
        RULE_geometry(26),
        RULE_circle(27),
        RULE_rectangle(28),
        RULE_coordinate(29),
        RULE_keyword(30),
        RULE_operator(31),
        RULE_literal(32),
        RULE_error_message(33),
        RULE_identifier(34),
        RULE_column_alias(35),
        RULE_table_name(36),
        RULE_column_name(37),
        RULE_new_table_name(38),
        RULE_view_name(39),
        RULE_table_alias(40),
        RULE_numeric_literal(41),
        RULE_string_literal(42)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("fusionTablesSql", "sql_stmt", "table_name_in_ddl", 
                                "table_name_in_dml", "create_table_as_select_stmt", 
                                "describe_stmt", "show_tables_stmt", "alter_table_stmt", 
                                "create_view_stmt", "drop_table_stmt", "insert_stmt", 
                                "update_stmt", "column_assignment", "delete_stmt", 
                                "eq_comparison", "table_name_with_alias", 
                                "select_stmt", "ordering_term", "join_clause", 
                                "result_column", "qualified_column_name", 
                                "aggregate_exp", "expr", "column_name_beginning_expr", 
                                "column_name_in_dml", "and_or_or", "geometry", 
                                "circle", "rectangle", "coordinate", "keyword", 
                                "operator", "literal", "error_message", 
                                "identifier", "column_alias", "table_name", 
                                "column_name", "new_table_name", "view_name", 
                                "table_alias", "numeric_literal", "string_literal")

        private val LITERAL_NAMES = Arrays.asList<String?>(null, "';'", 
                                                           "'*'", "','", 
                                                           "'.'", null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, "'<='", 
                                                           "'>='", "'>'", 
                                                           "'='", "'<'", 
                                                           "'('", "')'")
        private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, null, 
                                                            null, null, 
                                                            null, "K_ALTER", 
                                                            "K_AND", "K_OR", 
                                                            "K_AS", "K_ASC", 
                                                            "K_AVERAGE", 
                                                            "K_BY", "K_BETWEEN", 
                                                            "K_CASE", "K_CIRCLE", 
                                                            "K_COLUMN", 
                                                            "K_CONTAINS", 
                                                            "K_COUNT", "K_CREATE", 
                                                            "K_DELETE", 
                                                            "K_DESC", "K_DESCRIBE", 
                                                            "K_DOES", "K_CONTAIN", 
                                                            "K_DROP", "K_ENDS", 
                                                            "K_FROM", "K_GROUP", 
                                                            "K_HAVING", 
                                                            "K_IGNORING", 
                                                            "K_IN", "K_INSERT", 
                                                            "K_INTO", "K_JOIN", 
                                                            "K_LATLNG", 
                                                            "K_LEFT", "K_LIKE", 
                                                            "K_LIMIT", "K_MATCHES", 
                                                            "K_MAXIMUM", 
                                                            "K_MINIMUM", 
                                                            "K_NOT", "K_EQUAL", 
                                                            "K_OF", "K_OFFSET", 
                                                            "K_ON", "K_ORDER", 
                                                            "K_OUTER", "K_RECTANGLE", 
                                                            "K_RENAME", 
                                                            "K_ST_DISTANCE", 
                                                            "K_SELECT", 
                                                            "K_ST_INTERSECTS", 
                                                            "K_SUM", "K_SET", 
                                                            "K_SHOW", "K_STARTS", 
                                                            "K_TABLE", "K_TABLES", 
                                                            "K_TO", "K_UPDATE", 
                                                            "K_VALUES", 
                                                            "K_VIEW", "K_WHERE", 
                                                            "K_WITH", "LT_EQ", 
                                                            "GT_EQ", "GT", 
                                                            "EQ", "LT", 
                                                            "LPAR", "RPAR", 
                                                            "NUMERIC_LITERAL", 
                                                            "STRING_LITERAL", 
                                                            "STRING", "QUOTED_STRING", 
                                                            "SINGLELINE_COMMENT", 
                                                            "MULTILINE_COMMENT", 
                                                            "WHITESPACE")

        val VOCABULARY = VocabularyImpl(LITERAL_NAMES.toTypedArray(), SYMBOLIC_NAMES.toTypedArray())

        val tokenNames: Array<String?> = Array<String?>(SYMBOLIC_NAMES.size) {
            var el = VOCABULARY.getLiteralName(it)
            if (el == null) {
                el = VOCABULARY.getSymbolicName(it)
            }

            if (el == null) {
                el = "<INVALID>"
            }
            el
        }

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u0050\u0204\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0004\u001c\u0009\u001c\u0004\u001d\u0009\u001d\u0004\u001e\u0009\u001e\u0004\u001f\u0009\u001f\u0004\u0020\u0009\u0020\u0004\u0021\u0009\u0021\u0004\u0022\u0009\u0022\u0004\u0023\u0009\u0023\u0004\u0024\u0009\u0024\u0004\u0025\u0009\u0025\u0004\u0026\u0009\u0026\u0004\u0027\u0009\u0027\u0004\u0028\u0009\u0028\u0004\u0029\u0009\u0029\u0004\u002a\u0009\u002a\u0004\u002b\u0009\u002b\u0004\u002c\u0009\u002c\u0003\u0002\u0007\u0002\u005a\u000a\u0002\u000c\u0002\u000e\u0002\u005d\u000b\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0005\u0003\u0069\u000a\u0003\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0007\u000a\u0090\u000a\u000a\u000c\u000a\u000e\u000a\u0093\u000b\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0005\u000a\u0099\u000a\u000a\u0003\u000a\u0007\u000a\u009c\u000a\u000a\u000c\u000a\u000e\u000a\u009f\u000b\u000a\u0003\u000a\u0003\u000a\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0007\u000c\u00ae\u000a\u000c\u000c\u000c\u000e\u000c\u00b1\u000b\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0007\u000c\u00ba\u000a\u000c\u000c\u000c\u000e\u000c\u00bd\u000b\u000c\u0003\u000c\u0003\u000c\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0007\u000d\u00c7\u000a\u000d\u000c\u000d\u000e\u000d\u00ca\u000b\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0005\u000f\u00db\u000a\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0005\u0011\u00e4\u000a\u0011\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0007\u0012\u00ea\u000a\u0012\u000c\u0012\u000e\u0012\u00ed\u000b\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0007\u0012\u00f2\u000a\u0012\u000c\u0012\u000e\u0012\u00f5\u000b\u0012\u0003\u0012\u0003\u0012\u0005\u0012\u00f9\u000a\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0007\u0012\u0100\u000a\u0012\u000c\u0012\u000e\u0012\u0103\u000b\u0012\u0005\u0012\u0105\u000a\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0007\u0012\u010c\u000a\u0012\u000c\u0012\u000e\u0012\u010f\u000b\u0012\u0005\u0012\u0111\u000a\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0005\u0012\u0117\u000a\u0012\u0005\u0012\u0119\u000a\u0012\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0005\u0013\u0123\u000a\u0013\u0003\u0013\u0005\u0013\u0126\u000a\u0013\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0005\u0015\u0138\u000a\u0015\u0003\u0016\u0003\u0016\u0003\u0016\u0005\u0016\u013d\u000a\u0016\u0003\u0016\u0003\u0016\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u014c\u000a\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u015f\u000a\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u0165\u000a\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0007\u0018\u016d\u000a\u0018\u000c\u0018\u000e\u0018\u0170\u000b\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u0176\u000a\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u0180\u000a\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u018b\u000a\u0018\u0005\u0018\u018d\u000a\u0018\u0003\u0019\u0003\u0019\u0003\u001a\u0003\u001a\u0003\u001b\u0003\u001b\u0003\u001c\u0003\u001c\u0005\u001c\u0197\u000a\u001c\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0005\u0020\u01e8\u000a\u0020\u0003\u0021\u0003\u0021\u0003\u0022\u0003\u0022\u0005\u0022\u01ee\u000a\u0022\u0003\u0023\u0003\u0023\u0003\u0024\u0003\u0024\u0003\u0025\u0003\u0025\u0003\u0026\u0003\u0026\u0003\u0027\u0003\u0027\u0003\u0028\u0003\u0028\u0003\u0029\u0003\u0029\u0003\u002a\u0003\u002a\u0003\u002b\u0003\u002b\u0003\u002c\u0003\u002c\u0003\u002c\u0002\u0002\u002d\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0020\u0022\u0024\u0026\u0028\u002a\u002c\u002e\u0030\u0032\u0034\u0036\u0038\u003a\u003c\u003e\u0040\u0042\u0044\u0046\u0048\u004a\u004c\u004e\u0050\u0052\u0054\u0056\u0002\u0006\u0004\u0002\u000b\u000b\u0016\u0016\u0006\u0002\u000c\u000c\u0013\u0013\u0029\u002a\u0037\u0037\u0003\u0002\u0008\u0009\u0003\u0002\u0043\u0047\u0002\u0245\u0002\u005b\u0003\u0002\u0002\u0002\u0004\u0068\u0003\u0002\u0002\u0002\u0006\u006c\u0003\u0002\u0002\u0002\u0008\u006e\u0003\u0002\u0002\u0002\u000a\u0070\u0003\u0002\u0002\u0002\u000c\u0079\u0003\u0002\u0002\u0002\u000e\u007c\u0003\u0002\u0002\u0002\u0010\u007f\u0003\u0002\u0002\u0002\u0012\u0086\u0003\u0002\u0002\u0002\u0014\u00a2\u0003\u0002\u0002\u0002\u0016\u00a6\u0003\u0002\u0002\u0002\u0018\u00c0\u0003\u0002\u0002\u0002\u001a\u00ce\u0003\u0002\u0002\u0002\u001c\u00d2\u0003\u0002\u0002\u0002\u001e\u00dc\u0003\u0002\u0002\u0002\u0020\u00e0\u0003\u0002\u0002\u0002\u0022\u00e5\u0003\u0002\u0002\u0002\u0024\u0122\u0003\u0002\u0002\u0002\u0026\u0127\u0003\u0002\u0002\u0002\u0028\u0137\u0003\u0002\u0002\u0002\u002a\u013c\u0003\u0002\u0002\u0002\u002c\u0140\u0003\u0002\u0002\u0002\u002e\u018c\u0003\u0002\u0002\u0002\u0030\u018e\u0003\u0002\u0002\u0002\u0032\u0190\u0003\u0002\u0002\u0002\u0034\u0192\u0003\u0002\u0002\u0002\u0036\u0196\u0003\u0002\u0002\u0002\u0038\u0198\u0003\u0002\u0002\u0002\u003a\u019f\u0003\u0002\u0002\u0002\u003c\u01a6\u0003\u0002\u0002\u0002\u003e\u01e7\u0003\u0002\u0002\u0002\u0040\u01e9\u0003\u0002\u0002\u0002\u0042\u01ed\u0003\u0002\u0002\u0002\u0044\u01ef\u0003\u0002\u0002\u0002\u0046\u01f1\u0003\u0002\u0002\u0002\u0048\u01f3\u0003\u0002\u0002\u0002\u004a\u01f5\u0003\u0002\u0002\u0002\u004c\u01f7\u0003\u0002\u0002\u0002\u004e\u01f9\u0003\u0002\u0002\u0002\u0050\u01fb\u0003\u0002\u0002\u0002\u0052\u01fd\u0003\u0002\u0002\u0002\u0054\u01ff\u0003\u0002\u0002\u0002\u0056\u0201\u0003\u0002\u0002\u0002\u0058\u005a\u0005\u0004\u0003\u0002\u0059\u0058\u0003\u0002\u0002\u0002\u005a\u005d\u0003\u0002\u0002\u0002\u005b\u0059\u0003\u0002\u0002\u0002\u005b\u005c\u0003\u0002\u0002\u0002\u005c\u0003\u0003\u0002\u0002\u0002\u005d\u005b\u0003\u0002\u0002\u0002\u005e\u0069\u0005\u0010\u0009\u0002\u005f\u0069\u0005\u0022\u0012\u0002\u0060\u0069\u0005\u0012\u000a\u0002\u0061\u0069\u0005\u000a\u0006\u0002\u0062\u0069\u0005\u001c\u000f\u0002\u0063\u0069\u0005\u0014\u000b\u0002\u0064\u0069\u0005\u0016\u000c\u0002\u0065\u0069\u0005\u0018\u000d\u0002\u0066\u0069\u0005\u000c\u0007\u0002\u0067\u0069\u0005\u000e\u0008\u0002\u0068\u005e\u0003\u0002\u0002\u0002\u0068\u005f\u0003\u0002\u0002\u0002\u0068\u0060\u0003\u0002\u0002\u0002\u0068\u0061\u0003\u0002\u0002\u0002\u0068\u0062\u0003\u0002\u0002\u0002\u0068\u0063\u0003\u0002\u0002\u0002\u0068\u0064\u0003\u0002\u0002\u0002\u0068\u0065\u0003\u0002\u0002\u0002\u0068\u0066\u0003\u0002\u0002\u0002\u0068\u0067\u0003\u0002\u0002\u0002\u0069\u006a\u0003\u0002\u0002\u0002\u006a\u006b\u0007\u0003\u0002\u0002\u006b\u0005\u0003\u0002\u0002\u0002\u006c\u006d\u0005\u004a\u0026\u0002\u006d\u0007\u0003\u0002\u0002\u0002\u006e\u006f\u0005\u004a\u0026\u0002\u006f\u0009\u0003\u0002\u0002\u0002\u0070\u0071\u0007\u0014\u0002\u0002\u0071\u0072\u0007\u003b\u0002\u0002\u0072\u0073\u0005\u0046\u0024\u0002\u0073\u0074\u0007\u000a\u0002\u0002\u0074\u0075\u0007\u0035\u0002\u0002\u0075\u0076\u0007\u0004\u0002\u0002\u0076\u0077\u0007\u001c\u0002\u0002\u0077\u0078\u0005\u0006\u0004\u0002\u0078\u000b\u0003\u0002\u0002\u0002\u0079\u007a\u0007\u0017\u0002\u0002\u007a\u007b\u0005\u0006\u0004\u0002\u007b\u000d\u0003\u0002\u0002\u0002\u007c\u007d\u0007\u0039\u0002\u0002\u007d\u007e\u0007\u003c\u0002\u0002\u007e\u000f\u0003\u0002\u0002\u0002\u007f\u0080\u0007\u0007\u0002\u0002\u0080\u0081\u0007\u003b\u0002\u0002\u0081\u0082\u0005\u0006\u0004\u0002\u0082\u0083\u0007\u0033\u0002\u0002\u0083\u0084\u0007\u003d\u0002\u0002\u0084\u0085\u0005\u0046\u0024\u0002\u0085\u0011\u0003\u0002\u0002\u0002\u0086\u0087\u0007\u0014\u0002\u0002\u0087\u0088\u0007\u0040\u0002\u0002\u0088\u0089\u0005\u0050\u0029\u0002\u0089\u008a\u0007\u000a\u0002\u0002\u008a\u008b\u0007\u0048\u0002\u0002\u008b\u008c\u0007\u0035\u0002\u0002\u008c\u0091\u0005\u0028\u0015\u0002\u008d\u008e\u0007\u0005\u0002\u0002\u008e\u0090\u0005\u0028\u0015\u0002\u008f\u008d\u0003\u0002\u0002\u0002\u0090\u0093\u0003\u0002\u0002\u0002\u0091\u008f\u0003\u0002\u0002\u0002\u0091\u0092\u0003\u0002\u0002\u0002\u0092\u0094\u0003\u0002\u0002\u0002\u0093\u0091\u0003\u0002\u0002\u0002\u0094\u0095\u0007\u001c\u0002\u0002\u0095\u0098\u0005\u0020\u0011\u0002\u0096\u0097\u0007\u0041\u0002\u0002\u0097\u0099\u0005\u002e\u0018\u0002\u0098\u0096\u0003\u0002\u0002\u0002\u0098\u0099\u0003\u0002\u0002\u0002\u0099\u009d\u0003\u0002\u0002\u0002\u009a\u009c\u0005\u0026\u0014\u0002\u009b\u009a\u0003\u0002\u0002\u0002\u009c\u009f\u0003\u0002\u0002\u0002\u009d\u009b\u0003\u0002\u0002\u0002\u009d\u009e\u0003\u0002\u0002\u0002\u009e\u00a0\u0003\u0002\u0002\u0002\u009f\u009d\u0003\u0002\u0002\u0002\u00a0\u00a1\u0007\u0049\u0002\u0002\u00a1\u0013\u0003\u0002\u0002\u0002\u00a2\u00a3\u0007\u001a\u0002\u0002\u00a3\u00a4\u0007\u003b\u0002\u0002\u00a4\u00a5\u0005\u0006\u0004\u0002\u00a5\u0015\u0003\u0002\u0002\u0002\u00a6\u00a7\u0007\u0021\u0002\u0002\u00a7\u00a8\u0007\u0022\u0002\u0002\u00a8\u00a9\u0005\u0008\u0005\u0002\u00a9\u00aa\u0007\u0048\u0002\u0002\u00aa\u00af\u0005\u0032\u001a\u0002\u00ab\u00ac\u0007\u0005\u0002\u0002\u00ac\u00ae\u0005\u0032\u001a\u0002\u00ad\u00ab\u0003\u0002\u0002\u0002\u00ae\u00b1\u0003\u0002\u0002\u0002\u00af\u00ad\u0003\u0002\u0002\u0002\u00af\u00b0\u0003\u0002\u0002\u0002\u00b0\u00b2\u0003\u0002\u0002\u0002\u00b1\u00af\u0003\u0002\u0002\u0002\u00b2\u00b3\u0007\u0049\u0002\u0002\u00b3\u00b4\u0003\u0002\u0002\u0002\u00b4\u00b5\u0007\u003f\u0002\u0002\u00b5\u00b6\u0007\u0048\u0002\u0002\u00b6\u00bb\u0005\u0042\u0022\u0002\u00b7\u00b8\u0007\u0005\u0002\u0002\u00b8\u00ba\u0005\u0042\u0022\u0002\u00b9\u00b7\u0003\u0002\u0002\u0002\u00ba\u00bd\u0003\u0002\u0002\u0002\u00bb\u00b9\u0003\u0002\u0002\u0002\u00bb\u00bc\u0003\u0002\u0002\u0002\u00bc\u00be\u0003\u0002\u0002\u0002\u00bd\u00bb\u0003\u0002\u0002\u0002\u00be\u00bf\u0007\u0049\u0002\u0002\u00bf\u0017\u0003\u0002\u0002\u0002\u00c0\u00c1\u0007\u003e\u0002\u0002\u00c1\u00c2\u0005\u0008\u0005\u0002\u00c2\u00c3\u0007\u0038\u0002\u0002\u00c3\u00c8\u0005\u001a\u000e\u0002\u00c4\u00c5\u0007\u0005\u0002\u0002\u00c5\u00c7\u0005\u001a\u000e\u0002\u00c6\u00c4\u0003\u0002\u0002\u0002\u00c7\u00ca\u0003\u0002\u0002\u0002\u00c8\u00c6\u0003\u0002\u0002\u0002\u00c8\u00c9\u0003\u0002\u0002\u0002\u00c9\u00cb\u0003\u0002\u0002\u0002\u00ca\u00c8\u0003\u0002\u0002\u0002\u00cb\u00cc\u0007\u0041\u0002\u0002\u00cc\u00cd\u0005\u001e\u0010\u0002\u00cd\u0019\u0003\u0002\u0002\u0002\u00ce\u00cf\u0005\u0032\u001a\u0002\u00cf\u00d0\u0007\u0046\u0002\u0002\u00d0\u00d1\u0005\u0042\u0022\u0002\u00d1\u001b\u0003\u0002\u0002\u0002\u00d2\u00d3\u0007\u0015\u0002\u0002\u00d3\u00d4\u0007\u001c\u0002\u0002\u00d4\u00da\u0005\u0008\u0005\u0002\u00d5\u00d6\u0007\u0041\u0002\u0002\u00d6\u00d7\u0005\u0032\u001a\u0002\u00d7\u00d8\u0007\u0046\u0002\u0002\u00d8\u00d9\u0005\u0042\u0022\u0002\u00d9\u00db\u0003\u0002\u0002\u0002\u00da\u00d5\u0003\u0002\u0002\u0002\u00da\u00db\u0003\u0002\u0002\u0002\u00db\u001d\u0003\u0002\u0002\u0002\u00dc\u00dd\u0005\u0046\u0024\u0002\u00dd\u00de\u0007\u0046\u0002\u0002\u00de\u00df\u0005\u0056\u002c\u0002\u00df\u001f\u0003\u0002\u0002\u0002\u00e0\u00e3\u0005\u004a\u0026\u0002\u00e1\u00e2\u0007\u000a\u0002\u0002\u00e2\u00e4\u0005\u0052\u002a\u0002\u00e3\u00e1\u0003\u0002\u0002\u0002\u00e3\u00e4\u0003\u0002\u0002\u0002\u00e4\u0021\u0003\u0002\u0002\u0002\u00e5\u00e6\u0007\u0035\u0002\u0002\u00e6\u00eb\u0005\u0028\u0015\u0002\u00e7\u00e8\u0007\u0005\u0002\u0002\u00e8\u00ea\u0005\u0028\u0015\u0002\u00e9\u00e7\u0003\u0002\u0002\u0002\u00ea\u00ed\u0003\u0002\u0002\u0002\u00eb\u00e9\u0003\u0002\u0002\u0002\u00eb\u00ec\u0003\u0002\u0002\u0002\u00ec\u00ee\u0003\u0002\u0002\u0002\u00ed\u00eb\u0003\u0002\u0002\u0002\u00ee\u00ef\u0007\u001c\u0002\u0002\u00ef\u00f3\u0005\u0020\u0011\u0002\u00f0\u00f2\u0005\u0026\u0014\u0002\u00f1\u00f0\u0003\u0002\u0002\u0002\u00f2\u00f5\u0003\u0002\u0002\u0002\u00f3\u00f1\u0003\u0002\u0002\u0002\u00f3\u00f4\u0003\u0002\u0002\u0002\u00f4\u00f8\u0003\u0002\u0002\u0002\u00f5\u00f3\u0003\u0002\u0002\u0002\u00f6\u00f7\u0007\u0041\u0002\u0002\u00f7\u00f9\u0005\u002e\u0018\u0002\u00f8\u00f6\u0003\u0002\u0002\u0002\u00f8\u00f9\u0003\u0002\u0002\u0002\u00f9\u0104\u0003\u0002\u0002\u0002\u00fa\u00fb\u0007\u001d\u0002\u0002\u00fb\u00fc\u0007\u000d\u0002\u0002\u00fc\u0101\u0005\u002a\u0016\u0002\u00fd\u00fe\u0007\u0005\u0002\u0002\u00fe\u0100\u0005\u002a\u0016\u0002\u00ff\u00fd\u0003\u0002\u0002\u0002\u0100\u0103\u0003\u0002\u0002\u0002\u0101\u00ff\u0003\u0002\u0002\u0002\u0101\u0102\u0003\u0002\u0002\u0002\u0102\u0105\u0003\u0002\u0002\u0002\u0103\u0101\u0003\u0002\u0002\u0002\u0104\u00fa\u0003\u0002\u0002\u0002\u0104\u0105\u0003\u0002\u0002\u0002\u0105\u0110\u0003\u0002\u0002\u0002\u0106\u0107\u0007\u0030\u0002\u0002\u0107\u0108\u0007\u000d\u0002\u0002\u0108\u010d\u0005\u0024\u0013\u0002\u0109\u010a\u0007\u0005\u0002\u0002\u010a\u010c\u0005\u0024\u0013\u0002\u010b\u0109\u0003\u0002\u0002\u0002\u010c\u010f\u0003\u0002\u0002\u0002\u010d\u010b\u0003\u0002\u0002\u0002\u010d\u010e\u0003\u0002\u0002\u0002\u010e\u0111\u0003\u0002\u0002\u0002\u010f\u010d\u0003\u0002\u0002\u0002\u0110\u0106\u0003\u0002\u0002\u0002\u0110\u0111\u0003\u0002\u0002\u0002\u0111\u0118\u0003\u0002\u0002\u0002\u0112\u0113\u0007\u002e\u0002\u0002\u0113\u0116\u0005\u0054\u002b\u0002\u0114\u0115\u0007\u0027\u0002\u0002\u0115\u0117\u0005\u0054\u002b\u0002\u0116\u0114\u0003\u0002\u0002\u0002\u0116\u0117\u0003\u0002\u0002\u0002\u0117\u0119\u0003\u0002\u0002\u0002\u0118\u0112\u0003\u0002\u0002\u0002\u0118\u0119\u0003\u0002\u0002\u0002\u0119\u0023\u0003\u0002\u0002\u0002\u011a\u0123\u0005\u002a\u0016\u0002\u011b\u011c\u0007\u0034\u0002\u0002\u011c\u011d\u0007\u0048\u0002\u0002\u011d\u011e\u0005\u002a\u0016\u0002\u011e\u011f\u0007\u0005\u0002\u0002\u011f\u0120\u0005\u003c\u001f\u0002\u0120\u0121\u0007\u0049\u0002\u0002\u0121\u0123\u0003\u0002\u0002\u0002\u0122\u011a\u0003\u0002\u0002\u0002\u0122\u011b\u0003\u0002\u0002\u0002\u0123\u0125\u0003\u0002\u0002\u0002\u0124\u0126\u0009\u0002\u0002\u0002\u0125\u0124\u0003\u0002\u0002\u0002\u0125\u0126\u0003\u0002\u0002\u0002\u0126\u0025\u0003\u0002\u0002\u0002\u0127\u0128\u0007\u0025\u0002\u0002\u0128\u0129\u0007\u0031\u0002\u0002\u0129\u012a\u0007\u0023\u0002\u0002\u012a\u012b\u0005\u0020\u0011\u0002\u012b\u012c\u0007\u002f\u0002\u0002\u012c\u012d\u0005\u002a\u0016\u0002\u012d\u012e\u0007\u0046\u0002\u0002\u012e\u012f\u0005\u002a\u0016\u0002\u012f\u0027\u0003\u0002\u0002\u0002\u0130\u0138\u0007\u0004\u0002\u0002\u0131\u0132\u0005\u004a\u0026\u0002\u0132\u0133\u0007\u0006\u0002\u0002\u0133\u0134\u0007\u0004\u0002\u0002\u0134\u0138\u0003\u0002\u0002\u0002\u0135\u0138\u0005\u002a\u0016\u0002\u0136\u0138\u0005\u002c\u0017\u0002\u0137\u0130\u0003\u0002\u0002\u0002\u0137\u0131\u0003\u0002\u0002\u0002\u0137\u0135\u0003\u0002\u0002\u0002\u0137\u0136\u0003\u0002\u0002\u0002\u0138\u0029\u0003\u0002\u0002\u0002\u0139\u013a\u0005\u004a\u0026\u0002\u013a\u013b\u0007\u0006\u0002\u0002\u013b\u013d\u0003\u0002\u0002\u0002\u013c\u0139\u0003\u0002\u0002\u0002\u013c\u013d\u0003\u0002\u0002\u0002\u013d\u013e\u0003\u0002\u0002\u0002\u013e\u013f\u0005\u004c\u0027\u0002\u013f\u002b\u0003\u0002\u0002\u0002\u0140\u0141\u0009\u0003\u0002\u0002\u0141\u0142\u0007\u0048\u0002\u0002\u0142\u0143\u0005\u002a\u0016\u0002\u0143\u0144\u0007\u0049\u0002\u0002\u0144\u002d\u0003\u0002\u0002\u0002\u0145\u0146\u0005\u0030\u0019\u0002\u0146\u0147\u0005\u0040\u0021\u0002\u0147\u014b\u0005\u0042\u0022\u0002\u0148\u0149\u0005\u0034\u001b\u0002\u0149\u014a\u0005\u002e\u0018\u0002\u014a\u014c\u0003\u0002\u0002\u0002\u014b\u0148\u0003\u0002\u0002\u0002\u014b\u014c\u0003\u0002\u0002\u0002\u014c\u018d\u0003\u0002\u0002\u0002\u014d\u015e\u0005\u0030\u0019\u0002\u014e\u015f\u0007\u0026\u0002\u0002\u014f\u015f\u0007\u0028\u0002\u0002\u0150\u0151\u0007\u003a\u0002\u0002\u0151\u015f\u0007\u0042\u0002\u0002\u0152\u0153\u0007\u001b\u0002\u0002\u0153\u015f\u0007\u0042\u0002\u0002\u0154\u015f\u0007\u0012\u0002\u0002\u0155\u0156\u0007\u0012\u0002\u0002\u0156\u0157\u0007\u001f\u0002\u0002\u0157\u015f\u0007\u000f\u0002\u0002\u0158\u0159\u0007\u0018\u0002\u0002\u0159\u015a\u0007\u002b\u0002\u0002\u015a\u015f\u0007\u0019\u0002\u0002\u015b\u015c\u0007\u002b\u0002\u0002\u015c\u015d\u0007\u002c\u0002\u0002\u015d\u015f\u0007\u003d\u0002\u0002\u015e\u014e\u0003\u0002\u0002\u0002\u015e\u014f\u0003\u0002\u0002\u0002\u015e\u0150\u0003\u0002\u0002\u0002\u015e\u0152\u0003\u0002\u0002\u0002\u015e\u0154\u0003\u0002\u0002\u0002\u015e\u0155\u0003\u0002\u0002\u0002\u015e\u0158\u0003\u0002\u0002\u0002\u015e\u015b\u0003\u0002\u0002\u0002\u015f\u0160\u0003\u0002\u0002\u0002\u0160\u0164\u0005\u0056\u002c\u0002\u0161\u0162\u0005\u0034\u001b\u0002\u0162\u0163\u0005\u002e\u0018\u0002\u0163\u0165\u0003\u0002\u0002\u0002\u0164\u0161\u0003\u0002\u0002\u0002\u0164\u0165\u0003\u0002\u0002\u0002\u0165\u018d\u0003\u0002\u0002\u0002\u0166\u0167\u0005\u0030\u0019\u0002\u0167\u0168\u0007\u0020\u0002\u0002\u0168\u0169\u0007\u0048\u0002\u0002\u0169\u016e\u0005\u0056\u002c\u0002\u016a\u016b\u0007\u0005\u0002\u0002\u016b\u016d\u0005\u0056\u002c\u0002\u016c\u016a\u0003\u0002\u0002\u0002\u016d\u0170\u0003\u0002\u0002\u0002\u016e\u016c\u0003\u0002\u0002\u0002\u016e\u016f\u0003\u0002\u0002\u0002\u016f\u0171\u0003\u0002\u0002\u0002\u0170\u016e\u0003\u0002\u0002\u0002\u0171\u0175\u0007\u0049\u0002\u0002\u0172\u0173\u0005\u0034\u001b\u0002\u0173\u0174\u0005\u002e\u0018\u0002\u0174\u0176\u0003\u0002\u0002\u0002\u0175\u0172\u0003\u0002\u0002\u0002\u0175\u0176\u0003\u0002\u0002\u0002\u0176\u018d\u0003\u0002\u0002\u0002\u0177\u0178\u0005\u0030\u0019\u0002\u0178\u0179\u0007\u000e\u0002\u0002\u0179\u017a\u0005\u0042\u0022\u0002\u017a\u017b\u0007\u0008\u0002\u0002\u017b\u017f\u0005\u0042\u0022\u0002\u017c\u017d\u0005\u0034\u001b\u0002\u017d\u017e\u0005\u002e\u0018\u0002\u017e\u0180\u0003\u0002\u0002\u0002\u017f\u017c\u0003\u0002\u0002\u0002\u017f\u0180\u0003\u0002\u0002\u0002\u0180\u018d\u0003\u0002\u0002\u0002\u0181\u0182\u0007\u0036\u0002\u0002\u0182\u0183\u0007\u0048\u0002\u0002\u0183\u0184\u0005\u002a\u0016\u0002\u0184\u0185\u0007\u0005\u0002\u0002\u0185\u0186\u0005\u0036\u001c\u0002\u0186\u018a\u0007\u0049\u0002\u0002\u0187\u0188\u0005\u0034\u001b\u0002\u0188\u0189\u0005\u002e\u0018\u0002\u0189\u018b\u0003\u0002\u0002\u0002\u018a\u0187\u0003\u0002\u0002\u0002\u018a\u018b\u0003\u0002\u0002\u0002\u018b\u018d\u0003\u0002\u0002\u0002\u018c\u0145\u0003\u0002\u0002\u0002\u018c\u014d\u0003\u0002\u0002\u0002\u018c\u0166\u0003\u0002\u0002\u0002\u018c\u0177\u0003\u0002\u0002\u0002\u018c\u0181\u0003\u0002\u0002\u0002\u018d\u002f\u0003\u0002\u0002\u0002\u018e\u018f\u0005\u002a\u0016\u0002\u018f\u0031\u0003\u0002\u0002\u0002\u0190\u0191\u0005\u004c\u0027\u0002\u0191\u0033\u0003\u0002\u0002\u0002\u0192\u0193\u0009\u0004\u0002\u0002\u0193\u0035\u0003\u0002\u0002\u0002\u0194\u0197\u0005\u0038\u001d\u0002\u0195\u0197\u0005\u003a\u001e\u0002\u0196\u0194\u0003\u0002\u0002\u0002\u0196\u0195\u0003\u0002\u0002\u0002\u0197\u0037\u0003\u0002\u0002\u0002\u0198\u0199\u0007\u0010\u0002\u0002\u0199\u019a\u0007\u0048\u0002\u0002\u019a\u019b\u0005\u003c\u001f\u0002\u019b\u019c\u0007\u0005\u0002\u0002\u019c\u019d\u0005\u0054\u002b\u0002\u019d\u019e\u0007\u0049\u0002\u0002\u019e\u0039\u0003\u0002\u0002\u0002\u019f\u01a0\u0007\u0032\u0002\u0002\u01a0\u01a1\u0007\u0048\u0002\u0002\u01a1\u01a2\u0005\u003c\u001f\u0002\u01a2\u01a3\u0007\u0005\u0002\u0002\u01a3\u01a4\u0005\u003c\u001f\u0002\u01a4\u01a5\u0007\u0049\u0002\u0002\u01a5\u003b\u0003\u0002\u0002\u0002\u01a6\u01a7\u0007\u0024\u0002\u0002\u01a7\u01a8\u0007\u0048\u0002\u0002\u01a8\u01a9\u0005\u0054\u002b\u0002\u01a9\u01aa\u0007\u0005\u0002\u0002\u01aa\u01ab\u0005\u0054\u002b\u0002\u01ab\u01ac\u0007\u0049\u0002\u0002\u01ac\u003d\u0003\u0002\u0002\u0002\u01ad\u01e8\u0003\u0002\u0002\u0002\u01ae\u01e8\u0007\u0007\u0002\u0002\u01af\u01e8\u0007\u0008\u0002\u0002\u01b0\u01e8\u0007\u0009\u0002\u0002\u01b1\u01e8\u0007\u000a\u0002\u0002\u01b2\u01e8\u0007\u000b\u0002\u0002\u01b3\u01e8\u0007\u000c\u0002\u0002\u01b4\u01e8\u0007\u000d\u0002\u0002\u01b5\u01e8\u0007\u000e\u0002\u0002\u01b6\u01e8\u0007\u000f\u0002\u0002\u01b7\u01e8\u0007\u0010\u0002\u0002\u01b8\u01e8\u0007\u0011\u0002\u0002\u01b9\u01e8\u0007\u0019\u0002\u0002\u01ba\u01e8\u0007\u0012\u0002\u0002\u01bb\u01e8\u0007\u0013\u0002\u0002\u01bc\u01e8\u0007\u0014\u0002\u0002\u01bd\u01e8\u0007\u0015\u0002\u0002\u01be\u01e8\u0007\u0016\u0002\u0002\u01bf\u01e8\u0007\u0018\u0002\u0002\u01c0\u01e8\u0007\u001a\u0002\u0002\u01c1\u01e8\u0007\u001b\u0002\u0002\u01c2\u01e8\u0007\u002c\u0002\u0002\u01c3\u01e8\u0007\u001c\u0002\u0002\u01c4\u01e8\u0007\u001d\u0002\u0002\u01c5\u01e8\u0007\u001e\u0002\u0002\u01c6\u01e8\u0007\u001f\u0002\u0002\u01c7\u01e8\u0007\u0020\u0002\u0002\u01c8\u01e8\u0007\u0021\u0002\u0002\u01c9\u01e8\u0007\u0022\u0002\u0002\u01ca\u01e8\u0007\u0023\u0002\u0002\u01cb\u01e8\u0007\u0024\u0002\u0002\u01cc\u01e8\u0007\u0025\u0002\u0002\u01cd\u01e8\u0007\u0026\u0002\u0002\u01ce\u01e8\u0007\u0027\u0002\u0002\u01cf\u01e8\u0007\u0028\u0002\u0002\u01d0\u01e8\u0007\u0029\u0002\u0002\u01d1\u01e8\u0007\u002a\u0002\u0002\u01d2\u01e8\u0007\u002b\u0002\u0002\u01d3\u01e8\u0007\u002d\u0002\u0002\u01d4\u01e8\u0007\u002e\u0002\u0002\u01d5\u01e8\u0007\u002f\u0002\u0002\u01d6\u01e8\u0007\u0030\u0002\u0002\u01d7\u01e8\u0007\u0031\u0002\u0002\u01d8\u01e8\u0007\u0032\u0002\u0002\u01d9\u01e8\u0007\u0033\u0002\u0002\u01da\u01e8\u0007\u0035\u0002\u0002\u01db\u01e8\u0007\u0038\u0002\u0002\u01dc\u01e8\u0007\u003a\u0002\u0002\u01dd\u01e8\u0007\u0034\u0002\u0002\u01de\u01e8\u0007\u0036\u0002\u0002\u01df\u01e8\u0007\u0037\u0002\u0002\u01e0\u01e8\u0007\u003b\u0002\u0002\u01e1\u01e8\u0007\u003d\u0002\u0002\u01e2\u01e8\u0007\u003e\u0002\u0002\u01e3\u01e8\u0007\u003f\u0002\u0002\u01e4\u01e8\u0007\u0040\u0002\u0002\u01e5\u01e8\u0007\u0041\u0002\u0002\u01e6\u01e8\u0007\u0042\u0002\u0002\u01e7\u01ad\u0003\u0002\u0002\u0002\u01e7\u01ae\u0003\u0002\u0002\u0002\u01e7\u01af\u0003\u0002\u0002\u0002\u01e7\u01b0\u0003\u0002\u0002\u0002\u01e7\u01b1\u0003\u0002\u0002\u0002\u01e7\u01b2\u0003\u0002\u0002\u0002\u01e7\u01b3\u0003\u0002\u0002\u0002\u01e7\u01b4\u0003\u0002\u0002\u0002\u01e7\u01b5\u0003\u0002\u0002\u0002\u01e7\u01b6\u0003\u0002\u0002\u0002\u01e7\u01b7\u0003\u0002\u0002\u0002\u01e7\u01b8\u0003\u0002\u0002\u0002\u01e7\u01b9\u0003\u0002\u0002\u0002\u01e7\u01ba\u0003\u0002\u0002\u0002\u01e7\u01bb\u0003\u0002\u0002\u0002\u01e7\u01bc\u0003\u0002\u0002\u0002\u01e7\u01bd\u0003\u0002\u0002\u0002\u01e7\u01be\u0003\u0002\u0002\u0002\u01e7\u01bf\u0003\u0002\u0002\u0002\u01e7\u01c0\u0003\u0002\u0002\u0002\u01e7\u01c1\u0003\u0002\u0002\u0002\u01e7\u01c2\u0003\u0002\u0002\u0002\u01e7\u01c3\u0003\u0002\u0002\u0002\u01e7\u01c4\u0003\u0002\u0002\u0002\u01e7\u01c5\u0003\u0002\u0002\u0002\u01e7\u01c6\u0003\u0002\u0002\u0002\u01e7\u01c7\u0003\u0002\u0002\u0002\u01e7\u01c8\u0003\u0002\u0002\u0002\u01e7\u01c9\u0003\u0002\u0002\u0002\u01e7\u01ca\u0003\u0002\u0002\u0002\u01e7\u01cb\u0003\u0002\u0002\u0002\u01e7\u01cc\u0003\u0002\u0002\u0002\u01e7\u01cd\u0003\u0002\u0002\u0002\u01e7\u01ce\u0003\u0002\u0002\u0002\u01e7\u01cf\u0003\u0002\u0002\u0002\u01e7\u01d0\u0003\u0002\u0002\u0002\u01e7\u01d1\u0003\u0002\u0002\u0002\u01e7\u01d2\u0003\u0002\u0002\u0002\u01e7\u01d3\u0003\u0002\u0002\u0002\u01e7\u01d4\u0003\u0002\u0002\u0002\u01e7\u01d5\u0003\u0002\u0002\u0002\u01e7\u01d6\u0003\u0002\u0002\u0002\u01e7\u01d7\u0003\u0002\u0002\u0002\u01e7\u01d8\u0003\u0002\u0002\u0002\u01e7\u01d9\u0003\u0002\u0002\u0002\u01e7\u01da\u0003\u0002\u0002\u0002\u01e7\u01db\u0003\u0002\u0002\u0002\u01e7\u01dc\u0003\u0002\u0002\u0002\u01e7\u01dd\u0003\u0002\u0002\u0002\u01e7\u01de\u0003\u0002\u0002\u0002\u01e7\u01df\u0003\u0002\u0002\u0002\u01e7\u01e0\u0003\u0002\u0002\u0002\u01e7\u01e1\u0003\u0002\u0002\u0002\u01e7\u01e2\u0003\u0002\u0002\u0002\u01e7\u01e3\u0003\u0002\u0002\u0002\u01e7\u01e4\u0003\u0002\u0002\u0002\u01e7\u01e5\u0003\u0002\u0002\u0002\u01e7\u01e6\u0003\u0002\u0002\u0002\u01e8\u003f\u0003\u0002\u0002\u0002\u01e9\u01ea\u0009\u0005\u0002\u0002\u01ea\u0041\u0003\u0002\u0002\u0002\u01eb\u01ee\u0005\u0054\u002b\u0002\u01ec\u01ee\u0005\u0056\u002c\u0002\u01ed\u01eb\u0003\u0002\u0002\u0002\u01ed\u01ec\u0003\u0002\u0002\u0002\u01ee\u0043\u0003\u0002\u0002\u0002\u01ef\u01f0\u0005\u0056\u002c\u0002\u01f0\u0045\u0003\u0002\u0002\u0002\u01f1\u01f2\u0005\u0056\u002c\u0002\u01f2\u0047\u0003\u0002\u0002\u0002\u01f3\u01f4\u0005\u0046\u0024\u0002\u01f4\u0049\u0003\u0002\u0002\u0002\u01f5\u01f6\u0005\u0046\u0024\u0002\u01f6\u004b\u0003\u0002\u0002\u0002\u01f7\u01f8\u0005\u0046\u0024\u0002\u01f8\u004d\u0003\u0002\u0002\u0002\u01f9\u01fa\u0005\u004a\u0026\u0002\u01fa\u004f\u0003\u0002\u0002\u0002\u01fb\u01fc\u0005\u0046\u0024\u0002\u01fc\u0051\u0003\u0002\u0002\u0002\u01fd\u01fe\u0005\u0046\u0024\u0002\u01fe\u0053\u0003\u0002\u0002\u0002\u01ff\u0200\u0007\u004a\u0002\u0002\u0200\u0055\u0003\u0002\u0002\u0002\u0201\u0202\u0007\u004b\u0002\u0002\u0202\u0057\u0003\u0002\u0002\u0002\u0024\u005b\u0068\u0091\u0098\u009d\u00af\u00bb\u00c8\u00da\u00e3\u00eb\u00f3\u00f8\u0101\u0104\u010d\u0110\u0116\u0118\u0122\u0125\u0137\u013c\u014b\u015e\u0164\u016e\u0175\u017f\u018a\u018c\u0196\u01e7\u01ed"

        val ATN = ATNDeserializer().deserialize(serializedATN.toCharArray())
        init {
        	decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
        		DFA(ATN.getDecisionState(it)!!, it)
        	})


        }
	}

    private val T__0 = Tokens.T__0.id
    private val T__1 = Tokens.T__1.id
    private val T__2 = Tokens.T__2.id
    private val T__3 = Tokens.T__3.id
    private val K_ALTER = Tokens.K_ALTER.id
    private val K_AND = Tokens.K_AND.id
    private val K_OR = Tokens.K_OR.id
    private val K_AS = Tokens.K_AS.id
    private val K_ASC = Tokens.K_ASC.id
    private val K_AVERAGE = Tokens.K_AVERAGE.id
    private val K_BY = Tokens.K_BY.id
    private val K_BETWEEN = Tokens.K_BETWEEN.id
    private val K_CASE = Tokens.K_CASE.id
    private val K_CIRCLE = Tokens.K_CIRCLE.id
    private val K_COLUMN = Tokens.K_COLUMN.id
    private val K_CONTAINS = Tokens.K_CONTAINS.id
    private val K_COUNT = Tokens.K_COUNT.id
    private val K_CREATE = Tokens.K_CREATE.id
    private val K_DELETE = Tokens.K_DELETE.id
    private val K_DESC = Tokens.K_DESC.id
    private val K_DESCRIBE = Tokens.K_DESCRIBE.id
    private val K_DOES = Tokens.K_DOES.id
    private val K_CONTAIN = Tokens.K_CONTAIN.id
    private val K_DROP = Tokens.K_DROP.id
    private val K_ENDS = Tokens.K_ENDS.id
    private val K_FROM = Tokens.K_FROM.id
    private val K_GROUP = Tokens.K_GROUP.id
    private val K_HAVING = Tokens.K_HAVING.id
    private val K_IGNORING = Tokens.K_IGNORING.id
    private val K_IN = Tokens.K_IN.id
    private val K_INSERT = Tokens.K_INSERT.id
    private val K_INTO = Tokens.K_INTO.id
    private val K_JOIN = Tokens.K_JOIN.id
    private val K_LATLNG = Tokens.K_LATLNG.id
    private val K_LEFT = Tokens.K_LEFT.id
    private val K_LIKE = Tokens.K_LIKE.id
    private val K_LIMIT = Tokens.K_LIMIT.id
    private val K_MATCHES = Tokens.K_MATCHES.id
    private val K_MAXIMUM = Tokens.K_MAXIMUM.id
    private val K_MINIMUM = Tokens.K_MINIMUM.id
    private val K_NOT = Tokens.K_NOT.id
    private val K_EQUAL = Tokens.K_EQUAL.id
    private val K_OF = Tokens.K_OF.id
    private val K_OFFSET = Tokens.K_OFFSET.id
    private val K_ON = Tokens.K_ON.id
    private val K_ORDER = Tokens.K_ORDER.id
    private val K_OUTER = Tokens.K_OUTER.id
    private val K_RECTANGLE = Tokens.K_RECTANGLE.id
    private val K_RENAME = Tokens.K_RENAME.id
    private val K_ST_DISTANCE = Tokens.K_ST_DISTANCE.id
    private val K_SELECT = Tokens.K_SELECT.id
    private val K_ST_INTERSECTS = Tokens.K_ST_INTERSECTS.id
    private val K_SUM = Tokens.K_SUM.id
    private val K_SET = Tokens.K_SET.id
    private val K_SHOW = Tokens.K_SHOW.id
    private val K_STARTS = Tokens.K_STARTS.id
    private val K_TABLE = Tokens.K_TABLE.id
    private val K_TABLES = Tokens.K_TABLES.id
    private val K_TO = Tokens.K_TO.id
    private val K_UPDATE = Tokens.K_UPDATE.id
    private val K_VALUES = Tokens.K_VALUES.id
    private val K_VIEW = Tokens.K_VIEW.id
    private val K_WHERE = Tokens.K_WHERE.id
    private val K_WITH = Tokens.K_WITH.id
    private val LT_EQ = Tokens.LT_EQ.id
    private val GT_EQ = Tokens.GT_EQ.id
    private val GT = Tokens.GT.id
    private val EQ = Tokens.EQ.id
    private val LT = Tokens.LT.id
    private val LPAR = Tokens.LPAR.id
    private val RPAR = Tokens.RPAR.id
    private val NUMERIC_LITERAL = Tokens.NUMERIC_LITERAL.id
    private val STRING_LITERAL = Tokens.STRING_LITERAL.id
    private val STRING = Tokens.STRING.id
    private val QUOTED_STRING = Tokens.QUOTED_STRING.id
    private val SINGLELINE_COMMENT = Tokens.SINGLELINE_COMMENT.id
    private val MULTILINE_COMMENT = Tokens.MULTILINE_COMMENT.id
    private val WHITESPACE = Tokens.WHITESPACE.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class FusionTablesSqlContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_fusionTablesSql.id
	        set(value) { throw RuntimeException() }
		fun findSql_stmt() : List<Sql_stmtContext> = getRuleContexts(solver.getType("Sql_stmtContext"))
		fun findSql_stmt(i: Int) : Sql_stmtContext? = getRuleContext(solver.getType("Sql_stmtContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterFusionTablesSql(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitFusionTablesSql(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitFusionTablesSql(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  fusionTablesSql() : FusionTablesSqlContext {
		var _localctx : FusionTablesSqlContext = FusionTablesSqlContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_fusionTablesSql.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 89
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl K_ALTER) or (1L shl K_CREATE) or (1L shl K_DELETE) or (1L shl K_DESCRIBE) or (1L shl K_DROP) or (1L shl K_INSERT) or (1L shl K_SELECT) or (1L shl K_SHOW) or (1L shl K_UPDATE))) != 0L)) {
				if (true){
				if (true){
				this.state = 86
				sql_stmt()
				}
				}
				this.state = 91
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Sql_stmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_sql_stmt.id
	        set(value) { throw RuntimeException() }
		fun findAlter_table_stmt() : Alter_table_stmtContext? = getRuleContext(solver.getType("Alter_table_stmtContext"),0)
		fun findSelect_stmt() : Select_stmtContext? = getRuleContext(solver.getType("Select_stmtContext"),0)
		fun findCreate_view_stmt() : Create_view_stmtContext? = getRuleContext(solver.getType("Create_view_stmtContext"),0)
		fun findCreate_table_as_select_stmt() : Create_table_as_select_stmtContext? = getRuleContext(solver.getType("Create_table_as_select_stmtContext"),0)
		fun findDelete_stmt() : Delete_stmtContext? = getRuleContext(solver.getType("Delete_stmtContext"),0)
		fun findDrop_table_stmt() : Drop_table_stmtContext? = getRuleContext(solver.getType("Drop_table_stmtContext"),0)
		fun findInsert_stmt() : Insert_stmtContext? = getRuleContext(solver.getType("Insert_stmtContext"),0)
		fun findUpdate_stmt() : Update_stmtContext? = getRuleContext(solver.getType("Update_stmtContext"),0)
		fun findDescribe_stmt() : Describe_stmtContext? = getRuleContext(solver.getType("Describe_stmtContext"),0)
		fun findShow_tables_stmt() : Show_tables_stmtContext? = getRuleContext(solver.getType("Show_tables_stmtContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterSql_stmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitSql_stmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitSql_stmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  sql_stmt() : Sql_stmtContext {
		var _localctx : Sql_stmtContext = Sql_stmtContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_sql_stmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 102
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,1,context) ) {
			1 -> {if (true){
			this.state = 92
			alter_table_stmt()
			}}
			2 -> {if (true){
			this.state = 93
			select_stmt()
			}}
			3 -> {if (true){
			this.state = 94
			create_view_stmt()
			}}
			4 -> {if (true){
			this.state = 95
			create_table_as_select_stmt()
			}}
			5 -> {if (true){
			this.state = 96
			delete_stmt()
			}}
			6 -> {if (true){
			this.state = 97
			drop_table_stmt()
			}}
			7 -> {if (true){
			this.state = 98
			insert_stmt()
			}}
			8 -> {if (true){
			this.state = 99
			update_stmt()
			}}
			9 -> {if (true){
			this.state = 100
			describe_stmt()
			}}
			10 -> {if (true){
			this.state = 101
			show_tables_stmt()
			}}
			}
			this.state = 104
			match(T__0) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Table_name_in_ddlContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_table_name_in_ddl.id
	        set(value) { throw RuntimeException() }
		fun findTable_name() : Table_nameContext? = getRuleContext(solver.getType("Table_nameContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterTable_name_in_ddl(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitTable_name_in_ddl(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitTable_name_in_ddl(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  table_name_in_ddl() : Table_name_in_ddlContext {
		var _localctx : Table_name_in_ddlContext = Table_name_in_ddlContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_table_name_in_ddl.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 106
			table_name()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Table_name_in_dmlContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_table_name_in_dml.id
	        set(value) { throw RuntimeException() }
		fun findTable_name() : Table_nameContext? = getRuleContext(solver.getType("Table_nameContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterTable_name_in_dml(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitTable_name_in_dml(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitTable_name_in_dml(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  table_name_in_dml() : Table_name_in_dmlContext {
		var _localctx : Table_name_in_dmlContext = Table_name_in_dmlContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_table_name_in_dml.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 108
			table_name()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Create_table_as_select_stmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_create_table_as_select_stmt.id
	        set(value) { throw RuntimeException() }
		fun K_CREATE() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_CREATE.id, 0)
		fun K_TABLE() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_TABLE.id, 0)
		fun findIdentifier() : IdentifierContext? = getRuleContext(solver.getType("IdentifierContext"),0)
		fun K_AS() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_AS.id, 0)
		fun K_SELECT() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_SELECT.id, 0)
		fun K_FROM() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_FROM.id, 0)
		fun findTable_name_in_ddl() : Table_name_in_ddlContext? = getRuleContext(solver.getType("Table_name_in_ddlContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterCreate_table_as_select_stmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitCreate_table_as_select_stmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitCreate_table_as_select_stmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  create_table_as_select_stmt() : Create_table_as_select_stmtContext {
		var _localctx : Create_table_as_select_stmtContext = Create_table_as_select_stmtContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_create_table_as_select_stmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 110
			match(K_CREATE) as Token
			this.state = 111
			match(K_TABLE) as Token
			this.state = 112
			identifier()
			this.state = 113
			match(K_AS) as Token
			this.state = 114
			match(K_SELECT) as Token
			this.state = 115
			match(T__1) as Token
			this.state = 116
			match(K_FROM) as Token
			this.state = 117
			table_name_in_ddl()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Describe_stmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_describe_stmt.id
	        set(value) { throw RuntimeException() }
		fun K_DESCRIBE() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_DESCRIBE.id, 0)
		fun findTable_name_in_ddl() : Table_name_in_ddlContext? = getRuleContext(solver.getType("Table_name_in_ddlContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterDescribe_stmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitDescribe_stmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitDescribe_stmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  describe_stmt() : Describe_stmtContext {
		var _localctx : Describe_stmtContext = Describe_stmtContext(context, state)
		enterRule(_localctx, 10, Rules.RULE_describe_stmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 119
			match(K_DESCRIBE) as Token
			this.state = 120
			table_name_in_ddl()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Show_tables_stmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_show_tables_stmt.id
	        set(value) { throw RuntimeException() }
		fun K_SHOW() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_SHOW.id, 0)
		fun K_TABLES() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_TABLES.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterShow_tables_stmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitShow_tables_stmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitShow_tables_stmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  show_tables_stmt() : Show_tables_stmtContext {
		var _localctx : Show_tables_stmtContext = Show_tables_stmtContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_show_tables_stmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 122
			match(K_SHOW) as Token
			this.state = 123
			match(K_TABLES) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Alter_table_stmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_alter_table_stmt.id
	        set(value) { throw RuntimeException() }
		fun K_ALTER() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_ALTER.id, 0)
		fun K_TABLE() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_TABLE.id, 0)
		fun findTable_name_in_ddl() : Table_name_in_ddlContext? = getRuleContext(solver.getType("Table_name_in_ddlContext"),0)
		fun K_RENAME() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_RENAME.id, 0)
		fun K_TO() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_TO.id, 0)
		fun findIdentifier() : IdentifierContext? = getRuleContext(solver.getType("IdentifierContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterAlter_table_stmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitAlter_table_stmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitAlter_table_stmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  alter_table_stmt() : Alter_table_stmtContext {
		var _localctx : Alter_table_stmtContext = Alter_table_stmtContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_alter_table_stmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 125
			match(K_ALTER) as Token
			this.state = 126
			match(K_TABLE) as Token
			this.state = 127
			table_name_in_ddl()
			if (true){
			this.state = 128
			match(K_RENAME) as Token
			this.state = 129
			match(K_TO) as Token
			this.state = 130
			identifier()
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Create_view_stmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_create_view_stmt.id
	        set(value) { throw RuntimeException() }
		fun K_CREATE() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_CREATE.id, 0)
		fun K_VIEW() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_VIEW.id, 0)
		fun findView_name() : View_nameContext? = getRuleContext(solver.getType("View_nameContext"),0)
		fun K_AS() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_AS.id, 0)
		fun K_SELECT() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_SELECT.id, 0)
		fun findResult_column() : List<Result_columnContext> = getRuleContexts(solver.getType("Result_columnContext"))
		fun findResult_column(i: Int) : Result_columnContext? = getRuleContext(solver.getType("Result_columnContext"),i)
		fun K_FROM() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_FROM.id, 0)
		fun findTable_name_with_alias() : Table_name_with_aliasContext? = getRuleContext(solver.getType("Table_name_with_aliasContext"),0)
		fun findJoin_clause() : List<Join_clauseContext> = getRuleContexts(solver.getType("Join_clauseContext"))
		fun findJoin_clause(i: Int) : Join_clauseContext? = getRuleContext(solver.getType("Join_clauseContext"),i)
		fun K_WHERE() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_WHERE.id, 0)
		fun findExpr() : ExprContext? = getRuleContext(solver.getType("ExprContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterCreate_view_stmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitCreate_view_stmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitCreate_view_stmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  create_view_stmt() : Create_view_stmtContext {
		var _localctx : Create_view_stmtContext = Create_view_stmtContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_create_view_stmt.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 132
			match(K_CREATE) as Token
			this.state = 133
			match(K_VIEW) as Token
			this.state = 134
			view_name()
			this.state = 135
			match(K_AS) as Token
			this.state = 136
			match(LPAR) as Token
			this.state = 137
			match(K_SELECT) as Token
			this.state = 138
			result_column()
			this.state = 143
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__2) {
				if (true){
				if (true){
				this.state = 139
				match(T__2) as Token
				this.state = 140
				result_column()
				}
				}
				this.state = 145
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 146
			match(K_FROM) as Token
			if (true){
			if (true){
			this.state = 147
			table_name_with_alias()
			this.state = 150
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_WHERE) {
				if (true){
				this.state = 148
				match(K_WHERE) as Token
				this.state = 149
				expr()
				}
			}

			}
			this.state = 155
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==K_LEFT) {
				if (true){
				if (true){
				this.state = 152
				join_clause()
				}
				}
				this.state = 157
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}
			this.state = 158
			match(RPAR) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Drop_table_stmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_drop_table_stmt.id
	        set(value) { throw RuntimeException() }
		fun K_DROP() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_DROP.id, 0)
		fun K_TABLE() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_TABLE.id, 0)
		fun findTable_name_in_ddl() : Table_name_in_ddlContext? = getRuleContext(solver.getType("Table_name_in_ddlContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterDrop_table_stmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitDrop_table_stmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitDrop_table_stmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  drop_table_stmt() : Drop_table_stmtContext {
		var _localctx : Drop_table_stmtContext = Drop_table_stmtContext(context, state)
		enterRule(_localctx, 18, Rules.RULE_drop_table_stmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 160
			match(K_DROP) as Token
			this.state = 161
			match(K_TABLE) as Token
			this.state = 162
			table_name_in_ddl()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Insert_stmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_insert_stmt.id
	        set(value) { throw RuntimeException() }
		fun K_INSERT() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_INSERT.id, 0)
		fun K_INTO() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_INTO.id, 0)
		fun findTable_name_in_dml() : Table_name_in_dmlContext? = getRuleContext(solver.getType("Table_name_in_dmlContext"),0)
		fun findColumn_name_in_dml() : List<Column_name_in_dmlContext> = getRuleContexts(solver.getType("Column_name_in_dmlContext"))
		fun findColumn_name_in_dml(i: Int) : Column_name_in_dmlContext? = getRuleContext(solver.getType("Column_name_in_dmlContext"),i)
		fun K_VALUES() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_VALUES.id, 0)
		fun findLiteral() : List<LiteralContext> = getRuleContexts(solver.getType("LiteralContext"))
		fun findLiteral(i: Int) : LiteralContext? = getRuleContext(solver.getType("LiteralContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterInsert_stmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitInsert_stmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitInsert_stmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  insert_stmt() : Insert_stmtContext {
		var _localctx : Insert_stmtContext = Insert_stmtContext(context, state)
		enterRule(_localctx, 20, Rules.RULE_insert_stmt.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 164
			match(K_INSERT) as Token
			this.state = 165
			match(K_INTO) as Token
			this.state = 166
			table_name_in_dml()
			if (true){
			this.state = 167
			match(LPAR) as Token
			this.state = 168
			column_name_in_dml()
			this.state = 173
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__2) {
				if (true){
				if (true){
				this.state = 169
				match(T__2) as Token
				this.state = 170
				column_name_in_dml()
				}
				}
				this.state = 175
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 176
			match(RPAR) as Token
			}
			if (true){
			this.state = 178
			match(K_VALUES) as Token
			this.state = 179
			match(LPAR) as Token
			this.state = 180
			literal()
			this.state = 185
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__2) {
				if (true){
				if (true){
				this.state = 181
				match(T__2) as Token
				this.state = 182
				literal()
				}
				}
				this.state = 187
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 188
			match(RPAR) as Token
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Update_stmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_update_stmt.id
	        set(value) { throw RuntimeException() }
		fun K_UPDATE() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_UPDATE.id, 0)
		fun findTable_name_in_dml() : Table_name_in_dmlContext? = getRuleContext(solver.getType("Table_name_in_dmlContext"),0)
		fun K_SET() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_SET.id, 0)
		fun findColumn_assignment() : List<Column_assignmentContext> = getRuleContexts(solver.getType("Column_assignmentContext"))
		fun findColumn_assignment(i: Int) : Column_assignmentContext? = getRuleContext(solver.getType("Column_assignmentContext"),i)
		fun K_WHERE() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_WHERE.id, 0)
		fun findEq_comparison() : Eq_comparisonContext? = getRuleContext(solver.getType("Eq_comparisonContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterUpdate_stmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitUpdate_stmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitUpdate_stmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  update_stmt() : Update_stmtContext {
		var _localctx : Update_stmtContext = Update_stmtContext(context, state)
		enterRule(_localctx, 22, Rules.RULE_update_stmt.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 190
			match(K_UPDATE) as Token
			this.state = 191
			table_name_in_dml()
			this.state = 192
			match(K_SET) as Token
			this.state = 193
			column_assignment()
			this.state = 198
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__2) {
				if (true){
				if (true){
				this.state = 194
				match(T__2) as Token
				this.state = 195
				column_assignment()
				}
				}
				this.state = 200
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 201
			match(K_WHERE) as Token
			this.state = 202
			eq_comparison()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Column_assignmentContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_column_assignment.id
	        set(value) { throw RuntimeException() }
		fun findColumn_name_in_dml() : Column_name_in_dmlContext? = getRuleContext(solver.getType("Column_name_in_dmlContext"),0)
		fun findLiteral() : LiteralContext? = getRuleContext(solver.getType("LiteralContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterColumn_assignment(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitColumn_assignment(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitColumn_assignment(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  column_assignment() : Column_assignmentContext {
		var _localctx : Column_assignmentContext = Column_assignmentContext(context, state)
		enterRule(_localctx, 24, Rules.RULE_column_assignment.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 204
			column_name_in_dml()
			this.state = 205
			match(EQ) as Token
			this.state = 206
			literal()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Delete_stmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_delete_stmt.id
	        set(value) { throw RuntimeException() }
		fun K_DELETE() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_DELETE.id, 0)
		fun K_FROM() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_FROM.id, 0)
		fun findTable_name_in_dml() : Table_name_in_dmlContext? = getRuleContext(solver.getType("Table_name_in_dmlContext"),0)
		fun K_WHERE() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_WHERE.id, 0)
		fun findColumn_name_in_dml() : Column_name_in_dmlContext? = getRuleContext(solver.getType("Column_name_in_dmlContext"),0)
		fun findLiteral() : LiteralContext? = getRuleContext(solver.getType("LiteralContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterDelete_stmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitDelete_stmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitDelete_stmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  delete_stmt() : Delete_stmtContext {
		var _localctx : Delete_stmtContext = Delete_stmtContext(context, state)
		enterRule(_localctx, 26, Rules.RULE_delete_stmt.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 208
			match(K_DELETE) as Token
			this.state = 209
			match(K_FROM) as Token
			this.state = 210
			table_name_in_dml()
			this.state = 216
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_WHERE) {
				if (true){
				this.state = 211
				match(K_WHERE) as Token
				this.state = 212
				column_name_in_dml()
				this.state = 213
				match(EQ) as Token
				this.state = 214
				literal()
				}
			}

			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Eq_comparisonContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_eq_comparison.id
	        set(value) { throw RuntimeException() }
		fun findIdentifier() : IdentifierContext? = getRuleContext(solver.getType("IdentifierContext"),0)
		fun EQ() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.EQ.id, 0)
		fun findString_literal() : String_literalContext? = getRuleContext(solver.getType("String_literalContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterEq_comparison(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitEq_comparison(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitEq_comparison(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  eq_comparison() : Eq_comparisonContext {
		var _localctx : Eq_comparisonContext = Eq_comparisonContext(context, state)
		enterRule(_localctx, 28, Rules.RULE_eq_comparison.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 218
			identifier()
			this.state = 219
			match(EQ) as Token
			this.state = 220
			string_literal()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Table_name_with_aliasContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_table_name_with_alias.id
	        set(value) { throw RuntimeException() }
		fun findTable_name() : Table_nameContext? = getRuleContext(solver.getType("Table_nameContext"),0)
		fun K_AS() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_AS.id, 0)
		fun findTable_alias() : Table_aliasContext? = getRuleContext(solver.getType("Table_aliasContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterTable_name_with_alias(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitTable_name_with_alias(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitTable_name_with_alias(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  table_name_with_alias() : Table_name_with_aliasContext {
		var _localctx : Table_name_with_aliasContext = Table_name_with_aliasContext(context, state)
		enterRule(_localctx, 30, Rules.RULE_table_name_with_alias.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 222
			table_name()
			this.state = 225
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_AS) {
				if (true){
				this.state = 223
				match(K_AS) as Token
				this.state = 224
				table_alias()
				}
			}

			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Select_stmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_select_stmt.id
	        set(value) { throw RuntimeException() }
		fun K_SELECT() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_SELECT.id, 0)
		fun findResult_column() : List<Result_columnContext> = getRuleContexts(solver.getType("Result_columnContext"))
		fun findResult_column(i: Int) : Result_columnContext? = getRuleContext(solver.getType("Result_columnContext"),i)
		fun K_FROM() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_FROM.id, 0)
		fun findTable_name_with_alias() : Table_name_with_aliasContext? = getRuleContext(solver.getType("Table_name_with_aliasContext"),0)
		fun findJoin_clause() : List<Join_clauseContext> = getRuleContexts(solver.getType("Join_clauseContext"))
		fun findJoin_clause(i: Int) : Join_clauseContext? = getRuleContext(solver.getType("Join_clauseContext"),i)
		fun K_WHERE() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_WHERE.id, 0)
		fun findExpr() : ExprContext? = getRuleContext(solver.getType("ExprContext"),0)
		fun K_GROUP() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_GROUP.id, 0)
		fun K_BY() : List<TerminalNode> = getTokens(FusionTablesSqlParser.Tokens.K_BY.id)
		fun K_BY(i: Int) : TerminalNode = getToken(FusionTablesSqlParser.Tokens.K_BY.id, i) as TerminalNode
		fun findQualified_column_name() : List<Qualified_column_nameContext> = getRuleContexts(solver.getType("Qualified_column_nameContext"))
		fun findQualified_column_name(i: Int) : Qualified_column_nameContext? = getRuleContext(solver.getType("Qualified_column_nameContext"),i)
		fun K_ORDER() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_ORDER.id, 0)
		fun findOrdering_term() : List<Ordering_termContext> = getRuleContexts(solver.getType("Ordering_termContext"))
		fun findOrdering_term(i: Int) : Ordering_termContext? = getRuleContext(solver.getType("Ordering_termContext"),i)
		fun K_OFFSET() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_OFFSET.id, 0)
		fun findNumeric_literal() : List<Numeric_literalContext> = getRuleContexts(solver.getType("Numeric_literalContext"))
		fun findNumeric_literal(i: Int) : Numeric_literalContext? = getRuleContext(solver.getType("Numeric_literalContext"),i)
		fun K_LIMIT() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_LIMIT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterSelect_stmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitSelect_stmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitSelect_stmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  select_stmt() : Select_stmtContext {
		var _localctx : Select_stmtContext = Select_stmtContext(context, state)
		enterRule(_localctx, 32, Rules.RULE_select_stmt.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 227
			match(K_SELECT) as Token
			this.state = 228
			result_column()
			this.state = 233
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__2) {
				if (true){
				if (true){
				this.state = 229
				match(T__2) as Token
				this.state = 230
				result_column()
				}
				}
				this.state = 235
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 236
			match(K_FROM) as Token
			this.state = 237
			table_name_with_alias()
			this.state = 241
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==K_LEFT) {
				if (true){
				if (true){
				this.state = 238
				join_clause()
				}
				}
				this.state = 243
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 246
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_WHERE) {
				if (true){
				this.state = 244
				match(K_WHERE) as Token
				this.state = 245
				expr()
				}
			}

			this.state = 258
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_GROUP) {
				if (true){
				this.state = 248
				match(K_GROUP) as Token
				this.state = 249
				match(K_BY) as Token
				this.state = 250
				qualified_column_name()
				this.state = 255
				errorHandler.sync(this);
				_la = _input!!.LA(1)
				while (_la==T__2) {
					if (true){
					if (true){
					this.state = 251
					match(T__2) as Token
					this.state = 252
					qualified_column_name()
					}
					}
					this.state = 257
					errorHandler.sync(this)
					_la = _input!!.LA(1)
				}
				}
			}

			this.state = 270
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_ORDER) {
				if (true){
				this.state = 260
				match(K_ORDER) as Token
				this.state = 261
				match(K_BY) as Token
				this.state = 262
				ordering_term()
				this.state = 267
				errorHandler.sync(this);
				_la = _input!!.LA(1)
				while (_la==T__2) {
					if (true){
					if (true){
					this.state = 263
					match(T__2) as Token
					this.state = 264
					ordering_term()
					}
					}
					this.state = 269
					errorHandler.sync(this)
					_la = _input!!.LA(1)
				}
				}
			}

			this.state = 278
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_OFFSET) {
				if (true){
				if (true){
				this.state = 272
				match(K_OFFSET) as Token
				this.state = 273
				numeric_literal()
				this.state = 276
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				if (_la==K_LIMIT) {
					if (true){
					this.state = 274
					match(K_LIMIT) as Token
					this.state = 275
					numeric_literal()
					}
				}

				}
				}
			}

			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Ordering_termContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_ordering_term.id
	        set(value) { throw RuntimeException() }
		fun findQualified_column_name() : Qualified_column_nameContext? = getRuleContext(solver.getType("Qualified_column_nameContext"),0)
		fun K_ST_DISTANCE() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_ST_DISTANCE.id, 0)
		fun findCoordinate() : CoordinateContext? = getRuleContext(solver.getType("CoordinateContext"),0)
		fun K_ASC() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_ASC.id, 0)
		fun K_DESC() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_DESC.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterOrdering_term(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitOrdering_term(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitOrdering_term(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  ordering_term() : Ordering_termContext {
		var _localctx : Ordering_termContext = Ordering_termContext(context, state)
		enterRule(_localctx, 34, Rules.RULE_ordering_term.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 288
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			STRING_LITERAL  ->  /*LL1AltBlock*/{if (true){
			this.state = 280
			qualified_column_name()
			}}
			K_ST_DISTANCE  ->  /*LL1AltBlock*/{if (true){
			this.state = 281
			match(K_ST_DISTANCE) as Token
			this.state = 282
			match(LPAR) as Token
			this.state = 283
			qualified_column_name()
			this.state = 284
			match(T__2) as Token
			this.state = 285
			coordinate()
			this.state = 286
			match(RPAR) as Token
			}}
			else -> throw NoViableAltException(this)
			}
			this.state = 291
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_ASC || _la==K_DESC) {
				if (true){
				this.state = 290
				_la = _input!!.LA(1)
				if ( !(_la==K_ASC || _la==K_DESC) ) {
					errorHandler.recoverInline(this)
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				}
			}

			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Join_clauseContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_join_clause.id
	        set(value) { throw RuntimeException() }
		fun K_LEFT() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_LEFT.id, 0)
		fun K_OUTER() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_OUTER.id, 0)
		fun K_JOIN() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_JOIN.id, 0)
		fun findTable_name_with_alias() : Table_name_with_aliasContext? = getRuleContext(solver.getType("Table_name_with_aliasContext"),0)
		fun K_ON() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_ON.id, 0)
		fun findQualified_column_name() : List<Qualified_column_nameContext> = getRuleContexts(solver.getType("Qualified_column_nameContext"))
		fun findQualified_column_name(i: Int) : Qualified_column_nameContext? = getRuleContext(solver.getType("Qualified_column_nameContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterJoin_clause(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitJoin_clause(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitJoin_clause(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  join_clause() : Join_clauseContext {
		var _localctx : Join_clauseContext = Join_clauseContext(context, state)
		enterRule(_localctx, 36, Rules.RULE_join_clause.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 293
			match(K_LEFT) as Token
			this.state = 294
			match(K_OUTER) as Token
			this.state = 295
			match(K_JOIN) as Token
			this.state = 296
			table_name_with_alias()
			this.state = 297
			match(K_ON) as Token
			this.state = 298
			qualified_column_name()
			this.state = 299
			match(EQ) as Token
			this.state = 300
			qualified_column_name()
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Result_columnContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_result_column.id
	        set(value) { throw RuntimeException() }
		fun findTable_name() : Table_nameContext? = getRuleContext(solver.getType("Table_nameContext"),0)
		fun findQualified_column_name() : Qualified_column_nameContext? = getRuleContext(solver.getType("Qualified_column_nameContext"),0)
		fun findAggregate_exp() : Aggregate_expContext? = getRuleContext(solver.getType("Aggregate_expContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterResult_column(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitResult_column(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitResult_column(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  result_column() : Result_columnContext {
		var _localctx : Result_columnContext = Result_columnContext(context, state)
		enterRule(_localctx, 38, Rules.RULE_result_column.id)
		try {
			this.state = 309
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,21,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 302
			match(T__1) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 303
			table_name()
			this.state = 304
			match(T__3) as Token
			this.state = 305
			match(T__1) as Token
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 307
			qualified_column_name()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 308
			aggregate_exp()
			}}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Qualified_column_nameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_qualified_column_name.id
	        set(value) { throw RuntimeException() }
		fun findColumn_name() : Column_nameContext? = getRuleContext(solver.getType("Column_nameContext"),0)
		fun findTable_name() : Table_nameContext? = getRuleContext(solver.getType("Table_nameContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterQualified_column_name(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitQualified_column_name(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitQualified_column_name(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  qualified_column_name() : Qualified_column_nameContext {
		var _localctx : Qualified_column_nameContext = Qualified_column_nameContext(context, state)
		enterRule(_localctx, 40, Rules.RULE_qualified_column_name.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 314
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,22,context) ) {
			1   -> if (true){
			this.state = 311
			table_name()
			this.state = 312
			match(T__3) as Token
			}
			}
			this.state = 316
			column_name()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Aggregate_expContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_aggregate_exp.id
	        set(value) { throw RuntimeException() }
		fun LPAR() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.LPAR.id, 0)
		fun findQualified_column_name() : Qualified_column_nameContext? = getRuleContext(solver.getType("Qualified_column_nameContext"),0)
		fun RPAR() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.RPAR.id, 0)
		fun K_SUM() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_SUM.id, 0)
		fun K_COUNT() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_COUNT.id, 0)
		fun K_AVERAGE() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_AVERAGE.id, 0)
		fun K_MAXIMUM() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_MAXIMUM.id, 0)
		fun K_MINIMUM() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_MINIMUM.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterAggregate_exp(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitAggregate_exp(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitAggregate_exp(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  aggregate_exp() : Aggregate_expContext {
		var _localctx : Aggregate_expContext = Aggregate_expContext(context, state)
		enterRule(_localctx, 42, Rules.RULE_aggregate_exp.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 318
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl K_AVERAGE) or (1L shl K_COUNT) or (1L shl K_MAXIMUM) or (1L shl K_MINIMUM) or (1L shl K_SUM))) != 0L)) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 319
			match(LPAR) as Token
			this.state = 320
			qualified_column_name()
			this.state = 321
			match(RPAR) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ExprContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_expr.id
	        set(value) { throw RuntimeException() }
		fun findColumn_name_beginning_expr() : Column_name_beginning_exprContext? = getRuleContext(solver.getType("Column_name_beginning_exprContext"),0)
		fun findLiteral() : List<LiteralContext> = getRuleContexts(solver.getType("LiteralContext"))
		fun findLiteral(i: Int) : LiteralContext? = getRuleContext(solver.getType("LiteralContext"),i)
		fun findOperator() : OperatorContext? = getRuleContext(solver.getType("OperatorContext"),0)
		fun findAnd_or_or() : And_or_orContext? = getRuleContext(solver.getType("And_or_orContext"),0)
		fun findExpr() : ExprContext? = getRuleContext(solver.getType("ExprContext"),0)
		fun findString_literal() : List<String_literalContext> = getRuleContexts(solver.getType("String_literalContext"))
		fun findString_literal(i: Int) : String_literalContext? = getRuleContext(solver.getType("String_literalContext"),i)
		fun K_LIKE() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_LIKE.id, 0)
		fun K_MATCHES() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_MATCHES.id, 0)
		fun K_STARTS() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_STARTS.id, 0)
		fun K_WITH() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_WITH.id, 0)
		fun K_ENDS() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_ENDS.id, 0)
		fun K_CONTAINS() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_CONTAINS.id, 0)
		fun K_IGNORING() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_IGNORING.id, 0)
		fun K_CASE() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_CASE.id, 0)
		fun K_DOES() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_DOES.id, 0)
		fun K_NOT() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_NOT.id, 0)
		fun K_CONTAIN() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_CONTAIN.id, 0)
		fun K_EQUAL() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_EQUAL.id, 0)
		fun K_TO() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_TO.id, 0)
		fun K_IN() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_IN.id, 0)
		fun K_BETWEEN() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_BETWEEN.id, 0)
		fun K_AND() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_AND.id, 0)
		fun K_ST_INTERSECTS() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_ST_INTERSECTS.id, 0)
		fun LPAR() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.LPAR.id, 0)
		fun findQualified_column_name() : Qualified_column_nameContext? = getRuleContext(solver.getType("Qualified_column_nameContext"),0)
		fun findGeometry() : GeometryContext? = getRuleContext(solver.getType("GeometryContext"),0)
		fun RPAR() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.RPAR.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterExpr(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitExpr(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitExpr(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  expr() : ExprContext {
		var _localctx : ExprContext = ExprContext(context, state)
		enterRule(_localctx, 44, Rules.RULE_expr.id)
		var _la: Int
		try {
			this.state = 394
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,30,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 323
			column_name_beginning_expr()
			if (true){
			this.state = 324
			operator()
			}
			this.state = 325
			literal()
			this.state = 329
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_AND || _la==K_OR) {
				if (true){
				this.state = 326
				and_or_or()
				this.state = 327
				expr()
				}
			}

			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 331
			column_name_beginning_expr()
			this.state = 348
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,24,context) ) {
			1 -> {if (true){
			this.state = 332
			match(K_LIKE) as Token
			}}
			2 -> {if (true){
			this.state = 333
			match(K_MATCHES) as Token
			}}
			3 -> {if (true){
			this.state = 334
			match(K_STARTS) as Token
			this.state = 335
			match(K_WITH) as Token
			}}
			4 -> {if (true){
			this.state = 336
			match(K_ENDS) as Token
			this.state = 337
			match(K_WITH) as Token
			}}
			5 -> {if (true){
			this.state = 338
			match(K_CONTAINS) as Token
			}}
			6 -> {if (true){
			this.state = 339
			match(K_CONTAINS) as Token
			this.state = 340
			match(K_IGNORING) as Token
			this.state = 341
			match(K_CASE) as Token
			}}
			7 -> {if (true){
			this.state = 342
			match(K_DOES) as Token
			this.state = 343
			match(K_NOT) as Token
			this.state = 344
			match(K_CONTAIN) as Token
			}}
			8 -> {if (true){
			this.state = 345
			match(K_NOT) as Token
			this.state = 346
			match(K_EQUAL) as Token
			this.state = 347
			match(K_TO) as Token
			}}
			}
			this.state = 350
			string_literal()
			this.state = 354
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_AND || _la==K_OR) {
				if (true){
				this.state = 351
				and_or_or()
				this.state = 352
				expr()
				}
			}

			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 356
			column_name_beginning_expr()
			this.state = 357
			match(K_IN) as Token
			this.state = 358
			match(LPAR) as Token
			this.state = 359
			string_literal()
			this.state = 364
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__2) {
				if (true){
				if (true){
				this.state = 360
				match(T__2) as Token
				this.state = 361
				string_literal()
				}
				}
				this.state = 366
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 367
			match(RPAR) as Token
			this.state = 371
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_AND || _la==K_OR) {
				if (true){
				this.state = 368
				and_or_or()
				this.state = 369
				expr()
				}
			}

			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 373
			column_name_beginning_expr()
			this.state = 374
			match(K_BETWEEN) as Token
			this.state = 375
			literal()
			this.state = 376
			match(K_AND) as Token
			this.state = 377
			literal()
			this.state = 381
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_AND || _la==K_OR) {
				if (true){
				this.state = 378
				and_or_or()
				this.state = 379
				expr()
				}
			}

			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 383
			match(K_ST_INTERSECTS) as Token
			this.state = 384
			match(LPAR) as Token
			this.state = 385
			qualified_column_name()
			this.state = 386
			match(T__2) as Token
			this.state = 387
			geometry()
			this.state = 388
			match(RPAR) as Token
			this.state = 392
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_AND || _la==K_OR) {
				if (true){
				this.state = 389
				and_or_or()
				this.state = 390
				expr()
				}
			}

			}}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Column_name_beginning_exprContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_column_name_beginning_expr.id
	        set(value) { throw RuntimeException() }
		fun findQualified_column_name() : Qualified_column_nameContext? = getRuleContext(solver.getType("Qualified_column_nameContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterColumn_name_beginning_expr(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitColumn_name_beginning_expr(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitColumn_name_beginning_expr(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  column_name_beginning_expr() : Column_name_beginning_exprContext {
		var _localctx : Column_name_beginning_exprContext = Column_name_beginning_exprContext(context, state)
		enterRule(_localctx, 46, Rules.RULE_column_name_beginning_expr.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 396
			qualified_column_name()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Column_name_in_dmlContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_column_name_in_dml.id
	        set(value) { throw RuntimeException() }
		fun findColumn_name() : Column_nameContext? = getRuleContext(solver.getType("Column_nameContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterColumn_name_in_dml(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitColumn_name_in_dml(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitColumn_name_in_dml(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  column_name_in_dml() : Column_name_in_dmlContext {
		var _localctx : Column_name_in_dmlContext = Column_name_in_dmlContext(context, state)
		enterRule(_localctx, 48, Rules.RULE_column_name_in_dml.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 398
			column_name()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class And_or_orContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_and_or_or.id
	        set(value) { throw RuntimeException() }
		fun K_AND() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_AND.id, 0)
		fun K_OR() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_OR.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterAnd_or_or(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitAnd_or_or(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitAnd_or_or(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  and_or_or() : And_or_orContext {
		var _localctx : And_or_orContext = And_or_orContext(context, state)
		enterRule(_localctx, 50, Rules.RULE_and_or_or.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 400
			_la = _input!!.LA(1)
			if ( !(_la==K_AND || _la==K_OR) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class GeometryContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_geometry.id
	        set(value) { throw RuntimeException() }
		fun findCircle() : CircleContext? = getRuleContext(solver.getType("CircleContext"),0)
		fun findRectangle() : RectangleContext? = getRuleContext(solver.getType("RectangleContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterGeometry(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitGeometry(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitGeometry(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  geometry() : GeometryContext {
		var _localctx : GeometryContext = GeometryContext(context, state)
		enterRule(_localctx, 52, Rules.RULE_geometry.id)
		try {
			this.state = 404
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			K_CIRCLE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 402
			circle()
			}}
			K_RECTANGLE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 403
			rectangle()
			}}
			else -> throw NoViableAltException(this)
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class CircleContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_circle.id
	        set(value) { throw RuntimeException() }
		fun K_CIRCLE() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_CIRCLE.id, 0)
		fun findCoordinate() : CoordinateContext? = getRuleContext(solver.getType("CoordinateContext"),0)
		fun findNumeric_literal() : Numeric_literalContext? = getRuleContext(solver.getType("Numeric_literalContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterCircle(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitCircle(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitCircle(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  circle() : CircleContext {
		var _localctx : CircleContext = CircleContext(context, state)
		enterRule(_localctx, 54, Rules.RULE_circle.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 406
			match(K_CIRCLE) as Token
			this.state = 407
			match(LPAR) as Token
			this.state = 408
			coordinate()
			this.state = 409
			match(T__2) as Token
			this.state = 410
			numeric_literal()
			this.state = 411
			match(RPAR) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class RectangleContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_rectangle.id
	        set(value) { throw RuntimeException() }
		fun K_RECTANGLE() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_RECTANGLE.id, 0)
		fun findCoordinate() : List<CoordinateContext> = getRuleContexts(solver.getType("CoordinateContext"))
		fun findCoordinate(i: Int) : CoordinateContext? = getRuleContext(solver.getType("CoordinateContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterRectangle(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitRectangle(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitRectangle(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  rectangle() : RectangleContext {
		var _localctx : RectangleContext = RectangleContext(context, state)
		enterRule(_localctx, 56, Rules.RULE_rectangle.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 413
			match(K_RECTANGLE) as Token
			this.state = 414
			match(LPAR) as Token
			this.state = 415
			coordinate()
			this.state = 416
			match(T__2) as Token
			this.state = 417
			coordinate()
			this.state = 418
			match(RPAR) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class CoordinateContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_coordinate.id
	        set(value) { throw RuntimeException() }
		fun K_LATLNG() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_LATLNG.id, 0)
		fun findNumeric_literal() : List<Numeric_literalContext> = getRuleContexts(solver.getType("Numeric_literalContext"))
		fun findNumeric_literal(i: Int) : Numeric_literalContext? = getRuleContext(solver.getType("Numeric_literalContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterCoordinate(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitCoordinate(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitCoordinate(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  coordinate() : CoordinateContext {
		var _localctx : CoordinateContext = CoordinateContext(context, state)
		enterRule(_localctx, 58, Rules.RULE_coordinate.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 420
			match(K_LATLNG) as Token
			this.state = 421
			match(LPAR) as Token
			this.state = 422
			numeric_literal()
			this.state = 423
			match(T__2) as Token
			this.state = 424
			numeric_literal()
			this.state = 425
			match(RPAR) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class KeywordContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_keyword.id
	        set(value) { throw RuntimeException() }
		fun K_ALTER() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_ALTER.id, 0)
		fun K_AND() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_AND.id, 0)
		fun K_OR() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_OR.id, 0)
		fun K_AS() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_AS.id, 0)
		fun K_ASC() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_ASC.id, 0)
		fun K_AVERAGE() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_AVERAGE.id, 0)
		fun K_BY() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_BY.id, 0)
		fun K_BETWEEN() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_BETWEEN.id, 0)
		fun K_CASE() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_CASE.id, 0)
		fun K_CIRCLE() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_CIRCLE.id, 0)
		fun K_COLUMN() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_COLUMN.id, 0)
		fun K_CONTAIN() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_CONTAIN.id, 0)
		fun K_CONTAINS() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_CONTAINS.id, 0)
		fun K_COUNT() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_COUNT.id, 0)
		fun K_CREATE() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_CREATE.id, 0)
		fun K_DELETE() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_DELETE.id, 0)
		fun K_DESC() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_DESC.id, 0)
		fun K_DOES() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_DOES.id, 0)
		fun K_DROP() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_DROP.id, 0)
		fun K_ENDS() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_ENDS.id, 0)
		fun K_EQUAL() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_EQUAL.id, 0)
		fun K_FROM() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_FROM.id, 0)
		fun K_GROUP() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_GROUP.id, 0)
		fun K_HAVING() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_HAVING.id, 0)
		fun K_IGNORING() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_IGNORING.id, 0)
		fun K_IN() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_IN.id, 0)
		fun K_INSERT() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_INSERT.id, 0)
		fun K_INTO() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_INTO.id, 0)
		fun K_JOIN() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_JOIN.id, 0)
		fun K_LATLNG() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_LATLNG.id, 0)
		fun K_LEFT() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_LEFT.id, 0)
		fun K_LIKE() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_LIKE.id, 0)
		fun K_LIMIT() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_LIMIT.id, 0)
		fun K_MATCHES() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_MATCHES.id, 0)
		fun K_MAXIMUM() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_MAXIMUM.id, 0)
		fun K_MINIMUM() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_MINIMUM.id, 0)
		fun K_NOT() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_NOT.id, 0)
		fun K_OF() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_OF.id, 0)
		fun K_OFFSET() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_OFFSET.id, 0)
		fun K_ON() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_ON.id, 0)
		fun K_ORDER() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_ORDER.id, 0)
		fun K_OUTER() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_OUTER.id, 0)
		fun K_RECTANGLE() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_RECTANGLE.id, 0)
		fun K_RENAME() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_RENAME.id, 0)
		fun K_SELECT() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_SELECT.id, 0)
		fun K_SET() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_SET.id, 0)
		fun K_STARTS() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_STARTS.id, 0)
		fun K_ST_DISTANCE() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_ST_DISTANCE.id, 0)
		fun K_ST_INTERSECTS() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_ST_INTERSECTS.id, 0)
		fun K_SUM() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_SUM.id, 0)
		fun K_TABLE() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_TABLE.id, 0)
		fun K_TO() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_TO.id, 0)
		fun K_UPDATE() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_UPDATE.id, 0)
		fun K_VALUES() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_VALUES.id, 0)
		fun K_VIEW() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_VIEW.id, 0)
		fun K_WHERE() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_WHERE.id, 0)
		fun K_WITH() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.K_WITH.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterKeyword(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitKeyword(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitKeyword(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  keyword() : KeywordContext {
		var _localctx : KeywordContext = KeywordContext(context, state)
		enterRule(_localctx, 60, Rules.RULE_keyword.id)
		try {
			this.state = 485
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			EOF  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			}}
			K_ALTER  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 428
			match(K_ALTER) as Token
			}}
			K_AND  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 429
			match(K_AND) as Token
			}}
			K_OR  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 430
			match(K_OR) as Token
			}}
			K_AS  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 431
			match(K_AS) as Token
			}}
			K_ASC  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 432
			match(K_ASC) as Token
			}}
			K_AVERAGE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 433
			match(K_AVERAGE) as Token
			}}
			K_BY  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 8)
			if (true){
			this.state = 434
			match(K_BY) as Token
			}}
			K_BETWEEN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 9)
			if (true){
			this.state = 435
			match(K_BETWEEN) as Token
			}}
			K_CASE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 10)
			if (true){
			this.state = 436
			match(K_CASE) as Token
			}}
			K_CIRCLE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 11)
			if (true){
			this.state = 437
			match(K_CIRCLE) as Token
			}}
			K_COLUMN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 12)
			if (true){
			this.state = 438
			match(K_COLUMN) as Token
			}}
			K_CONTAIN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 13)
			if (true){
			this.state = 439
			match(K_CONTAIN) as Token
			}}
			K_CONTAINS  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 14)
			if (true){
			this.state = 440
			match(K_CONTAINS) as Token
			}}
			K_COUNT  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 15)
			if (true){
			this.state = 441
			match(K_COUNT) as Token
			}}
			K_CREATE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 16)
			if (true){
			this.state = 442
			match(K_CREATE) as Token
			}}
			K_DELETE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 17)
			if (true){
			this.state = 443
			match(K_DELETE) as Token
			}}
			K_DESC  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 18)
			if (true){
			this.state = 444
			match(K_DESC) as Token
			}}
			K_DOES  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 19)
			if (true){
			this.state = 445
			match(K_DOES) as Token
			}}
			K_DROP  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 20)
			if (true){
			this.state = 446
			match(K_DROP) as Token
			}}
			K_ENDS  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 21)
			if (true){
			this.state = 447
			match(K_ENDS) as Token
			}}
			K_EQUAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 22)
			if (true){
			this.state = 448
			match(K_EQUAL) as Token
			}}
			K_FROM  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 23)
			if (true){
			this.state = 449
			match(K_FROM) as Token
			}}
			K_GROUP  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 24)
			if (true){
			this.state = 450
			match(K_GROUP) as Token
			}}
			K_HAVING  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 25)
			if (true){
			this.state = 451
			match(K_HAVING) as Token
			}}
			K_IGNORING  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 26)
			if (true){
			this.state = 452
			match(K_IGNORING) as Token
			}}
			K_IN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 27)
			if (true){
			this.state = 453
			match(K_IN) as Token
			}}
			K_INSERT  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 28)
			if (true){
			this.state = 454
			match(K_INSERT) as Token
			}}
			K_INTO  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 29)
			if (true){
			this.state = 455
			match(K_INTO) as Token
			}}
			K_JOIN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 30)
			if (true){
			this.state = 456
			match(K_JOIN) as Token
			}}
			K_LATLNG  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 31)
			if (true){
			this.state = 457
			match(K_LATLNG) as Token
			}}
			K_LEFT  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 32)
			if (true){
			this.state = 458
			match(K_LEFT) as Token
			}}
			K_LIKE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 33)
			if (true){
			this.state = 459
			match(K_LIKE) as Token
			}}
			K_LIMIT  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 34)
			if (true){
			this.state = 460
			match(K_LIMIT) as Token
			}}
			K_MATCHES  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 35)
			if (true){
			this.state = 461
			match(K_MATCHES) as Token
			}}
			K_MAXIMUM  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 36)
			if (true){
			this.state = 462
			match(K_MAXIMUM) as Token
			}}
			K_MINIMUM  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 37)
			if (true){
			this.state = 463
			match(K_MINIMUM) as Token
			}}
			K_NOT  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 38)
			if (true){
			this.state = 464
			match(K_NOT) as Token
			}}
			K_OF  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 39)
			if (true){
			this.state = 465
			match(K_OF) as Token
			}}
			K_OFFSET  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 40)
			if (true){
			this.state = 466
			match(K_OFFSET) as Token
			}}
			K_ON  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 41)
			if (true){
			this.state = 467
			match(K_ON) as Token
			}}
			K_ORDER  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 42)
			if (true){
			this.state = 468
			match(K_ORDER) as Token
			}}
			K_OUTER  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 43)
			if (true){
			this.state = 469
			match(K_OUTER) as Token
			}}
			K_RECTANGLE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 44)
			if (true){
			this.state = 470
			match(K_RECTANGLE) as Token
			}}
			K_RENAME  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 45)
			if (true){
			this.state = 471
			match(K_RENAME) as Token
			}}
			K_SELECT  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 46)
			if (true){
			this.state = 472
			match(K_SELECT) as Token
			}}
			K_SET  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 47)
			if (true){
			this.state = 473
			match(K_SET) as Token
			}}
			K_STARTS  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 48)
			if (true){
			this.state = 474
			match(K_STARTS) as Token
			}}
			K_ST_DISTANCE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 49)
			if (true){
			this.state = 475
			match(K_ST_DISTANCE) as Token
			}}
			K_ST_INTERSECTS  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 50)
			if (true){
			this.state = 476
			match(K_ST_INTERSECTS) as Token
			}}
			K_SUM  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 51)
			if (true){
			this.state = 477
			match(K_SUM) as Token
			}}
			K_TABLE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 52)
			if (true){
			this.state = 478
			match(K_TABLE) as Token
			}}
			K_TO  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 53)
			if (true){
			this.state = 479
			match(K_TO) as Token
			}}
			K_UPDATE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 54)
			if (true){
			this.state = 480
			match(K_UPDATE) as Token
			}}
			K_VALUES  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 55)
			if (true){
			this.state = 481
			match(K_VALUES) as Token
			}}
			K_VIEW  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 56)
			if (true){
			this.state = 482
			match(K_VIEW) as Token
			}}
			K_WHERE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 57)
			if (true){
			this.state = 483
			match(K_WHERE) as Token
			}}
			K_WITH  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 58)
			if (true){
			this.state = 484
			match(K_WITH) as Token
			}}
			else -> throw NoViableAltException(this)
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class OperatorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_operator.id
	        set(value) { throw RuntimeException() }
		fun LT() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.LT.id, 0)
		fun LT_EQ() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.LT_EQ.id, 0)
		fun GT() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.GT.id, 0)
		fun GT_EQ() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.GT_EQ.id, 0)
		fun EQ() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.EQ.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterOperator(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitOperator(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitOperator(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  operator() : OperatorContext {
		var _localctx : OperatorContext = OperatorContext(context, state)
		enterRule(_localctx, 62, Rules.RULE_operator.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 487
			_la = _input!!.LA(1)
			if ( !(((((_la - 65)) and 0x3f.inv()) == 0 && ((1L shl (_la - 65)) and ((1L shl (LT_EQ - 65)) or (1L shl (GT_EQ - 65)) or (1L shl (GT - 65)) or (1L shl (EQ - 65)) or (1L shl (LT - 65)))) != 0L)) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class LiteralContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_literal.id
	        set(value) { throw RuntimeException() }
		fun findNumeric_literal() : Numeric_literalContext? = getRuleContext(solver.getType("Numeric_literalContext"),0)
		fun findString_literal() : String_literalContext? = getRuleContext(solver.getType("String_literalContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterLiteral(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitLiteral(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitLiteral(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  literal() : LiteralContext {
		var _localctx : LiteralContext = LiteralContext(context, state)
		enterRule(_localctx, 64, Rules.RULE_literal.id)
		try {
			this.state = 491
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			NUMERIC_LITERAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 489
			numeric_literal()
			}}
			STRING_LITERAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 490
			string_literal()
			}}
			else -> throw NoViableAltException(this)
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Error_messageContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_error_message.id
	        set(value) { throw RuntimeException() }
		fun findString_literal() : String_literalContext? = getRuleContext(solver.getType("String_literalContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterError_message(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitError_message(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitError_message(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  error_message() : Error_messageContext {
		var _localctx : Error_messageContext = Error_messageContext(context, state)
		enterRule(_localctx, 66, Rules.RULE_error_message.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 493
			string_literal()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class IdentifierContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_identifier.id
	        set(value) { throw RuntimeException() }
		fun findString_literal() : String_literalContext? = getRuleContext(solver.getType("String_literalContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterIdentifier(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitIdentifier(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitIdentifier(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  identifier() : IdentifierContext {
		var _localctx : IdentifierContext = IdentifierContext(context, state)
		enterRule(_localctx, 68, Rules.RULE_identifier.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 495
			string_literal()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Column_aliasContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_column_alias.id
	        set(value) { throw RuntimeException() }
		fun findIdentifier() : IdentifierContext? = getRuleContext(solver.getType("IdentifierContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterColumn_alias(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitColumn_alias(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitColumn_alias(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  column_alias() : Column_aliasContext {
		var _localctx : Column_aliasContext = Column_aliasContext(context, state)
		enterRule(_localctx, 70, Rules.RULE_column_alias.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 497
			identifier()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Table_nameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_table_name.id
	        set(value) { throw RuntimeException() }
		fun findIdentifier() : IdentifierContext? = getRuleContext(solver.getType("IdentifierContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterTable_name(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitTable_name(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitTable_name(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  table_name() : Table_nameContext {
		var _localctx : Table_nameContext = Table_nameContext(context, state)
		enterRule(_localctx, 72, Rules.RULE_table_name.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 499
			identifier()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Column_nameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_column_name.id
	        set(value) { throw RuntimeException() }
		fun findIdentifier() : IdentifierContext? = getRuleContext(solver.getType("IdentifierContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterColumn_name(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitColumn_name(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitColumn_name(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  column_name() : Column_nameContext {
		var _localctx : Column_nameContext = Column_nameContext(context, state)
		enterRule(_localctx, 74, Rules.RULE_column_name.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 501
			identifier()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class New_table_nameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_new_table_name.id
	        set(value) { throw RuntimeException() }
		fun findTable_name() : Table_nameContext? = getRuleContext(solver.getType("Table_nameContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterNew_table_name(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitNew_table_name(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitNew_table_name(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  new_table_name() : New_table_nameContext {
		var _localctx : New_table_nameContext = New_table_nameContext(context, state)
		enterRule(_localctx, 76, Rules.RULE_new_table_name.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 503
			table_name()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class View_nameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_view_name.id
	        set(value) { throw RuntimeException() }
		fun findIdentifier() : IdentifierContext? = getRuleContext(solver.getType("IdentifierContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterView_name(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitView_name(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitView_name(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  view_name() : View_nameContext {
		var _localctx : View_nameContext = View_nameContext(context, state)
		enterRule(_localctx, 78, Rules.RULE_view_name.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 505
			identifier()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Table_aliasContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_table_alias.id
	        set(value) { throw RuntimeException() }
		fun findIdentifier() : IdentifierContext? = getRuleContext(solver.getType("IdentifierContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterTable_alias(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitTable_alias(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitTable_alias(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  table_alias() : Table_aliasContext {
		var _localctx : Table_aliasContext = Table_aliasContext(context, state)
		enterRule(_localctx, 80, Rules.RULE_table_alias.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 507
			identifier()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Numeric_literalContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_numeric_literal.id
	        set(value) { throw RuntimeException() }
		fun NUMERIC_LITERAL() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.NUMERIC_LITERAL.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterNumeric_literal(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitNumeric_literal(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitNumeric_literal(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  numeric_literal() : Numeric_literalContext {
		var _localctx : Numeric_literalContext = Numeric_literalContext(context, state)
		enterRule(_localctx, 82, Rules.RULE_numeric_literal.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 509
			match(NUMERIC_LITERAL) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class String_literalContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_string_literal.id
	        set(value) { throw RuntimeException() }
		fun STRING_LITERAL() : TerminalNode? = getToken(FusionTablesSqlParser.Tokens.STRING_LITERAL.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).enterString_literal(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FusionTablesSqlListener ) (listener as FusionTablesSqlListener).exitString_literal(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FusionTablesSqlVisitor ) return (visitor as FusionTablesSqlVisitor<out T>).visitString_literal(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  string_literal() : String_literalContext {
		var _localctx : String_literalContext = String_literalContext(context, state)
		enterRule(_localctx, 84, Rules.RULE_string_literal.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 511
			match(STRING_LITERAL) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

}