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

class creoleParser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(creoleParser.DocumentContext::class,
                                                              creoleParser.LineContext::class,
                                                              creoleParser.MarkupContext::class,
                                                              creoleParser.TextContext::class,
                                                              creoleParser.BoldContext::class,
                                                              creoleParser.ItalicsContext::class,
                                                              creoleParser.HrefContext::class,
                                                              creoleParser.ImageContext::class,
                                                              creoleParser.HlineContext::class,
                                                              creoleParser.ListitemContext::class,
                                                              creoleParser.TableheaderContext::class,
                                                              creoleParser.TablerowContext::class,
                                                              creoleParser.TitleContext::class,
                                                              creoleParser.NowikiContext::class)
    }

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "creole.g4"

    override val tokenNames: Array<String?>?
        get() = creoleParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = creoleParser.Companion.ruleNames
    override val atn: ATN
        get() = creoleParser.Companion.ATN

    enum class Tokens(val id: Int) {
        EOF(-1),
        T__0(1),
        T__1(2),
        T__2(3),
        T__3(4),
        T__4(5),
        T__5(6),
        T__6(7),
        HASH(8),
        LBRACKET(9),
        RBRACKET(10),
        LBRACE(11),
        RBRACE(12),
        TEXT(13),
        WS(14),
        CR(15),
        NOWIKI(16),
        RSLASH(17)
    }

    enum class Rules(val id: Int) {
        RULE_document(0),
        RULE_line(1),
        RULE_markup(2),
        RULE_text(3),
        RULE_bold(4),
        RULE_italics(5),
        RULE_href(6),
        RULE_image(7),
        RULE_hline(8),
        RULE_listitem(9),
        RULE_tableheader(10),
        RULE_tablerow(11),
        RULE_title(12),
        RULE_nowiki(13)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("document", "line", "markup", "text", "bold", 
                                "italics", "href", "image", "hline", "listitem", 
                                "tableheader", "tablerow", "title", "nowiki")

        private val LITERAL_NAMES = Arrays.asList<String?>(null, "'\\\\'", 
                                                           "'**'", "'|'", 
                                                           "'----'", "'*'", 
                                                           "'|='", "'='", 
                                                           "'#'", "'[['", 
                                                           "']]'", "'{{'", 
                                                           "'}}'", null, 
                                                           null, null, null, 
                                                           "'/'")
        private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            "HASH", "LBRACKET", 
                                                            "RBRACKET", 
                                                            "LBRACE", "RBRACE", 
                                                            "TEXT", "WS", 
                                                            "CR", "NOWIKI", 
                                                            "RSLASH")

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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u0013\u00b5\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0003\u0002\u0005\u0002\u0020\u000a\u0002\u0003\u0002\u0007\u0002\u0023\u000a\u0002\u000c\u0002\u000e\u0002\u0026\u000b\u0002\u0003\u0003\u0006\u0003\u0029\u000a\u0003\u000d\u0003\u000e\u0003\u002a\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0005\u0004\u0038\u000a\u0004\u0003\u0005\u0006\u0005\u003b\u000a\u0005\u000d\u0005\u000e\u0005\u003c\u0003\u0005\u0003\u0005\u0007\u0005\u0041\u000a\u0005\u000c\u0005\u000e\u0005\u0044\u000b\u0005\u0003\u0006\u0003\u0006\u0006\u0006\u0048\u000a\u0006\u000d\u0006\u000e\u0006\u0049\u0003\u0006\u0005\u0006\u004d\u000a\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0006\u0007\u0052\u000a\u0007\u000d\u0007\u000e\u0007\u0053\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0006\u0008\u005d\u000a\u0008\u000d\u0008\u000e\u0008\u005e\u0005\u0008\u0061\u000a\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0006\u0008\u0069\u000a\u0008\u000d\u0008\u000e\u0008\u006a\u0003\u0008\u0003\u0008\u0005\u0008\u006f\u000a\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000b\u0006\u000b\u0078\u000a\u000b\u000d\u000b\u000e\u000b\u0079\u0003\u000b\u0003\u000b\u0006\u000b\u007e\u000a\u000b\u000d\u000b\u000e\u000b\u007f\u0003\u000b\u0005\u000b\u0083\u000a\u000b\u0003\u000c\u0003\u000c\u0006\u000c\u0087\u000a\u000c\u000d\u000c\u000e\u000c\u0088\u0006\u000c\u008b\u000a\u000c\u000d\u000c\u000e\u000c\u008c\u0003\u000c\u0003\u000c\u0007\u000c\u0091\u000a\u000c\u000c\u000c\u000e\u000c\u0094\u000b\u000c\u0003\u000d\u0003\u000d\u0006\u000d\u0098\u000a\u000d\u000d\u000d\u000e\u000d\u0099\u0006\u000d\u009c\u000a\u000d\u000d\u000d\u000e\u000d\u009d\u0003\u000d\u0003\u000d\u0007\u000d\u00a2\u000a\u000d\u000c\u000d\u000e\u000d\u00a5\u000b\u000d\u0003\u000e\u0006\u000e\u00a8\u000a\u000e\u000d\u000e\u000e\u000e\u00a9\u0003\u000e\u0003\u000e\u0007\u000e\u00ae\u000a\u000e\u000c\u000e\u000e\u000e\u00b1\u000b\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0002\u0002\u0010\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0002\u0003\u0004\u0002\u000f\u000f\u0013\u0013\u0002\u00c7\u0002\u0024\u0003\u0002\u0002\u0002\u0004\u0028\u0003\u0002\u0002\u0002\u0006\u0037\u0003\u0002\u0002\u0002\u0008\u003a\u0003\u0002\u0002\u0002\u000a\u0045\u0003\u0002\u0002\u0002\u000c\u004e\u0003\u0002\u0002\u0002\u000e\u006e\u0003\u0002\u0002\u0002\u0010\u0070\u0003\u0002\u0002\u0002\u0012\u0074\u0003\u0002\u0002\u0002\u0014\u0082\u0003\u0002\u0002\u0002\u0016\u008a\u0003\u0002\u0002\u0002\u0018\u009b\u0003\u0002\u0002\u0002\u001a\u00a7\u0003\u0002\u0002\u0002\u001c\u00b2\u0003\u0002\u0002\u0002\u001e\u0020\u0005\u0004\u0003\u0002\u001f\u001e\u0003\u0002\u0002\u0002\u001f\u0020\u0003\u0002\u0002\u0002\u0020\u0021\u0003\u0002\u0002\u0002\u0021\u0023\u0007\u0011\u0002\u0002\u0022\u001f\u0003\u0002\u0002\u0002\u0023\u0026\u0003\u0002\u0002\u0002\u0024\u0022\u0003\u0002\u0002\u0002\u0024\u0025\u0003\u0002\u0002\u0002\u0025\u0003\u0003\u0002\u0002\u0002\u0026\u0024\u0003\u0002\u0002\u0002\u0027\u0029\u0005\u0006\u0004\u0002\u0028\u0027\u0003\u0002\u0002\u0002\u0029\u002a\u0003\u0002\u0002\u0002\u002a\u0028\u0003\u0002\u0002\u0002\u002a\u002b\u0003\u0002\u0002\u0002\u002b\u0005\u0003\u0002\u0002\u0002\u002c\u0038\u0005\u000a\u0006\u0002\u002d\u0038\u0005\u000c\u0007\u0002\u002e\u0038\u0005\u000e\u0008\u0002\u002f\u0038\u0005\u001a\u000e\u0002\u0030\u0038\u0005\u0012\u000a\u0002\u0031\u0038\u0005\u0008\u0005\u0002\u0032\u0038\u0005\u0014\u000b\u0002\u0033\u0038\u0005\u0010\u0009\u0002\u0034\u0038\u0005\u0018\u000d\u0002\u0035\u0038\u0005\u0016\u000c\u0002\u0036\u0038\u0005\u001c\u000f\u0002\u0037\u002c\u0003\u0002\u0002\u0002\u0037\u002d\u0003\u0002\u0002\u0002\u0037\u002e\u0003\u0002\u0002\u0002\u0037\u002f\u0003\u0002\u0002\u0002\u0037\u0030\u0003\u0002\u0002\u0002\u0037\u0031\u0003\u0002\u0002\u0002\u0037\u0032\u0003\u0002\u0002\u0002\u0037\u0033\u0003\u0002\u0002\u0002\u0037\u0034\u0003\u0002\u0002\u0002\u0037\u0035\u0003\u0002\u0002\u0002\u0037\u0036\u0003\u0002\u0002\u0002\u0038\u0007\u0003\u0002\u0002\u0002\u0039\u003b\u0009\u0002\u0002\u0002\u003a\u0039\u0003\u0002\u0002\u0002\u003b\u003c\u0003\u0002\u0002\u0002\u003c\u003a\u0003\u0002\u0002\u0002\u003c\u003d\u0003\u0002\u0002\u0002\u003d\u0042\u0003\u0002\u0002\u0002\u003e\u003f\u0007\u0003\u0002\u0002\u003f\u0041\u0005\u0008\u0005\u0002\u0040\u003e\u0003\u0002\u0002\u0002\u0041\u0044\u0003\u0002\u0002\u0002\u0042\u0040\u0003\u0002\u0002\u0002\u0042\u0043\u0003\u0002\u0002\u0002\u0043\u0009\u0003\u0002\u0002\u0002\u0044\u0042\u0003\u0002\u0002\u0002\u0045\u0047\u0007\u0004\u0002\u0002\u0046\u0048\u0005\u0006\u0004\u0002\u0047\u0046\u0003\u0002\u0002\u0002\u0048\u0049\u0003\u0002\u0002\u0002\u0049\u0047\u0003\u0002\u0002\u0002\u0049\u004a\u0003\u0002\u0002\u0002\u004a\u004c\u0003\u0002\u0002\u0002\u004b\u004d\u0007\u0004\u0002\u0002\u004c\u004b\u0003\u0002\u0002\u0002\u004c\u004d\u0003\u0002\u0002\u0002\u004d\u000b\u0003\u0002\u0002\u0002\u004e\u004f\u0007\u0013\u0002\u0002\u004f\u0051\u0007\u0013\u0002\u0002\u0050\u0052\u0005\u0006\u0004\u0002\u0051\u0050\u0003\u0002\u0002\u0002\u0052\u0053\u0003\u0002\u0002\u0002\u0053\u0051\u0003\u0002\u0002\u0002\u0053\u0054\u0003\u0002\u0002\u0002\u0054\u0055\u0003\u0002\u0002\u0002\u0055\u0056\u0007\u0013\u0002\u0002\u0056\u0057\u0007\u0013\u0002\u0002\u0057\u000d\u0003\u0002\u0002\u0002\u0058\u0059\u0007\u000b\u0002\u0002\u0059\u0060\u0005\u0008\u0005\u0002\u005a\u005c\u0007\u0005\u0002\u0002\u005b\u005d\u0005\u0006\u0004\u0002\u005c\u005b\u0003\u0002\u0002\u0002\u005d\u005e\u0003\u0002\u0002\u0002\u005e\u005c\u0003\u0002\u0002\u0002\u005e\u005f\u0003\u0002\u0002\u0002\u005f\u0061\u0003\u0002\u0002\u0002\u0060\u005a\u0003\u0002\u0002\u0002\u0060\u0061\u0003\u0002\u0002\u0002\u0061\u0062\u0003\u0002\u0002\u0002\u0062\u0063\u0007\u000c\u0002\u0002\u0063\u006f\u0003\u0002\u0002\u0002\u0064\u0065\u0007\u000d\u0002\u0002\u0065\u0066\u0005\u0008\u0005\u0002\u0066\u0068\u0007\u0005\u0002\u0002\u0067\u0069\u0005\u0006\u0004\u0002\u0068\u0067\u0003\u0002\u0002\u0002\u0069\u006a\u0003\u0002\u0002\u0002\u006a\u0068\u0003\u0002\u0002\u0002\u006a\u006b\u0003\u0002\u0002\u0002\u006b\u006c\u0003\u0002\u0002\u0002\u006c\u006d\u0007\u000e\u0002\u0002\u006d\u006f\u0003\u0002\u0002\u0002\u006e\u0058\u0003\u0002\u0002\u0002\u006e\u0064\u0003\u0002\u0002\u0002\u006f\u000f\u0003\u0002\u0002\u0002\u0070\u0071\u0007\u000d\u0002\u0002\u0071\u0072\u0005\u0008\u0005\u0002\u0072\u0073\u0007\u000e\u0002\u0002\u0073\u0011\u0003\u0002\u0002\u0002\u0074\u0075\u0007\u0006\u0002\u0002\u0075\u0013\u0003\u0002\u0002\u0002\u0076\u0078\u0007\u0007\u0002\u0002\u0077\u0076\u0003\u0002\u0002\u0002\u0078\u0079\u0003\u0002\u0002\u0002\u0079\u0077\u0003\u0002\u0002\u0002\u0079\u007a\u0003\u0002\u0002\u0002\u007a\u007b\u0003\u0002\u0002\u0002\u007b\u0083\u0005\u0006\u0004\u0002\u007c\u007e\u0007\u000a\u0002\u0002\u007d\u007c\u0003\u0002\u0002\u0002\u007e\u007f\u0003\u0002\u0002\u0002\u007f\u007d\u0003\u0002\u0002\u0002\u007f\u0080\u0003\u0002\u0002\u0002\u0080\u0081\u0003\u0002\u0002\u0002\u0081\u0083\u0005\u0006\u0004\u0002\u0082\u0077\u0003\u0002\u0002\u0002\u0082\u007d\u0003\u0002\u0002\u0002\u0083\u0015\u0003\u0002\u0002\u0002\u0084\u0086\u0007\u0008\u0002\u0002\u0085\u0087\u0005\u0006\u0004\u0002\u0086\u0085\u0003\u0002\u0002\u0002\u0087\u0088\u0003\u0002\u0002\u0002\u0088\u0086\u0003\u0002\u0002\u0002\u0088\u0089\u0003\u0002\u0002\u0002\u0089\u008b\u0003\u0002\u0002\u0002\u008a\u0084\u0003\u0002\u0002\u0002\u008b\u008c\u0003\u0002\u0002\u0002\u008c\u008a\u0003\u0002\u0002\u0002\u008c\u008d\u0003\u0002\u0002\u0002\u008d\u008e\u0003\u0002\u0002\u0002\u008e\u0092\u0007\u0005\u0002\u0002\u008f\u0091\u0007\u0010\u0002\u0002\u0090\u008f\u0003\u0002\u0002\u0002\u0091\u0094\u0003\u0002\u0002\u0002\u0092\u0090\u0003\u0002\u0002\u0002\u0092\u0093\u0003\u0002\u0002\u0002\u0093\u0017\u0003\u0002\u0002\u0002\u0094\u0092\u0003\u0002\u0002\u0002\u0095\u0097\u0007\u0005\u0002\u0002\u0096\u0098\u0005\u0006\u0004\u0002\u0097\u0096\u0003\u0002\u0002\u0002\u0098\u0099\u0003\u0002\u0002\u0002\u0099\u0097\u0003\u0002\u0002\u0002\u0099\u009a\u0003\u0002\u0002\u0002\u009a\u009c\u0003\u0002\u0002\u0002\u009b\u0095\u0003\u0002\u0002\u0002\u009c\u009d\u0003\u0002\u0002\u0002\u009d\u009b\u0003\u0002\u0002\u0002\u009d\u009e\u0003\u0002\u0002\u0002\u009e\u009f\u0003\u0002\u0002\u0002\u009f\u00a3\u0007\u0005\u0002\u0002\u00a0\u00a2\u0007\u0010\u0002\u0002\u00a1\u00a0\u0003\u0002\u0002\u0002\u00a2\u00a5\u0003\u0002\u0002\u0002\u00a3\u00a1\u0003\u0002\u0002\u0002\u00a3\u00a4\u0003\u0002\u0002\u0002\u00a4\u0019\u0003\u0002\u0002\u0002\u00a5\u00a3\u0003\u0002\u0002\u0002\u00a6\u00a8\u0007\u0009\u0002\u0002\u00a7\u00a6\u0003\u0002\u0002\u0002\u00a8\u00a9\u0003\u0002\u0002\u0002\u00a9\u00a7\u0003\u0002\u0002\u0002\u00a9\u00aa\u0003\u0002\u0002\u0002\u00aa\u00ab\u0003\u0002\u0002\u0002\u00ab\u00af\u0005\u0006\u0004\u0002\u00ac\u00ae\u0007\u0009\u0002\u0002\u00ad\u00ac\u0003\u0002\u0002\u0002\u00ae\u00b1\u0003\u0002\u0002\u0002\u00af\u00ad\u0003\u0002\u0002\u0002\u00af\u00b0\u0003\u0002\u0002\u0002\u00b0\u001b\u0003\u0002\u0002\u0002\u00b1\u00af\u0003\u0002\u0002\u0002\u00b2\u00b3\u0007\u0012\u0002\u0002\u00b3\u001d\u0003\u0002\u0002\u0002\u001a\u001f\u0024\u002a\u0037\u003c\u0042\u0049\u004c\u0053\u005e\u0060\u006a\u006e\u0079\u007f\u0082\u0088\u008c\u0092\u0099\u009d\u00a3\u00a9\u00af"

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
    private val HASH = Tokens.HASH.id
    private val LBRACKET = Tokens.LBRACKET.id
    private val RBRACKET = Tokens.RBRACKET.id
    private val LBRACE = Tokens.LBRACE.id
    private val RBRACE = Tokens.RBRACE.id
    private val TEXT = Tokens.TEXT.id
    private val WS = Tokens.WS.id
    private val CR = Tokens.CR.id
    private val NOWIKI = Tokens.NOWIKI.id
    private val RSLASH = Tokens.RSLASH.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class DocumentContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_document.id
	        set(value) { throw RuntimeException() }
		fun CR() : List<TerminalNode> = getTokens(creoleParser.Tokens.CR.id)
		fun CR(i: Int) : TerminalNode = getToken(creoleParser.Tokens.CR.id, i) as TerminalNode
		fun findLine() : List<LineContext> = getRuleContexts(solver.getType("LineContext"))
		fun findLine(i: Int) : LineContext? = getRuleContext(solver.getType("LineContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is creoleListener ) (listener as creoleListener).enterDocument(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is creoleListener ) (listener as creoleListener).exitDocument(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is creoleVisitor ) return (visitor as creoleVisitor<out T>).visitDocument(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  document() : DocumentContext {
		var _localctx : DocumentContext = DocumentContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_document.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 34
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__1) or (1L shl T__2) or (1L shl T__3) or (1L shl T__4) or (1L shl T__5) or (1L shl T__6) or (1L shl HASH) or (1L shl LBRACKET) or (1L shl LBRACE) or (1L shl TEXT) or (1L shl CR) or (1L shl NOWIKI) or (1L shl RSLASH))) != 0L)) {
				if (true){
				if (true){
				this.state = 29
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__1) or (1L shl T__2) or (1L shl T__3) or (1L shl T__4) or (1L shl T__5) or (1L shl T__6) or (1L shl HASH) or (1L shl LBRACKET) or (1L shl LBRACE) or (1L shl TEXT) or (1L shl NOWIKI) or (1L shl RSLASH))) != 0L)) {
					if (true){
					this.state = 28
					line()
					}
				}

				this.state = 31
				match(CR) as Token
				}
				}
				this.state = 36
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

	open class LineContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_line.id
	        set(value) { throw RuntimeException() }
		fun findMarkup() : List<MarkupContext> = getRuleContexts(solver.getType("MarkupContext"))
		fun findMarkup(i: Int) : MarkupContext? = getRuleContext(solver.getType("MarkupContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is creoleListener ) (listener as creoleListener).enterLine(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is creoleListener ) (listener as creoleListener).exitLine(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is creoleVisitor ) return (visitor as creoleVisitor<out T>).visitLine(this)
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
			this.state = 38 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 37
				markup()
				}
				}
				this.state = 40 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__1) or (1L shl T__2) or (1L shl T__3) or (1L shl T__4) or (1L shl T__5) or (1L shl T__6) or (1L shl HASH) or (1L shl LBRACKET) or (1L shl LBRACE) or (1L shl TEXT) or (1L shl NOWIKI) or (1L shl RSLASH))) != 0L) )
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class MarkupContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_markup.id
	        set(value) { throw RuntimeException() }
		fun findBold() : BoldContext? = getRuleContext(solver.getType("BoldContext"),0)
		fun findItalics() : ItalicsContext? = getRuleContext(solver.getType("ItalicsContext"),0)
		fun findHref() : HrefContext? = getRuleContext(solver.getType("HrefContext"),0)
		fun findTitle() : TitleContext? = getRuleContext(solver.getType("TitleContext"),0)
		fun findHline() : HlineContext? = getRuleContext(solver.getType("HlineContext"),0)
		fun findText() : TextContext? = getRuleContext(solver.getType("TextContext"),0)
		fun findListitem() : ListitemContext? = getRuleContext(solver.getType("ListitemContext"),0)
		fun findImage() : ImageContext? = getRuleContext(solver.getType("ImageContext"),0)
		fun findTablerow() : TablerowContext? = getRuleContext(solver.getType("TablerowContext"),0)
		fun findTableheader() : TableheaderContext? = getRuleContext(solver.getType("TableheaderContext"),0)
		fun findNowiki() : NowikiContext? = getRuleContext(solver.getType("NowikiContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is creoleListener ) (listener as creoleListener).enterMarkup(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is creoleListener ) (listener as creoleListener).exitMarkup(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is creoleVisitor ) return (visitor as creoleVisitor<out T>).visitMarkup(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  markup() : MarkupContext {
		var _localctx : MarkupContext = MarkupContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_markup.id)
		try {
			this.state = 53
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,3,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 42
			bold()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 43
			italics()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 44
			href()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 45
			title()
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 46
			hline()
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 47
			text()
			}}
			7 -> {
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 48
			listitem()
			}}
			8 -> {
			enterOuterAlt(_localctx, 8)
			if (true){
			this.state = 49
			image()
			}}
			9 -> {
			enterOuterAlt(_localctx, 9)
			if (true){
			this.state = 50
			tablerow()
			}}
			10 -> {
			enterOuterAlt(_localctx, 10)
			if (true){
			this.state = 51
			tableheader()
			}}
			11 -> {
			enterOuterAlt(_localctx, 11)
			if (true){
			this.state = 52
			nowiki()
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

	open class TextContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_text.id
	        set(value) { throw RuntimeException() }
		fun findText() : List<TextContext> = getRuleContexts(solver.getType("TextContext"))
		fun findText(i: Int) : TextContext? = getRuleContext(solver.getType("TextContext"),i)
		fun TEXT() : List<TerminalNode> = getTokens(creoleParser.Tokens.TEXT.id)
		fun TEXT(i: Int) : TerminalNode = getToken(creoleParser.Tokens.TEXT.id, i) as TerminalNode
		fun RSLASH() : List<TerminalNode> = getTokens(creoleParser.Tokens.RSLASH.id)
		fun RSLASH(i: Int) : TerminalNode = getToken(creoleParser.Tokens.RSLASH.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is creoleListener ) (listener as creoleListener).enterText(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is creoleListener ) (listener as creoleListener).exitText(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is creoleVisitor ) return (visitor as creoleVisitor<out T>).visitText(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  text() : TextContext {
		var _localctx : TextContext = TextContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_text.id)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 56 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				if (true){
				this.state = 55
				_la = _input!!.LA(1)
				if ( !(_la==TEXT || _la==RSLASH) ) {
					errorHandler.recoverInline(this)
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 58 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,4,context)
			} while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER )
			this.state = 64
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,5,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 60
					match(T__0) as Token
					this.state = 61
					text()
					}
					} 
				}
				this.state = 66
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,5,context)
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

	open class BoldContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_bold.id
	        set(value) { throw RuntimeException() }
		fun findMarkup() : List<MarkupContext> = getRuleContexts(solver.getType("MarkupContext"))
		fun findMarkup(i: Int) : MarkupContext? = getRuleContext(solver.getType("MarkupContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is creoleListener ) (listener as creoleListener).enterBold(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is creoleListener ) (listener as creoleListener).exitBold(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is creoleVisitor ) return (visitor as creoleVisitor<out T>).visitBold(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  bold() : BoldContext {
		var _localctx : BoldContext = BoldContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_bold.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 67
			match(T__1) as Token
			this.state = 69 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				if (true){
				this.state = 68
				markup()
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 71 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,6,context)
			} while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER )
			this.state = 74
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,7,context) ) {
			1   -> if (true){
			this.state = 73
			match(T__1) as Token
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

	open class ItalicsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_italics.id
	        set(value) { throw RuntimeException() }
		fun RSLASH() : List<TerminalNode> = getTokens(creoleParser.Tokens.RSLASH.id)
		fun RSLASH(i: Int) : TerminalNode = getToken(creoleParser.Tokens.RSLASH.id, i) as TerminalNode
		fun findMarkup() : List<MarkupContext> = getRuleContexts(solver.getType("MarkupContext"))
		fun findMarkup(i: Int) : MarkupContext? = getRuleContext(solver.getType("MarkupContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is creoleListener ) (listener as creoleListener).enterItalics(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is creoleListener ) (listener as creoleListener).exitItalics(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is creoleVisitor ) return (visitor as creoleVisitor<out T>).visitItalics(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  italics() : ItalicsContext {
		var _localctx : ItalicsContext = ItalicsContext(context, state)
		enterRule(_localctx, 10, Rules.RULE_italics.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 76
			match(RSLASH) as Token
			this.state = 77
			match(RSLASH) as Token
			this.state = 79 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				if (true){
				this.state = 78
				markup()
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 81 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,8,context)
			} while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER )
			this.state = 83
			match(RSLASH) as Token
			this.state = 84
			match(RSLASH) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class HrefContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_href.id
	        set(value) { throw RuntimeException() }
		fun LBRACKET() : TerminalNode? = getToken(creoleParser.Tokens.LBRACKET.id, 0)
		fun findText() : TextContext? = getRuleContext(solver.getType("TextContext"),0)
		fun RBRACKET() : TerminalNode? = getToken(creoleParser.Tokens.RBRACKET.id, 0)
		fun findMarkup() : List<MarkupContext> = getRuleContexts(solver.getType("MarkupContext"))
		fun findMarkup(i: Int) : MarkupContext? = getRuleContext(solver.getType("MarkupContext"),i)
		fun LBRACE() : TerminalNode? = getToken(creoleParser.Tokens.LBRACE.id, 0)
		fun RBRACE() : TerminalNode? = getToken(creoleParser.Tokens.RBRACE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is creoleListener ) (listener as creoleListener).enterHref(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is creoleListener ) (listener as creoleListener).exitHref(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is creoleVisitor ) return (visitor as creoleVisitor<out T>).visitHref(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  href() : HrefContext {
		var _localctx : HrefContext = HrefContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_href.id)
		var _la: Int
		try {
			this.state = 108
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			LBRACKET  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 86
			match(LBRACKET) as Token
			this.state = 87
			text()
			this.state = 94
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__2) {
				if (true){
				this.state = 88
				match(T__2) as Token
				this.state = 90 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				do {
					if (true){
					if (true){
					this.state = 89
					markup()
					}
					}
					this.state = 92 
					errorHandler.sync(this)
					_la = _input!!.LA(1)
				} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__1) or (1L shl T__2) or (1L shl T__3) or (1L shl T__4) or (1L shl T__5) or (1L shl T__6) or (1L shl HASH) or (1L shl LBRACKET) or (1L shl LBRACE) or (1L shl TEXT) or (1L shl NOWIKI) or (1L shl RSLASH))) != 0L) )
				}
			}

			this.state = 96
			match(RBRACKET) as Token
			}}
			LBRACE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 98
			match(LBRACE) as Token
			this.state = 99
			text()
			this.state = 100
			match(T__2) as Token
			this.state = 102 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 101
				markup()
				}
				}
				this.state = 104 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__1) or (1L shl T__2) or (1L shl T__3) or (1L shl T__4) or (1L shl T__5) or (1L shl T__6) or (1L shl HASH) or (1L shl LBRACKET) or (1L shl LBRACE) or (1L shl TEXT) or (1L shl NOWIKI) or (1L shl RSLASH))) != 0L) )
			this.state = 106
			match(RBRACE) as Token
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

	open class ImageContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_image.id
	        set(value) { throw RuntimeException() }
		fun LBRACE() : TerminalNode? = getToken(creoleParser.Tokens.LBRACE.id, 0)
		fun findText() : TextContext? = getRuleContext(solver.getType("TextContext"),0)
		fun RBRACE() : TerminalNode? = getToken(creoleParser.Tokens.RBRACE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is creoleListener ) (listener as creoleListener).enterImage(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is creoleListener ) (listener as creoleListener).exitImage(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is creoleVisitor ) return (visitor as creoleVisitor<out T>).visitImage(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  image() : ImageContext {
		var _localctx : ImageContext = ImageContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_image.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 110
			match(LBRACE) as Token
			this.state = 111
			text()
			this.state = 112
			match(RBRACE) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class HlineContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_hline.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is creoleListener ) (listener as creoleListener).enterHline(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is creoleListener ) (listener as creoleListener).exitHline(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is creoleVisitor ) return (visitor as creoleVisitor<out T>).visitHline(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  hline() : HlineContext {
		var _localctx : HlineContext = HlineContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_hline.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 114
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

	open class ListitemContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_listitem.id
	        set(value) { throw RuntimeException() }
		fun findMarkup() : MarkupContext? = getRuleContext(solver.getType("MarkupContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is creoleListener ) (listener as creoleListener).enterListitem(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is creoleListener ) (listener as creoleListener).exitListitem(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is creoleVisitor ) return (visitor as creoleVisitor<out T>).visitListitem(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  listitem() : ListitemContext {
		var _localctx : ListitemContext = ListitemContext(context, state)
		enterRule(_localctx, 18, Rules.RULE_listitem.id)
		try {
			var _alt: Int
			this.state = 128
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			T__4  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 117 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				if (true){
				this.state = 116
				match(T__4) as Token
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 119 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,13,context)
			} while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER )
			this.state = 121
			markup()
			}
			}}
			HASH  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			if (true){
			this.state = 123 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				if (true){
				this.state = 122
				match(HASH) as Token
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 125 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,14,context)
			} while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER )
			this.state = 127
			markup()
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

	open class TableheaderContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_tableheader.id
	        set(value) { throw RuntimeException() }
		fun WS() : List<TerminalNode> = getTokens(creoleParser.Tokens.WS.id)
		fun WS(i: Int) : TerminalNode = getToken(creoleParser.Tokens.WS.id, i) as TerminalNode
		fun findMarkup() : List<MarkupContext> = getRuleContexts(solver.getType("MarkupContext"))
		fun findMarkup(i: Int) : MarkupContext? = getRuleContext(solver.getType("MarkupContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is creoleListener ) (listener as creoleListener).enterTableheader(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is creoleListener ) (listener as creoleListener).exitTableheader(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is creoleVisitor ) return (visitor as creoleVisitor<out T>).visitTableheader(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  tableheader() : TableheaderContext {
		var _localctx : TableheaderContext = TableheaderContext(context, state)
		enterRule(_localctx, 20, Rules.RULE_tableheader.id)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 136 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 130
				match(T__5) as Token
				this.state = 132 
				errorHandler.sync(this)
				_alt = 1
				do {
					when (_alt) {
					    1 -> if (true){
					if (true){
					this.state = 131
					markup()
					}
					}
					else -> throw NoViableAltException(this)
					}
					this.state = 134 
					errorHandler.sync(this)
					_alt = interpreter!!.adaptivePredict(_input!!,16,context)
				} while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER )
				}
				}
				this.state = 138 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__5 )
			this.state = 140
			match(T__2) as Token
			this.state = 144
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==WS) {
				if (true){
				if (true){
				this.state = 141
				match(WS) as Token
				}
				}
				this.state = 146
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

	open class TablerowContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_tablerow.id
	        set(value) { throw RuntimeException() }
		fun WS() : List<TerminalNode> = getTokens(creoleParser.Tokens.WS.id)
		fun WS(i: Int) : TerminalNode = getToken(creoleParser.Tokens.WS.id, i) as TerminalNode
		fun findMarkup() : List<MarkupContext> = getRuleContexts(solver.getType("MarkupContext"))
		fun findMarkup(i: Int) : MarkupContext? = getRuleContext(solver.getType("MarkupContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is creoleListener ) (listener as creoleListener).enterTablerow(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is creoleListener ) (listener as creoleListener).exitTablerow(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is creoleVisitor ) return (visitor as creoleVisitor<out T>).visitTablerow(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  tablerow() : TablerowContext {
		var _localctx : TablerowContext = TablerowContext(context, state)
		enterRule(_localctx, 22, Rules.RULE_tablerow.id)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 153 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				if (true){
				this.state = 147
				match(T__2) as Token
				this.state = 149 
				errorHandler.sync(this)
				_alt = 1
				do {
					when (_alt) {
					    1 -> if (true){
					if (true){
					this.state = 148
					markup()
					}
					}
					else -> throw NoViableAltException(this)
					}
					this.state = 151 
					errorHandler.sync(this)
					_alt = interpreter!!.adaptivePredict(_input!!,19,context)
				} while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER )
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 155 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,20,context)
			} while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER )
			this.state = 157
			match(T__2) as Token
			this.state = 161
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==WS) {
				if (true){
				if (true){
				this.state = 158
				match(WS) as Token
				}
				}
				this.state = 163
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

	open class TitleContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_title.id
	        set(value) { throw RuntimeException() }
		fun findMarkup() : MarkupContext? = getRuleContext(solver.getType("MarkupContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is creoleListener ) (listener as creoleListener).enterTitle(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is creoleListener ) (listener as creoleListener).exitTitle(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is creoleVisitor ) return (visitor as creoleVisitor<out T>).visitTitle(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  title() : TitleContext {
		var _localctx : TitleContext = TitleContext(context, state)
		enterRule(_localctx, 24, Rules.RULE_title.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 165 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				if (true){
				this.state = 164
				match(T__6) as Token
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 167 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,22,context)
			} while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER )
			this.state = 169
			markup()
			this.state = 173
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,23,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 170
					match(T__6) as Token
					}
					} 
				}
				this.state = 175
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,23,context)
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

	open class NowikiContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_nowiki.id
	        set(value) { throw RuntimeException() }
		fun NOWIKI() : TerminalNode? = getToken(creoleParser.Tokens.NOWIKI.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is creoleListener ) (listener as creoleListener).enterNowiki(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is creoleListener ) (listener as creoleListener).exitNowiki(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is creoleVisitor ) return (visitor as creoleVisitor<out T>).visitNowiki(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  nowiki() : NowikiContext {
		var _localctx : NowikiContext = NowikiContext(context, state)
		enterRule(_localctx, 26, Rules.RULE_nowiki.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 176
			match(NOWIKI) as Token
			}
		}
		catch (re: RecognitionException) {
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