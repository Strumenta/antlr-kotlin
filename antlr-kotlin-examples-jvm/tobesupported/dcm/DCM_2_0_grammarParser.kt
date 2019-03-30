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

class DCM_2_0_grammarParser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(DCM_2_0_grammarParser.KonservierungContext::class,
                                                              DCM_2_0_grammarParser.Kons_kopfContext::class,
                                                              DCM_2_0_grammarParser.Modulkopf_infoContext::class,
                                                              DCM_2_0_grammarParser.Mod_zeileContext::class,
                                                              DCM_2_0_grammarParser.Mod_anf_zeileContext::class,
                                                              DCM_2_0_grammarParser.Mod_fort_zeileContext::class,
                                                              DCM_2_0_grammarParser.Mod_ele_nameContext::class,
                                                              DCM_2_0_grammarParser.Mod_ele_wertContext::class,
                                                              DCM_2_0_grammarParser.FunktionsdefContext::class,
                                                              DCM_2_0_grammarParser.FunktionszeileContext::class,
                                                              DCM_2_0_grammarParser.Fkt_versionContext::class,
                                                              DCM_2_0_grammarParser.Fkt_langnameContext::class,
                                                              DCM_2_0_grammarParser.VariantendefContext::class,
                                                              DCM_2_0_grammarParser.VariantenkritContext::class,
                                                              DCM_2_0_grammarParser.Krit_nameContext::class,
                                                              DCM_2_0_grammarParser.Krit_wertContext::class,
                                                              DCM_2_0_grammarParser.Kons_rumpfContext::class,
                                                              DCM_2_0_grammarParser.KenngroesseContext::class,
                                                              DCM_2_0_grammarParser.KennwertContext::class,
                                                              DCM_2_0_grammarParser.KennwerteblockContext::class,
                                                              DCM_2_0_grammarParser.KennlinieContext::class,
                                                              DCM_2_0_grammarParser.KennfeldContext::class,
                                                              DCM_2_0_grammarParser.GruppenstuetzstellenContext::class,
                                                              DCM_2_0_grammarParser.KenntextContext::class,
                                                              DCM_2_0_grammarParser.Kgr_infoContext::class,
                                                              DCM_2_0_grammarParser.Einheit_xContext::class,
                                                              DCM_2_0_grammarParser.Einheit_yContext::class,
                                                              DCM_2_0_grammarParser.Einheit_wContext::class,
                                                              DCM_2_0_grammarParser.LangnameContext::class,
                                                              DCM_2_0_grammarParser.DisplaynameContext::class,
                                                              DCM_2_0_grammarParser.Var_abhangigkeitenContext::class,
                                                              DCM_2_0_grammarParser.Var_abhContext::class,
                                                              DCM_2_0_grammarParser.FunktionszugehorigkeitContext::class,
                                                              DCM_2_0_grammarParser.Anzahl_xContext::class,
                                                              DCM_2_0_grammarParser.Anzahl_yContext::class,
                                                              DCM_2_0_grammarParser.WertelisteContext::class,
                                                              DCM_2_0_grammarParser.Werteliste_kwbContext::class,
                                                              DCM_2_0_grammarParser.Sst_liste_xContext::class,
                                                              DCM_2_0_grammarParser.Kf_zeile_listeContext::class,
                                                              DCM_2_0_grammarParser.Kf_zeile_liste_rContext::class,
                                                              DCM_2_0_grammarParser.Kf_zeile_liste_txContext::class,
                                                              DCM_2_0_grammarParser.RealzahlContext::class)
    }

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "DCM_2_0_grammar.g4"

    override val tokenNames: Array<String?>?
        get() = DCM_2_0_grammarParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = DCM_2_0_grammarParser.Companion.ruleNames
    override val atn: ATN
        get() = DCM_2_0_grammarParser.Companion.ATN

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
        NAME(34),
        TEXT(35),
        INT(36),
        FLOAT(37),
        MINUS(38),
        WS(39),
        COMMENT(40)
    }

    enum class Rules(val id: Int) {
        RULE_konservierung(0),
        RULE_kons_kopf(1),
        RULE_modulkopf_info(2),
        RULE_mod_zeile(3),
        RULE_mod_anf_zeile(4),
        RULE_mod_fort_zeile(5),
        RULE_mod_ele_name(6),
        RULE_mod_ele_wert(7),
        RULE_funktionsdef(8),
        RULE_funktionszeile(9),
        RULE_fkt_version(10),
        RULE_fkt_langname(11),
        RULE_variantendef(12),
        RULE_variantenkrit(13),
        RULE_krit_name(14),
        RULE_krit_wert(15),
        RULE_kons_rumpf(16),
        RULE_kenngroesse(17),
        RULE_kennwert(18),
        RULE_kennwerteblock(19),
        RULE_kennlinie(20),
        RULE_kennfeld(21),
        RULE_gruppenstuetzstellen(22),
        RULE_kenntext(23),
        RULE_kgr_info(24),
        RULE_einheit_x(25),
        RULE_einheit_y(26),
        RULE_einheit_w(27),
        RULE_langname(28),
        RULE_displayname(29),
        RULE_var_abhangigkeiten(30),
        RULE_var_abh(31),
        RULE_funktionszugehorigkeit(32),
        RULE_anzahl_x(33),
        RULE_anzahl_y(34),
        RULE_werteliste(35),
        RULE_werteliste_kwb(36),
        RULE_sst_liste_x(37),
        RULE_kf_zeile_liste(38),
        RULE_kf_zeile_liste_r(39),
        RULE_kf_zeile_liste_tx(40),
        RULE_realzahl(41)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("konservierung", "kons_kopf", "modulkopf_info", 
                                "mod_zeile", "mod_anf_zeile", "mod_fort_zeile", 
                                "mod_ele_name", "mod_ele_wert", "funktionsdef", 
                                "funktionszeile", "fkt_version", "fkt_langname", 
                                "variantendef", "variantenkrit", "krit_name", 
                                "krit_wert", "kons_rumpf", "kenngroesse", 
                                "kennwert", "kennwerteblock", "kennlinie", 
                                "kennfeld", "gruppenstuetzstellen", "kenntext", 
                                "kgr_info", "einheit_x", "einheit_y", "einheit_w", 
                                "langname", "displayname", "var_abhangigkeiten", 
                                "var_abh", "funktionszugehorigkeit", "anzahl_x", 
                                "anzahl_y", "werteliste", "werteliste_kwb", 
                                "sst_liste_x", "kf_zeile_liste", "kf_zeile_liste_r", 
                                "kf_zeile_liste_tx", "realzahl")

        private val LITERAL_NAMES = Arrays.asList<String?>(null, "'\n'", 
                                                           "'KONSERVIERUNG_FORMAT 2.0'", 
                                                           "'MODULKOPF'", 
                                                           "'FUNKTIONEN'", 
                                                           "'END'", "'FKT'", 
                                                           "'VARIANTENKODIERUNG'", 
                                                           "'KRITERIUM'", 
                                                           "'FESTWERT'", 
                                                           "'WERT'", "'TEXT'", 
                                                           "'FESTWERTEBLOCK'", 
                                                           "'KENNLINIE'", 
                                                           "'FESTKENNLINIE'", 
                                                           "'GRUPPENKENNLINIE'", 
                                                           "'KENNFELD'", 
                                                           "'FESTKENNFELD'", 
                                                           "'GRUPPENKENNFELD'", 
                                                           "'STUETZSTELLENVERTEILUNG'", 
                                                           "'TEXTSTRING'", 
                                                           "'EINHEIT_X'", 
                                                           "'EINHEIT_Y'", 
                                                           "'EINHEIT_W'", 
                                                           "'LANGNAME'", 
                                                           "'DISPLAYNAME'", 
                                                           "'VAR'", "','", 
                                                           "'='", "'FUNKTION'", 
                                                           "'ST/X'", "'ST_TX/X'", 
                                                           "'ST/Y'", "'ST_TX/Y'", 
                                                           null, null, null, 
                                                           null, "'-'")
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
                                                            "NAME", "TEXT", 
                                                            "INT", "FLOAT", 
                                                            "MINUS", "WS", 
                                                            "COMMENT")

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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u002a\u024e\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0004\u001c\u0009\u001c\u0004\u001d\u0009\u001d\u0004\u001e\u0009\u001e\u0004\u001f\u0009\u001f\u0004\u0020\u0009\u0020\u0004\u0021\u0009\u0021\u0004\u0022\u0009\u0022\u0004\u0023\u0009\u0023\u0004\u0024\u0009\u0024\u0004\u0025\u0009\u0025\u0004\u0026\u0009\u0026\u0004\u0027\u0009\u0027\u0004\u0028\u0009\u0028\u0004\u0029\u0009\u0029\u0004\u002a\u0009\u002a\u0004\u002b\u0009\u002b\u0003\u0002\u0007\u0002\u0058\u000a\u0002\u000c\u0002\u000e\u0002\u005b\u000b\u0002\u0003\u0002\u0003\u0002\u0006\u0002\u005f\u000a\u0002\u000d\u0002\u000e\u0002\u0060\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0003\u0005\u0003\u0067\u000a\u0003\u0003\u0003\u0005\u0003\u006a\u000a\u0003\u0003\u0003\u0005\u0003\u006d\u000a\u0003\u0003\u0004\u0006\u0004\u0070\u000a\u0004\u000d\u0004\u000e\u0004\u0071\u0003\u0005\u0003\u0005\u0007\u0005\u0076\u000a\u0005\u000c\u0005\u000e\u0005\u0079\u000b\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0006\u0009\u0086\u000a\u0009\u000d\u0009\u000e\u0009\u0087\u0003\u000a\u0003\u000a\u0003\u000a\u0006\u000a\u008d\u000a\u000a\u000d\u000a\u000e\u000a\u008e\u0003\u000a\u0003\u000a\u0006\u000a\u0093\u000a\u000a\u000d\u000a\u000e\u000a\u0094\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000c\u0003\u000c\u0003\u000d\u0003\u000d\u0006\u000d\u00a0\u000a\u000d\u000d\u000d\u000e\u000d\u00a1\u0003\u000e\u0003\u000e\u0003\u000e\u0006\u000e\u00a7\u000a\u000e\u000d\u000e\u000e\u000e\u00a8\u0003\u000e\u0003\u000e\u0006\u000e\u00ad\u000a\u000e\u000d\u000e\u000e\u000e\u00ae\u0003\u000f\u0003\u000f\u0003\u000f\u0007\u000f\u00b4\u000a\u000f\u000c\u000f\u000e\u000f\u00b7\u000b\u000f\u0003\u000f\u0006\u000f\u00ba\u000a\u000f\u000d\u000f\u000e\u000f\u00bb\u0003\u0010\u0003\u0010\u0003\u0011\u0003\u0011\u0003\u0012\u0007\u0012\u00c3\u000a\u0012\u000c\u0012\u000e\u0012\u00c6\u000b\u0012\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0005\u0013\u00ce\u000a\u0013\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0005\u0014\u00d5\u000a\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0006\u0014\u00dc\u000a\u0014\u000d\u0014\u000e\u0014\u00dd\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0005\u0014\u00e5\u000a\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0006\u0014\u00ec\u000a\u0014\u000d\u0014\u000e\u0014\u00ed\u0005\u0014\u00f0\u000a\u0014\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0005\u0015\u00f8\u000a\u0015\u0003\u0015\u0006\u0015\u00fb\u000a\u0015\u000d\u0015\u000e\u0015\u00fc\u0003\u0015\u0003\u0015\u0006\u0015\u0101\u000a\u0015\u000d\u0015\u000e\u0015\u0102\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0005\u0016\u010b\u000a\u0016\u0003\u0016\u0005\u0016\u010e\u000a\u0016\u0003\u0016\u0006\u0016\u0111\u000a\u0016\u000d\u0016\u000e\u0016\u0112\u0003\u0016\u0006\u0016\u0116\u000a\u0016\u000d\u0016\u000e\u0016\u0117\u0003\u0016\u0003\u0016\u0006\u0016\u011c\u000a\u0016\u000d\u0016\u000e\u0016\u011d\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0005\u0016\u0126\u000a\u0016\u0003\u0016\u0005\u0016\u0129\u000a\u0016\u0003\u0016\u0006\u0016\u012c\u000a\u0016\u000d\u0016\u000e\u0016\u012d\u0003\u0016\u0006\u0016\u0131\u000a\u0016\u000d\u0016\u000e\u0016\u0132\u0003\u0016\u0003\u0016\u0006\u0016\u0137\u000a\u0016\u000d\u0016\u000e\u0016\u0138\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0005\u0016\u0141\u000a\u0016\u0003\u0016\u0005\u0016\u0144\u000a\u0016\u0003\u0016\u0006\u0016\u0147\u000a\u0016\u000d\u0016\u000e\u0016\u0148\u0003\u0016\u0006\u0016\u014c\u000a\u0016\u000d\u0016\u000e\u0016\u014d\u0003\u0016\u0003\u0016\u0006\u0016\u0152\u000a\u0016\u000d\u0016\u000e\u0016\u0153\u0005\u0016\u0156\u000a\u0016\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0005\u0017\u015f\u000a\u0017\u0003\u0017\u0005\u0017\u0162\u000a\u0017\u0003\u0017\u0005\u0017\u0165\u000a\u0017\u0003\u0017\u0006\u0017\u0168\u000a\u0017\u000d\u0017\u000e\u0017\u0169\u0003\u0017\u0003\u0017\u0003\u0017\u0006\u0017\u016f\u000a\u0017\u000d\u0017\u000e\u0017\u0170\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0005\u0017\u017a\u000a\u0017\u0003\u0017\u0005\u0017\u017d\u000a\u0017\u0003\u0017\u0005\u0017\u0180\u000a\u0017\u0003\u0017\u0006\u0017\u0183\u000a\u0017\u000d\u0017\u000e\u0017\u0184\u0003\u0017\u0003\u0017\u0003\u0017\u0006\u0017\u018a\u000a\u0017\u000d\u0017\u000e\u0017\u018b\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0005\u0017\u0195\u000a\u0017\u0003\u0017\u0005\u0017\u0198\u000a\u0017\u0003\u0017\u0005\u0017\u019b\u000a\u0017\u0003\u0017\u0006\u0017\u019e\u000a\u0017\u000d\u0017\u000e\u0017\u019f\u0003\u0017\u0003\u0017\u0003\u0017\u0006\u0017\u01a5\u000a\u0017\u000d\u0017\u000e\u0017\u01a6\u0005\u0017\u01a9\u000a\u0017\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u01b1\u000a\u0018\u0003\u0018\u0006\u0018\u01b4\u000a\u0018\u000d\u0018\u000e\u0018\u01b5\u0003\u0018\u0003\u0018\u0006\u0018\u01ba\u000a\u0018\u000d\u0018\u000e\u0018\u01bb\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0006\u0019\u01c7\u000a\u0019\u000d\u0019\u000e\u0019\u01c8\u0003\u001a\u0005\u001a\u01cc\u000a\u001a\u0003\u001a\u0005\u001a\u01cf\u000a\u001a\u0003\u001a\u0005\u001a\u01d2\u000a\u001a\u0003\u001a\u0005\u001a\u01d5\u000a\u001a\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0007\u0020\u01ef\u000a\u0020\u000c\u0020\u000e\u0020\u01f2\u000b\u0020\u0003\u0020\u0003\u0020\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0022\u0003\u0022\u0006\u0022\u01fc\u000a\u0022\u000d\u0022\u000e\u0022\u01fd\u0003\u0022\u0003\u0022\u0003\u0023\u0003\u0023\u0003\u0024\u0003\u0024\u0003\u0025\u0003\u0025\u0006\u0025\u0208\u000a\u0025\u000d\u0025\u000e\u0025\u0209\u0003\u0025\u0003\u0025\u0003\u0026\u0003\u0026\u0006\u0026\u0210\u000a\u0026\u000d\u0026\u000e\u0026\u0211\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0006\u0026\u0218\u000a\u0026\u000d\u0026\u000e\u0026\u0219\u0003\u0026\u0005\u0026\u021d\u000a\u0026\u0003\u0027\u0003\u0027\u0006\u0027\u0221\u000a\u0027\u000d\u0027\u000e\u0027\u0222\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0006\u0027\u0229\u000a\u0027\u000d\u0027\u000e\u0027\u022a\u0003\u0027\u0005\u0027\u022e\u000a\u0027\u0003\u0028\u0006\u0028\u0231\u000a\u0028\u000d\u0028\u000e\u0028\u0232\u0003\u0028\u0006\u0028\u0236\u000a\u0028\u000d\u0028\u000e\u0028\u0237\u0005\u0028\u023a\u000a\u0028\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0006\u0029\u0240\u000a\u0029\u000d\u0029\u000e\u0029\u0241\u0003\u002a\u0003\u002a\u0003\u002a\u0003\u002a\u0006\u002a\u0248\u000a\u002a\u000d\u002a\u000e\u002a\u0249\u0003\u002b\u0003\u002b\u0003\u002b\u0002\u0002\u002c\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0020\u0022\u0024\u0026\u0028\u002a\u002c\u002e\u0030\u0032\u0034\u0036\u0038\u003a\u003c\u003e\u0040\u0042\u0044\u0046\u0048\u004a\u004c\u004e\u0050\u0052\u0054\u0002\u0004\u0003\u0002\u0024\u0025\u0003\u0002\u0026\u0027\u0002\u0278\u0002\u0059\u0003\u0002\u0002\u0002\u0004\u0066\u0003\u0002\u0002\u0002\u0006\u006f\u0003\u0002\u0002\u0002\u0008\u0073\u0003\u0002\u0002\u0002\u000a\u007a\u0003\u0002\u0002\u0002\u000c\u007e\u0003\u0002\u0002\u0002\u000e\u0081\u0003\u0002\u0002\u0002\u0010\u0083\u0003\u0002\u0002\u0002\u0012\u0089\u0003\u0002\u0002\u0002\u0014\u0096\u0003\u0002\u0002\u0002\u0016\u009b\u0003\u0002\u0002\u0002\u0018\u009d\u0003\u0002\u0002\u0002\u001a\u00a3\u0003\u0002\u0002\u0002\u001c\u00b0\u0003\u0002\u0002\u0002\u001e\u00bd\u0003\u0002\u0002\u0002\u0020\u00bf\u0003\u0002\u0002\u0002\u0022\u00c4\u0003\u0002\u0002\u0002\u0024\u00cd\u0003\u0002\u0002\u0002\u0026\u00ef\u0003\u0002\u0002\u0002\u0028\u00f1\u0003\u0002\u0002\u0002\u002a\u0155\u0003\u0002\u0002\u0002\u002c\u01a8\u0003\u0002\u0002\u0002\u002e\u01aa\u0003\u0002\u0002\u0002\u0030\u01bd\u0003\u0002\u0002\u0002\u0032\u01cb\u0003\u0002\u0002\u0002\u0034\u01d6\u0003\u0002\u0002\u0002\u0036\u01da\u0003\u0002\u0002\u0002\u0038\u01de\u0003\u0002\u0002\u0002\u003a\u01e2\u0003\u0002\u0002\u0002\u003c\u01e6\u0003\u0002\u0002\u0002\u003e\u01ea\u0003\u0002\u0002\u0002\u0040\u01f5\u0003\u0002\u0002\u0002\u0042\u01f9\u0003\u0002\u0002\u0002\u0044\u0201\u0003\u0002\u0002\u0002\u0046\u0203\u0003\u0002\u0002\u0002\u0048\u0205\u0003\u0002\u0002\u0002\u004a\u021c\u0003\u0002\u0002\u0002\u004c\u022d\u0003\u0002\u0002\u0002\u004e\u0239\u0003\u0002\u0002\u0002\u0050\u023b\u0003\u0002\u0002\u0002\u0052\u0243\u0003\u0002\u0002\u0002\u0054\u024b\u0003\u0002\u0002\u0002\u0056\u0058\u0007\u0003\u0002\u0002\u0057\u0056\u0003\u0002\u0002\u0002\u0058\u005b\u0003\u0002\u0002\u0002\u0059\u0057\u0003\u0002\u0002\u0002\u0059\u005a\u0003\u0002\u0002\u0002\u005a\u005c\u0003\u0002\u0002\u0002\u005b\u0059\u0003\u0002\u0002\u0002\u005c\u005e\u0007\u0004\u0002\u0002\u005d\u005f\u0007\u0003\u0002\u0002\u005e\u005d\u0003\u0002\u0002\u0002\u005f\u0060\u0003\u0002\u0002\u0002\u0060\u005e\u0003\u0002\u0002\u0002\u0060\u0061\u0003\u0002\u0002\u0002\u0061\u0062\u0003\u0002\u0002\u0002\u0062\u0063\u0005\u0004\u0003\u0002\u0063\u0064\u0005\u0022\u0012\u0002\u0064\u0003\u0003\u0002\u0002\u0002\u0065\u0067\u0005\u0006\u0004\u0002\u0066\u0065\u0003\u0002\u0002\u0002\u0066\u0067\u0003\u0002\u0002\u0002\u0067\u0069\u0003\u0002\u0002\u0002\u0068\u006a\u0005\u0012\u000a\u0002\u0069\u0068\u0003\u0002\u0002\u0002\u0069\u006a\u0003\u0002\u0002\u0002\u006a\u006c\u0003\u0002\u0002\u0002\u006b\u006d\u0005\u001a\u000e\u0002\u006c\u006b\u0003\u0002\u0002\u0002\u006c\u006d\u0003\u0002\u0002\u0002\u006d\u0005\u0003\u0002\u0002\u0002\u006e\u0070\u0005\u0008\u0005\u0002\u006f\u006e\u0003\u0002\u0002\u0002\u0070\u0071\u0003\u0002\u0002\u0002\u0071\u006f\u0003\u0002\u0002\u0002\u0071\u0072\u0003\u0002\u0002\u0002\u0072\u0007\u0003\u0002\u0002\u0002\u0073\u0077\u0005\u000a\u0006\u0002\u0074\u0076\u0005\u000c\u0007\u0002\u0075\u0074\u0003\u0002\u0002\u0002\u0076\u0079\u0003\u0002\u0002\u0002\u0077\u0075\u0003\u0002\u0002\u0002\u0077\u0078\u0003\u0002\u0002\u0002\u0078\u0009\u0003\u0002\u0002\u0002\u0079\u0077\u0003\u0002\u0002\u0002\u007a\u007b\u0007\u0005\u0002\u0002\u007b\u007c\u0005\u000e\u0008\u0002\u007c\u007d\u0005\u0010\u0009\u0002\u007d\u000b\u0003\u0002\u0002\u0002\u007e\u007f\u0007\u0005\u0002\u0002\u007f\u0080\u0005\u0010\u0009\u0002\u0080\u000d\u0003\u0002\u0002\u0002\u0081\u0082\u0007\u0024\u0002\u0002\u0082\u000f\u0003\u0002\u0002\u0002\u0083\u0085\u0007\u0025\u0002\u0002\u0084\u0086\u0007\u0003\u0002\u0002\u0085\u0084\u0003\u0002\u0002\u0002\u0086\u0087\u0003\u0002\u0002\u0002\u0087\u0085\u0003\u0002\u0002\u0002\u0087\u0088\u0003\u0002\u0002\u0002\u0088\u0011\u0003\u0002\u0002\u0002\u0089\u008a\u0007\u0006\u0002\u0002\u008a\u008c\u0007\u0003\u0002\u0002\u008b\u008d\u0005\u0014\u000b\u0002\u008c\u008b\u0003\u0002\u0002\u0002\u008d\u008e\u0003\u0002\u0002\u0002\u008e\u008c\u0003\u0002\u0002\u0002\u008e\u008f\u0003\u0002\u0002\u0002\u008f\u0090\u0003\u0002\u0002\u0002\u0090\u0092\u0007\u0007\u0002\u0002\u0091\u0093\u0007\u0003\u0002\u0002\u0092\u0091\u0003\u0002\u0002\u0002\u0093\u0094\u0003\u0002\u0002\u0002\u0094\u0092\u0003\u0002\u0002\u0002\u0094\u0095\u0003\u0002\u0002\u0002\u0095\u0013\u0003\u0002\u0002\u0002\u0096\u0097\u0007\u0008\u0002\u0002\u0097\u0098\u0007\u0024\u0002\u0002\u0098\u0099\u0005\u0016\u000c\u0002\u0099\u009a\u0005\u0018\u000d\u0002\u009a\u0015\u0003\u0002\u0002\u0002\u009b\u009c\u0007\u0025\u0002\u0002\u009c\u0017\u0003\u0002\u0002\u0002\u009d\u009f\u0007\u0025\u0002\u0002\u009e\u00a0\u0007\u0003\u0002\u0002\u009f\u009e\u0003\u0002\u0002\u0002\u00a0\u00a1\u0003\u0002\u0002\u0002\u00a1\u009f\u0003\u0002\u0002\u0002\u00a1\u00a2\u0003\u0002\u0002\u0002\u00a2\u0019\u0003\u0002\u0002\u0002\u00a3\u00a4\u0007\u0009\u0002\u0002\u00a4\u00a6\u0007\u0003\u0002\u0002\u00a5\u00a7\u0005\u001c\u000f\u0002\u00a6\u00a5\u0003\u0002\u0002\u0002\u00a7\u00a8\u0003\u0002\u0002\u0002\u00a8\u00a6\u0003\u0002\u0002\u0002\u00a8\u00a9\u0003\u0002\u0002\u0002\u00a9\u00aa\u0003\u0002\u0002\u0002\u00aa\u00ac\u0007\u0007\u0002\u0002\u00ab\u00ad\u0007\u0003\u0002\u0002\u00ac\u00ab\u0003\u0002\u0002\u0002\u00ad\u00ae\u0003\u0002\u0002\u0002\u00ae\u00ac\u0003\u0002\u0002\u0002\u00ae\u00af\u0003\u0002\u0002\u0002\u00af\u001b\u0003\u0002\u0002\u0002\u00b0\u00b1\u0007\u000a\u0002\u0002\u00b1\u00b5\u0005\u001e\u0010\u0002\u00b2\u00b4\u0005\u0020\u0011\u0002\u00b3\u00b2\u0003\u0002\u0002\u0002\u00b4\u00b7\u0003\u0002\u0002\u0002\u00b5\u00b3\u0003\u0002\u0002\u0002\u00b5\u00b6\u0003\u0002\u0002\u0002\u00b6\u00b9\u0003\u0002\u0002\u0002\u00b7\u00b5\u0003\u0002\u0002\u0002\u00b8\u00ba\u0007\u0003\u0002\u0002\u00b9\u00b8\u0003\u0002\u0002\u0002\u00ba\u00bb\u0003\u0002\u0002\u0002\u00bb\u00b9\u0003\u0002\u0002\u0002\u00bb\u00bc\u0003\u0002\u0002\u0002\u00bc\u001d\u0003\u0002\u0002\u0002\u00bd\u00be\u0007\u0024\u0002\u0002\u00be\u001f\u0003\u0002\u0002\u0002\u00bf\u00c0\u0007\u0024\u0002\u0002\u00c0\u0021\u0003\u0002\u0002\u0002\u00c1\u00c3\u0005\u0024\u0013\u0002\u00c2\u00c1\u0003\u0002\u0002\u0002\u00c3\u00c6\u0003\u0002\u0002\u0002\u00c4\u00c2\u0003\u0002\u0002\u0002\u00c4\u00c5\u0003\u0002\u0002\u0002\u00c5\u0023\u0003\u0002\u0002\u0002\u00c6\u00c4\u0003\u0002\u0002\u0002\u00c7\u00ce\u0005\u0026\u0014\u0002\u00c8\u00ce\u0005\u0028\u0015\u0002\u00c9\u00ce\u0005\u002a\u0016\u0002\u00ca\u00ce\u0005\u002c\u0017\u0002\u00cb\u00ce\u0005\u002e\u0018\u0002\u00cc\u00ce\u0005\u0030\u0019\u0002\u00cd\u00c7\u0003\u0002\u0002\u0002\u00cd\u00c8\u0003\u0002\u0002\u0002\u00cd\u00c9\u0003\u0002\u0002\u0002\u00cd\u00ca\u0003\u0002\u0002\u0002\u00cd\u00cb\u0003\u0002\u0002\u0002\u00cd\u00cc\u0003\u0002\u0002\u0002\u00ce\u0025\u0003\u0002\u0002\u0002\u00cf\u00d0\u0007\u000b\u0002\u0002\u00d0\u00d1\u0007\u0024\u0002\u0002\u00d1\u00d2\u0007\u0003\u0002\u0002\u00d2\u00d4\u0005\u0032\u001a\u0002\u00d3\u00d5\u0005\u0038\u001d\u0002\u00d4\u00d3\u0003\u0002\u0002\u0002\u00d4\u00d5\u0003\u0002\u0002\u0002\u00d5\u00d6\u0003\u0002\u0002\u0002\u00d6\u00d7\u0007\u000c\u0002\u0002\u00d7\u00d8\u0005\u0054\u002b\u0002\u00d8\u00d9\u0007\u0003\u0002\u0002\u00d9\u00db\u0007\u0007\u0002\u0002\u00da\u00dc\u0007\u0003\u0002\u0002\u00db\u00da\u0003\u0002\u0002\u0002\u00dc\u00dd\u0003\u0002\u0002\u0002\u00dd\u00db\u0003\u0002\u0002\u0002\u00dd\u00de\u0003\u0002\u0002\u0002\u00de\u00f0\u0003\u0002\u0002\u0002\u00df\u00e0\u0007\u000b\u0002\u0002\u00e0\u00e1\u0007\u0024\u0002\u0002\u00e1\u00e2\u0007\u0003\u0002\u0002\u00e2\u00e4\u0005\u0032\u001a\u0002\u00e3\u00e5\u0005\u0038\u001d\u0002\u00e4\u00e3\u0003\u0002\u0002\u0002\u00e4\u00e5\u0003\u0002\u0002\u0002\u00e5\u00e6\u0003\u0002\u0002\u0002\u00e6\u00e7\u0007\u000d\u0002\u0002\u00e7\u00e8\u0007\u0025\u0002\u0002\u00e8\u00e9\u0007\u0003\u0002\u0002\u00e9\u00eb\u0007\u0007\u0002\u0002\u00ea\u00ec\u0007\u0003\u0002\u0002\u00eb\u00ea\u0003\u0002\u0002\u0002\u00ec\u00ed\u0003\u0002\u0002\u0002\u00ed\u00eb\u0003\u0002\u0002\u0002\u00ed\u00ee\u0003\u0002\u0002\u0002\u00ee\u00f0\u0003\u0002\u0002\u0002\u00ef\u00cf\u0003\u0002\u0002\u0002\u00ef\u00df\u0003\u0002\u0002\u0002\u00f0\u0027\u0003\u0002\u0002\u0002\u00f1\u00f2\u0007\u000e\u0002\u0002\u00f2\u00f3\u0007\u0024\u0002\u0002\u00f3\u00f4\u0005\u0044\u0023\u0002\u00f4\u00f5\u0007\u0003\u0002\u0002\u00f5\u00f7\u0005\u0032\u001a\u0002\u00f6\u00f8\u0005\u0038\u001d\u0002\u00f7\u00f6\u0003\u0002\u0002\u0002\u00f7\u00f8\u0003\u0002\u0002\u0002\u00f8\u00fa\u0003\u0002\u0002\u0002\u00f9\u00fb\u0005\u004a\u0026\u0002\u00fa\u00f9\u0003\u0002\u0002\u0002\u00fb\u00fc\u0003\u0002\u0002\u0002\u00fc\u00fa\u0003\u0002\u0002\u0002\u00fc\u00fd\u0003\u0002\u0002\u0002\u00fd\u00fe\u0003\u0002\u0002\u0002\u00fe\u0100\u0007\u0007\u0002\u0002\u00ff\u0101\u0007\u0003\u0002\u0002\u0100\u00ff\u0003\u0002\u0002\u0002\u0101\u0102\u0003\u0002\u0002\u0002\u0102\u0100\u0003\u0002\u0002\u0002\u0102\u0103\u0003\u0002\u0002\u0002\u0103\u0029\u0003\u0002\u0002\u0002\u0104\u0105\u0007\u000f\u0002\u0002\u0105\u0106\u0007\u0024\u0002\u0002\u0106\u0107\u0005\u0044\u0023\u0002\u0107\u0108\u0007\u0003\u0002\u0002\u0108\u010a\u0005\u0032\u001a\u0002\u0109\u010b\u0005\u0034\u001b\u0002\u010a\u0109\u0003\u0002\u0002\u0002\u010a\u010b\u0003\u0002\u0002\u0002\u010b\u010d\u0003\u0002\u0002\u0002\u010c\u010e\u0005\u0038\u001d\u0002\u010d\u010c\u0003\u0002\u0002\u0002\u010d\u010e\u0003\u0002\u0002\u0002\u010e\u0110\u0003\u0002\u0002\u0002\u010f\u0111\u0005\u004c\u0027\u0002\u0110\u010f\u0003\u0002\u0002\u0002\u0111\u0112\u0003\u0002\u0002\u0002\u0112\u0110\u0003\u0002\u0002\u0002\u0112\u0113\u0003\u0002\u0002\u0002\u0113\u0115\u0003\u0002\u0002\u0002\u0114\u0116\u0005\u0048\u0025\u0002\u0115\u0114\u0003\u0002\u0002\u0002\u0116\u0117\u0003\u0002\u0002\u0002\u0117\u0115\u0003\u0002\u0002\u0002\u0117\u0118\u0003\u0002\u0002\u0002\u0118\u0119\u0003\u0002\u0002\u0002\u0119\u011b\u0007\u0007\u0002\u0002\u011a\u011c\u0007\u0003\u0002\u0002\u011b\u011a\u0003\u0002\u0002\u0002\u011c\u011d\u0003\u0002\u0002\u0002\u011d\u011b\u0003\u0002\u0002\u0002\u011d\u011e\u0003\u0002\u0002\u0002\u011e\u0156\u0003\u0002\u0002\u0002\u011f\u0120\u0007\u0010\u0002\u0002\u0120\u0121\u0007\u0024\u0002\u0002\u0121\u0122\u0005\u0044\u0023\u0002\u0122\u0123\u0007\u0003\u0002\u0002\u0123\u0125\u0005\u0032\u001a\u0002\u0124\u0126\u0005\u0034\u001b\u0002\u0125\u0124\u0003\u0002\u0002\u0002\u0125\u0126\u0003\u0002\u0002\u0002\u0126\u0128\u0003\u0002\u0002\u0002\u0127\u0129\u0005\u0038\u001d\u0002\u0128\u0127\u0003\u0002\u0002\u0002\u0128\u0129\u0003\u0002\u0002\u0002\u0129\u012b\u0003\u0002\u0002\u0002\u012a\u012c\u0005\u004c\u0027\u0002\u012b\u012a\u0003\u0002\u0002\u0002\u012c\u012d\u0003\u0002\u0002\u0002\u012d\u012b\u0003\u0002\u0002\u0002\u012d\u012e\u0003\u0002\u0002\u0002\u012e\u0130\u0003\u0002\u0002\u0002\u012f\u0131\u0005\u0048\u0025\u0002\u0130\u012f\u0003\u0002\u0002\u0002\u0131\u0132\u0003\u0002\u0002\u0002\u0132\u0130\u0003\u0002\u0002\u0002\u0132\u0133\u0003\u0002\u0002\u0002\u0133\u0134\u0003\u0002\u0002\u0002\u0134\u0136\u0007\u0007\u0002\u0002\u0135\u0137\u0007\u0003\u0002\u0002\u0136\u0135\u0003\u0002\u0002\u0002\u0137\u0138\u0003\u0002\u0002\u0002\u0138\u0136\u0003\u0002\u0002\u0002\u0138\u0139\u0003\u0002\u0002\u0002\u0139\u0156\u0003\u0002\u0002\u0002\u013a\u013b\u0007\u0011\u0002\u0002\u013b\u013c\u0007\u0024\u0002\u0002\u013c\u013d\u0005\u0044\u0023\u0002\u013d\u013e\u0007\u0003\u0002\u0002\u013e\u0140\u0005\u0032\u001a\u0002\u013f\u0141\u0005\u0034\u001b\u0002\u0140\u013f\u0003\u0002\u0002\u0002\u0140\u0141\u0003\u0002\u0002\u0002\u0141\u0143\u0003\u0002\u0002\u0002\u0142\u0144\u0005\u0038\u001d\u0002\u0143\u0142\u0003\u0002\u0002\u0002\u0143\u0144\u0003\u0002\u0002\u0002\u0144\u0146\u0003\u0002\u0002\u0002\u0145\u0147\u0005\u004c\u0027\u0002\u0146\u0145\u0003\u0002\u0002\u0002\u0147\u0148\u0003\u0002\u0002\u0002\u0148\u0146\u0003\u0002\u0002\u0002\u0148\u0149\u0003\u0002\u0002\u0002\u0149\u014b\u0003\u0002\u0002\u0002\u014a\u014c\u0005\u0048\u0025\u0002\u014b\u014a\u0003\u0002\u0002\u0002\u014c\u014d\u0003\u0002\u0002\u0002\u014d\u014b\u0003\u0002\u0002\u0002\u014d\u014e\u0003\u0002\u0002\u0002\u014e\u014f\u0003\u0002\u0002\u0002\u014f\u0151\u0007\u0007\u0002\u0002\u0150\u0152\u0007\u0003\u0002\u0002\u0151\u0150\u0003\u0002\u0002\u0002\u0152\u0153\u0003\u0002\u0002\u0002\u0153\u0151\u0003\u0002\u0002\u0002\u0153\u0154\u0003\u0002\u0002\u0002\u0154\u0156\u0003\u0002\u0002\u0002\u0155\u0104\u0003\u0002\u0002\u0002\u0155\u011f\u0003\u0002\u0002\u0002\u0155\u013a\u0003\u0002\u0002\u0002\u0156\u002b\u0003\u0002\u0002\u0002\u0157\u0158\u0007\u0012\u0002\u0002\u0158\u0159\u0007\u0024\u0002\u0002\u0159\u015a\u0005\u0044\u0023\u0002\u015a\u015b\u0005\u0046\u0024\u0002\u015b\u015c\u0007\u0003\u0002\u0002\u015c\u015e\u0005\u0032\u001a\u0002\u015d\u015f\u0005\u0034\u001b\u0002\u015e\u015d\u0003\u0002\u0002\u0002\u015e\u015f\u0003\u0002\u0002\u0002\u015f\u0161\u0003\u0002\u0002\u0002\u0160\u0162\u0005\u0036\u001c\u0002\u0161\u0160\u0003\u0002\u0002\u0002\u0161\u0162\u0003\u0002\u0002\u0002\u0162\u0164\u0003\u0002\u0002\u0002\u0163\u0165\u0005\u0038\u001d\u0002\u0164\u0163\u0003\u0002\u0002\u0002\u0164\u0165\u0003\u0002\u0002\u0002\u0165\u0167\u0003\u0002\u0002\u0002\u0166\u0168\u0005\u004c\u0027\u0002\u0167\u0166\u0003\u0002\u0002\u0002\u0168\u0169\u0003\u0002\u0002\u0002\u0169\u0167\u0003\u0002\u0002\u0002\u0169\u016a\u0003\u0002\u0002\u0002\u016a\u016b\u0003\u0002\u0002\u0002\u016b\u016c\u0005\u004e\u0028\u0002\u016c\u016e\u0007\u0007\u0002\u0002\u016d\u016f\u0007\u0003\u0002\u0002\u016e\u016d\u0003\u0002\u0002\u0002\u016f\u0170\u0003\u0002\u0002\u0002\u0170\u016e\u0003\u0002\u0002\u0002\u0170\u0171\u0003\u0002\u0002\u0002\u0171\u01a9\u0003\u0002\u0002\u0002\u0172\u0173\u0007\u0013\u0002\u0002\u0173\u0174\u0007\u0024\u0002\u0002\u0174\u0175\u0005\u0044\u0023\u0002\u0175\u0176\u0005\u0046\u0024\u0002\u0176\u0177\u0007\u0003\u0002\u0002\u0177\u0179\u0005\u0032\u001a\u0002\u0178\u017a\u0005\u0034\u001b\u0002\u0179\u0178\u0003\u0002\u0002\u0002\u0179\u017a\u0003\u0002\u0002\u0002\u017a\u017c\u0003\u0002\u0002\u0002\u017b\u017d\u0005\u0036\u001c\u0002\u017c\u017b\u0003\u0002\u0002\u0002\u017c\u017d\u0003\u0002\u0002\u0002\u017d\u017f\u0003\u0002\u0002\u0002\u017e\u0180\u0005\u0038\u001d\u0002\u017f\u017e\u0003\u0002\u0002\u0002\u017f\u0180\u0003\u0002\u0002\u0002\u0180\u0182\u0003\u0002\u0002\u0002\u0181\u0183\u0005\u004c\u0027\u0002\u0182\u0181\u0003\u0002\u0002\u0002\u0183\u0184\u0003\u0002\u0002\u0002\u0184\u0182\u0003\u0002\u0002\u0002\u0184\u0185\u0003\u0002\u0002\u0002\u0185\u0186\u0003\u0002\u0002\u0002\u0186\u0187\u0005\u004e\u0028\u0002\u0187\u0189\u0007\u0007\u0002\u0002\u0188\u018a\u0007\u0003\u0002\u0002\u0189\u0188\u0003\u0002\u0002\u0002\u018a\u018b\u0003\u0002\u0002\u0002\u018b\u0189\u0003\u0002\u0002\u0002\u018b\u018c\u0003\u0002\u0002\u0002\u018c\u01a9\u0003\u0002\u0002\u0002\u018d\u018e\u0007\u0014\u0002\u0002\u018e\u018f\u0007\u0024\u0002\u0002\u018f\u0190\u0005\u0044\u0023\u0002\u0190\u0191\u0005\u0046\u0024\u0002\u0191\u0192\u0007\u0003\u0002\u0002\u0192\u0194\u0005\u0032\u001a\u0002\u0193\u0195\u0005\u0034\u001b\u0002\u0194\u0193\u0003\u0002\u0002\u0002\u0194\u0195\u0003\u0002\u0002\u0002\u0195\u0197\u0003\u0002\u0002\u0002\u0196\u0198\u0005\u0036\u001c\u0002\u0197\u0196\u0003\u0002\u0002\u0002\u0197\u0198\u0003\u0002\u0002\u0002\u0198\u019a\u0003\u0002\u0002\u0002\u0199\u019b\u0005\u0038\u001d\u0002\u019a\u0199\u0003\u0002\u0002\u0002\u019a\u019b\u0003\u0002\u0002\u0002\u019b\u019d\u0003\u0002\u0002\u0002\u019c\u019e\u0005\u004c\u0027\u0002\u019d\u019c\u0003\u0002\u0002\u0002\u019e\u019f\u0003\u0002\u0002\u0002\u019f\u019d\u0003\u0002\u0002\u0002\u019f\u01a0\u0003\u0002\u0002\u0002\u01a0\u01a1\u0003\u0002\u0002\u0002\u01a1\u01a2\u0005\u004e\u0028\u0002\u01a2\u01a4\u0007\u0007\u0002\u0002\u01a3\u01a5\u0007\u0003\u0002\u0002\u01a4\u01a3\u0003\u0002\u0002\u0002\u01a5\u01a6\u0003\u0002\u0002\u0002\u01a6\u01a4\u0003\u0002\u0002\u0002\u01a6\u01a7\u0003\u0002\u0002\u0002\u01a7\u01a9\u0003\u0002\u0002\u0002\u01a8\u0157\u0003\u0002\u0002\u0002\u01a8\u0172\u0003\u0002\u0002\u0002\u01a8\u018d\u0003\u0002\u0002\u0002\u01a9\u002d\u0003\u0002\u0002\u0002\u01aa\u01ab\u0007\u0015\u0002\u0002\u01ab\u01ac\u0007\u0024\u0002\u0002\u01ac\u01ad\u0005\u0044\u0023\u0002\u01ad\u01ae\u0007\u0003\u0002\u0002\u01ae\u01b0\u0005\u0032\u001a\u0002\u01af\u01b1\u0005\u0034\u001b\u0002\u01b0\u01af\u0003\u0002\u0002\u0002\u01b0\u01b1\u0003\u0002\u0002\u0002\u01b1\u01b3\u0003\u0002\u0002\u0002\u01b2\u01b4\u0005\u004c\u0027\u0002\u01b3\u01b2\u0003\u0002\u0002\u0002\u01b4\u01b5\u0003\u0002\u0002\u0002\u01b5\u01b3\u0003\u0002\u0002\u0002\u01b5\u01b6\u0003\u0002\u0002\u0002\u01b6\u01b7\u0003\u0002\u0002\u0002\u01b7\u01b9\u0007\u0007\u0002\u0002\u01b8\u01ba\u0007\u0003\u0002\u0002\u01b9\u01b8\u0003\u0002\u0002\u0002\u01ba\u01bb\u0003\u0002\u0002\u0002\u01bb\u01b9\u0003\u0002\u0002\u0002\u01bb\u01bc\u0003\u0002\u0002\u0002\u01bc\u002f\u0003\u0002\u0002\u0002\u01bd\u01be\u0007\u0016\u0002\u0002\u01be\u01bf\u0007\u0024\u0002\u0002\u01bf\u01c0\u0007\u0003\u0002\u0002\u01c0\u01c1\u0005\u0032\u001a\u0002\u01c1\u01c2\u0007\u000d\u0002\u0002\u01c2\u01c3\u0007\u0025\u0002\u0002\u01c3\u01c4\u0007\u0003\u0002\u0002\u01c4\u01c6\u0007\u0007\u0002\u0002\u01c5\u01c7\u0007\u0003\u0002\u0002\u01c6\u01c5\u0003\u0002\u0002\u0002\u01c7\u01c8\u0003\u0002\u0002\u0002\u01c8\u01c6\u0003\u0002\u0002\u0002\u01c8\u01c9\u0003\u0002\u0002\u0002\u01c9\u0031\u0003\u0002\u0002\u0002\u01ca\u01cc\u0005\u003a\u001e\u0002\u01cb\u01ca\u0003\u0002\u0002\u0002\u01cb\u01cc\u0003\u0002\u0002\u0002\u01cc\u01ce\u0003\u0002\u0002\u0002\u01cd\u01cf\u0005\u003c\u001f\u0002\u01ce\u01cd\u0003\u0002\u0002\u0002\u01ce\u01cf\u0003\u0002\u0002\u0002\u01cf\u01d1\u0003\u0002\u0002\u0002\u01d0\u01d2\u0005\u003e\u0020\u0002\u01d1\u01d0\u0003\u0002\u0002\u0002\u01d1\u01d2\u0003\u0002\u0002\u0002\u01d2\u01d4\u0003\u0002\u0002\u0002\u01d3\u01d5\u0005\u0042\u0022\u0002\u01d4\u01d3\u0003\u0002\u0002\u0002\u01d4\u01d5\u0003\u0002\u0002\u0002\u01d5\u0033\u0003\u0002\u0002\u0002\u01d6\u01d7\u0007\u0017\u0002\u0002\u01d7\u01d8\u0007\u0025\u0002\u0002\u01d8\u01d9\u0007\u0003\u0002\u0002\u01d9\u0035\u0003\u0002\u0002\u0002\u01da\u01db\u0007\u0018\u0002\u0002\u01db\u01dc\u0007\u0025\u0002\u0002\u01dc\u01dd\u0007\u0003\u0002\u0002\u01dd\u0037\u0003\u0002\u0002\u0002\u01de\u01df\u0007\u0019\u0002\u0002\u01df\u01e0\u0007\u0025\u0002\u0002\u01e0\u01e1\u0007\u0003\u0002\u0002\u01e1\u0039\u0003\u0002\u0002\u0002\u01e2\u01e3\u0007\u001a\u0002\u0002\u01e3\u01e4\u0007\u0025\u0002\u0002\u01e4\u01e5\u0007\u0003\u0002\u0002\u01e5\u003b\u0003\u0002\u0002\u0002\u01e6\u01e7\u0007\u001b\u0002\u0002\u01e7\u01e8\u0009\u0002\u0002\u0002\u01e8\u01e9\u0007\u0003\u0002\u0002\u01e9\u003d\u0003\u0002\u0002\u0002\u01ea\u01eb\u0007\u001c\u0002\u0002\u01eb\u01f0\u0005\u0040\u0021\u0002\u01ec\u01ed\u0007\u001d\u0002\u0002\u01ed\u01ef\u0005\u0040\u0021\u0002\u01ee\u01ec\u0003\u0002\u0002\u0002\u01ef\u01f2\u0003\u0002\u0002\u0002\u01f0\u01ee\u0003\u0002\u0002\u0002\u01f0\u01f1\u0003\u0002\u0002\u0002\u01f1\u01f3\u0003\u0002\u0002\u0002\u01f2\u01f0\u0003\u0002\u0002\u0002\u01f3\u01f4\u0007\u0003\u0002\u0002\u01f4\u003f\u0003\u0002\u0002\u0002\u01f5\u01f6\u0007\u0024\u0002\u0002\u01f6\u01f7\u0007\u001e\u0002\u0002\u01f7\u01f8\u0007\u0024\u0002\u0002\u01f8\u0041\u0003\u0002\u0002\u0002\u01f9\u01fb\u0007\u001f\u0002\u0002\u01fa\u01fc\u0007\u0024\u0002\u0002\u01fb\u01fa\u0003\u0002\u0002\u0002\u01fc\u01fd\u0003\u0002\u0002\u0002\u01fd\u01fb\u0003\u0002\u0002\u0002\u01fd\u01fe\u0003\u0002\u0002\u0002\u01fe\u01ff\u0003\u0002\u0002\u0002\u01ff\u0200\u0007\u0003\u0002\u0002\u0200\u0043\u0003\u0002\u0002\u0002\u0201\u0202\u0007\u0026\u0002\u0002\u0202\u0045\u0003\u0002\u0002\u0002\u0203\u0204\u0007\u0026\u0002\u0002\u0204\u0047\u0003\u0002\u0002\u0002\u0205\u0207\u0007\u000c\u0002\u0002\u0206\u0208\u0005\u0054\u002b\u0002\u0207\u0206\u0003\u0002\u0002\u0002\u0208\u0209\u0003\u0002\u0002\u0002\u0209\u0207\u0003\u0002\u0002\u0002\u0209\u020a\u0003\u0002\u0002\u0002\u020a\u020b\u0003\u0002\u0002\u0002\u020b\u020c\u0007\u0003\u0002\u0002\u020c\u0049\u0003\u0002\u0002\u0002\u020d\u020f\u0007\u000c\u0002\u0002\u020e\u0210\u0005\u0054\u002b\u0002\u020f\u020e\u0003\u0002\u0002\u0002\u0210\u0211\u0003\u0002\u0002\u0002\u0211\u020f\u0003\u0002\u0002\u0002\u0211\u0212\u0003\u0002\u0002\u0002\u0212\u0213\u0003\u0002\u0002\u0002\u0213\u0214\u0007\u0003\u0002\u0002\u0214\u021d\u0003\u0002\u0002\u0002\u0215\u0217\u0007\u000d\u0002\u0002\u0216\u0218\u0007\u0025\u0002\u0002\u0217\u0216\u0003\u0002\u0002\u0002\u0218\u0219\u0003\u0002\u0002\u0002\u0219\u0217\u0003\u0002\u0002\u0002\u0219\u021a\u0003\u0002\u0002\u0002\u021a\u021b\u0003\u0002\u0002\u0002\u021b\u021d\u0007\u0003\u0002\u0002\u021c\u020d\u0003\u0002\u0002\u0002\u021c\u0215\u0003\u0002\u0002\u0002\u021d\u004b\u0003\u0002\u0002\u0002\u021e\u0220\u0007\u0020\u0002\u0002\u021f\u0221\u0005\u0054\u002b\u0002\u0220\u021f\u0003\u0002\u0002\u0002\u0221\u0222\u0003\u0002\u0002\u0002\u0222\u0220\u0003\u0002\u0002\u0002\u0222\u0223\u0003\u0002\u0002\u0002\u0223\u0224\u0003\u0002\u0002\u0002\u0224\u0225\u0007\u0003\u0002\u0002\u0225\u022e\u0003\u0002\u0002\u0002\u0226\u0228\u0007\u0021\u0002\u0002\u0227\u0229\u0007\u0025\u0002\u0002\u0228\u0227\u0003\u0002\u0002\u0002\u0229\u022a\u0003\u0002\u0002\u0002\u022a\u0228\u0003\u0002\u0002\u0002\u022a\u022b\u0003\u0002\u0002\u0002\u022b\u022c\u0003\u0002\u0002\u0002\u022c\u022e\u0007\u0003\u0002\u0002\u022d\u021e\u0003\u0002\u0002\u0002\u022d\u0226\u0003\u0002\u0002\u0002\u022e\u004d\u0003\u0002\u0002\u0002\u022f\u0231\u0005\u0050\u0029\u0002\u0230\u022f\u0003\u0002\u0002\u0002\u0231\u0232\u0003\u0002\u0002\u0002\u0232\u0230\u0003\u0002\u0002\u0002\u0232\u0233\u0003\u0002\u0002\u0002\u0233\u023a\u0003\u0002\u0002\u0002\u0234\u0236\u0005\u0052\u002a\u0002\u0235\u0234\u0003\u0002\u0002\u0002\u0236\u0237\u0003\u0002\u0002\u0002\u0237\u0235\u0003\u0002\u0002\u0002\u0237\u0238\u0003\u0002\u0002\u0002\u0238\u023a\u0003\u0002\u0002\u0002\u0239\u0230\u0003\u0002\u0002\u0002\u0239\u0235\u0003\u0002\u0002\u0002\u023a\u004f\u0003\u0002\u0002\u0002\u023b\u023c\u0007\u0022\u0002\u0002\u023c\u023d\u0005\u0054\u002b\u0002\u023d\u023f\u0007\u0003\u0002\u0002\u023e\u0240\u0005\u0048\u0025\u0002\u023f\u023e\u0003\u0002\u0002\u0002\u0240\u0241\u0003\u0002\u0002\u0002\u0241\u023f\u0003\u0002\u0002\u0002\u0241\u0242\u0003\u0002\u0002\u0002\u0242\u0051\u0003\u0002\u0002\u0002\u0243\u0244\u0007\u0023\u0002\u0002\u0244\u0245\u0007\u0025\u0002\u0002\u0245\u0247\u0007\u0003\u0002\u0002\u0246\u0248\u0005\u0048\u0025\u0002\u0247\u0246\u0003\u0002\u0002\u0002\u0248\u0249\u0003\u0002\u0002\u0002\u0249\u0247\u0003\u0002\u0002\u0002\u0249\u024a\u0003\u0002\u0002\u0002\u024a\u0053\u0003\u0002\u0002\u0002\u024b\u024c\u0009\u0003\u0002\u0002\u024c\u0055\u0003\u0002\u0002\u0002\u0051\u0059\u0060\u0066\u0069\u006c\u0071\u0077\u0087\u008e\u0094\u00a1\u00a8\u00ae\u00b5\u00bb\u00c4\u00cd\u00d4\u00dd\u00e4\u00ed\u00ef\u00f7\u00fc\u0102\u010a\u010d\u0112\u0117\u011d\u0125\u0128\u012d\u0132\u0138\u0140\u0143\u0148\u014d\u0153\u0155\u015e\u0161\u0164\u0169\u0170\u0179\u017c\u017f\u0184\u018b\u0194\u0197\u019a\u019f\u01a6\u01a8\u01b0\u01b5\u01bb\u01c8\u01cb\u01ce\u01d1\u01d4\u01f0\u01fd\u0209\u0211\u0219\u021c\u0222\u022a\u022d\u0232\u0237\u0239\u0241\u0249"

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
    private val NAME = Tokens.NAME.id
    private val TEXT = Tokens.TEXT.id
    private val INT = Tokens.INT.id
    private val FLOAT = Tokens.FLOAT.id
    private val MINUS = Tokens.MINUS.id
    private val WS = Tokens.WS.id
    private val COMMENT = Tokens.COMMENT.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class KonservierungContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_konservierung.id
	        set(value) { throw RuntimeException() }
		fun findKons_kopf() : Kons_kopfContext? = getRuleContext(solver.getType("Kons_kopfContext"),0)
		fun findKons_rumpf() : Kons_rumpfContext? = getRuleContext(solver.getType("Kons_rumpfContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterKonservierung(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitKonservierung(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitKonservierung(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  konservierung() : KonservierungContext {
		var _localctx : KonservierungContext = KonservierungContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_konservierung.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 87
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__0) {
				if (true){
				if (true){
				this.state = 84
				match(T__0) as Token
				}
				}
				this.state = 89
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 90
			match(T__1) as Token
			this.state = 92 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 91
				match(T__0) as Token
				}
				}
				this.state = 94 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__0 )
			this.state = 96
			kons_kopf()
			this.state = 97
			kons_rumpf()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Kons_kopfContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kons_kopf.id
	        set(value) { throw RuntimeException() }
		fun findModulkopf_info() : Modulkopf_infoContext? = getRuleContext(solver.getType("Modulkopf_infoContext"),0)
		fun findFunktionsdef() : FunktionsdefContext? = getRuleContext(solver.getType("FunktionsdefContext"),0)
		fun findVariantendef() : VariantendefContext? = getRuleContext(solver.getType("VariantendefContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterKons_kopf(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitKons_kopf(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitKons_kopf(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  kons_kopf() : Kons_kopfContext {
		var _localctx : Kons_kopfContext = Kons_kopfContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_kons_kopf.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 100
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__2) {
				if (true){
				this.state = 99
				modulkopf_info()
				}
			}

			this.state = 103
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__3) {
				if (true){
				this.state = 102
				funktionsdef()
				}
			}

			this.state = 106
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__6) {
				if (true){
				this.state = 105
				variantendef()
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

	open class Modulkopf_infoContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_modulkopf_info.id
	        set(value) { throw RuntimeException() }
		fun findMod_zeile() : List<Mod_zeileContext> = getRuleContexts(solver.getType("Mod_zeileContext"))
		fun findMod_zeile(i: Int) : Mod_zeileContext? = getRuleContext(solver.getType("Mod_zeileContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterModulkopf_info(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitModulkopf_info(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitModulkopf_info(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  modulkopf_info() : Modulkopf_infoContext {
		var _localctx : Modulkopf_infoContext = Modulkopf_infoContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_modulkopf_info.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 109 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 108
				mod_zeile()
				}
				}
				this.state = 111 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__2 )
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Mod_zeileContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_mod_zeile.id
	        set(value) { throw RuntimeException() }
		fun findMod_anf_zeile() : Mod_anf_zeileContext? = getRuleContext(solver.getType("Mod_anf_zeileContext"),0)
		fun findMod_fort_zeile() : List<Mod_fort_zeileContext> = getRuleContexts(solver.getType("Mod_fort_zeileContext"))
		fun findMod_fort_zeile(i: Int) : Mod_fort_zeileContext? = getRuleContext(solver.getType("Mod_fort_zeileContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterMod_zeile(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitMod_zeile(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitMod_zeile(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  mod_zeile() : Mod_zeileContext {
		var _localctx : Mod_zeileContext = Mod_zeileContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_mod_zeile.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 113
			mod_anf_zeile()
			this.state = 117
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,6,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 114
					mod_fort_zeile()
					}
					} 
				}
				this.state = 119
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,6,context)
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

	open class Mod_anf_zeileContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_mod_anf_zeile.id
	        set(value) { throw RuntimeException() }
		fun findMod_ele_name() : Mod_ele_nameContext? = getRuleContext(solver.getType("Mod_ele_nameContext"),0)
		fun findMod_ele_wert() : Mod_ele_wertContext? = getRuleContext(solver.getType("Mod_ele_wertContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterMod_anf_zeile(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitMod_anf_zeile(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitMod_anf_zeile(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  mod_anf_zeile() : Mod_anf_zeileContext {
		var _localctx : Mod_anf_zeileContext = Mod_anf_zeileContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_mod_anf_zeile.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 120
			match(T__2) as Token
			this.state = 121
			mod_ele_name()
			this.state = 122
			mod_ele_wert()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Mod_fort_zeileContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_mod_fort_zeile.id
	        set(value) { throw RuntimeException() }
		fun findMod_ele_wert() : Mod_ele_wertContext? = getRuleContext(solver.getType("Mod_ele_wertContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterMod_fort_zeile(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitMod_fort_zeile(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitMod_fort_zeile(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  mod_fort_zeile() : Mod_fort_zeileContext {
		var _localctx : Mod_fort_zeileContext = Mod_fort_zeileContext(context, state)
		enterRule(_localctx, 10, Rules.RULE_mod_fort_zeile.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 124
			match(T__2) as Token
			this.state = 125
			mod_ele_wert()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Mod_ele_nameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_mod_ele_name.id
	        set(value) { throw RuntimeException() }
		fun NAME() : TerminalNode? = getToken(DCM_2_0_grammarParser.Tokens.NAME.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterMod_ele_name(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitMod_ele_name(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitMod_ele_name(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  mod_ele_name() : Mod_ele_nameContext {
		var _localctx : Mod_ele_nameContext = Mod_ele_nameContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_mod_ele_name.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 127
			match(NAME) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Mod_ele_wertContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_mod_ele_wert.id
	        set(value) { throw RuntimeException() }
		fun TEXT() : TerminalNode? = getToken(DCM_2_0_grammarParser.Tokens.TEXT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterMod_ele_wert(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitMod_ele_wert(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitMod_ele_wert(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  mod_ele_wert() : Mod_ele_wertContext {
		var _localctx : Mod_ele_wertContext = Mod_ele_wertContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_mod_ele_wert.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 129
			match(TEXT) as Token
			this.state = 131 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 130
				match(T__0) as Token
				}
				}
				this.state = 133 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__0 )
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class FunktionsdefContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_funktionsdef.id
	        set(value) { throw RuntimeException() }
		fun findFunktionszeile() : List<FunktionszeileContext> = getRuleContexts(solver.getType("FunktionszeileContext"))
		fun findFunktionszeile(i: Int) : FunktionszeileContext? = getRuleContext(solver.getType("FunktionszeileContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterFunktionsdef(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitFunktionsdef(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitFunktionsdef(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  funktionsdef() : FunktionsdefContext {
		var _localctx : FunktionsdefContext = FunktionsdefContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_funktionsdef.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 135
			match(T__3) as Token
			this.state = 136
			match(T__0) as Token
			this.state = 138 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 137
				funktionszeile()
				}
				}
				this.state = 140 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__5 )
			this.state = 142
			match(T__4) as Token
			this.state = 144 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 143
				match(T__0) as Token
				}
				}
				this.state = 146 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__0 )
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class FunktionszeileContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_funktionszeile.id
	        set(value) { throw RuntimeException() }
		fun NAME() : TerminalNode? = getToken(DCM_2_0_grammarParser.Tokens.NAME.id, 0)
		fun findFkt_version() : Fkt_versionContext? = getRuleContext(solver.getType("Fkt_versionContext"),0)
		fun findFkt_langname() : Fkt_langnameContext? = getRuleContext(solver.getType("Fkt_langnameContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterFunktionszeile(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitFunktionszeile(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitFunktionszeile(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  funktionszeile() : FunktionszeileContext {
		var _localctx : FunktionszeileContext = FunktionszeileContext(context, state)
		enterRule(_localctx, 18, Rules.RULE_funktionszeile.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 148
			match(T__5) as Token
			this.state = 149
			match(NAME) as Token
			this.state = 150
			fkt_version()
			this.state = 151
			fkt_langname()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Fkt_versionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_fkt_version.id
	        set(value) { throw RuntimeException() }
		fun TEXT() : TerminalNode? = getToken(DCM_2_0_grammarParser.Tokens.TEXT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterFkt_version(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitFkt_version(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitFkt_version(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  fkt_version() : Fkt_versionContext {
		var _localctx : Fkt_versionContext = Fkt_versionContext(context, state)
		enterRule(_localctx, 20, Rules.RULE_fkt_version.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 153
			match(TEXT) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Fkt_langnameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_fkt_langname.id
	        set(value) { throw RuntimeException() }
		fun TEXT() : TerminalNode? = getToken(DCM_2_0_grammarParser.Tokens.TEXT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterFkt_langname(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitFkt_langname(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitFkt_langname(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  fkt_langname() : Fkt_langnameContext {
		var _localctx : Fkt_langnameContext = Fkt_langnameContext(context, state)
		enterRule(_localctx, 22, Rules.RULE_fkt_langname.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 155
			match(TEXT) as Token
			this.state = 157 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 156
				match(T__0) as Token
				}
				}
				this.state = 159 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__0 )
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class VariantendefContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_variantendef.id
	        set(value) { throw RuntimeException() }
		fun findVariantenkrit() : List<VariantenkritContext> = getRuleContexts(solver.getType("VariantenkritContext"))
		fun findVariantenkrit(i: Int) : VariantenkritContext? = getRuleContext(solver.getType("VariantenkritContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterVariantendef(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitVariantendef(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitVariantendef(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  variantendef() : VariantendefContext {
		var _localctx : VariantendefContext = VariantendefContext(context, state)
		enterRule(_localctx, 24, Rules.RULE_variantendef.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 161
			match(T__6) as Token
			this.state = 162
			match(T__0) as Token
			this.state = 164 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 163
				variantenkrit()
				}
				}
				this.state = 166 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__7 )
			this.state = 168
			match(T__4) as Token
			this.state = 170 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 169
				match(T__0) as Token
				}
				}
				this.state = 172 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__0 )
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class VariantenkritContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_variantenkrit.id
	        set(value) { throw RuntimeException() }
		fun findKrit_name() : Krit_nameContext? = getRuleContext(solver.getType("Krit_nameContext"),0)
		fun findKrit_wert() : List<Krit_wertContext> = getRuleContexts(solver.getType("Krit_wertContext"))
		fun findKrit_wert(i: Int) : Krit_wertContext? = getRuleContext(solver.getType("Krit_wertContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterVariantenkrit(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitVariantenkrit(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitVariantenkrit(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  variantenkrit() : VariantenkritContext {
		var _localctx : VariantenkritContext = VariantenkritContext(context, state)
		enterRule(_localctx, 26, Rules.RULE_variantenkrit.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 174
			match(T__7) as Token
			this.state = 175
			krit_name()
			this.state = 179
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==NAME) {
				if (true){
				if (true){
				this.state = 176
				krit_wert()
				}
				}
				this.state = 181
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 183 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 182
				match(T__0) as Token
				}
				}
				this.state = 185 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__0 )
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Krit_nameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_krit_name.id
	        set(value) { throw RuntimeException() }
		fun NAME() : TerminalNode? = getToken(DCM_2_0_grammarParser.Tokens.NAME.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterKrit_name(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitKrit_name(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitKrit_name(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  krit_name() : Krit_nameContext {
		var _localctx : Krit_nameContext = Krit_nameContext(context, state)
		enterRule(_localctx, 28, Rules.RULE_krit_name.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 187
			match(NAME) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Krit_wertContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_krit_wert.id
	        set(value) { throw RuntimeException() }
		fun NAME() : TerminalNode? = getToken(DCM_2_0_grammarParser.Tokens.NAME.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterKrit_wert(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitKrit_wert(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitKrit_wert(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  krit_wert() : Krit_wertContext {
		var _localctx : Krit_wertContext = Krit_wertContext(context, state)
		enterRule(_localctx, 30, Rules.RULE_krit_wert.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 189
			match(NAME) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Kons_rumpfContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kons_rumpf.id
	        set(value) { throw RuntimeException() }
		fun findKenngroesse() : List<KenngroesseContext> = getRuleContexts(solver.getType("KenngroesseContext"))
		fun findKenngroesse(i: Int) : KenngroesseContext? = getRuleContext(solver.getType("KenngroesseContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterKons_rumpf(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitKons_rumpf(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitKons_rumpf(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  kons_rumpf() : Kons_rumpfContext {
		var _localctx : Kons_rumpfContext = Kons_rumpfContext(context, state)
		enterRule(_localctx, 32, Rules.RULE_kons_rumpf.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 194
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__8) or (1L shl T__11) or (1L shl T__12) or (1L shl T__13) or (1L shl T__14) or (1L shl T__15) or (1L shl T__16) or (1L shl T__17) or (1L shl T__18) or (1L shl T__19))) != 0L)) {
				if (true){
				if (true){
				this.state = 191
				kenngroesse()
				}
				}
				this.state = 196
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

	open class KenngroesseContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kenngroesse.id
	        set(value) { throw RuntimeException() }
		fun findKennwert() : KennwertContext? = getRuleContext(solver.getType("KennwertContext"),0)
		fun findKennwerteblock() : KennwerteblockContext? = getRuleContext(solver.getType("KennwerteblockContext"),0)
		fun findKennlinie() : KennlinieContext? = getRuleContext(solver.getType("KennlinieContext"),0)
		fun findKennfeld() : KennfeldContext? = getRuleContext(solver.getType("KennfeldContext"),0)
		fun findGruppenstuetzstellen() : GruppenstuetzstellenContext? = getRuleContext(solver.getType("GruppenstuetzstellenContext"),0)
		fun findKenntext() : KenntextContext? = getRuleContext(solver.getType("KenntextContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterKenngroesse(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitKenngroesse(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitKenngroesse(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  kenngroesse() : KenngroesseContext {
		var _localctx : KenngroesseContext = KenngroesseContext(context, state)
		enterRule(_localctx, 34, Rules.RULE_kenngroesse.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 203
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			T__8  ->  /*LL1AltBlock*/{if (true){
			this.state = 197
			kennwert()
			}}
			T__11  ->  /*LL1AltBlock*/{if (true){
			this.state = 198
			kennwerteblock()
			}}
			T__12 , T__13 , T__14  ->  /*LL1AltBlock*/{if (true){
			this.state = 199
			kennlinie()
			}}
			T__15 , T__16 , T__17  ->  /*LL1AltBlock*/{if (true){
			this.state = 200
			kennfeld()
			}}
			T__18  ->  /*LL1AltBlock*/{if (true){
			this.state = 201
			gruppenstuetzstellen()
			}}
			T__19  ->  /*LL1AltBlock*/{if (true){
			this.state = 202
			kenntext()
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

	open class KennwertContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kennwert.id
	        set(value) { throw RuntimeException() }
		fun NAME() : TerminalNode? = getToken(DCM_2_0_grammarParser.Tokens.NAME.id, 0)
		fun findKgr_info() : Kgr_infoContext? = getRuleContext(solver.getType("Kgr_infoContext"),0)
		fun findRealzahl() : RealzahlContext? = getRuleContext(solver.getType("RealzahlContext"),0)
		fun findEinheit_w() : Einheit_wContext? = getRuleContext(solver.getType("Einheit_wContext"),0)
		fun TEXT() : TerminalNode? = getToken(DCM_2_0_grammarParser.Tokens.TEXT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterKennwert(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitKennwert(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitKennwert(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  kennwert() : KennwertContext {
		var _localctx : KennwertContext = KennwertContext(context, state)
		enterRule(_localctx, 36, Rules.RULE_kennwert.id)
		var _la: Int
		try {
			this.state = 237
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,21,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 205
			match(T__8) as Token
			this.state = 206
			match(NAME) as Token
			this.state = 207
			match(T__0) as Token
			this.state = 208
			kgr_info()
			this.state = 210
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__22) {
				if (true){
				this.state = 209
				einheit_w()
				}
			}

			this.state = 212
			match(T__9) as Token
			this.state = 213
			realzahl()
			this.state = 214
			match(T__0) as Token
			this.state = 215
			match(T__4) as Token
			this.state = 217 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 216
				match(T__0) as Token
				}
				}
				this.state = 219 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__0 )
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 221
			match(T__8) as Token
			this.state = 222
			match(NAME) as Token
			this.state = 223
			match(T__0) as Token
			this.state = 224
			kgr_info()
			this.state = 226
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__22) {
				if (true){
				this.state = 225
				einheit_w()
				}
			}

			this.state = 228
			match(T__10) as Token
			this.state = 229
			match(TEXT) as Token
			this.state = 230
			match(T__0) as Token
			this.state = 231
			match(T__4) as Token
			this.state = 233 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 232
				match(T__0) as Token
				}
				}
				this.state = 235 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__0 )
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

	open class KennwerteblockContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kennwerteblock.id
	        set(value) { throw RuntimeException() }
		fun NAME() : TerminalNode? = getToken(DCM_2_0_grammarParser.Tokens.NAME.id, 0)
		fun findAnzahl_x() : Anzahl_xContext? = getRuleContext(solver.getType("Anzahl_xContext"),0)
		fun findKgr_info() : Kgr_infoContext? = getRuleContext(solver.getType("Kgr_infoContext"),0)
		fun findEinheit_w() : Einheit_wContext? = getRuleContext(solver.getType("Einheit_wContext"),0)
		fun findWerteliste_kwb() : List<Werteliste_kwbContext> = getRuleContexts(solver.getType("Werteliste_kwbContext"))
		fun findWerteliste_kwb(i: Int) : Werteliste_kwbContext? = getRuleContext(solver.getType("Werteliste_kwbContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterKennwerteblock(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitKennwerteblock(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitKennwerteblock(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  kennwerteblock() : KennwerteblockContext {
		var _localctx : KennwerteblockContext = KennwerteblockContext(context, state)
		enterRule(_localctx, 38, Rules.RULE_kennwerteblock.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 239
			match(T__11) as Token
			this.state = 240
			match(NAME) as Token
			this.state = 241
			anzahl_x()
			this.state = 242
			match(T__0) as Token
			this.state = 243
			kgr_info()
			this.state = 245
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__22) {
				if (true){
				this.state = 244
				einheit_w()
				}
			}

			this.state = 248 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 247
				werteliste_kwb()
				}
				}
				this.state = 250 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__9 || _la==T__10 )
			this.state = 252
			match(T__4) as Token
			this.state = 254 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 253
				match(T__0) as Token
				}
				}
				this.state = 256 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__0 )
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class KennlinieContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kennlinie.id
	        set(value) { throw RuntimeException() }
		fun NAME() : TerminalNode? = getToken(DCM_2_0_grammarParser.Tokens.NAME.id, 0)
		fun findAnzahl_x() : Anzahl_xContext? = getRuleContext(solver.getType("Anzahl_xContext"),0)
		fun findKgr_info() : Kgr_infoContext? = getRuleContext(solver.getType("Kgr_infoContext"),0)
		fun findEinheit_x() : Einheit_xContext? = getRuleContext(solver.getType("Einheit_xContext"),0)
		fun findEinheit_w() : Einheit_wContext? = getRuleContext(solver.getType("Einheit_wContext"),0)
		fun findSst_liste_x() : List<Sst_liste_xContext> = getRuleContexts(solver.getType("Sst_liste_xContext"))
		fun findSst_liste_x(i: Int) : Sst_liste_xContext? = getRuleContext(solver.getType("Sst_liste_xContext"),i)
		fun findWerteliste() : List<WertelisteContext> = getRuleContexts(solver.getType("WertelisteContext"))
		fun findWerteliste(i: Int) : WertelisteContext? = getRuleContext(solver.getType("WertelisteContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterKennlinie(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitKennlinie(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitKennlinie(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  kennlinie() : KennlinieContext {
		var _localctx : KennlinieContext = KennlinieContext(context, state)
		enterRule(_localctx, 40, Rules.RULE_kennlinie.id)
		var _la: Int
		try {
			this.state = 339
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			T__12  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 258
			match(T__12) as Token
			}
			this.state = 259
			match(NAME) as Token
			this.state = 260
			anzahl_x()
			this.state = 261
			match(T__0) as Token
			this.state = 262
			kgr_info()
			this.state = 264
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__20) {
				if (true){
				this.state = 263
				einheit_x()
				}
			}

			this.state = 267
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__22) {
				if (true){
				this.state = 266
				einheit_w()
				}
			}

			this.state = 270 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 269
				sst_liste_x()
				}
				}
				this.state = 272 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__29 || _la==T__30 )
			this.state = 275 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 274
				werteliste()
				}
				}
				this.state = 277 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__9 )
			this.state = 279
			match(T__4) as Token
			this.state = 281 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 280
				match(T__0) as Token
				}
				}
				this.state = 283 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__0 )
			}}
			T__13  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			if (true){
			this.state = 285
			match(T__13) as Token
			}
			this.state = 286
			match(NAME) as Token
			this.state = 287
			anzahl_x()
			this.state = 288
			match(T__0) as Token
			this.state = 289
			kgr_info()
			this.state = 291
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__20) {
				if (true){
				this.state = 290
				einheit_x()
				}
			}

			this.state = 294
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__22) {
				if (true){
				this.state = 293
				einheit_w()
				}
			}

			this.state = 297 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 296
				sst_liste_x()
				}
				}
				this.state = 299 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__29 || _la==T__30 )
			this.state = 302 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 301
				werteliste()
				}
				}
				this.state = 304 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__9 )
			this.state = 306
			match(T__4) as Token
			this.state = 308 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 307
				match(T__0) as Token
				}
				}
				this.state = 310 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__0 )
			}}
			T__14  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			if (true){
			this.state = 312
			match(T__14) as Token
			}
			this.state = 313
			match(NAME) as Token
			this.state = 314
			anzahl_x()
			this.state = 315
			match(T__0) as Token
			this.state = 316
			kgr_info()
			this.state = 318
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__20) {
				if (true){
				this.state = 317
				einheit_x()
				}
			}

			this.state = 321
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__22) {
				if (true){
				this.state = 320
				einheit_w()
				}
			}

			this.state = 324 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 323
				sst_liste_x()
				}
				}
				this.state = 326 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__29 || _la==T__30 )
			this.state = 329 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 328
				werteliste()
				}
				}
				this.state = 331 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__9 )
			this.state = 333
			match(T__4) as Token
			this.state = 335 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 334
				match(T__0) as Token
				}
				}
				this.state = 337 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__0 )
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

	open class KennfeldContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kennfeld.id
	        set(value) { throw RuntimeException() }
		fun NAME() : TerminalNode? = getToken(DCM_2_0_grammarParser.Tokens.NAME.id, 0)
		fun findAnzahl_x() : Anzahl_xContext? = getRuleContext(solver.getType("Anzahl_xContext"),0)
		fun findAnzahl_y() : Anzahl_yContext? = getRuleContext(solver.getType("Anzahl_yContext"),0)
		fun findKgr_info() : Kgr_infoContext? = getRuleContext(solver.getType("Kgr_infoContext"),0)
		fun findKf_zeile_liste() : Kf_zeile_listeContext? = getRuleContext(solver.getType("Kf_zeile_listeContext"),0)
		fun findEinheit_x() : Einheit_xContext? = getRuleContext(solver.getType("Einheit_xContext"),0)
		fun findEinheit_y() : Einheit_yContext? = getRuleContext(solver.getType("Einheit_yContext"),0)
		fun findEinheit_w() : Einheit_wContext? = getRuleContext(solver.getType("Einheit_wContext"),0)
		fun findSst_liste_x() : List<Sst_liste_xContext> = getRuleContexts(solver.getType("Sst_liste_xContext"))
		fun findSst_liste_x(i: Int) : Sst_liste_xContext? = getRuleContext(solver.getType("Sst_liste_xContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterKennfeld(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitKennfeld(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitKennfeld(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  kennfeld() : KennfeldContext {
		var _localctx : KennfeldContext = KennfeldContext(context, state)
		enterRule(_localctx, 42, Rules.RULE_kennfeld.id)
		var _la: Int
		try {
			this.state = 422
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			T__15  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 341
			match(T__15) as Token
			}
			this.state = 342
			match(NAME) as Token
			this.state = 343
			anzahl_x()
			this.state = 344
			anzahl_y()
			this.state = 345
			match(T__0) as Token
			this.state = 346
			kgr_info()
			this.state = 348
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__20) {
				if (true){
				this.state = 347
				einheit_x()
				}
			}

			this.state = 351
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__21) {
				if (true){
				this.state = 350
				einheit_y()
				}
			}

			this.state = 354
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__22) {
				if (true){
				this.state = 353
				einheit_w()
				}
			}

			this.state = 357 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 356
				sst_liste_x()
				}
				}
				this.state = 359 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__29 || _la==T__30 )
			this.state = 361
			kf_zeile_liste()
			this.state = 362
			match(T__4) as Token
			this.state = 364 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 363
				match(T__0) as Token
				}
				}
				this.state = 366 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__0 )
			}}
			T__16  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			if (true){
			this.state = 368
			match(T__16) as Token
			}
			this.state = 369
			match(NAME) as Token
			this.state = 370
			anzahl_x()
			this.state = 371
			anzahl_y()
			this.state = 372
			match(T__0) as Token
			this.state = 373
			kgr_info()
			this.state = 375
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__20) {
				if (true){
				this.state = 374
				einheit_x()
				}
			}

			this.state = 378
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__21) {
				if (true){
				this.state = 377
				einheit_y()
				}
			}

			this.state = 381
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__22) {
				if (true){
				this.state = 380
				einheit_w()
				}
			}

			this.state = 384 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 383
				sst_liste_x()
				}
				}
				this.state = 386 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__29 || _la==T__30 )
			this.state = 388
			kf_zeile_liste()
			this.state = 389
			match(T__4) as Token
			this.state = 391 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 390
				match(T__0) as Token
				}
				}
				this.state = 393 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__0 )
			}}
			T__17  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			if (true){
			this.state = 395
			match(T__17) as Token
			}
			this.state = 396
			match(NAME) as Token
			this.state = 397
			anzahl_x()
			this.state = 398
			anzahl_y()
			this.state = 399
			match(T__0) as Token
			this.state = 400
			kgr_info()
			this.state = 402
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__20) {
				if (true){
				this.state = 401
				einheit_x()
				}
			}

			this.state = 405
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__21) {
				if (true){
				this.state = 404
				einheit_y()
				}
			}

			this.state = 408
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__22) {
				if (true){
				this.state = 407
				einheit_w()
				}
			}

			this.state = 411 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 410
				sst_liste_x()
				}
				}
				this.state = 413 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__29 || _la==T__30 )
			this.state = 415
			kf_zeile_liste()
			this.state = 416
			match(T__4) as Token
			this.state = 418 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 417
				match(T__0) as Token
				}
				}
				this.state = 420 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__0 )
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

	open class GruppenstuetzstellenContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_gruppenstuetzstellen.id
	        set(value) { throw RuntimeException() }
		fun NAME() : TerminalNode? = getToken(DCM_2_0_grammarParser.Tokens.NAME.id, 0)
		fun findAnzahl_x() : Anzahl_xContext? = getRuleContext(solver.getType("Anzahl_xContext"),0)
		fun findKgr_info() : Kgr_infoContext? = getRuleContext(solver.getType("Kgr_infoContext"),0)
		fun findEinheit_x() : Einheit_xContext? = getRuleContext(solver.getType("Einheit_xContext"),0)
		fun findSst_liste_x() : List<Sst_liste_xContext> = getRuleContexts(solver.getType("Sst_liste_xContext"))
		fun findSst_liste_x(i: Int) : Sst_liste_xContext? = getRuleContext(solver.getType("Sst_liste_xContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterGruppenstuetzstellen(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitGruppenstuetzstellen(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitGruppenstuetzstellen(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  gruppenstuetzstellen() : GruppenstuetzstellenContext {
		var _localctx : GruppenstuetzstellenContext = GruppenstuetzstellenContext(context, state)
		enterRule(_localctx, 44, Rules.RULE_gruppenstuetzstellen.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 424
			match(T__18) as Token
			this.state = 425
			match(NAME) as Token
			this.state = 426
			anzahl_x()
			this.state = 427
			match(T__0) as Token
			this.state = 428
			kgr_info()
			this.state = 430
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__20) {
				if (true){
				this.state = 429
				einheit_x()
				}
			}

			this.state = 433 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 432
				sst_liste_x()
				}
				}
				this.state = 435 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__29 || _la==T__30 )
			this.state = 437
			match(T__4) as Token
			this.state = 439 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 438
				match(T__0) as Token
				}
				}
				this.state = 441 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__0 )
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class KenntextContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kenntext.id
	        set(value) { throw RuntimeException() }
		fun NAME() : TerminalNode? = getToken(DCM_2_0_grammarParser.Tokens.NAME.id, 0)
		fun findKgr_info() : Kgr_infoContext? = getRuleContext(solver.getType("Kgr_infoContext"),0)
		fun TEXT() : TerminalNode? = getToken(DCM_2_0_grammarParser.Tokens.TEXT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterKenntext(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitKenntext(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitKenntext(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  kenntext() : KenntextContext {
		var _localctx : KenntextContext = KenntextContext(context, state)
		enterRule(_localctx, 46, Rules.RULE_kenntext.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 443
			match(T__19) as Token
			this.state = 444
			match(NAME) as Token
			this.state = 445
			match(T__0) as Token
			this.state = 446
			kgr_info()
			this.state = 447
			match(T__10) as Token
			this.state = 448
			match(TEXT) as Token
			this.state = 449
			match(T__0) as Token
			this.state = 450
			match(T__4) as Token
			this.state = 452 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 451
				match(T__0) as Token
				}
				}
				this.state = 454 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__0 )
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Kgr_infoContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kgr_info.id
	        set(value) { throw RuntimeException() }
		fun findLangname() : LangnameContext? = getRuleContext(solver.getType("LangnameContext"),0)
		fun findDisplayname() : DisplaynameContext? = getRuleContext(solver.getType("DisplaynameContext"),0)
		fun findVar_abhangigkeiten() : Var_abhangigkeitenContext? = getRuleContext(solver.getType("Var_abhangigkeitenContext"),0)
		fun findFunktionszugehorigkeit() : FunktionszugehorigkeitContext? = getRuleContext(solver.getType("FunktionszugehorigkeitContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterKgr_info(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitKgr_info(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitKgr_info(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  kgr_info() : Kgr_infoContext {
		var _localctx : Kgr_infoContext = Kgr_infoContext(context, state)
		enterRule(_localctx, 48, Rules.RULE_kgr_info.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 457
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__23) {
				if (true){
				this.state = 456
				langname()
				}
			}

			this.state = 460
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__24) {
				if (true){
				this.state = 459
				displayname()
				}
			}

			this.state = 463
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__25) {
				if (true){
				this.state = 462
				var_abhangigkeiten()
				}
			}

			this.state = 466
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__28) {
				if (true){
				this.state = 465
				funktionszugehorigkeit()
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

	open class Einheit_xContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_einheit_x.id
	        set(value) { throw RuntimeException() }
		fun TEXT() : TerminalNode? = getToken(DCM_2_0_grammarParser.Tokens.TEXT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterEinheit_x(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitEinheit_x(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitEinheit_x(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  einheit_x() : Einheit_xContext {
		var _localctx : Einheit_xContext = Einheit_xContext(context, state)
		enterRule(_localctx, 50, Rules.RULE_einheit_x.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 468
			match(T__20) as Token
			this.state = 469
			match(TEXT) as Token
			this.state = 470
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

	open class Einheit_yContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_einheit_y.id
	        set(value) { throw RuntimeException() }
		fun TEXT() : TerminalNode? = getToken(DCM_2_0_grammarParser.Tokens.TEXT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterEinheit_y(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitEinheit_y(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitEinheit_y(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  einheit_y() : Einheit_yContext {
		var _localctx : Einheit_yContext = Einheit_yContext(context, state)
		enterRule(_localctx, 52, Rules.RULE_einheit_y.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 472
			match(T__21) as Token
			this.state = 473
			match(TEXT) as Token
			this.state = 474
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

	open class Einheit_wContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_einheit_w.id
	        set(value) { throw RuntimeException() }
		fun TEXT() : TerminalNode? = getToken(DCM_2_0_grammarParser.Tokens.TEXT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterEinheit_w(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitEinheit_w(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitEinheit_w(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  einheit_w() : Einheit_wContext {
		var _localctx : Einheit_wContext = Einheit_wContext(context, state)
		enterRule(_localctx, 54, Rules.RULE_einheit_w.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 476
			match(T__22) as Token
			this.state = 477
			match(TEXT) as Token
			this.state = 478
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

	open class LangnameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_langname.id
	        set(value) { throw RuntimeException() }
		fun TEXT() : TerminalNode? = getToken(DCM_2_0_grammarParser.Tokens.TEXT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterLangname(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitLangname(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitLangname(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  langname() : LangnameContext {
		var _localctx : LangnameContext = LangnameContext(context, state)
		enterRule(_localctx, 56, Rules.RULE_langname.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 480
			match(T__23) as Token
			this.state = 481
			match(TEXT) as Token
			this.state = 482
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

	open class DisplaynameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_displayname.id
	        set(value) { throw RuntimeException() }
		fun NAME() : TerminalNode? = getToken(DCM_2_0_grammarParser.Tokens.NAME.id, 0)
		fun TEXT() : TerminalNode? = getToken(DCM_2_0_grammarParser.Tokens.TEXT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterDisplayname(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitDisplayname(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitDisplayname(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  displayname() : DisplaynameContext {
		var _localctx : DisplaynameContext = DisplaynameContext(context, state)
		enterRule(_localctx, 58, Rules.RULE_displayname.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 484
			match(T__24) as Token
			this.state = 485
			_la = _input!!.LA(1)
			if ( !(_la==NAME || _la==TEXT) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 486
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

	open class Var_abhangigkeitenContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_var_abhangigkeiten.id
	        set(value) { throw RuntimeException() }
		fun findVar_abh() : List<Var_abhContext> = getRuleContexts(solver.getType("Var_abhContext"))
		fun findVar_abh(i: Int) : Var_abhContext? = getRuleContext(solver.getType("Var_abhContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterVar_abhangigkeiten(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitVar_abhangigkeiten(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitVar_abhangigkeiten(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  var_abhangigkeiten() : Var_abhangigkeitenContext {
		var _localctx : Var_abhangigkeitenContext = Var_abhangigkeitenContext(context, state)
		enterRule(_localctx, 60, Rules.RULE_var_abhangigkeiten.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 488
			match(T__25) as Token
			this.state = 489
			var_abh()
			this.state = 494
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__26) {
				if (true){
				if (true){
				this.state = 490
				match(T__26) as Token
				this.state = 491
				var_abh()
				}
				}
				this.state = 496
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 497
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

	open class Var_abhContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_var_abh.id
	        set(value) { throw RuntimeException() }
		fun NAME() : List<TerminalNode> = getTokens(DCM_2_0_grammarParser.Tokens.NAME.id)
		fun NAME(i: Int) : TerminalNode = getToken(DCM_2_0_grammarParser.Tokens.NAME.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterVar_abh(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitVar_abh(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitVar_abh(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  var_abh() : Var_abhContext {
		var _localctx : Var_abhContext = Var_abhContext(context, state)
		enterRule(_localctx, 62, Rules.RULE_var_abh.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 499
			match(NAME) as Token
			this.state = 500
			match(T__27) as Token
			this.state = 501
			match(NAME) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class FunktionszugehorigkeitContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_funktionszugehorigkeit.id
	        set(value) { throw RuntimeException() }
		fun NAME() : List<TerminalNode> = getTokens(DCM_2_0_grammarParser.Tokens.NAME.id)
		fun NAME(i: Int) : TerminalNode = getToken(DCM_2_0_grammarParser.Tokens.NAME.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterFunktionszugehorigkeit(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitFunktionszugehorigkeit(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitFunktionszugehorigkeit(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  funktionszugehorigkeit() : FunktionszugehorigkeitContext {
		var _localctx : FunktionszugehorigkeitContext = FunktionszugehorigkeitContext(context, state)
		enterRule(_localctx, 64, Rules.RULE_funktionszugehorigkeit.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 503
			match(T__28) as Token
			this.state = 505 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 504
				match(NAME) as Token
				}
				}
				this.state = 507 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==NAME )
			this.state = 509
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

	open class Anzahl_xContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_anzahl_x.id
	        set(value) { throw RuntimeException() }
		fun INT() : TerminalNode? = getToken(DCM_2_0_grammarParser.Tokens.INT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterAnzahl_x(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitAnzahl_x(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitAnzahl_x(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  anzahl_x() : Anzahl_xContext {
		var _localctx : Anzahl_xContext = Anzahl_xContext(context, state)
		enterRule(_localctx, 66, Rules.RULE_anzahl_x.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 511
			match(INT) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Anzahl_yContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_anzahl_y.id
	        set(value) { throw RuntimeException() }
		fun INT() : TerminalNode? = getToken(DCM_2_0_grammarParser.Tokens.INT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterAnzahl_y(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitAnzahl_y(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitAnzahl_y(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  anzahl_y() : Anzahl_yContext {
		var _localctx : Anzahl_yContext = Anzahl_yContext(context, state)
		enterRule(_localctx, 68, Rules.RULE_anzahl_y.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 513
			match(INT) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class WertelisteContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_werteliste.id
	        set(value) { throw RuntimeException() }
		fun findRealzahl() : List<RealzahlContext> = getRuleContexts(solver.getType("RealzahlContext"))
		fun findRealzahl(i: Int) : RealzahlContext? = getRuleContext(solver.getType("RealzahlContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterWerteliste(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitWerteliste(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitWerteliste(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  werteliste() : WertelisteContext {
		var _localctx : WertelisteContext = WertelisteContext(context, state)
		enterRule(_localctx, 70, Rules.RULE_werteliste.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 515
			match(T__9) as Token
			this.state = 517 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 516
				realzahl()
				}
				}
				this.state = 519 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==INT || _la==FLOAT )
			this.state = 521
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

	open class Werteliste_kwbContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_werteliste_kwb.id
	        set(value) { throw RuntimeException() }
		fun findRealzahl() : List<RealzahlContext> = getRuleContexts(solver.getType("RealzahlContext"))
		fun findRealzahl(i: Int) : RealzahlContext? = getRuleContext(solver.getType("RealzahlContext"),i)
		fun TEXT() : List<TerminalNode> = getTokens(DCM_2_0_grammarParser.Tokens.TEXT.id)
		fun TEXT(i: Int) : TerminalNode = getToken(DCM_2_0_grammarParser.Tokens.TEXT.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterWerteliste_kwb(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitWerteliste_kwb(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitWerteliste_kwb(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  werteliste_kwb() : Werteliste_kwbContext {
		var _localctx : Werteliste_kwbContext = Werteliste_kwbContext(context, state)
		enterRule(_localctx, 72, Rules.RULE_werteliste_kwb.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 538
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			T__9  ->  /*LL1AltBlock*/{if (true){
			this.state = 523
			match(T__9) as Token
			this.state = 525 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 524
				realzahl()
				}
				}
				this.state = 527 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==INT || _la==FLOAT )
			this.state = 529
			match(T__0) as Token
			}}
			T__10  ->  /*LL1AltBlock*/{if (true){
			this.state = 531
			match(T__10) as Token
			this.state = 533 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 532
				match(TEXT) as Token
				}
				}
				this.state = 535 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==TEXT )
			this.state = 537
			match(T__0) as Token
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

	open class Sst_liste_xContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_sst_liste_x.id
	        set(value) { throw RuntimeException() }
		fun findRealzahl() : List<RealzahlContext> = getRuleContexts(solver.getType("RealzahlContext"))
		fun findRealzahl(i: Int) : RealzahlContext? = getRuleContext(solver.getType("RealzahlContext"),i)
		fun TEXT() : List<TerminalNode> = getTokens(DCM_2_0_grammarParser.Tokens.TEXT.id)
		fun TEXT(i: Int) : TerminalNode = getToken(DCM_2_0_grammarParser.Tokens.TEXT.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterSst_liste_x(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitSst_liste_x(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitSst_liste_x(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  sst_liste_x() : Sst_liste_xContext {
		var _localctx : Sst_liste_xContext = Sst_liste_xContext(context, state)
		enterRule(_localctx, 74, Rules.RULE_sst_liste_x.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 555
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			T__29  ->  /*LL1AltBlock*/{if (true){
			this.state = 540
			match(T__29) as Token
			this.state = 542 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 541
				realzahl()
				}
				}
				this.state = 544 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==INT || _la==FLOAT )
			this.state = 546
			match(T__0) as Token
			}}
			T__30  ->  /*LL1AltBlock*/{if (true){
			this.state = 548
			match(T__30) as Token
			this.state = 550 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 549
				match(TEXT) as Token
				}
				}
				this.state = 552 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==TEXT )
			this.state = 554
			match(T__0) as Token
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

	open class Kf_zeile_listeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kf_zeile_liste.id
	        set(value) { throw RuntimeException() }
		fun findKf_zeile_liste_r() : List<Kf_zeile_liste_rContext> = getRuleContexts(solver.getType("Kf_zeile_liste_rContext"))
		fun findKf_zeile_liste_r(i: Int) : Kf_zeile_liste_rContext? = getRuleContext(solver.getType("Kf_zeile_liste_rContext"),i)
		fun findKf_zeile_liste_tx() : List<Kf_zeile_liste_txContext> = getRuleContexts(solver.getType("Kf_zeile_liste_txContext"))
		fun findKf_zeile_liste_tx(i: Int) : Kf_zeile_liste_txContext? = getRuleContext(solver.getType("Kf_zeile_liste_txContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterKf_zeile_liste(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitKf_zeile_liste(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitKf_zeile_liste(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  kf_zeile_liste() : Kf_zeile_listeContext {
		var _localctx : Kf_zeile_listeContext = Kf_zeile_listeContext(context, state)
		enterRule(_localctx, 76, Rules.RULE_kf_zeile_liste.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 567
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			T__31  ->  /*LL1AltBlock*/{if (true){
			this.state = 558 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 557
				kf_zeile_liste_r()
				}
				}
				this.state = 560 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__31 )
			}}
			T__32  ->  /*LL1AltBlock*/{if (true){
			this.state = 563 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 562
				kf_zeile_liste_tx()
				}
				}
				this.state = 565 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__32 )
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

	open class Kf_zeile_liste_rContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kf_zeile_liste_r.id
	        set(value) { throw RuntimeException() }
		fun findRealzahl() : RealzahlContext? = getRuleContext(solver.getType("RealzahlContext"),0)
		fun findWerteliste() : List<WertelisteContext> = getRuleContexts(solver.getType("WertelisteContext"))
		fun findWerteliste(i: Int) : WertelisteContext? = getRuleContext(solver.getType("WertelisteContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterKf_zeile_liste_r(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitKf_zeile_liste_r(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitKf_zeile_liste_r(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  kf_zeile_liste_r() : Kf_zeile_liste_rContext {
		var _localctx : Kf_zeile_liste_rContext = Kf_zeile_liste_rContext(context, state)
		enterRule(_localctx, 78, Rules.RULE_kf_zeile_liste_r.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 569
			match(T__31) as Token
			this.state = 570
			realzahl()
			this.state = 571
			match(T__0) as Token
			this.state = 573 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 572
				werteliste()
				}
				}
				this.state = 575 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__9 )
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

	open class Kf_zeile_liste_txContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_kf_zeile_liste_tx.id
	        set(value) { throw RuntimeException() }
		fun TEXT() : TerminalNode? = getToken(DCM_2_0_grammarParser.Tokens.TEXT.id, 0)
		fun findWerteliste() : List<WertelisteContext> = getRuleContexts(solver.getType("WertelisteContext"))
		fun findWerteliste(i: Int) : WertelisteContext? = getRuleContext(solver.getType("WertelisteContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterKf_zeile_liste_tx(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitKf_zeile_liste_tx(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitKf_zeile_liste_tx(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  kf_zeile_liste_tx() : Kf_zeile_liste_txContext {
		var _localctx : Kf_zeile_liste_txContext = Kf_zeile_liste_txContext(context, state)
		enterRule(_localctx, 80, Rules.RULE_kf_zeile_liste_tx.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 577
			match(T__32) as Token
			this.state = 578
			match(TEXT) as Token
			this.state = 579
			match(T__0) as Token
			this.state = 581 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 580
				werteliste()
				}
				}
				this.state = 583 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__9 )
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

	open class RealzahlContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_realzahl.id
	        set(value) { throw RuntimeException() }
		fun INT() : TerminalNode? = getToken(DCM_2_0_grammarParser.Tokens.INT.id, 0)
		fun FLOAT() : TerminalNode? = getToken(DCM_2_0_grammarParser.Tokens.FLOAT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).enterRealzahl(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is DCM_2_0_grammarListener ) (listener as DCM_2_0_grammarListener).exitRealzahl(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is DCM_2_0_grammarVisitor ) return (visitor as DCM_2_0_grammarVisitor<out T>).visitRealzahl(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  realzahl() : RealzahlContext {
		var _localctx : RealzahlContext = RealzahlContext(context, state)
		enterRule(_localctx, 82, Rules.RULE_realzahl.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 585
			_la = _input!!.LA(1)
			if ( !(_la==INT || _la==FLOAT) ) {
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