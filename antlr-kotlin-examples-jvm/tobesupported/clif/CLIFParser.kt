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

class CLIFParser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(CLIFParser.TermseqContext::class,
                                                              CLIFParser.InterpretednameContext::class,
                                                              CLIFParser.InterpretablenameContext::class,
                                                              CLIFParser.NameContext::class,
                                                              CLIFParser.TermContext::class,
                                                              CLIFParser.OperatorContext::class,
                                                              CLIFParser.EquationContext::class,
                                                              CLIFParser.SentenceContext::class,
                                                              CLIFParser.AtomsentContext::class,
                                                              CLIFParser.AtomContext::class,
                                                              CLIFParser.PredicateContext::class,
                                                              CLIFParser.BoolsentContext::class,
                                                              CLIFParser.QuantsentContext::class,
                                                              CLIFParser.BoundlistContext::class,
                                                              CLIFParser.CommentsentContext::class,
                                                              CLIFParser.ModuleContext::class,
                                                              CLIFParser.PhraseContext::class,
                                                              CLIFParser.TextContext::class,
                                                              CLIFParser.CltextContext::class,
                                                              CLIFParser.NamedtextContext::class)
    }

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "CLIF.g4"

    override val tokenNames: Array<String?>?
        get() = CLIFParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = CLIFParser.Companion.ruleNames
    override val atn: ATN
        get() = CLIFParser.Companion.ATN

    enum class Tokens(val id: Int) {
        EOF(-1),
        OPEN(1),
        CLOSE(2),
        STRINGQUOTE(3),
        NAMEQUOTE(4),
        BACKSLASH(5),
        NUMERAL(6),
        SEQMARK(7),
        QUOTEDSTRING(8),
        ENCLOSEDNAME(9),
        EQUAL(10),
        AND(11),
        OR(12),
        IFF(13),
        IF(14),
        FORALL(15),
        EXISTS(16),
        NOT(17),
        CL_ROLESET(18),
        CL_TEXT(19),
        CL_IMPORTS(20),
        CL_EXCLUDES(21),
        CL_MODULE(22),
        CL_COMMENT(23),
        CL_PREFIX(24),
        NAMECHARSEQUENCE(25),
        WHITE(26),
        BLOCKCOMMENT(27),
        LineComment(28)
    }

    enum class Rules(val id: Int) {
        RULE_termseq(0),
        RULE_interpretedname(1),
        RULE_interpretablename(2),
        RULE_name(3),
        RULE_term(4),
        RULE_operator(5),
        RULE_equation(6),
        RULE_sentence(7),
        RULE_atomsent(8),
        RULE_atom(9),
        RULE_predicate(10),
        RULE_boolsent(11),
        RULE_quantsent(12),
        RULE_boundlist(13),
        RULE_commentsent(14),
        RULE_module(15),
        RULE_phrase(16),
        RULE_text(17),
        RULE_cltext(18),
        RULE_namedtext(19)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("termseq", "interpretedname", "interpretablename", 
                                "name", "term", "operator", "equation", 
                                "sentence", "atomsent", "atom", "predicate", 
                                "boolsent", "quantsent", "boundlist", "commentsent", 
                                "module", "phrase", "text", "cltext", "namedtext")

        private val LITERAL_NAMES = Arrays.asList<String?>(null, "'('", 
                                                           "')'", "'''", 
                                                           "'\"'", "'\\'", 
                                                           null, null, null, 
                                                           null, "'='", 
                                                           "'and'", "'or'", 
                                                           "'iff'", "'if'", 
                                                           "'forall'", "'exists'", 
                                                           "'not'", "'cl-roleset'", 
                                                           "'cl-text'", 
                                                           "'cl-imports'", 
                                                           "'cl-excludes'", 
                                                           "'cl-module'", 
                                                           "'cl-comment'", 
                                                           "'cl-prefix'")
        private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, "OPEN", 
                                                            "CLOSE", "STRINGQUOTE", 
                                                            "NAMEQUOTE", 
                                                            "BACKSLASH", 
                                                            "NUMERAL", "SEQMARK", 
                                                            "QUOTEDSTRING", 
                                                            "ENCLOSEDNAME", 
                                                            "EQUAL", "AND", 
                                                            "OR", "IFF", 
                                                            "IF", "FORALL", 
                                                            "EXISTS", "NOT", 
                                                            "CL_ROLESET", 
                                                            "CL_TEXT", "CL_IMPORTS", 
                                                            "CL_EXCLUDES", 
                                                            "CL_MODULE", 
                                                            "CL_COMMENT", 
                                                            "CL_PREFIX", 
                                                            "NAMECHARSEQUENCE", 
                                                            "WHITE", "BLOCKCOMMENT", 
                                                            "LineComment")

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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u001e\u00db\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0003\u0002\u0003\u0002\u0007\u0002\u002d\u000a\u0002\u000c\u0002\u000e\u0002\u0030\u000b\u0002\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0005\u0005\u0038\u000a\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0005\u0006\u0046\u000a\u0006\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0005\u0009\u0054\u000a\u0009\u0003\u000a\u0003\u000a\u0005\u000a\u0058\u000a\u000a\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0005\u000b\u006b\u000a\u000b\u0003\u000c\u0003\u000c\u0003\u000d\u0003\u000d\u0003\u000d\u0007\u000d\u0072\u000a\u000d\u000c\u000d\u000e\u000d\u0075\u000b\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0005\u000d\u0083\u000a\u000d\u0003\u000e\u0003\u000e\u0003\u000e\u0005\u000e\u0088\u000a\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0005\u000f\u0094\u000a\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0007\u000f\u0099\u000a\u000f\u000c\u000f\u000e\u000f\u009c\u000b\u000f\u0003\u000f\u0003\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0007\u0011\u00ac\u000a\u0011\u000c\u0011\u000e\u0011\u00af\u000b\u0011\u0003\u0011\u0005\u0011\u00b2\u000a\u0011\u0003\u0011\u0005\u0011\u00b5\u000a\u0011\u0003\u0011\u0003\u0011\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0005\u0012\u00c4\u000a\u0012\u0003\u0012\u0005\u0012\u00c7\u000a\u0012\u0003\u0013\u0006\u0013\u00ca\u000a\u0013\u000d\u0013\u000e\u0013\u00cb\u0003\u0014\u0003\u0014\u0003\u0014\u0005\u0014\u00d1\u000a\u0014\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0005\u0015\u00d7\u000a\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0002\u0002\u0016\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0020\u0022\u0024\u0026\u0028\u0002\u0007\u0004\u0002\u0008\u0008\u000a\u000a\u0004\u0002\u000b\u000b\u001b\u001b\u0003\u0002\u000d\u000e\u0003\u0002\u000f\u0010\u0003\u0002\u0011\u0012\u0002\u00e3\u0002\u002e\u0003\u0002\u0002\u0002\u0004\u0031\u0003\u0002\u0002\u0002\u0006\u0033\u0003\u0002\u0002\u0002\u0008\u0037\u0003\u0002\u0002\u0002\u000a\u0045\u0003\u0002\u0002\u0002\u000c\u0047\u0003\u0002\u0002\u0002\u000e\u0049\u0003\u0002\u0002\u0002\u0010\u0053\u0003\u0002\u0002\u0002\u0012\u0057\u0003\u0002\u0002\u0002\u0014\u006a\u0003\u0002\u0002\u0002\u0016\u006c\u0003\u0002\u0002\u0002\u0018\u0082\u0003\u0002\u0002\u0002\u001a\u0084\u0003\u0002\u0002\u0002\u001c\u008d\u0003\u0002\u0002\u0002\u001e\u009f\u0003\u0002\u0002\u0002\u0020\u00a5\u0003\u0002\u0002\u0002\u0022\u00c6\u0003\u0002\u0002\u0002\u0024\u00c9\u0003\u0002\u0002\u0002\u0026\u00d0\u0003\u0002\u0002\u0002\u0028\u00d2\u0003\u0002\u0002\u0002\u002a\u002d\u0005\u000a\u0006\u0002\u002b\u002d\u0007\u0009\u0002\u0002\u002c\u002a\u0003\u0002\u0002\u0002\u002c\u002b\u0003\u0002\u0002\u0002\u002d\u0030\u0003\u0002\u0002\u0002\u002e\u002c\u0003\u0002\u0002\u0002\u002e\u002f\u0003\u0002\u0002\u0002\u002f\u0003\u0003\u0002\u0002\u0002\u0030\u002e\u0003\u0002\u0002\u0002\u0031\u0032\u0009\u0002\u0002\u0002\u0032\u0005\u0003\u0002\u0002\u0002\u0033\u0034\u0009\u0003\u0002\u0002\u0034\u0007\u0003\u0002\u0002\u0002\u0035\u0038\u0005\u0004\u0003\u0002\u0036\u0038\u0005\u0006\u0004\u0002\u0037\u0035\u0003\u0002\u0002\u0002\u0037\u0036\u0003\u0002\u0002\u0002\u0038\u0009\u0003\u0002\u0002\u0002\u0039\u0046\u0005\u0008\u0005\u0002\u003a\u003b\u0007\u0003\u0002\u0002\u003b\u003c\u0005\u000c\u0007\u0002\u003c\u003d\u0005\u0002\u0002\u0002\u003d\u003e\u0007\u0004\u0002\u0002\u003e\u0046\u0003\u0002\u0002\u0002\u003f\u0040\u0007\u0003\u0002\u0002\u0040\u0041\u0007\u0019\u0002\u0002\u0041\u0042\u0007\u000a\u0002\u0002\u0042\u0043\u0005\u000a\u0006\u0002\u0043\u0044\u0007\u0004\u0002\u0002\u0044\u0046\u0003\u0002\u0002\u0002\u0045\u0039\u0003\u0002\u0002\u0002\u0045\u003a\u0003\u0002\u0002\u0002\u0045\u003f\u0003\u0002\u0002\u0002\u0046\u000b\u0003\u0002\u0002\u0002\u0047\u0048\u0005\u000a\u0006\u0002\u0048\u000d\u0003\u0002\u0002\u0002\u0049\u004a\u0007\u0003\u0002\u0002\u004a\u004b\u0007\u000c\u0002\u0002\u004b\u004c\u0005\u000a\u0006\u0002\u004c\u004d\u0005\u000a\u0006\u0002\u004d\u004e\u0007\u0004\u0002\u0002\u004e\u000f\u0003\u0002\u0002\u0002\u004f\u0054\u0005\u0012\u000a\u0002\u0050\u0054\u0005\u0018\u000d\u0002\u0051\u0054\u0005\u001a\u000e\u0002\u0052\u0054\u0005\u001e\u0010\u0002\u0053\u004f\u0003\u0002\u0002\u0002\u0053\u0050\u0003\u0002\u0002\u0002\u0053\u0051\u0003\u0002\u0002\u0002\u0053\u0052\u0003\u0002\u0002\u0002\u0054\u0011\u0003\u0002\u0002\u0002\u0055\u0058\u0005\u000e\u0008\u0002\u0056\u0058\u0005\u0014\u000b\u0002\u0057\u0055\u0003\u0002\u0002\u0002\u0057\u0056\u0003\u0002\u0002\u0002\u0058\u0013\u0003\u0002\u0002\u0002\u0059\u005a\u0007\u0003\u0002\u0002\u005a\u005b\u0005\u0016\u000c\u0002\u005b\u005c\u0005\u0002\u0002\u0002\u005c\u005d\u0007\u0004\u0002\u0002\u005d\u006b\u0003\u0002\u0002\u0002\u005e\u005f\u0007\u0003\u0002\u0002\u005f\u0060\u0005\u000a\u0006\u0002\u0060\u0061\u0007\u0003\u0002\u0002\u0061\u0062\u0007\u0014\u0002\u0002\u0062\u0063\u0007\u0003\u0002\u0002\u0063\u0064\u0005\u0008\u0005\u0002\u0064\u0065\u0005\u000a\u0006\u0002\u0065\u0066\u0007\u0004\u0002\u0002\u0066\u0067\u0003\u0002\u0002\u0002\u0067\u0068\u0007\u0004\u0002\u0002\u0068\u0069\u0007\u0004\u0002\u0002\u0069\u006b\u0003\u0002\u0002\u0002\u006a\u0059\u0003\u0002\u0002\u0002\u006a\u005e\u0003\u0002\u0002\u0002\u006b\u0015\u0003\u0002\u0002\u0002\u006c\u006d\u0005\u000a\u0006\u0002\u006d\u0017\u0003\u0002\u0002\u0002\u006e\u006f\u0007\u0003\u0002\u0002\u006f\u0073\u0009\u0004\u0002\u0002\u0070\u0072\u0005\u0010\u0009\u0002\u0071\u0070\u0003\u0002\u0002\u0002\u0072\u0075\u0003\u0002\u0002\u0002\u0073\u0071\u0003\u0002\u0002\u0002\u0073\u0074\u0003\u0002\u0002\u0002\u0074\u0076\u0003\u0002\u0002\u0002\u0075\u0073\u0003\u0002\u0002\u0002\u0076\u0083\u0007\u0004\u0002\u0002\u0077\u0078\u0007\u0003\u0002\u0002\u0078\u0079\u0009\u0005\u0002\u0002\u0079\u007a\u0005\u0010\u0009\u0002\u007a\u007b\u0005\u0010\u0009\u0002\u007b\u007c\u0007\u0004\u0002\u0002\u007c\u0083\u0003\u0002\u0002\u0002\u007d\u007e\u0007\u0003\u0002\u0002\u007e\u007f\u0007\u0013\u0002\u0002\u007f\u0080\u0005\u0010\u0009\u0002\u0080\u0081\u0007\u0004\u0002\u0002\u0081\u0083\u0003\u0002\u0002\u0002\u0082\u006e\u0003\u0002\u0002\u0002\u0082\u0077\u0003\u0002\u0002\u0002\u0082\u007d\u0003\u0002\u0002\u0002\u0083\u0019\u0003\u0002\u0002\u0002\u0084\u0085\u0007\u0003\u0002\u0002\u0085\u0087\u0009\u0006\u0002\u0002\u0086\u0088\u0005\u0006\u0004\u0002\u0087\u0086\u0003\u0002\u0002\u0002\u0087\u0088\u0003\u0002\u0002\u0002\u0088\u0089\u0003\u0002\u0002\u0002\u0089\u008a\u0005\u001c\u000f\u0002\u008a\u008b\u0005\u0010\u0009\u0002\u008b\u008c\u0007\u0004\u0002\u0002\u008c\u001b\u0003\u0002\u0002\u0002\u008d\u009a\u0007\u0003\u0002\u0002\u008e\u0099\u0005\u0006\u0004\u0002\u008f\u0099\u0007\u0009\u0002\u0002\u0090\u0093\u0007\u0003\u0002\u0002\u0091\u0094\u0005\u0006\u0004\u0002\u0092\u0094\u0007\u0009\u0002\u0002\u0093\u0091\u0003\u0002\u0002\u0002\u0093\u0092\u0003\u0002\u0002\u0002\u0094\u0095\u0003\u0002\u0002\u0002\u0095\u0096\u0005\u000a\u0006\u0002\u0096\u0097\u0007\u0004\u0002\u0002\u0097\u0099\u0003\u0002\u0002\u0002\u0098\u008e\u0003\u0002\u0002\u0002\u0098\u008f\u0003\u0002\u0002\u0002\u0098\u0090\u0003\u0002\u0002\u0002\u0099\u009c\u0003\u0002\u0002\u0002\u009a\u0098\u0003\u0002\u0002\u0002\u009a\u009b\u0003\u0002\u0002\u0002\u009b\u009d\u0003\u0002\u0002\u0002\u009c\u009a\u0003\u0002\u0002\u0002\u009d\u009e\u0007\u0004\u0002\u0002\u009e\u001d\u0003\u0002\u0002\u0002\u009f\u00a0\u0007\u0003\u0002\u0002\u00a0\u00a1\u0007\u0019\u0002\u0002\u00a1\u00a2\u0007\u000b\u0002\u0002\u00a2\u00a3\u0005\u0010\u0009\u0002\u00a3\u00a4\u0007\u0004\u0002\u0002\u00a4\u001f\u0003\u0002\u0002\u0002\u00a5\u00a6\u0007\u0003\u0002\u0002\u00a6\u00a7\u0007\u0018\u0002\u0002\u00a7\u00b1\u0005\u0006\u0004\u0002\u00a8\u00a9\u0007\u0003\u0002\u0002\u00a9\u00ad\u0007\u0017\u0002\u0002\u00aa\u00ac\u0005\u0008\u0005\u0002\u00ab\u00aa\u0003\u0002\u0002\u0002\u00ac\u00af\u0003\u0002\u0002\u0002\u00ad\u00ab\u0003\u0002\u0002\u0002\u00ad\u00ae\u0003\u0002\u0002\u0002\u00ae\u00b0\u0003\u0002\u0002\u0002\u00af\u00ad\u0003\u0002\u0002\u0002\u00b0\u00b2\u0007\u0004\u0002\u0002\u00b1\u00a8\u0003\u0002\u0002\u0002\u00b1\u00b2\u0003\u0002\u0002\u0002\u00b2\u00b4\u0003\u0002\u0002\u0002\u00b3\u00b5\u0005\u0026\u0014\u0002\u00b4\u00b3\u0003\u0002\u0002\u0002\u00b4\u00b5\u0003\u0002\u0002\u0002\u00b5\u00b6\u0003\u0002\u0002\u0002\u00b6\u00b7\u0007\u0004\u0002\u0002\u00b7\u0021\u0003\u0002\u0002\u0002\u00b8\u00c7\u0005\u0010\u0009\u0002\u00b9\u00c7\u0005\u0020\u0011\u0002\u00ba\u00bb\u0007\u0003\u0002\u0002\u00bb\u00bc\u0007\u0016\u0002\u0002\u00bc\u00bd\u0005\u0006\u0004\u0002\u00bd\u00be\u0007\u0004\u0002\u0002\u00be\u00c7\u0003\u0002\u0002\u0002\u00bf\u00c0\u0007\u0003\u0002\u0002\u00c0\u00c1\u0007\u0019\u0002\u0002\u00c1\u00c3\u0007\u000b\u0002\u0002\u00c2\u00c4\u0005\u0026\u0014\u0002\u00c3\u00c2\u0003\u0002\u0002\u0002\u00c3\u00c4\u0003\u0002\u0002\u0002\u00c4\u00c5\u0003\u0002\u0002\u0002\u00c5\u00c7\u0007\u0004\u0002\u0002\u00c6\u00b8\u0003\u0002\u0002\u0002\u00c6\u00b9\u0003\u0002\u0002\u0002\u00c6\u00ba\u0003\u0002\u0002\u0002\u00c6\u00bf\u0003\u0002\u0002\u0002\u00c7\u0023\u0003\u0002\u0002\u0002\u00c8\u00ca\u0005\u0022\u0012\u0002\u00c9\u00c8\u0003\u0002\u0002\u0002\u00ca\u00cb\u0003\u0002\u0002\u0002\u00cb\u00c9\u0003\u0002\u0002\u0002\u00cb\u00cc\u0003\u0002\u0002\u0002\u00cc\u0025\u0003\u0002\u0002\u0002\u00cd\u00d1\u0005\u0020\u0011\u0002\u00ce\u00d1\u0005\u0028\u0015\u0002\u00cf\u00d1\u0005\u0024\u0013\u0002\u00d0\u00cd\u0003\u0002\u0002\u0002\u00d0\u00ce\u0003\u0002\u0002\u0002\u00d0\u00cf\u0003\u0002\u0002\u0002\u00d1\u0027\u0003\u0002\u0002\u0002\u00d2\u00d3\u0007\u0003\u0002\u0002\u00d3\u00d4\u0007\u0015\u0002\u0002\u00d4\u00d6\u0005\u0006\u0004\u0002\u00d5\u00d7\u0005\u0024\u0013\u0002\u00d6\u00d5\u0003\u0002\u0002\u0002\u00d6\u00d7\u0003\u0002\u0002\u0002\u00d7\u00d8\u0003\u0002\u0002\u0002\u00d8\u00d9\u0007\u0004\u0002\u0002\u00d9\u0029\u0003\u0002\u0002\u0002\u0017\u002c\u002e\u0037\u0045\u0053\u0057\u006a\u0073\u0082\u0087\u0093\u0098\u009a\u00ad\u00b1\u00b4\u00c3\u00c6\u00cb\u00d0\u00d6"

        val ATN = ATNDeserializer().deserialize(serializedATN.toCharArray())
        init {
        	decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
        		DFA(ATN.getDecisionState(it)!!, it)
        	})


        }
	}

    private val OPEN = Tokens.OPEN.id
    private val CLOSE = Tokens.CLOSE.id
    private val STRINGQUOTE = Tokens.STRINGQUOTE.id
    private val NAMEQUOTE = Tokens.NAMEQUOTE.id
    private val BACKSLASH = Tokens.BACKSLASH.id
    private val NUMERAL = Tokens.NUMERAL.id
    private val SEQMARK = Tokens.SEQMARK.id
    private val QUOTEDSTRING = Tokens.QUOTEDSTRING.id
    private val ENCLOSEDNAME = Tokens.ENCLOSEDNAME.id
    private val EQUAL = Tokens.EQUAL.id
    private val AND = Tokens.AND.id
    private val OR = Tokens.OR.id
    private val IFF = Tokens.IFF.id
    private val IF = Tokens.IF.id
    private val FORALL = Tokens.FORALL.id
    private val EXISTS = Tokens.EXISTS.id
    private val NOT = Tokens.NOT.id
    private val CL_ROLESET = Tokens.CL_ROLESET.id
    private val CL_TEXT = Tokens.CL_TEXT.id
    private val CL_IMPORTS = Tokens.CL_IMPORTS.id
    private val CL_EXCLUDES = Tokens.CL_EXCLUDES.id
    private val CL_MODULE = Tokens.CL_MODULE.id
    private val CL_COMMENT = Tokens.CL_COMMENT.id
    private val CL_PREFIX = Tokens.CL_PREFIX.id
    private val NAMECHARSEQUENCE = Tokens.NAMECHARSEQUENCE.id
    private val WHITE = Tokens.WHITE.id
    private val BLOCKCOMMENT = Tokens.BLOCKCOMMENT.id
    private val LineComment = Tokens.LineComment.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class TermseqContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_termseq.id
	        set(value) { throw RuntimeException() }
		fun findTerm() : List<TermContext> = getRuleContexts(solver.getType("TermContext"))
		fun findTerm(i: Int) : TermContext? = getRuleContext(solver.getType("TermContext"),i)
		fun SEQMARK() : List<TerminalNode> = getTokens(CLIFParser.Tokens.SEQMARK.id)
		fun SEQMARK(i: Int) : TerminalNode = getToken(CLIFParser.Tokens.SEQMARK.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).enterTermseq(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).exitTermseq(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CLIFVisitor ) return (visitor as CLIFVisitor<out T>).visitTermseq(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  termseq() : TermseqContext {
		var _localctx : TermseqContext = TermseqContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_termseq.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 44
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl OPEN) or (1L shl NUMERAL) or (1L shl SEQMARK) or (1L shl QUOTEDSTRING) or (1L shl ENCLOSEDNAME) or (1L shl NAMECHARSEQUENCE))) != 0L)) {
				if (true){
				this.state = 42
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				OPEN , NUMERAL , QUOTEDSTRING , ENCLOSEDNAME , NAMECHARSEQUENCE  ->  /*LL1AltBlock*/{if (true){
				this.state = 40
				term()
				}}
				SEQMARK  ->  /*LL1AltBlock*/{if (true){
				this.state = 41
				match(SEQMARK) as Token
				}}
				else -> throw NoViableAltException(this)
				}
				}
				this.state = 46
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

	open class InterpretednameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_interpretedname.id
	        set(value) { throw RuntimeException() }
		fun NUMERAL() : TerminalNode? = getToken(CLIFParser.Tokens.NUMERAL.id, 0)
		fun QUOTEDSTRING() : TerminalNode? = getToken(CLIFParser.Tokens.QUOTEDSTRING.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).enterInterpretedname(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).exitInterpretedname(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CLIFVisitor ) return (visitor as CLIFVisitor<out T>).visitInterpretedname(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  interpretedname() : InterpretednameContext {
		var _localctx : InterpretednameContext = InterpretednameContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_interpretedname.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 47
			_la = _input!!.LA(1)
			if ( !(_la==NUMERAL || _la==QUOTEDSTRING) ) {
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

	open class InterpretablenameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_interpretablename.id
	        set(value) { throw RuntimeException() }
		fun NAMECHARSEQUENCE() : TerminalNode? = getToken(CLIFParser.Tokens.NAMECHARSEQUENCE.id, 0)
		fun ENCLOSEDNAME() : TerminalNode? = getToken(CLIFParser.Tokens.ENCLOSEDNAME.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).enterInterpretablename(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).exitInterpretablename(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CLIFVisitor ) return (visitor as CLIFVisitor<out T>).visitInterpretablename(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  interpretablename() : InterpretablenameContext {
		var _localctx : InterpretablenameContext = InterpretablenameContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_interpretablename.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 49
			_la = _input!!.LA(1)
			if ( !(_la==ENCLOSEDNAME || _la==NAMECHARSEQUENCE) ) {
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

	open class NameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_name.id
	        set(value) { throw RuntimeException() }
		fun findInterpretedname() : InterpretednameContext? = getRuleContext(solver.getType("InterpretednameContext"),0)
		fun findInterpretablename() : InterpretablenameContext? = getRuleContext(solver.getType("InterpretablenameContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).enterName(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).exitName(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CLIFVisitor ) return (visitor as CLIFVisitor<out T>).visitName(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  name() : NameContext {
		var _localctx : NameContext = NameContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_name.id)
		try {
			this.state = 53
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			NUMERAL , QUOTEDSTRING  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 51
			interpretedname()
			}}
			ENCLOSEDNAME , NAMECHARSEQUENCE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 52
			interpretablename()
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

	open class TermContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_term.id
	        set(value) { throw RuntimeException() }
		fun findName() : NameContext? = getRuleContext(solver.getType("NameContext"),0)
		fun OPEN() : TerminalNode? = getToken(CLIFParser.Tokens.OPEN.id, 0)
		fun findOperator() : OperatorContext? = getRuleContext(solver.getType("OperatorContext"),0)
		fun findTermseq() : TermseqContext? = getRuleContext(solver.getType("TermseqContext"),0)
		fun CLOSE() : TerminalNode? = getToken(CLIFParser.Tokens.CLOSE.id, 0)
		fun QUOTEDSTRING() : TerminalNode? = getToken(CLIFParser.Tokens.QUOTEDSTRING.id, 0)
		fun findTerm() : TermContext? = getRuleContext(solver.getType("TermContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).enterTerm(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).exitTerm(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CLIFVisitor ) return (visitor as CLIFVisitor<out T>).visitTerm(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  term() : TermContext {
		var _localctx : TermContext = TermContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_term.id)
		try {
			this.state = 67
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,3,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 55
			name()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 56
			match(OPEN) as Token
			this.state = 57
			operator()
			this.state = 58
			termseq()
			this.state = 59
			match(CLOSE) as Token
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 61
			match(OPEN) as Token
			this.state = 62
			match(CL_COMMENT) as Token
			this.state = 63
			match(QUOTEDSTRING) as Token
			this.state = 64
			term()
			this.state = 65
			match(CLOSE) as Token
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

	open class OperatorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_operator.id
	        set(value) { throw RuntimeException() }
		fun findTerm() : TermContext? = getRuleContext(solver.getType("TermContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).enterOperator(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).exitOperator(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CLIFVisitor ) return (visitor as CLIFVisitor<out T>).visitOperator(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  operator() : OperatorContext {
		var _localctx : OperatorContext = OperatorContext(context, state)
		enterRule(_localctx, 10, Rules.RULE_operator.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 69
			term()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class EquationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_equation.id
	        set(value) { throw RuntimeException() }
		fun OPEN() : TerminalNode? = getToken(CLIFParser.Tokens.OPEN.id, 0)
		fun findTerm() : List<TermContext> = getRuleContexts(solver.getType("TermContext"))
		fun findTerm(i: Int) : TermContext? = getRuleContext(solver.getType("TermContext"),i)
		fun CLOSE() : TerminalNode? = getToken(CLIFParser.Tokens.CLOSE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).enterEquation(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).exitEquation(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CLIFVisitor ) return (visitor as CLIFVisitor<out T>).visitEquation(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  equation() : EquationContext {
		var _localctx : EquationContext = EquationContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_equation.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 71
			match(OPEN) as Token
			this.state = 72
			match(EQUAL) as Token
			this.state = 73
			term()
			this.state = 74
			term()
			this.state = 75
			match(CLOSE) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class SentenceContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_sentence.id
	        set(value) { throw RuntimeException() }
		fun findAtomsent() : AtomsentContext? = getRuleContext(solver.getType("AtomsentContext"),0)
		fun findBoolsent() : BoolsentContext? = getRuleContext(solver.getType("BoolsentContext"),0)
		fun findQuantsent() : QuantsentContext? = getRuleContext(solver.getType("QuantsentContext"),0)
		fun findCommentsent() : CommentsentContext? = getRuleContext(solver.getType("CommentsentContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).enterSentence(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).exitSentence(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CLIFVisitor ) return (visitor as CLIFVisitor<out T>).visitSentence(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  sentence() : SentenceContext {
		var _localctx : SentenceContext = SentenceContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_sentence.id)
		try {
			this.state = 81
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,4,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 77
			atomsent()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 78
			boolsent()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 79
			quantsent()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 80
			commentsent()
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

	open class AtomsentContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_atomsent.id
	        set(value) { throw RuntimeException() }
		fun findEquation() : EquationContext? = getRuleContext(solver.getType("EquationContext"),0)
		fun findAtom() : AtomContext? = getRuleContext(solver.getType("AtomContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).enterAtomsent(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).exitAtomsent(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CLIFVisitor ) return (visitor as CLIFVisitor<out T>).visitAtomsent(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  atomsent() : AtomsentContext {
		var _localctx : AtomsentContext = AtomsentContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_atomsent.id)
		try {
			this.state = 85
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,5,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 83
			equation()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 84
			atom()
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

	open class AtomContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_atom.id
	        set(value) { throw RuntimeException() }
		fun OPEN() : List<TerminalNode> = getTokens(CLIFParser.Tokens.OPEN.id)
		fun OPEN(i: Int) : TerminalNode = getToken(CLIFParser.Tokens.OPEN.id, i) as TerminalNode
		fun findPredicate() : PredicateContext? = getRuleContext(solver.getType("PredicateContext"),0)
		fun findTermseq() : TermseqContext? = getRuleContext(solver.getType("TermseqContext"),0)
		fun CLOSE() : List<TerminalNode> = getTokens(CLIFParser.Tokens.CLOSE.id)
		fun CLOSE(i: Int) : TerminalNode = getToken(CLIFParser.Tokens.CLOSE.id, i) as TerminalNode
		fun findTerm() : List<TermContext> = getRuleContexts(solver.getType("TermContext"))
		fun findTerm(i: Int) : TermContext? = getRuleContext(solver.getType("TermContext"),i)
		fun findName() : NameContext? = getRuleContext(solver.getType("NameContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).enterAtom(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).exitAtom(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CLIFVisitor ) return (visitor as CLIFVisitor<out T>).visitAtom(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  atom() : AtomContext {
		var _localctx : AtomContext = AtomContext(context, state)
		enterRule(_localctx, 18, Rules.RULE_atom.id)
		try {
			this.state = 104
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,6,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 87
			match(OPEN) as Token
			this.state = 88
			predicate()
			this.state = 89
			termseq()
			this.state = 90
			match(CLOSE) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 92
			match(OPEN) as Token
			this.state = 93
			term()
			this.state = 94
			match(OPEN) as Token
			this.state = 95
			match(CL_ROLESET) as Token
			if (true){
			this.state = 96
			match(OPEN) as Token
			this.state = 97
			name()
			this.state = 98
			term()
			this.state = 99
			match(CLOSE) as Token
			}
			this.state = 101
			match(CLOSE) as Token
			this.state = 102
			match(CLOSE) as Token
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

	open class PredicateContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_predicate.id
	        set(value) { throw RuntimeException() }
		fun findTerm() : TermContext? = getRuleContext(solver.getType("TermContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).enterPredicate(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).exitPredicate(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CLIFVisitor ) return (visitor as CLIFVisitor<out T>).visitPredicate(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  predicate() : PredicateContext {
		var _localctx : PredicateContext = PredicateContext(context, state)
		enterRule(_localctx, 20, Rules.RULE_predicate.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 106
			term()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class BoolsentContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_boolsent.id
	        set(value) { throw RuntimeException() }
		fun OPEN() : TerminalNode? = getToken(CLIFParser.Tokens.OPEN.id, 0)
		fun CLOSE() : TerminalNode? = getToken(CLIFParser.Tokens.CLOSE.id, 0)
		fun findSentence() : List<SentenceContext> = getRuleContexts(solver.getType("SentenceContext"))
		fun findSentence(i: Int) : SentenceContext? = getRuleContext(solver.getType("SentenceContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).enterBoolsent(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).exitBoolsent(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CLIFVisitor ) return (visitor as CLIFVisitor<out T>).visitBoolsent(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  boolsent() : BoolsentContext {
		var _localctx : BoolsentContext = BoolsentContext(context, state)
		enterRule(_localctx, 22, Rules.RULE_boolsent.id)
		var _la: Int
		try {
			this.state = 128
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,8,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 108
			match(OPEN) as Token
			this.state = 109
			_la = _input!!.LA(1)
			if ( !(_la==AND || _la==OR) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 113
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==OPEN) {
				if (true){
				if (true){
				this.state = 110
				sentence()
				}
				}
				this.state = 115
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 116
			match(CLOSE) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 117
			match(OPEN) as Token
			this.state = 118
			_la = _input!!.LA(1)
			if ( !(_la==IFF || _la==IF) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 119
			sentence()
			this.state = 120
			sentence()
			this.state = 121
			match(CLOSE) as Token
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 123
			match(OPEN) as Token
			this.state = 124
			match(NOT) as Token
			this.state = 125
			sentence()
			this.state = 126
			match(CLOSE) as Token
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

	open class QuantsentContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_quantsent.id
	        set(value) { throw RuntimeException() }
		fun OPEN() : TerminalNode? = getToken(CLIFParser.Tokens.OPEN.id, 0)
		fun findBoundlist() : BoundlistContext? = getRuleContext(solver.getType("BoundlistContext"),0)
		fun findSentence() : SentenceContext? = getRuleContext(solver.getType("SentenceContext"),0)
		fun CLOSE() : TerminalNode? = getToken(CLIFParser.Tokens.CLOSE.id, 0)
		fun findInterpretablename() : InterpretablenameContext? = getRuleContext(solver.getType("InterpretablenameContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).enterQuantsent(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).exitQuantsent(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CLIFVisitor ) return (visitor as CLIFVisitor<out T>).visitQuantsent(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  quantsent() : QuantsentContext {
		var _localctx : QuantsentContext = QuantsentContext(context, state)
		enterRule(_localctx, 24, Rules.RULE_quantsent.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 130
			match(OPEN) as Token
			this.state = 131
			_la = _input!!.LA(1)
			if ( !(_la==FORALL || _la==EXISTS) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 133
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ENCLOSEDNAME || _la==NAMECHARSEQUENCE) {
				if (true){
				this.state = 132
				interpretablename()
				}
			}

			this.state = 135
			boundlist()
			this.state = 136
			sentence()
			this.state = 137
			match(CLOSE) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class BoundlistContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_boundlist.id
	        set(value) { throw RuntimeException() }
		fun OPEN() : List<TerminalNode> = getTokens(CLIFParser.Tokens.OPEN.id)
		fun OPEN(i: Int) : TerminalNode = getToken(CLIFParser.Tokens.OPEN.id, i) as TerminalNode
		fun CLOSE() : List<TerminalNode> = getTokens(CLIFParser.Tokens.CLOSE.id)
		fun CLOSE(i: Int) : TerminalNode = getToken(CLIFParser.Tokens.CLOSE.id, i) as TerminalNode
		fun findInterpretablename() : List<InterpretablenameContext> = getRuleContexts(solver.getType("InterpretablenameContext"))
		fun findInterpretablename(i: Int) : InterpretablenameContext? = getRuleContext(solver.getType("InterpretablenameContext"),i)
		fun SEQMARK() : List<TerminalNode> = getTokens(CLIFParser.Tokens.SEQMARK.id)
		fun SEQMARK(i: Int) : TerminalNode = getToken(CLIFParser.Tokens.SEQMARK.id, i) as TerminalNode
		fun findTerm() : List<TermContext> = getRuleContexts(solver.getType("TermContext"))
		fun findTerm(i: Int) : TermContext? = getRuleContext(solver.getType("TermContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).enterBoundlist(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).exitBoundlist(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CLIFVisitor ) return (visitor as CLIFVisitor<out T>).visitBoundlist(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  boundlist() : BoundlistContext {
		var _localctx : BoundlistContext = BoundlistContext(context, state)
		enterRule(_localctx, 26, Rules.RULE_boundlist.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 139
			match(OPEN) as Token
			this.state = 152
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl OPEN) or (1L shl SEQMARK) or (1L shl ENCLOSEDNAME) or (1L shl NAMECHARSEQUENCE))) != 0L)) {
				if (true){
				this.state = 150
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				ENCLOSEDNAME , NAMECHARSEQUENCE  ->  /*LL1AltBlock*/{if (true){
				this.state = 140
				interpretablename()
				}}
				SEQMARK  ->  /*LL1AltBlock*/{if (true){
				this.state = 141
				match(SEQMARK) as Token
				}}
				OPEN  ->  /*LL1AltBlock*/{if (true){
				this.state = 142
				match(OPEN) as Token
				this.state = 145
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				ENCLOSEDNAME , NAMECHARSEQUENCE  ->  /*LL1AltBlock*/{if (true){
				this.state = 143
				interpretablename()
				}}
				SEQMARK  ->  /*LL1AltBlock*/{if (true){
				this.state = 144
				match(SEQMARK) as Token
				}}
				else -> throw NoViableAltException(this)
				}
				this.state = 147
				term()
				this.state = 148
				match(CLOSE) as Token
				}}
				else -> throw NoViableAltException(this)
				}
				}
				this.state = 154
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 155
			match(CLOSE) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class CommentsentContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_commentsent.id
	        set(value) { throw RuntimeException() }
		fun OPEN() : TerminalNode? = getToken(CLIFParser.Tokens.OPEN.id, 0)
		fun ENCLOSEDNAME() : TerminalNode? = getToken(CLIFParser.Tokens.ENCLOSEDNAME.id, 0)
		fun findSentence() : SentenceContext? = getRuleContext(solver.getType("SentenceContext"),0)
		fun CLOSE() : TerminalNode? = getToken(CLIFParser.Tokens.CLOSE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).enterCommentsent(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).exitCommentsent(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CLIFVisitor ) return (visitor as CLIFVisitor<out T>).visitCommentsent(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  commentsent() : CommentsentContext {
		var _localctx : CommentsentContext = CommentsentContext(context, state)
		enterRule(_localctx, 28, Rules.RULE_commentsent.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 157
			match(OPEN) as Token
			this.state = 158
			match(CL_COMMENT) as Token
			this.state = 159
			match(ENCLOSEDNAME) as Token
			this.state = 160
			sentence()
			this.state = 161
			match(CLOSE) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ModuleContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_module.id
	        set(value) { throw RuntimeException() }
		fun OPEN() : List<TerminalNode> = getTokens(CLIFParser.Tokens.OPEN.id)
		fun OPEN(i: Int) : TerminalNode = getToken(CLIFParser.Tokens.OPEN.id, i) as TerminalNode
		fun findInterpretablename() : InterpretablenameContext? = getRuleContext(solver.getType("InterpretablenameContext"),0)
		fun CLOSE() : List<TerminalNode> = getTokens(CLIFParser.Tokens.CLOSE.id)
		fun CLOSE(i: Int) : TerminalNode = getToken(CLIFParser.Tokens.CLOSE.id, i) as TerminalNode
		fun findCltext() : CltextContext? = getRuleContext(solver.getType("CltextContext"),0)
		fun findName() : List<NameContext> = getRuleContexts(solver.getType("NameContext"))
		fun findName(i: Int) : NameContext? = getRuleContext(solver.getType("NameContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).enterModule(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).exitModule(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CLIFVisitor ) return (visitor as CLIFVisitor<out T>).visitModule(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  module() : ModuleContext {
		var _localctx : ModuleContext = ModuleContext(context, state)
		enterRule(_localctx, 30, Rules.RULE_module.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 163
			match(OPEN) as Token
			this.state = 164
			match(CL_MODULE) as Token
			this.state = 165
			interpretablename()
			this.state = 175
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,14,context) ) {
			1   -> if (true){
			this.state = 166
			match(OPEN) as Token
			this.state = 167
			match(CL_EXCLUDES) as Token
			this.state = 171
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl NUMERAL) or (1L shl QUOTEDSTRING) or (1L shl ENCLOSEDNAME) or (1L shl NAMECHARSEQUENCE))) != 0L)) {
				if (true){
				if (true){
				this.state = 168
				name()
				}
				}
				this.state = 173
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 174
			match(CLOSE) as Token
			}
			}
			this.state = 178
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==OPEN) {
				if (true){
				this.state = 177
				cltext()
				}
			}

			this.state = 180
			match(CLOSE) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class PhraseContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_phrase.id
	        set(value) { throw RuntimeException() }
		fun findSentence() : SentenceContext? = getRuleContext(solver.getType("SentenceContext"),0)
		fun findModule() : ModuleContext? = getRuleContext(solver.getType("ModuleContext"),0)
		fun OPEN() : TerminalNode? = getToken(CLIFParser.Tokens.OPEN.id, 0)
		fun findInterpretablename() : InterpretablenameContext? = getRuleContext(solver.getType("InterpretablenameContext"),0)
		fun CLOSE() : TerminalNode? = getToken(CLIFParser.Tokens.CLOSE.id, 0)
		fun ENCLOSEDNAME() : TerminalNode? = getToken(CLIFParser.Tokens.ENCLOSEDNAME.id, 0)
		fun findCltext() : CltextContext? = getRuleContext(solver.getType("CltextContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).enterPhrase(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).exitPhrase(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CLIFVisitor ) return (visitor as CLIFVisitor<out T>).visitPhrase(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  phrase() : PhraseContext {
		var _localctx : PhraseContext = PhraseContext(context, state)
		enterRule(_localctx, 32, Rules.RULE_phrase.id)
		var _la: Int
		try {
			this.state = 196
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,17,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 182
			sentence()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 183
			module()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 184
			match(OPEN) as Token
			this.state = 185
			match(CL_IMPORTS) as Token
			this.state = 186
			interpretablename()
			this.state = 187
			match(CLOSE) as Token
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 189
			match(OPEN) as Token
			this.state = 190
			match(CL_COMMENT) as Token
			this.state = 191
			match(ENCLOSEDNAME) as Token
			this.state = 193
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==OPEN) {
				if (true){
				this.state = 192
				cltext()
				}
			}

			this.state = 195
			match(CLOSE) as Token
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
		fun findPhrase() : List<PhraseContext> = getRuleContexts(solver.getType("PhraseContext"))
		fun findPhrase(i: Int) : PhraseContext? = getRuleContext(solver.getType("PhraseContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).enterText(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).exitText(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CLIFVisitor ) return (visitor as CLIFVisitor<out T>).visitText(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  text() : TextContext {
		var _localctx : TextContext = TextContext(context, state)
		enterRule(_localctx, 34, Rules.RULE_text.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 199 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 198
				phrase()
				}
				}
				this.state = 201 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==OPEN )
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class CltextContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_cltext.id
	        set(value) { throw RuntimeException() }
		fun findModule() : ModuleContext? = getRuleContext(solver.getType("ModuleContext"),0)
		fun findNamedtext() : NamedtextContext? = getRuleContext(solver.getType("NamedtextContext"),0)
		fun findText() : TextContext? = getRuleContext(solver.getType("TextContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).enterCltext(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).exitCltext(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CLIFVisitor ) return (visitor as CLIFVisitor<out T>).visitCltext(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  cltext() : CltextContext {
		var _localctx : CltextContext = CltextContext(context, state)
		enterRule(_localctx, 36, Rules.RULE_cltext.id)
		try {
			this.state = 206
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,19,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 203
			module()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 204
			namedtext()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 205
			text()
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

	open class NamedtextContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_namedtext.id
	        set(value) { throw RuntimeException() }
		fun OPEN() : TerminalNode? = getToken(CLIFParser.Tokens.OPEN.id, 0)
		fun findInterpretablename() : InterpretablenameContext? = getRuleContext(solver.getType("InterpretablenameContext"),0)
		fun CLOSE() : TerminalNode? = getToken(CLIFParser.Tokens.CLOSE.id, 0)
		fun findText() : TextContext? = getRuleContext(solver.getType("TextContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).enterNamedtext(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CLIFListener ) (listener as CLIFListener).exitNamedtext(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CLIFVisitor ) return (visitor as CLIFVisitor<out T>).visitNamedtext(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  namedtext() : NamedtextContext {
		var _localctx : NamedtextContext = NamedtextContext(context, state)
		enterRule(_localctx, 38, Rules.RULE_namedtext.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 208
			match(OPEN) as Token
			this.state = 209
			match(CL_TEXT) as Token
			this.state = 210
			interpretablename()
			this.state = 212
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==OPEN) {
				if (true){
				this.state = 211
				text()
				}
			}

			this.state = 214
			match(CLOSE) as Token
			}
		}
		catch (re: RecognitionException) {
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