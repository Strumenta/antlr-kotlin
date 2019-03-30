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

class ClojureParser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(ClojureParser.FileContext::class,
                                                              ClojureParser.FormContext::class,
                                                              ClojureParser.FormsContext::class,
                                                              ClojureParser.ListContext::class,
                                                              ClojureParser.VectorContext::class,
                                                              ClojureParser.MapContext::class,
                                                              ClojureParser.SetContext::class,
                                                              ClojureParser.Reader_macroContext::class,
                                                              ClojureParser.QuoteContext::class,
                                                              ClojureParser.BacktickContext::class,
                                                              ClojureParser.UnquoteContext::class,
                                                              ClojureParser.Unquote_splicingContext::class,
                                                              ClojureParser.TagContext::class,
                                                              ClojureParser.DerefContext::class,
                                                              ClojureParser.GensymContext::class,
                                                              ClojureParser.LambdaContext::class,
                                                              ClojureParser.Meta_dataContext::class,
                                                              ClojureParser.Var_quoteContext::class,
                                                              ClojureParser.Host_exprContext::class,
                                                              ClojureParser.DiscardContext::class,
                                                              ClojureParser.DispatchContext::class,
                                                              ClojureParser.RegexContext::class,
                                                              ClojureParser.LiteralContext::class,
                                                              ClojureParser.StringContext::class,
                                                              ClojureParser.HexContext::class,
                                                              ClojureParser.BinContext::class,
                                                              ClojureParser.BignContext::class,
                                                              ClojureParser.NumberContext::class,
                                                              ClojureParser.CharacterContext::class,
                                                              ClojureParser.Named_charContext::class,
                                                              ClojureParser.Any_charContext::class,
                                                              ClojureParser.U_hex_quadContext::class,
                                                              ClojureParser.NilContext::class,
                                                              ClojureParser.KeywordContext::class,
                                                              ClojureParser.Simple_keywordContext::class,
                                                              ClojureParser.Macro_keywordContext::class,
                                                              ClojureParser.SymbolContext::class,
                                                              ClojureParser.Simple_symContext::class,
                                                              ClojureParser.Ns_symbolContext::class,
                                                              ClojureParser.Param_nameContext::class)
    }

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "Clojure.g4"

    override val tokenNames: Array<String?>?
        get() = ClojureParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = ClojureParser.Companion.ruleNames
    override val atn: ATN
        get() = ClojureParser.Companion.ATN

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
        STRING(21),
        FLOAT(22),
        HEX(23),
        BIN(24),
        LONG(25),
        BIGN(26),
        CHAR_U(27),
        CHAR_NAMED(28),
        CHAR_ANY(29),
        NIL(30),
        BOOLEAN(31),
        SYMBOL(32),
        NS_SYMBOL(33),
        PARAM_NAME(34),
        TRASH(35)
    }

    enum class Rules(val id: Int) {
        RULE_file(0),
        RULE_form(1),
        RULE_forms(2),
        RULE_list(3),
        RULE_vector(4),
        RULE_map(5),
        RULE_set(6),
        RULE_reader_macro(7),
        RULE_quote(8),
        RULE_backtick(9),
        RULE_unquote(10),
        RULE_unquote_splicing(11),
        RULE_tag(12),
        RULE_deref(13),
        RULE_gensym(14),
        RULE_lambda(15),
        RULE_meta_data(16),
        RULE_var_quote(17),
        RULE_host_expr(18),
        RULE_discard(19),
        RULE_dispatch(20),
        RULE_regex(21),
        RULE_literal(22),
        RULE_string(23),
        RULE_hex(24),
        RULE_bin(25),
        RULE_bign(26),
        RULE_number(27),
        RULE_character(28),
        RULE_named_char(29),
        RULE_any_char(30),
        RULE_u_hex_quad(31),
        RULE_nil(32),
        RULE_keyword(33),
        RULE_simple_keyword(34),
        RULE_macro_keyword(35),
        RULE_symbol(36),
        RULE_simple_sym(37),
        RULE_ns_symbol(38),
        RULE_param_name(39)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("file", "form", "forms", "list", "vector", 
                                "map", "set", "reader_macro", "quote", "backtick", 
                                "unquote", "unquote_splicing", "tag", "deref", 
                                "gensym", "lambda", "meta_data", "var_quote", 
                                "host_expr", "discard", "dispatch", "regex", 
                                "literal", "string", "hex", "bin", "bign", 
                                "number", "character", "named_char", "any_char", 
                                "u_hex_quad", "nil", "keyword", "simple_keyword", 
                                "macro_keyword", "symbol", "simple_sym", 
                                "ns_symbol", "param_name")

        private val LITERAL_NAMES = Arrays.asList<String?>(null, "'('", 
                                                           "')'", "'['", 
                                                           "']'", "'{'", 
                                                           "'}'", "'#{'", 
                                                           "'''", "'`'", 
                                                           "'~'", "'~@'", 
                                                           "'^'", "'@'", 
                                                           "'#'", "'#('", 
                                                           "'#^'", "'#''", 
                                                           "'#+'", "'#_'", 
                                                           "':'", null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, "'nil'")
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
                                                            null, "STRING", 
                                                            "FLOAT", "HEX", 
                                                            "BIN", "LONG", 
                                                            "BIGN", "CHAR_U", 
                                                            "CHAR_NAMED", 
                                                            "CHAR_ANY", 
                                                            "NIL", "BOOLEAN", 
                                                            "SYMBOL", "NS_SYMBOL", 
                                                            "PARAM_NAME", 
                                                            "TRASH")

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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u0025\u0102\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0004\u001c\u0009\u001c\u0004\u001d\u0009\u001d\u0004\u001e\u0009\u001e\u0004\u001f\u0009\u001f\u0004\u0020\u0009\u0020\u0004\u0021\u0009\u0021\u0004\u0022\u0009\u0022\u0004\u0023\u0009\u0023\u0004\u0024\u0009\u0024\u0004\u0025\u0009\u0025\u0004\u0026\u0009\u0026\u0004\u0027\u0009\u0027\u0004\u0028\u0009\u0028\u0004\u0029\u0009\u0029\u0003\u0002\u0007\u0002\u0054\u000a\u0002\u000c\u0002\u000e\u0002\u0057\u000b\u0002\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0005\u0003\u0060\u000a\u0003\u0003\u0004\u0007\u0004\u0063\u000a\u0004\u000c\u0004\u000e\u0004\u0066\u000b\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0007\u0007\u0074\u000a\u0007\u000c\u0007\u000e\u0007\u0077\u000b\u0007\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0005\u0009\u008e\u000a\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0011\u0003\u0011\u0007\u0011\u00a8\u000a\u0011\u000c\u0011\u000e\u0011\u00ab\u000b\u0011\u0003\u0011\u0003\u0011\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0005\u0012\u00b4\u000a\u0012\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u00cf\u000a\u0018\u0003\u0019\u0003\u0019\u0003\u001a\u0003\u001a\u0003\u001b\u0003\u001b\u0003\u001c\u0003\u001c\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0005\u001d\u00de\u000a\u001d\u0003\u001e\u0003\u001e\u0003\u001e\u0005\u001e\u00e3\u000a\u001e\u0003\u001f\u0003\u001f\u0003\u0020\u0003\u0020\u0003\u0021\u0003\u0021\u0003\u0022\u0003\u0022\u0003\u0023\u0003\u0023\u0005\u0023\u00ef\u000a\u0023\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0003\u0026\u0003\u0026\u0005\u0026\u00fa\u000a\u0026\u0003\u0027\u0003\u0027\u0003\u0028\u0003\u0028\u0003\u0029\u0003\u0029\u0003\u0029\u0002\u0002\u002a\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0020\u0022\u0024\u0026\u0028\u002a\u002c\u002e\u0030\u0032\u0034\u0036\u0038\u003a\u003c\u003e\u0040\u0042\u0044\u0046\u0048\u004a\u004c\u004e\u0050\u0002\u0002\u0002\u00ff\u0002\u0055\u0003\u0002\u0002\u0002\u0004\u005f\u0003\u0002\u0002\u0002\u0006\u0064\u0003\u0002\u0002\u0002\u0008\u0067\u0003\u0002\u0002\u0002\u000a\u006b\u0003\u0002\u0002\u0002\u000c\u006f\u0003\u0002\u0002\u0002\u000e\u007a\u0003\u0002\u0002\u0002\u0010\u008d\u0003\u0002\u0002\u0002\u0012\u008f\u0003\u0002\u0002\u0002\u0014\u0092\u0003\u0002\u0002\u0002\u0016\u0095\u0003\u0002\u0002\u0002\u0018\u0098\u0003\u0002\u0002\u0002\u001a\u009b\u0003\u0002\u0002\u0002\u001c\u009f\u0003\u0002\u0002\u0002\u001e\u00a2\u0003\u0002\u0002\u0002\u0020\u00a5\u0003\u0002\u0002\u0002\u0022\u00ae\u0003\u0002\u0002\u0002\u0024\u00b5\u0003\u0002\u0002\u0002\u0026\u00b8\u0003\u0002\u0002\u0002\u0028\u00bc\u0003\u0002\u0002\u0002\u002a\u00bf\u0003\u0002\u0002\u0002\u002c\u00c3\u0003\u0002\u0002\u0002\u002e\u00ce\u0003\u0002\u0002\u0002\u0030\u00d0\u0003\u0002\u0002\u0002\u0032\u00d2\u0003\u0002\u0002\u0002\u0034\u00d4\u0003\u0002\u0002\u0002\u0036\u00d6\u0003\u0002\u0002\u0002\u0038\u00dd\u0003\u0002\u0002\u0002\u003a\u00e2\u0003\u0002\u0002\u0002\u003c\u00e4\u0003\u0002\u0002\u0002\u003e\u00e6\u0003\u0002\u0002\u0002\u0040\u00e8\u0003\u0002\u0002\u0002\u0042\u00ea\u0003\u0002\u0002\u0002\u0044\u00ee\u0003\u0002\u0002\u0002\u0046\u00f0\u0003\u0002\u0002\u0002\u0048\u00f3\u0003\u0002\u0002\u0002\u004a\u00f9\u0003\u0002\u0002\u0002\u004c\u00fb\u0003\u0002\u0002\u0002\u004e\u00fd\u0003\u0002\u0002\u0002\u0050\u00ff\u0003\u0002\u0002\u0002\u0052\u0054\u0005\u0004\u0003\u0002\u0053\u0052\u0003\u0002\u0002\u0002\u0054\u0057\u0003\u0002\u0002\u0002\u0055\u0053\u0003\u0002\u0002\u0002\u0055\u0056\u0003\u0002\u0002\u0002\u0056\u0058\u0003\u0002\u0002\u0002\u0057\u0055\u0003\u0002\u0002\u0002\u0058\u0059\u0007\u0002\u0002\u0003\u0059\u0003\u0003\u0002\u0002\u0002\u005a\u0060\u0005\u002e\u0018\u0002\u005b\u0060\u0005\u0008\u0005\u0002\u005c\u0060\u0005\u000a\u0006\u0002\u005d\u0060\u0005\u000c\u0007\u0002\u005e\u0060\u0005\u0010\u0009\u0002\u005f\u005a\u0003\u0002\u0002\u0002\u005f\u005b\u0003\u0002\u0002\u0002\u005f\u005c\u0003\u0002\u0002\u0002\u005f\u005d\u0003\u0002\u0002\u0002\u005f\u005e\u0003\u0002\u0002\u0002\u0060\u0005\u0003\u0002\u0002\u0002\u0061\u0063\u0005\u0004\u0003\u0002\u0062\u0061\u0003\u0002\u0002\u0002\u0063\u0066\u0003\u0002\u0002\u0002\u0064\u0062\u0003\u0002\u0002\u0002\u0064\u0065\u0003\u0002\u0002\u0002\u0065\u0007\u0003\u0002\u0002\u0002\u0066\u0064\u0003\u0002\u0002\u0002\u0067\u0068\u0007\u0003\u0002\u0002\u0068\u0069\u0005\u0006\u0004\u0002\u0069\u006a\u0007\u0004\u0002\u0002\u006a\u0009\u0003\u0002\u0002\u0002\u006b\u006c\u0007\u0005\u0002\u0002\u006c\u006d\u0005\u0006\u0004\u0002\u006d\u006e\u0007\u0006\u0002\u0002\u006e\u000b\u0003\u0002\u0002\u0002\u006f\u0075\u0007\u0007\u0002\u0002\u0070\u0071\u0005\u0004\u0003\u0002\u0071\u0072\u0005\u0004\u0003\u0002\u0072\u0074\u0003\u0002\u0002\u0002\u0073\u0070\u0003\u0002\u0002\u0002\u0074\u0077\u0003\u0002\u0002\u0002\u0075\u0073\u0003\u0002\u0002\u0002\u0075\u0076\u0003\u0002\u0002\u0002\u0076\u0078\u0003\u0002\u0002\u0002\u0077\u0075\u0003\u0002\u0002\u0002\u0078\u0079\u0007\u0008\u0002\u0002\u0079\u000d\u0003\u0002\u0002\u0002\u007a\u007b\u0007\u0009\u0002\u0002\u007b\u007c\u0005\u0006\u0004\u0002\u007c\u007d\u0007\u0008\u0002\u0002\u007d\u000f\u0003\u0002\u0002\u0002\u007e\u008e\u0005\u0020\u0011\u0002\u007f\u008e\u0005\u0022\u0012\u0002\u0080\u008e\u0005\u002c\u0017\u0002\u0081\u008e\u0005\u0024\u0013\u0002\u0082\u008e\u0005\u0026\u0014\u0002\u0083\u008e\u0005\u000e\u0008\u0002\u0084\u008e\u0005\u001a\u000e\u0002\u0085\u008e\u0005\u0028\u0015\u0002\u0086\u008e\u0005\u002a\u0016\u0002\u0087\u008e\u0005\u001c\u000f\u0002\u0088\u008e\u0005\u0012\u000a\u0002\u0089\u008e\u0005\u0014\u000b\u0002\u008a\u008e\u0005\u0016\u000c\u0002\u008b\u008e\u0005\u0018\u000d\u0002\u008c\u008e\u0005\u001e\u0010\u0002\u008d\u007e\u0003\u0002\u0002\u0002\u008d\u007f\u0003\u0002\u0002\u0002\u008d\u0080\u0003\u0002\u0002\u0002\u008d\u0081\u0003\u0002\u0002\u0002\u008d\u0082\u0003\u0002\u0002\u0002\u008d\u0083\u0003\u0002\u0002\u0002\u008d\u0084\u0003\u0002\u0002\u0002\u008d\u0085\u0003\u0002\u0002\u0002\u008d\u0086\u0003\u0002\u0002\u0002\u008d\u0087\u0003\u0002\u0002\u0002\u008d\u0088\u0003\u0002\u0002\u0002\u008d\u0089\u0003\u0002\u0002\u0002\u008d\u008a\u0003\u0002\u0002\u0002\u008d\u008b\u0003\u0002\u0002\u0002\u008d\u008c\u0003\u0002\u0002\u0002\u008e\u0011\u0003\u0002\u0002\u0002\u008f\u0090\u0007\u000a\u0002\u0002\u0090\u0091\u0005\u0004\u0003\u0002\u0091\u0013\u0003\u0002\u0002\u0002\u0092\u0093\u0007\u000b\u0002\u0002\u0093\u0094\u0005\u0004\u0003\u0002\u0094\u0015\u0003\u0002\u0002\u0002\u0095\u0096\u0007\u000c\u0002\u0002\u0096\u0097\u0005\u0004\u0003\u0002\u0097\u0017\u0003\u0002\u0002\u0002\u0098\u0099\u0007\u000d\u0002\u0002\u0099\u009a\u0005\u0004\u0003\u0002\u009a\u0019\u0003\u0002\u0002\u0002\u009b\u009c\u0007\u000e\u0002\u0002\u009c\u009d\u0005\u0004\u0003\u0002\u009d\u009e\u0005\u0004\u0003\u0002\u009e\u001b\u0003\u0002\u0002\u0002\u009f\u00a0\u0007\u000f\u0002\u0002\u00a0\u00a1\u0005\u0004\u0003\u0002\u00a1\u001d\u0003\u0002\u0002\u0002\u00a2\u00a3\u0007\u0022\u0002\u0002\u00a3\u00a4\u0007\u0010\u0002\u0002\u00a4\u001f\u0003\u0002\u0002\u0002\u00a5\u00a9\u0007\u0011\u0002\u0002\u00a6\u00a8\u0005\u0004\u0003\u0002\u00a7\u00a6\u0003\u0002\u0002\u0002\u00a8\u00ab\u0003\u0002\u0002\u0002\u00a9\u00a7\u0003\u0002\u0002\u0002\u00a9\u00aa\u0003\u0002\u0002\u0002\u00aa\u00ac\u0003\u0002\u0002\u0002\u00ab\u00a9\u0003\u0002\u0002\u0002\u00ac\u00ad\u0007\u0004\u0002\u0002\u00ad\u0021\u0003\u0002\u0002\u0002\u00ae\u00b3\u0007\u0012\u0002\u0002\u00af\u00b0\u0005\u000c\u0007\u0002\u00b0\u00b1\u0005\u0004\u0003\u0002\u00b1\u00b4\u0003\u0002\u0002\u0002\u00b2\u00b4\u0005\u0004\u0003\u0002\u00b3\u00af\u0003\u0002\u0002\u0002\u00b3\u00b2\u0003\u0002\u0002\u0002\u00b4\u0023\u0003\u0002\u0002\u0002\u00b5\u00b6\u0007\u0013\u0002\u0002\u00b6\u00b7\u0005\u004a\u0026\u0002\u00b7\u0025\u0003\u0002\u0002\u0002\u00b8\u00b9\u0007\u0014\u0002\u0002\u00b9\u00ba\u0005\u0004\u0003\u0002\u00ba\u00bb\u0005\u0004\u0003\u0002\u00bb\u0027\u0003\u0002\u0002\u0002\u00bc\u00bd\u0007\u0015\u0002\u0002\u00bd\u00be\u0005\u0004\u0003\u0002\u00be\u0029\u0003\u0002\u0002\u0002\u00bf\u00c0\u0007\u0010\u0002\u0002\u00c0\u00c1\u0005\u004a\u0026\u0002\u00c1\u00c2\u0005\u0004\u0003\u0002\u00c2\u002b\u0003\u0002\u0002\u0002\u00c3\u00c4\u0007\u0010\u0002\u0002\u00c4\u00c5\u0005\u0030\u0019\u0002\u00c5\u002d\u0003\u0002\u0002\u0002\u00c6\u00cf\u0005\u0030\u0019\u0002\u00c7\u00cf\u0005\u0038\u001d\u0002\u00c8\u00cf\u0005\u003a\u001e\u0002\u00c9\u00cf\u0005\u0042\u0022\u0002\u00ca\u00cf\u0007\u0021\u0002\u0002\u00cb\u00cf\u0005\u0044\u0023\u0002\u00cc\u00cf\u0005\u004a\u0026\u0002\u00cd\u00cf\u0005\u0050\u0029\u0002\u00ce\u00c6\u0003\u0002\u0002\u0002\u00ce\u00c7\u0003\u0002\u0002\u0002\u00ce\u00c8\u0003\u0002\u0002\u0002\u00ce\u00c9\u0003\u0002\u0002\u0002\u00ce\u00ca\u0003\u0002\u0002\u0002\u00ce\u00cb\u0003\u0002\u0002\u0002\u00ce\u00cc\u0003\u0002\u0002\u0002\u00ce\u00cd\u0003\u0002\u0002\u0002\u00cf\u002f\u0003\u0002\u0002\u0002\u00d0\u00d1\u0007\u0017\u0002\u0002\u00d1\u0031\u0003\u0002\u0002\u0002\u00d2\u00d3\u0007\u0019\u0002\u0002\u00d3\u0033\u0003\u0002\u0002\u0002\u00d4\u00d5\u0007\u001a\u0002\u0002\u00d5\u0035\u0003\u0002\u0002\u0002\u00d6\u00d7\u0007\u001c\u0002\u0002\u00d7\u0037\u0003\u0002\u0002\u0002\u00d8\u00de\u0007\u0018\u0002\u0002\u00d9\u00de\u0005\u0032\u001a\u0002\u00da\u00de\u0005\u0034\u001b\u0002\u00db\u00de\u0005\u0036\u001c\u0002\u00dc\u00de\u0007\u001b\u0002\u0002\u00dd\u00d8\u0003\u0002\u0002\u0002\u00dd\u00d9\u0003\u0002\u0002\u0002\u00dd\u00da\u0003\u0002\u0002\u0002\u00dd\u00db\u0003\u0002\u0002\u0002\u00dd\u00dc\u0003\u0002\u0002\u0002\u00de\u0039\u0003\u0002\u0002\u0002\u00df\u00e3\u0005\u003c\u001f\u0002\u00e0\u00e3\u0005\u0040\u0021\u0002\u00e1\u00e3\u0005\u003e\u0020\u0002\u00e2\u00df\u0003\u0002\u0002\u0002\u00e2\u00e0\u0003\u0002\u0002\u0002\u00e2\u00e1\u0003\u0002\u0002\u0002\u00e3\u003b\u0003\u0002\u0002\u0002\u00e4\u00e5\u0007\u001e\u0002\u0002\u00e5\u003d\u0003\u0002\u0002\u0002\u00e6\u00e7\u0007\u001f\u0002\u0002\u00e7\u003f\u0003\u0002\u0002\u0002\u00e8\u00e9\u0007\u001d\u0002\u0002\u00e9\u0041\u0003\u0002\u0002\u0002\u00ea\u00eb\u0007\u0020\u0002\u0002\u00eb\u0043\u0003\u0002\u0002\u0002\u00ec\u00ef\u0005\u0048\u0025\u0002\u00ed\u00ef\u0005\u0046\u0024\u0002\u00ee\u00ec\u0003\u0002\u0002\u0002\u00ee\u00ed\u0003\u0002\u0002\u0002\u00ef\u0045\u0003\u0002\u0002\u0002\u00f0\u00f1\u0007\u0016\u0002\u0002\u00f1\u00f2\u0005\u004a\u0026\u0002\u00f2\u0047\u0003\u0002\u0002\u0002\u00f3\u00f4\u0007\u0016\u0002\u0002\u00f4\u00f5\u0007\u0016\u0002\u0002\u00f5\u00f6\u0005\u004a\u0026\u0002\u00f6\u0049\u0003\u0002\u0002\u0002\u00f7\u00fa\u0005\u004e\u0028\u0002\u00f8\u00fa\u0005\u004c\u0027\u0002\u00f9\u00f7\u0003\u0002\u0002\u0002\u00f9\u00f8\u0003\u0002\u0002\u0002\u00fa\u004b\u0003\u0002\u0002\u0002\u00fb\u00fc\u0007\u0022\u0002\u0002\u00fc\u004d\u0003\u0002\u0002\u0002\u00fd\u00fe\u0007\u0023\u0002\u0002\u00fe\u004f\u0003\u0002\u0002\u0002\u00ff\u0100\u0007\u0024\u0002\u0002\u0100\u0051\u0003\u0002\u0002\u0002\u000e\u0055\u005f\u0064\u0075\u008d\u00a9\u00b3\u00ce\u00dd\u00e2\u00ee\u00f9"

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
    private val STRING = Tokens.STRING.id
    private val FLOAT = Tokens.FLOAT.id
    private val HEX = Tokens.HEX.id
    private val BIN = Tokens.BIN.id
    private val LONG = Tokens.LONG.id
    private val BIGN = Tokens.BIGN.id
    private val CHAR_U = Tokens.CHAR_U.id
    private val CHAR_NAMED = Tokens.CHAR_NAMED.id
    private val CHAR_ANY = Tokens.CHAR_ANY.id
    private val NIL = Tokens.NIL.id
    private val BOOLEAN = Tokens.BOOLEAN.id
    private val SYMBOL = Tokens.SYMBOL.id
    private val NS_SYMBOL = Tokens.NS_SYMBOL.id
    private val PARAM_NAME = Tokens.PARAM_NAME.id
    private val TRASH = Tokens.TRASH.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class FileContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_file.id
	        set(value) { throw RuntimeException() }
		fun EOF() : TerminalNode? = getToken(ClojureParser.Tokens.EOF.id, 0)
		fun findForm() : List<FormContext> = getRuleContexts(solver.getType("FormContext"))
		fun findForm(i: Int) : FormContext? = getRuleContext(solver.getType("FormContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterFile(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitFile(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitFile(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  file() : FileContext {
		var _localctx : FileContext = FileContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_file.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 83
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__0) or (1L shl T__2) or (1L shl T__4) or (1L shl T__6) or (1L shl T__7) or (1L shl T__8) or (1L shl T__9) or (1L shl T__10) or (1L shl T__11) or (1L shl T__12) or (1L shl T__13) or (1L shl T__14) or (1L shl T__15) or (1L shl T__16) or (1L shl T__17) or (1L shl T__18) or (1L shl T__19) or (1L shl STRING) or (1L shl FLOAT) or (1L shl HEX) or (1L shl BIN) or (1L shl LONG) or (1L shl BIGN) or (1L shl CHAR_U) or (1L shl CHAR_NAMED) or (1L shl CHAR_ANY) or (1L shl NIL) or (1L shl BOOLEAN) or (1L shl SYMBOL) or (1L shl NS_SYMBOL) or (1L shl PARAM_NAME))) != 0L)) {
				if (true){
				if (true){
				this.state = 80
				form()
				}
				}
				this.state = 85
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 86
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
		fun findLiteral() : LiteralContext? = getRuleContext(solver.getType("LiteralContext"),0)
		fun findList() : ListContext? = getRuleContext(solver.getType("ListContext"),0)
		fun findVector() : VectorContext? = getRuleContext(solver.getType("VectorContext"),0)
		fun findMap() : MapContext? = getRuleContext(solver.getType("MapContext"),0)
		fun findReader_macro() : Reader_macroContext? = getRuleContext(solver.getType("Reader_macroContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterForm(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitForm(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitForm(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  form() : FormContext {
		var _localctx : FormContext = FormContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_form.id)
		try {
			this.state = 93
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,1,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 88
			literal()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 89
			list()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 90
			vector()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 91
			map()
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 92
			reader_macro()
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

	open class FormsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_forms.id
	        set(value) { throw RuntimeException() }
		fun findForm() : List<FormContext> = getRuleContexts(solver.getType("FormContext"))
		fun findForm(i: Int) : FormContext? = getRuleContext(solver.getType("FormContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterForms(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitForms(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitForms(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  forms() : FormsContext {
		var _localctx : FormsContext = FormsContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_forms.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 98
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__0) or (1L shl T__2) or (1L shl T__4) or (1L shl T__6) or (1L shl T__7) or (1L shl T__8) or (1L shl T__9) or (1L shl T__10) or (1L shl T__11) or (1L shl T__12) or (1L shl T__13) or (1L shl T__14) or (1L shl T__15) or (1L shl T__16) or (1L shl T__17) or (1L shl T__18) or (1L shl T__19) or (1L shl STRING) or (1L shl FLOAT) or (1L shl HEX) or (1L shl BIN) or (1L shl LONG) or (1L shl BIGN) or (1L shl CHAR_U) or (1L shl CHAR_NAMED) or (1L shl CHAR_ANY) or (1L shl NIL) or (1L shl BOOLEAN) or (1L shl SYMBOL) or (1L shl NS_SYMBOL) or (1L shl PARAM_NAME))) != 0L)) {
				if (true){
				if (true){
				this.state = 95
				form()
				}
				}
				this.state = 100
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

	open class ListContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_list.id
	        set(value) { throw RuntimeException() }
		fun findForms() : FormsContext? = getRuleContext(solver.getType("FormsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterList(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitList(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitList(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  list() : ListContext {
		var _localctx : ListContext = ListContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_list.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 101
			match(T__0) as Token
			this.state = 102
			forms()
			this.state = 103
			match(T__1) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class VectorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_vector.id
	        set(value) { throw RuntimeException() }
		fun findForms() : FormsContext? = getRuleContext(solver.getType("FormsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterVector(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitVector(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitVector(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  vector() : VectorContext {
		var _localctx : VectorContext = VectorContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_vector.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 105
			match(T__2) as Token
			this.state = 106
			forms()
			this.state = 107
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

	open class MapContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_map.id
	        set(value) { throw RuntimeException() }
		fun findForm() : List<FormContext> = getRuleContexts(solver.getType("FormContext"))
		fun findForm(i: Int) : FormContext? = getRuleContext(solver.getType("FormContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterMap(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitMap(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitMap(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  map() : MapContext {
		var _localctx : MapContext = MapContext(context, state)
		enterRule(_localctx, 10, Rules.RULE_map.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 109
			match(T__4) as Token
			this.state = 115
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__0) or (1L shl T__2) or (1L shl T__4) or (1L shl T__6) or (1L shl T__7) or (1L shl T__8) or (1L shl T__9) or (1L shl T__10) or (1L shl T__11) or (1L shl T__12) or (1L shl T__13) or (1L shl T__14) or (1L shl T__15) or (1L shl T__16) or (1L shl T__17) or (1L shl T__18) or (1L shl T__19) or (1L shl STRING) or (1L shl FLOAT) or (1L shl HEX) or (1L shl BIN) or (1L shl LONG) or (1L shl BIGN) or (1L shl CHAR_U) or (1L shl CHAR_NAMED) or (1L shl CHAR_ANY) or (1L shl NIL) or (1L shl BOOLEAN) or (1L shl SYMBOL) or (1L shl NS_SYMBOL) or (1L shl PARAM_NAME))) != 0L)) {
				if (true){
				if (true){
				this.state = 110
				form()
				this.state = 111
				form()
				}
				}
				this.state = 117
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 118
			match(T__5) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class SetContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_set.id
	        set(value) { throw RuntimeException() }
		fun findForms() : FormsContext? = getRuleContext(solver.getType("FormsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterSet(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitSet(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitSet(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  set() : SetContext {
		var _localctx : SetContext = SetContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_set.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 120
			match(T__6) as Token
			this.state = 121
			forms()
			this.state = 122
			match(T__5) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Reader_macroContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_reader_macro.id
	        set(value) { throw RuntimeException() }
		fun findLambda() : LambdaContext? = getRuleContext(solver.getType("LambdaContext"),0)
		fun findMeta_data() : Meta_dataContext? = getRuleContext(solver.getType("Meta_dataContext"),0)
		fun findRegex() : RegexContext? = getRuleContext(solver.getType("RegexContext"),0)
		fun findVar_quote() : Var_quoteContext? = getRuleContext(solver.getType("Var_quoteContext"),0)
		fun findHost_expr() : Host_exprContext? = getRuleContext(solver.getType("Host_exprContext"),0)
		fun findSet() : SetContext? = getRuleContext(solver.getType("SetContext"),0)
		fun findTag() : TagContext? = getRuleContext(solver.getType("TagContext"),0)
		fun findDiscard() : DiscardContext? = getRuleContext(solver.getType("DiscardContext"),0)
		fun findDispatch() : DispatchContext? = getRuleContext(solver.getType("DispatchContext"),0)
		fun findDeref() : DerefContext? = getRuleContext(solver.getType("DerefContext"),0)
		fun findQuote() : QuoteContext? = getRuleContext(solver.getType("QuoteContext"),0)
		fun findBacktick() : BacktickContext? = getRuleContext(solver.getType("BacktickContext"),0)
		fun findUnquote() : UnquoteContext? = getRuleContext(solver.getType("UnquoteContext"),0)
		fun findUnquote_splicing() : Unquote_splicingContext? = getRuleContext(solver.getType("Unquote_splicingContext"),0)
		fun findGensym() : GensymContext? = getRuleContext(solver.getType("GensymContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterReader_macro(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitReader_macro(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitReader_macro(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  reader_macro() : Reader_macroContext {
		var _localctx : Reader_macroContext = Reader_macroContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_reader_macro.id)
		try {
			this.state = 139
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,4,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 124
			lambda()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 125
			meta_data()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 126
			regex()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 127
			var_quote()
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 128
			host_expr()
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 129
			set()
			}}
			7 -> {
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 130
			tag()
			}}
			8 -> {
			enterOuterAlt(_localctx, 8)
			if (true){
			this.state = 131
			discard()
			}}
			9 -> {
			enterOuterAlt(_localctx, 9)
			if (true){
			this.state = 132
			dispatch()
			}}
			10 -> {
			enterOuterAlt(_localctx, 10)
			if (true){
			this.state = 133
			deref()
			}}
			11 -> {
			enterOuterAlt(_localctx, 11)
			if (true){
			this.state = 134
			quote()
			}}
			12 -> {
			enterOuterAlt(_localctx, 12)
			if (true){
			this.state = 135
			backtick()
			}}
			13 -> {
			enterOuterAlt(_localctx, 13)
			if (true){
			this.state = 136
			unquote()
			}}
			14 -> {
			enterOuterAlt(_localctx, 14)
			if (true){
			this.state = 137
			unquote_splicing()
			}}
			15 -> {
			enterOuterAlt(_localctx, 15)
			if (true){
			this.state = 138
			gensym()
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

	open class QuoteContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_quote.id
	        set(value) { throw RuntimeException() }
		fun findForm() : FormContext? = getRuleContext(solver.getType("FormContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterQuote(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitQuote(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitQuote(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  quote() : QuoteContext {
		var _localctx : QuoteContext = QuoteContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_quote.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 141
			match(T__7) as Token
			this.state = 142
			form()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class BacktickContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_backtick.id
	        set(value) { throw RuntimeException() }
		fun findForm() : FormContext? = getRuleContext(solver.getType("FormContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterBacktick(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitBacktick(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitBacktick(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  backtick() : BacktickContext {
		var _localctx : BacktickContext = BacktickContext(context, state)
		enterRule(_localctx, 18, Rules.RULE_backtick.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 144
			match(T__8) as Token
			this.state = 145
			form()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class UnquoteContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_unquote.id
	        set(value) { throw RuntimeException() }
		fun findForm() : FormContext? = getRuleContext(solver.getType("FormContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterUnquote(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitUnquote(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitUnquote(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  unquote() : UnquoteContext {
		var _localctx : UnquoteContext = UnquoteContext(context, state)
		enterRule(_localctx, 20, Rules.RULE_unquote.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 147
			match(T__9) as Token
			this.state = 148
			form()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Unquote_splicingContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_unquote_splicing.id
	        set(value) { throw RuntimeException() }
		fun findForm() : FormContext? = getRuleContext(solver.getType("FormContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterUnquote_splicing(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitUnquote_splicing(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitUnquote_splicing(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  unquote_splicing() : Unquote_splicingContext {
		var _localctx : Unquote_splicingContext = Unquote_splicingContext(context, state)
		enterRule(_localctx, 22, Rules.RULE_unquote_splicing.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 150
			match(T__10) as Token
			this.state = 151
			form()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TagContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_tag.id
	        set(value) { throw RuntimeException() }
		fun findForm() : List<FormContext> = getRuleContexts(solver.getType("FormContext"))
		fun findForm(i: Int) : FormContext? = getRuleContext(solver.getType("FormContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterTag(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitTag(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitTag(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  tag() : TagContext {
		var _localctx : TagContext = TagContext(context, state)
		enterRule(_localctx, 24, Rules.RULE_tag.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 153
			match(T__11) as Token
			this.state = 154
			form()
			this.state = 155
			form()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class DerefContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_deref.id
	        set(value) { throw RuntimeException() }
		fun findForm() : FormContext? = getRuleContext(solver.getType("FormContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterDeref(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitDeref(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitDeref(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  deref() : DerefContext {
		var _localctx : DerefContext = DerefContext(context, state)
		enterRule(_localctx, 26, Rules.RULE_deref.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 157
			match(T__12) as Token
			this.state = 158
			form()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class GensymContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_gensym.id
	        set(value) { throw RuntimeException() }
		fun SYMBOL() : TerminalNode? = getToken(ClojureParser.Tokens.SYMBOL.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterGensym(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitGensym(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitGensym(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  gensym() : GensymContext {
		var _localctx : GensymContext = GensymContext(context, state)
		enterRule(_localctx, 28, Rules.RULE_gensym.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 160
			match(SYMBOL) as Token
			this.state = 161
			match(T__13) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class LambdaContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_lambda.id
	        set(value) { throw RuntimeException() }
		fun findForm() : List<FormContext> = getRuleContexts(solver.getType("FormContext"))
		fun findForm(i: Int) : FormContext? = getRuleContext(solver.getType("FormContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterLambda(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitLambda(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitLambda(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  lambda() : LambdaContext {
		var _localctx : LambdaContext = LambdaContext(context, state)
		enterRule(_localctx, 30, Rules.RULE_lambda.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 163
			match(T__14) as Token
			this.state = 167
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__0) or (1L shl T__2) or (1L shl T__4) or (1L shl T__6) or (1L shl T__7) or (1L shl T__8) or (1L shl T__9) or (1L shl T__10) or (1L shl T__11) or (1L shl T__12) or (1L shl T__13) or (1L shl T__14) or (1L shl T__15) or (1L shl T__16) or (1L shl T__17) or (1L shl T__18) or (1L shl T__19) or (1L shl STRING) or (1L shl FLOAT) or (1L shl HEX) or (1L shl BIN) or (1L shl LONG) or (1L shl BIGN) or (1L shl CHAR_U) or (1L shl CHAR_NAMED) or (1L shl CHAR_ANY) or (1L shl NIL) or (1L shl BOOLEAN) or (1L shl SYMBOL) or (1L shl NS_SYMBOL) or (1L shl PARAM_NAME))) != 0L)) {
				if (true){
				if (true){
				this.state = 164
				form()
				}
				}
				this.state = 169
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 170
			match(T__1) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Meta_dataContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_meta_data.id
	        set(value) { throw RuntimeException() }
		fun findMap() : MapContext? = getRuleContext(solver.getType("MapContext"),0)
		fun findForm() : FormContext? = getRuleContext(solver.getType("FormContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterMeta_data(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitMeta_data(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitMeta_data(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  meta_data() : Meta_dataContext {
		var _localctx : Meta_dataContext = Meta_dataContext(context, state)
		enterRule(_localctx, 32, Rules.RULE_meta_data.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 172
			match(T__15) as Token
			this.state = 177
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,6,context) ) {
			1 -> {if (true){
			this.state = 173
			map()
			this.state = 174
			form()
			}}
			2 -> {if (true){
			this.state = 176
			form()
			}}
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

	open class Var_quoteContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_var_quote.id
	        set(value) { throw RuntimeException() }
		fun findSymbol() : SymbolContext? = getRuleContext(solver.getType("SymbolContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterVar_quote(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitVar_quote(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitVar_quote(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  var_quote() : Var_quoteContext {
		var _localctx : Var_quoteContext = Var_quoteContext(context, state)
		enterRule(_localctx, 34, Rules.RULE_var_quote.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 179
			match(T__16) as Token
			this.state = 180
			symbol()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Host_exprContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_host_expr.id
	        set(value) { throw RuntimeException() }
		fun findForm() : List<FormContext> = getRuleContexts(solver.getType("FormContext"))
		fun findForm(i: Int) : FormContext? = getRuleContext(solver.getType("FormContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterHost_expr(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitHost_expr(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitHost_expr(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  host_expr() : Host_exprContext {
		var _localctx : Host_exprContext = Host_exprContext(context, state)
		enterRule(_localctx, 36, Rules.RULE_host_expr.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 182
			match(T__17) as Token
			this.state = 183
			form()
			this.state = 184
			form()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class DiscardContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_discard.id
	        set(value) { throw RuntimeException() }
		fun findForm() : FormContext? = getRuleContext(solver.getType("FormContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterDiscard(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitDiscard(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitDiscard(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  discard() : DiscardContext {
		var _localctx : DiscardContext = DiscardContext(context, state)
		enterRule(_localctx, 38, Rules.RULE_discard.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 186
			match(T__18) as Token
			this.state = 187
			form()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class DispatchContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_dispatch.id
	        set(value) { throw RuntimeException() }
		fun findSymbol() : SymbolContext? = getRuleContext(solver.getType("SymbolContext"),0)
		fun findForm() : FormContext? = getRuleContext(solver.getType("FormContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterDispatch(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitDispatch(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitDispatch(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  dispatch() : DispatchContext {
		var _localctx : DispatchContext = DispatchContext(context, state)
		enterRule(_localctx, 40, Rules.RULE_dispatch.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 189
			match(T__13) as Token
			this.state = 190
			symbol()
			this.state = 191
			form()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class RegexContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_regex.id
	        set(value) { throw RuntimeException() }
		fun findString() : StringContext? = getRuleContext(solver.getType("StringContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterRegex(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitRegex(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitRegex(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  regex() : RegexContext {
		var _localctx : RegexContext = RegexContext(context, state)
		enterRule(_localctx, 42, Rules.RULE_regex.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 193
			match(T__13) as Token
			this.state = 194
			string()
			}
		}
		catch (re: RecognitionException) {
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
		fun findString() : StringContext? = getRuleContext(solver.getType("StringContext"),0)
		fun findNumber() : NumberContext? = getRuleContext(solver.getType("NumberContext"),0)
		fun findCharacter() : CharacterContext? = getRuleContext(solver.getType("CharacterContext"),0)
		fun findNil() : NilContext? = getRuleContext(solver.getType("NilContext"),0)
		fun BOOLEAN() : TerminalNode? = getToken(ClojureParser.Tokens.BOOLEAN.id, 0)
		fun findKeyword() : KeywordContext? = getRuleContext(solver.getType("KeywordContext"),0)
		fun findSymbol() : SymbolContext? = getRuleContext(solver.getType("SymbolContext"),0)
		fun findParam_name() : Param_nameContext? = getRuleContext(solver.getType("Param_nameContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterLiteral(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitLiteral(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitLiteral(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  literal() : LiteralContext {
		var _localctx : LiteralContext = LiteralContext(context, state)
		enterRule(_localctx, 44, Rules.RULE_literal.id)
		try {
			this.state = 204
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			STRING  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 196
			string()
			}}
			FLOAT , HEX , BIN , LONG , BIGN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 197
			number()
			}}
			CHAR_U , CHAR_NAMED , CHAR_ANY  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 198
			character()
			}}
			NIL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 199
			nil()
			}}
			BOOLEAN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 200
			match(BOOLEAN) as Token
			}}
			T__19  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 201
			keyword()
			}}
			SYMBOL , NS_SYMBOL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 202
			symbol()
			}}
			PARAM_NAME  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 8)
			if (true){
			this.state = 203
			param_name()
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

	open class StringContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_string.id
	        set(value) { throw RuntimeException() }
		fun STRING() : TerminalNode? = getToken(ClojureParser.Tokens.STRING.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterString(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitString(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitString(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  string() : StringContext {
		var _localctx : StringContext = StringContext(context, state)
		enterRule(_localctx, 46, Rules.RULE_string.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 206
			match(STRING) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class HexContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_hex.id
	        set(value) { throw RuntimeException() }
		fun HEX() : TerminalNode? = getToken(ClojureParser.Tokens.HEX.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterHex(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitHex(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitHex(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  hex() : HexContext {
		var _localctx : HexContext = HexContext(context, state)
		enterRule(_localctx, 48, Rules.RULE_hex.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 208
			match(HEX) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class BinContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_bin.id
	        set(value) { throw RuntimeException() }
		fun BIN() : TerminalNode? = getToken(ClojureParser.Tokens.BIN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterBin(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitBin(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitBin(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  bin() : BinContext {
		var _localctx : BinContext = BinContext(context, state)
		enterRule(_localctx, 50, Rules.RULE_bin.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 210
			match(BIN) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class BignContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_bign.id
	        set(value) { throw RuntimeException() }
		fun BIGN() : TerminalNode? = getToken(ClojureParser.Tokens.BIGN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterBign(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitBign(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitBign(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  bign() : BignContext {
		var _localctx : BignContext = BignContext(context, state)
		enterRule(_localctx, 52, Rules.RULE_bign.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 212
			match(BIGN) as Token
			}
		}
		catch (re: RecognitionException) {
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
		fun FLOAT() : TerminalNode? = getToken(ClojureParser.Tokens.FLOAT.id, 0)
		fun findHex() : HexContext? = getRuleContext(solver.getType("HexContext"),0)
		fun findBin() : BinContext? = getRuleContext(solver.getType("BinContext"),0)
		fun findBign() : BignContext? = getRuleContext(solver.getType("BignContext"),0)
		fun LONG() : TerminalNode? = getToken(ClojureParser.Tokens.LONG.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterNumber(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitNumber(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitNumber(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  number() : NumberContext {
		var _localctx : NumberContext = NumberContext(context, state)
		enterRule(_localctx, 54, Rules.RULE_number.id)
		try {
			this.state = 219
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			FLOAT  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 214
			match(FLOAT) as Token
			}}
			HEX  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 215
			hex()
			}}
			BIN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 216
			bin()
			}}
			BIGN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 217
			bign()
			}}
			LONG  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 218
			match(LONG) as Token
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

	open class CharacterContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_character.id
	        set(value) { throw RuntimeException() }
		fun findNamed_char() : Named_charContext? = getRuleContext(solver.getType("Named_charContext"),0)
		fun findU_hex_quad() : U_hex_quadContext? = getRuleContext(solver.getType("U_hex_quadContext"),0)
		fun findAny_char() : Any_charContext? = getRuleContext(solver.getType("Any_charContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterCharacter(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitCharacter(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitCharacter(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  character() : CharacterContext {
		var _localctx : CharacterContext = CharacterContext(context, state)
		enterRule(_localctx, 56, Rules.RULE_character.id)
		try {
			this.state = 224
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			CHAR_NAMED  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 221
			named_char()
			}}
			CHAR_U  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 222
			u_hex_quad()
			}}
			CHAR_ANY  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 223
			any_char()
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

	open class Named_charContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_named_char.id
	        set(value) { throw RuntimeException() }
		fun CHAR_NAMED() : TerminalNode? = getToken(ClojureParser.Tokens.CHAR_NAMED.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterNamed_char(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitNamed_char(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitNamed_char(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  named_char() : Named_charContext {
		var _localctx : Named_charContext = Named_charContext(context, state)
		enterRule(_localctx, 58, Rules.RULE_named_char.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 226
			match(CHAR_NAMED) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Any_charContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_any_char.id
	        set(value) { throw RuntimeException() }
		fun CHAR_ANY() : TerminalNode? = getToken(ClojureParser.Tokens.CHAR_ANY.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterAny_char(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitAny_char(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitAny_char(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  any_char() : Any_charContext {
		var _localctx : Any_charContext = Any_charContext(context, state)
		enterRule(_localctx, 60, Rules.RULE_any_char.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 228
			match(CHAR_ANY) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class U_hex_quadContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_u_hex_quad.id
	        set(value) { throw RuntimeException() }
		fun CHAR_U() : TerminalNode? = getToken(ClojureParser.Tokens.CHAR_U.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterU_hex_quad(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitU_hex_quad(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitU_hex_quad(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  u_hex_quad() : U_hex_quadContext {
		var _localctx : U_hex_quadContext = U_hex_quadContext(context, state)
		enterRule(_localctx, 62, Rules.RULE_u_hex_quad.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 230
			match(CHAR_U) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class NilContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_nil.id
	        set(value) { throw RuntimeException() }
		fun NIL() : TerminalNode? = getToken(ClojureParser.Tokens.NIL.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterNil(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitNil(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitNil(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  nil() : NilContext {
		var _localctx : NilContext = NilContext(context, state)
		enterRule(_localctx, 64, Rules.RULE_nil.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 232
			match(NIL) as Token
			}
		}
		catch (re: RecognitionException) {
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
		fun findMacro_keyword() : Macro_keywordContext? = getRuleContext(solver.getType("Macro_keywordContext"),0)
		fun findSimple_keyword() : Simple_keywordContext? = getRuleContext(solver.getType("Simple_keywordContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterKeyword(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitKeyword(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitKeyword(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  keyword() : KeywordContext {
		var _localctx : KeywordContext = KeywordContext(context, state)
		enterRule(_localctx, 66, Rules.RULE_keyword.id)
		try {
			this.state = 236
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,10,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 234
			macro_keyword()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 235
			simple_keyword()
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

	open class Simple_keywordContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_simple_keyword.id
	        set(value) { throw RuntimeException() }
		fun findSymbol() : SymbolContext? = getRuleContext(solver.getType("SymbolContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterSimple_keyword(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitSimple_keyword(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitSimple_keyword(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  simple_keyword() : Simple_keywordContext {
		var _localctx : Simple_keywordContext = Simple_keywordContext(context, state)
		enterRule(_localctx, 68, Rules.RULE_simple_keyword.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 238
			match(T__19) as Token
			this.state = 239
			symbol()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Macro_keywordContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_macro_keyword.id
	        set(value) { throw RuntimeException() }
		fun findSymbol() : SymbolContext? = getRuleContext(solver.getType("SymbolContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterMacro_keyword(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitMacro_keyword(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitMacro_keyword(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  macro_keyword() : Macro_keywordContext {
		var _localctx : Macro_keywordContext = Macro_keywordContext(context, state)
		enterRule(_localctx, 70, Rules.RULE_macro_keyword.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 241
			match(T__19) as Token
			this.state = 242
			match(T__19) as Token
			this.state = 243
			symbol()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class SymbolContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_symbol.id
	        set(value) { throw RuntimeException() }
		fun findNs_symbol() : Ns_symbolContext? = getRuleContext(solver.getType("Ns_symbolContext"),0)
		fun findSimple_sym() : Simple_symContext? = getRuleContext(solver.getType("Simple_symContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterSymbol(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitSymbol(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitSymbol(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  symbol() : SymbolContext {
		var _localctx : SymbolContext = SymbolContext(context, state)
		enterRule(_localctx, 72, Rules.RULE_symbol.id)
		try {
			this.state = 247
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			NS_SYMBOL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 245
			ns_symbol()
			}}
			SYMBOL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 246
			simple_sym()
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

	open class Simple_symContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_simple_sym.id
	        set(value) { throw RuntimeException() }
		fun SYMBOL() : TerminalNode? = getToken(ClojureParser.Tokens.SYMBOL.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterSimple_sym(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitSimple_sym(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitSimple_sym(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  simple_sym() : Simple_symContext {
		var _localctx : Simple_symContext = Simple_symContext(context, state)
		enterRule(_localctx, 74, Rules.RULE_simple_sym.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 249
			match(SYMBOL) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Ns_symbolContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_ns_symbol.id
	        set(value) { throw RuntimeException() }
		fun NS_SYMBOL() : TerminalNode? = getToken(ClojureParser.Tokens.NS_SYMBOL.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterNs_symbol(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitNs_symbol(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitNs_symbol(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  ns_symbol() : Ns_symbolContext {
		var _localctx : Ns_symbolContext = Ns_symbolContext(context, state)
		enterRule(_localctx, 76, Rules.RULE_ns_symbol.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 251
			match(NS_SYMBOL) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Param_nameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_param_name.id
	        set(value) { throw RuntimeException() }
		fun PARAM_NAME() : TerminalNode? = getToken(ClojureParser.Tokens.PARAM_NAME.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).enterParam_name(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ClojureListener ) (listener as ClojureListener).exitParam_name(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ClojureVisitor ) return (visitor as ClojureVisitor<out T>).visitParam_name(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  param_name() : Param_nameContext {
		var _localctx : Param_nameContext = Param_nameContext(context, state)
		enterRule(_localctx, 78, Rules.RULE_param_name.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 253
			match(PARAM_NAME) as Token
			}
		}
		catch (re: RecognitionException) {
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