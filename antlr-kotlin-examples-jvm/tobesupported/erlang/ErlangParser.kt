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

class ErlangParser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(ErlangParser.FormsContext::class,
                                                              ErlangParser.FormContext::class,
                                                              ErlangParser.TokAtomContext::class,
                                                              ErlangParser.TokVarContext::class,
                                                              ErlangParser.TokFloatContext::class,
                                                              ErlangParser.TokIntegerContext::class,
                                                              ErlangParser.TokCharContext::class,
                                                              ErlangParser.TokStringContext::class,
                                                              ErlangParser.AttributeContext::class,
                                                              ErlangParser.TypeSpecContext::class,
                                                              ErlangParser.SpecFunContext::class,
                                                              ErlangParser.TypedAttrValContext::class,
                                                              ErlangParser.TypedRecordFieldsContext::class,
                                                              ErlangParser.TypedExprsContext::class,
                                                              ErlangParser.TypedExprContext::class,
                                                              ErlangParser.TypeSigsContext::class,
                                                              ErlangParser.TypeSigContext::class,
                                                              ErlangParser.TypeGuardsContext::class,
                                                              ErlangParser.TypeGuardContext::class,
                                                              ErlangParser.TopTypesContext::class,
                                                              ErlangParser.TopTypeContext::class,
                                                              ErlangParser.TopType100Context::class,
                                                              ErlangParser.Type200Context::class,
                                                              ErlangParser.Type300Context::class,
                                                              ErlangParser.Type400Context::class,
                                                              ErlangParser.Type500Context::class,
                                                              ErlangParser.TypeContext::class,
                                                              ErlangParser.FunType100Context::class,
                                                              ErlangParser.FunTypeContext::class,
                                                              ErlangParser.FieldTypesContext::class,
                                                              ErlangParser.FieldTypeContext::class,
                                                              ErlangParser.BinaryTypeContext::class,
                                                              ErlangParser.BinBaseTypeContext::class,
                                                              ErlangParser.BinUnitTypeContext::class,
                                                              ErlangParser.AttrValContext::class,
                                                              ErlangParser.FunctionContext::class,
                                                              ErlangParser.FunctionClauseContext::class,
                                                              ErlangParser.ClauseArgsContext::class,
                                                              ErlangParser.ClauseGuardContext::class,
                                                              ErlangParser.ClauseBodyContext::class,
                                                              ErlangParser.ExprContext::class,
                                                              ErlangParser.Expr100Context::class,
                                                              ErlangParser.Expr150Context::class,
                                                              ErlangParser.Expr160Context::class,
                                                              ErlangParser.Expr200Context::class,
                                                              ErlangParser.Expr300Context::class,
                                                              ErlangParser.Expr400Context::class,
                                                              ErlangParser.Expr500Context::class,
                                                              ErlangParser.Expr600Context::class,
                                                              ErlangParser.Expr700Context::class,
                                                              ErlangParser.Expr800Context::class,
                                                              ErlangParser.ExprMaxContext::class,
                                                              ErlangParser.ListContext::class,
                                                              ErlangParser.TailContext::class,
                                                              ErlangParser.BinaryContext::class,
                                                              ErlangParser.BinElementsContext::class,
                                                              ErlangParser.BinElementContext::class,
                                                              ErlangParser.BitExprContext::class,
                                                              ErlangParser.OptBitSizeExprContext::class,
                                                              ErlangParser.OptBitTypeListContext::class,
                                                              ErlangParser.BitTypeListContext::class,
                                                              ErlangParser.BitTypeContext::class,
                                                              ErlangParser.BitSizeExprContext::class,
                                                              ErlangParser.ListComprehensionContext::class,
                                                              ErlangParser.BinaryComprehensionContext::class,
                                                              ErlangParser.LcExprsContext::class,
                                                              ErlangParser.LcExprContext::class,
                                                              ErlangParser.TupleContext::class,
                                                              ErlangParser.RecordExprContext::class,
                                                              ErlangParser.RecordTupleContext::class,
                                                              ErlangParser.RecordFieldsContext::class,
                                                              ErlangParser.RecordFieldContext::class,
                                                              ErlangParser.FunctionCallContext::class,
                                                              ErlangParser.IfExprContext::class,
                                                              ErlangParser.IfClausesContext::class,
                                                              ErlangParser.IfClauseContext::class,
                                                              ErlangParser.CaseExprContext::class,
                                                              ErlangParser.CrClausesContext::class,
                                                              ErlangParser.CrClauseContext::class,
                                                              ErlangParser.ReceiveExprContext::class,
                                                              ErlangParser.FunExprContext::class,
                                                              ErlangParser.AtomOrVarContext::class,
                                                              ErlangParser.IntegerOrVarContext::class,
                                                              ErlangParser.FunClausesContext::class,
                                                              ErlangParser.FunClauseContext::class,
                                                              ErlangParser.TryExprContext::class,
                                                              ErlangParser.TryCatchContext::class,
                                                              ErlangParser.TryClausesContext::class,
                                                              ErlangParser.TryClauseContext::class,
                                                              ErlangParser.ArgumentListContext::class,
                                                              ErlangParser.ExprsContext::class,
                                                              ErlangParser.GuardContext::class,
                                                              ErlangParser.AtomicContext::class,
                                                              ErlangParser.PrefixOpContext::class,
                                                              ErlangParser.MultOpContext::class,
                                                              ErlangParser.AddOpContext::class,
                                                              ErlangParser.ListOpContext::class,
                                                              ErlangParser.CompOpContext::class,
                                                              ErlangParser.RuleClausesContext::class,
                                                              ErlangParser.RuleClauseContext::class,
                                                              ErlangParser.RuleBodyContext::class)
    }

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "Erlang.g4"

    override val tokenNames: Array<String?>?
        get() = ErlangParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = ErlangParser.Companion.ruleNames
    override val atn: ATN
        get() = ErlangParser.Companion.ATN

    enum class Tokens(val id: Int) {
        EOF(-1),
        T__0(1),
        T__1(2),
        T__2(3),
        T__3(4),
        T__4(5),
        T__5(6),
        T__6(7),
        T__7(8),
        T__8(9),
        T__9(10),
        T__10(11),
        T__11(12),
        T__12(13),
        T__13(14),
        T__14(15),
        T__15(16),
        T__16(17),
        T__17(18),
        T__18(19),
        T__19(20),
        T__20(21),
        T__21(22),
        T__22(23),
        T__23(24),
        T__24(25),
        T__25(26),
        T__26(27),
        T__27(28),
        T__28(29),
        T__29(30),
        T__30(31),
        T__31(32),
        T__32(33),
        T__33(34),
        T__34(35),
        T__35(36),
        T__36(37),
        T__37(38),
        T__38(39),
        T__39(40),
        T__40(41),
        T__41(42),
        T__42(43),
        T__43(44),
        T__44(45),
        T__45(46),
        T__46(47),
        T__47(48),
        T__48(49),
        T__49(50),
        T__50(51),
        T__51(52),
        T__52(53),
        T__53(54),
        T__54(55),
        T__55(56),
        T__56(57),
        T__57(58),
        T__58(59),
        T__59(60),
        T__60(61),
        T__61(62),
        T__62(63),
        TokAtom(64),
        TokVar(65),
        TokFloat(66),
        TokInteger(67),
        TokChar(68),
        TokString(69),
        AttrName(70),
        Comment(71),
        WS(72)
    }

    enum class Rules(val id: Int) {
        RULE_forms(0),
        RULE_form(1),
        RULE_tokAtom(2),
        RULE_tokVar(3),
        RULE_tokFloat(4),
        RULE_tokInteger(5),
        RULE_tokChar(6),
        RULE_tokString(7),
        RULE_attribute(8),
        RULE_typeSpec(9),
        RULE_specFun(10),
        RULE_typedAttrVal(11),
        RULE_typedRecordFields(12),
        RULE_typedExprs(13),
        RULE_typedExpr(14),
        RULE_typeSigs(15),
        RULE_typeSig(16),
        RULE_typeGuards(17),
        RULE_typeGuard(18),
        RULE_topTypes(19),
        RULE_topType(20),
        RULE_topType100(21),
        RULE_type200(22),
        RULE_type300(23),
        RULE_type400(24),
        RULE_type500(25),
        RULE_type(26),
        RULE_funType100(27),
        RULE_funType(28),
        RULE_fieldTypes(29),
        RULE_fieldType(30),
        RULE_binaryType(31),
        RULE_binBaseType(32),
        RULE_binUnitType(33),
        RULE_attrVal(34),
        RULE_function(35),
        RULE_functionClause(36),
        RULE_clauseArgs(37),
        RULE_clauseGuard(38),
        RULE_clauseBody(39),
        RULE_expr(40),
        RULE_expr100(41),
        RULE_expr150(42),
        RULE_expr160(43),
        RULE_expr200(44),
        RULE_expr300(45),
        RULE_expr400(46),
        RULE_expr500(47),
        RULE_expr600(48),
        RULE_expr700(49),
        RULE_expr800(50),
        RULE_exprMax(51),
        RULE_list(52),
        RULE_tail(53),
        RULE_binary(54),
        RULE_binElements(55),
        RULE_binElement(56),
        RULE_bitExpr(57),
        RULE_optBitSizeExpr(58),
        RULE_optBitTypeList(59),
        RULE_bitTypeList(60),
        RULE_bitType(61),
        RULE_bitSizeExpr(62),
        RULE_listComprehension(63),
        RULE_binaryComprehension(64),
        RULE_lcExprs(65),
        RULE_lcExpr(66),
        RULE_tuple(67),
        RULE_recordExpr(68),
        RULE_recordTuple(69),
        RULE_recordFields(70),
        RULE_recordField(71),
        RULE_functionCall(72),
        RULE_ifExpr(73),
        RULE_ifClauses(74),
        RULE_ifClause(75),
        RULE_caseExpr(76),
        RULE_crClauses(77),
        RULE_crClause(78),
        RULE_receiveExpr(79),
        RULE_funExpr(80),
        RULE_atomOrVar(81),
        RULE_integerOrVar(82),
        RULE_funClauses(83),
        RULE_funClause(84),
        RULE_tryExpr(85),
        RULE_tryCatch(86),
        RULE_tryClauses(87),
        RULE_tryClause(88),
        RULE_argumentList(89),
        RULE_exprs(90),
        RULE_guard(91),
        RULE_atomic(92),
        RULE_prefixOp(93),
        RULE_multOp(94),
        RULE_addOp(95),
        RULE_listOp(96),
        RULE_compOp(97),
        RULE_ruleClauses(98),
        RULE_ruleClause(99),
        RULE_ruleBody(100)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("forms", "form", "tokAtom", "tokVar", "tokFloat", 
                                "tokInteger", "tokChar", "tokString", "attribute", 
                                "typeSpec", "specFun", "typedAttrVal", "typedRecordFields", 
                                "typedExprs", "typedExpr", "typeSigs", "typeSig", 
                                "typeGuards", "typeGuard", "topTypes", "topType", 
                                "topType100", "type200", "type300", "type400", 
                                "type500", "type", "funType100", "funType", 
                                "fieldTypes", "fieldType", "binaryType", 
                                "binBaseType", "binUnitType", "attrVal", 
                                "function", "functionClause", "clauseArgs", 
                                "clauseGuard", "clauseBody", "expr", "expr100", 
                                "expr150", "expr160", "expr200", "expr300", 
                                "expr400", "expr500", "expr600", "expr700", 
                                "expr800", "exprMax", "list", "tail", "binary", 
                                "binElements", "binElement", "bitExpr", 
                                "optBitSizeExpr", "optBitTypeList", "bitTypeList", 
                                "bitType", "bitSizeExpr", "listComprehension", 
                                "binaryComprehension", "lcExprs", "lcExpr", 
                                "tuple", "recordExpr", "recordTuple", "recordFields", 
                                "recordField", "functionCall", "ifExpr", 
                                "ifClauses", "ifClause", "caseExpr", "crClauses", 
                                "crClause", "receiveExpr", "funExpr", "atomOrVar", 
                                "integerOrVar", "funClauses", "funClause", 
                                "tryExpr", "tryCatch", "tryClauses", "tryClause", 
                                "argumentList", "exprs", "guard", "atomic", 
                                "prefixOp", "multOp", "addOp", "listOp", 
                                "compOp", "ruleClauses", "ruleClause", "ruleBody")

        private val LITERAL_NAMES = Arrays.asList<String?>(null, "'.'", 
                                                           "'-'", "'('", 
                                                           "')'", "':'", 
                                                           "'/'", "'::'", 
                                                           "','", "'{'", 
                                                           "'}'", "';'", 
                                                           "'when'", "'|'", 
                                                           "'..'", "'['", 
                                                           "']'", "'...'", 
                                                           "'#'", "'fun'", 
                                                           "'->'", "'<<'", 
                                                           "'>>'", "'*'", 
                                                           "'catch'", "'='", 
                                                           "'!'", "'orelse'", 
                                                           "'andalso'", 
                                                           "'begin'", "'end'", 
                                                           "'||'", "'<-'", 
                                                           "'<='", "'if'", 
                                                           "'case'", "'of'", 
                                                           "'receive'", 
                                                           "'after'", "'try'", 
                                                           "'+'", "'bnot'", 
                                                           "'not'", "'div'", 
                                                           "'rem'", "'band'", 
                                                           "'and'", "'bor'", 
                                                           "'bxor'", "'bsl'", 
                                                           "'bsr'", "'or'", 
                                                           "'xor'", "'++'", 
                                                           "'--'", "'=='", 
                                                           "'/='", "'=<'", 
                                                           "'<'", "'>='", 
                                                           "'>'", "'=:='", 
                                                           "'=/='", "':-'")
        private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            "TokAtom", "TokVar", 
                                                            "TokFloat", 
                                                            "TokInteger", 
                                                            "TokChar", "TokString", 
                                                            "AttrName", 
                                                            "Comment", "WS")

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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u004a\u03ea\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0004\u001c\u0009\u001c\u0004\u001d\u0009\u001d\u0004\u001e\u0009\u001e\u0004\u001f\u0009\u001f\u0004\u0020\u0009\u0020\u0004\u0021\u0009\u0021\u0004\u0022\u0009\u0022\u0004\u0023\u0009\u0023\u0004\u0024\u0009\u0024\u0004\u0025\u0009\u0025\u0004\u0026\u0009\u0026\u0004\u0027\u0009\u0027\u0004\u0028\u0009\u0028\u0004\u0029\u0009\u0029\u0004\u002a\u0009\u002a\u0004\u002b\u0009\u002b\u0004\u002c\u0009\u002c\u0004\u002d\u0009\u002d\u0004\u002e\u0009\u002e\u0004\u002f\u0009\u002f\u0004\u0030\u0009\u0030\u0004\u0031\u0009\u0031\u0004\u0032\u0009\u0032\u0004\u0033\u0009\u0033\u0004\u0034\u0009\u0034\u0004\u0035\u0009\u0035\u0004\u0036\u0009\u0036\u0004\u0037\u0009\u0037\u0004\u0038\u0009\u0038\u0004\u0039\u0009\u0039\u0004\u003a\u0009\u003a\u0004\u003b\u0009\u003b\u0004\u003c\u0009\u003c\u0004\u003d\u0009\u003d\u0004\u003e\u0009\u003e\u0004\u003f\u0009\u003f\u0004\u0040\u0009\u0040\u0004\u0041\u0009\u0041\u0004\u0042\u0009\u0042\u0004\u0043\u0009\u0043\u0004\u0044\u0009\u0044\u0004\u0045\u0009\u0045\u0004\u0046\u0009\u0046\u0004\u0047\u0009\u0047\u0004\u0048\u0009\u0048\u0004\u0049\u0009\u0049\u0004\u004a\u0009\u004a\u0004\u004b\u0009\u004b\u0004\u004c\u0009\u004c\u0004\u004d\u0009\u004d\u0004\u004e\u0009\u004e\u0004\u004f\u0009\u004f\u0004\u0050\u0009\u0050\u0004\u0051\u0009\u0051\u0004\u0052\u0009\u0052\u0004\u0053\u0009\u0053\u0004\u0054\u0009\u0054\u0004\u0055\u0009\u0055\u0004\u0056\u0009\u0056\u0004\u0057\u0009\u0057\u0004\u0058\u0009\u0058\u0004\u0059\u0009\u0059\u0004\u005a\u0009\u005a\u0004\u005b\u0009\u005b\u0004\u005c\u0009\u005c\u0004\u005d\u0009\u005d\u0004\u005e\u0009\u005e\u0004\u005f\u0009\u005f\u0004\u0060\u0009\u0060\u0004\u0061\u0009\u0061\u0004\u0062\u0009\u0062\u0004\u0063\u0009\u0063\u0004\u0064\u0009\u0064\u0004\u0065\u0009\u0065\u0004\u0066\u0009\u0066\u0003\u0002\u0006\u0002\u00ce\u000a\u0002\u000d\u0002\u000e\u0002\u00cf\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0005\u0003\u00d7\u000a\u0003\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0005\u000a\u00f7\u000a\u000a\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0005\u000b\u0101\u000a\u000b\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0005\u000c\u0114\u000a\u000c\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0005\u000d\u011e\u000a\u000d\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0005\u000f\u0131\u000a\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0007\u0011\u013a\u000a\u0011\u000c\u0011\u000e\u0011\u013d\u000b\u0011\u0003\u0012\u0003\u0012\u0003\u0012\u0005\u0012\u0142\u000a\u0012\u0003\u0013\u0003\u0013\u0003\u0013\u0007\u0013\u0147\u000a\u0013\u000c\u0013\u000e\u0013\u014a\u000b\u0013\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0005\u0014\u0155\u000a\u0014\u0003\u0015\u0003\u0015\u0003\u0015\u0007\u0015\u015a\u000a\u0015\u000c\u0015\u000e\u0015\u015d\u000b\u0015\u0003\u0016\u0003\u0016\u0003\u0016\u0005\u0016\u0162\u000a\u0016\u0003\u0016\u0003\u0016\u0003\u0017\u0003\u0017\u0003\u0017\u0005\u0017\u0169\u000a\u0017\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u016e\u000a\u0018\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0007\u0019\u0177\u000a\u0019\u000c\u0019\u000e\u0019\u017a\u000b\u0019\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0007\u001a\u0183\u000a\u001a\u000c\u001a\u000e\u001a\u0186\u000b\u001a\u0003\u001b\u0005\u001b\u0189\u000a\u001b\u0003\u001b\u0003\u001b\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0005\u001c\u01d0\u000a\u001c\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0005\u001d\u01d8\u000a\u001d\u0003\u001e\u0003\u001e\u0005\u001e\u01dc\u000a\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001f\u0003\u001f\u0003\u001f\u0007\u001f\u01e5\u000a\u001f\u000c\u001f\u000e\u001f\u01e8\u000b\u001f\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0005\u0021\u01fe\u000a\u0021\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u0219\u000a\u0024\u0003\u0025\u0003\u0025\u0003\u0025\u0007\u0025\u021e\u000a\u0025\u000c\u0025\u000e\u0025\u0221\u000b\u0025\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0027\u0003\u0027\u0003\u0028\u0003\u0028\u0005\u0028\u022c\u000a\u0028\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u002a\u0003\u002a\u0003\u002a\u0005\u002a\u0234\u000a\u002a\u0003\u002b\u0003\u002b\u0003\u002b\u0007\u002b\u0239\u000a\u002b\u000c\u002b\u000e\u002b\u023c\u000b\u002b\u0003\u002c\u0003\u002c\u0003\u002c\u0007\u002c\u0241\u000a\u002c\u000c\u002c\u000e\u002c\u0244\u000b\u002c\u0003\u002d\u0003\u002d\u0003\u002d\u0007\u002d\u0249\u000a\u002d\u000c\u002d\u000e\u002d\u024c\u000b\u002d\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0005\u002e\u0252\u000a\u002e\u0003\u002f\u0003\u002f\u0003\u002f\u0003\u002f\u0007\u002f\u0258\u000a\u002f\u000c\u002f\u000e\u002f\u025b\u000b\u002f\u0003\u0030\u0003\u0030\u0003\u0030\u0003\u0030\u0007\u0030\u0261\u000a\u0030\u000c\u0030\u000e\u0030\u0264\u000b\u0030\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0007\u0031\u026a\u000a\u0031\u000c\u0031\u000e\u0031\u026d\u000b\u0031\u0003\u0032\u0005\u0032\u0270\u000a\u0032\u0003\u0032\u0003\u0032\u0003\u0033\u0003\u0033\u0003\u0033\u0005\u0033\u0277\u000a\u0033\u0003\u0034\u0003\u0034\u0003\u0034\u0005\u0034\u027c\u000a\u0034\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0005\u0035\u0292\u000a\u0035\u0003\u0036\u0003\u0036\u0003\u0036\u0003\u0036\u0003\u0036\u0003\u0036\u0005\u0036\u029a\u000a\u0036\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0005\u0037\u02a5\u000a\u0037\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0005\u0038\u02ad\u000a\u0038\u0003\u0039\u0003\u0039\u0003\u0039\u0007\u0039\u02b2\u000a\u0039\u000c\u0039\u000e\u0039\u02b5\u000b\u0039\u0003\u003a\u0003\u003a\u0003\u003a\u0003\u003a\u0003\u003b\u0005\u003b\u02bc\u000a\u003b\u0003\u003b\u0003\u003b\u0003\u003c\u0003\u003c\u0005\u003c\u02c2\u000a\u003c\u0003\u003d\u0003\u003d\u0005\u003d\u02c6\u000a\u003d\u0003\u003e\u0003\u003e\u0003\u003e\u0007\u003e\u02cb\u000a\u003e\u000c\u003e\u000e\u003e\u02ce\u000b\u003e\u0003\u003f\u0003\u003f\u0003\u003f\u0005\u003f\u02d3\u000a\u003f\u0003\u0040\u0003\u0040\u0003\u0041\u0003\u0041\u0003\u0041\u0003\u0041\u0003\u0041\u0003\u0041\u0003\u0042\u0003\u0042\u0003\u0042\u0003\u0042\u0003\u0042\u0003\u0042\u0003\u0043\u0003\u0043\u0003\u0043\u0007\u0043\u02e6\u000a\u0043\u000c\u0043\u000e\u0043\u02e9\u000b\u0043\u0003\u0044\u0003\u0044\u0003\u0044\u0003\u0044\u0003\u0044\u0003\u0044\u0003\u0044\u0003\u0044\u0003\u0044\u0005\u0044\u02f4\u000a\u0044\u0003\u0045\u0003\u0045\u0005\u0045\u02f8\u000a\u0045\u0003\u0045\u0003\u0045\u0003\u0046\u0003\u0046\u0005\u0046\u02fe\u000a\u0046\u0003\u0046\u0003\u0046\u0003\u0046\u0003\u0046\u0003\u0046\u0005\u0046\u0305\u000a\u0046\u0003\u0046\u0003\u0046\u0003\u0046\u0003\u0046\u0003\u0046\u0003\u0046\u0005\u0046\u030d\u000a\u0046\u0007\u0046\u030f\u000a\u0046\u000c\u0046\u000e\u0046\u0312\u000b\u0046\u0003\u0047\u0003\u0047\u0005\u0047\u0316\u000a\u0047\u0003\u0047\u0003\u0047\u0003\u0048\u0003\u0048\u0003\u0048\u0007\u0048\u031d\u000a\u0048\u000c\u0048\u000e\u0048\u0320\u000b\u0048\u0003\u0049\u0003\u0049\u0005\u0049\u0324\u000a\u0049\u0003\u0049\u0003\u0049\u0003\u0049\u0003\u004a\u0003\u004a\u0003\u004a\u0003\u004b\u0003\u004b\u0003\u004b\u0003\u004b\u0003\u004c\u0003\u004c\u0003\u004c\u0007\u004c\u0333\u000a\u004c\u000c\u004c\u000e\u004c\u0336\u000b\u004c\u0003\u004d\u0003\u004d\u0003\u004d\u0003\u004e\u0003\u004e\u0003\u004e\u0003\u004e\u0003\u004e\u0003\u004e\u0003\u004f\u0003\u004f\u0003\u004f\u0007\u004f\u0344\u000a\u004f\u000c\u004f\u000e\u004f\u0347\u000b\u004f\u0003\u0050\u0003\u0050\u0003\u0050\u0003\u0050\u0003\u0051\u0003\u0051\u0003\u0051\u0003\u0051\u0003\u0051\u0003\u0051\u0003\u0051\u0003\u0051\u0003\u0051\u0003\u0051\u0003\u0051\u0003\u0051\u0003\u0051\u0003\u0051\u0003\u0051\u0003\u0051\u0003\u0051\u0005\u0051\u035e\u000a\u0051\u0003\u0052\u0003\u0052\u0003\u0052\u0003\u0052\u0003\u0052\u0003\u0052\u0003\u0052\u0003\u0052\u0003\u0052\u0003\u0052\u0003\u0052\u0003\u0052\u0003\u0052\u0003\u0052\u0003\u0052\u0003\u0052\u0005\u0052\u0370\u000a\u0052\u0003\u0053\u0003\u0053\u0005\u0053\u0374\u000a\u0053\u0003\u0054\u0003\u0054\u0005\u0054\u0378\u000a\u0054\u0003\u0055\u0003\u0055\u0003\u0055\u0007\u0055\u037d\u000a\u0055\u000c\u0055\u000e\u0055\u0380\u000b\u0055\u0003\u0056\u0003\u0056\u0003\u0056\u0003\u0056\u0003\u0057\u0003\u0057\u0003\u0057\u0003\u0057\u0005\u0057\u038a\u000a\u0057\u0003\u0057\u0003\u0057\u0003\u0058\u0003\u0058\u0003\u0058\u0003\u0058\u0003\u0058\u0003\u0058\u0003\u0058\u0003\u0058\u0003\u0058\u0003\u0058\u0003\u0058\u0003\u0058\u0003\u0058\u0003\u0058\u0005\u0058\u039c\u000a\u0058\u0003\u0059\u0003\u0059\u0003\u0059\u0007\u0059\u03a1\u000a\u0059\u000c\u0059\u000e\u0059\u03a4\u000b\u0059\u0003\u005a\u0003\u005a\u0003\u005a\u0005\u005a\u03a9\u000a\u005a\u0003\u005a\u0003\u005a\u0003\u005a\u0003\u005a\u0003\u005b\u0003\u005b\u0005\u005b\u03b1\u000a\u005b\u0003\u005b\u0003\u005b\u0003\u005c\u0003\u005c\u0003\u005c\u0007\u005c\u03b8\u000a\u005c\u000c\u005c\u000e\u005c\u03bb\u000b\u005c\u0003\u005d\u0003\u005d\u0003\u005d\u0007\u005d\u03c0\u000a\u005d\u000c\u005d\u000e\u005d\u03c3\u000b\u005d\u0003\u005e\u0003\u005e\u0003\u005e\u0003\u005e\u0003\u005e\u0006\u005e\u03ca\u000a\u005e\u000d\u005e\u000e\u005e\u03cb\u0005\u005e\u03ce\u000a\u005e\u0003\u005f\u0003\u005f\u0003\u0060\u0003\u0060\u0003\u0061\u0003\u0061\u0003\u0062\u0003\u0062\u0003\u0063\u0003\u0063\u0003\u0064\u0003\u0064\u0003\u0064\u0007\u0064\u03dd\u000a\u0064\u000c\u0064\u000e\u0064\u03e0\u000b\u0064\u0003\u0065\u0003\u0065\u0003\u0065\u0003\u0065\u0003\u0065\u0003\u0066\u0003\u0066\u0003\u0066\u0003\u0066\u0002\u0005\u0030\u0032\u008a\u0067\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0020\u0022\u0024\u0026\u0028\u002a\u002c\u002e\u0030\u0032\u0034\u0036\u0038\u003a\u003c\u003e\u0040\u0042\u0044\u0046\u0048\u004a\u004c\u004e\u0050\u0052\u0054\u0056\u0058\u005a\u005c\u005e\u0060\u0062\u0064\u0066\u0068\u006a\u006c\u006e\u0070\u0072\u0074\u0076\u0078\u007a\u007c\u007e\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u0002\u0008\u0003\u0002\u001b\u001c\u0004\u0002\u0004\u0004\u002a\u002c\u0005\u0002\u0008\u0008\u0019\u0019\u002d\u0030\u0005\u0002\u0004\u0004\u002a\u002a\u0031\u0036\u0003\u0002\u0037\u0038\u0003\u0002\u0039\u0040\u0002\u03fe\u0002\u00cd\u0003\u0002\u0002\u0002\u0004\u00d6\u0003\u0002\u0002\u0002\u0006\u00da\u0003\u0002\u0002\u0002\u0008\u00dc\u0003\u0002\u0002\u0002\u000a\u00de\u0003\u0002\u0002\u0002\u000c\u00e0\u0003\u0002\u0002\u0002\u000e\u00e2\u0003\u0002\u0002\u0002\u0010\u00e4\u0003\u0002\u0002\u0002\u0012\u00f6\u0003\u0002\u0002\u0002\u0014\u0100\u0003\u0002\u0002\u0002\u0016\u0113\u0003\u0002\u0002\u0002\u0018\u011d\u0003\u0002\u0002\u0002\u001a\u011f\u0003\u0002\u0002\u0002\u001c\u0130\u0003\u0002\u0002\u0002\u001e\u0132\u0003\u0002\u0002\u0002\u0020\u0136\u0003\u0002\u0002\u0002\u0022\u013e\u0003\u0002\u0002\u0002\u0024\u0143\u0003\u0002\u0002\u0002\u0026\u0154\u0003\u0002\u0002\u0002\u0028\u0156\u0003\u0002\u0002\u0002\u002a\u0161\u0003\u0002\u0002\u0002\u002c\u0165\u0003\u0002\u0002\u0002\u002e\u016a\u0003\u0002\u0002\u0002\u0030\u016f\u0003\u0002\u0002\u0002\u0032\u017b\u0003\u0002\u0002\u0002\u0034\u0188\u0003\u0002\u0002\u0002\u0036\u01cf\u0003\u0002\u0002\u0002\u0038\u01d7\u0003\u0002\u0002\u0002\u003a\u01d9\u0003\u0002\u0002\u0002\u003c\u01e1\u0003\u0002\u0002\u0002\u003e\u01e9\u0003\u0002\u0002\u0002\u0040\u01fd\u0003\u0002\u0002\u0002\u0042\u01ff\u0003\u0002\u0002\u0002\u0044\u0203\u0003\u0002\u0002\u0002\u0046\u0218\u0003\u0002\u0002\u0002\u0048\u021a\u0003\u0002\u0002\u0002\u004a\u0222\u0003\u0002\u0002\u0002\u004c\u0227\u0003\u0002\u0002\u0002\u004e\u022b\u0003\u0002\u0002\u0002\u0050\u022d\u0003\u0002\u0002\u0002\u0052\u0233\u0003\u0002\u0002\u0002\u0054\u0235\u0003\u0002\u0002\u0002\u0056\u023d\u0003\u0002\u0002\u0002\u0058\u0245\u0003\u0002\u0002\u0002\u005a\u024d\u0003\u0002\u0002\u0002\u005c\u0253\u0003\u0002\u0002\u0002\u005e\u025c\u0003\u0002\u0002\u0002\u0060\u0265\u0003\u0002\u0002\u0002\u0062\u026f\u0003\u0002\u0002\u0002\u0064\u0276\u0003\u0002\u0002\u0002\u0066\u0278\u0003\u0002\u0002\u0002\u0068\u0291\u0003\u0002\u0002\u0002\u006a\u0299\u0003\u0002\u0002\u0002\u006c\u02a4\u0003\u0002\u0002\u0002\u006e\u02ac\u0003\u0002\u0002\u0002\u0070\u02ae\u0003\u0002\u0002\u0002\u0072\u02b6\u0003\u0002\u0002\u0002\u0074\u02bb\u0003\u0002\u0002\u0002\u0076\u02c1\u0003\u0002\u0002\u0002\u0078\u02c5\u0003\u0002\u0002\u0002\u007a\u02c7\u0003\u0002\u0002\u0002\u007c\u02cf\u0003\u0002\u0002\u0002\u007e\u02d4\u0003\u0002\u0002\u0002\u0080\u02d6\u0003\u0002\u0002\u0002\u0082\u02dc\u0003\u0002\u0002\u0002\u0084\u02e2\u0003\u0002\u0002\u0002\u0086\u02f3\u0003\u0002\u0002\u0002\u0088\u02f5\u0003\u0002\u0002\u0002\u008a\u02fb\u0003\u0002\u0002\u0002\u008c\u0313\u0003\u0002\u0002\u0002\u008e\u0319\u0003\u0002\u0002\u0002\u0090\u0323\u0003\u0002\u0002\u0002\u0092\u0328\u0003\u0002\u0002\u0002\u0094\u032b\u0003\u0002\u0002\u0002\u0096\u032f\u0003\u0002\u0002\u0002\u0098\u0337\u0003\u0002\u0002\u0002\u009a\u033a\u0003\u0002\u0002\u0002\u009c\u0340\u0003\u0002\u0002\u0002\u009e\u0348\u0003\u0002\u0002\u0002\u00a0\u035d\u0003\u0002\u0002\u0002\u00a2\u036f\u0003\u0002\u0002\u0002\u00a4\u0373\u0003\u0002\u0002\u0002\u00a6\u0377\u0003\u0002\u0002\u0002\u00a8\u0379\u0003\u0002\u0002\u0002\u00aa\u0381\u0003\u0002\u0002\u0002\u00ac\u0385\u0003\u0002\u0002\u0002\u00ae\u039b\u0003\u0002\u0002\u0002\u00b0\u039d\u0003\u0002\u0002\u0002\u00b2\u03a8\u0003\u0002\u0002\u0002\u00b4\u03ae\u0003\u0002\u0002\u0002\u00b6\u03b4\u0003\u0002\u0002\u0002\u00b8\u03bc\u0003\u0002\u0002\u0002\u00ba\u03cd\u0003\u0002\u0002\u0002\u00bc\u03cf\u0003\u0002\u0002\u0002\u00be\u03d1\u0003\u0002\u0002\u0002\u00c0\u03d3\u0003\u0002\u0002\u0002\u00c2\u03d5\u0003\u0002\u0002\u0002\u00c4\u03d7\u0003\u0002\u0002\u0002\u00c6\u03d9\u0003\u0002\u0002\u0002\u00c8\u03e1\u0003\u0002\u0002\u0002\u00ca\u03e6\u0003\u0002\u0002\u0002\u00cc\u00ce\u0005\u0004\u0003\u0002\u00cd\u00cc\u0003\u0002\u0002\u0002\u00ce\u00cf\u0003\u0002\u0002\u0002\u00cf\u00cd\u0003\u0002\u0002\u0002\u00cf\u00d0\u0003\u0002\u0002\u0002\u00d0\u00d1\u0003\u0002\u0002\u0002\u00d1\u00d2\u0007\u0002\u0002\u0003\u00d2\u0003\u0003\u0002\u0002\u0002\u00d3\u00d7\u0005\u0012\u000a\u0002\u00d4\u00d7\u0005\u0048\u0025\u0002\u00d5\u00d7\u0005\u00c6\u0064\u0002\u00d6\u00d3\u0003\u0002\u0002\u0002\u00d6\u00d4\u0003\u0002\u0002\u0002\u00d6\u00d5\u0003\u0002\u0002\u0002\u00d7\u00d8\u0003\u0002\u0002\u0002\u00d8\u00d9\u0007\u0003\u0002\u0002\u00d9\u0005\u0003\u0002\u0002\u0002\u00da\u00db\u0007\u0042\u0002\u0002\u00db\u0007\u0003\u0002\u0002\u0002\u00dc\u00dd\u0007\u0043\u0002\u0002\u00dd\u0009\u0003\u0002\u0002\u0002\u00de\u00df\u0007\u0044\u0002\u0002\u00df\u000b\u0003\u0002\u0002\u0002\u00e0\u00e1\u0007\u0045\u0002\u0002\u00e1\u000d\u0003\u0002\u0002\u0002\u00e2\u00e3\u0007\u0046\u0002\u0002\u00e3\u000f\u0003\u0002\u0002\u0002\u00e4\u00e5\u0007\u0047\u0002\u0002\u00e5\u0011\u0003\u0002\u0002\u0002\u00e6\u00e7\u0007\u0004\u0002\u0002\u00e7\u00e8\u0005\u0006\u0004\u0002\u00e8\u00e9\u0005\u0046\u0024\u0002\u00e9\u00f7\u0003\u0002\u0002\u0002\u00ea\u00eb\u0007\u0004\u0002\u0002\u00eb\u00ec\u0005\u0006\u0004\u0002\u00ec\u00ed\u0005\u0018\u000d\u0002\u00ed\u00f7\u0003\u0002\u0002\u0002\u00ee\u00ef\u0007\u0004\u0002\u0002\u00ef\u00f0\u0005\u0006\u0004\u0002\u00f0\u00f1\u0007\u0005\u0002\u0002\u00f1\u00f2\u0005\u0018\u000d\u0002\u00f2\u00f3\u0007\u0006\u0002\u0002\u00f3\u00f7\u0003\u0002\u0002\u0002\u00f4\u00f5\u0007\u0048\u0002\u0002\u00f5\u00f7\u0005\u0014\u000b\u0002\u00f6\u00e6\u0003\u0002\u0002\u0002\u00f6\u00ea\u0003\u0002\u0002\u0002\u00f6\u00ee\u0003\u0002\u0002\u0002\u00f6\u00f4\u0003\u0002\u0002\u0002\u00f7\u0013\u0003\u0002\u0002\u0002\u00f8\u00f9\u0005\u0016\u000c\u0002\u00f9\u00fa\u0005\u0020\u0011\u0002\u00fa\u0101\u0003\u0002\u0002\u0002\u00fb\u00fc\u0007\u0005\u0002\u0002\u00fc\u00fd\u0005\u0016\u000c\u0002\u00fd\u00fe\u0005\u0020\u0011\u0002\u00fe\u00ff\u0007\u0006\u0002\u0002\u00ff\u0101\u0003\u0002\u0002\u0002\u0100\u00f8\u0003\u0002\u0002\u0002\u0100\u00fb\u0003\u0002\u0002\u0002\u0101\u0015\u0003\u0002\u0002\u0002\u0102\u0114\u0005\u0006\u0004\u0002\u0103\u0104\u0005\u0006\u0004\u0002\u0104\u0105\u0007\u0007\u0002\u0002\u0105\u0106\u0005\u0006\u0004\u0002\u0106\u0114\u0003\u0002\u0002\u0002\u0107\u0108\u0005\u0006\u0004\u0002\u0108\u0109\u0007\u0008\u0002\u0002\u0109\u010a\u0005\u000c\u0007\u0002\u010a\u010b\u0007\u0009\u0002\u0002\u010b\u0114\u0003\u0002\u0002\u0002\u010c\u010d\u0005\u0006\u0004\u0002\u010d\u010e\u0007\u0007\u0002\u0002\u010e\u010f\u0005\u0006\u0004\u0002\u010f\u0110\u0007\u0008\u0002\u0002\u0110\u0111\u0005\u000c\u0007\u0002\u0111\u0112\u0007\u0009\u0002\u0002\u0112\u0114\u0003\u0002\u0002\u0002\u0113\u0102\u0003\u0002\u0002\u0002\u0113\u0103\u0003\u0002\u0002\u0002\u0113\u0107\u0003\u0002\u0002\u0002\u0113\u010c\u0003\u0002\u0002\u0002\u0114\u0017\u0003\u0002\u0002\u0002\u0115\u0116\u0005\u0052\u002a\u0002\u0116\u0117\u0007\u000a\u0002\u0002\u0117\u0118\u0005\u001a\u000e\u0002\u0118\u011e\u0003\u0002\u0002\u0002\u0119\u011a\u0005\u0052\u002a\u0002\u011a\u011b\u0007\u0009\u0002\u0002\u011b\u011c\u0005\u002a\u0016\u0002\u011c\u011e\u0003\u0002\u0002\u0002\u011d\u0115\u0003\u0002\u0002\u0002\u011d\u0119\u0003\u0002\u0002\u0002\u011e\u0019\u0003\u0002\u0002\u0002\u011f\u0120\u0007\u000b\u0002\u0002\u0120\u0121\u0005\u001c\u000f\u0002\u0121\u0122\u0007\u000c\u0002\u0002\u0122\u001b\u0003\u0002\u0002\u0002\u0123\u0131\u0005\u001e\u0010\u0002\u0124\u0125\u0005\u001e\u0010\u0002\u0125\u0126\u0007\u000a\u0002\u0002\u0126\u0127\u0005\u001c\u000f\u0002\u0127\u0131\u0003\u0002\u0002\u0002\u0128\u0129\u0005\u0052\u002a\u0002\u0129\u012a\u0007\u000a\u0002\u0002\u012a\u012b\u0005\u001c\u000f\u0002\u012b\u0131\u0003\u0002\u0002\u0002\u012c\u012d\u0005\u001e\u0010\u0002\u012d\u012e\u0007\u000a\u0002\u0002\u012e\u012f\u0005\u00b6\u005c\u0002\u012f\u0131\u0003\u0002\u0002\u0002\u0130\u0123\u0003\u0002\u0002\u0002\u0130\u0124\u0003\u0002\u0002\u0002\u0130\u0128\u0003\u0002\u0002\u0002\u0130\u012c\u0003\u0002\u0002\u0002\u0131\u001d\u0003\u0002\u0002\u0002\u0132\u0133\u0005\u0052\u002a\u0002\u0133\u0134\u0007\u0009\u0002\u0002\u0134\u0135\u0005\u002a\u0016\u0002\u0135\u001f\u0003\u0002\u0002\u0002\u0136\u013b\u0005\u0022\u0012\u0002\u0137\u0138\u0007\u000d\u0002\u0002\u0138\u013a\u0005\u0022\u0012\u0002\u0139\u0137\u0003\u0002\u0002\u0002\u013a\u013d\u0003\u0002\u0002\u0002\u013b\u0139\u0003\u0002\u0002\u0002\u013b\u013c\u0003\u0002\u0002\u0002\u013c\u0021\u0003\u0002\u0002\u0002\u013d\u013b\u0003\u0002\u0002\u0002\u013e\u0141\u0005\u003a\u001e\u0002\u013f\u0140\u0007\u000e\u0002\u0002\u0140\u0142\u0005\u0024\u0013\u0002\u0141\u013f\u0003\u0002\u0002\u0002\u0141\u0142\u0003\u0002\u0002\u0002\u0142\u0023\u0003\u0002\u0002\u0002\u0143\u0148\u0005\u0026\u0014\u0002\u0144\u0145\u0007\u000a\u0002\u0002\u0145\u0147\u0005\u0026\u0014\u0002\u0146\u0144\u0003\u0002\u0002\u0002\u0147\u014a\u0003\u0002\u0002\u0002\u0148\u0146\u0003\u0002\u0002\u0002\u0148\u0149\u0003\u0002\u0002\u0002\u0149\u0025\u0003\u0002\u0002\u0002\u014a\u0148\u0003\u0002\u0002\u0002\u014b\u014c\u0005\u0006\u0004\u0002\u014c\u014d\u0007\u0005\u0002\u0002\u014d\u014e\u0005\u0028\u0015\u0002\u014e\u014f\u0007\u0006\u0002\u0002\u014f\u0155\u0003\u0002\u0002\u0002\u0150\u0151\u0005\u0008\u0005\u0002\u0151\u0152\u0007\u0009\u0002\u0002\u0152\u0153\u0005\u002a\u0016\u0002\u0153\u0155\u0003\u0002\u0002\u0002\u0154\u014b\u0003\u0002\u0002\u0002\u0154\u0150\u0003\u0002\u0002\u0002\u0155\u0027\u0003\u0002\u0002\u0002\u0156\u015b\u0005\u002a\u0016\u0002\u0157\u0158\u0007\u000a\u0002\u0002\u0158\u015a\u0005\u002a\u0016\u0002\u0159\u0157\u0003\u0002\u0002\u0002\u015a\u015d\u0003\u0002\u0002\u0002\u015b\u0159\u0003\u0002\u0002\u0002\u015b\u015c\u0003\u0002\u0002\u0002\u015c\u0029\u0003\u0002\u0002\u0002\u015d\u015b\u0003\u0002\u0002\u0002\u015e\u015f\u0005\u0008\u0005\u0002\u015f\u0160\u0007\u0009\u0002\u0002\u0160\u0162\u0003\u0002\u0002\u0002\u0161\u015e\u0003\u0002\u0002\u0002\u0161\u0162\u0003\u0002\u0002\u0002\u0162\u0163\u0003\u0002\u0002\u0002\u0163\u0164\u0005\u002c\u0017\u0002\u0164\u002b\u0003\u0002\u0002\u0002\u0165\u0168\u0005\u002e\u0018\u0002\u0166\u0167\u0007\u000f\u0002\u0002\u0167\u0169\u0005\u002c\u0017\u0002\u0168\u0166\u0003\u0002\u0002\u0002\u0168\u0169\u0003\u0002\u0002\u0002\u0169\u002d\u0003\u0002\u0002\u0002\u016a\u016d\u0005\u0030\u0019\u0002\u016b\u016c\u0007\u0010\u0002\u0002\u016c\u016e\u0005\u0030\u0019\u0002\u016d\u016b\u0003\u0002\u0002\u0002\u016d\u016e\u0003\u0002\u0002\u0002\u016e\u002f\u0003\u0002\u0002\u0002\u016f\u0170\u0008\u0019\u0001\u0002\u0170\u0171\u0005\u0032\u001a\u0002\u0171\u0178\u0003\u0002\u0002\u0002\u0172\u0173\u000c\u0004\u0002\u0002\u0173\u0174\u0005\u00c0\u0061\u0002\u0174\u0175\u0005\u0032\u001a\u0002\u0175\u0177\u0003\u0002\u0002\u0002\u0176\u0172\u0003\u0002\u0002\u0002\u0177\u017a\u0003\u0002\u0002\u0002\u0178\u0176\u0003\u0002\u0002\u0002\u0178\u0179\u0003\u0002\u0002\u0002\u0179\u0031\u0003\u0002\u0002\u0002\u017a\u0178\u0003\u0002\u0002\u0002\u017b\u017c\u0008\u001a\u0001\u0002\u017c\u017d\u0005\u0034\u001b\u0002\u017d\u0184\u0003\u0002\u0002\u0002\u017e\u017f\u000c\u0004\u0002\u0002\u017f\u0180\u0005\u00be\u0060\u0002\u0180\u0181\u0005\u0034\u001b\u0002\u0181\u0183\u0003\u0002\u0002\u0002\u0182\u017e\u0003\u0002\u0002\u0002\u0183\u0186\u0003\u0002\u0002\u0002\u0184\u0182\u0003\u0002\u0002\u0002\u0184\u0185\u0003\u0002\u0002\u0002\u0185\u0033\u0003\u0002\u0002\u0002\u0186\u0184\u0003\u0002\u0002\u0002\u0187\u0189\u0005\u00bc\u005f\u0002\u0188\u0187\u0003\u0002\u0002\u0002\u0188\u0189\u0003\u0002\u0002\u0002\u0189\u018a\u0003\u0002\u0002\u0002\u018a\u018b\u0005\u0036\u001c\u0002\u018b\u0035\u0003\u0002\u0002\u0002\u018c\u018d\u0007\u0005\u0002\u0002\u018d\u018e\u0005\u002a\u0016\u0002\u018e\u018f\u0007\u0006\u0002\u0002\u018f\u01d0\u0003\u0002\u0002\u0002\u0190\u01d0\u0005\u0008\u0005\u0002\u0191\u01d0\u0005\u0006\u0004\u0002\u0192\u0193\u0005\u0006\u0004\u0002\u0193\u0194\u0007\u0005\u0002\u0002\u0194\u0195\u0007\u0006\u0002\u0002\u0195\u01d0\u0003\u0002\u0002\u0002\u0196\u0197\u0005\u0006\u0004\u0002\u0197\u0198\u0007\u0005\u0002\u0002\u0198\u0199\u0005\u0028\u0015\u0002\u0199\u019a\u0007\u0006\u0002\u0002\u019a\u01d0\u0003\u0002\u0002\u0002\u019b\u019c\u0005\u0006\u0004\u0002\u019c\u019d\u0007\u0007\u0002\u0002\u019d\u019e\u0005\u0006\u0004\u0002\u019e\u019f\u0007\u0005\u0002\u0002\u019f\u01a0\u0007\u0006\u0002\u0002\u01a0\u01d0\u0003\u0002\u0002\u0002\u01a1\u01a2\u0005\u0006\u0004\u0002\u01a2\u01a3\u0007\u0007\u0002\u0002\u01a3\u01a4\u0005\u0006\u0004\u0002\u01a4\u01a5\u0007\u0005\u0002\u0002\u01a5\u01a6\u0005\u0028\u0015\u0002\u01a6\u01a7\u0007\u0006\u0002\u0002\u01a7\u01d0\u0003\u0002\u0002\u0002\u01a8\u01a9\u0007\u0011\u0002\u0002\u01a9\u01d0\u0007\u0012\u0002\u0002\u01aa\u01ab\u0007\u0011\u0002\u0002\u01ab\u01ac\u0005\u002a\u0016\u0002\u01ac\u01ad\u0007\u0012\u0002\u0002\u01ad\u01d0\u0003\u0002\u0002\u0002\u01ae\u01af\u0007\u0011\u0002\u0002\u01af\u01b0\u0005\u002a\u0016\u0002\u01b0\u01b1\u0007\u000a\u0002\u0002\u01b1\u01b2\u0007\u0013\u0002\u0002\u01b2\u01b3\u0007\u0012\u0002\u0002\u01b3\u01d0\u0003\u0002\u0002\u0002\u01b4\u01b5\u0007\u000b\u0002\u0002\u01b5\u01d0\u0007\u000c\u0002\u0002\u01b6\u01b7\u0007\u000b\u0002\u0002\u01b7\u01b8\u0005\u0028\u0015\u0002\u01b8\u01b9\u0007\u000c\u0002\u0002\u01b9\u01d0\u0003\u0002\u0002\u0002\u01ba\u01bb\u0007\u0014\u0002\u0002\u01bb\u01bc\u0005\u0006\u0004\u0002\u01bc\u01bd\u0007\u000b\u0002\u0002\u01bd\u01be\u0007\u000c\u0002\u0002\u01be\u01d0\u0003\u0002\u0002\u0002\u01bf\u01c0\u0007\u0014\u0002\u0002\u01c0\u01c1\u0005\u0006\u0004\u0002\u01c1\u01c2\u0007\u000b\u0002\u0002\u01c2\u01c3\u0005\u003c\u001f\u0002\u01c3\u01c4\u0007\u000c\u0002\u0002\u01c4\u01d0\u0003\u0002\u0002\u0002\u01c5\u01d0\u0005\u0040\u0021\u0002\u01c6\u01d0\u0005\u000c\u0007\u0002\u01c7\u01c8\u0007\u0015\u0002\u0002\u01c8\u01c9\u0007\u0005\u0002\u0002\u01c9\u01d0\u0007\u0006\u0002\u0002\u01ca\u01cb\u0007\u0015\u0002\u0002\u01cb\u01cc\u0007\u0005\u0002\u0002\u01cc\u01cd\u0005\u0038\u001d\u0002\u01cd\u01ce\u0007\u0006\u0002\u0002\u01ce\u01d0\u0003\u0002\u0002\u0002\u01cf\u018c\u0003\u0002\u0002\u0002\u01cf\u0190\u0003\u0002\u0002\u0002\u01cf\u0191\u0003\u0002\u0002\u0002\u01cf\u0192\u0003\u0002\u0002\u0002\u01cf\u0196\u0003\u0002\u0002\u0002\u01cf\u019b\u0003\u0002\u0002\u0002\u01cf\u01a1\u0003\u0002\u0002\u0002\u01cf\u01a8\u0003\u0002\u0002\u0002\u01cf\u01aa\u0003\u0002\u0002\u0002\u01cf\u01ae\u0003\u0002\u0002\u0002\u01cf\u01b4\u0003\u0002\u0002\u0002\u01cf\u01b6\u0003\u0002\u0002\u0002\u01cf\u01ba\u0003\u0002\u0002\u0002\u01cf\u01bf\u0003\u0002\u0002\u0002\u01cf\u01c5\u0003\u0002\u0002\u0002\u01cf\u01c6\u0003\u0002\u0002\u0002\u01cf\u01c7\u0003\u0002\u0002\u0002\u01cf\u01ca\u0003\u0002\u0002\u0002\u01d0\u0037\u0003\u0002\u0002\u0002\u01d1\u01d2\u0007\u0005\u0002\u0002\u01d2\u01d3\u0007\u0013\u0002\u0002\u01d3\u01d4\u0007\u0006\u0002\u0002\u01d4\u01d5\u0007\u0016\u0002\u0002\u01d5\u01d8\u0005\u002a\u0016\u0002\u01d6\u01d8\u0005\u003a\u001e\u0002\u01d7\u01d1\u0003\u0002\u0002\u0002\u01d7\u01d6\u0003\u0002\u0002\u0002\u01d8\u0039\u0003\u0002\u0002\u0002\u01d9\u01db\u0007\u0005\u0002\u0002\u01da\u01dc\u0005\u0028\u0015\u0002\u01db\u01da\u0003\u0002\u0002\u0002\u01db\u01dc\u0003\u0002\u0002\u0002\u01dc\u01dd\u0003\u0002\u0002\u0002\u01dd\u01de\u0007\u0006\u0002\u0002\u01de\u01df\u0007\u0016\u0002\u0002\u01df\u01e0\u0005\u002a\u0016\u0002\u01e0\u003b\u0003\u0002\u0002\u0002\u01e1\u01e6\u0005\u003e\u0020\u0002\u01e2\u01e3\u0007\u000a\u0002\u0002\u01e3\u01e5\u0005\u003e\u0020\u0002\u01e4\u01e2\u0003\u0002\u0002\u0002\u01e5\u01e8\u0003\u0002\u0002\u0002\u01e6\u01e4\u0003\u0002\u0002\u0002\u01e6\u01e7\u0003\u0002\u0002\u0002\u01e7\u003d\u0003\u0002\u0002\u0002\u01e8\u01e6\u0003\u0002\u0002\u0002\u01e9\u01ea\u0005\u0006\u0004\u0002\u01ea\u01eb\u0007\u0009\u0002\u0002\u01eb\u01ec\u0005\u002a\u0016\u0002\u01ec\u003f\u0003\u0002\u0002\u0002\u01ed\u01ee\u0007\u0017\u0002\u0002\u01ee\u01fe\u0007\u0018\u0002\u0002\u01ef\u01f0\u0007\u0017\u0002\u0002\u01f0\u01f1\u0005\u0042\u0022\u0002\u01f1\u01f2\u0007\u0018\u0002\u0002\u01f2\u01fe\u0003\u0002\u0002\u0002\u01f3\u01f4\u0007\u0017\u0002\u0002\u01f4\u01f5\u0005\u0044\u0023\u0002\u01f5\u01f6\u0007\u0018\u0002\u0002\u01f6\u01fe\u0003\u0002\u0002\u0002\u01f7\u01f8\u0007\u0017\u0002\u0002\u01f8\u01f9\u0005\u0042\u0022\u0002\u01f9\u01fa\u0007\u000a\u0002\u0002\u01fa\u01fb\u0005\u0044\u0023\u0002\u01fb\u01fc\u0007\u0018\u0002\u0002\u01fc\u01fe\u0003\u0002\u0002\u0002\u01fd\u01ed\u0003\u0002\u0002\u0002\u01fd\u01ef\u0003\u0002\u0002\u0002\u01fd\u01f3\u0003\u0002\u0002\u0002\u01fd\u01f7\u0003\u0002\u0002\u0002\u01fe\u0041\u0003\u0002\u0002\u0002\u01ff\u0200\u0005\u0008\u0005\u0002\u0200\u0201\u0007\u0007\u0002\u0002\u0201\u0202\u0005\u0036\u001c\u0002\u0202\u0043\u0003\u0002\u0002\u0002\u0203\u0204\u0005\u0008\u0005\u0002\u0204\u0205\u0007\u0007\u0002\u0002\u0205\u0206\u0005\u0008\u0005\u0002\u0206\u0207\u0007\u0019\u0002\u0002\u0207\u0208\u0005\u0036\u001c\u0002\u0208\u0045\u0003\u0002\u0002\u0002\u0209\u0219\u0005\u0052\u002a\u0002\u020a\u020b\u0007\u0005\u0002\u0002\u020b\u020c\u0005\u0052\u002a\u0002\u020c\u020d\u0007\u0006\u0002\u0002\u020d\u0219\u0003\u0002\u0002\u0002\u020e\u020f\u0005\u0052\u002a\u0002\u020f\u0210\u0007\u000a\u0002\u0002\u0210\u0211\u0005\u00b6\u005c\u0002\u0211\u0219\u0003\u0002\u0002\u0002\u0212\u0213\u0007\u0005\u0002\u0002\u0213\u0214\u0005\u0052\u002a\u0002\u0214\u0215\u0007\u000a\u0002\u0002\u0215\u0216\u0005\u00b6\u005c\u0002\u0216\u0217\u0007\u0006\u0002\u0002\u0217\u0219\u0003\u0002\u0002\u0002\u0218\u0209\u0003\u0002\u0002\u0002\u0218\u020a\u0003\u0002\u0002\u0002\u0218\u020e\u0003\u0002\u0002\u0002\u0218\u0212\u0003\u0002\u0002\u0002\u0219\u0047\u0003\u0002\u0002\u0002\u021a\u021f\u0005\u004a\u0026\u0002\u021b\u021c\u0007\u000d\u0002\u0002\u021c\u021e\u0005\u004a\u0026\u0002\u021d\u021b\u0003\u0002\u0002\u0002\u021e\u0221\u0003\u0002\u0002\u0002\u021f\u021d\u0003\u0002\u0002\u0002\u021f\u0220\u0003\u0002\u0002\u0002\u0220\u0049\u0003\u0002\u0002\u0002\u0221\u021f\u0003\u0002\u0002\u0002\u0222\u0223\u0005\u0006\u0004\u0002\u0223\u0224\u0005\u004c\u0027\u0002\u0224\u0225\u0005\u004e\u0028\u0002\u0225\u0226\u0005\u0050\u0029\u0002\u0226\u004b\u0003\u0002\u0002\u0002\u0227\u0228\u0005\u00b4\u005b\u0002\u0228\u004d\u0003\u0002\u0002\u0002\u0229\u022a\u0007\u000e\u0002\u0002\u022a\u022c\u0005\u00b8\u005d\u0002\u022b\u0229\u0003\u0002\u0002\u0002\u022b\u022c\u0003\u0002\u0002\u0002\u022c\u004f\u0003\u0002\u0002\u0002\u022d\u022e\u0007\u0016\u0002\u0002\u022e\u022f\u0005\u00b6\u005c\u0002\u022f\u0051\u0003\u0002\u0002\u0002\u0230\u0231\u0007\u001a\u0002\u0002\u0231\u0234\u0005\u0052\u002a\u0002\u0232\u0234\u0005\u0054\u002b\u0002\u0233\u0230\u0003\u0002\u0002\u0002\u0233\u0232\u0003\u0002\u0002\u0002\u0234\u0053\u0003\u0002\u0002\u0002\u0235\u023a\u0005\u0056\u002c\u0002\u0236\u0237\u0009\u0002\u0002\u0002\u0237\u0239\u0005\u0056\u002c\u0002\u0238\u0236\u0003\u0002\u0002\u0002\u0239\u023c\u0003\u0002\u0002\u0002\u023a\u0238\u0003\u0002\u0002\u0002\u023a\u023b\u0003\u0002\u0002\u0002\u023b\u0055\u0003\u0002\u0002\u0002\u023c\u023a\u0003\u0002\u0002\u0002\u023d\u0242\u0005\u0058\u002d\u0002\u023e\u023f\u0007\u001d\u0002\u0002\u023f\u0241\u0005\u0058\u002d\u0002\u0240\u023e\u0003\u0002\u0002\u0002\u0241\u0244\u0003\u0002\u0002\u0002\u0242\u0240\u0003\u0002\u0002\u0002\u0242\u0243\u0003\u0002\u0002\u0002\u0243\u0057\u0003\u0002\u0002\u0002\u0244\u0242\u0003\u0002\u0002\u0002\u0245\u024a\u0005\u005a\u002e\u0002\u0246\u0247\u0007\u001e\u0002\u0002\u0247\u0249\u0005\u005a\u002e\u0002\u0248\u0246\u0003\u0002\u0002\u0002\u0249\u024c\u0003\u0002\u0002\u0002\u024a\u0248\u0003\u0002\u0002\u0002\u024a\u024b\u0003\u0002\u0002\u0002\u024b\u0059\u0003\u0002\u0002\u0002\u024c\u024a\u0003\u0002\u0002\u0002\u024d\u0251\u0005\u005c\u002f\u0002\u024e\u024f\u0005\u00c4\u0063\u0002\u024f\u0250\u0005\u005c\u002f\u0002\u0250\u0252\u0003\u0002\u0002\u0002\u0251\u024e\u0003\u0002\u0002\u0002\u0251\u0252\u0003\u0002\u0002\u0002\u0252\u005b\u0003\u0002\u0002\u0002\u0253\u0259\u0005\u005e\u0030\u0002\u0254\u0255\u0005\u00c2\u0062\u0002\u0255\u0256\u0005\u005e\u0030\u0002\u0256\u0258\u0003\u0002\u0002\u0002\u0257\u0254\u0003\u0002\u0002\u0002\u0258\u025b\u0003\u0002\u0002\u0002\u0259\u0257\u0003\u0002\u0002\u0002\u0259\u025a\u0003\u0002\u0002\u0002\u025a\u005d\u0003\u0002\u0002\u0002\u025b\u0259\u0003\u0002\u0002\u0002\u025c\u0262\u0005\u0060\u0031\u0002\u025d\u025e\u0005\u00c0\u0061\u0002\u025e\u025f\u0005\u0060\u0031\u0002\u025f\u0261\u0003\u0002\u0002\u0002\u0260\u025d\u0003\u0002\u0002\u0002\u0261\u0264\u0003\u0002\u0002\u0002\u0262\u0260\u0003\u0002\u0002\u0002\u0262\u0263\u0003\u0002\u0002\u0002\u0263\u005f\u0003\u0002\u0002\u0002\u0264\u0262\u0003\u0002\u0002\u0002\u0265\u026b\u0005\u0062\u0032\u0002\u0266\u0267\u0005\u00be\u0060\u0002\u0267\u0268\u0005\u0062\u0032\u0002\u0268\u026a\u0003\u0002\u0002\u0002\u0269\u0266\u0003\u0002\u0002\u0002\u026a\u026d\u0003\u0002\u0002\u0002\u026b\u0269\u0003\u0002\u0002\u0002\u026b\u026c\u0003\u0002\u0002\u0002\u026c\u0061\u0003\u0002\u0002\u0002\u026d\u026b\u0003\u0002\u0002\u0002\u026e\u0270\u0005\u00bc\u005f\u0002\u026f\u026e\u0003\u0002\u0002\u0002\u026f\u0270\u0003\u0002\u0002\u0002\u0270\u0271\u0003\u0002\u0002\u0002\u0271\u0272\u0005\u0064\u0033\u0002\u0272\u0063\u0003\u0002\u0002\u0002\u0273\u0277\u0005\u0092\u004a\u0002\u0274\u0277\u0005\u008a\u0046\u0002\u0275\u0277\u0005\u0066\u0034\u0002\u0276\u0273\u0003\u0002\u0002\u0002\u0276\u0274\u0003\u0002\u0002\u0002\u0276\u0275\u0003\u0002\u0002\u0002\u0277\u0065\u0003\u0002\u0002\u0002\u0278\u027b\u0005\u0068\u0035\u0002\u0279\u027a\u0007\u0007\u0002\u0002\u027a\u027c\u0005\u0068\u0035\u0002\u027b\u0279\u0003\u0002\u0002\u0002\u027b\u027c\u0003\u0002\u0002\u0002\u027c\u0067\u0003\u0002\u0002\u0002\u027d\u0292\u0005\u0008\u0005\u0002\u027e\u0292\u0005\u00ba\u005e\u0002\u027f\u0292\u0005\u006a\u0036\u0002\u0280\u0292\u0005\u006e\u0038\u0002\u0281\u0292\u0005\u0080\u0041\u0002\u0282\u0292\u0005\u0082\u0042\u0002\u0283\u0292\u0005\u0088\u0045\u0002\u0284\u0285\u0007\u0005\u0002\u0002\u0285\u0286\u0005\u0052\u002a\u0002\u0286\u0287\u0007\u0006\u0002\u0002\u0287\u0292\u0003\u0002\u0002\u0002\u0288\u0289\u0007\u001f\u0002\u0002\u0289\u028a\u0005\u00b6\u005c\u0002\u028a\u028b\u0007\u0020\u0002\u0002\u028b\u0292\u0003\u0002\u0002\u0002\u028c\u0292\u0005\u0094\u004b\u0002\u028d\u0292\u0005\u009a\u004e\u0002\u028e\u0292\u0005\u00a0\u0051\u0002\u028f\u0292\u0005\u00a2\u0052\u0002\u0290\u0292\u0005\u00ac\u0057\u0002\u0291\u027d\u0003\u0002\u0002\u0002\u0291\u027e\u0003\u0002\u0002\u0002\u0291\u027f\u0003\u0002\u0002\u0002\u0291\u0280\u0003\u0002\u0002\u0002\u0291\u0281\u0003\u0002\u0002\u0002\u0291\u0282\u0003\u0002\u0002\u0002\u0291\u0283\u0003\u0002\u0002\u0002\u0291\u0284\u0003\u0002\u0002\u0002\u0291\u0288\u0003\u0002\u0002\u0002\u0291\u028c\u0003\u0002\u0002\u0002\u0291\u028d\u0003\u0002\u0002\u0002\u0291\u028e\u0003\u0002\u0002\u0002\u0291\u028f\u0003\u0002\u0002\u0002\u0291\u0290\u0003\u0002\u0002\u0002\u0292\u0069\u0003\u0002\u0002\u0002\u0293\u0294\u0007\u0011\u0002\u0002\u0294\u029a\u0007\u0012\u0002\u0002\u0295\u0296\u0007\u0011\u0002\u0002\u0296\u0297\u0005\u0052\u002a\u0002\u0297\u0298\u0005\u006c\u0037\u0002\u0298\u029a\u0003\u0002\u0002\u0002\u0299\u0293\u0003\u0002\u0002\u0002\u0299\u0295\u0003\u0002\u0002\u0002\u029a\u006b\u0003\u0002\u0002\u0002\u029b\u02a5\u0007\u0012\u0002\u0002\u029c\u029d\u0007\u000f\u0002\u0002\u029d\u029e\u0005\u0052\u002a\u0002\u029e\u029f\u0007\u0012\u0002\u0002\u029f\u02a5\u0003\u0002\u0002\u0002\u02a0\u02a1\u0007\u000a\u0002\u0002\u02a1\u02a2\u0005\u0052\u002a\u0002\u02a2\u02a3\u0005\u006c\u0037\u0002\u02a3\u02a5\u0003\u0002\u0002\u0002\u02a4\u029b\u0003\u0002\u0002\u0002\u02a4\u029c\u0003\u0002\u0002\u0002\u02a4\u02a0\u0003\u0002\u0002\u0002\u02a5\u006d\u0003\u0002\u0002\u0002\u02a6\u02a7\u0007\u0017\u0002\u0002\u02a7\u02ad\u0007\u0018\u0002\u0002\u02a8\u02a9\u0007\u0017\u0002\u0002\u02a9\u02aa\u0005\u0070\u0039\u0002\u02aa\u02ab\u0007\u0018\u0002\u0002\u02ab\u02ad\u0003\u0002\u0002\u0002\u02ac\u02a6\u0003\u0002\u0002\u0002\u02ac\u02a8\u0003\u0002\u0002\u0002\u02ad\u006f\u0003\u0002\u0002\u0002\u02ae\u02b3\u0005\u0072\u003a\u0002\u02af\u02b0\u0007\u000a\u0002\u0002\u02b0\u02b2\u0005\u0072\u003a\u0002\u02b1\u02af\u0003\u0002\u0002\u0002\u02b2\u02b5\u0003\u0002\u0002\u0002\u02b3\u02b1\u0003\u0002\u0002\u0002\u02b3\u02b4\u0003\u0002\u0002\u0002\u02b4\u0071\u0003\u0002\u0002\u0002\u02b5\u02b3\u0003\u0002\u0002\u0002\u02b6\u02b7\u0005\u0074\u003b\u0002\u02b7\u02b8\u0005\u0076\u003c\u0002\u02b8\u02b9\u0005\u0078\u003d\u0002\u02b9\u0073\u0003\u0002\u0002\u0002\u02ba\u02bc\u0005\u00bc\u005f\u0002\u02bb\u02ba\u0003\u0002\u0002\u0002\u02bb\u02bc\u0003\u0002\u0002\u0002\u02bc\u02bd\u0003\u0002\u0002\u0002\u02bd\u02be\u0005\u0068\u0035\u0002\u02be\u0075\u0003\u0002\u0002\u0002\u02bf\u02c0\u0007\u0007\u0002\u0002\u02c0\u02c2\u0005\u007e\u0040\u0002\u02c1\u02bf\u0003\u0002\u0002\u0002\u02c1\u02c2\u0003\u0002\u0002\u0002\u02c2\u0077\u0003\u0002\u0002\u0002\u02c3\u02c4\u0007\u0008\u0002\u0002\u02c4\u02c6\u0005\u007a\u003e\u0002\u02c5\u02c3\u0003\u0002\u0002\u0002\u02c5\u02c6\u0003\u0002\u0002\u0002\u02c6\u0079\u0003\u0002\u0002\u0002\u02c7\u02cc\u0005\u007c\u003f\u0002\u02c8\u02c9\u0007\u0004\u0002\u0002\u02c9\u02cb\u0005\u007c\u003f\u0002\u02ca\u02c8\u0003\u0002\u0002\u0002\u02cb\u02ce\u0003\u0002\u0002\u0002\u02cc\u02ca\u0003\u0002\u0002\u0002\u02cc\u02cd\u0003\u0002\u0002\u0002\u02cd\u007b\u0003\u0002\u0002\u0002\u02ce\u02cc\u0003\u0002\u0002\u0002\u02cf\u02d2\u0005\u0006\u0004\u0002\u02d0\u02d1\u0007\u0007\u0002\u0002\u02d1\u02d3\u0005\u000c\u0007\u0002\u02d2\u02d0\u0003\u0002\u0002\u0002\u02d2\u02d3\u0003\u0002\u0002\u0002\u02d3\u007d\u0003\u0002\u0002\u0002\u02d4\u02d5\u0005\u0068\u0035\u0002\u02d5\u007f\u0003\u0002\u0002\u0002\u02d6\u02d7\u0007\u0011\u0002\u0002\u02d7\u02d8\u0005\u0052\u002a\u0002\u02d8\u02d9\u0007\u0021\u0002\u0002\u02d9\u02da\u0005\u0084\u0043\u0002\u02da\u02db\u0007\u0012\u0002\u0002\u02db\u0081\u0003\u0002\u0002\u0002\u02dc\u02dd\u0007\u0017\u0002\u0002\u02dd\u02de\u0005\u006e\u0038\u0002\u02de\u02df\u0007\u0021\u0002\u0002\u02df\u02e0\u0005\u0084\u0043\u0002\u02e0\u02e1\u0007\u0018\u0002\u0002\u02e1\u0083\u0003\u0002\u0002\u0002\u02e2\u02e7\u0005\u0086\u0044\u0002\u02e3\u02e4\u0007\u000a\u0002\u0002\u02e4\u02e6\u0005\u0086\u0044\u0002\u02e5\u02e3\u0003\u0002\u0002\u0002\u02e6\u02e9\u0003\u0002\u0002\u0002\u02e7\u02e5\u0003\u0002\u0002\u0002\u02e7\u02e8\u0003\u0002\u0002\u0002\u02e8\u0085\u0003\u0002\u0002\u0002\u02e9\u02e7\u0003\u0002\u0002\u0002\u02ea\u02f4\u0005\u0052\u002a\u0002\u02eb\u02ec\u0005\u0052\u002a\u0002\u02ec\u02ed\u0007\u0022\u0002\u0002\u02ed\u02ee\u0005\u0052\u002a\u0002\u02ee\u02f4\u0003\u0002\u0002\u0002\u02ef\u02f0\u0005\u006e\u0038\u0002\u02f0\u02f1\u0007\u0023\u0002\u0002\u02f1\u02f2\u0005\u0052\u002a\u0002\u02f2\u02f4\u0003\u0002\u0002\u0002\u02f3\u02ea\u0003\u0002\u0002\u0002\u02f3\u02eb\u0003\u0002\u0002\u0002\u02f3\u02ef\u0003\u0002\u0002\u0002\u02f4\u0087\u0003\u0002\u0002\u0002\u02f5\u02f7\u0007\u000b\u0002\u0002\u02f6\u02f8\u0005\u00b6\u005c\u0002\u02f7\u02f6\u0003\u0002\u0002\u0002\u02f7\u02f8\u0003\u0002\u0002\u0002\u02f8\u02f9\u0003\u0002\u0002\u0002\u02f9\u02fa\u0007\u000c\u0002\u0002\u02fa\u0089\u0003\u0002\u0002\u0002\u02fb\u02fd\u0008\u0046\u0001\u0002\u02fc\u02fe\u0005\u0068\u0035\u0002\u02fd\u02fc\u0003\u0002\u0002\u0002\u02fd\u02fe\u0003\u0002\u0002\u0002\u02fe\u02ff\u0003\u0002\u0002\u0002\u02ff\u0300\u0007\u0014\u0002\u0002\u0300\u0304\u0005\u0006\u0004\u0002\u0301\u0302\u0007\u0003\u0002\u0002\u0302\u0305\u0005\u0006\u0004\u0002\u0303\u0305\u0005\u008c\u0047\u0002\u0304\u0301\u0003\u0002\u0002\u0002\u0304\u0303\u0003\u0002\u0002\u0002\u0305\u0310\u0003\u0002\u0002\u0002\u0306\u0307\u000c\u0003\u0002\u0002\u0307\u0308\u0007\u0014\u0002\u0002\u0308\u030c\u0005\u0006\u0004\u0002\u0309\u030a\u0007\u0003\u0002\u0002\u030a\u030d\u0005\u0006\u0004\u0002\u030b\u030d\u0005\u008c\u0047\u0002\u030c\u0309\u0003\u0002\u0002\u0002\u030c\u030b\u0003\u0002\u0002\u0002\u030d\u030f\u0003\u0002\u0002\u0002\u030e\u0306\u0003\u0002\u0002\u0002\u030f\u0312\u0003\u0002\u0002\u0002\u0310\u030e\u0003\u0002\u0002\u0002\u0310\u0311\u0003\u0002\u0002\u0002\u0311\u008b\u0003\u0002\u0002\u0002\u0312\u0310\u0003\u0002\u0002\u0002\u0313\u0315\u0007\u000b\u0002\u0002\u0314\u0316\u0005\u008e\u0048\u0002\u0315\u0314\u0003\u0002\u0002\u0002\u0315\u0316\u0003\u0002\u0002\u0002\u0316\u0317\u0003\u0002\u0002\u0002\u0317\u0318\u0007\u000c\u0002\u0002\u0318\u008d\u0003\u0002\u0002\u0002\u0319\u031e\u0005\u0090\u0049\u0002\u031a\u031b\u0007\u000a\u0002\u0002\u031b\u031d\u0005\u0090\u0049\u0002\u031c\u031a\u0003\u0002\u0002\u0002\u031d\u0320\u0003\u0002\u0002\u0002\u031e\u031c\u0003\u0002\u0002\u0002\u031e\u031f\u0003\u0002\u0002\u0002\u031f\u008f\u0003\u0002\u0002\u0002\u0320\u031e\u0003\u0002\u0002\u0002\u0321\u0324\u0005\u0008\u0005\u0002\u0322\u0324\u0005\u0006\u0004\u0002\u0323\u0321\u0003\u0002\u0002\u0002\u0323\u0322\u0003\u0002\u0002\u0002\u0324\u0325\u0003\u0002\u0002\u0002\u0325\u0326\u0007\u001b\u0002\u0002\u0326\u0327\u0005\u0052\u002a\u0002\u0327\u0091\u0003\u0002\u0002\u0002\u0328\u0329\u0005\u0066\u0034\u0002\u0329\u032a\u0005\u00b4\u005b\u0002\u032a\u0093\u0003\u0002\u0002\u0002\u032b\u032c\u0007\u0024\u0002\u0002\u032c\u032d\u0005\u0096\u004c\u0002\u032d\u032e\u0007\u0020\u0002\u0002\u032e\u0095\u0003\u0002\u0002\u0002\u032f\u0334\u0005\u0098\u004d\u0002\u0330\u0331\u0007\u000d\u0002\u0002\u0331\u0333\u0005\u0098\u004d\u0002\u0332\u0330\u0003\u0002\u0002\u0002\u0333\u0336\u0003\u0002\u0002\u0002\u0334\u0332\u0003\u0002\u0002\u0002\u0334\u0335\u0003\u0002\u0002\u0002\u0335\u0097\u0003\u0002\u0002\u0002\u0336\u0334\u0003\u0002\u0002\u0002\u0337\u0338\u0005\u00b8\u005d\u0002\u0338\u0339\u0005\u0050\u0029\u0002\u0339\u0099\u0003\u0002\u0002\u0002\u033a\u033b\u0007\u0025\u0002\u0002\u033b\u033c\u0005\u0052\u002a\u0002\u033c\u033d\u0007\u0026\u0002\u0002\u033d\u033e\u0005\u009c\u004f\u0002\u033e\u033f\u0007\u0020\u0002\u0002\u033f\u009b\u0003\u0002\u0002\u0002\u0340\u0345\u0005\u009e\u0050\u0002\u0341\u0342\u0007\u000d\u0002\u0002\u0342\u0344\u0005\u009e\u0050\u0002\u0343\u0341\u0003\u0002\u0002\u0002\u0344\u0347\u0003\u0002\u0002\u0002\u0345\u0343\u0003\u0002\u0002\u0002\u0345\u0346\u0003\u0002\u0002\u0002\u0346\u009d\u0003\u0002\u0002\u0002\u0347\u0345\u0003\u0002\u0002\u0002\u0348\u0349\u0005\u0052\u002a\u0002\u0349\u034a\u0005\u004e\u0028\u0002\u034a\u034b\u0005\u0050\u0029\u0002\u034b\u009f\u0003\u0002\u0002\u0002\u034c\u034d\u0007\u0027\u0002\u0002\u034d\u034e\u0005\u009c\u004f\u0002\u034e\u034f\u0007\u0020\u0002\u0002\u034f\u035e\u0003\u0002\u0002\u0002\u0350\u0351\u0007\u0027\u0002\u0002\u0351\u0352\u0007\u0028\u0002\u0002\u0352\u0353\u0005\u0052\u002a\u0002\u0353\u0354\u0005\u0050\u0029\u0002\u0354\u0355\u0007\u0020\u0002\u0002\u0355\u035e\u0003\u0002\u0002\u0002\u0356\u0357\u0007\u0027\u0002\u0002\u0357\u0358\u0005\u009c\u004f\u0002\u0358\u0359\u0007\u0028\u0002\u0002\u0359\u035a\u0005\u0052\u002a\u0002\u035a\u035b\u0005\u0050\u0029\u0002\u035b\u035c\u0007\u0020\u0002\u0002\u035c\u035e\u0003\u0002\u0002\u0002\u035d\u034c\u0003\u0002\u0002\u0002\u035d\u0350\u0003\u0002\u0002\u0002\u035d\u0356\u0003\u0002\u0002\u0002\u035e\u00a1\u0003\u0002\u0002\u0002\u035f\u0360\u0007\u0015\u0002\u0002\u0360\u0361\u0005\u0006\u0004\u0002\u0361\u0362\u0007\u0008\u0002\u0002\u0362\u0363\u0005\u000c\u0007\u0002\u0363\u0370\u0003\u0002\u0002\u0002\u0364\u0365\u0007\u0015\u0002\u0002\u0365\u0366\u0005\u00a4\u0053\u0002\u0366\u0367\u0007\u0007\u0002\u0002\u0367\u0368\u0005\u00a4\u0053\u0002\u0368\u0369\u0007\u0008\u0002\u0002\u0369\u036a\u0005\u00a6\u0054\u0002\u036a\u0370\u0003\u0002\u0002\u0002\u036b\u036c\u0007\u0015\u0002\u0002\u036c\u036d\u0005\u00a8\u0055\u0002\u036d\u036e\u0007\u0020\u0002\u0002\u036e\u0370\u0003\u0002\u0002\u0002\u036f\u035f\u0003\u0002\u0002\u0002\u036f\u0364\u0003\u0002\u0002\u0002\u036f\u036b\u0003\u0002\u0002\u0002\u0370\u00a3\u0003\u0002\u0002\u0002\u0371\u0374\u0005\u0006\u0004\u0002\u0372\u0374\u0005\u0008\u0005\u0002\u0373\u0371\u0003\u0002\u0002\u0002\u0373\u0372\u0003\u0002\u0002\u0002\u0374\u00a5\u0003\u0002\u0002\u0002\u0375\u0378\u0005\u000c\u0007\u0002\u0376\u0378\u0005\u0008\u0005\u0002\u0377\u0375\u0003\u0002\u0002\u0002\u0377\u0376\u0003\u0002\u0002\u0002\u0378\u00a7\u0003\u0002\u0002\u0002\u0379\u037e\u0005\u00aa\u0056\u0002\u037a\u037b\u0007\u000d\u0002\u0002\u037b\u037d\u0005\u00aa\u0056\u0002\u037c\u037a\u0003\u0002\u0002\u0002\u037d\u0380\u0003\u0002\u0002\u0002\u037e\u037c\u0003\u0002\u0002\u0002\u037e\u037f\u0003\u0002\u0002\u0002\u037f\u00a9\u0003\u0002\u0002\u0002\u0380\u037e\u0003\u0002\u0002\u0002\u0381\u0382\u0005\u00b4\u005b\u0002\u0382\u0383\u0005\u004e\u0028\u0002\u0383\u0384\u0005\u0050\u0029\u0002\u0384\u00ab\u0003\u0002\u0002\u0002\u0385\u0386\u0007\u0029\u0002\u0002\u0386\u0389\u0005\u00b6\u005c\u0002\u0387\u0388\u0007\u0026\u0002\u0002\u0388\u038a\u0005\u009c\u004f\u0002\u0389\u0387\u0003\u0002\u0002\u0002\u0389\u038a\u0003\u0002\u0002\u0002\u038a\u038b\u0003\u0002\u0002\u0002\u038b\u038c\u0005\u00ae\u0058\u0002\u038c\u00ad\u0003\u0002\u0002\u0002\u038d\u038e\u0007\u001a\u0002\u0002\u038e\u038f\u0005\u00b0\u0059\u0002\u038f\u0390\u0007\u0020\u0002\u0002\u0390\u039c\u0003\u0002\u0002\u0002\u0391\u0392\u0007\u001a\u0002\u0002\u0392\u0393\u0005\u00b0\u0059\u0002\u0393\u0394\u0007\u0028\u0002\u0002\u0394\u0395\u0005\u00b6\u005c\u0002\u0395\u0396\u0007\u0020\u0002\u0002\u0396\u039c\u0003\u0002\u0002\u0002\u0397\u0398\u0007\u0028\u0002\u0002\u0398\u0399\u0005\u00b6\u005c\u0002\u0399\u039a\u0007\u0020\u0002\u0002\u039a\u039c\u0003\u0002\u0002\u0002\u039b\u038d\u0003\u0002\u0002\u0002\u039b\u0391\u0003\u0002\u0002\u0002\u039b\u0397\u0003\u0002\u0002\u0002\u039c\u00af\u0003\u0002\u0002\u0002\u039d\u03a2\u0005\u00b2\u005a\u0002\u039e\u039f\u0007\u000d\u0002\u0002\u039f\u03a1\u0005\u00b2\u005a\u0002\u03a0\u039e\u0003\u0002\u0002\u0002\u03a1\u03a4\u0003\u0002\u0002\u0002\u03a2\u03a0\u0003\u0002\u0002\u0002\u03a2\u03a3\u0003\u0002\u0002\u0002\u03a3\u00b1\u0003\u0002\u0002\u0002\u03a4\u03a2\u0003\u0002\u0002\u0002\u03a5\u03a6\u0005\u00a4\u0053\u0002\u03a6\u03a7\u0007\u0007\u0002\u0002\u03a7\u03a9\u0003\u0002\u0002\u0002\u03a8\u03a5\u0003\u0002\u0002\u0002\u03a8\u03a9\u0003\u0002\u0002\u0002\u03a9\u03aa\u0003\u0002\u0002\u0002\u03aa\u03ab\u0005\u0052\u002a\u0002\u03ab\u03ac\u0005\u004e\u0028\u0002\u03ac\u03ad\u0005\u0050\u0029\u0002\u03ad\u00b3\u0003\u0002\u0002\u0002\u03ae\u03b0\u0007\u0005\u0002\u0002\u03af\u03b1\u0005\u00b6\u005c\u0002\u03b0\u03af\u0003\u0002\u0002\u0002\u03b0\u03b1\u0003\u0002\u0002\u0002\u03b1\u03b2\u0003\u0002\u0002\u0002\u03b2\u03b3\u0007\u0006\u0002\u0002\u03b3\u00b5\u0003\u0002\u0002\u0002\u03b4\u03b9\u0005\u0052\u002a\u0002\u03b5\u03b6\u0007\u000a\u0002\u0002\u03b6\u03b8\u0005\u0052\u002a\u0002\u03b7\u03b5\u0003\u0002\u0002\u0002\u03b8\u03bb\u0003\u0002\u0002\u0002\u03b9\u03b7\u0003\u0002\u0002\u0002\u03b9\u03ba\u0003\u0002\u0002\u0002\u03ba\u00b7\u0003\u0002\u0002\u0002\u03bb\u03b9\u0003\u0002\u0002\u0002\u03bc\u03c1\u0005\u00b6\u005c\u0002\u03bd\u03be\u0007\u000d\u0002\u0002\u03be\u03c0\u0005\u00b6\u005c\u0002\u03bf\u03bd\u0003\u0002\u0002\u0002\u03c0\u03c3\u0003\u0002\u0002\u0002\u03c1\u03bf\u0003\u0002\u0002\u0002\u03c1\u03c2\u0003\u0002\u0002\u0002\u03c2\u00b9\u0003\u0002\u0002\u0002\u03c3\u03c1\u0003\u0002\u0002\u0002\u03c4\u03ce\u0005\u000e\u0008\u0002\u03c5\u03ce\u0005\u000c\u0007\u0002\u03c6\u03ce\u0005\u000a\u0006\u0002\u03c7\u03ce\u0005\u0006\u0004\u0002\u03c8\u03ca\u0005\u0010\u0009\u0002\u03c9\u03c8\u0003\u0002\u0002\u0002\u03ca\u03cb\u0003\u0002\u0002\u0002\u03cb\u03c9\u0003\u0002\u0002\u0002\u03cb\u03cc\u0003\u0002\u0002\u0002\u03cc\u03ce\u0003\u0002\u0002\u0002\u03cd\u03c4\u0003\u0002\u0002\u0002\u03cd\u03c5\u0003\u0002\u0002\u0002\u03cd\u03c6\u0003\u0002\u0002\u0002\u03cd\u03c7\u0003\u0002\u0002\u0002\u03cd\u03c9\u0003\u0002\u0002\u0002\u03ce\u00bb\u0003\u0002\u0002\u0002\u03cf\u03d0\u0009\u0003\u0002\u0002\u03d0\u00bd\u0003\u0002\u0002\u0002\u03d1\u03d2\u0009\u0004\u0002\u0002\u03d2\u00bf\u0003\u0002\u0002\u0002\u03d3\u03d4\u0009\u0005\u0002\u0002\u03d4\u00c1\u0003\u0002\u0002\u0002\u03d5\u03d6\u0009\u0006\u0002\u0002\u03d6\u00c3\u0003\u0002\u0002\u0002\u03d7\u03d8\u0009\u0007\u0002\u0002\u03d8\u00c5\u0003\u0002\u0002\u0002\u03d9\u03de\u0005\u00c8\u0065\u0002\u03da\u03db\u0007\u000d\u0002\u0002\u03db\u03dd\u0005\u00c8\u0065\u0002\u03dc\u03da\u0003\u0002\u0002\u0002\u03dd\u03e0\u0003\u0002\u0002\u0002\u03de\u03dc\u0003\u0002\u0002\u0002\u03de\u03df\u0003\u0002\u0002\u0002\u03df\u00c7\u0003\u0002\u0002\u0002\u03e0\u03de\u0003\u0002\u0002\u0002\u03e1\u03e2\u0005\u0006\u0004\u0002\u03e2\u03e3\u0005\u004c\u0027\u0002\u03e3\u03e4\u0005\u004e\u0028\u0002\u03e4\u03e5\u0005\u00ca\u0066\u0002\u03e5\u00c9\u0003\u0002\u0002\u0002\u03e6\u03e7\u0007\u0041\u0002\u0002\u03e7\u03e8\u0005\u0084\u0043\u0002\u03e8\u00cb\u0003\u0002\u0002\u0002\u004c\u00cf\u00d6\u00f6\u0100\u0113\u011d\u0130\u013b\u0141\u0148\u0154\u015b\u0161\u0168\u016d\u0178\u0184\u0188\u01cf\u01d7\u01db\u01e6\u01fd\u0218\u021f\u022b\u0233\u023a\u0242\u024a\u0251\u0259\u0262\u026b\u026f\u0276\u027b\u0291\u0299\u02a4\u02ac\u02b3\u02bb\u02c1\u02c5\u02cc\u02d2\u02e7\u02f3\u02f7\u02fd\u0304\u030c\u0310\u0315\u031e\u0323\u0334\u0345\u035d\u036f\u0373\u0377\u037e\u0389\u039b\u03a2\u03a8\u03b0\u03b9\u03c1\u03cb\u03cd\u03de"

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
    private val T__4 = Tokens.T__4.id
    private val T__5 = Tokens.T__5.id
    private val T__6 = Tokens.T__6.id
    private val T__7 = Tokens.T__7.id
    private val T__8 = Tokens.T__8.id
    private val T__9 = Tokens.T__9.id
    private val T__10 = Tokens.T__10.id
    private val T__11 = Tokens.T__11.id
    private val T__12 = Tokens.T__12.id
    private val T__13 = Tokens.T__13.id
    private val T__14 = Tokens.T__14.id
    private val T__15 = Tokens.T__15.id
    private val T__16 = Tokens.T__16.id
    private val T__17 = Tokens.T__17.id
    private val T__18 = Tokens.T__18.id
    private val T__19 = Tokens.T__19.id
    private val T__20 = Tokens.T__20.id
    private val T__21 = Tokens.T__21.id
    private val T__22 = Tokens.T__22.id
    private val T__23 = Tokens.T__23.id
    private val T__24 = Tokens.T__24.id
    private val T__25 = Tokens.T__25.id
    private val T__26 = Tokens.T__26.id
    private val T__27 = Tokens.T__27.id
    private val T__28 = Tokens.T__28.id
    private val T__29 = Tokens.T__29.id
    private val T__30 = Tokens.T__30.id
    private val T__31 = Tokens.T__31.id
    private val T__32 = Tokens.T__32.id
    private val T__33 = Tokens.T__33.id
    private val T__34 = Tokens.T__34.id
    private val T__35 = Tokens.T__35.id
    private val T__36 = Tokens.T__36.id
    private val T__37 = Tokens.T__37.id
    private val T__38 = Tokens.T__38.id
    private val T__39 = Tokens.T__39.id
    private val T__40 = Tokens.T__40.id
    private val T__41 = Tokens.T__41.id
    private val T__42 = Tokens.T__42.id
    private val T__43 = Tokens.T__43.id
    private val T__44 = Tokens.T__44.id
    private val T__45 = Tokens.T__45.id
    private val T__46 = Tokens.T__46.id
    private val T__47 = Tokens.T__47.id
    private val T__48 = Tokens.T__48.id
    private val T__49 = Tokens.T__49.id
    private val T__50 = Tokens.T__50.id
    private val T__51 = Tokens.T__51.id
    private val T__52 = Tokens.T__52.id
    private val T__53 = Tokens.T__53.id
    private val T__54 = Tokens.T__54.id
    private val T__55 = Tokens.T__55.id
    private val T__56 = Tokens.T__56.id
    private val T__57 = Tokens.T__57.id
    private val T__58 = Tokens.T__58.id
    private val T__59 = Tokens.T__59.id
    private val T__60 = Tokens.T__60.id
    private val T__61 = Tokens.T__61.id
    private val T__62 = Tokens.T__62.id
    private val TokAtom = Tokens.TokAtom.id
    private val TokVar = Tokens.TokVar.id
    private val TokFloat = Tokens.TokFloat.id
    private val TokInteger = Tokens.TokInteger.id
    private val TokChar = Tokens.TokChar.id
    private val TokString = Tokens.TokString.id
    private val AttrName = Tokens.AttrName.id
    private val Comment = Tokens.Comment.id
    private val WS = Tokens.WS.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class FormsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_forms.id
	        set(value) { throw RuntimeException() }
		fun EOF() : TerminalNode? = getToken(ErlangParser.Tokens.EOF.id, 0)
		fun findForm() : List<FormContext> = getRuleContexts(solver.getType("FormContext"))
		fun findForm(i: Int) : FormContext? = getRuleContext(solver.getType("FormContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterForms(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitForms(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitForms(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  forms() : FormsContext {
		var _localctx : FormsContext = FormsContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_forms.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 203 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 202
				form()
				}
				}
				this.state = 205 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__1 || _la==TokAtom || _la==AttrName )
			this.state = 207
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

	open class FormContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_form.id
	        set(value) { throw RuntimeException() }
		fun findAttribute() : AttributeContext? = getRuleContext(solver.getType("AttributeContext"),0)
		fun findFunction() : FunctionContext? = getRuleContext(solver.getType("FunctionContext"),0)
		fun findRuleClauses() : RuleClausesContext? = getRuleContext(solver.getType("RuleClausesContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterForm(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitForm(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitForm(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  form() : FormContext {
		var _localctx : FormContext = FormContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_form.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 212
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,1,context) ) {
			1 -> {if (true){
			this.state = 209
			attribute()
			}}
			2 -> {if (true){
			this.state = 210
			function()
			}}
			3 -> {if (true){
			this.state = 211
			ruleClauses()
			}}
			}
			this.state = 214
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

	open class TokAtomContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_tokAtom.id
	        set(value) { throw RuntimeException() }
		fun TokAtom() : TerminalNode? = getToken(ErlangParser.Tokens.TokAtom.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterTokAtom(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitTokAtom(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitTokAtom(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  tokAtom() : TokAtomContext {
		var _localctx : TokAtomContext = TokAtomContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_tokAtom.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 216
			match(TokAtom) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TokVarContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_tokVar.id
	        set(value) { throw RuntimeException() }
		fun TokVar() : TerminalNode? = getToken(ErlangParser.Tokens.TokVar.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterTokVar(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitTokVar(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitTokVar(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  tokVar() : TokVarContext {
		var _localctx : TokVarContext = TokVarContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_tokVar.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 218
			match(TokVar) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TokFloatContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_tokFloat.id
	        set(value) { throw RuntimeException() }
		fun TokFloat() : TerminalNode? = getToken(ErlangParser.Tokens.TokFloat.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterTokFloat(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitTokFloat(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitTokFloat(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  tokFloat() : TokFloatContext {
		var _localctx : TokFloatContext = TokFloatContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_tokFloat.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 220
			match(TokFloat) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TokIntegerContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_tokInteger.id
	        set(value) { throw RuntimeException() }
		fun TokInteger() : TerminalNode? = getToken(ErlangParser.Tokens.TokInteger.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterTokInteger(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitTokInteger(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitTokInteger(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  tokInteger() : TokIntegerContext {
		var _localctx : TokIntegerContext = TokIntegerContext(context, state)
		enterRule(_localctx, 10, Rules.RULE_tokInteger.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 222
			match(TokInteger) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TokCharContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_tokChar.id
	        set(value) { throw RuntimeException() }
		fun TokChar() : TerminalNode? = getToken(ErlangParser.Tokens.TokChar.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterTokChar(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitTokChar(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitTokChar(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  tokChar() : TokCharContext {
		var _localctx : TokCharContext = TokCharContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_tokChar.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 224
			match(TokChar) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TokStringContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_tokString.id
	        set(value) { throw RuntimeException() }
		fun TokString() : TerminalNode? = getToken(ErlangParser.Tokens.TokString.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterTokString(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitTokString(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitTokString(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  tokString() : TokStringContext {
		var _localctx : TokStringContext = TokStringContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_tokString.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 226
			match(TokString) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class AttributeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_attribute.id
	        set(value) { throw RuntimeException() }
		fun findTokAtom() : TokAtomContext? = getRuleContext(solver.getType("TokAtomContext"),0)
		fun findAttrVal() : AttrValContext? = getRuleContext(solver.getType("AttrValContext"),0)
		fun findTypedAttrVal() : TypedAttrValContext? = getRuleContext(solver.getType("TypedAttrValContext"),0)
		fun AttrName() : TerminalNode? = getToken(ErlangParser.Tokens.AttrName.id, 0)
		fun findTypeSpec() : TypeSpecContext? = getRuleContext(solver.getType("TypeSpecContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterAttribute(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitAttribute(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitAttribute(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  attribute() : AttributeContext {
		var _localctx : AttributeContext = AttributeContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_attribute.id)
		try {
			this.state = 244
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,2,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 228
			match(T__1) as Token
			this.state = 229
			tokAtom()
			this.state = 230
			attrVal()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 232
			match(T__1) as Token
			this.state = 233
			tokAtom()
			this.state = 234
			typedAttrVal()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 236
			match(T__1) as Token
			this.state = 237
			tokAtom()
			this.state = 238
			match(T__2) as Token
			this.state = 239
			typedAttrVal()
			this.state = 240
			match(T__3) as Token
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 242
			match(AttrName) as Token
			this.state = 243
			typeSpec()
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

	open class TypeSpecContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeSpec.id
	        set(value) { throw RuntimeException() }
		fun findSpecFun() : SpecFunContext? = getRuleContext(solver.getType("SpecFunContext"),0)
		fun findTypeSigs() : TypeSigsContext? = getRuleContext(solver.getType("TypeSigsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterTypeSpec(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitTypeSpec(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitTypeSpec(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  typeSpec() : TypeSpecContext {
		var _localctx : TypeSpecContext = TypeSpecContext(context, state)
		enterRule(_localctx, 18, Rules.RULE_typeSpec.id)
		try {
			this.state = 254
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			TokAtom  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 246
			specFun()
			this.state = 247
			typeSigs()
			}}
			T__2  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 249
			match(T__2) as Token
			this.state = 250
			specFun()
			this.state = 251
			typeSigs()
			this.state = 252
			match(T__3) as Token
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

	open class SpecFunContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_specFun.id
	        set(value) { throw RuntimeException() }
		fun findTokAtom() : List<TokAtomContext> = getRuleContexts(solver.getType("TokAtomContext"))
		fun findTokAtom(i: Int) : TokAtomContext? = getRuleContext(solver.getType("TokAtomContext"),i)
		fun findTokInteger() : TokIntegerContext? = getRuleContext(solver.getType("TokIntegerContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterSpecFun(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitSpecFun(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitSpecFun(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  specFun() : SpecFunContext {
		var _localctx : SpecFunContext = SpecFunContext(context, state)
		enterRule(_localctx, 20, Rules.RULE_specFun.id)
		try {
			this.state = 273
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,4,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 256
			tokAtom()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 257
			tokAtom()
			this.state = 258
			match(T__4) as Token
			this.state = 259
			tokAtom()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 261
			tokAtom()
			this.state = 262
			match(T__5) as Token
			this.state = 263
			tokInteger()
			this.state = 264
			match(T__6) as Token
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 266
			tokAtom()
			this.state = 267
			match(T__4) as Token
			this.state = 268
			tokAtom()
			this.state = 269
			match(T__5) as Token
			this.state = 270
			tokInteger()
			this.state = 271
			match(T__6) as Token
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

	open class TypedAttrValContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typedAttrVal.id
	        set(value) { throw RuntimeException() }
		fun findExpr() : ExprContext? = getRuleContext(solver.getType("ExprContext"),0)
		fun findTypedRecordFields() : TypedRecordFieldsContext? = getRuleContext(solver.getType("TypedRecordFieldsContext"),0)
		fun findTopType() : TopTypeContext? = getRuleContext(solver.getType("TopTypeContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterTypedAttrVal(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitTypedAttrVal(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitTypedAttrVal(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  typedAttrVal() : TypedAttrValContext {
		var _localctx : TypedAttrValContext = TypedAttrValContext(context, state)
		enterRule(_localctx, 22, Rules.RULE_typedAttrVal.id)
		try {
			this.state = 283
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,5,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 275
			expr()
			this.state = 276
			match(T__7) as Token
			this.state = 277
			typedRecordFields()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 279
			expr()
			this.state = 280
			match(T__6) as Token
			this.state = 281
			topType()
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

	open class TypedRecordFieldsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typedRecordFields.id
	        set(value) { throw RuntimeException() }
		fun findTypedExprs() : TypedExprsContext? = getRuleContext(solver.getType("TypedExprsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterTypedRecordFields(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitTypedRecordFields(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitTypedRecordFields(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  typedRecordFields() : TypedRecordFieldsContext {
		var _localctx : TypedRecordFieldsContext = TypedRecordFieldsContext(context, state)
		enterRule(_localctx, 24, Rules.RULE_typedRecordFields.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 285
			match(T__8) as Token
			this.state = 286
			typedExprs()
			this.state = 287
			match(T__9) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TypedExprsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typedExprs.id
	        set(value) { throw RuntimeException() }
		fun findTypedExpr() : TypedExprContext? = getRuleContext(solver.getType("TypedExprContext"),0)
		fun findTypedExprs() : TypedExprsContext? = getRuleContext(solver.getType("TypedExprsContext"),0)
		fun findExpr() : ExprContext? = getRuleContext(solver.getType("ExprContext"),0)
		fun findExprs() : ExprsContext? = getRuleContext(solver.getType("ExprsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterTypedExprs(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitTypedExprs(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitTypedExprs(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  typedExprs() : TypedExprsContext {
		var _localctx : TypedExprsContext = TypedExprsContext(context, state)
		enterRule(_localctx, 26, Rules.RULE_typedExprs.id)
		try {
			this.state = 302
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,6,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 289
			typedExpr()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 290
			typedExpr()
			this.state = 291
			match(T__7) as Token
			this.state = 292
			typedExprs()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 294
			expr()
			this.state = 295
			match(T__7) as Token
			this.state = 296
			typedExprs()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 298
			typedExpr()
			this.state = 299
			match(T__7) as Token
			this.state = 300
			exprs()
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

	open class TypedExprContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typedExpr.id
	        set(value) { throw RuntimeException() }
		fun findExpr() : ExprContext? = getRuleContext(solver.getType("ExprContext"),0)
		fun findTopType() : TopTypeContext? = getRuleContext(solver.getType("TopTypeContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterTypedExpr(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitTypedExpr(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitTypedExpr(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  typedExpr() : TypedExprContext {
		var _localctx : TypedExprContext = TypedExprContext(context, state)
		enterRule(_localctx, 28, Rules.RULE_typedExpr.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 304
			expr()
			this.state = 305
			match(T__6) as Token
			this.state = 306
			topType()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TypeSigsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeSigs.id
	        set(value) { throw RuntimeException() }
		fun findTypeSig() : List<TypeSigContext> = getRuleContexts(solver.getType("TypeSigContext"))
		fun findTypeSig(i: Int) : TypeSigContext? = getRuleContext(solver.getType("TypeSigContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterTypeSigs(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitTypeSigs(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitTypeSigs(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  typeSigs() : TypeSigsContext {
		var _localctx : TypeSigsContext = TypeSigsContext(context, state)
		enterRule(_localctx, 30, Rules.RULE_typeSigs.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 308
			typeSig()
			this.state = 313
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__10) {
				if (true){
				if (true){
				this.state = 309
				match(T__10) as Token
				this.state = 310
				typeSig()
				}
				}
				this.state = 315
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

	open class TypeSigContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeSig.id
	        set(value) { throw RuntimeException() }
		fun findFunType() : FunTypeContext? = getRuleContext(solver.getType("FunTypeContext"),0)
		fun findTypeGuards() : TypeGuardsContext? = getRuleContext(solver.getType("TypeGuardsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterTypeSig(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitTypeSig(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitTypeSig(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  typeSig() : TypeSigContext {
		var _localctx : TypeSigContext = TypeSigContext(context, state)
		enterRule(_localctx, 32, Rules.RULE_typeSig.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 316
			funType()
			this.state = 319
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__11) {
				if (true){
				this.state = 317
				match(T__11) as Token
				this.state = 318
				typeGuards()
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

	open class TypeGuardsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeGuards.id
	        set(value) { throw RuntimeException() }
		fun findTypeGuard() : List<TypeGuardContext> = getRuleContexts(solver.getType("TypeGuardContext"))
		fun findTypeGuard(i: Int) : TypeGuardContext? = getRuleContext(solver.getType("TypeGuardContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterTypeGuards(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitTypeGuards(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitTypeGuards(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  typeGuards() : TypeGuardsContext {
		var _localctx : TypeGuardsContext = TypeGuardsContext(context, state)
		enterRule(_localctx, 34, Rules.RULE_typeGuards.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 321
			typeGuard()
			this.state = 326
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__7) {
				if (true){
				if (true){
				this.state = 322
				match(T__7) as Token
				this.state = 323
				typeGuard()
				}
				}
				this.state = 328
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

	open class TypeGuardContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeGuard.id
	        set(value) { throw RuntimeException() }
		fun findTokAtom() : TokAtomContext? = getRuleContext(solver.getType("TokAtomContext"),0)
		fun findTopTypes() : TopTypesContext? = getRuleContext(solver.getType("TopTypesContext"),0)
		fun findTokVar() : TokVarContext? = getRuleContext(solver.getType("TokVarContext"),0)
		fun findTopType() : TopTypeContext? = getRuleContext(solver.getType("TopTypeContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterTypeGuard(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitTypeGuard(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitTypeGuard(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  typeGuard() : TypeGuardContext {
		var _localctx : TypeGuardContext = TypeGuardContext(context, state)
		enterRule(_localctx, 36, Rules.RULE_typeGuard.id)
		try {
			this.state = 338
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			TokAtom  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 329
			tokAtom()
			this.state = 330
			match(T__2) as Token
			this.state = 331
			topTypes()
			this.state = 332
			match(T__3) as Token
			}}
			TokVar  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 334
			tokVar()
			this.state = 335
			match(T__6) as Token
			this.state = 336
			topType()
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

	open class TopTypesContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_topTypes.id
	        set(value) { throw RuntimeException() }
		fun findTopType() : List<TopTypeContext> = getRuleContexts(solver.getType("TopTypeContext"))
		fun findTopType(i: Int) : TopTypeContext? = getRuleContext(solver.getType("TopTypeContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterTopTypes(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitTopTypes(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitTopTypes(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  topTypes() : TopTypesContext {
		var _localctx : TopTypesContext = TopTypesContext(context, state)
		enterRule(_localctx, 38, Rules.RULE_topTypes.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 340
			topType()
			this.state = 345
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__7) {
				if (true){
				if (true){
				this.state = 341
				match(T__7) as Token
				this.state = 342
				topType()
				}
				}
				this.state = 347
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

	open class TopTypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_topType.id
	        set(value) { throw RuntimeException() }
		fun findTopType100() : TopType100Context? = getRuleContext(solver.getType("TopType100Context"),0)
		fun findTokVar() : TokVarContext? = getRuleContext(solver.getType("TokVarContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterTopType(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitTopType(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitTopType(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  topType() : TopTypeContext {
		var _localctx : TopTypeContext = TopTypeContext(context, state)
		enterRule(_localctx, 40, Rules.RULE_topType.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 351
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,12,context) ) {
			1   -> if (true){
			this.state = 348
			tokVar()
			this.state = 349
			match(T__6) as Token
			}
			}
			this.state = 353
			topType100()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TopType100Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_topType100.id
	        set(value) { throw RuntimeException() }
		fun findType200() : Type200Context? = getRuleContext(solver.getType("Type200Context"),0)
		fun findTopType100() : TopType100Context? = getRuleContext(solver.getType("TopType100Context"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterTopType100(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitTopType100(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitTopType100(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  topType100() : TopType100Context {
		var _localctx : TopType100Context = TopType100Context(context, state)
		enterRule(_localctx, 42, Rules.RULE_topType100.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 355
			type200()
			this.state = 358
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__12) {
				if (true){
				this.state = 356
				match(T__12) as Token
				this.state = 357
				topType100()
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

	open class Type200Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_type200.id
	        set(value) { throw RuntimeException() }
		fun findType300() : List<Type300Context> = getRuleContexts(solver.getType("Type300Context"))
		fun findType300(i: Int) : Type300Context? = getRuleContext(solver.getType("Type300Context"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterType200(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitType200(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitType200(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  type200() : Type200Context {
		var _localctx : Type200Context = Type200Context(context, state)
		enterRule(_localctx, 44, Rules.RULE_type200.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 360
			type300(0)
			this.state = 363
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__13) {
				if (true){
				this.state = 361
				match(T__13) as Token
				this.state = 362
				type300(0)
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

	open class Type300Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_type300.id
	        set(value) { throw RuntimeException() }
		fun findType400() : Type400Context? = getRuleContext(solver.getType("Type400Context"),0)
		fun findType300() : Type300Context? = getRuleContext(solver.getType("Type300Context"),0)
		fun findAddOp() : AddOpContext? = getRuleContext(solver.getType("AddOpContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterType300(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitType300(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitType300(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun type300() : Type300Context {
		return type300(0);
	}

	private fun type300(_p: Int) : Type300Context {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : Type300Context= Type300Context(context, _parentState)
		var _prevctx : Type300Context= _localctx
		var _startState : Int = 46
		enterRecursionRule(_localctx, 46, Rules.RULE_type300.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 366
			type400(0)
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 374
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,15,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					if (true){
					_localctx = Type300Context(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_type300.id)
					this.state = 368
					if (!(precpred(context!!, 2))) throw FailedPredicateException(this, "precpred(context!!, 2)")
					this.state = 369
					addOp()
					this.state = 370
					type400(0)
					}
					} 
				}
				this.state = 376
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,15,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class Type400Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_type400.id
	        set(value) { throw RuntimeException() }
		fun findType500() : Type500Context? = getRuleContext(solver.getType("Type500Context"),0)
		fun findType400() : Type400Context? = getRuleContext(solver.getType("Type400Context"),0)
		fun findMultOp() : MultOpContext? = getRuleContext(solver.getType("MultOpContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterType400(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitType400(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitType400(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun type400() : Type400Context {
		return type400(0);
	}

	private fun type400(_p: Int) : Type400Context {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : Type400Context= Type400Context(context, _parentState)
		var _prevctx : Type400Context= _localctx
		var _startState : Int = 48
		enterRecursionRule(_localctx, 48, Rules.RULE_type400.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 378
			type500()
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 386
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,16,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					if (true){
					_localctx = Type400Context(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_type400.id)
					this.state = 380
					if (!(precpred(context!!, 2))) throw FailedPredicateException(this, "precpred(context!!, 2)")
					this.state = 381
					multOp()
					this.state = 382
					type500()
					}
					} 
				}
				this.state = 388
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,16,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class Type500Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_type500.id
	        set(value) { throw RuntimeException() }
		fun findType() : TypeContext? = getRuleContext(solver.getType("TypeContext"),0)
		fun findPrefixOp() : PrefixOpContext? = getRuleContext(solver.getType("PrefixOpContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterType500(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitType500(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitType500(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  type500() : Type500Context {
		var _localctx : Type500Context = Type500Context(context, state)
		enterRule(_localctx, 50, Rules.RULE_type500.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 390
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__1) or (1L shl T__39) or (1L shl T__40) or (1L shl T__41))) != 0L)) {
				if (true){
				this.state = 389
				prefixOp()
				}
			}

			this.state = 392
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

	open class TypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_type.id
	        set(value) { throw RuntimeException() }
		fun findTopType() : TopTypeContext? = getRuleContext(solver.getType("TopTypeContext"),0)
		fun findTokVar() : TokVarContext? = getRuleContext(solver.getType("TokVarContext"),0)
		fun findTokAtom() : List<TokAtomContext> = getRuleContexts(solver.getType("TokAtomContext"))
		fun findTokAtom(i: Int) : TokAtomContext? = getRuleContext(solver.getType("TokAtomContext"),i)
		fun findTopTypes() : TopTypesContext? = getRuleContext(solver.getType("TopTypesContext"),0)
		fun findFieldTypes() : FieldTypesContext? = getRuleContext(solver.getType("FieldTypesContext"),0)
		fun findBinaryType() : BinaryTypeContext? = getRuleContext(solver.getType("BinaryTypeContext"),0)
		fun findTokInteger() : TokIntegerContext? = getRuleContext(solver.getType("TokIntegerContext"),0)
		fun findFunType100() : FunType100Context? = getRuleContext(solver.getType("FunType100Context"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterType(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitType(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitType(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  type() : TypeContext {
		var _localctx : TypeContext = TypeContext(context, state)
		enterRule(_localctx, 52, Rules.RULE_type.id)
		try {
			this.state = 461
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,18,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 394
			match(T__2) as Token
			this.state = 395
			topType()
			this.state = 396
			match(T__3) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 398
			tokVar()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 399
			tokAtom()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 400
			tokAtom()
			this.state = 401
			match(T__2) as Token
			this.state = 402
			match(T__3) as Token
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 404
			tokAtom()
			this.state = 405
			match(T__2) as Token
			this.state = 406
			topTypes()
			this.state = 407
			match(T__3) as Token
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 409
			tokAtom()
			this.state = 410
			match(T__4) as Token
			this.state = 411
			tokAtom()
			this.state = 412
			match(T__2) as Token
			this.state = 413
			match(T__3) as Token
			}}
			7 -> {
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 415
			tokAtom()
			this.state = 416
			match(T__4) as Token
			this.state = 417
			tokAtom()
			this.state = 418
			match(T__2) as Token
			this.state = 419
			topTypes()
			this.state = 420
			match(T__3) as Token
			}}
			8 -> {
			enterOuterAlt(_localctx, 8)
			if (true){
			this.state = 422
			match(T__14) as Token
			this.state = 423
			match(T__15) as Token
			}}
			9 -> {
			enterOuterAlt(_localctx, 9)
			if (true){
			this.state = 424
			match(T__14) as Token
			this.state = 425
			topType()
			this.state = 426
			match(T__15) as Token
			}}
			10 -> {
			enterOuterAlt(_localctx, 10)
			if (true){
			this.state = 428
			match(T__14) as Token
			this.state = 429
			topType()
			this.state = 430
			match(T__7) as Token
			this.state = 431
			match(T__16) as Token
			this.state = 432
			match(T__15) as Token
			}}
			11 -> {
			enterOuterAlt(_localctx, 11)
			if (true){
			this.state = 434
			match(T__8) as Token
			this.state = 435
			match(T__9) as Token
			}}
			12 -> {
			enterOuterAlt(_localctx, 12)
			if (true){
			this.state = 436
			match(T__8) as Token
			this.state = 437
			topTypes()
			this.state = 438
			match(T__9) as Token
			}}
			13 -> {
			enterOuterAlt(_localctx, 13)
			if (true){
			this.state = 440
			match(T__17) as Token
			this.state = 441
			tokAtom()
			this.state = 442
			match(T__8) as Token
			this.state = 443
			match(T__9) as Token
			}}
			14 -> {
			enterOuterAlt(_localctx, 14)
			if (true){
			this.state = 445
			match(T__17) as Token
			this.state = 446
			tokAtom()
			this.state = 447
			match(T__8) as Token
			this.state = 448
			fieldTypes()
			this.state = 449
			match(T__9) as Token
			}}
			15 -> {
			enterOuterAlt(_localctx, 15)
			if (true){
			this.state = 451
			binaryType()
			}}
			16 -> {
			enterOuterAlt(_localctx, 16)
			if (true){
			this.state = 452
			tokInteger()
			}}
			17 -> {
			enterOuterAlt(_localctx, 17)
			if (true){
			this.state = 453
			match(T__18) as Token
			this.state = 454
			match(T__2) as Token
			this.state = 455
			match(T__3) as Token
			}}
			18 -> {
			enterOuterAlt(_localctx, 18)
			if (true){
			this.state = 456
			match(T__18) as Token
			this.state = 457
			match(T__2) as Token
			this.state = 458
			funType100()
			this.state = 459
			match(T__3) as Token
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

	open class FunType100Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_funType100.id
	        set(value) { throw RuntimeException() }
		fun findTopType() : TopTypeContext? = getRuleContext(solver.getType("TopTypeContext"),0)
		fun findFunType() : FunTypeContext? = getRuleContext(solver.getType("FunTypeContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterFunType100(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitFunType100(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitFunType100(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  funType100() : FunType100Context {
		var _localctx : FunType100Context = FunType100Context(context, state)
		enterRule(_localctx, 54, Rules.RULE_funType100.id)
		try {
			this.state = 469
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,19,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 463
			match(T__2) as Token
			this.state = 464
			match(T__16) as Token
			this.state = 465
			match(T__3) as Token
			this.state = 466
			match(T__19) as Token
			this.state = 467
			topType()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 468
			funType()
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

	open class FunTypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_funType.id
	        set(value) { throw RuntimeException() }
		fun findTopType() : TopTypeContext? = getRuleContext(solver.getType("TopTypeContext"),0)
		fun findTopTypes() : TopTypesContext? = getRuleContext(solver.getType("TopTypesContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterFunType(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitFunType(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitFunType(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  funType() : FunTypeContext {
		var _localctx : FunTypeContext = FunTypeContext(context, state)
		enterRule(_localctx, 56, Rules.RULE_funType.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 471
			match(T__2) as Token
			this.state = 473
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__1) or (1L shl T__2) or (1L shl T__8) or (1L shl T__14) or (1L shl T__17) or (1L shl T__18) or (1L shl T__20) or (1L shl T__39) or (1L shl T__40) or (1L shl T__41))) != 0L) || ((((_la - 64)) and 0x3f.inv()) == 0 && ((1L shl (_la - 64)) and ((1L shl (TokAtom - 64)) or (1L shl (TokVar - 64)) or (1L shl (TokInteger - 64)))) != 0L)) {
				if (true){
				this.state = 472
				topTypes()
				}
			}

			this.state = 475
			match(T__3) as Token
			this.state = 476
			match(T__19) as Token
			this.state = 477
			topType()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class FieldTypesContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_fieldTypes.id
	        set(value) { throw RuntimeException() }
		fun findFieldType() : List<FieldTypeContext> = getRuleContexts(solver.getType("FieldTypeContext"))
		fun findFieldType(i: Int) : FieldTypeContext? = getRuleContext(solver.getType("FieldTypeContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterFieldTypes(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitFieldTypes(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitFieldTypes(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  fieldTypes() : FieldTypesContext {
		var _localctx : FieldTypesContext = FieldTypesContext(context, state)
		enterRule(_localctx, 58, Rules.RULE_fieldTypes.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 479
			fieldType()
			this.state = 484
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__7) {
				if (true){
				if (true){
				this.state = 480
				match(T__7) as Token
				this.state = 481
				fieldType()
				}
				}
				this.state = 486
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

	open class FieldTypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_fieldType.id
	        set(value) { throw RuntimeException() }
		fun findTokAtom() : TokAtomContext? = getRuleContext(solver.getType("TokAtomContext"),0)
		fun findTopType() : TopTypeContext? = getRuleContext(solver.getType("TopTypeContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterFieldType(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitFieldType(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitFieldType(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  fieldType() : FieldTypeContext {
		var _localctx : FieldTypeContext = FieldTypeContext(context, state)
		enterRule(_localctx, 60, Rules.RULE_fieldType.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 487
			tokAtom()
			this.state = 488
			match(T__6) as Token
			this.state = 489
			topType()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class BinaryTypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_binaryType.id
	        set(value) { throw RuntimeException() }
		fun findBinBaseType() : BinBaseTypeContext? = getRuleContext(solver.getType("BinBaseTypeContext"),0)
		fun findBinUnitType() : BinUnitTypeContext? = getRuleContext(solver.getType("BinUnitTypeContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterBinaryType(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitBinaryType(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitBinaryType(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  binaryType() : BinaryTypeContext {
		var _localctx : BinaryTypeContext = BinaryTypeContext(context, state)
		enterRule(_localctx, 62, Rules.RULE_binaryType.id)
		try {
			this.state = 507
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,22,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 491
			match(T__20) as Token
			this.state = 492
			match(T__21) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 493
			match(T__20) as Token
			this.state = 494
			binBaseType()
			this.state = 495
			match(T__21) as Token
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 497
			match(T__20) as Token
			this.state = 498
			binUnitType()
			this.state = 499
			match(T__21) as Token
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 501
			match(T__20) as Token
			this.state = 502
			binBaseType()
			this.state = 503
			match(T__7) as Token
			this.state = 504
			binUnitType()
			this.state = 505
			match(T__21) as Token
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

	open class BinBaseTypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_binBaseType.id
	        set(value) { throw RuntimeException() }
		fun findTokVar() : TokVarContext? = getRuleContext(solver.getType("TokVarContext"),0)
		fun findType() : TypeContext? = getRuleContext(solver.getType("TypeContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterBinBaseType(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitBinBaseType(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitBinBaseType(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  binBaseType() : BinBaseTypeContext {
		var _localctx : BinBaseTypeContext = BinBaseTypeContext(context, state)
		enterRule(_localctx, 64, Rules.RULE_binBaseType.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 509
			tokVar()
			this.state = 510
			match(T__4) as Token
			this.state = 511
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

	open class BinUnitTypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_binUnitType.id
	        set(value) { throw RuntimeException() }
		fun findTokVar() : List<TokVarContext> = getRuleContexts(solver.getType("TokVarContext"))
		fun findTokVar(i: Int) : TokVarContext? = getRuleContext(solver.getType("TokVarContext"),i)
		fun findType() : TypeContext? = getRuleContext(solver.getType("TypeContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterBinUnitType(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitBinUnitType(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitBinUnitType(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  binUnitType() : BinUnitTypeContext {
		var _localctx : BinUnitTypeContext = BinUnitTypeContext(context, state)
		enterRule(_localctx, 66, Rules.RULE_binUnitType.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 513
			tokVar()
			this.state = 514
			match(T__4) as Token
			this.state = 515
			tokVar()
			this.state = 516
			match(T__22) as Token
			this.state = 517
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

	open class AttrValContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_attrVal.id
	        set(value) { throw RuntimeException() }
		fun findExpr() : ExprContext? = getRuleContext(solver.getType("ExprContext"),0)
		fun findExprs() : ExprsContext? = getRuleContext(solver.getType("ExprsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterAttrVal(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitAttrVal(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitAttrVal(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  attrVal() : AttrValContext {
		var _localctx : AttrValContext = AttrValContext(context, state)
		enterRule(_localctx, 68, Rules.RULE_attrVal.id)
		try {
			this.state = 534
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,23,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 519
			expr()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 520
			match(T__2) as Token
			this.state = 521
			expr()
			this.state = 522
			match(T__3) as Token
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 524
			expr()
			this.state = 525
			match(T__7) as Token
			this.state = 526
			exprs()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 528
			match(T__2) as Token
			this.state = 529
			expr()
			this.state = 530
			match(T__7) as Token
			this.state = 531
			exprs()
			this.state = 532
			match(T__3) as Token
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

	open class FunctionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_function.id
	        set(value) { throw RuntimeException() }
		fun findFunctionClause() : List<FunctionClauseContext> = getRuleContexts(solver.getType("FunctionClauseContext"))
		fun findFunctionClause(i: Int) : FunctionClauseContext? = getRuleContext(solver.getType("FunctionClauseContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterFunction(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitFunction(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitFunction(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  function() : FunctionContext {
		var _localctx : FunctionContext = FunctionContext(context, state)
		enterRule(_localctx, 70, Rules.RULE_function.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 536
			functionClause()
			this.state = 541
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__10) {
				if (true){
				if (true){
				this.state = 537
				match(T__10) as Token
				this.state = 538
				functionClause()
				}
				}
				this.state = 543
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

	open class FunctionClauseContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_functionClause.id
	        set(value) { throw RuntimeException() }
		fun findTokAtom() : TokAtomContext? = getRuleContext(solver.getType("TokAtomContext"),0)
		fun findClauseArgs() : ClauseArgsContext? = getRuleContext(solver.getType("ClauseArgsContext"),0)
		fun findClauseGuard() : ClauseGuardContext? = getRuleContext(solver.getType("ClauseGuardContext"),0)
		fun findClauseBody() : ClauseBodyContext? = getRuleContext(solver.getType("ClauseBodyContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterFunctionClause(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitFunctionClause(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitFunctionClause(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  functionClause() : FunctionClauseContext {
		var _localctx : FunctionClauseContext = FunctionClauseContext(context, state)
		enterRule(_localctx, 72, Rules.RULE_functionClause.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 544
			tokAtom()
			this.state = 545
			clauseArgs()
			this.state = 546
			clauseGuard()
			this.state = 547
			clauseBody()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ClauseArgsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_clauseArgs.id
	        set(value) { throw RuntimeException() }
		fun findArgumentList() : ArgumentListContext? = getRuleContext(solver.getType("ArgumentListContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterClauseArgs(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitClauseArgs(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitClauseArgs(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  clauseArgs() : ClauseArgsContext {
		var _localctx : ClauseArgsContext = ClauseArgsContext(context, state)
		enterRule(_localctx, 74, Rules.RULE_clauseArgs.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 549
			argumentList()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ClauseGuardContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_clauseGuard.id
	        set(value) { throw RuntimeException() }
		fun findGuard() : GuardContext? = getRuleContext(solver.getType("GuardContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterClauseGuard(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitClauseGuard(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitClauseGuard(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  clauseGuard() : ClauseGuardContext {
		var _localctx : ClauseGuardContext = ClauseGuardContext(context, state)
		enterRule(_localctx, 76, Rules.RULE_clauseGuard.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 553
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__11) {
				if (true){
				this.state = 551
				match(T__11) as Token
				this.state = 552
				guard()
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

	open class ClauseBodyContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_clauseBody.id
	        set(value) { throw RuntimeException() }
		fun findExprs() : ExprsContext? = getRuleContext(solver.getType("ExprsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterClauseBody(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitClauseBody(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitClauseBody(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  clauseBody() : ClauseBodyContext {
		var _localctx : ClauseBodyContext = ClauseBodyContext(context, state)
		enterRule(_localctx, 78, Rules.RULE_clauseBody.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 555
			match(T__19) as Token
			this.state = 556
			exprs()
			}
		}
		catch (re: RecognitionException) {
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
		fun findExpr() : ExprContext? = getRuleContext(solver.getType("ExprContext"),0)
		fun findExpr100() : Expr100Context? = getRuleContext(solver.getType("Expr100Context"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterExpr(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitExpr(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitExpr(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  expr() : ExprContext {
		var _localctx : ExprContext = ExprContext(context, state)
		enterRule(_localctx, 80, Rules.RULE_expr.id)
		try {
			this.state = 561
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			T__23  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 558
			match(T__23) as Token
			this.state = 559
			expr()
			}}
			T__1 , T__2 , T__8 , T__14 , T__17 , T__18 , T__20 , T__28 , T__33 , T__34 , T__36 , T__38 , T__39 , T__40 , T__41 , TokAtom , TokVar , TokFloat , TokInteger , TokChar , TokString  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 560
			expr100()
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

	open class Expr100Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_expr100.id
	        set(value) { throw RuntimeException() }
		fun findExpr150() : List<Expr150Context> = getRuleContexts(solver.getType("Expr150Context"))
		fun findExpr150(i: Int) : Expr150Context? = getRuleContext(solver.getType("Expr150Context"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterExpr100(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitExpr100(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitExpr100(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  expr100() : Expr100Context {
		var _localctx : Expr100Context = Expr100Context(context, state)
		enterRule(_localctx, 82, Rules.RULE_expr100.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 563
			expr150()
			this.state = 568
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__24 || _la==T__25) {
				if (true){
				if (true){
				this.state = 564
				_la = _input!!.LA(1)
				if ( !(_la==T__24 || _la==T__25) ) {
					errorHandler.recoverInline(this)
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				this.state = 565
				expr150()
				}
				}
				this.state = 570
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

	open class Expr150Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_expr150.id
	        set(value) { throw RuntimeException() }
		fun findExpr160() : List<Expr160Context> = getRuleContexts(solver.getType("Expr160Context"))
		fun findExpr160(i: Int) : Expr160Context? = getRuleContext(solver.getType("Expr160Context"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterExpr150(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitExpr150(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitExpr150(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  expr150() : Expr150Context {
		var _localctx : Expr150Context = Expr150Context(context, state)
		enterRule(_localctx, 84, Rules.RULE_expr150.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 571
			expr160()
			this.state = 576
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__26) {
				if (true){
				if (true){
				this.state = 572
				match(T__26) as Token
				this.state = 573
				expr160()
				}
				}
				this.state = 578
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

	open class Expr160Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_expr160.id
	        set(value) { throw RuntimeException() }
		fun findExpr200() : List<Expr200Context> = getRuleContexts(solver.getType("Expr200Context"))
		fun findExpr200(i: Int) : Expr200Context? = getRuleContext(solver.getType("Expr200Context"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterExpr160(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitExpr160(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitExpr160(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  expr160() : Expr160Context {
		var _localctx : Expr160Context = Expr160Context(context, state)
		enterRule(_localctx, 86, Rules.RULE_expr160.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 579
			expr200()
			this.state = 584
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__27) {
				if (true){
				if (true){
				this.state = 580
				match(T__27) as Token
				this.state = 581
				expr200()
				}
				}
				this.state = 586
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

	open class Expr200Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_expr200.id
	        set(value) { throw RuntimeException() }
		fun findExpr300() : List<Expr300Context> = getRuleContexts(solver.getType("Expr300Context"))
		fun findExpr300(i: Int) : Expr300Context? = getRuleContext(solver.getType("Expr300Context"),i)
		fun findCompOp() : CompOpContext? = getRuleContext(solver.getType("CompOpContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterExpr200(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitExpr200(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitExpr200(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  expr200() : Expr200Context {
		var _localctx : Expr200Context = Expr200Context(context, state)
		enterRule(_localctx, 88, Rules.RULE_expr200.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 587
			expr300()
			this.state = 591
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__54) or (1L shl T__55) or (1L shl T__56) or (1L shl T__57) or (1L shl T__58) or (1L shl T__59) or (1L shl T__60) or (1L shl T__61))) != 0L)) {
				if (true){
				this.state = 588
				compOp()
				this.state = 589
				expr300()
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

	open class Expr300Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_expr300.id
	        set(value) { throw RuntimeException() }
		fun findExpr400() : List<Expr400Context> = getRuleContexts(solver.getType("Expr400Context"))
		fun findExpr400(i: Int) : Expr400Context? = getRuleContext(solver.getType("Expr400Context"),i)
		fun findListOp() : List<ListOpContext> = getRuleContexts(solver.getType("ListOpContext"))
		fun findListOp(i: Int) : ListOpContext? = getRuleContext(solver.getType("ListOpContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterExpr300(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitExpr300(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitExpr300(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  expr300() : Expr300Context {
		var _localctx : Expr300Context = Expr300Context(context, state)
		enterRule(_localctx, 90, Rules.RULE_expr300.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 593
			expr400()
			this.state = 599
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__52 || _la==T__53) {
				if (true){
				if (true){
				this.state = 594
				listOp()
				this.state = 595
				expr400()
				}
				}
				this.state = 601
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

	open class Expr400Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_expr400.id
	        set(value) { throw RuntimeException() }
		fun findExpr500() : List<Expr500Context> = getRuleContexts(solver.getType("Expr500Context"))
		fun findExpr500(i: Int) : Expr500Context? = getRuleContext(solver.getType("Expr500Context"),i)
		fun findAddOp() : List<AddOpContext> = getRuleContexts(solver.getType("AddOpContext"))
		fun findAddOp(i: Int) : AddOpContext? = getRuleContext(solver.getType("AddOpContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterExpr400(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitExpr400(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitExpr400(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  expr400() : Expr400Context {
		var _localctx : Expr400Context = Expr400Context(context, state)
		enterRule(_localctx, 92, Rules.RULE_expr400.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 602
			expr500()
			this.state = 608
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__1) or (1L shl T__39) or (1L shl T__46) or (1L shl T__47) or (1L shl T__48) or (1L shl T__49) or (1L shl T__50) or (1L shl T__51))) != 0L)) {
				if (true){
				if (true){
				this.state = 603
				addOp()
				this.state = 604
				expr500()
				}
				}
				this.state = 610
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

	open class Expr500Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_expr500.id
	        set(value) { throw RuntimeException() }
		fun findExpr600() : List<Expr600Context> = getRuleContexts(solver.getType("Expr600Context"))
		fun findExpr600(i: Int) : Expr600Context? = getRuleContext(solver.getType("Expr600Context"),i)
		fun findMultOp() : List<MultOpContext> = getRuleContexts(solver.getType("MultOpContext"))
		fun findMultOp(i: Int) : MultOpContext? = getRuleContext(solver.getType("MultOpContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterExpr500(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitExpr500(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitExpr500(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  expr500() : Expr500Context {
		var _localctx : Expr500Context = Expr500Context(context, state)
		enterRule(_localctx, 94, Rules.RULE_expr500.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 611
			expr600()
			this.state = 617
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__5) or (1L shl T__22) or (1L shl T__42) or (1L shl T__43) or (1L shl T__44) or (1L shl T__45))) != 0L)) {
				if (true){
				if (true){
				this.state = 612
				multOp()
				this.state = 613
				expr600()
				}
				}
				this.state = 619
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

	open class Expr600Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_expr600.id
	        set(value) { throw RuntimeException() }
		fun findExpr700() : Expr700Context? = getRuleContext(solver.getType("Expr700Context"),0)
		fun findPrefixOp() : PrefixOpContext? = getRuleContext(solver.getType("PrefixOpContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterExpr600(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitExpr600(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitExpr600(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  expr600() : Expr600Context {
		var _localctx : Expr600Context = Expr600Context(context, state)
		enterRule(_localctx, 96, Rules.RULE_expr600.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 621
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__1) or (1L shl T__39) or (1L shl T__40) or (1L shl T__41))) != 0L)) {
				if (true){
				this.state = 620
				prefixOp()
				}
			}

			this.state = 623
			expr700()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Expr700Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_expr700.id
	        set(value) { throw RuntimeException() }
		fun findFunctionCall() : FunctionCallContext? = getRuleContext(solver.getType("FunctionCallContext"),0)
		fun findRecordExpr() : RecordExprContext? = getRuleContext(solver.getType("RecordExprContext"),0)
		fun findExpr800() : Expr800Context? = getRuleContext(solver.getType("Expr800Context"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterExpr700(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitExpr700(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitExpr700(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  expr700() : Expr700Context {
		var _localctx : Expr700Context = Expr700Context(context, state)
		enterRule(_localctx, 98, Rules.RULE_expr700.id)
		try {
			this.state = 628
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,35,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 625
			functionCall()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 626
			recordExpr(0)
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 627
			expr800()
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

	open class Expr800Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_expr800.id
	        set(value) { throw RuntimeException() }
		fun findExprMax() : List<ExprMaxContext> = getRuleContexts(solver.getType("ExprMaxContext"))
		fun findExprMax(i: Int) : ExprMaxContext? = getRuleContext(solver.getType("ExprMaxContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterExpr800(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitExpr800(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitExpr800(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  expr800() : Expr800Context {
		var _localctx : Expr800Context = Expr800Context(context, state)
		enterRule(_localctx, 100, Rules.RULE_expr800.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 630
			exprMax()
			this.state = 633
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__4) {
				if (true){
				this.state = 631
				match(T__4) as Token
				this.state = 632
				exprMax()
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

	open class ExprMaxContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_exprMax.id
	        set(value) { throw RuntimeException() }
		fun findTokVar() : TokVarContext? = getRuleContext(solver.getType("TokVarContext"),0)
		fun findAtomic() : AtomicContext? = getRuleContext(solver.getType("AtomicContext"),0)
		fun findList() : ListContext? = getRuleContext(solver.getType("ListContext"),0)
		fun findBinary() : BinaryContext? = getRuleContext(solver.getType("BinaryContext"),0)
		fun findListComprehension() : ListComprehensionContext? = getRuleContext(solver.getType("ListComprehensionContext"),0)
		fun findBinaryComprehension() : BinaryComprehensionContext? = getRuleContext(solver.getType("BinaryComprehensionContext"),0)
		fun findTuple() : TupleContext? = getRuleContext(solver.getType("TupleContext"),0)
		fun findExpr() : ExprContext? = getRuleContext(solver.getType("ExprContext"),0)
		fun findExprs() : ExprsContext? = getRuleContext(solver.getType("ExprsContext"),0)
		fun findIfExpr() : IfExprContext? = getRuleContext(solver.getType("IfExprContext"),0)
		fun findCaseExpr() : CaseExprContext? = getRuleContext(solver.getType("CaseExprContext"),0)
		fun findReceiveExpr() : ReceiveExprContext? = getRuleContext(solver.getType("ReceiveExprContext"),0)
		fun findFunExpr() : FunExprContext? = getRuleContext(solver.getType("FunExprContext"),0)
		fun findTryExpr() : TryExprContext? = getRuleContext(solver.getType("TryExprContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterExprMax(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitExprMax(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitExprMax(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  exprMax() : ExprMaxContext {
		var _localctx : ExprMaxContext = ExprMaxContext(context, state)
		enterRule(_localctx, 102, Rules.RULE_exprMax.id)
		try {
			this.state = 655
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,37,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 635
			tokVar()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 636
			atomic()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 637
			list()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 638
			binary()
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 639
			listComprehension()
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 640
			binaryComprehension()
			}}
			7 -> {
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 641
			tuple()
			}}
			8 -> {
			enterOuterAlt(_localctx, 8)
			if (true){
			this.state = 642
			match(T__2) as Token
			this.state = 643
			expr()
			this.state = 644
			match(T__3) as Token
			}}
			9 -> {
			enterOuterAlt(_localctx, 9)
			if (true){
			this.state = 646
			match(T__28) as Token
			this.state = 647
			exprs()
			this.state = 648
			match(T__29) as Token
			}}
			10 -> {
			enterOuterAlt(_localctx, 10)
			if (true){
			this.state = 650
			ifExpr()
			}}
			11 -> {
			enterOuterAlt(_localctx, 11)
			if (true){
			this.state = 651
			caseExpr()
			}}
			12 -> {
			enterOuterAlt(_localctx, 12)
			if (true){
			this.state = 652
			receiveExpr()
			}}
			13 -> {
			enterOuterAlt(_localctx, 13)
			if (true){
			this.state = 653
			funExpr()
			}}
			14 -> {
			enterOuterAlt(_localctx, 14)
			if (true){
			this.state = 654
			tryExpr()
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

	open class ListContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_list.id
	        set(value) { throw RuntimeException() }
		fun findExpr() : ExprContext? = getRuleContext(solver.getType("ExprContext"),0)
		fun findTail() : TailContext? = getRuleContext(solver.getType("TailContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterList(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitList(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitList(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  list() : ListContext {
		var _localctx : ListContext = ListContext(context, state)
		enterRule(_localctx, 104, Rules.RULE_list.id)
		try {
			this.state = 663
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,38,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 657
			match(T__14) as Token
			this.state = 658
			match(T__15) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 659
			match(T__14) as Token
			this.state = 660
			expr()
			this.state = 661
			tail()
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

	open class TailContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_tail.id
	        set(value) { throw RuntimeException() }
		fun findExpr() : ExprContext? = getRuleContext(solver.getType("ExprContext"),0)
		fun findTail() : TailContext? = getRuleContext(solver.getType("TailContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterTail(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitTail(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitTail(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  tail() : TailContext {
		var _localctx : TailContext = TailContext(context, state)
		enterRule(_localctx, 106, Rules.RULE_tail.id)
		try {
			this.state = 674
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			T__15  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 665
			match(T__15) as Token
			}}
			T__12  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 666
			match(T__12) as Token
			this.state = 667
			expr()
			this.state = 668
			match(T__15) as Token
			}}
			T__7  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 670
			match(T__7) as Token
			this.state = 671
			expr()
			this.state = 672
			tail()
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

	open class BinaryContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_binary.id
	        set(value) { throw RuntimeException() }
		fun findBinElements() : BinElementsContext? = getRuleContext(solver.getType("BinElementsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterBinary(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitBinary(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitBinary(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  binary() : BinaryContext {
		var _localctx : BinaryContext = BinaryContext(context, state)
		enterRule(_localctx, 108, Rules.RULE_binary.id)
		try {
			this.state = 682
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,40,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 676
			match(T__20) as Token
			this.state = 677
			match(T__21) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 678
			match(T__20) as Token
			this.state = 679
			binElements()
			this.state = 680
			match(T__21) as Token
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

	open class BinElementsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_binElements.id
	        set(value) { throw RuntimeException() }
		fun findBinElement() : List<BinElementContext> = getRuleContexts(solver.getType("BinElementContext"))
		fun findBinElement(i: Int) : BinElementContext? = getRuleContext(solver.getType("BinElementContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterBinElements(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitBinElements(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitBinElements(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  binElements() : BinElementsContext {
		var _localctx : BinElementsContext = BinElementsContext(context, state)
		enterRule(_localctx, 110, Rules.RULE_binElements.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 684
			binElement()
			this.state = 689
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__7) {
				if (true){
				if (true){
				this.state = 685
				match(T__7) as Token
				this.state = 686
				binElement()
				}
				}
				this.state = 691
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

	open class BinElementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_binElement.id
	        set(value) { throw RuntimeException() }
		fun findBitExpr() : BitExprContext? = getRuleContext(solver.getType("BitExprContext"),0)
		fun findOptBitSizeExpr() : OptBitSizeExprContext? = getRuleContext(solver.getType("OptBitSizeExprContext"),0)
		fun findOptBitTypeList() : OptBitTypeListContext? = getRuleContext(solver.getType("OptBitTypeListContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterBinElement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitBinElement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitBinElement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  binElement() : BinElementContext {
		var _localctx : BinElementContext = BinElementContext(context, state)
		enterRule(_localctx, 112, Rules.RULE_binElement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 692
			bitExpr()
			this.state = 693
			optBitSizeExpr()
			this.state = 694
			optBitTypeList()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class BitExprContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_bitExpr.id
	        set(value) { throw RuntimeException() }
		fun findExprMax() : ExprMaxContext? = getRuleContext(solver.getType("ExprMaxContext"),0)
		fun findPrefixOp() : PrefixOpContext? = getRuleContext(solver.getType("PrefixOpContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterBitExpr(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitBitExpr(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitBitExpr(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  bitExpr() : BitExprContext {
		var _localctx : BitExprContext = BitExprContext(context, state)
		enterRule(_localctx, 114, Rules.RULE_bitExpr.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 697
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__1) or (1L shl T__39) or (1L shl T__40) or (1L shl T__41))) != 0L)) {
				if (true){
				this.state = 696
				prefixOp()
				}
			}

			this.state = 699
			exprMax()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class OptBitSizeExprContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_optBitSizeExpr.id
	        set(value) { throw RuntimeException() }
		fun findBitSizeExpr() : BitSizeExprContext? = getRuleContext(solver.getType("BitSizeExprContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterOptBitSizeExpr(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitOptBitSizeExpr(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitOptBitSizeExpr(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  optBitSizeExpr() : OptBitSizeExprContext {
		var _localctx : OptBitSizeExprContext = OptBitSizeExprContext(context, state)
		enterRule(_localctx, 116, Rules.RULE_optBitSizeExpr.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 703
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__4) {
				if (true){
				this.state = 701
				match(T__4) as Token
				this.state = 702
				bitSizeExpr()
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

	open class OptBitTypeListContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_optBitTypeList.id
	        set(value) { throw RuntimeException() }
		fun findBitTypeList() : BitTypeListContext? = getRuleContext(solver.getType("BitTypeListContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterOptBitTypeList(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitOptBitTypeList(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitOptBitTypeList(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  optBitTypeList() : OptBitTypeListContext {
		var _localctx : OptBitTypeListContext = OptBitTypeListContext(context, state)
		enterRule(_localctx, 118, Rules.RULE_optBitTypeList.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 707
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__5) {
				if (true){
				this.state = 705
				match(T__5) as Token
				this.state = 706
				bitTypeList()
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

	open class BitTypeListContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_bitTypeList.id
	        set(value) { throw RuntimeException() }
		fun findBitType() : List<BitTypeContext> = getRuleContexts(solver.getType("BitTypeContext"))
		fun findBitType(i: Int) : BitTypeContext? = getRuleContext(solver.getType("BitTypeContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterBitTypeList(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitBitTypeList(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitBitTypeList(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  bitTypeList() : BitTypeListContext {
		var _localctx : BitTypeListContext = BitTypeListContext(context, state)
		enterRule(_localctx, 120, Rules.RULE_bitTypeList.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 709
			bitType()
			this.state = 714
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__1) {
				if (true){
				if (true){
				this.state = 710
				match(T__1) as Token
				this.state = 711
				bitType()
				}
				}
				this.state = 716
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

	open class BitTypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_bitType.id
	        set(value) { throw RuntimeException() }
		fun findTokAtom() : TokAtomContext? = getRuleContext(solver.getType("TokAtomContext"),0)
		fun findTokInteger() : TokIntegerContext? = getRuleContext(solver.getType("TokIntegerContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterBitType(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitBitType(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitBitType(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  bitType() : BitTypeContext {
		var _localctx : BitTypeContext = BitTypeContext(context, state)
		enterRule(_localctx, 122, Rules.RULE_bitType.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 717
			tokAtom()
			this.state = 720
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__4) {
				if (true){
				this.state = 718
				match(T__4) as Token
				this.state = 719
				tokInteger()
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

	open class BitSizeExprContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_bitSizeExpr.id
	        set(value) { throw RuntimeException() }
		fun findExprMax() : ExprMaxContext? = getRuleContext(solver.getType("ExprMaxContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterBitSizeExpr(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitBitSizeExpr(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitBitSizeExpr(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  bitSizeExpr() : BitSizeExprContext {
		var _localctx : BitSizeExprContext = BitSizeExprContext(context, state)
		enterRule(_localctx, 124, Rules.RULE_bitSizeExpr.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 722
			exprMax()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ListComprehensionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_listComprehension.id
	        set(value) { throw RuntimeException() }
		fun findExpr() : ExprContext? = getRuleContext(solver.getType("ExprContext"),0)
		fun findLcExprs() : LcExprsContext? = getRuleContext(solver.getType("LcExprsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterListComprehension(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitListComprehension(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitListComprehension(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  listComprehension() : ListComprehensionContext {
		var _localctx : ListComprehensionContext = ListComprehensionContext(context, state)
		enterRule(_localctx, 126, Rules.RULE_listComprehension.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 724
			match(T__14) as Token
			this.state = 725
			expr()
			this.state = 726
			match(T__30) as Token
			this.state = 727
			lcExprs()
			this.state = 728
			match(T__15) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class BinaryComprehensionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_binaryComprehension.id
	        set(value) { throw RuntimeException() }
		fun findBinary() : BinaryContext? = getRuleContext(solver.getType("BinaryContext"),0)
		fun findLcExprs() : LcExprsContext? = getRuleContext(solver.getType("LcExprsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterBinaryComprehension(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitBinaryComprehension(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitBinaryComprehension(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  binaryComprehension() : BinaryComprehensionContext {
		var _localctx : BinaryComprehensionContext = BinaryComprehensionContext(context, state)
		enterRule(_localctx, 128, Rules.RULE_binaryComprehension.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 730
			match(T__20) as Token
			this.state = 731
			binary()
			this.state = 732
			match(T__30) as Token
			this.state = 733
			lcExprs()
			this.state = 734
			match(T__21) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class LcExprsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_lcExprs.id
	        set(value) { throw RuntimeException() }
		fun findLcExpr() : List<LcExprContext> = getRuleContexts(solver.getType("LcExprContext"))
		fun findLcExpr(i: Int) : LcExprContext? = getRuleContext(solver.getType("LcExprContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterLcExprs(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitLcExprs(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitLcExprs(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  lcExprs() : LcExprsContext {
		var _localctx : LcExprsContext = LcExprsContext(context, state)
		enterRule(_localctx, 130, Rules.RULE_lcExprs.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 736
			lcExpr()
			this.state = 741
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__7) {
				if (true){
				if (true){
				this.state = 737
				match(T__7) as Token
				this.state = 738
				lcExpr()
				}
				}
				this.state = 743
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

	open class LcExprContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_lcExpr.id
	        set(value) { throw RuntimeException() }
		fun findExpr() : List<ExprContext> = getRuleContexts(solver.getType("ExprContext"))
		fun findExpr(i: Int) : ExprContext? = getRuleContext(solver.getType("ExprContext"),i)
		fun findBinary() : BinaryContext? = getRuleContext(solver.getType("BinaryContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterLcExpr(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitLcExpr(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitLcExpr(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  lcExpr() : LcExprContext {
		var _localctx : LcExprContext = LcExprContext(context, state)
		enterRule(_localctx, 132, Rules.RULE_lcExpr.id)
		try {
			this.state = 753
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,48,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 744
			expr()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 745
			expr()
			this.state = 746
			match(T__31) as Token
			this.state = 747
			expr()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 749
			binary()
			this.state = 750
			match(T__32) as Token
			this.state = 751
			expr()
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

	open class TupleContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_tuple.id
	        set(value) { throw RuntimeException() }
		fun findExprs() : ExprsContext? = getRuleContext(solver.getType("ExprsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterTuple(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitTuple(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitTuple(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  tuple() : TupleContext {
		var _localctx : TupleContext = TupleContext(context, state)
		enterRule(_localctx, 134, Rules.RULE_tuple.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 755
			match(T__8) as Token
			this.state = 757
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__1) or (1L shl T__2) or (1L shl T__8) or (1L shl T__14) or (1L shl T__17) or (1L shl T__18) or (1L shl T__20) or (1L shl T__23) or (1L shl T__28) or (1L shl T__33) or (1L shl T__34) or (1L shl T__36) or (1L shl T__38) or (1L shl T__39) or (1L shl T__40) or (1L shl T__41))) != 0L) || ((((_la - 64)) and 0x3f.inv()) == 0 && ((1L shl (_la - 64)) and ((1L shl (TokAtom - 64)) or (1L shl (TokVar - 64)) or (1L shl (TokFloat - 64)) or (1L shl (TokInteger - 64)) or (1L shl (TokChar - 64)) or (1L shl (TokString - 64)))) != 0L)) {
				if (true){
				this.state = 756
				exprs()
				}
			}

			this.state = 759
			match(T__9) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class RecordExprContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_recordExpr.id
	        set(value) { throw RuntimeException() }
		fun findTokAtom() : List<TokAtomContext> = getRuleContexts(solver.getType("TokAtomContext"))
		fun findTokAtom(i: Int) : TokAtomContext? = getRuleContext(solver.getType("TokAtomContext"),i)
		fun findRecordTuple() : RecordTupleContext? = getRuleContext(solver.getType("RecordTupleContext"),0)
		fun findExprMax() : ExprMaxContext? = getRuleContext(solver.getType("ExprMaxContext"),0)
		fun findRecordExpr() : RecordExprContext? = getRuleContext(solver.getType("RecordExprContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterRecordExpr(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitRecordExpr(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitRecordExpr(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun recordExpr() : RecordExprContext {
		return recordExpr(0);
	}

	private fun recordExpr(_p: Int) : RecordExprContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : RecordExprContext= RecordExprContext(context, _parentState)
		var _prevctx : RecordExprContext= _localctx
		var _startState : Int = 136
		enterRecursionRule(_localctx, 136, Rules.RULE_recordExpr.id, _p)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 763
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__2) or (1L shl T__8) or (1L shl T__14) or (1L shl T__18) or (1L shl T__20) or (1L shl T__28) or (1L shl T__33) or (1L shl T__34) or (1L shl T__36) or (1L shl T__38))) != 0L) || ((((_la - 64)) and 0x3f.inv()) == 0 && ((1L shl (_la - 64)) and ((1L shl (TokAtom - 64)) or (1L shl (TokVar - 64)) or (1L shl (TokFloat - 64)) or (1L shl (TokInteger - 64)) or (1L shl (TokChar - 64)) or (1L shl (TokString - 64)))) != 0L)) {
				if (true){
				this.state = 762
				exprMax()
				}
			}

			this.state = 765
			match(T__17) as Token
			this.state = 766
			tokAtom()
			this.state = 770
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			T__0  ->  /*LL1AltBlock*/{if (true){
			this.state = 767
			match(T__0) as Token
			this.state = 768
			tokAtom()
			}}
			T__8  ->  /*LL1AltBlock*/{if (true){
			this.state = 769
			recordTuple()
			}}
			else -> throw NoViableAltException(this)
			}
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 782
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,53,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					if (true){
					_localctx = RecordExprContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_recordExpr.id)
					this.state = 772
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 773
					match(T__17) as Token
					this.state = 774
					tokAtom()
					this.state = 778
					errorHandler.sync(this)
					when (_input!!.LA(1)) {
					T__0  ->  /*LL1AltBlock*/{if (true){
					this.state = 775
					match(T__0) as Token
					this.state = 776
					tokAtom()
					}}
					T__8  ->  /*LL1AltBlock*/{if (true){
					this.state = 777
					recordTuple()
					}}
					else -> throw NoViableAltException(this)
					}
					}
					} 
				}
				this.state = 784
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,53,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class RecordTupleContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_recordTuple.id
	        set(value) { throw RuntimeException() }
		fun findRecordFields() : RecordFieldsContext? = getRuleContext(solver.getType("RecordFieldsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterRecordTuple(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitRecordTuple(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitRecordTuple(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  recordTuple() : RecordTupleContext {
		var _localctx : RecordTupleContext = RecordTupleContext(context, state)
		enterRule(_localctx, 138, Rules.RULE_recordTuple.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 785
			match(T__8) as Token
			this.state = 787
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==TokAtom || _la==TokVar) {
				if (true){
				this.state = 786
				recordFields()
				}
			}

			this.state = 789
			match(T__9) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class RecordFieldsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_recordFields.id
	        set(value) { throw RuntimeException() }
		fun findRecordField() : List<RecordFieldContext> = getRuleContexts(solver.getType("RecordFieldContext"))
		fun findRecordField(i: Int) : RecordFieldContext? = getRuleContext(solver.getType("RecordFieldContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterRecordFields(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitRecordFields(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitRecordFields(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  recordFields() : RecordFieldsContext {
		var _localctx : RecordFieldsContext = RecordFieldsContext(context, state)
		enterRule(_localctx, 140, Rules.RULE_recordFields.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 791
			recordField()
			this.state = 796
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__7) {
				if (true){
				if (true){
				this.state = 792
				match(T__7) as Token
				this.state = 793
				recordField()
				}
				}
				this.state = 798
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

	open class RecordFieldContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_recordField.id
	        set(value) { throw RuntimeException() }
		fun findExpr() : ExprContext? = getRuleContext(solver.getType("ExprContext"),0)
		fun findTokVar() : TokVarContext? = getRuleContext(solver.getType("TokVarContext"),0)
		fun findTokAtom() : TokAtomContext? = getRuleContext(solver.getType("TokAtomContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterRecordField(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitRecordField(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitRecordField(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  recordField() : RecordFieldContext {
		var _localctx : RecordFieldContext = RecordFieldContext(context, state)
		enterRule(_localctx, 142, Rules.RULE_recordField.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 801
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			TokVar  ->  /*LL1AltBlock*/{if (true){
			this.state = 799
			tokVar()
			}}
			TokAtom  ->  /*LL1AltBlock*/{if (true){
			this.state = 800
			tokAtom()
			}}
			else -> throw NoViableAltException(this)
			}
			this.state = 803
			match(T__24) as Token
			this.state = 804
			expr()
			}
		}
		catch (re: RecognitionException) {
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
		fun findExpr800() : Expr800Context? = getRuleContext(solver.getType("Expr800Context"),0)
		fun findArgumentList() : ArgumentListContext? = getRuleContext(solver.getType("ArgumentListContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterFunctionCall(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitFunctionCall(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitFunctionCall(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  functionCall() : FunctionCallContext {
		var _localctx : FunctionCallContext = FunctionCallContext(context, state)
		enterRule(_localctx, 144, Rules.RULE_functionCall.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 806
			expr800()
			this.state = 807
			argumentList()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class IfExprContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_ifExpr.id
	        set(value) { throw RuntimeException() }
		fun findIfClauses() : IfClausesContext? = getRuleContext(solver.getType("IfClausesContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterIfExpr(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitIfExpr(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitIfExpr(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  ifExpr() : IfExprContext {
		var _localctx : IfExprContext = IfExprContext(context, state)
		enterRule(_localctx, 146, Rules.RULE_ifExpr.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 809
			match(T__33) as Token
			this.state = 810
			ifClauses()
			this.state = 811
			match(T__29) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class IfClausesContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_ifClauses.id
	        set(value) { throw RuntimeException() }
		fun findIfClause() : List<IfClauseContext> = getRuleContexts(solver.getType("IfClauseContext"))
		fun findIfClause(i: Int) : IfClauseContext? = getRuleContext(solver.getType("IfClauseContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterIfClauses(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitIfClauses(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitIfClauses(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  ifClauses() : IfClausesContext {
		var _localctx : IfClausesContext = IfClausesContext(context, state)
		enterRule(_localctx, 148, Rules.RULE_ifClauses.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 813
			ifClause()
			this.state = 818
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__10) {
				if (true){
				if (true){
				this.state = 814
				match(T__10) as Token
				this.state = 815
				ifClause()
				}
				}
				this.state = 820
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

	open class IfClauseContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_ifClause.id
	        set(value) { throw RuntimeException() }
		fun findGuard() : GuardContext? = getRuleContext(solver.getType("GuardContext"),0)
		fun findClauseBody() : ClauseBodyContext? = getRuleContext(solver.getType("ClauseBodyContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterIfClause(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitIfClause(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitIfClause(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  ifClause() : IfClauseContext {
		var _localctx : IfClauseContext = IfClauseContext(context, state)
		enterRule(_localctx, 150, Rules.RULE_ifClause.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 821
			guard()
			this.state = 822
			clauseBody()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class CaseExprContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_caseExpr.id
	        set(value) { throw RuntimeException() }
		fun findExpr() : ExprContext? = getRuleContext(solver.getType("ExprContext"),0)
		fun findCrClauses() : CrClausesContext? = getRuleContext(solver.getType("CrClausesContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterCaseExpr(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitCaseExpr(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitCaseExpr(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  caseExpr() : CaseExprContext {
		var _localctx : CaseExprContext = CaseExprContext(context, state)
		enterRule(_localctx, 152, Rules.RULE_caseExpr.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 824
			match(T__34) as Token
			this.state = 825
			expr()
			this.state = 826
			match(T__35) as Token
			this.state = 827
			crClauses()
			this.state = 828
			match(T__29) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class CrClausesContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_crClauses.id
	        set(value) { throw RuntimeException() }
		fun findCrClause() : List<CrClauseContext> = getRuleContexts(solver.getType("CrClauseContext"))
		fun findCrClause(i: Int) : CrClauseContext? = getRuleContext(solver.getType("CrClauseContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterCrClauses(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitCrClauses(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitCrClauses(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  crClauses() : CrClausesContext {
		var _localctx : CrClausesContext = CrClausesContext(context, state)
		enterRule(_localctx, 154, Rules.RULE_crClauses.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 830
			crClause()
			this.state = 835
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__10) {
				if (true){
				if (true){
				this.state = 831
				match(T__10) as Token
				this.state = 832
				crClause()
				}
				}
				this.state = 837
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

	open class CrClauseContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_crClause.id
	        set(value) { throw RuntimeException() }
		fun findExpr() : ExprContext? = getRuleContext(solver.getType("ExprContext"),0)
		fun findClauseGuard() : ClauseGuardContext? = getRuleContext(solver.getType("ClauseGuardContext"),0)
		fun findClauseBody() : ClauseBodyContext? = getRuleContext(solver.getType("ClauseBodyContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterCrClause(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitCrClause(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitCrClause(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  crClause() : CrClauseContext {
		var _localctx : CrClauseContext = CrClauseContext(context, state)
		enterRule(_localctx, 156, Rules.RULE_crClause.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 838
			expr()
			this.state = 839
			clauseGuard()
			this.state = 840
			clauseBody()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ReceiveExprContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_receiveExpr.id
	        set(value) { throw RuntimeException() }
		fun findCrClauses() : CrClausesContext? = getRuleContext(solver.getType("CrClausesContext"),0)
		fun findExpr() : ExprContext? = getRuleContext(solver.getType("ExprContext"),0)
		fun findClauseBody() : ClauseBodyContext? = getRuleContext(solver.getType("ClauseBodyContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterReceiveExpr(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitReceiveExpr(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitReceiveExpr(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  receiveExpr() : ReceiveExprContext {
		var _localctx : ReceiveExprContext = ReceiveExprContext(context, state)
		enterRule(_localctx, 158, Rules.RULE_receiveExpr.id)
		try {
			this.state = 859
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,59,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 842
			match(T__36) as Token
			this.state = 843
			crClauses()
			this.state = 844
			match(T__29) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 846
			match(T__36) as Token
			this.state = 847
			match(T__37) as Token
			this.state = 848
			expr()
			this.state = 849
			clauseBody()
			this.state = 850
			match(T__29) as Token
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 852
			match(T__36) as Token
			this.state = 853
			crClauses()
			this.state = 854
			match(T__37) as Token
			this.state = 855
			expr()
			this.state = 856
			clauseBody()
			this.state = 857
			match(T__29) as Token
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

	open class FunExprContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_funExpr.id
	        set(value) { throw RuntimeException() }
		fun findTokAtom() : TokAtomContext? = getRuleContext(solver.getType("TokAtomContext"),0)
		fun findTokInteger() : TokIntegerContext? = getRuleContext(solver.getType("TokIntegerContext"),0)
		fun findAtomOrVar() : List<AtomOrVarContext> = getRuleContexts(solver.getType("AtomOrVarContext"))
		fun findAtomOrVar(i: Int) : AtomOrVarContext? = getRuleContext(solver.getType("AtomOrVarContext"),i)
		fun findIntegerOrVar() : IntegerOrVarContext? = getRuleContext(solver.getType("IntegerOrVarContext"),0)
		fun findFunClauses() : FunClausesContext? = getRuleContext(solver.getType("FunClausesContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterFunExpr(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitFunExpr(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitFunExpr(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  funExpr() : FunExprContext {
		var _localctx : FunExprContext = FunExprContext(context, state)
		enterRule(_localctx, 160, Rules.RULE_funExpr.id)
		try {
			this.state = 877
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,60,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 861
			match(T__18) as Token
			this.state = 862
			tokAtom()
			this.state = 863
			match(T__5) as Token
			this.state = 864
			tokInteger()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 866
			match(T__18) as Token
			this.state = 867
			atomOrVar()
			this.state = 868
			match(T__4) as Token
			this.state = 869
			atomOrVar()
			this.state = 870
			match(T__5) as Token
			this.state = 871
			integerOrVar()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 873
			match(T__18) as Token
			this.state = 874
			funClauses()
			this.state = 875
			match(T__29) as Token
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

	open class AtomOrVarContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_atomOrVar.id
	        set(value) { throw RuntimeException() }
		fun findTokAtom() : TokAtomContext? = getRuleContext(solver.getType("TokAtomContext"),0)
		fun findTokVar() : TokVarContext? = getRuleContext(solver.getType("TokVarContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterAtomOrVar(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitAtomOrVar(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitAtomOrVar(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  atomOrVar() : AtomOrVarContext {
		var _localctx : AtomOrVarContext = AtomOrVarContext(context, state)
		enterRule(_localctx, 162, Rules.RULE_atomOrVar.id)
		try {
			this.state = 881
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			TokAtom  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 879
			tokAtom()
			}}
			TokVar  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 880
			tokVar()
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

	open class IntegerOrVarContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_integerOrVar.id
	        set(value) { throw RuntimeException() }
		fun findTokInteger() : TokIntegerContext? = getRuleContext(solver.getType("TokIntegerContext"),0)
		fun findTokVar() : TokVarContext? = getRuleContext(solver.getType("TokVarContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterIntegerOrVar(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitIntegerOrVar(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitIntegerOrVar(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  integerOrVar() : IntegerOrVarContext {
		var _localctx : IntegerOrVarContext = IntegerOrVarContext(context, state)
		enterRule(_localctx, 164, Rules.RULE_integerOrVar.id)
		try {
			this.state = 885
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			TokInteger  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 883
			tokInteger()
			}}
			TokVar  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 884
			tokVar()
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

	open class FunClausesContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_funClauses.id
	        set(value) { throw RuntimeException() }
		fun findFunClause() : List<FunClauseContext> = getRuleContexts(solver.getType("FunClauseContext"))
		fun findFunClause(i: Int) : FunClauseContext? = getRuleContext(solver.getType("FunClauseContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterFunClauses(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitFunClauses(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitFunClauses(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  funClauses() : FunClausesContext {
		var _localctx : FunClausesContext = FunClausesContext(context, state)
		enterRule(_localctx, 166, Rules.RULE_funClauses.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 887
			funClause()
			this.state = 892
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__10) {
				if (true){
				if (true){
				this.state = 888
				match(T__10) as Token
				this.state = 889
				funClause()
				}
				}
				this.state = 894
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

	open class FunClauseContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_funClause.id
	        set(value) { throw RuntimeException() }
		fun findArgumentList() : ArgumentListContext? = getRuleContext(solver.getType("ArgumentListContext"),0)
		fun findClauseGuard() : ClauseGuardContext? = getRuleContext(solver.getType("ClauseGuardContext"),0)
		fun findClauseBody() : ClauseBodyContext? = getRuleContext(solver.getType("ClauseBodyContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterFunClause(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitFunClause(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitFunClause(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  funClause() : FunClauseContext {
		var _localctx : FunClauseContext = FunClauseContext(context, state)
		enterRule(_localctx, 168, Rules.RULE_funClause.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 895
			argumentList()
			this.state = 896
			clauseGuard()
			this.state = 897
			clauseBody()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TryExprContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_tryExpr.id
	        set(value) { throw RuntimeException() }
		fun findExprs() : ExprsContext? = getRuleContext(solver.getType("ExprsContext"),0)
		fun findTryCatch() : TryCatchContext? = getRuleContext(solver.getType("TryCatchContext"),0)
		fun findCrClauses() : CrClausesContext? = getRuleContext(solver.getType("CrClausesContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterTryExpr(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitTryExpr(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitTryExpr(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  tryExpr() : TryExprContext {
		var _localctx : TryExprContext = TryExprContext(context, state)
		enterRule(_localctx, 170, Rules.RULE_tryExpr.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 899
			match(T__38) as Token
			this.state = 900
			exprs()
			this.state = 903
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__35) {
				if (true){
				this.state = 901
				match(T__35) as Token
				this.state = 902
				crClauses()
				}
			}

			this.state = 905
			tryCatch()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TryCatchContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_tryCatch.id
	        set(value) { throw RuntimeException() }
		fun findTryClauses() : TryClausesContext? = getRuleContext(solver.getType("TryClausesContext"),0)
		fun findExprs() : ExprsContext? = getRuleContext(solver.getType("ExprsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterTryCatch(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitTryCatch(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitTryCatch(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  tryCatch() : TryCatchContext {
		var _localctx : TryCatchContext = TryCatchContext(context, state)
		enterRule(_localctx, 172, Rules.RULE_tryCatch.id)
		try {
			this.state = 921
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,65,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 907
			match(T__23) as Token
			this.state = 908
			tryClauses()
			this.state = 909
			match(T__29) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 911
			match(T__23) as Token
			this.state = 912
			tryClauses()
			this.state = 913
			match(T__37) as Token
			this.state = 914
			exprs()
			this.state = 915
			match(T__29) as Token
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 917
			match(T__37) as Token
			this.state = 918
			exprs()
			this.state = 919
			match(T__29) as Token
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

	open class TryClausesContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_tryClauses.id
	        set(value) { throw RuntimeException() }
		fun findTryClause() : List<TryClauseContext> = getRuleContexts(solver.getType("TryClauseContext"))
		fun findTryClause(i: Int) : TryClauseContext? = getRuleContext(solver.getType("TryClauseContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterTryClauses(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitTryClauses(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitTryClauses(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  tryClauses() : TryClausesContext {
		var _localctx : TryClausesContext = TryClausesContext(context, state)
		enterRule(_localctx, 174, Rules.RULE_tryClauses.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 923
			tryClause()
			this.state = 928
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__10) {
				if (true){
				if (true){
				this.state = 924
				match(T__10) as Token
				this.state = 925
				tryClause()
				}
				}
				this.state = 930
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

	open class TryClauseContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_tryClause.id
	        set(value) { throw RuntimeException() }
		fun findExpr() : ExprContext? = getRuleContext(solver.getType("ExprContext"),0)
		fun findClauseGuard() : ClauseGuardContext? = getRuleContext(solver.getType("ClauseGuardContext"),0)
		fun findClauseBody() : ClauseBodyContext? = getRuleContext(solver.getType("ClauseBodyContext"),0)
		fun findAtomOrVar() : AtomOrVarContext? = getRuleContext(solver.getType("AtomOrVarContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterTryClause(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitTryClause(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitTryClause(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  tryClause() : TryClauseContext {
		var _localctx : TryClauseContext = TryClauseContext(context, state)
		enterRule(_localctx, 176, Rules.RULE_tryClause.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 934
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,67,context) ) {
			1   -> if (true){
			this.state = 931
			atomOrVar()
			this.state = 932
			match(T__4) as Token
			}
			}
			this.state = 936
			expr()
			this.state = 937
			clauseGuard()
			this.state = 938
			clauseBody()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ArgumentListContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_argumentList.id
	        set(value) { throw RuntimeException() }
		fun findExprs() : ExprsContext? = getRuleContext(solver.getType("ExprsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterArgumentList(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitArgumentList(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitArgumentList(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  argumentList() : ArgumentListContext {
		var _localctx : ArgumentListContext = ArgumentListContext(context, state)
		enterRule(_localctx, 178, Rules.RULE_argumentList.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 940
			match(T__2) as Token
			this.state = 942
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__1) or (1L shl T__2) or (1L shl T__8) or (1L shl T__14) or (1L shl T__17) or (1L shl T__18) or (1L shl T__20) or (1L shl T__23) or (1L shl T__28) or (1L shl T__33) or (1L shl T__34) or (1L shl T__36) or (1L shl T__38) or (1L shl T__39) or (1L shl T__40) or (1L shl T__41))) != 0L) || ((((_la - 64)) and 0x3f.inv()) == 0 && ((1L shl (_la - 64)) and ((1L shl (TokAtom - 64)) or (1L shl (TokVar - 64)) or (1L shl (TokFloat - 64)) or (1L shl (TokInteger - 64)) or (1L shl (TokChar - 64)) or (1L shl (TokString - 64)))) != 0L)) {
				if (true){
				this.state = 941
				exprs()
				}
			}

			this.state = 944
			match(T__3) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ExprsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_exprs.id
	        set(value) { throw RuntimeException() }
		fun findExpr() : List<ExprContext> = getRuleContexts(solver.getType("ExprContext"))
		fun findExpr(i: Int) : ExprContext? = getRuleContext(solver.getType("ExprContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterExprs(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitExprs(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitExprs(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  exprs() : ExprsContext {
		var _localctx : ExprsContext = ExprsContext(context, state)
		enterRule(_localctx, 180, Rules.RULE_exprs.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 946
			expr()
			this.state = 951
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__7) {
				if (true){
				if (true){
				this.state = 947
				match(T__7) as Token
				this.state = 948
				expr()
				}
				}
				this.state = 953
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

	open class GuardContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_guard.id
	        set(value) { throw RuntimeException() }
		fun findExprs() : List<ExprsContext> = getRuleContexts(solver.getType("ExprsContext"))
		fun findExprs(i: Int) : ExprsContext? = getRuleContext(solver.getType("ExprsContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterGuard(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitGuard(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitGuard(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  guard() : GuardContext {
		var _localctx : GuardContext = GuardContext(context, state)
		enterRule(_localctx, 182, Rules.RULE_guard.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 954
			exprs()
			this.state = 959
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__10) {
				if (true){
				if (true){
				this.state = 955
				match(T__10) as Token
				this.state = 956
				exprs()
				}
				}
				this.state = 961
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

	open class AtomicContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_atomic.id
	        set(value) { throw RuntimeException() }
		fun findTokChar() : TokCharContext? = getRuleContext(solver.getType("TokCharContext"),0)
		fun findTokInteger() : TokIntegerContext? = getRuleContext(solver.getType("TokIntegerContext"),0)
		fun findTokFloat() : TokFloatContext? = getRuleContext(solver.getType("TokFloatContext"),0)
		fun findTokAtom() : TokAtomContext? = getRuleContext(solver.getType("TokAtomContext"),0)
		fun findTokString() : List<TokStringContext> = getRuleContexts(solver.getType("TokStringContext"))
		fun findTokString(i: Int) : TokStringContext? = getRuleContext(solver.getType("TokStringContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterAtomic(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitAtomic(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitAtomic(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  atomic() : AtomicContext {
		var _localctx : AtomicContext = AtomicContext(context, state)
		enterRule(_localctx, 184, Rules.RULE_atomic.id)
		var _la: Int
		try {
			this.state = 971
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			TokChar  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 962
			tokChar()
			}}
			TokInteger  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 963
			tokInteger()
			}}
			TokFloat  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 964
			tokFloat()
			}}
			TokAtom  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 965
			tokAtom()
			}}
			TokString  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 967 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 966
				tokString()
				}
				}
				this.state = 969 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==TokString )
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

	open class PrefixOpContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_prefixOp.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterPrefixOp(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitPrefixOp(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitPrefixOp(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  prefixOp() : PrefixOpContext {
		var _localctx : PrefixOpContext = PrefixOpContext(context, state)
		enterRule(_localctx, 186, Rules.RULE_prefixOp.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 973
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__1) or (1L shl T__39) or (1L shl T__40) or (1L shl T__41))) != 0L)) ) {
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

	open class MultOpContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_multOp.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterMultOp(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitMultOp(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitMultOp(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  multOp() : MultOpContext {
		var _localctx : MultOpContext = MultOpContext(context, state)
		enterRule(_localctx, 188, Rules.RULE_multOp.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 975
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__5) or (1L shl T__22) or (1L shl T__42) or (1L shl T__43) or (1L shl T__44) or (1L shl T__45))) != 0L)) ) {
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

	open class AddOpContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_addOp.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterAddOp(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitAddOp(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitAddOp(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  addOp() : AddOpContext {
		var _localctx : AddOpContext = AddOpContext(context, state)
		enterRule(_localctx, 190, Rules.RULE_addOp.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 977
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__1) or (1L shl T__39) or (1L shl T__46) or (1L shl T__47) or (1L shl T__48) or (1L shl T__49) or (1L shl T__50) or (1L shl T__51))) != 0L)) ) {
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

	open class ListOpContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_listOp.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterListOp(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitListOp(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitListOp(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  listOp() : ListOpContext {
		var _localctx : ListOpContext = ListOpContext(context, state)
		enterRule(_localctx, 192, Rules.RULE_listOp.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 979
			_la = _input!!.LA(1)
			if ( !(_la==T__52 || _la==T__53) ) {
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

	open class CompOpContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_compOp.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterCompOp(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitCompOp(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitCompOp(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  compOp() : CompOpContext {
		var _localctx : CompOpContext = CompOpContext(context, state)
		enterRule(_localctx, 194, Rules.RULE_compOp.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 981
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__54) or (1L shl T__55) or (1L shl T__56) or (1L shl T__57) or (1L shl T__58) or (1L shl T__59) or (1L shl T__60) or (1L shl T__61))) != 0L)) ) {
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

	open class RuleClausesContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_ruleClauses.id
	        set(value) { throw RuntimeException() }
		fun findRuleClause() : List<RuleClauseContext> = getRuleContexts(solver.getType("RuleClauseContext"))
		fun findRuleClause(i: Int) : RuleClauseContext? = getRuleContext(solver.getType("RuleClauseContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterRuleClauses(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitRuleClauses(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitRuleClauses(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  ruleClauses() : RuleClausesContext {
		var _localctx : RuleClausesContext = RuleClausesContext(context, state)
		enterRule(_localctx, 196, Rules.RULE_ruleClauses.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 983
			ruleClause()
			this.state = 988
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__10) {
				if (true){
				if (true){
				this.state = 984
				match(T__10) as Token
				this.state = 985
				ruleClause()
				}
				}
				this.state = 990
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

	open class RuleClauseContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_ruleClause.id
	        set(value) { throw RuntimeException() }
		fun findTokAtom() : TokAtomContext? = getRuleContext(solver.getType("TokAtomContext"),0)
		fun findClauseArgs() : ClauseArgsContext? = getRuleContext(solver.getType("ClauseArgsContext"),0)
		fun findClauseGuard() : ClauseGuardContext? = getRuleContext(solver.getType("ClauseGuardContext"),0)
		fun findRuleBody() : RuleBodyContext? = getRuleContext(solver.getType("RuleBodyContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterRuleClause(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitRuleClause(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitRuleClause(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  ruleClause() : RuleClauseContext {
		var _localctx : RuleClauseContext = RuleClauseContext(context, state)
		enterRule(_localctx, 198, Rules.RULE_ruleClause.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 991
			tokAtom()
			this.state = 992
			clauseArgs()
			this.state = 993
			clauseGuard()
			this.state = 994
			ruleBody()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class RuleBodyContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_ruleBody.id
	        set(value) { throw RuntimeException() }
		fun findLcExprs() : LcExprsContext? = getRuleContext(solver.getType("LcExprsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).enterRuleBody(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ErlangListener ) (listener as ErlangListener).exitRuleBody(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ErlangVisitor ) return (visitor as ErlangVisitor<out T>).visitRuleBody(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  ruleBody() : RuleBodyContext {
		var _localctx : RuleBodyContext = RuleBodyContext(context, state)
		enterRule(_localctx, 200, Rules.RULE_ruleBody.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 996
			match(T__62) as Token
			this.state = 997
			lcExprs()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	override fun sempred(_localctx: RuleContext?, ruleIndex: Int, predIndex: Int) : Boolean {
		when (ruleIndex) {
		23 -> return type300_sempred(_localctx as Type300Context, predIndex)
		24 -> return type400_sempred(_localctx as Type400Context, predIndex)
		68 -> return recordExpr_sempred(_localctx as RecordExprContext, predIndex)
		}
		return true
	}
	private fun type300_sempred( _localctx : Type300Context, predIndex: Int) : Boolean {
		when (predIndex) {
		    0 -> return precpred(context!!, 2)
		}
		return true
	}
	private fun type400_sempred( _localctx : Type400Context, predIndex: Int) : Boolean {
		when (predIndex) {
		    1 -> return precpred(context!!, 2)
		}
		return true
	}
	private fun recordExpr_sempred( _localctx : RecordExprContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    2 -> return precpred(context!!, 1)
		}
		return true
	}

}