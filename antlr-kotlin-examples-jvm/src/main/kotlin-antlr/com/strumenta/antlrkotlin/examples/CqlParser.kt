// Generated from java-escape by ANTLR 4.7.1
package com.strumenta.antlrkotlin.examples;
import com.strumenta.kotlinmultiplatform.asCharArray
import com.strumenta.kotlinmultiplatform.getType
import com.strumenta.kotlinmultiplatform.TypeDeclarator
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

class CqlParser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(CqlParser.RootContext::class,
                                                              CqlParser.CqlsContext::class,
                                                              CqlParser.StatementSeparatorContext::class,
                                                              CqlParser.EmptyContext::class,
                                                              CqlParser.CqlContext::class,
                                                              CqlParser.RevokeContext::class,
                                                              CqlParser.ListUsersContext::class,
                                                              CqlParser.ListRolesContext::class,
                                                              CqlParser.ListPermissionsContext::class,
                                                              CqlParser.GrantContext::class,
                                                              CqlParser.PriviledgeContext::class,
                                                              CqlParser.ResourceContext::class,
                                                              CqlParser.CreateUserContext::class,
                                                              CqlParser.CreateRoleContext::class,
                                                              CqlParser.CreateTypeContext::class,
                                                              CqlParser.TypeMemberColumnListContext::class,
                                                              CqlParser.CreateTriggerContext::class,
                                                              CqlParser.CreateMaterializedViewContext::class,
                                                              CqlParser.MaterializedViewWhereContext::class,
                                                              CqlParser.ColumnNotNullListContext::class,
                                                              CqlParser.ColumnNotNullContext::class,
                                                              CqlParser.MaterializedViewOptionsContext::class,
                                                              CqlParser.CreateKeyspaceContext::class,
                                                              CqlParser.CreateFunctionContext::class,
                                                              CqlParser.CodeBlockContext::class,
                                                              CqlParser.ParamListContext::class,
                                                              CqlParser.ReturnModeContext::class,
                                                              CqlParser.CreateAggregateContext::class,
                                                              CqlParser.InitCondDefinitionContext::class,
                                                              CqlParser.InitCondHashContext::class,
                                                              CqlParser.InitCondHashItemContext::class,
                                                              CqlParser.InitCondListNestedContext::class,
                                                              CqlParser.InitCondListContext::class,
                                                              CqlParser.OrReplaceContext::class,
                                                              CqlParser.AlterUserContext::class,
                                                              CqlParser.UserPasswordContext::class,
                                                              CqlParser.UserSuperUserContext::class,
                                                              CqlParser.AlterTypeContext::class,
                                                              CqlParser.AlterTypeOperationContext::class,
                                                              CqlParser.AlterTypeRenameContext::class,
                                                              CqlParser.AlterTypeRenameListContext::class,
                                                              CqlParser.AlterTypeRenameItemContext::class,
                                                              CqlParser.AlterTypeAddContext::class,
                                                              CqlParser.AlterTypeAlterTypeContext::class,
                                                              CqlParser.AlterTableContext::class,
                                                              CqlParser.AlterTableOperationContext::class,
                                                              CqlParser.AlterTableWithContext::class,
                                                              CqlParser.AlterTableRenameContext::class,
                                                              CqlParser.AlterTableDropCompactStorageContext::class,
                                                              CqlParser.AlterTableDropColumnsContext::class,
                                                              CqlParser.AlterTableDropColumnListContext::class,
                                                              CqlParser.AlterTableAddContext::class,
                                                              CqlParser.AlterTableColumnDefinitionContext::class,
                                                              CqlParser.AlterRoleContext::class,
                                                              CqlParser.RoleWithContext::class,
                                                              CqlParser.RoleWithOptionsContext::class,
                                                              CqlParser.AlterMaterializedViewContext::class,
                                                              CqlParser.DropUserContext::class,
                                                              CqlParser.DropTypeContext::class,
                                                              CqlParser.DropMaterializedViewContext::class,
                                                              CqlParser.DropAggregateContext::class,
                                                              CqlParser.DropFunctionContext::class,
                                                              CqlParser.DropTriggerContext::class,
                                                              CqlParser.DropRoleContext::class,
                                                              CqlParser.DropTableContext::class,
                                                              CqlParser.DropKeyspaceContext::class,
                                                              CqlParser.DropIndexContext::class,
                                                              CqlParser.CreateTableContext::class,
                                                              CqlParser.WithElementContext::class,
                                                              CqlParser.ClusteringOrderContext::class,
                                                              CqlParser.TableOptionsContext::class,
                                                              CqlParser.TableOptionItemContext::class,
                                                              CqlParser.TableOptionNameContext::class,
                                                              CqlParser.TableOptionValueContext::class,
                                                              CqlParser.OptionHashContext::class,
                                                              CqlParser.OptionHashItemContext::class,
                                                              CqlParser.OptionHashKeyContext::class,
                                                              CqlParser.OptionHashValueContext::class,
                                                              CqlParser.ColumnDefinitionListContext::class,
                                                              CqlParser.ColumnDefinitionContext::class,
                                                              CqlParser.PrimaryKeyColumnContext::class,
                                                              CqlParser.PrimaryKeyElementContext::class,
                                                              CqlParser.PrimaryKeyDefinitionContext::class,
                                                              CqlParser.SinglePrimaryKeyContext::class,
                                                              CqlParser.CompoundKeyContext::class,
                                                              CqlParser.CompositeKeyContext::class,
                                                              CqlParser.PartitionKeyListContext::class,
                                                              CqlParser.ClusteringKeyListContext::class,
                                                              CqlParser.PartitionKeyContext::class,
                                                              CqlParser.ClusteringKeyContext::class,
                                                              CqlParser.ApplyBatchContext::class,
                                                              CqlParser.BeginBatchContext::class,
                                                              CqlParser.BatchTypeContext::class,
                                                              CqlParser.AlterKeyspaceContext::class,
                                                              CqlParser.ReplicationListContext::class,
                                                              CqlParser.ReplicationListItemContext::class,
                                                              CqlParser.DurableWritesContext::class,
                                                              CqlParser.UseContext::class,
                                                              CqlParser.TruncateContext::class,
                                                              CqlParser.CreateIndexContext::class,
                                                              CqlParser.IndexNameContext::class,
                                                              CqlParser.IndexColumnSpecContext::class,
                                                              CqlParser.IndexKeysSpecContext::class,
                                                              CqlParser.IndexEntriesSSpecContext::class,
                                                              CqlParser.IndexFullSpecContext::class,
                                                              CqlParser.DeleteContext::class,
                                                              CqlParser.DeleteColumnListContext::class,
                                                              CqlParser.DeleteColumnItemContext::class,
                                                              CqlParser.UpdateContext::class,
                                                              CqlParser.IfSpecContext::class,
                                                              CqlParser.IfConditionListContext::class,
                                                              CqlParser.IfConditionContext::class,
                                                              CqlParser.AssignmentsContext::class,
                                                              CqlParser.AssignmentElementContext::class,
                                                              CqlParser.AssignmentSetContext::class,
                                                              CqlParser.AssignmentMapContext::class,
                                                              CqlParser.AssignmentListContext::class,
                                                              CqlParser.InsertContext::class,
                                                              CqlParser.UsingTtlTimestampContext::class,
                                                              CqlParser.TimestampContext::class,
                                                              CqlParser.TtlContext::class,
                                                              CqlParser.UsingTimestampSpecContext::class,
                                                              CqlParser.IfNotExistContext::class,
                                                              CqlParser.IfExistContext::class,
                                                              CqlParser.InsertValuesSpecContext::class,
                                                              CqlParser.InsertColumnSpecContext::class,
                                                              CqlParser.ColumnListContext::class,
                                                              CqlParser.ExpressionListContext::class,
                                                              CqlParser.SelectContext::class,
                                                              CqlParser.AllowFilteringSpecContext::class,
                                                              CqlParser.LimitSpecContext::class,
                                                              CqlParser.FromSpecContext::class,
                                                              CqlParser.FromSpecElementContext::class,
                                                              CqlParser.OrderSpecContext::class,
                                                              CqlParser.OrderSpecElementContext::class,
                                                              CqlParser.WhereSpecContext::class,
                                                              CqlParser.DistinctSpecContext::class,
                                                              CqlParser.SelectElementsContext::class,
                                                              CqlParser.SelectElementContext::class,
                                                              CqlParser.RelationElementsContext::class,
                                                              CqlParser.RelationElementContext::class,
                                                              CqlParser.RelalationContainsContext::class,
                                                              CqlParser.RelalationContainsKeyContext::class,
                                                              CqlParser.FunctionCallContext::class,
                                                              CqlParser.FunctionArgsContext::class,
                                                              CqlParser.ConstantContext::class,
                                                              CqlParser.DecimalLiteralContext::class,
                                                              CqlParser.FloatLiteralContext::class,
                                                              CqlParser.StringLiteralContext::class,
                                                              CqlParser.BooleanLiteralContext::class,
                                                              CqlParser.HexadecimalLiteralContext::class,
                                                              CqlParser.KeyspaceContext::class,
                                                              CqlParser.TableContext::class,
                                                              CqlParser.ColumnContext::class,
                                                              CqlParser.DataTypeContext::class,
                                                              CqlParser.DataTypeNameContext::class,
                                                              CqlParser.DataTypeDefinitionContext::class,
                                                              CqlParser.OrderDirectionContext::class,
                                                              CqlParser.RoleContext::class,
                                                              CqlParser.TriggerContext::class,
                                                              CqlParser.TriggerClassContext::class,
                                                              CqlParser.MaterializedViewContext::class,
                                                              CqlParser.TypeContext::class,
                                                              CqlParser.AggregateContext::class,
                                                              CqlParser.FunctionContext::class,
                                                              CqlParser.LanguageContext::class,
                                                              CqlParser.UserContext::class,
                                                              CqlParser.PasswordContext::class,
                                                              CqlParser.HashKeyContext::class,
                                                              CqlParser.ParamContext::class,
                                                              CqlParser.ParamNameContext::class,
                                                              CqlParser.KwAddContext::class,
                                                              CqlParser.KwAggregateContext::class,
                                                              CqlParser.KwAllContext::class,
                                                              CqlParser.KwAllPermissionsContext::class,
                                                              CqlParser.KwAllowContext::class,
                                                              CqlParser.KwAlterContext::class,
                                                              CqlParser.KwAndContext::class,
                                                              CqlParser.KwApplyContext::class,
                                                              CqlParser.KwAsContext::class,
                                                              CqlParser.KwAscContext::class,
                                                              CqlParser.KwAuthorizeContext::class,
                                                              CqlParser.KwBatchContext::class,
                                                              CqlParser.KwBeginContext::class,
                                                              CqlParser.KwByContext::class,
                                                              CqlParser.KwCalledContext::class,
                                                              CqlParser.KwClusteringContext::class,
                                                              CqlParser.KwCompactContext::class,
                                                              CqlParser.KwContainsContext::class,
                                                              CqlParser.KwCreateContext::class,
                                                              CqlParser.KwDeleteContext::class,
                                                              CqlParser.KwDescContext::class,
                                                              CqlParser.KwDescibeContext::class,
                                                              CqlParser.KwDistinctContext::class,
                                                              CqlParser.KwDropContext::class,
                                                              CqlParser.KwDurableWritesContext::class,
                                                              CqlParser.KwEntriesContext::class,
                                                              CqlParser.KwExecuteContext::class,
                                                              CqlParser.KwExistsContext::class,
                                                              CqlParser.KwFilteringContext::class,
                                                              CqlParser.KwFinalfuncContext::class,
                                                              CqlParser.KwFromContext::class,
                                                              CqlParser.KwFullContext::class,
                                                              CqlParser.KwFunctionContext::class,
                                                              CqlParser.KwFunctionsContext::class,
                                                              CqlParser.KwGrantContext::class,
                                                              CqlParser.KwIfContext::class,
                                                              CqlParser.KwInContext::class,
                                                              CqlParser.KwIndexContext::class,
                                                              CqlParser.KwInitcondContext::class,
                                                              CqlParser.KwInputContext::class,
                                                              CqlParser.KwInsertContext::class,
                                                              CqlParser.KwIntoContext::class,
                                                              CqlParser.KwIsContext::class,
                                                              CqlParser.KwKeyContext::class,
                                                              CqlParser.KwKeysContext::class,
                                                              CqlParser.KwKeyspaceContext::class,
                                                              CqlParser.KwKeyspacesContext::class,
                                                              CqlParser.KwLanguageContext::class,
                                                              CqlParser.KwLimitContext::class,
                                                              CqlParser.KwListContext::class,
                                                              CqlParser.KwLoggedContext::class,
                                                              CqlParser.KwLoginContext::class,
                                                              CqlParser.KwMaterializedContext::class,
                                                              CqlParser.KwModifyContext::class,
                                                              CqlParser.KwNosuperuserContext::class,
                                                              CqlParser.KwNorecursiveContext::class,
                                                              CqlParser.KwNotContext::class,
                                                              CqlParser.KwNullContext::class,
                                                              CqlParser.KwOfContext::class,
                                                              CqlParser.KwOnContext::class,
                                                              CqlParser.KwOptionsContext::class,
                                                              CqlParser.KwOrContext::class,
                                                              CqlParser.KwOrderContext::class,
                                                              CqlParser.KwPasswordContext::class,
                                                              CqlParser.KwPrimaryContext::class,
                                                              CqlParser.KwRenameContext::class,
                                                              CqlParser.KwReplaceContext::class,
                                                              CqlParser.KwReplicationContext::class,
                                                              CqlParser.KwReturnsContext::class,
                                                              CqlParser.KwRoleContext::class,
                                                              CqlParser.KwRolesContext::class,
                                                              CqlParser.KwSelectContext::class,
                                                              CqlParser.KwSetContext::class,
                                                              CqlParser.KwSfuncContext::class,
                                                              CqlParser.KwStorageContext::class,
                                                              CqlParser.KwStypeContext::class,
                                                              CqlParser.KwSuperuserContext::class,
                                                              CqlParser.KwTableContext::class,
                                                              CqlParser.KwTimestampContext::class,
                                                              CqlParser.KwToContext::class,
                                                              CqlParser.KwTriggerContext::class,
                                                              CqlParser.KwTruncateContext::class,
                                                              CqlParser.KwTtlContext::class,
                                                              CqlParser.KwTypeContext::class,
                                                              CqlParser.KwUnloggedContext::class,
                                                              CqlParser.KwUpdateContext::class,
                                                              CqlParser.KwUseContext::class,
                                                              CqlParser.KwUserContext::class,
                                                              CqlParser.KwUsersContext::class,
                                                              CqlParser.KwUsingContext::class,
                                                              CqlParser.KwValuesContext::class,
                                                              CqlParser.KwViewContext::class,
                                                              CqlParser.KwWhereContext::class,
                                                              CqlParser.KwWithContext::class,
                                                              CqlParser.KwRevokeContext::class,
                                                              CqlParser.EofContext::class,
                                                              CqlParser.SyntaxBracketLrContext::class,
                                                              CqlParser.SyntaxBracketRrContext::class,
                                                              CqlParser.SyntaxBracketLcContext::class,
                                                              CqlParser.SyntaxBracketRcContext::class,
                                                              CqlParser.SyntaxBracketLaContext::class,
                                                              CqlParser.SyntaxBracketRaContext::class,
                                                              CqlParser.SyntaxBracketLsContext::class,
                                                              CqlParser.SyntaxBracketRsContext::class,
                                                              CqlParser.SyntaxCommaContext::class,
                                                              CqlParser.SyntaxColonContext::class)
    }

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "CqlParser.g4"

    override val tokenNames: Array<String?>?
        get() = CqlParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = CqlParser.Companion.ruleNames
    override val atn: ATN
        get() = CqlParser.Companion.ATN
    override val vocabulary: Vocabulary
        get() = CqlParser.Companion.VOCABULARY

    enum class Tokens(val id: Int) {
        EOF(-1),
        LR_BRACKET(1),
        RR_BRACKET(2),
        LC_BRACKET(3),
        RC_BRACKET(4),
        LS_BRACKET(5),
        RS_BRACKET(6),
        COMMA(7),
        SEMI(8),
        COLON(9),
        SPACE(10),
        SPEC_MYSQL_COMMENT(11),
        COMMENT_INPUT(12),
        LINE_COMMENT(13),
        DOT(14),
        STAR(15),
        DIVIDE(16),
        MODULE(17),
        PLUS(18),
        MINUSMINUS(19),
        MINUS(20),
        DQUOTE(21),
        SQUOTE(22),
        K_ADD(23),
        K_AGGREGATE(24),
        K_ALL(25),
        K_ALLOW(26),
        K_ALTER(27),
        K_AND(28),
        K_ANY(29),
        K_APPLY(30),
        K_AS(31),
        K_ASC(32),
        K_AUTHORIZE(33),
        K_BATCH(34),
        K_BEGIN(35),
        K_BY(36),
        K_CALLED(37),
        K_CLUSTERING(38),
        K_COLUMNFAMILY(39),
        K_COMPACT(40),
        K_CONSISTENCY(41),
        K_CONTAINS(42),
        K_CREATE(43),
        K_CUSTOM(44),
        K_DELETE(45),
        K_DESC(46),
        K_DESCRIBE(47),
        K_DISTINCT(48),
        K_DROP(49),
        K_DURABLE_WRITES(50),
        K_EACH_QUORUM(51),
        K_ENTRIES(52),
        K_EXECUTE(53),
        K_EXISTS(54),
        K_FALSE(55),
        K_FILTERING(56),
        K_FINALFUNC(57),
        K_FROM(58),
        K_FULL(59),
        K_FUNCTION(60),
        K_FUNCTIONS(61),
        K_GRANT(62),
        K_IF(63),
        K_IN(64),
        K_INDEX(65),
        K_INFINITY(66),
        K_INITCOND(67),
        K_INPUT(68),
        K_INSERT(69),
        K_INTO(70),
        K_IS(71),
        K_KEY(72),
        K_KEYS(73),
        K_KEYSPACE(74),
        K_KEYSPACES(75),
        K_LANGUAGE(76),
        K_LEVEL(77),
        K_LIMIT(78),
        K_LOCAL_ONE(79),
        K_LOCAL_QUORUM(80),
        K_LOGGED(81),
        K_LOGIN(82),
        K_MATERIALIZED(83),
        K_MODIFY(84),
        K_NAN(85),
        K_NORECURSIVE(86),
        K_NOSUPERUSER(87),
        K_NOT(88),
        K_NULL(89),
        K_OF(90),
        K_ON(91),
        K_ONE(92),
        K_OPTIONS(93),
        K_OR(94),
        K_ORDER(95),
        K_PARTITION(96),
        K_PASSWORD(97),
        K_PER(98),
        K_PERMISSION(99),
        K_PERMISSIONS(100),
        K_PRIMARY(101),
        K_QUORUM(102),
        K_RENAME(103),
        K_REPLACE(104),
        K_REPLICATION(105),
        K_RETURNS(106),
        K_REVOKE(107),
        K_ROLE(108),
        K_ROLES(109),
        K_SCHEMA(110),
        K_SELECT(111),
        K_SET(112),
        K_SFUNC(113),
        K_STATIC(114),
        K_STORAGE(115),
        K_STYPE(116),
        K_SUPERUSER(117),
        K_TABLE(118),
        K_THREE(119),
        K_TIMESTAMP(120),
        K_TO(121),
        K_TOKEN(122),
        K_TRIGGER(123),
        K_TRUE(124),
        K_TRUNCATE(125),
        K_TTL(126),
        K_TWO(127),
        K_TYPE(128),
        K_UNLOGGED(129),
        K_UPDATE(130),
        K_USE(131),
        K_USER(132),
        K_USING(133),
        K_UUID(134),
        K_VALUES(135),
        K_VIEW(136),
        K_WHERE(137),
        K_WITH(138),
        K_WRITETIME(139),
        K_ASCII(140),
        K_BIGINT(141),
        K_BLOB(142),
        K_BOOLEAN(143),
        K_COUNTER(144),
        K_DATE(145),
        K_DECIMAL(146),
        K_DOUBLE(147),
        K_FLOAT(148),
        K_FROZEN(149),
        K_INET(150),
        K_INT(151),
        K_LIST(152),
        K_MAP(153),
        K_SMALLINT(154),
        K_TEXT(155),
        K_TIMEUUID(156),
        K_TIME(157),
        K_TINYINT(158),
        K_TUPLE(159),
        K_VARCHAR(160),
        K_VARINT(161),
        CODE_BLOCK(162),
        STRING_LITERAL(163),
        DECIMAL_LITERAL(164),
        FLOAT_LITERAL(165),
        HEXADECIMAL_LITERAL(166),
        REAL_LITERAL(167),
        OBJECT_NAME(168),
        UUID(169),
        OPERATOR_EQ(170),
        OPERATOR_LT(171),
        OPERATOR_GT(172),
        OPERATOR_LTE(173),
        OPERATOR_GTE(174),
        K_USERS(175)
    }

    enum class Rules(val id: Int) {
        RULE_root(0),
        RULE_cqls(1),
        RULE_statementSeparator(2),
        RULE_empty(3),
        RULE_cql(4),
        RULE_revoke(5),
        RULE_listUsers(6),
        RULE_listRoles(7),
        RULE_listPermissions(8),
        RULE_grant(9),
        RULE_priviledge(10),
        RULE_resource(11),
        RULE_createUser(12),
        RULE_createRole(13),
        RULE_createType(14),
        RULE_typeMemberColumnList(15),
        RULE_createTrigger(16),
        RULE_createMaterializedView(17),
        RULE_materializedViewWhere(18),
        RULE_columnNotNullList(19),
        RULE_columnNotNull(20),
        RULE_materializedViewOptions(21),
        RULE_createKeyspace(22),
        RULE_createFunction(23),
        RULE_codeBlock(24),
        RULE_paramList(25),
        RULE_returnMode(26),
        RULE_createAggregate(27),
        RULE_initCondDefinition(28),
        RULE_initCondHash(29),
        RULE_initCondHashItem(30),
        RULE_initCondListNested(31),
        RULE_initCondList(32),
        RULE_orReplace(33),
        RULE_alterUser(34),
        RULE_userPassword(35),
        RULE_userSuperUser(36),
        RULE_alterType(37),
        RULE_alterTypeOperation(38),
        RULE_alterTypeRename(39),
        RULE_alterTypeRenameList(40),
        RULE_alterTypeRenameItem(41),
        RULE_alterTypeAdd(42),
        RULE_alterTypeAlterType(43),
        RULE_alterTable(44),
        RULE_alterTableOperation(45),
        RULE_alterTableWith(46),
        RULE_alterTableRename(47),
        RULE_alterTableDropCompactStorage(48),
        RULE_alterTableDropColumns(49),
        RULE_alterTableDropColumnList(50),
        RULE_alterTableAdd(51),
        RULE_alterTableColumnDefinition(52),
        RULE_alterRole(53),
        RULE_roleWith(54),
        RULE_roleWithOptions(55),
        RULE_alterMaterializedView(56),
        RULE_dropUser(57),
        RULE_dropType(58),
        RULE_dropMaterializedView(59),
        RULE_dropAggregate(60),
        RULE_dropFunction(61),
        RULE_dropTrigger(62),
        RULE_dropRole(63),
        RULE_dropTable(64),
        RULE_dropKeyspace(65),
        RULE_dropIndex(66),
        RULE_createTable(67),
        RULE_withElement(68),
        RULE_clusteringOrder(69),
        RULE_tableOptions(70),
        RULE_tableOptionItem(71),
        RULE_tableOptionName(72),
        RULE_tableOptionValue(73),
        RULE_optionHash(74),
        RULE_optionHashItem(75),
        RULE_optionHashKey(76),
        RULE_optionHashValue(77),
        RULE_columnDefinitionList(78),
        RULE_columnDefinition(79),
        RULE_primaryKeyColumn(80),
        RULE_primaryKeyElement(81),
        RULE_primaryKeyDefinition(82),
        RULE_singlePrimaryKey(83),
        RULE_compoundKey(84),
        RULE_compositeKey(85),
        RULE_partitionKeyList(86),
        RULE_clusteringKeyList(87),
        RULE_partitionKey(88),
        RULE_clusteringKey(89),
        RULE_applyBatch(90),
        RULE_beginBatch(91),
        RULE_batchType(92),
        RULE_alterKeyspace(93),
        RULE_replicationList(94),
        RULE_replicationListItem(95),
        RULE_durableWrites(96),
        RULE_use(97),
        RULE_truncate(98),
        RULE_createIndex(99),
        RULE_indexName(100),
        RULE_indexColumnSpec(101),
        RULE_indexKeysSpec(102),
        RULE_indexEntriesSSpec(103),
        RULE_indexFullSpec(104),
        RULE_delete(105),
        RULE_deleteColumnList(106),
        RULE_deleteColumnItem(107),
        RULE_update(108),
        RULE_ifSpec(109),
        RULE_ifConditionList(110),
        RULE_ifCondition(111),
        RULE_assignments(112),
        RULE_assignmentElement(113),
        RULE_assignmentSet(114),
        RULE_assignmentMap(115),
        RULE_assignmentList(116),
        RULE_insert(117),
        RULE_usingTtlTimestamp(118),
        RULE_timestamp(119),
        RULE_ttl(120),
        RULE_usingTimestampSpec(121),
        RULE_ifNotExist(122),
        RULE_ifExist(123),
        RULE_insertValuesSpec(124),
        RULE_insertColumnSpec(125),
        RULE_columnList(126),
        RULE_expressionList(127),
        RULE_select(128),
        RULE_allowFilteringSpec(129),
        RULE_limitSpec(130),
        RULE_fromSpec(131),
        RULE_fromSpecElement(132),
        RULE_orderSpec(133),
        RULE_orderSpecElement(134),
        RULE_whereSpec(135),
        RULE_distinctSpec(136),
        RULE_selectElements(137),
        RULE_selectElement(138),
        RULE_relationElements(139),
        RULE_relationElement(140),
        RULE_relalationContains(141),
        RULE_relalationContainsKey(142),
        RULE_functionCall(143),
        RULE_functionArgs(144),
        RULE_constant(145),
        RULE_decimalLiteral(146),
        RULE_floatLiteral(147),
        RULE_stringLiteral(148),
        RULE_booleanLiteral(149),
        RULE_hexadecimalLiteral(150),
        RULE_keyspace(151),
        RULE_table(152),
        RULE_column(153),
        RULE_dataType(154),
        RULE_dataTypeName(155),
        RULE_dataTypeDefinition(156),
        RULE_orderDirection(157),
        RULE_role(158),
        RULE_trigger(159),
        RULE_triggerClass(160),
        RULE_materializedView(161),
        RULE_type(162),
        RULE_aggregate(163),
        RULE_function(164),
        RULE_language(165),
        RULE_user(166),
        RULE_password(167),
        RULE_hashKey(168),
        RULE_param(169),
        RULE_paramName(170),
        RULE_kwAdd(171),
        RULE_kwAggregate(172),
        RULE_kwAll(173),
        RULE_kwAllPermissions(174),
        RULE_kwAllow(175),
        RULE_kwAlter(176),
        RULE_kwAnd(177),
        RULE_kwApply(178),
        RULE_kwAs(179),
        RULE_kwAsc(180),
        RULE_kwAuthorize(181),
        RULE_kwBatch(182),
        RULE_kwBegin(183),
        RULE_kwBy(184),
        RULE_kwCalled(185),
        RULE_kwClustering(186),
        RULE_kwCompact(187),
        RULE_kwContains(188),
        RULE_kwCreate(189),
        RULE_kwDelete(190),
        RULE_kwDesc(191),
        RULE_kwDescibe(192),
        RULE_kwDistinct(193),
        RULE_kwDrop(194),
        RULE_kwDurableWrites(195),
        RULE_kwEntries(196),
        RULE_kwExecute(197),
        RULE_kwExists(198),
        RULE_kwFiltering(199),
        RULE_kwFinalfunc(200),
        RULE_kwFrom(201),
        RULE_kwFull(202),
        RULE_kwFunction(203),
        RULE_kwFunctions(204),
        RULE_kwGrant(205),
        RULE_kwIf(206),
        RULE_kwIn(207),
        RULE_kwIndex(208),
        RULE_kwInitcond(209),
        RULE_kwInput(210),
        RULE_kwInsert(211),
        RULE_kwInto(212),
        RULE_kwIs(213),
        RULE_kwKey(214),
        RULE_kwKeys(215),
        RULE_kwKeyspace(216),
        RULE_kwKeyspaces(217),
        RULE_kwLanguage(218),
        RULE_kwLimit(219),
        RULE_kwList(220),
        RULE_kwLogged(221),
        RULE_kwLogin(222),
        RULE_kwMaterialized(223),
        RULE_kwModify(224),
        RULE_kwNosuperuser(225),
        RULE_kwNorecursive(226),
        RULE_kwNot(227),
        RULE_kwNull(228),
        RULE_kwOf(229),
        RULE_kwOn(230),
        RULE_kwOptions(231),
        RULE_kwOr(232),
        RULE_kwOrder(233),
        RULE_kwPassword(234),
        RULE_kwPrimary(235),
        RULE_kwRename(236),
        RULE_kwReplace(237),
        RULE_kwReplication(238),
        RULE_kwReturns(239),
        RULE_kwRole(240),
        RULE_kwRoles(241),
        RULE_kwSelect(242),
        RULE_kwSet(243),
        RULE_kwSfunc(244),
        RULE_kwStorage(245),
        RULE_kwStype(246),
        RULE_kwSuperuser(247),
        RULE_kwTable(248),
        RULE_kwTimestamp(249),
        RULE_kwTo(250),
        RULE_kwTrigger(251),
        RULE_kwTruncate(252),
        RULE_kwTtl(253),
        RULE_kwType(254),
        RULE_kwUnlogged(255),
        RULE_kwUpdate(256),
        RULE_kwUse(257),
        RULE_kwUser(258),
        RULE_kwUsers(259),
        RULE_kwUsing(260),
        RULE_kwValues(261),
        RULE_kwView(262),
        RULE_kwWhere(263),
        RULE_kwWith(264),
        RULE_kwRevoke(265),
        RULE_eof(266),
        RULE_syntaxBracketLr(267),
        RULE_syntaxBracketRr(268),
        RULE_syntaxBracketLc(269),
        RULE_syntaxBracketRc(270),
        RULE_syntaxBracketLa(271),
        RULE_syntaxBracketRa(272),
        RULE_syntaxBracketLs(273),
        RULE_syntaxBracketRs(274),
        RULE_syntaxComma(275),
        RULE_syntaxColon(276)
    }

	@ThreadLocal
	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("root", "cqls", "statementSeparator", "empty", 
                                "cql", "revoke", "listUsers", "listRoles", 
                                "listPermissions", "grant", "priviledge", 
                                "resource", "createUser", "createRole", 
                                "createType", "typeMemberColumnList", "createTrigger", 
                                "createMaterializedView", "materializedViewWhere", 
                                "columnNotNullList", "columnNotNull", "materializedViewOptions", 
                                "createKeyspace", "createFunction", "codeBlock", 
                                "paramList", "returnMode", "createAggregate", 
                                "initCondDefinition", "initCondHash", "initCondHashItem", 
                                "initCondListNested", "initCondList", "orReplace", 
                                "alterUser", "userPassword", "userSuperUser", 
                                "alterType", "alterTypeOperation", "alterTypeRename", 
                                "alterTypeRenameList", "alterTypeRenameItem", 
                                "alterTypeAdd", "alterTypeAlterType", "alterTable", 
                                "alterTableOperation", "alterTableWith", 
                                "alterTableRename", "alterTableDropCompactStorage", 
                                "alterTableDropColumns", "alterTableDropColumnList", 
                                "alterTableAdd", "alterTableColumnDefinition", 
                                "alterRole", "roleWith", "roleWithOptions", 
                                "alterMaterializedView", "dropUser", "dropType", 
                                "dropMaterializedView", "dropAggregate", 
                                "dropFunction", "dropTrigger", "dropRole", 
                                "dropTable", "dropKeyspace", "dropIndex", 
                                "createTable", "withElement", "clusteringOrder", 
                                "tableOptions", "tableOptionItem", "tableOptionName", 
                                "tableOptionValue", "optionHash", "optionHashItem", 
                                "optionHashKey", "optionHashValue", "columnDefinitionList", 
                                "columnDefinition", "primaryKeyColumn", 
                                "primaryKeyElement", "primaryKeyDefinition", 
                                "singlePrimaryKey", "compoundKey", "compositeKey", 
                                "partitionKeyList", "clusteringKeyList", 
                                "partitionKey", "clusteringKey", "applyBatch", 
                                "beginBatch", "batchType", "alterKeyspace", 
                                "replicationList", "replicationListItem", 
                                "durableWrites", "use", "truncate", "createIndex", 
                                "indexName", "indexColumnSpec", "indexKeysSpec", 
                                "indexEntriesSSpec", "indexFullSpec", "delete", 
                                "deleteColumnList", "deleteColumnItem", 
                                "update", "ifSpec", "ifConditionList", "ifCondition", 
                                "assignments", "assignmentElement", "assignmentSet", 
                                "assignmentMap", "assignmentList", "insert", 
                                "usingTtlTimestamp", "timestamp", "ttl", 
                                "usingTimestampSpec", "ifNotExist", "ifExist", 
                                "insertValuesSpec", "insertColumnSpec", 
                                "columnList", "expressionList", "select", 
                                "allowFilteringSpec", "limitSpec", "fromSpec", 
                                "fromSpecElement", "orderSpec", "orderSpecElement", 
                                "whereSpec", "distinctSpec", "selectElements", 
                                "selectElement", "relationElements", "relationElement", 
                                "relalationContains", "relalationContainsKey", 
                                "functionCall", "functionArgs", "constant", 
                                "decimalLiteral", "floatLiteral", "stringLiteral", 
                                "booleanLiteral", "hexadecimalLiteral", 
                                "keyspace", "table", "column", "dataType", 
                                "dataTypeName", "dataTypeDefinition", "orderDirection", 
                                "role", "trigger", "triggerClass", "materializedView", 
                                "type", "aggregate", "function", "language", 
                                "user", "password", "hashKey", "param", 
                                "paramName", "kwAdd", "kwAggregate", "kwAll", 
                                "kwAllPermissions", "kwAllow", "kwAlter", 
                                "kwAnd", "kwApply", "kwAs", "kwAsc", "kwAuthorize", 
                                "kwBatch", "kwBegin", "kwBy", "kwCalled", 
                                "kwClustering", "kwCompact", "kwContains", 
                                "kwCreate", "kwDelete", "kwDesc", "kwDescibe", 
                                "kwDistinct", "kwDrop", "kwDurableWrites", 
                                "kwEntries", "kwExecute", "kwExists", "kwFiltering", 
                                "kwFinalfunc", "kwFrom", "kwFull", "kwFunction", 
                                "kwFunctions", "kwGrant", "kwIf", "kwIn", 
                                "kwIndex", "kwInitcond", "kwInput", "kwInsert", 
                                "kwInto", "kwIs", "kwKey", "kwKeys", "kwKeyspace", 
                                "kwKeyspaces", "kwLanguage", "kwLimit", 
                                "kwList", "kwLogged", "kwLogin", "kwMaterialized", 
                                "kwModify", "kwNosuperuser", "kwNorecursive", 
                                "kwNot", "kwNull", "kwOf", "kwOn", "kwOptions", 
                                "kwOr", "kwOrder", "kwPassword", "kwPrimary", 
                                "kwRename", "kwReplace", "kwReplication", 
                                "kwReturns", "kwRole", "kwRoles", "kwSelect", 
                                "kwSet", "kwSfunc", "kwStorage", "kwStype", 
                                "kwSuperuser", "kwTable", "kwTimestamp", 
                                "kwTo", "kwTrigger", "kwTruncate", "kwTtl", 
                                "kwType", "kwUnlogged", "kwUpdate", "kwUse", 
                                "kwUser", "kwUsers", "kwUsing", "kwValues", 
                                "kwView", "kwWhere", "kwWith", "kwRevoke", 
                                "eof", "syntaxBracketLr", "syntaxBracketRr", 
                                "syntaxBracketLc", "syntaxBracketRc", "syntaxBracketLa", 
                                "syntaxBracketRa", "syntaxBracketLs", "syntaxBracketRs", 
                                "syntaxComma", "syntaxColon")

        private val LITERAL_NAMES: List<String?> = listOf(null, "'('", "')'", 
                                                          "'{'", "'}'", 
                                                          "'['", "']'", 
                                                          "','", "';'", 
                                                          "':'", null, null, 
                                                          null, null, "'.'", 
                                                          "'*'", "'/'", 
                                                          "'%'", "'+'", 
                                                          "'--'", "'-'", 
                                                          "'\"'", "'''")
        private val SYMBOLIC_NAMES: List<String?> = listOf(null, "LR_BRACKET", 
                                                           "RR_BRACKET", 
                                                           "LC_BRACKET", 
                                                           "RC_BRACKET", 
                                                           "LS_BRACKET", 
                                                           "RS_BRACKET", 
                                                           "COMMA", "SEMI", 
                                                           "COLON", "SPACE", 
                                                           "SPEC_MYSQL_COMMENT", 
                                                           "COMMENT_INPUT", 
                                                           "LINE_COMMENT", 
                                                           "DOT", "STAR", 
                                                           "DIVIDE", "MODULE", 
                                                           "PLUS", "MINUSMINUS", 
                                                           "MINUS", "DQUOTE", 
                                                           "SQUOTE", "K_ADD", 
                                                           "K_AGGREGATE", 
                                                           "K_ALL", "K_ALLOW", 
                                                           "K_ALTER", "K_AND", 
                                                           "K_ANY", "K_APPLY", 
                                                           "K_AS", "K_ASC", 
                                                           "K_AUTHORIZE", 
                                                           "K_BATCH", "K_BEGIN", 
                                                           "K_BY", "K_CALLED", 
                                                           "K_CLUSTERING", 
                                                           "K_COLUMNFAMILY", 
                                                           "K_COMPACT", 
                                                           "K_CONSISTENCY", 
                                                           "K_CONTAINS", 
                                                           "K_CREATE", "K_CUSTOM", 
                                                           "K_DELETE", "K_DESC", 
                                                           "K_DESCRIBE", 
                                                           "K_DISTINCT", 
                                                           "K_DROP", "K_DURABLE_WRITES", 
                                                           "K_EACH_QUORUM", 
                                                           "K_ENTRIES", 
                                                           "K_EXECUTE", 
                                                           "K_EXISTS", "K_FALSE", 
                                                           "K_FILTERING", 
                                                           "K_FINALFUNC", 
                                                           "K_FROM", "K_FULL", 
                                                           "K_FUNCTION", 
                                                           "K_FUNCTIONS", 
                                                           "K_GRANT", "K_IF", 
                                                           "K_IN", "K_INDEX", 
                                                           "K_INFINITY", 
                                                           "K_INITCOND", 
                                                           "K_INPUT", "K_INSERT", 
                                                           "K_INTO", "K_IS", 
                                                           "K_KEY", "K_KEYS", 
                                                           "K_KEYSPACE", 
                                                           "K_KEYSPACES", 
                                                           "K_LANGUAGE", 
                                                           "K_LEVEL", "K_LIMIT", 
                                                           "K_LOCAL_ONE", 
                                                           "K_LOCAL_QUORUM", 
                                                           "K_LOGGED", "K_LOGIN", 
                                                           "K_MATERIALIZED", 
                                                           "K_MODIFY", "K_NAN", 
                                                           "K_NORECURSIVE", 
                                                           "K_NOSUPERUSER", 
                                                           "K_NOT", "K_NULL", 
                                                           "K_OF", "K_ON", 
                                                           "K_ONE", "K_OPTIONS", 
                                                           "K_OR", "K_ORDER", 
                                                           "K_PARTITION", 
                                                           "K_PASSWORD", 
                                                           "K_PER", "K_PERMISSION", 
                                                           "K_PERMISSIONS", 
                                                           "K_PRIMARY", 
                                                           "K_QUORUM", "K_RENAME", 
                                                           "K_REPLACE", 
                                                           "K_REPLICATION", 
                                                           "K_RETURNS", 
                                                           "K_REVOKE", "K_ROLE", 
                                                           "K_ROLES", "K_SCHEMA", 
                                                           "K_SELECT", "K_SET", 
                                                           "K_SFUNC", "K_STATIC", 
                                                           "K_STORAGE", 
                                                           "K_STYPE", "K_SUPERUSER", 
                                                           "K_TABLE", "K_THREE", 
                                                           "K_TIMESTAMP", 
                                                           "K_TO", "K_TOKEN", 
                                                           "K_TRIGGER", 
                                                           "K_TRUE", "K_TRUNCATE", 
                                                           "K_TTL", "K_TWO", 
                                                           "K_TYPE", "K_UNLOGGED", 
                                                           "K_UPDATE", "K_USE", 
                                                           "K_USER", "K_USING", 
                                                           "K_UUID", "K_VALUES", 
                                                           "K_VIEW", "K_WHERE", 
                                                           "K_WITH", "K_WRITETIME", 
                                                           "K_ASCII", "K_BIGINT", 
                                                           "K_BLOB", "K_BOOLEAN", 
                                                           "K_COUNTER", 
                                                           "K_DATE", "K_DECIMAL", 
                                                           "K_DOUBLE", "K_FLOAT", 
                                                           "K_FROZEN", "K_INET", 
                                                           "K_INT", "K_LIST", 
                                                           "K_MAP", "K_SMALLINT", 
                                                           "K_TEXT", "K_TIMEUUID", 
                                                           "K_TIME", "K_TINYINT", 
                                                           "K_TUPLE", "K_VARCHAR", 
                                                           "K_VARINT", "CODE_BLOCK", 
                                                           "STRING_LITERAL", 
                                                           "DECIMAL_LITERAL", 
                                                           "FLOAT_LITERAL", 
                                                           "HEXADECIMAL_LITERAL", 
                                                           "REAL_LITERAL", 
                                                           "OBJECT_NAME", 
                                                           "UUID", "OPERATOR_EQ", 
                                                           "OPERATOR_LT", 
                                                           "OPERATOR_GT", 
                                                           "OPERATOR_LTE", 
                                                           "OPERATOR_GTE", 
                                                           "K_USERS")

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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u00b1\u08bd\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0004\u001c\u0009\u001c\u0004\u001d\u0009\u001d\u0004\u001e\u0009\u001e\u0004\u001f\u0009\u001f\u0004\u0020\u0009\u0020\u0004\u0021\u0009\u0021\u0004\u0022\u0009\u0022\u0004\u0023\u0009\u0023\u0004\u0024\u0009\u0024\u0004\u0025\u0009\u0025\u0004\u0026\u0009\u0026\u0004\u0027\u0009\u0027\u0004\u0028\u0009\u0028\u0004\u0029\u0009\u0029\u0004\u002a\u0009\u002a\u0004\u002b\u0009\u002b\u0004\u002c\u0009\u002c\u0004\u002d\u0009\u002d\u0004\u002e\u0009\u002e\u0004\u002f\u0009\u002f\u0004\u0030\u0009\u0030\u0004\u0031\u0009\u0031\u0004\u0032\u0009\u0032\u0004\u0033\u0009\u0033\u0004\u0034\u0009\u0034\u0004\u0035\u0009\u0035\u0004\u0036\u0009\u0036\u0004\u0037\u0009\u0037\u0004\u0038\u0009\u0038\u0004\u0039\u0009\u0039\u0004\u003a\u0009\u003a\u0004\u003b\u0009\u003b\u0004\u003c\u0009\u003c\u0004\u003d\u0009\u003d\u0004\u003e\u0009\u003e\u0004\u003f\u0009\u003f\u0004\u0040\u0009\u0040\u0004\u0041\u0009\u0041\u0004\u0042\u0009\u0042\u0004\u0043\u0009\u0043\u0004\u0044\u0009\u0044\u0004\u0045\u0009\u0045\u0004\u0046\u0009\u0046\u0004\u0047\u0009\u0047\u0004\u0048\u0009\u0048\u0004\u0049\u0009\u0049\u0004\u004a\u0009\u004a\u0004\u004b\u0009\u004b\u0004\u004c\u0009\u004c\u0004\u004d\u0009\u004d\u0004\u004e\u0009\u004e\u0004\u004f\u0009\u004f\u0004\u0050\u0009\u0050\u0004\u0051\u0009\u0051\u0004\u0052\u0009\u0052\u0004\u0053\u0009\u0053\u0004\u0054\u0009\u0054\u0004\u0055\u0009\u0055\u0004\u0056\u0009\u0056\u0004\u0057\u0009\u0057\u0004\u0058\u0009\u0058\u0004\u0059\u0009\u0059\u0004\u005a\u0009\u005a\u0004\u005b\u0009\u005b\u0004\u005c\u0009\u005c\u0004\u005d\u0009\u005d\u0004\u005e\u0009\u005e\u0004\u005f\u0009\u005f\u0004\u0060\u0009\u0060\u0004\u0061\u0009\u0061\u0004\u0062\u0009\u0062\u0004\u0063\u0009\u0063\u0004\u0064\u0009\u0064\u0004\u0065\u0009\u0065\u0004\u0066\u0009\u0066\u0004\u0067\u0009\u0067\u0004\u0068\u0009\u0068\u0004\u0069\u0009\u0069\u0004\u006a\u0009\u006a\u0004\u006b\u0009\u006b\u0004\u006c\u0009\u006c\u0004\u006d\u0009\u006d\u0004\u006e\u0009\u006e\u0004\u006f\u0009\u006f\u0004\u0070\u0009\u0070\u0004\u0071\u0009\u0071\u0004\u0072\u0009\u0072\u0004\u0073\u0009\u0073\u0004\u0074\u0009\u0074\u0004\u0075\u0009\u0075\u0004\u0076\u0009\u0076\u0004\u0077\u0009\u0077\u0004\u0078\u0009\u0078\u0004\u0079\u0009\u0079\u0004\u007a\u0009\u007a\u0004\u007b\u0009\u007b\u0004\u007c\u0009\u007c\u0004\u007d\u0009\u007d\u0004\u007e\u0009\u007e\u0004\u007f\u0009\u007f\u0004\u0080\u0009\u0080\u0004\u0081\u0009\u0081\u0004\u0082\u0009\u0082\u0004\u0083\u0009\u0083\u0004\u0084\u0009\u0084\u0004\u0085\u0009\u0085\u0004\u0086\u0009\u0086\u0004\u0087\u0009\u0087\u0004\u0088\u0009\u0088\u0004\u0089\u0009\u0089\u0004\u008a\u0009\u008a\u0004\u008b\u0009\u008b\u0004\u008c\u0009\u008c\u0004\u008d\u0009\u008d\u0004\u008e\u0009\u008e\u0004\u008f\u0009\u008f\u0004\u0090\u0009\u0090\u0004\u0091\u0009\u0091\u0004\u0092\u0009\u0092\u0004\u0093\u0009\u0093\u0004\u0094\u0009\u0094\u0004\u0095\u0009\u0095\u0004\u0096\u0009\u0096\u0004\u0097\u0009\u0097\u0004\u0098\u0009\u0098\u0004\u0099\u0009\u0099\u0004\u009a\u0009\u009a\u0004\u009b\u0009\u009b\u0004\u009c\u0009\u009c\u0004\u009d\u0009\u009d\u0004\u009e\u0009\u009e\u0004\u009f\u0009\u009f\u0004\u00a0\u0009\u00a0\u0004\u00a1\u0009\u00a1\u0004\u00a2\u0009\u00a2\u0004\u00a3\u0009\u00a3\u0004\u00a4\u0009\u00a4\u0004\u00a5\u0009\u00a5\u0004\u00a6\u0009\u00a6\u0004\u00a7\u0009\u00a7\u0004\u00a8\u0009\u00a8\u0004\u00a9\u0009\u00a9\u0004\u00aa\u0009\u00aa\u0004\u00ab\u0009\u00ab\u0004\u00ac\u0009\u00ac\u0004\u00ad\u0009\u00ad\u0004\u00ae\u0009\u00ae\u0004\u00af\u0009\u00af\u0004\u00b0\u0009\u00b0\u0004\u00b1\u0009\u00b1\u0004\u00b2\u0009\u00b2\u0004\u00b3\u0009\u00b3\u0004\u00b4\u0009\u00b4\u0004\u00b5\u0009\u00b5\u0004\u00b6\u0009\u00b6\u0004\u00b7\u0009\u00b7\u0004\u00b8\u0009\u00b8\u0004\u00b9\u0009\u00b9\u0004\u00ba\u0009\u00ba\u0004\u00bb\u0009\u00bb\u0004\u00bc\u0009\u00bc\u0004\u00bd\u0009\u00bd\u0004\u00be\u0009\u00be\u0004\u00bf\u0009\u00bf\u0004\u00c0\u0009\u00c0\u0004\u00c1\u0009\u00c1\u0004\u00c2\u0009\u00c2\u0004\u00c3\u0009\u00c3\u0004\u00c4\u0009\u00c4\u0004\u00c5\u0009\u00c5\u0004\u00c6\u0009\u00c6\u0004\u00c7\u0009\u00c7\u0004\u00c8\u0009\u00c8\u0004\u00c9\u0009\u00c9\u0004\u00ca\u0009\u00ca\u0004\u00cb\u0009\u00cb\u0004\u00cc\u0009\u00cc\u0004\u00cd\u0009\u00cd\u0004\u00ce\u0009\u00ce\u0004\u00cf\u0009\u00cf\u0004\u00d0\u0009\u00d0\u0004\u00d1\u0009\u00d1\u0004\u00d2\u0009\u00d2\u0004\u00d3\u0009\u00d3\u0004\u00d4\u0009\u00d4\u0004\u00d5\u0009\u00d5\u0004\u00d6\u0009\u00d6\u0004\u00d7\u0009\u00d7\u0004\u00d8\u0009\u00d8\u0004\u00d9\u0009\u00d9\u0004\u00da\u0009\u00da\u0004\u00db\u0009\u00db\u0004\u00dc\u0009\u00dc\u0004\u00dd\u0009\u00dd\u0004\u00de\u0009\u00de\u0004\u00df\u0009\u00df\u0004\u00e0\u0009\u00e0\u0004\u00e1\u0009\u00e1\u0004\u00e2\u0009\u00e2\u0004\u00e3\u0009\u00e3\u0004\u00e4\u0009\u00e4\u0004\u00e5\u0009\u00e5\u0004\u00e6\u0009\u00e6\u0004\u00e7\u0009\u00e7\u0004\u00e8\u0009\u00e8\u0004\u00e9\u0009\u00e9\u0004\u00ea\u0009\u00ea\u0004\u00eb\u0009\u00eb\u0004\u00ec\u0009\u00ec\u0004\u00ed\u0009\u00ed\u0004\u00ee\u0009\u00ee\u0004\u00ef\u0009\u00ef\u0004\u00f0\u0009\u00f0\u0004\u00f1\u0009\u00f1\u0004\u00f2\u0009\u00f2\u0004\u00f3\u0009\u00f3\u0004\u00f4\u0009\u00f4\u0004\u00f5\u0009\u00f5\u0004\u00f6\u0009\u00f6\u0004\u00f7\u0009\u00f7\u0004\u00f8\u0009\u00f8\u0004\u00f9\u0009\u00f9\u0004\u00fa\u0009\u00fa\u0004\u00fb\u0009\u00fb\u0004\u00fc\u0009\u00fc\u0004\u00fd\u0009\u00fd\u0004\u00fe\u0009\u00fe\u0004\u00ff\u0009\u00ff\u0004\u0100\u0009\u0100\u0004\u0101\u0009\u0101\u0004\u0102\u0009\u0102\u0004\u0103\u0009\u0103\u0004\u0104\u0009\u0104\u0004\u0105\u0009\u0105\u0004\u0106\u0009\u0106\u0004\u0107\u0009\u0107\u0004\u0108\u0009\u0108\u0004\u0109\u0009\u0109\u0004\u010a\u0009\u010a\u0004\u010b\u0009\u010b\u0004\u010c\u0009\u010c\u0004\u010d\u0009\u010d\u0004\u010e\u0009\u010e\u0004\u010f\u0009\u010f\u0004\u0110\u0009\u0110\u0004\u0111\u0009\u0111\u0004\u0112\u0009\u0112\u0004\u0113\u0009\u0113\u0004\u0114\u0009\u0114\u0004\u0115\u0009\u0115\u0004\u0116\u0009\u0116\u0003\u0002\u0005\u0002\u022e\u000a\u0002\u0003\u0002\u0005\u0002\u0231\u000a\u0002\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0005\u0003\u0237\u000a\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0007\u0003\u023c\u000a\u0003\u000c\u0003\u000e\u0003\u023f\u000b\u0003\u0003\u0003\u0003\u0003\u0005\u0003\u0243\u000a\u0003\u0003\u0003\u0005\u0003\u0246\u000a\u0003\u0003\u0003\u0005\u0003\u0249\u000a\u0003\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0005\u0006\u0274\u000a\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0005\u0009\u0285\u000a\u0009\u0003\u0009\u0005\u0009\u0288\u000a\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0005\u000a\u028f\u000a\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0005\u000a\u0294\u000a\u000a\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000c\u0003\u000c\u0005\u000c\u029f\u000a\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0005\u000c\u02a9\u000a\u000c\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0005\u000d\u02b8\u000a\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0005\u000d\u02c3\u000a\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0005\u000d\u02c8\u000a\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0005\u000d\u02d1\u000a\u000d\u0003\u000e\u0003\u000e\u0003\u000e\u0005\u000e\u02d6\u000a\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0005\u000e\u02de\u000a\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0005\u000f\u02e3\u000a\u000f\u0003\u000f\u0003\u000f\u0005\u000f\u02e7\u000a\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0005\u0010\u02ec\u000a\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0005\u0010\u02f1\u000a\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0007\u0011\u02fe\u000a\u0011\u000c\u0011\u000e\u0011\u0301\u000b\u0011\u0003\u0012\u0003\u0012\u0003\u0012\u0005\u0012\u0306\u000a\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0005\u0012\u030b\u000a\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0005\u0013\u0315\u000a\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0005\u0013\u031a\u000a\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0005\u0013\u0324\u000a\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0005\u0013\u0330\u000a\u0013\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0005\u0014\u0337\u000a\u0014\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0007\u0015\u033d\u000a\u0015\u000c\u0015\u000e\u0015\u0340\u000b\u0015\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0005\u0017\u034d\u000a\u0017\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u0352\u000a\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u035e\u000a\u0018\u0003\u0019\u0003\u0019\u0005\u0019\u0362\u000a\u0019\u0003\u0019\u0003\u0019\u0005\u0019\u0366\u000a\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0005\u0019\u036b\u000a\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0005\u0019\u0370\u000a\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u001a\u0003\u001a\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0007\u001b\u0381\u000a\u001b\u000c\u001b\u000e\u001b\u0384\u000b\u001b\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0005\u001c\u038a\u000a\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001d\u0003\u001d\u0005\u001d\u0392\u000a\u001d\u0003\u001d\u0003\u001d\u0005\u001d\u0396\u000a\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0005\u001d\u039b\u000a\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0005\u001e\u03ae\u000a\u001e\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0007\u001f\u03b5\u000a\u001f\u000c\u001f\u000e\u001f\u03b8\u000b\u001f\u0003\u001f\u0003\u001f\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0007\u0021\u03c6\u000a\u0021\u000c\u0021\u000e\u0021\u03c9\u000b\u0021\u0003\u0021\u0003\u0021\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0007\u0022\u03d2\u000a\u0022\u000c\u0022\u000e\u0022\u03d5\u000b\u0022\u0003\u0022\u0003\u0022\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u03e2\u000a\u0024\u0003\u0025\u0003\u0025\u0003\u0025\u0003\u0026\u0003\u0026\u0005\u0026\u03e9\u000a\u0026\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0005\u0027\u03f0\u000a\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0028\u0003\u0028\u0003\u0028\u0005\u0028\u03f8\u000a\u0028\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u002a\u0003\u002a\u0003\u002a\u0003\u002a\u0007\u002a\u0401\u000a\u002a\u000c\u002a\u000e\u002a\u0404\u000b\u002a\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002c\u0003\u002c\u0003\u002c\u0003\u002c\u0003\u002c\u0003\u002c\u0003\u002c\u0007\u002c\u0411\u000a\u002c\u000c\u002c\u000e\u002c\u0414\u000b\u002c\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0005\u002e\u0420\u000a\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002f\u0003\u002f\u0003\u002f\u0003\u002f\u0003\u002f\u0003\u002f\u0005\u002f\u042b\u000a\u002f\u0003\u0030\u0003\u0030\u0003\u0030\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0032\u0003\u0032\u0003\u0032\u0003\u0032\u0003\u0033\u0003\u0033\u0003\u0033\u0003\u0034\u0003\u0034\u0003\u0034\u0003\u0034\u0007\u0034\u0440\u000a\u0034\u000c\u0034\u000e\u0034\u0443\u000b\u0034\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0036\u0003\u0036\u0003\u0036\u0003\u0036\u0003\u0036\u0003\u0036\u0007\u0036\u044e\u000a\u0036\u000c\u0036\u000e\u0036\u0451\u000b\u0036\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0005\u0037\u0457\u000a\u0037\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0007\u0038\u045e\u000a\u0038\u000c\u0038\u000e\u0038\u0461\u000b\u0038\u0003\u0039\u0003\u0039\u0003\u0039\u0003\u0039\u0003\u0039\u0003\u0039\u0003\u0039\u0003\u0039\u0003\u0039\u0003\u0039\u0003\u0039\u0003\u0039\u0003\u0039\u0003\u0039\u0003\u0039\u0003\u0039\u0005\u0039\u0473\u000a\u0039\u0003\u003a\u0003\u003a\u0003\u003a\u0003\u003a\u0003\u003a\u0003\u003a\u0005\u003a\u047b\u000a\u003a\u0003\u003a\u0003\u003a\u0003\u003a\u0003\u003a\u0005\u003a\u0481\u000a\u003a\u0003\u003b\u0003\u003b\u0003\u003b\u0005\u003b\u0486\u000a\u003b\u0003\u003b\u0003\u003b\u0003\u003c\u0003\u003c\u0003\u003c\u0005\u003c\u048d\u000a\u003c\u0003\u003c\u0003\u003c\u0003\u003c\u0005\u003c\u0492\u000a\u003c\u0003\u003c\u0003\u003c\u0003\u003d\u0003\u003d\u0003\u003d\u0003\u003d\u0005\u003d\u049a\u000a\u003d\u0003\u003d\u0003\u003d\u0003\u003d\u0005\u003d\u049f\u000a\u003d\u0003\u003d\u0003\u003d\u0003\u003e\u0003\u003e\u0003\u003e\u0005\u003e\u04a6\u000a\u003e\u0003\u003e\u0003\u003e\u0003\u003e\u0005\u003e\u04ab\u000a\u003e\u0003\u003e\u0003\u003e\u0003\u003f\u0003\u003f\u0003\u003f\u0005\u003f\u04b2\u000a\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0005\u003f\u04b7\u000a\u003f\u0003\u003f\u0003\u003f\u0003\u0040\u0003\u0040\u0003\u0040\u0005\u0040\u04be\u000a\u0040\u0003\u0040\u0003\u0040\u0003\u0040\u0003\u0040\u0003\u0040\u0005\u0040\u04c5\u000a\u0040\u0003\u0040\u0003\u0040\u0003\u0041\u0003\u0041\u0003\u0041\u0005\u0041\u04cc\u000a\u0041\u0003\u0041\u0003\u0041\u0003\u0042\u0003\u0042\u0003\u0042\u0005\u0042\u04d3\u000a\u0042\u0003\u0042\u0003\u0042\u0003\u0042\u0005\u0042\u04d8\u000a\u0042\u0003\u0042\u0003\u0042\u0003\u0043\u0003\u0043\u0003\u0043\u0005\u0043\u04df\u000a\u0043\u0003\u0043\u0003\u0043\u0003\u0044\u0003\u0044\u0003\u0044\u0005\u0044\u04e6\u000a\u0044\u0003\u0044\u0003\u0044\u0003\u0044\u0005\u0044\u04eb\u000a\u0044\u0003\u0044\u0003\u0044\u0003\u0045\u0003\u0045\u0003\u0045\u0005\u0045\u04f2\u000a\u0045\u0003\u0045\u0003\u0045\u0003\u0045\u0005\u0045\u04f7\u000a\u0045\u0003\u0045\u0003\u0045\u0003\u0045\u0003\u0045\u0003\u0045\u0005\u0045\u04fe\u000a\u0045\u0003\u0046\u0003\u0046\u0005\u0046\u0502\u000a\u0046\u0003\u0046\u0005\u0046\u0505\u000a\u0046\u0003\u0047\u0003\u0047\u0003\u0047\u0003\u0047\u0003\u0047\u0003\u0047\u0005\u0047\u050d\u000a\u0047\u0003\u0047\u0003\u0047\u0003\u0048\u0003\u0048\u0003\u0048\u0003\u0048\u0007\u0048\u0515\u000a\u0048\u000c\u0048\u000e\u0048\u0518\u000b\u0048\u0003\u0049\u0003\u0049\u0003\u0049\u0003\u0049\u0003\u0049\u0003\u0049\u0003\u0049\u0003\u0049\u0005\u0049\u0522\u000a\u0049\u0003\u004a\u0003\u004a\u0003\u004b\u0003\u004b\u0005\u004b\u0528\u000a\u004b\u0003\u004c\u0003\u004c\u0003\u004c\u0003\u004c\u0003\u004c\u0007\u004c\u052f\u000a\u004c\u000c\u004c\u000e\u004c\u0532\u000b\u004c\u0003\u004c\u0003\u004c\u0003\u004d\u0003\u004d\u0003\u004d\u0003\u004d\u0003\u004e\u0003\u004e\u0003\u004f\u0003\u004f\u0005\u004f\u053e\u000a\u004f\u0003\u0050\u0003\u0050\u0003\u0050\u0003\u0050\u0007\u0050\u0544\u000a\u0050\u000c\u0050\u000e\u0050\u0547\u000b\u0050\u0003\u0050\u0003\u0050\u0003\u0050\u0005\u0050\u054c\u000a\u0050\u0003\u0051\u0003\u0051\u0003\u0051\u0005\u0051\u0551\u000a\u0051\u0003\u0052\u0003\u0052\u0003\u0052\u0003\u0053\u0003\u0053\u0003\u0053\u0003\u0053\u0003\u0053\u0003\u0053\u0003\u0054\u0003\u0054\u0003\u0054\u0005\u0054\u055f\u000a\u0054\u0003\u0055\u0003\u0055\u0003\u0056\u0003\u0056\u0003\u0056\u0003\u0056\u0003\u0057\u0003\u0057\u0003\u0057\u0003\u0057\u0003\u0057\u0003\u0057\u0003\u0058\u0003\u0058\u0003\u0058\u0003\u0058\u0007\u0058\u0571\u000a\u0058\u000c\u0058\u000e\u0058\u0574\u000b\u0058\u0003\u0059\u0003\u0059\u0003\u0059\u0003\u0059\u0007\u0059\u057a\u000a\u0059\u000c\u0059\u000e\u0059\u057d\u000b\u0059\u0003\u005a\u0003\u005a\u0003\u005b\u0003\u005b\u0003\u005c\u0003\u005c\u0003\u005c\u0003\u005d\u0003\u005d\u0005\u005d\u0588\u000a\u005d\u0003\u005d\u0003\u005d\u0005\u005d\u058c\u000a\u005d\u0003\u005e\u0003\u005e\u0005\u005e\u0590\u000a\u005e\u0003\u005f\u0003\u005f\u0003\u005f\u0003\u005f\u0003\u005f\u0003\u005f\u0003\u005f\u0003\u005f\u0003\u005f\u0003\u005f\u0003\u005f\u0003\u005f\u0005\u005f\u059e\u000a\u005f\u0003\u0060\u0003\u0060\u0003\u0060\u0003\u0060\u0007\u0060\u05a4\u000a\u0060\u000c\u0060\u000e\u0060\u05a7\u000b\u0060\u0003\u0061\u0003\u0061\u0003\u0061\u0003\u0061\u0003\u0061\u0003\u0061\u0005\u0061\u05af\u000a\u0061\u0003\u0062\u0003\u0062\u0003\u0062\u0003\u0062\u0003\u0063\u0003\u0063\u0003\u0063\u0003\u0064\u0003\u0064\u0005\u0064\u05ba\u000a\u0064\u0003\u0064\u0003\u0064\u0003\u0064\u0005\u0064\u05bf\u000a\u0064\u0003\u0064\u0003\u0064\u0003\u0065\u0003\u0065\u0003\u0065\u0005\u0065\u05c6\u000a\u0065\u0003\u0065\u0005\u0065\u05c9\u000a\u0065\u0003\u0065\u0003\u0065\u0003\u0065\u0003\u0065\u0005\u0065\u05cf\u000a\u0065\u0003\u0065\u0003\u0065\u0003\u0065\u0003\u0065\u0003\u0065\u0003\u0066\u0003\u0066\u0005\u0066\u05d8\u000a\u0066\u0003\u0067\u0003\u0067\u0003\u0067\u0003\u0067\u0005\u0067\u05de\u000a\u0067\u0003\u0068\u0003\u0068\u0003\u0068\u0003\u0068\u0003\u0068\u0003\u0069\u0003\u0069\u0003\u0069\u0003\u0069\u0003\u0069\u0003\u006a\u0003\u006a\u0003\u006a\u0003\u006a\u0003\u006a\u0003\u006b\u0005\u006b\u05f0\u000a\u006b\u0003\u006b\u0003\u006b\u0005\u006b\u05f4\u000a\u006b\u0003\u006b\u0003\u006b\u0005\u006b\u05f8\u000a\u006b\u0003\u006b\u0003\u006b\u0003\u006b\u0005\u006b\u05fd\u000a\u006b\u0003\u006c\u0003\u006c\u0003\u006c\u0003\u006c\u0007\u006c\u0603\u000a\u006c\u000c\u006c\u000e\u006c\u0606\u000b\u006c\u0003\u006d\u0003\u006d\u0003\u006d\u0003\u006d\u0003\u006d\u0005\u006d\u060d\u000a\u006d\u0003\u006d\u0003\u006d\u0005\u006d\u0611\u000a\u006d\u0003\u006e\u0005\u006e\u0614\u000a\u006e\u0003\u006e\u0003\u006e\u0003\u006e\u0003\u006e\u0005\u006e\u061a\u000a\u006e\u0003\u006e\u0003\u006e\u0005\u006e\u061e\u000a\u006e\u0003\u006e\u0003\u006e\u0003\u006e\u0003\u006e\u0003\u006e\u0005\u006e\u0625\u000a\u006e\u0003\u006f\u0003\u006f\u0003\u006f\u0003\u0070\u0003\u0070\u0003\u0070\u0003\u0070\u0007\u0070\u062e\u000a\u0070\u000c\u0070\u000e\u0070\u0631\u000b\u0070\u0003\u0071\u0003\u0071\u0003\u0071\u0003\u0071\u0003\u0072\u0003\u0072\u0003\u0072\u0003\u0072\u0007\u0072\u063b\u000a\u0072\u000c\u0072\u000e\u0072\u063e\u000b\u0072\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0005\u0073\u0646\u000a\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0003\u0073\u0005\u0073\u0675\u000a\u0073\u0003\u0074\u0003\u0074\u0003\u0074\u0003\u0074\u0003\u0074\u0007\u0074\u067c\u000a\u0074\u000c\u0074\u000e\u0074\u067f\u000b\u0074\u0003\u0074\u0003\u0074\u0003\u0075\u0003\u0075\u0003\u0075\u0003\u0075\u0003\u0075\u0003\u0075\u0003\u0075\u0003\u0075\u0003\u0075\u0007\u0075\u068c\u000a\u0075\u000c\u0075\u000e\u0075\u068f\u000b\u0075\u0003\u0075\u0003\u0075\u0003\u0076\u0003\u0076\u0003\u0076\u0003\u0076\u0003\u0076\u0007\u0076\u0698\u000a\u0076\u000c\u0076\u000e\u0076\u069b\u000b\u0076\u0003\u0076\u0003\u0076\u0003\u0077\u0003\u0077\u0005\u0077\u06a1\u000a\u0077\u0003\u0077\u0003\u0077\u0003\u0077\u0003\u0077\u0003\u0077\u0003\u0077\u0005\u0077\u06a9\u000a\u0077\u0003\u0077\u0003\u0077\u0003\u0077\u0003\u0077\u0003\u0077\u0005\u0077\u06b0\u000a\u0077\u0003\u0077\u0005\u0077\u06b3\u000a\u0077\u0003\u0078\u0003\u0078\u0003\u0078\u0003\u0078\u0003\u0078\u0003\u0078\u0003\u0078\u0003\u0078\u0003\u0078\u0003\u0078\u0003\u0078\u0003\u0078\u0003\u0078\u0003\u0078\u0003\u0078\u0003\u0078\u0005\u0078\u06c5\u000a\u0078\u0003\u0079\u0003\u0079\u0003\u0079\u0003\u007a\u0003\u007a\u0003\u007a\u0003\u007b\u0003\u007b\u0003\u007b\u0003\u007c\u0003\u007c\u0003\u007c\u0003\u007c\u0003\u007d\u0003\u007d\u0003\u007d\u0003\u007e\u0003\u007e\u0003\u007e\u0003\u007e\u0003\u007e\u0003\u007f\u0003\u007f\u0003\u007f\u0003\u007f\u0003\u0080\u0003\u0080\u0003\u0080\u0003\u0080\u0007\u0080\u06e4\u000a\u0080\u000c\u0080\u000e\u0080\u06e7\u000b\u0080\u0003\u0081\u0003\u0081\u0003\u0081\u0003\u0081\u0005\u0081\u06ed\u000a\u0081\u0003\u0081\u0003\u0081\u0003\u0081\u0003\u0081\u0003\u0081\u0005\u0081\u06f4\u000a\u0081\u0007\u0081\u06f6\u000a\u0081\u000c\u0081\u000e\u0081\u06f9\u000b\u0081\u0003\u0082\u0003\u0082\u0003\u0082\u0005\u0082\u06fe\u000a\u0082\u0003\u0082\u0003\u0082\u0003\u0082\u0005\u0082\u0703\u000a\u0082\u0003\u0082\u0005\u0082\u0706\u000a\u0082\u0003\u0082\u0005\u0082\u0709\u000a\u0082\u0003\u0082\u0005\u0082\u070c\u000a\u0082\u0003\u0083\u0003\u0083\u0003\u0083\u0003\u0084\u0003\u0084\u0003\u0084\u0003\u0085\u0003\u0085\u0003\u0085\u0003\u0086\u0003\u0086\u0003\u0086\u0003\u0086\u0005\u0086\u071b\u000a\u0086\u0003\u0087\u0003\u0087\u0003\u0087\u0003\u0087\u0003\u0088\u0003\u0088\u0003\u0088\u0005\u0088\u0724\u000a\u0088\u0003\u0089\u0003\u0089\u0003\u0089\u0003\u008a\u0003\u008a\u0003\u008b\u0003\u008b\u0005\u008b\u072d\u000a\u008b\u0003\u008b\u0003\u008b\u0003\u008b\u0007\u008b\u0732\u000a\u008b\u000c\u008b\u000e\u008b\u0735\u000b\u008b\u0003\u008c\u0003\u008c\u0003\u008c\u0003\u008c\u0003\u008c\u0003\u008c\u0003\u008c\u0005\u008c\u073e\u000a\u008c\u0003\u008c\u0003\u008c\u0003\u008c\u0003\u008c\u0005\u008c\u0744\u000a\u008c\u0005\u008c\u0746\u000a\u008c\u0003\u008d\u0003\u008d\u0003\u008d\u0003\u008d\u0007\u008d\u074c\u000a\u008d\u000c\u008d\u000e\u008d\u074f\u000b\u008d\u0003\u008e\u0003\u008e\u0003\u008e\u0003\u008e\u0003\u008e\u0003\u008e\u0003\u008e\u0003\u008e\u0003\u008e\u0003\u008e\u0003\u008e\u0003\u008e\u0003\u008e\u0003\u008e\u0003\u008e\u0003\u008e\u0003\u008e\u0003\u008e\u0003\u008e\u0003\u008e\u0005\u008e\u0765\u000a\u008e\u0003\u008e\u0003\u008e\u0003\u008e\u0003\u008e\u0005\u008e\u076b\u000a\u008e\u0003\u008f\u0003\u008f\u0003\u008f\u0003\u008f\u0003\u0090\u0003\u0090\u0003\u0090\u0003\u0090\u0003\u0090\u0003\u0090\u0003\u0091\u0003\u0091\u0003\u0091\u0003\u0091\u0003\u0091\u0003\u0091\u0003\u0091\u0005\u0091\u077e\u000a\u0091\u0003\u0091\u0005\u0091\u0781\u000a\u0091\u0003\u0092\u0003\u0092\u0003\u0092\u0005\u0092\u0786\u000a\u0092\u0003\u0092\u0003\u0092\u0003\u0092\u0003\u0092\u0005\u0092\u078c\u000a\u0092\u0007\u0092\u078e\u000a\u0092\u000c\u0092\u000e\u0092\u0791\u000b\u0092\u0003\u0093\u0003\u0093\u0003\u0093\u0003\u0093\u0003\u0093\u0003\u0093\u0005\u0093\u0799\u000a\u0093\u0003\u0094\u0003\u0094\u0003\u0095\u0003\u0095\u0003\u0096\u0003\u0096\u0003\u0097\u0003\u0097\u0003\u0098\u0003\u0098\u0003\u0099\u0003\u0099\u0003\u0099\u0003\u0099\u0005\u0099\u07a9\u000a\u0099\u0003\u009a\u0003\u009a\u0003\u009a\u0003\u009a\u0005\u009a\u07af\u000a\u009a\u0003\u009b\u0003\u009b\u0003\u009b\u0003\u009b\u0005\u009b\u07b5\u000a\u009b\u0003\u009c\u0003\u009c\u0005\u009c\u07b9\u000a\u009c\u0003\u009d\u0003\u009d\u0003\u009e\u0003\u009e\u0003\u009e\u0003\u009e\u0003\u009e\u0007\u009e\u07c2\u000a\u009e\u000c\u009e\u000e\u009e\u07c5\u000b\u009e\u0003\u009e\u0003\u009e\u0003\u009f\u0003\u009f\u0005\u009f\u07cb\u000a\u009f\u0003\u00a0\u0003\u00a0\u0003\u00a1\u0003\u00a1\u0003\u00a2\u0003\u00a2\u0003\u00a3\u0003\u00a3\u0003\u00a4\u0003\u00a4\u0003\u00a5\u0003\u00a5\u0003\u00a6\u0003\u00a6\u0003\u00a7\u0003\u00a7\u0003\u00a8\u0003\u00a8\u0003\u00a9\u0003\u00a9\u0003\u00aa\u0003\u00aa\u0003\u00ab\u0003\u00ab\u0003\u00ab\u0003\u00ac\u0003\u00ac\u0003\u00ad\u0003\u00ad\u0003\u00ae\u0003\u00ae\u0003\u00af\u0003\u00af\u0003\u00b0\u0003\u00b0\u0003\u00b0\u0003\u00b1\u0003\u00b1\u0003\u00b2\u0003\u00b2\u0003\u00b3\u0003\u00b3\u0003\u00b4\u0003\u00b4\u0003\u00b5\u0003\u00b5\u0003\u00b6\u0003\u00b6\u0003\u00b7\u0003\u00b7\u0003\u00b8\u0003\u00b8\u0003\u00b9\u0003\u00b9\u0003\u00ba\u0003\u00ba\u0003\u00bb\u0003\u00bb\u0003\u00bc\u0003\u00bc\u0003\u00bd\u0003\u00bd\u0003\u00be\u0003\u00be\u0003\u00bf\u0003\u00bf\u0003\u00c0\u0003\u00c0\u0003\u00c1\u0003\u00c1\u0003\u00c2\u0003\u00c2\u0003\u00c3\u0003\u00c3\u0003\u00c4\u0003\u00c4\u0003\u00c5\u0003\u00c5\u0003\u00c6\u0003\u00c6\u0003\u00c7\u0003\u00c7\u0003\u00c8\u0003\u00c8\u0003\u00c9\u0003\u00c9\u0003\u00ca\u0003\u00ca\u0003\u00cb\u0003\u00cb\u0003\u00cc\u0003\u00cc\u0003\u00cd\u0003\u00cd\u0003\u00ce\u0003\u00ce\u0003\u00cf\u0003\u00cf\u0003\u00d0\u0003\u00d0\u0003\u00d1\u0003\u00d1\u0003\u00d2\u0003\u00d2\u0003\u00d3\u0003\u00d3\u0003\u00d4\u0003\u00d4\u0003\u00d5\u0003\u00d5\u0003\u00d6\u0003\u00d6\u0003\u00d7\u0003\u00d7\u0003\u00d8\u0003\u00d8\u0003\u00d9\u0003\u00d9\u0003\u00da\u0003\u00da\u0003\u00db\u0003\u00db\u0003\u00dc\u0003\u00dc\u0003\u00dd\u0003\u00dd\u0003\u00de\u0003\u00de\u0003\u00df\u0003\u00df\u0003\u00e0\u0003\u00e0\u0003\u00e1\u0003\u00e1\u0003\u00e2\u0003\u00e2\u0003\u00e3\u0003\u00e3\u0003\u00e4\u0003\u00e4\u0003\u00e5\u0003\u00e5\u0003\u00e6\u0003\u00e6\u0003\u00e7\u0003\u00e7\u0003\u00e8\u0003\u00e8\u0003\u00e9\u0003\u00e9\u0003\u00ea\u0003\u00ea\u0003\u00eb\u0003\u00eb\u0003\u00ec\u0003\u00ec\u0003\u00ed\u0003\u00ed\u0003\u00ee\u0003\u00ee\u0003\u00ef\u0003\u00ef\u0003\u00f0\u0003\u00f0\u0003\u00f1\u0003\u00f1\u0003\u00f2\u0003\u00f2\u0003\u00f3\u0003\u00f3\u0003\u00f4\u0003\u00f4\u0003\u00f5\u0003\u00f5\u0003\u00f6\u0003\u00f6\u0003\u00f7\u0003\u00f7\u0003\u00f8\u0003\u00f8\u0003\u00f9\u0003\u00f9\u0003\u00fa\u0003\u00fa\u0003\u00fb\u0003\u00fb\u0003\u00fc\u0003\u00fc\u0003\u00fd\u0003\u00fd\u0003\u00fe\u0003\u00fe\u0003\u00ff\u0003\u00ff\u0003\u0100\u0003\u0100\u0003\u0101\u0003\u0101\u0003\u0102\u0003\u0102\u0003\u0103\u0003\u0103\u0003\u0104\u0003\u0104\u0003\u0105\u0003\u0105\u0003\u0106\u0003\u0106\u0003\u0107\u0003\u0107\u0003\u0108\u0003\u0108\u0003\u0109\u0003\u0109\u0003\u010a\u0003\u010a\u0003\u010b\u0003\u010b\u0003\u010c\u0003\u010c\u0003\u010d\u0003\u010d\u0003\u010e\u0003\u010e\u0003\u010f\u0003\u010f\u0003\u0110\u0003\u0110\u0003\u0111\u0003\u0111\u0003\u0112\u0003\u0112\u0003\u0113\u0003\u0113\u0003\u0114\u0003\u0114\u0003\u0115\u0003\u0115\u0003\u0116\u0003\u0116\u0003\u0116\u0002\u0002\u0117\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0020\u0022\u0024\u0026\u0028\u002a\u002c\u002e\u0030\u0032\u0034\u0036\u0038\u003a\u003c\u003e\u0040\u0042\u0044\u0046\u0048\u004a\u004c\u004e\u0050\u0052\u0054\u0056\u0058\u005a\u005c\u005e\u0060\u0062\u0064\u0066\u0068\u006a\u006c\u006e\u0070\u0072\u0074\u0076\u0078\u007a\u007c\u007e\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de\u01e0\u01e2\u01e4\u01e6\u01e8\u01ea\u01ec\u01ee\u01f0\u01f2\u01f4\u01f6\u01f8\u01fa\u01fc\u01fe\u0200\u0202\u0204\u0206\u0208\u020a\u020c\u020e\u0210\u0212\u0214\u0216\u0218\u021a\u021c\u021e\u0220\u0222\u0224\u0226\u0228\u022a\u0002\u0007\u0004\u0002\u0014\u0014\u0016\u0016\u0003\u0002\u00ac\u00b0\u0003\u0002\u00a6\u00a7\u0004\u0002\u0039\u0039\u007e\u007e\u0007\u0002\u0072\u0072\u007a\u007a\u0088\u0088\u008e\u00a3\u00aa\u00aa\u0002\u08aa\u0002\u022d\u0003\u0002\u0002\u0002\u0004\u023d\u0003\u0002\u0002\u0002\u0006\u024a\u0003\u0002\u0002\u0002\u0008\u024c\u0003\u0002\u0002\u0002\u000a\u0273\u0003\u0002\u0002\u0002\u000c\u0275\u0003\u0002\u0002\u0002\u000e\u027c\u0003\u0002\u0002\u0002\u0010\u027f\u0003\u0002\u0002\u0002\u0012\u0289\u0003\u0002\u0002\u0002\u0014\u0295\u0003\u0002\u0002\u0002\u0016\u02a8\u0003\u0002\u0002\u0002\u0018\u02d0\u0003\u0002\u0002\u0002\u001a\u02d2\u0003\u0002\u0002\u0002\u001c\u02df\u0003\u0002\u0002\u0002\u001e\u02e8\u0003\u0002\u0002\u0002\u0020\u02f7\u0003\u0002\u0002\u0002\u0022\u0302\u0003\u0002\u0002\u0002\u0024\u0310\u0003\u0002\u0002\u0002\u0026\u0331\u0003\u0002\u0002\u0002\u0028\u0338\u0003\u0002\u0002\u0002\u002a\u0341\u0003\u0002\u0002\u0002\u002c\u034c\u0003\u0002\u0002\u0002\u002e\u034e\u0003\u0002\u0002\u0002\u0030\u035f\u0003\u0002\u0002\u0002\u0032\u037a\u0003\u0002\u0002\u0002\u0034\u037c\u0003\u0002\u0002\u0002\u0036\u0389\u0003\u0002\u0002\u0002\u0038\u038f\u0003\u0002\u0002\u0002\u003a\u03ad\u0003\u0002\u0002\u0002\u003c\u03af\u0003\u0002\u0002\u0002\u003e\u03bb\u0003\u0002\u0002\u0002\u0040\u03bf\u0003\u0002\u0002\u0002\u0042\u03cc\u0003\u0002\u0002\u0002\u0044\u03d8\u0003\u0002\u0002\u0002\u0046\u03db\u0003\u0002\u0002\u0002\u0048\u03e3\u0003\u0002\u0002\u0002\u004a\u03e8\u0003\u0002\u0002\u0002\u004c\u03ea\u0003\u0002\u0002\u0002\u004e\u03f7\u0003\u0002\u0002\u0002\u0050\u03f9\u0003\u0002\u0002\u0002\u0052\u03fc\u0003\u0002\u0002\u0002\u0054\u0405\u0003\u0002\u0002\u0002\u0056\u0409\u0003\u0002\u0002\u0002\u0058\u0415\u0003\u0002\u0002\u0002\u005a\u041a\u0003\u0002\u0002\u0002\u005c\u042a\u0003\u0002\u0002\u0002\u005e\u042c\u0003\u0002\u0002\u0002\u0060\u042f\u0003\u0002\u0002\u0002\u0062\u0434\u0003\u0002\u0002\u0002\u0064\u0438\u0003\u0002\u0002\u0002\u0066\u043b\u0003\u0002\u0002\u0002\u0068\u0444\u0003\u0002\u0002\u0002\u006a\u0447\u0003\u0002\u0002\u0002\u006c\u0452\u0003\u0002\u0002\u0002\u006e\u0458\u0003\u0002\u0002\u0002\u0070\u0472\u0003\u0002\u0002\u0002\u0072\u0474\u0003\u0002\u0002\u0002\u0074\u0482\u0003\u0002\u0002\u0002\u0076\u0489\u0003\u0002\u0002\u0002\u0078\u0495\u0003\u0002\u0002\u0002\u007a\u04a2\u0003\u0002\u0002\u0002\u007c\u04ae\u0003\u0002\u0002\u0002\u007e\u04ba\u0003\u0002\u0002\u0002\u0080\u04c8\u0003\u0002\u0002\u0002\u0082\u04cf\u0003\u0002\u0002\u0002\u0084\u04db\u0003\u0002\u0002\u0002\u0086\u04e2\u0003\u0002\u0002\u0002\u0088\u04ee\u0003\u0002\u0002\u0002\u008a\u04ff\u0003\u0002\u0002\u0002\u008c\u0506\u0003\u0002\u0002\u0002\u008e\u0510\u0003\u0002\u0002\u0002\u0090\u0521\u0003\u0002\u0002\u0002\u0092\u0523\u0003\u0002\u0002\u0002\u0094\u0527\u0003\u0002\u0002\u0002\u0096\u0529\u0003\u0002\u0002\u0002\u0098\u0535\u0003\u0002\u0002\u0002\u009a\u0539\u0003\u0002\u0002\u0002\u009c\u053d\u0003\u0002\u0002\u0002\u009e\u053f\u0003\u0002\u0002\u0002\u00a0\u054d\u0003\u0002\u0002\u0002\u00a2\u0552\u0003\u0002\u0002\u0002\u00a4\u0555\u0003\u0002\u0002\u0002\u00a6\u055e\u0003\u0002\u0002\u0002\u00a8\u0560\u0003\u0002\u0002\u0002\u00aa\u0562\u0003\u0002\u0002\u0002\u00ac\u0566\u0003\u0002\u0002\u0002\u00ae\u056c\u0003\u0002\u0002\u0002\u00b0\u0575\u0003\u0002\u0002\u0002\u00b2\u057e\u0003\u0002\u0002\u0002\u00b4\u0580\u0003\u0002\u0002\u0002\u00b6\u0582\u0003\u0002\u0002\u0002\u00b8\u0585\u0003\u0002\u0002\u0002\u00ba\u058f\u0003\u0002\u0002\u0002\u00bc\u0591\u0003\u0002\u0002\u0002\u00be\u059f\u0003\u0002\u0002\u0002\u00c0\u05ae\u0003\u0002\u0002\u0002\u00c2\u05b0\u0003\u0002\u0002\u0002\u00c4\u05b4\u0003\u0002\u0002\u0002\u00c6\u05b7\u0003\u0002\u0002\u0002\u00c8\u05c2\u0003\u0002\u0002\u0002\u00ca\u05d7\u0003\u0002\u0002\u0002\u00cc\u05dd\u0003\u0002\u0002\u0002\u00ce\u05df\u0003\u0002\u0002\u0002\u00d0\u05e4\u0003\u0002\u0002\u0002\u00d2\u05e9\u0003\u0002\u0002\u0002\u00d4\u05ef\u0003\u0002\u0002\u0002\u00d6\u05fe\u0003\u0002\u0002\u0002\u00d8\u0610\u0003\u0002\u0002\u0002\u00da\u0613\u0003\u0002\u0002\u0002\u00dc\u0626\u0003\u0002\u0002\u0002\u00de\u0629\u0003\u0002\u0002\u0002\u00e0\u0632\u0003\u0002\u0002\u0002\u00e2\u0636\u0003\u0002\u0002\u0002\u00e4\u0674\u0003\u0002\u0002\u0002\u00e6\u0676\u0003\u0002\u0002\u0002\u00e8\u0682\u0003\u0002\u0002\u0002\u00ea\u0692\u0003\u0002\u0002\u0002\u00ec\u06a0\u0003\u0002\u0002\u0002\u00ee\u06c4\u0003\u0002\u0002\u0002\u00f0\u06c6\u0003\u0002\u0002\u0002\u00f2\u06c9\u0003\u0002\u0002\u0002\u00f4\u06cc\u0003\u0002\u0002\u0002\u00f6\u06cf\u0003\u0002\u0002\u0002\u00f8\u06d3\u0003\u0002\u0002\u0002\u00fa\u06d6\u0003\u0002\u0002\u0002\u00fc\u06db\u0003\u0002\u0002\u0002\u00fe\u06df\u0003\u0002\u0002\u0002\u0100\u06ec\u0003\u0002\u0002\u0002\u0102\u06fa\u0003\u0002\u0002\u0002\u0104\u070d\u0003\u0002\u0002\u0002\u0106\u0710\u0003\u0002\u0002\u0002\u0108\u0713\u0003\u0002\u0002\u0002\u010a\u071a\u0003\u0002\u0002\u0002\u010c\u071c\u0003\u0002\u0002\u0002\u010e\u0720\u0003\u0002\u0002\u0002\u0110\u0725\u0003\u0002\u0002\u0002\u0112\u0728\u0003\u0002\u0002\u0002\u0114\u072c\u0003\u0002\u0002\u0002\u0116\u0745\u0003\u0002\u0002\u0002\u0118\u0747\u0003\u0002\u0002\u0002\u011a\u076a\u0003\u0002\u0002\u0002\u011c\u076c\u0003\u0002\u0002\u0002\u011e\u0770\u0003\u0002\u0002\u0002\u0120\u0780\u0003\u0002\u0002\u0002\u0122\u0785\u0003\u0002\u0002\u0002\u0124\u0798\u0003\u0002\u0002\u0002\u0126\u079a\u0003\u0002\u0002\u0002\u0128\u079c\u0003\u0002\u0002\u0002\u012a\u079e\u0003\u0002\u0002\u0002\u012c\u07a0\u0003\u0002\u0002\u0002\u012e\u07a2\u0003\u0002\u0002\u0002\u0130\u07a8\u0003\u0002\u0002\u0002\u0132\u07ae\u0003\u0002\u0002\u0002\u0134\u07b4\u0003\u0002\u0002\u0002\u0136\u07b6\u0003\u0002\u0002\u0002\u0138\u07ba\u0003\u0002\u0002\u0002\u013a\u07bc\u0003\u0002\u0002\u0002\u013c\u07ca\u0003\u0002\u0002\u0002\u013e\u07cc\u0003\u0002\u0002\u0002\u0140\u07ce\u0003\u0002\u0002\u0002\u0142\u07d0\u0003\u0002\u0002\u0002\u0144\u07d2\u0003\u0002\u0002\u0002\u0146\u07d4\u0003\u0002\u0002\u0002\u0148\u07d6\u0003\u0002\u0002\u0002\u014a\u07d8\u0003\u0002\u0002\u0002\u014c\u07da\u0003\u0002\u0002\u0002\u014e\u07dc\u0003\u0002\u0002\u0002\u0150\u07de\u0003\u0002\u0002\u0002\u0152\u07e0\u0003\u0002\u0002\u0002\u0154\u07e2\u0003\u0002\u0002\u0002\u0156\u07e5\u0003\u0002\u0002\u0002\u0158\u07e7\u0003\u0002\u0002\u0002\u015a\u07e9\u0003\u0002\u0002\u0002\u015c\u07eb\u0003\u0002\u0002\u0002\u015e\u07ed\u0003\u0002\u0002\u0002\u0160\u07f0\u0003\u0002\u0002\u0002\u0162\u07f2\u0003\u0002\u0002\u0002\u0164\u07f4\u0003\u0002\u0002\u0002\u0166\u07f6\u0003\u0002\u0002\u0002\u0168\u07f8\u0003\u0002\u0002\u0002\u016a\u07fa\u0003\u0002\u0002\u0002\u016c\u07fc\u0003\u0002\u0002\u0002\u016e\u07fe\u0003\u0002\u0002\u0002\u0170\u0800\u0003\u0002\u0002\u0002\u0172\u0802\u0003\u0002\u0002\u0002\u0174\u0804\u0003\u0002\u0002\u0002\u0176\u0806\u0003\u0002\u0002\u0002\u0178\u0808\u0003\u0002\u0002\u0002\u017a\u080a\u0003\u0002\u0002\u0002\u017c\u080c\u0003\u0002\u0002\u0002\u017e\u080e\u0003\u0002\u0002\u0002\u0180\u0810\u0003\u0002\u0002\u0002\u0182\u0812\u0003\u0002\u0002\u0002\u0184\u0814\u0003\u0002\u0002\u0002\u0186\u0816\u0003\u0002\u0002\u0002\u0188\u0818\u0003\u0002\u0002\u0002\u018a\u081a\u0003\u0002\u0002\u0002\u018c\u081c\u0003\u0002\u0002\u0002\u018e\u081e\u0003\u0002\u0002\u0002\u0190\u0820\u0003\u0002\u0002\u0002\u0192\u0822\u0003\u0002\u0002\u0002\u0194\u0824\u0003\u0002\u0002\u0002\u0196\u0826\u0003\u0002\u0002\u0002\u0198\u0828\u0003\u0002\u0002\u0002\u019a\u082a\u0003\u0002\u0002\u0002\u019c\u082c\u0003\u0002\u0002\u0002\u019e\u082e\u0003\u0002\u0002\u0002\u01a0\u0830\u0003\u0002\u0002\u0002\u01a2\u0832\u0003\u0002\u0002\u0002\u01a4\u0834\u0003\u0002\u0002\u0002\u01a6\u0836\u0003\u0002\u0002\u0002\u01a8\u0838\u0003\u0002\u0002\u0002\u01aa\u083a\u0003\u0002\u0002\u0002\u01ac\u083c\u0003\u0002\u0002\u0002\u01ae\u083e\u0003\u0002\u0002\u0002\u01b0\u0840\u0003\u0002\u0002\u0002\u01b2\u0842\u0003\u0002\u0002\u0002\u01b4\u0844\u0003\u0002\u0002\u0002\u01b6\u0846\u0003\u0002\u0002\u0002\u01b8\u0848\u0003\u0002\u0002\u0002\u01ba\u084a\u0003\u0002\u0002\u0002\u01bc\u084c\u0003\u0002\u0002\u0002\u01be\u084e\u0003\u0002\u0002\u0002\u01c0\u0850\u0003\u0002\u0002\u0002\u01c2\u0852\u0003\u0002\u0002\u0002\u01c4\u0854\u0003\u0002\u0002\u0002\u01c6\u0856\u0003\u0002\u0002\u0002\u01c8\u0858\u0003\u0002\u0002\u0002\u01ca\u085a\u0003\u0002\u0002\u0002\u01cc\u085c\u0003\u0002\u0002\u0002\u01ce\u085e\u0003\u0002\u0002\u0002\u01d0\u0860\u0003\u0002\u0002\u0002\u01d2\u0862\u0003\u0002\u0002\u0002\u01d4\u0864\u0003\u0002\u0002\u0002\u01d6\u0866\u0003\u0002\u0002\u0002\u01d8\u0868\u0003\u0002\u0002\u0002\u01da\u086a\u0003\u0002\u0002\u0002\u01dc\u086c\u0003\u0002\u0002\u0002\u01de\u086e\u0003\u0002\u0002\u0002\u01e0\u0870\u0003\u0002\u0002\u0002\u01e2\u0872\u0003\u0002\u0002\u0002\u01e4\u0874\u0003\u0002\u0002\u0002\u01e6\u0876\u0003\u0002\u0002\u0002\u01e8\u0878\u0003\u0002\u0002\u0002\u01ea\u087a\u0003\u0002\u0002\u0002\u01ec\u087c\u0003\u0002\u0002\u0002\u01ee\u087e\u0003\u0002\u0002\u0002\u01f0\u0880\u0003\u0002\u0002\u0002\u01f2\u0882\u0003\u0002\u0002\u0002\u01f4\u0884\u0003\u0002\u0002\u0002\u01f6\u0886\u0003\u0002\u0002\u0002\u01f8\u0888\u0003\u0002\u0002\u0002\u01fa\u088a\u0003\u0002\u0002\u0002\u01fc\u088c\u0003\u0002\u0002\u0002\u01fe\u088e\u0003\u0002\u0002\u0002\u0200\u0890\u0003\u0002\u0002\u0002\u0202\u0892\u0003\u0002\u0002\u0002\u0204\u0894\u0003\u0002\u0002\u0002\u0206\u0896\u0003\u0002\u0002\u0002\u0208\u0898\u0003\u0002\u0002\u0002\u020a\u089a\u0003\u0002\u0002\u0002\u020c\u089c\u0003\u0002\u0002\u0002\u020e\u089e\u0003\u0002\u0002\u0002\u0210\u08a0\u0003\u0002\u0002\u0002\u0212\u08a2\u0003\u0002\u0002\u0002\u0214\u08a4\u0003\u0002\u0002\u0002\u0216\u08a6\u0003\u0002\u0002\u0002\u0218\u08a8\u0003\u0002\u0002\u0002\u021a\u08aa\u0003\u0002\u0002\u0002\u021c\u08ac\u0003\u0002\u0002\u0002\u021e\u08ae\u0003\u0002\u0002\u0002\u0220\u08b0\u0003\u0002\u0002\u0002\u0222\u08b2\u0003\u0002\u0002\u0002\u0224\u08b4\u0003\u0002\u0002\u0002\u0226\u08b6\u0003\u0002\u0002\u0002\u0228\u08b8\u0003\u0002\u0002\u0002\u022a\u08ba\u0003\u0002\u0002\u0002\u022c\u022e\u0005\u0004\u0003\u0002\u022d\u022c\u0003\u0002\u0002\u0002\u022d\u022e\u0003\u0002\u0002\u0002\u022e\u0230\u0003\u0002\u0002\u0002\u022f\u0231\u0007\u0015\u0002\u0002\u0230\u022f\u0003\u0002\u0002\u0002\u0230\u0231\u0003\u0002\u0002\u0002\u0231\u0232\u0003\u0002\u0002\u0002\u0232\u0233\u0005\u0216\u010c\u0002\u0233\u0003\u0003\u0002\u0002\u0002\u0234\u0236\u0005\u000a\u0006\u0002\u0235\u0237\u0007\u0015\u0002\u0002\u0236\u0235\u0003\u0002\u0002\u0002\u0236\u0237\u0003\u0002\u0002\u0002\u0237\u0238\u0003\u0002\u0002\u0002\u0238\u0239\u0005\u0006\u0004\u0002\u0239\u023c\u0003\u0002\u0002\u0002\u023a\u023c\u0005\u0008\u0005\u0002\u023b\u0234\u0003\u0002\u0002\u0002\u023b\u023a\u0003\u0002\u0002\u0002\u023c\u023f\u0003\u0002\u0002\u0002\u023d\u023b\u0003\u0002\u0002\u0002\u023d\u023e\u0003\u0002\u0002\u0002\u023e\u0248\u0003\u0002\u0002\u0002\u023f\u023d\u0003\u0002\u0002\u0002\u0240\u0245\u0005\u000a\u0006\u0002\u0241\u0243\u0007\u0015\u0002\u0002\u0242\u0241\u0003\u0002\u0002\u0002\u0242\u0243\u0003\u0002\u0002\u0002\u0243\u0244\u0003\u0002\u0002\u0002\u0244\u0246\u0005\u0006\u0004\u0002\u0245\u0242\u0003\u0002\u0002\u0002\u0245\u0246\u0003\u0002\u0002\u0002\u0246\u0249\u0003\u0002\u0002\u0002\u0247\u0249\u0005\u0008\u0005\u0002\u0248\u0240\u0003\u0002\u0002\u0002\u0248\u0247\u0003\u0002\u0002\u0002\u0249\u0005\u0003\u0002\u0002\u0002\u024a\u024b\u0007\u000a\u0002\u0002\u024b\u0007\u0003\u0002\u0002\u0002\u024c\u024d\u0005\u0006\u0004\u0002\u024d\u0009\u0003\u0002\u0002\u0002\u024e\u0274\u0005\u00bc\u005f\u0002\u024f\u0274\u0005\u0072\u003a\u0002\u0250\u0274\u0005\u006c\u0037\u0002\u0251\u0274\u0005\u005a\u002e\u0002\u0252\u0274\u0005\u004c\u0027\u0002\u0253\u0274\u0005\u0046\u0024\u0002\u0254\u0274\u0005\u00b6\u005c\u0002\u0255\u0274\u0005\u0038\u001d\u0002\u0256\u0274\u0005\u0030\u0019\u0002\u0257\u0274\u0005\u00c8\u0065\u0002\u0258\u0274\u0005\u002e\u0018\u0002\u0259\u0274\u0005\u0024\u0013\u0002\u025a\u0274\u0005\u001c\u000f\u0002\u025b\u0274\u0005\u0088\u0045\u0002\u025c\u0274\u0005\u0022\u0012\u0002\u025d\u0274\u0005\u001e\u0010\u0002\u025e\u0274\u0005\u001a\u000e\u0002\u025f\u0274\u0005\u00d4\u006b\u0002\u0260\u0274\u0005\u007a\u003e\u0002\u0261\u0274\u0005\u007c\u003f\u0002\u0262\u0274\u0005\u0086\u0044\u0002\u0263\u0274\u0005\u0084\u0043\u0002\u0264\u0274\u0005\u0078\u003d\u0002\u0265\u0274\u0005\u0080\u0041\u0002\u0266\u0274\u0005\u0082\u0042\u0002\u0267\u0274\u0005\u007e\u0040\u0002\u0268\u0274\u0005\u0076\u003c\u0002\u0269\u0274\u0005\u0074\u003b\u0002\u026a\u0274\u0005\u0014\u000b\u0002\u026b\u0274\u0005\u00ec\u0077\u0002\u026c\u0274\u0005\u0012\u000a\u0002\u026d\u0274\u0005\u0010\u0009\u0002\u026e\u0274\u0005\u000c\u0007\u0002\u026f\u0274\u0005\u0102\u0082\u0002\u0270\u0274\u0005\u00c6\u0064\u0002\u0271\u0274\u0005\u00da\u006e\u0002\u0272\u0274\u0005\u00c4\u0063\u0002\u0273\u024e\u0003\u0002\u0002\u0002\u0273\u024f\u0003\u0002\u0002\u0002\u0273\u0250\u0003\u0002\u0002\u0002\u0273\u0251\u0003\u0002\u0002\u0002\u0273\u0252\u0003\u0002\u0002\u0002\u0273\u0253\u0003\u0002\u0002\u0002\u0273\u0254\u0003\u0002\u0002\u0002\u0273\u0255\u0003\u0002\u0002\u0002\u0273\u0256\u0003\u0002\u0002\u0002\u0273\u0257\u0003\u0002\u0002\u0002\u0273\u0258\u0003\u0002\u0002\u0002\u0273\u0259\u0003\u0002\u0002\u0002\u0273\u025a\u0003\u0002\u0002\u0002\u0273\u025b\u0003\u0002\u0002\u0002\u0273\u025c\u0003\u0002\u0002\u0002\u0273\u025d\u0003\u0002\u0002\u0002\u0273\u025e\u0003\u0002\u0002\u0002\u0273\u025f\u0003\u0002\u0002\u0002\u0273\u0260\u0003\u0002\u0002\u0002\u0273\u0261\u0003\u0002\u0002\u0002\u0273\u0262\u0003\u0002\u0002\u0002\u0273\u0263\u0003\u0002\u0002\u0002\u0273\u0264\u0003\u0002\u0002\u0002\u0273\u0265\u0003\u0002\u0002\u0002\u0273\u0266\u0003\u0002\u0002\u0002\u0273\u0267\u0003\u0002\u0002\u0002\u0273\u0268\u0003\u0002\u0002\u0002\u0273\u0269\u0003\u0002\u0002\u0002\u0273\u026a\u0003\u0002\u0002\u0002\u0273\u026b\u0003\u0002\u0002\u0002\u0273\u026c\u0003\u0002\u0002\u0002\u0273\u026d\u0003\u0002\u0002\u0002\u0273\u026e\u0003\u0002\u0002\u0002\u0273\u026f\u0003\u0002\u0002\u0002\u0273\u0270\u0003\u0002\u0002\u0002\u0273\u0271\u0003\u0002\u0002\u0002\u0273\u0272\u0003\u0002\u0002\u0002\u0274\u000b\u0003\u0002\u0002\u0002\u0275\u0276\u0005\u0214\u010b\u0002\u0276\u0277\u0005\u0016\u000c\u0002\u0277\u0278\u0005\u01ce\u00e8\u0002\u0278\u0279\u0005\u0018\u000d\u0002\u0279\u027a\u0005\u0194\u00cb\u0002\u027a\u027b\u0005\u013e\u00a0\u0002\u027b\u000d\u0003\u0002\u0002\u0002\u027c\u027d\u0005\u01ba\u00de\u0002\u027d\u027e\u0005\u0208\u0105\u0002\u027e\u000f\u0003\u0002\u0002\u0002\u027f\u0280\u0005\u01ba\u00de\u0002\u0280\u0284\u0005\u01e4\u00f3\u0002\u0281\u0282\u0005\u01cc\u00e7\u0002\u0282\u0283\u0005\u013e\u00a0\u0002\u0283\u0285\u0003\u0002\u0002\u0002\u0284\u0281\u0003\u0002\u0002\u0002\u0284\u0285\u0003\u0002\u0002\u0002\u0285\u0287\u0003\u0002\u0002\u0002\u0286\u0288\u0005\u01c6\u00e4\u0002\u0287\u0286\u0003\u0002\u0002\u0002\u0287\u0288\u0003\u0002\u0002\u0002\u0288\u0011\u0003\u0002\u0002\u0002\u0289\u028a\u0005\u01ba\u00de\u0002\u028a\u028e\u0005\u0016\u000c\u0002\u028b\u028c\u0005\u01ce\u00e8\u0002\u028c\u028d\u0005\u0018\u000d\u0002\u028d\u028f\u0003\u0002\u0002\u0002\u028e\u028b\u0003\u0002\u0002\u0002\u028e\u028f\u0003\u0002\u0002\u0002\u028f\u0293\u0003\u0002\u0002\u0002\u0290\u0291\u0005\u01cc\u00e7\u0002\u0291\u0292\u0005\u013e\u00a0\u0002\u0292\u0294\u0003\u0002\u0002\u0002\u0293\u0290\u0003\u0002\u0002\u0002\u0293\u0294\u0003\u0002\u0002\u0002\u0294\u0013\u0003\u0002\u0002\u0002\u0295\u0296\u0005\u019c\u00cf\u0002\u0296\u0297\u0005\u0016\u000c\u0002\u0297\u0298\u0005\u01ce\u00e8\u0002\u0298\u0299\u0005\u0018\u000d\u0002\u0299\u029a\u0005\u01f6\u00fc\u0002\u029a\u029b\u0005\u013e\u00a0\u0002\u029b\u0015\u0003\u0002\u0002\u0002\u029c\u029f\u0005\u015c\u00af\u0002\u029d\u029f\u0005\u015e\u00b0\u0002\u029e\u029c\u0003\u0002\u0002\u0002\u029e\u029d\u0003\u0002\u0002\u0002\u029f\u02a9\u0003\u0002\u0002\u0002\u02a0\u02a9\u0005\u0162\u00b2\u0002\u02a1\u02a9\u0005\u016c\u00b7\u0002\u02a2\u02a9\u0005\u0182\u00c2\u0002\u02a3\u02a9\u0005\u018c\u00c7\u0002\u02a4\u02a9\u0005\u017c\u00bf\u0002\u02a5\u02a9\u0005\u0186\u00c4\u0002\u02a6\u02a9\u0005\u01c2\u00e2\u0002\u02a7\u02a9\u0005\u01e6\u00f4\u0002\u02a8\u029e\u0003\u0002\u0002\u0002\u02a8\u02a0\u0003\u0002\u0002\u0002\u02a8\u02a1\u0003\u0002\u0002\u0002\u02a8\u02a2\u0003\u0002\u0002\u0002\u02a8\u02a3\u0003\u0002\u0002\u0002\u02a8\u02a4\u0003\u0002\u0002\u0002\u02a8\u02a5\u0003\u0002\u0002\u0002\u02a8\u02a6\u0003\u0002\u0002\u0002\u02a8\u02a7\u0003\u0002\u0002\u0002\u02a9\u0017\u0003\u0002\u0002\u0002\u02aa\u02ab\u0005\u015c\u00af\u0002\u02ab\u02ac\u0005\u019a\u00ce\u0002\u02ac\u02d1\u0003\u0002\u0002\u0002\u02ad\u02ae\u0005\u015c\u00af\u0002\u02ae\u02af\u0005\u019a\u00ce\u0002\u02af\u02b0\u0005\u01a0\u00d1\u0002\u02b0\u02b1\u0005\u01b2\u00da\u0002\u02b1\u02b2\u0005\u0130\u0099\u0002\u02b2\u02d1\u0003\u0002\u0002\u0002\u02b3\u02b7\u0005\u0198\u00cd\u0002\u02b4\u02b5\u0005\u0130\u0099\u0002\u02b5\u02b6\u0007\u0010\u0002\u0002\u02b6\u02b8\u0003\u0002\u0002\u0002\u02b7\u02b4\u0003\u0002\u0002\u0002\u02b7\u02b8\u0003\u0002\u0002\u0002\u02b8\u02b9\u0003\u0002\u0002\u0002\u02b9\u02ba\u0005\u014a\u00a6\u0002\u02ba\u02d1\u0003\u0002\u0002\u0002\u02bb\u02bc\u0005\u015c\u00af\u0002\u02bc\u02bd\u0005\u01b4\u00db\u0002\u02bd\u02d1\u0003\u0002\u0002\u0002\u02be\u02bf\u0005\u01b2\u00da\u0002\u02bf\u02c0\u0005\u0130\u0099\u0002\u02c0\u02d1\u0003\u0002\u0002\u0002\u02c1\u02c3\u0005\u01f2\u00fa\u0002\u02c2\u02c1\u0003\u0002\u0002\u0002\u02c2\u02c3\u0003\u0002\u0002\u0002\u02c3\u02c7\u0003\u0002\u0002\u0002\u02c4\u02c5\u0005\u0130\u0099\u0002\u02c5\u02c6\u0007\u0010\u0002\u0002\u02c6\u02c8\u0003\u0002\u0002\u0002\u02c7\u02c4\u0003\u0002\u0002\u0002\u02c7\u02c8\u0003\u0002\u0002\u0002\u02c8\u02c9\u0003\u0002\u0002\u0002\u02c9\u02d1\u0005\u0132\u009a\u0002\u02ca\u02cb\u0005\u015c\u00af\u0002\u02cb\u02cc\u0005\u01e4\u00f3\u0002\u02cc\u02d1\u0003\u0002\u0002\u0002\u02cd\u02ce\u0005\u01e2\u00f2\u0002\u02ce\u02cf\u0005\u013e\u00a0\u0002\u02cf\u02d1\u0003\u0002\u0002\u0002\u02d0\u02aa\u0003\u0002\u0002\u0002\u02d0\u02ad\u0003\u0002\u0002\u0002\u02d0\u02b3\u0003\u0002\u0002\u0002\u02d0\u02bb\u0003\u0002\u0002\u0002\u02d0\u02be\u0003\u0002\u0002\u0002\u02d0\u02c2\u0003\u0002\u0002\u0002\u02d0\u02ca\u0003\u0002\u0002\u0002\u02d0\u02cd\u0003\u0002\u0002\u0002\u02d1\u0019\u0003\u0002\u0002\u0002\u02d2\u02d3\u0005\u017c\u00bf\u0002\u02d3\u02d5\u0005\u0206\u0104\u0002\u02d4\u02d6\u0005\u00f6\u007c\u0002\u02d5\u02d4\u0003\u0002\u0002\u0002\u02d5\u02d6\u0003\u0002\u0002\u0002\u02d6\u02d7\u0003\u0002\u0002\u0002\u02d7\u02d8\u0005\u014e\u00a8\u0002\u02d8\u02d9\u0005\u0212\u010a\u0002\u02d9\u02da\u0005\u01d6\u00ec\u0002\u02da\u02dd\u0005\u012a\u0096\u0002\u02db\u02de\u0005\u01f0\u00f9\u0002\u02dc\u02de\u0005\u01c4\u00e3\u0002\u02dd\u02db\u0003\u0002\u0002\u0002\u02dd\u02dc\u0003\u0002\u0002\u0002\u02dd\u02de\u0003\u0002\u0002\u0002\u02de\u001b\u0003\u0002\u0002\u0002\u02df\u02e0\u0005\u017c\u00bf\u0002\u02e0\u02e2\u0005\u01e2\u00f2\u0002\u02e1\u02e3\u0005\u00f6\u007c\u0002\u02e2\u02e1\u0003\u0002\u0002\u0002\u02e2\u02e3\u0003\u0002\u0002\u0002\u02e3\u02e4\u0003\u0002\u0002\u0002\u02e4\u02e6\u0005\u013e\u00a0\u0002\u02e5\u02e7\u0005\u006e\u0038\u0002\u02e6\u02e5\u0003\u0002\u0002\u0002\u02e6\u02e7\u0003\u0002\u0002\u0002\u02e7\u001d\u0003\u0002\u0002\u0002\u02e8\u02e9\u0005\u017c\u00bf\u0002\u02e9\u02eb\u0005\u01fe\u0100\u0002\u02ea\u02ec\u0005\u00f6\u007c\u0002\u02eb\u02ea\u0003\u0002\u0002\u0002\u02eb\u02ec\u0003\u0002\u0002\u0002\u02ec\u02f0\u0003\u0002\u0002\u0002\u02ed\u02ee\u0005\u0130\u0099\u0002\u02ee\u02ef\u0007\u0010\u0002\u0002\u02ef\u02f1\u0003\u0002\u0002\u0002\u02f0\u02ed\u0003\u0002\u0002\u0002\u02f0\u02f1\u0003\u0002\u0002\u0002\u02f1\u02f2\u0003\u0002\u0002\u0002\u02f2\u02f3\u0005\u0146\u00a4\u0002\u02f3\u02f4\u0005\u0218\u010d\u0002\u02f4\u02f5\u0005\u0020\u0011\u0002\u02f5\u02f6\u0005\u021a\u010e\u0002\u02f6\u001f\u0003\u0002\u0002\u0002\u02f7\u02f8\u0005\u0134\u009b\u0002\u02f8\u02ff\u0005\u0136\u009c\u0002\u02f9\u02fa\u0005\u0228\u0115\u0002\u02fa\u02fb\u0005\u0134\u009b\u0002\u02fb\u02fc\u0005\u0136\u009c\u0002\u02fc\u02fe\u0003\u0002\u0002\u0002\u02fd\u02f9\u0003\u0002\u0002\u0002\u02fe\u0301\u0003\u0002\u0002\u0002\u02ff\u02fd\u0003\u0002\u0002\u0002\u02ff\u0300\u0003\u0002\u0002\u0002\u0300\u0021\u0003\u0002\u0002\u0002\u0301\u02ff\u0003\u0002\u0002\u0002\u0302\u0303\u0005\u017c\u00bf\u0002\u0303\u0305\u0005\u01f8\u00fd\u0002\u0304\u0306\u0005\u00f6\u007c\u0002\u0305\u0304\u0003\u0002\u0002\u0002\u0305\u0306\u0003\u0002\u0002\u0002\u0306\u030a\u0003\u0002\u0002\u0002\u0307\u0308\u0005\u0130\u0099\u0002\u0308\u0309\u0007\u0010\u0002\u0002\u0309\u030b\u0003\u0002\u0002\u0002\u030a\u0307\u0003\u0002\u0002\u0002\u030a\u030b\u0003\u0002\u0002\u0002\u030b\u030c\u0003\u0002\u0002\u0002\u030c\u030d\u0005\u0140\u00a1\u0002\u030d\u030e\u0005\u020a\u0106\u0002\u030e\u030f\u0005\u0142\u00a2\u0002\u030f\u0023\u0003\u0002\u0002\u0002\u0310\u0311\u0005\u017c\u00bf\u0002\u0311\u0312\u0005\u01c0\u00e1\u0002\u0312\u0314\u0005\u020e\u0108\u0002\u0313\u0315\u0005\u00f6\u007c\u0002\u0314\u0313\u0003\u0002\u0002\u0002\u0314\u0315\u0003\u0002\u0002\u0002\u0315\u0319\u0003\u0002\u0002\u0002\u0316\u0317\u0005\u0130\u0099\u0002\u0317\u0318\u0007\u0010\u0002\u0002\u0318\u031a\u0003\u0002\u0002\u0002\u0319\u0316\u0003\u0002\u0002\u0002\u0319\u031a\u0003\u0002\u0002\u0002\u031a\u031b\u0003\u0002\u0002\u0002\u031b\u031c\u0005\u0144\u00a3\u0002\u031c\u031d\u0005\u0168\u00b5\u0002\u031d\u031e\u0005\u01e6\u00f4\u0002\u031e\u031f\u0005\u00fe\u0080\u0002\u031f\u0323\u0005\u0194\u00cb\u0002\u0320\u0321\u0005\u0130\u0099\u0002\u0321\u0322\u0007\u0010\u0002\u0002\u0322\u0324\u0003\u0002\u0002\u0002\u0323\u0320\u0003\u0002\u0002\u0002\u0323\u0324\u0003\u0002\u0002\u0002\u0324\u0325\u0003\u0002\u0002\u0002\u0325\u0326\u0005\u0132\u009a\u0002\u0326\u0327\u0005\u0026\u0014\u0002\u0327\u0328\u0005\u01d8\u00ed\u0002\u0328\u0329\u0005\u01ae\u00d8\u0002\u0329\u032a\u0005\u0218\u010d\u0002\u032a\u032b\u0005\u00fe\u0080\u0002\u032b\u032f\u0005\u021a\u010e\u0002\u032c\u032d\u0005\u0212\u010a\u0002\u032d\u032e\u0005\u002c\u0017\u0002\u032e\u0330\u0003\u0002\u0002\u0002\u032f\u032c\u0003\u0002\u0002\u0002\u032f\u0330\u0003\u0002\u0002\u0002\u0330\u0025\u0003\u0002\u0002\u0002\u0331\u0332\u0005\u0210\u0109\u0002\u0332\u0336\u0005\u0028\u0015\u0002\u0333\u0334\u0005\u0164\u00b3\u0002\u0334\u0335\u0005\u0118\u008d\u0002\u0335\u0337\u0003\u0002\u0002\u0002\u0336\u0333\u0003\u0002\u0002\u0002\u0336\u0337\u0003\u0002\u0002\u0002\u0337\u0027\u0003\u0002\u0002\u0002\u0338\u033e\u0005\u002a\u0016\u0002\u0339\u033a\u0005\u0164\u00b3\u0002\u033a\u033b\u0005\u002a\u0016\u0002\u033b\u033d\u0003\u0002\u0002\u0002\u033c\u0339\u0003\u0002\u0002\u0002\u033d\u0340\u0003\u0002\u0002\u0002\u033e\u033c\u0003\u0002\u0002\u0002\u033e\u033f\u0003\u0002\u0002\u0002\u033f\u0029\u0003\u0002\u0002\u0002\u0340\u033e\u0003\u0002\u0002\u0002\u0341\u0342\u0005\u0134\u009b\u0002\u0342\u0343\u0005\u01ac\u00d7\u0002\u0343\u0344\u0005\u01c8\u00e5\u0002\u0344\u0345\u0005\u01ca\u00e6\u0002\u0345\u002b\u0003\u0002\u0002\u0002\u0346\u034d\u0005\u008e\u0048\u0002\u0347\u0348\u0005\u008e\u0048\u0002\u0348\u0349\u0005\u0164\u00b3\u0002\u0349\u034a\u0005\u008c\u0047\u0002\u034a\u034d\u0003\u0002\u0002\u0002\u034b\u034d\u0005\u008c\u0047\u0002\u034c\u0346\u0003\u0002\u0002\u0002\u034c\u0347\u0003\u0002\u0002\u0002\u034c\u034b\u0003\u0002\u0002\u0002\u034d\u002d\u0003\u0002\u0002\u0002\u034e\u034f\u0005\u017c\u00bf\u0002\u034f\u0351\u0005\u01b2\u00da\u0002\u0350\u0352\u0005\u00f6\u007c\u0002\u0351\u0350\u0003\u0002\u0002\u0002\u0351\u0352\u0003\u0002\u0002\u0002\u0352\u0353\u0003\u0002\u0002\u0002\u0353\u0354\u0005\u0130\u0099\u0002\u0354\u0355\u0005\u0212\u010a\u0002\u0355\u0356\u0005\u01de\u00f0\u0002\u0356\u0357\u0007\u00ac\u0002\u0002\u0357\u0358\u0005\u021c\u010f\u0002\u0358\u0359\u0005\u00be\u0060\u0002\u0359\u035d\u0005\u021e\u0110\u0002\u035a\u035b\u0005\u0164\u00b3\u0002\u035b\u035c\u0005\u00c2\u0062\u0002\u035c\u035e\u0003\u0002\u0002\u0002\u035d\u035a\u0003\u0002\u0002\u0002\u035d\u035e\u0003\u0002\u0002\u0002\u035e\u002f\u0003\u0002\u0002\u0002\u035f\u0361\u0005\u017c\u00bf\u0002\u0360\u0362\u0005\u0044\u0023\u0002\u0361\u0360\u0003\u0002\u0002\u0002\u0361\u0362\u0003\u0002\u0002\u0002\u0362\u0363\u0003\u0002\u0002\u0002\u0363\u0365\u0005\u0198\u00cd\u0002\u0364\u0366\u0005\u00f6\u007c\u0002\u0365\u0364\u0003\u0002\u0002\u0002\u0365\u0366\u0003\u0002\u0002\u0002\u0366\u036a\u0003\u0002\u0002\u0002\u0367\u0368\u0005\u0130\u0099\u0002\u0368\u0369\u0007\u0010\u0002\u0002\u0369\u036b\u0003\u0002\u0002\u0002\u036a\u0367\u0003\u0002\u0002\u0002\u036a\u036b\u0003\u0002\u0002\u0002\u036b\u036c\u0003\u0002\u0002\u0002\u036c\u036d\u0005\u014a\u00a6\u0002\u036d\u036f\u0005\u0218\u010d\u0002\u036e\u0370\u0005\u0034\u001b\u0002\u036f\u036e\u0003\u0002\u0002\u0002\u036f\u0370\u0003\u0002\u0002\u0002\u0370\u0371\u0003\u0002\u0002\u0002\u0371\u0372\u0005\u021a\u010e\u0002\u0372\u0373\u0005\u0036\u001c\u0002\u0373\u0374\u0005\u01e0\u00f1\u0002\u0374\u0375\u0005\u0136\u009c\u0002\u0375\u0376\u0005\u01b6\u00dc\u0002\u0376\u0377\u0005\u014c\u00a7\u0002\u0377\u0378\u0005\u0168\u00b5\u0002\u0378\u0379\u0005\u0032\u001a\u0002\u0379\u0031\u0003\u0002\u0002\u0002\u037a\u037b\u0007\u00a4\u0002\u0002\u037b\u0033\u0003\u0002\u0002\u0002\u037c\u0382\u0005\u0154\u00ab\u0002\u037d\u037e\u0005\u0228\u0115\u0002\u037e\u037f\u0005\u0154\u00ab\u0002\u037f\u0381\u0003\u0002\u0002\u0002\u0380\u037d\u0003\u0002\u0002\u0002\u0381\u0384\u0003\u0002\u0002\u0002\u0382\u0380\u0003\u0002\u0002\u0002\u0382\u0383\u0003\u0002\u0002\u0002\u0383\u0035\u0003\u0002\u0002\u0002\u0384\u0382\u0003\u0002\u0002\u0002\u0385\u038a\u0005\u0174\u00bb\u0002\u0386\u0387\u0005\u01e0\u00f1\u0002\u0387\u0388\u0005\u01ca\u00e6\u0002\u0388\u038a\u0003\u0002\u0002\u0002\u0389\u0385\u0003\u0002\u0002\u0002\u0389\u0386\u0003\u0002\u0002\u0002\u038a\u038b\u0003\u0002\u0002\u0002\u038b\u038c\u0005\u01ce\u00e8\u0002\u038c\u038d\u0005\u01ca\u00e6\u0002\u038d\u038e\u0005\u01a6\u00d4\u0002\u038e\u0037\u0003\u0002\u0002\u0002\u038f\u0391\u0005\u017c\u00bf\u0002\u0390\u0392\u0005\u0044\u0023\u0002\u0391\u0390\u0003\u0002\u0002\u0002\u0391\u0392\u0003\u0002\u0002\u0002\u0392\u0393\u0003\u0002\u0002\u0002\u0393\u0395\u0005\u015a\u00ae\u0002\u0394\u0396\u0005\u00f6\u007c\u0002\u0395\u0394\u0003\u0002\u0002\u0002\u0395\u0396\u0003\u0002\u0002\u0002\u0396\u039a\u0003\u0002\u0002\u0002\u0397\u0398\u0005\u0130\u0099\u0002\u0398\u0399\u0007\u0010\u0002\u0002\u0399\u039b\u0003\u0002\u0002\u0002\u039a\u0397\u0003\u0002\u0002\u0002\u039a\u039b\u0003\u0002\u0002\u0002\u039b\u039c\u0003\u0002\u0002\u0002\u039c\u039d\u0005\u0148\u00a5\u0002\u039d\u039e\u0005\u0218\u010d\u0002\u039e\u039f\u0005\u0136\u009c\u0002\u039f\u03a0\u0005\u021a\u010e\u0002\u03a0\u03a1\u0005\u01ea\u00f6\u0002\u03a1\u03a2\u0005\u014a\u00a6\u0002\u03a2\u03a3\u0005\u01ee\u00f8\u0002\u03a3\u03a4\u0005\u0136\u009c\u0002\u03a4\u03a5\u0005\u0192\u00ca\u0002\u03a5\u03a6\u0005\u014a\u00a6\u0002\u03a6\u03a7\u0005\u01a4\u00d3\u0002\u03a7\u03a8\u0005\u003a\u001e\u0002\u03a8\u0039\u0003\u0002\u0002\u0002\u03a9\u03ae\u0005\u0124\u0093\u0002\u03aa\u03ae\u0005\u0042\u0022\u0002\u03ab\u03ae\u0005\u0040\u0021\u0002\u03ac\u03ae\u0005\u003c\u001f\u0002\u03ad\u03a9\u0003\u0002\u0002\u0002\u03ad\u03aa\u0003\u0002\u0002\u0002\u03ad\u03ab\u0003\u0002\u0002\u0002\u03ad\u03ac\u0003\u0002\u0002\u0002\u03ae\u003b\u0003\u0002\u0002\u0002\u03af\u03b0\u0005\u021c\u010f\u0002\u03b0\u03b6\u0005\u003e\u0020\u0002\u03b1\u03b2\u0005\u0228\u0115\u0002\u03b2\u03b3\u0005\u003e\u0020\u0002\u03b3\u03b5\u0003\u0002\u0002\u0002\u03b4\u03b1\u0003\u0002\u0002\u0002\u03b5\u03b8\u0003\u0002\u0002\u0002\u03b6\u03b4\u0003\u0002\u0002\u0002\u03b6\u03b7\u0003\u0002\u0002\u0002\u03b7\u03b9\u0003\u0002\u0002\u0002\u03b8\u03b6\u0003\u0002\u0002\u0002\u03b9\u03ba\u0005\u021e\u0110\u0002\u03ba\u003d\u0003\u0002\u0002\u0002\u03bb\u03bc\u0005\u0152\u00aa\u0002\u03bc\u03bd\u0007\u000b\u0002\u0002\u03bd\u03be\u0005\u003a\u001e\u0002\u03be\u003f\u0003\u0002\u0002\u0002\u03bf\u03c0\u0005\u0218\u010d\u0002\u03c0\u03c7\u0005\u0042\u0022\u0002\u03c1\u03c2\u0005\u0228\u0115\u0002\u03c2\u03c3\u0005\u0124\u0093\u0002\u03c3\u03c6\u0003\u0002\u0002\u0002\u03c4\u03c6\u0005\u0042\u0022\u0002\u03c5\u03c1\u0003\u0002\u0002\u0002\u03c5\u03c4\u0003\u0002\u0002\u0002\u03c6\u03c9\u0003\u0002\u0002\u0002\u03c7\u03c5\u0003\u0002\u0002\u0002\u03c7\u03c8\u0003\u0002\u0002\u0002\u03c8\u03ca\u0003\u0002\u0002\u0002\u03c9\u03c7\u0003\u0002\u0002\u0002\u03ca\u03cb\u0005\u021a\u010e\u0002\u03cb\u0041\u0003\u0002\u0002\u0002\u03cc\u03cd\u0005\u0218\u010d\u0002\u03cd\u03d3\u0005\u0124\u0093\u0002\u03ce\u03cf\u0005\u0228\u0115\u0002\u03cf\u03d0\u0005\u0124\u0093\u0002\u03d0\u03d2\u0003\u0002\u0002\u0002\u03d1\u03ce\u0003\u0002\u0002\u0002\u03d2\u03d5\u0003\u0002\u0002\u0002\u03d3\u03d1\u0003\u0002\u0002\u0002\u03d3\u03d4\u0003\u0002\u0002\u0002\u03d4\u03d6\u0003\u0002\u0002\u0002\u03d5\u03d3\u0003\u0002\u0002\u0002\u03d6\u03d7\u0005\u021a\u010e\u0002\u03d7\u0043\u0003\u0002\u0002\u0002\u03d8\u03d9\u0005\u01d2\u00ea\u0002\u03d9\u03da\u0005\u01dc\u00ef\u0002\u03da\u0045\u0003\u0002\u0002\u0002\u03db\u03dc\u0005\u0162\u00b2\u0002\u03dc\u03dd\u0005\u0206\u0104\u0002\u03dd\u03de\u0005\u014e\u00a8\u0002\u03de\u03df\u0005\u0212\u010a\u0002\u03df\u03e1\u0005\u0048\u0025\u0002\u03e0\u03e2\u0005\u004a\u0026\u0002\u03e1\u03e0\u0003\u0002\u0002\u0002\u03e1\u03e2\u0003\u0002\u0002\u0002\u03e2\u0047\u0003\u0002\u0002\u0002\u03e3\u03e4\u0005\u01d6\u00ec\u0002\u03e4\u03e5\u0005\u012a\u0096\u0002\u03e5\u0049\u0003\u0002\u0002\u0002\u03e6\u03e9\u0005\u01f0\u00f9\u0002\u03e7\u03e9\u0005\u01c4\u00e3\u0002\u03e8\u03e6\u0003\u0002\u0002\u0002\u03e8\u03e7\u0003\u0002\u0002\u0002\u03e9\u004b\u0003\u0002\u0002\u0002\u03ea\u03eb\u0005\u0162\u00b2\u0002\u03eb\u03ef\u0005\u01fe\u0100\u0002\u03ec\u03ed\u0005\u0130\u0099\u0002\u03ed\u03ee\u0007\u0010\u0002\u0002\u03ee\u03f0\u0003\u0002\u0002\u0002\u03ef\u03ec\u0003\u0002\u0002\u0002\u03ef\u03f0\u0003\u0002\u0002\u0002\u03f0\u03f1\u0003\u0002\u0002\u0002\u03f1\u03f2\u0005\u0146\u00a4\u0002\u03f2\u03f3\u0005\u004e\u0028\u0002\u03f3\u004d\u0003\u0002\u0002\u0002\u03f4\u03f8\u0005\u0058\u002d\u0002\u03f5\u03f8\u0005\u0056\u002c\u0002\u03f6\u03f8\u0005\u0050\u0029\u0002\u03f7\u03f4\u0003\u0002\u0002\u0002\u03f7\u03f5\u0003\u0002\u0002\u0002\u03f7\u03f6\u0003\u0002\u0002\u0002\u03f8\u004f\u0003\u0002\u0002\u0002\u03f9\u03fa\u0005\u01da\u00ee\u0002\u03fa\u03fb\u0005\u0052\u002a\u0002\u03fb\u0051\u0003\u0002\u0002\u0002\u03fc\u0402\u0005\u0054\u002b\u0002\u03fd\u03fe\u0005\u0164\u00b3\u0002\u03fe\u03ff\u0005\u0054\u002b\u0002\u03ff\u0401\u0003\u0002\u0002\u0002\u0400\u03fd\u0003\u0002\u0002\u0002\u0401\u0404\u0003\u0002\u0002\u0002\u0402\u0400\u0003\u0002\u0002\u0002\u0402\u0403\u0003\u0002\u0002\u0002\u0403\u0053\u0003\u0002\u0002\u0002\u0404\u0402\u0003\u0002\u0002\u0002\u0405\u0406\u0005\u0134\u009b\u0002\u0406\u0407\u0005\u01f6\u00fc\u0002\u0407\u0408\u0005\u0134\u009b\u0002\u0408\u0055\u0003\u0002\u0002\u0002\u0409\u040a\u0005\u0158\u00ad\u0002\u040a\u040b\u0005\u0134\u009b\u0002\u040b\u0412\u0005\u0136\u009c\u0002\u040c\u040d\u0005\u0228\u0115\u0002\u040d\u040e\u0005\u0134\u009b\u0002\u040e\u040f\u0005\u0136\u009c\u0002\u040f\u0411\u0003\u0002\u0002\u0002\u0410\u040c\u0003\u0002\u0002\u0002\u0411\u0414\u0003\u0002\u0002\u0002\u0412\u0410\u0003\u0002\u0002\u0002\u0412\u0413\u0003\u0002\u0002\u0002\u0413\u0057\u0003\u0002\u0002\u0002\u0414\u0412\u0003\u0002\u0002\u0002\u0415\u0416\u0005\u0162\u00b2\u0002\u0416\u0417\u0005\u0134\u009b\u0002\u0417\u0418\u0005\u01fe\u0100\u0002\u0418\u0419\u0005\u0136\u009c\u0002\u0419\u0059\u0003\u0002\u0002\u0002\u041a\u041b\u0005\u0162\u00b2\u0002\u041b\u041f\u0005\u01f2\u00fa\u0002\u041c\u041d\u0005\u0130\u0099\u0002\u041d\u041e\u0007\u0010\u0002\u0002\u041e\u0420\u0003\u0002\u0002\u0002\u041f\u041c\u0003\u0002\u0002\u0002\u041f\u0420\u0003\u0002\u0002\u0002\u0420\u0421\u0003\u0002\u0002\u0002\u0421\u0422\u0005\u0132\u009a\u0002\u0422\u0423\u0005\u005c\u002f\u0002\u0423\u005b\u0003\u0002\u0002\u0002\u0424\u042b\u0005\u0068\u0035\u0002\u0425\u042b\u0005\u0064\u0033\u0002\u0426\u042b\u0005\u0064\u0033\u0002\u0427\u042b\u0005\u0062\u0032\u0002\u0428\u042b\u0005\u0060\u0031\u0002\u0429\u042b\u0005\u005e\u0030\u0002\u042a\u0424\u0003\u0002\u0002\u0002\u042a\u0425\u0003\u0002\u0002\u0002\u042a\u0426\u0003\u0002\u0002\u0002\u042a\u0427\u0003\u0002\u0002\u0002\u042a\u0428\u0003\u0002\u0002\u0002\u042a\u0429\u0003\u0002\u0002\u0002\u042b\u005d\u0003\u0002\u0002\u0002\u042c\u042d\u0005\u0212\u010a\u0002\u042d\u042e\u0005\u008e\u0048\u0002\u042e\u005f\u0003\u0002\u0002\u0002\u042f\u0430\u0005\u01da\u00ee\u0002\u0430\u0431\u0005\u0134\u009b\u0002\u0431\u0432\u0005\u01f6\u00fc\u0002\u0432\u0433\u0005\u0134\u009b\u0002\u0433\u0061\u0003\u0002\u0002\u0002\u0434\u0435\u0005\u0186\u00c4\u0002\u0435\u0436\u0005\u0178\u00bd\u0002\u0436\u0437\u0005\u01ec\u00f7\u0002\u0437\u0063\u0003\u0002\u0002\u0002\u0438\u0439\u0005\u0186\u00c4\u0002\u0439\u043a\u0005\u0066\u0034\u0002\u043a\u0065\u0003\u0002\u0002\u0002\u043b\u0441\u0005\u0134\u009b\u0002\u043c\u043d\u0005\u0228\u0115\u0002\u043d\u043e\u0005\u0134\u009b\u0002\u043e\u0440\u0003\u0002\u0002\u0002\u043f\u043c\u0003\u0002\u0002\u0002\u0440\u0443\u0003\u0002\u0002\u0002\u0441\u043f\u0003\u0002\u0002\u0002\u0441\u0442\u0003\u0002\u0002\u0002\u0442\u0067\u0003\u0002\u0002\u0002\u0443\u0441\u0003\u0002\u0002\u0002\u0444\u0445\u0005\u0158\u00ad\u0002\u0445\u0446\u0005\u006a\u0036\u0002\u0446\u0069\u0003\u0002\u0002\u0002\u0447\u0448\u0005\u0134\u009b\u0002\u0448\u044f\u0005\u0136\u009c\u0002\u0449\u044a\u0005\u0228\u0115\u0002\u044a\u044b\u0005\u0134\u009b\u0002\u044b\u044c\u0005\u0136\u009c\u0002\u044c\u044e\u0003\u0002\u0002\u0002\u044d\u0449\u0003\u0002\u0002\u0002\u044e\u0451\u0003\u0002\u0002\u0002\u044f\u044d\u0003\u0002\u0002\u0002\u044f\u0450\u0003\u0002\u0002\u0002\u0450\u006b\u0003\u0002\u0002\u0002\u0451\u044f\u0003\u0002\u0002\u0002\u0452\u0453\u0005\u0162\u00b2\u0002\u0453\u0454\u0005\u01e2\u00f2\u0002\u0454\u0456\u0005\u013e\u00a0\u0002\u0455\u0457\u0005\u006e\u0038\u0002\u0456\u0455\u0003\u0002\u0002\u0002\u0456\u0457\u0003\u0002\u0002\u0002\u0457\u006d\u0003\u0002\u0002\u0002\u0458\u0459\u0005\u0212\u010a\u0002\u0459\u045f\u0005\u0070\u0039\u0002\u045a\u045b\u0005\u0164\u00b3\u0002\u045b\u045c\u0005\u0070\u0039\u0002\u045c\u045e\u0003\u0002\u0002\u0002\u045d\u045a\u0003\u0002\u0002\u0002\u045e\u0461\u0003\u0002\u0002\u0002\u045f\u045d\u0003\u0002\u0002\u0002\u045f\u0460\u0003\u0002\u0002\u0002\u0460\u006f\u0003\u0002\u0002\u0002\u0461\u045f\u0003\u0002\u0002\u0002\u0462\u0463\u0005\u01d6\u00ec\u0002\u0463\u0464\u0007\u00ac\u0002\u0002\u0464\u0465\u0005\u012a\u0096\u0002\u0465\u0473\u0003\u0002\u0002\u0002\u0466\u0467\u0005\u01be\u00e0\u0002\u0467\u0468\u0007\u00ac\u0002\u0002\u0468\u0469\u0005\u012c\u0097\u0002\u0469\u0473\u0003\u0002\u0002\u0002\u046a\u046b\u0005\u01f0\u00f9\u0002\u046b\u046c\u0007\u00ac\u0002\u0002\u046c\u046d\u0005\u012c\u0097\u0002\u046d\u0473\u0003\u0002\u0002\u0002\u046e\u046f\u0005\u01d0\u00e9\u0002\u046f\u0470\u0007\u00ac\u0002\u0002\u0470\u0471\u0005\u0096\u004c\u0002\u0471\u0473\u0003\u0002\u0002\u0002\u0472\u0462\u0003\u0002\u0002\u0002\u0472\u0466\u0003\u0002\u0002\u0002\u0472\u046a\u0003\u0002\u0002\u0002\u0472\u046e\u0003\u0002\u0002\u0002\u0473\u0071\u0003\u0002\u0002\u0002\u0474\u0475\u0005\u0162\u00b2\u0002\u0475\u0476\u0005\u01c0\u00e1\u0002\u0476\u047a\u0005\u020e\u0108\u0002\u0477\u0478\u0005\u0130\u0099\u0002\u0478\u0479\u0007\u0010\u0002\u0002\u0479\u047b\u0003\u0002\u0002\u0002\u047a\u0477\u0003\u0002\u0002\u0002\u047a\u047b\u0003\u0002\u0002\u0002\u047b\u047c\u0003\u0002\u0002\u0002\u047c\u0480\u0005\u0144\u00a3\u0002\u047d\u047e\u0005\u0212\u010a\u0002\u047e\u047f\u0005\u008e\u0048\u0002\u047f\u0481\u0003\u0002\u0002\u0002\u0480\u047d\u0003\u0002\u0002\u0002\u0480\u0481\u0003\u0002\u0002\u0002\u0481\u0073\u0003\u0002\u0002\u0002\u0482\u0483\u0005\u0186\u00c4\u0002\u0483\u0485\u0005\u0206\u0104\u0002\u0484\u0486\u0005\u00f8\u007d\u0002\u0485\u0484\u0003\u0002\u0002\u0002\u0485\u0486\u0003\u0002\u0002\u0002\u0486\u0487\u0003\u0002\u0002\u0002\u0487\u0488\u0005\u014e\u00a8\u0002\u0488\u0075\u0003\u0002\u0002\u0002\u0489\u048a\u0005\u0186\u00c4\u0002\u048a\u048c\u0005\u01fe\u0100\u0002\u048b\u048d\u0005\u00f8\u007d\u0002\u048c\u048b\u0003\u0002\u0002\u0002\u048c\u048d\u0003\u0002\u0002\u0002\u048d\u0491\u0003\u0002\u0002\u0002\u048e\u048f\u0005\u0130\u0099\u0002\u048f\u0490\u0007\u0010\u0002\u0002\u0490\u0492\u0003\u0002\u0002\u0002\u0491\u048e\u0003\u0002\u0002\u0002\u0491\u0492\u0003\u0002\u0002\u0002\u0492\u0493\u0003\u0002\u0002\u0002\u0493\u0494\u0005\u0146\u00a4\u0002\u0494\u0077\u0003\u0002\u0002\u0002\u0495\u0496\u0005\u0186\u00c4\u0002\u0496\u0497\u0005\u01c0\u00e1\u0002\u0497\u0499\u0005\u020e\u0108\u0002\u0498\u049a\u0005\u00f8\u007d\u0002\u0499\u0498\u0003\u0002\u0002\u0002\u0499\u049a\u0003\u0002\u0002\u0002\u049a\u049e\u0003\u0002\u0002\u0002\u049b\u049c\u0005\u0130\u0099\u0002\u049c\u049d\u0007\u0010\u0002\u0002\u049d\u049f\u0003\u0002\u0002\u0002\u049e\u049b\u0003\u0002\u0002\u0002\u049e\u049f\u0003\u0002\u0002\u0002\u049f\u04a0\u0003\u0002\u0002\u0002\u04a0\u04a1\u0005\u0144\u00a3\u0002\u04a1\u0079\u0003\u0002\u0002\u0002\u04a2\u04a3\u0005\u0186\u00c4\u0002\u04a3\u04a5\u0005\u015a\u00ae\u0002\u04a4\u04a6\u0005\u00f8\u007d\u0002\u04a5\u04a4\u0003\u0002\u0002\u0002\u04a5\u04a6\u0003\u0002\u0002\u0002\u04a6\u04aa\u0003\u0002\u0002\u0002\u04a7\u04a8\u0005\u0130\u0099\u0002\u04a8\u04a9\u0007\u0010\u0002\u0002\u04a9\u04ab\u0003\u0002\u0002\u0002\u04aa\u04a7\u0003\u0002\u0002\u0002\u04aa\u04ab\u0003\u0002\u0002\u0002\u04ab\u04ac\u0003\u0002\u0002\u0002\u04ac\u04ad\u0005\u0148\u00a5\u0002\u04ad\u007b\u0003\u0002\u0002\u0002\u04ae\u04af\u0005\u0186\u00c4\u0002\u04af\u04b1\u0005\u0198\u00cd\u0002\u04b0\u04b2\u0005\u00f8\u007d\u0002\u04b1\u04b0\u0003\u0002\u0002\u0002\u04b1\u04b2\u0003\u0002\u0002\u0002\u04b2\u04b6\u0003\u0002\u0002\u0002\u04b3\u04b4\u0005\u0130\u0099\u0002\u04b4\u04b5\u0007\u0010\u0002\u0002\u04b5\u04b7\u0003\u0002\u0002\u0002\u04b6\u04b3\u0003\u0002\u0002\u0002\u04b6\u04b7\u0003\u0002\u0002\u0002\u04b7\u04b8\u0003\u0002\u0002\u0002\u04b8\u04b9\u0005\u014a\u00a6\u0002\u04b9\u007d\u0003\u0002\u0002\u0002\u04ba\u04bb\u0005\u0186\u00c4\u0002\u04bb\u04bd\u0005\u01f8\u00fd\u0002\u04bc\u04be\u0005\u00f8\u007d\u0002\u04bd\u04bc\u0003\u0002\u0002\u0002\u04bd\u04be\u0003\u0002\u0002\u0002\u04be\u04bf\u0003\u0002\u0002\u0002\u04bf\u04c0\u0005\u0140\u00a1\u0002\u04c0\u04c4\u0005\u01ce\u00e8\u0002\u04c1\u04c2\u0005\u0130\u0099\u0002\u04c2\u04c3\u0007\u0010\u0002\u0002\u04c3\u04c5\u0003\u0002\u0002\u0002\u04c4\u04c1\u0003\u0002\u0002\u0002\u04c4\u04c5\u0003\u0002\u0002\u0002\u04c5\u04c6\u0003\u0002\u0002\u0002\u04c6\u04c7\u0005\u0132\u009a\u0002\u04c7\u007f\u0003\u0002\u0002\u0002\u04c8\u04c9\u0005\u0186\u00c4\u0002\u04c9\u04cb\u0005\u01e2\u00f2\u0002\u04ca\u04cc\u0005\u00f8\u007d\u0002\u04cb\u04ca\u0003\u0002\u0002\u0002\u04cb\u04cc\u0003\u0002\u0002\u0002\u04cc\u04cd\u0003\u0002\u0002\u0002\u04cd\u04ce\u0005\u013e\u00a0\u0002\u04ce\u0081\u0003\u0002\u0002\u0002\u04cf\u04d0\u0005\u0186\u00c4\u0002\u04d0\u04d2\u0005\u01f2\u00fa\u0002\u04d1\u04d3\u0005\u00f8\u007d\u0002\u04d2\u04d1\u0003\u0002\u0002\u0002\u04d2\u04d3\u0003\u0002\u0002\u0002\u04d3\u04d7\u0003\u0002\u0002\u0002\u04d4\u04d5\u0005\u0130\u0099\u0002\u04d5\u04d6\u0007\u0010\u0002\u0002\u04d6\u04d8\u0003\u0002\u0002\u0002\u04d7\u04d4\u0003\u0002\u0002\u0002\u04d7\u04d8\u0003\u0002\u0002\u0002\u04d8\u04d9\u0003\u0002\u0002\u0002\u04d9\u04da\u0005\u0132\u009a\u0002\u04da\u0083\u0003\u0002\u0002\u0002\u04db\u04dc\u0005\u0186\u00c4\u0002\u04dc\u04de\u0005\u01b2\u00da\u0002\u04dd\u04df\u0005\u00f8\u007d\u0002\u04de\u04dd\u0003\u0002\u0002\u0002\u04de\u04df\u0003\u0002\u0002\u0002\u04df\u04e0\u0003\u0002\u0002\u0002\u04e0\u04e1\u0005\u0130\u0099\u0002\u04e1\u0085\u0003\u0002\u0002\u0002\u04e2\u04e3\u0005\u0186\u00c4\u0002\u04e3\u04e5\u0005\u01a2\u00d2\u0002\u04e4\u04e6\u0005\u00f8\u007d\u0002\u04e5\u04e4\u0003\u0002\u0002\u0002\u04e5\u04e6\u0003\u0002\u0002\u0002\u04e6\u04ea\u0003\u0002\u0002\u0002\u04e7\u04e8\u0005\u0130\u0099\u0002\u04e8\u04e9\u0007\u0010\u0002\u0002\u04e9\u04eb\u0003\u0002\u0002\u0002\u04ea\u04e7\u0003\u0002\u0002\u0002\u04ea\u04eb\u0003\u0002\u0002\u0002\u04eb\u04ec\u0003\u0002\u0002\u0002\u04ec\u04ed\u0005\u00ca\u0066\u0002\u04ed\u0087\u0003\u0002\u0002\u0002\u04ee\u04ef\u0005\u017c\u00bf\u0002\u04ef\u04f1\u0005\u01f2\u00fa\u0002\u04f0\u04f2\u0005\u00f6\u007c\u0002\u04f1\u04f0\u0003\u0002\u0002\u0002\u04f1\u04f2\u0003\u0002\u0002\u0002\u04f2\u04f6\u0003\u0002\u0002\u0002\u04f3\u04f4\u0005\u0130\u0099\u0002\u04f4\u04f5\u0007\u0010\u0002\u0002\u04f5\u04f7\u0003\u0002\u0002\u0002\u04f6\u04f3\u0003\u0002\u0002\u0002\u04f6\u04f7\u0003\u0002\u0002\u0002\u04f7\u04f8\u0003\u0002\u0002\u0002\u04f8\u04f9\u0005\u0132\u009a\u0002\u04f9\u04fa\u0005\u0218\u010d\u0002\u04fa\u04fb\u0005\u009e\u0050\u0002\u04fb\u04fd\u0005\u021a\u010e\u0002\u04fc\u04fe\u0005\u008a\u0046\u0002\u04fd\u04fc\u0003\u0002\u0002\u0002\u04fd\u04fe\u0003\u0002\u0002\u0002\u04fe\u0089\u0003\u0002\u0002\u0002\u04ff\u0501\u0005\u0212\u010a\u0002\u0500\u0502\u0005\u008e\u0048\u0002\u0501\u0500\u0003\u0002\u0002\u0002\u0501\u0502\u0003\u0002\u0002\u0002\u0502\u0504\u0003\u0002\u0002\u0002\u0503\u0505\u0005\u008c\u0047\u0002\u0504\u0503\u0003\u0002\u0002\u0002\u0504\u0505\u0003\u0002\u0002\u0002\u0505\u008b\u0003\u0002\u0002\u0002\u0506\u0507\u0005\u0176\u00bc\u0002\u0507\u0508\u0005\u01d4\u00eb\u0002\u0508\u0509\u0005\u0172\u00ba\u0002\u0509\u050a\u0005\u0218\u010d\u0002\u050a\u050c\u0005\u0134\u009b\u0002\u050b\u050d\u0005\u013c\u009f\u0002\u050c\u050b\u0003\u0002\u0002\u0002\u050c\u050d\u0003\u0002\u0002\u0002\u050d\u050e\u0003\u0002\u0002\u0002\u050e\u050f\u0005\u021a\u010e\u0002\u050f\u008d\u0003\u0002\u0002\u0002\u0510\u0516\u0005\u0090\u0049\u0002\u0511\u0512\u0005\u0164\u00b3\u0002\u0512\u0513\u0005\u0090\u0049\u0002\u0513\u0515\u0003\u0002\u0002\u0002\u0514\u0511\u0003\u0002\u0002\u0002\u0515\u0518\u0003\u0002\u0002\u0002\u0516\u0514\u0003\u0002\u0002\u0002\u0516\u0517\u0003\u0002\u0002\u0002\u0517\u008f\u0003\u0002\u0002\u0002\u0518\u0516\u0003\u0002\u0002\u0002\u0519\u051a\u0005\u0092\u004a\u0002\u051a\u051b\u0007\u00ac\u0002\u0002\u051b\u051c\u0005\u0094\u004b\u0002\u051c\u0522\u0003\u0002\u0002\u0002\u051d\u051e\u0005\u0092\u004a\u0002\u051e\u051f\u0007\u00ac\u0002\u0002\u051f\u0520\u0005\u0096\u004c\u0002\u0520\u0522\u0003\u0002\u0002\u0002\u0521\u0519\u0003\u0002\u0002\u0002\u0521\u051d\u0003\u0002\u0002\u0002\u0522\u0091\u0003\u0002\u0002\u0002\u0523\u0524\u0007\u00aa\u0002\u0002\u0524\u0093\u0003\u0002\u0002\u0002\u0525\u0528\u0005\u012a\u0096\u0002\u0526\u0528\u0005\u0128\u0095\u0002\u0527\u0525\u0003\u0002\u0002\u0002\u0527\u0526\u0003\u0002\u0002\u0002\u0528\u0095\u0003\u0002\u0002\u0002\u0529\u052a\u0005\u021c\u010f\u0002\u052a\u0530\u0005\u0098\u004d\u0002\u052b\u052c\u0005\u0228\u0115\u0002\u052c\u052d\u0005\u0098\u004d\u0002\u052d\u052f\u0003\u0002\u0002\u0002\u052e\u052b\u0003\u0002\u0002\u0002\u052f\u0532\u0003\u0002\u0002\u0002\u0530\u052e\u0003\u0002\u0002\u0002\u0530\u0531\u0003\u0002\u0002\u0002\u0531\u0533\u0003\u0002\u0002\u0002\u0532\u0530\u0003\u0002\u0002\u0002\u0533\u0534\u0005\u021e\u0110\u0002\u0534\u0097\u0003\u0002\u0002\u0002\u0535\u0536\u0005\u009a\u004e\u0002\u0536\u0537\u0007\u000b\u0002\u0002\u0537\u0538\u0005\u009c\u004f\u0002\u0538\u0099\u0003\u0002\u0002\u0002\u0539\u053a\u0005\u012a\u0096\u0002\u053a\u009b\u0003\u0002\u0002\u0002\u053b\u053e\u0005\u012a\u0096\u0002\u053c\u053e\u0005\u0128\u0095\u0002\u053d\u053b\u0003\u0002\u0002\u0002\u053d\u053c\u0003\u0002\u0002\u0002\u053e\u009d\u0003\u0002\u0002\u0002\u053f\u0545\u0005\u00a0\u0051\u0002\u0540\u0541\u0005\u0228\u0115\u0002\u0541\u0542\u0005\u00a0\u0051\u0002\u0542\u0544\u0003\u0002\u0002\u0002\u0543\u0540\u0003\u0002\u0002\u0002\u0544\u0547\u0003\u0002\u0002\u0002\u0545\u0543\u0003\u0002\u0002\u0002\u0545\u0546\u0003\u0002\u0002\u0002\u0546\u054b\u0003\u0002\u0002\u0002\u0547\u0545\u0003\u0002\u0002\u0002\u0548\u0549\u0005\u0228\u0115\u0002\u0549\u054a\u0005\u00a4\u0053\u0002\u054a\u054c\u0003\u0002\u0002\u0002\u054b\u0548\u0003\u0002\u0002\u0002\u054b\u054c\u0003\u0002\u0002\u0002\u054c\u009f\u0003\u0002\u0002\u0002\u054d\u054e\u0005\u0134\u009b\u0002\u054e\u0550\u0005\u0136\u009c\u0002\u054f\u0551\u0005\u00a2\u0052\u0002\u0550\u054f\u0003\u0002\u0002\u0002\u0550\u0551\u0003\u0002\u0002\u0002\u0551\u00a1\u0003\u0002\u0002\u0002\u0552\u0553\u0005\u01d8\u00ed\u0002\u0553\u0554\u0005\u01ae\u00d8\u0002\u0554\u00a3\u0003\u0002\u0002\u0002\u0555\u0556\u0005\u01d8\u00ed\u0002\u0556\u0557\u0005\u01ae\u00d8\u0002\u0557\u0558\u0005\u0218\u010d\u0002\u0558\u0559\u0005\u00a6\u0054\u0002\u0559\u055a\u0005\u021a\u010e\u0002\u055a\u00a5\u0003\u0002\u0002\u0002\u055b\u055f\u0005\u00a8\u0055\u0002\u055c\u055f\u0005\u00aa\u0056\u0002\u055d\u055f\u0005\u00ac\u0057\u0002\u055e\u055b\u0003\u0002\u0002\u0002\u055e\u055c\u0003\u0002\u0002\u0002\u055e\u055d\u0003\u0002\u0002\u0002\u055f\u00a7\u0003\u0002\u0002\u0002\u0560\u0561\u0005\u0134\u009b\u0002\u0561\u00a9\u0003\u0002\u0002\u0002\u0562\u0563\u0005\u00b2\u005a\u0002\u0563\u0564\u0005\u0228\u0115\u0002\u0564\u0565\u0005\u00b0\u0059\u0002\u0565\u00ab\u0003\u0002\u0002\u0002\u0566\u0567\u0005\u0218\u010d\u0002\u0567\u0568\u0005\u00ae\u0058\u0002\u0568\u0569\u0005\u021a\u010e\u0002\u0569\u056a\u0005\u0228\u0115\u0002\u056a\u056b\u0005\u00b0\u0059\u0002\u056b\u00ad\u0003\u0002\u0002\u0002\u056c\u0572\u0005\u00b2\u005a\u0002\u056d\u056e\u0005\u0228\u0115\u0002\u056e\u056f\u0005\u00b2\u005a\u0002\u056f\u0571\u0003\u0002\u0002\u0002\u0570\u056d\u0003\u0002\u0002\u0002\u0571\u0574\u0003\u0002\u0002\u0002\u0572\u0570\u0003\u0002\u0002\u0002\u0572\u0573\u0003\u0002\u0002\u0002\u0573\u00af\u0003\u0002\u0002\u0002\u0574\u0572\u0003\u0002\u0002\u0002\u0575\u057b\u0005\u00b4\u005b\u0002\u0576\u0577\u0005\u0228\u0115\u0002\u0577\u0578\u0005\u00b4\u005b\u0002\u0578\u057a\u0003\u0002\u0002\u0002\u0579\u0576\u0003\u0002\u0002\u0002\u057a\u057d\u0003\u0002\u0002\u0002\u057b\u0579\u0003\u0002\u0002\u0002\u057b\u057c\u0003\u0002\u0002\u0002\u057c\u00b1\u0003\u0002\u0002\u0002\u057d\u057b\u0003\u0002\u0002\u0002\u057e\u057f\u0005\u0134\u009b\u0002\u057f\u00b3\u0003\u0002\u0002\u0002\u0580\u0581\u0005\u0134\u009b\u0002\u0581\u00b5\u0003\u0002\u0002\u0002\u0582\u0583\u0005\u0166\u00b4\u0002\u0583\u0584\u0005\u016e\u00b8\u0002\u0584\u00b7\u0003\u0002\u0002\u0002\u0585\u0587\u0005\u0170\u00b9\u0002\u0586\u0588\u0005\u00ba\u005e\u0002\u0587\u0586\u0003\u0002\u0002\u0002\u0587\u0588\u0003\u0002\u0002\u0002\u0588\u0589\u0003\u0002\u0002\u0002\u0589\u058b\u0005\u016e\u00b8\u0002\u058a\u058c\u0005\u00f4\u007b\u0002\u058b\u058a\u0003\u0002\u0002\u0002\u058b\u058c\u0003\u0002\u0002\u0002\u058c\u00b9\u0003\u0002\u0002\u0002\u058d\u0590\u0005\u01bc\u00df\u0002\u058e\u0590\u0005\u0200\u0101\u0002\u058f\u058d\u0003\u0002\u0002\u0002\u058f\u058e\u0003\u0002\u0002\u0002\u0590\u00bb\u0003\u0002\u0002\u0002\u0591\u0592\u0005\u0162\u00b2\u0002\u0592\u0593\u0005\u01b2\u00da\u0002\u0593\u0594\u0005\u0130\u0099\u0002\u0594\u0595\u0005\u0212\u010a\u0002\u0595\u0596\u0005\u01de\u00f0\u0002\u0596\u0597\u0007\u00ac\u0002\u0002\u0597\u0598\u0005\u021c\u010f\u0002\u0598\u0599\u0005\u00be\u0060\u0002\u0599\u059d\u0005\u021e\u0110\u0002\u059a\u059b\u0005\u0164\u00b3\u0002\u059b\u059c\u0005\u00c2\u0062\u0002\u059c\u059e\u0003\u0002\u0002\u0002\u059d\u059a\u0003\u0002\u0002\u0002\u059d\u059e\u0003\u0002\u0002\u0002\u059e\u00bd\u0003\u0002\u0002\u0002\u059f\u05a5\u0005\u00c0\u0061\u0002\u05a0\u05a1\u0005\u0228\u0115\u0002\u05a1\u05a2\u0005\u00c0\u0061\u0002\u05a2\u05a4\u0003\u0002\u0002\u0002\u05a3\u05a0\u0003\u0002\u0002\u0002\u05a4\u05a7\u0003\u0002\u0002\u0002\u05a5\u05a3\u0003\u0002\u0002\u0002\u05a5\u05a6\u0003\u0002\u0002\u0002\u05a6\u00bf\u0003\u0002\u0002\u0002\u05a7\u05a5\u0003\u0002\u0002\u0002\u05a8\u05a9\u0007\u00a5\u0002\u0002\u05a9\u05aa\u0007\u000b\u0002\u0002\u05aa\u05af\u0007\u00a5\u0002\u0002\u05ab\u05ac\u0007\u00a5\u0002\u0002\u05ac\u05ad\u0007\u000b\u0002\u0002\u05ad\u05af\u0007\u00a6\u0002\u0002\u05ae\u05a8\u0003\u0002\u0002\u0002\u05ae\u05ab\u0003\u0002\u0002\u0002\u05af\u00c1\u0003\u0002\u0002\u0002\u05b0\u05b1\u0005\u0188\u00c5\u0002\u05b1\u05b2\u0007\u00ac\u0002\u0002\u05b2\u05b3\u0005\u012c\u0097\u0002\u05b3\u00c3\u0003\u0002\u0002\u0002\u05b4\u05b5\u0005\u0204\u0103\u0002\u05b5\u05b6\u0005\u0130\u0099\u0002\u05b6\u00c5\u0003\u0002\u0002\u0002\u05b7\u05b9\u0005\u01fa\u00fe\u0002\u05b8\u05ba\u0005\u01f2\u00fa\u0002\u05b9\u05b8\u0003\u0002\u0002\u0002\u05b9\u05ba\u0003\u0002\u0002\u0002\u05ba\u05be\u0003\u0002\u0002\u0002\u05bb\u05bc\u0005\u0130\u0099\u0002\u05bc\u05bd\u0007\u0010\u0002\u0002\u05bd\u05bf\u0003\u0002\u0002\u0002\u05be\u05bb\u0003\u0002\u0002\u0002\u05be\u05bf\u0003\u0002\u0002\u0002\u05bf\u05c0\u0003\u0002\u0002\u0002\u05c0\u05c1\u0005\u0132\u009a\u0002\u05c1\u00c7\u0003\u0002\u0002\u0002\u05c2\u05c3\u0005\u017c\u00bf\u0002\u05c3\u05c5\u0005\u01a2\u00d2\u0002\u05c4\u05c6\u0005\u00f6\u007c\u0002\u05c5\u05c4\u0003\u0002\u0002\u0002\u05c5\u05c6\u0003\u0002\u0002\u0002\u05c6\u05c8\u0003\u0002\u0002\u0002\u05c7\u05c9\u0005\u00ca\u0066\u0002\u05c8\u05c7\u0003\u0002\u0002\u0002\u05c8\u05c9\u0003\u0002\u0002\u0002\u05c9\u05ca\u0003\u0002\u0002\u0002\u05ca\u05ce\u0005\u01ce\u00e8\u0002\u05cb\u05cc\u0005\u0130\u0099\u0002\u05cc\u05cd\u0007\u0010\u0002\u0002\u05cd\u05cf\u0003\u0002\u0002\u0002\u05ce\u05cb\u0003\u0002\u0002\u0002\u05ce\u05cf\u0003\u0002\u0002\u0002\u05cf\u05d0\u0003\u0002\u0002\u0002\u05d0\u05d1\u0005\u0132\u009a\u0002\u05d1\u05d2\u0005\u0218\u010d\u0002\u05d2\u05d3\u0005\u00cc\u0067\u0002\u05d3\u05d4\u0005\u021a\u010e\u0002\u05d4\u00c9\u0003\u0002\u0002\u0002\u05d5\u05d8\u0007\u00aa\u0002\u0002\u05d6\u05d8\u0005\u012a\u0096\u0002\u05d7\u05d5\u0003\u0002\u0002\u0002\u05d7\u05d6\u0003\u0002\u0002\u0002\u05d8\u00cb\u0003\u0002\u0002\u0002\u05d9\u05de\u0005\u0134\u009b\u0002\u05da\u05de\u0005\u00ce\u0068\u0002\u05db\u05de\u0005\u00d0\u0069\u0002\u05dc\u05de\u0005\u00d2\u006a\u0002\u05dd\u05d9\u0003\u0002\u0002\u0002\u05dd\u05da\u0003\u0002\u0002\u0002\u05dd\u05db\u0003\u0002\u0002\u0002\u05dd\u05dc\u0003\u0002\u0002\u0002\u05de\u00cd\u0003\u0002\u0002\u0002\u05df\u05e0\u0005\u01b0\u00d9\u0002\u05e0\u05e1\u0005\u0218\u010d\u0002\u05e1\u05e2\u0007\u00aa\u0002\u0002\u05e2\u05e3\u0005\u021a\u010e\u0002\u05e3\u00cf\u0003\u0002\u0002\u0002\u05e4\u05e5\u0005\u018a\u00c6\u0002\u05e5\u05e6\u0005\u0218\u010d\u0002\u05e6\u05e7\u0007\u00aa\u0002\u0002\u05e7\u05e8\u0005\u021a\u010e\u0002\u05e8\u00d1\u0003\u0002\u0002\u0002\u05e9\u05ea\u0005\u0196\u00cc\u0002\u05ea\u05eb\u0005\u0218\u010d\u0002\u05eb\u05ec\u0007\u00aa\u0002\u0002\u05ec\u05ed\u0005\u021a\u010e\u0002\u05ed\u00d3\u0003\u0002\u0002\u0002\u05ee\u05f0\u0005\u00b8\u005d\u0002\u05ef\u05ee\u0003\u0002\u0002\u0002\u05ef\u05f0\u0003\u0002\u0002\u0002\u05f0\u05f1\u0003\u0002\u0002\u0002\u05f1\u05f3\u0005\u017e\u00c0\u0002\u05f2\u05f4\u0005\u00d6\u006c\u0002\u05f3\u05f2\u0003\u0002\u0002\u0002\u05f3\u05f4\u0003\u0002\u0002\u0002\u05f4\u05f5\u0003\u0002\u0002\u0002\u05f5\u05f7\u0005\u0108\u0085\u0002\u05f6\u05f8\u0005\u00f4\u007b\u0002\u05f7\u05f6\u0003\u0002\u0002\u0002\u05f7\u05f8\u0003\u0002\u0002\u0002\u05f8\u05f9\u0003\u0002\u0002\u0002\u05f9\u05fc\u0005\u0110\u0089\u0002\u05fa\u05fd\u0005\u00f8\u007d\u0002\u05fb\u05fd\u0005\u00dc\u006f\u0002\u05fc\u05fa\u0003\u0002\u0002\u0002\u05fc\u05fb\u0003\u0002\u0002\u0002\u05fc\u05fd\u0003\u0002\u0002\u0002\u05fd\u00d5\u0003\u0002\u0002\u0002\u05fe\u0604\u0005\u00d8\u006d\u0002\u05ff\u0600\u0005\u0228\u0115\u0002\u0600\u0601\u0005\u00d8\u006d\u0002\u0601\u0603\u0003\u0002\u0002\u0002\u0602\u05ff\u0003\u0002\u0002\u0002\u0603\u0606\u0003\u0002\u0002\u0002\u0604\u0602\u0003\u0002\u0002\u0002\u0604\u0605\u0003\u0002\u0002\u0002\u0605\u00d7\u0003\u0002\u0002\u0002\u0606\u0604\u0003\u0002\u0002\u0002\u0607\u0611\u0007\u00aa\u0002\u0002\u0608\u0609\u0007\u00aa\u0002\u0002\u0609\u060c\u0007\u0007\u0002\u0002\u060a\u060d\u0005\u012a\u0096\u0002\u060b\u060d\u0005\u0126\u0094\u0002\u060c\u060a\u0003\u0002\u0002\u0002\u060c\u060b\u0003\u0002\u0002\u0002\u060d\u060e\u0003\u0002\u0002\u0002\u060e\u060f\u0007\u0008\u0002\u0002\u060f\u0611\u0003\u0002\u0002\u0002\u0610\u0607\u0003\u0002\u0002\u0002\u0610\u0608\u0003\u0002\u0002\u0002\u0611\u00d9\u0003\u0002\u0002\u0002\u0612\u0614\u0005\u00b8\u005d\u0002\u0613\u0612\u0003\u0002\u0002\u0002\u0613\u0614\u0003\u0002\u0002\u0002\u0614\u0615\u0003\u0002\u0002\u0002\u0615\u0619\u0005\u0202\u0102\u0002\u0616\u0617\u0005\u0130\u0099\u0002\u0617\u0618\u0007\u0010\u0002\u0002\u0618\u061a\u0003\u0002\u0002\u0002\u0619\u0616\u0003\u0002\u0002\u0002\u0619\u061a\u0003\u0002\u0002\u0002\u061a\u061b\u0003\u0002\u0002\u0002\u061b\u061d\u0005\u0132\u009a\u0002\u061c\u061e\u0005\u00ee\u0078\u0002\u061d\u061c\u0003\u0002\u0002\u0002\u061d\u061e\u0003\u0002\u0002\u0002\u061e\u061f\u0003\u0002\u0002\u0002\u061f\u0620\u0005\u01e8\u00f5\u0002\u0620\u0621\u0005\u00e2\u0072\u0002\u0621\u0624\u0005\u0110\u0089\u0002\u0622\u0625\u0005\u00f8\u007d\u0002\u0623\u0625\u0005\u00dc\u006f\u0002\u0624\u0622\u0003\u0002\u0002\u0002\u0624\u0623\u0003\u0002\u0002\u0002\u0624\u0625\u0003\u0002\u0002\u0002\u0625\u00db\u0003\u0002\u0002\u0002\u0626\u0627\u0005\u019e\u00d0\u0002\u0627\u0628\u0005\u00de\u0070\u0002\u0628\u00dd\u0003\u0002\u0002\u0002\u0629\u062f\u0005\u00e0\u0071\u0002\u062a\u062b\u0005\u0164\u00b3\u0002\u062b\u062c\u0005\u00e0\u0071\u0002\u062c\u062e\u0003\u0002\u0002\u0002\u062d\u062a\u0003\u0002\u0002\u0002\u062e\u0631\u0003\u0002\u0002\u0002\u062f\u062d\u0003\u0002\u0002\u0002\u062f\u0630\u0003\u0002\u0002\u0002\u0630\u00df\u0003\u0002\u0002\u0002\u0631\u062f\u0003\u0002\u0002\u0002\u0632\u0633\u0007\u00aa\u0002\u0002\u0633\u0634\u0007\u00ac\u0002\u0002\u0634\u0635\u0005\u0124\u0093\u0002\u0635\u00e1\u0003\u0002\u0002\u0002\u0636\u063c\u0005\u00e4\u0073\u0002\u0637\u0638\u0005\u0228\u0115\u0002\u0638\u0639\u0005\u00e4\u0073\u0002\u0639\u063b\u0003\u0002\u0002\u0002\u063a\u0637\u0003\u0002\u0002\u0002\u063b\u063e\u0003\u0002\u0002\u0002\u063c\u063a\u0003\u0002\u0002\u0002\u063c\u063d\u0003\u0002\u0002\u0002\u063d\u00e3\u0003\u0002\u0002\u0002\u063e\u063c\u0003\u0002\u0002\u0002\u063f\u0640\u0007\u00aa\u0002\u0002\u0640\u0645\u0007\u00ac\u0002\u0002\u0641\u0646\u0005\u0124\u0093\u0002\u0642\u0646\u0005\u00e8\u0075\u0002\u0643\u0646\u0005\u00e6\u0074\u0002\u0644\u0646\u0005\u00ea\u0076\u0002\u0645\u0641\u0003\u0002\u0002\u0002\u0645\u0642\u0003\u0002\u0002\u0002\u0645\u0643\u0003\u0002\u0002\u0002\u0645\u0644\u0003\u0002\u0002\u0002\u0646\u0675\u0003\u0002\u0002\u0002\u0647\u0648\u0007\u00aa\u0002\u0002\u0648\u0649\u0007\u00ac\u0002\u0002\u0649\u064a\u0007\u00aa\u0002\u0002\u064a\u064b\u0009\u0002\u0002\u0002\u064b\u0675\u0005\u0126\u0094\u0002\u064c\u064d\u0007\u00aa\u0002\u0002\u064d\u064e\u0007\u00ac\u0002\u0002\u064e\u064f\u0007\u00aa\u0002\u0002\u064f\u0650\u0009\u0002\u0002\u0002\u0650\u0675\u0005\u00e6\u0074\u0002\u0651\u0652\u0007\u00aa\u0002\u0002\u0652\u0653\u0007\u00ac\u0002\u0002\u0653\u0654\u0005\u00e6\u0074\u0002\u0654\u0655\u0009\u0002\u0002\u0002\u0655\u0656\u0007\u00aa\u0002\u0002\u0656\u0675\u0003\u0002\u0002\u0002\u0657\u0658\u0007\u00aa\u0002\u0002\u0658\u0659\u0007\u00ac\u0002\u0002\u0659\u065a\u0007\u00aa\u0002\u0002\u065a\u065b\u0009\u0002\u0002\u0002\u065b\u0675\u0005\u00e8\u0075\u0002\u065c\u065d\u0007\u00aa\u0002\u0002\u065d\u065e\u0007\u00ac\u0002\u0002\u065e\u065f\u0005\u00e8\u0075\u0002\u065f\u0660\u0009\u0002\u0002\u0002\u0660\u0661\u0007\u00aa\u0002\u0002\u0661\u0675\u0003\u0002\u0002\u0002\u0662\u0663\u0007\u00aa\u0002\u0002\u0663\u0664\u0007\u00ac\u0002\u0002\u0664\u0665\u0007\u00aa\u0002\u0002\u0665\u0666\u0009\u0002\u0002\u0002\u0666\u0675\u0005\u00ea\u0076\u0002\u0667\u0668\u0007\u00aa\u0002\u0002\u0668\u0669\u0007\u00ac\u0002\u0002\u0669\u066a\u0005\u00ea\u0076\u0002\u066a\u066b\u0009\u0002\u0002\u0002\u066b\u066c\u0007\u00aa\u0002\u0002\u066c\u0675\u0003\u0002\u0002\u0002\u066d\u066e\u0007\u00aa\u0002\u0002\u066e\u066f\u0005\u0224\u0113\u0002\u066f\u0670\u0005\u0126\u0094\u0002\u0670\u0671\u0005\u0226\u0114\u0002\u0671\u0672\u0007\u00ac\u0002\u0002\u0672\u0673\u0005\u0124\u0093\u0002\u0673\u0675\u0003\u0002\u0002\u0002\u0674\u063f\u0003\u0002\u0002\u0002\u0674\u0647\u0003\u0002\u0002\u0002\u0674\u064c\u0003\u0002\u0002\u0002\u0674\u0651\u0003\u0002\u0002\u0002\u0674\u0657\u0003\u0002\u0002\u0002\u0674\u065c\u0003\u0002\u0002\u0002\u0674\u0662\u0003\u0002\u0002\u0002\u0674\u0667\u0003\u0002\u0002\u0002\u0674\u066d\u0003\u0002\u0002\u0002\u0675\u00e5\u0003\u0002\u0002\u0002\u0676\u0677\u0005\u021c\u010f\u0002\u0677\u067d\u0005\u0124\u0093\u0002\u0678\u0679\u0005\u0228\u0115\u0002\u0679\u067a\u0005\u0124\u0093\u0002\u067a\u067c\u0003\u0002\u0002\u0002\u067b\u0678\u0003\u0002\u0002\u0002\u067c\u067f\u0003\u0002\u0002\u0002\u067d\u067b\u0003\u0002\u0002\u0002\u067d\u067e\u0003\u0002\u0002\u0002\u067e\u0680\u0003\u0002\u0002\u0002\u067f\u067d\u0003\u0002\u0002\u0002\u0680\u0681\u0005\u021e\u0110\u0002\u0681\u00e7\u0003\u0002\u0002\u0002\u0682\u0683\u0005\u021c\u010f\u0002\u0683\u0684\u0005\u0124\u0093\u0002\u0684\u0685\u0005\u022a\u0116\u0002\u0685\u0686\u0005\u0124\u0093\u0002\u0686\u068d\u0003\u0002\u0002\u0002\u0687\u0688\u0005\u0124\u0093\u0002\u0688\u0689\u0005\u022a\u0116\u0002\u0689\u068a\u0005\u0124\u0093\u0002\u068a\u068c\u0003\u0002\u0002\u0002\u068b\u0687\u0003\u0002\u0002\u0002\u068c\u068f\u0003\u0002\u0002\u0002\u068d\u068b\u0003\u0002\u0002\u0002\u068d\u068e\u0003\u0002\u0002\u0002\u068e\u0690\u0003\u0002\u0002\u0002\u068f\u068d\u0003\u0002\u0002\u0002\u0690\u0691\u0005\u021e\u0110\u0002\u0691\u00e9\u0003\u0002\u0002\u0002\u0692\u0693\u0005\u0224\u0113\u0002\u0693\u0699\u0005\u0124\u0093\u0002\u0694\u0695\u0005\u022a\u0116\u0002\u0695\u0696\u0005\u0124\u0093\u0002\u0696\u0698\u0003\u0002\u0002\u0002\u0697\u0694\u0003\u0002\u0002\u0002\u0698\u069b\u0003\u0002\u0002\u0002\u0699\u0697\u0003\u0002\u0002\u0002\u0699\u069a\u0003\u0002\u0002\u0002\u069a\u069c\u0003\u0002\u0002\u0002\u069b\u0699\u0003\u0002\u0002\u0002\u069c\u069d\u0005\u0226\u0114\u0002\u069d\u00eb\u0003\u0002\u0002\u0002\u069e\u06a1\u0005\u00b8\u005d\u0002\u069f\u06a1\u0003\u0002\u0002\u0002\u06a0\u069e\u0003\u0002\u0002\u0002\u06a0\u069f\u0003\u0002\u0002\u0002\u06a1\u06a2\u0003\u0002\u0002\u0002\u06a2\u06a3\u0005\u01a8\u00d5\u0002\u06a3\u06a8\u0005\u01aa\u00d6\u0002\u06a4\u06a5\u0005\u0130\u0099\u0002\u06a5\u06a6\u0007\u0010\u0002\u0002\u06a6\u06a9\u0003\u0002\u0002\u0002\u06a7\u06a9\u0003\u0002\u0002\u0002\u06a8\u06a4\u0003\u0002\u0002\u0002\u06a8\u06a7\u0003\u0002\u0002\u0002\u06a9\u06aa\u0003\u0002\u0002\u0002\u06aa\u06ab\u0005\u0132\u009a\u0002\u06ab\u06ac\u0005\u00fc\u007f\u0002\u06ac\u06af\u0005\u00fa\u007e\u0002\u06ad\u06b0\u0005\u00f6\u007c\u0002\u06ae\u06b0\u0003\u0002\u0002\u0002\u06af\u06ad\u0003\u0002\u0002\u0002\u06af\u06ae\u0003\u0002\u0002\u0002\u06b0\u06b2\u0003\u0002\u0002\u0002\u06b1\u06b3\u0005\u00ee\u0078\u0002\u06b2\u06b1\u0003\u0002\u0002\u0002\u06b2\u06b3\u0003\u0002\u0002\u0002\u06b3\u00ed\u0003\u0002\u0002\u0002\u06b4\u06b5\u0005\u020a\u0106\u0002\u06b5\u06b6\u0005\u00f2\u007a\u0002\u06b6\u06c5\u0003\u0002\u0002\u0002\u06b7\u06b8\u0005\u020a\u0106\u0002\u06b8\u06b9\u0005\u00f2\u007a\u0002\u06b9\u06ba\u0005\u0164\u00b3\u0002\u06ba\u06bb\u0005\u00f0\u0079\u0002\u06bb\u06c5\u0003\u0002\u0002\u0002\u06bc\u06bd\u0005\u020a\u0106\u0002\u06bd\u06be\u0005\u00f0\u0079\u0002\u06be\u06c5\u0003\u0002\u0002\u0002\u06bf\u06c0\u0005\u020a\u0106\u0002\u06c0\u06c1\u0005\u00f0\u0079\u0002\u06c1\u06c2\u0005\u0164\u00b3\u0002\u06c2\u06c3\u0005\u00f2\u007a\u0002\u06c3\u06c5\u0003\u0002\u0002\u0002\u06c4\u06b4\u0003\u0002\u0002\u0002\u06c4\u06b7\u0003\u0002\u0002\u0002\u06c4\u06bc\u0003\u0002\u0002\u0002\u06c4\u06bf\u0003\u0002\u0002\u0002\u06c5\u00ef\u0003\u0002\u0002\u0002\u06c6\u06c7\u0005\u01f4\u00fb\u0002\u06c7\u06c8\u0005\u0126\u0094\u0002\u06c8\u00f1\u0003\u0002\u0002\u0002\u06c9\u06ca\u0005\u01fc\u00ff\u0002\u06ca\u06cb\u0005\u0126\u0094\u0002\u06cb\u00f3\u0003\u0002\u0002\u0002\u06cc\u06cd\u0005\u020a\u0106\u0002\u06cd\u06ce\u0005\u00f0\u0079\u0002\u06ce\u00f5\u0003\u0002\u0002\u0002\u06cf\u06d0\u0005\u019e\u00d0\u0002\u06d0\u06d1\u0005\u01c8\u00e5\u0002\u06d1\u06d2\u0005\u018e\u00c8\u0002\u06d2\u00f7\u0003\u0002\u0002\u0002\u06d3\u06d4\u0005\u019e\u00d0\u0002\u06d4\u06d5\u0005\u018e\u00c8\u0002\u06d5\u00f9\u0003\u0002\u0002\u0002\u06d6\u06d7\u0005\u020c\u0107\u0002\u06d7\u06d8\u0007\u0003\u0002\u0002\u06d8\u06d9\u0005\u0100\u0081\u0002\u06d9\u06da\u0007\u0004\u0002\u0002\u06da\u00fb\u0003\u0002\u0002\u0002\u06db\u06dc\u0007\u0003\u0002\u0002\u06dc\u06dd\u0005\u00fe\u0080\u0002\u06dd\u06de\u0007\u0004\u0002\u0002\u06de\u00fd\u0003\u0002\u0002\u0002\u06df\u06e5\u0005\u0134\u009b\u0002\u06e0\u06e1\u0005\u0228\u0115\u0002\u06e1\u06e2\u0005\u0134\u009b\u0002\u06e2\u06e4\u0003\u0002\u0002\u0002\u06e3\u06e0\u0003\u0002\u0002\u0002\u06e4\u06e7\u0003\u0002\u0002\u0002\u06e5\u06e3\u0003\u0002\u0002\u0002\u06e5\u06e6\u0003\u0002\u0002\u0002\u06e6\u00ff\u0003\u0002\u0002\u0002\u06e7\u06e5\u0003\u0002\u0002\u0002\u06e8\u06ed\u0005\u0124\u0093\u0002\u06e9\u06ed\u0005\u00e8\u0075\u0002\u06ea\u06ed\u0005\u00e6\u0074\u0002\u06eb\u06ed\u0005\u00ea\u0076\u0002\u06ec\u06e8\u0003\u0002\u0002\u0002\u06ec\u06e9\u0003\u0002\u0002\u0002\u06ec\u06ea\u0003\u0002\u0002\u0002\u06ec\u06eb\u0003\u0002\u0002\u0002\u06ed\u06f7\u0003\u0002\u0002\u0002\u06ee\u06f3\u0005\u0228\u0115\u0002\u06ef\u06f4\u0005\u0124\u0093\u0002\u06f0\u06f4\u0005\u00e8\u0075\u0002\u06f1\u06f4\u0005\u00e6\u0074\u0002\u06f2\u06f4\u0005\u00ea\u0076\u0002\u06f3\u06ef\u0003\u0002\u0002\u0002\u06f3\u06f0\u0003\u0002\u0002\u0002\u06f3\u06f1\u0003\u0002\u0002\u0002\u06f3\u06f2\u0003\u0002\u0002\u0002\u06f4\u06f6\u0003\u0002\u0002\u0002\u06f5\u06ee\u0003\u0002\u0002\u0002\u06f6\u06f9\u0003\u0002\u0002\u0002\u06f7\u06f5\u0003\u0002\u0002\u0002\u06f7\u06f8\u0003\u0002\u0002\u0002\u06f8\u0101\u0003\u0002\u0002\u0002\u06f9\u06f7\u0003\u0002\u0002\u0002\u06fa\u06fd\u0005\u01e6\u00f4\u0002\u06fb\u06fe\u0005\u0112\u008a\u0002\u06fc\u06fe\u0003\u0002\u0002\u0002\u06fd\u06fb\u0003\u0002\u0002\u0002\u06fd\u06fc\u0003\u0002\u0002\u0002\u06fe\u06ff\u0003\u0002\u0002\u0002\u06ff\u0700\u0005\u0114\u008b\u0002\u0700\u0702\u0005\u0108\u0085\u0002\u0701\u0703\u0005\u0110\u0089\u0002\u0702\u0701\u0003\u0002\u0002\u0002\u0702\u0703\u0003\u0002\u0002\u0002\u0703\u0705\u0003\u0002\u0002\u0002\u0704\u0706\u0005\u010c\u0087\u0002\u0705\u0704\u0003\u0002\u0002\u0002\u0705\u0706\u0003\u0002\u0002\u0002\u0706\u0708\u0003\u0002\u0002\u0002\u0707\u0709\u0005\u0106\u0084\u0002\u0708\u0707\u0003\u0002\u0002\u0002\u0708\u0709\u0003\u0002\u0002\u0002\u0709\u070b\u0003\u0002\u0002\u0002\u070a\u070c\u0005\u0104\u0083\u0002\u070b\u070a\u0003\u0002\u0002\u0002\u070b\u070c\u0003\u0002\u0002\u0002\u070c\u0103\u0003\u0002\u0002\u0002\u070d\u070e\u0005\u0160\u00b1\u0002\u070e\u070f\u0005\u0190\u00c9\u0002\u070f\u0105\u0003\u0002\u0002\u0002\u0710\u0711\u0005\u01b8\u00dd\u0002\u0711\u0712\u0005\u0126\u0094\u0002\u0712\u0107\u0003\u0002\u0002\u0002\u0713\u0714\u0005\u0194\u00cb\u0002\u0714\u0715\u0005\u010a\u0086\u0002\u0715\u0109\u0003\u0002\u0002\u0002\u0716\u071b\u0007\u00aa\u0002\u0002\u0717\u0718\u0007\u00aa\u0002\u0002\u0718\u0719\u0007\u0010\u0002\u0002\u0719\u071b\u0007\u00aa\u0002\u0002\u071a\u0716\u0003\u0002\u0002\u0002\u071a\u0717\u0003\u0002\u0002\u0002\u071b\u010b\u0003\u0002\u0002\u0002\u071c\u071d\u0005\u01d4\u00eb\u0002\u071d\u071e\u0005\u0172\u00ba\u0002\u071e\u071f\u0005\u010e\u0088\u0002\u071f\u010d\u0003\u0002\u0002\u0002\u0720\u0723\u0007\u00aa\u0002\u0002\u0721\u0724\u0005\u016a\u00b6\u0002\u0722\u0724\u0005\u0180\u00c1\u0002\u0723\u0721\u0003\u0002\u0002\u0002\u0723\u0722\u0003\u0002\u0002\u0002\u0723\u0724\u0003\u0002\u0002\u0002\u0724\u010f\u0003\u0002\u0002\u0002\u0725\u0726\u0005\u0210\u0109\u0002\u0726\u0727\u0005\u0118\u008d\u0002\u0727\u0111\u0003\u0002\u0002\u0002\u0728\u0729\u0005\u0184\u00c3\u0002\u0729\u0113\u0003\u0002\u0002\u0002\u072a\u072d\u0007\u0011\u0002\u0002\u072b\u072d\u0005\u0116\u008c\u0002\u072c\u072a\u0003\u0002\u0002\u0002\u072c\u072b\u0003\u0002\u0002\u0002\u072d\u0733\u0003\u0002\u0002\u0002\u072e\u072f\u0005\u0228\u0115\u0002\u072f\u0730\u0005\u0116\u008c\u0002\u0730\u0732\u0003\u0002\u0002\u0002\u0731\u072e\u0003\u0002\u0002\u0002\u0732\u0735\u0003\u0002\u0002\u0002\u0733\u0731\u0003\u0002\u0002\u0002\u0733\u0734\u0003\u0002\u0002\u0002\u0734\u0115\u0003\u0002\u0002\u0002\u0735\u0733\u0003\u0002\u0002\u0002\u0736\u0737\u0007\u00aa\u0002\u0002\u0737\u0738\u0007\u0010\u0002\u0002\u0738\u0746\u0007\u0011\u0002\u0002\u0739\u073d\u0007\u00aa\u0002\u0002\u073a\u073b\u0005\u0168\u00b5\u0002\u073b\u073c\u0007\u00aa\u0002\u0002\u073c\u073e\u0003\u0002\u0002\u0002\u073d\u073a\u0003\u0002\u0002\u0002\u073d\u073e\u0003\u0002\u0002\u0002\u073e\u0746\u0003\u0002\u0002\u0002\u073f\u0743\u0005\u0120\u0091\u0002\u0740\u0741\u0005\u0168\u00b5\u0002\u0741\u0742\u0007\u00aa\u0002\u0002\u0742\u0744\u0003\u0002\u0002\u0002\u0743\u0740\u0003\u0002\u0002\u0002\u0743\u0744\u0003\u0002\u0002\u0002\u0744\u0746\u0003\u0002\u0002\u0002\u0745\u0736\u0003\u0002\u0002\u0002\u0745\u0739\u0003\u0002\u0002\u0002\u0745\u073f\u0003\u0002\u0002\u0002\u0746\u0117\u0003\u0002\u0002\u0002\u0747\u074d\u0005\u011a\u008e\u0002\u0748\u0749\u0005\u0164\u00b3\u0002\u0749\u074a\u0005\u011a\u008e\u0002\u074a\u074c\u0003\u0002\u0002\u0002\u074b\u0748\u0003\u0002\u0002\u0002\u074c\u074f\u0003\u0002\u0002\u0002\u074d\u074b\u0003\u0002\u0002\u0002\u074d\u074e\u0003\u0002\u0002\u0002\u074e\u0119\u0003\u0002\u0002\u0002\u074f\u074d\u0003\u0002\u0002\u0002\u0750\u0751\u0007\u00aa\u0002\u0002\u0751\u0752\u0009\u0003\u0002\u0002\u0752\u076b\u0005\u0124\u0093\u0002\u0753\u0754\u0007\u00aa\u0002\u0002\u0754\u0755\u0007\u0010\u0002\u0002\u0755\u0756\u0007\u00aa\u0002\u0002\u0756\u0757\u0009\u0003\u0002\u0002\u0757\u076b\u0005\u0124\u0093\u0002\u0758\u0759\u0005\u0120\u0091\u0002\u0759\u075a\u0009\u0003\u0002\u0002\u075a\u075b\u0005\u0124\u0093\u0002\u075b\u076b\u0003\u0002\u0002\u0002\u075c\u075d\u0005\u0120\u0091\u0002\u075d\u075e\u0009\u0003\u0002\u0002\u075e\u075f\u0005\u0120\u0091\u0002\u075f\u076b\u0003\u0002\u0002\u0002\u0760\u0761\u0007\u00aa\u0002\u0002\u0761\u0762\u0005\u01a0\u00d1\u0002\u0762\u0764\u0007\u0003\u0002\u0002\u0763\u0765\u0005\u0122\u0092\u0002\u0764\u0763\u0003\u0002\u0002\u0002\u0764\u0765\u0003\u0002\u0002\u0002\u0765\u0766\u0003\u0002\u0002\u0002\u0766\u0767\u0007\u0004\u0002\u0002\u0767\u076b\u0003\u0002\u0002\u0002\u0768\u076b\u0005\u011e\u0090\u0002\u0769\u076b\u0005\u011c\u008f\u0002\u076a\u0750\u0003\u0002\u0002\u0002\u076a\u0753\u0003\u0002\u0002\u0002\u076a\u0758\u0003\u0002\u0002\u0002\u076a\u075c\u0003\u0002\u0002\u0002\u076a\u0760\u0003\u0002\u0002\u0002\u076a\u0768\u0003\u0002\u0002\u0002\u076a\u0769\u0003\u0002\u0002\u0002\u076b\u011b\u0003\u0002\u0002\u0002\u076c\u076d\u0007\u00aa\u0002\u0002\u076d\u076e\u0005\u017a\u00be\u0002\u076e\u076f\u0005\u0124\u0093\u0002\u076f\u011d\u0003\u0002\u0002\u0002\u0770\u0771\u0007\u00aa\u0002\u0002\u0771\u0772\u0005\u017a\u00be\u0002\u0772\u0773\u0005\u01ae\u00d8\u0002\u0773\u0774\u0003\u0002\u0002\u0002\u0774\u0775\u0005\u0124\u0093\u0002\u0775\u011f\u0003\u0002\u0002\u0002\u0776\u0777\u0007\u00aa\u0002\u0002\u0777\u0778\u0007\u0003\u0002\u0002\u0778\u0779\u0007\u0011\u0002\u0002\u0779\u0781\u0007\u0004\u0002\u0002\u077a\u077b\u0007\u00aa\u0002\u0002\u077b\u077d\u0007\u0003\u0002\u0002\u077c\u077e\u0005\u0122\u0092\u0002\u077d\u077c\u0003\u0002\u0002\u0002\u077d\u077e\u0003\u0002\u0002\u0002\u077e\u077f\u0003\u0002\u0002\u0002\u077f\u0781\u0007\u0004\u0002\u0002\u0780\u0776\u0003\u0002\u0002\u0002\u0780\u077a\u0003\u0002\u0002\u0002\u0781\u0121\u0003\u0002\u0002\u0002\u0782\u0786\u0005\u0124\u0093\u0002\u0783\u0786\u0007\u00aa\u0002\u0002\u0784\u0786\u0005\u0120\u0091\u0002\u0785\u0782\u0003\u0002\u0002\u0002\u0785\u0783\u0003\u0002\u0002\u0002\u0785\u0784\u0003\u0002\u0002\u0002\u0786\u078f\u0003\u0002\u0002\u0002\u0787\u078b\u0005\u0228\u0115\u0002\u0788\u078c\u0005\u0124\u0093\u0002\u0789\u078c\u0007\u00aa\u0002\u0002\u078a\u078c\u0005\u0120\u0091\u0002\u078b\u0788\u0003\u0002\u0002\u0002\u078b\u0789\u0003\u0002\u0002\u0002\u078b\u078a\u0003\u0002\u0002\u0002\u078c\u078e\u0003\u0002\u0002\u0002\u078d\u0787\u0003\u0002\u0002\u0002\u078e\u0791\u0003\u0002\u0002\u0002\u078f\u078d\u0003\u0002\u0002\u0002\u078f\u0790\u0003\u0002\u0002\u0002\u0790\u0123\u0003\u0002\u0002\u0002\u0791\u078f\u0003\u0002\u0002\u0002\u0792\u0799\u0007\u00ab\u0002\u0002\u0793\u0799\u0005\u012a\u0096\u0002\u0794\u0799\u0005\u0126\u0094\u0002\u0795\u0799\u0005\u012e\u0098\u0002\u0796\u0799\u0005\u012c\u0097\u0002\u0797\u0799\u0005\u01ca\u00e6\u0002\u0798\u0792\u0003\u0002\u0002\u0002\u0798\u0793\u0003\u0002\u0002\u0002\u0798\u0794\u0003\u0002\u0002\u0002\u0798\u0795\u0003\u0002\u0002\u0002\u0798\u0796\u0003\u0002\u0002\u0002\u0798\u0797\u0003\u0002\u0002\u0002\u0799\u0125\u0003\u0002\u0002\u0002\u079a\u079b\u0007\u00a6\u0002\u0002\u079b\u0127\u0003\u0002\u0002\u0002\u079c\u079d\u0009\u0004\u0002\u0002\u079d\u0129\u0003\u0002\u0002\u0002\u079e\u079f\u0007\u00a5\u0002\u0002\u079f\u012b\u0003\u0002\u0002\u0002\u07a0\u07a1\u0009\u0005\u0002\u0002\u07a1\u012d\u0003\u0002\u0002\u0002\u07a2\u07a3\u0007\u00a8\u0002\u0002\u07a3\u012f\u0003\u0002\u0002\u0002\u07a4\u07a9\u0007\u00aa\u0002\u0002\u07a5\u07a6\u0007\u0017\u0002\u0002\u07a6\u07a7\u0007\u00aa\u0002\u0002\u07a7\u07a9\u0007\u0017\u0002\u0002\u07a8\u07a4\u0003\u0002\u0002\u0002\u07a8\u07a5\u0003\u0002\u0002\u0002\u07a9\u0131\u0003\u0002\u0002\u0002\u07aa\u07af\u0007\u00aa\u0002\u0002\u07ab\u07ac\u0007\u0017\u0002\u0002\u07ac\u07ad\u0007\u00aa\u0002\u0002\u07ad\u07af\u0007\u0017\u0002\u0002\u07ae\u07aa\u0003\u0002\u0002\u0002\u07ae\u07ab\u0003\u0002\u0002\u0002\u07af\u0133\u0003\u0002\u0002\u0002\u07b0\u07b5\u0007\u00aa\u0002\u0002\u07b1\u07b2\u0007\u0017\u0002\u0002\u07b2\u07b3\u0007\u00aa\u0002\u0002\u07b3\u07b5\u0007\u0017\u0002\u0002\u07b4\u07b0\u0003\u0002\u0002\u0002\u07b4\u07b1\u0003\u0002\u0002\u0002\u07b5\u0135\u0003\u0002\u0002\u0002\u07b6\u07b8\u0005\u0138\u009d\u0002\u07b7\u07b9\u0005\u013a\u009e\u0002\u07b8\u07b7\u0003\u0002\u0002\u0002\u07b8\u07b9\u0003\u0002\u0002\u0002\u07b9\u0137\u0003\u0002\u0002\u0002\u07ba\u07bb\u0009\u0006\u0002\u0002\u07bb\u0139\u0003\u0002\u0002\u0002\u07bc\u07bd\u0005\u0220\u0111\u0002\u07bd\u07c3\u0005\u0138\u009d\u0002\u07be\u07bf\u0005\u0228\u0115\u0002\u07bf\u07c0\u0005\u0138\u009d\u0002\u07c0\u07c2\u0003\u0002\u0002\u0002\u07c1\u07be\u0003\u0002\u0002\u0002\u07c2\u07c5\u0003\u0002\u0002\u0002\u07c3\u07c1\u0003\u0002\u0002\u0002\u07c3\u07c4\u0003\u0002\u0002\u0002\u07c4\u07c6\u0003\u0002\u0002\u0002\u07c5\u07c3\u0003\u0002\u0002\u0002\u07c6\u07c7\u0005\u0222\u0112\u0002\u07c7\u013b\u0003\u0002\u0002\u0002\u07c8\u07cb\u0005\u016a\u00b6\u0002\u07c9\u07cb\u0005\u0180\u00c1\u0002\u07ca\u07c8\u0003\u0002\u0002\u0002\u07ca\u07c9\u0003\u0002\u0002\u0002\u07cb\u013d\u0003\u0002\u0002\u0002\u07cc\u07cd\u0007\u00aa\u0002\u0002\u07cd\u013f\u0003\u0002\u0002\u0002\u07ce\u07cf\u0007\u00aa\u0002\u0002\u07cf\u0141\u0003\u0002\u0002\u0002\u07d0\u07d1\u0005\u012a\u0096\u0002\u07d1\u0143\u0003\u0002\u0002\u0002\u07d2\u07d3\u0007\u00aa\u0002\u0002\u07d3\u0145\u0003\u0002\u0002\u0002\u07d4\u07d5\u0007\u00aa\u0002\u0002\u07d5\u0147\u0003\u0002\u0002\u0002\u07d6\u07d7\u0007\u00aa\u0002\u0002\u07d7\u0149\u0003\u0002\u0002\u0002\u07d8\u07d9\u0007\u00aa\u0002\u0002\u07d9\u014b\u0003\u0002\u0002\u0002\u07da\u07db\u0007\u00aa\u0002\u0002\u07db\u014d\u0003\u0002\u0002\u0002\u07dc\u07dd\u0007\u00aa\u0002\u0002\u07dd\u014f\u0003\u0002\u0002\u0002\u07de\u07df\u0005\u012a\u0096\u0002\u07df\u0151\u0003\u0002\u0002\u0002\u07e0\u07e1\u0007\u00aa\u0002\u0002\u07e1\u0153\u0003\u0002\u0002\u0002\u07e2\u07e3\u0005\u0156\u00ac\u0002\u07e3\u07e4\u0005\u0136\u009c\u0002\u07e4\u0155\u0003\u0002\u0002\u0002\u07e5\u07e6\u0007\u00aa\u0002\u0002\u07e6\u0157\u0003\u0002\u0002\u0002\u07e7\u07e8\u0007\u0019\u0002\u0002\u07e8\u0159\u0003\u0002\u0002\u0002\u07e9\u07ea\u0007\u001a\u0002\u0002\u07ea\u015b\u0003\u0002\u0002\u0002\u07eb\u07ec\u0007\u001b\u0002\u0002\u07ec\u015d\u0003\u0002\u0002\u0002\u07ed\u07ee\u0007\u001b\u0002\u0002\u07ee\u07ef\u0007\u0066\u0002\u0002\u07ef\u015f\u0003\u0002\u0002\u0002\u07f0\u07f1\u0007\u001c\u0002\u0002\u07f1\u0161\u0003\u0002\u0002\u0002\u07f2\u07f3\u0007\u001d\u0002\u0002\u07f3\u0163\u0003\u0002\u0002\u0002\u07f4\u07f5\u0007\u001e\u0002\u0002\u07f5\u0165\u0003\u0002\u0002\u0002\u07f6\u07f7\u0007\u0020\u0002\u0002\u07f7\u0167\u0003\u0002\u0002\u0002\u07f8\u07f9\u0007\u0021\u0002\u0002\u07f9\u0169\u0003\u0002\u0002\u0002\u07fa\u07fb\u0007\u0022\u0002\u0002\u07fb\u016b\u0003\u0002\u0002\u0002\u07fc\u07fd\u0007\u0023\u0002\u0002\u07fd\u016d\u0003\u0002\u0002\u0002\u07fe\u07ff\u0007\u0024\u0002\u0002\u07ff\u016f\u0003\u0002\u0002\u0002\u0800\u0801\u0007\u0025\u0002\u0002\u0801\u0171\u0003\u0002\u0002\u0002\u0802\u0803\u0007\u0026\u0002\u0002\u0803\u0173\u0003\u0002\u0002\u0002\u0804\u0805\u0007\u0027\u0002\u0002\u0805\u0175\u0003\u0002\u0002\u0002\u0806\u0807\u0007\u0028\u0002\u0002\u0807\u0177\u0003\u0002\u0002\u0002\u0808\u0809\u0007\u002a\u0002\u0002\u0809\u0179\u0003\u0002\u0002\u0002\u080a\u080b\u0007\u002c\u0002\u0002\u080b\u017b\u0003\u0002\u0002\u0002\u080c\u080d\u0007\u002d\u0002\u0002\u080d\u017d\u0003\u0002\u0002\u0002\u080e\u080f\u0007\u002f\u0002\u0002\u080f\u017f\u0003\u0002\u0002\u0002\u0810\u0811\u0007\u0030\u0002\u0002\u0811\u0181\u0003\u0002\u0002\u0002\u0812\u0813\u0007\u0031\u0002\u0002\u0813\u0183\u0003\u0002\u0002\u0002\u0814\u0815\u0007\u0032\u0002\u0002\u0815\u0185\u0003\u0002\u0002\u0002\u0816\u0817\u0007\u0033\u0002\u0002\u0817\u0187\u0003\u0002\u0002\u0002\u0818\u0819\u0007\u0034\u0002\u0002\u0819\u0189\u0003\u0002\u0002\u0002\u081a\u081b\u0007\u0036\u0002\u0002\u081b\u018b\u0003\u0002\u0002\u0002\u081c\u081d\u0007\u0037\u0002\u0002\u081d\u018d\u0003\u0002\u0002\u0002\u081e\u081f\u0007\u0038\u0002\u0002\u081f\u018f\u0003\u0002\u0002\u0002\u0820\u0821\u0007\u003a\u0002\u0002\u0821\u0191\u0003\u0002\u0002\u0002\u0822\u0823\u0007\u003b\u0002\u0002\u0823\u0193\u0003\u0002\u0002\u0002\u0824\u0825\u0007\u003c\u0002\u0002\u0825\u0195\u0003\u0002\u0002\u0002\u0826\u0827\u0007\u003d\u0002\u0002\u0827\u0197\u0003\u0002\u0002\u0002\u0828\u0829\u0007\u003e\u0002\u0002\u0829\u0199\u0003\u0002\u0002\u0002\u082a\u082b\u0007\u003f\u0002\u0002\u082b\u019b\u0003\u0002\u0002\u0002\u082c\u082d\u0007\u0040\u0002\u0002\u082d\u019d\u0003\u0002\u0002\u0002\u082e\u082f\u0007\u0041\u0002\u0002\u082f\u019f\u0003\u0002\u0002\u0002\u0830\u0831\u0007\u0042\u0002\u0002\u0831\u01a1\u0003\u0002\u0002\u0002\u0832\u0833\u0007\u0043\u0002\u0002\u0833\u01a3\u0003\u0002\u0002\u0002\u0834\u0835\u0007\u0045\u0002\u0002\u0835\u01a5\u0003\u0002\u0002\u0002\u0836\u0837\u0007\u0046\u0002\u0002\u0837\u01a7\u0003\u0002\u0002\u0002\u0838\u0839\u0007\u0047\u0002\u0002\u0839\u01a9\u0003\u0002\u0002\u0002\u083a\u083b\u0007\u0048\u0002\u0002\u083b\u01ab\u0003\u0002\u0002\u0002\u083c\u083d\u0007\u0049\u0002\u0002\u083d\u01ad\u0003\u0002\u0002\u0002\u083e\u083f\u0007\u004a\u0002\u0002\u083f\u01af\u0003\u0002\u0002\u0002\u0840\u0841\u0007\u004b\u0002\u0002\u0841\u01b1\u0003\u0002\u0002\u0002\u0842\u0843\u0007\u004c\u0002\u0002\u0843\u01b3\u0003\u0002\u0002\u0002\u0844\u0845\u0007\u004d\u0002\u0002\u0845\u01b5\u0003\u0002\u0002\u0002\u0846\u0847\u0007\u004e\u0002\u0002\u0847\u01b7\u0003\u0002\u0002\u0002\u0848\u0849\u0007\u0050\u0002\u0002\u0849\u01b9\u0003\u0002\u0002\u0002\u084a\u084b\u0007\u009a\u0002\u0002\u084b\u01bb\u0003\u0002\u0002\u0002\u084c\u084d\u0007\u0053\u0002\u0002\u084d\u01bd\u0003\u0002\u0002\u0002\u084e\u084f\u0007\u0054\u0002\u0002\u084f\u01bf\u0003\u0002\u0002\u0002\u0850\u0851\u0007\u0055\u0002\u0002\u0851\u01c1\u0003\u0002\u0002\u0002\u0852\u0853\u0007\u0056\u0002\u0002\u0853\u01c3\u0003\u0002\u0002\u0002\u0854\u0855\u0007\u0059\u0002\u0002\u0855\u01c5\u0003\u0002\u0002\u0002\u0856\u0857\u0007\u0058\u0002\u0002\u0857\u01c7\u0003\u0002\u0002\u0002\u0858\u0859\u0007\u005a\u0002\u0002\u0859\u01c9\u0003\u0002\u0002\u0002\u085a\u085b\u0007\u005b\u0002\u0002\u085b\u01cb\u0003\u0002\u0002\u0002\u085c\u085d\u0007\u005c\u0002\u0002\u085d\u01cd\u0003\u0002\u0002\u0002\u085e\u085f\u0007\u005d\u0002\u0002\u085f\u01cf\u0003\u0002\u0002\u0002\u0860\u0861\u0007\u005f\u0002\u0002\u0861\u01d1\u0003\u0002\u0002\u0002\u0862\u0863\u0007\u0060\u0002\u0002\u0863\u01d3\u0003\u0002\u0002\u0002\u0864\u0865\u0007\u0061\u0002\u0002\u0865\u01d5\u0003\u0002\u0002\u0002\u0866\u0867\u0007\u0063\u0002\u0002\u0867\u01d7\u0003\u0002\u0002\u0002\u0868\u0869\u0007\u0067\u0002\u0002\u0869\u01d9\u0003\u0002\u0002\u0002\u086a\u086b\u0007\u0069\u0002\u0002\u086b\u01db\u0003\u0002\u0002\u0002\u086c\u086d\u0007\u006a\u0002\u0002\u086d\u01dd\u0003\u0002\u0002\u0002\u086e\u086f\u0007\u006b\u0002\u0002\u086f\u01df\u0003\u0002\u0002\u0002\u0870\u0871\u0007\u006c\u0002\u0002\u0871\u01e1\u0003\u0002\u0002\u0002\u0872\u0873\u0007\u006e\u0002\u0002\u0873\u01e3\u0003\u0002\u0002\u0002\u0874\u0875\u0007\u006f\u0002\u0002\u0875\u01e5\u0003\u0002\u0002\u0002\u0876\u0877\u0007\u0071\u0002\u0002\u0877\u01e7\u0003\u0002\u0002\u0002\u0878\u0879\u0007\u0072\u0002\u0002\u0879\u01e9\u0003\u0002\u0002\u0002\u087a\u087b\u0007\u0073\u0002\u0002\u087b\u01eb\u0003\u0002\u0002\u0002\u087c\u087d\u0007\u0075\u0002\u0002\u087d\u01ed\u0003\u0002\u0002\u0002\u087e\u087f\u0007\u0076\u0002\u0002\u087f\u01ef\u0003\u0002\u0002\u0002\u0880\u0881\u0007\u0077\u0002\u0002\u0881\u01f1\u0003\u0002\u0002\u0002\u0882\u0883\u0007\u0078\u0002\u0002\u0883\u01f3\u0003\u0002\u0002\u0002\u0884\u0885\u0007\u007a\u0002\u0002\u0885\u01f5\u0003\u0002\u0002\u0002\u0886\u0887\u0007\u007b\u0002\u0002\u0887\u01f7\u0003\u0002\u0002\u0002\u0888\u0889\u0007\u007d\u0002\u0002\u0889\u01f9\u0003\u0002\u0002\u0002\u088a\u088b\u0007\u007f\u0002\u0002\u088b\u01fb\u0003\u0002\u0002\u0002\u088c\u088d\u0007\u0080\u0002\u0002\u088d\u01fd\u0003\u0002\u0002\u0002\u088e\u088f\u0007\u0082\u0002\u0002\u088f\u01ff\u0003\u0002\u0002\u0002\u0890\u0891\u0007\u0083\u0002\u0002\u0891\u0201\u0003\u0002\u0002\u0002\u0892\u0893\u0007\u0084\u0002\u0002\u0893\u0203\u0003\u0002\u0002\u0002\u0894\u0895\u0007\u0085\u0002\u0002\u0895\u0205\u0003\u0002\u0002\u0002\u0896\u0897\u0007\u0086\u0002\u0002\u0897\u0207\u0003\u0002\u0002\u0002\u0898\u0899\u0007\u00b1\u0002\u0002\u0899\u0209\u0003\u0002\u0002\u0002\u089a\u089b\u0007\u0087\u0002\u0002\u089b\u020b\u0003\u0002\u0002\u0002\u089c\u089d\u0007\u0089\u0002\u0002\u089d\u020d\u0003\u0002\u0002\u0002\u089e\u089f\u0007\u008a\u0002\u0002\u089f\u020f\u0003\u0002\u0002\u0002\u08a0\u08a1\u0007\u008b\u0002\u0002\u08a1\u0211\u0003\u0002\u0002\u0002\u08a2\u08a3\u0007\u008c\u0002\u0002\u08a3\u0213\u0003\u0002\u0002\u0002\u08a4\u08a5\u0007\u006d\u0002\u0002\u08a5\u0215\u0003\u0002\u0002\u0002\u08a6\u08a7\u0007\u0002\u0002\u0003\u08a7\u0217\u0003\u0002\u0002\u0002\u08a8\u08a9\u0007\u0003\u0002\u0002\u08a9\u0219\u0003\u0002\u0002\u0002\u08aa\u08ab\u0007\u0004\u0002\u0002\u08ab\u021b\u0003\u0002\u0002\u0002\u08ac\u08ad\u0007\u0005\u0002\u0002\u08ad\u021d\u0003\u0002\u0002\u0002\u08ae\u08af\u0007\u0006\u0002\u0002\u08af\u021f\u0003\u0002\u0002\u0002\u08b0\u08b1\u0007\u00ad\u0002\u0002\u08b1\u0221\u0003\u0002\u0002\u0002\u08b2\u08b3\u0007\u00ae\u0002\u0002\u08b3\u0223\u0003\u0002\u0002\u0002\u08b4\u08b5\u0007\u0007\u0002\u0002\u08b5\u0225\u0003\u0002\u0002\u0002\u08b6\u08b7\u0007\u0008\u0002\u0002\u08b7\u0227\u0003\u0002\u0002\u0002\u08b8\u08b9\u0007\u0009\u0002\u0002\u08b9\u0229\u0003\u0002\u0002\u0002\u08ba\u08bb\u0007\u000b\u0002\u0002\u08bb\u022b\u0003\u0002\u0002\u0002\u00a9\u022d\u0230\u0236\u023b\u023d\u0242\u0245\u0248\u0273\u0284\u0287\u028e\u0293\u029e\u02a8\u02b7\u02c2\u02c7\u02d0\u02d5\u02dd\u02e2\u02e6\u02eb\u02f0\u02ff\u0305\u030a\u0314\u0319\u0323\u032f\u0336\u033e\u034c\u0351\u035d\u0361\u0365\u036a\u036f\u0382\u0389\u0391\u0395\u039a\u03ad\u03b6\u03c5\u03c7\u03d3\u03e1\u03e8\u03ef\u03f7\u0402\u0412\u041f\u042a\u0441\u044f\u0456\u045f\u0472\u047a\u0480\u0485\u048c\u0491\u0499\u049e\u04a5\u04aa\u04b1\u04b6\u04bd\u04c4\u04cb\u04d2\u04d7\u04de\u04e5\u04ea\u04f1\u04f6\u04fd\u0501\u0504\u050c\u0516\u0521\u0527\u0530\u053d\u0545\u054b\u0550\u055e\u0572\u057b\u0587\u058b\u058f\u059d\u05a5\u05ae\u05b9\u05be\u05c5\u05c8\u05ce\u05d7\u05dd\u05ef\u05f3\u05f7\u05fc\u0604\u060c\u0610\u0613\u0619\u061d\u0624\u062f\u063c\u0645\u0674\u067d\u068d\u0699\u06a0\u06a8\u06af\u06b2\u06c4\u06e5\u06ec\u06f3\u06f7\u06fd\u0702\u0705\u0708\u070b\u071a\u0723\u072c\u0733\u073d\u0743\u0745\u074d\u0764\u076a\u077d\u0780\u0785\u078b\u078f\u0798\u07a8\u07ae\u07b4\u07b8\u07c3\u07ca"

        val ATN = ATNDeserializer().deserialize(serializedATN.asCharArray())
        init {
        	decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
        		DFA(ATN.getDecisionState(it)!!, it)
        	})


        }
	}

    private val LR_BRACKET = Tokens.LR_BRACKET.id
    private val RR_BRACKET = Tokens.RR_BRACKET.id
    private val LC_BRACKET = Tokens.LC_BRACKET.id
    private val RC_BRACKET = Tokens.RC_BRACKET.id
    private val LS_BRACKET = Tokens.LS_BRACKET.id
    private val RS_BRACKET = Tokens.RS_BRACKET.id
    private val COMMA = Tokens.COMMA.id
    private val SEMI = Tokens.SEMI.id
    private val COLON = Tokens.COLON.id
    private val SPACE = Tokens.SPACE.id
    private val SPEC_MYSQL_COMMENT = Tokens.SPEC_MYSQL_COMMENT.id
    private val COMMENT_INPUT = Tokens.COMMENT_INPUT.id
    private val LINE_COMMENT = Tokens.LINE_COMMENT.id
    private val DOT = Tokens.DOT.id
    private val STAR = Tokens.STAR.id
    private val DIVIDE = Tokens.DIVIDE.id
    private val MODULE = Tokens.MODULE.id
    private val PLUS = Tokens.PLUS.id
    private val MINUSMINUS = Tokens.MINUSMINUS.id
    private val MINUS = Tokens.MINUS.id
    private val DQUOTE = Tokens.DQUOTE.id
    private val SQUOTE = Tokens.SQUOTE.id
    private val K_ADD = Tokens.K_ADD.id
    private val K_AGGREGATE = Tokens.K_AGGREGATE.id
    private val K_ALL = Tokens.K_ALL.id
    private val K_ALLOW = Tokens.K_ALLOW.id
    private val K_ALTER = Tokens.K_ALTER.id
    private val K_AND = Tokens.K_AND.id
    private val K_ANY = Tokens.K_ANY.id
    private val K_APPLY = Tokens.K_APPLY.id
    private val K_AS = Tokens.K_AS.id
    private val K_ASC = Tokens.K_ASC.id
    private val K_AUTHORIZE = Tokens.K_AUTHORIZE.id
    private val K_BATCH = Tokens.K_BATCH.id
    private val K_BEGIN = Tokens.K_BEGIN.id
    private val K_BY = Tokens.K_BY.id
    private val K_CALLED = Tokens.K_CALLED.id
    private val K_CLUSTERING = Tokens.K_CLUSTERING.id
    private val K_COLUMNFAMILY = Tokens.K_COLUMNFAMILY.id
    private val K_COMPACT = Tokens.K_COMPACT.id
    private val K_CONSISTENCY = Tokens.K_CONSISTENCY.id
    private val K_CONTAINS = Tokens.K_CONTAINS.id
    private val K_CREATE = Tokens.K_CREATE.id
    private val K_CUSTOM = Tokens.K_CUSTOM.id
    private val K_DELETE = Tokens.K_DELETE.id
    private val K_DESC = Tokens.K_DESC.id
    private val K_DESCRIBE = Tokens.K_DESCRIBE.id
    private val K_DISTINCT = Tokens.K_DISTINCT.id
    private val K_DROP = Tokens.K_DROP.id
    private val K_DURABLE_WRITES = Tokens.K_DURABLE_WRITES.id
    private val K_EACH_QUORUM = Tokens.K_EACH_QUORUM.id
    private val K_ENTRIES = Tokens.K_ENTRIES.id
    private val K_EXECUTE = Tokens.K_EXECUTE.id
    private val K_EXISTS = Tokens.K_EXISTS.id
    private val K_FALSE = Tokens.K_FALSE.id
    private val K_FILTERING = Tokens.K_FILTERING.id
    private val K_FINALFUNC = Tokens.K_FINALFUNC.id
    private val K_FROM = Tokens.K_FROM.id
    private val K_FULL = Tokens.K_FULL.id
    private val K_FUNCTION = Tokens.K_FUNCTION.id
    private val K_FUNCTIONS = Tokens.K_FUNCTIONS.id
    private val K_GRANT = Tokens.K_GRANT.id
    private val K_IF = Tokens.K_IF.id
    private val K_IN = Tokens.K_IN.id
    private val K_INDEX = Tokens.K_INDEX.id
    private val K_INFINITY = Tokens.K_INFINITY.id
    private val K_INITCOND = Tokens.K_INITCOND.id
    private val K_INPUT = Tokens.K_INPUT.id
    private val K_INSERT = Tokens.K_INSERT.id
    private val K_INTO = Tokens.K_INTO.id
    private val K_IS = Tokens.K_IS.id
    private val K_KEY = Tokens.K_KEY.id
    private val K_KEYS = Tokens.K_KEYS.id
    private val K_KEYSPACE = Tokens.K_KEYSPACE.id
    private val K_KEYSPACES = Tokens.K_KEYSPACES.id
    private val K_LANGUAGE = Tokens.K_LANGUAGE.id
    private val K_LEVEL = Tokens.K_LEVEL.id
    private val K_LIMIT = Tokens.K_LIMIT.id
    private val K_LOCAL_ONE = Tokens.K_LOCAL_ONE.id
    private val K_LOCAL_QUORUM = Tokens.K_LOCAL_QUORUM.id
    private val K_LOGGED = Tokens.K_LOGGED.id
    private val K_LOGIN = Tokens.K_LOGIN.id
    private val K_MATERIALIZED = Tokens.K_MATERIALIZED.id
    private val K_MODIFY = Tokens.K_MODIFY.id
    private val K_NAN = Tokens.K_NAN.id
    private val K_NORECURSIVE = Tokens.K_NORECURSIVE.id
    private val K_NOSUPERUSER = Tokens.K_NOSUPERUSER.id
    private val K_NOT = Tokens.K_NOT.id
    private val K_NULL = Tokens.K_NULL.id
    private val K_OF = Tokens.K_OF.id
    private val K_ON = Tokens.K_ON.id
    private val K_ONE = Tokens.K_ONE.id
    private val K_OPTIONS = Tokens.K_OPTIONS.id
    private val K_OR = Tokens.K_OR.id
    private val K_ORDER = Tokens.K_ORDER.id
    private val K_PARTITION = Tokens.K_PARTITION.id
    private val K_PASSWORD = Tokens.K_PASSWORD.id
    private val K_PER = Tokens.K_PER.id
    private val K_PERMISSION = Tokens.K_PERMISSION.id
    private val K_PERMISSIONS = Tokens.K_PERMISSIONS.id
    private val K_PRIMARY = Tokens.K_PRIMARY.id
    private val K_QUORUM = Tokens.K_QUORUM.id
    private val K_RENAME = Tokens.K_RENAME.id
    private val K_REPLACE = Tokens.K_REPLACE.id
    private val K_REPLICATION = Tokens.K_REPLICATION.id
    private val K_RETURNS = Tokens.K_RETURNS.id
    private val K_REVOKE = Tokens.K_REVOKE.id
    private val K_ROLE = Tokens.K_ROLE.id
    private val K_ROLES = Tokens.K_ROLES.id
    private val K_SCHEMA = Tokens.K_SCHEMA.id
    private val K_SELECT = Tokens.K_SELECT.id
    private val K_SET = Tokens.K_SET.id
    private val K_SFUNC = Tokens.K_SFUNC.id
    private val K_STATIC = Tokens.K_STATIC.id
    private val K_STORAGE = Tokens.K_STORAGE.id
    private val K_STYPE = Tokens.K_STYPE.id
    private val K_SUPERUSER = Tokens.K_SUPERUSER.id
    private val K_TABLE = Tokens.K_TABLE.id
    private val K_THREE = Tokens.K_THREE.id
    private val K_TIMESTAMP = Tokens.K_TIMESTAMP.id
    private val K_TO = Tokens.K_TO.id
    private val K_TOKEN = Tokens.K_TOKEN.id
    private val K_TRIGGER = Tokens.K_TRIGGER.id
    private val K_TRUE = Tokens.K_TRUE.id
    private val K_TRUNCATE = Tokens.K_TRUNCATE.id
    private val K_TTL = Tokens.K_TTL.id
    private val K_TWO = Tokens.K_TWO.id
    private val K_TYPE = Tokens.K_TYPE.id
    private val K_UNLOGGED = Tokens.K_UNLOGGED.id
    private val K_UPDATE = Tokens.K_UPDATE.id
    private val K_USE = Tokens.K_USE.id
    private val K_USER = Tokens.K_USER.id
    private val K_USING = Tokens.K_USING.id
    private val K_UUID = Tokens.K_UUID.id
    private val K_VALUES = Tokens.K_VALUES.id
    private val K_VIEW = Tokens.K_VIEW.id
    private val K_WHERE = Tokens.K_WHERE.id
    private val K_WITH = Tokens.K_WITH.id
    private val K_WRITETIME = Tokens.K_WRITETIME.id
    private val K_ASCII = Tokens.K_ASCII.id
    private val K_BIGINT = Tokens.K_BIGINT.id
    private val K_BLOB = Tokens.K_BLOB.id
    private val K_BOOLEAN = Tokens.K_BOOLEAN.id
    private val K_COUNTER = Tokens.K_COUNTER.id
    private val K_DATE = Tokens.K_DATE.id
    private val K_DECIMAL = Tokens.K_DECIMAL.id
    private val K_DOUBLE = Tokens.K_DOUBLE.id
    private val K_FLOAT = Tokens.K_FLOAT.id
    private val K_FROZEN = Tokens.K_FROZEN.id
    private val K_INET = Tokens.K_INET.id
    private val K_INT = Tokens.K_INT.id
    private val K_LIST = Tokens.K_LIST.id
    private val K_MAP = Tokens.K_MAP.id
    private val K_SMALLINT = Tokens.K_SMALLINT.id
    private val K_TEXT = Tokens.K_TEXT.id
    private val K_TIMEUUID = Tokens.K_TIMEUUID.id
    private val K_TIME = Tokens.K_TIME.id
    private val K_TINYINT = Tokens.K_TINYINT.id
    private val K_TUPLE = Tokens.K_TUPLE.id
    private val K_VARCHAR = Tokens.K_VARCHAR.id
    private val K_VARINT = Tokens.K_VARINT.id
    private val CODE_BLOCK = Tokens.CODE_BLOCK.id
    private val STRING_LITERAL = Tokens.STRING_LITERAL.id
    private val DECIMAL_LITERAL = Tokens.DECIMAL_LITERAL.id
    private val FLOAT_LITERAL = Tokens.FLOAT_LITERAL.id
    private val HEXADECIMAL_LITERAL = Tokens.HEXADECIMAL_LITERAL.id
    private val REAL_LITERAL = Tokens.REAL_LITERAL.id
    private val OBJECT_NAME = Tokens.OBJECT_NAME.id
    private val UUID = Tokens.UUID.id
    private val OPERATOR_EQ = Tokens.OPERATOR_EQ.id
    private val OPERATOR_LT = Tokens.OPERATOR_LT.id
    private val OPERATOR_GT = Tokens.OPERATOR_GT.id
    private val OPERATOR_LTE = Tokens.OPERATOR_LTE.id
    private val OPERATOR_GTE = Tokens.OPERATOR_GTE.id
    private val K_USERS = Tokens.K_USERS.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class RootContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_root.id
	        set(value) { throw RuntimeException() }
		fun findEof() : EofContext? = getRuleContext(solver.getType("EofContext"),0)
		fun findCqls() : CqlsContext? = getRuleContext(solver.getType("CqlsContext"),0)
		fun MINUSMINUS() : TerminalNode? = getToken(CqlParser.Tokens.MINUSMINUS.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  root() : RootContext {
		var _localctx : RootContext = RootContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_root.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 555
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (((((_la - 8)) and 0x3f.inv()) == 0 && ((1L shl (_la - 8)) and ((1L shl (SEMI - 8)) or (1L shl (K_ALTER - 8)) or (1L shl (K_APPLY - 8)) or (1L shl (K_BEGIN - 8)) or (1L shl (K_CREATE - 8)) or (1L shl (K_DELETE - 8)) or (1L shl (K_DROP - 8)) or (1L shl (K_GRANT - 8)) or (1L shl (K_INSERT - 8)))) != 0L) || ((((_la - 107)) and 0x3f.inv()) == 0 && ((1L shl (_la - 107)) and ((1L shl (K_REVOKE - 107)) or (1L shl (K_SELECT - 107)) or (1L shl (K_TRUNCATE - 107)) or (1L shl (K_UPDATE - 107)) or (1L shl (K_USE - 107)) or (1L shl (K_LIST - 107)))) != 0L)) {
				if (true){
				this.state = 554
				cqls()
				}
			}

			this.state = 558
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==MINUSMINUS) {
				if (true){
				this.state = 557
				match(MINUSMINUS) as Token
				}
			}

			this.state = 560
			eof()
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

	open class CqlsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_cqls.id
	        set(value) { throw RuntimeException() }
		fun findCql() : List<CqlContext> = getRuleContexts(solver.getType("CqlContext"))
		fun findCql(i: Int) : CqlContext? = getRuleContext(solver.getType("CqlContext"),i)
		fun findEmpty() : List<EmptyContext> = getRuleContexts(solver.getType("EmptyContext"))
		fun findEmpty(i: Int) : EmptyContext? = getRuleContext(solver.getType("EmptyContext"),i)
		fun findStatementSeparator() : List<StatementSeparatorContext> = getRuleContexts(solver.getType("StatementSeparatorContext"))
		fun findStatementSeparator(i: Int) : StatementSeparatorContext? = getRuleContext(solver.getType("StatementSeparatorContext"),i)
		fun MINUSMINUS() : List<TerminalNode> = getTokens(CqlParser.Tokens.MINUSMINUS.id)
		fun MINUSMINUS(i: Int) : TerminalNode = getToken(CqlParser.Tokens.MINUSMINUS.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  cqls() : CqlsContext {
		var _localctx : CqlsContext = CqlsContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_cqls.id)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 571
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,4,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					this.state = 569
					errorHandler.sync(this)
					when (_input!!.LA(1)) {
					K_ALTER , K_APPLY , K_BEGIN , K_CREATE , K_DELETE , K_DROP , K_GRANT , K_INSERT , K_REVOKE , K_SELECT , K_TRUNCATE , K_UPDATE , K_USE , K_LIST  ->  /*LL1AltBlock*/{if (true){
					this.state = 562
					cql()
					this.state = 564
					errorHandler.sync(this)
					_la = _input!!.LA(1)
					if (_la==MINUSMINUS) {
						if (true){
						this.state = 563
						match(MINUSMINUS) as Token
						}
					}

					this.state = 566
					statementSeparator()
					}}
					SEMI  ->  /*LL1AltBlock*/{if (true){
					this.state = 568
					empty()
					}}
					else -> throw NoViableAltException(this)
					}
					} 
				}
				this.state = 573
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,4,context)
			}
			this.state = 582
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			K_ALTER , K_APPLY , K_BEGIN , K_CREATE , K_DELETE , K_DROP , K_GRANT , K_INSERT , K_REVOKE , K_SELECT , K_TRUNCATE , K_UPDATE , K_USE , K_LIST  ->  /*LL1AltBlock*/{if (true){
			this.state = 574
			cql()
			this.state = 579
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,6,context) ) {
			1   -> if (true){
			this.state = 576
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==MINUSMINUS) {
				if (true){
				this.state = 575
				match(MINUSMINUS) as Token
				}
			}

			this.state = 578
			statementSeparator()
			}
			}
			}}
			SEMI  ->  /*LL1AltBlock*/{if (true){
			this.state = 581
			empty()
			}}
			else -> throw NoViableAltException(this)
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

	open class StatementSeparatorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_statementSeparator.id
	        set(value) { throw RuntimeException() }
		fun SEMI() : TerminalNode? = getToken(CqlParser.Tokens.SEMI.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  statementSeparator() : StatementSeparatorContext {
		var _localctx : StatementSeparatorContext = StatementSeparatorContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_statementSeparator.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 584
			match(SEMI) as Token
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

	open class EmptyContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_empty.id
	        set(value) { throw RuntimeException() }
		fun findStatementSeparator() : StatementSeparatorContext? = getRuleContext(solver.getType("StatementSeparatorContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  empty() : EmptyContext {
		var _localctx : EmptyContext = EmptyContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_empty.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 586
			statementSeparator()
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

	open class CqlContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_cql.id
	        set(value) { throw RuntimeException() }
		fun findAlterKeyspace() : AlterKeyspaceContext? = getRuleContext(solver.getType("AlterKeyspaceContext"),0)
		fun findAlterMaterializedView() : AlterMaterializedViewContext? = getRuleContext(solver.getType("AlterMaterializedViewContext"),0)
		fun findAlterRole() : AlterRoleContext? = getRuleContext(solver.getType("AlterRoleContext"),0)
		fun findAlterTable() : AlterTableContext? = getRuleContext(solver.getType("AlterTableContext"),0)
		fun findAlterType() : AlterTypeContext? = getRuleContext(solver.getType("AlterTypeContext"),0)
		fun findAlterUser() : AlterUserContext? = getRuleContext(solver.getType("AlterUserContext"),0)
		fun findApplyBatch() : ApplyBatchContext? = getRuleContext(solver.getType("ApplyBatchContext"),0)
		fun findCreateAggregate() : CreateAggregateContext? = getRuleContext(solver.getType("CreateAggregateContext"),0)
		fun findCreateFunction() : CreateFunctionContext? = getRuleContext(solver.getType("CreateFunctionContext"),0)
		fun findCreateIndex() : CreateIndexContext? = getRuleContext(solver.getType("CreateIndexContext"),0)
		fun findCreateKeyspace() : CreateKeyspaceContext? = getRuleContext(solver.getType("CreateKeyspaceContext"),0)
		fun findCreateMaterializedView() : CreateMaterializedViewContext? = getRuleContext(solver.getType("CreateMaterializedViewContext"),0)
		fun findCreateRole() : CreateRoleContext? = getRuleContext(solver.getType("CreateRoleContext"),0)
		fun findCreateTable() : CreateTableContext? = getRuleContext(solver.getType("CreateTableContext"),0)
		fun findCreateTrigger() : CreateTriggerContext? = getRuleContext(solver.getType("CreateTriggerContext"),0)
		fun findCreateType() : CreateTypeContext? = getRuleContext(solver.getType("CreateTypeContext"),0)
		fun findCreateUser() : CreateUserContext? = getRuleContext(solver.getType("CreateUserContext"),0)
		fun findDelete() : DeleteContext? = getRuleContext(solver.getType("DeleteContext"),0)
		fun findDropAggregate() : DropAggregateContext? = getRuleContext(solver.getType("DropAggregateContext"),0)
		fun findDropFunction() : DropFunctionContext? = getRuleContext(solver.getType("DropFunctionContext"),0)
		fun findDropIndex() : DropIndexContext? = getRuleContext(solver.getType("DropIndexContext"),0)
		fun findDropKeyspace() : DropKeyspaceContext? = getRuleContext(solver.getType("DropKeyspaceContext"),0)
		fun findDropMaterializedView() : DropMaterializedViewContext? = getRuleContext(solver.getType("DropMaterializedViewContext"),0)
		fun findDropRole() : DropRoleContext? = getRuleContext(solver.getType("DropRoleContext"),0)
		fun findDropTable() : DropTableContext? = getRuleContext(solver.getType("DropTableContext"),0)
		fun findDropTrigger() : DropTriggerContext? = getRuleContext(solver.getType("DropTriggerContext"),0)
		fun findDropType() : DropTypeContext? = getRuleContext(solver.getType("DropTypeContext"),0)
		fun findDropUser() : DropUserContext? = getRuleContext(solver.getType("DropUserContext"),0)
		fun findGrant() : GrantContext? = getRuleContext(solver.getType("GrantContext"),0)
		fun findInsert() : InsertContext? = getRuleContext(solver.getType("InsertContext"),0)
		fun findListPermissions() : ListPermissionsContext? = getRuleContext(solver.getType("ListPermissionsContext"),0)
		fun findListRoles() : ListRolesContext? = getRuleContext(solver.getType("ListRolesContext"),0)
		fun findRevoke() : RevokeContext? = getRuleContext(solver.getType("RevokeContext"),0)
		fun findSelect() : SelectContext? = getRuleContext(solver.getType("SelectContext"),0)
		fun findTruncate() : TruncateContext? = getRuleContext(solver.getType("TruncateContext"),0)
		fun findUpdate() : UpdateContext? = getRuleContext(solver.getType("UpdateContext"),0)
		fun findUse() : UseContext? = getRuleContext(solver.getType("UseContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  cql() : CqlContext {
		var _localctx : CqlContext = CqlContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_cql.id)
		try {
			this.state = 625
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,8,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 588
			alterKeyspace()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 589
			alterMaterializedView()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 590
			alterRole()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 591
			alterTable()
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 592
			alterType()
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 593
			alterUser()
			}}
			7 -> {
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 594
			applyBatch()
			}}
			8 -> {
			enterOuterAlt(_localctx, 8)
			if (true){
			this.state = 595
			createAggregate()
			}}
			9 -> {
			enterOuterAlt(_localctx, 9)
			if (true){
			this.state = 596
			createFunction()
			}}
			10 -> {
			enterOuterAlt(_localctx, 10)
			if (true){
			this.state = 597
			createIndex()
			}}
			11 -> {
			enterOuterAlt(_localctx, 11)
			if (true){
			this.state = 598
			createKeyspace()
			}}
			12 -> {
			enterOuterAlt(_localctx, 12)
			if (true){
			this.state = 599
			createMaterializedView()
			}}
			13 -> {
			enterOuterAlt(_localctx, 13)
			if (true){
			this.state = 600
			createRole()
			}}
			14 -> {
			enterOuterAlt(_localctx, 14)
			if (true){
			this.state = 601
			createTable()
			}}
			15 -> {
			enterOuterAlt(_localctx, 15)
			if (true){
			this.state = 602
			createTrigger()
			}}
			16 -> {
			enterOuterAlt(_localctx, 16)
			if (true){
			this.state = 603
			createType()
			}}
			17 -> {
			enterOuterAlt(_localctx, 17)
			if (true){
			this.state = 604
			createUser()
			}}
			18 -> {
			enterOuterAlt(_localctx, 18)
			if (true){
			this.state = 605
			delete()
			}}
			19 -> {
			enterOuterAlt(_localctx, 19)
			if (true){
			this.state = 606
			dropAggregate()
			}}
			20 -> {
			enterOuterAlt(_localctx, 20)
			if (true){
			this.state = 607
			dropFunction()
			}}
			21 -> {
			enterOuterAlt(_localctx, 21)
			if (true){
			this.state = 608
			dropIndex()
			}}
			22 -> {
			enterOuterAlt(_localctx, 22)
			if (true){
			this.state = 609
			dropKeyspace()
			}}
			23 -> {
			enterOuterAlt(_localctx, 23)
			if (true){
			this.state = 610
			dropMaterializedView()
			}}
			24 -> {
			enterOuterAlt(_localctx, 24)
			if (true){
			this.state = 611
			dropRole()
			}}
			25 -> {
			enterOuterAlt(_localctx, 25)
			if (true){
			this.state = 612
			dropTable()
			}}
			26 -> {
			enterOuterAlt(_localctx, 26)
			if (true){
			this.state = 613
			dropTrigger()
			}}
			27 -> {
			enterOuterAlt(_localctx, 27)
			if (true){
			this.state = 614
			dropType()
			}}
			28 -> {
			enterOuterAlt(_localctx, 28)
			if (true){
			this.state = 615
			dropUser()
			}}
			29 -> {
			enterOuterAlt(_localctx, 29)
			if (true){
			this.state = 616
			grant()
			}}
			30 -> {
			enterOuterAlt(_localctx, 30)
			if (true){
			this.state = 617
			insert()
			}}
			31 -> {
			enterOuterAlt(_localctx, 31)
			if (true){
			this.state = 618
			listPermissions()
			}}
			32 -> {
			enterOuterAlt(_localctx, 32)
			if (true){
			this.state = 619
			listRoles()
			}}
			33 -> {
			enterOuterAlt(_localctx, 33)
			if (true){
			this.state = 620
			revoke()
			}}
			34 -> {
			enterOuterAlt(_localctx, 34)
			if (true){
			this.state = 621
			select()
			}}
			35 -> {
			enterOuterAlt(_localctx, 35)
			if (true){
			this.state = 622
			truncate()
			}}
			36 -> {
			enterOuterAlt(_localctx, 36)
			if (true){
			this.state = 623
			update()
			}}
			37 -> {
			enterOuterAlt(_localctx, 37)
			if (true){
			this.state = 624
			use()
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

	open class RevokeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_revoke.id
	        set(value) { throw RuntimeException() }
		fun findKwRevoke() : KwRevokeContext? = getRuleContext(solver.getType("KwRevokeContext"),0)
		fun findPriviledge() : PriviledgeContext? = getRuleContext(solver.getType("PriviledgeContext"),0)
		fun findKwOn() : KwOnContext? = getRuleContext(solver.getType("KwOnContext"),0)
		fun findResource() : ResourceContext? = getRuleContext(solver.getType("ResourceContext"),0)
		fun findKwFrom() : KwFromContext? = getRuleContext(solver.getType("KwFromContext"),0)
		fun findRole() : RoleContext? = getRuleContext(solver.getType("RoleContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  revoke() : RevokeContext {
		var _localctx : RevokeContext = RevokeContext(context, state)
		enterRule(_localctx, 10, Rules.RULE_revoke.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 627
			kwRevoke()
			this.state = 628
			priviledge()
			this.state = 629
			kwOn()
			this.state = 630
			resource()
			this.state = 631
			kwFrom()
			this.state = 632
			role()
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

	open class ListUsersContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_listUsers.id
	        set(value) { throw RuntimeException() }
		fun findKwList() : KwListContext? = getRuleContext(solver.getType("KwListContext"),0)
		fun findKwUsers() : KwUsersContext? = getRuleContext(solver.getType("KwUsersContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  listUsers() : ListUsersContext {
		var _localctx : ListUsersContext = ListUsersContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_listUsers.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 634
			kwList()
			this.state = 635
			kwUsers()
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

	open class ListRolesContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_listRoles.id
	        set(value) { throw RuntimeException() }
		fun findKwList() : KwListContext? = getRuleContext(solver.getType("KwListContext"),0)
		fun findKwRoles() : KwRolesContext? = getRuleContext(solver.getType("KwRolesContext"),0)
		fun findKwOf() : KwOfContext? = getRuleContext(solver.getType("KwOfContext"),0)
		fun findRole() : RoleContext? = getRuleContext(solver.getType("RoleContext"),0)
		fun findKwNorecursive() : KwNorecursiveContext? = getRuleContext(solver.getType("KwNorecursiveContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  listRoles() : ListRolesContext {
		var _localctx : ListRolesContext = ListRolesContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_listRoles.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 637
			kwList()
			this.state = 638
			kwRoles()
			this.state = 642
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_OF) {
				if (true){
				this.state = 639
				kwOf()
				this.state = 640
				role()
				}
			}

			this.state = 645
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_NORECURSIVE) {
				if (true){
				this.state = 644
				kwNorecursive()
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

	open class ListPermissionsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_listPermissions.id
	        set(value) { throw RuntimeException() }
		fun findKwList() : KwListContext? = getRuleContext(solver.getType("KwListContext"),0)
		fun findPriviledge() : PriviledgeContext? = getRuleContext(solver.getType("PriviledgeContext"),0)
		fun findKwOn() : KwOnContext? = getRuleContext(solver.getType("KwOnContext"),0)
		fun findResource() : ResourceContext? = getRuleContext(solver.getType("ResourceContext"),0)
		fun findKwOf() : KwOfContext? = getRuleContext(solver.getType("KwOfContext"),0)
		fun findRole() : RoleContext? = getRuleContext(solver.getType("RoleContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  listPermissions() : ListPermissionsContext {
		var _localctx : ListPermissionsContext = ListPermissionsContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_listPermissions.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 647
			kwList()
			this.state = 648
			priviledge()
			this.state = 652
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_ON) {
				if (true){
				this.state = 649
				kwOn()
				this.state = 650
				resource()
				}
			}

			this.state = 657
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_OF) {
				if (true){
				this.state = 654
				kwOf()
				this.state = 655
				role()
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

	open class GrantContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_grant.id
	        set(value) { throw RuntimeException() }
		fun findKwGrant() : KwGrantContext? = getRuleContext(solver.getType("KwGrantContext"),0)
		fun findPriviledge() : PriviledgeContext? = getRuleContext(solver.getType("PriviledgeContext"),0)
		fun findKwOn() : KwOnContext? = getRuleContext(solver.getType("KwOnContext"),0)
		fun findResource() : ResourceContext? = getRuleContext(solver.getType("ResourceContext"),0)
		fun findKwTo() : KwToContext? = getRuleContext(solver.getType("KwToContext"),0)
		fun findRole() : RoleContext? = getRuleContext(solver.getType("RoleContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  grant() : GrantContext {
		var _localctx : GrantContext = GrantContext(context, state)
		enterRule(_localctx, 18, Rules.RULE_grant.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 659
			kwGrant()
			this.state = 660
			priviledge()
			this.state = 661
			kwOn()
			this.state = 662
			resource()
			this.state = 663
			kwTo()
			this.state = 664
			role()
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

	open class PriviledgeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_priviledge.id
	        set(value) { throw RuntimeException() }
		fun findKwAll() : KwAllContext? = getRuleContext(solver.getType("KwAllContext"),0)
		fun findKwAllPermissions() : KwAllPermissionsContext? = getRuleContext(solver.getType("KwAllPermissionsContext"),0)
		fun findKwAlter() : KwAlterContext? = getRuleContext(solver.getType("KwAlterContext"),0)
		fun findKwAuthorize() : KwAuthorizeContext? = getRuleContext(solver.getType("KwAuthorizeContext"),0)
		fun findKwDescibe() : KwDescibeContext? = getRuleContext(solver.getType("KwDescibeContext"),0)
		fun findKwExecute() : KwExecuteContext? = getRuleContext(solver.getType("KwExecuteContext"),0)
		fun findKwCreate() : KwCreateContext? = getRuleContext(solver.getType("KwCreateContext"),0)
		fun findKwDrop() : KwDropContext? = getRuleContext(solver.getType("KwDropContext"),0)
		fun findKwModify() : KwModifyContext? = getRuleContext(solver.getType("KwModifyContext"),0)
		fun findKwSelect() : KwSelectContext? = getRuleContext(solver.getType("KwSelectContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  priviledge() : PriviledgeContext {
		var _localctx : PriviledgeContext = PriviledgeContext(context, state)
		enterRule(_localctx, 20, Rules.RULE_priviledge.id)
		try {
			this.state = 678
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			K_ALL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 668
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,13,context) ) {
			1 -> {if (true){
			this.state = 666
			kwAll()
			}}
			2 -> {if (true){
			this.state = 667
			kwAllPermissions()
			}}
			}
			}}
			K_ALTER  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 670
			kwAlter()
			}}
			K_AUTHORIZE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 671
			kwAuthorize()
			}}
			K_DESCRIBE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 672
			kwDescibe()
			}}
			K_EXECUTE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 673
			kwExecute()
			}}
			K_CREATE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 674
			kwCreate()
			}}
			K_DROP  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 675
			kwDrop()
			}}
			K_MODIFY  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 8)
			if (true){
			this.state = 676
			kwModify()
			}}
			K_SELECT  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 9)
			if (true){
			this.state = 677
			kwSelect()
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

	open class ResourceContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_resource.id
	        set(value) { throw RuntimeException() }
		fun findKwAll() : KwAllContext? = getRuleContext(solver.getType("KwAllContext"),0)
		fun findKwFunctions() : KwFunctionsContext? = getRuleContext(solver.getType("KwFunctionsContext"),0)
		fun findKwIn() : KwInContext? = getRuleContext(solver.getType("KwInContext"),0)
		fun findKwKeyspace() : KwKeyspaceContext? = getRuleContext(solver.getType("KwKeyspaceContext"),0)
		fun findKeyspace() : KeyspaceContext? = getRuleContext(solver.getType("KeyspaceContext"),0)
		fun findKwFunction() : KwFunctionContext? = getRuleContext(solver.getType("KwFunctionContext"),0)
		fun findFunction() : FunctionContext? = getRuleContext(solver.getType("FunctionContext"),0)
		fun DOT() : TerminalNode? = getToken(CqlParser.Tokens.DOT.id, 0)
		fun findKwKeyspaces() : KwKeyspacesContext? = getRuleContext(solver.getType("KwKeyspacesContext"),0)
		fun findTable() : TableContext? = getRuleContext(solver.getType("TableContext"),0)
		fun findKwTable() : KwTableContext? = getRuleContext(solver.getType("KwTableContext"),0)
		fun findKwRoles() : KwRolesContext? = getRuleContext(solver.getType("KwRolesContext"),0)
		fun findKwRole() : KwRoleContext? = getRuleContext(solver.getType("KwRoleContext"),0)
		fun findRole() : RoleContext? = getRuleContext(solver.getType("RoleContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  resource() : ResourceContext {
		var _localctx : ResourceContext = ResourceContext(context, state)
		enterRule(_localctx, 22, Rules.RULE_resource.id)
		var _la: Int
		try {
			this.state = 718
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,18,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 680
			kwAll()
			this.state = 681
			kwFunctions()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 683
			kwAll()
			this.state = 684
			kwFunctions()
			this.state = 685
			kwIn()
			this.state = 686
			kwKeyspace()
			this.state = 687
			keyspace()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 689
			kwFunction()
			this.state = 693
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,15,context) ) {
			1   -> if (true){
			this.state = 690
			keyspace()
			this.state = 691
			match(DOT) as Token
			}
			}
			this.state = 695
			function()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 697
			kwAll()
			this.state = 698
			kwKeyspaces()
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 700
			kwKeyspace()
			this.state = 701
			keyspace()
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 704
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_TABLE) {
				if (true){
				this.state = 703
				kwTable()
				}
			}

			this.state = 709
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,17,context) ) {
			1   -> if (true){
			this.state = 706
			keyspace()
			this.state = 707
			match(DOT) as Token
			}
			}
			this.state = 711
			table()
			}}
			7 -> {
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 712
			kwAll()
			this.state = 713
			kwRoles()
			}}
			8 -> {
			enterOuterAlt(_localctx, 8)
			if (true){
			this.state = 715
			kwRole()
			this.state = 716
			role()
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

	open class CreateUserContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_createUser.id
	        set(value) { throw RuntimeException() }
		fun findKwCreate() : KwCreateContext? = getRuleContext(solver.getType("KwCreateContext"),0)
		fun findKwUser() : KwUserContext? = getRuleContext(solver.getType("KwUserContext"),0)
		fun findUser() : UserContext? = getRuleContext(solver.getType("UserContext"),0)
		fun findKwWith() : KwWithContext? = getRuleContext(solver.getType("KwWithContext"),0)
		fun findKwPassword() : KwPasswordContext? = getRuleContext(solver.getType("KwPasswordContext"),0)
		fun findStringLiteral() : StringLiteralContext? = getRuleContext(solver.getType("StringLiteralContext"),0)
		fun findIfNotExist() : IfNotExistContext? = getRuleContext(solver.getType("IfNotExistContext"),0)
		fun findKwSuperuser() : KwSuperuserContext? = getRuleContext(solver.getType("KwSuperuserContext"),0)
		fun findKwNosuperuser() : KwNosuperuserContext? = getRuleContext(solver.getType("KwNosuperuserContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  createUser() : CreateUserContext {
		var _localctx : CreateUserContext = CreateUserContext(context, state)
		enterRule(_localctx, 24, Rules.RULE_createUser.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 720
			kwCreate()
			this.state = 721
			kwUser()
			this.state = 723
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_IF) {
				if (true){
				this.state = 722
				ifNotExist()
				}
			}

			this.state = 725
			user()
			this.state = 726
			kwWith()
			this.state = 727
			kwPassword()
			this.state = 728
			stringLiteral()
			this.state = 731
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			K_SUPERUSER  -> 
				if (true){
				this.state = 729
				kwSuperuser()
				}
			K_NOSUPERUSER  -> 
				if (true){
				this.state = 730
				kwNosuperuser()
				}
			EOF , SEMI , MINUSMINUS  -> 
				Unit
			else -> Unit
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

	open class CreateRoleContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_createRole.id
	        set(value) { throw RuntimeException() }
		fun findKwCreate() : KwCreateContext? = getRuleContext(solver.getType("KwCreateContext"),0)
		fun findKwRole() : KwRoleContext? = getRuleContext(solver.getType("KwRoleContext"),0)
		fun findRole() : RoleContext? = getRuleContext(solver.getType("RoleContext"),0)
		fun findIfNotExist() : IfNotExistContext? = getRuleContext(solver.getType("IfNotExistContext"),0)
		fun findRoleWith() : RoleWithContext? = getRuleContext(solver.getType("RoleWithContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  createRole() : CreateRoleContext {
		var _localctx : CreateRoleContext = CreateRoleContext(context, state)
		enterRule(_localctx, 26, Rules.RULE_createRole.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 733
			kwCreate()
			this.state = 734
			kwRole()
			this.state = 736
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_IF) {
				if (true){
				this.state = 735
				ifNotExist()
				}
			}

			this.state = 738
			role()
			this.state = 740
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_WITH) {
				if (true){
				this.state = 739
				roleWith()
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

	open class CreateTypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_createType.id
	        set(value) { throw RuntimeException() }
		fun findKwCreate() : KwCreateContext? = getRuleContext(solver.getType("KwCreateContext"),0)
		fun findKwType() : KwTypeContext? = getRuleContext(solver.getType("KwTypeContext"),0)
		fun findType() : TypeContext? = getRuleContext(solver.getType("TypeContext"),0)
		fun findSyntaxBracketLr() : SyntaxBracketLrContext? = getRuleContext(solver.getType("SyntaxBracketLrContext"),0)
		fun findTypeMemberColumnList() : TypeMemberColumnListContext? = getRuleContext(solver.getType("TypeMemberColumnListContext"),0)
		fun findSyntaxBracketRr() : SyntaxBracketRrContext? = getRuleContext(solver.getType("SyntaxBracketRrContext"),0)
		fun findIfNotExist() : IfNotExistContext? = getRuleContext(solver.getType("IfNotExistContext"),0)
		fun findKeyspace() : KeyspaceContext? = getRuleContext(solver.getType("KeyspaceContext"),0)
		fun DOT() : TerminalNode? = getToken(CqlParser.Tokens.DOT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  createType() : CreateTypeContext {
		var _localctx : CreateTypeContext = CreateTypeContext(context, state)
		enterRule(_localctx, 28, Rules.RULE_createType.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 742
			kwCreate()
			this.state = 743
			kwType()
			this.state = 745
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_IF) {
				if (true){
				this.state = 744
				ifNotExist()
				}
			}

			this.state = 750
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,24,context) ) {
			1   -> if (true){
			this.state = 747
			keyspace()
			this.state = 748
			match(DOT) as Token
			}
			}
			this.state = 752
			type()
			this.state = 753
			syntaxBracketLr()
			this.state = 754
			typeMemberColumnList()
			this.state = 755
			syntaxBracketRr()
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

	open class TypeMemberColumnListContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeMemberColumnList.id
	        set(value) { throw RuntimeException() }
		fun findColumn() : List<ColumnContext> = getRuleContexts(solver.getType("ColumnContext"))
		fun findColumn(i: Int) : ColumnContext? = getRuleContext(solver.getType("ColumnContext"),i)
		fun findDataType() : List<DataTypeContext> = getRuleContexts(solver.getType("DataTypeContext"))
		fun findDataType(i: Int) : DataTypeContext? = getRuleContext(solver.getType("DataTypeContext"),i)
		fun findSyntaxComma() : List<SyntaxCommaContext> = getRuleContexts(solver.getType("SyntaxCommaContext"))
		fun findSyntaxComma(i: Int) : SyntaxCommaContext? = getRuleContext(solver.getType("SyntaxCommaContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  typeMemberColumnList() : TypeMemberColumnListContext {
		var _localctx : TypeMemberColumnListContext = TypeMemberColumnListContext(context, state)
		enterRule(_localctx, 30, Rules.RULE_typeMemberColumnList.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 757
			column()
			this.state = 758
			dataType()
			this.state = 765
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COMMA) {
				if (true){
				if (true){
				this.state = 759
				syntaxComma()
				this.state = 760
				column()
				this.state = 761
				dataType()
				}
				}
				this.state = 767
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

	open class CreateTriggerContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_createTrigger.id
	        set(value) { throw RuntimeException() }
		fun findKwCreate() : KwCreateContext? = getRuleContext(solver.getType("KwCreateContext"),0)
		fun findKwTrigger() : KwTriggerContext? = getRuleContext(solver.getType("KwTriggerContext"),0)
		fun findTrigger() : TriggerContext? = getRuleContext(solver.getType("TriggerContext"),0)
		fun findKwUsing() : KwUsingContext? = getRuleContext(solver.getType("KwUsingContext"),0)
		fun findTriggerClass() : TriggerClassContext? = getRuleContext(solver.getType("TriggerClassContext"),0)
		fun findIfNotExist() : IfNotExistContext? = getRuleContext(solver.getType("IfNotExistContext"),0)
		fun findKeyspace() : KeyspaceContext? = getRuleContext(solver.getType("KeyspaceContext"),0)
		fun DOT() : TerminalNode? = getToken(CqlParser.Tokens.DOT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  createTrigger() : CreateTriggerContext {
		var _localctx : CreateTriggerContext = CreateTriggerContext(context, state)
		enterRule(_localctx, 32, Rules.RULE_createTrigger.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 768
			kwCreate()
			this.state = 769
			kwTrigger()
			this.state = 771
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_IF) {
				if (true){
				this.state = 770
				ifNotExist()
				}
			}

			this.state = 776
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,27,context) ) {
			1   -> if (true){
			this.state = 773
			keyspace()
			this.state = 774
			match(DOT) as Token
			}
			}
			this.state = 778
			trigger()
			this.state = 779
			kwUsing()
			this.state = 780
			triggerClass()
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

	open class CreateMaterializedViewContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_createMaterializedView.id
	        set(value) { throw RuntimeException() }
		fun findKwCreate() : KwCreateContext? = getRuleContext(solver.getType("KwCreateContext"),0)
		fun findKwMaterialized() : KwMaterializedContext? = getRuleContext(solver.getType("KwMaterializedContext"),0)
		fun findKwView() : KwViewContext? = getRuleContext(solver.getType("KwViewContext"),0)
		fun findMaterializedView() : MaterializedViewContext? = getRuleContext(solver.getType("MaterializedViewContext"),0)
		fun findKwAs() : KwAsContext? = getRuleContext(solver.getType("KwAsContext"),0)
		fun findKwSelect() : KwSelectContext? = getRuleContext(solver.getType("KwSelectContext"),0)
		fun findColumnList() : List<ColumnListContext> = getRuleContexts(solver.getType("ColumnListContext"))
		fun findColumnList(i: Int) : ColumnListContext? = getRuleContext(solver.getType("ColumnListContext"),i)
		fun findKwFrom() : KwFromContext? = getRuleContext(solver.getType("KwFromContext"),0)
		fun findTable() : TableContext? = getRuleContext(solver.getType("TableContext"),0)
		fun findMaterializedViewWhere() : MaterializedViewWhereContext? = getRuleContext(solver.getType("MaterializedViewWhereContext"),0)
		fun findKwPrimary() : KwPrimaryContext? = getRuleContext(solver.getType("KwPrimaryContext"),0)
		fun findKwKey() : KwKeyContext? = getRuleContext(solver.getType("KwKeyContext"),0)
		fun findSyntaxBracketLr() : SyntaxBracketLrContext? = getRuleContext(solver.getType("SyntaxBracketLrContext"),0)
		fun findSyntaxBracketRr() : SyntaxBracketRrContext? = getRuleContext(solver.getType("SyntaxBracketRrContext"),0)
		fun findIfNotExist() : IfNotExistContext? = getRuleContext(solver.getType("IfNotExistContext"),0)
		fun findKeyspace() : List<KeyspaceContext> = getRuleContexts(solver.getType("KeyspaceContext"))
		fun findKeyspace(i: Int) : KeyspaceContext? = getRuleContext(solver.getType("KeyspaceContext"),i)
		fun DOT() : List<TerminalNode> = getTokens(CqlParser.Tokens.DOT.id)
		fun DOT(i: Int) : TerminalNode = getToken(CqlParser.Tokens.DOT.id, i) as TerminalNode
		fun findKwWith() : KwWithContext? = getRuleContext(solver.getType("KwWithContext"),0)
		fun findMaterializedViewOptions() : MaterializedViewOptionsContext? = getRuleContext(solver.getType("MaterializedViewOptionsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  createMaterializedView() : CreateMaterializedViewContext {
		var _localctx : CreateMaterializedViewContext = CreateMaterializedViewContext(context, state)
		enterRule(_localctx, 34, Rules.RULE_createMaterializedView.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 782
			kwCreate()
			this.state = 783
			kwMaterialized()
			this.state = 784
			kwView()
			this.state = 786
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_IF) {
				if (true){
				this.state = 785
				ifNotExist()
				}
			}

			this.state = 791
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,29,context) ) {
			1   -> if (true){
			this.state = 788
			keyspace()
			this.state = 789
			match(DOT) as Token
			}
			}
			this.state = 793
			materializedView()
			this.state = 794
			kwAs()
			this.state = 795
			kwSelect()
			this.state = 796
			columnList()
			this.state = 797
			kwFrom()
			this.state = 801
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,30,context) ) {
			1   -> if (true){
			this.state = 798
			keyspace()
			this.state = 799
			match(DOT) as Token
			}
			}
			this.state = 803
			table()
			this.state = 804
			materializedViewWhere()
			this.state = 805
			kwPrimary()
			this.state = 806
			kwKey()
			this.state = 807
			syntaxBracketLr()
			this.state = 808
			columnList()
			this.state = 809
			syntaxBracketRr()
			this.state = 813
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_WITH) {
				if (true){
				this.state = 810
				kwWith()
				this.state = 811
				materializedViewOptions()
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

	open class MaterializedViewWhereContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_materializedViewWhere.id
	        set(value) { throw RuntimeException() }
		fun findKwWhere() : KwWhereContext? = getRuleContext(solver.getType("KwWhereContext"),0)
		fun findColumnNotNullList() : ColumnNotNullListContext? = getRuleContext(solver.getType("ColumnNotNullListContext"),0)
		fun findKwAnd() : KwAndContext? = getRuleContext(solver.getType("KwAndContext"),0)
		fun findRelationElements() : RelationElementsContext? = getRuleContext(solver.getType("RelationElementsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  materializedViewWhere() : MaterializedViewWhereContext {
		var _localctx : MaterializedViewWhereContext = MaterializedViewWhereContext(context, state)
		enterRule(_localctx, 36, Rules.RULE_materializedViewWhere.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 815
			kwWhere()
			this.state = 816
			columnNotNullList()
			this.state = 820
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_AND) {
				if (true){
				this.state = 817
				kwAnd()
				this.state = 818
				relationElements()
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

	open class ColumnNotNullListContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_columnNotNullList.id
	        set(value) { throw RuntimeException() }
		fun findColumnNotNull() : List<ColumnNotNullContext> = getRuleContexts(solver.getType("ColumnNotNullContext"))
		fun findColumnNotNull(i: Int) : ColumnNotNullContext? = getRuleContext(solver.getType("ColumnNotNullContext"),i)
		fun findKwAnd() : List<KwAndContext> = getRuleContexts(solver.getType("KwAndContext"))
		fun findKwAnd(i: Int) : KwAndContext? = getRuleContext(solver.getType("KwAndContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  columnNotNullList() : ColumnNotNullListContext {
		var _localctx : ColumnNotNullListContext = ColumnNotNullListContext(context, state)
		enterRule(_localctx, 38, Rules.RULE_columnNotNullList.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 822
			columnNotNull()
			this.state = 828
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,33,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 823
					kwAnd()
					this.state = 824
					columnNotNull()
					}
					} 
				}
				this.state = 830
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,33,context)
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

	open class ColumnNotNullContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_columnNotNull.id
	        set(value) { throw RuntimeException() }
		fun findColumn() : ColumnContext? = getRuleContext(solver.getType("ColumnContext"),0)
		fun findKwIs() : KwIsContext? = getRuleContext(solver.getType("KwIsContext"),0)
		fun findKwNot() : KwNotContext? = getRuleContext(solver.getType("KwNotContext"),0)
		fun findKwNull() : KwNullContext? = getRuleContext(solver.getType("KwNullContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  columnNotNull() : ColumnNotNullContext {
		var _localctx : ColumnNotNullContext = ColumnNotNullContext(context, state)
		enterRule(_localctx, 40, Rules.RULE_columnNotNull.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 831
			column()
			this.state = 832
			kwIs()
			this.state = 833
			kwNot()
			this.state = 834
			kwNull()
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

	open class MaterializedViewOptionsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_materializedViewOptions.id
	        set(value) { throw RuntimeException() }
		fun findTableOptions() : TableOptionsContext? = getRuleContext(solver.getType("TableOptionsContext"),0)
		fun findKwAnd() : KwAndContext? = getRuleContext(solver.getType("KwAndContext"),0)
		fun findClusteringOrder() : ClusteringOrderContext? = getRuleContext(solver.getType("ClusteringOrderContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  materializedViewOptions() : MaterializedViewOptionsContext {
		var _localctx : MaterializedViewOptionsContext = MaterializedViewOptionsContext(context, state)
		enterRule(_localctx, 42, Rules.RULE_materializedViewOptions.id)
		try {
			this.state = 842
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,34,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 836
			tableOptions()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 837
			tableOptions()
			this.state = 838
			kwAnd()
			this.state = 839
			clusteringOrder()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 841
			clusteringOrder()
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

	open class CreateKeyspaceContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_createKeyspace.id
	        set(value) { throw RuntimeException() }
		fun findKwCreate() : KwCreateContext? = getRuleContext(solver.getType("KwCreateContext"),0)
		fun findKwKeyspace() : KwKeyspaceContext? = getRuleContext(solver.getType("KwKeyspaceContext"),0)
		fun findKeyspace() : KeyspaceContext? = getRuleContext(solver.getType("KeyspaceContext"),0)
		fun findKwWith() : KwWithContext? = getRuleContext(solver.getType("KwWithContext"),0)
		fun findKwReplication() : KwReplicationContext? = getRuleContext(solver.getType("KwReplicationContext"),0)
		fun OPERATOR_EQ() : TerminalNode? = getToken(CqlParser.Tokens.OPERATOR_EQ.id, 0)
		fun findSyntaxBracketLc() : SyntaxBracketLcContext? = getRuleContext(solver.getType("SyntaxBracketLcContext"),0)
		fun findReplicationList() : ReplicationListContext? = getRuleContext(solver.getType("ReplicationListContext"),0)
		fun findSyntaxBracketRc() : SyntaxBracketRcContext? = getRuleContext(solver.getType("SyntaxBracketRcContext"),0)
		fun findIfNotExist() : IfNotExistContext? = getRuleContext(solver.getType("IfNotExistContext"),0)
		fun findKwAnd() : KwAndContext? = getRuleContext(solver.getType("KwAndContext"),0)
		fun findDurableWrites() : DurableWritesContext? = getRuleContext(solver.getType("DurableWritesContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  createKeyspace() : CreateKeyspaceContext {
		var _localctx : CreateKeyspaceContext = CreateKeyspaceContext(context, state)
		enterRule(_localctx, 44, Rules.RULE_createKeyspace.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 844
			kwCreate()
			this.state = 845
			kwKeyspace()
			this.state = 847
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_IF) {
				if (true){
				this.state = 846
				ifNotExist()
				}
			}

			this.state = 849
			keyspace()
			this.state = 850
			kwWith()
			this.state = 851
			kwReplication()
			this.state = 852
			match(OPERATOR_EQ) as Token
			this.state = 853
			syntaxBracketLc()
			this.state = 854
			replicationList()
			this.state = 855
			syntaxBracketRc()
			this.state = 859
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_AND) {
				if (true){
				this.state = 856
				kwAnd()
				this.state = 857
				durableWrites()
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

	open class CreateFunctionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_createFunction.id
	        set(value) { throw RuntimeException() }
		fun findKwCreate() : KwCreateContext? = getRuleContext(solver.getType("KwCreateContext"),0)
		fun findKwFunction() : KwFunctionContext? = getRuleContext(solver.getType("KwFunctionContext"),0)
		fun findFunction() : FunctionContext? = getRuleContext(solver.getType("FunctionContext"),0)
		fun findSyntaxBracketLr() : SyntaxBracketLrContext? = getRuleContext(solver.getType("SyntaxBracketLrContext"),0)
		fun findSyntaxBracketRr() : SyntaxBracketRrContext? = getRuleContext(solver.getType("SyntaxBracketRrContext"),0)
		fun findReturnMode() : ReturnModeContext? = getRuleContext(solver.getType("ReturnModeContext"),0)
		fun findKwReturns() : KwReturnsContext? = getRuleContext(solver.getType("KwReturnsContext"),0)
		fun findDataType() : DataTypeContext? = getRuleContext(solver.getType("DataTypeContext"),0)
		fun findKwLanguage() : KwLanguageContext? = getRuleContext(solver.getType("KwLanguageContext"),0)
		fun findLanguage() : LanguageContext? = getRuleContext(solver.getType("LanguageContext"),0)
		fun findKwAs() : KwAsContext? = getRuleContext(solver.getType("KwAsContext"),0)
		fun findCodeBlock() : CodeBlockContext? = getRuleContext(solver.getType("CodeBlockContext"),0)
		fun findOrReplace() : OrReplaceContext? = getRuleContext(solver.getType("OrReplaceContext"),0)
		fun findIfNotExist() : IfNotExistContext? = getRuleContext(solver.getType("IfNotExistContext"),0)
		fun findKeyspace() : KeyspaceContext? = getRuleContext(solver.getType("KeyspaceContext"),0)
		fun DOT() : TerminalNode? = getToken(CqlParser.Tokens.DOT.id, 0)
		fun findParamList() : ParamListContext? = getRuleContext(solver.getType("ParamListContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  createFunction() : CreateFunctionContext {
		var _localctx : CreateFunctionContext = CreateFunctionContext(context, state)
		enterRule(_localctx, 46, Rules.RULE_createFunction.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 861
			kwCreate()
			this.state = 863
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_OR) {
				if (true){
				this.state = 862
				orReplace()
				}
			}

			this.state = 865
			kwFunction()
			this.state = 867
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_IF) {
				if (true){
				this.state = 866
				ifNotExist()
				}
			}

			this.state = 872
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,39,context) ) {
			1   -> if (true){
			this.state = 869
			keyspace()
			this.state = 870
			match(DOT) as Token
			}
			}
			this.state = 874
			function()
			this.state = 875
			syntaxBracketLr()
			this.state = 877
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==OBJECT_NAME) {
				if (true){
				this.state = 876
				paramList()
				}
			}

			this.state = 879
			syntaxBracketRr()
			this.state = 880
			returnMode()
			this.state = 881
			kwReturns()
			this.state = 882
			dataType()
			this.state = 883
			kwLanguage()
			this.state = 884
			language()
			this.state = 885
			kwAs()
			this.state = 886
			codeBlock()
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

	open class CodeBlockContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_codeBlock.id
	        set(value) { throw RuntimeException() }
		fun CODE_BLOCK() : TerminalNode? = getToken(CqlParser.Tokens.CODE_BLOCK.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  codeBlock() : CodeBlockContext {
		var _localctx : CodeBlockContext = CodeBlockContext(context, state)
		enterRule(_localctx, 48, Rules.RULE_codeBlock.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 888
			match(CODE_BLOCK) as Token
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

	open class ParamListContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_paramList.id
	        set(value) { throw RuntimeException() }
		fun findParam() : List<ParamContext> = getRuleContexts(solver.getType("ParamContext"))
		fun findParam(i: Int) : ParamContext? = getRuleContext(solver.getType("ParamContext"),i)
		fun findSyntaxComma() : List<SyntaxCommaContext> = getRuleContexts(solver.getType("SyntaxCommaContext"))
		fun findSyntaxComma(i: Int) : SyntaxCommaContext? = getRuleContext(solver.getType("SyntaxCommaContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  paramList() : ParamListContext {
		var _localctx : ParamListContext = ParamListContext(context, state)
		enterRule(_localctx, 50, Rules.RULE_paramList.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 890
			param()
			this.state = 896
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COMMA) {
				if (true){
				if (true){
				this.state = 891
				syntaxComma()
				this.state = 892
				param()
				}
				}
				this.state = 898
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

	open class ReturnModeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_returnMode.id
	        set(value) { throw RuntimeException() }
		fun findKwOn() : KwOnContext? = getRuleContext(solver.getType("KwOnContext"),0)
		fun findKwNull() : List<KwNullContext> = getRuleContexts(solver.getType("KwNullContext"))
		fun findKwNull(i: Int) : KwNullContext? = getRuleContext(solver.getType("KwNullContext"),i)
		fun findKwInput() : KwInputContext? = getRuleContext(solver.getType("KwInputContext"),0)
		fun findKwCalled() : KwCalledContext? = getRuleContext(solver.getType("KwCalledContext"),0)
		fun findKwReturns() : KwReturnsContext? = getRuleContext(solver.getType("KwReturnsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  returnMode() : ReturnModeContext {
		var _localctx : ReturnModeContext = ReturnModeContext(context, state)
		enterRule(_localctx, 52, Rules.RULE_returnMode.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 903
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			K_CALLED  ->  /*LL1AltBlock*/{if (true){
			this.state = 899
			kwCalled()
			}}
			K_RETURNS  ->  /*LL1AltBlock*/{if (true){
			this.state = 900
			kwReturns()
			this.state = 901
			kwNull()
			}}
			else -> throw NoViableAltException(this)
			}
			this.state = 905
			kwOn()
			this.state = 906
			kwNull()
			this.state = 907
			kwInput()
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

	open class CreateAggregateContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_createAggregate.id
	        set(value) { throw RuntimeException() }
		fun findKwCreate() : KwCreateContext? = getRuleContext(solver.getType("KwCreateContext"),0)
		fun findKwAggregate() : KwAggregateContext? = getRuleContext(solver.getType("KwAggregateContext"),0)
		fun findAggregate() : AggregateContext? = getRuleContext(solver.getType("AggregateContext"),0)
		fun findSyntaxBracketLr() : SyntaxBracketLrContext? = getRuleContext(solver.getType("SyntaxBracketLrContext"),0)
		fun findDataType() : List<DataTypeContext> = getRuleContexts(solver.getType("DataTypeContext"))
		fun findDataType(i: Int) : DataTypeContext? = getRuleContext(solver.getType("DataTypeContext"),i)
		fun findSyntaxBracketRr() : SyntaxBracketRrContext? = getRuleContext(solver.getType("SyntaxBracketRrContext"),0)
		fun findKwSfunc() : KwSfuncContext? = getRuleContext(solver.getType("KwSfuncContext"),0)
		fun findFunction() : List<FunctionContext> = getRuleContexts(solver.getType("FunctionContext"))
		fun findFunction(i: Int) : FunctionContext? = getRuleContext(solver.getType("FunctionContext"),i)
		fun findKwStype() : KwStypeContext? = getRuleContext(solver.getType("KwStypeContext"),0)
		fun findKwFinalfunc() : KwFinalfuncContext? = getRuleContext(solver.getType("KwFinalfuncContext"),0)
		fun findKwInitcond() : KwInitcondContext? = getRuleContext(solver.getType("KwInitcondContext"),0)
		fun findInitCondDefinition() : InitCondDefinitionContext? = getRuleContext(solver.getType("InitCondDefinitionContext"),0)
		fun findOrReplace() : OrReplaceContext? = getRuleContext(solver.getType("OrReplaceContext"),0)
		fun findIfNotExist() : IfNotExistContext? = getRuleContext(solver.getType("IfNotExistContext"),0)
		fun findKeyspace() : KeyspaceContext? = getRuleContext(solver.getType("KeyspaceContext"),0)
		fun DOT() : TerminalNode? = getToken(CqlParser.Tokens.DOT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  createAggregate() : CreateAggregateContext {
		var _localctx : CreateAggregateContext = CreateAggregateContext(context, state)
		enterRule(_localctx, 54, Rules.RULE_createAggregate.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 909
			kwCreate()
			this.state = 911
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_OR) {
				if (true){
				this.state = 910
				orReplace()
				}
			}

			this.state = 913
			kwAggregate()
			this.state = 915
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_IF) {
				if (true){
				this.state = 914
				ifNotExist()
				}
			}

			this.state = 920
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,45,context) ) {
			1   -> if (true){
			this.state = 917
			keyspace()
			this.state = 918
			match(DOT) as Token
			}
			}
			this.state = 922
			aggregate()
			this.state = 923
			syntaxBracketLr()
			this.state = 924
			dataType()
			this.state = 925
			syntaxBracketRr()
			this.state = 926
			kwSfunc()
			this.state = 927
			function()
			this.state = 928
			kwStype()
			this.state = 929
			dataType()
			this.state = 930
			kwFinalfunc()
			this.state = 931
			function()
			this.state = 932
			kwInitcond()
			this.state = 933
			initCondDefinition()
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

	open class InitCondDefinitionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_initCondDefinition.id
	        set(value) { throw RuntimeException() }
		fun findConstant() : ConstantContext? = getRuleContext(solver.getType("ConstantContext"),0)
		fun findInitCondList() : InitCondListContext? = getRuleContext(solver.getType("InitCondListContext"),0)
		fun findInitCondListNested() : InitCondListNestedContext? = getRuleContext(solver.getType("InitCondListNestedContext"),0)
		fun findInitCondHash() : InitCondHashContext? = getRuleContext(solver.getType("InitCondHashContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  initCondDefinition() : InitCondDefinitionContext {
		var _localctx : InitCondDefinitionContext = InitCondDefinitionContext(context, state)
		enterRule(_localctx, 56, Rules.RULE_initCondDefinition.id)
		try {
			this.state = 939
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,46,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 935
			constant()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 936
			initCondList()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 937
			initCondListNested()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 938
			initCondHash()
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

	open class InitCondHashContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_initCondHash.id
	        set(value) { throw RuntimeException() }
		fun findSyntaxBracketLc() : SyntaxBracketLcContext? = getRuleContext(solver.getType("SyntaxBracketLcContext"),0)
		fun findInitCondHashItem() : List<InitCondHashItemContext> = getRuleContexts(solver.getType("InitCondHashItemContext"))
		fun findInitCondHashItem(i: Int) : InitCondHashItemContext? = getRuleContext(solver.getType("InitCondHashItemContext"),i)
		fun findSyntaxBracketRc() : SyntaxBracketRcContext? = getRuleContext(solver.getType("SyntaxBracketRcContext"),0)
		fun findSyntaxComma() : List<SyntaxCommaContext> = getRuleContexts(solver.getType("SyntaxCommaContext"))
		fun findSyntaxComma(i: Int) : SyntaxCommaContext? = getRuleContext(solver.getType("SyntaxCommaContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  initCondHash() : InitCondHashContext {
		var _localctx : InitCondHashContext = InitCondHashContext(context, state)
		enterRule(_localctx, 58, Rules.RULE_initCondHash.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 941
			syntaxBracketLc()
			this.state = 942
			initCondHashItem()
			this.state = 948
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COMMA) {
				if (true){
				if (true){
				this.state = 943
				syntaxComma()
				this.state = 944
				initCondHashItem()
				}
				}
				this.state = 950
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 951
			syntaxBracketRc()
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

	open class InitCondHashItemContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_initCondHashItem.id
	        set(value) { throw RuntimeException() }
		fun findHashKey() : HashKeyContext? = getRuleContext(solver.getType("HashKeyContext"),0)
		fun COLON() : TerminalNode? = getToken(CqlParser.Tokens.COLON.id, 0)
		fun findInitCondDefinition() : InitCondDefinitionContext? = getRuleContext(solver.getType("InitCondDefinitionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  initCondHashItem() : InitCondHashItemContext {
		var _localctx : InitCondHashItemContext = InitCondHashItemContext(context, state)
		enterRule(_localctx, 60, Rules.RULE_initCondHashItem.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 953
			hashKey()
			this.state = 954
			match(COLON) as Token
			this.state = 955
			initCondDefinition()
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

	open class InitCondListNestedContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_initCondListNested.id
	        set(value) { throw RuntimeException() }
		fun findSyntaxBracketLr() : SyntaxBracketLrContext? = getRuleContext(solver.getType("SyntaxBracketLrContext"),0)
		fun findInitCondList() : List<InitCondListContext> = getRuleContexts(solver.getType("InitCondListContext"))
		fun findInitCondList(i: Int) : InitCondListContext? = getRuleContext(solver.getType("InitCondListContext"),i)
		fun findSyntaxBracketRr() : SyntaxBracketRrContext? = getRuleContext(solver.getType("SyntaxBracketRrContext"),0)
		fun findSyntaxComma() : List<SyntaxCommaContext> = getRuleContexts(solver.getType("SyntaxCommaContext"))
		fun findSyntaxComma(i: Int) : SyntaxCommaContext? = getRuleContext(solver.getType("SyntaxCommaContext"),i)
		fun findConstant() : List<ConstantContext> = getRuleContexts(solver.getType("ConstantContext"))
		fun findConstant(i: Int) : ConstantContext? = getRuleContext(solver.getType("ConstantContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  initCondListNested() : InitCondListNestedContext {
		var _localctx : InitCondListNestedContext = InitCondListNestedContext(context, state)
		enterRule(_localctx, 62, Rules.RULE_initCondListNested.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 957
			syntaxBracketLr()
			this.state = 958
			initCondList()
			this.state = 965
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LR_BRACKET || _la==COMMA) {
				if (true){
				this.state = 963
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				COMMA  ->  /*LL1AltBlock*/{if (true){
				this.state = 959
				syntaxComma()
				this.state = 960
				constant()
				}}
				LR_BRACKET  ->  /*LL1AltBlock*/{if (true){
				this.state = 962
				initCondList()
				}}
				else -> throw NoViableAltException(this)
				}
				}
				this.state = 967
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 968
			syntaxBracketRr()
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

	open class InitCondListContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_initCondList.id
	        set(value) { throw RuntimeException() }
		fun findSyntaxBracketLr() : SyntaxBracketLrContext? = getRuleContext(solver.getType("SyntaxBracketLrContext"),0)
		fun findConstant() : List<ConstantContext> = getRuleContexts(solver.getType("ConstantContext"))
		fun findConstant(i: Int) : ConstantContext? = getRuleContext(solver.getType("ConstantContext"),i)
		fun findSyntaxBracketRr() : SyntaxBracketRrContext? = getRuleContext(solver.getType("SyntaxBracketRrContext"),0)
		fun findSyntaxComma() : List<SyntaxCommaContext> = getRuleContexts(solver.getType("SyntaxCommaContext"))
		fun findSyntaxComma(i: Int) : SyntaxCommaContext? = getRuleContext(solver.getType("SyntaxCommaContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  initCondList() : InitCondListContext {
		var _localctx : InitCondListContext = InitCondListContext(context, state)
		enterRule(_localctx, 64, Rules.RULE_initCondList.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 970
			syntaxBracketLr()
			this.state = 971
			constant()
			this.state = 977
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COMMA) {
				if (true){
				if (true){
				this.state = 972
				syntaxComma()
				this.state = 973
				constant()
				}
				}
				this.state = 979
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 980
			syntaxBracketRr()
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

	open class OrReplaceContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_orReplace.id
	        set(value) { throw RuntimeException() }
		fun findKwOr() : KwOrContext? = getRuleContext(solver.getType("KwOrContext"),0)
		fun findKwReplace() : KwReplaceContext? = getRuleContext(solver.getType("KwReplaceContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  orReplace() : OrReplaceContext {
		var _localctx : OrReplaceContext = OrReplaceContext(context, state)
		enterRule(_localctx, 66, Rules.RULE_orReplace.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 982
			kwOr()
			this.state = 983
			kwReplace()
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

	open class AlterUserContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_alterUser.id
	        set(value) { throw RuntimeException() }
		fun findKwAlter() : KwAlterContext? = getRuleContext(solver.getType("KwAlterContext"),0)
		fun findKwUser() : KwUserContext? = getRuleContext(solver.getType("KwUserContext"),0)
		fun findUser() : UserContext? = getRuleContext(solver.getType("UserContext"),0)
		fun findKwWith() : KwWithContext? = getRuleContext(solver.getType("KwWithContext"),0)
		fun findUserPassword() : UserPasswordContext? = getRuleContext(solver.getType("UserPasswordContext"),0)
		fun findUserSuperUser() : UserSuperUserContext? = getRuleContext(solver.getType("UserSuperUserContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  alterUser() : AlterUserContext {
		var _localctx : AlterUserContext = AlterUserContext(context, state)
		enterRule(_localctx, 68, Rules.RULE_alterUser.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 985
			kwAlter()
			this.state = 986
			kwUser()
			this.state = 987
			user()
			this.state = 988
			kwWith()
			this.state = 989
			userPassword()
			this.state = 991
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_NOSUPERUSER || _la==K_SUPERUSER) {
				if (true){
				this.state = 990
				userSuperUser()
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

	open class UserPasswordContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_userPassword.id
	        set(value) { throw RuntimeException() }
		fun findKwPassword() : KwPasswordContext? = getRuleContext(solver.getType("KwPasswordContext"),0)
		fun findStringLiteral() : StringLiteralContext? = getRuleContext(solver.getType("StringLiteralContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  userPassword() : UserPasswordContext {
		var _localctx : UserPasswordContext = UserPasswordContext(context, state)
		enterRule(_localctx, 70, Rules.RULE_userPassword.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 993
			kwPassword()
			this.state = 994
			stringLiteral()
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

	open class UserSuperUserContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_userSuperUser.id
	        set(value) { throw RuntimeException() }
		fun findKwSuperuser() : KwSuperuserContext? = getRuleContext(solver.getType("KwSuperuserContext"),0)
		fun findKwNosuperuser() : KwNosuperuserContext? = getRuleContext(solver.getType("KwNosuperuserContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  userSuperUser() : UserSuperUserContext {
		var _localctx : UserSuperUserContext = UserSuperUserContext(context, state)
		enterRule(_localctx, 72, Rules.RULE_userSuperUser.id)
		try {
			this.state = 998
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			K_SUPERUSER  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 996
			kwSuperuser()
			}}
			K_NOSUPERUSER  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 997
			kwNosuperuser()
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

	open class AlterTypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_alterType.id
	        set(value) { throw RuntimeException() }
		fun findKwAlter() : KwAlterContext? = getRuleContext(solver.getType("KwAlterContext"),0)
		fun findKwType() : KwTypeContext? = getRuleContext(solver.getType("KwTypeContext"),0)
		fun findType() : TypeContext? = getRuleContext(solver.getType("TypeContext"),0)
		fun findAlterTypeOperation() : AlterTypeOperationContext? = getRuleContext(solver.getType("AlterTypeOperationContext"),0)
		fun findKeyspace() : KeyspaceContext? = getRuleContext(solver.getType("KeyspaceContext"),0)
		fun DOT() : TerminalNode? = getToken(CqlParser.Tokens.DOT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  alterType() : AlterTypeContext {
		var _localctx : AlterTypeContext = AlterTypeContext(context, state)
		enterRule(_localctx, 74, Rules.RULE_alterType.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1000
			kwAlter()
			this.state = 1001
			kwType()
			this.state = 1005
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,53,context) ) {
			1   -> if (true){
			this.state = 1002
			keyspace()
			this.state = 1003
			match(DOT) as Token
			}
			}
			this.state = 1007
			type()
			this.state = 1008
			alterTypeOperation()
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

	open class AlterTypeOperationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_alterTypeOperation.id
	        set(value) { throw RuntimeException() }
		fun findAlterTypeAlterType() : AlterTypeAlterTypeContext? = getRuleContext(solver.getType("AlterTypeAlterTypeContext"),0)
		fun findAlterTypeAdd() : AlterTypeAddContext? = getRuleContext(solver.getType("AlterTypeAddContext"),0)
		fun findAlterTypeRename() : AlterTypeRenameContext? = getRuleContext(solver.getType("AlterTypeRenameContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  alterTypeOperation() : AlterTypeOperationContext {
		var _localctx : AlterTypeOperationContext = AlterTypeOperationContext(context, state)
		enterRule(_localctx, 76, Rules.RULE_alterTypeOperation.id)
		try {
			this.state = 1013
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			K_ALTER  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1010
			alterTypeAlterType()
			}}
			K_ADD  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1011
			alterTypeAdd()
			}}
			K_RENAME  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 1012
			alterTypeRename()
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

	open class AlterTypeRenameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_alterTypeRename.id
	        set(value) { throw RuntimeException() }
		fun findKwRename() : KwRenameContext? = getRuleContext(solver.getType("KwRenameContext"),0)
		fun findAlterTypeRenameList() : AlterTypeRenameListContext? = getRuleContext(solver.getType("AlterTypeRenameListContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  alterTypeRename() : AlterTypeRenameContext {
		var _localctx : AlterTypeRenameContext = AlterTypeRenameContext(context, state)
		enterRule(_localctx, 78, Rules.RULE_alterTypeRename.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1015
			kwRename()
			this.state = 1016
			alterTypeRenameList()
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

	open class AlterTypeRenameListContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_alterTypeRenameList.id
	        set(value) { throw RuntimeException() }
		fun findAlterTypeRenameItem() : List<AlterTypeRenameItemContext> = getRuleContexts(solver.getType("AlterTypeRenameItemContext"))
		fun findAlterTypeRenameItem(i: Int) : AlterTypeRenameItemContext? = getRuleContext(solver.getType("AlterTypeRenameItemContext"),i)
		fun findKwAnd() : List<KwAndContext> = getRuleContexts(solver.getType("KwAndContext"))
		fun findKwAnd(i: Int) : KwAndContext? = getRuleContext(solver.getType("KwAndContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  alterTypeRenameList() : AlterTypeRenameListContext {
		var _localctx : AlterTypeRenameListContext = AlterTypeRenameListContext(context, state)
		enterRule(_localctx, 80, Rules.RULE_alterTypeRenameList.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1018
			alterTypeRenameItem()
			this.state = 1024
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==K_AND) {
				if (true){
				if (true){
				this.state = 1019
				kwAnd()
				this.state = 1020
				alterTypeRenameItem()
				}
				}
				this.state = 1026
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

	open class AlterTypeRenameItemContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_alterTypeRenameItem.id
	        set(value) { throw RuntimeException() }
		fun findColumn() : List<ColumnContext> = getRuleContexts(solver.getType("ColumnContext"))
		fun findColumn(i: Int) : ColumnContext? = getRuleContext(solver.getType("ColumnContext"),i)
		fun findKwTo() : KwToContext? = getRuleContext(solver.getType("KwToContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  alterTypeRenameItem() : AlterTypeRenameItemContext {
		var _localctx : AlterTypeRenameItemContext = AlterTypeRenameItemContext(context, state)
		enterRule(_localctx, 82, Rules.RULE_alterTypeRenameItem.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1027
			column()
			this.state = 1028
			kwTo()
			this.state = 1029
			column()
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

	open class AlterTypeAddContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_alterTypeAdd.id
	        set(value) { throw RuntimeException() }
		fun findKwAdd() : KwAddContext? = getRuleContext(solver.getType("KwAddContext"),0)
		fun findColumn() : List<ColumnContext> = getRuleContexts(solver.getType("ColumnContext"))
		fun findColumn(i: Int) : ColumnContext? = getRuleContext(solver.getType("ColumnContext"),i)
		fun findDataType() : List<DataTypeContext> = getRuleContexts(solver.getType("DataTypeContext"))
		fun findDataType(i: Int) : DataTypeContext? = getRuleContext(solver.getType("DataTypeContext"),i)
		fun findSyntaxComma() : List<SyntaxCommaContext> = getRuleContexts(solver.getType("SyntaxCommaContext"))
		fun findSyntaxComma(i: Int) : SyntaxCommaContext? = getRuleContext(solver.getType("SyntaxCommaContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  alterTypeAdd() : AlterTypeAddContext {
		var _localctx : AlterTypeAddContext = AlterTypeAddContext(context, state)
		enterRule(_localctx, 84, Rules.RULE_alterTypeAdd.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1031
			kwAdd()
			this.state = 1032
			column()
			this.state = 1033
			dataType()
			this.state = 1040
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COMMA) {
				if (true){
				if (true){
				this.state = 1034
				syntaxComma()
				this.state = 1035
				column()
				this.state = 1036
				dataType()
				}
				}
				this.state = 1042
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

	open class AlterTypeAlterTypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_alterTypeAlterType.id
	        set(value) { throw RuntimeException() }
		fun findKwAlter() : KwAlterContext? = getRuleContext(solver.getType("KwAlterContext"),0)
		fun findColumn() : ColumnContext? = getRuleContext(solver.getType("ColumnContext"),0)
		fun findKwType() : KwTypeContext? = getRuleContext(solver.getType("KwTypeContext"),0)
		fun findDataType() : DataTypeContext? = getRuleContext(solver.getType("DataTypeContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  alterTypeAlterType() : AlterTypeAlterTypeContext {
		var _localctx : AlterTypeAlterTypeContext = AlterTypeAlterTypeContext(context, state)
		enterRule(_localctx, 86, Rules.RULE_alterTypeAlterType.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1043
			kwAlter()
			this.state = 1044
			column()
			this.state = 1045
			kwType()
			this.state = 1046
			dataType()
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

	open class AlterTableContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_alterTable.id
	        set(value) { throw RuntimeException() }
		fun findKwAlter() : KwAlterContext? = getRuleContext(solver.getType("KwAlterContext"),0)
		fun findKwTable() : KwTableContext? = getRuleContext(solver.getType("KwTableContext"),0)
		fun findTable() : TableContext? = getRuleContext(solver.getType("TableContext"),0)
		fun findAlterTableOperation() : AlterTableOperationContext? = getRuleContext(solver.getType("AlterTableOperationContext"),0)
		fun findKeyspace() : KeyspaceContext? = getRuleContext(solver.getType("KeyspaceContext"),0)
		fun DOT() : TerminalNode? = getToken(CqlParser.Tokens.DOT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  alterTable() : AlterTableContext {
		var _localctx : AlterTableContext = AlterTableContext(context, state)
		enterRule(_localctx, 88, Rules.RULE_alterTable.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1048
			kwAlter()
			this.state = 1049
			kwTable()
			this.state = 1053
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,57,context) ) {
			1   -> if (true){
			this.state = 1050
			keyspace()
			this.state = 1051
			match(DOT) as Token
			}
			}
			this.state = 1055
			table()
			this.state = 1056
			alterTableOperation()
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

	open class AlterTableOperationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_alterTableOperation.id
	        set(value) { throw RuntimeException() }
		fun findAlterTableAdd() : AlterTableAddContext? = getRuleContext(solver.getType("AlterTableAddContext"),0)
		fun findAlterTableDropColumns() : AlterTableDropColumnsContext? = getRuleContext(solver.getType("AlterTableDropColumnsContext"),0)
		fun findAlterTableDropCompactStorage() : AlterTableDropCompactStorageContext? = getRuleContext(solver.getType("AlterTableDropCompactStorageContext"),0)
		fun findAlterTableRename() : AlterTableRenameContext? = getRuleContext(solver.getType("AlterTableRenameContext"),0)
		fun findAlterTableWith() : AlterTableWithContext? = getRuleContext(solver.getType("AlterTableWithContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  alterTableOperation() : AlterTableOperationContext {
		var _localctx : AlterTableOperationContext = AlterTableOperationContext(context, state)
		enterRule(_localctx, 90, Rules.RULE_alterTableOperation.id)
		try {
			this.state = 1064
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,58,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1058
			alterTableAdd()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1059
			alterTableDropColumns()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 1060
			alterTableDropColumns()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 1061
			alterTableDropCompactStorage()
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 1062
			alterTableRename()
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 1063
			alterTableWith()
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

	open class AlterTableWithContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_alterTableWith.id
	        set(value) { throw RuntimeException() }
		fun findKwWith() : KwWithContext? = getRuleContext(solver.getType("KwWithContext"),0)
		fun findTableOptions() : TableOptionsContext? = getRuleContext(solver.getType("TableOptionsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  alterTableWith() : AlterTableWithContext {
		var _localctx : AlterTableWithContext = AlterTableWithContext(context, state)
		enterRule(_localctx, 92, Rules.RULE_alterTableWith.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1066
			kwWith()
			this.state = 1067
			tableOptions()
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

	open class AlterTableRenameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_alterTableRename.id
	        set(value) { throw RuntimeException() }
		fun findKwRename() : KwRenameContext? = getRuleContext(solver.getType("KwRenameContext"),0)
		fun findColumn() : List<ColumnContext> = getRuleContexts(solver.getType("ColumnContext"))
		fun findColumn(i: Int) : ColumnContext? = getRuleContext(solver.getType("ColumnContext"),i)
		fun findKwTo() : KwToContext? = getRuleContext(solver.getType("KwToContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  alterTableRename() : AlterTableRenameContext {
		var _localctx : AlterTableRenameContext = AlterTableRenameContext(context, state)
		enterRule(_localctx, 94, Rules.RULE_alterTableRename.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1069
			kwRename()
			this.state = 1070
			column()
			this.state = 1071
			kwTo()
			this.state = 1072
			column()
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

	open class AlterTableDropCompactStorageContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_alterTableDropCompactStorage.id
	        set(value) { throw RuntimeException() }
		fun findKwDrop() : KwDropContext? = getRuleContext(solver.getType("KwDropContext"),0)
		fun findKwCompact() : KwCompactContext? = getRuleContext(solver.getType("KwCompactContext"),0)
		fun findKwStorage() : KwStorageContext? = getRuleContext(solver.getType("KwStorageContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  alterTableDropCompactStorage() : AlterTableDropCompactStorageContext {
		var _localctx : AlterTableDropCompactStorageContext = AlterTableDropCompactStorageContext(context, state)
		enterRule(_localctx, 96, Rules.RULE_alterTableDropCompactStorage.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1074
			kwDrop()
			this.state = 1075
			kwCompact()
			this.state = 1076
			kwStorage()
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

	open class AlterTableDropColumnsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_alterTableDropColumns.id
	        set(value) { throw RuntimeException() }
		fun findKwDrop() : KwDropContext? = getRuleContext(solver.getType("KwDropContext"),0)
		fun findAlterTableDropColumnList() : AlterTableDropColumnListContext? = getRuleContext(solver.getType("AlterTableDropColumnListContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  alterTableDropColumns() : AlterTableDropColumnsContext {
		var _localctx : AlterTableDropColumnsContext = AlterTableDropColumnsContext(context, state)
		enterRule(_localctx, 98, Rules.RULE_alterTableDropColumns.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1078
			kwDrop()
			this.state = 1079
			alterTableDropColumnList()
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

	open class AlterTableDropColumnListContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_alterTableDropColumnList.id
	        set(value) { throw RuntimeException() }
		fun findColumn() : List<ColumnContext> = getRuleContexts(solver.getType("ColumnContext"))
		fun findColumn(i: Int) : ColumnContext? = getRuleContext(solver.getType("ColumnContext"),i)
		fun findSyntaxComma() : List<SyntaxCommaContext> = getRuleContexts(solver.getType("SyntaxCommaContext"))
		fun findSyntaxComma(i: Int) : SyntaxCommaContext? = getRuleContext(solver.getType("SyntaxCommaContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  alterTableDropColumnList() : AlterTableDropColumnListContext {
		var _localctx : AlterTableDropColumnListContext = AlterTableDropColumnListContext(context, state)
		enterRule(_localctx, 100, Rules.RULE_alterTableDropColumnList.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1081
			column()
			this.state = 1087
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COMMA) {
				if (true){
				if (true){
				this.state = 1082
				syntaxComma()
				this.state = 1083
				column()
				}
				}
				this.state = 1089
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

	open class AlterTableAddContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_alterTableAdd.id
	        set(value) { throw RuntimeException() }
		fun findKwAdd() : KwAddContext? = getRuleContext(solver.getType("KwAddContext"),0)
		fun findAlterTableColumnDefinition() : AlterTableColumnDefinitionContext? = getRuleContext(solver.getType("AlterTableColumnDefinitionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  alterTableAdd() : AlterTableAddContext {
		var _localctx : AlterTableAddContext = AlterTableAddContext(context, state)
		enterRule(_localctx, 102, Rules.RULE_alterTableAdd.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1090
			kwAdd()
			this.state = 1091
			alterTableColumnDefinition()
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

	open class AlterTableColumnDefinitionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_alterTableColumnDefinition.id
	        set(value) { throw RuntimeException() }
		fun findColumn() : List<ColumnContext> = getRuleContexts(solver.getType("ColumnContext"))
		fun findColumn(i: Int) : ColumnContext? = getRuleContext(solver.getType("ColumnContext"),i)
		fun findDataType() : List<DataTypeContext> = getRuleContexts(solver.getType("DataTypeContext"))
		fun findDataType(i: Int) : DataTypeContext? = getRuleContext(solver.getType("DataTypeContext"),i)
		fun findSyntaxComma() : List<SyntaxCommaContext> = getRuleContexts(solver.getType("SyntaxCommaContext"))
		fun findSyntaxComma(i: Int) : SyntaxCommaContext? = getRuleContext(solver.getType("SyntaxCommaContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  alterTableColumnDefinition() : AlterTableColumnDefinitionContext {
		var _localctx : AlterTableColumnDefinitionContext = AlterTableColumnDefinitionContext(context, state)
		enterRule(_localctx, 104, Rules.RULE_alterTableColumnDefinition.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1093
			column()
			this.state = 1094
			dataType()
			this.state = 1101
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COMMA) {
				if (true){
				if (true){
				this.state = 1095
				syntaxComma()
				this.state = 1096
				column()
				this.state = 1097
				dataType()
				}
				}
				this.state = 1103
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

	open class AlterRoleContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_alterRole.id
	        set(value) { throw RuntimeException() }
		fun findKwAlter() : KwAlterContext? = getRuleContext(solver.getType("KwAlterContext"),0)
		fun findKwRole() : KwRoleContext? = getRuleContext(solver.getType("KwRoleContext"),0)
		fun findRole() : RoleContext? = getRuleContext(solver.getType("RoleContext"),0)
		fun findRoleWith() : RoleWithContext? = getRuleContext(solver.getType("RoleWithContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  alterRole() : AlterRoleContext {
		var _localctx : AlterRoleContext = AlterRoleContext(context, state)
		enterRule(_localctx, 106, Rules.RULE_alterRole.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1104
			kwAlter()
			this.state = 1105
			kwRole()
			this.state = 1106
			role()
			this.state = 1108
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_WITH) {
				if (true){
				this.state = 1107
				roleWith()
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

	open class RoleWithContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_roleWith.id
	        set(value) { throw RuntimeException() }
		fun findKwWith() : KwWithContext? = getRuleContext(solver.getType("KwWithContext"),0)
		fun findRoleWithOptions() : List<RoleWithOptionsContext> = getRuleContexts(solver.getType("RoleWithOptionsContext"))
		fun findRoleWithOptions(i: Int) : RoleWithOptionsContext? = getRuleContext(solver.getType("RoleWithOptionsContext"),i)
		fun findKwAnd() : List<KwAndContext> = getRuleContexts(solver.getType("KwAndContext"))
		fun findKwAnd(i: Int) : KwAndContext? = getRuleContext(solver.getType("KwAndContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  roleWith() : RoleWithContext {
		var _localctx : RoleWithContext = RoleWithContext(context, state)
		enterRule(_localctx, 108, Rules.RULE_roleWith.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1110
			kwWith()
			if (true){
			this.state = 1111
			roleWithOptions()
			this.state = 1117
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==K_AND) {
				if (true){
				if (true){
				this.state = 1112
				kwAnd()
				this.state = 1113
				roleWithOptions()
				}
				}
				this.state = 1119
				errorHandler.sync(this)
				_la = _input!!.LA(1)
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

	open class RoleWithOptionsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_roleWithOptions.id
	        set(value) { throw RuntimeException() }
		fun findKwPassword() : KwPasswordContext? = getRuleContext(solver.getType("KwPasswordContext"),0)
		fun OPERATOR_EQ() : TerminalNode? = getToken(CqlParser.Tokens.OPERATOR_EQ.id, 0)
		fun findStringLiteral() : StringLiteralContext? = getRuleContext(solver.getType("StringLiteralContext"),0)
		fun findKwLogin() : KwLoginContext? = getRuleContext(solver.getType("KwLoginContext"),0)
		fun findBooleanLiteral() : BooleanLiteralContext? = getRuleContext(solver.getType("BooleanLiteralContext"),0)
		fun findKwSuperuser() : KwSuperuserContext? = getRuleContext(solver.getType("KwSuperuserContext"),0)
		fun findKwOptions() : KwOptionsContext? = getRuleContext(solver.getType("KwOptionsContext"),0)
		fun findOptionHash() : OptionHashContext? = getRuleContext(solver.getType("OptionHashContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  roleWithOptions() : RoleWithOptionsContext {
		var _localctx : RoleWithOptionsContext = RoleWithOptionsContext(context, state)
		enterRule(_localctx, 110, Rules.RULE_roleWithOptions.id)
		try {
			this.state = 1136
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			K_PASSWORD  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1120
			kwPassword()
			this.state = 1121
			match(OPERATOR_EQ) as Token
			this.state = 1122
			stringLiteral()
			}}
			K_LOGIN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1124
			kwLogin()
			this.state = 1125
			match(OPERATOR_EQ) as Token
			this.state = 1126
			booleanLiteral()
			}}
			K_SUPERUSER  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 1128
			kwSuperuser()
			this.state = 1129
			match(OPERATOR_EQ) as Token
			this.state = 1130
			booleanLiteral()
			}}
			K_OPTIONS  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 1132
			kwOptions()
			this.state = 1133
			match(OPERATOR_EQ) as Token
			this.state = 1134
			optionHash()
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

	open class AlterMaterializedViewContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_alterMaterializedView.id
	        set(value) { throw RuntimeException() }
		fun findKwAlter() : KwAlterContext? = getRuleContext(solver.getType("KwAlterContext"),0)
		fun findKwMaterialized() : KwMaterializedContext? = getRuleContext(solver.getType("KwMaterializedContext"),0)
		fun findKwView() : KwViewContext? = getRuleContext(solver.getType("KwViewContext"),0)
		fun findMaterializedView() : MaterializedViewContext? = getRuleContext(solver.getType("MaterializedViewContext"),0)
		fun findKeyspace() : KeyspaceContext? = getRuleContext(solver.getType("KeyspaceContext"),0)
		fun DOT() : TerminalNode? = getToken(CqlParser.Tokens.DOT.id, 0)
		fun findKwWith() : KwWithContext? = getRuleContext(solver.getType("KwWithContext"),0)
		fun findTableOptions() : TableOptionsContext? = getRuleContext(solver.getType("TableOptionsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  alterMaterializedView() : AlterMaterializedViewContext {
		var _localctx : AlterMaterializedViewContext = AlterMaterializedViewContext(context, state)
		enterRule(_localctx, 112, Rules.RULE_alterMaterializedView.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1138
			kwAlter()
			this.state = 1139
			kwMaterialized()
			this.state = 1140
			kwView()
			this.state = 1144
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,64,context) ) {
			1   -> if (true){
			this.state = 1141
			keyspace()
			this.state = 1142
			match(DOT) as Token
			}
			}
			this.state = 1146
			materializedView()
			this.state = 1150
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_WITH) {
				if (true){
				this.state = 1147
				kwWith()
				this.state = 1148
				tableOptions()
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

	open class DropUserContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_dropUser.id
	        set(value) { throw RuntimeException() }
		fun findKwDrop() : KwDropContext? = getRuleContext(solver.getType("KwDropContext"),0)
		fun findKwUser() : KwUserContext? = getRuleContext(solver.getType("KwUserContext"),0)
		fun findUser() : UserContext? = getRuleContext(solver.getType("UserContext"),0)
		fun findIfExist() : IfExistContext? = getRuleContext(solver.getType("IfExistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  dropUser() : DropUserContext {
		var _localctx : DropUserContext = DropUserContext(context, state)
		enterRule(_localctx, 114, Rules.RULE_dropUser.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1152
			kwDrop()
			this.state = 1153
			kwUser()
			this.state = 1155
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_IF) {
				if (true){
				this.state = 1154
				ifExist()
				}
			}

			this.state = 1157
			user()
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

	open class DropTypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_dropType.id
	        set(value) { throw RuntimeException() }
		fun findKwDrop() : KwDropContext? = getRuleContext(solver.getType("KwDropContext"),0)
		fun findKwType() : KwTypeContext? = getRuleContext(solver.getType("KwTypeContext"),0)
		fun findType() : TypeContext? = getRuleContext(solver.getType("TypeContext"),0)
		fun findIfExist() : IfExistContext? = getRuleContext(solver.getType("IfExistContext"),0)
		fun findKeyspace() : KeyspaceContext? = getRuleContext(solver.getType("KeyspaceContext"),0)
		fun DOT() : TerminalNode? = getToken(CqlParser.Tokens.DOT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  dropType() : DropTypeContext {
		var _localctx : DropTypeContext = DropTypeContext(context, state)
		enterRule(_localctx, 116, Rules.RULE_dropType.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1159
			kwDrop()
			this.state = 1160
			kwType()
			this.state = 1162
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_IF) {
				if (true){
				this.state = 1161
				ifExist()
				}
			}

			this.state = 1167
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,68,context) ) {
			1   -> if (true){
			this.state = 1164
			keyspace()
			this.state = 1165
			match(DOT) as Token
			}
			}
			this.state = 1169
			type()
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

	open class DropMaterializedViewContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_dropMaterializedView.id
	        set(value) { throw RuntimeException() }
		fun findKwDrop() : KwDropContext? = getRuleContext(solver.getType("KwDropContext"),0)
		fun findKwMaterialized() : KwMaterializedContext? = getRuleContext(solver.getType("KwMaterializedContext"),0)
		fun findKwView() : KwViewContext? = getRuleContext(solver.getType("KwViewContext"),0)
		fun findMaterializedView() : MaterializedViewContext? = getRuleContext(solver.getType("MaterializedViewContext"),0)
		fun findIfExist() : IfExistContext? = getRuleContext(solver.getType("IfExistContext"),0)
		fun findKeyspace() : KeyspaceContext? = getRuleContext(solver.getType("KeyspaceContext"),0)
		fun DOT() : TerminalNode? = getToken(CqlParser.Tokens.DOT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  dropMaterializedView() : DropMaterializedViewContext {
		var _localctx : DropMaterializedViewContext = DropMaterializedViewContext(context, state)
		enterRule(_localctx, 118, Rules.RULE_dropMaterializedView.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1171
			kwDrop()
			this.state = 1172
			kwMaterialized()
			this.state = 1173
			kwView()
			this.state = 1175
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_IF) {
				if (true){
				this.state = 1174
				ifExist()
				}
			}

			this.state = 1180
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,70,context) ) {
			1   -> if (true){
			this.state = 1177
			keyspace()
			this.state = 1178
			match(DOT) as Token
			}
			}
			this.state = 1182
			materializedView()
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

	open class DropAggregateContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_dropAggregate.id
	        set(value) { throw RuntimeException() }
		fun findKwDrop() : KwDropContext? = getRuleContext(solver.getType("KwDropContext"),0)
		fun findKwAggregate() : KwAggregateContext? = getRuleContext(solver.getType("KwAggregateContext"),0)
		fun findAggregate() : AggregateContext? = getRuleContext(solver.getType("AggregateContext"),0)
		fun findIfExist() : IfExistContext? = getRuleContext(solver.getType("IfExistContext"),0)
		fun findKeyspace() : KeyspaceContext? = getRuleContext(solver.getType("KeyspaceContext"),0)
		fun DOT() : TerminalNode? = getToken(CqlParser.Tokens.DOT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  dropAggregate() : DropAggregateContext {
		var _localctx : DropAggregateContext = DropAggregateContext(context, state)
		enterRule(_localctx, 120, Rules.RULE_dropAggregate.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1184
			kwDrop()
			this.state = 1185
			kwAggregate()
			this.state = 1187
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_IF) {
				if (true){
				this.state = 1186
				ifExist()
				}
			}

			this.state = 1192
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,72,context) ) {
			1   -> if (true){
			this.state = 1189
			keyspace()
			this.state = 1190
			match(DOT) as Token
			}
			}
			this.state = 1194
			aggregate()
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

	open class DropFunctionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_dropFunction.id
	        set(value) { throw RuntimeException() }
		fun findKwDrop() : KwDropContext? = getRuleContext(solver.getType("KwDropContext"),0)
		fun findKwFunction() : KwFunctionContext? = getRuleContext(solver.getType("KwFunctionContext"),0)
		fun findFunction() : FunctionContext? = getRuleContext(solver.getType("FunctionContext"),0)
		fun findIfExist() : IfExistContext? = getRuleContext(solver.getType("IfExistContext"),0)
		fun findKeyspace() : KeyspaceContext? = getRuleContext(solver.getType("KeyspaceContext"),0)
		fun DOT() : TerminalNode? = getToken(CqlParser.Tokens.DOT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  dropFunction() : DropFunctionContext {
		var _localctx : DropFunctionContext = DropFunctionContext(context, state)
		enterRule(_localctx, 122, Rules.RULE_dropFunction.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1196
			kwDrop()
			this.state = 1197
			kwFunction()
			this.state = 1199
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_IF) {
				if (true){
				this.state = 1198
				ifExist()
				}
			}

			this.state = 1204
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,74,context) ) {
			1   -> if (true){
			this.state = 1201
			keyspace()
			this.state = 1202
			match(DOT) as Token
			}
			}
			this.state = 1206
			function()
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

	open class DropTriggerContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_dropTrigger.id
	        set(value) { throw RuntimeException() }
		fun findKwDrop() : KwDropContext? = getRuleContext(solver.getType("KwDropContext"),0)
		fun findKwTrigger() : KwTriggerContext? = getRuleContext(solver.getType("KwTriggerContext"),0)
		fun findTrigger() : TriggerContext? = getRuleContext(solver.getType("TriggerContext"),0)
		fun findKwOn() : KwOnContext? = getRuleContext(solver.getType("KwOnContext"),0)
		fun findTable() : TableContext? = getRuleContext(solver.getType("TableContext"),0)
		fun findIfExist() : IfExistContext? = getRuleContext(solver.getType("IfExistContext"),0)
		fun findKeyspace() : KeyspaceContext? = getRuleContext(solver.getType("KeyspaceContext"),0)
		fun DOT() : TerminalNode? = getToken(CqlParser.Tokens.DOT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  dropTrigger() : DropTriggerContext {
		var _localctx : DropTriggerContext = DropTriggerContext(context, state)
		enterRule(_localctx, 124, Rules.RULE_dropTrigger.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1208
			kwDrop()
			this.state = 1209
			kwTrigger()
			this.state = 1211
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_IF) {
				if (true){
				this.state = 1210
				ifExist()
				}
			}

			this.state = 1213
			trigger()
			this.state = 1214
			kwOn()
			this.state = 1218
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,76,context) ) {
			1   -> if (true){
			this.state = 1215
			keyspace()
			this.state = 1216
			match(DOT) as Token
			}
			}
			this.state = 1220
			table()
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

	open class DropRoleContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_dropRole.id
	        set(value) { throw RuntimeException() }
		fun findKwDrop() : KwDropContext? = getRuleContext(solver.getType("KwDropContext"),0)
		fun findKwRole() : KwRoleContext? = getRuleContext(solver.getType("KwRoleContext"),0)
		fun findRole() : RoleContext? = getRuleContext(solver.getType("RoleContext"),0)
		fun findIfExist() : IfExistContext? = getRuleContext(solver.getType("IfExistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  dropRole() : DropRoleContext {
		var _localctx : DropRoleContext = DropRoleContext(context, state)
		enterRule(_localctx, 126, Rules.RULE_dropRole.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1222
			kwDrop()
			this.state = 1223
			kwRole()
			this.state = 1225
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_IF) {
				if (true){
				this.state = 1224
				ifExist()
				}
			}

			this.state = 1227
			role()
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

	open class DropTableContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_dropTable.id
	        set(value) { throw RuntimeException() }
		fun findKwDrop() : KwDropContext? = getRuleContext(solver.getType("KwDropContext"),0)
		fun findKwTable() : KwTableContext? = getRuleContext(solver.getType("KwTableContext"),0)
		fun findTable() : TableContext? = getRuleContext(solver.getType("TableContext"),0)
		fun findIfExist() : IfExistContext? = getRuleContext(solver.getType("IfExistContext"),0)
		fun findKeyspace() : KeyspaceContext? = getRuleContext(solver.getType("KeyspaceContext"),0)
		fun DOT() : TerminalNode? = getToken(CqlParser.Tokens.DOT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  dropTable() : DropTableContext {
		var _localctx : DropTableContext = DropTableContext(context, state)
		enterRule(_localctx, 128, Rules.RULE_dropTable.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1229
			kwDrop()
			this.state = 1230
			kwTable()
			this.state = 1232
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_IF) {
				if (true){
				this.state = 1231
				ifExist()
				}
			}

			this.state = 1237
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,79,context) ) {
			1   -> if (true){
			this.state = 1234
			keyspace()
			this.state = 1235
			match(DOT) as Token
			}
			}
			this.state = 1239
			table()
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

	open class DropKeyspaceContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_dropKeyspace.id
	        set(value) { throw RuntimeException() }
		fun findKwDrop() : KwDropContext? = getRuleContext(solver.getType("KwDropContext"),0)
		fun findKwKeyspace() : KwKeyspaceContext? = getRuleContext(solver.getType("KwKeyspaceContext"),0)
		fun findKeyspace() : KeyspaceContext? = getRuleContext(solver.getType("KeyspaceContext"),0)
		fun findIfExist() : IfExistContext? = getRuleContext(solver.getType("IfExistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  dropKeyspace() : DropKeyspaceContext {
		var _localctx : DropKeyspaceContext = DropKeyspaceContext(context, state)
		enterRule(_localctx, 130, Rules.RULE_dropKeyspace.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1241
			kwDrop()
			this.state = 1242
			kwKeyspace()
			this.state = 1244
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_IF) {
				if (true){
				this.state = 1243
				ifExist()
				}
			}

			this.state = 1246
			keyspace()
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

	open class DropIndexContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_dropIndex.id
	        set(value) { throw RuntimeException() }
		fun findKwDrop() : KwDropContext? = getRuleContext(solver.getType("KwDropContext"),0)
		fun findKwIndex() : KwIndexContext? = getRuleContext(solver.getType("KwIndexContext"),0)
		fun findIndexName() : IndexNameContext? = getRuleContext(solver.getType("IndexNameContext"),0)
		fun findIfExist() : IfExistContext? = getRuleContext(solver.getType("IfExistContext"),0)
		fun findKeyspace() : KeyspaceContext? = getRuleContext(solver.getType("KeyspaceContext"),0)
		fun DOT() : TerminalNode? = getToken(CqlParser.Tokens.DOT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  dropIndex() : DropIndexContext {
		var _localctx : DropIndexContext = DropIndexContext(context, state)
		enterRule(_localctx, 132, Rules.RULE_dropIndex.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1248
			kwDrop()
			this.state = 1249
			kwIndex()
			this.state = 1251
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_IF) {
				if (true){
				this.state = 1250
				ifExist()
				}
			}

			this.state = 1256
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,82,context) ) {
			1   -> if (true){
			this.state = 1253
			keyspace()
			this.state = 1254
			match(DOT) as Token
			}
			}
			this.state = 1258
			indexName()
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

	open class CreateTableContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_createTable.id
	        set(value) { throw RuntimeException() }
		fun findKwCreate() : KwCreateContext? = getRuleContext(solver.getType("KwCreateContext"),0)
		fun findKwTable() : KwTableContext? = getRuleContext(solver.getType("KwTableContext"),0)
		fun findTable() : TableContext? = getRuleContext(solver.getType("TableContext"),0)
		fun findSyntaxBracketLr() : SyntaxBracketLrContext? = getRuleContext(solver.getType("SyntaxBracketLrContext"),0)
		fun findColumnDefinitionList() : ColumnDefinitionListContext? = getRuleContext(solver.getType("ColumnDefinitionListContext"),0)
		fun findSyntaxBracketRr() : SyntaxBracketRrContext? = getRuleContext(solver.getType("SyntaxBracketRrContext"),0)
		fun findIfNotExist() : IfNotExistContext? = getRuleContext(solver.getType("IfNotExistContext"),0)
		fun findKeyspace() : KeyspaceContext? = getRuleContext(solver.getType("KeyspaceContext"),0)
		fun DOT() : TerminalNode? = getToken(CqlParser.Tokens.DOT.id, 0)
		fun findWithElement() : WithElementContext? = getRuleContext(solver.getType("WithElementContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  createTable() : CreateTableContext {
		var _localctx : CreateTableContext = CreateTableContext(context, state)
		enterRule(_localctx, 134, Rules.RULE_createTable.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1260
			kwCreate()
			this.state = 1261
			kwTable()
			this.state = 1263
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_IF) {
				if (true){
				this.state = 1262
				ifNotExist()
				}
			}

			this.state = 1268
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,84,context) ) {
			1   -> if (true){
			this.state = 1265
			keyspace()
			this.state = 1266
			match(DOT) as Token
			}
			}
			this.state = 1270
			table()
			this.state = 1271
			syntaxBracketLr()
			this.state = 1272
			columnDefinitionList()
			this.state = 1273
			syntaxBracketRr()
			this.state = 1275
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_WITH) {
				if (true){
				this.state = 1274
				withElement()
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

	open class WithElementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_withElement.id
	        set(value) { throw RuntimeException() }
		fun findKwWith() : KwWithContext? = getRuleContext(solver.getType("KwWithContext"),0)
		fun findTableOptions() : TableOptionsContext? = getRuleContext(solver.getType("TableOptionsContext"),0)
		fun findClusteringOrder() : ClusteringOrderContext? = getRuleContext(solver.getType("ClusteringOrderContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  withElement() : WithElementContext {
		var _localctx : WithElementContext = WithElementContext(context, state)
		enterRule(_localctx, 136, Rules.RULE_withElement.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1277
			kwWith()
			this.state = 1279
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==OBJECT_NAME) {
				if (true){
				this.state = 1278
				tableOptions()
				}
			}

			this.state = 1282
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_CLUSTERING) {
				if (true){
				this.state = 1281
				clusteringOrder()
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

	open class ClusteringOrderContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_clusteringOrder.id
	        set(value) { throw RuntimeException() }
		fun findKwClustering() : KwClusteringContext? = getRuleContext(solver.getType("KwClusteringContext"),0)
		fun findKwOrder() : KwOrderContext? = getRuleContext(solver.getType("KwOrderContext"),0)
		fun findKwBy() : KwByContext? = getRuleContext(solver.getType("KwByContext"),0)
		fun findSyntaxBracketLr() : SyntaxBracketLrContext? = getRuleContext(solver.getType("SyntaxBracketLrContext"),0)
		fun findColumn() : ColumnContext? = getRuleContext(solver.getType("ColumnContext"),0)
		fun findSyntaxBracketRr() : SyntaxBracketRrContext? = getRuleContext(solver.getType("SyntaxBracketRrContext"),0)
		fun findOrderDirection() : OrderDirectionContext? = getRuleContext(solver.getType("OrderDirectionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  clusteringOrder() : ClusteringOrderContext {
		var _localctx : ClusteringOrderContext = ClusteringOrderContext(context, state)
		enterRule(_localctx, 138, Rules.RULE_clusteringOrder.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1284
			kwClustering()
			this.state = 1285
			kwOrder()
			this.state = 1286
			kwBy()
			this.state = 1287
			syntaxBracketLr()
			this.state = 1288
			column()
			this.state = 1290
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_ASC || _la==K_DESC) {
				if (true){
				this.state = 1289
				orderDirection()
				}
			}

			this.state = 1292
			syntaxBracketRr()
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

	open class TableOptionsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_tableOptions.id
	        set(value) { throw RuntimeException() }
		fun findTableOptionItem() : List<TableOptionItemContext> = getRuleContexts(solver.getType("TableOptionItemContext"))
		fun findTableOptionItem(i: Int) : TableOptionItemContext? = getRuleContext(solver.getType("TableOptionItemContext"),i)
		fun findKwAnd() : List<KwAndContext> = getRuleContexts(solver.getType("KwAndContext"))
		fun findKwAnd(i: Int) : KwAndContext? = getRuleContext(solver.getType("KwAndContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  tableOptions() : TableOptionsContext {
		var _localctx : TableOptionsContext = TableOptionsContext(context, state)
		enterRule(_localctx, 140, Rules.RULE_tableOptions.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1294
			tableOptionItem()
			this.state = 1300
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,89,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 1295
					kwAnd()
					this.state = 1296
					tableOptionItem()
					}
					} 
				}
				this.state = 1302
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,89,context)
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

	open class TableOptionItemContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_tableOptionItem.id
	        set(value) { throw RuntimeException() }
		fun findTableOptionName() : TableOptionNameContext? = getRuleContext(solver.getType("TableOptionNameContext"),0)
		fun OPERATOR_EQ() : TerminalNode? = getToken(CqlParser.Tokens.OPERATOR_EQ.id, 0)
		fun findTableOptionValue() : TableOptionValueContext? = getRuleContext(solver.getType("TableOptionValueContext"),0)
		fun findOptionHash() : OptionHashContext? = getRuleContext(solver.getType("OptionHashContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  tableOptionItem() : TableOptionItemContext {
		var _localctx : TableOptionItemContext = TableOptionItemContext(context, state)
		enterRule(_localctx, 142, Rules.RULE_tableOptionItem.id)
		try {
			this.state = 1311
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,90,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1303
			tableOptionName()
			this.state = 1304
			match(OPERATOR_EQ) as Token
			this.state = 1305
			tableOptionValue()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1307
			tableOptionName()
			this.state = 1308
			match(OPERATOR_EQ) as Token
			this.state = 1309
			optionHash()
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

	open class TableOptionNameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_tableOptionName.id
	        set(value) { throw RuntimeException() }
		fun OBJECT_NAME() : TerminalNode? = getToken(CqlParser.Tokens.OBJECT_NAME.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  tableOptionName() : TableOptionNameContext {
		var _localctx : TableOptionNameContext = TableOptionNameContext(context, state)
		enterRule(_localctx, 144, Rules.RULE_tableOptionName.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1313
			match(OBJECT_NAME) as Token
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

	open class TableOptionValueContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_tableOptionValue.id
	        set(value) { throw RuntimeException() }
		fun findStringLiteral() : StringLiteralContext? = getRuleContext(solver.getType("StringLiteralContext"),0)
		fun findFloatLiteral() : FloatLiteralContext? = getRuleContext(solver.getType("FloatLiteralContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  tableOptionValue() : TableOptionValueContext {
		var _localctx : TableOptionValueContext = TableOptionValueContext(context, state)
		enterRule(_localctx, 146, Rules.RULE_tableOptionValue.id)
		try {
			this.state = 1317
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			STRING_LITERAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1315
			stringLiteral()
			}}
			DECIMAL_LITERAL , FLOAT_LITERAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1316
			floatLiteral()
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

	open class OptionHashContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_optionHash.id
	        set(value) { throw RuntimeException() }
		fun findSyntaxBracketLc() : SyntaxBracketLcContext? = getRuleContext(solver.getType("SyntaxBracketLcContext"),0)
		fun findOptionHashItem() : List<OptionHashItemContext> = getRuleContexts(solver.getType("OptionHashItemContext"))
		fun findOptionHashItem(i: Int) : OptionHashItemContext? = getRuleContext(solver.getType("OptionHashItemContext"),i)
		fun findSyntaxBracketRc() : SyntaxBracketRcContext? = getRuleContext(solver.getType("SyntaxBracketRcContext"),0)
		fun findSyntaxComma() : List<SyntaxCommaContext> = getRuleContexts(solver.getType("SyntaxCommaContext"))
		fun findSyntaxComma(i: Int) : SyntaxCommaContext? = getRuleContext(solver.getType("SyntaxCommaContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  optionHash() : OptionHashContext {
		var _localctx : OptionHashContext = OptionHashContext(context, state)
		enterRule(_localctx, 148, Rules.RULE_optionHash.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1319
			syntaxBracketLc()
			this.state = 1320
			optionHashItem()
			this.state = 1326
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COMMA) {
				if (true){
				if (true){
				this.state = 1321
				syntaxComma()
				this.state = 1322
				optionHashItem()
				}
				}
				this.state = 1328
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 1329
			syntaxBracketRc()
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

	open class OptionHashItemContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_optionHashItem.id
	        set(value) { throw RuntimeException() }
		fun findOptionHashKey() : OptionHashKeyContext? = getRuleContext(solver.getType("OptionHashKeyContext"),0)
		fun COLON() : TerminalNode? = getToken(CqlParser.Tokens.COLON.id, 0)
		fun findOptionHashValue() : OptionHashValueContext? = getRuleContext(solver.getType("OptionHashValueContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  optionHashItem() : OptionHashItemContext {
		var _localctx : OptionHashItemContext = OptionHashItemContext(context, state)
		enterRule(_localctx, 150, Rules.RULE_optionHashItem.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1331
			optionHashKey()
			this.state = 1332
			match(COLON) as Token
			this.state = 1333
			optionHashValue()
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

	open class OptionHashKeyContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_optionHashKey.id
	        set(value) { throw RuntimeException() }
		fun findStringLiteral() : StringLiteralContext? = getRuleContext(solver.getType("StringLiteralContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  optionHashKey() : OptionHashKeyContext {
		var _localctx : OptionHashKeyContext = OptionHashKeyContext(context, state)
		enterRule(_localctx, 152, Rules.RULE_optionHashKey.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1335
			stringLiteral()
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

	open class OptionHashValueContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_optionHashValue.id
	        set(value) { throw RuntimeException() }
		fun findStringLiteral() : StringLiteralContext? = getRuleContext(solver.getType("StringLiteralContext"),0)
		fun findFloatLiteral() : FloatLiteralContext? = getRuleContext(solver.getType("FloatLiteralContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  optionHashValue() : OptionHashValueContext {
		var _localctx : OptionHashValueContext = OptionHashValueContext(context, state)
		enterRule(_localctx, 154, Rules.RULE_optionHashValue.id)
		try {
			this.state = 1339
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			STRING_LITERAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1337
			stringLiteral()
			}}
			DECIMAL_LITERAL , FLOAT_LITERAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1338
			floatLiteral()
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

	open class ColumnDefinitionListContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_columnDefinitionList.id
	        set(value) { throw RuntimeException() }
		fun findColumnDefinition() : List<ColumnDefinitionContext> = getRuleContexts(solver.getType("ColumnDefinitionContext"))
		fun findColumnDefinition(i: Int) : ColumnDefinitionContext? = getRuleContext(solver.getType("ColumnDefinitionContext"),i)
		fun findSyntaxComma() : List<SyntaxCommaContext> = getRuleContexts(solver.getType("SyntaxCommaContext"))
		fun findSyntaxComma(i: Int) : SyntaxCommaContext? = getRuleContext(solver.getType("SyntaxCommaContext"),i)
		fun findPrimaryKeyElement() : PrimaryKeyElementContext? = getRuleContext(solver.getType("PrimaryKeyElementContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  columnDefinitionList() : ColumnDefinitionListContext {
		var _localctx : ColumnDefinitionListContext = ColumnDefinitionListContext(context, state)
		enterRule(_localctx, 156, Rules.RULE_columnDefinitionList.id)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 1341
			columnDefinition()
			}
			this.state = 1347
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,94,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 1342
					syntaxComma()
					this.state = 1343
					columnDefinition()
					}
					} 
				}
				this.state = 1349
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,94,context)
			}
			this.state = 1353
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COMMA) {
				if (true){
				this.state = 1350
				syntaxComma()
				this.state = 1351
				primaryKeyElement()
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

	open class ColumnDefinitionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_columnDefinition.id
	        set(value) { throw RuntimeException() }
		fun findColumn() : ColumnContext? = getRuleContext(solver.getType("ColumnContext"),0)
		fun findDataType() : DataTypeContext? = getRuleContext(solver.getType("DataTypeContext"),0)
		fun findPrimaryKeyColumn() : PrimaryKeyColumnContext? = getRuleContext(solver.getType("PrimaryKeyColumnContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  columnDefinition() : ColumnDefinitionContext {
		var _localctx : ColumnDefinitionContext = ColumnDefinitionContext(context, state)
		enterRule(_localctx, 158, Rules.RULE_columnDefinition.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1355
			column()
			this.state = 1356
			dataType()
			this.state = 1358
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_PRIMARY) {
				if (true){
				this.state = 1357
				primaryKeyColumn()
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

	open class PrimaryKeyColumnContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_primaryKeyColumn.id
	        set(value) { throw RuntimeException() }
		fun findKwPrimary() : KwPrimaryContext? = getRuleContext(solver.getType("KwPrimaryContext"),0)
		fun findKwKey() : KwKeyContext? = getRuleContext(solver.getType("KwKeyContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  primaryKeyColumn() : PrimaryKeyColumnContext {
		var _localctx : PrimaryKeyColumnContext = PrimaryKeyColumnContext(context, state)
		enterRule(_localctx, 160, Rules.RULE_primaryKeyColumn.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1360
			kwPrimary()
			this.state = 1361
			kwKey()
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

	open class PrimaryKeyElementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_primaryKeyElement.id
	        set(value) { throw RuntimeException() }
		fun findKwPrimary() : KwPrimaryContext? = getRuleContext(solver.getType("KwPrimaryContext"),0)
		fun findKwKey() : KwKeyContext? = getRuleContext(solver.getType("KwKeyContext"),0)
		fun findSyntaxBracketLr() : SyntaxBracketLrContext? = getRuleContext(solver.getType("SyntaxBracketLrContext"),0)
		fun findPrimaryKeyDefinition() : PrimaryKeyDefinitionContext? = getRuleContext(solver.getType("PrimaryKeyDefinitionContext"),0)
		fun findSyntaxBracketRr() : SyntaxBracketRrContext? = getRuleContext(solver.getType("SyntaxBracketRrContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  primaryKeyElement() : PrimaryKeyElementContext {
		var _localctx : PrimaryKeyElementContext = PrimaryKeyElementContext(context, state)
		enterRule(_localctx, 162, Rules.RULE_primaryKeyElement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1363
			kwPrimary()
			this.state = 1364
			kwKey()
			this.state = 1365
			syntaxBracketLr()
			this.state = 1366
			primaryKeyDefinition()
			this.state = 1367
			syntaxBracketRr()
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

	open class PrimaryKeyDefinitionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_primaryKeyDefinition.id
	        set(value) { throw RuntimeException() }
		fun findSinglePrimaryKey() : SinglePrimaryKeyContext? = getRuleContext(solver.getType("SinglePrimaryKeyContext"),0)
		fun findCompoundKey() : CompoundKeyContext? = getRuleContext(solver.getType("CompoundKeyContext"),0)
		fun findCompositeKey() : CompositeKeyContext? = getRuleContext(solver.getType("CompositeKeyContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  primaryKeyDefinition() : PrimaryKeyDefinitionContext {
		var _localctx : PrimaryKeyDefinitionContext = PrimaryKeyDefinitionContext(context, state)
		enterRule(_localctx, 164, Rules.RULE_primaryKeyDefinition.id)
		try {
			this.state = 1372
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,97,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1369
			singlePrimaryKey()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1370
			compoundKey()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 1371
			compositeKey()
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

	open class SinglePrimaryKeyContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_singlePrimaryKey.id
	        set(value) { throw RuntimeException() }
		fun findColumn() : ColumnContext? = getRuleContext(solver.getType("ColumnContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  singlePrimaryKey() : SinglePrimaryKeyContext {
		var _localctx : SinglePrimaryKeyContext = SinglePrimaryKeyContext(context, state)
		enterRule(_localctx, 166, Rules.RULE_singlePrimaryKey.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1374
			column()
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

	open class CompoundKeyContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_compoundKey.id
	        set(value) { throw RuntimeException() }
		fun findPartitionKey() : PartitionKeyContext? = getRuleContext(solver.getType("PartitionKeyContext"),0)
		fun findSyntaxComma() : SyntaxCommaContext? = getRuleContext(solver.getType("SyntaxCommaContext"),0)
		fun findClusteringKeyList() : ClusteringKeyListContext? = getRuleContext(solver.getType("ClusteringKeyListContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  compoundKey() : CompoundKeyContext {
		var _localctx : CompoundKeyContext = CompoundKeyContext(context, state)
		enterRule(_localctx, 168, Rules.RULE_compoundKey.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1376
			partitionKey()
			if (true){
			this.state = 1377
			syntaxComma()
			this.state = 1378
			clusteringKeyList()
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

	open class CompositeKeyContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_compositeKey.id
	        set(value) { throw RuntimeException() }
		fun findSyntaxBracketLr() : SyntaxBracketLrContext? = getRuleContext(solver.getType("SyntaxBracketLrContext"),0)
		fun findPartitionKeyList() : PartitionKeyListContext? = getRuleContext(solver.getType("PartitionKeyListContext"),0)
		fun findSyntaxBracketRr() : SyntaxBracketRrContext? = getRuleContext(solver.getType("SyntaxBracketRrContext"),0)
		fun findSyntaxComma() : SyntaxCommaContext? = getRuleContext(solver.getType("SyntaxCommaContext"),0)
		fun findClusteringKeyList() : ClusteringKeyListContext? = getRuleContext(solver.getType("ClusteringKeyListContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  compositeKey() : CompositeKeyContext {
		var _localctx : CompositeKeyContext = CompositeKeyContext(context, state)
		enterRule(_localctx, 170, Rules.RULE_compositeKey.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1380
			syntaxBracketLr()
			this.state = 1381
			partitionKeyList()
			this.state = 1382
			syntaxBracketRr()
			if (true){
			this.state = 1383
			syntaxComma()
			this.state = 1384
			clusteringKeyList()
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

	open class PartitionKeyListContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_partitionKeyList.id
	        set(value) { throw RuntimeException() }
		fun findPartitionKey() : List<PartitionKeyContext> = getRuleContexts(solver.getType("PartitionKeyContext"))
		fun findPartitionKey(i: Int) : PartitionKeyContext? = getRuleContext(solver.getType("PartitionKeyContext"),i)
		fun findSyntaxComma() : List<SyntaxCommaContext> = getRuleContexts(solver.getType("SyntaxCommaContext"))
		fun findSyntaxComma(i: Int) : SyntaxCommaContext? = getRuleContext(solver.getType("SyntaxCommaContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  partitionKeyList() : PartitionKeyListContext {
		var _localctx : PartitionKeyListContext = PartitionKeyListContext(context, state)
		enterRule(_localctx, 172, Rules.RULE_partitionKeyList.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 1386
			partitionKey()
			}
			this.state = 1392
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COMMA) {
				if (true){
				if (true){
				this.state = 1387
				syntaxComma()
				this.state = 1388
				partitionKey()
				}
				}
				this.state = 1394
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

	open class ClusteringKeyListContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_clusteringKeyList.id
	        set(value) { throw RuntimeException() }
		fun findClusteringKey() : List<ClusteringKeyContext> = getRuleContexts(solver.getType("ClusteringKeyContext"))
		fun findClusteringKey(i: Int) : ClusteringKeyContext? = getRuleContext(solver.getType("ClusteringKeyContext"),i)
		fun findSyntaxComma() : List<SyntaxCommaContext> = getRuleContexts(solver.getType("SyntaxCommaContext"))
		fun findSyntaxComma(i: Int) : SyntaxCommaContext? = getRuleContext(solver.getType("SyntaxCommaContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  clusteringKeyList() : ClusteringKeyListContext {
		var _localctx : ClusteringKeyListContext = ClusteringKeyListContext(context, state)
		enterRule(_localctx, 174, Rules.RULE_clusteringKeyList.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 1395
			clusteringKey()
			}
			this.state = 1401
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COMMA) {
				if (true){
				if (true){
				this.state = 1396
				syntaxComma()
				this.state = 1397
				clusteringKey()
				}
				}
				this.state = 1403
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

	open class PartitionKeyContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_partitionKey.id
	        set(value) { throw RuntimeException() }
		fun findColumn() : ColumnContext? = getRuleContext(solver.getType("ColumnContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  partitionKey() : PartitionKeyContext {
		var _localctx : PartitionKeyContext = PartitionKeyContext(context, state)
		enterRule(_localctx, 176, Rules.RULE_partitionKey.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1404
			column()
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

	open class ClusteringKeyContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_clusteringKey.id
	        set(value) { throw RuntimeException() }
		fun findColumn() : ColumnContext? = getRuleContext(solver.getType("ColumnContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  clusteringKey() : ClusteringKeyContext {
		var _localctx : ClusteringKeyContext = ClusteringKeyContext(context, state)
		enterRule(_localctx, 178, Rules.RULE_clusteringKey.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1406
			column()
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

	open class ApplyBatchContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_applyBatch.id
	        set(value) { throw RuntimeException() }
		fun findKwApply() : KwApplyContext? = getRuleContext(solver.getType("KwApplyContext"),0)
		fun findKwBatch() : KwBatchContext? = getRuleContext(solver.getType("KwBatchContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  applyBatch() : ApplyBatchContext {
		var _localctx : ApplyBatchContext = ApplyBatchContext(context, state)
		enterRule(_localctx, 180, Rules.RULE_applyBatch.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1408
			kwApply()
			this.state = 1409
			kwBatch()
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

	open class BeginBatchContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_beginBatch.id
	        set(value) { throw RuntimeException() }
		fun findKwBegin() : KwBeginContext? = getRuleContext(solver.getType("KwBeginContext"),0)
		fun findKwBatch() : KwBatchContext? = getRuleContext(solver.getType("KwBatchContext"),0)
		fun findBatchType() : BatchTypeContext? = getRuleContext(solver.getType("BatchTypeContext"),0)
		fun findUsingTimestampSpec() : UsingTimestampSpecContext? = getRuleContext(solver.getType("UsingTimestampSpecContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  beginBatch() : BeginBatchContext {
		var _localctx : BeginBatchContext = BeginBatchContext(context, state)
		enterRule(_localctx, 182, Rules.RULE_beginBatch.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1411
			kwBegin()
			this.state = 1413
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_LOGGED || _la==K_UNLOGGED) {
				if (true){
				this.state = 1412
				batchType()
				}
			}

			this.state = 1415
			kwBatch()
			this.state = 1417
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_USING) {
				if (true){
				this.state = 1416
				usingTimestampSpec()
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

	open class BatchTypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_batchType.id
	        set(value) { throw RuntimeException() }
		fun findKwLogged() : KwLoggedContext? = getRuleContext(solver.getType("KwLoggedContext"),0)
		fun findKwUnlogged() : KwUnloggedContext? = getRuleContext(solver.getType("KwUnloggedContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  batchType() : BatchTypeContext {
		var _localctx : BatchTypeContext = BatchTypeContext(context, state)
		enterRule(_localctx, 184, Rules.RULE_batchType.id)
		try {
			this.state = 1421
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			K_LOGGED  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1419
			kwLogged()
			}}
			K_UNLOGGED  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1420
			kwUnlogged()
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

	open class AlterKeyspaceContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_alterKeyspace.id
	        set(value) { throw RuntimeException() }
		fun findKwAlter() : KwAlterContext? = getRuleContext(solver.getType("KwAlterContext"),0)
		fun findKwKeyspace() : KwKeyspaceContext? = getRuleContext(solver.getType("KwKeyspaceContext"),0)
		fun findKeyspace() : KeyspaceContext? = getRuleContext(solver.getType("KeyspaceContext"),0)
		fun findKwWith() : KwWithContext? = getRuleContext(solver.getType("KwWithContext"),0)
		fun findKwReplication() : KwReplicationContext? = getRuleContext(solver.getType("KwReplicationContext"),0)
		fun OPERATOR_EQ() : TerminalNode? = getToken(CqlParser.Tokens.OPERATOR_EQ.id, 0)
		fun findSyntaxBracketLc() : SyntaxBracketLcContext? = getRuleContext(solver.getType("SyntaxBracketLcContext"),0)
		fun findReplicationList() : ReplicationListContext? = getRuleContext(solver.getType("ReplicationListContext"),0)
		fun findSyntaxBracketRc() : SyntaxBracketRcContext? = getRuleContext(solver.getType("SyntaxBracketRcContext"),0)
		fun findKwAnd() : KwAndContext? = getRuleContext(solver.getType("KwAndContext"),0)
		fun findDurableWrites() : DurableWritesContext? = getRuleContext(solver.getType("DurableWritesContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  alterKeyspace() : AlterKeyspaceContext {
		var _localctx : AlterKeyspaceContext = AlterKeyspaceContext(context, state)
		enterRule(_localctx, 186, Rules.RULE_alterKeyspace.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1423
			kwAlter()
			this.state = 1424
			kwKeyspace()
			this.state = 1425
			keyspace()
			this.state = 1426
			kwWith()
			this.state = 1427
			kwReplication()
			this.state = 1428
			match(OPERATOR_EQ) as Token
			this.state = 1429
			syntaxBracketLc()
			this.state = 1430
			replicationList()
			this.state = 1431
			syntaxBracketRc()
			this.state = 1435
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_AND) {
				if (true){
				this.state = 1432
				kwAnd()
				this.state = 1433
				durableWrites()
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

	open class ReplicationListContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_replicationList.id
	        set(value) { throw RuntimeException() }
		fun findReplicationListItem() : List<ReplicationListItemContext> = getRuleContexts(solver.getType("ReplicationListItemContext"))
		fun findReplicationListItem(i: Int) : ReplicationListItemContext? = getRuleContext(solver.getType("ReplicationListItemContext"),i)
		fun findSyntaxComma() : List<SyntaxCommaContext> = getRuleContexts(solver.getType("SyntaxCommaContext"))
		fun findSyntaxComma(i: Int) : SyntaxCommaContext? = getRuleContext(solver.getType("SyntaxCommaContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  replicationList() : ReplicationListContext {
		var _localctx : ReplicationListContext = ReplicationListContext(context, state)
		enterRule(_localctx, 188, Rules.RULE_replicationList.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 1437
			replicationListItem()
			}
			this.state = 1443
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COMMA) {
				if (true){
				if (true){
				this.state = 1438
				syntaxComma()
				this.state = 1439
				replicationListItem()
				}
				}
				this.state = 1445
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

	open class ReplicationListItemContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_replicationListItem.id
	        set(value) { throw RuntimeException() }
		fun STRING_LITERAL() : List<TerminalNode> = getTokens(CqlParser.Tokens.STRING_LITERAL.id)
		fun STRING_LITERAL(i: Int) : TerminalNode = getToken(CqlParser.Tokens.STRING_LITERAL.id, i) as TerminalNode
		fun COLON() : TerminalNode? = getToken(CqlParser.Tokens.COLON.id, 0)
		fun DECIMAL_LITERAL() : TerminalNode? = getToken(CqlParser.Tokens.DECIMAL_LITERAL.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  replicationListItem() : ReplicationListItemContext {
		var _localctx : ReplicationListItemContext = ReplicationListItemContext(context, state)
		enterRule(_localctx, 190, Rules.RULE_replicationListItem.id)
		try {
			this.state = 1452
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,105,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1446
			match(STRING_LITERAL) as Token
			this.state = 1447
			match(COLON) as Token
			this.state = 1448
			match(STRING_LITERAL) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1449
			match(STRING_LITERAL) as Token
			this.state = 1450
			match(COLON) as Token
			this.state = 1451
			match(DECIMAL_LITERAL) as Token
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

	open class DurableWritesContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_durableWrites.id
	        set(value) { throw RuntimeException() }
		fun findKwDurableWrites() : KwDurableWritesContext? = getRuleContext(solver.getType("KwDurableWritesContext"),0)
		fun OPERATOR_EQ() : TerminalNode? = getToken(CqlParser.Tokens.OPERATOR_EQ.id, 0)
		fun findBooleanLiteral() : BooleanLiteralContext? = getRuleContext(solver.getType("BooleanLiteralContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  durableWrites() : DurableWritesContext {
		var _localctx : DurableWritesContext = DurableWritesContext(context, state)
		enterRule(_localctx, 192, Rules.RULE_durableWrites.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1454
			kwDurableWrites()
			this.state = 1455
			match(OPERATOR_EQ) as Token
			this.state = 1456
			booleanLiteral()
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

	open class UseContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_use.id
	        set(value) { throw RuntimeException() }
		fun findKwUse() : KwUseContext? = getRuleContext(solver.getType("KwUseContext"),0)
		fun findKeyspace() : KeyspaceContext? = getRuleContext(solver.getType("KeyspaceContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  use() : UseContext {
		var _localctx : UseContext = UseContext(context, state)
		enterRule(_localctx, 194, Rules.RULE_use.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1458
			kwUse()
			this.state = 1459
			keyspace()
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

	open class TruncateContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_truncate.id
	        set(value) { throw RuntimeException() }
		fun findKwTruncate() : KwTruncateContext? = getRuleContext(solver.getType("KwTruncateContext"),0)
		fun findTable() : TableContext? = getRuleContext(solver.getType("TableContext"),0)
		fun findKwTable() : KwTableContext? = getRuleContext(solver.getType("KwTableContext"),0)
		fun findKeyspace() : KeyspaceContext? = getRuleContext(solver.getType("KeyspaceContext"),0)
		fun DOT() : TerminalNode? = getToken(CqlParser.Tokens.DOT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  truncate() : TruncateContext {
		var _localctx : TruncateContext = TruncateContext(context, state)
		enterRule(_localctx, 196, Rules.RULE_truncate.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1461
			kwTruncate()
			this.state = 1463
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_TABLE) {
				if (true){
				this.state = 1462
				kwTable()
				}
			}

			this.state = 1468
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,107,context) ) {
			1   -> if (true){
			this.state = 1465
			keyspace()
			this.state = 1466
			match(DOT) as Token
			}
			}
			this.state = 1470
			table()
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

	open class CreateIndexContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_createIndex.id
	        set(value) { throw RuntimeException() }
		fun findKwCreate() : KwCreateContext? = getRuleContext(solver.getType("KwCreateContext"),0)
		fun findKwIndex() : KwIndexContext? = getRuleContext(solver.getType("KwIndexContext"),0)
		fun findKwOn() : KwOnContext? = getRuleContext(solver.getType("KwOnContext"),0)
		fun findTable() : TableContext? = getRuleContext(solver.getType("TableContext"),0)
		fun findSyntaxBracketLr() : SyntaxBracketLrContext? = getRuleContext(solver.getType("SyntaxBracketLrContext"),0)
		fun findIndexColumnSpec() : IndexColumnSpecContext? = getRuleContext(solver.getType("IndexColumnSpecContext"),0)
		fun findSyntaxBracketRr() : SyntaxBracketRrContext? = getRuleContext(solver.getType("SyntaxBracketRrContext"),0)
		fun findIfNotExist() : IfNotExistContext? = getRuleContext(solver.getType("IfNotExistContext"),0)
		fun findIndexName() : IndexNameContext? = getRuleContext(solver.getType("IndexNameContext"),0)
		fun findKeyspace() : KeyspaceContext? = getRuleContext(solver.getType("KeyspaceContext"),0)
		fun DOT() : TerminalNode? = getToken(CqlParser.Tokens.DOT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  createIndex() : CreateIndexContext {
		var _localctx : CreateIndexContext = CreateIndexContext(context, state)
		enterRule(_localctx, 198, Rules.RULE_createIndex.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1472
			kwCreate()
			this.state = 1473
			kwIndex()
			this.state = 1475
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_IF) {
				if (true){
				this.state = 1474
				ifNotExist()
				}
			}

			this.state = 1478
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==STRING_LITERAL || _la==OBJECT_NAME) {
				if (true){
				this.state = 1477
				indexName()
				}
			}

			this.state = 1480
			kwOn()
			this.state = 1484
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,110,context) ) {
			1   -> if (true){
			this.state = 1481
			keyspace()
			this.state = 1482
			match(DOT) as Token
			}
			}
			this.state = 1486
			table()
			this.state = 1487
			syntaxBracketLr()
			this.state = 1488
			indexColumnSpec()
			this.state = 1489
			syntaxBracketRr()
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

	open class IndexNameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_indexName.id
	        set(value) { throw RuntimeException() }
		fun OBJECT_NAME() : TerminalNode? = getToken(CqlParser.Tokens.OBJECT_NAME.id, 0)
		fun findStringLiteral() : StringLiteralContext? = getRuleContext(solver.getType("StringLiteralContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  indexName() : IndexNameContext {
		var _localctx : IndexNameContext = IndexNameContext(context, state)
		enterRule(_localctx, 200, Rules.RULE_indexName.id)
		try {
			this.state = 1493
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			OBJECT_NAME  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1491
			match(OBJECT_NAME) as Token
			}}
			STRING_LITERAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1492
			stringLiteral()
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

	open class IndexColumnSpecContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_indexColumnSpec.id
	        set(value) { throw RuntimeException() }
		fun findColumn() : ColumnContext? = getRuleContext(solver.getType("ColumnContext"),0)
		fun findIndexKeysSpec() : IndexKeysSpecContext? = getRuleContext(solver.getType("IndexKeysSpecContext"),0)
		fun findIndexEntriesSSpec() : IndexEntriesSSpecContext? = getRuleContext(solver.getType("IndexEntriesSSpecContext"),0)
		fun findIndexFullSpec() : IndexFullSpecContext? = getRuleContext(solver.getType("IndexFullSpecContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  indexColumnSpec() : IndexColumnSpecContext {
		var _localctx : IndexColumnSpecContext = IndexColumnSpecContext(context, state)
		enterRule(_localctx, 202, Rules.RULE_indexColumnSpec.id)
		try {
			this.state = 1499
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			DQUOTE , OBJECT_NAME  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1495
			column()
			}}
			K_KEYS  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1496
			indexKeysSpec()
			}}
			K_ENTRIES  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 1497
			indexEntriesSSpec()
			}}
			K_FULL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 1498
			indexFullSpec()
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

	open class IndexKeysSpecContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_indexKeysSpec.id
	        set(value) { throw RuntimeException() }
		fun findKwKeys() : KwKeysContext? = getRuleContext(solver.getType("KwKeysContext"),0)
		fun findSyntaxBracketLr() : SyntaxBracketLrContext? = getRuleContext(solver.getType("SyntaxBracketLrContext"),0)
		fun OBJECT_NAME() : TerminalNode? = getToken(CqlParser.Tokens.OBJECT_NAME.id, 0)
		fun findSyntaxBracketRr() : SyntaxBracketRrContext? = getRuleContext(solver.getType("SyntaxBracketRrContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  indexKeysSpec() : IndexKeysSpecContext {
		var _localctx : IndexKeysSpecContext = IndexKeysSpecContext(context, state)
		enterRule(_localctx, 204, Rules.RULE_indexKeysSpec.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1501
			kwKeys()
			this.state = 1502
			syntaxBracketLr()
			this.state = 1503
			match(OBJECT_NAME) as Token
			this.state = 1504
			syntaxBracketRr()
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

	open class IndexEntriesSSpecContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_indexEntriesSSpec.id
	        set(value) { throw RuntimeException() }
		fun findKwEntries() : KwEntriesContext? = getRuleContext(solver.getType("KwEntriesContext"),0)
		fun findSyntaxBracketLr() : SyntaxBracketLrContext? = getRuleContext(solver.getType("SyntaxBracketLrContext"),0)
		fun OBJECT_NAME() : TerminalNode? = getToken(CqlParser.Tokens.OBJECT_NAME.id, 0)
		fun findSyntaxBracketRr() : SyntaxBracketRrContext? = getRuleContext(solver.getType("SyntaxBracketRrContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  indexEntriesSSpec() : IndexEntriesSSpecContext {
		var _localctx : IndexEntriesSSpecContext = IndexEntriesSSpecContext(context, state)
		enterRule(_localctx, 206, Rules.RULE_indexEntriesSSpec.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1506
			kwEntries()
			this.state = 1507
			syntaxBracketLr()
			this.state = 1508
			match(OBJECT_NAME) as Token
			this.state = 1509
			syntaxBracketRr()
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

	open class IndexFullSpecContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_indexFullSpec.id
	        set(value) { throw RuntimeException() }
		fun findKwFull() : KwFullContext? = getRuleContext(solver.getType("KwFullContext"),0)
		fun findSyntaxBracketLr() : SyntaxBracketLrContext? = getRuleContext(solver.getType("SyntaxBracketLrContext"),0)
		fun OBJECT_NAME() : TerminalNode? = getToken(CqlParser.Tokens.OBJECT_NAME.id, 0)
		fun findSyntaxBracketRr() : SyntaxBracketRrContext? = getRuleContext(solver.getType("SyntaxBracketRrContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  indexFullSpec() : IndexFullSpecContext {
		var _localctx : IndexFullSpecContext = IndexFullSpecContext(context, state)
		enterRule(_localctx, 208, Rules.RULE_indexFullSpec.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1511
			kwFull()
			this.state = 1512
			syntaxBracketLr()
			this.state = 1513
			match(OBJECT_NAME) as Token
			this.state = 1514
			syntaxBracketRr()
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

	open class DeleteContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_delete.id
	        set(value) { throw RuntimeException() }
		fun findKwDelete() : KwDeleteContext? = getRuleContext(solver.getType("KwDeleteContext"),0)
		fun findFromSpec() : FromSpecContext? = getRuleContext(solver.getType("FromSpecContext"),0)
		fun findWhereSpec() : WhereSpecContext? = getRuleContext(solver.getType("WhereSpecContext"),0)
		fun findBeginBatch() : BeginBatchContext? = getRuleContext(solver.getType("BeginBatchContext"),0)
		fun findDeleteColumnList() : DeleteColumnListContext? = getRuleContext(solver.getType("DeleteColumnListContext"),0)
		fun findUsingTimestampSpec() : UsingTimestampSpecContext? = getRuleContext(solver.getType("UsingTimestampSpecContext"),0)
		fun findIfExist() : IfExistContext? = getRuleContext(solver.getType("IfExistContext"),0)
		fun findIfSpec() : IfSpecContext? = getRuleContext(solver.getType("IfSpecContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  delete() : DeleteContext {
		var _localctx : DeleteContext = DeleteContext(context, state)
		enterRule(_localctx, 210, Rules.RULE_delete.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1517
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_BEGIN) {
				if (true){
				this.state = 1516
				beginBatch()
				}
			}

			this.state = 1519
			kwDelete()
			this.state = 1521
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==OBJECT_NAME) {
				if (true){
				this.state = 1520
				deleteColumnList()
				}
			}

			this.state = 1523
			fromSpec()
			this.state = 1525
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_USING) {
				if (true){
				this.state = 1524
				usingTimestampSpec()
				}
			}

			this.state = 1527
			whereSpec()
			this.state = 1530
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,116,context) ) {
			1   -> if (true){
			this.state = 1528
			ifExist()
			}
			2   -> if (true){
			this.state = 1529
			ifSpec()
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

	open class DeleteColumnListContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_deleteColumnList.id
	        set(value) { throw RuntimeException() }
		fun findDeleteColumnItem() : List<DeleteColumnItemContext> = getRuleContexts(solver.getType("DeleteColumnItemContext"))
		fun findDeleteColumnItem(i: Int) : DeleteColumnItemContext? = getRuleContext(solver.getType("DeleteColumnItemContext"),i)
		fun findSyntaxComma() : List<SyntaxCommaContext> = getRuleContexts(solver.getType("SyntaxCommaContext"))
		fun findSyntaxComma(i: Int) : SyntaxCommaContext? = getRuleContext(solver.getType("SyntaxCommaContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  deleteColumnList() : DeleteColumnListContext {
		var _localctx : DeleteColumnListContext = DeleteColumnListContext(context, state)
		enterRule(_localctx, 212, Rules.RULE_deleteColumnList.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 1532
			deleteColumnItem()
			}
			this.state = 1538
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COMMA) {
				if (true){
				if (true){
				this.state = 1533
				syntaxComma()
				this.state = 1534
				deleteColumnItem()
				}
				}
				this.state = 1540
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

	open class DeleteColumnItemContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_deleteColumnItem.id
	        set(value) { throw RuntimeException() }
		fun OBJECT_NAME() : TerminalNode? = getToken(CqlParser.Tokens.OBJECT_NAME.id, 0)
		fun LS_BRACKET() : TerminalNode? = getToken(CqlParser.Tokens.LS_BRACKET.id, 0)
		fun RS_BRACKET() : TerminalNode? = getToken(CqlParser.Tokens.RS_BRACKET.id, 0)
		fun findStringLiteral() : StringLiteralContext? = getRuleContext(solver.getType("StringLiteralContext"),0)
		fun findDecimalLiteral() : DecimalLiteralContext? = getRuleContext(solver.getType("DecimalLiteralContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  deleteColumnItem() : DeleteColumnItemContext {
		var _localctx : DeleteColumnItemContext = DeleteColumnItemContext(context, state)
		enterRule(_localctx, 214, Rules.RULE_deleteColumnItem.id)
		try {
			this.state = 1550
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,119,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1541
			match(OBJECT_NAME) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1542
			match(OBJECT_NAME) as Token
			this.state = 1543
			match(LS_BRACKET) as Token
			this.state = 1546
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			STRING_LITERAL  ->  /*LL1AltBlock*/{if (true){
			this.state = 1544
			stringLiteral()
			}}
			DECIMAL_LITERAL  ->  /*LL1AltBlock*/{if (true){
			this.state = 1545
			decimalLiteral()
			}}
			else -> throw NoViableAltException(this)
			}
			this.state = 1548
			match(RS_BRACKET) as Token
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

	open class UpdateContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_update.id
	        set(value) { throw RuntimeException() }
		fun findKwUpdate() : KwUpdateContext? = getRuleContext(solver.getType("KwUpdateContext"),0)
		fun findTable() : TableContext? = getRuleContext(solver.getType("TableContext"),0)
		fun findKwSet() : KwSetContext? = getRuleContext(solver.getType("KwSetContext"),0)
		fun findAssignments() : AssignmentsContext? = getRuleContext(solver.getType("AssignmentsContext"),0)
		fun findWhereSpec() : WhereSpecContext? = getRuleContext(solver.getType("WhereSpecContext"),0)
		fun findBeginBatch() : BeginBatchContext? = getRuleContext(solver.getType("BeginBatchContext"),0)
		fun findKeyspace() : KeyspaceContext? = getRuleContext(solver.getType("KeyspaceContext"),0)
		fun DOT() : TerminalNode? = getToken(CqlParser.Tokens.DOT.id, 0)
		fun findUsingTtlTimestamp() : UsingTtlTimestampContext? = getRuleContext(solver.getType("UsingTtlTimestampContext"),0)
		fun findIfExist() : IfExistContext? = getRuleContext(solver.getType("IfExistContext"),0)
		fun findIfSpec() : IfSpecContext? = getRuleContext(solver.getType("IfSpecContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  update() : UpdateContext {
		var _localctx : UpdateContext = UpdateContext(context, state)
		enterRule(_localctx, 216, Rules.RULE_update.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1553
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_BEGIN) {
				if (true){
				this.state = 1552
				beginBatch()
				}
			}

			this.state = 1555
			kwUpdate()
			this.state = 1559
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,121,context) ) {
			1   -> if (true){
			this.state = 1556
			keyspace()
			this.state = 1557
			match(DOT) as Token
			}
			}
			this.state = 1561
			table()
			this.state = 1563
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_USING) {
				if (true){
				this.state = 1562
				usingTtlTimestamp()
				}
			}

			this.state = 1565
			kwSet()
			this.state = 1566
			assignments()
			this.state = 1567
			whereSpec()
			this.state = 1570
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,123,context) ) {
			1   -> if (true){
			this.state = 1568
			ifExist()
			}
			2   -> if (true){
			this.state = 1569
			ifSpec()
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

	open class IfSpecContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_ifSpec.id
	        set(value) { throw RuntimeException() }
		fun findKwIf() : KwIfContext? = getRuleContext(solver.getType("KwIfContext"),0)
		fun findIfConditionList() : IfConditionListContext? = getRuleContext(solver.getType("IfConditionListContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  ifSpec() : IfSpecContext {
		var _localctx : IfSpecContext = IfSpecContext(context, state)
		enterRule(_localctx, 218, Rules.RULE_ifSpec.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1572
			kwIf()
			this.state = 1573
			ifConditionList()
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

	open class IfConditionListContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_ifConditionList.id
	        set(value) { throw RuntimeException() }
		fun findIfCondition() : List<IfConditionContext> = getRuleContexts(solver.getType("IfConditionContext"))
		fun findIfCondition(i: Int) : IfConditionContext? = getRuleContext(solver.getType("IfConditionContext"),i)
		fun findKwAnd() : List<KwAndContext> = getRuleContexts(solver.getType("KwAndContext"))
		fun findKwAnd(i: Int) : KwAndContext? = getRuleContext(solver.getType("KwAndContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  ifConditionList() : IfConditionListContext {
		var _localctx : IfConditionListContext = IfConditionListContext(context, state)
		enterRule(_localctx, 220, Rules.RULE_ifConditionList.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 1575
			ifCondition()
			}
			this.state = 1581
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==K_AND) {
				if (true){
				if (true){
				this.state = 1576
				kwAnd()
				this.state = 1577
				ifCondition()
				}
				}
				this.state = 1583
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

	open class IfConditionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_ifCondition.id
	        set(value) { throw RuntimeException() }
		fun OBJECT_NAME() : TerminalNode? = getToken(CqlParser.Tokens.OBJECT_NAME.id, 0)
		fun OPERATOR_EQ() : TerminalNode? = getToken(CqlParser.Tokens.OPERATOR_EQ.id, 0)
		fun findConstant() : ConstantContext? = getRuleContext(solver.getType("ConstantContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  ifCondition() : IfConditionContext {
		var _localctx : IfConditionContext = IfConditionContext(context, state)
		enterRule(_localctx, 222, Rules.RULE_ifCondition.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1584
			match(OBJECT_NAME) as Token
			this.state = 1585
			match(OPERATOR_EQ) as Token
			this.state = 1586
			constant()
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

	open class AssignmentsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_assignments.id
	        set(value) { throw RuntimeException() }
		fun findAssignmentElement() : List<AssignmentElementContext> = getRuleContexts(solver.getType("AssignmentElementContext"))
		fun findAssignmentElement(i: Int) : AssignmentElementContext? = getRuleContext(solver.getType("AssignmentElementContext"),i)
		fun findSyntaxComma() : List<SyntaxCommaContext> = getRuleContexts(solver.getType("SyntaxCommaContext"))
		fun findSyntaxComma(i: Int) : SyntaxCommaContext? = getRuleContext(solver.getType("SyntaxCommaContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  assignments() : AssignmentsContext {
		var _localctx : AssignmentsContext = AssignmentsContext(context, state)
		enterRule(_localctx, 224, Rules.RULE_assignments.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 1588
			assignmentElement()
			}
			this.state = 1594
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COMMA) {
				if (true){
				if (true){
				this.state = 1589
				syntaxComma()
				this.state = 1590
				assignmentElement()
				}
				}
				this.state = 1596
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

	open class AssignmentElementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_assignmentElement.id
	        set(value) { throw RuntimeException() }
		fun OBJECT_NAME() : List<TerminalNode> = getTokens(CqlParser.Tokens.OBJECT_NAME.id)
		fun OBJECT_NAME(i: Int) : TerminalNode = getToken(CqlParser.Tokens.OBJECT_NAME.id, i) as TerminalNode
		fun OPERATOR_EQ() : TerminalNode? = getToken(CqlParser.Tokens.OPERATOR_EQ.id, 0)
		fun findConstant() : ConstantContext? = getRuleContext(solver.getType("ConstantContext"),0)
		fun findAssignmentMap() : AssignmentMapContext? = getRuleContext(solver.getType("AssignmentMapContext"),0)
		fun findAssignmentSet() : AssignmentSetContext? = getRuleContext(solver.getType("AssignmentSetContext"),0)
		fun findAssignmentList() : AssignmentListContext? = getRuleContext(solver.getType("AssignmentListContext"),0)
		fun findDecimalLiteral() : DecimalLiteralContext? = getRuleContext(solver.getType("DecimalLiteralContext"),0)
		fun PLUS() : TerminalNode? = getToken(CqlParser.Tokens.PLUS.id, 0)
		fun MINUS() : TerminalNode? = getToken(CqlParser.Tokens.MINUS.id, 0)
		fun findSyntaxBracketLs() : SyntaxBracketLsContext? = getRuleContext(solver.getType("SyntaxBracketLsContext"),0)
		fun findSyntaxBracketRs() : SyntaxBracketRsContext? = getRuleContext(solver.getType("SyntaxBracketRsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  assignmentElement() : AssignmentElementContext {
		var _localctx : AssignmentElementContext = AssignmentElementContext(context, state)
		enterRule(_localctx, 226, Rules.RULE_assignmentElement.id)
		var _la: Int
		try {
			this.state = 1650
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,127,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1597
			match(OBJECT_NAME) as Token
			this.state = 1598
			match(OPERATOR_EQ) as Token
			this.state = 1603
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,126,context) ) {
			1 -> {if (true){
			this.state = 1599
			constant()
			}}
			2 -> {if (true){
			this.state = 1600
			assignmentMap()
			}}
			3 -> {if (true){
			this.state = 1601
			assignmentSet()
			}}
			4 -> {if (true){
			this.state = 1602
			assignmentList()
			}}
			}
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1605
			match(OBJECT_NAME) as Token
			this.state = 1606
			match(OPERATOR_EQ) as Token
			this.state = 1607
			match(OBJECT_NAME) as Token
			this.state = 1608
			_la = _input!!.LA(1)
			if ( !(_la==PLUS || _la==MINUS) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 1609
			decimalLiteral()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 1610
			match(OBJECT_NAME) as Token
			this.state = 1611
			match(OPERATOR_EQ) as Token
			this.state = 1612
			match(OBJECT_NAME) as Token
			this.state = 1613
			_la = _input!!.LA(1)
			if ( !(_la==PLUS || _la==MINUS) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 1614
			assignmentSet()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 1615
			match(OBJECT_NAME) as Token
			this.state = 1616
			match(OPERATOR_EQ) as Token
			this.state = 1617
			assignmentSet()
			this.state = 1618
			_la = _input!!.LA(1)
			if ( !(_la==PLUS || _la==MINUS) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 1619
			match(OBJECT_NAME) as Token
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 1621
			match(OBJECT_NAME) as Token
			this.state = 1622
			match(OPERATOR_EQ) as Token
			this.state = 1623
			match(OBJECT_NAME) as Token
			this.state = 1624
			_la = _input!!.LA(1)
			if ( !(_la==PLUS || _la==MINUS) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 1625
			assignmentMap()
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 1626
			match(OBJECT_NAME) as Token
			this.state = 1627
			match(OPERATOR_EQ) as Token
			this.state = 1628
			assignmentMap()
			this.state = 1629
			_la = _input!!.LA(1)
			if ( !(_la==PLUS || _la==MINUS) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 1630
			match(OBJECT_NAME) as Token
			}}
			7 -> {
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 1632
			match(OBJECT_NAME) as Token
			this.state = 1633
			match(OPERATOR_EQ) as Token
			this.state = 1634
			match(OBJECT_NAME) as Token
			this.state = 1635
			_la = _input!!.LA(1)
			if ( !(_la==PLUS || _la==MINUS) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 1636
			assignmentList()
			}}
			8 -> {
			enterOuterAlt(_localctx, 8)
			if (true){
			this.state = 1637
			match(OBJECT_NAME) as Token
			this.state = 1638
			match(OPERATOR_EQ) as Token
			this.state = 1639
			assignmentList()
			this.state = 1640
			_la = _input!!.LA(1)
			if ( !(_la==PLUS || _la==MINUS) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 1641
			match(OBJECT_NAME) as Token
			}}
			9 -> {
			enterOuterAlt(_localctx, 9)
			if (true){
			this.state = 1643
			match(OBJECT_NAME) as Token
			this.state = 1644
			syntaxBracketLs()
			this.state = 1645
			decimalLiteral()
			this.state = 1646
			syntaxBracketRs()
			this.state = 1647
			match(OPERATOR_EQ) as Token
			this.state = 1648
			constant()
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

	open class AssignmentSetContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_assignmentSet.id
	        set(value) { throw RuntimeException() }
		fun findSyntaxBracketLc() : SyntaxBracketLcContext? = getRuleContext(solver.getType("SyntaxBracketLcContext"),0)
		fun findConstant() : List<ConstantContext> = getRuleContexts(solver.getType("ConstantContext"))
		fun findConstant(i: Int) : ConstantContext? = getRuleContext(solver.getType("ConstantContext"),i)
		fun findSyntaxBracketRc() : SyntaxBracketRcContext? = getRuleContext(solver.getType("SyntaxBracketRcContext"),0)
		fun findSyntaxComma() : List<SyntaxCommaContext> = getRuleContexts(solver.getType("SyntaxCommaContext"))
		fun findSyntaxComma(i: Int) : SyntaxCommaContext? = getRuleContext(solver.getType("SyntaxCommaContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  assignmentSet() : AssignmentSetContext {
		var _localctx : AssignmentSetContext = AssignmentSetContext(context, state)
		enterRule(_localctx, 228, Rules.RULE_assignmentSet.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1652
			syntaxBracketLc()
			this.state = 1653
			constant()
			this.state = 1659
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COMMA) {
				if (true){
				if (true){
				this.state = 1654
				syntaxComma()
				this.state = 1655
				constant()
				}
				}
				this.state = 1661
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 1662
			syntaxBracketRc()
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

	open class AssignmentMapContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_assignmentMap.id
	        set(value) { throw RuntimeException() }
		fun findSyntaxBracketLc() : SyntaxBracketLcContext? = getRuleContext(solver.getType("SyntaxBracketLcContext"),0)
		fun findSyntaxBracketRc() : SyntaxBracketRcContext? = getRuleContext(solver.getType("SyntaxBracketRcContext"),0)
		fun findConstant() : List<ConstantContext> = getRuleContexts(solver.getType("ConstantContext"))
		fun findConstant(i: Int) : ConstantContext? = getRuleContext(solver.getType("ConstantContext"),i)
		fun findSyntaxColon() : List<SyntaxColonContext> = getRuleContexts(solver.getType("SyntaxColonContext"))
		fun findSyntaxColon(i: Int) : SyntaxColonContext? = getRuleContext(solver.getType("SyntaxColonContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  assignmentMap() : AssignmentMapContext {
		var _localctx : AssignmentMapContext = AssignmentMapContext(context, state)
		enterRule(_localctx, 230, Rules.RULE_assignmentMap.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1664
			syntaxBracketLc()
			if (true){
			this.state = 1665
			constant()
			this.state = 1666
			syntaxColon()
			this.state = 1667
			constant()
			}
			this.state = 1675
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==K_FALSE || _la==K_NULL || ((((_la - 124)) and 0x3f.inv()) == 0 && ((1L shl (_la - 124)) and ((1L shl (K_TRUE - 124)) or (1L shl (STRING_LITERAL - 124)) or (1L shl (DECIMAL_LITERAL - 124)) or (1L shl (HEXADECIMAL_LITERAL - 124)) or (1L shl (UUID - 124)))) != 0L)) {
				if (true){
				if (true){
				this.state = 1669
				constant()
				this.state = 1670
				syntaxColon()
				this.state = 1671
				constant()
				}
				}
				this.state = 1677
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 1678
			syntaxBracketRc()
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

	open class AssignmentListContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_assignmentList.id
	        set(value) { throw RuntimeException() }
		fun findSyntaxBracketLs() : SyntaxBracketLsContext? = getRuleContext(solver.getType("SyntaxBracketLsContext"),0)
		fun findConstant() : List<ConstantContext> = getRuleContexts(solver.getType("ConstantContext"))
		fun findConstant(i: Int) : ConstantContext? = getRuleContext(solver.getType("ConstantContext"),i)
		fun findSyntaxBracketRs() : SyntaxBracketRsContext? = getRuleContext(solver.getType("SyntaxBracketRsContext"),0)
		fun findSyntaxColon() : List<SyntaxColonContext> = getRuleContexts(solver.getType("SyntaxColonContext"))
		fun findSyntaxColon(i: Int) : SyntaxColonContext? = getRuleContext(solver.getType("SyntaxColonContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  assignmentList() : AssignmentListContext {
		var _localctx : AssignmentListContext = AssignmentListContext(context, state)
		enterRule(_localctx, 232, Rules.RULE_assignmentList.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1680
			syntaxBracketLs()
			this.state = 1681
			constant()
			this.state = 1687
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLON) {
				if (true){
				if (true){
				this.state = 1682
				syntaxColon()
				this.state = 1683
				constant()
				}
				}
				this.state = 1689
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 1690
			syntaxBracketRs()
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

	open class InsertContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_insert.id
	        set(value) { throw RuntimeException() }
		fun findKwInsert() : KwInsertContext? = getRuleContext(solver.getType("KwInsertContext"),0)
		fun findKwInto() : KwIntoContext? = getRuleContext(solver.getType("KwIntoContext"),0)
		fun findTable() : TableContext? = getRuleContext(solver.getType("TableContext"),0)
		fun findInsertColumnSpec() : InsertColumnSpecContext? = getRuleContext(solver.getType("InsertColumnSpecContext"),0)
		fun findInsertValuesSpec() : InsertValuesSpecContext? = getRuleContext(solver.getType("InsertValuesSpecContext"),0)
		fun findBeginBatch() : BeginBatchContext? = getRuleContext(solver.getType("BeginBatchContext"),0)
		fun findKeyspace() : KeyspaceContext? = getRuleContext(solver.getType("KeyspaceContext"),0)
		fun DOT() : TerminalNode? = getToken(CqlParser.Tokens.DOT.id, 0)
		fun findIfNotExist() : IfNotExistContext? = getRuleContext(solver.getType("IfNotExistContext"),0)
		fun findUsingTtlTimestamp() : UsingTtlTimestampContext? = getRuleContext(solver.getType("UsingTtlTimestampContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  insert() : InsertContext {
		var _localctx : InsertContext = InsertContext(context, state)
		enterRule(_localctx, 234, Rules.RULE_insert.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1694
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			K_BEGIN  ->  /*LL1AltBlock*/{if (true){
			this.state = 1692
			beginBatch()
			}}
			K_INSERT  ->  /*LL1AltBlock*/{if (true){
			}}
			else -> throw NoViableAltException(this)
			}
			this.state = 1696
			kwInsert()
			this.state = 1697
			kwInto()
			this.state = 1702
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,132,context) ) {
			1 -> {if (true){
			this.state = 1698
			keyspace()
			this.state = 1699
			match(DOT) as Token
			}}
			2 -> {if (true){
			}}
			}
			this.state = 1704
			table()
			this.state = 1705
			insertColumnSpec()
			this.state = 1706
			insertValuesSpec()
			this.state = 1709
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			K_IF  ->  /*LL1AltBlock*/{if (true){
			this.state = 1707
			ifNotExist()
			}}
			EOF , SEMI , MINUSMINUS , K_USING  ->  /*LL1AltBlock*/{if (true){
			}}
			else -> throw NoViableAltException(this)
			}
			this.state = 1712
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_USING) {
				if (true){
				this.state = 1711
				usingTtlTimestamp()
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

	open class UsingTtlTimestampContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_usingTtlTimestamp.id
	        set(value) { throw RuntimeException() }
		fun findKwUsing() : KwUsingContext? = getRuleContext(solver.getType("KwUsingContext"),0)
		fun findTtl() : TtlContext? = getRuleContext(solver.getType("TtlContext"),0)
		fun findKwAnd() : KwAndContext? = getRuleContext(solver.getType("KwAndContext"),0)
		fun findTimestamp() : TimestampContext? = getRuleContext(solver.getType("TimestampContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  usingTtlTimestamp() : UsingTtlTimestampContext {
		var _localctx : UsingTtlTimestampContext = UsingTtlTimestampContext(context, state)
		enterRule(_localctx, 236, Rules.RULE_usingTtlTimestamp.id)
		try {
			this.state = 1730
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,135,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1714
			kwUsing()
			this.state = 1715
			ttl()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1717
			kwUsing()
			this.state = 1718
			ttl()
			this.state = 1719
			kwAnd()
			this.state = 1720
			timestamp()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 1722
			kwUsing()
			this.state = 1723
			timestamp()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 1725
			kwUsing()
			this.state = 1726
			timestamp()
			this.state = 1727
			kwAnd()
			this.state = 1728
			ttl()
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

	open class TimestampContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_timestamp.id
	        set(value) { throw RuntimeException() }
		fun findKwTimestamp() : KwTimestampContext? = getRuleContext(solver.getType("KwTimestampContext"),0)
		fun findDecimalLiteral() : DecimalLiteralContext? = getRuleContext(solver.getType("DecimalLiteralContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  timestamp() : TimestampContext {
		var _localctx : TimestampContext = TimestampContext(context, state)
		enterRule(_localctx, 238, Rules.RULE_timestamp.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1732
			kwTimestamp()
			this.state = 1733
			decimalLiteral()
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

	open class TtlContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_ttl.id
	        set(value) { throw RuntimeException() }
		fun findKwTtl() : KwTtlContext? = getRuleContext(solver.getType("KwTtlContext"),0)
		fun findDecimalLiteral() : DecimalLiteralContext? = getRuleContext(solver.getType("DecimalLiteralContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  ttl() : TtlContext {
		var _localctx : TtlContext = TtlContext(context, state)
		enterRule(_localctx, 240, Rules.RULE_ttl.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1735
			kwTtl()
			this.state = 1736
			decimalLiteral()
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

	open class UsingTimestampSpecContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_usingTimestampSpec.id
	        set(value) { throw RuntimeException() }
		fun findKwUsing() : KwUsingContext? = getRuleContext(solver.getType("KwUsingContext"),0)
		fun findTimestamp() : TimestampContext? = getRuleContext(solver.getType("TimestampContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  usingTimestampSpec() : UsingTimestampSpecContext {
		var _localctx : UsingTimestampSpecContext = UsingTimestampSpecContext(context, state)
		enterRule(_localctx, 242, Rules.RULE_usingTimestampSpec.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1738
			kwUsing()
			this.state = 1739
			timestamp()
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

	open class IfNotExistContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_ifNotExist.id
	        set(value) { throw RuntimeException() }
		fun findKwIf() : KwIfContext? = getRuleContext(solver.getType("KwIfContext"),0)
		fun findKwNot() : KwNotContext? = getRuleContext(solver.getType("KwNotContext"),0)
		fun findKwExists() : KwExistsContext? = getRuleContext(solver.getType("KwExistsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  ifNotExist() : IfNotExistContext {
		var _localctx : IfNotExistContext = IfNotExistContext(context, state)
		enterRule(_localctx, 244, Rules.RULE_ifNotExist.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1741
			kwIf()
			this.state = 1742
			kwNot()
			this.state = 1743
			kwExists()
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

	open class IfExistContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_ifExist.id
	        set(value) { throw RuntimeException() }
		fun findKwIf() : KwIfContext? = getRuleContext(solver.getType("KwIfContext"),0)
		fun findKwExists() : KwExistsContext? = getRuleContext(solver.getType("KwExistsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  ifExist() : IfExistContext {
		var _localctx : IfExistContext = IfExistContext(context, state)
		enterRule(_localctx, 246, Rules.RULE_ifExist.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1745
			kwIf()
			this.state = 1746
			kwExists()
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

	open class InsertValuesSpecContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_insertValuesSpec.id
	        set(value) { throw RuntimeException() }
		fun findKwValues() : KwValuesContext? = getRuleContext(solver.getType("KwValuesContext"),0)
		fun findExpressionList() : ExpressionListContext? = getRuleContext(solver.getType("ExpressionListContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  insertValuesSpec() : InsertValuesSpecContext {
		var _localctx : InsertValuesSpecContext = InsertValuesSpecContext(context, state)
		enterRule(_localctx, 248, Rules.RULE_insertValuesSpec.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1748
			kwValues()
			this.state = 1749
			match(LR_BRACKET) as Token
			this.state = 1750
			expressionList()
			this.state = 1751
			match(RR_BRACKET) as Token
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

	open class InsertColumnSpecContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_insertColumnSpec.id
	        set(value) { throw RuntimeException() }
		fun findColumnList() : ColumnListContext? = getRuleContext(solver.getType("ColumnListContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  insertColumnSpec() : InsertColumnSpecContext {
		var _localctx : InsertColumnSpecContext = InsertColumnSpecContext(context, state)
		enterRule(_localctx, 250, Rules.RULE_insertColumnSpec.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1753
			match(LR_BRACKET) as Token
			this.state = 1754
			columnList()
			this.state = 1755
			match(RR_BRACKET) as Token
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

	open class ColumnListContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_columnList.id
	        set(value) { throw RuntimeException() }
		fun findColumn() : List<ColumnContext> = getRuleContexts(solver.getType("ColumnContext"))
		fun findColumn(i: Int) : ColumnContext? = getRuleContext(solver.getType("ColumnContext"),i)
		fun findSyntaxComma() : List<SyntaxCommaContext> = getRuleContexts(solver.getType("SyntaxCommaContext"))
		fun findSyntaxComma(i: Int) : SyntaxCommaContext? = getRuleContext(solver.getType("SyntaxCommaContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  columnList() : ColumnListContext {
		var _localctx : ColumnListContext = ColumnListContext(context, state)
		enterRule(_localctx, 252, Rules.RULE_columnList.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1757
			column()
			this.state = 1763
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COMMA) {
				if (true){
				if (true){
				this.state = 1758
				syntaxComma()
				this.state = 1759
				column()
				}
				}
				this.state = 1765
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

	open class ExpressionListContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_expressionList.id
	        set(value) { throw RuntimeException() }
		fun findConstant() : List<ConstantContext> = getRuleContexts(solver.getType("ConstantContext"))
		fun findConstant(i: Int) : ConstantContext? = getRuleContext(solver.getType("ConstantContext"),i)
		fun findAssignmentMap() : List<AssignmentMapContext> = getRuleContexts(solver.getType("AssignmentMapContext"))
		fun findAssignmentMap(i: Int) : AssignmentMapContext? = getRuleContext(solver.getType("AssignmentMapContext"),i)
		fun findAssignmentSet() : List<AssignmentSetContext> = getRuleContexts(solver.getType("AssignmentSetContext"))
		fun findAssignmentSet(i: Int) : AssignmentSetContext? = getRuleContext(solver.getType("AssignmentSetContext"),i)
		fun findAssignmentList() : List<AssignmentListContext> = getRuleContexts(solver.getType("AssignmentListContext"))
		fun findAssignmentList(i: Int) : AssignmentListContext? = getRuleContext(solver.getType("AssignmentListContext"),i)
		fun findSyntaxComma() : List<SyntaxCommaContext> = getRuleContexts(solver.getType("SyntaxCommaContext"))
		fun findSyntaxComma(i: Int) : SyntaxCommaContext? = getRuleContext(solver.getType("SyntaxCommaContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  expressionList() : ExpressionListContext {
		var _localctx : ExpressionListContext = ExpressionListContext(context, state)
		enterRule(_localctx, 254, Rules.RULE_expressionList.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1770
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,137,context) ) {
			1 -> {if (true){
			this.state = 1766
			constant()
			}}
			2 -> {if (true){
			this.state = 1767
			assignmentMap()
			}}
			3 -> {if (true){
			this.state = 1768
			assignmentSet()
			}}
			4 -> {if (true){
			this.state = 1769
			assignmentList()
			}}
			}
			this.state = 1781
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COMMA) {
				if (true){
				if (true){
				this.state = 1772
				syntaxComma()
				this.state = 1777
				errorHandler.sync(this)
				when ( interpreter!!.adaptivePredict(_input!!,138,context) ) {
				1 -> {if (true){
				this.state = 1773
				constant()
				}}
				2 -> {if (true){
				this.state = 1774
				assignmentMap()
				}}
				3 -> {if (true){
				this.state = 1775
				assignmentSet()
				}}
				4 -> {if (true){
				this.state = 1776
				assignmentList()
				}}
				}
				}
				}
				this.state = 1783
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

	open class SelectContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_select.id
	        set(value) { throw RuntimeException() }
		fun findKwSelect() : KwSelectContext? = getRuleContext(solver.getType("KwSelectContext"),0)
		fun findSelectElements() : SelectElementsContext? = getRuleContext(solver.getType("SelectElementsContext"),0)
		fun findFromSpec() : FromSpecContext? = getRuleContext(solver.getType("FromSpecContext"),0)
		fun findDistinctSpec() : DistinctSpecContext? = getRuleContext(solver.getType("DistinctSpecContext"),0)
		fun findWhereSpec() : WhereSpecContext? = getRuleContext(solver.getType("WhereSpecContext"),0)
		fun findOrderSpec() : OrderSpecContext? = getRuleContext(solver.getType("OrderSpecContext"),0)
		fun findLimitSpec() : LimitSpecContext? = getRuleContext(solver.getType("LimitSpecContext"),0)
		fun findAllowFilteringSpec() : AllowFilteringSpecContext? = getRuleContext(solver.getType("AllowFilteringSpecContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  select() : SelectContext {
		var _localctx : SelectContext = SelectContext(context, state)
		enterRule(_localctx, 256, Rules.RULE_select.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1784
			kwSelect()
			this.state = 1787
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			K_DISTINCT  ->  /*LL1AltBlock*/{if (true){
			this.state = 1785
			distinctSpec()
			}}
			STAR , OBJECT_NAME  ->  /*LL1AltBlock*/{if (true){
			}}
			else -> throw NoViableAltException(this)
			}
			this.state = 1789
			selectElements()
			this.state = 1790
			fromSpec()
			this.state = 1792
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_WHERE) {
				if (true){
				this.state = 1791
				whereSpec()
				}
			}

			this.state = 1795
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_ORDER) {
				if (true){
				this.state = 1794
				orderSpec()
				}
			}

			this.state = 1798
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_LIMIT) {
				if (true){
				this.state = 1797
				limitSpec()
				}
			}

			this.state = 1801
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_ALLOW) {
				if (true){
				this.state = 1800
				allowFilteringSpec()
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

	open class AllowFilteringSpecContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_allowFilteringSpec.id
	        set(value) { throw RuntimeException() }
		fun findKwAllow() : KwAllowContext? = getRuleContext(solver.getType("KwAllowContext"),0)
		fun findKwFiltering() : KwFilteringContext? = getRuleContext(solver.getType("KwFilteringContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  allowFilteringSpec() : AllowFilteringSpecContext {
		var _localctx : AllowFilteringSpecContext = AllowFilteringSpecContext(context, state)
		enterRule(_localctx, 258, Rules.RULE_allowFilteringSpec.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1803
			kwAllow()
			this.state = 1804
			kwFiltering()
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

	open class LimitSpecContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_limitSpec.id
	        set(value) { throw RuntimeException() }
		fun findKwLimit() : KwLimitContext? = getRuleContext(solver.getType("KwLimitContext"),0)
		fun findDecimalLiteral() : DecimalLiteralContext? = getRuleContext(solver.getType("DecimalLiteralContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  limitSpec() : LimitSpecContext {
		var _localctx : LimitSpecContext = LimitSpecContext(context, state)
		enterRule(_localctx, 260, Rules.RULE_limitSpec.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1806
			kwLimit()
			this.state = 1807
			decimalLiteral()
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

	open class FromSpecContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_fromSpec.id
	        set(value) { throw RuntimeException() }
		fun findKwFrom() : KwFromContext? = getRuleContext(solver.getType("KwFromContext"),0)
		fun findFromSpecElement() : FromSpecElementContext? = getRuleContext(solver.getType("FromSpecElementContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  fromSpec() : FromSpecContext {
		var _localctx : FromSpecContext = FromSpecContext(context, state)
		enterRule(_localctx, 262, Rules.RULE_fromSpec.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1809
			kwFrom()
			this.state = 1810
			fromSpecElement()
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

	open class FromSpecElementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_fromSpecElement.id
	        set(value) { throw RuntimeException() }
		fun OBJECT_NAME() : List<TerminalNode> = getTokens(CqlParser.Tokens.OBJECT_NAME.id)
		fun OBJECT_NAME(i: Int) : TerminalNode = getToken(CqlParser.Tokens.OBJECT_NAME.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  fromSpecElement() : FromSpecElementContext {
		var _localctx : FromSpecElementContext = FromSpecElementContext(context, state)
		enterRule(_localctx, 264, Rules.RULE_fromSpecElement.id)
		try {
			this.state = 1816
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,145,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1812
			match(OBJECT_NAME) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1813
			match(OBJECT_NAME) as Token
			this.state = 1814
			match(DOT) as Token
			this.state = 1815
			match(OBJECT_NAME) as Token
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

	open class OrderSpecContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_orderSpec.id
	        set(value) { throw RuntimeException() }
		fun findKwOrder() : KwOrderContext? = getRuleContext(solver.getType("KwOrderContext"),0)
		fun findKwBy() : KwByContext? = getRuleContext(solver.getType("KwByContext"),0)
		fun findOrderSpecElement() : OrderSpecElementContext? = getRuleContext(solver.getType("OrderSpecElementContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  orderSpec() : OrderSpecContext {
		var _localctx : OrderSpecContext = OrderSpecContext(context, state)
		enterRule(_localctx, 266, Rules.RULE_orderSpec.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1818
			kwOrder()
			this.state = 1819
			kwBy()
			this.state = 1820
			orderSpecElement()
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

	open class OrderSpecElementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_orderSpecElement.id
	        set(value) { throw RuntimeException() }
		fun OBJECT_NAME() : TerminalNode? = getToken(CqlParser.Tokens.OBJECT_NAME.id, 0)
		fun findKwAsc() : KwAscContext? = getRuleContext(solver.getType("KwAscContext"),0)
		fun findKwDesc() : KwDescContext? = getRuleContext(solver.getType("KwDescContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  orderSpecElement() : OrderSpecElementContext {
		var _localctx : OrderSpecElementContext = OrderSpecElementContext(context, state)
		enterRule(_localctx, 268, Rules.RULE_orderSpecElement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1822
			match(OBJECT_NAME) as Token
			this.state = 1825
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			K_ASC  -> 
				if (true){
				this.state = 1823
				kwAsc()
				}
			K_DESC  -> 
				if (true){
				this.state = 1824
				kwDesc()
				}
			EOF , SEMI , MINUSMINUS , K_ALLOW , K_LIMIT  -> 
				Unit
			else -> Unit
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

	open class WhereSpecContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_whereSpec.id
	        set(value) { throw RuntimeException() }
		fun findKwWhere() : KwWhereContext? = getRuleContext(solver.getType("KwWhereContext"),0)
		fun findRelationElements() : RelationElementsContext? = getRuleContext(solver.getType("RelationElementsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  whereSpec() : WhereSpecContext {
		var _localctx : WhereSpecContext = WhereSpecContext(context, state)
		enterRule(_localctx, 270, Rules.RULE_whereSpec.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1827
			kwWhere()
			this.state = 1828
			relationElements()
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

	open class DistinctSpecContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_distinctSpec.id
	        set(value) { throw RuntimeException() }
		fun findKwDistinct() : KwDistinctContext? = getRuleContext(solver.getType("KwDistinctContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  distinctSpec() : DistinctSpecContext {
		var _localctx : DistinctSpecContext = DistinctSpecContext(context, state)
		enterRule(_localctx, 272, Rules.RULE_distinctSpec.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1830
			kwDistinct()
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

	open class SelectElementsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_selectElements.id
	        set(value) { throw RuntimeException() }
		var star: Token? = null
		fun findSelectElement() : List<SelectElementContext> = getRuleContexts(solver.getType("SelectElementContext"))
		fun findSelectElement(i: Int) : SelectElementContext? = getRuleContext(solver.getType("SelectElementContext"),i)
		fun findSyntaxComma() : List<SyntaxCommaContext> = getRuleContexts(solver.getType("SyntaxCommaContext"))
		fun findSyntaxComma(i: Int) : SyntaxCommaContext? = getRuleContext(solver.getType("SyntaxCommaContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  selectElements() : SelectElementsContext {
		var _localctx : SelectElementsContext = SelectElementsContext(context, state)
		enterRule(_localctx, 274, Rules.RULE_selectElements.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1834
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			STAR  ->  /*LL1AltBlock*/{if (true){
			this.state = 1832
			(_localctx as SelectElementsContext).star = match(STAR) as Token
			}}
			OBJECT_NAME  ->  /*LL1AltBlock*/{if (true){
			this.state = 1833
			selectElement()
			}}
			else -> throw NoViableAltException(this)
			}
			this.state = 1841
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COMMA) {
				if (true){
				if (true){
				this.state = 1836
				syntaxComma()
				this.state = 1837
				selectElement()
				}
				}
				this.state = 1843
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

	open class SelectElementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_selectElement.id
	        set(value) { throw RuntimeException() }
		fun OBJECT_NAME() : List<TerminalNode> = getTokens(CqlParser.Tokens.OBJECT_NAME.id)
		fun OBJECT_NAME(i: Int) : TerminalNode = getToken(CqlParser.Tokens.OBJECT_NAME.id, i) as TerminalNode
		fun findKwAs() : KwAsContext? = getRuleContext(solver.getType("KwAsContext"),0)
		fun findFunctionCall() : FunctionCallContext? = getRuleContext(solver.getType("FunctionCallContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  selectElement() : SelectElementContext {
		var _localctx : SelectElementContext = SelectElementContext(context, state)
		enterRule(_localctx, 276, Rules.RULE_selectElement.id)
		var _la: Int
		try {
			this.state = 1859
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,151,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1844
			match(OBJECT_NAME) as Token
			this.state = 1845
			match(DOT) as Token
			this.state = 1846
			match(STAR) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1847
			match(OBJECT_NAME) as Token
			this.state = 1851
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_AS) {
				if (true){
				this.state = 1848
				kwAs()
				this.state = 1849
				match(OBJECT_NAME) as Token
				}
			}

			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 1853
			functionCall()
			this.state = 1857
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_AS) {
				if (true){
				this.state = 1854
				kwAs()
				this.state = 1855
				match(OBJECT_NAME) as Token
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

	open class RelationElementsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_relationElements.id
	        set(value) { throw RuntimeException() }
		fun findRelationElement() : List<RelationElementContext> = getRuleContexts(solver.getType("RelationElementContext"))
		fun findRelationElement(i: Int) : RelationElementContext? = getRuleContext(solver.getType("RelationElementContext"),i)
		fun findKwAnd() : List<KwAndContext> = getRuleContexts(solver.getType("KwAndContext"))
		fun findKwAnd(i: Int) : KwAndContext? = getRuleContext(solver.getType("KwAndContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  relationElements() : RelationElementsContext {
		var _localctx : RelationElementsContext = RelationElementsContext(context, state)
		enterRule(_localctx, 278, Rules.RULE_relationElements.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 1861
			relationElement()
			}
			this.state = 1867
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==K_AND) {
				if (true){
				if (true){
				this.state = 1862
				kwAnd()
				this.state = 1863
				relationElement()
				}
				}
				this.state = 1869
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

	open class RelationElementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_relationElement.id
	        set(value) { throw RuntimeException() }
		fun OBJECT_NAME() : List<TerminalNode> = getTokens(CqlParser.Tokens.OBJECT_NAME.id)
		fun OBJECT_NAME(i: Int) : TerminalNode = getToken(CqlParser.Tokens.OBJECT_NAME.id, i) as TerminalNode
		fun findConstant() : ConstantContext? = getRuleContext(solver.getType("ConstantContext"),0)
		fun OPERATOR_EQ() : TerminalNode? = getToken(CqlParser.Tokens.OPERATOR_EQ.id, 0)
		fun OPERATOR_LT() : TerminalNode? = getToken(CqlParser.Tokens.OPERATOR_LT.id, 0)
		fun OPERATOR_GT() : TerminalNode? = getToken(CqlParser.Tokens.OPERATOR_GT.id, 0)
		fun OPERATOR_LTE() : TerminalNode? = getToken(CqlParser.Tokens.OPERATOR_LTE.id, 0)
		fun OPERATOR_GTE() : TerminalNode? = getToken(CqlParser.Tokens.OPERATOR_GTE.id, 0)
		fun findFunctionCall() : List<FunctionCallContext> = getRuleContexts(solver.getType("FunctionCallContext"))
		fun findFunctionCall(i: Int) : FunctionCallContext? = getRuleContext(solver.getType("FunctionCallContext"),i)
		fun findKwIn() : KwInContext? = getRuleContext(solver.getType("KwInContext"),0)
		fun findFunctionArgs() : FunctionArgsContext? = getRuleContext(solver.getType("FunctionArgsContext"),0)
		fun findRelalationContainsKey() : RelalationContainsKeyContext? = getRuleContext(solver.getType("RelalationContainsKeyContext"),0)
		fun findRelalationContains() : RelalationContainsContext? = getRuleContext(solver.getType("RelalationContainsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  relationElement() : RelationElementContext {
		var _localctx : RelationElementContext = RelationElementContext(context, state)
		enterRule(_localctx, 280, Rules.RULE_relationElement.id)
		var _la: Int
		try {
			this.state = 1896
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,154,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1870
			match(OBJECT_NAME) as Token
			this.state = 1871
			_la = _input!!.LA(1)
			if ( !(((((_la - 170)) and 0x3f.inv()) == 0 && ((1L shl (_la - 170)) and ((1L shl (OPERATOR_EQ - 170)) or (1L shl (OPERATOR_LT - 170)) or (1L shl (OPERATOR_GT - 170)) or (1L shl (OPERATOR_LTE - 170)) or (1L shl (OPERATOR_GTE - 170)))) != 0L)) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 1872
			constant()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1873
			match(OBJECT_NAME) as Token
			this.state = 1874
			match(DOT) as Token
			this.state = 1875
			match(OBJECT_NAME) as Token
			this.state = 1876
			_la = _input!!.LA(1)
			if ( !(((((_la - 170)) and 0x3f.inv()) == 0 && ((1L shl (_la - 170)) and ((1L shl (OPERATOR_EQ - 170)) or (1L shl (OPERATOR_LT - 170)) or (1L shl (OPERATOR_GT - 170)) or (1L shl (OPERATOR_LTE - 170)) or (1L shl (OPERATOR_GTE - 170)))) != 0L)) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 1877
			constant()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 1878
			functionCall()
			this.state = 1879
			_la = _input!!.LA(1)
			if ( !(((((_la - 170)) and 0x3f.inv()) == 0 && ((1L shl (_la - 170)) and ((1L shl (OPERATOR_EQ - 170)) or (1L shl (OPERATOR_LT - 170)) or (1L shl (OPERATOR_GT - 170)) or (1L shl (OPERATOR_LTE - 170)) or (1L shl (OPERATOR_GTE - 170)))) != 0L)) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 1880
			constant()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 1882
			functionCall()
			this.state = 1883
			_la = _input!!.LA(1)
			if ( !(((((_la - 170)) and 0x3f.inv()) == 0 && ((1L shl (_la - 170)) and ((1L shl (OPERATOR_EQ - 170)) or (1L shl (OPERATOR_LT - 170)) or (1L shl (OPERATOR_GT - 170)) or (1L shl (OPERATOR_LTE - 170)) or (1L shl (OPERATOR_GTE - 170)))) != 0L)) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 1884
			functionCall()
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 1886
			match(OBJECT_NAME) as Token
			this.state = 1887
			kwIn()
			this.state = 1888
			match(LR_BRACKET) as Token
			this.state = 1890
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_FALSE || _la==K_NULL || ((((_la - 124)) and 0x3f.inv()) == 0 && ((1L shl (_la - 124)) and ((1L shl (K_TRUE - 124)) or (1L shl (STRING_LITERAL - 124)) or (1L shl (DECIMAL_LITERAL - 124)) or (1L shl (HEXADECIMAL_LITERAL - 124)) or (1L shl (OBJECT_NAME - 124)) or (1L shl (UUID - 124)))) != 0L)) {
				if (true){
				this.state = 1889
				functionArgs()
				}
			}

			this.state = 1892
			match(RR_BRACKET) as Token
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 1894
			relalationContainsKey()
			}}
			7 -> {
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 1895
			relalationContains()
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

	open class RelalationContainsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_relalationContains.id
	        set(value) { throw RuntimeException() }
		fun OBJECT_NAME() : TerminalNode? = getToken(CqlParser.Tokens.OBJECT_NAME.id, 0)
		fun findKwContains() : KwContainsContext? = getRuleContext(solver.getType("KwContainsContext"),0)
		fun findConstant() : ConstantContext? = getRuleContext(solver.getType("ConstantContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  relalationContains() : RelalationContainsContext {
		var _localctx : RelalationContainsContext = RelalationContainsContext(context, state)
		enterRule(_localctx, 282, Rules.RULE_relalationContains.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1898
			match(OBJECT_NAME) as Token
			this.state = 1899
			kwContains()
			this.state = 1900
			constant()
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

	open class RelalationContainsKeyContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_relalationContainsKey.id
	        set(value) { throw RuntimeException() }
		fun OBJECT_NAME() : TerminalNode? = getToken(CqlParser.Tokens.OBJECT_NAME.id, 0)
		fun findConstant() : ConstantContext? = getRuleContext(solver.getType("ConstantContext"),0)
		fun findKwContains() : KwContainsContext? = getRuleContext(solver.getType("KwContainsContext"),0)
		fun findKwKey() : KwKeyContext? = getRuleContext(solver.getType("KwKeyContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  relalationContainsKey() : RelalationContainsKeyContext {
		var _localctx : RelalationContainsKeyContext = RelalationContainsKeyContext(context, state)
		enterRule(_localctx, 284, Rules.RULE_relalationContainsKey.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1902
			match(OBJECT_NAME) as Token
			if (true){
			this.state = 1903
			kwContains()
			this.state = 1904
			kwKey()
			}
			this.state = 1906
			constant()
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

	open class FunctionCallContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_functionCall.id
	        set(value) { throw RuntimeException() }
		fun OBJECT_NAME() : TerminalNode? = getToken(CqlParser.Tokens.OBJECT_NAME.id, 0)
		fun STAR() : TerminalNode? = getToken(CqlParser.Tokens.STAR.id, 0)
		fun findFunctionArgs() : FunctionArgsContext? = getRuleContext(solver.getType("FunctionArgsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  functionCall() : FunctionCallContext {
		var _localctx : FunctionCallContext = FunctionCallContext(context, state)
		enterRule(_localctx, 286, Rules.RULE_functionCall.id)
		var _la: Int
		try {
			this.state = 1918
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,156,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1908
			match(OBJECT_NAME) as Token
			this.state = 1909
			match(LR_BRACKET) as Token
			this.state = 1910
			match(STAR) as Token
			this.state = 1911
			match(RR_BRACKET) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1912
			match(OBJECT_NAME) as Token
			this.state = 1913
			match(LR_BRACKET) as Token
			this.state = 1915
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==K_FALSE || _la==K_NULL || ((((_la - 124)) and 0x3f.inv()) == 0 && ((1L shl (_la - 124)) and ((1L shl (K_TRUE - 124)) or (1L shl (STRING_LITERAL - 124)) or (1L shl (DECIMAL_LITERAL - 124)) or (1L shl (HEXADECIMAL_LITERAL - 124)) or (1L shl (OBJECT_NAME - 124)) or (1L shl (UUID - 124)))) != 0L)) {
				if (true){
				this.state = 1914
				functionArgs()
				}
			}

			this.state = 1917
			match(RR_BRACKET) as Token
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

	open class FunctionArgsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_functionArgs.id
	        set(value) { throw RuntimeException() }
		fun findConstant() : List<ConstantContext> = getRuleContexts(solver.getType("ConstantContext"))
		fun findConstant(i: Int) : ConstantContext? = getRuleContext(solver.getType("ConstantContext"),i)
		fun OBJECT_NAME() : List<TerminalNode> = getTokens(CqlParser.Tokens.OBJECT_NAME.id)
		fun OBJECT_NAME(i: Int) : TerminalNode = getToken(CqlParser.Tokens.OBJECT_NAME.id, i) as TerminalNode
		fun findFunctionCall() : List<FunctionCallContext> = getRuleContexts(solver.getType("FunctionCallContext"))
		fun findFunctionCall(i: Int) : FunctionCallContext? = getRuleContext(solver.getType("FunctionCallContext"),i)
		fun findSyntaxComma() : List<SyntaxCommaContext> = getRuleContexts(solver.getType("SyntaxCommaContext"))
		fun findSyntaxComma(i: Int) : SyntaxCommaContext? = getRuleContext(solver.getType("SyntaxCommaContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  functionArgs() : FunctionArgsContext {
		var _localctx : FunctionArgsContext = FunctionArgsContext(context, state)
		enterRule(_localctx, 288, Rules.RULE_functionArgs.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1923
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,157,context) ) {
			1 -> {if (true){
			this.state = 1920
			constant()
			}}
			2 -> {if (true){
			this.state = 1921
			match(OBJECT_NAME) as Token
			}}
			3 -> {if (true){
			this.state = 1922
			functionCall()
			}}
			}
			this.state = 1933
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COMMA) {
				if (true){
				if (true){
				this.state = 1925
				syntaxComma()
				this.state = 1929
				errorHandler.sync(this)
				when ( interpreter!!.adaptivePredict(_input!!,158,context) ) {
				1 -> {if (true){
				this.state = 1926
				constant()
				}}
				2 -> {if (true){
				this.state = 1927
				match(OBJECT_NAME) as Token
				}}
				3 -> {if (true){
				this.state = 1928
				functionCall()
				}}
				}
				}
				}
				this.state = 1935
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

	open class ConstantContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_constant.id
	        set(value) { throw RuntimeException() }
		fun UUID() : TerminalNode? = getToken(CqlParser.Tokens.UUID.id, 0)
		fun findStringLiteral() : StringLiteralContext? = getRuleContext(solver.getType("StringLiteralContext"),0)
		fun findDecimalLiteral() : DecimalLiteralContext? = getRuleContext(solver.getType("DecimalLiteralContext"),0)
		fun findHexadecimalLiteral() : HexadecimalLiteralContext? = getRuleContext(solver.getType("HexadecimalLiteralContext"),0)
		fun findBooleanLiteral() : BooleanLiteralContext? = getRuleContext(solver.getType("BooleanLiteralContext"),0)
		fun findKwNull() : KwNullContext? = getRuleContext(solver.getType("KwNullContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  constant() : ConstantContext {
		var _localctx : ConstantContext = ConstantContext(context, state)
		enterRule(_localctx, 290, Rules.RULE_constant.id)
		try {
			this.state = 1942
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			UUID  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1936
			match(UUID) as Token
			}}
			STRING_LITERAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1937
			stringLiteral()
			}}
			DECIMAL_LITERAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 1938
			decimalLiteral()
			}}
			HEXADECIMAL_LITERAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 1939
			hexadecimalLiteral()
			}}
			K_FALSE , K_TRUE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 1940
			booleanLiteral()
			}}
			K_NULL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 1941
			kwNull()
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

	open class DecimalLiteralContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_decimalLiteral.id
	        set(value) { throw RuntimeException() }
		fun DECIMAL_LITERAL() : TerminalNode? = getToken(CqlParser.Tokens.DECIMAL_LITERAL.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  decimalLiteral() : DecimalLiteralContext {
		var _localctx : DecimalLiteralContext = DecimalLiteralContext(context, state)
		enterRule(_localctx, 292, Rules.RULE_decimalLiteral.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1944
			match(DECIMAL_LITERAL) as Token
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

	open class FloatLiteralContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_floatLiteral.id
	        set(value) { throw RuntimeException() }
		fun DECIMAL_LITERAL() : TerminalNode? = getToken(CqlParser.Tokens.DECIMAL_LITERAL.id, 0)
		fun FLOAT_LITERAL() : TerminalNode? = getToken(CqlParser.Tokens.FLOAT_LITERAL.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  floatLiteral() : FloatLiteralContext {
		var _localctx : FloatLiteralContext = FloatLiteralContext(context, state)
		enterRule(_localctx, 294, Rules.RULE_floatLiteral.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1946
			_la = _input!!.LA(1)
			if ( !(_la==DECIMAL_LITERAL || _la==FLOAT_LITERAL) ) {
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

	open class StringLiteralContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_stringLiteral.id
	        set(value) { throw RuntimeException() }
		fun STRING_LITERAL() : TerminalNode? = getToken(CqlParser.Tokens.STRING_LITERAL.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  stringLiteral() : StringLiteralContext {
		var _localctx : StringLiteralContext = StringLiteralContext(context, state)
		enterRule(_localctx, 296, Rules.RULE_stringLiteral.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1948
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

	open class BooleanLiteralContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_booleanLiteral.id
	        set(value) { throw RuntimeException() }
		fun K_TRUE() : TerminalNode? = getToken(CqlParser.Tokens.K_TRUE.id, 0)
		fun K_FALSE() : TerminalNode? = getToken(CqlParser.Tokens.K_FALSE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  booleanLiteral() : BooleanLiteralContext {
		var _localctx : BooleanLiteralContext = BooleanLiteralContext(context, state)
		enterRule(_localctx, 298, Rules.RULE_booleanLiteral.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1950
			_la = _input!!.LA(1)
			if ( !(_la==K_FALSE || _la==K_TRUE) ) {
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

	open class HexadecimalLiteralContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_hexadecimalLiteral.id
	        set(value) { throw RuntimeException() }
		fun HEXADECIMAL_LITERAL() : TerminalNode? = getToken(CqlParser.Tokens.HEXADECIMAL_LITERAL.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  hexadecimalLiteral() : HexadecimalLiteralContext {
		var _localctx : HexadecimalLiteralContext = HexadecimalLiteralContext(context, state)
		enterRule(_localctx, 300, Rules.RULE_hexadecimalLiteral.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1952
			match(HEXADECIMAL_LITERAL) as Token
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

	open class KeyspaceContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_keyspace.id
	        set(value) { throw RuntimeException() }
		fun OBJECT_NAME() : TerminalNode? = getToken(CqlParser.Tokens.OBJECT_NAME.id, 0)
		fun DQUOTE() : List<TerminalNode> = getTokens(CqlParser.Tokens.DQUOTE.id)
		fun DQUOTE(i: Int) : TerminalNode = getToken(CqlParser.Tokens.DQUOTE.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  keyspace() : KeyspaceContext {
		var _localctx : KeyspaceContext = KeyspaceContext(context, state)
		enterRule(_localctx, 302, Rules.RULE_keyspace.id)
		try {
			this.state = 1958
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			OBJECT_NAME  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1954
			match(OBJECT_NAME) as Token
			}}
			DQUOTE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1955
			match(DQUOTE) as Token
			this.state = 1956
			match(OBJECT_NAME) as Token
			this.state = 1957
			match(DQUOTE) as Token
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

	open class TableContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_table.id
	        set(value) { throw RuntimeException() }
		fun OBJECT_NAME() : TerminalNode? = getToken(CqlParser.Tokens.OBJECT_NAME.id, 0)
		fun DQUOTE() : List<TerminalNode> = getTokens(CqlParser.Tokens.DQUOTE.id)
		fun DQUOTE(i: Int) : TerminalNode = getToken(CqlParser.Tokens.DQUOTE.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  table() : TableContext {
		var _localctx : TableContext = TableContext(context, state)
		enterRule(_localctx, 304, Rules.RULE_table.id)
		try {
			this.state = 1964
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			OBJECT_NAME  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1960
			match(OBJECT_NAME) as Token
			}}
			DQUOTE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1961
			match(DQUOTE) as Token
			this.state = 1962
			match(OBJECT_NAME) as Token
			this.state = 1963
			match(DQUOTE) as Token
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

	open class ColumnContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_column.id
	        set(value) { throw RuntimeException() }
		fun OBJECT_NAME() : TerminalNode? = getToken(CqlParser.Tokens.OBJECT_NAME.id, 0)
		fun DQUOTE() : List<TerminalNode> = getTokens(CqlParser.Tokens.DQUOTE.id)
		fun DQUOTE(i: Int) : TerminalNode = getToken(CqlParser.Tokens.DQUOTE.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  column() : ColumnContext {
		var _localctx : ColumnContext = ColumnContext(context, state)
		enterRule(_localctx, 306, Rules.RULE_column.id)
		try {
			this.state = 1970
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			OBJECT_NAME  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1966
			match(OBJECT_NAME) as Token
			}}
			DQUOTE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1967
			match(DQUOTE) as Token
			this.state = 1968
			match(OBJECT_NAME) as Token
			this.state = 1969
			match(DQUOTE) as Token
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

	open class DataTypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_dataType.id
	        set(value) { throw RuntimeException() }
		fun findDataTypeName() : DataTypeNameContext? = getRuleContext(solver.getType("DataTypeNameContext"),0)
		fun findDataTypeDefinition() : DataTypeDefinitionContext? = getRuleContext(solver.getType("DataTypeDefinitionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  dataType() : DataTypeContext {
		var _localctx : DataTypeContext = DataTypeContext(context, state)
		enterRule(_localctx, 308, Rules.RULE_dataType.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1972
			dataTypeName()
			this.state = 1974
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==OPERATOR_LT) {
				if (true){
				this.state = 1973
				dataTypeDefinition()
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

	open class DataTypeNameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_dataTypeName.id
	        set(value) { throw RuntimeException() }
		fun OBJECT_NAME() : TerminalNode? = getToken(CqlParser.Tokens.OBJECT_NAME.id, 0)
		fun K_TIMESTAMP() : TerminalNode? = getToken(CqlParser.Tokens.K_TIMESTAMP.id, 0)
		fun K_SET() : TerminalNode? = getToken(CqlParser.Tokens.K_SET.id, 0)
		fun K_ASCII() : TerminalNode? = getToken(CqlParser.Tokens.K_ASCII.id, 0)
		fun K_BIGINT() : TerminalNode? = getToken(CqlParser.Tokens.K_BIGINT.id, 0)
		fun K_BLOB() : TerminalNode? = getToken(CqlParser.Tokens.K_BLOB.id, 0)
		fun K_BOOLEAN() : TerminalNode? = getToken(CqlParser.Tokens.K_BOOLEAN.id, 0)
		fun K_COUNTER() : TerminalNode? = getToken(CqlParser.Tokens.K_COUNTER.id, 0)
		fun K_DATE() : TerminalNode? = getToken(CqlParser.Tokens.K_DATE.id, 0)
		fun K_DECIMAL() : TerminalNode? = getToken(CqlParser.Tokens.K_DECIMAL.id, 0)
		fun K_DOUBLE() : TerminalNode? = getToken(CqlParser.Tokens.K_DOUBLE.id, 0)
		fun K_FLOAT() : TerminalNode? = getToken(CqlParser.Tokens.K_FLOAT.id, 0)
		fun K_FROZEN() : TerminalNode? = getToken(CqlParser.Tokens.K_FROZEN.id, 0)
		fun K_INET() : TerminalNode? = getToken(CqlParser.Tokens.K_INET.id, 0)
		fun K_INT() : TerminalNode? = getToken(CqlParser.Tokens.K_INT.id, 0)
		fun K_LIST() : TerminalNode? = getToken(CqlParser.Tokens.K_LIST.id, 0)
		fun K_MAP() : TerminalNode? = getToken(CqlParser.Tokens.K_MAP.id, 0)
		fun K_SMALLINT() : TerminalNode? = getToken(CqlParser.Tokens.K_SMALLINT.id, 0)
		fun K_TEXT() : TerminalNode? = getToken(CqlParser.Tokens.K_TEXT.id, 0)
		fun K_TIME() : TerminalNode? = getToken(CqlParser.Tokens.K_TIME.id, 0)
		fun K_TIMEUUID() : TerminalNode? = getToken(CqlParser.Tokens.K_TIMEUUID.id, 0)
		fun K_TINYINT() : TerminalNode? = getToken(CqlParser.Tokens.K_TINYINT.id, 0)
		fun K_TUPLE() : TerminalNode? = getToken(CqlParser.Tokens.K_TUPLE.id, 0)
		fun K_VARCHAR() : TerminalNode? = getToken(CqlParser.Tokens.K_VARCHAR.id, 0)
		fun K_VARINT() : TerminalNode? = getToken(CqlParser.Tokens.K_VARINT.id, 0)
		fun K_UUID() : TerminalNode? = getToken(CqlParser.Tokens.K_UUID.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  dataTypeName() : DataTypeNameContext {
		var _localctx : DataTypeNameContext = DataTypeNameContext(context, state)
		enterRule(_localctx, 310, Rules.RULE_dataTypeName.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1976
			_la = _input!!.LA(1)
			if ( !(((((_la - 112)) and 0x3f.inv()) == 0 && ((1L shl (_la - 112)) and ((1L shl (K_SET - 112)) or (1L shl (K_TIMESTAMP - 112)) or (1L shl (K_UUID - 112)) or (1L shl (K_ASCII - 112)) or (1L shl (K_BIGINT - 112)) or (1L shl (K_BLOB - 112)) or (1L shl (K_BOOLEAN - 112)) or (1L shl (K_COUNTER - 112)) or (1L shl (K_DATE - 112)) or (1L shl (K_DECIMAL - 112)) or (1L shl (K_DOUBLE - 112)) or (1L shl (K_FLOAT - 112)) or (1L shl (K_FROZEN - 112)) or (1L shl (K_INET - 112)) or (1L shl (K_INT - 112)) or (1L shl (K_LIST - 112)) or (1L shl (K_MAP - 112)) or (1L shl (K_SMALLINT - 112)) or (1L shl (K_TEXT - 112)) or (1L shl (K_TIMEUUID - 112)) or (1L shl (K_TIME - 112)) or (1L shl (K_TINYINT - 112)) or (1L shl (K_TUPLE - 112)) or (1L shl (K_VARCHAR - 112)) or (1L shl (K_VARINT - 112)) or (1L shl (OBJECT_NAME - 112)))) != 0L)) ) {
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

	open class DataTypeDefinitionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_dataTypeDefinition.id
	        set(value) { throw RuntimeException() }
		fun findSyntaxBracketLa() : SyntaxBracketLaContext? = getRuleContext(solver.getType("SyntaxBracketLaContext"),0)
		fun findDataTypeName() : List<DataTypeNameContext> = getRuleContexts(solver.getType("DataTypeNameContext"))
		fun findDataTypeName(i: Int) : DataTypeNameContext? = getRuleContext(solver.getType("DataTypeNameContext"),i)
		fun findSyntaxBracketRa() : SyntaxBracketRaContext? = getRuleContext(solver.getType("SyntaxBracketRaContext"),0)
		fun findSyntaxComma() : List<SyntaxCommaContext> = getRuleContexts(solver.getType("SyntaxCommaContext"))
		fun findSyntaxComma(i: Int) : SyntaxCommaContext? = getRuleContext(solver.getType("SyntaxCommaContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  dataTypeDefinition() : DataTypeDefinitionContext {
		var _localctx : DataTypeDefinitionContext = DataTypeDefinitionContext(context, state)
		enterRule(_localctx, 312, Rules.RULE_dataTypeDefinition.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1978
			syntaxBracketLa()
			this.state = 1979
			dataTypeName()
			this.state = 1985
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COMMA) {
				if (true){
				if (true){
				this.state = 1980
				syntaxComma()
				this.state = 1981
				dataTypeName()
				}
				}
				this.state = 1987
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 1988
			syntaxBracketRa()
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

	open class OrderDirectionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_orderDirection.id
	        set(value) { throw RuntimeException() }
		fun findKwAsc() : KwAscContext? = getRuleContext(solver.getType("KwAscContext"),0)
		fun findKwDesc() : KwDescContext? = getRuleContext(solver.getType("KwDescContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  orderDirection() : OrderDirectionContext {
		var _localctx : OrderDirectionContext = OrderDirectionContext(context, state)
		enterRule(_localctx, 314, Rules.RULE_orderDirection.id)
		try {
			this.state = 1992
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			K_ASC  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1990
			kwAsc()
			}}
			K_DESC  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1991
			kwDesc()
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

	open class RoleContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_role.id
	        set(value) { throw RuntimeException() }
		fun OBJECT_NAME() : TerminalNode? = getToken(CqlParser.Tokens.OBJECT_NAME.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  role() : RoleContext {
		var _localctx : RoleContext = RoleContext(context, state)
		enterRule(_localctx, 316, Rules.RULE_role.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1994
			match(OBJECT_NAME) as Token
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

	open class TriggerContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_trigger.id
	        set(value) { throw RuntimeException() }
		fun OBJECT_NAME() : TerminalNode? = getToken(CqlParser.Tokens.OBJECT_NAME.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  trigger() : TriggerContext {
		var _localctx : TriggerContext = TriggerContext(context, state)
		enterRule(_localctx, 318, Rules.RULE_trigger.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1996
			match(OBJECT_NAME) as Token
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

	open class TriggerClassContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_triggerClass.id
	        set(value) { throw RuntimeException() }
		fun findStringLiteral() : StringLiteralContext? = getRuleContext(solver.getType("StringLiteralContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  triggerClass() : TriggerClassContext {
		var _localctx : TriggerClassContext = TriggerClassContext(context, state)
		enterRule(_localctx, 320, Rules.RULE_triggerClass.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1998
			stringLiteral()
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

	open class MaterializedViewContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_materializedView.id
	        set(value) { throw RuntimeException() }
		fun OBJECT_NAME() : TerminalNode? = getToken(CqlParser.Tokens.OBJECT_NAME.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  materializedView() : MaterializedViewContext {
		var _localctx : MaterializedViewContext = MaterializedViewContext(context, state)
		enterRule(_localctx, 322, Rules.RULE_materializedView.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2000
			match(OBJECT_NAME) as Token
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

	open class TypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_type.id
	        set(value) { throw RuntimeException() }
		fun OBJECT_NAME() : TerminalNode? = getToken(CqlParser.Tokens.OBJECT_NAME.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  type() : TypeContext {
		var _localctx : TypeContext = TypeContext(context, state)
		enterRule(_localctx, 324, Rules.RULE_type.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2002
			match(OBJECT_NAME) as Token
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

	open class AggregateContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_aggregate.id
	        set(value) { throw RuntimeException() }
		fun OBJECT_NAME() : TerminalNode? = getToken(CqlParser.Tokens.OBJECT_NAME.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  aggregate() : AggregateContext {
		var _localctx : AggregateContext = AggregateContext(context, state)
		enterRule(_localctx, 326, Rules.RULE_aggregate.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2004
			match(OBJECT_NAME) as Token
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

	open class FunctionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_function.id
	        set(value) { throw RuntimeException() }
		fun OBJECT_NAME() : TerminalNode? = getToken(CqlParser.Tokens.OBJECT_NAME.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  function() : FunctionContext {
		var _localctx : FunctionContext = FunctionContext(context, state)
		enterRule(_localctx, 328, Rules.RULE_function.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2006
			match(OBJECT_NAME) as Token
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

	open class LanguageContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_language.id
	        set(value) { throw RuntimeException() }
		fun OBJECT_NAME() : TerminalNode? = getToken(CqlParser.Tokens.OBJECT_NAME.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  language() : LanguageContext {
		var _localctx : LanguageContext = LanguageContext(context, state)
		enterRule(_localctx, 330, Rules.RULE_language.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2008
			match(OBJECT_NAME) as Token
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

	open class UserContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_user.id
	        set(value) { throw RuntimeException() }
		fun OBJECT_NAME() : TerminalNode? = getToken(CqlParser.Tokens.OBJECT_NAME.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  user() : UserContext {
		var _localctx : UserContext = UserContext(context, state)
		enterRule(_localctx, 332, Rules.RULE_user.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2010
			match(OBJECT_NAME) as Token
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

	open class PasswordContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_password.id
	        set(value) { throw RuntimeException() }
		fun findStringLiteral() : StringLiteralContext? = getRuleContext(solver.getType("StringLiteralContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  password() : PasswordContext {
		var _localctx : PasswordContext = PasswordContext(context, state)
		enterRule(_localctx, 334, Rules.RULE_password.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2012
			stringLiteral()
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

	open class HashKeyContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_hashKey.id
	        set(value) { throw RuntimeException() }
		fun OBJECT_NAME() : TerminalNode? = getToken(CqlParser.Tokens.OBJECT_NAME.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  hashKey() : HashKeyContext {
		var _localctx : HashKeyContext = HashKeyContext(context, state)
		enterRule(_localctx, 336, Rules.RULE_hashKey.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2014
			match(OBJECT_NAME) as Token
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

	open class ParamContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_param.id
	        set(value) { throw RuntimeException() }
		fun findParamName() : ParamNameContext? = getRuleContext(solver.getType("ParamNameContext"),0)
		fun findDataType() : DataTypeContext? = getRuleContext(solver.getType("DataTypeContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  param() : ParamContext {
		var _localctx : ParamContext = ParamContext(context, state)
		enterRule(_localctx, 338, Rules.RULE_param.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2016
			paramName()
			this.state = 2017
			dataType()
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

	open class ParamNameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_paramName.id
	        set(value) { throw RuntimeException() }
		fun OBJECT_NAME() : TerminalNode? = getToken(CqlParser.Tokens.OBJECT_NAME.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  paramName() : ParamNameContext {
		var _localctx : ParamNameContext = ParamNameContext(context, state)
		enterRule(_localctx, 340, Rules.RULE_paramName.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2019
			match(OBJECT_NAME) as Token
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

	open class KwAddContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwAdd.id
	        set(value) { throw RuntimeException() }
		fun K_ADD() : TerminalNode? = getToken(CqlParser.Tokens.K_ADD.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwAdd() : KwAddContext {
		var _localctx : KwAddContext = KwAddContext(context, state)
		enterRule(_localctx, 342, Rules.RULE_kwAdd.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2021
			match(K_ADD) as Token
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

	open class KwAggregateContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwAggregate.id
	        set(value) { throw RuntimeException() }
		fun K_AGGREGATE() : TerminalNode? = getToken(CqlParser.Tokens.K_AGGREGATE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwAggregate() : KwAggregateContext {
		var _localctx : KwAggregateContext = KwAggregateContext(context, state)
		enterRule(_localctx, 344, Rules.RULE_kwAggregate.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2023
			match(K_AGGREGATE) as Token
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

	open class KwAllContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwAll.id
	        set(value) { throw RuntimeException() }
		fun K_ALL() : TerminalNode? = getToken(CqlParser.Tokens.K_ALL.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwAll() : KwAllContext {
		var _localctx : KwAllContext = KwAllContext(context, state)
		enterRule(_localctx, 346, Rules.RULE_kwAll.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2025
			match(K_ALL) as Token
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

	open class KwAllPermissionsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwAllPermissions.id
	        set(value) { throw RuntimeException() }
		fun K_ALL() : TerminalNode? = getToken(CqlParser.Tokens.K_ALL.id, 0)
		fun K_PERMISSIONS() : TerminalNode? = getToken(CqlParser.Tokens.K_PERMISSIONS.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwAllPermissions() : KwAllPermissionsContext {
		var _localctx : KwAllPermissionsContext = KwAllPermissionsContext(context, state)
		enterRule(_localctx, 348, Rules.RULE_kwAllPermissions.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2027
			match(K_ALL) as Token
			this.state = 2028
			match(K_PERMISSIONS) as Token
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

	open class KwAllowContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwAllow.id
	        set(value) { throw RuntimeException() }
		fun K_ALLOW() : TerminalNode? = getToken(CqlParser.Tokens.K_ALLOW.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwAllow() : KwAllowContext {
		var _localctx : KwAllowContext = KwAllowContext(context, state)
		enterRule(_localctx, 350, Rules.RULE_kwAllow.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2030
			match(K_ALLOW) as Token
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

	open class KwAlterContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwAlter.id
	        set(value) { throw RuntimeException() }
		fun K_ALTER() : TerminalNode? = getToken(CqlParser.Tokens.K_ALTER.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwAlter() : KwAlterContext {
		var _localctx : KwAlterContext = KwAlterContext(context, state)
		enterRule(_localctx, 352, Rules.RULE_kwAlter.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2032
			match(K_ALTER) as Token
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

	open class KwAndContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwAnd.id
	        set(value) { throw RuntimeException() }
		fun K_AND() : TerminalNode? = getToken(CqlParser.Tokens.K_AND.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwAnd() : KwAndContext {
		var _localctx : KwAndContext = KwAndContext(context, state)
		enterRule(_localctx, 354, Rules.RULE_kwAnd.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2034
			match(K_AND) as Token
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

	open class KwApplyContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwApply.id
	        set(value) { throw RuntimeException() }
		fun K_APPLY() : TerminalNode? = getToken(CqlParser.Tokens.K_APPLY.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwApply() : KwApplyContext {
		var _localctx : KwApplyContext = KwApplyContext(context, state)
		enterRule(_localctx, 356, Rules.RULE_kwApply.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2036
			match(K_APPLY) as Token
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

	open class KwAsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwAs.id
	        set(value) { throw RuntimeException() }
		fun K_AS() : TerminalNode? = getToken(CqlParser.Tokens.K_AS.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwAs() : KwAsContext {
		var _localctx : KwAsContext = KwAsContext(context, state)
		enterRule(_localctx, 358, Rules.RULE_kwAs.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2038
			match(K_AS) as Token
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

	open class KwAscContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwAsc.id
	        set(value) { throw RuntimeException() }
		fun K_ASC() : TerminalNode? = getToken(CqlParser.Tokens.K_ASC.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwAsc() : KwAscContext {
		var _localctx : KwAscContext = KwAscContext(context, state)
		enterRule(_localctx, 360, Rules.RULE_kwAsc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2040
			match(K_ASC) as Token
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

	open class KwAuthorizeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwAuthorize.id
	        set(value) { throw RuntimeException() }
		fun K_AUTHORIZE() : TerminalNode? = getToken(CqlParser.Tokens.K_AUTHORIZE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwAuthorize() : KwAuthorizeContext {
		var _localctx : KwAuthorizeContext = KwAuthorizeContext(context, state)
		enterRule(_localctx, 362, Rules.RULE_kwAuthorize.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2042
			match(K_AUTHORIZE) as Token
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

	open class KwBatchContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwBatch.id
	        set(value) { throw RuntimeException() }
		fun K_BATCH() : TerminalNode? = getToken(CqlParser.Tokens.K_BATCH.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwBatch() : KwBatchContext {
		var _localctx : KwBatchContext = KwBatchContext(context, state)
		enterRule(_localctx, 364, Rules.RULE_kwBatch.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2044
			match(K_BATCH) as Token
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

	open class KwBeginContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwBegin.id
	        set(value) { throw RuntimeException() }
		fun K_BEGIN() : TerminalNode? = getToken(CqlParser.Tokens.K_BEGIN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwBegin() : KwBeginContext {
		var _localctx : KwBeginContext = KwBeginContext(context, state)
		enterRule(_localctx, 366, Rules.RULE_kwBegin.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2046
			match(K_BEGIN) as Token
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

	open class KwByContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwBy.id
	        set(value) { throw RuntimeException() }
		fun K_BY() : TerminalNode? = getToken(CqlParser.Tokens.K_BY.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwBy() : KwByContext {
		var _localctx : KwByContext = KwByContext(context, state)
		enterRule(_localctx, 368, Rules.RULE_kwBy.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2048
			match(K_BY) as Token
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

	open class KwCalledContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwCalled.id
	        set(value) { throw RuntimeException() }
		fun K_CALLED() : TerminalNode? = getToken(CqlParser.Tokens.K_CALLED.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwCalled() : KwCalledContext {
		var _localctx : KwCalledContext = KwCalledContext(context, state)
		enterRule(_localctx, 370, Rules.RULE_kwCalled.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2050
			match(K_CALLED) as Token
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

	open class KwClusteringContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwClustering.id
	        set(value) { throw RuntimeException() }
		fun K_CLUSTERING() : TerminalNode? = getToken(CqlParser.Tokens.K_CLUSTERING.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwClustering() : KwClusteringContext {
		var _localctx : KwClusteringContext = KwClusteringContext(context, state)
		enterRule(_localctx, 372, Rules.RULE_kwClustering.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2052
			match(K_CLUSTERING) as Token
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

	open class KwCompactContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwCompact.id
	        set(value) { throw RuntimeException() }
		fun K_COMPACT() : TerminalNode? = getToken(CqlParser.Tokens.K_COMPACT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwCompact() : KwCompactContext {
		var _localctx : KwCompactContext = KwCompactContext(context, state)
		enterRule(_localctx, 374, Rules.RULE_kwCompact.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2054
			match(K_COMPACT) as Token
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

	open class KwContainsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwContains.id
	        set(value) { throw RuntimeException() }
		fun K_CONTAINS() : TerminalNode? = getToken(CqlParser.Tokens.K_CONTAINS.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwContains() : KwContainsContext {
		var _localctx : KwContainsContext = KwContainsContext(context, state)
		enterRule(_localctx, 376, Rules.RULE_kwContains.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2056
			match(K_CONTAINS) as Token
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

	open class KwCreateContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwCreate.id
	        set(value) { throw RuntimeException() }
		fun K_CREATE() : TerminalNode? = getToken(CqlParser.Tokens.K_CREATE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwCreate() : KwCreateContext {
		var _localctx : KwCreateContext = KwCreateContext(context, state)
		enterRule(_localctx, 378, Rules.RULE_kwCreate.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2058
			match(K_CREATE) as Token
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

	open class KwDeleteContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwDelete.id
	        set(value) { throw RuntimeException() }
		fun K_DELETE() : TerminalNode? = getToken(CqlParser.Tokens.K_DELETE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwDelete() : KwDeleteContext {
		var _localctx : KwDeleteContext = KwDeleteContext(context, state)
		enterRule(_localctx, 380, Rules.RULE_kwDelete.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2060
			match(K_DELETE) as Token
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

	open class KwDescContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwDesc.id
	        set(value) { throw RuntimeException() }
		fun K_DESC() : TerminalNode? = getToken(CqlParser.Tokens.K_DESC.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwDesc() : KwDescContext {
		var _localctx : KwDescContext = KwDescContext(context, state)
		enterRule(_localctx, 382, Rules.RULE_kwDesc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2062
			match(K_DESC) as Token
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

	open class KwDescibeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwDescibe.id
	        set(value) { throw RuntimeException() }
		fun K_DESCRIBE() : TerminalNode? = getToken(CqlParser.Tokens.K_DESCRIBE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwDescibe() : KwDescibeContext {
		var _localctx : KwDescibeContext = KwDescibeContext(context, state)
		enterRule(_localctx, 384, Rules.RULE_kwDescibe.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2064
			match(K_DESCRIBE) as Token
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

	open class KwDistinctContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwDistinct.id
	        set(value) { throw RuntimeException() }
		fun K_DISTINCT() : TerminalNode? = getToken(CqlParser.Tokens.K_DISTINCT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwDistinct() : KwDistinctContext {
		var _localctx : KwDistinctContext = KwDistinctContext(context, state)
		enterRule(_localctx, 386, Rules.RULE_kwDistinct.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2066
			match(K_DISTINCT) as Token
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

	open class KwDropContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwDrop.id
	        set(value) { throw RuntimeException() }
		fun K_DROP() : TerminalNode? = getToken(CqlParser.Tokens.K_DROP.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwDrop() : KwDropContext {
		var _localctx : KwDropContext = KwDropContext(context, state)
		enterRule(_localctx, 388, Rules.RULE_kwDrop.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2068
			match(K_DROP) as Token
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

	open class KwDurableWritesContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwDurableWrites.id
	        set(value) { throw RuntimeException() }
		fun K_DURABLE_WRITES() : TerminalNode? = getToken(CqlParser.Tokens.K_DURABLE_WRITES.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwDurableWrites() : KwDurableWritesContext {
		var _localctx : KwDurableWritesContext = KwDurableWritesContext(context, state)
		enterRule(_localctx, 390, Rules.RULE_kwDurableWrites.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2070
			match(K_DURABLE_WRITES) as Token
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

	open class KwEntriesContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwEntries.id
	        set(value) { throw RuntimeException() }
		fun K_ENTRIES() : TerminalNode? = getToken(CqlParser.Tokens.K_ENTRIES.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwEntries() : KwEntriesContext {
		var _localctx : KwEntriesContext = KwEntriesContext(context, state)
		enterRule(_localctx, 392, Rules.RULE_kwEntries.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2072
			match(K_ENTRIES) as Token
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

	open class KwExecuteContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwExecute.id
	        set(value) { throw RuntimeException() }
		fun K_EXECUTE() : TerminalNode? = getToken(CqlParser.Tokens.K_EXECUTE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwExecute() : KwExecuteContext {
		var _localctx : KwExecuteContext = KwExecuteContext(context, state)
		enterRule(_localctx, 394, Rules.RULE_kwExecute.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2074
			match(K_EXECUTE) as Token
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

	open class KwExistsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwExists.id
	        set(value) { throw RuntimeException() }
		fun K_EXISTS() : TerminalNode? = getToken(CqlParser.Tokens.K_EXISTS.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwExists() : KwExistsContext {
		var _localctx : KwExistsContext = KwExistsContext(context, state)
		enterRule(_localctx, 396, Rules.RULE_kwExists.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2076
			match(K_EXISTS) as Token
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

	open class KwFilteringContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwFiltering.id
	        set(value) { throw RuntimeException() }
		fun K_FILTERING() : TerminalNode? = getToken(CqlParser.Tokens.K_FILTERING.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwFiltering() : KwFilteringContext {
		var _localctx : KwFilteringContext = KwFilteringContext(context, state)
		enterRule(_localctx, 398, Rules.RULE_kwFiltering.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2078
			match(K_FILTERING) as Token
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

	open class KwFinalfuncContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwFinalfunc.id
	        set(value) { throw RuntimeException() }
		fun K_FINALFUNC() : TerminalNode? = getToken(CqlParser.Tokens.K_FINALFUNC.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwFinalfunc() : KwFinalfuncContext {
		var _localctx : KwFinalfuncContext = KwFinalfuncContext(context, state)
		enterRule(_localctx, 400, Rules.RULE_kwFinalfunc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2080
			match(K_FINALFUNC) as Token
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

	open class KwFromContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwFrom.id
	        set(value) { throw RuntimeException() }
		fun K_FROM() : TerminalNode? = getToken(CqlParser.Tokens.K_FROM.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwFrom() : KwFromContext {
		var _localctx : KwFromContext = KwFromContext(context, state)
		enterRule(_localctx, 402, Rules.RULE_kwFrom.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2082
			match(K_FROM) as Token
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

	open class KwFullContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwFull.id
	        set(value) { throw RuntimeException() }
		fun K_FULL() : TerminalNode? = getToken(CqlParser.Tokens.K_FULL.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwFull() : KwFullContext {
		var _localctx : KwFullContext = KwFullContext(context, state)
		enterRule(_localctx, 404, Rules.RULE_kwFull.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2084
			match(K_FULL) as Token
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

	open class KwFunctionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwFunction.id
	        set(value) { throw RuntimeException() }
		fun K_FUNCTION() : TerminalNode? = getToken(CqlParser.Tokens.K_FUNCTION.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwFunction() : KwFunctionContext {
		var _localctx : KwFunctionContext = KwFunctionContext(context, state)
		enterRule(_localctx, 406, Rules.RULE_kwFunction.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2086
			match(K_FUNCTION) as Token
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

	open class KwFunctionsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwFunctions.id
	        set(value) { throw RuntimeException() }
		fun K_FUNCTIONS() : TerminalNode? = getToken(CqlParser.Tokens.K_FUNCTIONS.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwFunctions() : KwFunctionsContext {
		var _localctx : KwFunctionsContext = KwFunctionsContext(context, state)
		enterRule(_localctx, 408, Rules.RULE_kwFunctions.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2088
			match(K_FUNCTIONS) as Token
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

	open class KwGrantContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwGrant.id
	        set(value) { throw RuntimeException() }
		fun K_GRANT() : TerminalNode? = getToken(CqlParser.Tokens.K_GRANT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwGrant() : KwGrantContext {
		var _localctx : KwGrantContext = KwGrantContext(context, state)
		enterRule(_localctx, 410, Rules.RULE_kwGrant.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2090
			match(K_GRANT) as Token
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

	open class KwIfContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwIf.id
	        set(value) { throw RuntimeException() }
		fun K_IF() : TerminalNode? = getToken(CqlParser.Tokens.K_IF.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwIf() : KwIfContext {
		var _localctx : KwIfContext = KwIfContext(context, state)
		enterRule(_localctx, 412, Rules.RULE_kwIf.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2092
			match(K_IF) as Token
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

	open class KwInContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwIn.id
	        set(value) { throw RuntimeException() }
		fun K_IN() : TerminalNode? = getToken(CqlParser.Tokens.K_IN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwIn() : KwInContext {
		var _localctx : KwInContext = KwInContext(context, state)
		enterRule(_localctx, 414, Rules.RULE_kwIn.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2094
			match(K_IN) as Token
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

	open class KwIndexContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwIndex.id
	        set(value) { throw RuntimeException() }
		fun K_INDEX() : TerminalNode? = getToken(CqlParser.Tokens.K_INDEX.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwIndex() : KwIndexContext {
		var _localctx : KwIndexContext = KwIndexContext(context, state)
		enterRule(_localctx, 416, Rules.RULE_kwIndex.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2096
			match(K_INDEX) as Token
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

	open class KwInitcondContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwInitcond.id
	        set(value) { throw RuntimeException() }
		fun K_INITCOND() : TerminalNode? = getToken(CqlParser.Tokens.K_INITCOND.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwInitcond() : KwInitcondContext {
		var _localctx : KwInitcondContext = KwInitcondContext(context, state)
		enterRule(_localctx, 418, Rules.RULE_kwInitcond.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2098
			match(K_INITCOND) as Token
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

	open class KwInputContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwInput.id
	        set(value) { throw RuntimeException() }
		fun K_INPUT() : TerminalNode? = getToken(CqlParser.Tokens.K_INPUT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwInput() : KwInputContext {
		var _localctx : KwInputContext = KwInputContext(context, state)
		enterRule(_localctx, 420, Rules.RULE_kwInput.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2100
			match(K_INPUT) as Token
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

	open class KwInsertContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwInsert.id
	        set(value) { throw RuntimeException() }
		fun K_INSERT() : TerminalNode? = getToken(CqlParser.Tokens.K_INSERT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwInsert() : KwInsertContext {
		var _localctx : KwInsertContext = KwInsertContext(context, state)
		enterRule(_localctx, 422, Rules.RULE_kwInsert.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2102
			match(K_INSERT) as Token
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

	open class KwIntoContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwInto.id
	        set(value) { throw RuntimeException() }
		fun K_INTO() : TerminalNode? = getToken(CqlParser.Tokens.K_INTO.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwInto() : KwIntoContext {
		var _localctx : KwIntoContext = KwIntoContext(context, state)
		enterRule(_localctx, 424, Rules.RULE_kwInto.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2104
			match(K_INTO) as Token
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

	open class KwIsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwIs.id
	        set(value) { throw RuntimeException() }
		fun K_IS() : TerminalNode? = getToken(CqlParser.Tokens.K_IS.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwIs() : KwIsContext {
		var _localctx : KwIsContext = KwIsContext(context, state)
		enterRule(_localctx, 426, Rules.RULE_kwIs.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2106
			match(K_IS) as Token
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

	open class KwKeyContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwKey.id
	        set(value) { throw RuntimeException() }
		fun K_KEY() : TerminalNode? = getToken(CqlParser.Tokens.K_KEY.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwKey() : KwKeyContext {
		var _localctx : KwKeyContext = KwKeyContext(context, state)
		enterRule(_localctx, 428, Rules.RULE_kwKey.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2108
			match(K_KEY) as Token
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

	open class KwKeysContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwKeys.id
	        set(value) { throw RuntimeException() }
		fun K_KEYS() : TerminalNode? = getToken(CqlParser.Tokens.K_KEYS.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwKeys() : KwKeysContext {
		var _localctx : KwKeysContext = KwKeysContext(context, state)
		enterRule(_localctx, 430, Rules.RULE_kwKeys.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2110
			match(K_KEYS) as Token
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

	open class KwKeyspaceContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwKeyspace.id
	        set(value) { throw RuntimeException() }
		fun K_KEYSPACE() : TerminalNode? = getToken(CqlParser.Tokens.K_KEYSPACE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwKeyspace() : KwKeyspaceContext {
		var _localctx : KwKeyspaceContext = KwKeyspaceContext(context, state)
		enterRule(_localctx, 432, Rules.RULE_kwKeyspace.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2112
			match(K_KEYSPACE) as Token
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

	open class KwKeyspacesContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwKeyspaces.id
	        set(value) { throw RuntimeException() }
		fun K_KEYSPACES() : TerminalNode? = getToken(CqlParser.Tokens.K_KEYSPACES.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwKeyspaces() : KwKeyspacesContext {
		var _localctx : KwKeyspacesContext = KwKeyspacesContext(context, state)
		enterRule(_localctx, 434, Rules.RULE_kwKeyspaces.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2114
			match(K_KEYSPACES) as Token
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

	open class KwLanguageContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwLanguage.id
	        set(value) { throw RuntimeException() }
		fun K_LANGUAGE() : TerminalNode? = getToken(CqlParser.Tokens.K_LANGUAGE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwLanguage() : KwLanguageContext {
		var _localctx : KwLanguageContext = KwLanguageContext(context, state)
		enterRule(_localctx, 436, Rules.RULE_kwLanguage.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2116
			match(K_LANGUAGE) as Token
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

	open class KwLimitContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwLimit.id
	        set(value) { throw RuntimeException() }
		fun K_LIMIT() : TerminalNode? = getToken(CqlParser.Tokens.K_LIMIT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwLimit() : KwLimitContext {
		var _localctx : KwLimitContext = KwLimitContext(context, state)
		enterRule(_localctx, 438, Rules.RULE_kwLimit.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2118
			match(K_LIMIT) as Token
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

	open class KwListContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwList.id
	        set(value) { throw RuntimeException() }
		fun K_LIST() : TerminalNode? = getToken(CqlParser.Tokens.K_LIST.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwList() : KwListContext {
		var _localctx : KwListContext = KwListContext(context, state)
		enterRule(_localctx, 440, Rules.RULE_kwList.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2120
			match(K_LIST) as Token
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

	open class KwLoggedContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwLogged.id
	        set(value) { throw RuntimeException() }
		fun K_LOGGED() : TerminalNode? = getToken(CqlParser.Tokens.K_LOGGED.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwLogged() : KwLoggedContext {
		var _localctx : KwLoggedContext = KwLoggedContext(context, state)
		enterRule(_localctx, 442, Rules.RULE_kwLogged.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2122
			match(K_LOGGED) as Token
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

	open class KwLoginContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwLogin.id
	        set(value) { throw RuntimeException() }
		fun K_LOGIN() : TerminalNode? = getToken(CqlParser.Tokens.K_LOGIN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwLogin() : KwLoginContext {
		var _localctx : KwLoginContext = KwLoginContext(context, state)
		enterRule(_localctx, 444, Rules.RULE_kwLogin.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2124
			match(K_LOGIN) as Token
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

	open class KwMaterializedContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwMaterialized.id
	        set(value) { throw RuntimeException() }
		fun K_MATERIALIZED() : TerminalNode? = getToken(CqlParser.Tokens.K_MATERIALIZED.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwMaterialized() : KwMaterializedContext {
		var _localctx : KwMaterializedContext = KwMaterializedContext(context, state)
		enterRule(_localctx, 446, Rules.RULE_kwMaterialized.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2126
			match(K_MATERIALIZED) as Token
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

	open class KwModifyContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwModify.id
	        set(value) { throw RuntimeException() }
		fun K_MODIFY() : TerminalNode? = getToken(CqlParser.Tokens.K_MODIFY.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwModify() : KwModifyContext {
		var _localctx : KwModifyContext = KwModifyContext(context, state)
		enterRule(_localctx, 448, Rules.RULE_kwModify.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2128
			match(K_MODIFY) as Token
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

	open class KwNosuperuserContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwNosuperuser.id
	        set(value) { throw RuntimeException() }
		fun K_NOSUPERUSER() : TerminalNode? = getToken(CqlParser.Tokens.K_NOSUPERUSER.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwNosuperuser() : KwNosuperuserContext {
		var _localctx : KwNosuperuserContext = KwNosuperuserContext(context, state)
		enterRule(_localctx, 450, Rules.RULE_kwNosuperuser.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2130
			match(K_NOSUPERUSER) as Token
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

	open class KwNorecursiveContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwNorecursive.id
	        set(value) { throw RuntimeException() }
		fun K_NORECURSIVE() : TerminalNode? = getToken(CqlParser.Tokens.K_NORECURSIVE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwNorecursive() : KwNorecursiveContext {
		var _localctx : KwNorecursiveContext = KwNorecursiveContext(context, state)
		enterRule(_localctx, 452, Rules.RULE_kwNorecursive.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2132
			match(K_NORECURSIVE) as Token
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

	open class KwNotContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwNot.id
	        set(value) { throw RuntimeException() }
		fun K_NOT() : TerminalNode? = getToken(CqlParser.Tokens.K_NOT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwNot() : KwNotContext {
		var _localctx : KwNotContext = KwNotContext(context, state)
		enterRule(_localctx, 454, Rules.RULE_kwNot.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2134
			match(K_NOT) as Token
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

	open class KwNullContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwNull.id
	        set(value) { throw RuntimeException() }
		fun K_NULL() : TerminalNode? = getToken(CqlParser.Tokens.K_NULL.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwNull() : KwNullContext {
		var _localctx : KwNullContext = KwNullContext(context, state)
		enterRule(_localctx, 456, Rules.RULE_kwNull.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2136
			match(K_NULL) as Token
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

	open class KwOfContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwOf.id
	        set(value) { throw RuntimeException() }
		fun K_OF() : TerminalNode? = getToken(CqlParser.Tokens.K_OF.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwOf() : KwOfContext {
		var _localctx : KwOfContext = KwOfContext(context, state)
		enterRule(_localctx, 458, Rules.RULE_kwOf.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2138
			match(K_OF) as Token
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

	open class KwOnContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwOn.id
	        set(value) { throw RuntimeException() }
		fun K_ON() : TerminalNode? = getToken(CqlParser.Tokens.K_ON.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwOn() : KwOnContext {
		var _localctx : KwOnContext = KwOnContext(context, state)
		enterRule(_localctx, 460, Rules.RULE_kwOn.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2140
			match(K_ON) as Token
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

	open class KwOptionsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwOptions.id
	        set(value) { throw RuntimeException() }
		fun K_OPTIONS() : TerminalNode? = getToken(CqlParser.Tokens.K_OPTIONS.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwOptions() : KwOptionsContext {
		var _localctx : KwOptionsContext = KwOptionsContext(context, state)
		enterRule(_localctx, 462, Rules.RULE_kwOptions.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2142
			match(K_OPTIONS) as Token
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

	open class KwOrContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwOr.id
	        set(value) { throw RuntimeException() }
		fun K_OR() : TerminalNode? = getToken(CqlParser.Tokens.K_OR.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwOr() : KwOrContext {
		var _localctx : KwOrContext = KwOrContext(context, state)
		enterRule(_localctx, 464, Rules.RULE_kwOr.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2144
			match(K_OR) as Token
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

	open class KwOrderContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwOrder.id
	        set(value) { throw RuntimeException() }
		fun K_ORDER() : TerminalNode? = getToken(CqlParser.Tokens.K_ORDER.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwOrder() : KwOrderContext {
		var _localctx : KwOrderContext = KwOrderContext(context, state)
		enterRule(_localctx, 466, Rules.RULE_kwOrder.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2146
			match(K_ORDER) as Token
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

	open class KwPasswordContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwPassword.id
	        set(value) { throw RuntimeException() }
		fun K_PASSWORD() : TerminalNode? = getToken(CqlParser.Tokens.K_PASSWORD.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwPassword() : KwPasswordContext {
		var _localctx : KwPasswordContext = KwPasswordContext(context, state)
		enterRule(_localctx, 468, Rules.RULE_kwPassword.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2148
			match(K_PASSWORD) as Token
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

	open class KwPrimaryContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwPrimary.id
	        set(value) { throw RuntimeException() }
		fun K_PRIMARY() : TerminalNode? = getToken(CqlParser.Tokens.K_PRIMARY.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwPrimary() : KwPrimaryContext {
		var _localctx : KwPrimaryContext = KwPrimaryContext(context, state)
		enterRule(_localctx, 470, Rules.RULE_kwPrimary.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2150
			match(K_PRIMARY) as Token
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

	open class KwRenameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwRename.id
	        set(value) { throw RuntimeException() }
		fun K_RENAME() : TerminalNode? = getToken(CqlParser.Tokens.K_RENAME.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwRename() : KwRenameContext {
		var _localctx : KwRenameContext = KwRenameContext(context, state)
		enterRule(_localctx, 472, Rules.RULE_kwRename.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2152
			match(K_RENAME) as Token
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

	open class KwReplaceContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwReplace.id
	        set(value) { throw RuntimeException() }
		fun K_REPLACE() : TerminalNode? = getToken(CqlParser.Tokens.K_REPLACE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwReplace() : KwReplaceContext {
		var _localctx : KwReplaceContext = KwReplaceContext(context, state)
		enterRule(_localctx, 474, Rules.RULE_kwReplace.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2154
			match(K_REPLACE) as Token
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

	open class KwReplicationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwReplication.id
	        set(value) { throw RuntimeException() }
		fun K_REPLICATION() : TerminalNode? = getToken(CqlParser.Tokens.K_REPLICATION.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwReplication() : KwReplicationContext {
		var _localctx : KwReplicationContext = KwReplicationContext(context, state)
		enterRule(_localctx, 476, Rules.RULE_kwReplication.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2156
			match(K_REPLICATION) as Token
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

	open class KwReturnsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwReturns.id
	        set(value) { throw RuntimeException() }
		fun K_RETURNS() : TerminalNode? = getToken(CqlParser.Tokens.K_RETURNS.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwReturns() : KwReturnsContext {
		var _localctx : KwReturnsContext = KwReturnsContext(context, state)
		enterRule(_localctx, 478, Rules.RULE_kwReturns.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2158
			match(K_RETURNS) as Token
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

	open class KwRoleContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwRole.id
	        set(value) { throw RuntimeException() }
		fun K_ROLE() : TerminalNode? = getToken(CqlParser.Tokens.K_ROLE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwRole() : KwRoleContext {
		var _localctx : KwRoleContext = KwRoleContext(context, state)
		enterRule(_localctx, 480, Rules.RULE_kwRole.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2160
			match(K_ROLE) as Token
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

	open class KwRolesContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwRoles.id
	        set(value) { throw RuntimeException() }
		fun K_ROLES() : TerminalNode? = getToken(CqlParser.Tokens.K_ROLES.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwRoles() : KwRolesContext {
		var _localctx : KwRolesContext = KwRolesContext(context, state)
		enterRule(_localctx, 482, Rules.RULE_kwRoles.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2162
			match(K_ROLES) as Token
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

	open class KwSelectContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwSelect.id
	        set(value) { throw RuntimeException() }
		fun K_SELECT() : TerminalNode? = getToken(CqlParser.Tokens.K_SELECT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwSelect() : KwSelectContext {
		var _localctx : KwSelectContext = KwSelectContext(context, state)
		enterRule(_localctx, 484, Rules.RULE_kwSelect.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2164
			match(K_SELECT) as Token
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

	open class KwSetContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwSet.id
	        set(value) { throw RuntimeException() }
		fun K_SET() : TerminalNode? = getToken(CqlParser.Tokens.K_SET.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwSet() : KwSetContext {
		var _localctx : KwSetContext = KwSetContext(context, state)
		enterRule(_localctx, 486, Rules.RULE_kwSet.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2166
			match(K_SET) as Token
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

	open class KwSfuncContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwSfunc.id
	        set(value) { throw RuntimeException() }
		fun K_SFUNC() : TerminalNode? = getToken(CqlParser.Tokens.K_SFUNC.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwSfunc() : KwSfuncContext {
		var _localctx : KwSfuncContext = KwSfuncContext(context, state)
		enterRule(_localctx, 488, Rules.RULE_kwSfunc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2168
			match(K_SFUNC) as Token
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

	open class KwStorageContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwStorage.id
	        set(value) { throw RuntimeException() }
		fun K_STORAGE() : TerminalNode? = getToken(CqlParser.Tokens.K_STORAGE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwStorage() : KwStorageContext {
		var _localctx : KwStorageContext = KwStorageContext(context, state)
		enterRule(_localctx, 490, Rules.RULE_kwStorage.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2170
			match(K_STORAGE) as Token
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

	open class KwStypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwStype.id
	        set(value) { throw RuntimeException() }
		fun K_STYPE() : TerminalNode? = getToken(CqlParser.Tokens.K_STYPE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwStype() : KwStypeContext {
		var _localctx : KwStypeContext = KwStypeContext(context, state)
		enterRule(_localctx, 492, Rules.RULE_kwStype.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2172
			match(K_STYPE) as Token
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

	open class KwSuperuserContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwSuperuser.id
	        set(value) { throw RuntimeException() }
		fun K_SUPERUSER() : TerminalNode? = getToken(CqlParser.Tokens.K_SUPERUSER.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwSuperuser() : KwSuperuserContext {
		var _localctx : KwSuperuserContext = KwSuperuserContext(context, state)
		enterRule(_localctx, 494, Rules.RULE_kwSuperuser.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2174
			match(K_SUPERUSER) as Token
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

	open class KwTableContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwTable.id
	        set(value) { throw RuntimeException() }
		fun K_TABLE() : TerminalNode? = getToken(CqlParser.Tokens.K_TABLE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwTable() : KwTableContext {
		var _localctx : KwTableContext = KwTableContext(context, state)
		enterRule(_localctx, 496, Rules.RULE_kwTable.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2176
			match(K_TABLE) as Token
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

	open class KwTimestampContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwTimestamp.id
	        set(value) { throw RuntimeException() }
		fun K_TIMESTAMP() : TerminalNode? = getToken(CqlParser.Tokens.K_TIMESTAMP.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwTimestamp() : KwTimestampContext {
		var _localctx : KwTimestampContext = KwTimestampContext(context, state)
		enterRule(_localctx, 498, Rules.RULE_kwTimestamp.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2178
			match(K_TIMESTAMP) as Token
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

	open class KwToContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwTo.id
	        set(value) { throw RuntimeException() }
		fun K_TO() : TerminalNode? = getToken(CqlParser.Tokens.K_TO.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwTo() : KwToContext {
		var _localctx : KwToContext = KwToContext(context, state)
		enterRule(_localctx, 500, Rules.RULE_kwTo.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2180
			match(K_TO) as Token
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

	open class KwTriggerContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwTrigger.id
	        set(value) { throw RuntimeException() }
		fun K_TRIGGER() : TerminalNode? = getToken(CqlParser.Tokens.K_TRIGGER.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwTrigger() : KwTriggerContext {
		var _localctx : KwTriggerContext = KwTriggerContext(context, state)
		enterRule(_localctx, 502, Rules.RULE_kwTrigger.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2182
			match(K_TRIGGER) as Token
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

	open class KwTruncateContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwTruncate.id
	        set(value) { throw RuntimeException() }
		fun K_TRUNCATE() : TerminalNode? = getToken(CqlParser.Tokens.K_TRUNCATE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwTruncate() : KwTruncateContext {
		var _localctx : KwTruncateContext = KwTruncateContext(context, state)
		enterRule(_localctx, 504, Rules.RULE_kwTruncate.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2184
			match(K_TRUNCATE) as Token
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

	open class KwTtlContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwTtl.id
	        set(value) { throw RuntimeException() }
		fun K_TTL() : TerminalNode? = getToken(CqlParser.Tokens.K_TTL.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwTtl() : KwTtlContext {
		var _localctx : KwTtlContext = KwTtlContext(context, state)
		enterRule(_localctx, 506, Rules.RULE_kwTtl.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2186
			match(K_TTL) as Token
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

	open class KwTypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwType.id
	        set(value) { throw RuntimeException() }
		fun K_TYPE() : TerminalNode? = getToken(CqlParser.Tokens.K_TYPE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwType() : KwTypeContext {
		var _localctx : KwTypeContext = KwTypeContext(context, state)
		enterRule(_localctx, 508, Rules.RULE_kwType.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2188
			match(K_TYPE) as Token
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

	open class KwUnloggedContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwUnlogged.id
	        set(value) { throw RuntimeException() }
		fun K_UNLOGGED() : TerminalNode? = getToken(CqlParser.Tokens.K_UNLOGGED.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwUnlogged() : KwUnloggedContext {
		var _localctx : KwUnloggedContext = KwUnloggedContext(context, state)
		enterRule(_localctx, 510, Rules.RULE_kwUnlogged.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2190
			match(K_UNLOGGED) as Token
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

	open class KwUpdateContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwUpdate.id
	        set(value) { throw RuntimeException() }
		fun K_UPDATE() : TerminalNode? = getToken(CqlParser.Tokens.K_UPDATE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwUpdate() : KwUpdateContext {
		var _localctx : KwUpdateContext = KwUpdateContext(context, state)
		enterRule(_localctx, 512, Rules.RULE_kwUpdate.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2192
			match(K_UPDATE) as Token
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

	open class KwUseContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwUse.id
	        set(value) { throw RuntimeException() }
		fun K_USE() : TerminalNode? = getToken(CqlParser.Tokens.K_USE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwUse() : KwUseContext {
		var _localctx : KwUseContext = KwUseContext(context, state)
		enterRule(_localctx, 514, Rules.RULE_kwUse.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2194
			match(K_USE) as Token
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

	open class KwUserContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwUser.id
	        set(value) { throw RuntimeException() }
		fun K_USER() : TerminalNode? = getToken(CqlParser.Tokens.K_USER.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwUser() : KwUserContext {
		var _localctx : KwUserContext = KwUserContext(context, state)
		enterRule(_localctx, 516, Rules.RULE_kwUser.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2196
			match(K_USER) as Token
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

	open class KwUsersContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwUsers.id
	        set(value) { throw RuntimeException() }
		fun K_USERS() : TerminalNode? = getToken(CqlParser.Tokens.K_USERS.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwUsers() : KwUsersContext {
		var _localctx : KwUsersContext = KwUsersContext(context, state)
		enterRule(_localctx, 518, Rules.RULE_kwUsers.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2198
			match(K_USERS) as Token
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

	open class KwUsingContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwUsing.id
	        set(value) { throw RuntimeException() }
		fun K_USING() : TerminalNode? = getToken(CqlParser.Tokens.K_USING.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwUsing() : KwUsingContext {
		var _localctx : KwUsingContext = KwUsingContext(context, state)
		enterRule(_localctx, 520, Rules.RULE_kwUsing.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2200
			match(K_USING) as Token
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

	open class KwValuesContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwValues.id
	        set(value) { throw RuntimeException() }
		fun K_VALUES() : TerminalNode? = getToken(CqlParser.Tokens.K_VALUES.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwValues() : KwValuesContext {
		var _localctx : KwValuesContext = KwValuesContext(context, state)
		enterRule(_localctx, 522, Rules.RULE_kwValues.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2202
			match(K_VALUES) as Token
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

	open class KwViewContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwView.id
	        set(value) { throw RuntimeException() }
		fun K_VIEW() : TerminalNode? = getToken(CqlParser.Tokens.K_VIEW.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwView() : KwViewContext {
		var _localctx : KwViewContext = KwViewContext(context, state)
		enterRule(_localctx, 524, Rules.RULE_kwView.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2204
			match(K_VIEW) as Token
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

	open class KwWhereContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwWhere.id
	        set(value) { throw RuntimeException() }
		fun K_WHERE() : TerminalNode? = getToken(CqlParser.Tokens.K_WHERE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwWhere() : KwWhereContext {
		var _localctx : KwWhereContext = KwWhereContext(context, state)
		enterRule(_localctx, 526, Rules.RULE_kwWhere.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2206
			match(K_WHERE) as Token
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

	open class KwWithContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwWith.id
	        set(value) { throw RuntimeException() }
		fun K_WITH() : TerminalNode? = getToken(CqlParser.Tokens.K_WITH.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwWith() : KwWithContext {
		var _localctx : KwWithContext = KwWithContext(context, state)
		enterRule(_localctx, 528, Rules.RULE_kwWith.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2208
			match(K_WITH) as Token
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

	open class KwRevokeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kwRevoke.id
	        set(value) { throw RuntimeException() }
		fun K_REVOKE() : TerminalNode? = getToken(CqlParser.Tokens.K_REVOKE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  kwRevoke() : KwRevokeContext {
		var _localctx : KwRevokeContext = KwRevokeContext(context, state)
		enterRule(_localctx, 530, Rules.RULE_kwRevoke.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2210
			match(K_REVOKE) as Token
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

	open class EofContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_eof.id
	        set(value) { throw RuntimeException() }
		fun EOF() : TerminalNode? = getToken(CqlParser.Tokens.EOF.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  eof() : EofContext {
		var _localctx : EofContext = EofContext(context, state)
		enterRule(_localctx, 532, Rules.RULE_eof.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2212
			match(EOF) as Token
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

	open class SyntaxBracketLrContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_syntaxBracketLr.id
	        set(value) { throw RuntimeException() }
		fun LR_BRACKET() : TerminalNode? = getToken(CqlParser.Tokens.LR_BRACKET.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  syntaxBracketLr() : SyntaxBracketLrContext {
		var _localctx : SyntaxBracketLrContext = SyntaxBracketLrContext(context, state)
		enterRule(_localctx, 534, Rules.RULE_syntaxBracketLr.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2214
			match(LR_BRACKET) as Token
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

	open class SyntaxBracketRrContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_syntaxBracketRr.id
	        set(value) { throw RuntimeException() }
		fun RR_BRACKET() : TerminalNode? = getToken(CqlParser.Tokens.RR_BRACKET.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  syntaxBracketRr() : SyntaxBracketRrContext {
		var _localctx : SyntaxBracketRrContext = SyntaxBracketRrContext(context, state)
		enterRule(_localctx, 536, Rules.RULE_syntaxBracketRr.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2216
			match(RR_BRACKET) as Token
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

	open class SyntaxBracketLcContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_syntaxBracketLc.id
	        set(value) { throw RuntimeException() }
		fun LC_BRACKET() : TerminalNode? = getToken(CqlParser.Tokens.LC_BRACKET.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  syntaxBracketLc() : SyntaxBracketLcContext {
		var _localctx : SyntaxBracketLcContext = SyntaxBracketLcContext(context, state)
		enterRule(_localctx, 538, Rules.RULE_syntaxBracketLc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2218
			match(LC_BRACKET) as Token
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

	open class SyntaxBracketRcContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_syntaxBracketRc.id
	        set(value) { throw RuntimeException() }
		fun RC_BRACKET() : TerminalNode? = getToken(CqlParser.Tokens.RC_BRACKET.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  syntaxBracketRc() : SyntaxBracketRcContext {
		var _localctx : SyntaxBracketRcContext = SyntaxBracketRcContext(context, state)
		enterRule(_localctx, 540, Rules.RULE_syntaxBracketRc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2220
			match(RC_BRACKET) as Token
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

	open class SyntaxBracketLaContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_syntaxBracketLa.id
	        set(value) { throw RuntimeException() }
		fun OPERATOR_LT() : TerminalNode? = getToken(CqlParser.Tokens.OPERATOR_LT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  syntaxBracketLa() : SyntaxBracketLaContext {
		var _localctx : SyntaxBracketLaContext = SyntaxBracketLaContext(context, state)
		enterRule(_localctx, 542, Rules.RULE_syntaxBracketLa.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2222
			match(OPERATOR_LT) as Token
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

	open class SyntaxBracketRaContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_syntaxBracketRa.id
	        set(value) { throw RuntimeException() }
		fun OPERATOR_GT() : TerminalNode? = getToken(CqlParser.Tokens.OPERATOR_GT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  syntaxBracketRa() : SyntaxBracketRaContext {
		var _localctx : SyntaxBracketRaContext = SyntaxBracketRaContext(context, state)
		enterRule(_localctx, 544, Rules.RULE_syntaxBracketRa.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2224
			match(OPERATOR_GT) as Token
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

	open class SyntaxBracketLsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_syntaxBracketLs.id
	        set(value) { throw RuntimeException() }
		fun LS_BRACKET() : TerminalNode? = getToken(CqlParser.Tokens.LS_BRACKET.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  syntaxBracketLs() : SyntaxBracketLsContext {
		var _localctx : SyntaxBracketLsContext = SyntaxBracketLsContext(context, state)
		enterRule(_localctx, 546, Rules.RULE_syntaxBracketLs.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2226
			match(LS_BRACKET) as Token
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

	open class SyntaxBracketRsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_syntaxBracketRs.id
	        set(value) { throw RuntimeException() }
		fun RS_BRACKET() : TerminalNode? = getToken(CqlParser.Tokens.RS_BRACKET.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  syntaxBracketRs() : SyntaxBracketRsContext {
		var _localctx : SyntaxBracketRsContext = SyntaxBracketRsContext(context, state)
		enterRule(_localctx, 548, Rules.RULE_syntaxBracketRs.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2228
			match(RS_BRACKET) as Token
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

	open class SyntaxCommaContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_syntaxComma.id
	        set(value) { throw RuntimeException() }
		fun COMMA() : TerminalNode? = getToken(CqlParser.Tokens.COMMA.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  syntaxComma() : SyntaxCommaContext {
		var _localctx : SyntaxCommaContext = SyntaxCommaContext(context, state)
		enterRule(_localctx, 550, Rules.RULE_syntaxComma.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2230
			match(COMMA) as Token
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

	open class SyntaxColonContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_syntaxColon.id
	        set(value) { throw RuntimeException() }
		fun COLON() : TerminalNode? = getToken(CqlParser.Tokens.COLON.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  syntaxColon() : SyntaxColonContext {
		var _localctx : SyntaxColonContext = SyntaxColonContext(context, state)
		enterRule(_localctx, 552, Rules.RULE_syntaxColon.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 2232
			match(COLON) as Token
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