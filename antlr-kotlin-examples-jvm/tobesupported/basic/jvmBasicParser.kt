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

class jvmBasicParser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(jvmBasicParser.ProgContext::class,
                                                              jvmBasicParser.LineContext::class,
                                                              jvmBasicParser.AmperoperContext::class,
                                                              jvmBasicParser.LinenumberContext::class,
                                                              jvmBasicParser.AmprstmtContext::class,
                                                              jvmBasicParser.StatementContext::class,
                                                              jvmBasicParser.VardeclContext::class,
                                                              jvmBasicParser.Printstmt1Context::class,
                                                              jvmBasicParser.PrintlistContext::class,
                                                              jvmBasicParser.GetstmtContext::class,
                                                              jvmBasicParser.LetstmtContext::class,
                                                              jvmBasicParser.VariableassignmentContext::class,
                                                              jvmBasicParser.RelopContext::class,
                                                              jvmBasicParser.NeqContext::class,
                                                              jvmBasicParser.IfstmtContext::class,
                                                              jvmBasicParser.Forstmt1Context::class,
                                                              jvmBasicParser.Forstmt2Context::class,
                                                              jvmBasicParser.NextstmtContext::class,
                                                              jvmBasicParser.InputstmtContext::class,
                                                              jvmBasicParser.ReadstmtContext::class,
                                                              jvmBasicParser.DimstmtContext::class,
                                                              jvmBasicParser.GotostmtContext::class,
                                                              jvmBasicParser.GosubstmtContext::class,
                                                              jvmBasicParser.PokestmtContext::class,
                                                              jvmBasicParser.CallstmtContext::class,
                                                              jvmBasicParser.HplotstmtContext::class,
                                                              jvmBasicParser.VplotstmtContext::class,
                                                              jvmBasicParser.PlotstmtContext::class,
                                                              jvmBasicParser.OngotostmtContext::class,
                                                              jvmBasicParser.OngosubstmtContext::class,
                                                              jvmBasicParser.VtabstmntContext::class,
                                                              jvmBasicParser.HtabstmntContext::class,
                                                              jvmBasicParser.HimemstmtContext::class,
                                                              jvmBasicParser.LomemstmtContext::class,
                                                              jvmBasicParser.DatastmtContext::class,
                                                              jvmBasicParser.DatumContext::class,
                                                              jvmBasicParser.WaitstmtContext::class,
                                                              jvmBasicParser.XdrawstmtContext::class,
                                                              jvmBasicParser.DrawstmtContext::class,
                                                              jvmBasicParser.DefstmtContext::class,
                                                              jvmBasicParser.TabstmtContext::class,
                                                              jvmBasicParser.SpeedstmtContext::class,
                                                              jvmBasicParser.RotstmtContext::class,
                                                              jvmBasicParser.ScalestmtContext::class,
                                                              jvmBasicParser.ColorstmtContext::class,
                                                              jvmBasicParser.HcolorstmtContext::class,
                                                              jvmBasicParser.HlinstmtContext::class,
                                                              jvmBasicParser.VlinstmtContext::class,
                                                              jvmBasicParser.OnerrstmtContext::class,
                                                              jvmBasicParser.PrstmtContext::class,
                                                              jvmBasicParser.InstmtContext::class,
                                                              jvmBasicParser.StorestmtContext::class,
                                                              jvmBasicParser.RecallstmtContext::class,
                                                              jvmBasicParser.ListstmtContext::class,
                                                              jvmBasicParser.PopstmtContext::class,
                                                              jvmBasicParser.AmptstmtContext::class,
                                                              jvmBasicParser.IncludestmtContext::class,
                                                              jvmBasicParser.EndstmtContext::class,
                                                              jvmBasicParser.ReturnstmtContext::class,
                                                              jvmBasicParser.RestorestmtContext::class,
                                                              jvmBasicParser.NumberContext::class,
                                                              jvmBasicParser.FuncContext::class,
                                                              jvmBasicParser.SignExpressionContext::class,
                                                              jvmBasicParser.ExponentExpressionContext::class,
                                                              jvmBasicParser.MultiplyingExpressionContext::class,
                                                              jvmBasicParser.AddingExpressionContext::class,
                                                              jvmBasicParser.RelationalExpressionContext::class,
                                                              jvmBasicParser.ExpressionContext::class,
                                                              jvmBasicParser.VarContext::class,
                                                              jvmBasicParser.VarnameContext::class,
                                                              jvmBasicParser.VarsuffixContext::class,
                                                              jvmBasicParser.VarlistContext::class,
                                                              jvmBasicParser.ExprlistContext::class,
                                                              jvmBasicParser.SqrfuncContext::class,
                                                              jvmBasicParser.ChrfuncContext::class,
                                                              jvmBasicParser.LenfuncContext::class,
                                                              jvmBasicParser.AscfuncContext::class,
                                                              jvmBasicParser.MidfuncContext::class,
                                                              jvmBasicParser.PdlfuncContext::class,
                                                              jvmBasicParser.PeekfuncContext::class,
                                                              jvmBasicParser.IntfuncContext::class,
                                                              jvmBasicParser.SpcfuncContext::class,
                                                              jvmBasicParser.FrefuncContext::class,
                                                              jvmBasicParser.PosfuncContext::class,
                                                              jvmBasicParser.UsrfuncContext::class,
                                                              jvmBasicParser.LeftfuncContext::class,
                                                              jvmBasicParser.RightfuncContext::class,
                                                              jvmBasicParser.StrfuncContext::class,
                                                              jvmBasicParser.FnfuncContext::class,
                                                              jvmBasicParser.ValfuncContext::class,
                                                              jvmBasicParser.ScrnfuncContext::class,
                                                              jvmBasicParser.SinfuncContext::class,
                                                              jvmBasicParser.CosfuncContext::class,
                                                              jvmBasicParser.TanfuncContext::class,
                                                              jvmBasicParser.AtnfuncContext::class,
                                                              jvmBasicParser.RndfuncContext::class,
                                                              jvmBasicParser.SgnfuncContext::class,
                                                              jvmBasicParser.ExpfuncContext::class,
                                                              jvmBasicParser.LogfuncContext::class,
                                                              jvmBasicParser.AbsfuncContext::class,
                                                              jvmBasicParser.TabfuncContext::class)
    }

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "jvmBasic.g4"

    override val tokenNames: Array<String?>?
        get() = jvmBasicParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = jvmBasicParser.Companion.ruleNames
    override val atn: ATN
        get() = jvmBasicParser.Companion.ATN

    enum class Tokens(val id: Int) {
        EOF(-1),
        DOLLAR(1),
        PERCENT(2),
        RETURN(3),
        PRINT(4),
        GOTO(5),
        GOSUB(6),
        IF(7),
        NEXT(8),
        THEN(9),
        REM(10),
        CHR(11),
        MID(12),
        LEFT(13),
        RIGHT(14),
        STR(15),
        LPAREN(16),
        RPAREN(17),
        PLUS(18),
        MINUS(19),
        TIMES(20),
        DIV(21),
        CLEAR(22),
        GTE(23),
        LTE(24),
        GT(25),
        LT(26),
        COMMA(27),
        LIST(28),
        RUN(29),
        END(30),
        LET(31),
        EQ(32),
        FOR(33),
        TO(34),
        STEP(35),
        INPUT(36),
        SEMICOLON(37),
        DIM(38),
        SQR(39),
        COLON(40),
        TEXT(41),
        HGR(42),
        HGR2(43),
        LEN(44),
        CALL(45),
        ASC(46),
        HPLOT(47),
        VPLOT(48),
        PRNUMBER(49),
        INNUMBER(50),
        VTAB(51),
        HTAB(52),
        HOME(53),
        ON(54),
        PDL(55),
        PLOT(56),
        PEEK(57),
        POKE(58),
        INTF(59),
        STOP(60),
        HIMEM(61),
        LOMEM(62),
        FLASH(63),
        INVERSE(64),
        NORMAL(65),
        ONERR(66),
        SPC(67),
        FRE(68),
        POS(69),
        USR(70),
        TRACE(71),
        NOTRACE(72),
        AND(73),
        OR(74),
        DATA(75),
        WAIT(76),
        READ(77),
        XDRAW(78),
        DRAW(79),
        AT(80),
        DEF(81),
        FN(82),
        VAL(83),
        TAB(84),
        SPEED(85),
        ROT(86),
        SCALE(87),
        COLOR(88),
        HCOLOR(89),
        HLIN(90),
        VLIN(91),
        SCRN(92),
        POP(93),
        SHLOAD(94),
        SIN(95),
        COS(96),
        TAN(97),
        ATN(98),
        RND(99),
        SGN(100),
        EXP(101),
        LOG(102),
        ABS(103),
        STORE(104),
        RECALL(105),
        GET(106),
        EXPONENT(107),
        AMPERSAND(108),
        GR(109),
        NOT(110),
        RESTORE(111),
        SAVE(112),
        LOAD(113),
        QUESTION(114),
        INCLUDE(115),
        CLS(116),
        COMMENT(117),
        STRINGLITERAL(118),
        LETTERS(119),
        NUMBER(120),
        FLOAT(121),
        WS(122)
    }

    enum class Rules(val id: Int) {
        RULE_prog(0),
        RULE_line(1),
        RULE_amperoper(2),
        RULE_linenumber(3),
        RULE_amprstmt(4),
        RULE_statement(5),
        RULE_vardecl(6),
        RULE_printstmt1(7),
        RULE_printlist(8),
        RULE_getstmt(9),
        RULE_letstmt(10),
        RULE_variableassignment(11),
        RULE_relop(12),
        RULE_neq(13),
        RULE_ifstmt(14),
        RULE_forstmt1(15),
        RULE_forstmt2(16),
        RULE_nextstmt(17),
        RULE_inputstmt(18),
        RULE_readstmt(19),
        RULE_dimstmt(20),
        RULE_gotostmt(21),
        RULE_gosubstmt(22),
        RULE_pokestmt(23),
        RULE_callstmt(24),
        RULE_hplotstmt(25),
        RULE_vplotstmt(26),
        RULE_plotstmt(27),
        RULE_ongotostmt(28),
        RULE_ongosubstmt(29),
        RULE_vtabstmnt(30),
        RULE_htabstmnt(31),
        RULE_himemstmt(32),
        RULE_lomemstmt(33),
        RULE_datastmt(34),
        RULE_datum(35),
        RULE_waitstmt(36),
        RULE_xdrawstmt(37),
        RULE_drawstmt(38),
        RULE_defstmt(39),
        RULE_tabstmt(40),
        RULE_speedstmt(41),
        RULE_rotstmt(42),
        RULE_scalestmt(43),
        RULE_colorstmt(44),
        RULE_hcolorstmt(45),
        RULE_hlinstmt(46),
        RULE_vlinstmt(47),
        RULE_onerrstmt(48),
        RULE_prstmt(49),
        RULE_instmt(50),
        RULE_storestmt(51),
        RULE_recallstmt(52),
        RULE_liststmt(53),
        RULE_popstmt(54),
        RULE_amptstmt(55),
        RULE_includestmt(56),
        RULE_endstmt(57),
        RULE_returnstmt(58),
        RULE_restorestmt(59),
        RULE_number(60),
        RULE_func(61),
        RULE_signExpression(62),
        RULE_exponentExpression(63),
        RULE_multiplyingExpression(64),
        RULE_addingExpression(65),
        RULE_relationalExpression(66),
        RULE_expression(67),
        RULE_var(68),
        RULE_varname(69),
        RULE_varsuffix(70),
        RULE_varlist(71),
        RULE_exprlist(72),
        RULE_sqrfunc(73),
        RULE_chrfunc(74),
        RULE_lenfunc(75),
        RULE_ascfunc(76),
        RULE_midfunc(77),
        RULE_pdlfunc(78),
        RULE_peekfunc(79),
        RULE_intfunc(80),
        RULE_spcfunc(81),
        RULE_frefunc(82),
        RULE_posfunc(83),
        RULE_usrfunc(84),
        RULE_leftfunc(85),
        RULE_rightfunc(86),
        RULE_strfunc(87),
        RULE_fnfunc(88),
        RULE_valfunc(89),
        RULE_scrnfunc(90),
        RULE_sinfunc(91),
        RULE_cosfunc(92),
        RULE_tanfunc(93),
        RULE_atnfunc(94),
        RULE_rndfunc(95),
        RULE_sgnfunc(96),
        RULE_expfunc(97),
        RULE_logfunc(98),
        RULE_absfunc(99),
        RULE_tabfunc(100)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("prog", "line", "amperoper", "linenumber", 
                                "amprstmt", "statement", "vardecl", "printstmt1", 
                                "printlist", "getstmt", "letstmt", "variableassignment", 
                                "relop", "neq", "ifstmt", "forstmt1", "forstmt2", 
                                "nextstmt", "inputstmt", "readstmt", "dimstmt", 
                                "gotostmt", "gosubstmt", "pokestmt", "callstmt", 
                                "hplotstmt", "vplotstmt", "plotstmt", "ongotostmt", 
                                "ongosubstmt", "vtabstmnt", "htabstmnt", 
                                "himemstmt", "lomemstmt", "datastmt", "datum", 
                                "waitstmt", "xdrawstmt", "drawstmt", "defstmt", 
                                "tabstmt", "speedstmt", "rotstmt", "scalestmt", 
                                "colorstmt", "hcolorstmt", "hlinstmt", "vlinstmt", 
                                "onerrstmt", "prstmt", "instmt", "storestmt", 
                                "recallstmt", "liststmt", "popstmt", "amptstmt", 
                                "includestmt", "endstmt", "returnstmt", 
                                "restorestmt", "number", "func", "signExpression", 
                                "exponentExpression", "multiplyingExpression", 
                                "addingExpression", "relationalExpression", 
                                "expression", "var", "varname", "varsuffix", 
                                "varlist", "exprlist", "sqrfunc", "chrfunc", 
                                "lenfunc", "ascfunc", "midfunc", "pdlfunc", 
                                "peekfunc", "intfunc", "spcfunc", "frefunc", 
                                "posfunc", "usrfunc", "leftfunc", "rightfunc", 
                                "strfunc", "fnfunc", "valfunc", "scrnfunc", 
                                "sinfunc", "cosfunc", "tanfunc", "atnfunc", 
                                "rndfunc", "sgnfunc", "expfunc", "logfunc", 
                                "absfunc", "tabfunc")

        private val LITERAL_NAMES = Arrays.asList<String?>(null, "'$'", 
                                                           "'%'", null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, "'CHR$'", 
                                                           "'MID$'", "'LEFT$'", 
                                                           "'RIGHT$'", "'STR$'", 
                                                           "'('", "')'", 
                                                           "'+'", "'-'", 
                                                           "'*'", "'/'", 
                                                           null, "'>: '", 
                                                           "'<: '", "'>'", 
                                                           "'<'", "','", 
                                                           null, null, null, 
                                                           null, "'='", 
                                                           null, null, null, 
                                                           null, "';'", 
                                                           null, null, "':'", 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, "'PR#'", 
                                                           "'IN#'", null, 
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
                                                           null, "'^'", 
                                                           "'&'", null, 
                                                           null, null, null, 
                                                           null, "'?'")
        private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, "DOLLAR", 
                                                            "PERCENT", "RETURN", 
                                                            "PRINT", "GOTO", 
                                                            "GOSUB", "IF", 
                                                            "NEXT", "THEN", 
                                                            "REM", "CHR", 
                                                            "MID", "LEFT", 
                                                            "RIGHT", "STR", 
                                                            "LPAREN", "RPAREN", 
                                                            "PLUS", "MINUS", 
                                                            "TIMES", "DIV", 
                                                            "CLEAR", "GTE", 
                                                            "LTE", "GT", 
                                                            "LT", "COMMA", 
                                                            "LIST", "RUN", 
                                                            "END", "LET", 
                                                            "EQ", "FOR", 
                                                            "TO", "STEP", 
                                                            "INPUT", "SEMICOLON", 
                                                            "DIM", "SQR", 
                                                            "COLON", "TEXT", 
                                                            "HGR", "HGR2", 
                                                            "LEN", "CALL", 
                                                            "ASC", "HPLOT", 
                                                            "VPLOT", "PRNUMBER", 
                                                            "INNUMBER", 
                                                            "VTAB", "HTAB", 
                                                            "HOME", "ON", 
                                                            "PDL", "PLOT", 
                                                            "PEEK", "POKE", 
                                                            "INTF", "STOP", 
                                                            "HIMEM", "LOMEM", 
                                                            "FLASH", "INVERSE", 
                                                            "NORMAL", "ONERR", 
                                                            "SPC", "FRE", 
                                                            "POS", "USR", 
                                                            "TRACE", "NOTRACE", 
                                                            "AND", "OR", 
                                                            "DATA", "WAIT", 
                                                            "READ", "XDRAW", 
                                                            "DRAW", "AT", 
                                                            "DEF", "FN", 
                                                            "VAL", "TAB", 
                                                            "SPEED", "ROT", 
                                                            "SCALE", "COLOR", 
                                                            "HCOLOR", "HLIN", 
                                                            "VLIN", "SCRN", 
                                                            "POP", "SHLOAD", 
                                                            "SIN", "COS", 
                                                            "TAN", "ATN", 
                                                            "RND", "SGN", 
                                                            "EXP", "LOG", 
                                                            "ABS", "STORE", 
                                                            "RECALL", "GET", 
                                                            "EXPONENT", 
                                                            "AMPERSAND", 
                                                            "GR", "NOT", 
                                                            "RESTORE", "SAVE", 
                                                            "LOAD", "QUESTION", 
                                                            "INCLUDE", "CLS", 
                                                            "COMMENT", "STRINGLITERAL", 
                                                            "LETTERS", "NUMBER", 
                                                            "FLOAT", "WS")

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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u007c\u037d\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0004\u001c\u0009\u001c\u0004\u001d\u0009\u001d\u0004\u001e\u0009\u001e\u0004\u001f\u0009\u001f\u0004\u0020\u0009\u0020\u0004\u0021\u0009\u0021\u0004\u0022\u0009\u0022\u0004\u0023\u0009\u0023\u0004\u0024\u0009\u0024\u0004\u0025\u0009\u0025\u0004\u0026\u0009\u0026\u0004\u0027\u0009\u0027\u0004\u0028\u0009\u0028\u0004\u0029\u0009\u0029\u0004\u002a\u0009\u002a\u0004\u002b\u0009\u002b\u0004\u002c\u0009\u002c\u0004\u002d\u0009\u002d\u0004\u002e\u0009\u002e\u0004\u002f\u0009\u002f\u0004\u0030\u0009\u0030\u0004\u0031\u0009\u0031\u0004\u0032\u0009\u0032\u0004\u0033\u0009\u0033\u0004\u0034\u0009\u0034\u0004\u0035\u0009\u0035\u0004\u0036\u0009\u0036\u0004\u0037\u0009\u0037\u0004\u0038\u0009\u0038\u0004\u0039\u0009\u0039\u0004\u003a\u0009\u003a\u0004\u003b\u0009\u003b\u0004\u003c\u0009\u003c\u0004\u003d\u0009\u003d\u0004\u003e\u0009\u003e\u0004\u003f\u0009\u003f\u0004\u0040\u0009\u0040\u0004\u0041\u0009\u0041\u0004\u0042\u0009\u0042\u0004\u0043\u0009\u0043\u0004\u0044\u0009\u0044\u0004\u0045\u0009\u0045\u0004\u0046\u0009\u0046\u0004\u0047\u0009\u0047\u0004\u0048\u0009\u0048\u0004\u0049\u0009\u0049\u0004\u004a\u0009\u004a\u0004\u004b\u0009\u004b\u0004\u004c\u0009\u004c\u0004\u004d\u0009\u004d\u0004\u004e\u0009\u004e\u0004\u004f\u0009\u004f\u0004\u0050\u0009\u0050\u0004\u0051\u0009\u0051\u0004\u0052\u0009\u0052\u0004\u0053\u0009\u0053\u0004\u0054\u0009\u0054\u0004\u0055\u0009\u0055\u0004\u0056\u0009\u0056\u0004\u0057\u0009\u0057\u0004\u0058\u0009\u0058\u0004\u0059\u0009\u0059\u0004\u005a\u0009\u005a\u0004\u005b\u0009\u005b\u0004\u005c\u0009\u005c\u0004\u005d\u0009\u005d\u0004\u005e\u0009\u005e\u0004\u005f\u0009\u005f\u0004\u0060\u0009\u0060\u0004\u0061\u0009\u0061\u0004\u0062\u0009\u0062\u0004\u0063\u0009\u0063\u0004\u0064\u0009\u0064\u0004\u0065\u0009\u0065\u0004\u0066\u0009\u0066\u0003\u0002\u0006\u0002\u00ce\u000a\u0002\u000d\u0002\u000e\u0002\u00cf\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0005\u0003\u00d8\u000a\u0003\u0007\u0003\u00da\u000a\u0003\u000c\u0003\u000e\u0003\u00dd\u000b\u0003\u0003\u0003\u0005\u0003\u00e0\u000a\u0003\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0006\u0005\u0006\u00e7\u000a\u0006\u0003\u0006\u0003\u0006\u0005\u0006\u00eb\u000a\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0005\u0007\u011e\u000a\u0007\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0007\u0008\u0125\u000a\u0008\u000c\u0008\u000e\u0008\u0128\u000b\u0008\u0003\u0009\u0003\u0009\u0005\u0009\u012c\u000a\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0005\u000a\u0131\u000a\u000a\u0007\u000a\u0133\u000a\u000a\u000c\u000a\u000e\u000a\u0136\u000b\u000a\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000c\u0005\u000c\u013c\u000a\u000c\u0003\u000c\u0003\u000c\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0005\u000e\u0152\u000a\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0005\u0010\u015a\u000a\u0010\u0003\u0010\u0003\u0010\u0005\u0010\u015e\u000a\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0005\u0011\u0168\u000a\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0005\u0011\u016d\u000a\u0011\u0005\u0011\u016f\u000a\u0011\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0005\u0012\u0179\u000a\u0012\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0007\u0013\u017f\u000a\u0013\u000c\u0013\u000e\u0013\u0182\u000b\u0013\u0005\u0013\u0184\u000a\u0013\u0003\u0014\u0003\u0014\u0003\u0014\u0005\u0014\u0189\u000a\u0014\u0003\u0014\u0003\u0014\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0005\u001b\u01a6\u000a\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0007\u001b\u01ad\u000a\u001b\u000c\u001b\u000e\u001b\u01b0\u000b\u001b\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0005\u001c\u01b7\u000a\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0007\u001c\u01be\u000a\u001c\u000c\u001c\u000e\u001c\u01c1\u000b\u001c\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0007\u001e\u01ce\u000a\u001e\u000c\u001e\u000e\u001e\u01d1\u000b\u001e\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0007\u001f\u01d9\u000a\u001f\u000c\u001f\u000e\u001f\u01dc\u000b\u001f\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u01f0\u000a\u0024\u0007\u0024\u01f2\u000a\u0024\u000c\u0024\u000e\u0024\u01f5\u000b\u0024\u0003\u0025\u0003\u0025\u0005\u0025\u01f9\u000a\u0025\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u0201\u000a\u0026\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0005\u0027\u020a\u000a\u0027\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0005\u0028\u0213\u000a\u0028\u0003\u0029\u0003\u0029\u0005\u0029\u0217\u000a\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u002a\u0003\u002a\u0003\u002a\u0003\u002a\u0003\u002a\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002c\u0003\u002c\u0003\u002c\u0003\u002c\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002f\u0003\u002f\u0003\u002f\u0003\u002f\u0003\u0030\u0003\u0030\u0003\u0030\u0003\u0030\u0003\u0030\u0003\u0030\u0003\u0030\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0032\u0003\u0032\u0003\u0032\u0003\u0032\u0003\u0033\u0003\u0033\u0003\u0033\u0003\u0034\u0003\u0034\u0003\u0034\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0036\u0003\u0036\u0003\u0036\u0003\u0037\u0003\u0037\u0005\u0037\u0259\u000a\u0037\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0005\u0038\u0260\u000a\u0038\u0003\u0039\u0003\u0039\u0003\u0039\u0003\u003a\u0003\u003a\u0003\u003a\u0003\u003b\u0003\u003b\u0003\u003c\u0003\u003c\u0003\u003d\u0003\u003d\u0003\u003e\u0005\u003e\u026f\u000a\u003e\u0003\u003e\u0003\u003e\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0005\u003f\u0296\u000a\u003f\u0003\u0040\u0005\u0040\u0299\u000a\u0040\u0003\u0040\u0005\u0040\u029c\u000a\u0040\u0003\u0040\u0003\u0040\u0003\u0041\u0003\u0041\u0003\u0041\u0007\u0041\u02a3\u000a\u0041\u000c\u0041\u000e\u0041\u02a6\u000b\u0041\u0003\u0042\u0003\u0042\u0003\u0042\u0007\u0042\u02ab\u000a\u0042\u000c\u0042\u000e\u0042\u02ae\u000b\u0042\u0003\u0043\u0003\u0043\u0003\u0043\u0007\u0043\u02b3\u000a\u0043\u000c\u0043\u000e\u0043\u02b6\u000b\u0043\u0003\u0044\u0003\u0044\u0003\u0044\u0003\u0044\u0005\u0044\u02bc\u000a\u0044\u0003\u0045\u0003\u0045\u0003\u0045\u0003\u0045\u0007\u0045\u02c2\u000a\u0045\u000c\u0045\u000e\u0045\u02c5\u000b\u0045\u0005\u0045\u02c7\u000a\u0045\u0003\u0046\u0003\u0046\u0005\u0046\u02cb\u000a\u0046\u0003\u0047\u0003\u0047\u0007\u0047\u02cf\u000a\u0047\u000c\u0047\u000e\u0047\u02d2\u000b\u0047\u0003\u0048\u0003\u0048\u0003\u0049\u0003\u0049\u0003\u0049\u0007\u0049\u02d9\u000a\u0049\u000c\u0049\u000e\u0049\u02dc\u000b\u0049\u0003\u004a\u0003\u004a\u0003\u004a\u0007\u004a\u02e1\u000a\u004a\u000c\u004a\u000e\u004a\u02e4\u000b\u004a\u0003\u004b\u0003\u004b\u0003\u004b\u0003\u004b\u0003\u004b\u0003\u004c\u0003\u004c\u0003\u004c\u0003\u004c\u0003\u004c\u0003\u004d\u0003\u004d\u0003\u004d\u0003\u004d\u0003\u004d\u0003\u004e\u0003\u004e\u0003\u004e\u0003\u004e\u0003\u004e\u0003\u004f\u0003\u004f\u0003\u004f\u0003\u004f\u0003\u004f\u0003\u004f\u0003\u004f\u0003\u004f\u0003\u004f\u0003\u0050\u0003\u0050\u0003\u0050\u0003\u0050\u0003\u0050\u0003\u0051\u0003\u0051\u0003\u0051\u0003\u0051\u0003\u0051\u0003\u0052\u0003\u0052\u0003\u0052\u0003\u0052\u0003\u0052\u0003\u0053\u0003\u0053\u0003\u0053\u0003\u0053\u0003\u0053\u0003\u0054\u0003\u0054\u0003\u0054\u0003\u0054\u0003\u0054\u0003\u0055\u0003\u0055\u0003\u0055\u0003\u0055\u0003\u0055\u0003\u0056\u0003\u0056\u0003\u0056\u0003\u0056\u0003\u0056\u0003\u0057\u0003\u0057\u0003\u0057\u0003\u0057\u0003\u0057\u0003\u0057\u0003\u0057\u0003\u0058\u0003\u0058\u0003\u0058\u0003\u0058\u0003\u0058\u0003\u0058\u0003\u0058\u0003\u0059\u0003\u0059\u0003\u0059\u0003\u0059\u0003\u0059\u0003\u005a\u0003\u005a\u0003\u005a\u0003\u005a\u0003\u005a\u0003\u005a\u0003\u005b\u0003\u005b\u0003\u005b\u0003\u005b\u0003\u005b\u0003\u005c\u0003\u005c\u0003\u005c\u0003\u005c\u0003\u005c\u0003\u005c\u0003\u005c\u0003\u005d\u0003\u005d\u0003\u005d\u0003\u005d\u0003\u005d\u0003\u005e\u0003\u005e\u0003\u005e\u0003\u005e\u0003\u005e\u0003\u005f\u0003\u005f\u0003\u005f\u0003\u005f\u0003\u005f\u0003\u0060\u0003\u0060\u0003\u0060\u0003\u0060\u0003\u0060\u0003\u0061\u0003\u0061\u0003\u0061\u0003\u0061\u0003\u0061\u0003\u0062\u0003\u0062\u0003\u0062\u0003\u0062\u0003\u0062\u0003\u0063\u0003\u0063\u0003\u0063\u0003\u0063\u0003\u0063\u0003\u0064\u0003\u0064\u0003\u0064\u0003\u0064\u0003\u0064\u0003\u0065\u0003\u0065\u0003\u0065\u0003\u0065\u0003\u0065\u0003\u0066\u0003\u0066\u0003\u0066\u0003\u0066\u0003\u0066\u0003\u0066\u0002\u0002\u0067\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0020\u0022\u0024\u0026\u0028\u002a\u002c\u002e\u0030\u0032\u0034\u0036\u0038\u003a\u003c\u003e\u0040\u0042\u0044\u0046\u0048\u004a\u004c\u004e\u0050\u0052\u0054\u0056\u0058\u005a\u005c\u005e\u0060\u0062\u0064\u0066\u0068\u006a\u006c\u006e\u0070\u0072\u0074\u0076\u0078\u007a\u007c\u007e\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u0002\u000c\u0004\u0002\u000c\u000c\u0077\u0077\u000d\u0002\u0018\u0018\u001f\u001f\u002b\u002d\u0037\u0037\u003e\u003e\u0041\u0043\u0049\u004a\u0060\u0060\u006f\u006f\u0072\u0073\u0076\u0076\u0004\u0002\u0006\u0006\u0074\u0074\u0004\u0002\u001d\u001d\u0027\u0027\u0003\u0002\u0014\u0015\u0003\u0002\u007a\u007b\u0003\u0002\u0016\u0017\u0003\u0002\u004b\u004c\u0003\u0002\u0079\u007a\u0003\u0002\u0003\u0004\u0002\u039f\u0002\u00cd\u0003\u0002\u0002\u0002\u0004\u00d3\u0003\u0002\u0002\u0002\u0006\u00e1\u0003\u0002\u0002\u0002\u0008\u00e3\u0003\u0002\u0002\u0002\u000a\u00ea\u0003\u0002\u0002\u0002\u000c\u011d\u0003\u0002\u0002\u0002\u000e\u011f\u0003\u0002\u0002\u0002\u0010\u0129\u0003\u0002\u0002\u0002\u0012\u012d\u0003\u0002\u0002\u0002\u0014\u0137\u0003\u0002\u0002\u0002\u0016\u013b\u0003\u0002\u0002\u0002\u0018\u013f\u0003\u0002\u0002\u0002\u001a\u0151\u0003\u0002\u0002\u0002\u001c\u0153\u0003\u0002\u0002\u0002\u001e\u0156\u0003\u0002\u0002\u0002\u0020\u015f\u0003\u0002\u0002\u0002\u0022\u0170\u0003\u0002\u0002\u0002\u0024\u017a\u0003\u0002\u0002\u0002\u0026\u0185\u0003\u0002\u0002\u0002\u0028\u018c\u0003\u0002\u0002\u0002\u002a\u018f\u0003\u0002\u0002\u0002\u002c\u0192\u0003\u0002\u0002\u0002\u002e\u0195\u0003\u0002\u0002\u0002\u0030\u0198\u0003\u0002\u0002\u0002\u0032\u019d\u0003\u0002\u0002\u0002\u0034\u01a0\u0003\u0002\u0002\u0002\u0036\u01b1\u0003\u0002\u0002\u0002\u0038\u01c2\u0003\u0002\u0002\u0002\u003a\u01c7\u0003\u0002\u0002\u0002\u003c\u01d2\u0003\u0002\u0002\u0002\u003e\u01dd\u0003\u0002\u0002\u0002\u0040\u01e0\u0003\u0002\u0002\u0002\u0042\u01e3\u0003\u0002\u0002\u0002\u0044\u01e7\u0003\u0002\u0002\u0002\u0046\u01eb\u0003\u0002\u0002\u0002\u0048\u01f8\u0003\u0002\u0002\u0002\u004a\u01fa\u0003\u0002\u0002\u0002\u004c\u0202\u0003\u0002\u0002\u0002\u004e\u020b\u0003\u0002\u0002\u0002\u0050\u0214\u0003\u0002\u0002\u0002\u0052\u021f\u0003\u0002\u0002\u0002\u0054\u0224\u0003\u0002\u0002\u0002\u0056\u0228\u0003\u0002\u0002\u0002\u0058\u022c\u0003\u0002\u0002\u0002\u005a\u0230\u0003\u0002\u0002\u0002\u005c\u0234\u0003\u0002\u0002\u0002\u005e\u0238\u0003\u0002\u0002\u0002\u0060\u023f\u0003\u0002\u0002\u0002\u0062\u0246\u0003\u0002\u0002\u0002\u0064\u024a\u0003\u0002\u0002\u0002\u0066\u024d\u0003\u0002\u0002\u0002\u0068\u0250\u0003\u0002\u0002\u0002\u006a\u0253\u0003\u0002\u0002\u0002\u006c\u0256\u0003\u0002\u0002\u0002\u006e\u025a\u0003\u0002\u0002\u0002\u0070\u0261\u0003\u0002\u0002\u0002\u0072\u0264\u0003\u0002\u0002\u0002\u0074\u0267\u0003\u0002\u0002\u0002\u0076\u0269\u0003\u0002\u0002\u0002\u0078\u026b\u0003\u0002\u0002\u0002\u007a\u026e\u0003\u0002\u0002\u0002\u007c\u0295\u0003\u0002\u0002\u0002\u007e\u0298\u0003\u0002\u0002\u0002\u0080\u029f\u0003\u0002\u0002\u0002\u0082\u02a7\u0003\u0002\u0002\u0002\u0084\u02af\u0003\u0002\u0002\u0002\u0086\u02b7\u0003\u0002\u0002\u0002\u0088\u02c6\u0003\u0002\u0002\u0002\u008a\u02c8\u0003\u0002\u0002\u0002\u008c\u02cc\u0003\u0002\u0002\u0002\u008e\u02d3\u0003\u0002\u0002\u0002\u0090\u02d5\u0003\u0002\u0002\u0002\u0092\u02dd\u0003\u0002\u0002\u0002\u0094\u02e5\u0003\u0002\u0002\u0002\u0096\u02ea\u0003\u0002\u0002\u0002\u0098\u02ef\u0003\u0002\u0002\u0002\u009a\u02f4\u0003\u0002\u0002\u0002\u009c\u02f9\u0003\u0002\u0002\u0002\u009e\u0302\u0003\u0002\u0002\u0002\u00a0\u0307\u0003\u0002\u0002\u0002\u00a2\u030c\u0003\u0002\u0002\u0002\u00a4\u0311\u0003\u0002\u0002\u0002\u00a6\u0316\u0003\u0002\u0002\u0002\u00a8\u031b\u0003\u0002\u0002\u0002\u00aa\u0320\u0003\u0002\u0002\u0002\u00ac\u0325\u0003\u0002\u0002\u0002\u00ae\u032c\u0003\u0002\u0002\u0002\u00b0\u0333\u0003\u0002\u0002\u0002\u00b2\u0338\u0003\u0002\u0002\u0002\u00b4\u033e\u0003\u0002\u0002\u0002\u00b6\u0343\u0003\u0002\u0002\u0002\u00b8\u034a\u0003\u0002\u0002\u0002\u00ba\u034f\u0003\u0002\u0002\u0002\u00bc\u0354\u0003\u0002\u0002\u0002\u00be\u0359\u0003\u0002\u0002\u0002\u00c0\u035e\u0003\u0002\u0002\u0002\u00c2\u0363\u0003\u0002\u0002\u0002\u00c4\u0368\u0003\u0002\u0002\u0002\u00c6\u036d\u0003\u0002\u0002\u0002\u00c8\u0372\u0003\u0002\u0002\u0002\u00ca\u0377\u0003\u0002\u0002\u0002\u00cc\u00ce\u0005\u0004\u0003\u0002\u00cd\u00cc\u0003\u0002\u0002\u0002\u00ce\u00cf\u0003\u0002\u0002\u0002\u00cf\u00cd\u0003\u0002\u0002\u0002\u00cf\u00d0\u0003\u0002\u0002\u0002\u00d0\u00d1\u0003\u0002\u0002\u0002\u00d1\u00d2\u0007\u0002\u0002\u0003\u00d2\u0003\u0003\u0002\u0002\u0002\u00d3\u00df\u0005\u0008\u0005\u0002\u00d4\u00db\u0005\u000a\u0006\u0002\u00d5\u00d7\u0007\u002a\u0002\u0002\u00d6\u00d8\u0005\u000a\u0006\u0002\u00d7\u00d6\u0003\u0002\u0002\u0002\u00d7\u00d8\u0003\u0002\u0002\u0002\u00d8\u00da\u0003\u0002\u0002\u0002\u00d9\u00d5\u0003\u0002\u0002\u0002\u00da\u00dd\u0003\u0002\u0002\u0002\u00db\u00d9\u0003\u0002\u0002\u0002\u00db\u00dc\u0003\u0002\u0002\u0002\u00dc\u00e0\u0003\u0002\u0002\u0002\u00dd\u00db\u0003\u0002\u0002\u0002\u00de\u00e0\u0009\u0002\u0002\u0002\u00df\u00d4\u0003\u0002\u0002\u0002\u00df\u00de\u0003\u0002\u0002\u0002\u00e0\u0005\u0003\u0002\u0002\u0002\u00e1\u00e2\u0007\u006e\u0002\u0002\u00e2\u0007\u0003\u0002\u0002\u0002\u00e3\u00e4\u0007\u007a\u0002\u0002\u00e4\u0009\u0003\u0002\u0002\u0002\u00e5\u00e7\u0005\u0006\u0004\u0002\u00e6\u00e5\u0003\u0002\u0002\u0002\u00e6\u00e7\u0003\u0002\u0002\u0002\u00e7\u00e8\u0003\u0002\u0002\u0002\u00e8\u00eb\u0005\u000c\u0007\u0002\u00e9\u00eb\u0009\u0002\u0002\u0002\u00ea\u00e6\u0003\u0002\u0002\u0002\u00ea\u00e9\u0003\u0002\u0002\u0002\u00eb\u000b\u0003\u0002\u0002\u0002\u00ec\u011e\u0009\u0003\u0002\u0002\u00ed\u011e\u0005\u0074\u003b\u0002\u00ee\u011e\u0005\u0076\u003c\u0002\u00ef\u011e\u0005\u0078\u003d\u0002\u00f0\u011e\u0005\u0070\u0039\u0002\u00f1\u011e\u0005\u006e\u0038\u0002\u00f2\u011e\u0005\u006c\u0037\u0002\u00f3\u011e\u0005\u0068\u0035\u0002\u00f4\u011e\u0005\u0014\u000b\u0002\u00f5\u011e\u0005\u006a\u0036\u0002\u00f6\u011e\u0005\u0024\u0013\u0002\u00f7\u011e\u0005\u0066\u0034\u0002\u00f8\u011e\u0005\u0064\u0033\u0002\u00f9\u011e\u0005\u0062\u0032\u0002\u00fa\u011e\u0005\u005e\u0030\u0002\u00fb\u011e\u0005\u0060\u0031\u0002\u00fc\u011e\u0005\u005a\u002e\u0002\u00fd\u011e\u0005\u0054\u002b\u0002\u00fe\u011e\u0005\u0058\u002d\u0002\u00ff\u011e\u0005\u0056\u002c\u0002\u0100\u011e\u0005\u005c\u002f\u0002\u0101\u011e\u0005\u0042\u0022\u0002\u0102\u011e\u0005\u0044\u0023\u0002\u0103\u011e\u0005\u0010\u0009\u0002\u0104\u011e\u0005\u0030\u0019\u0002\u0105\u011e\u0005\u0038\u001d\u0002\u0106\u011e\u0005\u003a\u001e\u0002\u0107\u011e\u0005\u003c\u001f\u0002\u0108\u011e\u0005\u001e\u0010\u0002\u0109\u011e\u0005\u0020\u0011\u0002\u010a\u011e\u0005\u0022\u0012\u0002\u010b\u011e\u0005\u0026\u0014\u0002\u010c\u011e\u0005\u0052\u002a\u0002\u010d\u011e\u0005\u002a\u0016\u0002\u010e\u011e\u0005\u002c\u0017\u0002\u010f\u011e\u0005\u002e\u0018\u0002\u0110\u011e\u0005\u0032\u001a\u0002\u0111\u011e\u0005\u0028\u0015\u0002\u0112\u011e\u0005\u0034\u001b\u0002\u0113\u011e\u0005\u0036\u001c\u0002\u0114\u011e\u0005\u003e\u0020\u0002\u0115\u011e\u0005\u0040\u0021\u0002\u0116\u011e\u0005\u004a\u0026\u0002\u0117\u011e\u0005\u0046\u0024\u0002\u0118\u011e\u0005\u004c\u0027\u0002\u0119\u011e\u0005\u004e\u0028\u0002\u011a\u011e\u0005\u0050\u0029\u0002\u011b\u011e\u0005\u0016\u000c\u0002\u011c\u011e\u0005\u0072\u003a\u0002\u011d\u00ec\u0003\u0002\u0002\u0002\u011d\u00ed\u0003\u0002\u0002\u0002\u011d\u00ee\u0003\u0002\u0002\u0002\u011d\u00ef\u0003\u0002\u0002\u0002\u011d\u00f0\u0003\u0002\u0002\u0002\u011d\u00f1\u0003\u0002\u0002\u0002\u011d\u00f2\u0003\u0002\u0002\u0002\u011d\u00f3\u0003\u0002\u0002\u0002\u011d\u00f4\u0003\u0002\u0002\u0002\u011d\u00f5\u0003\u0002\u0002\u0002\u011d\u00f6\u0003\u0002\u0002\u0002\u011d\u00f7\u0003\u0002\u0002\u0002\u011d\u00f8\u0003\u0002\u0002\u0002\u011d\u00f9\u0003\u0002\u0002\u0002\u011d\u00fa\u0003\u0002\u0002\u0002\u011d\u00fb\u0003\u0002\u0002\u0002\u011d\u00fc\u0003\u0002\u0002\u0002\u011d\u00fd\u0003\u0002\u0002\u0002\u011d\u00fe\u0003\u0002\u0002\u0002\u011d\u00ff\u0003\u0002\u0002\u0002\u011d\u0100\u0003\u0002\u0002\u0002\u011d\u0101\u0003\u0002\u0002\u0002\u011d\u0102\u0003\u0002\u0002\u0002\u011d\u0103\u0003\u0002\u0002\u0002\u011d\u0104\u0003\u0002\u0002\u0002\u011d\u0105\u0003\u0002\u0002\u0002\u011d\u0106\u0003\u0002\u0002\u0002\u011d\u0107\u0003\u0002\u0002\u0002\u011d\u0108\u0003\u0002\u0002\u0002\u011d\u0109\u0003\u0002\u0002\u0002\u011d\u010a\u0003\u0002\u0002\u0002\u011d\u010b\u0003\u0002\u0002\u0002\u011d\u010c\u0003\u0002\u0002\u0002\u011d\u010d\u0003\u0002\u0002\u0002\u011d\u010e\u0003\u0002\u0002\u0002\u011d\u010f\u0003\u0002\u0002\u0002\u011d\u0110\u0003\u0002\u0002\u0002\u011d\u0111\u0003\u0002\u0002\u0002\u011d\u0112\u0003\u0002\u0002\u0002\u011d\u0113\u0003\u0002\u0002\u0002\u011d\u0114\u0003\u0002\u0002\u0002\u011d\u0115\u0003\u0002\u0002\u0002\u011d\u0116\u0003\u0002\u0002\u0002\u011d\u0117\u0003\u0002\u0002\u0002\u011d\u0118\u0003\u0002\u0002\u0002\u011d\u0119\u0003\u0002\u0002\u0002\u011d\u011a\u0003\u0002\u0002\u0002\u011d\u011b\u0003\u0002\u0002\u0002\u011d\u011c\u0003\u0002\u0002\u0002\u011e\u000d\u0003\u0002\u0002\u0002\u011f\u0126\u0005\u008a\u0046\u0002\u0120\u0121\u0007\u0012\u0002\u0002\u0121\u0122\u0005\u0092\u004a\u0002\u0122\u0123\u0007\u0013\u0002\u0002\u0123\u0125\u0003\u0002\u0002\u0002\u0124\u0120\u0003\u0002\u0002\u0002\u0125\u0128\u0003\u0002\u0002\u0002\u0126\u0124\u0003\u0002\u0002\u0002\u0126\u0127\u0003\u0002\u0002\u0002\u0127\u000f\u0003\u0002\u0002\u0002\u0128\u0126\u0003\u0002\u0002\u0002\u0129\u012b\u0009\u0004\u0002\u0002\u012a\u012c\u0005\u0012\u000a\u0002\u012b\u012a\u0003\u0002\u0002\u0002\u012b\u012c\u0003\u0002\u0002\u0002\u012c\u0011\u0003\u0002\u0002\u0002\u012d\u0134\u0005\u0088\u0045\u0002\u012e\u0130\u0009\u0005\u0002\u0002\u012f\u0131\u0005\u0088\u0045\u0002\u0130\u012f\u0003\u0002\u0002\u0002\u0130\u0131\u0003\u0002\u0002\u0002\u0131\u0133\u0003\u0002\u0002\u0002\u0132\u012e\u0003\u0002\u0002\u0002\u0133\u0136\u0003\u0002\u0002\u0002\u0134\u0132\u0003\u0002\u0002\u0002\u0134\u0135\u0003\u0002\u0002\u0002\u0135\u0013\u0003\u0002\u0002\u0002\u0136\u0134\u0003\u0002\u0002\u0002\u0137\u0138\u0007\u006c\u0002\u0002\u0138\u0139\u0005\u0092\u004a\u0002\u0139\u0015\u0003\u0002\u0002\u0002\u013a\u013c\u0007\u0021\u0002\u0002\u013b\u013a\u0003\u0002\u0002\u0002\u013b\u013c\u0003\u0002\u0002\u0002\u013c\u013d\u0003\u0002\u0002\u0002\u013d\u013e\u0005\u0018\u000d\u0002\u013e\u0017\u0003\u0002\u0002\u0002\u013f\u0140\u0005\u000e\u0008\u0002\u0140\u0141\u0007\u0022\u0002\u0002\u0141\u0142\u0005\u0092\u004a\u0002\u0142\u0019\u0003\u0002\u0002\u0002\u0143\u0152\u0007\u0019\u0002\u0002\u0144\u0145\u0007\u001b\u0002\u0002\u0145\u0152\u0007\u0022\u0002\u0002\u0146\u0147\u0007\u0022\u0002\u0002\u0147\u0152\u0007\u001b\u0002\u0002\u0148\u0152\u0007\u001a\u0002\u0002\u0149\u014a\u0007\u001c\u0002\u0002\u014a\u0152\u0007\u0022\u0002\u0002\u014b\u014c\u0007\u0022\u0002\u0002\u014c\u0152\u0007\u001c\u0002\u0002\u014d\u0152\u0005\u001c\u000f\u0002\u014e\u0152\u0007\u0022\u0002\u0002\u014f\u0152\u0007\u001b\u0002\u0002\u0150\u0152\u0007\u001c\u0002\u0002\u0151\u0143\u0003\u0002\u0002\u0002\u0151\u0144\u0003\u0002\u0002\u0002\u0151\u0146\u0003\u0002\u0002\u0002\u0151\u0148\u0003\u0002\u0002\u0002\u0151\u0149\u0003\u0002\u0002\u0002\u0151\u014b\u0003\u0002\u0002\u0002\u0151\u014d\u0003\u0002\u0002\u0002\u0151\u014e\u0003\u0002\u0002\u0002\u0151\u014f\u0003\u0002\u0002\u0002\u0151\u0150\u0003\u0002\u0002\u0002\u0152\u001b\u0003\u0002\u0002\u0002\u0153\u0154\u0007\u001c\u0002\u0002\u0154\u0155\u0007\u001b\u0002\u0002\u0155\u001d\u0003\u0002\u0002\u0002\u0156\u0157\u0007\u0009\u0002\u0002\u0157\u0159\u0005\u0088\u0045\u0002\u0158\u015a\u0007\u000b\u0002\u0002\u0159\u0158\u0003\u0002\u0002\u0002\u0159\u015a\u0003\u0002\u0002\u0002\u015a\u015d\u0003\u0002\u0002\u0002\u015b\u015e\u0005\u000c\u0007\u0002\u015c\u015e\u0005\u0008\u0005\u0002\u015d\u015b\u0003\u0002\u0002\u0002\u015d\u015c\u0003\u0002\u0002\u0002\u015e\u001f\u0003\u0002\u0002\u0002\u015f\u0160\u0007\u0023\u0002\u0002\u0160\u0161\u0005\u000e\u0008\u0002\u0161\u0162\u0007\u0022\u0002\u0002\u0162\u0163\u0005\u0088\u0045\u0002\u0163\u0164\u0007\u0024\u0002\u0002\u0164\u0167\u0005\u0088\u0045\u0002\u0165\u0166\u0007\u0025\u0002\u0002\u0166\u0168\u0005\u0088\u0045\u0002\u0167\u0165\u0003\u0002\u0002\u0002\u0167\u0168\u0003\u0002\u0002\u0002\u0168\u016e\u0003\u0002\u0002\u0002\u0169\u016a\u0005\u000c\u0007\u0002\u016a\u016c\u0007\u000a\u0002\u0002\u016b\u016d\u0005\u000e\u0008\u0002\u016c\u016b\u0003\u0002\u0002\u0002\u016c\u016d\u0003\u0002\u0002\u0002\u016d\u016f\u0003\u0002\u0002\u0002\u016e\u0169\u0003\u0002\u0002\u0002\u016e\u016f\u0003\u0002\u0002\u0002\u016f\u0021\u0003\u0002\u0002\u0002\u0170\u0171\u0007\u0023\u0002\u0002\u0171\u0172\u0005\u000e\u0008\u0002\u0172\u0173\u0007\u0022\u0002\u0002\u0173\u0174\u0005\u0088\u0045\u0002\u0174\u0175\u0007\u0024\u0002\u0002\u0175\u0178\u0005\u0088\u0045\u0002\u0176\u0177\u0007\u0025\u0002\u0002\u0177\u0179\u0005\u0088\u0045\u0002\u0178\u0176\u0003\u0002\u0002\u0002\u0178\u0179\u0003\u0002\u0002\u0002\u0179\u0023\u0003\u0002\u0002\u0002\u017a\u0183\u0007\u000a\u0002\u0002\u017b\u0180\u0005\u000e\u0008\u0002\u017c\u017d\u0007\u001d\u0002\u0002\u017d\u017f\u0005\u000e\u0008\u0002\u017e\u017c\u0003\u0002\u0002\u0002\u017f\u0182\u0003\u0002\u0002\u0002\u0180\u017e\u0003\u0002\u0002\u0002\u0180\u0181\u0003\u0002\u0002\u0002\u0181\u0184\u0003\u0002\u0002\u0002\u0182\u0180\u0003\u0002\u0002\u0002\u0183\u017b\u0003\u0002\u0002\u0002\u0183\u0184\u0003\u0002\u0002\u0002\u0184\u0025\u0003\u0002\u0002\u0002\u0185\u0188\u0007\u0026\u0002\u0002\u0186\u0187\u0007\u0078\u0002\u0002\u0187\u0189\u0009\u0005\u0002\u0002\u0188\u0186\u0003\u0002\u0002\u0002\u0188\u0189\u0003\u0002\u0002\u0002\u0189\u018a\u0003\u0002\u0002\u0002\u018a\u018b\u0005\u0090\u0049\u0002\u018b\u0027\u0003\u0002\u0002\u0002\u018c\u018d\u0007\u004f\u0002\u0002\u018d\u018e\u0005\u0090\u0049\u0002\u018e\u0029\u0003\u0002\u0002\u0002\u018f\u0190\u0007\u0028\u0002\u0002\u0190\u0191\u0005\u0090\u0049\u0002\u0191\u002b\u0003\u0002\u0002\u0002\u0192\u0193\u0007\u0007\u0002\u0002\u0193\u0194\u0005\u0008\u0005\u0002\u0194\u002d\u0003\u0002\u0002\u0002\u0195\u0196\u0007\u0008\u0002\u0002\u0196\u0197\u0005\u0088\u0045\u0002\u0197\u002f\u0003\u0002\u0002\u0002\u0198\u0199\u0007\u003c\u0002\u0002\u0199\u019a\u0005\u0088\u0045\u0002\u019a\u019b\u0007\u001d\u0002\u0002\u019b\u019c\u0005\u0088\u0045\u0002\u019c\u0031\u0003\u0002\u0002\u0002\u019d\u019e\u0007\u002f\u0002\u0002\u019e\u019f\u0005\u0092\u004a\u0002\u019f\u0033\u0003\u0002\u0002\u0002\u01a0\u01a5\u0007\u0031\u0002\u0002\u01a1\u01a2\u0005\u0088\u0045\u0002\u01a2\u01a3\u0007\u001d\u0002\u0002\u01a3\u01a4\u0005\u0088\u0045\u0002\u01a4\u01a6\u0003\u0002\u0002\u0002\u01a5\u01a1\u0003\u0002\u0002\u0002\u01a5\u01a6\u0003\u0002\u0002\u0002\u01a6\u01ae\u0003\u0002\u0002\u0002\u01a7\u01a8\u0007\u0024\u0002\u0002\u01a8\u01a9\u0005\u0088\u0045\u0002\u01a9\u01aa\u0007\u001d\u0002\u0002\u01aa\u01ab\u0005\u0088\u0045\u0002\u01ab\u01ad\u0003\u0002\u0002\u0002\u01ac\u01a7\u0003\u0002\u0002\u0002\u01ad\u01b0\u0003\u0002\u0002\u0002\u01ae\u01ac\u0003\u0002\u0002\u0002\u01ae\u01af\u0003\u0002\u0002\u0002\u01af\u0035\u0003\u0002\u0002\u0002\u01b0\u01ae\u0003\u0002\u0002\u0002\u01b1\u01b6\u0007\u0032\u0002\u0002\u01b2\u01b3\u0005\u0088\u0045\u0002\u01b3\u01b4\u0007\u001d\u0002\u0002\u01b4\u01b5\u0005\u0088\u0045\u0002\u01b5\u01b7\u0003\u0002\u0002\u0002\u01b6\u01b2\u0003\u0002\u0002\u0002\u01b6\u01b7\u0003\u0002\u0002\u0002\u01b7\u01bf\u0003\u0002\u0002\u0002\u01b8\u01b9\u0007\u0024\u0002\u0002\u01b9\u01ba\u0005\u0088\u0045\u0002\u01ba\u01bb\u0007\u001d\u0002\u0002\u01bb\u01bc\u0005\u0088\u0045\u0002\u01bc\u01be\u0003\u0002\u0002\u0002\u01bd\u01b8\u0003\u0002\u0002\u0002\u01be\u01c1\u0003\u0002\u0002\u0002\u01bf\u01bd\u0003\u0002\u0002\u0002\u01bf\u01c0\u0003\u0002\u0002\u0002\u01c0\u0037\u0003\u0002\u0002\u0002\u01c1\u01bf\u0003\u0002\u0002\u0002\u01c2\u01c3\u0007\u003a\u0002\u0002\u01c3\u01c4\u0005\u0088\u0045\u0002\u01c4\u01c5\u0007\u001d\u0002\u0002\u01c5\u01c6\u0005\u0088\u0045\u0002\u01c6\u0039\u0003\u0002\u0002\u0002\u01c7\u01c8\u0007\u0038\u0002\u0002\u01c8\u01c9\u0005\u0088\u0045\u0002\u01c9\u01ca\u0007\u0007\u0002\u0002\u01ca\u01cf\u0005\u0008\u0005\u0002\u01cb\u01cc\u0007\u001d\u0002\u0002\u01cc\u01ce\u0005\u0008\u0005\u0002\u01cd\u01cb\u0003\u0002\u0002\u0002\u01ce\u01d1\u0003\u0002\u0002\u0002\u01cf\u01cd\u0003\u0002\u0002\u0002\u01cf\u01d0\u0003\u0002\u0002\u0002\u01d0\u003b\u0003\u0002\u0002\u0002\u01d1\u01cf\u0003\u0002\u0002\u0002\u01d2\u01d3\u0007\u0038\u0002\u0002\u01d3\u01d4\u0005\u0088\u0045\u0002\u01d4\u01d5\u0007\u0008\u0002\u0002\u01d5\u01da\u0005\u0008\u0005\u0002\u01d6\u01d7\u0007\u001d\u0002\u0002\u01d7\u01d9\u0005\u0008\u0005\u0002\u01d8\u01d6\u0003\u0002\u0002\u0002\u01d9\u01dc\u0003\u0002\u0002\u0002\u01da\u01d8\u0003\u0002\u0002\u0002\u01da\u01db\u0003\u0002\u0002\u0002\u01db\u003d\u0003\u0002\u0002\u0002\u01dc\u01da\u0003\u0002\u0002\u0002\u01dd\u01de\u0007\u0035\u0002\u0002\u01de\u01df\u0005\u0088\u0045\u0002\u01df\u003f\u0003\u0002\u0002\u0002\u01e0\u01e1\u0007\u0036\u0002\u0002\u01e1\u01e2\u0005\u0088\u0045\u0002\u01e2\u0041\u0003\u0002\u0002\u0002\u01e3\u01e4\u0007\u003f\u0002\u0002\u01e4\u01e5\u0007\u002a\u0002\u0002\u01e5\u01e6\u0005\u0088\u0045\u0002\u01e6\u0043\u0003\u0002\u0002\u0002\u01e7\u01e8\u0007\u0040\u0002\u0002\u01e8\u01e9\u0007\u002a\u0002\u0002\u01e9\u01ea\u0005\u0088\u0045\u0002\u01ea\u0045\u0003\u0002\u0002\u0002\u01eb\u01ec\u0007\u004d\u0002\u0002\u01ec\u01f3\u0005\u0048\u0025\u0002\u01ed\u01ef\u0007\u001d\u0002\u0002\u01ee\u01f0\u0005\u0048\u0025\u0002\u01ef\u01ee\u0003\u0002\u0002\u0002\u01ef\u01f0\u0003\u0002\u0002\u0002\u01f0\u01f2\u0003\u0002\u0002\u0002\u01f1\u01ed\u0003\u0002\u0002\u0002\u01f2\u01f5\u0003\u0002\u0002\u0002\u01f3\u01f1\u0003\u0002\u0002\u0002\u01f3\u01f4\u0003\u0002\u0002\u0002\u01f4\u0047\u0003\u0002\u0002\u0002\u01f5\u01f3\u0003\u0002\u0002\u0002\u01f6\u01f9\u0005\u007a\u003e\u0002\u01f7\u01f9\u0007\u0078\u0002\u0002\u01f8\u01f6\u0003\u0002\u0002\u0002\u01f8\u01f7\u0003\u0002\u0002\u0002\u01f9\u0049\u0003\u0002\u0002\u0002\u01fa\u01fb\u0007\u004e\u0002\u0002\u01fb\u01fc\u0005\u0088\u0045\u0002\u01fc\u01fd\u0007\u001d\u0002\u0002\u01fd\u0200\u0005\u0088\u0045\u0002\u01fe\u01ff\u0007\u001d\u0002\u0002\u01ff\u0201\u0005\u0088\u0045\u0002\u0200\u01fe\u0003\u0002\u0002\u0002\u0200\u0201\u0003\u0002\u0002\u0002\u0201\u004b\u0003\u0002\u0002\u0002\u0202\u0203\u0007\u0050\u0002\u0002\u0203\u0209\u0005\u0088\u0045\u0002\u0204\u0205\u0007\u0052\u0002\u0002\u0205\u0206\u0005\u0088\u0045\u0002\u0206\u0207\u0007\u001d\u0002\u0002\u0207\u0208\u0005\u0088\u0045\u0002\u0208\u020a\u0003\u0002\u0002\u0002\u0209\u0204\u0003\u0002\u0002\u0002\u0209\u020a\u0003\u0002\u0002\u0002\u020a\u004d\u0003\u0002\u0002\u0002\u020b\u020c\u0007\u0051\u0002\u0002\u020c\u0212\u0005\u0088\u0045\u0002\u020d\u020e\u0007\u0052\u0002\u0002\u020e\u020f\u0005\u0088\u0045\u0002\u020f\u0210\u0007\u001d\u0002\u0002\u0210\u0211\u0005\u0088\u0045\u0002\u0211\u0213\u0003\u0002\u0002\u0002\u0212\u020d\u0003\u0002\u0002\u0002\u0212\u0213\u0003\u0002\u0002\u0002\u0213\u004f\u0003\u0002\u0002\u0002\u0214\u0216\u0007\u0053\u0002\u0002\u0215\u0217\u0007\u0054\u0002\u0002\u0216\u0215\u0003\u0002\u0002\u0002\u0216\u0217\u0003\u0002\u0002\u0002\u0217\u0218\u0003\u0002\u0002\u0002\u0218\u0219\u0005\u008a\u0046\u0002\u0219\u021a\u0007\u0012\u0002\u0002\u021a\u021b\u0005\u008a\u0046\u0002\u021b\u021c\u0007\u0013\u0002\u0002\u021c\u021d\u0007\u0022\u0002\u0002\u021d\u021e\u0005\u0088\u0045\u0002\u021e\u0051\u0003\u0002\u0002\u0002\u021f\u0220\u0007\u0056\u0002\u0002\u0220\u0221\u0007\u0012\u0002\u0002\u0221\u0222\u0005\u0088\u0045\u0002\u0222\u0223\u0007\u0013\u0002\u0002\u0223\u0053\u0003\u0002\u0002\u0002\u0224\u0225\u0007\u0057\u0002\u0002\u0225\u0226\u0007\u0022\u0002\u0002\u0226\u0227\u0005\u0088\u0045\u0002\u0227\u0055\u0003\u0002\u0002\u0002\u0228\u0229\u0007\u0058\u0002\u0002\u0229\u022a\u0007\u0022\u0002\u0002\u022a\u022b\u0005\u0088\u0045\u0002\u022b\u0057\u0003\u0002\u0002\u0002\u022c\u022d\u0007\u0059\u0002\u0002\u022d\u022e\u0007\u0022\u0002\u0002\u022e\u022f\u0005\u0088\u0045\u0002\u022f\u0059\u0003\u0002\u0002\u0002\u0230\u0231\u0007\u005a\u0002\u0002\u0231\u0232\u0007\u0022\u0002\u0002\u0232\u0233\u0005\u0088\u0045\u0002\u0233\u005b\u0003\u0002\u0002\u0002\u0234\u0235\u0007\u005b\u0002\u0002\u0235\u0236\u0007\u0022\u0002\u0002\u0236\u0237\u0005\u0088\u0045\u0002\u0237\u005d\u0003\u0002\u0002\u0002\u0238\u0239\u0007\u005c\u0002\u0002\u0239\u023a\u0005\u0088\u0045\u0002\u023a\u023b\u0007\u001d\u0002\u0002\u023b\u023c\u0005\u0088\u0045\u0002\u023c\u023d\u0007\u0052\u0002\u0002\u023d\u023e\u0005\u0088\u0045\u0002\u023e\u005f\u0003\u0002\u0002\u0002\u023f\u0240\u0007\u005d\u0002\u0002\u0240\u0241\u0005\u0088\u0045\u0002\u0241\u0242\u0007\u001d\u0002\u0002\u0242\u0243\u0005\u0088\u0045\u0002\u0243\u0244\u0007\u0052\u0002\u0002\u0244\u0245\u0005\u0088\u0045\u0002\u0245\u0061\u0003\u0002\u0002\u0002\u0246\u0247\u0007\u0044\u0002\u0002\u0247\u0248\u0007\u0007\u0002\u0002\u0248\u0249\u0005\u0008\u0005\u0002\u0249\u0063\u0003\u0002\u0002\u0002\u024a\u024b\u0007\u0033\u0002\u0002\u024b\u024c\u0007\u007a\u0002\u0002\u024c\u0065\u0003\u0002\u0002\u0002\u024d\u024e\u0007\u0034\u0002\u0002\u024e\u024f\u0007\u007a\u0002\u0002\u024f\u0067\u0003\u0002\u0002\u0002\u0250\u0251\u0007\u006a\u0002\u0002\u0251\u0252\u0005\u000e\u0008\u0002\u0252\u0069\u0003\u0002\u0002\u0002\u0253\u0254\u0007\u006b\u0002\u0002\u0254\u0255\u0005\u000e\u0008\u0002\u0255\u006b\u0003\u0002\u0002\u0002\u0256\u0258\u0007\u001e\u0002\u0002\u0257\u0259\u0005\u0088\u0045\u0002\u0258\u0257\u0003\u0002\u0002\u0002\u0258\u0259\u0003\u0002\u0002\u0002\u0259\u006d\u0003\u0002\u0002\u0002\u025a\u025f\u0007\u005f\u0002\u0002\u025b\u025c\u0005\u0088\u0045\u0002\u025c\u025d\u0007\u001d\u0002\u0002\u025d\u025e\u0005\u0088\u0045\u0002\u025e\u0260\u0003\u0002\u0002\u0002\u025f\u025b\u0003\u0002\u0002\u0002\u025f\u0260\u0003\u0002\u0002\u0002\u0260\u006f\u0003\u0002\u0002\u0002\u0261\u0262\u0007\u006e\u0002\u0002\u0262\u0263\u0005\u0088\u0045\u0002\u0263\u0071\u0003\u0002\u0002\u0002\u0264\u0265\u0007\u0075\u0002\u0002\u0265\u0266\u0005\u0088\u0045\u0002\u0266\u0073\u0003\u0002\u0002\u0002\u0267\u0268\u0007\u0020\u0002\u0002\u0268\u0075\u0003\u0002\u0002\u0002\u0269\u026a\u0007\u0005\u0002\u0002\u026a\u0077\u0003\u0002\u0002\u0002\u026b\u026c\u0007\u0071\u0002\u0002\u026c\u0079\u0003\u0002\u0002\u0002\u026d\u026f\u0009\u0006\u0002\u0002\u026e\u026d\u0003\u0002\u0002\u0002\u026e\u026f\u0003\u0002\u0002\u0002\u026f\u0270\u0003\u0002\u0002\u0002\u0270\u0271\u0009\u0007\u0002\u0002\u0271\u007b\u0003\u0002\u0002\u0002\u0272\u0296\u0007\u0078\u0002\u0002\u0273\u0296\u0005\u007a\u003e\u0002\u0274\u0296\u0005\u00ca\u0066\u0002\u0275\u0296\u0005\u000e\u0008\u0002\u0276\u0296\u0005\u0096\u004c\u0002\u0277\u0296\u0005\u0094\u004b\u0002\u0278\u0296\u0005\u0098\u004d\u0002\u0279\u0296\u0005\u00b0\u0059\u0002\u027a\u0296\u0005\u009a\u004e\u0002\u027b\u0296\u0005\u00b6\u005c\u0002\u027c\u0296\u0005\u009c\u004f\u0002\u027d\u0296\u0005\u009e\u0050\u0002\u027e\u0296\u0005\u00a0\u0051\u0002\u027f\u0296\u0005\u00a2\u0052\u0002\u0280\u0296\u0005\u00a4\u0053\u0002\u0281\u0296\u0005\u00a6\u0054\u0002\u0282\u0296\u0005\u00a8\u0055\u0002\u0283\u0296\u0005\u00aa\u0056\u0002\u0284\u0296\u0005\u00ac\u0057\u0002\u0285\u0296\u0005\u00b4\u005b\u0002\u0286\u0296\u0005\u00ae\u0058\u0002\u0287\u0296\u0005\u00b2\u005a\u0002\u0288\u0296\u0005\u00b8\u005d\u0002\u0289\u0296\u0005\u00ba\u005e\u0002\u028a\u0296\u0005\u00bc\u005f\u0002\u028b\u0296\u0005\u00be\u0060\u0002\u028c\u0296\u0005\u00c0\u0061\u0002\u028d\u0296\u0005\u00c2\u0062\u0002\u028e\u0296\u0005\u00c4\u0063\u0002\u028f\u0296\u0005\u00c6\u0064\u0002\u0290\u0296\u0005\u00c8\u0065\u0002\u0291\u0292\u0007\u0012\u0002\u0002\u0292\u0293\u0005\u0088\u0045\u0002\u0293\u0294\u0007\u0013\u0002\u0002\u0294\u0296\u0003\u0002\u0002\u0002\u0295\u0272\u0003\u0002\u0002\u0002\u0295\u0273\u0003\u0002\u0002\u0002\u0295\u0274\u0003\u0002\u0002\u0002\u0295\u0275\u0003\u0002\u0002\u0002\u0295\u0276\u0003\u0002\u0002\u0002\u0295\u0277\u0003\u0002\u0002\u0002\u0295\u0278\u0003\u0002\u0002\u0002\u0295\u0279\u0003\u0002\u0002\u0002\u0295\u027a\u0003\u0002\u0002\u0002\u0295\u027b\u0003\u0002\u0002\u0002\u0295\u027c\u0003\u0002\u0002\u0002\u0295\u027d\u0003\u0002\u0002\u0002\u0295\u027e\u0003\u0002\u0002\u0002\u0295\u027f\u0003\u0002\u0002\u0002\u0295\u0280\u0003\u0002\u0002\u0002\u0295\u0281\u0003\u0002\u0002\u0002\u0295\u0282\u0003\u0002\u0002\u0002\u0295\u0283\u0003\u0002\u0002\u0002\u0295\u0284\u0003\u0002\u0002\u0002\u0295\u0285\u0003\u0002\u0002\u0002\u0295\u0286\u0003\u0002\u0002\u0002\u0295\u0287\u0003\u0002\u0002\u0002\u0295\u0288\u0003\u0002\u0002\u0002\u0295\u0289\u0003\u0002\u0002\u0002\u0295\u028a\u0003\u0002\u0002\u0002\u0295\u028b\u0003\u0002\u0002\u0002\u0295\u028c\u0003\u0002\u0002\u0002\u0295\u028d\u0003\u0002\u0002\u0002\u0295\u028e\u0003\u0002\u0002\u0002\u0295\u028f\u0003\u0002\u0002\u0002\u0295\u0290\u0003\u0002\u0002\u0002\u0295\u0291\u0003\u0002\u0002\u0002\u0296\u007d\u0003\u0002\u0002\u0002\u0297\u0299\u0007\u0070\u0002\u0002\u0298\u0297\u0003\u0002\u0002\u0002\u0298\u0299\u0003\u0002\u0002\u0002\u0299\u029b\u0003\u0002\u0002\u0002\u029a\u029c\u0009\u0006\u0002\u0002\u029b\u029a\u0003\u0002\u0002\u0002\u029b\u029c\u0003\u0002\u0002\u0002\u029c\u029d\u0003\u0002\u0002\u0002\u029d\u029e\u0005\u007c\u003f\u0002\u029e\u007f\u0003\u0002\u0002\u0002\u029f\u02a4\u0005\u007e\u0040\u0002\u02a0\u02a1\u0007\u006d\u0002\u0002\u02a1\u02a3\u0005\u007e\u0040\u0002\u02a2\u02a0\u0003\u0002\u0002\u0002\u02a3\u02a6\u0003\u0002\u0002\u0002\u02a4\u02a2\u0003\u0002\u0002\u0002\u02a4\u02a5\u0003\u0002\u0002\u0002\u02a5\u0081\u0003\u0002\u0002\u0002\u02a6\u02a4\u0003\u0002\u0002\u0002\u02a7\u02ac\u0005\u0080\u0041\u0002\u02a8\u02a9\u0009\u0008\u0002\u0002\u02a9\u02ab\u0005\u0080\u0041\u0002\u02aa\u02a8\u0003\u0002\u0002\u0002\u02ab\u02ae\u0003\u0002\u0002\u0002\u02ac\u02aa\u0003\u0002\u0002\u0002\u02ac\u02ad\u0003\u0002\u0002\u0002\u02ad\u0083\u0003\u0002\u0002\u0002\u02ae\u02ac\u0003\u0002\u0002\u0002\u02af\u02b4\u0005\u0082\u0042\u0002\u02b0\u02b1\u0009\u0006\u0002\u0002\u02b1\u02b3\u0005\u0082\u0042\u0002\u02b2\u02b0\u0003\u0002\u0002\u0002\u02b3\u02b6\u0003\u0002\u0002\u0002\u02b4\u02b2\u0003\u0002\u0002\u0002\u02b4\u02b5\u0003\u0002\u0002\u0002\u02b5\u0085\u0003\u0002\u0002\u0002\u02b6\u02b4\u0003\u0002\u0002\u0002\u02b7\u02bb\u0005\u0084\u0043\u0002\u02b8\u02b9\u0005\u001a\u000e\u0002\u02b9\u02ba\u0005\u0084\u0043\u0002\u02ba\u02bc\u0003\u0002\u0002\u0002\u02bb\u02b8\u0003\u0002\u0002\u0002\u02bb\u02bc\u0003\u0002\u0002\u0002\u02bc\u0087\u0003\u0002\u0002\u0002\u02bd\u02c7\u0005\u007c\u003f\u0002\u02be\u02c3\u0005\u0086\u0044\u0002\u02bf\u02c0\u0009\u0009\u0002\u0002\u02c0\u02c2\u0005\u0086\u0044\u0002\u02c1\u02bf\u0003\u0002\u0002\u0002\u02c2\u02c5\u0003\u0002\u0002\u0002\u02c3\u02c1\u0003\u0002\u0002\u0002\u02c3\u02c4\u0003\u0002\u0002\u0002\u02c4\u02c7\u0003\u0002\u0002\u0002\u02c5\u02c3\u0003\u0002\u0002\u0002\u02c6\u02bd\u0003\u0002\u0002\u0002\u02c6\u02be\u0003\u0002\u0002\u0002\u02c7\u0089\u0003\u0002\u0002\u0002\u02c8\u02ca\u0005\u008c\u0047\u0002\u02c9\u02cb\u0005\u008e\u0048\u0002\u02ca\u02c9\u0003\u0002\u0002\u0002\u02ca\u02cb\u0003\u0002\u0002\u0002\u02cb\u008b\u0003\u0002\u0002\u0002\u02cc\u02d0\u0007\u0079\u0002\u0002\u02cd\u02cf\u0009\u000a\u0002\u0002\u02ce\u02cd\u0003\u0002\u0002\u0002\u02cf\u02d2\u0003\u0002\u0002\u0002\u02d0\u02ce\u0003\u0002\u0002\u0002\u02d0\u02d1\u0003\u0002\u0002\u0002\u02d1\u008d\u0003\u0002\u0002\u0002\u02d2\u02d0\u0003\u0002\u0002\u0002\u02d3\u02d4\u0009\u000b\u0002\u0002\u02d4\u008f\u0003\u0002\u0002\u0002\u02d5\u02da\u0005\u000e\u0008\u0002\u02d6\u02d7\u0007\u001d\u0002\u0002\u02d7\u02d9\u0005\u000e\u0008\u0002\u02d8\u02d6\u0003\u0002\u0002\u0002\u02d9\u02dc\u0003\u0002\u0002\u0002\u02da\u02d8\u0003\u0002\u0002\u0002\u02da\u02db\u0003\u0002\u0002\u0002\u02db\u0091\u0003\u0002\u0002\u0002\u02dc\u02da\u0003\u0002\u0002\u0002\u02dd\u02e2\u0005\u0088\u0045\u0002\u02de\u02df\u0007\u001d\u0002\u0002\u02df\u02e1\u0005\u0088\u0045\u0002\u02e0\u02de\u0003\u0002\u0002\u0002\u02e1\u02e4\u0003\u0002\u0002\u0002\u02e2\u02e0\u0003\u0002\u0002\u0002\u02e2\u02e3\u0003\u0002\u0002\u0002\u02e3\u0093\u0003\u0002\u0002\u0002\u02e4\u02e2\u0003\u0002\u0002\u0002\u02e5\u02e6\u0007\u0029\u0002\u0002\u02e6\u02e7\u0007\u0012\u0002\u0002\u02e7\u02e8\u0005\u0088\u0045\u0002\u02e8\u02e9\u0007\u0013\u0002\u0002\u02e9\u0095\u0003\u0002\u0002\u0002\u02ea\u02eb\u0007\u000d\u0002\u0002\u02eb\u02ec\u0007\u0012\u0002\u0002\u02ec\u02ed\u0005\u0088\u0045\u0002\u02ed\u02ee\u0007\u0013\u0002\u0002\u02ee\u0097\u0003\u0002\u0002\u0002\u02ef\u02f0\u0007\u002e\u0002\u0002\u02f0\u02f1\u0007\u0012\u0002\u0002\u02f1\u02f2\u0005\u0088\u0045\u0002\u02f2\u02f3\u0007\u0013\u0002\u0002\u02f3\u0099\u0003\u0002\u0002\u0002\u02f4\u02f5\u0007\u0030\u0002\u0002\u02f5\u02f6\u0007\u0012\u0002\u0002\u02f6\u02f7\u0005\u0088\u0045\u0002\u02f7\u02f8\u0007\u0013\u0002\u0002\u02f8\u009b\u0003\u0002\u0002\u0002\u02f9\u02fa\u0007\u000e\u0002\u0002\u02fa\u02fb\u0007\u0012\u0002\u0002\u02fb\u02fc\u0005\u0088\u0045\u0002\u02fc\u02fd\u0007\u001d\u0002\u0002\u02fd\u02fe\u0005\u0088\u0045\u0002\u02fe\u02ff\u0007\u001d\u0002\u0002\u02ff\u0300\u0005\u0088\u0045\u0002\u0300\u0301\u0007\u0013\u0002\u0002\u0301\u009d\u0003\u0002\u0002\u0002\u0302\u0303\u0007\u0039\u0002\u0002\u0303\u0304\u0007\u0012\u0002\u0002\u0304\u0305\u0005\u0088\u0045\u0002\u0305\u0306\u0007\u0013\u0002\u0002\u0306\u009f\u0003\u0002\u0002\u0002\u0307\u0308\u0007\u003b\u0002\u0002\u0308\u0309\u0007\u0012\u0002\u0002\u0309\u030a\u0005\u0088\u0045\u0002\u030a\u030b\u0007\u0013\u0002\u0002\u030b\u00a1\u0003\u0002\u0002\u0002\u030c\u030d\u0007\u003d\u0002\u0002\u030d\u030e\u0007\u0012\u0002\u0002\u030e\u030f\u0005\u0088\u0045\u0002\u030f\u0310\u0007\u0013\u0002\u0002\u0310\u00a3\u0003\u0002\u0002\u0002\u0311\u0312\u0007\u0045\u0002\u0002\u0312\u0313\u0007\u0012\u0002\u0002\u0313\u0314\u0005\u0088\u0045\u0002\u0314\u0315\u0007\u0013\u0002\u0002\u0315\u00a5\u0003\u0002\u0002\u0002\u0316\u0317\u0007\u0046\u0002\u0002\u0317\u0318\u0007\u0012\u0002\u0002\u0318\u0319\u0005\u0088\u0045\u0002\u0319\u031a\u0007\u0013\u0002\u0002\u031a\u00a7\u0003\u0002\u0002\u0002\u031b\u031c\u0007\u0047\u0002\u0002\u031c\u031d\u0007\u0012\u0002\u0002\u031d\u031e\u0005\u0088\u0045\u0002\u031e\u031f\u0007\u0013\u0002\u0002\u031f\u00a9\u0003\u0002\u0002\u0002\u0320\u0321\u0007\u0048\u0002\u0002\u0321\u0322\u0007\u0012\u0002\u0002\u0322\u0323\u0005\u0088\u0045\u0002\u0323\u0324\u0007\u0013\u0002\u0002\u0324\u00ab\u0003\u0002\u0002\u0002\u0325\u0326\u0007\u000f\u0002\u0002\u0326\u0327\u0007\u0012\u0002\u0002\u0327\u0328\u0005\u0088\u0045\u0002\u0328\u0329\u0007\u001d\u0002\u0002\u0329\u032a\u0005\u0088\u0045\u0002\u032a\u032b\u0007\u0013\u0002\u0002\u032b\u00ad\u0003\u0002\u0002\u0002\u032c\u032d\u0007\u0010\u0002\u0002\u032d\u032e\u0007\u0012\u0002\u0002\u032e\u032f\u0005\u0088\u0045\u0002\u032f\u0330\u0007\u001d\u0002\u0002\u0330\u0331\u0005\u0088\u0045\u0002\u0331\u0332\u0007\u0013\u0002\u0002\u0332\u00af\u0003\u0002\u0002\u0002\u0333\u0334\u0007\u0011\u0002\u0002\u0334\u0335\u0007\u0012\u0002\u0002\u0335\u0336\u0005\u0088\u0045\u0002\u0336\u0337\u0007\u0013\u0002\u0002\u0337\u00b1\u0003\u0002\u0002\u0002\u0338\u0339\u0007\u0054\u0002\u0002\u0339\u033a\u0005\u008a\u0046\u0002\u033a\u033b\u0007\u0012\u0002\u0002\u033b\u033c\u0005\u0088\u0045\u0002\u033c\u033d\u0007\u0013\u0002\u0002\u033d\u00b3\u0003\u0002\u0002\u0002\u033e\u033f\u0007\u0055\u0002\u0002\u033f\u0340\u0007\u0012\u0002\u0002\u0340\u0341\u0005\u0088\u0045\u0002\u0341\u0342\u0007\u0013\u0002\u0002\u0342\u00b5\u0003\u0002\u0002\u0002\u0343\u0344\u0007\u005e\u0002\u0002\u0344\u0345\u0007\u0012\u0002\u0002\u0345\u0346\u0005\u0088\u0045\u0002\u0346\u0347\u0007\u001d\u0002\u0002\u0347\u0348\u0005\u0088\u0045\u0002\u0348\u0349\u0007\u0013\u0002\u0002\u0349\u00b7\u0003\u0002\u0002\u0002\u034a\u034b\u0007\u0061\u0002\u0002\u034b\u034c\u0007\u0012\u0002\u0002\u034c\u034d\u0005\u0088\u0045\u0002\u034d\u034e\u0007\u0013\u0002\u0002\u034e\u00b9\u0003\u0002\u0002\u0002\u034f\u0350\u0007\u0062\u0002\u0002\u0350\u0351\u0007\u0012\u0002\u0002\u0351\u0352\u0005\u0088\u0045\u0002\u0352\u0353\u0007\u0013\u0002\u0002\u0353\u00bb\u0003\u0002\u0002\u0002\u0354\u0355\u0007\u0063\u0002\u0002\u0355\u0356\u0007\u0012\u0002\u0002\u0356\u0357\u0005\u0088\u0045\u0002\u0357\u0358\u0007\u0013\u0002\u0002\u0358\u00bd\u0003\u0002\u0002\u0002\u0359\u035a\u0007\u0064\u0002\u0002\u035a\u035b\u0007\u0012\u0002\u0002\u035b\u035c\u0005\u0088\u0045\u0002\u035c\u035d\u0007\u0013\u0002\u0002\u035d\u00bf\u0003\u0002\u0002\u0002\u035e\u035f\u0007\u0065\u0002\u0002\u035f\u0360\u0007\u0012\u0002\u0002\u0360\u0361\u0005\u0088\u0045\u0002\u0361\u0362\u0007\u0013\u0002\u0002\u0362\u00c1\u0003\u0002\u0002\u0002\u0363\u0364\u0007\u0066\u0002\u0002\u0364\u0365\u0007\u0012\u0002\u0002\u0365\u0366\u0005\u0088\u0045\u0002\u0366\u0367\u0007\u0013\u0002\u0002\u0367\u00c3\u0003\u0002\u0002\u0002\u0368\u0369\u0007\u0067\u0002\u0002\u0369\u036a\u0007\u0012\u0002\u0002\u036a\u036b\u0005\u0088\u0045\u0002\u036b\u036c\u0007\u0013\u0002\u0002\u036c\u00c5\u0003\u0002\u0002\u0002\u036d\u036e\u0007\u0068\u0002\u0002\u036e\u036f\u0007\u0012\u0002\u0002\u036f\u0370\u0005\u0088\u0045\u0002\u0370\u0371\u0007\u0013\u0002\u0002\u0371\u00c7\u0003\u0002\u0002\u0002\u0372\u0373\u0007\u0069\u0002\u0002\u0373\u0374\u0007\u0012\u0002\u0002\u0374\u0375\u0005\u0088\u0045\u0002\u0375\u0376\u0007\u0013\u0002\u0002\u0376\u00c9\u0003\u0002\u0002\u0002\u0377\u0378\u0007\u0056\u0002\u0002\u0378\u0379\u0007\u0012\u0002\u0002\u0379\u037a\u0005\u0088\u0045\u0002\u037a\u037b\u0007\u0013\u0002\u0002\u037b\u00cb\u0003\u0002\u0002\u0002\u0035\u00cf\u00d7\u00db\u00df\u00e6\u00ea\u011d\u0126\u012b\u0130\u0134\u013b\u0151\u0159\u015d\u0167\u016c\u016e\u0178\u0180\u0183\u0188\u01a5\u01ae\u01b6\u01bf\u01cf\u01da\u01ef\u01f3\u01f8\u0200\u0209\u0212\u0216\u0258\u025f\u026e\u0295\u0298\u029b\u02a4\u02ac\u02b4\u02bb\u02c3\u02c6\u02ca\u02d0\u02da\u02e2"

        val ATN = ATNDeserializer().deserialize(serializedATN.toCharArray())
        init {
        	decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
        		DFA(ATN.getDecisionState(it)!!, it)
        	})


        }
	}

    private val DOLLAR = Tokens.DOLLAR.id
    private val PERCENT = Tokens.PERCENT.id
    private val RETURN = Tokens.RETURN.id
    private val PRINT = Tokens.PRINT.id
    private val GOTO = Tokens.GOTO.id
    private val GOSUB = Tokens.GOSUB.id
    private val IF = Tokens.IF.id
    private val NEXT = Tokens.NEXT.id
    private val THEN = Tokens.THEN.id
    private val REM = Tokens.REM.id
    private val CHR = Tokens.CHR.id
    private val MID = Tokens.MID.id
    private val LEFT = Tokens.LEFT.id
    private val RIGHT = Tokens.RIGHT.id
    private val STR = Tokens.STR.id
    private val LPAREN = Tokens.LPAREN.id
    private val RPAREN = Tokens.RPAREN.id
    private val PLUS = Tokens.PLUS.id
    private val MINUS = Tokens.MINUS.id
    private val TIMES = Tokens.TIMES.id
    private val DIV = Tokens.DIV.id
    private val CLEAR = Tokens.CLEAR.id
    private val GTE = Tokens.GTE.id
    private val LTE = Tokens.LTE.id
    private val GT = Tokens.GT.id
    private val LT = Tokens.LT.id
    private val COMMA = Tokens.COMMA.id
    private val LIST = Tokens.LIST.id
    private val RUN = Tokens.RUN.id
    private val END = Tokens.END.id
    private val LET = Tokens.LET.id
    private val EQ = Tokens.EQ.id
    private val FOR = Tokens.FOR.id
    private val TO = Tokens.TO.id
    private val STEP = Tokens.STEP.id
    private val INPUT = Tokens.INPUT.id
    private val SEMICOLON = Tokens.SEMICOLON.id
    private val DIM = Tokens.DIM.id
    private val SQR = Tokens.SQR.id
    private val COLON = Tokens.COLON.id
    private val TEXT = Tokens.TEXT.id
    private val HGR = Tokens.HGR.id
    private val HGR2 = Tokens.HGR2.id
    private val LEN = Tokens.LEN.id
    private val CALL = Tokens.CALL.id
    private val ASC = Tokens.ASC.id
    private val HPLOT = Tokens.HPLOT.id
    private val VPLOT = Tokens.VPLOT.id
    private val PRNUMBER = Tokens.PRNUMBER.id
    private val INNUMBER = Tokens.INNUMBER.id
    private val VTAB = Tokens.VTAB.id
    private val HTAB = Tokens.HTAB.id
    private val HOME = Tokens.HOME.id
    private val ON = Tokens.ON.id
    private val PDL = Tokens.PDL.id
    private val PLOT = Tokens.PLOT.id
    private val PEEK = Tokens.PEEK.id
    private val POKE = Tokens.POKE.id
    private val INTF = Tokens.INTF.id
    private val STOP = Tokens.STOP.id
    private val HIMEM = Tokens.HIMEM.id
    private val LOMEM = Tokens.LOMEM.id
    private val FLASH = Tokens.FLASH.id
    private val INVERSE = Tokens.INVERSE.id
    private val NORMAL = Tokens.NORMAL.id
    private val ONERR = Tokens.ONERR.id
    private val SPC = Tokens.SPC.id
    private val FRE = Tokens.FRE.id
    private val POS = Tokens.POS.id
    private val USR = Tokens.USR.id
    private val TRACE = Tokens.TRACE.id
    private val NOTRACE = Tokens.NOTRACE.id
    private val AND = Tokens.AND.id
    private val OR = Tokens.OR.id
    private val DATA = Tokens.DATA.id
    private val WAIT = Tokens.WAIT.id
    private val READ = Tokens.READ.id
    private val XDRAW = Tokens.XDRAW.id
    private val DRAW = Tokens.DRAW.id
    private val AT = Tokens.AT.id
    private val DEF = Tokens.DEF.id
    private val FN = Tokens.FN.id
    private val VAL = Tokens.VAL.id
    private val TAB = Tokens.TAB.id
    private val SPEED = Tokens.SPEED.id
    private val ROT = Tokens.ROT.id
    private val SCALE = Tokens.SCALE.id
    private val COLOR = Tokens.COLOR.id
    private val HCOLOR = Tokens.HCOLOR.id
    private val HLIN = Tokens.HLIN.id
    private val VLIN = Tokens.VLIN.id
    private val SCRN = Tokens.SCRN.id
    private val POP = Tokens.POP.id
    private val SHLOAD = Tokens.SHLOAD.id
    private val SIN = Tokens.SIN.id
    private val COS = Tokens.COS.id
    private val TAN = Tokens.TAN.id
    private val ATN = Tokens.ATN.id
    private val RND = Tokens.RND.id
    private val SGN = Tokens.SGN.id
    private val EXP = Tokens.EXP.id
    private val LOG = Tokens.LOG.id
    private val ABS = Tokens.ABS.id
    private val STORE = Tokens.STORE.id
    private val RECALL = Tokens.RECALL.id
    private val GET = Tokens.GET.id
    private val EXPONENT = Tokens.EXPONENT.id
    private val AMPERSAND = Tokens.AMPERSAND.id
    private val GR = Tokens.GR.id
    private val NOT = Tokens.NOT.id
    private val RESTORE = Tokens.RESTORE.id
    private val SAVE = Tokens.SAVE.id
    private val LOAD = Tokens.LOAD.id
    private val QUESTION = Tokens.QUESTION.id
    private val INCLUDE = Tokens.INCLUDE.id
    private val CLS = Tokens.CLS.id
    private val COMMENT = Tokens.COMMENT.id
    private val STRINGLITERAL = Tokens.STRINGLITERAL.id
    private val LETTERS = Tokens.LETTERS.id
    private val NUMBER = Tokens.NUMBER.id
    private val FLOAT = Tokens.FLOAT.id
    private val WS = Tokens.WS.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class ProgContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_prog.id
	        set(value) { throw RuntimeException() }
		fun EOF() : TerminalNode? = getToken(jvmBasicParser.Tokens.EOF.id, 0)
		fun findLine() : List<LineContext> = getRuleContexts(solver.getType("LineContext"))
		fun findLine(i: Int) : LineContext? = getRuleContext(solver.getType("LineContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterProg(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitProg(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitProg(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  prog() : ProgContext {
		var _localctx : ProgContext = ProgContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_prog.id)
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
				line()
				}
				}
				this.state = 205 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==NUMBER )
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

	open class LineContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_line.id
	        set(value) { throw RuntimeException() }
		fun findLinenumber() : LinenumberContext? = getRuleContext(solver.getType("LinenumberContext"),0)
		fun COMMENT() : TerminalNode? = getToken(jvmBasicParser.Tokens.COMMENT.id, 0)
		fun REM() : TerminalNode? = getToken(jvmBasicParser.Tokens.REM.id, 0)
		fun findAmprstmt() : List<AmprstmtContext> = getRuleContexts(solver.getType("AmprstmtContext"))
		fun findAmprstmt(i: Int) : AmprstmtContext? = getRuleContext(solver.getType("AmprstmtContext"),i)
		fun COLON() : List<TerminalNode> = getTokens(jvmBasicParser.Tokens.COLON.id)
		fun COLON(i: Int) : TerminalNode = getToken(jvmBasicParser.Tokens.COLON.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterLine(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitLine(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitLine(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  line() : LineContext {
		var _localctx : LineContext = LineContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_line.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 209
			linenumber()
			this.state = 221
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,3,context) ) {
			1 -> {if (true){
			if (true){
			this.state = 210
			amprstmt()
			this.state = 217
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLON) {
				if (true){
				if (true){
				this.state = 211
				match(COLON) as Token
				this.state = 213
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl RETURN) or (1L shl PRINT) or (1L shl GOTO) or (1L shl GOSUB) or (1L shl IF) or (1L shl NEXT) or (1L shl REM) or (1L shl CLEAR) or (1L shl LIST) or (1L shl RUN) or (1L shl END) or (1L shl LET) or (1L shl FOR) or (1L shl INPUT) or (1L shl DIM) or (1L shl TEXT) or (1L shl HGR) or (1L shl HGR2) or (1L shl CALL) or (1L shl HPLOT) or (1L shl VPLOT) or (1L shl PRNUMBER) or (1L shl INNUMBER) or (1L shl VTAB) or (1L shl HTAB) or (1L shl HOME) or (1L shl ON) or (1L shl PLOT) or (1L shl POKE) or (1L shl STOP) or (1L shl HIMEM) or (1L shl LOMEM) or (1L shl FLASH))) != 0L) || ((((_la - 64)) and 0x3f.inv()) == 0 && ((1L shl (_la - 64)) and ((1L shl (INVERSE - 64)) or (1L shl (NORMAL - 64)) or (1L shl (ONERR - 64)) or (1L shl (TRACE - 64)) or (1L shl (NOTRACE - 64)) or (1L shl (DATA - 64)) or (1L shl (WAIT - 64)) or (1L shl (READ - 64)) or (1L shl (XDRAW - 64)) or (1L shl (DRAW - 64)) or (1L shl (DEF - 64)) or (1L shl (TAB - 64)) or (1L shl (SPEED - 64)) or (1L shl (ROT - 64)) or (1L shl (SCALE - 64)) or (1L shl (COLOR - 64)) or (1L shl (HCOLOR - 64)) or (1L shl (HLIN - 64)) or (1L shl (VLIN - 64)) or (1L shl (POP - 64)) or (1L shl (SHLOAD - 64)) or (1L shl (STORE - 64)) or (1L shl (RECALL - 64)) or (1L shl (GET - 64)) or (1L shl (AMPERSAND - 64)) or (1L shl (GR - 64)) or (1L shl (RESTORE - 64)) or (1L shl (SAVE - 64)) or (1L shl (LOAD - 64)) or (1L shl (QUESTION - 64)) or (1L shl (INCLUDE - 64)) or (1L shl (CLS - 64)) or (1L shl (COMMENT - 64)) or (1L shl (LETTERS - 64)))) != 0L)) {
					if (true){
					this.state = 212
					amprstmt()
					}
				}

				}
				}
				this.state = 219
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}
			}}
			2 -> {if (true){
			this.state = 220
			_la = _input!!.LA(1)
			if ( !(_la==REM || _la==COMMENT) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
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

	open class AmperoperContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_amperoper.id
	        set(value) { throw RuntimeException() }
		fun AMPERSAND() : TerminalNode? = getToken(jvmBasicParser.Tokens.AMPERSAND.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterAmperoper(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitAmperoper(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitAmperoper(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  amperoper() : AmperoperContext {
		var _localctx : AmperoperContext = AmperoperContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_amperoper.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 223
			match(AMPERSAND) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class LinenumberContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_linenumber.id
	        set(value) { throw RuntimeException() }
		fun NUMBER() : TerminalNode? = getToken(jvmBasicParser.Tokens.NUMBER.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterLinenumber(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitLinenumber(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitLinenumber(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  linenumber() : LinenumberContext {
		var _localctx : LinenumberContext = LinenumberContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_linenumber.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 225
			match(NUMBER) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class AmprstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_amprstmt.id
	        set(value) { throw RuntimeException() }
		fun findStatement() : StatementContext? = getRuleContext(solver.getType("StatementContext"),0)
		fun findAmperoper() : AmperoperContext? = getRuleContext(solver.getType("AmperoperContext"),0)
		fun COMMENT() : TerminalNode? = getToken(jvmBasicParser.Tokens.COMMENT.id, 0)
		fun REM() : TerminalNode? = getToken(jvmBasicParser.Tokens.REM.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterAmprstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitAmprstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitAmprstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  amprstmt() : AmprstmtContext {
		var _localctx : AmprstmtContext = AmprstmtContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_amprstmt.id)
		var _la: Int
		try {
			this.state = 232
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			RETURN , PRINT , GOTO , GOSUB , IF , NEXT , CLEAR , LIST , RUN , END , LET , FOR , INPUT , DIM , TEXT , HGR , HGR2 , CALL , HPLOT , VPLOT , PRNUMBER , INNUMBER , VTAB , HTAB , HOME , ON , PLOT , POKE , STOP , HIMEM , LOMEM , FLASH , INVERSE , NORMAL , ONERR , TRACE , NOTRACE , DATA , WAIT , READ , XDRAW , DRAW , DEF , TAB , SPEED , ROT , SCALE , COLOR , HCOLOR , HLIN , VLIN , POP , SHLOAD , STORE , RECALL , GET , AMPERSAND , GR , RESTORE , SAVE , LOAD , QUESTION , INCLUDE , CLS , LETTERS  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 228
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,4,context) ) {
			1   -> if (true){
			this.state = 227
			amperoper()
			}
			}
			this.state = 230
			statement()
			}
			}}
			REM , COMMENT  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 231
			_la = _input!!.LA(1)
			if ( !(_la==REM || _la==COMMENT) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
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

	open class StatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_statement.id
	        set(value) { throw RuntimeException() }
		fun CLS() : TerminalNode? = getToken(jvmBasicParser.Tokens.CLS.id, 0)
		fun LOAD() : TerminalNode? = getToken(jvmBasicParser.Tokens.LOAD.id, 0)
		fun SAVE() : TerminalNode? = getToken(jvmBasicParser.Tokens.SAVE.id, 0)
		fun TRACE() : TerminalNode? = getToken(jvmBasicParser.Tokens.TRACE.id, 0)
		fun NOTRACE() : TerminalNode? = getToken(jvmBasicParser.Tokens.NOTRACE.id, 0)
		fun FLASH() : TerminalNode? = getToken(jvmBasicParser.Tokens.FLASH.id, 0)
		fun INVERSE() : TerminalNode? = getToken(jvmBasicParser.Tokens.INVERSE.id, 0)
		fun GR() : TerminalNode? = getToken(jvmBasicParser.Tokens.GR.id, 0)
		fun NORMAL() : TerminalNode? = getToken(jvmBasicParser.Tokens.NORMAL.id, 0)
		fun SHLOAD() : TerminalNode? = getToken(jvmBasicParser.Tokens.SHLOAD.id, 0)
		fun CLEAR() : TerminalNode? = getToken(jvmBasicParser.Tokens.CLEAR.id, 0)
		fun RUN() : TerminalNode? = getToken(jvmBasicParser.Tokens.RUN.id, 0)
		fun STOP() : TerminalNode? = getToken(jvmBasicParser.Tokens.STOP.id, 0)
		fun TEXT() : TerminalNode? = getToken(jvmBasicParser.Tokens.TEXT.id, 0)
		fun HOME() : TerminalNode? = getToken(jvmBasicParser.Tokens.HOME.id, 0)
		fun HGR() : TerminalNode? = getToken(jvmBasicParser.Tokens.HGR.id, 0)
		fun HGR2() : TerminalNode? = getToken(jvmBasicParser.Tokens.HGR2.id, 0)
		fun findEndstmt() : EndstmtContext? = getRuleContext(solver.getType("EndstmtContext"),0)
		fun findReturnstmt() : ReturnstmtContext? = getRuleContext(solver.getType("ReturnstmtContext"),0)
		fun findRestorestmt() : RestorestmtContext? = getRuleContext(solver.getType("RestorestmtContext"),0)
		fun findAmptstmt() : AmptstmtContext? = getRuleContext(solver.getType("AmptstmtContext"),0)
		fun findPopstmt() : PopstmtContext? = getRuleContext(solver.getType("PopstmtContext"),0)
		fun findListstmt() : ListstmtContext? = getRuleContext(solver.getType("ListstmtContext"),0)
		fun findStorestmt() : StorestmtContext? = getRuleContext(solver.getType("StorestmtContext"),0)
		fun findGetstmt() : GetstmtContext? = getRuleContext(solver.getType("GetstmtContext"),0)
		fun findRecallstmt() : RecallstmtContext? = getRuleContext(solver.getType("RecallstmtContext"),0)
		fun findNextstmt() : NextstmtContext? = getRuleContext(solver.getType("NextstmtContext"),0)
		fun findInstmt() : InstmtContext? = getRuleContext(solver.getType("InstmtContext"),0)
		fun findPrstmt() : PrstmtContext? = getRuleContext(solver.getType("PrstmtContext"),0)
		fun findOnerrstmt() : OnerrstmtContext? = getRuleContext(solver.getType("OnerrstmtContext"),0)
		fun findHlinstmt() : HlinstmtContext? = getRuleContext(solver.getType("HlinstmtContext"),0)
		fun findVlinstmt() : VlinstmtContext? = getRuleContext(solver.getType("VlinstmtContext"),0)
		fun findColorstmt() : ColorstmtContext? = getRuleContext(solver.getType("ColorstmtContext"),0)
		fun findSpeedstmt() : SpeedstmtContext? = getRuleContext(solver.getType("SpeedstmtContext"),0)
		fun findScalestmt() : ScalestmtContext? = getRuleContext(solver.getType("ScalestmtContext"),0)
		fun findRotstmt() : RotstmtContext? = getRuleContext(solver.getType("RotstmtContext"),0)
		fun findHcolorstmt() : HcolorstmtContext? = getRuleContext(solver.getType("HcolorstmtContext"),0)
		fun findHimemstmt() : HimemstmtContext? = getRuleContext(solver.getType("HimemstmtContext"),0)
		fun findLomemstmt() : LomemstmtContext? = getRuleContext(solver.getType("LomemstmtContext"),0)
		fun findPrintstmt1() : Printstmt1Context? = getRuleContext(solver.getType("Printstmt1Context"),0)
		fun findPokestmt() : PokestmtContext? = getRuleContext(solver.getType("PokestmtContext"),0)
		fun findPlotstmt() : PlotstmtContext? = getRuleContext(solver.getType("PlotstmtContext"),0)
		fun findOngotostmt() : OngotostmtContext? = getRuleContext(solver.getType("OngotostmtContext"),0)
		fun findOngosubstmt() : OngosubstmtContext? = getRuleContext(solver.getType("OngosubstmtContext"),0)
		fun findIfstmt() : IfstmtContext? = getRuleContext(solver.getType("IfstmtContext"),0)
		fun findForstmt1() : Forstmt1Context? = getRuleContext(solver.getType("Forstmt1Context"),0)
		fun findForstmt2() : Forstmt2Context? = getRuleContext(solver.getType("Forstmt2Context"),0)
		fun findInputstmt() : InputstmtContext? = getRuleContext(solver.getType("InputstmtContext"),0)
		fun findTabstmt() : TabstmtContext? = getRuleContext(solver.getType("TabstmtContext"),0)
		fun findDimstmt() : DimstmtContext? = getRuleContext(solver.getType("DimstmtContext"),0)
		fun findGotostmt() : GotostmtContext? = getRuleContext(solver.getType("GotostmtContext"),0)
		fun findGosubstmt() : GosubstmtContext? = getRuleContext(solver.getType("GosubstmtContext"),0)
		fun findCallstmt() : CallstmtContext? = getRuleContext(solver.getType("CallstmtContext"),0)
		fun findReadstmt() : ReadstmtContext? = getRuleContext(solver.getType("ReadstmtContext"),0)
		fun findHplotstmt() : HplotstmtContext? = getRuleContext(solver.getType("HplotstmtContext"),0)
		fun findVplotstmt() : VplotstmtContext? = getRuleContext(solver.getType("VplotstmtContext"),0)
		fun findVtabstmnt() : VtabstmntContext? = getRuleContext(solver.getType("VtabstmntContext"),0)
		fun findHtabstmnt() : HtabstmntContext? = getRuleContext(solver.getType("HtabstmntContext"),0)
		fun findWaitstmt() : WaitstmtContext? = getRuleContext(solver.getType("WaitstmtContext"),0)
		fun findDatastmt() : DatastmtContext? = getRuleContext(solver.getType("DatastmtContext"),0)
		fun findXdrawstmt() : XdrawstmtContext? = getRuleContext(solver.getType("XdrawstmtContext"),0)
		fun findDrawstmt() : DrawstmtContext? = getRuleContext(solver.getType("DrawstmtContext"),0)
		fun findDefstmt() : DefstmtContext? = getRuleContext(solver.getType("DefstmtContext"),0)
		fun findLetstmt() : LetstmtContext? = getRuleContext(solver.getType("LetstmtContext"),0)
		fun findIncludestmt() : IncludestmtContext? = getRuleContext(solver.getType("IncludestmtContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitStatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  statement() : StatementContext {
		var _localctx : StatementContext = StatementContext(context, state)
		enterRule(_localctx, 10, Rules.RULE_statement.id)
		var _la: Int
		try {
			this.state = 283
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,6,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 234
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl CLEAR) or (1L shl RUN) or (1L shl TEXT) or (1L shl HGR) or (1L shl HGR2) or (1L shl HOME) or (1L shl STOP) or (1L shl FLASH))) != 0L) || ((((_la - 64)) and 0x3f.inv()) == 0 && ((1L shl (_la - 64)) and ((1L shl (INVERSE - 64)) or (1L shl (NORMAL - 64)) or (1L shl (TRACE - 64)) or (1L shl (NOTRACE - 64)) or (1L shl (SHLOAD - 64)) or (1L shl (GR - 64)) or (1L shl (SAVE - 64)) or (1L shl (LOAD - 64)) or (1L shl (CLS - 64)))) != 0L)) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 235
			endstmt()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 236
			returnstmt()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 237
			restorestmt()
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 238
			amptstmt()
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 239
			popstmt()
			}}
			7 -> {
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 240
			liststmt()
			}}
			8 -> {
			enterOuterAlt(_localctx, 8)
			if (true){
			this.state = 241
			storestmt()
			}}
			9 -> {
			enterOuterAlt(_localctx, 9)
			if (true){
			this.state = 242
			getstmt()
			}}
			10 -> {
			enterOuterAlt(_localctx, 10)
			if (true){
			this.state = 243
			recallstmt()
			}}
			11 -> {
			enterOuterAlt(_localctx, 11)
			if (true){
			this.state = 244
			nextstmt()
			}}
			12 -> {
			enterOuterAlt(_localctx, 12)
			if (true){
			this.state = 245
			instmt()
			}}
			13 -> {
			enterOuterAlt(_localctx, 13)
			if (true){
			this.state = 246
			prstmt()
			}}
			14 -> {
			enterOuterAlt(_localctx, 14)
			if (true){
			this.state = 247
			onerrstmt()
			}}
			15 -> {
			enterOuterAlt(_localctx, 15)
			if (true){
			this.state = 248
			hlinstmt()
			}}
			16 -> {
			enterOuterAlt(_localctx, 16)
			if (true){
			this.state = 249
			vlinstmt()
			}}
			17 -> {
			enterOuterAlt(_localctx, 17)
			if (true){
			this.state = 250
			colorstmt()
			}}
			18 -> {
			enterOuterAlt(_localctx, 18)
			if (true){
			this.state = 251
			speedstmt()
			}}
			19 -> {
			enterOuterAlt(_localctx, 19)
			if (true){
			this.state = 252
			scalestmt()
			}}
			20 -> {
			enterOuterAlt(_localctx, 20)
			if (true){
			this.state = 253
			rotstmt()
			}}
			21 -> {
			enterOuterAlt(_localctx, 21)
			if (true){
			this.state = 254
			hcolorstmt()
			}}
			22 -> {
			enterOuterAlt(_localctx, 22)
			if (true){
			this.state = 255
			himemstmt()
			}}
			23 -> {
			enterOuterAlt(_localctx, 23)
			if (true){
			this.state = 256
			lomemstmt()
			}}
			24 -> {
			enterOuterAlt(_localctx, 24)
			if (true){
			this.state = 257
			printstmt1()
			}}
			25 -> {
			enterOuterAlt(_localctx, 25)
			if (true){
			this.state = 258
			pokestmt()
			}}
			26 -> {
			enterOuterAlt(_localctx, 26)
			if (true){
			this.state = 259
			plotstmt()
			}}
			27 -> {
			enterOuterAlt(_localctx, 27)
			if (true){
			this.state = 260
			ongotostmt()
			}}
			28 -> {
			enterOuterAlt(_localctx, 28)
			if (true){
			this.state = 261
			ongosubstmt()
			}}
			29 -> {
			enterOuterAlt(_localctx, 29)
			if (true){
			this.state = 262
			ifstmt()
			}}
			30 -> {
			enterOuterAlt(_localctx, 30)
			if (true){
			this.state = 263
			forstmt1()
			}}
			31 -> {
			enterOuterAlt(_localctx, 31)
			if (true){
			this.state = 264
			forstmt2()
			}}
			32 -> {
			enterOuterAlt(_localctx, 32)
			if (true){
			this.state = 265
			inputstmt()
			}}
			33 -> {
			enterOuterAlt(_localctx, 33)
			if (true){
			this.state = 266
			tabstmt()
			}}
			34 -> {
			enterOuterAlt(_localctx, 34)
			if (true){
			this.state = 267
			dimstmt()
			}}
			35 -> {
			enterOuterAlt(_localctx, 35)
			if (true){
			this.state = 268
			gotostmt()
			}}
			36 -> {
			enterOuterAlt(_localctx, 36)
			if (true){
			this.state = 269
			gosubstmt()
			}}
			37 -> {
			enterOuterAlt(_localctx, 37)
			if (true){
			this.state = 270
			callstmt()
			}}
			38 -> {
			enterOuterAlt(_localctx, 38)
			if (true){
			this.state = 271
			readstmt()
			}}
			39 -> {
			enterOuterAlt(_localctx, 39)
			if (true){
			this.state = 272
			hplotstmt()
			}}
			40 -> {
			enterOuterAlt(_localctx, 40)
			if (true){
			this.state = 273
			vplotstmt()
			}}
			41 -> {
			enterOuterAlt(_localctx, 41)
			if (true){
			this.state = 274
			vtabstmnt()
			}}
			42 -> {
			enterOuterAlt(_localctx, 42)
			if (true){
			this.state = 275
			htabstmnt()
			}}
			43 -> {
			enterOuterAlt(_localctx, 43)
			if (true){
			this.state = 276
			waitstmt()
			}}
			44 -> {
			enterOuterAlt(_localctx, 44)
			if (true){
			this.state = 277
			datastmt()
			}}
			45 -> {
			enterOuterAlt(_localctx, 45)
			if (true){
			this.state = 278
			xdrawstmt()
			}}
			46 -> {
			enterOuterAlt(_localctx, 46)
			if (true){
			this.state = 279
			drawstmt()
			}}
			47 -> {
			enterOuterAlt(_localctx, 47)
			if (true){
			this.state = 280
			defstmt()
			}}
			48 -> {
			enterOuterAlt(_localctx, 48)
			if (true){
			this.state = 281
			letstmt()
			}}
			49 -> {
			enterOuterAlt(_localctx, 49)
			if (true){
			this.state = 282
			includestmt()
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

	open class VardeclContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_vardecl.id
	        set(value) { throw RuntimeException() }
		fun findVar() : VarContext? = getRuleContext(solver.getType("VarContext"),0)
		fun LPAREN() : List<TerminalNode> = getTokens(jvmBasicParser.Tokens.LPAREN.id)
		fun LPAREN(i: Int) : TerminalNode = getToken(jvmBasicParser.Tokens.LPAREN.id, i) as TerminalNode
		fun findExprlist() : List<ExprlistContext> = getRuleContexts(solver.getType("ExprlistContext"))
		fun findExprlist(i: Int) : ExprlistContext? = getRuleContext(solver.getType("ExprlistContext"),i)
		fun RPAREN() : List<TerminalNode> = getTokens(jvmBasicParser.Tokens.RPAREN.id)
		fun RPAREN(i: Int) : TerminalNode = getToken(jvmBasicParser.Tokens.RPAREN.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterVardecl(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitVardecl(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitVardecl(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  vardecl() : VardeclContext {
		var _localctx : VardeclContext = VardeclContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_vardecl.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 285
			var()
			this.state = 292
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LPAREN) {
				if (true){
				if (true){
				this.state = 286
				match(LPAREN) as Token
				this.state = 287
				exprlist()
				this.state = 288
				match(RPAREN) as Token
				}
				}
				this.state = 294
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

	open class Printstmt1Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_printstmt1.id
	        set(value) { throw RuntimeException() }
		fun PRINT() : TerminalNode? = getToken(jvmBasicParser.Tokens.PRINT.id, 0)
		fun QUESTION() : TerminalNode? = getToken(jvmBasicParser.Tokens.QUESTION.id, 0)
		fun findPrintlist() : PrintlistContext? = getRuleContext(solver.getType("PrintlistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterPrintstmt1(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitPrintstmt1(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitPrintstmt1(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  printstmt1() : Printstmt1Context {
		var _localctx : Printstmt1Context = Printstmt1Context(context, state)
		enterRule(_localctx, 14, Rules.RULE_printstmt1.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 295
			_la = _input!!.LA(1)
			if ( !(_la==PRINT || _la==QUESTION) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 297
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,8,context) ) {
			1   -> if (true){
			this.state = 296
			printlist()
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

	open class PrintlistContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_printlist.id
	        set(value) { throw RuntimeException() }
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun COMMA() : List<TerminalNode> = getTokens(jvmBasicParser.Tokens.COMMA.id)
		fun COMMA(i: Int) : TerminalNode = getToken(jvmBasicParser.Tokens.COMMA.id, i) as TerminalNode
		fun SEMICOLON() : List<TerminalNode> = getTokens(jvmBasicParser.Tokens.SEMICOLON.id)
		fun SEMICOLON(i: Int) : TerminalNode = getToken(jvmBasicParser.Tokens.SEMICOLON.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterPrintlist(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitPrintlist(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitPrintlist(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  printlist() : PrintlistContext {
		var _localctx : PrintlistContext = PrintlistContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_printlist.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 299
			expression()
			this.state = 306
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COMMA || _la==SEMICOLON) {
				if (true){
				if (true){
				this.state = 300
				_la = _input!!.LA(1)
				if ( !(_la==COMMA || _la==SEMICOLON) ) {
					errorHandler.recoverInline(this)
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				this.state = 302
				errorHandler.sync(this)
				when ( interpreter!!.adaptivePredict(_input!!,9,context) ) {
				1   -> if (true){
				this.state = 301
				expression()
				}
				}
				}
				}
				this.state = 308
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

	open class GetstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_getstmt.id
	        set(value) { throw RuntimeException() }
		fun GET() : TerminalNode? = getToken(jvmBasicParser.Tokens.GET.id, 0)
		fun findExprlist() : ExprlistContext? = getRuleContext(solver.getType("ExprlistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterGetstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitGetstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitGetstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  getstmt() : GetstmtContext {
		var _localctx : GetstmtContext = GetstmtContext(context, state)
		enterRule(_localctx, 18, Rules.RULE_getstmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 309
			match(GET) as Token
			this.state = 310
			exprlist()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class LetstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_letstmt.id
	        set(value) { throw RuntimeException() }
		fun findVariableassignment() : VariableassignmentContext? = getRuleContext(solver.getType("VariableassignmentContext"),0)
		fun LET() : TerminalNode? = getToken(jvmBasicParser.Tokens.LET.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterLetstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitLetstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitLetstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  letstmt() : LetstmtContext {
		var _localctx : LetstmtContext = LetstmtContext(context, state)
		enterRule(_localctx, 20, Rules.RULE_letstmt.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 313
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LET) {
				if (true){
				this.state = 312
				match(LET) as Token
				}
			}

			this.state = 315
			variableassignment()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class VariableassignmentContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_variableassignment.id
	        set(value) { throw RuntimeException() }
		fun findVardecl() : VardeclContext? = getRuleContext(solver.getType("VardeclContext"),0)
		fun EQ() : TerminalNode? = getToken(jvmBasicParser.Tokens.EQ.id, 0)
		fun findExprlist() : ExprlistContext? = getRuleContext(solver.getType("ExprlistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterVariableassignment(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitVariableassignment(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitVariableassignment(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  variableassignment() : VariableassignmentContext {
		var _localctx : VariableassignmentContext = VariableassignmentContext(context, state)
		enterRule(_localctx, 22, Rules.RULE_variableassignment.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 317
			vardecl()
			this.state = 318
			match(EQ) as Token
			this.state = 319
			exprlist()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class RelopContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_relop.id
	        set(value) { throw RuntimeException() }
		fun GTE() : TerminalNode? = getToken(jvmBasicParser.Tokens.GTE.id, 0)
		fun GT() : TerminalNode? = getToken(jvmBasicParser.Tokens.GT.id, 0)
		fun EQ() : TerminalNode? = getToken(jvmBasicParser.Tokens.EQ.id, 0)
		fun LTE() : TerminalNode? = getToken(jvmBasicParser.Tokens.LTE.id, 0)
		fun LT() : TerminalNode? = getToken(jvmBasicParser.Tokens.LT.id, 0)
		fun findNeq() : NeqContext? = getRuleContext(solver.getType("NeqContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterRelop(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitRelop(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitRelop(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  relop() : RelopContext {
		var _localctx : RelopContext = RelopContext(context, state)
		enterRule(_localctx, 24, Rules.RULE_relop.id)
		try {
			this.state = 335
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,12,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 321
			match(GTE) as Token
			}
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			if (true){
			this.state = 322
			match(GT) as Token
			this.state = 323
			match(EQ) as Token
			}
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			if (true){
			this.state = 324
			match(EQ) as Token
			this.state = 325
			match(GT) as Token
			}
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 326
			match(LTE) as Token
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			if (true){
			this.state = 327
			match(LT) as Token
			this.state = 328
			match(EQ) as Token
			}
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			if (true){
			this.state = 329
			match(EQ) as Token
			this.state = 330
			match(LT) as Token
			}
			}}
			7 -> {
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 331
			neq()
			}}
			8 -> {
			enterOuterAlt(_localctx, 8)
			if (true){
			this.state = 332
			match(EQ) as Token
			}}
			9 -> {
			enterOuterAlt(_localctx, 9)
			if (true){
			this.state = 333
			match(GT) as Token
			}}
			10 -> {
			enterOuterAlt(_localctx, 10)
			if (true){
			this.state = 334
			match(LT) as Token
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

	open class NeqContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_neq.id
	        set(value) { throw RuntimeException() }
		fun LT() : TerminalNode? = getToken(jvmBasicParser.Tokens.LT.id, 0)
		fun GT() : TerminalNode? = getToken(jvmBasicParser.Tokens.GT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterNeq(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitNeq(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitNeq(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  neq() : NeqContext {
		var _localctx : NeqContext = NeqContext(context, state)
		enterRule(_localctx, 26, Rules.RULE_neq.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 337
			match(LT) as Token
			this.state = 338
			match(GT) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class IfstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_ifstmt.id
	        set(value) { throw RuntimeException() }
		fun IF() : TerminalNode? = getToken(jvmBasicParser.Tokens.IF.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun findStatement() : StatementContext? = getRuleContext(solver.getType("StatementContext"),0)
		fun findLinenumber() : LinenumberContext? = getRuleContext(solver.getType("LinenumberContext"),0)
		fun THEN() : TerminalNode? = getToken(jvmBasicParser.Tokens.THEN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterIfstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitIfstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitIfstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  ifstmt() : IfstmtContext {
		var _localctx : IfstmtContext = IfstmtContext(context, state)
		enterRule(_localctx, 28, Rules.RULE_ifstmt.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 340
			match(IF) as Token
			this.state = 341
			expression()
			this.state = 343
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==THEN) {
				if (true){
				this.state = 342
				match(THEN) as Token
				}
			}

			this.state = 347
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			RETURN , PRINT , GOTO , GOSUB , IF , NEXT , CLEAR , LIST , RUN , END , LET , FOR , INPUT , DIM , TEXT , HGR , HGR2 , CALL , HPLOT , VPLOT , PRNUMBER , INNUMBER , VTAB , HTAB , HOME , ON , PLOT , POKE , STOP , HIMEM , LOMEM , FLASH , INVERSE , NORMAL , ONERR , TRACE , NOTRACE , DATA , WAIT , READ , XDRAW , DRAW , DEF , TAB , SPEED , ROT , SCALE , COLOR , HCOLOR , HLIN , VLIN , POP , SHLOAD , STORE , RECALL , GET , AMPERSAND , GR , RESTORE , SAVE , LOAD , QUESTION , INCLUDE , CLS , LETTERS  ->  /*LL1AltBlock*/{if (true){
			this.state = 345
			statement()
			}}
			NUMBER  ->  /*LL1AltBlock*/{if (true){
			this.state = 346
			linenumber()
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

	open class Forstmt1Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_forstmt1.id
	        set(value) { throw RuntimeException() }
		fun FOR() : TerminalNode? = getToken(jvmBasicParser.Tokens.FOR.id, 0)
		fun findVardecl() : List<VardeclContext> = getRuleContexts(solver.getType("VardeclContext"))
		fun findVardecl(i: Int) : VardeclContext? = getRuleContext(solver.getType("VardeclContext"),i)
		fun EQ() : TerminalNode? = getToken(jvmBasicParser.Tokens.EQ.id, 0)
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun TO() : TerminalNode? = getToken(jvmBasicParser.Tokens.TO.id, 0)
		fun STEP() : TerminalNode? = getToken(jvmBasicParser.Tokens.STEP.id, 0)
		fun findStatement() : StatementContext? = getRuleContext(solver.getType("StatementContext"),0)
		fun NEXT() : TerminalNode? = getToken(jvmBasicParser.Tokens.NEXT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterForstmt1(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitForstmt1(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitForstmt1(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  forstmt1() : Forstmt1Context {
		var _localctx : Forstmt1Context = Forstmt1Context(context, state)
		enterRule(_localctx, 30, Rules.RULE_forstmt1.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 349
			match(FOR) as Token
			this.state = 350
			vardecl()
			this.state = 351
			match(EQ) as Token
			this.state = 352
			expression()
			this.state = 353
			match(TO) as Token
			this.state = 354
			expression()
			this.state = 357
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==STEP) {
				if (true){
				this.state = 355
				match(STEP) as Token
				this.state = 356
				expression()
				}
			}

			this.state = 364
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,17,context) ) {
			1   -> if (true){
			this.state = 359
			statement()
			this.state = 360
			match(NEXT) as Token
			this.state = 362
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LETTERS) {
				if (true){
				this.state = 361
				vardecl()
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

	open class Forstmt2Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_forstmt2.id
	        set(value) { throw RuntimeException() }
		fun FOR() : TerminalNode? = getToken(jvmBasicParser.Tokens.FOR.id, 0)
		fun findVardecl() : VardeclContext? = getRuleContext(solver.getType("VardeclContext"),0)
		fun EQ() : TerminalNode? = getToken(jvmBasicParser.Tokens.EQ.id, 0)
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun TO() : TerminalNode? = getToken(jvmBasicParser.Tokens.TO.id, 0)
		fun STEP() : TerminalNode? = getToken(jvmBasicParser.Tokens.STEP.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterForstmt2(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitForstmt2(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitForstmt2(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  forstmt2() : Forstmt2Context {
		var _localctx : Forstmt2Context = Forstmt2Context(context, state)
		enterRule(_localctx, 32, Rules.RULE_forstmt2.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 366
			match(FOR) as Token
			this.state = 367
			vardecl()
			this.state = 368
			match(EQ) as Token
			this.state = 369
			expression()
			this.state = 370
			match(TO) as Token
			this.state = 371
			expression()
			this.state = 374
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==STEP) {
				if (true){
				this.state = 372
				match(STEP) as Token
				this.state = 373
				expression()
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

	open class NextstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_nextstmt.id
	        set(value) { throw RuntimeException() }
		fun NEXT() : TerminalNode? = getToken(jvmBasicParser.Tokens.NEXT.id, 0)
		fun findVardecl() : List<VardeclContext> = getRuleContexts(solver.getType("VardeclContext"))
		fun findVardecl(i: Int) : VardeclContext? = getRuleContext(solver.getType("VardeclContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterNextstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitNextstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitNextstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  nextstmt() : NextstmtContext {
		var _localctx : NextstmtContext = NextstmtContext(context, state)
		enterRule(_localctx, 34, Rules.RULE_nextstmt.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 376
			match(NEXT) as Token
			this.state = 385
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LETTERS) {
				if (true){
				this.state = 377
				vardecl()
				this.state = 382
				errorHandler.sync(this);
				_la = _input!!.LA(1)
				while (_la==COMMA) {
					if (true){
					if (true){
					this.state = 378
					match(COMMA) as Token
					this.state = 379
					vardecl()
					}
					}
					this.state = 384
					errorHandler.sync(this)
					_la = _input!!.LA(1)
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

	open class InputstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_inputstmt.id
	        set(value) { throw RuntimeException() }
		fun INPUT() : TerminalNode? = getToken(jvmBasicParser.Tokens.INPUT.id, 0)
		fun findVarlist() : VarlistContext? = getRuleContext(solver.getType("VarlistContext"),0)
		fun STRINGLITERAL() : TerminalNode? = getToken(jvmBasicParser.Tokens.STRINGLITERAL.id, 0)
		fun COMMA() : TerminalNode? = getToken(jvmBasicParser.Tokens.COMMA.id, 0)
		fun SEMICOLON() : TerminalNode? = getToken(jvmBasicParser.Tokens.SEMICOLON.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterInputstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitInputstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitInputstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  inputstmt() : InputstmtContext {
		var _localctx : InputstmtContext = InputstmtContext(context, state)
		enterRule(_localctx, 36, Rules.RULE_inputstmt.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 387
			match(INPUT) as Token
			this.state = 390
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==STRINGLITERAL) {
				if (true){
				this.state = 388
				match(STRINGLITERAL) as Token
				this.state = 389
				_la = _input!!.LA(1)
				if ( !(_la==COMMA || _la==SEMICOLON) ) {
					errorHandler.recoverInline(this)
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				}
			}

			this.state = 392
			varlist()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ReadstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_readstmt.id
	        set(value) { throw RuntimeException() }
		fun READ() : TerminalNode? = getToken(jvmBasicParser.Tokens.READ.id, 0)
		fun findVarlist() : VarlistContext? = getRuleContext(solver.getType("VarlistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterReadstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitReadstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitReadstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  readstmt() : ReadstmtContext {
		var _localctx : ReadstmtContext = ReadstmtContext(context, state)
		enterRule(_localctx, 38, Rules.RULE_readstmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 394
			match(READ) as Token
			this.state = 395
			varlist()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class DimstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_dimstmt.id
	        set(value) { throw RuntimeException() }
		fun DIM() : TerminalNode? = getToken(jvmBasicParser.Tokens.DIM.id, 0)
		fun findVarlist() : VarlistContext? = getRuleContext(solver.getType("VarlistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterDimstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitDimstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitDimstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  dimstmt() : DimstmtContext {
		var _localctx : DimstmtContext = DimstmtContext(context, state)
		enterRule(_localctx, 40, Rules.RULE_dimstmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 397
			match(DIM) as Token
			this.state = 398
			varlist()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class GotostmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_gotostmt.id
	        set(value) { throw RuntimeException() }
		fun GOTO() : TerminalNode? = getToken(jvmBasicParser.Tokens.GOTO.id, 0)
		fun findLinenumber() : LinenumberContext? = getRuleContext(solver.getType("LinenumberContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterGotostmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitGotostmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitGotostmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  gotostmt() : GotostmtContext {
		var _localctx : GotostmtContext = GotostmtContext(context, state)
		enterRule(_localctx, 42, Rules.RULE_gotostmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 400
			match(GOTO) as Token
			this.state = 401
			linenumber()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class GosubstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_gosubstmt.id
	        set(value) { throw RuntimeException() }
		fun GOSUB() : TerminalNode? = getToken(jvmBasicParser.Tokens.GOSUB.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterGosubstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitGosubstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitGosubstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  gosubstmt() : GosubstmtContext {
		var _localctx : GosubstmtContext = GosubstmtContext(context, state)
		enterRule(_localctx, 44, Rules.RULE_gosubstmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 403
			match(GOSUB) as Token
			this.state = 404
			expression()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class PokestmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_pokestmt.id
	        set(value) { throw RuntimeException() }
		fun POKE() : TerminalNode? = getToken(jvmBasicParser.Tokens.POKE.id, 0)
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun COMMA() : TerminalNode? = getToken(jvmBasicParser.Tokens.COMMA.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterPokestmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitPokestmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitPokestmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  pokestmt() : PokestmtContext {
		var _localctx : PokestmtContext = PokestmtContext(context, state)
		enterRule(_localctx, 46, Rules.RULE_pokestmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 406
			match(POKE) as Token
			this.state = 407
			expression()
			this.state = 408
			match(COMMA) as Token
			this.state = 409
			expression()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class CallstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_callstmt.id
	        set(value) { throw RuntimeException() }
		fun CALL() : TerminalNode? = getToken(jvmBasicParser.Tokens.CALL.id, 0)
		fun findExprlist() : ExprlistContext? = getRuleContext(solver.getType("ExprlistContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterCallstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitCallstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitCallstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  callstmt() : CallstmtContext {
		var _localctx : CallstmtContext = CallstmtContext(context, state)
		enterRule(_localctx, 48, Rules.RULE_callstmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 411
			match(CALL) as Token
			this.state = 412
			exprlist()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class HplotstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_hplotstmt.id
	        set(value) { throw RuntimeException() }
		fun HPLOT() : TerminalNode? = getToken(jvmBasicParser.Tokens.HPLOT.id, 0)
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun COMMA() : List<TerminalNode> = getTokens(jvmBasicParser.Tokens.COMMA.id)
		fun COMMA(i: Int) : TerminalNode = getToken(jvmBasicParser.Tokens.COMMA.id, i) as TerminalNode
		fun TO() : List<TerminalNode> = getTokens(jvmBasicParser.Tokens.TO.id)
		fun TO(i: Int) : TerminalNode = getToken(jvmBasicParser.Tokens.TO.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterHplotstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitHplotstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitHplotstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  hplotstmt() : HplotstmtContext {
		var _localctx : HplotstmtContext = HplotstmtContext(context, state)
		enterRule(_localctx, 50, Rules.RULE_hplotstmt.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 414
			match(HPLOT) as Token
			this.state = 419
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,22,context) ) {
			1   -> if (true){
			this.state = 415
			expression()
			this.state = 416
			match(COMMA) as Token
			this.state = 417
			expression()
			}
			}
			this.state = 428
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==TO) {
				if (true){
				if (true){
				this.state = 421
				match(TO) as Token
				this.state = 422
				expression()
				this.state = 423
				match(COMMA) as Token
				this.state = 424
				expression()
				}
				}
				this.state = 430
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

	open class VplotstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_vplotstmt.id
	        set(value) { throw RuntimeException() }
		fun VPLOT() : TerminalNode? = getToken(jvmBasicParser.Tokens.VPLOT.id, 0)
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun COMMA() : List<TerminalNode> = getTokens(jvmBasicParser.Tokens.COMMA.id)
		fun COMMA(i: Int) : TerminalNode = getToken(jvmBasicParser.Tokens.COMMA.id, i) as TerminalNode
		fun TO() : List<TerminalNode> = getTokens(jvmBasicParser.Tokens.TO.id)
		fun TO(i: Int) : TerminalNode = getToken(jvmBasicParser.Tokens.TO.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterVplotstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitVplotstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitVplotstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  vplotstmt() : VplotstmtContext {
		var _localctx : VplotstmtContext = VplotstmtContext(context, state)
		enterRule(_localctx, 52, Rules.RULE_vplotstmt.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 431
			match(VPLOT) as Token
			this.state = 436
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,24,context) ) {
			1   -> if (true){
			this.state = 432
			expression()
			this.state = 433
			match(COMMA) as Token
			this.state = 434
			expression()
			}
			}
			this.state = 445
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==TO) {
				if (true){
				if (true){
				this.state = 438
				match(TO) as Token
				this.state = 439
				expression()
				this.state = 440
				match(COMMA) as Token
				this.state = 441
				expression()
				}
				}
				this.state = 447
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

	open class PlotstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_plotstmt.id
	        set(value) { throw RuntimeException() }
		fun PLOT() : TerminalNode? = getToken(jvmBasicParser.Tokens.PLOT.id, 0)
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun COMMA() : TerminalNode? = getToken(jvmBasicParser.Tokens.COMMA.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterPlotstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitPlotstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitPlotstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  plotstmt() : PlotstmtContext {
		var _localctx : PlotstmtContext = PlotstmtContext(context, state)
		enterRule(_localctx, 54, Rules.RULE_plotstmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 448
			match(PLOT) as Token
			this.state = 449
			expression()
			this.state = 450
			match(COMMA) as Token
			this.state = 451
			expression()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class OngotostmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_ongotostmt.id
	        set(value) { throw RuntimeException() }
		fun ON() : TerminalNode? = getToken(jvmBasicParser.Tokens.ON.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun GOTO() : TerminalNode? = getToken(jvmBasicParser.Tokens.GOTO.id, 0)
		fun findLinenumber() : List<LinenumberContext> = getRuleContexts(solver.getType("LinenumberContext"))
		fun findLinenumber(i: Int) : LinenumberContext? = getRuleContext(solver.getType("LinenumberContext"),i)
		fun COMMA() : List<TerminalNode> = getTokens(jvmBasicParser.Tokens.COMMA.id)
		fun COMMA(i: Int) : TerminalNode = getToken(jvmBasicParser.Tokens.COMMA.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterOngotostmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitOngotostmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitOngotostmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  ongotostmt() : OngotostmtContext {
		var _localctx : OngotostmtContext = OngotostmtContext(context, state)
		enterRule(_localctx, 56, Rules.RULE_ongotostmt.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 453
			match(ON) as Token
			this.state = 454
			expression()
			this.state = 455
			match(GOTO) as Token
			this.state = 456
			linenumber()
			this.state = 461
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COMMA) {
				if (true){
				if (true){
				this.state = 457
				match(COMMA) as Token
				this.state = 458
				linenumber()
				}
				}
				this.state = 463
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

	open class OngosubstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_ongosubstmt.id
	        set(value) { throw RuntimeException() }
		fun ON() : TerminalNode? = getToken(jvmBasicParser.Tokens.ON.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun GOSUB() : TerminalNode? = getToken(jvmBasicParser.Tokens.GOSUB.id, 0)
		fun findLinenumber() : List<LinenumberContext> = getRuleContexts(solver.getType("LinenumberContext"))
		fun findLinenumber(i: Int) : LinenumberContext? = getRuleContext(solver.getType("LinenumberContext"),i)
		fun COMMA() : List<TerminalNode> = getTokens(jvmBasicParser.Tokens.COMMA.id)
		fun COMMA(i: Int) : TerminalNode = getToken(jvmBasicParser.Tokens.COMMA.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterOngosubstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitOngosubstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitOngosubstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  ongosubstmt() : OngosubstmtContext {
		var _localctx : OngosubstmtContext = OngosubstmtContext(context, state)
		enterRule(_localctx, 58, Rules.RULE_ongosubstmt.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 464
			match(ON) as Token
			this.state = 465
			expression()
			this.state = 466
			match(GOSUB) as Token
			this.state = 467
			linenumber()
			this.state = 472
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COMMA) {
				if (true){
				if (true){
				this.state = 468
				match(COMMA) as Token
				this.state = 469
				linenumber()
				}
				}
				this.state = 474
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

	open class VtabstmntContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_vtabstmnt.id
	        set(value) { throw RuntimeException() }
		fun VTAB() : TerminalNode? = getToken(jvmBasicParser.Tokens.VTAB.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterVtabstmnt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitVtabstmnt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitVtabstmnt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  vtabstmnt() : VtabstmntContext {
		var _localctx : VtabstmntContext = VtabstmntContext(context, state)
		enterRule(_localctx, 60, Rules.RULE_vtabstmnt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 475
			match(VTAB) as Token
			this.state = 476
			expression()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class HtabstmntContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_htabstmnt.id
	        set(value) { throw RuntimeException() }
		fun HTAB() : TerminalNode? = getToken(jvmBasicParser.Tokens.HTAB.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterHtabstmnt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitHtabstmnt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitHtabstmnt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  htabstmnt() : HtabstmntContext {
		var _localctx : HtabstmntContext = HtabstmntContext(context, state)
		enterRule(_localctx, 62, Rules.RULE_htabstmnt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 478
			match(HTAB) as Token
			this.state = 479
			expression()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class HimemstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_himemstmt.id
	        set(value) { throw RuntimeException() }
		fun HIMEM() : TerminalNode? = getToken(jvmBasicParser.Tokens.HIMEM.id, 0)
		fun COLON() : TerminalNode? = getToken(jvmBasicParser.Tokens.COLON.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterHimemstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitHimemstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitHimemstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  himemstmt() : HimemstmtContext {
		var _localctx : HimemstmtContext = HimemstmtContext(context, state)
		enterRule(_localctx, 64, Rules.RULE_himemstmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 481
			match(HIMEM) as Token
			this.state = 482
			match(COLON) as Token
			this.state = 483
			expression()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class LomemstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_lomemstmt.id
	        set(value) { throw RuntimeException() }
		fun LOMEM() : TerminalNode? = getToken(jvmBasicParser.Tokens.LOMEM.id, 0)
		fun COLON() : TerminalNode? = getToken(jvmBasicParser.Tokens.COLON.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterLomemstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitLomemstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitLomemstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  lomemstmt() : LomemstmtContext {
		var _localctx : LomemstmtContext = LomemstmtContext(context, state)
		enterRule(_localctx, 66, Rules.RULE_lomemstmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 485
			match(LOMEM) as Token
			this.state = 486
			match(COLON) as Token
			this.state = 487
			expression()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class DatastmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_datastmt.id
	        set(value) { throw RuntimeException() }
		fun DATA() : TerminalNode? = getToken(jvmBasicParser.Tokens.DATA.id, 0)
		fun findDatum() : List<DatumContext> = getRuleContexts(solver.getType("DatumContext"))
		fun findDatum(i: Int) : DatumContext? = getRuleContext(solver.getType("DatumContext"),i)
		fun COMMA() : List<TerminalNode> = getTokens(jvmBasicParser.Tokens.COMMA.id)
		fun COMMA(i: Int) : TerminalNode = getToken(jvmBasicParser.Tokens.COMMA.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterDatastmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitDatastmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitDatastmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  datastmt() : DatastmtContext {
		var _localctx : DatastmtContext = DatastmtContext(context, state)
		enterRule(_localctx, 68, Rules.RULE_datastmt.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 489
			match(DATA) as Token
			this.state = 490
			datum()
			this.state = 497
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COMMA) {
				if (true){
				if (true){
				this.state = 491
				match(COMMA) as Token
				this.state = 493
				errorHandler.sync(this)
				when ( interpreter!!.adaptivePredict(_input!!,28,context) ) {
				1   -> if (true){
				this.state = 492
				datum()
				}
				}
				}
				}
				this.state = 499
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

	open class DatumContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_datum.id
	        set(value) { throw RuntimeException() }
		fun findNumber() : NumberContext? = getRuleContext(solver.getType("NumberContext"),0)
		fun STRINGLITERAL() : TerminalNode? = getToken(jvmBasicParser.Tokens.STRINGLITERAL.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterDatum(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitDatum(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitDatum(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  datum() : DatumContext {
		var _localctx : DatumContext = DatumContext(context, state)
		enterRule(_localctx, 70, Rules.RULE_datum.id)
		try {
			this.state = 502
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			PLUS , MINUS , NUMBER , FLOAT  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 500
			number()
			}}
			STRINGLITERAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 501
			match(STRINGLITERAL) as Token
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

	open class WaitstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_waitstmt.id
	        set(value) { throw RuntimeException() }
		fun WAIT() : TerminalNode? = getToken(jvmBasicParser.Tokens.WAIT.id, 0)
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun COMMA() : List<TerminalNode> = getTokens(jvmBasicParser.Tokens.COMMA.id)
		fun COMMA(i: Int) : TerminalNode = getToken(jvmBasicParser.Tokens.COMMA.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterWaitstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitWaitstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitWaitstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  waitstmt() : WaitstmtContext {
		var _localctx : WaitstmtContext = WaitstmtContext(context, state)
		enterRule(_localctx, 72, Rules.RULE_waitstmt.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 504
			match(WAIT) as Token
			this.state = 505
			expression()
			this.state = 506
			match(COMMA) as Token
			this.state = 507
			expression()
			this.state = 510
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COMMA) {
				if (true){
				this.state = 508
				match(COMMA) as Token
				this.state = 509
				expression()
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

	open class XdrawstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_xdrawstmt.id
	        set(value) { throw RuntimeException() }
		fun XDRAW() : TerminalNode? = getToken(jvmBasicParser.Tokens.XDRAW.id, 0)
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun AT() : TerminalNode? = getToken(jvmBasicParser.Tokens.AT.id, 0)
		fun COMMA() : TerminalNode? = getToken(jvmBasicParser.Tokens.COMMA.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterXdrawstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitXdrawstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitXdrawstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  xdrawstmt() : XdrawstmtContext {
		var _localctx : XdrawstmtContext = XdrawstmtContext(context, state)
		enterRule(_localctx, 74, Rules.RULE_xdrawstmt.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 512
			match(XDRAW) as Token
			this.state = 513
			expression()
			this.state = 519
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==AT) {
				if (true){
				this.state = 514
				match(AT) as Token
				this.state = 515
				expression()
				this.state = 516
				match(COMMA) as Token
				this.state = 517
				expression()
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

	open class DrawstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_drawstmt.id
	        set(value) { throw RuntimeException() }
		fun DRAW() : TerminalNode? = getToken(jvmBasicParser.Tokens.DRAW.id, 0)
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun AT() : TerminalNode? = getToken(jvmBasicParser.Tokens.AT.id, 0)
		fun COMMA() : TerminalNode? = getToken(jvmBasicParser.Tokens.COMMA.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterDrawstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitDrawstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitDrawstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  drawstmt() : DrawstmtContext {
		var _localctx : DrawstmtContext = DrawstmtContext(context, state)
		enterRule(_localctx, 76, Rules.RULE_drawstmt.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 521
			match(DRAW) as Token
			this.state = 522
			expression()
			this.state = 528
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==AT) {
				if (true){
				this.state = 523
				match(AT) as Token
				this.state = 524
				expression()
				this.state = 525
				match(COMMA) as Token
				this.state = 526
				expression()
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

	open class DefstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_defstmt.id
	        set(value) { throw RuntimeException() }
		fun DEF() : TerminalNode? = getToken(jvmBasicParser.Tokens.DEF.id, 0)
		fun findVar() : List<VarContext> = getRuleContexts(solver.getType("VarContext"))
		fun findVar(i: Int) : VarContext? = getRuleContext(solver.getType("VarContext"),i)
		fun LPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.RPAREN.id, 0)
		fun EQ() : TerminalNode? = getToken(jvmBasicParser.Tokens.EQ.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun FN() : TerminalNode? = getToken(jvmBasicParser.Tokens.FN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterDefstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitDefstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitDefstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  defstmt() : DefstmtContext {
		var _localctx : DefstmtContext = DefstmtContext(context, state)
		enterRule(_localctx, 78, Rules.RULE_defstmt.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 530
			match(DEF) as Token
			this.state = 532
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==FN) {
				if (true){
				this.state = 531
				match(FN) as Token
				}
			}

			this.state = 534
			var()
			this.state = 535
			match(LPAREN) as Token
			this.state = 536
			var()
			this.state = 537
			match(RPAREN) as Token
			this.state = 538
			match(EQ) as Token
			this.state = 539
			expression()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TabstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_tabstmt.id
	        set(value) { throw RuntimeException() }
		fun TAB() : TerminalNode? = getToken(jvmBasicParser.Tokens.TAB.id, 0)
		fun LPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.LPAREN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterTabstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitTabstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitTabstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  tabstmt() : TabstmtContext {
		var _localctx : TabstmtContext = TabstmtContext(context, state)
		enterRule(_localctx, 80, Rules.RULE_tabstmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 541
			match(TAB) as Token
			this.state = 542
			match(LPAREN) as Token
			this.state = 543
			expression()
			this.state = 544
			match(RPAREN) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class SpeedstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_speedstmt.id
	        set(value) { throw RuntimeException() }
		fun SPEED() : TerminalNode? = getToken(jvmBasicParser.Tokens.SPEED.id, 0)
		fun EQ() : TerminalNode? = getToken(jvmBasicParser.Tokens.EQ.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterSpeedstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitSpeedstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitSpeedstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  speedstmt() : SpeedstmtContext {
		var _localctx : SpeedstmtContext = SpeedstmtContext(context, state)
		enterRule(_localctx, 82, Rules.RULE_speedstmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 546
			match(SPEED) as Token
			this.state = 547
			match(EQ) as Token
			this.state = 548
			expression()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class RotstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_rotstmt.id
	        set(value) { throw RuntimeException() }
		fun ROT() : TerminalNode? = getToken(jvmBasicParser.Tokens.ROT.id, 0)
		fun EQ() : TerminalNode? = getToken(jvmBasicParser.Tokens.EQ.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterRotstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitRotstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitRotstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  rotstmt() : RotstmtContext {
		var _localctx : RotstmtContext = RotstmtContext(context, state)
		enterRule(_localctx, 84, Rules.RULE_rotstmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 550
			match(ROT) as Token
			this.state = 551
			match(EQ) as Token
			this.state = 552
			expression()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ScalestmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_scalestmt.id
	        set(value) { throw RuntimeException() }
		fun SCALE() : TerminalNode? = getToken(jvmBasicParser.Tokens.SCALE.id, 0)
		fun EQ() : TerminalNode? = getToken(jvmBasicParser.Tokens.EQ.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterScalestmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitScalestmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitScalestmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  scalestmt() : ScalestmtContext {
		var _localctx : ScalestmtContext = ScalestmtContext(context, state)
		enterRule(_localctx, 86, Rules.RULE_scalestmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 554
			match(SCALE) as Token
			this.state = 555
			match(EQ) as Token
			this.state = 556
			expression()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ColorstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_colorstmt.id
	        set(value) { throw RuntimeException() }
		fun COLOR() : TerminalNode? = getToken(jvmBasicParser.Tokens.COLOR.id, 0)
		fun EQ() : TerminalNode? = getToken(jvmBasicParser.Tokens.EQ.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterColorstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitColorstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitColorstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  colorstmt() : ColorstmtContext {
		var _localctx : ColorstmtContext = ColorstmtContext(context, state)
		enterRule(_localctx, 88, Rules.RULE_colorstmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 558
			match(COLOR) as Token
			this.state = 559
			match(EQ) as Token
			this.state = 560
			expression()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class HcolorstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_hcolorstmt.id
	        set(value) { throw RuntimeException() }
		fun HCOLOR() : TerminalNode? = getToken(jvmBasicParser.Tokens.HCOLOR.id, 0)
		fun EQ() : TerminalNode? = getToken(jvmBasicParser.Tokens.EQ.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterHcolorstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitHcolorstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitHcolorstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  hcolorstmt() : HcolorstmtContext {
		var _localctx : HcolorstmtContext = HcolorstmtContext(context, state)
		enterRule(_localctx, 90, Rules.RULE_hcolorstmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 562
			match(HCOLOR) as Token
			this.state = 563
			match(EQ) as Token
			this.state = 564
			expression()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class HlinstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_hlinstmt.id
	        set(value) { throw RuntimeException() }
		fun HLIN() : TerminalNode? = getToken(jvmBasicParser.Tokens.HLIN.id, 0)
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun COMMA() : TerminalNode? = getToken(jvmBasicParser.Tokens.COMMA.id, 0)
		fun AT() : TerminalNode? = getToken(jvmBasicParser.Tokens.AT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterHlinstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitHlinstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitHlinstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  hlinstmt() : HlinstmtContext {
		var _localctx : HlinstmtContext = HlinstmtContext(context, state)
		enterRule(_localctx, 92, Rules.RULE_hlinstmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 566
			match(HLIN) as Token
			this.state = 567
			expression()
			this.state = 568
			match(COMMA) as Token
			this.state = 569
			expression()
			this.state = 570
			match(AT) as Token
			this.state = 571
			expression()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class VlinstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_vlinstmt.id
	        set(value) { throw RuntimeException() }
		fun VLIN() : TerminalNode? = getToken(jvmBasicParser.Tokens.VLIN.id, 0)
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun COMMA() : TerminalNode? = getToken(jvmBasicParser.Tokens.COMMA.id, 0)
		fun AT() : TerminalNode? = getToken(jvmBasicParser.Tokens.AT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterVlinstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitVlinstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitVlinstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  vlinstmt() : VlinstmtContext {
		var _localctx : VlinstmtContext = VlinstmtContext(context, state)
		enterRule(_localctx, 94, Rules.RULE_vlinstmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 573
			match(VLIN) as Token
			this.state = 574
			expression()
			this.state = 575
			match(COMMA) as Token
			this.state = 576
			expression()
			this.state = 577
			match(AT) as Token
			this.state = 578
			expression()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class OnerrstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_onerrstmt.id
	        set(value) { throw RuntimeException() }
		fun ONERR() : TerminalNode? = getToken(jvmBasicParser.Tokens.ONERR.id, 0)
		fun GOTO() : TerminalNode? = getToken(jvmBasicParser.Tokens.GOTO.id, 0)
		fun findLinenumber() : LinenumberContext? = getRuleContext(solver.getType("LinenumberContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterOnerrstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitOnerrstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitOnerrstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  onerrstmt() : OnerrstmtContext {
		var _localctx : OnerrstmtContext = OnerrstmtContext(context, state)
		enterRule(_localctx, 96, Rules.RULE_onerrstmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 580
			match(ONERR) as Token
			this.state = 581
			match(GOTO) as Token
			this.state = 582
			linenumber()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class PrstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_prstmt.id
	        set(value) { throw RuntimeException() }
		fun PRNUMBER() : TerminalNode? = getToken(jvmBasicParser.Tokens.PRNUMBER.id, 0)
		fun NUMBER() : TerminalNode? = getToken(jvmBasicParser.Tokens.NUMBER.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterPrstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitPrstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitPrstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  prstmt() : PrstmtContext {
		var _localctx : PrstmtContext = PrstmtContext(context, state)
		enterRule(_localctx, 98, Rules.RULE_prstmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 584
			match(PRNUMBER) as Token
			this.state = 585
			match(NUMBER) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class InstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_instmt.id
	        set(value) { throw RuntimeException() }
		fun INNUMBER() : TerminalNode? = getToken(jvmBasicParser.Tokens.INNUMBER.id, 0)
		fun NUMBER() : TerminalNode? = getToken(jvmBasicParser.Tokens.NUMBER.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterInstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitInstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitInstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  instmt() : InstmtContext {
		var _localctx : InstmtContext = InstmtContext(context, state)
		enterRule(_localctx, 100, Rules.RULE_instmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 587
			match(INNUMBER) as Token
			this.state = 588
			match(NUMBER) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class StorestmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_storestmt.id
	        set(value) { throw RuntimeException() }
		fun STORE() : TerminalNode? = getToken(jvmBasicParser.Tokens.STORE.id, 0)
		fun findVardecl() : VardeclContext? = getRuleContext(solver.getType("VardeclContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterStorestmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitStorestmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitStorestmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  storestmt() : StorestmtContext {
		var _localctx : StorestmtContext = StorestmtContext(context, state)
		enterRule(_localctx, 102, Rules.RULE_storestmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 590
			match(STORE) as Token
			this.state = 591
			vardecl()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class RecallstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_recallstmt.id
	        set(value) { throw RuntimeException() }
		fun RECALL() : TerminalNode? = getToken(jvmBasicParser.Tokens.RECALL.id, 0)
		fun findVardecl() : VardeclContext? = getRuleContext(solver.getType("VardeclContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterRecallstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitRecallstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitRecallstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  recallstmt() : RecallstmtContext {
		var _localctx : RecallstmtContext = RecallstmtContext(context, state)
		enterRule(_localctx, 104, Rules.RULE_recallstmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 593
			match(RECALL) as Token
			this.state = 594
			vardecl()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ListstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_liststmt.id
	        set(value) { throw RuntimeException() }
		fun LIST() : TerminalNode? = getToken(jvmBasicParser.Tokens.LIST.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterListstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitListstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitListstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  liststmt() : ListstmtContext {
		var _localctx : ListstmtContext = ListstmtContext(context, state)
		enterRule(_localctx, 106, Rules.RULE_liststmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 596
			match(LIST) as Token
			this.state = 598
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,35,context) ) {
			1   -> if (true){
			this.state = 597
			expression()
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

	open class PopstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_popstmt.id
	        set(value) { throw RuntimeException() }
		fun POP() : TerminalNode? = getToken(jvmBasicParser.Tokens.POP.id, 0)
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun COMMA() : TerminalNode? = getToken(jvmBasicParser.Tokens.COMMA.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterPopstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitPopstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitPopstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  popstmt() : PopstmtContext {
		var _localctx : PopstmtContext = PopstmtContext(context, state)
		enterRule(_localctx, 108, Rules.RULE_popstmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 600
			match(POP) as Token
			this.state = 605
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,36,context) ) {
			1   -> if (true){
			this.state = 601
			expression()
			this.state = 602
			match(COMMA) as Token
			this.state = 603
			expression()
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

	open class AmptstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_amptstmt.id
	        set(value) { throw RuntimeException() }
		fun AMPERSAND() : TerminalNode? = getToken(jvmBasicParser.Tokens.AMPERSAND.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterAmptstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitAmptstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitAmptstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  amptstmt() : AmptstmtContext {
		var _localctx : AmptstmtContext = AmptstmtContext(context, state)
		enterRule(_localctx, 110, Rules.RULE_amptstmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 607
			match(AMPERSAND) as Token
			this.state = 608
			expression()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class IncludestmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_includestmt.id
	        set(value) { throw RuntimeException() }
		fun INCLUDE() : TerminalNode? = getToken(jvmBasicParser.Tokens.INCLUDE.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterIncludestmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitIncludestmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitIncludestmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  includestmt() : IncludestmtContext {
		var _localctx : IncludestmtContext = IncludestmtContext(context, state)
		enterRule(_localctx, 112, Rules.RULE_includestmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 610
			match(INCLUDE) as Token
			this.state = 611
			expression()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class EndstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_endstmt.id
	        set(value) { throw RuntimeException() }
		fun END() : TerminalNode? = getToken(jvmBasicParser.Tokens.END.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterEndstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitEndstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitEndstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  endstmt() : EndstmtContext {
		var _localctx : EndstmtContext = EndstmtContext(context, state)
		enterRule(_localctx, 114, Rules.RULE_endstmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 613
			match(END) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ReturnstmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_returnstmt.id
	        set(value) { throw RuntimeException() }
		fun RETURN() : TerminalNode? = getToken(jvmBasicParser.Tokens.RETURN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterReturnstmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitReturnstmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitReturnstmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  returnstmt() : ReturnstmtContext {
		var _localctx : ReturnstmtContext = ReturnstmtContext(context, state)
		enterRule(_localctx, 116, Rules.RULE_returnstmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 615
			match(RETURN) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class RestorestmtContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_restorestmt.id
	        set(value) { throw RuntimeException() }
		fun RESTORE() : TerminalNode? = getToken(jvmBasicParser.Tokens.RESTORE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterRestorestmt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitRestorestmt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitRestorestmt(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  restorestmt() : RestorestmtContext {
		var _localctx : RestorestmtContext = RestorestmtContext(context, state)
		enterRule(_localctx, 118, Rules.RULE_restorestmt.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 617
			match(RESTORE) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class NumberContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_number.id
	        set(value) { throw RuntimeException() }
		fun NUMBER() : TerminalNode? = getToken(jvmBasicParser.Tokens.NUMBER.id, 0)
		fun FLOAT() : TerminalNode? = getToken(jvmBasicParser.Tokens.FLOAT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterNumber(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitNumber(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitNumber(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  number() : NumberContext {
		var _localctx : NumberContext = NumberContext(context, state)
		enterRule(_localctx, 120, Rules.RULE_number.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 620
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==PLUS || _la==MINUS) {
				if (true){
				this.state = 619
				_la = _input!!.LA(1)
				if ( !(_la==PLUS || _la==MINUS) ) {
					errorHandler.recoverInline(this)
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				}
			}

			this.state = 622
			_la = _input!!.LA(1)
			if ( !(_la==NUMBER || _la==FLOAT) ) {
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

	open class FuncContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_func.id
	        set(value) { throw RuntimeException() }
		fun STRINGLITERAL() : TerminalNode? = getToken(jvmBasicParser.Tokens.STRINGLITERAL.id, 0)
		fun findNumber() : NumberContext? = getRuleContext(solver.getType("NumberContext"),0)
		fun findTabfunc() : TabfuncContext? = getRuleContext(solver.getType("TabfuncContext"),0)
		fun findVardecl() : VardeclContext? = getRuleContext(solver.getType("VardeclContext"),0)
		fun findChrfunc() : ChrfuncContext? = getRuleContext(solver.getType("ChrfuncContext"),0)
		fun findSqrfunc() : SqrfuncContext? = getRuleContext(solver.getType("SqrfuncContext"),0)
		fun findLenfunc() : LenfuncContext? = getRuleContext(solver.getType("LenfuncContext"),0)
		fun findStrfunc() : StrfuncContext? = getRuleContext(solver.getType("StrfuncContext"),0)
		fun findAscfunc() : AscfuncContext? = getRuleContext(solver.getType("AscfuncContext"),0)
		fun findScrnfunc() : ScrnfuncContext? = getRuleContext(solver.getType("ScrnfuncContext"),0)
		fun findMidfunc() : MidfuncContext? = getRuleContext(solver.getType("MidfuncContext"),0)
		fun findPdlfunc() : PdlfuncContext? = getRuleContext(solver.getType("PdlfuncContext"),0)
		fun findPeekfunc() : PeekfuncContext? = getRuleContext(solver.getType("PeekfuncContext"),0)
		fun findIntfunc() : IntfuncContext? = getRuleContext(solver.getType("IntfuncContext"),0)
		fun findSpcfunc() : SpcfuncContext? = getRuleContext(solver.getType("SpcfuncContext"),0)
		fun findFrefunc() : FrefuncContext? = getRuleContext(solver.getType("FrefuncContext"),0)
		fun findPosfunc() : PosfuncContext? = getRuleContext(solver.getType("PosfuncContext"),0)
		fun findUsrfunc() : UsrfuncContext? = getRuleContext(solver.getType("UsrfuncContext"),0)
		fun findLeftfunc() : LeftfuncContext? = getRuleContext(solver.getType("LeftfuncContext"),0)
		fun findValfunc() : ValfuncContext? = getRuleContext(solver.getType("ValfuncContext"),0)
		fun findRightfunc() : RightfuncContext? = getRuleContext(solver.getType("RightfuncContext"),0)
		fun findFnfunc() : FnfuncContext? = getRuleContext(solver.getType("FnfuncContext"),0)
		fun findSinfunc() : SinfuncContext? = getRuleContext(solver.getType("SinfuncContext"),0)
		fun findCosfunc() : CosfuncContext? = getRuleContext(solver.getType("CosfuncContext"),0)
		fun findTanfunc() : TanfuncContext? = getRuleContext(solver.getType("TanfuncContext"),0)
		fun findAtnfunc() : AtnfuncContext? = getRuleContext(solver.getType("AtnfuncContext"),0)
		fun findRndfunc() : RndfuncContext? = getRuleContext(solver.getType("RndfuncContext"),0)
		fun findSgnfunc() : SgnfuncContext? = getRuleContext(solver.getType("SgnfuncContext"),0)
		fun findExpfunc() : ExpfuncContext? = getRuleContext(solver.getType("ExpfuncContext"),0)
		fun findLogfunc() : LogfuncContext? = getRuleContext(solver.getType("LogfuncContext"),0)
		fun findAbsfunc() : AbsfuncContext? = getRuleContext(solver.getType("AbsfuncContext"),0)
		fun LPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.LPAREN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterFunc(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitFunc(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitFunc(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  func() : FuncContext {
		var _localctx : FuncContext = FuncContext(context, state)
		enterRule(_localctx, 122, Rules.RULE_func.id)
		try {
			this.state = 659
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			STRINGLITERAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 624
			match(STRINGLITERAL) as Token
			}}
			PLUS , MINUS , NUMBER , FLOAT  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 625
			number()
			}}
			TAB  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 626
			tabfunc()
			}}
			LETTERS  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 627
			vardecl()
			}}
			CHR  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 628
			chrfunc()
			}}
			SQR  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 629
			sqrfunc()
			}}
			LEN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 630
			lenfunc()
			}}
			STR  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 8)
			if (true){
			this.state = 631
			strfunc()
			}}
			ASC  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 9)
			if (true){
			this.state = 632
			ascfunc()
			}}
			SCRN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 10)
			if (true){
			this.state = 633
			scrnfunc()
			}}
			MID  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 11)
			if (true){
			this.state = 634
			midfunc()
			}}
			PDL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 12)
			if (true){
			this.state = 635
			pdlfunc()
			}}
			PEEK  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 13)
			if (true){
			this.state = 636
			peekfunc()
			}}
			INTF  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 14)
			if (true){
			this.state = 637
			intfunc()
			}}
			SPC  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 15)
			if (true){
			this.state = 638
			spcfunc()
			}}
			FRE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 16)
			if (true){
			this.state = 639
			frefunc()
			}}
			POS  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 17)
			if (true){
			this.state = 640
			posfunc()
			}}
			USR  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 18)
			if (true){
			this.state = 641
			usrfunc()
			}}
			LEFT  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 19)
			if (true){
			this.state = 642
			leftfunc()
			}}
			VAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 20)
			if (true){
			this.state = 643
			valfunc()
			}}
			RIGHT  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 21)
			if (true){
			this.state = 644
			rightfunc()
			}}
			FN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 22)
			if (true){
			this.state = 645
			fnfunc()
			}}
			SIN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 23)
			if (true){
			this.state = 646
			sinfunc()
			}}
			COS  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 24)
			if (true){
			this.state = 647
			cosfunc()
			}}
			TAN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 25)
			if (true){
			this.state = 648
			tanfunc()
			}}
			ATN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 26)
			if (true){
			this.state = 649
			atnfunc()
			}}
			RND  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 27)
			if (true){
			this.state = 650
			rndfunc()
			}}
			SGN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 28)
			if (true){
			this.state = 651
			sgnfunc()
			}}
			EXP  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 29)
			if (true){
			this.state = 652
			expfunc()
			}}
			LOG  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 30)
			if (true){
			this.state = 653
			logfunc()
			}}
			ABS  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 31)
			if (true){
			this.state = 654
			absfunc()
			}}
			LPAREN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 32)
			if (true){
			if (true){
			this.state = 655
			match(LPAREN) as Token
			this.state = 656
			expression()
			this.state = 657
			match(RPAREN) as Token
			}
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

	open class SignExpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_signExpression.id
	        set(value) { throw RuntimeException() }
		fun findFunc() : FuncContext? = getRuleContext(solver.getType("FuncContext"),0)
		fun NOT() : TerminalNode? = getToken(jvmBasicParser.Tokens.NOT.id, 0)
		fun PLUS() : TerminalNode? = getToken(jvmBasicParser.Tokens.PLUS.id, 0)
		fun MINUS() : TerminalNode? = getToken(jvmBasicParser.Tokens.MINUS.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterSignExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitSignExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitSignExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  signExpression() : SignExpressionContext {
		var _localctx : SignExpressionContext = SignExpressionContext(context, state)
		enterRule(_localctx, 124, Rules.RULE_signExpression.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 662
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==NOT) {
				if (true){
				this.state = 661
				match(NOT) as Token
				}
			}

			this.state = 665
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,40,context) ) {
			1   -> if (true){
			this.state = 664
			_la = _input!!.LA(1)
			if ( !(_la==PLUS || _la==MINUS) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}
			}
			this.state = 667
			func()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ExponentExpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_exponentExpression.id
	        set(value) { throw RuntimeException() }
		fun findSignExpression() : List<SignExpressionContext> = getRuleContexts(solver.getType("SignExpressionContext"))
		fun findSignExpression(i: Int) : SignExpressionContext? = getRuleContext(solver.getType("SignExpressionContext"),i)
		fun EXPONENT() : List<TerminalNode> = getTokens(jvmBasicParser.Tokens.EXPONENT.id)
		fun EXPONENT(i: Int) : TerminalNode = getToken(jvmBasicParser.Tokens.EXPONENT.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterExponentExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitExponentExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitExponentExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  exponentExpression() : ExponentExpressionContext {
		var _localctx : ExponentExpressionContext = ExponentExpressionContext(context, state)
		enterRule(_localctx, 126, Rules.RULE_exponentExpression.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 669
			signExpression()
			this.state = 674
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==EXPONENT) {
				if (true){
				if (true){
				this.state = 670
				match(EXPONENT) as Token
				this.state = 671
				signExpression()
				}
				}
				this.state = 676
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

	open class MultiplyingExpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_multiplyingExpression.id
	        set(value) { throw RuntimeException() }
		fun findExponentExpression() : List<ExponentExpressionContext> = getRuleContexts(solver.getType("ExponentExpressionContext"))
		fun findExponentExpression(i: Int) : ExponentExpressionContext? = getRuleContext(solver.getType("ExponentExpressionContext"),i)
		fun TIMES() : List<TerminalNode> = getTokens(jvmBasicParser.Tokens.TIMES.id)
		fun TIMES(i: Int) : TerminalNode = getToken(jvmBasicParser.Tokens.TIMES.id, i) as TerminalNode
		fun DIV() : List<TerminalNode> = getTokens(jvmBasicParser.Tokens.DIV.id)
		fun DIV(i: Int) : TerminalNode = getToken(jvmBasicParser.Tokens.DIV.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterMultiplyingExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitMultiplyingExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitMultiplyingExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  multiplyingExpression() : MultiplyingExpressionContext {
		var _localctx : MultiplyingExpressionContext = MultiplyingExpressionContext(context, state)
		enterRule(_localctx, 128, Rules.RULE_multiplyingExpression.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 677
			exponentExpression()
			this.state = 682
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==TIMES || _la==DIV) {
				if (true){
				if (true){
				this.state = 678
				_la = _input!!.LA(1)
				if ( !(_la==TIMES || _la==DIV) ) {
					errorHandler.recoverInline(this)
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				this.state = 679
				exponentExpression()
				}
				}
				this.state = 684
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

	open class AddingExpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_addingExpression.id
	        set(value) { throw RuntimeException() }
		fun findMultiplyingExpression() : List<MultiplyingExpressionContext> = getRuleContexts(solver.getType("MultiplyingExpressionContext"))
		fun findMultiplyingExpression(i: Int) : MultiplyingExpressionContext? = getRuleContext(solver.getType("MultiplyingExpressionContext"),i)
		fun PLUS() : List<TerminalNode> = getTokens(jvmBasicParser.Tokens.PLUS.id)
		fun PLUS(i: Int) : TerminalNode = getToken(jvmBasicParser.Tokens.PLUS.id, i) as TerminalNode
		fun MINUS() : List<TerminalNode> = getTokens(jvmBasicParser.Tokens.MINUS.id)
		fun MINUS(i: Int) : TerminalNode = getToken(jvmBasicParser.Tokens.MINUS.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterAddingExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitAddingExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitAddingExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  addingExpression() : AddingExpressionContext {
		var _localctx : AddingExpressionContext = AddingExpressionContext(context, state)
		enterRule(_localctx, 130, Rules.RULE_addingExpression.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 685
			multiplyingExpression()
			this.state = 690
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==PLUS || _la==MINUS) {
				if (true){
				if (true){
				this.state = 686
				_la = _input!!.LA(1)
				if ( !(_la==PLUS || _la==MINUS) ) {
					errorHandler.recoverInline(this)
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				this.state = 687
				multiplyingExpression()
				}
				}
				this.state = 692
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

	open class RelationalExpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_relationalExpression.id
	        set(value) { throw RuntimeException() }
		fun findAddingExpression() : List<AddingExpressionContext> = getRuleContexts(solver.getType("AddingExpressionContext"))
		fun findAddingExpression(i: Int) : AddingExpressionContext? = getRuleContext(solver.getType("AddingExpressionContext"),i)
		fun findRelop() : RelopContext? = getRuleContext(solver.getType("RelopContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterRelationalExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitRelationalExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitRelationalExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  relationalExpression() : RelationalExpressionContext {
		var _localctx : RelationalExpressionContext = RelationalExpressionContext(context, state)
		enterRule(_localctx, 132, Rules.RULE_relationalExpression.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 693
			addingExpression()
			this.state = 697
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl GTE) or (1L shl LTE) or (1L shl GT) or (1L shl LT) or (1L shl EQ))) != 0L)) {
				if (true){
				if (true){
				this.state = 694
				relop()
				}
				this.state = 695
				addingExpression()
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

	open class ExpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_expression.id
	        set(value) { throw RuntimeException() }
		fun findFunc() : FuncContext? = getRuleContext(solver.getType("FuncContext"),0)
		fun findRelationalExpression() : List<RelationalExpressionContext> = getRuleContexts(solver.getType("RelationalExpressionContext"))
		fun findRelationalExpression(i: Int) : RelationalExpressionContext? = getRuleContext(solver.getType("RelationalExpressionContext"),i)
		fun AND() : List<TerminalNode> = getTokens(jvmBasicParser.Tokens.AND.id)
		fun AND(i: Int) : TerminalNode = getToken(jvmBasicParser.Tokens.AND.id, i) as TerminalNode
		fun OR() : List<TerminalNode> = getTokens(jvmBasicParser.Tokens.OR.id)
		fun OR(i: Int) : TerminalNode = getToken(jvmBasicParser.Tokens.OR.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  expression() : ExpressionContext {
		var _localctx : ExpressionContext = ExpressionContext(context, state)
		enterRule(_localctx, 134, Rules.RULE_expression.id)
		var _la: Int
		try {
			this.state = 708
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,46,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 699
			func()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			if (true){
			this.state = 700
			relationalExpression()
			this.state = 705
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==AND || _la==OR) {
				if (true){
				if (true){
				this.state = 701
				_la = _input!!.LA(1)
				if ( !(_la==AND || _la==OR) ) {
					errorHandler.recoverInline(this)
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				this.state = 702
				relationalExpression()
				}
				}
				this.state = 707
				errorHandler.sync(this)
				_la = _input!!.LA(1)
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

	open class VarContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_var.id
	        set(value) { throw RuntimeException() }
		fun findVarname() : VarnameContext? = getRuleContext(solver.getType("VarnameContext"),0)
		fun findVarsuffix() : VarsuffixContext? = getRuleContext(solver.getType("VarsuffixContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterVar(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitVar(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitVar(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  var() : VarContext {
		var _localctx : VarContext = VarContext(context, state)
		enterRule(_localctx, 136, Rules.RULE_var.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 710
			varname()
			this.state = 712
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==DOLLAR || _la==PERCENT) {
				if (true){
				this.state = 711
				varsuffix()
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

	open class VarnameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_varname.id
	        set(value) { throw RuntimeException() }
		fun LETTERS() : List<TerminalNode> = getTokens(jvmBasicParser.Tokens.LETTERS.id)
		fun LETTERS(i: Int) : TerminalNode = getToken(jvmBasicParser.Tokens.LETTERS.id, i) as TerminalNode
		fun NUMBER() : List<TerminalNode> = getTokens(jvmBasicParser.Tokens.NUMBER.id)
		fun NUMBER(i: Int) : TerminalNode = getToken(jvmBasicParser.Tokens.NUMBER.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterVarname(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitVarname(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitVarname(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  varname() : VarnameContext {
		var _localctx : VarnameContext = VarnameContext(context, state)
		enterRule(_localctx, 138, Rules.RULE_varname.id)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 714
			match(LETTERS) as Token
			this.state = 718
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,48,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 715
					_la = _input!!.LA(1)
					if ( !(_la==LETTERS || _la==NUMBER) ) {
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
				this.state = 720
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,48,context)
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

	open class VarsuffixContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_varsuffix.id
	        set(value) { throw RuntimeException() }
		fun DOLLAR() : TerminalNode? = getToken(jvmBasicParser.Tokens.DOLLAR.id, 0)
		fun PERCENT() : TerminalNode? = getToken(jvmBasicParser.Tokens.PERCENT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterVarsuffix(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitVarsuffix(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitVarsuffix(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  varsuffix() : VarsuffixContext {
		var _localctx : VarsuffixContext = VarsuffixContext(context, state)
		enterRule(_localctx, 140, Rules.RULE_varsuffix.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 721
			_la = _input!!.LA(1)
			if ( !(_la==DOLLAR || _la==PERCENT) ) {
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

	open class VarlistContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_varlist.id
	        set(value) { throw RuntimeException() }
		fun findVardecl() : List<VardeclContext> = getRuleContexts(solver.getType("VardeclContext"))
		fun findVardecl(i: Int) : VardeclContext? = getRuleContext(solver.getType("VardeclContext"),i)
		fun COMMA() : List<TerminalNode> = getTokens(jvmBasicParser.Tokens.COMMA.id)
		fun COMMA(i: Int) : TerminalNode = getToken(jvmBasicParser.Tokens.COMMA.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterVarlist(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitVarlist(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitVarlist(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  varlist() : VarlistContext {
		var _localctx : VarlistContext = VarlistContext(context, state)
		enterRule(_localctx, 142, Rules.RULE_varlist.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 723
			vardecl()
			this.state = 728
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COMMA) {
				if (true){
				if (true){
				this.state = 724
				match(COMMA) as Token
				this.state = 725
				vardecl()
				}
				}
				this.state = 730
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

	open class ExprlistContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_exprlist.id
	        set(value) { throw RuntimeException() }
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun COMMA() : List<TerminalNode> = getTokens(jvmBasicParser.Tokens.COMMA.id)
		fun COMMA(i: Int) : TerminalNode = getToken(jvmBasicParser.Tokens.COMMA.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterExprlist(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitExprlist(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitExprlist(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  exprlist() : ExprlistContext {
		var _localctx : ExprlistContext = ExprlistContext(context, state)
		enterRule(_localctx, 144, Rules.RULE_exprlist.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 731
			expression()
			this.state = 736
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COMMA) {
				if (true){
				if (true){
				this.state = 732
				match(COMMA) as Token
				this.state = 733
				expression()
				}
				}
				this.state = 738
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

	open class SqrfuncContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_sqrfunc.id
	        set(value) { throw RuntimeException() }
		fun SQR() : TerminalNode? = getToken(jvmBasicParser.Tokens.SQR.id, 0)
		fun LPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.LPAREN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterSqrfunc(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitSqrfunc(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitSqrfunc(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  sqrfunc() : SqrfuncContext {
		var _localctx : SqrfuncContext = SqrfuncContext(context, state)
		enterRule(_localctx, 146, Rules.RULE_sqrfunc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 739
			match(SQR) as Token
			this.state = 740
			match(LPAREN) as Token
			this.state = 741
			expression()
			this.state = 742
			match(RPAREN) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ChrfuncContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_chrfunc.id
	        set(value) { throw RuntimeException() }
		fun CHR() : TerminalNode? = getToken(jvmBasicParser.Tokens.CHR.id, 0)
		fun LPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.LPAREN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterChrfunc(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitChrfunc(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitChrfunc(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  chrfunc() : ChrfuncContext {
		var _localctx : ChrfuncContext = ChrfuncContext(context, state)
		enterRule(_localctx, 148, Rules.RULE_chrfunc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 744
			match(CHR) as Token
			this.state = 745
			match(LPAREN) as Token
			this.state = 746
			expression()
			this.state = 747
			match(RPAREN) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class LenfuncContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_lenfunc.id
	        set(value) { throw RuntimeException() }
		fun LEN() : TerminalNode? = getToken(jvmBasicParser.Tokens.LEN.id, 0)
		fun LPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.LPAREN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterLenfunc(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitLenfunc(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitLenfunc(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  lenfunc() : LenfuncContext {
		var _localctx : LenfuncContext = LenfuncContext(context, state)
		enterRule(_localctx, 150, Rules.RULE_lenfunc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 749
			match(LEN) as Token
			this.state = 750
			match(LPAREN) as Token
			this.state = 751
			expression()
			this.state = 752
			match(RPAREN) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class AscfuncContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_ascfunc.id
	        set(value) { throw RuntimeException() }
		fun ASC() : TerminalNode? = getToken(jvmBasicParser.Tokens.ASC.id, 0)
		fun LPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.LPAREN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterAscfunc(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitAscfunc(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitAscfunc(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  ascfunc() : AscfuncContext {
		var _localctx : AscfuncContext = AscfuncContext(context, state)
		enterRule(_localctx, 152, Rules.RULE_ascfunc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 754
			match(ASC) as Token
			this.state = 755
			match(LPAREN) as Token
			this.state = 756
			expression()
			this.state = 757
			match(RPAREN) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class MidfuncContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_midfunc.id
	        set(value) { throw RuntimeException() }
		fun MID() : TerminalNode? = getToken(jvmBasicParser.Tokens.MID.id, 0)
		fun LPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.LPAREN.id, 0)
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun COMMA() : List<TerminalNode> = getTokens(jvmBasicParser.Tokens.COMMA.id)
		fun COMMA(i: Int) : TerminalNode = getToken(jvmBasicParser.Tokens.COMMA.id, i) as TerminalNode
		fun RPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterMidfunc(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitMidfunc(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitMidfunc(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  midfunc() : MidfuncContext {
		var _localctx : MidfuncContext = MidfuncContext(context, state)
		enterRule(_localctx, 154, Rules.RULE_midfunc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 759
			match(MID) as Token
			this.state = 760
			match(LPAREN) as Token
			this.state = 761
			expression()
			this.state = 762
			match(COMMA) as Token
			this.state = 763
			expression()
			this.state = 764
			match(COMMA) as Token
			this.state = 765
			expression()
			this.state = 766
			match(RPAREN) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class PdlfuncContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_pdlfunc.id
	        set(value) { throw RuntimeException() }
		fun PDL() : TerminalNode? = getToken(jvmBasicParser.Tokens.PDL.id, 0)
		fun LPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.LPAREN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterPdlfunc(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitPdlfunc(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitPdlfunc(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  pdlfunc() : PdlfuncContext {
		var _localctx : PdlfuncContext = PdlfuncContext(context, state)
		enterRule(_localctx, 156, Rules.RULE_pdlfunc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 768
			match(PDL) as Token
			this.state = 769
			match(LPAREN) as Token
			this.state = 770
			expression()
			this.state = 771
			match(RPAREN) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class PeekfuncContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_peekfunc.id
	        set(value) { throw RuntimeException() }
		fun PEEK() : TerminalNode? = getToken(jvmBasicParser.Tokens.PEEK.id, 0)
		fun LPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.LPAREN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterPeekfunc(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitPeekfunc(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitPeekfunc(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  peekfunc() : PeekfuncContext {
		var _localctx : PeekfuncContext = PeekfuncContext(context, state)
		enterRule(_localctx, 158, Rules.RULE_peekfunc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 773
			match(PEEK) as Token
			this.state = 774
			match(LPAREN) as Token
			this.state = 775
			expression()
			this.state = 776
			match(RPAREN) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class IntfuncContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_intfunc.id
	        set(value) { throw RuntimeException() }
		fun INTF() : TerminalNode? = getToken(jvmBasicParser.Tokens.INTF.id, 0)
		fun LPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.LPAREN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterIntfunc(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitIntfunc(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitIntfunc(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  intfunc() : IntfuncContext {
		var _localctx : IntfuncContext = IntfuncContext(context, state)
		enterRule(_localctx, 160, Rules.RULE_intfunc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 778
			match(INTF) as Token
			this.state = 779
			match(LPAREN) as Token
			this.state = 780
			expression()
			this.state = 781
			match(RPAREN) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class SpcfuncContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_spcfunc.id
	        set(value) { throw RuntimeException() }
		fun SPC() : TerminalNode? = getToken(jvmBasicParser.Tokens.SPC.id, 0)
		fun LPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.LPAREN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterSpcfunc(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitSpcfunc(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitSpcfunc(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  spcfunc() : SpcfuncContext {
		var _localctx : SpcfuncContext = SpcfuncContext(context, state)
		enterRule(_localctx, 162, Rules.RULE_spcfunc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 783
			match(SPC) as Token
			this.state = 784
			match(LPAREN) as Token
			this.state = 785
			expression()
			this.state = 786
			match(RPAREN) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class FrefuncContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_frefunc.id
	        set(value) { throw RuntimeException() }
		fun FRE() : TerminalNode? = getToken(jvmBasicParser.Tokens.FRE.id, 0)
		fun LPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.LPAREN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterFrefunc(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitFrefunc(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitFrefunc(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  frefunc() : FrefuncContext {
		var _localctx : FrefuncContext = FrefuncContext(context, state)
		enterRule(_localctx, 164, Rules.RULE_frefunc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 788
			match(FRE) as Token
			this.state = 789
			match(LPAREN) as Token
			this.state = 790
			expression()
			this.state = 791
			match(RPAREN) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class PosfuncContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_posfunc.id
	        set(value) { throw RuntimeException() }
		fun POS() : TerminalNode? = getToken(jvmBasicParser.Tokens.POS.id, 0)
		fun LPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.LPAREN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterPosfunc(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitPosfunc(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitPosfunc(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  posfunc() : PosfuncContext {
		var _localctx : PosfuncContext = PosfuncContext(context, state)
		enterRule(_localctx, 166, Rules.RULE_posfunc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 793
			match(POS) as Token
			this.state = 794
			match(LPAREN) as Token
			this.state = 795
			expression()
			this.state = 796
			match(RPAREN) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class UsrfuncContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_usrfunc.id
	        set(value) { throw RuntimeException() }
		fun USR() : TerminalNode? = getToken(jvmBasicParser.Tokens.USR.id, 0)
		fun LPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.LPAREN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterUsrfunc(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitUsrfunc(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitUsrfunc(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  usrfunc() : UsrfuncContext {
		var _localctx : UsrfuncContext = UsrfuncContext(context, state)
		enterRule(_localctx, 168, Rules.RULE_usrfunc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 798
			match(USR) as Token
			this.state = 799
			match(LPAREN) as Token
			this.state = 800
			expression()
			this.state = 801
			match(RPAREN) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class LeftfuncContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_leftfunc.id
	        set(value) { throw RuntimeException() }
		fun LEFT() : TerminalNode? = getToken(jvmBasicParser.Tokens.LEFT.id, 0)
		fun LPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.LPAREN.id, 0)
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun COMMA() : TerminalNode? = getToken(jvmBasicParser.Tokens.COMMA.id, 0)
		fun RPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterLeftfunc(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitLeftfunc(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitLeftfunc(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  leftfunc() : LeftfuncContext {
		var _localctx : LeftfuncContext = LeftfuncContext(context, state)
		enterRule(_localctx, 170, Rules.RULE_leftfunc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 803
			match(LEFT) as Token
			this.state = 804
			match(LPAREN) as Token
			this.state = 805
			expression()
			this.state = 806
			match(COMMA) as Token
			this.state = 807
			expression()
			this.state = 808
			match(RPAREN) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class RightfuncContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_rightfunc.id
	        set(value) { throw RuntimeException() }
		fun RIGHT() : TerminalNode? = getToken(jvmBasicParser.Tokens.RIGHT.id, 0)
		fun LPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.LPAREN.id, 0)
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun COMMA() : TerminalNode? = getToken(jvmBasicParser.Tokens.COMMA.id, 0)
		fun RPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterRightfunc(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitRightfunc(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitRightfunc(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  rightfunc() : RightfuncContext {
		var _localctx : RightfuncContext = RightfuncContext(context, state)
		enterRule(_localctx, 172, Rules.RULE_rightfunc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 810
			match(RIGHT) as Token
			this.state = 811
			match(LPAREN) as Token
			this.state = 812
			expression()
			this.state = 813
			match(COMMA) as Token
			this.state = 814
			expression()
			this.state = 815
			match(RPAREN) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class StrfuncContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_strfunc.id
	        set(value) { throw RuntimeException() }
		fun STR() : TerminalNode? = getToken(jvmBasicParser.Tokens.STR.id, 0)
		fun LPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.LPAREN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterStrfunc(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitStrfunc(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitStrfunc(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  strfunc() : StrfuncContext {
		var _localctx : StrfuncContext = StrfuncContext(context, state)
		enterRule(_localctx, 174, Rules.RULE_strfunc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 817
			match(STR) as Token
			this.state = 818
			match(LPAREN) as Token
			this.state = 819
			expression()
			this.state = 820
			match(RPAREN) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class FnfuncContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_fnfunc.id
	        set(value) { throw RuntimeException() }
		fun FN() : TerminalNode? = getToken(jvmBasicParser.Tokens.FN.id, 0)
		fun findVar() : VarContext? = getRuleContext(solver.getType("VarContext"),0)
		fun LPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.LPAREN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterFnfunc(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitFnfunc(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitFnfunc(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  fnfunc() : FnfuncContext {
		var _localctx : FnfuncContext = FnfuncContext(context, state)
		enterRule(_localctx, 176, Rules.RULE_fnfunc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 822
			match(FN) as Token
			this.state = 823
			var()
			this.state = 824
			match(LPAREN) as Token
			this.state = 825
			expression()
			this.state = 826
			match(RPAREN) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ValfuncContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_valfunc.id
	        set(value) { throw RuntimeException() }
		fun VAL() : TerminalNode? = getToken(jvmBasicParser.Tokens.VAL.id, 0)
		fun LPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.LPAREN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterValfunc(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitValfunc(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitValfunc(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  valfunc() : ValfuncContext {
		var _localctx : ValfuncContext = ValfuncContext(context, state)
		enterRule(_localctx, 178, Rules.RULE_valfunc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 828
			match(VAL) as Token
			this.state = 829
			match(LPAREN) as Token
			this.state = 830
			expression()
			this.state = 831
			match(RPAREN) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ScrnfuncContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_scrnfunc.id
	        set(value) { throw RuntimeException() }
		fun SCRN() : TerminalNode? = getToken(jvmBasicParser.Tokens.SCRN.id, 0)
		fun LPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.LPAREN.id, 0)
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun COMMA() : TerminalNode? = getToken(jvmBasicParser.Tokens.COMMA.id, 0)
		fun RPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterScrnfunc(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitScrnfunc(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitScrnfunc(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  scrnfunc() : ScrnfuncContext {
		var _localctx : ScrnfuncContext = ScrnfuncContext(context, state)
		enterRule(_localctx, 180, Rules.RULE_scrnfunc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 833
			match(SCRN) as Token
			this.state = 834
			match(LPAREN) as Token
			this.state = 835
			expression()
			this.state = 836
			match(COMMA) as Token
			this.state = 837
			expression()
			this.state = 838
			match(RPAREN) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class SinfuncContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_sinfunc.id
	        set(value) { throw RuntimeException() }
		fun SIN() : TerminalNode? = getToken(jvmBasicParser.Tokens.SIN.id, 0)
		fun LPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.LPAREN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterSinfunc(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitSinfunc(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitSinfunc(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  sinfunc() : SinfuncContext {
		var _localctx : SinfuncContext = SinfuncContext(context, state)
		enterRule(_localctx, 182, Rules.RULE_sinfunc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 840
			match(SIN) as Token
			this.state = 841
			match(LPAREN) as Token
			this.state = 842
			expression()
			this.state = 843
			match(RPAREN) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class CosfuncContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_cosfunc.id
	        set(value) { throw RuntimeException() }
		fun COS() : TerminalNode? = getToken(jvmBasicParser.Tokens.COS.id, 0)
		fun LPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.LPAREN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterCosfunc(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitCosfunc(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitCosfunc(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  cosfunc() : CosfuncContext {
		var _localctx : CosfuncContext = CosfuncContext(context, state)
		enterRule(_localctx, 184, Rules.RULE_cosfunc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 845
			match(COS) as Token
			this.state = 846
			match(LPAREN) as Token
			this.state = 847
			expression()
			this.state = 848
			match(RPAREN) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TanfuncContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_tanfunc.id
	        set(value) { throw RuntimeException() }
		fun TAN() : TerminalNode? = getToken(jvmBasicParser.Tokens.TAN.id, 0)
		fun LPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.LPAREN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterTanfunc(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitTanfunc(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitTanfunc(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  tanfunc() : TanfuncContext {
		var _localctx : TanfuncContext = TanfuncContext(context, state)
		enterRule(_localctx, 186, Rules.RULE_tanfunc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 850
			match(TAN) as Token
			this.state = 851
			match(LPAREN) as Token
			this.state = 852
			expression()
			this.state = 853
			match(RPAREN) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class AtnfuncContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_atnfunc.id
	        set(value) { throw RuntimeException() }
		fun ATN() : TerminalNode? = getToken(jvmBasicParser.Tokens.ATN.id, 0)
		fun LPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.LPAREN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterAtnfunc(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitAtnfunc(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitAtnfunc(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  atnfunc() : AtnfuncContext {
		var _localctx : AtnfuncContext = AtnfuncContext(context, state)
		enterRule(_localctx, 188, Rules.RULE_atnfunc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 855
			match(ATN) as Token
			this.state = 856
			match(LPAREN) as Token
			this.state = 857
			expression()
			this.state = 858
			match(RPAREN) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class RndfuncContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_rndfunc.id
	        set(value) { throw RuntimeException() }
		fun RND() : TerminalNode? = getToken(jvmBasicParser.Tokens.RND.id, 0)
		fun LPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.LPAREN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterRndfunc(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitRndfunc(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitRndfunc(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  rndfunc() : RndfuncContext {
		var _localctx : RndfuncContext = RndfuncContext(context, state)
		enterRule(_localctx, 190, Rules.RULE_rndfunc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 860
			match(RND) as Token
			this.state = 861
			match(LPAREN) as Token
			this.state = 862
			expression()
			this.state = 863
			match(RPAREN) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class SgnfuncContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_sgnfunc.id
	        set(value) { throw RuntimeException() }
		fun SGN() : TerminalNode? = getToken(jvmBasicParser.Tokens.SGN.id, 0)
		fun LPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.LPAREN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterSgnfunc(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitSgnfunc(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitSgnfunc(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  sgnfunc() : SgnfuncContext {
		var _localctx : SgnfuncContext = SgnfuncContext(context, state)
		enterRule(_localctx, 192, Rules.RULE_sgnfunc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 865
			match(SGN) as Token
			this.state = 866
			match(LPAREN) as Token
			this.state = 867
			expression()
			this.state = 868
			match(RPAREN) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ExpfuncContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_expfunc.id
	        set(value) { throw RuntimeException() }
		fun EXP() : TerminalNode? = getToken(jvmBasicParser.Tokens.EXP.id, 0)
		fun LPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.LPAREN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterExpfunc(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitExpfunc(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitExpfunc(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  expfunc() : ExpfuncContext {
		var _localctx : ExpfuncContext = ExpfuncContext(context, state)
		enterRule(_localctx, 194, Rules.RULE_expfunc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 870
			match(EXP) as Token
			this.state = 871
			match(LPAREN) as Token
			this.state = 872
			expression()
			this.state = 873
			match(RPAREN) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class LogfuncContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_logfunc.id
	        set(value) { throw RuntimeException() }
		fun LOG() : TerminalNode? = getToken(jvmBasicParser.Tokens.LOG.id, 0)
		fun LPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.LPAREN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterLogfunc(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitLogfunc(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitLogfunc(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  logfunc() : LogfuncContext {
		var _localctx : LogfuncContext = LogfuncContext(context, state)
		enterRule(_localctx, 196, Rules.RULE_logfunc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 875
			match(LOG) as Token
			this.state = 876
			match(LPAREN) as Token
			this.state = 877
			expression()
			this.state = 878
			match(RPAREN) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class AbsfuncContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_absfunc.id
	        set(value) { throw RuntimeException() }
		fun ABS() : TerminalNode? = getToken(jvmBasicParser.Tokens.ABS.id, 0)
		fun LPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.LPAREN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterAbsfunc(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitAbsfunc(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitAbsfunc(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  absfunc() : AbsfuncContext {
		var _localctx : AbsfuncContext = AbsfuncContext(context, state)
		enterRule(_localctx, 198, Rules.RULE_absfunc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 880
			match(ABS) as Token
			this.state = 881
			match(LPAREN) as Token
			this.state = 882
			expression()
			this.state = 883
			match(RPAREN) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TabfuncContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_tabfunc.id
	        set(value) { throw RuntimeException() }
		fun TAB() : TerminalNode? = getToken(jvmBasicParser.Tokens.TAB.id, 0)
		fun LPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.LPAREN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RPAREN() : TerminalNode? = getToken(jvmBasicParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).enterTabfunc(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is jvmBasicListener ) (listener as jvmBasicListener).exitTabfunc(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is jvmBasicVisitor ) return (visitor as jvmBasicVisitor<out T>).visitTabfunc(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  tabfunc() : TabfuncContext {
		var _localctx : TabfuncContext = TabfuncContext(context, state)
		enterRule(_localctx, 200, Rules.RULE_tabfunc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 885
			match(TAB) as Token
			this.state = 886
			match(LPAREN) as Token
			this.state = 887
			expression()
			this.state = 888
			match(RPAREN) as Token
			}
		}
		catch (re: RecognitionException) {
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