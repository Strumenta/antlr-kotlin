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

class Cobol85PreprocessorParser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(Cobol85PreprocessorParser.StartRuleContext::class,
                                                              Cobol85PreprocessorParser.CompilerOptionsContext::class,
                                                              Cobol85PreprocessorParser.CompilerXOptsContext::class,
                                                              Cobol85PreprocessorParser.CompilerOptionContext::class,
                                                              Cobol85PreprocessorParser.ExecCicsStatementContext::class,
                                                              Cobol85PreprocessorParser.ExecSqlStatementContext::class,
                                                              Cobol85PreprocessorParser.ExecSqlImsStatementContext::class,
                                                              Cobol85PreprocessorParser.CopyStatementContext::class,
                                                              Cobol85PreprocessorParser.CopySourceContext::class,
                                                              Cobol85PreprocessorParser.CopyLibraryContext::class,
                                                              Cobol85PreprocessorParser.ReplacingPhraseContext::class,
                                                              Cobol85PreprocessorParser.ReplaceAreaContext::class,
                                                              Cobol85PreprocessorParser.ReplaceByStatementContext::class,
                                                              Cobol85PreprocessorParser.ReplaceOffStatementContext::class,
                                                              Cobol85PreprocessorParser.ReplaceClauseContext::class,
                                                              Cobol85PreprocessorParser.DirectoryPhraseContext::class,
                                                              Cobol85PreprocessorParser.FamilyPhraseContext::class,
                                                              Cobol85PreprocessorParser.ReplaceableContext::class,
                                                              Cobol85PreprocessorParser.ReplacementContext::class,
                                                              Cobol85PreprocessorParser.EjectStatementContext::class,
                                                              Cobol85PreprocessorParser.SkipStatementContext::class,
                                                              Cobol85PreprocessorParser.TitleStatementContext::class,
                                                              Cobol85PreprocessorParser.PseudoTextContext::class,
                                                              Cobol85PreprocessorParser.CharDataContext::class,
                                                              Cobol85PreprocessorParser.CharDataSqlContext::class,
                                                              Cobol85PreprocessorParser.CharDataLineContext::class,
                                                              Cobol85PreprocessorParser.CobolWordContext::class,
                                                              Cobol85PreprocessorParser.LiteralContext::class,
                                                              Cobol85PreprocessorParser.FilenameContext::class,
                                                              Cobol85PreprocessorParser.CharDataKeywordContext::class)
    }

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "Cobol85Preprocessor.g4"

    override val tokenNames: Array<String?>?
        get() = Cobol85PreprocessorParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = Cobol85PreprocessorParser.Companion.ruleNames
    override val atn: ATN
        get() = Cobol85PreprocessorParser.Companion.ATN

    enum class Tokens(val id: Int) {
        EOF(-1),
        ADATA(1),
        ADV(2),
        ALIAS(3),
        ANSI(4),
        ANY(5),
        APOST(6),
        AR(7),
        ARITH(8),
        AUTO(9),
        AWO(10),
        BIN(11),
        BLOCK0(12),
        BUF(13),
        BUFSIZE(14),
        BY(15),
        CBL(16),
        CBLCARD(17),
        CICS(18),
        CO(19),
        COBOL2(20),
        COBOL3(21),
        CODEPAGE(22),
        COMPAT(23),
        COMPILE(24),
        COPY(25),
        CP(26),
        CPP(27),
        CPSM(28),
        CS(29),
        CURR(30),
        CURRENCY(31),
        DATA(32),
        DATEPROC(33),
        DBCS(34),
        DD(35),
        DEBUG(36),
        DECK(37),
        DIAGTRUNC(38),
        DLI(39),
        DLL(40),
        DP(41),
        DTR(42),
        DU(43),
        DUMP(44),
        DYN(45),
        DYNAM(46),
        EDF(47),
        EJECT(48),
        EJPD(49),
        EN(50),
        ENGLISH(51),
        END_EXEC(52),
        EPILOG(53),
        EXCI(54),
        EXEC(55),
        EXIT(56),
        EXP(57),
        EXPORTALL(58),
        EXTEND(59),
        FASTSRT(60),
        FEPI(61),
        FLAG(62),
        FLAGSTD(63),
        FSRT(64),
        FULL(65),
        GDS(66),
        GRAPHIC(67),
        HOOK(68),
        IN(69),
        INTDATE(70),
        JA(71),
        JP(72),
        KA(73),
        LANG(74),
        LANGUAGE(75),
        LC(76),
        LEASM(77),
        LENGTH(78),
        LIB(79),
        LILIAN(80),
        LIN(81),
        LINECOUNT(82),
        LINKAGE(83),
        LIST(84),
        LM(85),
        LONGMIXED(86),
        LONGUPPER(87),
        LPARENCHAR(88),
        LU(89),
        MAP(90),
        MARGINS(91),
        MAX(92),
        MD(93),
        MDECK(94),
        MIG(95),
        MIXED(96),
        NAME(97),
        NAT(98),
        NATIONAL(99),
        NATLANG(100),
        NN(101),
        NO(102),
        NOADATA(103),
        NOADV(104),
        NOALIAS(105),
        NOAWO(106),
        NOBLOCK0(107),
        NOC(108),
        NOCBLCARD(109),
        NOCICS(110),
        NOCMPR2(111),
        NOCOMPILE(112),
        NOCPSM(113),
        NOCURR(114),
        NOCURRENCY(115),
        NOD(116),
        NODATEPROC(117),
        NODBCS(118),
        NODE(119),
        NODEBUG(120),
        NODECK(121),
        NODIAGTRUNC(122),
        NODLL(123),
        NODU(124),
        NODUMP(125),
        NODP(126),
        NODTR(127),
        NODYN(128),
        NODYNAM(129),
        NOEDF(130),
        NOEJPD(131),
        NOEPILOG(132),
        NOEXIT(133),
        NOEXP(134),
        NOEXPORTALL(135),
        NOF(136),
        NOFASTSRT(137),
        NOFEPI(138),
        NOFLAG(139),
        NOFLAGMIG(140),
        NOFLAGSTD(141),
        NOFSRT(142),
        NOGRAPHIC(143),
        NOHOOK(144),
        NOLENGTH(145),
        NOLIB(146),
        NOLINKAGE(147),
        NOLIST(148),
        NOMAP(149),
        NOMD(150),
        NOMDECK(151),
        NONAME(152),
        NONUM(153),
        NONUMBER(154),
        NOOBJ(155),
        NOOBJECT(156),
        NOOFF(157),
        NOOFFSET(158),
        NOOPSEQUENCE(159),
        NOOPT(160),
        NOOPTIMIZE(161),
        NOOPTIONS(162),
        NOP(163),
        NOPFD(164),
        NOPROLOG(165),
        NORENT(166),
        NOS(167),
        NOSEP(168),
        NOSEPARATE(169),
        NOSEQ(170),
        NOSOURCE(171),
        NOSPIE(172),
        NOSQL(173),
        NOSQLC(174),
        NOSQLCCSID(175),
        NOSSR(176),
        NOSSRANGE(177),
        NOSTDTRUNC(178),
        NOSEQUENCE(179),
        NOTERM(180),
        NOTERMINAL(181),
        NOTEST(182),
        NOTHREAD(183),
        NOTRIG(184),
        NOVBREF(185),
        NOWD(186),
        NOWORD(187),
        NOX(188),
        NOXREF(189),
        NOZWB(190),
        NS(191),
        NSEQ(192),
        NSYMBOL(193),
        NUM(194),
        NUMBER(195),
        NUMPROC(196),
        OBJ(197),
        OBJECT(198),
        OF(199),
        OFF(200),
        OFFSET(201),
        ON(202),
        OP(203),
        OPMARGINS(204),
        OPSEQUENCE(205),
        OPT(206),
        OPTFILE(207),
        OPTIMIZE(208),
        OPTIONS(209),
        OUT(210),
        OUTDD(211),
        PFD(212),
        PPTDBG(213),
        PGMN(214),
        PGMNAME(215),
        PROCESS(216),
        PROLOG(217),
        QUOTE(218),
        RENT(219),
        REPLACE(220),
        REPLACING(221),
        RMODE(222),
        RPARENCHAR(223),
        SEP(224),
        SEPARATE(225),
        SEQ(226),
        SEQUENCE(227),
        SHORT(228),
        SIZE(229),
        SOURCE(230),
        SP(231),
        SPACE(232),
        SPIE(233),
        SQL(234),
        SQLC(235),
        SQLCCSID(236),
        SQLIMS(237),
        SKIP1(238),
        SKIP2(239),
        SKIP3(240),
        SS(241),
        SSR(242),
        SSRANGE(243),
        STD(244),
        SUPPRESS(245),
        SYSEIB(246),
        SZ(247),
        TERM(248),
        TERMINAL(249),
        TEST(250),
        THREAD(251),
        TITLE(252),
        TRIG(253),
        TRUNC(254),
        UE(255),
        UPPER(256),
        VBREF(257),
        WD(258),
        WORD(259),
        XMLPARSE(260),
        XMLSS(261),
        XOPTS(262),
        XP(263),
        XREF(264),
        YEARWINDOW(265),
        YW(266),
        ZWB(267),
        C_CHAR(268),
        D_CHAR(269),
        E_CHAR(270),
        F_CHAR(271),
        H_CHAR(272),
        I_CHAR(273),
        M_CHAR(274),
        N_CHAR(275),
        Q_CHAR(276),
        S_CHAR(277),
        U_CHAR(278),
        W_CHAR(279),
        X_CHAR(280),
        COMMENTTAG(281),
        COMMACHAR(282),
        DOT(283),
        DOUBLEEQUALCHAR(284),
        NONNUMERICLITERAL(285),
        NUMERICLITERAL(286),
        IDENTIFIER(287),
        FILENAME(288),
        NEWLINE(289),
        COMMENTLINE(290),
        WS(291),
        TEXT(292)
    }

    enum class Rules(val id: Int) {
        RULE_startRule(0),
        RULE_compilerOptions(1),
        RULE_compilerXOpts(2),
        RULE_compilerOption(3),
        RULE_execCicsStatement(4),
        RULE_execSqlStatement(5),
        RULE_execSqlImsStatement(6),
        RULE_copyStatement(7),
        RULE_copySource(8),
        RULE_copyLibrary(9),
        RULE_replacingPhrase(10),
        RULE_replaceArea(11),
        RULE_replaceByStatement(12),
        RULE_replaceOffStatement(13),
        RULE_replaceClause(14),
        RULE_directoryPhrase(15),
        RULE_familyPhrase(16),
        RULE_replaceable(17),
        RULE_replacement(18),
        RULE_ejectStatement(19),
        RULE_skipStatement(20),
        RULE_titleStatement(21),
        RULE_pseudoText(22),
        RULE_charData(23),
        RULE_charDataSql(24),
        RULE_charDataLine(25),
        RULE_cobolWord(26),
        RULE_literal(27),
        RULE_filename(28),
        RULE_charDataKeyword(29)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("startRule", "compilerOptions", "compilerXOpts", 
                                "compilerOption", "execCicsStatement", "execSqlStatement", 
                                "execSqlImsStatement", "copyStatement", 
                                "copySource", "copyLibrary", "replacingPhrase", 
                                "replaceArea", "replaceByStatement", "replaceOffStatement", 
                                "replaceClause", "directoryPhrase", "familyPhrase", 
                                "replaceable", "replacement", "ejectStatement", 
                                "skipStatement", "titleStatement", "pseudoText", 
                                "charData", "charDataSql", "charDataLine", 
                                "cobolWord", "literal", "filename", "charDataKeyword")

        private val LITERAL_NAMES = Arrays.asList<String?>(null, null, null, 
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
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, "'('", 
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
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, "')'", 
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
                                                           "'*>'", "','", 
                                                           "'.'", "'=='")
        private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, "ADATA", 
                                                            "ADV", "ALIAS", 
                                                            "ANSI", "ANY", 
                                                            "APOST", "AR", 
                                                            "ARITH", "AUTO", 
                                                            "AWO", "BIN", 
                                                            "BLOCK0", "BUF", 
                                                            "BUFSIZE", "BY", 
                                                            "CBL", "CBLCARD", 
                                                            "CICS", "CO", 
                                                            "COBOL2", "COBOL3", 
                                                            "CODEPAGE", 
                                                            "COMPAT", "COMPILE", 
                                                            "COPY", "CP", 
                                                            "CPP", "CPSM", 
                                                            "CS", "CURR", 
                                                            "CURRENCY", 
                                                            "DATA", "DATEPROC", 
                                                            "DBCS", "DD", 
                                                            "DEBUG", "DECK", 
                                                            "DIAGTRUNC", 
                                                            "DLI", "DLL", 
                                                            "DP", "DTR", 
                                                            "DU", "DUMP", 
                                                            "DYN", "DYNAM", 
                                                            "EDF", "EJECT", 
                                                            "EJPD", "EN", 
                                                            "ENGLISH", "END_EXEC", 
                                                            "EPILOG", "EXCI", 
                                                            "EXEC", "EXIT", 
                                                            "EXP", "EXPORTALL", 
                                                            "EXTEND", "FASTSRT", 
                                                            "FEPI", "FLAG", 
                                                            "FLAGSTD", "FSRT", 
                                                            "FULL", "GDS", 
                                                            "GRAPHIC", "HOOK", 
                                                            "IN", "INTDATE", 
                                                            "JA", "JP", 
                                                            "KA", "LANG", 
                                                            "LANGUAGE", 
                                                            "LC", "LEASM", 
                                                            "LENGTH", "LIB", 
                                                            "LILIAN", "LIN", 
                                                            "LINECOUNT", 
                                                            "LINKAGE", "LIST", 
                                                            "LM", "LONGMIXED", 
                                                            "LONGUPPER", 
                                                            "LPARENCHAR", 
                                                            "LU", "MAP", 
                                                            "MARGINS", "MAX", 
                                                            "MD", "MDECK", 
                                                            "MIG", "MIXED", 
                                                            "NAME", "NAT", 
                                                            "NATIONAL", 
                                                            "NATLANG", "NN", 
                                                            "NO", "NOADATA", 
                                                            "NOADV", "NOALIAS", 
                                                            "NOAWO", "NOBLOCK0", 
                                                            "NOC", "NOCBLCARD", 
                                                            "NOCICS", "NOCMPR2", 
                                                            "NOCOMPILE", 
                                                            "NOCPSM", "NOCURR", 
                                                            "NOCURRENCY", 
                                                            "NOD", "NODATEPROC", 
                                                            "NODBCS", "NODE", 
                                                            "NODEBUG", "NODECK", 
                                                            "NODIAGTRUNC", 
                                                            "NODLL", "NODU", 
                                                            "NODUMP", "NODP", 
                                                            "NODTR", "NODYN", 
                                                            "NODYNAM", "NOEDF", 
                                                            "NOEJPD", "NOEPILOG", 
                                                            "NOEXIT", "NOEXP", 
                                                            "NOEXPORTALL", 
                                                            "NOF", "NOFASTSRT", 
                                                            "NOFEPI", "NOFLAG", 
                                                            "NOFLAGMIG", 
                                                            "NOFLAGSTD", 
                                                            "NOFSRT", "NOGRAPHIC", 
                                                            "NOHOOK", "NOLENGTH", 
                                                            "NOLIB", "NOLINKAGE", 
                                                            "NOLIST", "NOMAP", 
                                                            "NOMD", "NOMDECK", 
                                                            "NONAME", "NONUM", 
                                                            "NONUMBER", 
                                                            "NOOBJ", "NOOBJECT", 
                                                            "NOOFF", "NOOFFSET", 
                                                            "NOOPSEQUENCE", 
                                                            "NOOPT", "NOOPTIMIZE", 
                                                            "NOOPTIONS", 
                                                            "NOP", "NOPFD", 
                                                            "NOPROLOG", 
                                                            "NORENT", "NOS", 
                                                            "NOSEP", "NOSEPARATE", 
                                                            "NOSEQ", "NOSOURCE", 
                                                            "NOSPIE", "NOSQL", 
                                                            "NOSQLC", "NOSQLCCSID", 
                                                            "NOSSR", "NOSSRANGE", 
                                                            "NOSTDTRUNC", 
                                                            "NOSEQUENCE", 
                                                            "NOTERM", "NOTERMINAL", 
                                                            "NOTEST", "NOTHREAD", 
                                                            "NOTRIG", "NOVBREF", 
                                                            "NOWD", "NOWORD", 
                                                            "NOX", "NOXREF", 
                                                            "NOZWB", "NS", 
                                                            "NSEQ", "NSYMBOL", 
                                                            "NUM", "NUMBER", 
                                                            "NUMPROC", "OBJ", 
                                                            "OBJECT", "OF", 
                                                            "OFF", "OFFSET", 
                                                            "ON", "OP", 
                                                            "OPMARGINS", 
                                                            "OPSEQUENCE", 
                                                            "OPT", "OPTFILE", 
                                                            "OPTIMIZE", 
                                                            "OPTIONS", "OUT", 
                                                            "OUTDD", "PFD", 
                                                            "PPTDBG", "PGMN", 
                                                            "PGMNAME", "PROCESS", 
                                                            "PROLOG", "QUOTE", 
                                                            "RENT", "REPLACE", 
                                                            "REPLACING", 
                                                            "RMODE", "RPARENCHAR", 
                                                            "SEP", "SEPARATE", 
                                                            "SEQ", "SEQUENCE", 
                                                            "SHORT", "SIZE", 
                                                            "SOURCE", "SP", 
                                                            "SPACE", "SPIE", 
                                                            "SQL", "SQLC", 
                                                            "SQLCCSID", 
                                                            "SQLIMS", "SKIP1", 
                                                            "SKIP2", "SKIP3", 
                                                            "SS", "SSR", 
                                                            "SSRANGE", "STD", 
                                                            "SUPPRESS", 
                                                            "SYSEIB", "SZ", 
                                                            "TERM", "TERMINAL", 
                                                            "TEST", "THREAD", 
                                                            "TITLE", "TRIG", 
                                                            "TRUNC", "UE", 
                                                            "UPPER", "VBREF", 
                                                            "WD", "WORD", 
                                                            "XMLPARSE", 
                                                            "XMLSS", "XOPTS", 
                                                            "XP", "XREF", 
                                                            "YEARWINDOW", 
                                                            "YW", "ZWB", 
                                                            "C_CHAR", "D_CHAR", 
                                                            "E_CHAR", "F_CHAR", 
                                                            "H_CHAR", "I_CHAR", 
                                                            "M_CHAR", "N_CHAR", 
                                                            "Q_CHAR", "S_CHAR", 
                                                            "U_CHAR", "W_CHAR", 
                                                            "X_CHAR", "COMMENTTAG", 
                                                            "COMMACHAR", 
                                                            "DOT", "DOUBLEEQUALCHAR", 
                                                            "NONNUMERICLITERAL", 
                                                            "NUMERICLITERAL", 
                                                            "IDENTIFIER", 
                                                            "FILENAME", 
                                                            "NEWLINE", "COMMENTLINE", 
                                                            "WS", "TEXT")

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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u0126\u02a8\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0004\u001c\u0009\u001c\u0004\u001d\u0009\u001d\u0004\u001e\u0009\u001e\u0004\u001f\u0009\u001f\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0007\u0002\u004b\u000a\u0002\u000c\u0002\u000e\u0002\u004e\u000b\u0002\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0005\u0003\u0054\u000a\u0003\u0003\u0003\u0003\u0003\u0006\u0003\u0058\u000a\u0003\u000d\u0003\u000e\u0003\u0059\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0005\u0004\u0060\u000a\u0004\u0003\u0004\u0007\u0004\u0063\u000a\u0004\u000c\u0004\u000e\u0004\u0066\u000b\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005\u007e\u000a\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005\u0097\u000a\u0005\u0003\u0005\u0005\u0005\u009a\u000a\u0005\u0003\u0005\u0005\u0005\u009d\u000a\u0005\u0003\u0005\u0005\u0005\u00a0\u000a\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005\u00b4\u000a\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005\u00bc\u000a\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005\u00dc\u000a\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005\u00e4\u000a\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005\u00ea\u000a\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005\u00fb\u000a\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005\u0144\u000a\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005\u0153\u000a\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005\u0169\u000a\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005\u0173\u000a\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005\u0179\u000a\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005\u0189\u000a\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005\u0192\u000a\u0005\u0003\u0005\u0005\u0005\u0195\u000a\u0005\u0003\u0005\u0005\u0005\u0198\u000a\u0005\u0003\u0005\u0005\u0005\u019b\u000a\u0005\u0003\u0005\u0005\u0005\u019e\u000a\u0005\u0003\u0005\u0005\u0005\u01a1\u000a\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005\u01b5\u000a\u0005\u0003\u0005\u0005\u0005\u01b8\u000a\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005\u01c0\u000a\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0005\u0006\u01c7\u000a\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0005\u0007\u01ce\u000a\u0007\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0005\u0008\u01d5\u000a\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0007\u0009\u01da\u000a\u0009\u000c\u0009\u000e\u0009\u01dd\u000b\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0005\u0009\u01e3\u000a\u0009\u0007\u0009\u01e5\u000a\u0009\u000c\u0009\u000e\u0009\u01e8\u000b\u0009\u0003\u0009\u0007\u0009\u01eb\u000a\u0009\u000c\u0009\u000e\u0009\u01ee\u000b\u0009\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0005\u000a\u01f5\u000a\u000a\u0003\u000a\u0003\u000a\u0005\u000a\u01f9\u000a\u000a\u0003\u000b\u0003\u000b\u0005\u000b\u01fd\u000a\u000b\u0003\u000c\u0003\u000c\u0007\u000c\u0201\u000a\u000c\u000c\u000c\u000e\u000c\u0204\u000b\u000c\u0003\u000c\u0003\u000c\u0006\u000c\u0208\u000a\u000c\u000d\u000c\u000e\u000c\u0209\u0003\u000c\u0007\u000c\u020d\u000a\u000c\u000c\u000c\u000e\u000c\u0210\u000b\u000c\u0003\u000d\u0003\u000d\u0003\u000d\u0007\u000d\u0215\u000a\u000d\u000c\u000d\u000e\u000d\u0218\u000b\u000d\u0003\u000d\u0005\u000d\u021b\u000a\u000d\u0003\u000e\u0003\u000e\u0007\u000e\u021f\u000a\u000e\u000c\u000e\u000e\u000e\u0222\u000b\u000e\u0003\u000e\u0006\u000e\u0225\u000a\u000e\u000d\u000e\u000e\u000e\u0226\u0003\u000e\u0003\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u0010\u0003\u0010\u0007\u0010\u0231\u000a\u0010\u000c\u0010\u000e\u0010\u0234\u000b\u0010\u0003\u0010\u0003\u0010\u0007\u0010\u0238\u000a\u0010\u000c\u0010\u000e\u0010\u023b\u000b\u0010\u0003\u0010\u0003\u0010\u0007\u0010\u023f\u000a\u0010\u000c\u0010\u000e\u0010\u0242\u000b\u0010\u0003\u0010\u0005\u0010\u0245\u000a\u0010\u0003\u0010\u0007\u0010\u0248\u000a\u0010\u000c\u0010\u000e\u0010\u024b\u000b\u0010\u0003\u0010\u0005\u0010\u024e\u000a\u0010\u0003\u0011\u0003\u0011\u0007\u0011\u0252\u000a\u0011\u000c\u0011\u000e\u0011\u0255\u000b\u0011\u0003\u0011\u0003\u0011\u0005\u0011\u0259\u000a\u0011\u0003\u0012\u0003\u0012\u0007\u0012\u025d\u000a\u0012\u000c\u0012\u000e\u0012\u0260\u000b\u0012\u0003\u0012\u0003\u0012\u0005\u0012\u0264\u000a\u0012\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0005\u0013\u026a\u000a\u0013\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0005\u0014\u0270\u000a\u0014\u0003\u0015\u0003\u0015\u0005\u0015\u0274\u000a\u0015\u0003\u0016\u0003\u0016\u0005\u0016\u0278\u000a\u0016\u0003\u0017\u0003\u0017\u0003\u0017\u0005\u0017\u027d\u000a\u0017\u0003\u0018\u0003\u0018\u0005\u0018\u0281\u000a\u0018\u0003\u0018\u0003\u0018\u0003\u0019\u0003\u0019\u0006\u0019\u0287\u000a\u0019\u000d\u0019\u000e\u0019\u0288\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0006\u001a\u028f\u000a\u001a\u000d\u001a\u000e\u001a\u0290\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0006\u001b\u029a\u000a\u001b\u000d\u001b\u000e\u001b\u029b\u0003\u001c\u0003\u001c\u0005\u001c\u02a0\u000a\u001c\u0003\u001d\u0003\u001d\u0003\u001e\u0003\u001e\u0003\u001f\u0003\u001f\u0003\u001f\u0002\u0002\u0020\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0020\u0022\u0024\u0026\u0028\u002a\u002c\u002e\u0030\u0032\u0034\u0036\u0038\u003a\u003c\u0002\u0055\u0004\u0002\u0012\u0012\u00da\u00da\u0003\u0002\u0009\u000a\u0006\u0002\u0019\u0019\u003d\u003d\u010e\u010e\u0110\u0110\u0003\u0002\u000f\u0010\u0004\u0002\u0018\u0018\u001c\u001c\u0004\u0002\u001a\u001a\u010e\u010e\u0003\u0002\u0020\u0021\u0004\u0002\u0023\u0023\u002b\u002b\u0004\u0002\u0040\u0040\u008d\u008d\u0004\u0002\u00ba\u00ba\u00ff\u00ff\u0004\u0002\u0027\u0027\u010f\u010f\u0004\u0002\u0028\u0028\u002c\u002c\u0003\u0002\u002d\u002e\u0003\u0002\u002f\u0030\u0003\u0002\u003b\u003c\u0004\u0002\u003e\u003e\u0042\u0042\u0004\u0002\u0040\u0040\u0111\u0111\u0005\u0002\u0110\u0110\u0113\u0113\u0117\u0119\u0003\u0002\u0112\u0114\u0008\u0002\u0025\u0025\u0067\u0067\u00f3\u00f3\u010f\u010f\u0115\u0115\u0117\u0117\u0004\u0002\u0006\u0006\u0052\u0052\u0003\u0002\u004c\u004d\u0006\u0002\u001f\u001f\u0034\u0035\u0049\u004b\u0101\u0101\u0004\u0002\u004e\u004e\u0054\u0054\u0003\u0002\u005f\u0060\u0006\u0002\u001a\u001a\u006e\u006e\u0072\u0072\u010e\u010e\u0004\u0002\u0005\u0005\u006b\u006b\u0005\u0002\u001f\u001f\u0034\u0034\u004b\u004b\u0004\u0002\u006e\u006e\u0072\u0072\u0005\u0002\u0110\u0110\u0117\u0117\u0119\u0119\u0003\u0002\u0074\u0075\u0004\u0002\u0077\u0077\u0080\u0080\u0004\u0002\u0076\u0076\u007b\u007b\u0003\u0002\u007e\u007f\u0004\u0002\u007c\u007c\u0081\u0081\u0003\u0002\u0082\u0083\u0003\u0002\u0088\u0089\u0004\u0002\u008b\u008b\u0090\u0090\u0004\u0002\u008a\u008a\u008d\u008d\u0003\u0002\u0098\u0099\u0003\u0002\u009b\u009c\u0003\u0002\u009d\u009e\u0003\u0002\u009f\u00a0\u0003\u0002\u00a2\u00a3\u0004\u0002\u00ac\u00ac\u00b5\u00b5\u0004\u0002\u00a9\u00a9\u00ad\u00ad\u0003\u0002\u00b0\u00b1\u0003\u0002\u00b2\u00b3\u0003\u0002\u00b6\u00b7\u0003\u0002\u00bc\u00bd\u0004\u0002\u00c1\u00c1\u00c3\u00c3\u0004\u0002\u0024\u0024\u0064\u0065\u0003\u0002\u00be\u00bf\u0003\u0002\u00c4\u00c5\u0005\u0002\u0061\u0061\u00a6\u00a6\u00d6\u00d6\u0003\u0002\u00c7\u00c8\u0003\u0002\u00ca\u00cb\u0004\u0002\u00d0\u00d0\u00d2\u00d2\u0004\u0002\u0043\u0043\u00f6\u00f6\u0003\u0002\u00d4\u00d5\u0003\u0002\u00d8\u00d9\u000a\u0002\u0015\u0015\u0019\u0019\u0057\u0059\u005b\u005b\u0062\u0062\u0102\u0102\u0114\u0114\u0118\u0118\u0004\u0002\u00dc\u00dc\u0116\u0116\u0003\u0002\u00e4\u00e5\u0004\u0002\u00e7\u00e7\u00f9\u00f9\u0004\u0002\u00e8\u00e8\u0117\u0117\u0003\u0002\u00ed\u00ee\u0003\u0002\u00f4\u00f5\u0003\u0002\u00fa\u00fb\u0004\u0002\u0046\u0046\u0092\u0092\u0004\u0002\u00aa\u00ab\u00e2\u00e3\u0004\u0002\u0033\u0033\u0085\u0085\u0005\u0002\u000d\u000d\u00d0\u00d0\u00f6\u00f6\u0003\u0002\u0104\u0105\u0004\u0002\u0106\u0106\u0109\u0109\u0006\u0002\u0019\u0019\u0107\u0107\u010e\u010e\u011a\u011a\u0004\u0002\u010a\u010a\u011a\u011a\u0004\u0002\u0043\u0043\u00e6\u00e6\u0003\u0002\u010b\u010c\u0004\u0002\u0047\u0047\u00c9\u00c9\u0003\u0002\u00f0\u00f2\u0003\u0002\u011f\u0120\u0012\u0002\u0003\u0013\u0015\u001a\u001c\u0035\u0037\u0038\u003a\u003e\u0040\u004e\u0050\u0059\u005b\u00bb\u00bd\u00dd\u00df\u00e0\u00e2\u00ee\u00f3\u00f6\u00f8\u0104\u0106\u0108\u010a\u011a\u011c\u011c\u0002\u037d\u0002\u004c\u0003\u0002\u0002\u0002\u0004\u0051\u0003\u0002\u0002\u0002\u0006\u005b\u0003\u0002\u0002\u0002\u0008\u01bf\u0003\u0002\u0002\u0002\u000a\u01c1\u0003\u0002\u0002\u0002\u000c\u01c8\u0003\u0002\u0002\u0002\u000e\u01cf\u0003\u0002\u0002\u0002\u0010\u01d6\u0003\u0002\u0002\u0002\u0012\u01f4\u0003\u0002\u0002\u0002\u0014\u01fc\u0003\u0002\u0002\u0002\u0016\u01fe\u0003\u0002\u0002\u0002\u0018\u0211\u0003\u0002\u0002\u0002\u001a\u021c\u0003\u0002\u0002\u0002\u001c\u022a\u0003\u0002\u0002\u0002\u001e\u022e\u0003\u0002\u0002\u0002\u0020\u024f\u0003\u0002\u0002\u0002\u0022\u025a\u0003\u0002\u0002\u0002\u0024\u0269\u0003\u0002\u0002\u0002\u0026\u026f\u0003\u0002\u0002\u0002\u0028\u0271\u0003\u0002\u0002\u0002\u002a\u0275\u0003\u0002\u0002\u0002\u002c\u0279\u0003\u0002\u0002\u0002\u002e\u027e\u0003\u0002\u0002\u0002\u0030\u0286\u0003\u0002\u0002\u0002\u0032\u028e\u0003\u0002\u0002\u0002\u0034\u0299\u0003\u0002\u0002\u0002\u0036\u029f\u0003\u0002\u0002\u0002\u0038\u02a1\u0003\u0002\u0002\u0002\u003a\u02a3\u0003\u0002\u0002\u0002\u003c\u02a5\u0003\u0002\u0002\u0002\u003e\u004b\u0005\u0004\u0003\u0002\u003f\u004b\u0005\u0010\u0009\u0002\u0040\u004b\u0005\u000a\u0006\u0002\u0041\u004b\u0005\u000c\u0007\u0002\u0042\u004b\u0005\u000e\u0008\u0002\u0043\u004b\u0005\u001c\u000f\u0002\u0044\u004b\u0005\u0018\u000d\u0002\u0045\u004b\u0005\u0028\u0015\u0002\u0046\u004b\u0005\u002a\u0016\u0002\u0047\u004b\u0005\u002c\u0017\u0002\u0048\u004b\u0005\u0034\u001b\u0002\u0049\u004b\u0007\u0123\u0002\u0002\u004a\u003e\u0003\u0002\u0002\u0002\u004a\u003f\u0003\u0002\u0002\u0002\u004a\u0040\u0003\u0002\u0002\u0002\u004a\u0041\u0003\u0002\u0002\u0002\u004a\u0042\u0003\u0002\u0002\u0002\u004a\u0043\u0003\u0002\u0002\u0002\u004a\u0044\u0003\u0002\u0002\u0002\u004a\u0045\u0003\u0002\u0002\u0002\u004a\u0046\u0003\u0002\u0002\u0002\u004a\u0047\u0003\u0002\u0002\u0002\u004a\u0048\u0003\u0002\u0002\u0002\u004a\u0049\u0003\u0002\u0002\u0002\u004b\u004e\u0003\u0002\u0002\u0002\u004c\u004a\u0003\u0002\u0002\u0002\u004c\u004d\u0003\u0002\u0002\u0002\u004d\u004f\u0003\u0002\u0002\u0002\u004e\u004c\u0003\u0002\u0002\u0002\u004f\u0050\u0007\u0002\u0002\u0003\u0050\u0003\u0003\u0002\u0002\u0002\u0051\u0057\u0009\u0002\u0002\u0002\u0052\u0054\u0007\u011c\u0002\u0002\u0053\u0052\u0003\u0002\u0002\u0002\u0053\u0054\u0003\u0002\u0002\u0002\u0054\u0055\u0003\u0002\u0002\u0002\u0055\u0058\u0005\u0008\u0005\u0002\u0056\u0058\u0005\u0006\u0004\u0002\u0057\u0053\u0003\u0002\u0002\u0002\u0057\u0056\u0003\u0002\u0002\u0002\u0058\u0059\u0003\u0002\u0002\u0002\u0059\u0057\u0003\u0002\u0002\u0002\u0059\u005a\u0003\u0002\u0002\u0002\u005a\u0005\u0003\u0002\u0002\u0002\u005b\u005c\u0007\u0108\u0002\u0002\u005c\u005d\u0007\u005a\u0002\u0002\u005d\u0064\u0005\u0008\u0005\u0002\u005e\u0060\u0007\u011c\u0002\u0002\u005f\u005e\u0003\u0002\u0002\u0002\u005f\u0060\u0003\u0002\u0002\u0002\u0060\u0061\u0003\u0002\u0002\u0002\u0061\u0063\u0005\u0008\u0005\u0002\u0062\u005f\u0003\u0002\u0002\u0002\u0063\u0066\u0003\u0002\u0002\u0002\u0064\u0062\u0003\u0002\u0002\u0002\u0064\u0065\u0003\u0002\u0002\u0002\u0065\u0067\u0003\u0002\u0002\u0002\u0066\u0064\u0003\u0002\u0002\u0002\u0067\u0068\u0007\u00e1\u0002\u0002\u0068\u0007\u0003\u0002\u0002\u0002\u0069\u01c0\u0007\u0003\u0002\u0002\u006a\u01c0\u0007\u0004\u0002\u0002\u006b\u01c0\u0007\u0008\u0002\u0002\u006c\u006d\u0009\u0003\u0002\u0002\u006d\u006e\u0007\u005a\u0002\u0002\u006e\u006f\u0009\u0004\u0002\u0002\u006f\u01c0\u0007\u00e1\u0002\u0002\u0070\u01c0\u0007\u000c\u0002\u0002\u0071\u01c0\u0007\u000e\u0002\u0002\u0072\u0073\u0009\u0005\u0002\u0002\u0073\u0074\u0007\u005a\u0002\u0002\u0074\u0075\u0005\u0038\u001d\u0002\u0075\u0076\u0007\u00e1\u0002\u0002\u0076\u01c0\u0003\u0002\u0002\u0002\u0077\u01c0\u0007\u0013\u0002\u0002\u0078\u007d\u0007\u0014\u0002\u0002\u0079\u007a\u0007\u005a\u0002\u0002\u007a\u007b\u0005\u0038\u001d\u0002\u007b\u007c\u0007\u00e1\u0002\u0002\u007c\u007e\u0003\u0002\u0002\u0002\u007d\u0079\u0003\u0002\u0002\u0002\u007d\u007e\u0003\u0002\u0002\u0002\u007e\u01c0\u0003\u0002\u0002\u0002\u007f\u01c0\u0007\u0016\u0002\u0002\u0080\u01c0\u0007\u0017\u0002\u0002\u0081\u0082\u0009\u0006\u0002\u0002\u0082\u0083\u0007\u005a\u0002\u0002\u0083\u0084\u0005\u0038\u001d\u0002\u0084\u0085\u0007\u00e1\u0002\u0002\u0085\u01c0\u0003\u0002\u0002\u0002\u0086\u01c0\u0009\u0007\u0002\u0002\u0087\u01c0\u0007\u001d\u0002\u0002\u0088\u01c0\u0007\u001e\u0002\u0002\u0089\u008a\u0009\u0008\u0002\u0002\u008a\u008b\u0007\u005a\u0002\u0002\u008b\u008c\u0005\u0038\u001d\u0002\u008c\u008d\u0007\u00e1\u0002\u0002\u008d\u01c0\u0003\u0002\u0002\u0002\u008e\u008f\u0007\u0022\u0002\u0002\u008f\u0090\u0007\u005a\u0002\u0002\u0090\u0091\u0005\u0038\u001d\u0002\u0091\u0092\u0007\u00e1\u0002\u0002\u0092\u01c0\u0003\u0002\u0002\u0002\u0093\u009f\u0009\u0009\u0002\u0002\u0094\u0096\u0007\u005a\u0002\u0002\u0095\u0097\u0009\u000a\u0002\u0002\u0096\u0095\u0003\u0002\u0002\u0002\u0096\u0097\u0003\u0002\u0002\u0002\u0097\u0099\u0003\u0002\u0002\u0002\u0098\u009a\u0007\u011c\u0002\u0002\u0099\u0098\u0003\u0002\u0002\u0002\u0099\u009a\u0003\u0002\u0002\u0002\u009a\u009c\u0003\u0002\u0002\u0002\u009b\u009d\u0009\u000b\u0002\u0002\u009c\u009b\u0003\u0002\u0002\u0002\u009c\u009d\u0003\u0002\u0002\u0002\u009d\u009e\u0003\u0002\u0002\u0002\u009e\u00a0\u0007\u00e1\u0002\u0002\u009f\u0094\u0003\u0002\u0002\u0002\u009f\u00a0\u0003\u0002\u0002\u0002\u00a0\u01c0\u0003\u0002\u0002\u0002\u00a1\u01c0\u0007\u0024\u0002\u0002\u00a2\u01c0\u0009\u000c\u0002\u0002\u00a3\u01c0\u0007\u0026\u0002\u0002\u00a4\u01c0\u0009\u000d\u0002\u0002\u00a5\u01c0\u0007\u002a\u0002\u0002\u00a6\u01c0\u0009\u000e\u0002\u0002\u00a7\u01c0\u0009\u000f\u0002\u0002\u00a8\u01c0\u0007\u0031\u0002\u0002\u00a9\u01c0\u0007\u0037\u0002\u0002\u00aa\u01c0\u0007\u003a\u0002\u0002\u00ab\u01c0\u0009\u0010\u0002\u0002\u00ac\u01c0\u0009\u0011\u0002\u0002\u00ad\u01c0\u0007\u003f\u0002\u0002\u00ae\u00af\u0009\u0012\u0002\u0002\u00af\u00b0\u0007\u005a\u0002\u0002\u00b0\u00b3\u0009\u0013\u0002\u0002\u00b1\u00b2\u0007\u011c\u0002\u0002\u00b2\u00b4\u0009\u0013\u0002\u0002\u00b3\u00b1\u0003\u0002\u0002\u0002\u00b3\u00b4\u0003\u0002\u0002\u0002\u00b4\u00b5\u0003\u0002\u0002\u0002\u00b5\u01c0\u0007\u00e1\u0002\u0002\u00b6\u00b7\u0007\u0041\u0002\u0002\u00b7\u00b8\u0007\u005a\u0002\u0002\u00b8\u00bb\u0009\u0014\u0002\u0002\u00b9\u00ba\u0007\u011c\u0002\u0002\u00ba\u00bc\u0009\u0015\u0002\u0002\u00bb\u00b9\u0003\u0002\u0002\u0002\u00bb\u00bc\u0003\u0002\u0002\u0002\u00bc\u00bd\u0003\u0002\u0002\u0002\u00bd\u01c0\u0007\u00e1\u0002\u0002\u00be\u01c0\u0007\u0044\u0002\u0002\u00bf\u01c0\u0007\u0045\u0002\u0002\u00c0\u00c1\u0007\u0048\u0002\u0002\u00c1\u00c2\u0007\u005a\u0002\u0002\u00c2\u00c3\u0009\u0016\u0002\u0002\u00c3\u01c0\u0007\u00e1\u0002\u0002\u00c4\u00c5\u0009\u0017\u0002\u0002\u00c5\u00c6\u0007\u005a\u0002\u0002\u00c6\u00c7\u0009\u0018\u0002\u0002\u00c7\u01c0\u0007\u00e1\u0002\u0002\u00c8\u01c0\u0007\u004f\u0002\u0002\u00c9\u01c0\u0007\u0050\u0002\u0002\u00ca\u01c0\u0007\u0051\u0002\u0002\u00cb\u01c0\u0007\u0053\u0002\u0002\u00cc\u00cd\u0009\u0019\u0002\u0002\u00cd\u00ce\u0007\u005a\u0002\u0002\u00ce\u00cf\u0005\u0038\u001d\u0002\u00cf\u00d0\u0007\u00e1\u0002\u0002\u00d0\u01c0\u0003\u0002\u0002\u0002\u00d1\u01c0\u0007\u0055\u0002\u0002\u00d2\u01c0\u0007\u0056\u0002\u0002\u00d3\u01c0\u0007\u005c\u0002\u0002\u00d4\u00d5\u0007\u005d\u0002\u0002\u00d5\u00d6\u0007\u005a\u0002\u0002\u00d6\u00d7\u0005\u0038\u001d\u0002\u00d7\u00d8\u0007\u011c\u0002\u0002\u00d8\u00db\u0005\u0038\u001d\u0002\u00d9\u00da\u0007\u011c\u0002\u0002\u00da\u00dc\u0005\u0038\u001d\u0002\u00db\u00d9\u0003\u0002\u0002\u0002\u00db\u00dc\u0003\u0002\u0002\u0002\u00dc\u00dd\u0003\u0002\u0002\u0002\u00dd\u00de\u0007\u00e1\u0002\u0002\u00de\u01c0\u0003\u0002\u0002\u0002\u00df\u00e3\u0009\u001a\u0002\u0002\u00e0\u00e1\u0007\u005a\u0002\u0002\u00e1\u00e2\u0009\u001b\u0002\u0002\u00e2\u00e4\u0007\u00e1\u0002\u0002\u00e3\u00e0\u0003\u0002\u0002\u0002\u00e3\u00e4\u0003\u0002\u0002\u0002\u00e4\u01c0\u0003\u0002\u0002\u0002\u00e5\u00e9\u0007\u0063\u0002\u0002\u00e6\u00e7\u0007\u005a\u0002\u0002\u00e7\u00e8\u0009\u001c\u0002\u0002\u00e8\u00ea\u0007\u00e1\u0002\u0002\u00e9\u00e6\u0003\u0002\u0002\u0002\u00e9\u00ea\u0003\u0002\u0002\u0002\u00ea\u01c0\u0003\u0002\u0002\u0002\u00eb\u00ec\u0007\u0066\u0002\u0002\u00ec\u00ed\u0007\u005a\u0002\u0002\u00ed\u00ee\u0009\u001d\u0002\u0002\u00ee\u01c0\u0007\u00e1\u0002\u0002\u00ef\u01c0\u0007\u0069\u0002\u0002\u00f0\u01c0\u0007\u006a\u0002\u0002\u00f1\u01c0\u0007\u006c\u0002\u0002\u00f2\u01c0\u0007\u006d\u0002\u0002\u00f3\u01c0\u0007\u006f\u0002\u0002\u00f4\u01c0\u0007\u0070\u0002\u0002\u00f5\u01c0\u0007\u0071\u0002\u0002\u00f6\u00fa\u0009\u001e\u0002\u0002\u00f7\u00f8\u0007\u005a\u0002\u0002\u00f8\u00f9\u0009\u001f\u0002\u0002\u00f9\u00fb\u0007\u00e1\u0002\u0002\u00fa\u00f7\u0003\u0002\u0002\u0002\u00fa\u00fb\u0003\u0002\u0002\u0002\u00fb\u01c0\u0003\u0002\u0002\u0002\u00fc\u01c0\u0007\u0073\u0002\u0002\u00fd\u01c0\u0009\u0020\u0002\u0002\u00fe\u01c0\u0009\u0021\u0002\u0002\u00ff\u01c0\u0007\u0078\u0002\u0002\u0100\u01c0\u0007\u007a\u0002\u0002\u0101\u01c0\u0009\u0022\u0002\u0002\u0102\u01c0\u0007\u007d\u0002\u0002\u0103\u01c0\u0007\u0079\u0002\u0002\u0104\u01c0\u0009\u0023\u0002\u0002\u0105\u01c0\u0009\u0024\u0002\u0002\u0106\u01c0\u0009\u0025\u0002\u0002\u0107\u01c0\u0007\u0084\u0002\u0002\u0108\u01c0\u0007\u0086\u0002\u0002\u0109\u01c0\u0007\u0087\u0002\u0002\u010a\u01c0\u0009\u0026\u0002\u0002\u010b\u01c0\u0009\u0027\u0002\u0002\u010c\u01c0\u0007\u008c\u0002\u0002\u010d\u01c0\u0009\u0028\u0002\u0002\u010e\u01c0\u0007\u008e\u0002\u0002\u010f\u01c0\u0007\u008f\u0002\u0002\u0110\u01c0\u0007\u0091\u0002\u0002\u0111\u01c0\u0007\u0093\u0002\u0002\u0112\u01c0\u0007\u0094\u0002\u0002\u0113\u01c0\u0007\u0095\u0002\u0002\u0114\u01c0\u0007\u0096\u0002\u0002\u0115\u01c0\u0007\u0097\u0002\u0002\u0116\u01c0\u0009\u0029\u0002\u0002\u0117\u01c0\u0007\u009a\u0002\u0002\u0118\u01c0\u0009\u002a\u0002\u0002\u0119\u01c0\u0009\u002b\u0002\u0002\u011a\u01c0\u0009\u002c\u0002\u0002\u011b\u01c0\u0007\u00a1\u0002\u0002\u011c\u01c0\u0009\u002d\u0002\u0002\u011d\u01c0\u0007\u00a4\u0002\u0002\u011e\u01c0\u0007\u00a5\u0002\u0002\u011f\u01c0\u0007\u00a7\u0002\u0002\u0120\u01c0\u0007\u00a8\u0002\u0002\u0121\u01c0\u0009\u002e\u0002\u0002\u0122\u01c0\u0009\u002f\u0002\u0002\u0123\u01c0\u0007\u00ae\u0002\u0002\u0124\u01c0\u0007\u00af\u0002\u0002\u0125\u01c0\u0009\u0030\u0002\u0002\u0126\u01c0\u0009\u0031\u0002\u0002\u0127\u01c0\u0007\u00b4\u0002\u0002\u0128\u01c0\u0009\u0032\u0002\u0002\u0129\u01c0\u0007\u00b8\u0002\u0002\u012a\u01c0\u0007\u00b9\u0002\u0002\u012b\u01c0\u0007\u00bb\u0002\u0002\u012c\u01c0\u0009\u0033\u0002\u0002\u012d\u01c0\u0007\u00c2\u0002\u0002\u012e\u012f\u0009\u0034\u0002\u0002\u012f\u0130\u0007\u005a\u0002\u0002\u0130\u0131\u0009\u0035\u0002\u0002\u0131\u01c0\u0007\u00e1\u0002\u0002\u0132\u01c0\u0007\u00bb\u0002\u0002\u0133\u01c0\u0009\u0036\u0002\u0002\u0134\u01c0\u0007\u00c0\u0002\u0002\u0135\u01c0\u0009\u0037\u0002\u0002\u0136\u0137\u0007\u00c6\u0002\u0002\u0137\u0138\u0007\u005a\u0002\u0002\u0138\u0139\u0009\u0038\u0002\u0002\u0139\u01c0\u0007\u00e1\u0002\u0002\u013a\u01c0\u0009\u0039\u0002\u0002\u013b\u01c0\u0009\u003a\u0002\u0002\u013c\u013d\u0007\u00ce\u0002\u0002\u013d\u013e\u0007\u005a\u0002\u0002\u013e\u013f\u0005\u0038\u001d\u0002\u013f\u0140\u0007\u011c\u0002\u0002\u0140\u0143\u0005\u0038\u001d\u0002\u0141\u0142\u0007\u011c\u0002\u0002\u0142\u0144\u0005\u0038\u001d\u0002\u0143\u0141\u0003\u0002\u0002\u0002\u0143\u0144\u0003\u0002\u0002\u0002\u0144\u0145\u0003\u0002\u0002\u0002\u0145\u0146\u0007\u00e1\u0002\u0002\u0146\u01c0\u0003\u0002\u0002\u0002\u0147\u0148\u0007\u00cf\u0002\u0002\u0148\u0149\u0007\u005a\u0002\u0002\u0149\u014a\u0005\u0038\u001d\u0002\u014a\u014b\u0007\u011c\u0002\u0002\u014b\u014c\u0005\u0038\u001d\u0002\u014c\u014d\u0007\u00e1\u0002\u0002\u014d\u01c0\u0003\u0002\u0002\u0002\u014e\u0152\u0009\u003b\u0002\u0002\u014f\u0150\u0007\u005a\u0002\u0002\u0150\u0151\u0009\u003c\u0002\u0002\u0151\u0153\u0007\u00e1\u0002\u0002\u0152\u014f\u0003\u0002\u0002\u0002\u0152\u0153\u0003\u0002\u0002\u0002\u0153\u01c0\u0003\u0002\u0002\u0002\u0154\u01c0\u0007\u00d1\u0002\u0002\u0155\u01c0\u0007\u00d3\u0002\u0002\u0156\u01c0\u0007\u00cd\u0002\u0002\u0157\u0158\u0009\u003d\u0002\u0002\u0158\u0159\u0007\u005a\u0002\u0002\u0159\u015a\u0005\u0036\u001c\u0002\u015a\u015b\u0007\u00e1\u0002\u0002\u015b\u01c0\u0003\u0002\u0002\u0002\u015c\u015d\u0009\u003e\u0002\u0002\u015d\u015e\u0007\u005a\u0002\u0002\u015e\u015f\u0009\u003f\u0002\u0002\u015f\u01c0\u0007\u00e1\u0002\u0002\u0160\u01c0\u0007\u00db\u0002\u0002\u0161\u01c0\u0009\u0040\u0002\u0002\u0162\u01c0\u0007\u00dd\u0002\u0002\u0163\u0164\u0007\u00e0\u0002\u0002\u0164\u0168\u0007\u005a\u0002\u0002\u0165\u0169\u0007\u0007\u0002\u0002\u0166\u0169\u0007\u000b\u0002\u0002\u0167\u0169\u0005\u0038\u001d\u0002\u0168\u0165\u0003\u0002\u0002\u0002\u0168\u0166\u0003\u0002\u0002\u0002\u0168\u0167\u0003\u0002\u0002\u0002\u0169\u016a\u0003\u0002\u0002\u0002\u016a\u01c0\u0007\u00e1\u0002\u0002\u016b\u0172\u0009\u0041\u0002\u0002\u016c\u016d\u0007\u005a\u0002\u0002\u016d\u016e\u0005\u0038\u001d\u0002\u016e\u016f\u0007\u011c\u0002\u0002\u016f\u0170\u0005\u0038\u001d\u0002\u0170\u0171\u0007\u00e1\u0002\u0002\u0171\u0173\u0003\u0002\u0002\u0002\u0172\u016c\u0003\u0002\u0002\u0002\u0172\u0173\u0003\u0002\u0002\u0002\u0173\u01c0\u0003\u0002\u0002\u0002\u0174\u0175\u0009\u0042\u0002\u0002\u0175\u0178\u0007\u005a\u0002\u0002\u0176\u0179\u0007\u005e\u0002\u0002\u0177\u0179\u0005\u0038\u001d\u0002\u0178\u0176\u0003\u0002\u0002\u0002\u0178\u0177\u0003\u0002\u0002\u0002\u0179\u017a\u0003\u0002\u0002\u0002\u017a\u01c0\u0007\u00e1\u0002\u0002\u017b\u01c0\u0009\u0043\u0002\u0002\u017c\u01c0\u0007\u00e9\u0002\u0002\u017d\u017e\u0007\u00ea\u0002\u0002\u017e\u017f\u0007\u005a\u0002\u0002\u017f\u0180\u0005\u0038\u001d\u0002\u0180\u0181\u0007\u00e1\u0002\u0002\u0181\u01c0\u0003\u0002\u0002\u0002\u0182\u01c0\u0007\u00eb\u0002\u0002\u0183\u0188\u0007\u00ec\u0002\u0002\u0184\u0185\u0007\u005a\u0002\u0002\u0185\u0186\u0005\u0038\u001d\u0002\u0186\u0187\u0007\u00e1\u0002\u0002\u0187\u0189\u0003\u0002\u0002\u0002\u0188\u0184\u0003\u0002\u0002\u0002\u0188\u0189\u0003\u0002\u0002\u0002\u0189\u01c0\u0003\u0002\u0002\u0002\u018a\u01c0\u0009\u0044\u0002\u0002\u018b\u01c0\u0009\u0045\u0002\u0002\u018c\u01c0\u0007\u00f8\u0002\u0002\u018d\u01c0\u0009\u0046\u0002\u0002\u018e\u01a0\u0007\u00fc\u0002\u0002\u018f\u0191\u0007\u005a\u0002\u0002\u0190\u0192\u0009\u0047\u0002\u0002\u0191\u0190\u0003\u0002\u0002\u0002\u0191\u0192\u0003\u0002\u0002\u0002\u0192\u0194\u0003\u0002\u0002\u0002\u0193\u0195\u0007\u011c\u0002\u0002\u0194\u0193\u0003\u0002\u0002\u0002\u0194\u0195\u0003\u0002\u0002\u0002\u0195\u0197\u0003\u0002\u0002\u0002\u0196\u0198\u0009\u0048\u0002\u0002\u0197\u0196\u0003\u0002\u0002\u0002\u0197\u0198\u0003\u0002\u0002\u0002\u0198\u019a\u0003\u0002\u0002\u0002\u0199\u019b\u0007\u011c\u0002\u0002\u019a\u0199\u0003\u0002\u0002\u0002\u019a\u019b\u0003\u0002\u0002\u0002\u019b\u019d\u0003\u0002\u0002\u0002\u019c\u019e\u0009\u0049\u0002\u0002\u019d\u019c\u0003\u0002\u0002\u0002\u019d\u019e\u0003\u0002\u0002\u0002\u019e\u019f\u0003\u0002\u0002\u0002\u019f\u01a1\u0007\u00e1\u0002\u0002\u01a0\u018f\u0003\u0002\u0002\u0002\u01a0\u01a1\u0003\u0002\u0002\u0002\u01a1\u01c0\u0003\u0002\u0002\u0002\u01a2\u01c0\u0007\u00fd\u0002\u0002\u01a3\u01a4\u0007\u0100\u0002\u0002\u01a4\u01a5\u0007\u005a\u0002\u0002\u01a5\u01a6\u0009\u004a\u0002\u0002\u01a6\u01c0\u0007\u00e1\u0002\u0002\u01a7\u01c0\u0007\u0103\u0002\u0002\u01a8\u01a9\u0009\u004b\u0002\u0002\u01a9\u01aa\u0007\u005a\u0002\u0002\u01aa\u01ab\u0005\u0036\u001c\u0002\u01ab\u01ac\u0007\u00e1\u0002\u0002\u01ac\u01c0\u0003\u0002\u0002\u0002\u01ad\u01ae\u0009\u004c\u0002\u0002\u01ae\u01af\u0007\u005a\u0002\u0002\u01af\u01b0\u0009\u004d\u0002\u0002\u01b0\u01c0\u0007\u00e1\u0002\u0002\u01b1\u01b7\u0009\u004e\u0002\u0002\u01b2\u01b4\u0007\u005a\u0002\u0002\u01b3\u01b5\u0009\u004f\u0002\u0002\u01b4\u01b3\u0003\u0002\u0002\u0002\u01b4\u01b5\u0003\u0002\u0002\u0002\u01b5\u01b6\u0003\u0002\u0002\u0002\u01b6\u01b8\u0007\u00e1\u0002\u0002\u01b7\u01b2\u0003\u0002\u0002\u0002\u01b7\u01b8\u0003\u0002\u0002\u0002\u01b8\u01c0\u0003\u0002\u0002\u0002\u01b9\u01ba\u0009\u0050\u0002\u0002\u01ba\u01bb\u0007\u005a\u0002\u0002\u01bb\u01bc\u0005\u0038\u001d\u0002\u01bc\u01bd\u0007\u00e1\u0002\u0002\u01bd\u01c0\u0003\u0002\u0002\u0002\u01be\u01c0\u0007\u010d\u0002\u0002\u01bf\u0069\u0003\u0002\u0002\u0002\u01bf\u006a\u0003\u0002\u0002\u0002\u01bf\u006b\u0003\u0002\u0002\u0002\u01bf\u006c\u0003\u0002\u0002\u0002\u01bf\u0070\u0003\u0002\u0002\u0002\u01bf\u0071\u0003\u0002\u0002\u0002\u01bf\u0072\u0003\u0002\u0002\u0002\u01bf\u0077\u0003\u0002\u0002\u0002\u01bf\u0078\u0003\u0002\u0002\u0002\u01bf\u007f\u0003\u0002\u0002\u0002\u01bf\u0080\u0003\u0002\u0002\u0002\u01bf\u0081\u0003\u0002\u0002\u0002\u01bf\u0086\u0003\u0002\u0002\u0002\u01bf\u0087\u0003\u0002\u0002\u0002\u01bf\u0088\u0003\u0002\u0002\u0002\u01bf\u0089\u0003\u0002\u0002\u0002\u01bf\u008e\u0003\u0002\u0002\u0002\u01bf\u0093\u0003\u0002\u0002\u0002\u01bf\u00a1\u0003\u0002\u0002\u0002\u01bf\u00a2\u0003\u0002\u0002\u0002\u01bf\u00a3\u0003\u0002\u0002\u0002\u01bf\u00a4\u0003\u0002\u0002\u0002\u01bf\u00a5\u0003\u0002\u0002\u0002\u01bf\u00a6\u0003\u0002\u0002\u0002\u01bf\u00a7\u0003\u0002\u0002\u0002\u01bf\u00a8\u0003\u0002\u0002\u0002\u01bf\u00a9\u0003\u0002\u0002\u0002\u01bf\u00aa\u0003\u0002\u0002\u0002\u01bf\u00ab\u0003\u0002\u0002\u0002\u01bf\u00ac\u0003\u0002\u0002\u0002\u01bf\u00ad\u0003\u0002\u0002\u0002\u01bf\u00ae\u0003\u0002\u0002\u0002\u01bf\u00b6\u0003\u0002\u0002\u0002\u01bf\u00be\u0003\u0002\u0002\u0002\u01bf\u00bf\u0003\u0002\u0002\u0002\u01bf\u00c0\u0003\u0002\u0002\u0002\u01bf\u00c4\u0003\u0002\u0002\u0002\u01bf\u00c8\u0003\u0002\u0002\u0002\u01bf\u00c9\u0003\u0002\u0002\u0002\u01bf\u00ca\u0003\u0002\u0002\u0002\u01bf\u00cb\u0003\u0002\u0002\u0002\u01bf\u00cc\u0003\u0002\u0002\u0002\u01bf\u00d1\u0003\u0002\u0002\u0002\u01bf\u00d2\u0003\u0002\u0002\u0002\u01bf\u00d3\u0003\u0002\u0002\u0002\u01bf\u00d4\u0003\u0002\u0002\u0002\u01bf\u00df\u0003\u0002\u0002\u0002\u01bf\u00e5\u0003\u0002\u0002\u0002\u01bf\u00eb\u0003\u0002\u0002\u0002\u01bf\u00ef\u0003\u0002\u0002\u0002\u01bf\u00f0\u0003\u0002\u0002\u0002\u01bf\u00f1\u0003\u0002\u0002\u0002\u01bf\u00f2\u0003\u0002\u0002\u0002\u01bf\u00f3\u0003\u0002\u0002\u0002\u01bf\u00f4\u0003\u0002\u0002\u0002\u01bf\u00f5\u0003\u0002\u0002\u0002\u01bf\u00f6\u0003\u0002\u0002\u0002\u01bf\u00fc\u0003\u0002\u0002\u0002\u01bf\u00fd\u0003\u0002\u0002\u0002\u01bf\u00fe\u0003\u0002\u0002\u0002\u01bf\u00ff\u0003\u0002\u0002\u0002\u01bf\u0100\u0003\u0002\u0002\u0002\u01bf\u0101\u0003\u0002\u0002\u0002\u01bf\u0102\u0003\u0002\u0002\u0002\u01bf\u0103\u0003\u0002\u0002\u0002\u01bf\u0104\u0003\u0002\u0002\u0002\u01bf\u0105\u0003\u0002\u0002\u0002\u01bf\u0106\u0003\u0002\u0002\u0002\u01bf\u0107\u0003\u0002\u0002\u0002\u01bf\u0108\u0003\u0002\u0002\u0002\u01bf\u0109\u0003\u0002\u0002\u0002\u01bf\u010a\u0003\u0002\u0002\u0002\u01bf\u010b\u0003\u0002\u0002\u0002\u01bf\u010c\u0003\u0002\u0002\u0002\u01bf\u010d\u0003\u0002\u0002\u0002\u01bf\u010e\u0003\u0002\u0002\u0002\u01bf\u010f\u0003\u0002\u0002\u0002\u01bf\u0110\u0003\u0002\u0002\u0002\u01bf\u0111\u0003\u0002\u0002\u0002\u01bf\u0112\u0003\u0002\u0002\u0002\u01bf\u0113\u0003\u0002\u0002\u0002\u01bf\u0114\u0003\u0002\u0002\u0002\u01bf\u0115\u0003\u0002\u0002\u0002\u01bf\u0116\u0003\u0002\u0002\u0002\u01bf\u0117\u0003\u0002\u0002\u0002\u01bf\u0118\u0003\u0002\u0002\u0002\u01bf\u0119\u0003\u0002\u0002\u0002\u01bf\u011a\u0003\u0002\u0002\u0002\u01bf\u011b\u0003\u0002\u0002\u0002\u01bf\u011c\u0003\u0002\u0002\u0002\u01bf\u011d\u0003\u0002\u0002\u0002\u01bf\u011e\u0003\u0002\u0002\u0002\u01bf\u011f\u0003\u0002\u0002\u0002\u01bf\u0120\u0003\u0002\u0002\u0002\u01bf\u0121\u0003\u0002\u0002\u0002\u01bf\u0122\u0003\u0002\u0002\u0002\u01bf\u0123\u0003\u0002\u0002\u0002\u01bf\u0124\u0003\u0002\u0002\u0002\u01bf\u0125\u0003\u0002\u0002\u0002\u01bf\u0126\u0003\u0002\u0002\u0002\u01bf\u0127\u0003\u0002\u0002\u0002\u01bf\u0128\u0003\u0002\u0002\u0002\u01bf\u0129\u0003\u0002\u0002\u0002\u01bf\u012a\u0003\u0002\u0002\u0002\u01bf\u012b\u0003\u0002\u0002\u0002\u01bf\u012c\u0003\u0002\u0002\u0002\u01bf\u012d\u0003\u0002\u0002\u0002\u01bf\u012e\u0003\u0002\u0002\u0002\u01bf\u0132\u0003\u0002\u0002\u0002\u01bf\u0133\u0003\u0002\u0002\u0002\u01bf\u0134\u0003\u0002\u0002\u0002\u01bf\u0135\u0003\u0002\u0002\u0002\u01bf\u0136\u0003\u0002\u0002\u0002\u01bf\u013a\u0003\u0002\u0002\u0002\u01bf\u013b\u0003\u0002\u0002\u0002\u01bf\u013c\u0003\u0002\u0002\u0002\u01bf\u0147\u0003\u0002\u0002\u0002\u01bf\u014e\u0003\u0002\u0002\u0002\u01bf\u0154\u0003\u0002\u0002\u0002\u01bf\u0155\u0003\u0002\u0002\u0002\u01bf\u0156\u0003\u0002\u0002\u0002\u01bf\u0157\u0003\u0002\u0002\u0002\u01bf\u015c\u0003\u0002\u0002\u0002\u01bf\u0160\u0003\u0002\u0002\u0002\u01bf\u0161\u0003\u0002\u0002\u0002\u01bf\u0162\u0003\u0002\u0002\u0002\u01bf\u0163\u0003\u0002\u0002\u0002\u01bf\u016b\u0003\u0002\u0002\u0002\u01bf\u0174\u0003\u0002\u0002\u0002\u01bf\u017b\u0003\u0002\u0002\u0002\u01bf\u017c\u0003\u0002\u0002\u0002\u01bf\u017d\u0003\u0002\u0002\u0002\u01bf\u0182\u0003\u0002\u0002\u0002\u01bf\u0183\u0003\u0002\u0002\u0002\u01bf\u018a\u0003\u0002\u0002\u0002\u01bf\u018b\u0003\u0002\u0002\u0002\u01bf\u018c\u0003\u0002\u0002\u0002\u01bf\u018d\u0003\u0002\u0002\u0002\u01bf\u018e\u0003\u0002\u0002\u0002\u01bf\u01a2\u0003\u0002\u0002\u0002\u01bf\u01a3\u0003\u0002\u0002\u0002\u01bf\u01a7\u0003\u0002\u0002\u0002\u01bf\u01a8\u0003\u0002\u0002\u0002\u01bf\u01ad\u0003\u0002\u0002\u0002\u01bf\u01b1\u0003\u0002\u0002\u0002\u01bf\u01b9\u0003\u0002\u0002\u0002\u01bf\u01be\u0003\u0002\u0002\u0002\u01c0\u0009\u0003\u0002\u0002\u0002\u01c1\u01c2\u0007\u0039\u0002\u0002\u01c2\u01c3\u0007\u0014\u0002\u0002\u01c3\u01c4\u0005\u0030\u0019\u0002\u01c4\u01c6\u0007\u0036\u0002\u0002\u01c5\u01c7\u0007\u011d\u0002\u0002\u01c6\u01c5\u0003\u0002\u0002\u0002\u01c6\u01c7\u0003\u0002\u0002\u0002\u01c7\u000b\u0003\u0002\u0002\u0002\u01c8\u01c9\u0007\u0039\u0002\u0002\u01c9\u01ca\u0007\u00ec\u0002\u0002\u01ca\u01cb\u0005\u0032\u001a\u0002\u01cb\u01cd\u0007\u0036\u0002\u0002\u01cc\u01ce\u0007\u011d\u0002\u0002\u01cd\u01cc\u0003\u0002\u0002\u0002\u01cd\u01ce\u0003\u0002\u0002\u0002\u01ce\u000d\u0003\u0002\u0002\u0002\u01cf\u01d0\u0007\u0039\u0002\u0002\u01d0\u01d1\u0007\u00ef\u0002\u0002\u01d1\u01d2\u0005\u0030\u0019\u0002\u01d2\u01d4\u0007\u0036\u0002\u0002\u01d3\u01d5\u0007\u011d\u0002\u0002\u01d4\u01d3\u0003\u0002\u0002\u0002\u01d4\u01d5\u0003\u0002\u0002\u0002\u01d5\u000f\u0003\u0002\u0002\u0002\u01d6\u01d7\u0007\u001b\u0002\u0002\u01d7\u01e6\u0005\u0012\u000a\u0002\u01d8\u01da\u0007\u0123\u0002\u0002\u01d9\u01d8\u0003\u0002\u0002\u0002\u01da\u01dd\u0003\u0002\u0002\u0002\u01db\u01d9\u0003\u0002\u0002\u0002\u01db\u01dc\u0003\u0002\u0002\u0002\u01dc\u01e2\u0003\u0002\u0002\u0002\u01dd\u01db\u0003\u0002\u0002\u0002\u01de\u01e3\u0005\u0020\u0011\u0002\u01df\u01e3\u0005\u0022\u0012\u0002\u01e0\u01e3\u0005\u0016\u000c\u0002\u01e1\u01e3\u0007\u00f7\u0002\u0002\u01e2\u01de\u0003\u0002\u0002\u0002\u01e2\u01df\u0003\u0002\u0002\u0002\u01e2\u01e0\u0003\u0002\u0002\u0002\u01e2\u01e1\u0003\u0002\u0002\u0002\u01e3\u01e5\u0003\u0002\u0002\u0002\u01e4\u01db\u0003\u0002\u0002\u0002\u01e5\u01e8\u0003\u0002\u0002\u0002\u01e6\u01e4\u0003\u0002\u0002\u0002\u01e6\u01e7\u0003\u0002\u0002\u0002\u01e7\u01ec\u0003\u0002\u0002\u0002\u01e8\u01e6\u0003\u0002\u0002\u0002\u01e9\u01eb\u0007\u0123\u0002\u0002\u01ea\u01e9\u0003\u0002\u0002\u0002\u01eb\u01ee\u0003\u0002\u0002\u0002\u01ec\u01ea\u0003\u0002\u0002\u0002\u01ec\u01ed\u0003\u0002\u0002\u0002\u01ed\u01ef\u0003\u0002\u0002\u0002\u01ee\u01ec\u0003\u0002\u0002\u0002\u01ef\u01f0\u0007\u011d\u0002\u0002\u01f0\u0011\u0003\u0002\u0002\u0002\u01f1\u01f5\u0005\u0038\u001d\u0002\u01f2\u01f5\u0005\u0036\u001c\u0002\u01f3\u01f5\u0005\u003a\u001e\u0002\u01f4\u01f1\u0003\u0002\u0002\u0002\u01f4\u01f2\u0003\u0002\u0002\u0002\u01f4\u01f3\u0003\u0002\u0002\u0002\u01f5\u01f8\u0003\u0002\u0002\u0002\u01f6\u01f7\u0009\u0051\u0002\u0002\u01f7\u01f9\u0005\u0014\u000b\u0002\u01f8\u01f6\u0003\u0002\u0002\u0002\u01f8\u01f9\u0003\u0002\u0002\u0002\u01f9\u0013\u0003\u0002\u0002\u0002\u01fa\u01fd\u0005\u0038\u001d\u0002\u01fb\u01fd\u0005\u0036\u001c\u0002\u01fc\u01fa\u0003\u0002\u0002\u0002\u01fc\u01fb\u0003\u0002\u0002\u0002\u01fd\u0015\u0003\u0002\u0002\u0002\u01fe\u0202\u0007\u00df\u0002\u0002\u01ff\u0201\u0007\u0123\u0002\u0002\u0200\u01ff\u0003\u0002\u0002\u0002\u0201\u0204\u0003\u0002\u0002\u0002\u0202\u0200\u0003\u0002\u0002\u0002\u0202\u0203\u0003\u0002\u0002\u0002\u0203\u0205\u0003\u0002\u0002\u0002\u0204\u0202\u0003\u0002\u0002\u0002\u0205\u020e\u0005\u001e\u0010\u0002\u0206\u0208\u0007\u0123\u0002\u0002\u0207\u0206\u0003\u0002\u0002\u0002\u0208\u0209\u0003\u0002\u0002\u0002\u0209\u0207\u0003\u0002\u0002\u0002\u0209\u020a\u0003\u0002\u0002\u0002\u020a\u020b\u0003\u0002\u0002\u0002\u020b\u020d\u0005\u001e\u0010\u0002\u020c\u0207\u0003\u0002\u0002\u0002\u020d\u0210\u0003\u0002\u0002\u0002\u020e\u020c\u0003\u0002\u0002\u0002\u020e\u020f\u0003\u0002\u0002\u0002\u020f\u0017\u0003\u0002\u0002\u0002\u0210\u020e\u0003\u0002\u0002\u0002\u0211\u0216\u0005\u001a\u000e\u0002\u0212\u0215\u0005\u0010\u0009\u0002\u0213\u0215\u0005\u0030\u0019\u0002\u0214\u0212\u0003\u0002\u0002\u0002\u0214\u0213\u0003\u0002\u0002\u0002\u0215\u0218\u0003\u0002\u0002\u0002\u0216\u0214\u0003\u0002\u0002\u0002\u0216\u0217\u0003\u0002\u0002\u0002\u0217\u021a\u0003\u0002\u0002\u0002\u0218\u0216\u0003\u0002\u0002\u0002\u0219\u021b\u0005\u001c\u000f\u0002\u021a\u0219\u0003\u0002\u0002\u0002\u021a\u021b\u0003\u0002\u0002\u0002\u021b\u0019\u0003\u0002\u0002\u0002\u021c\u0224\u0007\u00de\u0002\u0002\u021d\u021f\u0007\u0123\u0002\u0002\u021e\u021d\u0003\u0002\u0002\u0002\u021f\u0222\u0003\u0002\u0002\u0002\u0220\u021e\u0003\u0002\u0002\u0002\u0220\u0221\u0003\u0002\u0002\u0002\u0221\u0223\u0003\u0002\u0002\u0002\u0222\u0220\u0003\u0002\u0002\u0002\u0223\u0225\u0005\u001e\u0010\u0002\u0224\u0220\u0003\u0002\u0002\u0002\u0225\u0226\u0003\u0002\u0002\u0002\u0226\u0224\u0003\u0002\u0002\u0002\u0226\u0227\u0003\u0002\u0002\u0002\u0227\u0228\u0003\u0002\u0002\u0002\u0228\u0229\u0007\u011d\u0002\u0002\u0229\u001b\u0003\u0002\u0002\u0002\u022a\u022b\u0007\u00de\u0002\u0002\u022b\u022c\u0007\u00ca\u0002\u0002\u022c\u022d\u0007\u011d\u0002\u0002\u022d\u001d\u0003\u0002\u0002\u0002\u022e\u0232\u0005\u0024\u0013\u0002\u022f\u0231\u0007\u0123\u0002\u0002\u0230\u022f\u0003\u0002\u0002\u0002\u0231\u0234\u0003\u0002\u0002\u0002\u0232\u0230\u0003\u0002\u0002\u0002\u0232\u0233\u0003\u0002\u0002\u0002\u0233\u0235\u0003\u0002\u0002\u0002\u0234\u0232\u0003\u0002\u0002\u0002\u0235\u0239\u0007\u0011\u0002\u0002\u0236\u0238\u0007\u0123\u0002\u0002\u0237\u0236\u0003\u0002\u0002\u0002\u0238\u023b\u0003\u0002\u0002\u0002\u0239\u0237\u0003\u0002\u0002\u0002\u0239\u023a\u0003\u0002\u0002\u0002\u023a\u023c\u0003\u0002\u0002\u0002\u023b\u0239\u0003\u0002\u0002\u0002\u023c\u0244\u0005\u0026\u0014\u0002\u023d\u023f\u0007\u0123\u0002\u0002\u023e\u023d\u0003\u0002\u0002\u0002\u023f\u0242\u0003\u0002\u0002\u0002\u0240\u023e\u0003\u0002\u0002\u0002\u0240\u0241\u0003\u0002\u0002\u0002\u0241\u0243\u0003\u0002\u0002\u0002\u0242\u0240\u0003\u0002\u0002\u0002\u0243\u0245\u0005\u0020\u0011\u0002\u0244\u0240\u0003\u0002\u0002\u0002\u0244\u0245\u0003\u0002\u0002\u0002\u0245\u024d\u0003\u0002\u0002\u0002\u0246\u0248\u0007\u0123\u0002\u0002\u0247\u0246\u0003\u0002\u0002\u0002\u0248\u024b\u0003\u0002\u0002\u0002\u0249\u0247\u0003\u0002\u0002\u0002\u0249\u024a\u0003\u0002\u0002\u0002\u024a\u024c\u0003\u0002\u0002\u0002\u024b\u0249\u0003\u0002\u0002\u0002\u024c\u024e\u0005\u0022\u0012\u0002\u024d\u0249\u0003\u0002\u0002\u0002\u024d\u024e\u0003\u0002\u0002\u0002\u024e\u001f\u0003\u0002\u0002\u0002\u024f\u0253\u0009\u0051\u0002\u0002\u0250\u0252\u0007\u0123\u0002\u0002\u0251\u0250\u0003\u0002\u0002\u0002\u0252\u0255\u0003\u0002\u0002\u0002\u0253\u0251\u0003\u0002\u0002\u0002\u0253\u0254\u0003\u0002\u0002\u0002\u0254\u0258\u0003\u0002\u0002\u0002\u0255\u0253\u0003\u0002\u0002\u0002\u0256\u0259\u0005\u0038\u001d\u0002\u0257\u0259\u0005\u0036\u001c\u0002\u0258\u0256\u0003\u0002\u0002\u0002\u0258\u0257\u0003\u0002\u0002\u0002\u0259\u0021\u0003\u0002\u0002\u0002\u025a\u025e\u0007\u00cc\u0002\u0002\u025b\u025d\u0007\u0123\u0002\u0002\u025c\u025b\u0003\u0002\u0002\u0002\u025d\u0260\u0003\u0002\u0002\u0002\u025e\u025c\u0003\u0002\u0002\u0002\u025e\u025f\u0003\u0002\u0002\u0002\u025f\u0263\u0003\u0002\u0002\u0002\u0260\u025e\u0003\u0002\u0002\u0002\u0261\u0264\u0005\u0038\u001d\u0002\u0262\u0264\u0005\u0036\u001c\u0002\u0263\u0261\u0003\u0002\u0002\u0002\u0263\u0262\u0003\u0002\u0002\u0002\u0264\u0023\u0003\u0002\u0002\u0002\u0265\u026a\u0005\u0038\u001d\u0002\u0266\u026a\u0005\u0036\u001c\u0002\u0267\u026a\u0005\u002e\u0018\u0002\u0268\u026a\u0005\u0034\u001b\u0002\u0269\u0265\u0003\u0002\u0002\u0002\u0269\u0266\u0003\u0002\u0002\u0002\u0269\u0267\u0003\u0002\u0002\u0002\u0269\u0268\u0003\u0002\u0002\u0002\u026a\u0025\u0003\u0002\u0002\u0002\u026b\u0270\u0005\u0038\u001d\u0002\u026c\u0270\u0005\u0036\u001c\u0002\u026d\u0270\u0005\u002e\u0018\u0002\u026e\u0270\u0005\u0034\u001b\u0002\u026f\u026b\u0003\u0002\u0002\u0002\u026f\u026c\u0003\u0002\u0002\u0002\u026f\u026d\u0003\u0002\u0002\u0002\u026f\u026e\u0003\u0002\u0002\u0002\u0270\u0027\u0003\u0002\u0002\u0002\u0271\u0273\u0007\u0032\u0002\u0002\u0272\u0274\u0007\u011d\u0002\u0002\u0273\u0272\u0003\u0002\u0002\u0002\u0273\u0274\u0003\u0002\u0002\u0002\u0274\u0029\u0003\u0002\u0002\u0002\u0275\u0277\u0009\u0052\u0002\u0002\u0276\u0278\u0007\u011d\u0002\u0002\u0277\u0276\u0003\u0002\u0002\u0002\u0277\u0278\u0003\u0002\u0002\u0002\u0278\u002b\u0003\u0002\u0002\u0002\u0279\u027a\u0007\u00fe\u0002\u0002\u027a\u027c\u0005\u0038\u001d\u0002\u027b\u027d\u0007\u011d\u0002\u0002\u027c\u027b\u0003\u0002\u0002\u0002\u027c\u027d\u0003\u0002\u0002\u0002\u027d\u002d\u0003\u0002\u0002\u0002\u027e\u0280\u0007\u011e\u0002\u0002\u027f\u0281\u0005\u0030\u0019\u0002\u0280\u027f\u0003\u0002\u0002\u0002\u0280\u0281\u0003\u0002\u0002\u0002\u0281\u0282\u0003\u0002\u0002\u0002\u0282\u0283\u0007\u011e\u0002\u0002\u0283\u002f\u0003\u0002\u0002\u0002\u0284\u0287\u0005\u0034\u001b\u0002\u0285\u0287\u0007\u0123\u0002\u0002\u0286\u0284\u0003\u0002\u0002\u0002\u0286\u0285\u0003\u0002\u0002\u0002\u0287\u0288\u0003\u0002\u0002\u0002\u0288\u0286\u0003\u0002\u0002\u0002\u0288\u0289\u0003\u0002\u0002\u0002\u0289\u0031\u0003\u0002\u0002\u0002\u028a\u028f\u0005\u0034\u001b\u0002\u028b\u028f\u0007\u001b\u0002\u0002\u028c\u028f\u0007\u00de\u0002\u0002\u028d\u028f\u0007\u0123\u0002\u0002\u028e\u028a\u0003\u0002\u0002\u0002\u028e\u028b\u0003\u0002\u0002\u0002\u028e\u028c\u0003\u0002\u0002\u0002\u028e\u028d\u0003\u0002\u0002\u0002\u028f\u0290\u0003\u0002\u0002\u0002\u0290\u028e\u0003\u0002\u0002\u0002\u0290\u0291\u0003\u0002\u0002\u0002\u0291\u0033\u0003\u0002\u0002\u0002\u0292\u029a\u0005\u0036\u001c\u0002\u0293\u029a\u0005\u0038\u001d\u0002\u0294\u029a\u0005\u003a\u001e\u0002\u0295\u029a\u0007\u0126\u0002\u0002\u0296\u029a\u0007\u011d\u0002\u0002\u0297\u029a\u0007\u005a\u0002\u0002\u0298\u029a\u0007\u00e1\u0002\u0002\u0299\u0292\u0003\u0002\u0002\u0002\u0299\u0293\u0003\u0002\u0002\u0002\u0299\u0294\u0003\u0002\u0002\u0002\u0299\u0295\u0003\u0002\u0002\u0002\u0299\u0296\u0003\u0002\u0002\u0002\u0299\u0297\u0003\u0002\u0002\u0002\u0299\u0298\u0003\u0002\u0002\u0002\u029a\u029b\u0003\u0002\u0002\u0002\u029b\u0299\u0003\u0002\u0002\u0002\u029b\u029c\u0003\u0002\u0002\u0002\u029c\u0035\u0003\u0002\u0002\u0002\u029d\u02a0\u0007\u0121\u0002\u0002\u029e\u02a0\u0005\u003c\u001f\u0002\u029f\u029d\u0003\u0002\u0002\u0002\u029f\u029e\u0003\u0002\u0002\u0002\u02a0\u0037\u0003\u0002\u0002\u0002\u02a1\u02a2\u0009\u0053\u0002\u0002\u02a2\u0039\u0003\u0002\u0002\u0002\u02a3\u02a4\u0007\u0122\u0002\u0002\u02a4\u003b\u0003\u0002\u0002\u0002\u02a5\u02a6\u0009\u0054\u0002\u0002\u02a6\u003d\u0003\u0002\u0002\u0002\u004c\u004a\u004c\u0053\u0057\u0059\u005f\u0064\u007d\u0096\u0099\u009c\u009f\u00b3\u00bb\u00db\u00e3\u00e9\u00fa\u0143\u0152\u0168\u0172\u0178\u0188\u0191\u0194\u0197\u019a\u019d\u01a0\u01b4\u01b7\u01bf\u01c6\u01cd\u01d4\u01db\u01e2\u01e6\u01ec\u01f4\u01f8\u01fc\u0202\u0209\u020e\u0214\u0216\u021a\u0220\u0226\u0232\u0239\u0240\u0244\u0249\u024d\u0253\u0258\u025e\u0263\u0269\u026f\u0273\u0277\u027c\u0280\u0286\u0288\u028e\u0290\u0299\u029b\u029f"

        val ATN = ATNDeserializer().deserialize(serializedATN.toCharArray())
        init {
        	decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
        		DFA(ATN.getDecisionState(it)!!, it)
        	})


        }
	}

    private val ADATA = Tokens.ADATA.id
    private val ADV = Tokens.ADV.id
    private val ALIAS = Tokens.ALIAS.id
    private val ANSI = Tokens.ANSI.id
    private val ANY = Tokens.ANY.id
    private val APOST = Tokens.APOST.id
    private val AR = Tokens.AR.id
    private val ARITH = Tokens.ARITH.id
    private val AUTO = Tokens.AUTO.id
    private val AWO = Tokens.AWO.id
    private val BIN = Tokens.BIN.id
    private val BLOCK0 = Tokens.BLOCK0.id
    private val BUF = Tokens.BUF.id
    private val BUFSIZE = Tokens.BUFSIZE.id
    private val BY = Tokens.BY.id
    private val CBL = Tokens.CBL.id
    private val CBLCARD = Tokens.CBLCARD.id
    private val CICS = Tokens.CICS.id
    private val CO = Tokens.CO.id
    private val COBOL2 = Tokens.COBOL2.id
    private val COBOL3 = Tokens.COBOL3.id
    private val CODEPAGE = Tokens.CODEPAGE.id
    private val COMPAT = Tokens.COMPAT.id
    private val COMPILE = Tokens.COMPILE.id
    private val COPY = Tokens.COPY.id
    private val CP = Tokens.CP.id
    private val CPP = Tokens.CPP.id
    private val CPSM = Tokens.CPSM.id
    private val CS = Tokens.CS.id
    private val CURR = Tokens.CURR.id
    private val CURRENCY = Tokens.CURRENCY.id
    private val DATA = Tokens.DATA.id
    private val DATEPROC = Tokens.DATEPROC.id
    private val DBCS = Tokens.DBCS.id
    private val DD = Tokens.DD.id
    private val DEBUG = Tokens.DEBUG.id
    private val DECK = Tokens.DECK.id
    private val DIAGTRUNC = Tokens.DIAGTRUNC.id
    private val DLI = Tokens.DLI.id
    private val DLL = Tokens.DLL.id
    private val DP = Tokens.DP.id
    private val DTR = Tokens.DTR.id
    private val DU = Tokens.DU.id
    private val DUMP = Tokens.DUMP.id
    private val DYN = Tokens.DYN.id
    private val DYNAM = Tokens.DYNAM.id
    private val EDF = Tokens.EDF.id
    private val EJECT = Tokens.EJECT.id
    private val EJPD = Tokens.EJPD.id
    private val EN = Tokens.EN.id
    private val ENGLISH = Tokens.ENGLISH.id
    private val END_EXEC = Tokens.END_EXEC.id
    private val EPILOG = Tokens.EPILOG.id
    private val EXCI = Tokens.EXCI.id
    private val EXEC = Tokens.EXEC.id
    private val EXIT = Tokens.EXIT.id
    private val EXP = Tokens.EXP.id
    private val EXPORTALL = Tokens.EXPORTALL.id
    private val EXTEND = Tokens.EXTEND.id
    private val FASTSRT = Tokens.FASTSRT.id
    private val FEPI = Tokens.FEPI.id
    private val FLAG = Tokens.FLAG.id
    private val FLAGSTD = Tokens.FLAGSTD.id
    private val FSRT = Tokens.FSRT.id
    private val FULL = Tokens.FULL.id
    private val GDS = Tokens.GDS.id
    private val GRAPHIC = Tokens.GRAPHIC.id
    private val HOOK = Tokens.HOOK.id
    private val IN = Tokens.IN.id
    private val INTDATE = Tokens.INTDATE.id
    private val JA = Tokens.JA.id
    private val JP = Tokens.JP.id
    private val KA = Tokens.KA.id
    private val LANG = Tokens.LANG.id
    private val LANGUAGE = Tokens.LANGUAGE.id
    private val LC = Tokens.LC.id
    private val LEASM = Tokens.LEASM.id
    private val LENGTH = Tokens.LENGTH.id
    private val LIB = Tokens.LIB.id
    private val LILIAN = Tokens.LILIAN.id
    private val LIN = Tokens.LIN.id
    private val LINECOUNT = Tokens.LINECOUNT.id
    private val LINKAGE = Tokens.LINKAGE.id
    private val LIST = Tokens.LIST.id
    private val LM = Tokens.LM.id
    private val LONGMIXED = Tokens.LONGMIXED.id
    private val LONGUPPER = Tokens.LONGUPPER.id
    private val LPARENCHAR = Tokens.LPARENCHAR.id
    private val LU = Tokens.LU.id
    private val MAP = Tokens.MAP.id
    private val MARGINS = Tokens.MARGINS.id
    private val MAX = Tokens.MAX.id
    private val MD = Tokens.MD.id
    private val MDECK = Tokens.MDECK.id
    private val MIG = Tokens.MIG.id
    private val MIXED = Tokens.MIXED.id
    private val NAME = Tokens.NAME.id
    private val NAT = Tokens.NAT.id
    private val NATIONAL = Tokens.NATIONAL.id
    private val NATLANG = Tokens.NATLANG.id
    private val NN = Tokens.NN.id
    private val NO = Tokens.NO.id
    private val NOADATA = Tokens.NOADATA.id
    private val NOADV = Tokens.NOADV.id
    private val NOALIAS = Tokens.NOALIAS.id
    private val NOAWO = Tokens.NOAWO.id
    private val NOBLOCK0 = Tokens.NOBLOCK0.id
    private val NOC = Tokens.NOC.id
    private val NOCBLCARD = Tokens.NOCBLCARD.id
    private val NOCICS = Tokens.NOCICS.id
    private val NOCMPR2 = Tokens.NOCMPR2.id
    private val NOCOMPILE = Tokens.NOCOMPILE.id
    private val NOCPSM = Tokens.NOCPSM.id
    private val NOCURR = Tokens.NOCURR.id
    private val NOCURRENCY = Tokens.NOCURRENCY.id
    private val NOD = Tokens.NOD.id
    private val NODATEPROC = Tokens.NODATEPROC.id
    private val NODBCS = Tokens.NODBCS.id
    private val NODE = Tokens.NODE.id
    private val NODEBUG = Tokens.NODEBUG.id
    private val NODECK = Tokens.NODECK.id
    private val NODIAGTRUNC = Tokens.NODIAGTRUNC.id
    private val NODLL = Tokens.NODLL.id
    private val NODU = Tokens.NODU.id
    private val NODUMP = Tokens.NODUMP.id
    private val NODP = Tokens.NODP.id
    private val NODTR = Tokens.NODTR.id
    private val NODYN = Tokens.NODYN.id
    private val NODYNAM = Tokens.NODYNAM.id
    private val NOEDF = Tokens.NOEDF.id
    private val NOEJPD = Tokens.NOEJPD.id
    private val NOEPILOG = Tokens.NOEPILOG.id
    private val NOEXIT = Tokens.NOEXIT.id
    private val NOEXP = Tokens.NOEXP.id
    private val NOEXPORTALL = Tokens.NOEXPORTALL.id
    private val NOF = Tokens.NOF.id
    private val NOFASTSRT = Tokens.NOFASTSRT.id
    private val NOFEPI = Tokens.NOFEPI.id
    private val NOFLAG = Tokens.NOFLAG.id
    private val NOFLAGMIG = Tokens.NOFLAGMIG.id
    private val NOFLAGSTD = Tokens.NOFLAGSTD.id
    private val NOFSRT = Tokens.NOFSRT.id
    private val NOGRAPHIC = Tokens.NOGRAPHIC.id
    private val NOHOOK = Tokens.NOHOOK.id
    private val NOLENGTH = Tokens.NOLENGTH.id
    private val NOLIB = Tokens.NOLIB.id
    private val NOLINKAGE = Tokens.NOLINKAGE.id
    private val NOLIST = Tokens.NOLIST.id
    private val NOMAP = Tokens.NOMAP.id
    private val NOMD = Tokens.NOMD.id
    private val NOMDECK = Tokens.NOMDECK.id
    private val NONAME = Tokens.NONAME.id
    private val NONUM = Tokens.NONUM.id
    private val NONUMBER = Tokens.NONUMBER.id
    private val NOOBJ = Tokens.NOOBJ.id
    private val NOOBJECT = Tokens.NOOBJECT.id
    private val NOOFF = Tokens.NOOFF.id
    private val NOOFFSET = Tokens.NOOFFSET.id
    private val NOOPSEQUENCE = Tokens.NOOPSEQUENCE.id
    private val NOOPT = Tokens.NOOPT.id
    private val NOOPTIMIZE = Tokens.NOOPTIMIZE.id
    private val NOOPTIONS = Tokens.NOOPTIONS.id
    private val NOP = Tokens.NOP.id
    private val NOPFD = Tokens.NOPFD.id
    private val NOPROLOG = Tokens.NOPROLOG.id
    private val NORENT = Tokens.NORENT.id
    private val NOS = Tokens.NOS.id
    private val NOSEP = Tokens.NOSEP.id
    private val NOSEPARATE = Tokens.NOSEPARATE.id
    private val NOSEQ = Tokens.NOSEQ.id
    private val NOSOURCE = Tokens.NOSOURCE.id
    private val NOSPIE = Tokens.NOSPIE.id
    private val NOSQL = Tokens.NOSQL.id
    private val NOSQLC = Tokens.NOSQLC.id
    private val NOSQLCCSID = Tokens.NOSQLCCSID.id
    private val NOSSR = Tokens.NOSSR.id
    private val NOSSRANGE = Tokens.NOSSRANGE.id
    private val NOSTDTRUNC = Tokens.NOSTDTRUNC.id
    private val NOSEQUENCE = Tokens.NOSEQUENCE.id
    private val NOTERM = Tokens.NOTERM.id
    private val NOTERMINAL = Tokens.NOTERMINAL.id
    private val NOTEST = Tokens.NOTEST.id
    private val NOTHREAD = Tokens.NOTHREAD.id
    private val NOTRIG = Tokens.NOTRIG.id
    private val NOVBREF = Tokens.NOVBREF.id
    private val NOWD = Tokens.NOWD.id
    private val NOWORD = Tokens.NOWORD.id
    private val NOX = Tokens.NOX.id
    private val NOXREF = Tokens.NOXREF.id
    private val NOZWB = Tokens.NOZWB.id
    private val NS = Tokens.NS.id
    private val NSEQ = Tokens.NSEQ.id
    private val NSYMBOL = Tokens.NSYMBOL.id
    private val NUM = Tokens.NUM.id
    private val NUMBER = Tokens.NUMBER.id
    private val NUMPROC = Tokens.NUMPROC.id
    private val OBJ = Tokens.OBJ.id
    private val OBJECT = Tokens.OBJECT.id
    private val OF = Tokens.OF.id
    private val OFF = Tokens.OFF.id
    private val OFFSET = Tokens.OFFSET.id
    private val ON = Tokens.ON.id
    private val OP = Tokens.OP.id
    private val OPMARGINS = Tokens.OPMARGINS.id
    private val OPSEQUENCE = Tokens.OPSEQUENCE.id
    private val OPT = Tokens.OPT.id
    private val OPTFILE = Tokens.OPTFILE.id
    private val OPTIMIZE = Tokens.OPTIMIZE.id
    private val OPTIONS = Tokens.OPTIONS.id
    private val OUT = Tokens.OUT.id
    private val OUTDD = Tokens.OUTDD.id
    private val PFD = Tokens.PFD.id
    private val PPTDBG = Tokens.PPTDBG.id
    private val PGMN = Tokens.PGMN.id
    private val PGMNAME = Tokens.PGMNAME.id
    private val PROCESS = Tokens.PROCESS.id
    private val PROLOG = Tokens.PROLOG.id
    private val QUOTE = Tokens.QUOTE.id
    private val RENT = Tokens.RENT.id
    private val REPLACE = Tokens.REPLACE.id
    private val REPLACING = Tokens.REPLACING.id
    private val RMODE = Tokens.RMODE.id
    private val RPARENCHAR = Tokens.RPARENCHAR.id
    private val SEP = Tokens.SEP.id
    private val SEPARATE = Tokens.SEPARATE.id
    private val SEQ = Tokens.SEQ.id
    private val SEQUENCE = Tokens.SEQUENCE.id
    private val SHORT = Tokens.SHORT.id
    private val SIZE = Tokens.SIZE.id
    private val SOURCE = Tokens.SOURCE.id
    private val SP = Tokens.SP.id
    private val SPACE = Tokens.SPACE.id
    private val SPIE = Tokens.SPIE.id
    private val SQL = Tokens.SQL.id
    private val SQLC = Tokens.SQLC.id
    private val SQLCCSID = Tokens.SQLCCSID.id
    private val SQLIMS = Tokens.SQLIMS.id
    private val SKIP1 = Tokens.SKIP1.id
    private val SKIP2 = Tokens.SKIP2.id
    private val SKIP3 = Tokens.SKIP3.id
    private val SS = Tokens.SS.id
    private val SSR = Tokens.SSR.id
    private val SSRANGE = Tokens.SSRANGE.id
    private val STD = Tokens.STD.id
    private val SUPPRESS = Tokens.SUPPRESS.id
    private val SYSEIB = Tokens.SYSEIB.id
    private val SZ = Tokens.SZ.id
    private val TERM = Tokens.TERM.id
    private val TERMINAL = Tokens.TERMINAL.id
    private val TEST = Tokens.TEST.id
    private val THREAD = Tokens.THREAD.id
    private val TITLE = Tokens.TITLE.id
    private val TRIG = Tokens.TRIG.id
    private val TRUNC = Tokens.TRUNC.id
    private val UE = Tokens.UE.id
    private val UPPER = Tokens.UPPER.id
    private val VBREF = Tokens.VBREF.id
    private val WD = Tokens.WD.id
    private val WORD = Tokens.WORD.id
    private val XMLPARSE = Tokens.XMLPARSE.id
    private val XMLSS = Tokens.XMLSS.id
    private val XOPTS = Tokens.XOPTS.id
    private val XP = Tokens.XP.id
    private val XREF = Tokens.XREF.id
    private val YEARWINDOW = Tokens.YEARWINDOW.id
    private val YW = Tokens.YW.id
    private val ZWB = Tokens.ZWB.id
    private val C_CHAR = Tokens.C_CHAR.id
    private val D_CHAR = Tokens.D_CHAR.id
    private val E_CHAR = Tokens.E_CHAR.id
    private val F_CHAR = Tokens.F_CHAR.id
    private val H_CHAR = Tokens.H_CHAR.id
    private val I_CHAR = Tokens.I_CHAR.id
    private val M_CHAR = Tokens.M_CHAR.id
    private val N_CHAR = Tokens.N_CHAR.id
    private val Q_CHAR = Tokens.Q_CHAR.id
    private val S_CHAR = Tokens.S_CHAR.id
    private val U_CHAR = Tokens.U_CHAR.id
    private val W_CHAR = Tokens.W_CHAR.id
    private val X_CHAR = Tokens.X_CHAR.id
    private val COMMENTTAG = Tokens.COMMENTTAG.id
    private val COMMACHAR = Tokens.COMMACHAR.id
    private val DOT = Tokens.DOT.id
    private val DOUBLEEQUALCHAR = Tokens.DOUBLEEQUALCHAR.id
    private val NONNUMERICLITERAL = Tokens.NONNUMERICLITERAL.id
    private val NUMERICLITERAL = Tokens.NUMERICLITERAL.id
    private val IDENTIFIER = Tokens.IDENTIFIER.id
    private val FILENAME = Tokens.FILENAME.id
    private val NEWLINE = Tokens.NEWLINE.id
    private val COMMENTLINE = Tokens.COMMENTLINE.id
    private val WS = Tokens.WS.id
    private val TEXT = Tokens.TEXT.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class StartRuleContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_startRule.id
	        set(value) { throw RuntimeException() }
		fun EOF() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.EOF.id, 0)
		fun findCompilerOptions() : List<CompilerOptionsContext> = getRuleContexts(solver.getType("CompilerOptionsContext"))
		fun findCompilerOptions(i: Int) : CompilerOptionsContext? = getRuleContext(solver.getType("CompilerOptionsContext"),i)
		fun findCopyStatement() : List<CopyStatementContext> = getRuleContexts(solver.getType("CopyStatementContext"))
		fun findCopyStatement(i: Int) : CopyStatementContext? = getRuleContext(solver.getType("CopyStatementContext"),i)
		fun findExecCicsStatement() : List<ExecCicsStatementContext> = getRuleContexts(solver.getType("ExecCicsStatementContext"))
		fun findExecCicsStatement(i: Int) : ExecCicsStatementContext? = getRuleContext(solver.getType("ExecCicsStatementContext"),i)
		fun findExecSqlStatement() : List<ExecSqlStatementContext> = getRuleContexts(solver.getType("ExecSqlStatementContext"))
		fun findExecSqlStatement(i: Int) : ExecSqlStatementContext? = getRuleContext(solver.getType("ExecSqlStatementContext"),i)
		fun findExecSqlImsStatement() : List<ExecSqlImsStatementContext> = getRuleContexts(solver.getType("ExecSqlImsStatementContext"))
		fun findExecSqlImsStatement(i: Int) : ExecSqlImsStatementContext? = getRuleContext(solver.getType("ExecSqlImsStatementContext"),i)
		fun findReplaceOffStatement() : List<ReplaceOffStatementContext> = getRuleContexts(solver.getType("ReplaceOffStatementContext"))
		fun findReplaceOffStatement(i: Int) : ReplaceOffStatementContext? = getRuleContext(solver.getType("ReplaceOffStatementContext"),i)
		fun findReplaceArea() : List<ReplaceAreaContext> = getRuleContexts(solver.getType("ReplaceAreaContext"))
		fun findReplaceArea(i: Int) : ReplaceAreaContext? = getRuleContext(solver.getType("ReplaceAreaContext"),i)
		fun findEjectStatement() : List<EjectStatementContext> = getRuleContexts(solver.getType("EjectStatementContext"))
		fun findEjectStatement(i: Int) : EjectStatementContext? = getRuleContext(solver.getType("EjectStatementContext"),i)
		fun findSkipStatement() : List<SkipStatementContext> = getRuleContexts(solver.getType("SkipStatementContext"))
		fun findSkipStatement(i: Int) : SkipStatementContext? = getRuleContext(solver.getType("SkipStatementContext"),i)
		fun findTitleStatement() : List<TitleStatementContext> = getRuleContexts(solver.getType("TitleStatementContext"))
		fun findTitleStatement(i: Int) : TitleStatementContext? = getRuleContext(solver.getType("TitleStatementContext"),i)
		fun findCharDataLine() : List<CharDataLineContext> = getRuleContexts(solver.getType("CharDataLineContext"))
		fun findCharDataLine(i: Int) : CharDataLineContext? = getRuleContext(solver.getType("CharDataLineContext"),i)
		fun NEWLINE() : List<TerminalNode> = getTokens(Cobol85PreprocessorParser.Tokens.NEWLINE.id)
		fun NEWLINE(i: Int) : TerminalNode = getToken(Cobol85PreprocessorParser.Tokens.NEWLINE.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).enterStartRule(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).exitStartRule(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is Cobol85PreprocessorVisitor ) return (visitor as Cobol85PreprocessorVisitor<out T>).visitStartRule(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  startRule() : StartRuleContext {
		var _localctx : StartRuleContext = StartRuleContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_startRule.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 74
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl ADATA) or (1L shl ADV) or (1L shl ALIAS) or (1L shl ANSI) or (1L shl ANY) or (1L shl APOST) or (1L shl AR) or (1L shl ARITH) or (1L shl AUTO) or (1L shl AWO) or (1L shl BIN) or (1L shl BLOCK0) or (1L shl BUF) or (1L shl BUFSIZE) or (1L shl BY) or (1L shl CBL) or (1L shl CBLCARD) or (1L shl CO) or (1L shl COBOL2) or (1L shl COBOL3) or (1L shl CODEPAGE) or (1L shl COMPAT) or (1L shl COMPILE) or (1L shl COPY) or (1L shl CP) or (1L shl CPP) or (1L shl CPSM) or (1L shl CS) or (1L shl CURR) or (1L shl CURRENCY) or (1L shl DATA) or (1L shl DATEPROC) or (1L shl DBCS) or (1L shl DD) or (1L shl DEBUG) or (1L shl DECK) or (1L shl DIAGTRUNC) or (1L shl DLI) or (1L shl DLL) or (1L shl DP) or (1L shl DTR) or (1L shl DU) or (1L shl DUMP) or (1L shl DYN) or (1L shl DYNAM) or (1L shl EDF) or (1L shl EJECT) or (1L shl EJPD) or (1L shl EN) or (1L shl ENGLISH) or (1L shl EPILOG) or (1L shl EXCI) or (1L shl EXEC) or (1L shl EXIT) or (1L shl EXP) or (1L shl EXPORTALL) or (1L shl EXTEND) or (1L shl FASTSRT) or (1L shl FLAG) or (1L shl FLAGSTD))) != 0L) || ((((_la - 64)) and 0x3f.inv()) == 0 && ((1L shl (_la - 64)) and ((1L shl (FSRT - 64)) or (1L shl (FULL - 64)) or (1L shl (GDS - 64)) or (1L shl (GRAPHIC - 64)) or (1L shl (HOOK - 64)) or (1L shl (IN - 64)) or (1L shl (INTDATE - 64)) or (1L shl (JA - 64)) or (1L shl (JP - 64)) or (1L shl (KA - 64)) or (1L shl (LANG - 64)) or (1L shl (LANGUAGE - 64)) or (1L shl (LC - 64)) or (1L shl (LENGTH - 64)) or (1L shl (LIB - 64)) or (1L shl (LILIAN - 64)) or (1L shl (LIN - 64)) or (1L shl (LINECOUNT - 64)) or (1L shl (LINKAGE - 64)) or (1L shl (LIST - 64)) or (1L shl (LM - 64)) or (1L shl (LONGMIXED - 64)) or (1L shl (LONGUPPER - 64)) or (1L shl (LPARENCHAR - 64)) or (1L shl (LU - 64)) or (1L shl (MAP - 64)) or (1L shl (MARGINS - 64)) or (1L shl (MAX - 64)) or (1L shl (MD - 64)) or (1L shl (MDECK - 64)) or (1L shl (MIG - 64)) or (1L shl (MIXED - 64)) or (1L shl (NAME - 64)) or (1L shl (NAT - 64)) or (1L shl (NATIONAL - 64)) or (1L shl (NATLANG - 64)) or (1L shl (NN - 64)) or (1L shl (NO - 64)) or (1L shl (NOADATA - 64)) or (1L shl (NOADV - 64)) or (1L shl (NOALIAS - 64)) or (1L shl (NOAWO - 64)) or (1L shl (NOBLOCK0 - 64)) or (1L shl (NOC - 64)) or (1L shl (NOCBLCARD - 64)) or (1L shl (NOCICS - 64)) or (1L shl (NOCMPR2 - 64)) or (1L shl (NOCOMPILE - 64)) or (1L shl (NOCPSM - 64)) or (1L shl (NOCURR - 64)) or (1L shl (NOCURRENCY - 64)) or (1L shl (NOD - 64)) or (1L shl (NODATEPROC - 64)) or (1L shl (NODBCS - 64)) or (1L shl (NODE - 64)) or (1L shl (NODEBUG - 64)) or (1L shl (NODECK - 64)) or (1L shl (NODIAGTRUNC - 64)) or (1L shl (NODLL - 64)) or (1L shl (NODU - 64)) or (1L shl (NODUMP - 64)) or (1L shl (NODP - 64)) or (1L shl (NODTR - 64)))) != 0L) || ((((_la - 128)) and 0x3f.inv()) == 0 && ((1L shl (_la - 128)) and ((1L shl (NODYN - 128)) or (1L shl (NODYNAM - 128)) or (1L shl (NOEDF - 128)) or (1L shl (NOEJPD - 128)) or (1L shl (NOEPILOG - 128)) or (1L shl (NOEXIT - 128)) or (1L shl (NOEXP - 128)) or (1L shl (NOEXPORTALL - 128)) or (1L shl (NOF - 128)) or (1L shl (NOFASTSRT - 128)) or (1L shl (NOFEPI - 128)) or (1L shl (NOFLAG - 128)) or (1L shl (NOFLAGMIG - 128)) or (1L shl (NOFLAGSTD - 128)) or (1L shl (NOFSRT - 128)) or (1L shl (NOGRAPHIC - 128)) or (1L shl (NOHOOK - 128)) or (1L shl (NOLENGTH - 128)) or (1L shl (NOLIB - 128)) or (1L shl (NOLINKAGE - 128)) or (1L shl (NOLIST - 128)) or (1L shl (NOMAP - 128)) or (1L shl (NOMD - 128)) or (1L shl (NOMDECK - 128)) or (1L shl (NONAME - 128)) or (1L shl (NONUM - 128)) or (1L shl (NONUMBER - 128)) or (1L shl (NOOBJ - 128)) or (1L shl (NOOBJECT - 128)) or (1L shl (NOOFF - 128)) or (1L shl (NOOFFSET - 128)) or (1L shl (NOOPSEQUENCE - 128)) or (1L shl (NOOPT - 128)) or (1L shl (NOOPTIMIZE - 128)) or (1L shl (NOOPTIONS - 128)) or (1L shl (NOP - 128)) or (1L shl (NOPFD - 128)) or (1L shl (NOPROLOG - 128)) or (1L shl (NORENT - 128)) or (1L shl (NOS - 128)) or (1L shl (NOSEP - 128)) or (1L shl (NOSEPARATE - 128)) or (1L shl (NOSEQ - 128)) or (1L shl (NOSOURCE - 128)) or (1L shl (NOSPIE - 128)) or (1L shl (NOSQL - 128)) or (1L shl (NOSQLC - 128)) or (1L shl (NOSQLCCSID - 128)) or (1L shl (NOSSR - 128)) or (1L shl (NOSSRANGE - 128)) or (1L shl (NOSTDTRUNC - 128)) or (1L shl (NOSEQUENCE - 128)) or (1L shl (NOTERM - 128)) or (1L shl (NOTERMINAL - 128)) or (1L shl (NOTEST - 128)) or (1L shl (NOTHREAD - 128)) or (1L shl (NOTRIG - 128)) or (1L shl (NOVBREF - 128)) or (1L shl (NOWORD - 128)) or (1L shl (NOX - 128)) or (1L shl (NOXREF - 128)) or (1L shl (NOZWB - 128)) or (1L shl (NS - 128)))) != 0L) || ((((_la - 192)) and 0x3f.inv()) == 0 && ((1L shl (_la - 192)) and ((1L shl (NSEQ - 192)) or (1L shl (NSYMBOL - 192)) or (1L shl (NUM - 192)) or (1L shl (NUMBER - 192)) or (1L shl (NUMPROC - 192)) or (1L shl (OBJ - 192)) or (1L shl (OBJECT - 192)) or (1L shl (OF - 192)) or (1L shl (OFF - 192)) or (1L shl (OFFSET - 192)) or (1L shl (ON - 192)) or (1L shl (OP - 192)) or (1L shl (OPMARGINS - 192)) or (1L shl (OPSEQUENCE - 192)) or (1L shl (OPT - 192)) or (1L shl (OPTFILE - 192)) or (1L shl (OPTIMIZE - 192)) or (1L shl (OPTIONS - 192)) or (1L shl (OUT - 192)) or (1L shl (OUTDD - 192)) or (1L shl (PFD - 192)) or (1L shl (PPTDBG - 192)) or (1L shl (PGMN - 192)) or (1L shl (PGMNAME - 192)) or (1L shl (PROCESS - 192)) or (1L shl (PROLOG - 192)) or (1L shl (QUOTE - 192)) or (1L shl (RENT - 192)) or (1L shl (REPLACE - 192)) or (1L shl (REPLACING - 192)) or (1L shl (RMODE - 192)) or (1L shl (RPARENCHAR - 192)) or (1L shl (SEP - 192)) or (1L shl (SEPARATE - 192)) or (1L shl (SEQ - 192)) or (1L shl (SEQUENCE - 192)) or (1L shl (SHORT - 192)) or (1L shl (SIZE - 192)) or (1L shl (SOURCE - 192)) or (1L shl (SP - 192)) or (1L shl (SPACE - 192)) or (1L shl (SPIE - 192)) or (1L shl (SQL - 192)) or (1L shl (SQLC - 192)) or (1L shl (SQLCCSID - 192)) or (1L shl (SKIP1 - 192)) or (1L shl (SKIP2 - 192)) or (1L shl (SKIP3 - 192)) or (1L shl (SS - 192)) or (1L shl (SSR - 192)) or (1L shl (SSRANGE - 192)) or (1L shl (STD - 192)) or (1L shl (SYSEIB - 192)) or (1L shl (SZ - 192)) or (1L shl (TERM - 192)) or (1L shl (TERMINAL - 192)) or (1L shl (TEST - 192)) or (1L shl (THREAD - 192)) or (1L shl (TITLE - 192)) or (1L shl (TRIG - 192)) or (1L shl (TRUNC - 192)) or (1L shl (UE - 192)))) != 0L) || ((((_la - 256)) and 0x3f.inv()) == 0 && ((1L shl (_la - 256)) and ((1L shl (UPPER - 256)) or (1L shl (VBREF - 256)) or (1L shl (WD - 256)) or (1L shl (XMLPARSE - 256)) or (1L shl (XMLSS - 256)) or (1L shl (XOPTS - 256)) or (1L shl (XREF - 256)) or (1L shl (YEARWINDOW - 256)) or (1L shl (YW - 256)) or (1L shl (ZWB - 256)) or (1L shl (C_CHAR - 256)) or (1L shl (D_CHAR - 256)) or (1L shl (E_CHAR - 256)) or (1L shl (F_CHAR - 256)) or (1L shl (H_CHAR - 256)) or (1L shl (I_CHAR - 256)) or (1L shl (M_CHAR - 256)) or (1L shl (N_CHAR - 256)) or (1L shl (Q_CHAR - 256)) or (1L shl (S_CHAR - 256)) or (1L shl (U_CHAR - 256)) or (1L shl (W_CHAR - 256)) or (1L shl (X_CHAR - 256)) or (1L shl (COMMACHAR - 256)) or (1L shl (DOT - 256)) or (1L shl (NONNUMERICLITERAL - 256)) or (1L shl (NUMERICLITERAL - 256)) or (1L shl (IDENTIFIER - 256)) or (1L shl (FILENAME - 256)) or (1L shl (NEWLINE - 256)) or (1L shl (TEXT - 256)))) != 0L)) {
				if (true){
				this.state = 72
				errorHandler.sync(this)
				when ( interpreter!!.adaptivePredict(_input!!,0,context) ) {
				1 -> {if (true){
				this.state = 60
				compilerOptions()
				}}
				2 -> {if (true){
				this.state = 61
				copyStatement()
				}}
				3 -> {if (true){
				this.state = 62
				execCicsStatement()
				}}
				4 -> {if (true){
				this.state = 63
				execSqlStatement()
				}}
				5 -> {if (true){
				this.state = 64
				execSqlImsStatement()
				}}
				6 -> {if (true){
				this.state = 65
				replaceOffStatement()
				}}
				7 -> {if (true){
				this.state = 66
				replaceArea()
				}}
				8 -> {if (true){
				this.state = 67
				ejectStatement()
				}}
				9 -> {if (true){
				this.state = 68
				skipStatement()
				}}
				10 -> {if (true){
				this.state = 69
				titleStatement()
				}}
				11 -> {if (true){
				this.state = 70
				charDataLine()
				}}
				12 -> {if (true){
				this.state = 71
				match(NEWLINE) as Token
				}}
				}
				}
				this.state = 76
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 77
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

	open class CompilerOptionsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_compilerOptions.id
	        set(value) { throw RuntimeException() }
		fun PROCESS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.PROCESS.id, 0)
		fun CBL() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.CBL.id, 0)
		fun findCompilerOption() : List<CompilerOptionContext> = getRuleContexts(solver.getType("CompilerOptionContext"))
		fun findCompilerOption(i: Int) : CompilerOptionContext? = getRuleContext(solver.getType("CompilerOptionContext"),i)
		fun findCompilerXOpts() : List<CompilerXOptsContext> = getRuleContexts(solver.getType("CompilerXOptsContext"))
		fun findCompilerXOpts(i: Int) : CompilerXOptsContext? = getRuleContext(solver.getType("CompilerXOptsContext"),i)
		fun COMMACHAR() : List<TerminalNode> = getTokens(Cobol85PreprocessorParser.Tokens.COMMACHAR.id)
		fun COMMACHAR(i: Int) : TerminalNode = getToken(Cobol85PreprocessorParser.Tokens.COMMACHAR.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).enterCompilerOptions(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).exitCompilerOptions(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is Cobol85PreprocessorVisitor ) return (visitor as Cobol85PreprocessorVisitor<out T>).visitCompilerOptions(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  compilerOptions() : CompilerOptionsContext {
		var _localctx : CompilerOptionsContext = CompilerOptionsContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_compilerOptions.id)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 79
			_la = _input!!.LA(1)
			if ( !(_la==CBL || _la==PROCESS) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 85 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				this.state = 85
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				ADATA , ADV , APOST , AR , ARITH , AWO , BLOCK0 , BUF , BUFSIZE , CBLCARD , CICS , COBOL2 , COBOL3 , CODEPAGE , COMPILE , CP , CPP , CPSM , CURR , CURRENCY , DATA , DATEPROC , DBCS , DEBUG , DECK , DIAGTRUNC , DLL , DP , DTR , DU , DUMP , DYN , DYNAM , EDF , EPILOG , EXIT , EXP , EXPORTALL , FASTSRT , FEPI , FLAG , FLAGSTD , FSRT , GDS , GRAPHIC , INTDATE , LANG , LANGUAGE , LC , LEASM , LENGTH , LIB , LIN , LINECOUNT , LINKAGE , LIST , MAP , MARGINS , MD , MDECK , NAME , NATLANG , NOADATA , NOADV , NOAWO , NOBLOCK0 , NOC , NOCBLCARD , NOCICS , NOCMPR2 , NOCOMPILE , NOCPSM , NOCURR , NOCURRENCY , NOD , NODATEPROC , NODBCS , NODE , NODEBUG , NODECK , NODIAGTRUNC , NODLL , NODU , NODUMP , NODP , NODTR , NODYN , NODYNAM , NOEDF , NOEPILOG , NOEXIT , NOEXP , NOEXPORTALL , NOF , NOFASTSRT , NOFEPI , NOFLAG , NOFLAGMIG , NOFLAGSTD , NOFSRT , NOGRAPHIC , NOLENGTH , NOLIB , NOLINKAGE , NOLIST , NOMAP , NOMD , NOMDECK , NONAME , NONUM , NONUMBER , NOOBJ , NOOBJECT , NOOFF , NOOFFSET , NOOPSEQUENCE , NOOPT , NOOPTIMIZE , NOOPTIONS , NOP , NOPROLOG , NORENT , NOS , NOSEQ , NOSOURCE , NOSPIE , NOSQL , NOSQLC , NOSQLCCSID , NOSSR , NOSSRANGE , NOSTDTRUNC , NOSEQUENCE , NOTERM , NOTERMINAL , NOTEST , NOTHREAD , NOVBREF , NOWD , NOWORD , NOX , NOXREF , NOZWB , NS , NSEQ , NSYMBOL , NUM , NUMBER , NUMPROC , OBJ , OBJECT , OFF , OFFSET , OP , OPMARGINS , OPSEQUENCE , OPT , OPTFILE , OPTIMIZE , OPTIONS , OUT , OUTDD , PGMN , PGMNAME , PROLOG , QUOTE , RENT , RMODE , SEQ , SEQUENCE , SIZE , SOURCE , SP , SPACE , SPIE , SQL , SQLC , SQLCCSID , SSR , SSRANGE , SYSEIB , SZ , TERM , TERMINAL , TEST , THREAD , TRUNC , VBREF , WD , WORD , XMLPARSE , XP , XREF , YEARWINDOW , YW , ZWB , C_CHAR , D_CHAR , F_CHAR , Q_CHAR , S_CHAR , X_CHAR , COMMACHAR  ->  /*LL1AltBlock*/{if (true){
				this.state = 81
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				if (_la==COMMACHAR) {
					if (true){
					this.state = 80
					match(COMMACHAR) as Token
					}
				}

				this.state = 83
				compilerOption()
				}}
				XOPTS  ->  /*LL1AltBlock*/{if (true){
				this.state = 84
				compilerXOpts()
				}}
				else -> throw NoViableAltException(this)
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 87 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,4,context)
			} while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER )
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class CompilerXOptsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_compilerXOpts.id
	        set(value) { throw RuntimeException() }
		fun XOPTS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.XOPTS.id, 0)
		fun LPARENCHAR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.LPARENCHAR.id, 0)
		fun findCompilerOption() : List<CompilerOptionContext> = getRuleContexts(solver.getType("CompilerOptionContext"))
		fun findCompilerOption(i: Int) : CompilerOptionContext? = getRuleContext(solver.getType("CompilerOptionContext"),i)
		fun RPARENCHAR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.RPARENCHAR.id, 0)
		fun COMMACHAR() : List<TerminalNode> = getTokens(Cobol85PreprocessorParser.Tokens.COMMACHAR.id)
		fun COMMACHAR(i: Int) : TerminalNode = getToken(Cobol85PreprocessorParser.Tokens.COMMACHAR.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).enterCompilerXOpts(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).exitCompilerXOpts(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is Cobol85PreprocessorVisitor ) return (visitor as Cobol85PreprocessorVisitor<out T>).visitCompilerXOpts(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  compilerXOpts() : CompilerXOptsContext {
		var _localctx : CompilerXOptsContext = CompilerXOptsContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_compilerXOpts.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 89
			match(XOPTS) as Token
			this.state = 90
			match(LPARENCHAR) as Token
			this.state = 91
			compilerOption()
			this.state = 98
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl ADATA) or (1L shl ADV) or (1L shl APOST) or (1L shl AR) or (1L shl ARITH) or (1L shl AWO) or (1L shl BLOCK0) or (1L shl BUF) or (1L shl BUFSIZE) or (1L shl CBLCARD) or (1L shl CICS) or (1L shl COBOL2) or (1L shl COBOL3) or (1L shl CODEPAGE) or (1L shl COMPILE) or (1L shl CP) or (1L shl CPP) or (1L shl CPSM) or (1L shl CURR) or (1L shl CURRENCY) or (1L shl DATA) or (1L shl DATEPROC) or (1L shl DBCS) or (1L shl DEBUG) or (1L shl DECK) or (1L shl DIAGTRUNC) or (1L shl DLL) or (1L shl DP) or (1L shl DTR) or (1L shl DU) or (1L shl DUMP) or (1L shl DYN) or (1L shl DYNAM) or (1L shl EDF) or (1L shl EPILOG) or (1L shl EXIT) or (1L shl EXP) or (1L shl EXPORTALL) or (1L shl FASTSRT) or (1L shl FEPI) or (1L shl FLAG) or (1L shl FLAGSTD))) != 0L) || ((((_la - 64)) and 0x3f.inv()) == 0 && ((1L shl (_la - 64)) and ((1L shl (FSRT - 64)) or (1L shl (GDS - 64)) or (1L shl (GRAPHIC - 64)) or (1L shl (INTDATE - 64)) or (1L shl (LANG - 64)) or (1L shl (LANGUAGE - 64)) or (1L shl (LC - 64)) or (1L shl (LEASM - 64)) or (1L shl (LENGTH - 64)) or (1L shl (LIB - 64)) or (1L shl (LIN - 64)) or (1L shl (LINECOUNT - 64)) or (1L shl (LINKAGE - 64)) or (1L shl (LIST - 64)) or (1L shl (MAP - 64)) or (1L shl (MARGINS - 64)) or (1L shl (MD - 64)) or (1L shl (MDECK - 64)) or (1L shl (NAME - 64)) or (1L shl (NATLANG - 64)) or (1L shl (NOADATA - 64)) or (1L shl (NOADV - 64)) or (1L shl (NOAWO - 64)) or (1L shl (NOBLOCK0 - 64)) or (1L shl (NOC - 64)) or (1L shl (NOCBLCARD - 64)) or (1L shl (NOCICS - 64)) or (1L shl (NOCMPR2 - 64)) or (1L shl (NOCOMPILE - 64)) or (1L shl (NOCPSM - 64)) or (1L shl (NOCURR - 64)) or (1L shl (NOCURRENCY - 64)) or (1L shl (NOD - 64)) or (1L shl (NODATEPROC - 64)) or (1L shl (NODBCS - 64)) or (1L shl (NODE - 64)) or (1L shl (NODEBUG - 64)) or (1L shl (NODECK - 64)) or (1L shl (NODIAGTRUNC - 64)) or (1L shl (NODLL - 64)) or (1L shl (NODU - 64)) or (1L shl (NODUMP - 64)) or (1L shl (NODP - 64)) or (1L shl (NODTR - 64)))) != 0L) || ((((_la - 128)) and 0x3f.inv()) == 0 && ((1L shl (_la - 128)) and ((1L shl (NODYN - 128)) or (1L shl (NODYNAM - 128)) or (1L shl (NOEDF - 128)) or (1L shl (NOEPILOG - 128)) or (1L shl (NOEXIT - 128)) or (1L shl (NOEXP - 128)) or (1L shl (NOEXPORTALL - 128)) or (1L shl (NOF - 128)) or (1L shl (NOFASTSRT - 128)) or (1L shl (NOFEPI - 128)) or (1L shl (NOFLAG - 128)) or (1L shl (NOFLAGMIG - 128)) or (1L shl (NOFLAGSTD - 128)) or (1L shl (NOFSRT - 128)) or (1L shl (NOGRAPHIC - 128)) or (1L shl (NOLENGTH - 128)) or (1L shl (NOLIB - 128)) or (1L shl (NOLINKAGE - 128)) or (1L shl (NOLIST - 128)) or (1L shl (NOMAP - 128)) or (1L shl (NOMD - 128)) or (1L shl (NOMDECK - 128)) or (1L shl (NONAME - 128)) or (1L shl (NONUM - 128)) or (1L shl (NONUMBER - 128)) or (1L shl (NOOBJ - 128)) or (1L shl (NOOBJECT - 128)) or (1L shl (NOOFF - 128)) or (1L shl (NOOFFSET - 128)) or (1L shl (NOOPSEQUENCE - 128)) or (1L shl (NOOPT - 128)) or (1L shl (NOOPTIMIZE - 128)) or (1L shl (NOOPTIONS - 128)) or (1L shl (NOP - 128)) or (1L shl (NOPROLOG - 128)) or (1L shl (NORENT - 128)) or (1L shl (NOS - 128)) or (1L shl (NOSEQ - 128)) or (1L shl (NOSOURCE - 128)) or (1L shl (NOSPIE - 128)) or (1L shl (NOSQL - 128)) or (1L shl (NOSQLC - 128)) or (1L shl (NOSQLCCSID - 128)) or (1L shl (NOSSR - 128)) or (1L shl (NOSSRANGE - 128)) or (1L shl (NOSTDTRUNC - 128)) or (1L shl (NOSEQUENCE - 128)) or (1L shl (NOTERM - 128)) or (1L shl (NOTERMINAL - 128)) or (1L shl (NOTEST - 128)) or (1L shl (NOTHREAD - 128)) or (1L shl (NOVBREF - 128)) or (1L shl (NOWD - 128)) or (1L shl (NOWORD - 128)) or (1L shl (NOX - 128)) or (1L shl (NOXREF - 128)) or (1L shl (NOZWB - 128)) or (1L shl (NS - 128)))) != 0L) || ((((_la - 192)) and 0x3f.inv()) == 0 && ((1L shl (_la - 192)) and ((1L shl (NSEQ - 192)) or (1L shl (NSYMBOL - 192)) or (1L shl (NUM - 192)) or (1L shl (NUMBER - 192)) or (1L shl (NUMPROC - 192)) or (1L shl (OBJ - 192)) or (1L shl (OBJECT - 192)) or (1L shl (OFF - 192)) or (1L shl (OFFSET - 192)) or (1L shl (OP - 192)) or (1L shl (OPMARGINS - 192)) or (1L shl (OPSEQUENCE - 192)) or (1L shl (OPT - 192)) or (1L shl (OPTFILE - 192)) or (1L shl (OPTIMIZE - 192)) or (1L shl (OPTIONS - 192)) or (1L shl (OUT - 192)) or (1L shl (OUTDD - 192)) or (1L shl (PGMN - 192)) or (1L shl (PGMNAME - 192)) or (1L shl (PROLOG - 192)) or (1L shl (QUOTE - 192)) or (1L shl (RENT - 192)) or (1L shl (RMODE - 192)) or (1L shl (SEQ - 192)) or (1L shl (SEQUENCE - 192)) or (1L shl (SIZE - 192)) or (1L shl (SOURCE - 192)) or (1L shl (SP - 192)) or (1L shl (SPACE - 192)) or (1L shl (SPIE - 192)) or (1L shl (SQL - 192)) or (1L shl (SQLC - 192)) or (1L shl (SQLCCSID - 192)) or (1L shl (SSR - 192)) or (1L shl (SSRANGE - 192)) or (1L shl (SYSEIB - 192)) or (1L shl (SZ - 192)) or (1L shl (TERM - 192)) or (1L shl (TERMINAL - 192)) or (1L shl (TEST - 192)) or (1L shl (THREAD - 192)) or (1L shl (TRUNC - 192)))) != 0L) || ((((_la - 257)) and 0x3f.inv()) == 0 && ((1L shl (_la - 257)) and ((1L shl (VBREF - 257)) or (1L shl (WD - 257)) or (1L shl (WORD - 257)) or (1L shl (XMLPARSE - 257)) or (1L shl (XP - 257)) or (1L shl (XREF - 257)) or (1L shl (YEARWINDOW - 257)) or (1L shl (YW - 257)) or (1L shl (ZWB - 257)) or (1L shl (C_CHAR - 257)) or (1L shl (D_CHAR - 257)) or (1L shl (F_CHAR - 257)) or (1L shl (Q_CHAR - 257)) or (1L shl (S_CHAR - 257)) or (1L shl (X_CHAR - 257)) or (1L shl (COMMACHAR - 257)))) != 0L)) {
				if (true){
				if (true){
				this.state = 93
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				if (_la==COMMACHAR) {
					if (true){
					this.state = 92
					match(COMMACHAR) as Token
					}
				}

				this.state = 95
				compilerOption()
				}
				}
				this.state = 100
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 101
			match(RPARENCHAR) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class CompilerOptionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_compilerOption.id
	        set(value) { throw RuntimeException() }
		fun ADATA() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.ADATA.id, 0)
		fun ADV() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.ADV.id, 0)
		fun APOST() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.APOST.id, 0)
		fun LPARENCHAR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.LPARENCHAR.id, 0)
		fun RPARENCHAR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.RPARENCHAR.id, 0)
		fun ARITH() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.ARITH.id, 0)
		fun AR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.AR.id, 0)
		fun EXTEND() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.EXTEND.id, 0)
		fun E_CHAR() : List<TerminalNode> = getTokens(Cobol85PreprocessorParser.Tokens.E_CHAR.id)
		fun E_CHAR(i: Int) : TerminalNode = getToken(Cobol85PreprocessorParser.Tokens.E_CHAR.id, i) as TerminalNode
		fun COMPAT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.COMPAT.id, 0)
		fun C_CHAR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.C_CHAR.id, 0)
		fun AWO() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.AWO.id, 0)
		fun BLOCK0() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.BLOCK0.id, 0)
		fun findLiteral() : List<LiteralContext> = getRuleContexts(solver.getType("LiteralContext"))
		fun findLiteral(i: Int) : LiteralContext? = getRuleContext(solver.getType("LiteralContext"),i)
		fun BUFSIZE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.BUFSIZE.id, 0)
		fun BUF() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.BUF.id, 0)
		fun CBLCARD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.CBLCARD.id, 0)
		fun CICS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.CICS.id, 0)
		fun COBOL2() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.COBOL2.id, 0)
		fun COBOL3() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.COBOL3.id, 0)
		fun CODEPAGE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.CODEPAGE.id, 0)
		fun CP() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.CP.id, 0)
		fun COMPILE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.COMPILE.id, 0)
		fun CPP() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.CPP.id, 0)
		fun CPSM() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.CPSM.id, 0)
		fun CURRENCY() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.CURRENCY.id, 0)
		fun CURR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.CURR.id, 0)
		fun DATA() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DATA.id, 0)
		fun DATEPROC() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DATEPROC.id, 0)
		fun DP() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DP.id, 0)
		fun COMMACHAR() : List<TerminalNode> = getTokens(Cobol85PreprocessorParser.Tokens.COMMACHAR.id)
		fun COMMACHAR(i: Int) : TerminalNode = getToken(Cobol85PreprocessorParser.Tokens.COMMACHAR.id, i) as TerminalNode
		fun FLAG() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.FLAG.id, 0)
		fun NOFLAG() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOFLAG.id, 0)
		fun TRIG() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.TRIG.id, 0)
		fun NOTRIG() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOTRIG.id, 0)
		fun DBCS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DBCS.id, 0)
		fun DECK() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DECK.id, 0)
		fun D_CHAR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.D_CHAR.id, 0)
		fun DEBUG() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DEBUG.id, 0)
		fun DIAGTRUNC() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DIAGTRUNC.id, 0)
		fun DTR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DTR.id, 0)
		fun DLL() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DLL.id, 0)
		fun DUMP() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DUMP.id, 0)
		fun DU() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DU.id, 0)
		fun DYNAM() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DYNAM.id, 0)
		fun DYN() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DYN.id, 0)
		fun EDF() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.EDF.id, 0)
		fun EPILOG() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.EPILOG.id, 0)
		fun EXIT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.EXIT.id, 0)
		fun EXPORTALL() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.EXPORTALL.id, 0)
		fun EXP() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.EXP.id, 0)
		fun FASTSRT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.FASTSRT.id, 0)
		fun FSRT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.FSRT.id, 0)
		fun FEPI() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.FEPI.id, 0)
		fun F_CHAR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.F_CHAR.id, 0)
		fun I_CHAR() : List<TerminalNode> = getTokens(Cobol85PreprocessorParser.Tokens.I_CHAR.id)
		fun I_CHAR(i: Int) : TerminalNode = getToken(Cobol85PreprocessorParser.Tokens.I_CHAR.id, i) as TerminalNode
		fun S_CHAR() : List<TerminalNode> = getTokens(Cobol85PreprocessorParser.Tokens.S_CHAR.id)
		fun S_CHAR(i: Int) : TerminalNode = getToken(Cobol85PreprocessorParser.Tokens.S_CHAR.id, i) as TerminalNode
		fun U_CHAR() : List<TerminalNode> = getTokens(Cobol85PreprocessorParser.Tokens.U_CHAR.id)
		fun U_CHAR(i: Int) : TerminalNode = getToken(Cobol85PreprocessorParser.Tokens.U_CHAR.id, i) as TerminalNode
		fun W_CHAR() : List<TerminalNode> = getTokens(Cobol85PreprocessorParser.Tokens.W_CHAR.id)
		fun W_CHAR(i: Int) : TerminalNode = getToken(Cobol85PreprocessorParser.Tokens.W_CHAR.id, i) as TerminalNode
		fun FLAGSTD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.FLAGSTD.id, 0)
		fun M_CHAR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.M_CHAR.id, 0)
		fun H_CHAR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.H_CHAR.id, 0)
		fun DD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DD.id, 0)
		fun N_CHAR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.N_CHAR.id, 0)
		fun NN() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NN.id, 0)
		fun SS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SS.id, 0)
		fun GDS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.GDS.id, 0)
		fun GRAPHIC() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.GRAPHIC.id, 0)
		fun INTDATE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.INTDATE.id, 0)
		fun ANSI() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.ANSI.id, 0)
		fun LILIAN() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.LILIAN.id, 0)
		fun LANGUAGE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.LANGUAGE.id, 0)
		fun LANG() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.LANG.id, 0)
		fun ENGLISH() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.ENGLISH.id, 0)
		fun CS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.CS.id, 0)
		fun EN() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.EN.id, 0)
		fun JA() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.JA.id, 0)
		fun JP() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.JP.id, 0)
		fun KA() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.KA.id, 0)
		fun UE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.UE.id, 0)
		fun LEASM() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.LEASM.id, 0)
		fun LENGTH() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.LENGTH.id, 0)
		fun LIB() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.LIB.id, 0)
		fun LIN() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.LIN.id, 0)
		fun LINECOUNT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.LINECOUNT.id, 0)
		fun LC() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.LC.id, 0)
		fun LINKAGE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.LINKAGE.id, 0)
		fun LIST() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.LIST.id, 0)
		fun MAP() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.MAP.id, 0)
		fun MARGINS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.MARGINS.id, 0)
		fun MDECK() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.MDECK.id, 0)
		fun MD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.MD.id, 0)
		fun NOC() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOC.id, 0)
		fun NOCOMPILE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOCOMPILE.id, 0)
		fun NAME() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NAME.id, 0)
		fun ALIAS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.ALIAS.id, 0)
		fun NOALIAS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOALIAS.id, 0)
		fun NATLANG() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NATLANG.id, 0)
		fun NOADATA() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOADATA.id, 0)
		fun NOADV() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOADV.id, 0)
		fun NOAWO() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOAWO.id, 0)
		fun NOBLOCK0() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOBLOCK0.id, 0)
		fun NOCBLCARD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOCBLCARD.id, 0)
		fun NOCICS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOCICS.id, 0)
		fun NOCMPR2() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOCMPR2.id, 0)
		fun NOCPSM() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOCPSM.id, 0)
		fun NOCURRENCY() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOCURRENCY.id, 0)
		fun NOCURR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOCURR.id, 0)
		fun NODATEPROC() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NODATEPROC.id, 0)
		fun NODP() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NODP.id, 0)
		fun NODBCS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NODBCS.id, 0)
		fun NODEBUG() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NODEBUG.id, 0)
		fun NODECK() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NODECK.id, 0)
		fun NOD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOD.id, 0)
		fun NODLL() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NODLL.id, 0)
		fun NODE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NODE.id, 0)
		fun NODUMP() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NODUMP.id, 0)
		fun NODU() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NODU.id, 0)
		fun NODIAGTRUNC() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NODIAGTRUNC.id, 0)
		fun NODTR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NODTR.id, 0)
		fun NODYNAM() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NODYNAM.id, 0)
		fun NODYN() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NODYN.id, 0)
		fun NOEDF() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOEDF.id, 0)
		fun NOEPILOG() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOEPILOG.id, 0)
		fun NOEXIT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOEXIT.id, 0)
		fun NOEXPORTALL() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOEXPORTALL.id, 0)
		fun NOEXP() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOEXP.id, 0)
		fun NOFASTSRT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOFASTSRT.id, 0)
		fun NOFSRT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOFSRT.id, 0)
		fun NOFEPI() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOFEPI.id, 0)
		fun NOF() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOF.id, 0)
		fun NOFLAGMIG() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOFLAGMIG.id, 0)
		fun NOFLAGSTD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOFLAGSTD.id, 0)
		fun NOGRAPHIC() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOGRAPHIC.id, 0)
		fun NOLENGTH() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOLENGTH.id, 0)
		fun NOLIB() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOLIB.id, 0)
		fun NOLINKAGE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOLINKAGE.id, 0)
		fun NOLIST() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOLIST.id, 0)
		fun NOMAP() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOMAP.id, 0)
		fun NOMDECK() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOMDECK.id, 0)
		fun NOMD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOMD.id, 0)
		fun NONAME() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NONAME.id, 0)
		fun NONUMBER() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NONUMBER.id, 0)
		fun NONUM() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NONUM.id, 0)
		fun NOOBJECT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOOBJECT.id, 0)
		fun NOOBJ() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOOBJ.id, 0)
		fun NOOFFSET() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOOFFSET.id, 0)
		fun NOOFF() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOOFF.id, 0)
		fun NOOPSEQUENCE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOOPSEQUENCE.id, 0)
		fun NOOPTIMIZE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOOPTIMIZE.id, 0)
		fun NOOPT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOOPT.id, 0)
		fun NOOPTIONS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOOPTIONS.id, 0)
		fun NOP() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOP.id, 0)
		fun NOPROLOG() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOPROLOG.id, 0)
		fun NORENT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NORENT.id, 0)
		fun NOSEQUENCE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOSEQUENCE.id, 0)
		fun NOSEQ() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOSEQ.id, 0)
		fun NOSOURCE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOSOURCE.id, 0)
		fun NOS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOS.id, 0)
		fun NOSPIE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOSPIE.id, 0)
		fun NOSQL() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOSQL.id, 0)
		fun NOSQLCCSID() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOSQLCCSID.id, 0)
		fun NOSQLC() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOSQLC.id, 0)
		fun NOSSRANGE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOSSRANGE.id, 0)
		fun NOSSR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOSSR.id, 0)
		fun NOSTDTRUNC() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOSTDTRUNC.id, 0)
		fun NOTERMINAL() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOTERMINAL.id, 0)
		fun NOTERM() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOTERM.id, 0)
		fun NOTEST() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOTEST.id, 0)
		fun NOTHREAD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOTHREAD.id, 0)
		fun NOVBREF() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOVBREF.id, 0)
		fun NOWORD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOWORD.id, 0)
		fun NOWD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOWD.id, 0)
		fun NSEQ() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NSEQ.id, 0)
		fun NSYMBOL() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NSYMBOL.id, 0)
		fun NS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NS.id, 0)
		fun NATIONAL() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NATIONAL.id, 0)
		fun NAT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NAT.id, 0)
		fun NOXREF() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOXREF.id, 0)
		fun NOX() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOX.id, 0)
		fun NOZWB() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOZWB.id, 0)
		fun NUMBER() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NUMBER.id, 0)
		fun NUM() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NUM.id, 0)
		fun NUMPROC() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NUMPROC.id, 0)
		fun MIG() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.MIG.id, 0)
		fun NOPFD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOPFD.id, 0)
		fun PFD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.PFD.id, 0)
		fun OBJECT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.OBJECT.id, 0)
		fun OBJ() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.OBJ.id, 0)
		fun OFFSET() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.OFFSET.id, 0)
		fun OFF() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.OFF.id, 0)
		fun OPMARGINS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.OPMARGINS.id, 0)
		fun OPSEQUENCE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.OPSEQUENCE.id, 0)
		fun OPTIMIZE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.OPTIMIZE.id, 0)
		fun OPT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.OPT.id, 0)
		fun FULL() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.FULL.id, 0)
		fun STD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.STD.id, 0)
		fun OPTFILE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.OPTFILE.id, 0)
		fun OPTIONS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.OPTIONS.id, 0)
		fun OP() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.OP.id, 0)
		fun findCobolWord() : CobolWordContext? = getRuleContext(solver.getType("CobolWordContext"),0)
		fun OUTDD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.OUTDD.id, 0)
		fun OUT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.OUT.id, 0)
		fun PGMNAME() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.PGMNAME.id, 0)
		fun PGMN() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.PGMN.id, 0)
		fun CO() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.CO.id, 0)
		fun LM() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.LM.id, 0)
		fun LONGMIXED() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.LONGMIXED.id, 0)
		fun LONGUPPER() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.LONGUPPER.id, 0)
		fun LU() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.LU.id, 0)
		fun MIXED() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.MIXED.id, 0)
		fun UPPER() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.UPPER.id, 0)
		fun PROLOG() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.PROLOG.id, 0)
		fun QUOTE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.QUOTE.id, 0)
		fun Q_CHAR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.Q_CHAR.id, 0)
		fun RENT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.RENT.id, 0)
		fun RMODE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.RMODE.id, 0)
		fun ANY() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.ANY.id, 0)
		fun AUTO() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.AUTO.id, 0)
		fun SEQUENCE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SEQUENCE.id, 0)
		fun SEQ() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SEQ.id, 0)
		fun SIZE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SIZE.id, 0)
		fun SZ() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SZ.id, 0)
		fun MAX() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.MAX.id, 0)
		fun SOURCE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SOURCE.id, 0)
		fun SP() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SP.id, 0)
		fun SPACE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SPACE.id, 0)
		fun SPIE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SPIE.id, 0)
		fun SQL() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SQL.id, 0)
		fun SQLCCSID() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SQLCCSID.id, 0)
		fun SQLC() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SQLC.id, 0)
		fun SSRANGE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SSRANGE.id, 0)
		fun SSR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SSR.id, 0)
		fun SYSEIB() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SYSEIB.id, 0)
		fun TERMINAL() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.TERMINAL.id, 0)
		fun TERM() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.TERM.id, 0)
		fun TEST() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.TEST.id, 0)
		fun HOOK() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.HOOK.id, 0)
		fun NOHOOK() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOHOOK.id, 0)
		fun SEP() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SEP.id, 0)
		fun SEPARATE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SEPARATE.id, 0)
		fun NOSEP() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOSEP.id, 0)
		fun NOSEPARATE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOSEPARATE.id, 0)
		fun EJPD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.EJPD.id, 0)
		fun NOEJPD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOEJPD.id, 0)
		fun THREAD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.THREAD.id, 0)
		fun TRUNC() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.TRUNC.id, 0)
		fun BIN() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.BIN.id, 0)
		fun VBREF() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.VBREF.id, 0)
		fun WORD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.WORD.id, 0)
		fun WD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.WD.id, 0)
		fun XMLPARSE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.XMLPARSE.id, 0)
		fun XP() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.XP.id, 0)
		fun XMLSS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.XMLSS.id, 0)
		fun X_CHAR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.X_CHAR.id, 0)
		fun XREF() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.XREF.id, 0)
		fun SHORT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SHORT.id, 0)
		fun YEARWINDOW() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.YEARWINDOW.id, 0)
		fun YW() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.YW.id, 0)
		fun ZWB() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.ZWB.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).enterCompilerOption(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).exitCompilerOption(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is Cobol85PreprocessorVisitor ) return (visitor as Cobol85PreprocessorVisitor<out T>).visitCompilerOption(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  compilerOption() : CompilerOptionContext {
		var _localctx : CompilerOptionContext = CompilerOptionContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_compilerOption.id)
		var _la: Int
		try {
			this.state = 445
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,32,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 103
			match(ADATA) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 104
			match(ADV) as Token
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 105
			match(APOST) as Token
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 106
			_la = _input!!.LA(1)
			if ( !(_la==AR || _la==ARITH) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 107
			match(LPARENCHAR) as Token
			this.state = 108
			_la = _input!!.LA(1)
			if ( !(_la==COMPAT || _la==EXTEND || _la==C_CHAR || _la==E_CHAR) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 109
			match(RPARENCHAR) as Token
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 110
			match(AWO) as Token
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 111
			match(BLOCK0) as Token
			}}
			7 -> {
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 112
			_la = _input!!.LA(1)
			if ( !(_la==BUF || _la==BUFSIZE) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 113
			match(LPARENCHAR) as Token
			this.state = 114
			literal()
			this.state = 115
			match(RPARENCHAR) as Token
			}}
			8 -> {
			enterOuterAlt(_localctx, 8)
			if (true){
			this.state = 117
			match(CBLCARD) as Token
			}}
			9 -> {
			enterOuterAlt(_localctx, 9)
			if (true){
			this.state = 118
			match(CICS) as Token
			this.state = 123
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,7,context) ) {
			1   -> if (true){
			this.state = 119
			match(LPARENCHAR) as Token
			this.state = 120
			literal()
			this.state = 121
			match(RPARENCHAR) as Token
			}
			}
			}}
			10 -> {
			enterOuterAlt(_localctx, 10)
			if (true){
			this.state = 125
			match(COBOL2) as Token
			}}
			11 -> {
			enterOuterAlt(_localctx, 11)
			if (true){
			this.state = 126
			match(COBOL3) as Token
			}}
			12 -> {
			enterOuterAlt(_localctx, 12)
			if (true){
			this.state = 127
			_la = _input!!.LA(1)
			if ( !(_la==CODEPAGE || _la==CP) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 128
			match(LPARENCHAR) as Token
			this.state = 129
			literal()
			this.state = 130
			match(RPARENCHAR) as Token
			}}
			13 -> {
			enterOuterAlt(_localctx, 13)
			if (true){
			this.state = 132
			_la = _input!!.LA(1)
			if ( !(_la==COMPILE || _la==C_CHAR) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			14 -> {
			enterOuterAlt(_localctx, 14)
			if (true){
			this.state = 133
			match(CPP) as Token
			}}
			15 -> {
			enterOuterAlt(_localctx, 15)
			if (true){
			this.state = 134
			match(CPSM) as Token
			}}
			16 -> {
			enterOuterAlt(_localctx, 16)
			if (true){
			this.state = 135
			_la = _input!!.LA(1)
			if ( !(_la==CURR || _la==CURRENCY) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 136
			match(LPARENCHAR) as Token
			this.state = 137
			literal()
			this.state = 138
			match(RPARENCHAR) as Token
			}}
			17 -> {
			enterOuterAlt(_localctx, 17)
			if (true){
			this.state = 140
			match(DATA) as Token
			this.state = 141
			match(LPARENCHAR) as Token
			this.state = 142
			literal()
			this.state = 143
			match(RPARENCHAR) as Token
			}}
			18 -> {
			enterOuterAlt(_localctx, 18)
			if (true){
			this.state = 145
			_la = _input!!.LA(1)
			if ( !(_la==DATEPROC || _la==DP) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 157
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,11,context) ) {
			1   -> if (true){
			this.state = 146
			match(LPARENCHAR) as Token
			this.state = 148
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==FLAG || _la==NOFLAG) {
				if (true){
				this.state = 147
				_la = _input!!.LA(1)
				if ( !(_la==FLAG || _la==NOFLAG) ) {
					errorHandler.recoverInline(this)
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				}
			}

			this.state = 151
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COMMACHAR) {
				if (true){
				this.state = 150
				match(COMMACHAR) as Token
				}
			}

			this.state = 154
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==NOTRIG || _la==TRIG) {
				if (true){
				this.state = 153
				_la = _input!!.LA(1)
				if ( !(_la==NOTRIG || _la==TRIG) ) {
					errorHandler.recoverInline(this)
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				}
			}

			this.state = 156
			match(RPARENCHAR) as Token
			}
			}
			}}
			19 -> {
			enterOuterAlt(_localctx, 19)
			if (true){
			this.state = 159
			match(DBCS) as Token
			}}
			20 -> {
			enterOuterAlt(_localctx, 20)
			if (true){
			this.state = 160
			_la = _input!!.LA(1)
			if ( !(_la==DECK || _la==D_CHAR) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			21 -> {
			enterOuterAlt(_localctx, 21)
			if (true){
			this.state = 161
			match(DEBUG) as Token
			}}
			22 -> {
			enterOuterAlt(_localctx, 22)
			if (true){
			this.state = 162
			_la = _input!!.LA(1)
			if ( !(_la==DIAGTRUNC || _la==DTR) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			23 -> {
			enterOuterAlt(_localctx, 23)
			if (true){
			this.state = 163
			match(DLL) as Token
			}}
			24 -> {
			enterOuterAlt(_localctx, 24)
			if (true){
			this.state = 164
			_la = _input!!.LA(1)
			if ( !(_la==DU || _la==DUMP) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			25 -> {
			enterOuterAlt(_localctx, 25)
			if (true){
			this.state = 165
			_la = _input!!.LA(1)
			if ( !(_la==DYN || _la==DYNAM) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			26 -> {
			enterOuterAlt(_localctx, 26)
			if (true){
			this.state = 166
			match(EDF) as Token
			}}
			27 -> {
			enterOuterAlt(_localctx, 27)
			if (true){
			this.state = 167
			match(EPILOG) as Token
			}}
			28 -> {
			enterOuterAlt(_localctx, 28)
			if (true){
			this.state = 168
			match(EXIT) as Token
			}}
			29 -> {
			enterOuterAlt(_localctx, 29)
			if (true){
			this.state = 169
			_la = _input!!.LA(1)
			if ( !(_la==EXP || _la==EXPORTALL) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			30 -> {
			enterOuterAlt(_localctx, 30)
			if (true){
			this.state = 170
			_la = _input!!.LA(1)
			if ( !(_la==FASTSRT || _la==FSRT) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			31 -> {
			enterOuterAlt(_localctx, 31)
			if (true){
			this.state = 171
			match(FEPI) as Token
			}}
			32 -> {
			enterOuterAlt(_localctx, 32)
			if (true){
			this.state = 172
			_la = _input!!.LA(1)
			if ( !(_la==FLAG || _la==F_CHAR) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 173
			match(LPARENCHAR) as Token
			this.state = 174
			_la = _input!!.LA(1)
			if ( !(((((_la - 270)) and 0x3f.inv()) == 0 && ((1L shl (_la - 270)) and ((1L shl (E_CHAR - 270)) or (1L shl (I_CHAR - 270)) or (1L shl (S_CHAR - 270)) or (1L shl (U_CHAR - 270)) or (1L shl (W_CHAR - 270)))) != 0L)) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 177
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COMMACHAR) {
				if (true){
				this.state = 175
				match(COMMACHAR) as Token
				this.state = 176
				_la = _input!!.LA(1)
				if ( !(((((_la - 270)) and 0x3f.inv()) == 0 && ((1L shl (_la - 270)) and ((1L shl (E_CHAR - 270)) or (1L shl (I_CHAR - 270)) or (1L shl (S_CHAR - 270)) or (1L shl (U_CHAR - 270)) or (1L shl (W_CHAR - 270)))) != 0L)) ) {
					errorHandler.recoverInline(this)
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				}
			}

			this.state = 179
			match(RPARENCHAR) as Token
			}}
			33 -> {
			enterOuterAlt(_localctx, 33)
			if (true){
			this.state = 180
			match(FLAGSTD) as Token
			this.state = 181
			match(LPARENCHAR) as Token
			this.state = 182
			_la = _input!!.LA(1)
			if ( !(((((_la - 272)) and 0x3f.inv()) == 0 && ((1L shl (_la - 272)) and ((1L shl (H_CHAR - 272)) or (1L shl (I_CHAR - 272)) or (1L shl (M_CHAR - 272)))) != 0L)) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 185
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COMMACHAR) {
				if (true){
				this.state = 183
				match(COMMACHAR) as Token
				this.state = 184
				_la = _input!!.LA(1)
				if ( !(_la==DD || _la==NN || ((((_la - 241)) and 0x3f.inv()) == 0 && ((1L shl (_la - 241)) and ((1L shl (SS - 241)) or (1L shl (D_CHAR - 241)) or (1L shl (N_CHAR - 241)) or (1L shl (S_CHAR - 241)))) != 0L)) ) {
					errorHandler.recoverInline(this)
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				}
			}

			this.state = 187
			match(RPARENCHAR) as Token
			}}
			34 -> {
			enterOuterAlt(_localctx, 34)
			if (true){
			this.state = 188
			match(GDS) as Token
			}}
			35 -> {
			enterOuterAlt(_localctx, 35)
			if (true){
			this.state = 189
			match(GRAPHIC) as Token
			}}
			36 -> {
			enterOuterAlt(_localctx, 36)
			if (true){
			this.state = 190
			match(INTDATE) as Token
			this.state = 191
			match(LPARENCHAR) as Token
			this.state = 192
			_la = _input!!.LA(1)
			if ( !(_la==ANSI || _la==LILIAN) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 193
			match(RPARENCHAR) as Token
			}}
			37 -> {
			enterOuterAlt(_localctx, 37)
			if (true){
			this.state = 194
			_la = _input!!.LA(1)
			if ( !(_la==LANG || _la==LANGUAGE) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 195
			match(LPARENCHAR) as Token
			this.state = 196
			_la = _input!!.LA(1)
			if ( !(((((_la - 29)) and 0x3f.inv()) == 0 && ((1L shl (_la - 29)) and ((1L shl (CS - 29)) or (1L shl (EN - 29)) or (1L shl (ENGLISH - 29)) or (1L shl (JA - 29)) or (1L shl (JP - 29)) or (1L shl (KA - 29)))) != 0L) || _la==UE) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 197
			match(RPARENCHAR) as Token
			}}
			38 -> {
			enterOuterAlt(_localctx, 38)
			if (true){
			this.state = 198
			match(LEASM) as Token
			}}
			39 -> {
			enterOuterAlt(_localctx, 39)
			if (true){
			this.state = 199
			match(LENGTH) as Token
			}}
			40 -> {
			enterOuterAlt(_localctx, 40)
			if (true){
			this.state = 200
			match(LIB) as Token
			}}
			41 -> {
			enterOuterAlt(_localctx, 41)
			if (true){
			this.state = 201
			match(LIN) as Token
			}}
			42 -> {
			enterOuterAlt(_localctx, 42)
			if (true){
			this.state = 202
			_la = _input!!.LA(1)
			if ( !(_la==LC || _la==LINECOUNT) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 203
			match(LPARENCHAR) as Token
			this.state = 204
			literal()
			this.state = 205
			match(RPARENCHAR) as Token
			}}
			43 -> {
			enterOuterAlt(_localctx, 43)
			if (true){
			this.state = 207
			match(LINKAGE) as Token
			}}
			44 -> {
			enterOuterAlt(_localctx, 44)
			if (true){
			this.state = 208
			match(LIST) as Token
			}}
			45 -> {
			enterOuterAlt(_localctx, 45)
			if (true){
			this.state = 209
			match(MAP) as Token
			}}
			46 -> {
			enterOuterAlt(_localctx, 46)
			if (true){
			this.state = 210
			match(MARGINS) as Token
			this.state = 211
			match(LPARENCHAR) as Token
			this.state = 212
			literal()
			this.state = 213
			match(COMMACHAR) as Token
			this.state = 214
			literal()
			this.state = 217
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COMMACHAR) {
				if (true){
				this.state = 215
				match(COMMACHAR) as Token
				this.state = 216
				literal()
				}
			}

			this.state = 219
			match(RPARENCHAR) as Token
			}}
			47 -> {
			enterOuterAlt(_localctx, 47)
			if (true){
			this.state = 221
			_la = _input!!.LA(1)
			if ( !(_la==MD || _la==MDECK) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 225
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,15,context) ) {
			1   -> if (true){
			this.state = 222
			match(LPARENCHAR) as Token
			this.state = 223
			_la = _input!!.LA(1)
			if ( !(_la==COMPILE || _la==NOC || _la==NOCOMPILE || _la==C_CHAR) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 224
			match(RPARENCHAR) as Token
			}
			}
			}}
			48 -> {
			enterOuterAlt(_localctx, 48)
			if (true){
			this.state = 227
			match(NAME) as Token
			this.state = 231
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,16,context) ) {
			1   -> if (true){
			this.state = 228
			match(LPARENCHAR) as Token
			this.state = 229
			_la = _input!!.LA(1)
			if ( !(_la==ALIAS || _la==NOALIAS) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 230
			match(RPARENCHAR) as Token
			}
			}
			}}
			49 -> {
			enterOuterAlt(_localctx, 49)
			if (true){
			this.state = 233
			match(NATLANG) as Token
			this.state = 234
			match(LPARENCHAR) as Token
			this.state = 235
			_la = _input!!.LA(1)
			if ( !(((((_la - 29)) and 0x3f.inv()) == 0 && ((1L shl (_la - 29)) and ((1L shl (CS - 29)) or (1L shl (EN - 29)) or (1L shl (KA - 29)))) != 0L)) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 236
			match(RPARENCHAR) as Token
			}}
			50 -> {
			enterOuterAlt(_localctx, 50)
			if (true){
			this.state = 237
			match(NOADATA) as Token
			}}
			51 -> {
			enterOuterAlt(_localctx, 51)
			if (true){
			this.state = 238
			match(NOADV) as Token
			}}
			52 -> {
			enterOuterAlt(_localctx, 52)
			if (true){
			this.state = 239
			match(NOAWO) as Token
			}}
			53 -> {
			enterOuterAlt(_localctx, 53)
			if (true){
			this.state = 240
			match(NOBLOCK0) as Token
			}}
			54 -> {
			enterOuterAlt(_localctx, 54)
			if (true){
			this.state = 241
			match(NOCBLCARD) as Token
			}}
			55 -> {
			enterOuterAlt(_localctx, 55)
			if (true){
			this.state = 242
			match(NOCICS) as Token
			}}
			56 -> {
			enterOuterAlt(_localctx, 56)
			if (true){
			this.state = 243
			match(NOCMPR2) as Token
			}}
			57 -> {
			enterOuterAlt(_localctx, 57)
			if (true){
			this.state = 244
			_la = _input!!.LA(1)
			if ( !(_la==NOC || _la==NOCOMPILE) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 248
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,17,context) ) {
			1   -> if (true){
			this.state = 245
			match(LPARENCHAR) as Token
			this.state = 246
			_la = _input!!.LA(1)
			if ( !(((((_la - 270)) and 0x3f.inv()) == 0 && ((1L shl (_la - 270)) and ((1L shl (E_CHAR - 270)) or (1L shl (S_CHAR - 270)) or (1L shl (W_CHAR - 270)))) != 0L)) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 247
			match(RPARENCHAR) as Token
			}
			}
			}}
			58 -> {
			enterOuterAlt(_localctx, 58)
			if (true){
			this.state = 250
			match(NOCPSM) as Token
			}}
			59 -> {
			enterOuterAlt(_localctx, 59)
			if (true){
			this.state = 251
			_la = _input!!.LA(1)
			if ( !(_la==NOCURR || _la==NOCURRENCY) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			60 -> {
			enterOuterAlt(_localctx, 60)
			if (true){
			this.state = 252
			_la = _input!!.LA(1)
			if ( !(_la==NODATEPROC || _la==NODP) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			61 -> {
			enterOuterAlt(_localctx, 61)
			if (true){
			this.state = 253
			match(NODBCS) as Token
			}}
			62 -> {
			enterOuterAlt(_localctx, 62)
			if (true){
			this.state = 254
			match(NODEBUG) as Token
			}}
			63 -> {
			enterOuterAlt(_localctx, 63)
			if (true){
			this.state = 255
			_la = _input!!.LA(1)
			if ( !(_la==NOD || _la==NODECK) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			64 -> {
			enterOuterAlt(_localctx, 64)
			if (true){
			this.state = 256
			match(NODLL) as Token
			}}
			65 -> {
			enterOuterAlt(_localctx, 65)
			if (true){
			this.state = 257
			match(NODE) as Token
			}}
			66 -> {
			enterOuterAlt(_localctx, 66)
			if (true){
			this.state = 258
			_la = _input!!.LA(1)
			if ( !(_la==NODU || _la==NODUMP) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			67 -> {
			enterOuterAlt(_localctx, 67)
			if (true){
			this.state = 259
			_la = _input!!.LA(1)
			if ( !(_la==NODIAGTRUNC || _la==NODTR) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			68 -> {
			enterOuterAlt(_localctx, 68)
			if (true){
			this.state = 260
			_la = _input!!.LA(1)
			if ( !(_la==NODYN || _la==NODYNAM) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			69 -> {
			enterOuterAlt(_localctx, 69)
			if (true){
			this.state = 261
			match(NOEDF) as Token
			}}
			70 -> {
			enterOuterAlt(_localctx, 70)
			if (true){
			this.state = 262
			match(NOEPILOG) as Token
			}}
			71 -> {
			enterOuterAlt(_localctx, 71)
			if (true){
			this.state = 263
			match(NOEXIT) as Token
			}}
			72 -> {
			enterOuterAlt(_localctx, 72)
			if (true){
			this.state = 264
			_la = _input!!.LA(1)
			if ( !(_la==NOEXP || _la==NOEXPORTALL) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			73 -> {
			enterOuterAlt(_localctx, 73)
			if (true){
			this.state = 265
			_la = _input!!.LA(1)
			if ( !(_la==NOFASTSRT || _la==NOFSRT) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			74 -> {
			enterOuterAlt(_localctx, 74)
			if (true){
			this.state = 266
			match(NOFEPI) as Token
			}}
			75 -> {
			enterOuterAlt(_localctx, 75)
			if (true){
			this.state = 267
			_la = _input!!.LA(1)
			if ( !(_la==NOF || _la==NOFLAG) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			76 -> {
			enterOuterAlt(_localctx, 76)
			if (true){
			this.state = 268
			match(NOFLAGMIG) as Token
			}}
			77 -> {
			enterOuterAlt(_localctx, 77)
			if (true){
			this.state = 269
			match(NOFLAGSTD) as Token
			}}
			78 -> {
			enterOuterAlt(_localctx, 78)
			if (true){
			this.state = 270
			match(NOGRAPHIC) as Token
			}}
			79 -> {
			enterOuterAlt(_localctx, 79)
			if (true){
			this.state = 271
			match(NOLENGTH) as Token
			}}
			80 -> {
			enterOuterAlt(_localctx, 80)
			if (true){
			this.state = 272
			match(NOLIB) as Token
			}}
			81 -> {
			enterOuterAlt(_localctx, 81)
			if (true){
			this.state = 273
			match(NOLINKAGE) as Token
			}}
			82 -> {
			enterOuterAlt(_localctx, 82)
			if (true){
			this.state = 274
			match(NOLIST) as Token
			}}
			83 -> {
			enterOuterAlt(_localctx, 83)
			if (true){
			this.state = 275
			match(NOMAP) as Token
			}}
			84 -> {
			enterOuterAlt(_localctx, 84)
			if (true){
			this.state = 276
			_la = _input!!.LA(1)
			if ( !(_la==NOMD || _la==NOMDECK) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			85 -> {
			enterOuterAlt(_localctx, 85)
			if (true){
			this.state = 277
			match(NONAME) as Token
			}}
			86 -> {
			enterOuterAlt(_localctx, 86)
			if (true){
			this.state = 278
			_la = _input!!.LA(1)
			if ( !(_la==NONUM || _la==NONUMBER) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			87 -> {
			enterOuterAlt(_localctx, 87)
			if (true){
			this.state = 279
			_la = _input!!.LA(1)
			if ( !(_la==NOOBJ || _la==NOOBJECT) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			88 -> {
			enterOuterAlt(_localctx, 88)
			if (true){
			this.state = 280
			_la = _input!!.LA(1)
			if ( !(_la==NOOFF || _la==NOOFFSET) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			89 -> {
			enterOuterAlt(_localctx, 89)
			if (true){
			this.state = 281
			match(NOOPSEQUENCE) as Token
			}}
			90 -> {
			enterOuterAlt(_localctx, 90)
			if (true){
			this.state = 282
			_la = _input!!.LA(1)
			if ( !(_la==NOOPT || _la==NOOPTIMIZE) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			91 -> {
			enterOuterAlt(_localctx, 91)
			if (true){
			this.state = 283
			match(NOOPTIONS) as Token
			}}
			92 -> {
			enterOuterAlt(_localctx, 92)
			if (true){
			this.state = 284
			match(NOP) as Token
			}}
			93 -> {
			enterOuterAlt(_localctx, 93)
			if (true){
			this.state = 285
			match(NOPROLOG) as Token
			}}
			94 -> {
			enterOuterAlt(_localctx, 94)
			if (true){
			this.state = 286
			match(NORENT) as Token
			}}
			95 -> {
			enterOuterAlt(_localctx, 95)
			if (true){
			this.state = 287
			_la = _input!!.LA(1)
			if ( !(_la==NOSEQ || _la==NOSEQUENCE) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			96 -> {
			enterOuterAlt(_localctx, 96)
			if (true){
			this.state = 288
			_la = _input!!.LA(1)
			if ( !(_la==NOS || _la==NOSOURCE) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			97 -> {
			enterOuterAlt(_localctx, 97)
			if (true){
			this.state = 289
			match(NOSPIE) as Token
			}}
			98 -> {
			enterOuterAlt(_localctx, 98)
			if (true){
			this.state = 290
			match(NOSQL) as Token
			}}
			99 -> {
			enterOuterAlt(_localctx, 99)
			if (true){
			this.state = 291
			_la = _input!!.LA(1)
			if ( !(_la==NOSQLC || _la==NOSQLCCSID) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			100 -> {
			enterOuterAlt(_localctx, 100)
			if (true){
			this.state = 292
			_la = _input!!.LA(1)
			if ( !(_la==NOSSR || _la==NOSSRANGE) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			101 -> {
			enterOuterAlt(_localctx, 101)
			if (true){
			this.state = 293
			match(NOSTDTRUNC) as Token
			}}
			102 -> {
			enterOuterAlt(_localctx, 102)
			if (true){
			this.state = 294
			_la = _input!!.LA(1)
			if ( !(_la==NOTERM || _la==NOTERMINAL) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			103 -> {
			enterOuterAlt(_localctx, 103)
			if (true){
			this.state = 295
			match(NOTEST) as Token
			}}
			104 -> {
			enterOuterAlt(_localctx, 104)
			if (true){
			this.state = 296
			match(NOTHREAD) as Token
			}}
			105 -> {
			enterOuterAlt(_localctx, 105)
			if (true){
			this.state = 297
			match(NOVBREF) as Token
			}}
			106 -> {
			enterOuterAlt(_localctx, 106)
			if (true){
			this.state = 298
			_la = _input!!.LA(1)
			if ( !(_la==NOWD || _la==NOWORD) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			107 -> {
			enterOuterAlt(_localctx, 107)
			if (true){
			this.state = 299
			match(NSEQ) as Token
			}}
			108 -> {
			enterOuterAlt(_localctx, 108)
			if (true){
			this.state = 300
			_la = _input!!.LA(1)
			if ( !(_la==NS || _la==NSYMBOL) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 301
			match(LPARENCHAR) as Token
			this.state = 302
			_la = _input!!.LA(1)
			if ( !(_la==DBCS || _la==NAT || _la==NATIONAL) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 303
			match(RPARENCHAR) as Token
			}}
			109 -> {
			enterOuterAlt(_localctx, 109)
			if (true){
			this.state = 304
			match(NOVBREF) as Token
			}}
			110 -> {
			enterOuterAlt(_localctx, 110)
			if (true){
			this.state = 305
			_la = _input!!.LA(1)
			if ( !(_la==NOX || _la==NOXREF) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			111 -> {
			enterOuterAlt(_localctx, 111)
			if (true){
			this.state = 306
			match(NOZWB) as Token
			}}
			112 -> {
			enterOuterAlt(_localctx, 112)
			if (true){
			this.state = 307
			_la = _input!!.LA(1)
			if ( !(_la==NUM || _la==NUMBER) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			113 -> {
			enterOuterAlt(_localctx, 113)
			if (true){
			this.state = 308
			match(NUMPROC) as Token
			this.state = 309
			match(LPARENCHAR) as Token
			this.state = 310
			_la = _input!!.LA(1)
			if ( !(_la==MIG || _la==NOPFD || _la==PFD) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 311
			match(RPARENCHAR) as Token
			}}
			114 -> {
			enterOuterAlt(_localctx, 114)
			if (true){
			this.state = 312
			_la = _input!!.LA(1)
			if ( !(_la==OBJ || _la==OBJECT) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			115 -> {
			enterOuterAlt(_localctx, 115)
			if (true){
			this.state = 313
			_la = _input!!.LA(1)
			if ( !(_la==OFF || _la==OFFSET) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			116 -> {
			enterOuterAlt(_localctx, 116)
			if (true){
			this.state = 314
			match(OPMARGINS) as Token
			this.state = 315
			match(LPARENCHAR) as Token
			this.state = 316
			literal()
			this.state = 317
			match(COMMACHAR) as Token
			this.state = 318
			literal()
			this.state = 321
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COMMACHAR) {
				if (true){
				this.state = 319
				match(COMMACHAR) as Token
				this.state = 320
				literal()
				}
			}

			this.state = 323
			match(RPARENCHAR) as Token
			}}
			117 -> {
			enterOuterAlt(_localctx, 117)
			if (true){
			this.state = 325
			match(OPSEQUENCE) as Token
			this.state = 326
			match(LPARENCHAR) as Token
			this.state = 327
			literal()
			this.state = 328
			match(COMMACHAR) as Token
			this.state = 329
			literal()
			this.state = 330
			match(RPARENCHAR) as Token
			}}
			118 -> {
			enterOuterAlt(_localctx, 118)
			if (true){
			this.state = 332
			_la = _input!!.LA(1)
			if ( !(_la==OPT || _la==OPTIMIZE) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 336
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,19,context) ) {
			1   -> if (true){
			this.state = 333
			match(LPARENCHAR) as Token
			this.state = 334
			_la = _input!!.LA(1)
			if ( !(_la==FULL || _la==STD) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 335
			match(RPARENCHAR) as Token
			}
			}
			}}
			119 -> {
			enterOuterAlt(_localctx, 119)
			if (true){
			this.state = 338
			match(OPTFILE) as Token
			}}
			120 -> {
			enterOuterAlt(_localctx, 120)
			if (true){
			this.state = 339
			match(OPTIONS) as Token
			}}
			121 -> {
			enterOuterAlt(_localctx, 121)
			if (true){
			this.state = 340
			match(OP) as Token
			}}
			122 -> {
			enterOuterAlt(_localctx, 122)
			if (true){
			this.state = 341
			_la = _input!!.LA(1)
			if ( !(_la==OUT || _la==OUTDD) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 342
			match(LPARENCHAR) as Token
			this.state = 343
			cobolWord()
			this.state = 344
			match(RPARENCHAR) as Token
			}}
			123 -> {
			enterOuterAlt(_localctx, 123)
			if (true){
			this.state = 346
			_la = _input!!.LA(1)
			if ( !(_la==PGMN || _la==PGMNAME) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 347
			match(LPARENCHAR) as Token
			this.state = 348
			_la = _input!!.LA(1)
			if ( !(_la==CO || _la==COMPAT || ((((_la - 85)) and 0x3f.inv()) == 0 && ((1L shl (_la - 85)) and ((1L shl (LM - 85)) or (1L shl (LONGMIXED - 85)) or (1L shl (LONGUPPER - 85)) or (1L shl (LU - 85)) or (1L shl (MIXED - 85)))) != 0L) || ((((_la - 256)) and 0x3f.inv()) == 0 && ((1L shl (_la - 256)) and ((1L shl (UPPER - 256)) or (1L shl (M_CHAR - 256)) or (1L shl (U_CHAR - 256)))) != 0L)) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 349
			match(RPARENCHAR) as Token
			}}
			124 -> {
			enterOuterAlt(_localctx, 124)
			if (true){
			this.state = 350
			match(PROLOG) as Token
			}}
			125 -> {
			enterOuterAlt(_localctx, 125)
			if (true){
			this.state = 351
			_la = _input!!.LA(1)
			if ( !(_la==QUOTE || _la==Q_CHAR) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			126 -> {
			enterOuterAlt(_localctx, 126)
			if (true){
			this.state = 352
			match(RENT) as Token
			}}
			127 -> {
			enterOuterAlt(_localctx, 127)
			if (true){
			this.state = 353
			match(RMODE) as Token
			this.state = 354
			match(LPARENCHAR) as Token
			this.state = 358
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			ANY  ->  /*LL1AltBlock*/{if (true){
			this.state = 355
			match(ANY) as Token
			}}
			AUTO  ->  /*LL1AltBlock*/{if (true){
			this.state = 356
			match(AUTO) as Token
			}}
			NONNUMERICLITERAL , NUMERICLITERAL  ->  /*LL1AltBlock*/{if (true){
			this.state = 357
			literal()
			}}
			else -> throw NoViableAltException(this)
			}
			this.state = 360
			match(RPARENCHAR) as Token
			}}
			128 -> {
			enterOuterAlt(_localctx, 128)
			if (true){
			this.state = 361
			_la = _input!!.LA(1)
			if ( !(_la==SEQ || _la==SEQUENCE) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 368
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,21,context) ) {
			1   -> if (true){
			this.state = 362
			match(LPARENCHAR) as Token
			this.state = 363
			literal()
			this.state = 364
			match(COMMACHAR) as Token
			this.state = 365
			literal()
			this.state = 366
			match(RPARENCHAR) as Token
			}
			}
			}}
			129 -> {
			enterOuterAlt(_localctx, 129)
			if (true){
			this.state = 370
			_la = _input!!.LA(1)
			if ( !(_la==SIZE || _la==SZ) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 371
			match(LPARENCHAR) as Token
			this.state = 374
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			MAX  ->  /*LL1AltBlock*/{if (true){
			this.state = 372
			match(MAX) as Token
			}}
			NONNUMERICLITERAL , NUMERICLITERAL  ->  /*LL1AltBlock*/{if (true){
			this.state = 373
			literal()
			}}
			else -> throw NoViableAltException(this)
			}
			this.state = 376
			match(RPARENCHAR) as Token
			}}
			130 -> {
			enterOuterAlt(_localctx, 130)
			if (true){
			this.state = 377
			_la = _input!!.LA(1)
			if ( !(_la==SOURCE || _la==S_CHAR) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			131 -> {
			enterOuterAlt(_localctx, 131)
			if (true){
			this.state = 378
			match(SP) as Token
			}}
			132 -> {
			enterOuterAlt(_localctx, 132)
			if (true){
			this.state = 379
			match(SPACE) as Token
			this.state = 380
			match(LPARENCHAR) as Token
			this.state = 381
			literal()
			this.state = 382
			match(RPARENCHAR) as Token
			}}
			133 -> {
			enterOuterAlt(_localctx, 133)
			if (true){
			this.state = 384
			match(SPIE) as Token
			}}
			134 -> {
			enterOuterAlt(_localctx, 134)
			if (true){
			this.state = 385
			match(SQL) as Token
			this.state = 390
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,23,context) ) {
			1   -> if (true){
			this.state = 386
			match(LPARENCHAR) as Token
			this.state = 387
			literal()
			this.state = 388
			match(RPARENCHAR) as Token
			}
			}
			}}
			135 -> {
			enterOuterAlt(_localctx, 135)
			if (true){
			this.state = 392
			_la = _input!!.LA(1)
			if ( !(_la==SQLC || _la==SQLCCSID) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			136 -> {
			enterOuterAlt(_localctx, 136)
			if (true){
			this.state = 393
			_la = _input!!.LA(1)
			if ( !(_la==SSR || _la==SSRANGE) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			137 -> {
			enterOuterAlt(_localctx, 137)
			if (true){
			this.state = 394
			match(SYSEIB) as Token
			}}
			138 -> {
			enterOuterAlt(_localctx, 138)
			if (true){
			this.state = 395
			_la = _input!!.LA(1)
			if ( !(_la==TERM || _la==TERMINAL) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			139 -> {
			enterOuterAlt(_localctx, 139)
			if (true){
			this.state = 396
			match(TEST) as Token
			this.state = 414
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,29,context) ) {
			1   -> if (true){
			this.state = 397
			match(LPARENCHAR) as Token
			this.state = 399
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==HOOK || _la==NOHOOK) {
				if (true){
				this.state = 398
				_la = _input!!.LA(1)
				if ( !(_la==HOOK || _la==NOHOOK) ) {
					errorHandler.recoverInline(this)
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				}
			}

			this.state = 402
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,25,context) ) {
			1   -> if (true){
			this.state = 401
			match(COMMACHAR) as Token
			}
			}
			this.state = 405
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (((((_la - 168)) and 0x3f.inv()) == 0 && ((1L shl (_la - 168)) and ((1L shl (NOSEP - 168)) or (1L shl (NOSEPARATE - 168)) or (1L shl (SEP - 168)) or (1L shl (SEPARATE - 168)))) != 0L)) {
				if (true){
				this.state = 404
				_la = _input!!.LA(1)
				if ( !(((((_la - 168)) and 0x3f.inv()) == 0 && ((1L shl (_la - 168)) and ((1L shl (NOSEP - 168)) or (1L shl (NOSEPARATE - 168)) or (1L shl (SEP - 168)) or (1L shl (SEPARATE - 168)))) != 0L)) ) {
					errorHandler.recoverInline(this)
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				}
			}

			this.state = 408
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COMMACHAR) {
				if (true){
				this.state = 407
				match(COMMACHAR) as Token
				}
			}

			this.state = 411
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==EJPD || _la==NOEJPD) {
				if (true){
				this.state = 410
				_la = _input!!.LA(1)
				if ( !(_la==EJPD || _la==NOEJPD) ) {
					errorHandler.recoverInline(this)
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				}
			}

			this.state = 413
			match(RPARENCHAR) as Token
			}
			}
			}}
			140 -> {
			enterOuterAlt(_localctx, 140)
			if (true){
			this.state = 416
			match(THREAD) as Token
			}}
			141 -> {
			enterOuterAlt(_localctx, 141)
			if (true){
			this.state = 417
			match(TRUNC) as Token
			this.state = 418
			match(LPARENCHAR) as Token
			this.state = 419
			_la = _input!!.LA(1)
			if ( !(_la==BIN || _la==OPT || _la==STD) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 420
			match(RPARENCHAR) as Token
			}}
			142 -> {
			enterOuterAlt(_localctx, 142)
			if (true){
			this.state = 421
			match(VBREF) as Token
			}}
			143 -> {
			enterOuterAlt(_localctx, 143)
			if (true){
			this.state = 422
			_la = _input!!.LA(1)
			if ( !(_la==WD || _la==WORD) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 423
			match(LPARENCHAR) as Token
			this.state = 424
			cobolWord()
			this.state = 425
			match(RPARENCHAR) as Token
			}}
			144 -> {
			enterOuterAlt(_localctx, 144)
			if (true){
			this.state = 427
			_la = _input!!.LA(1)
			if ( !(_la==XMLPARSE || _la==XP) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 428
			match(LPARENCHAR) as Token
			this.state = 429
			_la = _input!!.LA(1)
			if ( !(_la==COMPAT || ((((_la - 261)) and 0x3f.inv()) == 0 && ((1L shl (_la - 261)) and ((1L shl (XMLSS - 261)) or (1L shl (C_CHAR - 261)) or (1L shl (X_CHAR - 261)))) != 0L)) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 430
			match(RPARENCHAR) as Token
			}}
			145 -> {
			enterOuterAlt(_localctx, 145)
			if (true){
			this.state = 431
			_la = _input!!.LA(1)
			if ( !(_la==XREF || _la==X_CHAR) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 437
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,31,context) ) {
			1   -> if (true){
			this.state = 432
			match(LPARENCHAR) as Token
			this.state = 434
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==FULL || _la==SHORT) {
				if (true){
				this.state = 433
				_la = _input!!.LA(1)
				if ( !(_la==FULL || _la==SHORT) ) {
					errorHandler.recoverInline(this)
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				}
			}

			this.state = 436
			match(RPARENCHAR) as Token
			}
			}
			}}
			146 -> {
			enterOuterAlt(_localctx, 146)
			if (true){
			this.state = 439
			_la = _input!!.LA(1)
			if ( !(_la==YEARWINDOW || _la==YW) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 440
			match(LPARENCHAR) as Token
			this.state = 441
			literal()
			this.state = 442
			match(RPARENCHAR) as Token
			}}
			147 -> {
			enterOuterAlt(_localctx, 147)
			if (true){
			this.state = 444
			match(ZWB) as Token
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

	open class ExecCicsStatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_execCicsStatement.id
	        set(value) { throw RuntimeException() }
		fun EXEC() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.EXEC.id, 0)
		fun CICS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.CICS.id, 0)
		fun findCharData() : CharDataContext? = getRuleContext(solver.getType("CharDataContext"),0)
		fun END_EXEC() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.END_EXEC.id, 0)
		fun DOT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DOT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).enterExecCicsStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).exitExecCicsStatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is Cobol85PreprocessorVisitor ) return (visitor as Cobol85PreprocessorVisitor<out T>).visitExecCicsStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  execCicsStatement() : ExecCicsStatementContext {
		var _localctx : ExecCicsStatementContext = ExecCicsStatementContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_execCicsStatement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 447
			match(EXEC) as Token
			this.state = 448
			match(CICS) as Token
			this.state = 449
			charData()
			this.state = 450
			match(END_EXEC) as Token
			this.state = 452
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,33,context) ) {
			1   -> if (true){
			this.state = 451
			match(DOT) as Token
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

	open class ExecSqlStatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_execSqlStatement.id
	        set(value) { throw RuntimeException() }
		fun EXEC() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.EXEC.id, 0)
		fun SQL() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SQL.id, 0)
		fun findCharDataSql() : CharDataSqlContext? = getRuleContext(solver.getType("CharDataSqlContext"),0)
		fun END_EXEC() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.END_EXEC.id, 0)
		fun DOT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DOT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).enterExecSqlStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).exitExecSqlStatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is Cobol85PreprocessorVisitor ) return (visitor as Cobol85PreprocessorVisitor<out T>).visitExecSqlStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  execSqlStatement() : ExecSqlStatementContext {
		var _localctx : ExecSqlStatementContext = ExecSqlStatementContext(context, state)
		enterRule(_localctx, 10, Rules.RULE_execSqlStatement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 454
			match(EXEC) as Token
			this.state = 455
			match(SQL) as Token
			this.state = 456
			charDataSql()
			this.state = 457
			match(END_EXEC) as Token
			this.state = 459
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,34,context) ) {
			1   -> if (true){
			this.state = 458
			match(DOT) as Token
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

	open class ExecSqlImsStatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_execSqlImsStatement.id
	        set(value) { throw RuntimeException() }
		fun EXEC() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.EXEC.id, 0)
		fun SQLIMS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SQLIMS.id, 0)
		fun findCharData() : CharDataContext? = getRuleContext(solver.getType("CharDataContext"),0)
		fun END_EXEC() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.END_EXEC.id, 0)
		fun DOT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DOT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).enterExecSqlImsStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).exitExecSqlImsStatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is Cobol85PreprocessorVisitor ) return (visitor as Cobol85PreprocessorVisitor<out T>).visitExecSqlImsStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  execSqlImsStatement() : ExecSqlImsStatementContext {
		var _localctx : ExecSqlImsStatementContext = ExecSqlImsStatementContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_execSqlImsStatement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 461
			match(EXEC) as Token
			this.state = 462
			match(SQLIMS) as Token
			this.state = 463
			charData()
			this.state = 464
			match(END_EXEC) as Token
			this.state = 466
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,35,context) ) {
			1   -> if (true){
			this.state = 465
			match(DOT) as Token
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

	open class CopyStatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_copyStatement.id
	        set(value) { throw RuntimeException() }
		fun COPY() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.COPY.id, 0)
		fun findCopySource() : CopySourceContext? = getRuleContext(solver.getType("CopySourceContext"),0)
		fun DOT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DOT.id, 0)
		fun NEWLINE() : List<TerminalNode> = getTokens(Cobol85PreprocessorParser.Tokens.NEWLINE.id)
		fun NEWLINE(i: Int) : TerminalNode = getToken(Cobol85PreprocessorParser.Tokens.NEWLINE.id, i) as TerminalNode
		fun findDirectoryPhrase() : List<DirectoryPhraseContext> = getRuleContexts(solver.getType("DirectoryPhraseContext"))
		fun findDirectoryPhrase(i: Int) : DirectoryPhraseContext? = getRuleContext(solver.getType("DirectoryPhraseContext"),i)
		fun findFamilyPhrase() : List<FamilyPhraseContext> = getRuleContexts(solver.getType("FamilyPhraseContext"))
		fun findFamilyPhrase(i: Int) : FamilyPhraseContext? = getRuleContext(solver.getType("FamilyPhraseContext"),i)
		fun findReplacingPhrase() : List<ReplacingPhraseContext> = getRuleContexts(solver.getType("ReplacingPhraseContext"))
		fun findReplacingPhrase(i: Int) : ReplacingPhraseContext? = getRuleContext(solver.getType("ReplacingPhraseContext"),i)
		fun SUPPRESS() : List<TerminalNode> = getTokens(Cobol85PreprocessorParser.Tokens.SUPPRESS.id)
		fun SUPPRESS(i: Int) : TerminalNode = getToken(Cobol85PreprocessorParser.Tokens.SUPPRESS.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).enterCopyStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).exitCopyStatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is Cobol85PreprocessorVisitor ) return (visitor as Cobol85PreprocessorVisitor<out T>).visitCopyStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  copyStatement() : CopyStatementContext {
		var _localctx : CopyStatementContext = CopyStatementContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_copyStatement.id)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 468
			match(COPY) as Token
			this.state = 469
			copySource()
			this.state = 484
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,38,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 473
					errorHandler.sync(this);
					_la = _input!!.LA(1)
					while (_la==NEWLINE) {
						if (true){
						if (true){
						this.state = 470
						match(NEWLINE) as Token
						}
						}
						this.state = 475
						errorHandler.sync(this)
						_la = _input!!.LA(1)
					}
					this.state = 480
					errorHandler.sync(this)
					when (_input!!.LA(1)) {
					IN , OF  ->  /*LL1AltBlock*/{if (true){
					this.state = 476
					directoryPhrase()
					}}
					ON  ->  /*LL1AltBlock*/{if (true){
					this.state = 477
					familyPhrase()
					}}
					REPLACING  ->  /*LL1AltBlock*/{if (true){
					this.state = 478
					replacingPhrase()
					}}
					SUPPRESS  ->  /*LL1AltBlock*/{if (true){
					this.state = 479
					match(SUPPRESS) as Token
					}}
					else -> throw NoViableAltException(this)
					}
					}
					} 
				}
				this.state = 486
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,38,context)
			}
			this.state = 490
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==NEWLINE) {
				if (true){
				if (true){
				this.state = 487
				match(NEWLINE) as Token
				}
				}
				this.state = 492
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 493
			match(DOT) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class CopySourceContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_copySource.id
	        set(value) { throw RuntimeException() }
		fun findLiteral() : LiteralContext? = getRuleContext(solver.getType("LiteralContext"),0)
		fun findCobolWord() : CobolWordContext? = getRuleContext(solver.getType("CobolWordContext"),0)
		fun findFilename() : FilenameContext? = getRuleContext(solver.getType("FilenameContext"),0)
		fun findCopyLibrary() : CopyLibraryContext? = getRuleContext(solver.getType("CopyLibraryContext"),0)
		fun OF() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.OF.id, 0)
		fun IN() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.IN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).enterCopySource(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).exitCopySource(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is Cobol85PreprocessorVisitor ) return (visitor as Cobol85PreprocessorVisitor<out T>).visitCopySource(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  copySource() : CopySourceContext {
		var _localctx : CopySourceContext = CopySourceContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_copySource.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 498
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			NONNUMERICLITERAL , NUMERICLITERAL  ->  /*LL1AltBlock*/{if (true){
			this.state = 495
			literal()
			}}
			ADATA , ADV , ALIAS , ANSI , ANY , APOST , AR , ARITH , AUTO , AWO , BIN , BLOCK0 , BUF , BUFSIZE , BY , CBL , CBLCARD , CO , COBOL2 , COBOL3 , CODEPAGE , COMPAT , COMPILE , CP , CPP , CPSM , CS , CURR , CURRENCY , DATA , DATEPROC , DBCS , DD , DEBUG , DECK , DIAGTRUNC , DLI , DLL , DP , DTR , DU , DUMP , DYN , DYNAM , EDF , EJECT , EJPD , EN , ENGLISH , EPILOG , EXCI , EXIT , EXP , EXPORTALL , EXTEND , FASTSRT , FLAG , FLAGSTD , FSRT , FULL , GDS , GRAPHIC , HOOK , IN , INTDATE , JA , JP , KA , LANG , LANGUAGE , LC , LENGTH , LIB , LILIAN , LIN , LINECOUNT , LINKAGE , LIST , LM , LONGMIXED , LONGUPPER , LU , MAP , MARGINS , MAX , MD , MDECK , MIG , MIXED , NAME , NAT , NATIONAL , NATLANG , NN , NO , NOADATA , NOADV , NOALIAS , NOAWO , NOBLOCK0 , NOC , NOCBLCARD , NOCICS , NOCMPR2 , NOCOMPILE , NOCPSM , NOCURR , NOCURRENCY , NOD , NODATEPROC , NODBCS , NODE , NODEBUG , NODECK , NODIAGTRUNC , NODLL , NODU , NODUMP , NODP , NODTR , NODYN , NODYNAM , NOEDF , NOEJPD , NOEPILOG , NOEXIT , NOEXP , NOEXPORTALL , NOF , NOFASTSRT , NOFEPI , NOFLAG , NOFLAGMIG , NOFLAGSTD , NOFSRT , NOGRAPHIC , NOHOOK , NOLENGTH , NOLIB , NOLINKAGE , NOLIST , NOMAP , NOMD , NOMDECK , NONAME , NONUM , NONUMBER , NOOBJ , NOOBJECT , NOOFF , NOOFFSET , NOOPSEQUENCE , NOOPT , NOOPTIMIZE , NOOPTIONS , NOP , NOPFD , NOPROLOG , NORENT , NOS , NOSEP , NOSEPARATE , NOSEQ , NOSOURCE , NOSPIE , NOSQL , NOSQLC , NOSQLCCSID , NOSSR , NOSSRANGE , NOSTDTRUNC , NOSEQUENCE , NOTERM , NOTERMINAL , NOTEST , NOTHREAD , NOTRIG , NOVBREF , NOWORD , NOX , NOXREF , NOZWB , NS , NSEQ , NSYMBOL , NUM , NUMBER , NUMPROC , OBJ , OBJECT , OF , OFF , OFFSET , ON , OP , OPMARGINS , OPSEQUENCE , OPT , OPTFILE , OPTIMIZE , OPTIONS , OUT , OUTDD , PFD , PPTDBG , PGMN , PGMNAME , PROCESS , PROLOG , QUOTE , RENT , REPLACING , RMODE , SEP , SEPARATE , SEQ , SEQUENCE , SHORT , SIZE , SOURCE , SP , SPACE , SPIE , SQL , SQLC , SQLCCSID , SS , SSR , SSRANGE , STD , SYSEIB , SZ , TERM , TERMINAL , TEST , THREAD , TITLE , TRIG , TRUNC , UE , UPPER , VBREF , WD , XMLPARSE , XMLSS , XOPTS , XREF , YEARWINDOW , YW , ZWB , C_CHAR , D_CHAR , E_CHAR , F_CHAR , H_CHAR , I_CHAR , M_CHAR , N_CHAR , Q_CHAR , S_CHAR , U_CHAR , W_CHAR , X_CHAR , COMMACHAR , IDENTIFIER  ->  /*LL1AltBlock*/{if (true){
			this.state = 496
			cobolWord()
			}}
			FILENAME  ->  /*LL1AltBlock*/{if (true){
			this.state = 497
			filename()
			}}
			else -> throw NoViableAltException(this)
			}
			this.state = 502
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,41,context) ) {
			1   -> if (true){
			this.state = 500
			_la = _input!!.LA(1)
			if ( !(_la==IN || _la==OF) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 501
			copyLibrary()
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

	open class CopyLibraryContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_copyLibrary.id
	        set(value) { throw RuntimeException() }
		fun findLiteral() : LiteralContext? = getRuleContext(solver.getType("LiteralContext"),0)
		fun findCobolWord() : CobolWordContext? = getRuleContext(solver.getType("CobolWordContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).enterCopyLibrary(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).exitCopyLibrary(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is Cobol85PreprocessorVisitor ) return (visitor as Cobol85PreprocessorVisitor<out T>).visitCopyLibrary(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  copyLibrary() : CopyLibraryContext {
		var _localctx : CopyLibraryContext = CopyLibraryContext(context, state)
		enterRule(_localctx, 18, Rules.RULE_copyLibrary.id)
		try {
			this.state = 506
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			NONNUMERICLITERAL , NUMERICLITERAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 504
			literal()
			}}
			ADATA , ADV , ALIAS , ANSI , ANY , APOST , AR , ARITH , AUTO , AWO , BIN , BLOCK0 , BUF , BUFSIZE , BY , CBL , CBLCARD , CO , COBOL2 , COBOL3 , CODEPAGE , COMPAT , COMPILE , CP , CPP , CPSM , CS , CURR , CURRENCY , DATA , DATEPROC , DBCS , DD , DEBUG , DECK , DIAGTRUNC , DLI , DLL , DP , DTR , DU , DUMP , DYN , DYNAM , EDF , EJECT , EJPD , EN , ENGLISH , EPILOG , EXCI , EXIT , EXP , EXPORTALL , EXTEND , FASTSRT , FLAG , FLAGSTD , FSRT , FULL , GDS , GRAPHIC , HOOK , IN , INTDATE , JA , JP , KA , LANG , LANGUAGE , LC , LENGTH , LIB , LILIAN , LIN , LINECOUNT , LINKAGE , LIST , LM , LONGMIXED , LONGUPPER , LU , MAP , MARGINS , MAX , MD , MDECK , MIG , MIXED , NAME , NAT , NATIONAL , NATLANG , NN , NO , NOADATA , NOADV , NOALIAS , NOAWO , NOBLOCK0 , NOC , NOCBLCARD , NOCICS , NOCMPR2 , NOCOMPILE , NOCPSM , NOCURR , NOCURRENCY , NOD , NODATEPROC , NODBCS , NODE , NODEBUG , NODECK , NODIAGTRUNC , NODLL , NODU , NODUMP , NODP , NODTR , NODYN , NODYNAM , NOEDF , NOEJPD , NOEPILOG , NOEXIT , NOEXP , NOEXPORTALL , NOF , NOFASTSRT , NOFEPI , NOFLAG , NOFLAGMIG , NOFLAGSTD , NOFSRT , NOGRAPHIC , NOHOOK , NOLENGTH , NOLIB , NOLINKAGE , NOLIST , NOMAP , NOMD , NOMDECK , NONAME , NONUM , NONUMBER , NOOBJ , NOOBJECT , NOOFF , NOOFFSET , NOOPSEQUENCE , NOOPT , NOOPTIMIZE , NOOPTIONS , NOP , NOPFD , NOPROLOG , NORENT , NOS , NOSEP , NOSEPARATE , NOSEQ , NOSOURCE , NOSPIE , NOSQL , NOSQLC , NOSQLCCSID , NOSSR , NOSSRANGE , NOSTDTRUNC , NOSEQUENCE , NOTERM , NOTERMINAL , NOTEST , NOTHREAD , NOTRIG , NOVBREF , NOWORD , NOX , NOXREF , NOZWB , NS , NSEQ , NSYMBOL , NUM , NUMBER , NUMPROC , OBJ , OBJECT , OF , OFF , OFFSET , ON , OP , OPMARGINS , OPSEQUENCE , OPT , OPTFILE , OPTIMIZE , OPTIONS , OUT , OUTDD , PFD , PPTDBG , PGMN , PGMNAME , PROCESS , PROLOG , QUOTE , RENT , REPLACING , RMODE , SEP , SEPARATE , SEQ , SEQUENCE , SHORT , SIZE , SOURCE , SP , SPACE , SPIE , SQL , SQLC , SQLCCSID , SS , SSR , SSRANGE , STD , SYSEIB , SZ , TERM , TERMINAL , TEST , THREAD , TITLE , TRIG , TRUNC , UE , UPPER , VBREF , WD , XMLPARSE , XMLSS , XOPTS , XREF , YEARWINDOW , YW , ZWB , C_CHAR , D_CHAR , E_CHAR , F_CHAR , H_CHAR , I_CHAR , M_CHAR , N_CHAR , Q_CHAR , S_CHAR , U_CHAR , W_CHAR , X_CHAR , COMMACHAR , IDENTIFIER  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 505
			cobolWord()
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

	open class ReplacingPhraseContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_replacingPhrase.id
	        set(value) { throw RuntimeException() }
		fun REPLACING() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.REPLACING.id, 0)
		fun findReplaceClause() : List<ReplaceClauseContext> = getRuleContexts(solver.getType("ReplaceClauseContext"))
		fun findReplaceClause(i: Int) : ReplaceClauseContext? = getRuleContext(solver.getType("ReplaceClauseContext"),i)
		fun NEWLINE() : List<TerminalNode> = getTokens(Cobol85PreprocessorParser.Tokens.NEWLINE.id)
		fun NEWLINE(i: Int) : TerminalNode = getToken(Cobol85PreprocessorParser.Tokens.NEWLINE.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).enterReplacingPhrase(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).exitReplacingPhrase(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is Cobol85PreprocessorVisitor ) return (visitor as Cobol85PreprocessorVisitor<out T>).visitReplacingPhrase(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  replacingPhrase() : ReplacingPhraseContext {
		var _localctx : ReplacingPhraseContext = ReplacingPhraseContext(context, state)
		enterRule(_localctx, 20, Rules.RULE_replacingPhrase.id)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 508
			match(REPLACING) as Token
			this.state = 512
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==NEWLINE) {
				if (true){
				if (true){
				this.state = 509
				match(NEWLINE) as Token
				}
				}
				this.state = 514
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 515
			replaceClause()
			this.state = 524
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,45,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 517 
					errorHandler.sync(this)
					_la = _input!!.LA(1)
					do {
						if (true){
						if (true){
						this.state = 516
						match(NEWLINE) as Token
						}
						}
						this.state = 519 
						errorHandler.sync(this)
						_la = _input!!.LA(1)
					} while ( _la==NEWLINE )
					this.state = 521
					replaceClause()
					}
					} 
				}
				this.state = 526
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,45,context)
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

	open class ReplaceAreaContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_replaceArea.id
	        set(value) { throw RuntimeException() }
		fun findReplaceByStatement() : ReplaceByStatementContext? = getRuleContext(solver.getType("ReplaceByStatementContext"),0)
		fun findCopyStatement() : List<CopyStatementContext> = getRuleContexts(solver.getType("CopyStatementContext"))
		fun findCopyStatement(i: Int) : CopyStatementContext? = getRuleContext(solver.getType("CopyStatementContext"),i)
		fun findCharData() : List<CharDataContext> = getRuleContexts(solver.getType("CharDataContext"))
		fun findCharData(i: Int) : CharDataContext? = getRuleContext(solver.getType("CharDataContext"),i)
		fun findReplaceOffStatement() : ReplaceOffStatementContext? = getRuleContext(solver.getType("ReplaceOffStatementContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).enterReplaceArea(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).exitReplaceArea(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is Cobol85PreprocessorVisitor ) return (visitor as Cobol85PreprocessorVisitor<out T>).visitReplaceArea(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  replaceArea() : ReplaceAreaContext {
		var _localctx : ReplaceAreaContext = ReplaceAreaContext(context, state)
		enterRule(_localctx, 22, Rules.RULE_replaceArea.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 527
			replaceByStatement()
			this.state = 532
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,47,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					this.state = 530
					errorHandler.sync(this)
					when (_input!!.LA(1)) {
					COPY  ->  /*LL1AltBlock*/{if (true){
					this.state = 528
					copyStatement()
					}}
					ADATA , ADV , ALIAS , ANSI , ANY , APOST , AR , ARITH , AUTO , AWO , BIN , BLOCK0 , BUF , BUFSIZE , BY , CBL , CBLCARD , CO , COBOL2 , COBOL3 , CODEPAGE , COMPAT , COMPILE , CP , CPP , CPSM , CS , CURR , CURRENCY , DATA , DATEPROC , DBCS , DD , DEBUG , DECK , DIAGTRUNC , DLI , DLL , DP , DTR , DU , DUMP , DYN , DYNAM , EDF , EJECT , EJPD , EN , ENGLISH , EPILOG , EXCI , EXIT , EXP , EXPORTALL , EXTEND , FASTSRT , FLAG , FLAGSTD , FSRT , FULL , GDS , GRAPHIC , HOOK , IN , INTDATE , JA , JP , KA , LANG , LANGUAGE , LC , LENGTH , LIB , LILIAN , LIN , LINECOUNT , LINKAGE , LIST , LM , LONGMIXED , LONGUPPER , LPARENCHAR , LU , MAP , MARGINS , MAX , MD , MDECK , MIG , MIXED , NAME , NAT , NATIONAL , NATLANG , NN , NO , NOADATA , NOADV , NOALIAS , NOAWO , NOBLOCK0 , NOC , NOCBLCARD , NOCICS , NOCMPR2 , NOCOMPILE , NOCPSM , NOCURR , NOCURRENCY , NOD , NODATEPROC , NODBCS , NODE , NODEBUG , NODECK , NODIAGTRUNC , NODLL , NODU , NODUMP , NODP , NODTR , NODYN , NODYNAM , NOEDF , NOEJPD , NOEPILOG , NOEXIT , NOEXP , NOEXPORTALL , NOF , NOFASTSRT , NOFEPI , NOFLAG , NOFLAGMIG , NOFLAGSTD , NOFSRT , NOGRAPHIC , NOHOOK , NOLENGTH , NOLIB , NOLINKAGE , NOLIST , NOMAP , NOMD , NOMDECK , NONAME , NONUM , NONUMBER , NOOBJ , NOOBJECT , NOOFF , NOOFFSET , NOOPSEQUENCE , NOOPT , NOOPTIMIZE , NOOPTIONS , NOP , NOPFD , NOPROLOG , NORENT , NOS , NOSEP , NOSEPARATE , NOSEQ , NOSOURCE , NOSPIE , NOSQL , NOSQLC , NOSQLCCSID , NOSSR , NOSSRANGE , NOSTDTRUNC , NOSEQUENCE , NOTERM , NOTERMINAL , NOTEST , NOTHREAD , NOTRIG , NOVBREF , NOWORD , NOX , NOXREF , NOZWB , NS , NSEQ , NSYMBOL , NUM , NUMBER , NUMPROC , OBJ , OBJECT , OF , OFF , OFFSET , ON , OP , OPMARGINS , OPSEQUENCE , OPT , OPTFILE , OPTIMIZE , OPTIONS , OUT , OUTDD , PFD , PPTDBG , PGMN , PGMNAME , PROCESS , PROLOG , QUOTE , RENT , REPLACING , RMODE , RPARENCHAR , SEP , SEPARATE , SEQ , SEQUENCE , SHORT , SIZE , SOURCE , SP , SPACE , SPIE , SQL , SQLC , SQLCCSID , SS , SSR , SSRANGE , STD , SYSEIB , SZ , TERM , TERMINAL , TEST , THREAD , TITLE , TRIG , TRUNC , UE , UPPER , VBREF , WD , XMLPARSE , XMLSS , XOPTS , XREF , YEARWINDOW , YW , ZWB , C_CHAR , D_CHAR , E_CHAR , F_CHAR , H_CHAR , I_CHAR , M_CHAR , N_CHAR , Q_CHAR , S_CHAR , U_CHAR , W_CHAR , X_CHAR , COMMACHAR , DOT , NONNUMERICLITERAL , NUMERICLITERAL , IDENTIFIER , FILENAME , NEWLINE , TEXT  ->  /*LL1AltBlock*/{if (true){
					this.state = 529
					charData()
					}}
					else -> throw NoViableAltException(this)
					}
					} 
				}
				this.state = 534
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,47,context)
			}
			this.state = 536
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,48,context) ) {
			1   -> if (true){
			this.state = 535
			replaceOffStatement()
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

	open class ReplaceByStatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_replaceByStatement.id
	        set(value) { throw RuntimeException() }
		fun REPLACE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.REPLACE.id, 0)
		fun DOT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DOT.id, 0)
		fun findReplaceClause() : List<ReplaceClauseContext> = getRuleContexts(solver.getType("ReplaceClauseContext"))
		fun findReplaceClause(i: Int) : ReplaceClauseContext? = getRuleContext(solver.getType("ReplaceClauseContext"),i)
		fun NEWLINE() : List<TerminalNode> = getTokens(Cobol85PreprocessorParser.Tokens.NEWLINE.id)
		fun NEWLINE(i: Int) : TerminalNode = getToken(Cobol85PreprocessorParser.Tokens.NEWLINE.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).enterReplaceByStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).exitReplaceByStatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is Cobol85PreprocessorVisitor ) return (visitor as Cobol85PreprocessorVisitor<out T>).visitReplaceByStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  replaceByStatement() : ReplaceByStatementContext {
		var _localctx : ReplaceByStatementContext = ReplaceByStatementContext(context, state)
		enterRule(_localctx, 24, Rules.RULE_replaceByStatement.id)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 538
			match(REPLACE) as Token
			this.state = 546 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				if (true){
				this.state = 542
				errorHandler.sync(this);
				_la = _input!!.LA(1)
				while (_la==NEWLINE) {
					if (true){
					if (true){
					this.state = 539
					match(NEWLINE) as Token
					}
					}
					this.state = 544
					errorHandler.sync(this)
					_la = _input!!.LA(1)
				}
				this.state = 545
				replaceClause()
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 548 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,50,context)
			} while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER )
			this.state = 550
			match(DOT) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ReplaceOffStatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_replaceOffStatement.id
	        set(value) { throw RuntimeException() }
		fun REPLACE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.REPLACE.id, 0)
		fun OFF() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.OFF.id, 0)
		fun DOT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DOT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).enterReplaceOffStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).exitReplaceOffStatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is Cobol85PreprocessorVisitor ) return (visitor as Cobol85PreprocessorVisitor<out T>).visitReplaceOffStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  replaceOffStatement() : ReplaceOffStatementContext {
		var _localctx : ReplaceOffStatementContext = ReplaceOffStatementContext(context, state)
		enterRule(_localctx, 26, Rules.RULE_replaceOffStatement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 552
			match(REPLACE) as Token
			this.state = 553
			match(OFF) as Token
			this.state = 554
			match(DOT) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ReplaceClauseContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_replaceClause.id
	        set(value) { throw RuntimeException() }
		fun findReplaceable() : ReplaceableContext? = getRuleContext(solver.getType("ReplaceableContext"),0)
		fun BY() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.BY.id, 0)
		fun findReplacement() : ReplacementContext? = getRuleContext(solver.getType("ReplacementContext"),0)
		fun NEWLINE() : List<TerminalNode> = getTokens(Cobol85PreprocessorParser.Tokens.NEWLINE.id)
		fun NEWLINE(i: Int) : TerminalNode = getToken(Cobol85PreprocessorParser.Tokens.NEWLINE.id, i) as TerminalNode
		fun findDirectoryPhrase() : DirectoryPhraseContext? = getRuleContext(solver.getType("DirectoryPhraseContext"),0)
		fun findFamilyPhrase() : FamilyPhraseContext? = getRuleContext(solver.getType("FamilyPhraseContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).enterReplaceClause(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).exitReplaceClause(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is Cobol85PreprocessorVisitor ) return (visitor as Cobol85PreprocessorVisitor<out T>).visitReplaceClause(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  replaceClause() : ReplaceClauseContext {
		var _localctx : ReplaceClauseContext = ReplaceClauseContext(context, state)
		enterRule(_localctx, 28, Rules.RULE_replaceClause.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 556
			replaceable()
			this.state = 560
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==NEWLINE) {
				if (true){
				if (true){
				this.state = 557
				match(NEWLINE) as Token
				}
				}
				this.state = 562
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 563
			match(BY) as Token
			this.state = 567
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==NEWLINE) {
				if (true){
				if (true){
				this.state = 564
				match(NEWLINE) as Token
				}
				}
				this.state = 569
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 570
			replacement()
			this.state = 578
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,54,context) ) {
			1   -> if (true){
			this.state = 574
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==NEWLINE) {
				if (true){
				if (true){
				this.state = 571
				match(NEWLINE) as Token
				}
				}
				this.state = 576
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 577
			directoryPhrase()
			}
			}
			this.state = 587
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,56,context) ) {
			1   -> if (true){
			this.state = 583
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==NEWLINE) {
				if (true){
				if (true){
				this.state = 580
				match(NEWLINE) as Token
				}
				}
				this.state = 585
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 586
			familyPhrase()
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

	open class DirectoryPhraseContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_directoryPhrase.id
	        set(value) { throw RuntimeException() }
		fun OF() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.OF.id, 0)
		fun IN() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.IN.id, 0)
		fun findLiteral() : LiteralContext? = getRuleContext(solver.getType("LiteralContext"),0)
		fun findCobolWord() : CobolWordContext? = getRuleContext(solver.getType("CobolWordContext"),0)
		fun NEWLINE() : List<TerminalNode> = getTokens(Cobol85PreprocessorParser.Tokens.NEWLINE.id)
		fun NEWLINE(i: Int) : TerminalNode = getToken(Cobol85PreprocessorParser.Tokens.NEWLINE.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).enterDirectoryPhrase(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).exitDirectoryPhrase(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is Cobol85PreprocessorVisitor ) return (visitor as Cobol85PreprocessorVisitor<out T>).visitDirectoryPhrase(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  directoryPhrase() : DirectoryPhraseContext {
		var _localctx : DirectoryPhraseContext = DirectoryPhraseContext(context, state)
		enterRule(_localctx, 30, Rules.RULE_directoryPhrase.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 589
			_la = _input!!.LA(1)
			if ( !(_la==IN || _la==OF) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 593
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==NEWLINE) {
				if (true){
				if (true){
				this.state = 590
				match(NEWLINE) as Token
				}
				}
				this.state = 595
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 598
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			NONNUMERICLITERAL , NUMERICLITERAL  ->  /*LL1AltBlock*/{if (true){
			this.state = 596
			literal()
			}}
			ADATA , ADV , ALIAS , ANSI , ANY , APOST , AR , ARITH , AUTO , AWO , BIN , BLOCK0 , BUF , BUFSIZE , BY , CBL , CBLCARD , CO , COBOL2 , COBOL3 , CODEPAGE , COMPAT , COMPILE , CP , CPP , CPSM , CS , CURR , CURRENCY , DATA , DATEPROC , DBCS , DD , DEBUG , DECK , DIAGTRUNC , DLI , DLL , DP , DTR , DU , DUMP , DYN , DYNAM , EDF , EJECT , EJPD , EN , ENGLISH , EPILOG , EXCI , EXIT , EXP , EXPORTALL , EXTEND , FASTSRT , FLAG , FLAGSTD , FSRT , FULL , GDS , GRAPHIC , HOOK , IN , INTDATE , JA , JP , KA , LANG , LANGUAGE , LC , LENGTH , LIB , LILIAN , LIN , LINECOUNT , LINKAGE , LIST , LM , LONGMIXED , LONGUPPER , LU , MAP , MARGINS , MAX , MD , MDECK , MIG , MIXED , NAME , NAT , NATIONAL , NATLANG , NN , NO , NOADATA , NOADV , NOALIAS , NOAWO , NOBLOCK0 , NOC , NOCBLCARD , NOCICS , NOCMPR2 , NOCOMPILE , NOCPSM , NOCURR , NOCURRENCY , NOD , NODATEPROC , NODBCS , NODE , NODEBUG , NODECK , NODIAGTRUNC , NODLL , NODU , NODUMP , NODP , NODTR , NODYN , NODYNAM , NOEDF , NOEJPD , NOEPILOG , NOEXIT , NOEXP , NOEXPORTALL , NOF , NOFASTSRT , NOFEPI , NOFLAG , NOFLAGMIG , NOFLAGSTD , NOFSRT , NOGRAPHIC , NOHOOK , NOLENGTH , NOLIB , NOLINKAGE , NOLIST , NOMAP , NOMD , NOMDECK , NONAME , NONUM , NONUMBER , NOOBJ , NOOBJECT , NOOFF , NOOFFSET , NOOPSEQUENCE , NOOPT , NOOPTIMIZE , NOOPTIONS , NOP , NOPFD , NOPROLOG , NORENT , NOS , NOSEP , NOSEPARATE , NOSEQ , NOSOURCE , NOSPIE , NOSQL , NOSQLC , NOSQLCCSID , NOSSR , NOSSRANGE , NOSTDTRUNC , NOSEQUENCE , NOTERM , NOTERMINAL , NOTEST , NOTHREAD , NOTRIG , NOVBREF , NOWORD , NOX , NOXREF , NOZWB , NS , NSEQ , NSYMBOL , NUM , NUMBER , NUMPROC , OBJ , OBJECT , OF , OFF , OFFSET , ON , OP , OPMARGINS , OPSEQUENCE , OPT , OPTFILE , OPTIMIZE , OPTIONS , OUT , OUTDD , PFD , PPTDBG , PGMN , PGMNAME , PROCESS , PROLOG , QUOTE , RENT , REPLACING , RMODE , SEP , SEPARATE , SEQ , SEQUENCE , SHORT , SIZE , SOURCE , SP , SPACE , SPIE , SQL , SQLC , SQLCCSID , SS , SSR , SSRANGE , STD , SYSEIB , SZ , TERM , TERMINAL , TEST , THREAD , TITLE , TRIG , TRUNC , UE , UPPER , VBREF , WD , XMLPARSE , XMLSS , XOPTS , XREF , YEARWINDOW , YW , ZWB , C_CHAR , D_CHAR , E_CHAR , F_CHAR , H_CHAR , I_CHAR , M_CHAR , N_CHAR , Q_CHAR , S_CHAR , U_CHAR , W_CHAR , X_CHAR , COMMACHAR , IDENTIFIER  ->  /*LL1AltBlock*/{if (true){
			this.state = 597
			cobolWord()
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

	open class FamilyPhraseContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_familyPhrase.id
	        set(value) { throw RuntimeException() }
		fun ON() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.ON.id, 0)
		fun findLiteral() : LiteralContext? = getRuleContext(solver.getType("LiteralContext"),0)
		fun findCobolWord() : CobolWordContext? = getRuleContext(solver.getType("CobolWordContext"),0)
		fun NEWLINE() : List<TerminalNode> = getTokens(Cobol85PreprocessorParser.Tokens.NEWLINE.id)
		fun NEWLINE(i: Int) : TerminalNode = getToken(Cobol85PreprocessorParser.Tokens.NEWLINE.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).enterFamilyPhrase(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).exitFamilyPhrase(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is Cobol85PreprocessorVisitor ) return (visitor as Cobol85PreprocessorVisitor<out T>).visitFamilyPhrase(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  familyPhrase() : FamilyPhraseContext {
		var _localctx : FamilyPhraseContext = FamilyPhraseContext(context, state)
		enterRule(_localctx, 32, Rules.RULE_familyPhrase.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 600
			match(ON) as Token
			this.state = 604
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==NEWLINE) {
				if (true){
				if (true){
				this.state = 601
				match(NEWLINE) as Token
				}
				}
				this.state = 606
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 609
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			NONNUMERICLITERAL , NUMERICLITERAL  ->  /*LL1AltBlock*/{if (true){
			this.state = 607
			literal()
			}}
			ADATA , ADV , ALIAS , ANSI , ANY , APOST , AR , ARITH , AUTO , AWO , BIN , BLOCK0 , BUF , BUFSIZE , BY , CBL , CBLCARD , CO , COBOL2 , COBOL3 , CODEPAGE , COMPAT , COMPILE , CP , CPP , CPSM , CS , CURR , CURRENCY , DATA , DATEPROC , DBCS , DD , DEBUG , DECK , DIAGTRUNC , DLI , DLL , DP , DTR , DU , DUMP , DYN , DYNAM , EDF , EJECT , EJPD , EN , ENGLISH , EPILOG , EXCI , EXIT , EXP , EXPORTALL , EXTEND , FASTSRT , FLAG , FLAGSTD , FSRT , FULL , GDS , GRAPHIC , HOOK , IN , INTDATE , JA , JP , KA , LANG , LANGUAGE , LC , LENGTH , LIB , LILIAN , LIN , LINECOUNT , LINKAGE , LIST , LM , LONGMIXED , LONGUPPER , LU , MAP , MARGINS , MAX , MD , MDECK , MIG , MIXED , NAME , NAT , NATIONAL , NATLANG , NN , NO , NOADATA , NOADV , NOALIAS , NOAWO , NOBLOCK0 , NOC , NOCBLCARD , NOCICS , NOCMPR2 , NOCOMPILE , NOCPSM , NOCURR , NOCURRENCY , NOD , NODATEPROC , NODBCS , NODE , NODEBUG , NODECK , NODIAGTRUNC , NODLL , NODU , NODUMP , NODP , NODTR , NODYN , NODYNAM , NOEDF , NOEJPD , NOEPILOG , NOEXIT , NOEXP , NOEXPORTALL , NOF , NOFASTSRT , NOFEPI , NOFLAG , NOFLAGMIG , NOFLAGSTD , NOFSRT , NOGRAPHIC , NOHOOK , NOLENGTH , NOLIB , NOLINKAGE , NOLIST , NOMAP , NOMD , NOMDECK , NONAME , NONUM , NONUMBER , NOOBJ , NOOBJECT , NOOFF , NOOFFSET , NOOPSEQUENCE , NOOPT , NOOPTIMIZE , NOOPTIONS , NOP , NOPFD , NOPROLOG , NORENT , NOS , NOSEP , NOSEPARATE , NOSEQ , NOSOURCE , NOSPIE , NOSQL , NOSQLC , NOSQLCCSID , NOSSR , NOSSRANGE , NOSTDTRUNC , NOSEQUENCE , NOTERM , NOTERMINAL , NOTEST , NOTHREAD , NOTRIG , NOVBREF , NOWORD , NOX , NOXREF , NOZWB , NS , NSEQ , NSYMBOL , NUM , NUMBER , NUMPROC , OBJ , OBJECT , OF , OFF , OFFSET , ON , OP , OPMARGINS , OPSEQUENCE , OPT , OPTFILE , OPTIMIZE , OPTIONS , OUT , OUTDD , PFD , PPTDBG , PGMN , PGMNAME , PROCESS , PROLOG , QUOTE , RENT , REPLACING , RMODE , SEP , SEPARATE , SEQ , SEQUENCE , SHORT , SIZE , SOURCE , SP , SPACE , SPIE , SQL , SQLC , SQLCCSID , SS , SSR , SSRANGE , STD , SYSEIB , SZ , TERM , TERMINAL , TEST , THREAD , TITLE , TRIG , TRUNC , UE , UPPER , VBREF , WD , XMLPARSE , XMLSS , XOPTS , XREF , YEARWINDOW , YW , ZWB , C_CHAR , D_CHAR , E_CHAR , F_CHAR , H_CHAR , I_CHAR , M_CHAR , N_CHAR , Q_CHAR , S_CHAR , U_CHAR , W_CHAR , X_CHAR , COMMACHAR , IDENTIFIER  ->  /*LL1AltBlock*/{if (true){
			this.state = 608
			cobolWord()
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

	open class ReplaceableContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_replaceable.id
	        set(value) { throw RuntimeException() }
		fun findLiteral() : LiteralContext? = getRuleContext(solver.getType("LiteralContext"),0)
		fun findCobolWord() : CobolWordContext? = getRuleContext(solver.getType("CobolWordContext"),0)
		fun findPseudoText() : PseudoTextContext? = getRuleContext(solver.getType("PseudoTextContext"),0)
		fun findCharDataLine() : CharDataLineContext? = getRuleContext(solver.getType("CharDataLineContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).enterReplaceable(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).exitReplaceable(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is Cobol85PreprocessorVisitor ) return (visitor as Cobol85PreprocessorVisitor<out T>).visitReplaceable(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  replaceable() : ReplaceableContext {
		var _localctx : ReplaceableContext = ReplaceableContext(context, state)
		enterRule(_localctx, 34, Rules.RULE_replaceable.id)
		try {
			this.state = 615
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,61,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 611
			literal()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 612
			cobolWord()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 613
			pseudoText()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 614
			charDataLine()
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

	open class ReplacementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_replacement.id
	        set(value) { throw RuntimeException() }
		fun findLiteral() : LiteralContext? = getRuleContext(solver.getType("LiteralContext"),0)
		fun findCobolWord() : CobolWordContext? = getRuleContext(solver.getType("CobolWordContext"),0)
		fun findPseudoText() : PseudoTextContext? = getRuleContext(solver.getType("PseudoTextContext"),0)
		fun findCharDataLine() : CharDataLineContext? = getRuleContext(solver.getType("CharDataLineContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).enterReplacement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).exitReplacement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is Cobol85PreprocessorVisitor ) return (visitor as Cobol85PreprocessorVisitor<out T>).visitReplacement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  replacement() : ReplacementContext {
		var _localctx : ReplacementContext = ReplacementContext(context, state)
		enterRule(_localctx, 36, Rules.RULE_replacement.id)
		try {
			this.state = 621
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,62,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 617
			literal()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 618
			cobolWord()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 619
			pseudoText()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 620
			charDataLine()
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

	open class EjectStatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_ejectStatement.id
	        set(value) { throw RuntimeException() }
		fun EJECT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.EJECT.id, 0)
		fun DOT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DOT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).enterEjectStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).exitEjectStatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is Cobol85PreprocessorVisitor ) return (visitor as Cobol85PreprocessorVisitor<out T>).visitEjectStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  ejectStatement() : EjectStatementContext {
		var _localctx : EjectStatementContext = EjectStatementContext(context, state)
		enterRule(_localctx, 38, Rules.RULE_ejectStatement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 623
			match(EJECT) as Token
			this.state = 625
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,63,context) ) {
			1   -> if (true){
			this.state = 624
			match(DOT) as Token
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

	open class SkipStatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_skipStatement.id
	        set(value) { throw RuntimeException() }
		fun SKIP1() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SKIP1.id, 0)
		fun SKIP2() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SKIP2.id, 0)
		fun SKIP3() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SKIP3.id, 0)
		fun DOT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DOT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).enterSkipStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).exitSkipStatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is Cobol85PreprocessorVisitor ) return (visitor as Cobol85PreprocessorVisitor<out T>).visitSkipStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  skipStatement() : SkipStatementContext {
		var _localctx : SkipStatementContext = SkipStatementContext(context, state)
		enterRule(_localctx, 40, Rules.RULE_skipStatement.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 627
			_la = _input!!.LA(1)
			if ( !(((((_la - 238)) and 0x3f.inv()) == 0 && ((1L shl (_la - 238)) and ((1L shl (SKIP1 - 238)) or (1L shl (SKIP2 - 238)) or (1L shl (SKIP3 - 238)))) != 0L)) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 629
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,64,context) ) {
			1   -> if (true){
			this.state = 628
			match(DOT) as Token
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

	open class TitleStatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_titleStatement.id
	        set(value) { throw RuntimeException() }
		fun TITLE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.TITLE.id, 0)
		fun findLiteral() : LiteralContext? = getRuleContext(solver.getType("LiteralContext"),0)
		fun DOT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DOT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).enterTitleStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).exitTitleStatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is Cobol85PreprocessorVisitor ) return (visitor as Cobol85PreprocessorVisitor<out T>).visitTitleStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  titleStatement() : TitleStatementContext {
		var _localctx : TitleStatementContext = TitleStatementContext(context, state)
		enterRule(_localctx, 42, Rules.RULE_titleStatement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 631
			match(TITLE) as Token
			this.state = 632
			literal()
			this.state = 634
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,65,context) ) {
			1   -> if (true){
			this.state = 633
			match(DOT) as Token
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

	open class PseudoTextContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_pseudoText.id
	        set(value) { throw RuntimeException() }
		fun DOUBLEEQUALCHAR() : List<TerminalNode> = getTokens(Cobol85PreprocessorParser.Tokens.DOUBLEEQUALCHAR.id)
		fun DOUBLEEQUALCHAR(i: Int) : TerminalNode = getToken(Cobol85PreprocessorParser.Tokens.DOUBLEEQUALCHAR.id, i) as TerminalNode
		fun findCharData() : CharDataContext? = getRuleContext(solver.getType("CharDataContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).enterPseudoText(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).exitPseudoText(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is Cobol85PreprocessorVisitor ) return (visitor as Cobol85PreprocessorVisitor<out T>).visitPseudoText(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  pseudoText() : PseudoTextContext {
		var _localctx : PseudoTextContext = PseudoTextContext(context, state)
		enterRule(_localctx, 44, Rules.RULE_pseudoText.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 636
			match(DOUBLEEQUALCHAR) as Token
			this.state = 638
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl ADATA) or (1L shl ADV) or (1L shl ALIAS) or (1L shl ANSI) or (1L shl ANY) or (1L shl APOST) or (1L shl AR) or (1L shl ARITH) or (1L shl AUTO) or (1L shl AWO) or (1L shl BIN) or (1L shl BLOCK0) or (1L shl BUF) or (1L shl BUFSIZE) or (1L shl BY) or (1L shl CBL) or (1L shl CBLCARD) or (1L shl CO) or (1L shl COBOL2) or (1L shl COBOL3) or (1L shl CODEPAGE) or (1L shl COMPAT) or (1L shl COMPILE) or (1L shl CP) or (1L shl CPP) or (1L shl CPSM) or (1L shl CS) or (1L shl CURR) or (1L shl CURRENCY) or (1L shl DATA) or (1L shl DATEPROC) or (1L shl DBCS) or (1L shl DD) or (1L shl DEBUG) or (1L shl DECK) or (1L shl DIAGTRUNC) or (1L shl DLI) or (1L shl DLL) or (1L shl DP) or (1L shl DTR) or (1L shl DU) or (1L shl DUMP) or (1L shl DYN) or (1L shl DYNAM) or (1L shl EDF) or (1L shl EJECT) or (1L shl EJPD) or (1L shl EN) or (1L shl ENGLISH) or (1L shl EPILOG) or (1L shl EXCI) or (1L shl EXIT) or (1L shl EXP) or (1L shl EXPORTALL) or (1L shl EXTEND) or (1L shl FASTSRT) or (1L shl FLAG) or (1L shl FLAGSTD))) != 0L) || ((((_la - 64)) and 0x3f.inv()) == 0 && ((1L shl (_la - 64)) and ((1L shl (FSRT - 64)) or (1L shl (FULL - 64)) or (1L shl (GDS - 64)) or (1L shl (GRAPHIC - 64)) or (1L shl (HOOK - 64)) or (1L shl (IN - 64)) or (1L shl (INTDATE - 64)) or (1L shl (JA - 64)) or (1L shl (JP - 64)) or (1L shl (KA - 64)) or (1L shl (LANG - 64)) or (1L shl (LANGUAGE - 64)) or (1L shl (LC - 64)) or (1L shl (LENGTH - 64)) or (1L shl (LIB - 64)) or (1L shl (LILIAN - 64)) or (1L shl (LIN - 64)) or (1L shl (LINECOUNT - 64)) or (1L shl (LINKAGE - 64)) or (1L shl (LIST - 64)) or (1L shl (LM - 64)) or (1L shl (LONGMIXED - 64)) or (1L shl (LONGUPPER - 64)) or (1L shl (LPARENCHAR - 64)) or (1L shl (LU - 64)) or (1L shl (MAP - 64)) or (1L shl (MARGINS - 64)) or (1L shl (MAX - 64)) or (1L shl (MD - 64)) or (1L shl (MDECK - 64)) or (1L shl (MIG - 64)) or (1L shl (MIXED - 64)) or (1L shl (NAME - 64)) or (1L shl (NAT - 64)) or (1L shl (NATIONAL - 64)) or (1L shl (NATLANG - 64)) or (1L shl (NN - 64)) or (1L shl (NO - 64)) or (1L shl (NOADATA - 64)) or (1L shl (NOADV - 64)) or (1L shl (NOALIAS - 64)) or (1L shl (NOAWO - 64)) or (1L shl (NOBLOCK0 - 64)) or (1L shl (NOC - 64)) or (1L shl (NOCBLCARD - 64)) or (1L shl (NOCICS - 64)) or (1L shl (NOCMPR2 - 64)) or (1L shl (NOCOMPILE - 64)) or (1L shl (NOCPSM - 64)) or (1L shl (NOCURR - 64)) or (1L shl (NOCURRENCY - 64)) or (1L shl (NOD - 64)) or (1L shl (NODATEPROC - 64)) or (1L shl (NODBCS - 64)) or (1L shl (NODE - 64)) or (1L shl (NODEBUG - 64)) or (1L shl (NODECK - 64)) or (1L shl (NODIAGTRUNC - 64)) or (1L shl (NODLL - 64)) or (1L shl (NODU - 64)) or (1L shl (NODUMP - 64)) or (1L shl (NODP - 64)) or (1L shl (NODTR - 64)))) != 0L) || ((((_la - 128)) and 0x3f.inv()) == 0 && ((1L shl (_la - 128)) and ((1L shl (NODYN - 128)) or (1L shl (NODYNAM - 128)) or (1L shl (NOEDF - 128)) or (1L shl (NOEJPD - 128)) or (1L shl (NOEPILOG - 128)) or (1L shl (NOEXIT - 128)) or (1L shl (NOEXP - 128)) or (1L shl (NOEXPORTALL - 128)) or (1L shl (NOF - 128)) or (1L shl (NOFASTSRT - 128)) or (1L shl (NOFEPI - 128)) or (1L shl (NOFLAG - 128)) or (1L shl (NOFLAGMIG - 128)) or (1L shl (NOFLAGSTD - 128)) or (1L shl (NOFSRT - 128)) or (1L shl (NOGRAPHIC - 128)) or (1L shl (NOHOOK - 128)) or (1L shl (NOLENGTH - 128)) or (1L shl (NOLIB - 128)) or (1L shl (NOLINKAGE - 128)) or (1L shl (NOLIST - 128)) or (1L shl (NOMAP - 128)) or (1L shl (NOMD - 128)) or (1L shl (NOMDECK - 128)) or (1L shl (NONAME - 128)) or (1L shl (NONUM - 128)) or (1L shl (NONUMBER - 128)) or (1L shl (NOOBJ - 128)) or (1L shl (NOOBJECT - 128)) or (1L shl (NOOFF - 128)) or (1L shl (NOOFFSET - 128)) or (1L shl (NOOPSEQUENCE - 128)) or (1L shl (NOOPT - 128)) or (1L shl (NOOPTIMIZE - 128)) or (1L shl (NOOPTIONS - 128)) or (1L shl (NOP - 128)) or (1L shl (NOPFD - 128)) or (1L shl (NOPROLOG - 128)) or (1L shl (NORENT - 128)) or (1L shl (NOS - 128)) or (1L shl (NOSEP - 128)) or (1L shl (NOSEPARATE - 128)) or (1L shl (NOSEQ - 128)) or (1L shl (NOSOURCE - 128)) or (1L shl (NOSPIE - 128)) or (1L shl (NOSQL - 128)) or (1L shl (NOSQLC - 128)) or (1L shl (NOSQLCCSID - 128)) or (1L shl (NOSSR - 128)) or (1L shl (NOSSRANGE - 128)) or (1L shl (NOSTDTRUNC - 128)) or (1L shl (NOSEQUENCE - 128)) or (1L shl (NOTERM - 128)) or (1L shl (NOTERMINAL - 128)) or (1L shl (NOTEST - 128)) or (1L shl (NOTHREAD - 128)) or (1L shl (NOTRIG - 128)) or (1L shl (NOVBREF - 128)) or (1L shl (NOWORD - 128)) or (1L shl (NOX - 128)) or (1L shl (NOXREF - 128)) or (1L shl (NOZWB - 128)) or (1L shl (NS - 128)))) != 0L) || ((((_la - 192)) and 0x3f.inv()) == 0 && ((1L shl (_la - 192)) and ((1L shl (NSEQ - 192)) or (1L shl (NSYMBOL - 192)) or (1L shl (NUM - 192)) or (1L shl (NUMBER - 192)) or (1L shl (NUMPROC - 192)) or (1L shl (OBJ - 192)) or (1L shl (OBJECT - 192)) or (1L shl (OF - 192)) or (1L shl (OFF - 192)) or (1L shl (OFFSET - 192)) or (1L shl (ON - 192)) or (1L shl (OP - 192)) or (1L shl (OPMARGINS - 192)) or (1L shl (OPSEQUENCE - 192)) or (1L shl (OPT - 192)) or (1L shl (OPTFILE - 192)) or (1L shl (OPTIMIZE - 192)) or (1L shl (OPTIONS - 192)) or (1L shl (OUT - 192)) or (1L shl (OUTDD - 192)) or (1L shl (PFD - 192)) or (1L shl (PPTDBG - 192)) or (1L shl (PGMN - 192)) or (1L shl (PGMNAME - 192)) or (1L shl (PROCESS - 192)) or (1L shl (PROLOG - 192)) or (1L shl (QUOTE - 192)) or (1L shl (RENT - 192)) or (1L shl (REPLACING - 192)) or (1L shl (RMODE - 192)) or (1L shl (RPARENCHAR - 192)) or (1L shl (SEP - 192)) or (1L shl (SEPARATE - 192)) or (1L shl (SEQ - 192)) or (1L shl (SEQUENCE - 192)) or (1L shl (SHORT - 192)) or (1L shl (SIZE - 192)) or (1L shl (SOURCE - 192)) or (1L shl (SP - 192)) or (1L shl (SPACE - 192)) or (1L shl (SPIE - 192)) or (1L shl (SQL - 192)) or (1L shl (SQLC - 192)) or (1L shl (SQLCCSID - 192)) or (1L shl (SS - 192)) or (1L shl (SSR - 192)) or (1L shl (SSRANGE - 192)) or (1L shl (STD - 192)) or (1L shl (SYSEIB - 192)) or (1L shl (SZ - 192)) or (1L shl (TERM - 192)) or (1L shl (TERMINAL - 192)) or (1L shl (TEST - 192)) or (1L shl (THREAD - 192)) or (1L shl (TITLE - 192)) or (1L shl (TRIG - 192)) or (1L shl (TRUNC - 192)) or (1L shl (UE - 192)))) != 0L) || ((((_la - 256)) and 0x3f.inv()) == 0 && ((1L shl (_la - 256)) and ((1L shl (UPPER - 256)) or (1L shl (VBREF - 256)) or (1L shl (WD - 256)) or (1L shl (XMLPARSE - 256)) or (1L shl (XMLSS - 256)) or (1L shl (XOPTS - 256)) or (1L shl (XREF - 256)) or (1L shl (YEARWINDOW - 256)) or (1L shl (YW - 256)) or (1L shl (ZWB - 256)) or (1L shl (C_CHAR - 256)) or (1L shl (D_CHAR - 256)) or (1L shl (E_CHAR - 256)) or (1L shl (F_CHAR - 256)) or (1L shl (H_CHAR - 256)) or (1L shl (I_CHAR - 256)) or (1L shl (M_CHAR - 256)) or (1L shl (N_CHAR - 256)) or (1L shl (Q_CHAR - 256)) or (1L shl (S_CHAR - 256)) or (1L shl (U_CHAR - 256)) or (1L shl (W_CHAR - 256)) or (1L shl (X_CHAR - 256)) or (1L shl (COMMACHAR - 256)) or (1L shl (DOT - 256)) or (1L shl (NONNUMERICLITERAL - 256)) or (1L shl (NUMERICLITERAL - 256)) or (1L shl (IDENTIFIER - 256)) or (1L shl (FILENAME - 256)) or (1L shl (NEWLINE - 256)) or (1L shl (TEXT - 256)))) != 0L)) {
				if (true){
				this.state = 637
				charData()
				}
			}

			this.state = 640
			match(DOUBLEEQUALCHAR) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class CharDataContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_charData.id
	        set(value) { throw RuntimeException() }
		fun findCharDataLine() : List<CharDataLineContext> = getRuleContexts(solver.getType("CharDataLineContext"))
		fun findCharDataLine(i: Int) : CharDataLineContext? = getRuleContext(solver.getType("CharDataLineContext"),i)
		fun NEWLINE() : List<TerminalNode> = getTokens(Cobol85PreprocessorParser.Tokens.NEWLINE.id)
		fun NEWLINE(i: Int) : TerminalNode = getToken(Cobol85PreprocessorParser.Tokens.NEWLINE.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).enterCharData(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).exitCharData(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is Cobol85PreprocessorVisitor ) return (visitor as Cobol85PreprocessorVisitor<out T>).visitCharData(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  charData() : CharDataContext {
		var _localctx : CharDataContext = CharDataContext(context, state)
		enterRule(_localctx, 46, Rules.RULE_charData.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 644 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				this.state = 644
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				ADATA , ADV , ALIAS , ANSI , ANY , APOST , AR , ARITH , AUTO , AWO , BIN , BLOCK0 , BUF , BUFSIZE , BY , CBL , CBLCARD , CO , COBOL2 , COBOL3 , CODEPAGE , COMPAT , COMPILE , CP , CPP , CPSM , CS , CURR , CURRENCY , DATA , DATEPROC , DBCS , DD , DEBUG , DECK , DIAGTRUNC , DLI , DLL , DP , DTR , DU , DUMP , DYN , DYNAM , EDF , EJECT , EJPD , EN , ENGLISH , EPILOG , EXCI , EXIT , EXP , EXPORTALL , EXTEND , FASTSRT , FLAG , FLAGSTD , FSRT , FULL , GDS , GRAPHIC , HOOK , IN , INTDATE , JA , JP , KA , LANG , LANGUAGE , LC , LENGTH , LIB , LILIAN , LIN , LINECOUNT , LINKAGE , LIST , LM , LONGMIXED , LONGUPPER , LPARENCHAR , LU , MAP , MARGINS , MAX , MD , MDECK , MIG , MIXED , NAME , NAT , NATIONAL , NATLANG , NN , NO , NOADATA , NOADV , NOALIAS , NOAWO , NOBLOCK0 , NOC , NOCBLCARD , NOCICS , NOCMPR2 , NOCOMPILE , NOCPSM , NOCURR , NOCURRENCY , NOD , NODATEPROC , NODBCS , NODE , NODEBUG , NODECK , NODIAGTRUNC , NODLL , NODU , NODUMP , NODP , NODTR , NODYN , NODYNAM , NOEDF , NOEJPD , NOEPILOG , NOEXIT , NOEXP , NOEXPORTALL , NOF , NOFASTSRT , NOFEPI , NOFLAG , NOFLAGMIG , NOFLAGSTD , NOFSRT , NOGRAPHIC , NOHOOK , NOLENGTH , NOLIB , NOLINKAGE , NOLIST , NOMAP , NOMD , NOMDECK , NONAME , NONUM , NONUMBER , NOOBJ , NOOBJECT , NOOFF , NOOFFSET , NOOPSEQUENCE , NOOPT , NOOPTIMIZE , NOOPTIONS , NOP , NOPFD , NOPROLOG , NORENT , NOS , NOSEP , NOSEPARATE , NOSEQ , NOSOURCE , NOSPIE , NOSQL , NOSQLC , NOSQLCCSID , NOSSR , NOSSRANGE , NOSTDTRUNC , NOSEQUENCE , NOTERM , NOTERMINAL , NOTEST , NOTHREAD , NOTRIG , NOVBREF , NOWORD , NOX , NOXREF , NOZWB , NS , NSEQ , NSYMBOL , NUM , NUMBER , NUMPROC , OBJ , OBJECT , OF , OFF , OFFSET , ON , OP , OPMARGINS , OPSEQUENCE , OPT , OPTFILE , OPTIMIZE , OPTIONS , OUT , OUTDD , PFD , PPTDBG , PGMN , PGMNAME , PROCESS , PROLOG , QUOTE , RENT , REPLACING , RMODE , RPARENCHAR , SEP , SEPARATE , SEQ , SEQUENCE , SHORT , SIZE , SOURCE , SP , SPACE , SPIE , SQL , SQLC , SQLCCSID , SS , SSR , SSRANGE , STD , SYSEIB , SZ , TERM , TERMINAL , TEST , THREAD , TITLE , TRIG , TRUNC , UE , UPPER , VBREF , WD , XMLPARSE , XMLSS , XOPTS , XREF , YEARWINDOW , YW , ZWB , C_CHAR , D_CHAR , E_CHAR , F_CHAR , H_CHAR , I_CHAR , M_CHAR , N_CHAR , Q_CHAR , S_CHAR , U_CHAR , W_CHAR , X_CHAR , COMMACHAR , DOT , NONNUMERICLITERAL , NUMERICLITERAL , IDENTIFIER , FILENAME , TEXT  ->  /*LL1AltBlock*/{if (true){
				this.state = 642
				charDataLine()
				}}
				NEWLINE  ->  /*LL1AltBlock*/{if (true){
				this.state = 643
				match(NEWLINE) as Token
				}}
				else -> throw NoViableAltException(this)
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 646 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,68,context)
			} while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER )
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class CharDataSqlContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_charDataSql.id
	        set(value) { throw RuntimeException() }
		fun findCharDataLine() : List<CharDataLineContext> = getRuleContexts(solver.getType("CharDataLineContext"))
		fun findCharDataLine(i: Int) : CharDataLineContext? = getRuleContext(solver.getType("CharDataLineContext"),i)
		fun COPY() : List<TerminalNode> = getTokens(Cobol85PreprocessorParser.Tokens.COPY.id)
		fun COPY(i: Int) : TerminalNode = getToken(Cobol85PreprocessorParser.Tokens.COPY.id, i) as TerminalNode
		fun REPLACE() : List<TerminalNode> = getTokens(Cobol85PreprocessorParser.Tokens.REPLACE.id)
		fun REPLACE(i: Int) : TerminalNode = getToken(Cobol85PreprocessorParser.Tokens.REPLACE.id, i) as TerminalNode
		fun NEWLINE() : List<TerminalNode> = getTokens(Cobol85PreprocessorParser.Tokens.NEWLINE.id)
		fun NEWLINE(i: Int) : TerminalNode = getToken(Cobol85PreprocessorParser.Tokens.NEWLINE.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).enterCharDataSql(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).exitCharDataSql(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is Cobol85PreprocessorVisitor ) return (visitor as Cobol85PreprocessorVisitor<out T>).visitCharDataSql(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  charDataSql() : CharDataSqlContext {
		var _localctx : CharDataSqlContext = CharDataSqlContext(context, state)
		enterRule(_localctx, 48, Rules.RULE_charDataSql.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 652 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				this.state = 652
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				ADATA , ADV , ALIAS , ANSI , ANY , APOST , AR , ARITH , AUTO , AWO , BIN , BLOCK0 , BUF , BUFSIZE , BY , CBL , CBLCARD , CO , COBOL2 , COBOL3 , CODEPAGE , COMPAT , COMPILE , CP , CPP , CPSM , CS , CURR , CURRENCY , DATA , DATEPROC , DBCS , DD , DEBUG , DECK , DIAGTRUNC , DLI , DLL , DP , DTR , DU , DUMP , DYN , DYNAM , EDF , EJECT , EJPD , EN , ENGLISH , EPILOG , EXCI , EXIT , EXP , EXPORTALL , EXTEND , FASTSRT , FLAG , FLAGSTD , FSRT , FULL , GDS , GRAPHIC , HOOK , IN , INTDATE , JA , JP , KA , LANG , LANGUAGE , LC , LENGTH , LIB , LILIAN , LIN , LINECOUNT , LINKAGE , LIST , LM , LONGMIXED , LONGUPPER , LPARENCHAR , LU , MAP , MARGINS , MAX , MD , MDECK , MIG , MIXED , NAME , NAT , NATIONAL , NATLANG , NN , NO , NOADATA , NOADV , NOALIAS , NOAWO , NOBLOCK0 , NOC , NOCBLCARD , NOCICS , NOCMPR2 , NOCOMPILE , NOCPSM , NOCURR , NOCURRENCY , NOD , NODATEPROC , NODBCS , NODE , NODEBUG , NODECK , NODIAGTRUNC , NODLL , NODU , NODUMP , NODP , NODTR , NODYN , NODYNAM , NOEDF , NOEJPD , NOEPILOG , NOEXIT , NOEXP , NOEXPORTALL , NOF , NOFASTSRT , NOFEPI , NOFLAG , NOFLAGMIG , NOFLAGSTD , NOFSRT , NOGRAPHIC , NOHOOK , NOLENGTH , NOLIB , NOLINKAGE , NOLIST , NOMAP , NOMD , NOMDECK , NONAME , NONUM , NONUMBER , NOOBJ , NOOBJECT , NOOFF , NOOFFSET , NOOPSEQUENCE , NOOPT , NOOPTIMIZE , NOOPTIONS , NOP , NOPFD , NOPROLOG , NORENT , NOS , NOSEP , NOSEPARATE , NOSEQ , NOSOURCE , NOSPIE , NOSQL , NOSQLC , NOSQLCCSID , NOSSR , NOSSRANGE , NOSTDTRUNC , NOSEQUENCE , NOTERM , NOTERMINAL , NOTEST , NOTHREAD , NOTRIG , NOVBREF , NOWORD , NOX , NOXREF , NOZWB , NS , NSEQ , NSYMBOL , NUM , NUMBER , NUMPROC , OBJ , OBJECT , OF , OFF , OFFSET , ON , OP , OPMARGINS , OPSEQUENCE , OPT , OPTFILE , OPTIMIZE , OPTIONS , OUT , OUTDD , PFD , PPTDBG , PGMN , PGMNAME , PROCESS , PROLOG , QUOTE , RENT , REPLACING , RMODE , RPARENCHAR , SEP , SEPARATE , SEQ , SEQUENCE , SHORT , SIZE , SOURCE , SP , SPACE , SPIE , SQL , SQLC , SQLCCSID , SS , SSR , SSRANGE , STD , SYSEIB , SZ , TERM , TERMINAL , TEST , THREAD , TITLE , TRIG , TRUNC , UE , UPPER , VBREF , WD , XMLPARSE , XMLSS , XOPTS , XREF , YEARWINDOW , YW , ZWB , C_CHAR , D_CHAR , E_CHAR , F_CHAR , H_CHAR , I_CHAR , M_CHAR , N_CHAR , Q_CHAR , S_CHAR , U_CHAR , W_CHAR , X_CHAR , COMMACHAR , DOT , NONNUMERICLITERAL , NUMERICLITERAL , IDENTIFIER , FILENAME , TEXT  ->  /*LL1AltBlock*/{if (true){
				this.state = 648
				charDataLine()
				}}
				COPY  ->  /*LL1AltBlock*/{if (true){
				this.state = 649
				match(COPY) as Token
				}}
				REPLACE  ->  /*LL1AltBlock*/{if (true){
				this.state = 650
				match(REPLACE) as Token
				}}
				NEWLINE  ->  /*LL1AltBlock*/{if (true){
				this.state = 651
				match(NEWLINE) as Token
				}}
				else -> throw NoViableAltException(this)
				}
				}
				this.state = 654 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl ADATA) or (1L shl ADV) or (1L shl ALIAS) or (1L shl ANSI) or (1L shl ANY) or (1L shl APOST) or (1L shl AR) or (1L shl ARITH) or (1L shl AUTO) or (1L shl AWO) or (1L shl BIN) or (1L shl BLOCK0) or (1L shl BUF) or (1L shl BUFSIZE) or (1L shl BY) or (1L shl CBL) or (1L shl CBLCARD) or (1L shl CO) or (1L shl COBOL2) or (1L shl COBOL3) or (1L shl CODEPAGE) or (1L shl COMPAT) or (1L shl COMPILE) or (1L shl COPY) or (1L shl CP) or (1L shl CPP) or (1L shl CPSM) or (1L shl CS) or (1L shl CURR) or (1L shl CURRENCY) or (1L shl DATA) or (1L shl DATEPROC) or (1L shl DBCS) or (1L shl DD) or (1L shl DEBUG) or (1L shl DECK) or (1L shl DIAGTRUNC) or (1L shl DLI) or (1L shl DLL) or (1L shl DP) or (1L shl DTR) or (1L shl DU) or (1L shl DUMP) or (1L shl DYN) or (1L shl DYNAM) or (1L shl EDF) or (1L shl EJECT) or (1L shl EJPD) or (1L shl EN) or (1L shl ENGLISH) or (1L shl EPILOG) or (1L shl EXCI) or (1L shl EXIT) or (1L shl EXP) or (1L shl EXPORTALL) or (1L shl EXTEND) or (1L shl FASTSRT) or (1L shl FLAG) or (1L shl FLAGSTD))) != 0L) || ((((_la - 64)) and 0x3f.inv()) == 0 && ((1L shl (_la - 64)) and ((1L shl (FSRT - 64)) or (1L shl (FULL - 64)) or (1L shl (GDS - 64)) or (1L shl (GRAPHIC - 64)) or (1L shl (HOOK - 64)) or (1L shl (IN - 64)) or (1L shl (INTDATE - 64)) or (1L shl (JA - 64)) or (1L shl (JP - 64)) or (1L shl (KA - 64)) or (1L shl (LANG - 64)) or (1L shl (LANGUAGE - 64)) or (1L shl (LC - 64)) or (1L shl (LENGTH - 64)) or (1L shl (LIB - 64)) or (1L shl (LILIAN - 64)) or (1L shl (LIN - 64)) or (1L shl (LINECOUNT - 64)) or (1L shl (LINKAGE - 64)) or (1L shl (LIST - 64)) or (1L shl (LM - 64)) or (1L shl (LONGMIXED - 64)) or (1L shl (LONGUPPER - 64)) or (1L shl (LPARENCHAR - 64)) or (1L shl (LU - 64)) or (1L shl (MAP - 64)) or (1L shl (MARGINS - 64)) or (1L shl (MAX - 64)) or (1L shl (MD - 64)) or (1L shl (MDECK - 64)) or (1L shl (MIG - 64)) or (1L shl (MIXED - 64)) or (1L shl (NAME - 64)) or (1L shl (NAT - 64)) or (1L shl (NATIONAL - 64)) or (1L shl (NATLANG - 64)) or (1L shl (NN - 64)) or (1L shl (NO - 64)) or (1L shl (NOADATA - 64)) or (1L shl (NOADV - 64)) or (1L shl (NOALIAS - 64)) or (1L shl (NOAWO - 64)) or (1L shl (NOBLOCK0 - 64)) or (1L shl (NOC - 64)) or (1L shl (NOCBLCARD - 64)) or (1L shl (NOCICS - 64)) or (1L shl (NOCMPR2 - 64)) or (1L shl (NOCOMPILE - 64)) or (1L shl (NOCPSM - 64)) or (1L shl (NOCURR - 64)) or (1L shl (NOCURRENCY - 64)) or (1L shl (NOD - 64)) or (1L shl (NODATEPROC - 64)) or (1L shl (NODBCS - 64)) or (1L shl (NODE - 64)) or (1L shl (NODEBUG - 64)) or (1L shl (NODECK - 64)) or (1L shl (NODIAGTRUNC - 64)) or (1L shl (NODLL - 64)) or (1L shl (NODU - 64)) or (1L shl (NODUMP - 64)) or (1L shl (NODP - 64)) or (1L shl (NODTR - 64)))) != 0L) || ((((_la - 128)) and 0x3f.inv()) == 0 && ((1L shl (_la - 128)) and ((1L shl (NODYN - 128)) or (1L shl (NODYNAM - 128)) or (1L shl (NOEDF - 128)) or (1L shl (NOEJPD - 128)) or (1L shl (NOEPILOG - 128)) or (1L shl (NOEXIT - 128)) or (1L shl (NOEXP - 128)) or (1L shl (NOEXPORTALL - 128)) or (1L shl (NOF - 128)) or (1L shl (NOFASTSRT - 128)) or (1L shl (NOFEPI - 128)) or (1L shl (NOFLAG - 128)) or (1L shl (NOFLAGMIG - 128)) or (1L shl (NOFLAGSTD - 128)) or (1L shl (NOFSRT - 128)) or (1L shl (NOGRAPHIC - 128)) or (1L shl (NOHOOK - 128)) or (1L shl (NOLENGTH - 128)) or (1L shl (NOLIB - 128)) or (1L shl (NOLINKAGE - 128)) or (1L shl (NOLIST - 128)) or (1L shl (NOMAP - 128)) or (1L shl (NOMD - 128)) or (1L shl (NOMDECK - 128)) or (1L shl (NONAME - 128)) or (1L shl (NONUM - 128)) or (1L shl (NONUMBER - 128)) or (1L shl (NOOBJ - 128)) or (1L shl (NOOBJECT - 128)) or (1L shl (NOOFF - 128)) or (1L shl (NOOFFSET - 128)) or (1L shl (NOOPSEQUENCE - 128)) or (1L shl (NOOPT - 128)) or (1L shl (NOOPTIMIZE - 128)) or (1L shl (NOOPTIONS - 128)) or (1L shl (NOP - 128)) or (1L shl (NOPFD - 128)) or (1L shl (NOPROLOG - 128)) or (1L shl (NORENT - 128)) or (1L shl (NOS - 128)) or (1L shl (NOSEP - 128)) or (1L shl (NOSEPARATE - 128)) or (1L shl (NOSEQ - 128)) or (1L shl (NOSOURCE - 128)) or (1L shl (NOSPIE - 128)) or (1L shl (NOSQL - 128)) or (1L shl (NOSQLC - 128)) or (1L shl (NOSQLCCSID - 128)) or (1L shl (NOSSR - 128)) or (1L shl (NOSSRANGE - 128)) or (1L shl (NOSTDTRUNC - 128)) or (1L shl (NOSEQUENCE - 128)) or (1L shl (NOTERM - 128)) or (1L shl (NOTERMINAL - 128)) or (1L shl (NOTEST - 128)) or (1L shl (NOTHREAD - 128)) or (1L shl (NOTRIG - 128)) or (1L shl (NOVBREF - 128)) or (1L shl (NOWORD - 128)) or (1L shl (NOX - 128)) or (1L shl (NOXREF - 128)) or (1L shl (NOZWB - 128)) or (1L shl (NS - 128)))) != 0L) || ((((_la - 192)) and 0x3f.inv()) == 0 && ((1L shl (_la - 192)) and ((1L shl (NSEQ - 192)) or (1L shl (NSYMBOL - 192)) or (1L shl (NUM - 192)) or (1L shl (NUMBER - 192)) or (1L shl (NUMPROC - 192)) or (1L shl (OBJ - 192)) or (1L shl (OBJECT - 192)) or (1L shl (OF - 192)) or (1L shl (OFF - 192)) or (1L shl (OFFSET - 192)) or (1L shl (ON - 192)) or (1L shl (OP - 192)) or (1L shl (OPMARGINS - 192)) or (1L shl (OPSEQUENCE - 192)) or (1L shl (OPT - 192)) or (1L shl (OPTFILE - 192)) or (1L shl (OPTIMIZE - 192)) or (1L shl (OPTIONS - 192)) or (1L shl (OUT - 192)) or (1L shl (OUTDD - 192)) or (1L shl (PFD - 192)) or (1L shl (PPTDBG - 192)) or (1L shl (PGMN - 192)) or (1L shl (PGMNAME - 192)) or (1L shl (PROCESS - 192)) or (1L shl (PROLOG - 192)) or (1L shl (QUOTE - 192)) or (1L shl (RENT - 192)) or (1L shl (REPLACE - 192)) or (1L shl (REPLACING - 192)) or (1L shl (RMODE - 192)) or (1L shl (RPARENCHAR - 192)) or (1L shl (SEP - 192)) or (1L shl (SEPARATE - 192)) or (1L shl (SEQ - 192)) or (1L shl (SEQUENCE - 192)) or (1L shl (SHORT - 192)) or (1L shl (SIZE - 192)) or (1L shl (SOURCE - 192)) or (1L shl (SP - 192)) or (1L shl (SPACE - 192)) or (1L shl (SPIE - 192)) or (1L shl (SQL - 192)) or (1L shl (SQLC - 192)) or (1L shl (SQLCCSID - 192)) or (1L shl (SS - 192)) or (1L shl (SSR - 192)) or (1L shl (SSRANGE - 192)) or (1L shl (STD - 192)) or (1L shl (SYSEIB - 192)) or (1L shl (SZ - 192)) or (1L shl (TERM - 192)) or (1L shl (TERMINAL - 192)) or (1L shl (TEST - 192)) or (1L shl (THREAD - 192)) or (1L shl (TITLE - 192)) or (1L shl (TRIG - 192)) or (1L shl (TRUNC - 192)) or (1L shl (UE - 192)))) != 0L) || ((((_la - 256)) and 0x3f.inv()) == 0 && ((1L shl (_la - 256)) and ((1L shl (UPPER - 256)) or (1L shl (VBREF - 256)) or (1L shl (WD - 256)) or (1L shl (XMLPARSE - 256)) or (1L shl (XMLSS - 256)) or (1L shl (XOPTS - 256)) or (1L shl (XREF - 256)) or (1L shl (YEARWINDOW - 256)) or (1L shl (YW - 256)) or (1L shl (ZWB - 256)) or (1L shl (C_CHAR - 256)) or (1L shl (D_CHAR - 256)) or (1L shl (E_CHAR - 256)) or (1L shl (F_CHAR - 256)) or (1L shl (H_CHAR - 256)) or (1L shl (I_CHAR - 256)) or (1L shl (M_CHAR - 256)) or (1L shl (N_CHAR - 256)) or (1L shl (Q_CHAR - 256)) or (1L shl (S_CHAR - 256)) or (1L shl (U_CHAR - 256)) or (1L shl (W_CHAR - 256)) or (1L shl (X_CHAR - 256)) or (1L shl (COMMACHAR - 256)) or (1L shl (DOT - 256)) or (1L shl (NONNUMERICLITERAL - 256)) or (1L shl (NUMERICLITERAL - 256)) or (1L shl (IDENTIFIER - 256)) or (1L shl (FILENAME - 256)) or (1L shl (NEWLINE - 256)) or (1L shl (TEXT - 256)))) != 0L) )
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class CharDataLineContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_charDataLine.id
	        set(value) { throw RuntimeException() }
		fun findCobolWord() : List<CobolWordContext> = getRuleContexts(solver.getType("CobolWordContext"))
		fun findCobolWord(i: Int) : CobolWordContext? = getRuleContext(solver.getType("CobolWordContext"),i)
		fun findLiteral() : List<LiteralContext> = getRuleContexts(solver.getType("LiteralContext"))
		fun findLiteral(i: Int) : LiteralContext? = getRuleContext(solver.getType("LiteralContext"),i)
		fun findFilename() : List<FilenameContext> = getRuleContexts(solver.getType("FilenameContext"))
		fun findFilename(i: Int) : FilenameContext? = getRuleContext(solver.getType("FilenameContext"),i)
		fun TEXT() : List<TerminalNode> = getTokens(Cobol85PreprocessorParser.Tokens.TEXT.id)
		fun TEXT(i: Int) : TerminalNode = getToken(Cobol85PreprocessorParser.Tokens.TEXT.id, i) as TerminalNode
		fun DOT() : List<TerminalNode> = getTokens(Cobol85PreprocessorParser.Tokens.DOT.id)
		fun DOT(i: Int) : TerminalNode = getToken(Cobol85PreprocessorParser.Tokens.DOT.id, i) as TerminalNode
		fun LPARENCHAR() : List<TerminalNode> = getTokens(Cobol85PreprocessorParser.Tokens.LPARENCHAR.id)
		fun LPARENCHAR(i: Int) : TerminalNode = getToken(Cobol85PreprocessorParser.Tokens.LPARENCHAR.id, i) as TerminalNode
		fun RPARENCHAR() : List<TerminalNode> = getTokens(Cobol85PreprocessorParser.Tokens.RPARENCHAR.id)
		fun RPARENCHAR(i: Int) : TerminalNode = getToken(Cobol85PreprocessorParser.Tokens.RPARENCHAR.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).enterCharDataLine(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).exitCharDataLine(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is Cobol85PreprocessorVisitor ) return (visitor as Cobol85PreprocessorVisitor<out T>).visitCharDataLine(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  charDataLine() : CharDataLineContext {
		var _localctx : CharDataLineContext = CharDataLineContext(context, state)
		enterRule(_localctx, 50, Rules.RULE_charDataLine.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 663 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				this.state = 663
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				ADATA , ADV , ALIAS , ANSI , ANY , APOST , AR , ARITH , AUTO , AWO , BIN , BLOCK0 , BUF , BUFSIZE , BY , CBL , CBLCARD , CO , COBOL2 , COBOL3 , CODEPAGE , COMPAT , COMPILE , CP , CPP , CPSM , CS , CURR , CURRENCY , DATA , DATEPROC , DBCS , DD , DEBUG , DECK , DIAGTRUNC , DLI , DLL , DP , DTR , DU , DUMP , DYN , DYNAM , EDF , EJECT , EJPD , EN , ENGLISH , EPILOG , EXCI , EXIT , EXP , EXPORTALL , EXTEND , FASTSRT , FLAG , FLAGSTD , FSRT , FULL , GDS , GRAPHIC , HOOK , IN , INTDATE , JA , JP , KA , LANG , LANGUAGE , LC , LENGTH , LIB , LILIAN , LIN , LINECOUNT , LINKAGE , LIST , LM , LONGMIXED , LONGUPPER , LU , MAP , MARGINS , MAX , MD , MDECK , MIG , MIXED , NAME , NAT , NATIONAL , NATLANG , NN , NO , NOADATA , NOADV , NOALIAS , NOAWO , NOBLOCK0 , NOC , NOCBLCARD , NOCICS , NOCMPR2 , NOCOMPILE , NOCPSM , NOCURR , NOCURRENCY , NOD , NODATEPROC , NODBCS , NODE , NODEBUG , NODECK , NODIAGTRUNC , NODLL , NODU , NODUMP , NODP , NODTR , NODYN , NODYNAM , NOEDF , NOEJPD , NOEPILOG , NOEXIT , NOEXP , NOEXPORTALL , NOF , NOFASTSRT , NOFEPI , NOFLAG , NOFLAGMIG , NOFLAGSTD , NOFSRT , NOGRAPHIC , NOHOOK , NOLENGTH , NOLIB , NOLINKAGE , NOLIST , NOMAP , NOMD , NOMDECK , NONAME , NONUM , NONUMBER , NOOBJ , NOOBJECT , NOOFF , NOOFFSET , NOOPSEQUENCE , NOOPT , NOOPTIMIZE , NOOPTIONS , NOP , NOPFD , NOPROLOG , NORENT , NOS , NOSEP , NOSEPARATE , NOSEQ , NOSOURCE , NOSPIE , NOSQL , NOSQLC , NOSQLCCSID , NOSSR , NOSSRANGE , NOSTDTRUNC , NOSEQUENCE , NOTERM , NOTERMINAL , NOTEST , NOTHREAD , NOTRIG , NOVBREF , NOWORD , NOX , NOXREF , NOZWB , NS , NSEQ , NSYMBOL , NUM , NUMBER , NUMPROC , OBJ , OBJECT , OF , OFF , OFFSET , ON , OP , OPMARGINS , OPSEQUENCE , OPT , OPTFILE , OPTIMIZE , OPTIONS , OUT , OUTDD , PFD , PPTDBG , PGMN , PGMNAME , PROCESS , PROLOG , QUOTE , RENT , REPLACING , RMODE , SEP , SEPARATE , SEQ , SEQUENCE , SHORT , SIZE , SOURCE , SP , SPACE , SPIE , SQL , SQLC , SQLCCSID , SS , SSR , SSRANGE , STD , SYSEIB , SZ , TERM , TERMINAL , TEST , THREAD , TITLE , TRIG , TRUNC , UE , UPPER , VBREF , WD , XMLPARSE , XMLSS , XOPTS , XREF , YEARWINDOW , YW , ZWB , C_CHAR , D_CHAR , E_CHAR , F_CHAR , H_CHAR , I_CHAR , M_CHAR , N_CHAR , Q_CHAR , S_CHAR , U_CHAR , W_CHAR , X_CHAR , COMMACHAR , IDENTIFIER  ->  /*LL1AltBlock*/{if (true){
				this.state = 656
				cobolWord()
				}}
				NONNUMERICLITERAL , NUMERICLITERAL  ->  /*LL1AltBlock*/{if (true){
				this.state = 657
				literal()
				}}
				FILENAME  ->  /*LL1AltBlock*/{if (true){
				this.state = 658
				filename()
				}}
				TEXT  ->  /*LL1AltBlock*/{if (true){
				this.state = 659
				match(TEXT) as Token
				}}
				DOT  ->  /*LL1AltBlock*/{if (true){
				this.state = 660
				match(DOT) as Token
				}}
				LPARENCHAR  ->  /*LL1AltBlock*/{if (true){
				this.state = 661
				match(LPARENCHAR) as Token
				}}
				RPARENCHAR  ->  /*LL1AltBlock*/{if (true){
				this.state = 662
				match(RPARENCHAR) as Token
				}}
				else -> throw NoViableAltException(this)
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 665 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,72,context)
			} while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER )
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class CobolWordContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_cobolWord.id
	        set(value) { throw RuntimeException() }
		fun IDENTIFIER() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.IDENTIFIER.id, 0)
		fun findCharDataKeyword() : CharDataKeywordContext? = getRuleContext(solver.getType("CharDataKeywordContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).enterCobolWord(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).exitCobolWord(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is Cobol85PreprocessorVisitor ) return (visitor as Cobol85PreprocessorVisitor<out T>).visitCobolWord(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  cobolWord() : CobolWordContext {
		var _localctx : CobolWordContext = CobolWordContext(context, state)
		enterRule(_localctx, 52, Rules.RULE_cobolWord.id)
		try {
			this.state = 669
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			IDENTIFIER  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 667
			match(IDENTIFIER) as Token
			}}
			ADATA , ADV , ALIAS , ANSI , ANY , APOST , AR , ARITH , AUTO , AWO , BIN , BLOCK0 , BUF , BUFSIZE , BY , CBL , CBLCARD , CO , COBOL2 , COBOL3 , CODEPAGE , COMPAT , COMPILE , CP , CPP , CPSM , CS , CURR , CURRENCY , DATA , DATEPROC , DBCS , DD , DEBUG , DECK , DIAGTRUNC , DLI , DLL , DP , DTR , DU , DUMP , DYN , DYNAM , EDF , EJECT , EJPD , EN , ENGLISH , EPILOG , EXCI , EXIT , EXP , EXPORTALL , EXTEND , FASTSRT , FLAG , FLAGSTD , FSRT , FULL , GDS , GRAPHIC , HOOK , IN , INTDATE , JA , JP , KA , LANG , LANGUAGE , LC , LENGTH , LIB , LILIAN , LIN , LINECOUNT , LINKAGE , LIST , LM , LONGMIXED , LONGUPPER , LU , MAP , MARGINS , MAX , MD , MDECK , MIG , MIXED , NAME , NAT , NATIONAL , NATLANG , NN , NO , NOADATA , NOADV , NOALIAS , NOAWO , NOBLOCK0 , NOC , NOCBLCARD , NOCICS , NOCMPR2 , NOCOMPILE , NOCPSM , NOCURR , NOCURRENCY , NOD , NODATEPROC , NODBCS , NODE , NODEBUG , NODECK , NODIAGTRUNC , NODLL , NODU , NODUMP , NODP , NODTR , NODYN , NODYNAM , NOEDF , NOEJPD , NOEPILOG , NOEXIT , NOEXP , NOEXPORTALL , NOF , NOFASTSRT , NOFEPI , NOFLAG , NOFLAGMIG , NOFLAGSTD , NOFSRT , NOGRAPHIC , NOHOOK , NOLENGTH , NOLIB , NOLINKAGE , NOLIST , NOMAP , NOMD , NOMDECK , NONAME , NONUM , NONUMBER , NOOBJ , NOOBJECT , NOOFF , NOOFFSET , NOOPSEQUENCE , NOOPT , NOOPTIMIZE , NOOPTIONS , NOP , NOPFD , NOPROLOG , NORENT , NOS , NOSEP , NOSEPARATE , NOSEQ , NOSOURCE , NOSPIE , NOSQL , NOSQLC , NOSQLCCSID , NOSSR , NOSSRANGE , NOSTDTRUNC , NOSEQUENCE , NOTERM , NOTERMINAL , NOTEST , NOTHREAD , NOTRIG , NOVBREF , NOWORD , NOX , NOXREF , NOZWB , NS , NSEQ , NSYMBOL , NUM , NUMBER , NUMPROC , OBJ , OBJECT , OF , OFF , OFFSET , ON , OP , OPMARGINS , OPSEQUENCE , OPT , OPTFILE , OPTIMIZE , OPTIONS , OUT , OUTDD , PFD , PPTDBG , PGMN , PGMNAME , PROCESS , PROLOG , QUOTE , RENT , REPLACING , RMODE , SEP , SEPARATE , SEQ , SEQUENCE , SHORT , SIZE , SOURCE , SP , SPACE , SPIE , SQL , SQLC , SQLCCSID , SS , SSR , SSRANGE , STD , SYSEIB , SZ , TERM , TERMINAL , TEST , THREAD , TITLE , TRIG , TRUNC , UE , UPPER , VBREF , WD , XMLPARSE , XMLSS , XOPTS , XREF , YEARWINDOW , YW , ZWB , C_CHAR , D_CHAR , E_CHAR , F_CHAR , H_CHAR , I_CHAR , M_CHAR , N_CHAR , Q_CHAR , S_CHAR , U_CHAR , W_CHAR , X_CHAR , COMMACHAR  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 668
			charDataKeyword()
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

	open class LiteralContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_literal.id
	        set(value) { throw RuntimeException() }
		fun NONNUMERICLITERAL() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NONNUMERICLITERAL.id, 0)
		fun NUMERICLITERAL() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NUMERICLITERAL.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).enterLiteral(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).exitLiteral(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is Cobol85PreprocessorVisitor ) return (visitor as Cobol85PreprocessorVisitor<out T>).visitLiteral(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  literal() : LiteralContext {
		var _localctx : LiteralContext = LiteralContext(context, state)
		enterRule(_localctx, 54, Rules.RULE_literal.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 671
			_la = _input!!.LA(1)
			if ( !(_la==NONNUMERICLITERAL || _la==NUMERICLITERAL) ) {
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

	open class FilenameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_filename.id
	        set(value) { throw RuntimeException() }
		fun FILENAME() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.FILENAME.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).enterFilename(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).exitFilename(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is Cobol85PreprocessorVisitor ) return (visitor as Cobol85PreprocessorVisitor<out T>).visitFilename(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  filename() : FilenameContext {
		var _localctx : FilenameContext = FilenameContext(context, state)
		enterRule(_localctx, 56, Rules.RULE_filename.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 673
			match(FILENAME) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class CharDataKeywordContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_charDataKeyword.id
	        set(value) { throw RuntimeException() }
		fun ADATA() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.ADATA.id, 0)
		fun ADV() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.ADV.id, 0)
		fun ALIAS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.ALIAS.id, 0)
		fun ANSI() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.ANSI.id, 0)
		fun ANY() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.ANY.id, 0)
		fun APOST() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.APOST.id, 0)
		fun AR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.AR.id, 0)
		fun ARITH() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.ARITH.id, 0)
		fun AUTO() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.AUTO.id, 0)
		fun AWO() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.AWO.id, 0)
		fun BIN() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.BIN.id, 0)
		fun BLOCK0() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.BLOCK0.id, 0)
		fun BUF() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.BUF.id, 0)
		fun BUFSIZE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.BUFSIZE.id, 0)
		fun BY() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.BY.id, 0)
		fun CBL() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.CBL.id, 0)
		fun CBLCARD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.CBLCARD.id, 0)
		fun CO() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.CO.id, 0)
		fun COBOL2() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.COBOL2.id, 0)
		fun COBOL3() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.COBOL3.id, 0)
		fun CODEPAGE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.CODEPAGE.id, 0)
		fun COMMACHAR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.COMMACHAR.id, 0)
		fun COMPAT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.COMPAT.id, 0)
		fun COMPILE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.COMPILE.id, 0)
		fun CP() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.CP.id, 0)
		fun CPP() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.CPP.id, 0)
		fun CPSM() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.CPSM.id, 0)
		fun CS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.CS.id, 0)
		fun CURR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.CURR.id, 0)
		fun CURRENCY() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.CURRENCY.id, 0)
		fun DATA() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DATA.id, 0)
		fun DATEPROC() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DATEPROC.id, 0)
		fun DBCS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DBCS.id, 0)
		fun DD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DD.id, 0)
		fun DEBUG() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DEBUG.id, 0)
		fun DECK() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DECK.id, 0)
		fun DIAGTRUNC() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DIAGTRUNC.id, 0)
		fun DLI() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DLI.id, 0)
		fun DLL() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DLL.id, 0)
		fun DP() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DP.id, 0)
		fun DTR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DTR.id, 0)
		fun DU() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DU.id, 0)
		fun DUMP() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DUMP.id, 0)
		fun DYN() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DYN.id, 0)
		fun DYNAM() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.DYNAM.id, 0)
		fun EDF() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.EDF.id, 0)
		fun EJECT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.EJECT.id, 0)
		fun EJPD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.EJPD.id, 0)
		fun EN() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.EN.id, 0)
		fun ENGLISH() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.ENGLISH.id, 0)
		fun EPILOG() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.EPILOG.id, 0)
		fun EXCI() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.EXCI.id, 0)
		fun EXIT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.EXIT.id, 0)
		fun EXP() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.EXP.id, 0)
		fun EXPORTALL() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.EXPORTALL.id, 0)
		fun EXTEND() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.EXTEND.id, 0)
		fun FASTSRT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.FASTSRT.id, 0)
		fun FLAG() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.FLAG.id, 0)
		fun FLAGSTD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.FLAGSTD.id, 0)
		fun FULL() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.FULL.id, 0)
		fun FSRT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.FSRT.id, 0)
		fun GDS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.GDS.id, 0)
		fun GRAPHIC() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.GRAPHIC.id, 0)
		fun HOOK() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.HOOK.id, 0)
		fun IN() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.IN.id, 0)
		fun INTDATE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.INTDATE.id, 0)
		fun JA() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.JA.id, 0)
		fun JP() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.JP.id, 0)
		fun KA() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.KA.id, 0)
		fun LANG() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.LANG.id, 0)
		fun LANGUAGE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.LANGUAGE.id, 0)
		fun LC() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.LC.id, 0)
		fun LENGTH() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.LENGTH.id, 0)
		fun LIB() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.LIB.id, 0)
		fun LILIAN() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.LILIAN.id, 0)
		fun LIN() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.LIN.id, 0)
		fun LINECOUNT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.LINECOUNT.id, 0)
		fun LINKAGE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.LINKAGE.id, 0)
		fun LIST() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.LIST.id, 0)
		fun LM() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.LM.id, 0)
		fun LONGMIXED() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.LONGMIXED.id, 0)
		fun LONGUPPER() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.LONGUPPER.id, 0)
		fun LU() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.LU.id, 0)
		fun MAP() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.MAP.id, 0)
		fun MARGINS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.MARGINS.id, 0)
		fun MAX() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.MAX.id, 0)
		fun MD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.MD.id, 0)
		fun MDECK() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.MDECK.id, 0)
		fun MIG() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.MIG.id, 0)
		fun MIXED() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.MIXED.id, 0)
		fun NAME() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NAME.id, 0)
		fun NAT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NAT.id, 0)
		fun NATIONAL() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NATIONAL.id, 0)
		fun NATLANG() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NATLANG.id, 0)
		fun NN() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NN.id, 0)
		fun NO() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NO.id, 0)
		fun NOADATA() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOADATA.id, 0)
		fun NOADV() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOADV.id, 0)
		fun NOALIAS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOALIAS.id, 0)
		fun NOAWO() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOAWO.id, 0)
		fun NOBLOCK0() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOBLOCK0.id, 0)
		fun NOC() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOC.id, 0)
		fun NOCBLCARD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOCBLCARD.id, 0)
		fun NOCICS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOCICS.id, 0)
		fun NOCMPR2() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOCMPR2.id, 0)
		fun NOCOMPILE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOCOMPILE.id, 0)
		fun NOCPSM() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOCPSM.id, 0)
		fun NOCURR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOCURR.id, 0)
		fun NOCURRENCY() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOCURRENCY.id, 0)
		fun NOD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOD.id, 0)
		fun NODATEPROC() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NODATEPROC.id, 0)
		fun NODBCS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NODBCS.id, 0)
		fun NODE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NODE.id, 0)
		fun NODEBUG() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NODEBUG.id, 0)
		fun NODECK() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NODECK.id, 0)
		fun NODIAGTRUNC() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NODIAGTRUNC.id, 0)
		fun NODLL() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NODLL.id, 0)
		fun NODU() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NODU.id, 0)
		fun NODUMP() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NODUMP.id, 0)
		fun NODP() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NODP.id, 0)
		fun NODTR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NODTR.id, 0)
		fun NODYN() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NODYN.id, 0)
		fun NODYNAM() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NODYNAM.id, 0)
		fun NOEDF() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOEDF.id, 0)
		fun NOEJPD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOEJPD.id, 0)
		fun NOEPILOG() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOEPILOG.id, 0)
		fun NOEXIT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOEXIT.id, 0)
		fun NOEXP() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOEXP.id, 0)
		fun NOEXPORTALL() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOEXPORTALL.id, 0)
		fun NOF() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOF.id, 0)
		fun NOFASTSRT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOFASTSRT.id, 0)
		fun NOFEPI() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOFEPI.id, 0)
		fun NOFLAG() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOFLAG.id, 0)
		fun NOFLAGMIG() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOFLAGMIG.id, 0)
		fun NOFLAGSTD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOFLAGSTD.id, 0)
		fun NOFSRT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOFSRT.id, 0)
		fun NOGRAPHIC() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOGRAPHIC.id, 0)
		fun NOHOOK() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOHOOK.id, 0)
		fun NOLENGTH() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOLENGTH.id, 0)
		fun NOLIB() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOLIB.id, 0)
		fun NOLINKAGE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOLINKAGE.id, 0)
		fun NOLIST() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOLIST.id, 0)
		fun NOMAP() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOMAP.id, 0)
		fun NOMD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOMD.id, 0)
		fun NOMDECK() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOMDECK.id, 0)
		fun NONAME() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NONAME.id, 0)
		fun NONUM() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NONUM.id, 0)
		fun NONUMBER() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NONUMBER.id, 0)
		fun NOOBJ() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOOBJ.id, 0)
		fun NOOBJECT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOOBJECT.id, 0)
		fun NOOFF() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOOFF.id, 0)
		fun NOOFFSET() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOOFFSET.id, 0)
		fun NOOPSEQUENCE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOOPSEQUENCE.id, 0)
		fun NOOPT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOOPT.id, 0)
		fun NOOPTIMIZE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOOPTIMIZE.id, 0)
		fun NOOPTIONS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOOPTIONS.id, 0)
		fun NOP() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOP.id, 0)
		fun NOPFD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOPFD.id, 0)
		fun NOPROLOG() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOPROLOG.id, 0)
		fun NORENT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NORENT.id, 0)
		fun NOS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOS.id, 0)
		fun NOSEP() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOSEP.id, 0)
		fun NOSEPARATE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOSEPARATE.id, 0)
		fun NOSEQ() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOSEQ.id, 0)
		fun NOSEQUENCE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOSEQUENCE.id, 0)
		fun NOSOURCE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOSOURCE.id, 0)
		fun NOSPIE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOSPIE.id, 0)
		fun NOSQL() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOSQL.id, 0)
		fun NOSQLC() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOSQLC.id, 0)
		fun NOSQLCCSID() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOSQLCCSID.id, 0)
		fun NOSSR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOSSR.id, 0)
		fun NOSSRANGE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOSSRANGE.id, 0)
		fun NOSTDTRUNC() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOSTDTRUNC.id, 0)
		fun NOTERM() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOTERM.id, 0)
		fun NOTERMINAL() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOTERMINAL.id, 0)
		fun NOTEST() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOTEST.id, 0)
		fun NOTHREAD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOTHREAD.id, 0)
		fun NOTRIG() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOTRIG.id, 0)
		fun NOVBREF() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOVBREF.id, 0)
		fun NOWORD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOWORD.id, 0)
		fun NOX() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOX.id, 0)
		fun NOXREF() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOXREF.id, 0)
		fun NOZWB() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NOZWB.id, 0)
		fun NSEQ() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NSEQ.id, 0)
		fun NSYMBOL() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NSYMBOL.id, 0)
		fun NS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NS.id, 0)
		fun NUM() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NUM.id, 0)
		fun NUMBER() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NUMBER.id, 0)
		fun NUMPROC() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.NUMPROC.id, 0)
		fun OBJ() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.OBJ.id, 0)
		fun OBJECT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.OBJECT.id, 0)
		fun ON() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.ON.id, 0)
		fun OF() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.OF.id, 0)
		fun OFF() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.OFF.id, 0)
		fun OFFSET() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.OFFSET.id, 0)
		fun OPMARGINS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.OPMARGINS.id, 0)
		fun OPSEQUENCE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.OPSEQUENCE.id, 0)
		fun OPTIMIZE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.OPTIMIZE.id, 0)
		fun OP() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.OP.id, 0)
		fun OPT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.OPT.id, 0)
		fun OPTFILE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.OPTFILE.id, 0)
		fun OPTIONS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.OPTIONS.id, 0)
		fun OUT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.OUT.id, 0)
		fun OUTDD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.OUTDD.id, 0)
		fun PFD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.PFD.id, 0)
		fun PGMN() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.PGMN.id, 0)
		fun PGMNAME() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.PGMNAME.id, 0)
		fun PPTDBG() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.PPTDBG.id, 0)
		fun PROCESS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.PROCESS.id, 0)
		fun PROLOG() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.PROLOG.id, 0)
		fun QUOTE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.QUOTE.id, 0)
		fun RENT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.RENT.id, 0)
		fun REPLACING() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.REPLACING.id, 0)
		fun RMODE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.RMODE.id, 0)
		fun SEQ() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SEQ.id, 0)
		fun SEQUENCE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SEQUENCE.id, 0)
		fun SEP() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SEP.id, 0)
		fun SEPARATE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SEPARATE.id, 0)
		fun SHORT() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SHORT.id, 0)
		fun SIZE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SIZE.id, 0)
		fun SOURCE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SOURCE.id, 0)
		fun SP() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SP.id, 0)
		fun SPACE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SPACE.id, 0)
		fun SPIE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SPIE.id, 0)
		fun SQL() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SQL.id, 0)
		fun SQLC() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SQLC.id, 0)
		fun SQLCCSID() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SQLCCSID.id, 0)
		fun SS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SS.id, 0)
		fun SSR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SSR.id, 0)
		fun SSRANGE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SSRANGE.id, 0)
		fun STD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.STD.id, 0)
		fun SYSEIB() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SYSEIB.id, 0)
		fun SZ() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.SZ.id, 0)
		fun TERM() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.TERM.id, 0)
		fun TERMINAL() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.TERMINAL.id, 0)
		fun TEST() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.TEST.id, 0)
		fun THREAD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.THREAD.id, 0)
		fun TITLE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.TITLE.id, 0)
		fun TRIG() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.TRIG.id, 0)
		fun TRUNC() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.TRUNC.id, 0)
		fun UE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.UE.id, 0)
		fun UPPER() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.UPPER.id, 0)
		fun VBREF() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.VBREF.id, 0)
		fun WD() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.WD.id, 0)
		fun XMLPARSE() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.XMLPARSE.id, 0)
		fun XMLSS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.XMLSS.id, 0)
		fun XOPTS() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.XOPTS.id, 0)
		fun XREF() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.XREF.id, 0)
		fun YEARWINDOW() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.YEARWINDOW.id, 0)
		fun YW() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.YW.id, 0)
		fun ZWB() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.ZWB.id, 0)
		fun C_CHAR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.C_CHAR.id, 0)
		fun D_CHAR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.D_CHAR.id, 0)
		fun E_CHAR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.E_CHAR.id, 0)
		fun F_CHAR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.F_CHAR.id, 0)
		fun H_CHAR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.H_CHAR.id, 0)
		fun I_CHAR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.I_CHAR.id, 0)
		fun M_CHAR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.M_CHAR.id, 0)
		fun N_CHAR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.N_CHAR.id, 0)
		fun Q_CHAR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.Q_CHAR.id, 0)
		fun S_CHAR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.S_CHAR.id, 0)
		fun U_CHAR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.U_CHAR.id, 0)
		fun W_CHAR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.W_CHAR.id, 0)
		fun X_CHAR() : TerminalNode? = getToken(Cobol85PreprocessorParser.Tokens.X_CHAR.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).enterCharDataKeyword(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is Cobol85PreprocessorListener ) (listener as Cobol85PreprocessorListener).exitCharDataKeyword(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is Cobol85PreprocessorVisitor ) return (visitor as Cobol85PreprocessorVisitor<out T>).visitCharDataKeyword(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  charDataKeyword() : CharDataKeywordContext {
		var _localctx : CharDataKeywordContext = CharDataKeywordContext(context, state)
		enterRule(_localctx, 58, Rules.RULE_charDataKeyword.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 675
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl ADATA) or (1L shl ADV) or (1L shl ALIAS) or (1L shl ANSI) or (1L shl ANY) or (1L shl APOST) or (1L shl AR) or (1L shl ARITH) or (1L shl AUTO) or (1L shl AWO) or (1L shl BIN) or (1L shl BLOCK0) or (1L shl BUF) or (1L shl BUFSIZE) or (1L shl BY) or (1L shl CBL) or (1L shl CBLCARD) or (1L shl CO) or (1L shl COBOL2) or (1L shl COBOL3) or (1L shl CODEPAGE) or (1L shl COMPAT) or (1L shl COMPILE) or (1L shl CP) or (1L shl CPP) or (1L shl CPSM) or (1L shl CS) or (1L shl CURR) or (1L shl CURRENCY) or (1L shl DATA) or (1L shl DATEPROC) or (1L shl DBCS) or (1L shl DD) or (1L shl DEBUG) or (1L shl DECK) or (1L shl DIAGTRUNC) or (1L shl DLI) or (1L shl DLL) or (1L shl DP) or (1L shl DTR) or (1L shl DU) or (1L shl DUMP) or (1L shl DYN) or (1L shl DYNAM) or (1L shl EDF) or (1L shl EJECT) or (1L shl EJPD) or (1L shl EN) or (1L shl ENGLISH) or (1L shl EPILOG) or (1L shl EXCI) or (1L shl EXIT) or (1L shl EXP) or (1L shl EXPORTALL) or (1L shl EXTEND) or (1L shl FASTSRT) or (1L shl FLAG) or (1L shl FLAGSTD))) != 0L) || ((((_la - 64)) and 0x3f.inv()) == 0 && ((1L shl (_la - 64)) and ((1L shl (FSRT - 64)) or (1L shl (FULL - 64)) or (1L shl (GDS - 64)) or (1L shl (GRAPHIC - 64)) or (1L shl (HOOK - 64)) or (1L shl (IN - 64)) or (1L shl (INTDATE - 64)) or (1L shl (JA - 64)) or (1L shl (JP - 64)) or (1L shl (KA - 64)) or (1L shl (LANG - 64)) or (1L shl (LANGUAGE - 64)) or (1L shl (LC - 64)) or (1L shl (LENGTH - 64)) or (1L shl (LIB - 64)) or (1L shl (LILIAN - 64)) or (1L shl (LIN - 64)) or (1L shl (LINECOUNT - 64)) or (1L shl (LINKAGE - 64)) or (1L shl (LIST - 64)) or (1L shl (LM - 64)) or (1L shl (LONGMIXED - 64)) or (1L shl (LONGUPPER - 64)) or (1L shl (LU - 64)) or (1L shl (MAP - 64)) or (1L shl (MARGINS - 64)) or (1L shl (MAX - 64)) or (1L shl (MD - 64)) or (1L shl (MDECK - 64)) or (1L shl (MIG - 64)) or (1L shl (MIXED - 64)) or (1L shl (NAME - 64)) or (1L shl (NAT - 64)) or (1L shl (NATIONAL - 64)) or (1L shl (NATLANG - 64)) or (1L shl (NN - 64)) or (1L shl (NO - 64)) or (1L shl (NOADATA - 64)) or (1L shl (NOADV - 64)) or (1L shl (NOALIAS - 64)) or (1L shl (NOAWO - 64)) or (1L shl (NOBLOCK0 - 64)) or (1L shl (NOC - 64)) or (1L shl (NOCBLCARD - 64)) or (1L shl (NOCICS - 64)) or (1L shl (NOCMPR2 - 64)) or (1L shl (NOCOMPILE - 64)) or (1L shl (NOCPSM - 64)) or (1L shl (NOCURR - 64)) or (1L shl (NOCURRENCY - 64)) or (1L shl (NOD - 64)) or (1L shl (NODATEPROC - 64)) or (1L shl (NODBCS - 64)) or (1L shl (NODE - 64)) or (1L shl (NODEBUG - 64)) or (1L shl (NODECK - 64)) or (1L shl (NODIAGTRUNC - 64)) or (1L shl (NODLL - 64)) or (1L shl (NODU - 64)) or (1L shl (NODUMP - 64)) or (1L shl (NODP - 64)) or (1L shl (NODTR - 64)))) != 0L) || ((((_la - 128)) and 0x3f.inv()) == 0 && ((1L shl (_la - 128)) and ((1L shl (NODYN - 128)) or (1L shl (NODYNAM - 128)) or (1L shl (NOEDF - 128)) or (1L shl (NOEJPD - 128)) or (1L shl (NOEPILOG - 128)) or (1L shl (NOEXIT - 128)) or (1L shl (NOEXP - 128)) or (1L shl (NOEXPORTALL - 128)) or (1L shl (NOF - 128)) or (1L shl (NOFASTSRT - 128)) or (1L shl (NOFEPI - 128)) or (1L shl (NOFLAG - 128)) or (1L shl (NOFLAGMIG - 128)) or (1L shl (NOFLAGSTD - 128)) or (1L shl (NOFSRT - 128)) or (1L shl (NOGRAPHIC - 128)) or (1L shl (NOHOOK - 128)) or (1L shl (NOLENGTH - 128)) or (1L shl (NOLIB - 128)) or (1L shl (NOLINKAGE - 128)) or (1L shl (NOLIST - 128)) or (1L shl (NOMAP - 128)) or (1L shl (NOMD - 128)) or (1L shl (NOMDECK - 128)) or (1L shl (NONAME - 128)) or (1L shl (NONUM - 128)) or (1L shl (NONUMBER - 128)) or (1L shl (NOOBJ - 128)) or (1L shl (NOOBJECT - 128)) or (1L shl (NOOFF - 128)) or (1L shl (NOOFFSET - 128)) or (1L shl (NOOPSEQUENCE - 128)) or (1L shl (NOOPT - 128)) or (1L shl (NOOPTIMIZE - 128)) or (1L shl (NOOPTIONS - 128)) or (1L shl (NOP - 128)) or (1L shl (NOPFD - 128)) or (1L shl (NOPROLOG - 128)) or (1L shl (NORENT - 128)) or (1L shl (NOS - 128)) or (1L shl (NOSEP - 128)) or (1L shl (NOSEPARATE - 128)) or (1L shl (NOSEQ - 128)) or (1L shl (NOSOURCE - 128)) or (1L shl (NOSPIE - 128)) or (1L shl (NOSQL - 128)) or (1L shl (NOSQLC - 128)) or (1L shl (NOSQLCCSID - 128)) or (1L shl (NOSSR - 128)) or (1L shl (NOSSRANGE - 128)) or (1L shl (NOSTDTRUNC - 128)) or (1L shl (NOSEQUENCE - 128)) or (1L shl (NOTERM - 128)) or (1L shl (NOTERMINAL - 128)) or (1L shl (NOTEST - 128)) or (1L shl (NOTHREAD - 128)) or (1L shl (NOTRIG - 128)) or (1L shl (NOVBREF - 128)) or (1L shl (NOWORD - 128)) or (1L shl (NOX - 128)) or (1L shl (NOXREF - 128)) or (1L shl (NOZWB - 128)) or (1L shl (NS - 128)))) != 0L) || ((((_la - 192)) and 0x3f.inv()) == 0 && ((1L shl (_la - 192)) and ((1L shl (NSEQ - 192)) or (1L shl (NSYMBOL - 192)) or (1L shl (NUM - 192)) or (1L shl (NUMBER - 192)) or (1L shl (NUMPROC - 192)) or (1L shl (OBJ - 192)) or (1L shl (OBJECT - 192)) or (1L shl (OF - 192)) or (1L shl (OFF - 192)) or (1L shl (OFFSET - 192)) or (1L shl (ON - 192)) or (1L shl (OP - 192)) or (1L shl (OPMARGINS - 192)) or (1L shl (OPSEQUENCE - 192)) or (1L shl (OPT - 192)) or (1L shl (OPTFILE - 192)) or (1L shl (OPTIMIZE - 192)) or (1L shl (OPTIONS - 192)) or (1L shl (OUT - 192)) or (1L shl (OUTDD - 192)) or (1L shl (PFD - 192)) or (1L shl (PPTDBG - 192)) or (1L shl (PGMN - 192)) or (1L shl (PGMNAME - 192)) or (1L shl (PROCESS - 192)) or (1L shl (PROLOG - 192)) or (1L shl (QUOTE - 192)) or (1L shl (RENT - 192)) or (1L shl (REPLACING - 192)) or (1L shl (RMODE - 192)) or (1L shl (SEP - 192)) or (1L shl (SEPARATE - 192)) or (1L shl (SEQ - 192)) or (1L shl (SEQUENCE - 192)) or (1L shl (SHORT - 192)) or (1L shl (SIZE - 192)) or (1L shl (SOURCE - 192)) or (1L shl (SP - 192)) or (1L shl (SPACE - 192)) or (1L shl (SPIE - 192)) or (1L shl (SQL - 192)) or (1L shl (SQLC - 192)) or (1L shl (SQLCCSID - 192)) or (1L shl (SS - 192)) or (1L shl (SSR - 192)) or (1L shl (SSRANGE - 192)) or (1L shl (STD - 192)) or (1L shl (SYSEIB - 192)) or (1L shl (SZ - 192)) or (1L shl (TERM - 192)) or (1L shl (TERMINAL - 192)) or (1L shl (TEST - 192)) or (1L shl (THREAD - 192)) or (1L shl (TITLE - 192)) or (1L shl (TRIG - 192)) or (1L shl (TRUNC - 192)) or (1L shl (UE - 192)))) != 0L) || ((((_la - 256)) and 0x3f.inv()) == 0 && ((1L shl (_la - 256)) and ((1L shl (UPPER - 256)) or (1L shl (VBREF - 256)) or (1L shl (WD - 256)) or (1L shl (XMLPARSE - 256)) or (1L shl (XMLSS - 256)) or (1L shl (XOPTS - 256)) or (1L shl (XREF - 256)) or (1L shl (YEARWINDOW - 256)) or (1L shl (YW - 256)) or (1L shl (ZWB - 256)) or (1L shl (C_CHAR - 256)) or (1L shl (D_CHAR - 256)) or (1L shl (E_CHAR - 256)) or (1L shl (F_CHAR - 256)) or (1L shl (H_CHAR - 256)) or (1L shl (I_CHAR - 256)) or (1L shl (M_CHAR - 256)) or (1L shl (N_CHAR - 256)) or (1L shl (Q_CHAR - 256)) or (1L shl (S_CHAR - 256)) or (1L shl (U_CHAR - 256)) or (1L shl (W_CHAR - 256)) or (1L shl (X_CHAR - 256)) or (1L shl (COMMACHAR - 256)))) != 0L)) ) {
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

}