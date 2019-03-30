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

class emailaddressParser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(emailaddressParser.EmailaddressContext::class,
                                                              emailaddressParser.GroupContext::class,
                                                              emailaddressParser.MailboxContext::class,
                                                              emailaddressParser.RouteaddrContext::class,
                                                              emailaddressParser.RouteContext::class,
                                                              emailaddressParser.AddrspecContext::class,
                                                              emailaddressParser.LocalpartContext::class,
                                                              emailaddressParser.DomainContext::class,
                                                              emailaddressParser.SubdomainContext::class,
                                                              emailaddressParser.DomainrefContext::class,
                                                              emailaddressParser.PhraseContext::class,
                                                              emailaddressParser.WordContext::class,
                                                              emailaddressParser.LwspcharContext::class,
                                                              emailaddressParser.LwspContext::class,
                                                              emailaddressParser.DelimetersContext::class,
                                                              emailaddressParser.AtomContext::class,
                                                              emailaddressParser.QuotedpairContext::class,
                                                              emailaddressParser.DomainliteralContext::class,
                                                              emailaddressParser.QuotedstringContext::class,
                                                              emailaddressParser.CommentContext::class)
    }

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "emailaddress.g4"

    override val tokenNames: Array<String?>?
        get() = emailaddressParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = emailaddressParser.Companion.ruleNames
    override val atn: ATN
        get() = emailaddressParser.Companion.ATN

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
        CHAR(13),
        ALPHA(14),
        DIGIT(15),
        CTL(16),
        CR(17),
        LF(18),
        SPACE(19),
        HTAB(20),
        CRLF(21),
        SPECIALS(22),
        QUOTE(23),
        QTEXT(24),
        DTEXT(25),
        CTEXT(26)
    }

    enum class Rules(val id: Int) {
        RULE_emailaddress(0),
        RULE_group(1),
        RULE_mailbox(2),
        RULE_routeaddr(3),
        RULE_route(4),
        RULE_addrspec(5),
        RULE_localpart(6),
        RULE_domain(7),
        RULE_subdomain(8),
        RULE_domainref(9),
        RULE_phrase(10),
        RULE_word(11),
        RULE_lwspchar(12),
        RULE_lwsp(13),
        RULE_delimeters(14),
        RULE_atom(15),
        RULE_quotedpair(16),
        RULE_domainliteral(17),
        RULE_quotedstring(18),
        RULE_comment(19)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("emailaddress", "group", "mailbox", "routeaddr", 
                                "route", "addrspec", "localpart", "domain", 
                                "subdomain", "domainref", "phrase", "word", 
                                "lwspchar", "lwsp", "delimeters", "atom", 
                                "quotedpair", "domainliteral", "quotedstring", 
                                "comment")

        private val LITERAL_NAMES = Arrays.asList<String?>(null, "':'", 
                                                           "';'", "'<'", 
                                                           "'>'", "'@'", 
                                                           "'.'", "'\\'", 
                                                           "'['", "']'", 
                                                           "'''", "'('", 
                                                           "')'", null, 
                                                           null, null, null, 
                                                           "'\n'", "'\r'", 
                                                           "' '", "'\t'", 
                                                           "'\r\n'", null, 
                                                           "'\"'")
        private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, "CHAR", 
                                                            "ALPHA", "DIGIT", 
                                                            "CTL", "CR", 
                                                            "LF", "SPACE", 
                                                            "HTAB", "CRLF", 
                                                            "SPECIALS", 
                                                            "QUOTE", "QTEXT", 
                                                            "DTEXT", "CTEXT")

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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u001c\u00a6\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0003\u0002\u0003\u0002\u0005\u0002\u002d\u000a\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0007\u0003\u0032\u000a\u0003\u000c\u0003\u000e\u0003\u0035\u000b\u0003\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0005\u0004\u003d\u000a\u0004\u0003\u0005\u0003\u0005\u0007\u0005\u0041\u000a\u0005\u000c\u0005\u000e\u0005\u0044\u000b\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0008\u0007\u0008\u0054\u000a\u0008\u000c\u0008\u000e\u0008\u0057\u000b\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0007\u0009\u005c\u000a\u0009\u000c\u0009\u000e\u0009\u005f\u000b\u0009\u0003\u000a\u0003\u000a\u0005\u000a\u0063\u000a\u000a\u0003\u000b\u0003\u000b\u0003\u000c\u0006\u000c\u0068\u000a\u000c\u000d\u000c\u000e\u000c\u0069\u0003\u000d\u0003\u000d\u0005\u000d\u006e\u000a\u000d\u0003\u000e\u0003\u000e\u0003\u000f\u0005\u000f\u0073\u000a\u000f\u0003\u000f\u0006\u000f\u0076\u000a\u000f\u000d\u000f\u000e\u000f\u0077\u0003\u0010\u0003\u0010\u0003\u0010\u0005\u0010\u007d\u000a\u0010\u0003\u0011\u0006\u0011\u0080\u000a\u0011\u000d\u0011\u000e\u0011\u0081\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0013\u0003\u0013\u0003\u0013\u0007\u0013\u008a\u000a\u0013\u000c\u0013\u000e\u0013\u008d\u000b\u0013\u0003\u0013\u0003\u0013\u0003\u0014\u0003\u0014\u0003\u0014\u0007\u0014\u0094\u000a\u0014\u000c\u0014\u000e\u0014\u0097\u000b\u0014\u0003\u0014\u0003\u0014\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0007\u0015\u009f\u000a\u0015\u000c\u0015\u000e\u0015\u00a2\u000b\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0002\u0002\u0016\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0020\u0022\u0024\u0026\u0028\u0002\u0003\u0003\u0002\u0015\u0016\u0002\u00a6\u0002\u002c\u0003\u0002\u0002\u0002\u0004\u002e\u0003\u0002\u0002\u0002\u0006\u003c\u0003\u0002\u0002\u0002\u0008\u003e\u0003\u0002\u0002\u0002\u000a\u0048\u0003\u0002\u0002\u0002\u000c\u004c\u0003\u0002\u0002\u0002\u000e\u0050\u0003\u0002\u0002\u0002\u0010\u0058\u0003\u0002\u0002\u0002\u0012\u0062\u0003\u0002\u0002\u0002\u0014\u0064\u0003\u0002\u0002\u0002\u0016\u0067\u0003\u0002\u0002\u0002\u0018\u006d\u0003\u0002\u0002\u0002\u001a\u006f\u0003\u0002\u0002\u0002\u001c\u0075\u0003\u0002\u0002\u0002\u001e\u007c\u0003\u0002\u0002\u0002\u0020\u007f\u0003\u0002\u0002\u0002\u0022\u0083\u0003\u0002\u0002\u0002\u0024\u0086\u0003\u0002\u0002\u0002\u0026\u0090\u0003\u0002\u0002\u0002\u0028\u009a\u0003\u0002\u0002\u0002\u002a\u002d\u0005\u0006\u0004\u0002\u002b\u002d\u0005\u0004\u0003\u0002\u002c\u002a\u0003\u0002\u0002\u0002\u002c\u002b\u0003\u0002\u0002\u0002\u002d\u0003\u0003\u0002\u0002\u0002\u002e\u002f\u0005\u0016\u000c\u0002\u002f\u0033\u0007\u0003\u0002\u0002\u0030\u0032\u0005\u0006\u0004\u0002\u0031\u0030\u0003\u0002\u0002\u0002\u0032\u0035\u0003\u0002\u0002\u0002\u0033\u0031\u0003\u0002\u0002\u0002\u0033\u0034\u0003\u0002\u0002\u0002\u0034\u0036\u0003\u0002\u0002\u0002\u0035\u0033\u0003\u0002\u0002\u0002\u0036\u0037\u0007\u0004\u0002\u0002\u0037\u0005\u0003\u0002\u0002\u0002\u0038\u003d\u0005\u000c\u0007\u0002\u0039\u003a\u0005\u0016\u000c\u0002\u003a\u003b\u0005\u0008\u0005\u0002\u003b\u003d\u0003\u0002\u0002\u0002\u003c\u0038\u0003\u0002\u0002\u0002\u003c\u0039\u0003\u0002\u0002\u0002\u003d\u0007\u0003\u0002\u0002\u0002\u003e\u0042\u0007\u0005\u0002\u0002\u003f\u0041\u0005\u000a\u0006\u0002\u0040\u003f\u0003\u0002\u0002\u0002\u0041\u0044\u0003\u0002\u0002\u0002\u0042\u0040\u0003\u0002\u0002\u0002\u0042\u0043\u0003\u0002\u0002\u0002\u0043\u0045\u0003\u0002\u0002\u0002\u0044\u0042\u0003\u0002\u0002\u0002\u0045\u0046\u0005\u000c\u0007\u0002\u0046\u0047\u0007\u0006\u0002\u0002\u0047\u0009\u0003\u0002\u0002\u0002\u0048\u0049\u0007\u0007\u0002\u0002\u0049\u004a\u0005\u0010\u0009\u0002\u004a\u004b\u0007\u0003\u0002\u0002\u004b\u000b\u0003\u0002\u0002\u0002\u004c\u004d\u0005\u000e\u0008\u0002\u004d\u004e\u0007\u0007\u0002\u0002\u004e\u004f\u0005\u0010\u0009\u0002\u004f\u000d\u0003\u0002\u0002\u0002\u0050\u0055\u0005\u0018\u000d\u0002\u0051\u0052\u0007\u0008\u0002\u0002\u0052\u0054\u0005\u0018\u000d\u0002\u0053\u0051\u0003\u0002\u0002\u0002\u0054\u0057\u0003\u0002\u0002\u0002\u0055\u0053\u0003\u0002\u0002\u0002\u0055\u0056\u0003\u0002\u0002\u0002\u0056\u000f\u0003\u0002\u0002\u0002\u0057\u0055\u0003\u0002\u0002\u0002\u0058\u005d\u0005\u0012\u000a\u0002\u0059\u005a\u0007\u0008\u0002\u0002\u005a\u005c\u0005\u0012\u000a\u0002\u005b\u0059\u0003\u0002\u0002\u0002\u005c\u005f\u0003\u0002\u0002\u0002\u005d\u005b\u0003\u0002\u0002\u0002\u005d\u005e\u0003\u0002\u0002\u0002\u005e\u0011\u0003\u0002\u0002\u0002\u005f\u005d\u0003\u0002\u0002\u0002\u0060\u0063\u0005\u0014\u000b\u0002\u0061\u0063\u0005\u0024\u0013\u0002\u0062\u0060\u0003\u0002\u0002\u0002\u0062\u0061\u0003\u0002\u0002\u0002\u0063\u0013\u0003\u0002\u0002\u0002\u0064\u0065\u0005\u0020\u0011\u0002\u0065\u0015\u0003\u0002\u0002\u0002\u0066\u0068\u0005\u0018\u000d\u0002\u0067\u0066\u0003\u0002\u0002\u0002\u0068\u0069\u0003\u0002\u0002\u0002\u0069\u0067\u0003\u0002\u0002\u0002\u0069\u006a\u0003\u0002\u0002\u0002\u006a\u0017\u0003\u0002\u0002\u0002\u006b\u006e\u0005\u0020\u0011\u0002\u006c\u006e\u0005\u0026\u0014\u0002\u006d\u006b\u0003\u0002\u0002\u0002\u006d\u006c\u0003\u0002\u0002\u0002\u006e\u0019\u0003\u0002\u0002\u0002\u006f\u0070\u0009\u0002\u0002\u0002\u0070\u001b\u0003\u0002\u0002\u0002\u0071\u0073\u0007\u0017\u0002\u0002\u0072\u0071\u0003\u0002\u0002\u0002\u0072\u0073\u0003\u0002\u0002\u0002\u0073\u0074\u0003\u0002\u0002\u0002\u0074\u0076\u0005\u001a\u000e\u0002\u0075\u0072\u0003\u0002\u0002\u0002\u0076\u0077\u0003\u0002\u0002\u0002\u0077\u0075\u0003\u0002\u0002\u0002\u0077\u0078\u0003\u0002\u0002\u0002\u0078\u001d\u0003\u0002\u0002\u0002\u0079\u007d\u0007\u0018\u0002\u0002\u007a\u007d\u0005\u001c\u000f\u0002\u007b\u007d\u0005\u0028\u0015\u0002\u007c\u0079\u0003\u0002\u0002\u0002\u007c\u007a\u0003\u0002\u0002\u0002\u007c\u007b\u0003\u0002\u0002\u0002\u007d\u001f\u0003\u0002\u0002\u0002\u007e\u0080\u0007\u000f\u0002\u0002\u007f\u007e\u0003\u0002\u0002\u0002\u0080\u0081\u0003\u0002\u0002\u0002\u0081\u007f\u0003\u0002\u0002\u0002\u0081\u0082\u0003\u0002\u0002\u0002\u0082\u0021\u0003\u0002\u0002\u0002\u0083\u0084\u0007\u0009\u0002\u0002\u0084\u0085\u0007\u000f\u0002\u0002\u0085\u0023\u0003\u0002\u0002\u0002\u0086\u008b\u0007\u000a\u0002\u0002\u0087\u008a\u0007\u001b\u0002\u0002\u0088\u008a\u0005\u0022\u0012\u0002\u0089\u0087\u0003\u0002\u0002\u0002\u0089\u0088\u0003\u0002\u0002\u0002\u008a\u008d\u0003\u0002\u0002\u0002\u008b\u0089\u0003\u0002\u0002\u0002\u008b\u008c\u0003\u0002\u0002\u0002\u008c\u008e\u0003\u0002\u0002\u0002\u008d\u008b\u0003\u0002\u0002\u0002\u008e\u008f\u0007\u000b\u0002\u0002\u008f\u0025\u0003\u0002\u0002\u0002\u0090\u0095\u0007\u000c\u0002\u0002\u0091\u0094\u0007\u001a\u0002\u0002\u0092\u0094\u0005\u0022\u0012\u0002\u0093\u0091\u0003\u0002\u0002\u0002\u0093\u0092\u0003\u0002\u0002\u0002\u0094\u0097\u0003\u0002\u0002\u0002\u0095\u0093\u0003\u0002\u0002\u0002\u0095\u0096\u0003\u0002\u0002\u0002\u0096\u0098\u0003\u0002\u0002\u0002\u0097\u0095\u0003\u0002\u0002\u0002\u0098\u0099\u0007\u000c\u0002\u0002\u0099\u0027\u0003\u0002\u0002\u0002\u009a\u00a0\u0007\u000d\u0002\u0002\u009b\u009f\u0007\u001c\u0002\u0002\u009c\u009f\u0005\u0022\u0012\u0002\u009d\u009f\u0005\u0028\u0015\u0002\u009e\u009b\u0003\u0002\u0002\u0002\u009e\u009c\u0003\u0002\u0002\u0002\u009e\u009d\u0003\u0002\u0002\u0002\u009f\u00a2\u0003\u0002\u0002\u0002\u00a0\u009e\u0003\u0002\u0002\u0002\u00a0\u00a1\u0003\u0002\u0002\u0002\u00a1\u00a3\u0003\u0002\u0002\u0002\u00a2\u00a0\u0003\u0002\u0002\u0002\u00a3\u00a4\u0007\u000e\u0002\u0002\u00a4\u0029\u0003\u0002\u0002\u0002\u0015\u002c\u0033\u003c\u0042\u0055\u005d\u0062\u0069\u006d\u0072\u0077\u007c\u0081\u0089\u008b\u0093\u0095\u009e\u00a0"

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
    private val CHAR = Tokens.CHAR.id
    private val ALPHA = Tokens.ALPHA.id
    private val DIGIT = Tokens.DIGIT.id
    private val CTL = Tokens.CTL.id
    private val CR = Tokens.CR.id
    private val LF = Tokens.LF.id
    private val SPACE = Tokens.SPACE.id
    private val HTAB = Tokens.HTAB.id
    private val CRLF = Tokens.CRLF.id
    private val SPECIALS = Tokens.SPECIALS.id
    private val QUOTE = Tokens.QUOTE.id
    private val QTEXT = Tokens.QTEXT.id
    private val DTEXT = Tokens.DTEXT.id
    private val CTEXT = Tokens.CTEXT.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class EmailaddressContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_emailaddress.id
	        set(value) { throw RuntimeException() }
		fun findMailbox() : MailboxContext? = getRuleContext(solver.getType("MailboxContext"),0)
		fun findGroup() : GroupContext? = getRuleContext(solver.getType("GroupContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).enterEmailaddress(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).exitEmailaddress(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is emailaddressVisitor ) return (visitor as emailaddressVisitor<out T>).visitEmailaddress(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  emailaddress() : EmailaddressContext {
		var _localctx : EmailaddressContext = EmailaddressContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_emailaddress.id)
		try {
			this.state = 42
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,0,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 40
			mailbox()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 41
			group()
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

	open class GroupContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_group.id
	        set(value) { throw RuntimeException() }
		fun findPhrase() : PhraseContext? = getRuleContext(solver.getType("PhraseContext"),0)
		fun findMailbox() : List<MailboxContext> = getRuleContexts(solver.getType("MailboxContext"))
		fun findMailbox(i: Int) : MailboxContext? = getRuleContext(solver.getType("MailboxContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).enterGroup(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).exitGroup(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is emailaddressVisitor ) return (visitor as emailaddressVisitor<out T>).visitGroup(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  group() : GroupContext {
		var _localctx : GroupContext = GroupContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_group.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 44
			phrase()
			this.state = 45
			match(T__0) as Token
			this.state = 49
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__9 || _la==CHAR) {
				if (true){
				if (true){
				this.state = 46
				mailbox()
				}
				}
				this.state = 51
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 52
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

	open class MailboxContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_mailbox.id
	        set(value) { throw RuntimeException() }
		fun findAddrspec() : AddrspecContext? = getRuleContext(solver.getType("AddrspecContext"),0)
		fun findPhrase() : PhraseContext? = getRuleContext(solver.getType("PhraseContext"),0)
		fun findRouteaddr() : RouteaddrContext? = getRuleContext(solver.getType("RouteaddrContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).enterMailbox(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).exitMailbox(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is emailaddressVisitor ) return (visitor as emailaddressVisitor<out T>).visitMailbox(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  mailbox() : MailboxContext {
		var _localctx : MailboxContext = MailboxContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_mailbox.id)
		try {
			this.state = 58
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,2,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 54
			addrspec()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			if (true){
			this.state = 55
			phrase()
			this.state = 56
			routeaddr()
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

	open class RouteaddrContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_routeaddr.id
	        set(value) { throw RuntimeException() }
		fun findAddrspec() : AddrspecContext? = getRuleContext(solver.getType("AddrspecContext"),0)
		fun findRoute() : List<RouteContext> = getRuleContexts(solver.getType("RouteContext"))
		fun findRoute(i: Int) : RouteContext? = getRuleContext(solver.getType("RouteContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).enterRouteaddr(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).exitRouteaddr(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is emailaddressVisitor ) return (visitor as emailaddressVisitor<out T>).visitRouteaddr(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  routeaddr() : RouteaddrContext {
		var _localctx : RouteaddrContext = RouteaddrContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_routeaddr.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 60
			match(T__2) as Token
			this.state = 64
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__4) {
				if (true){
				if (true){
				this.state = 61
				route()
				}
				}
				this.state = 66
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 67
			addrspec()
			this.state = 68
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

	open class RouteContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_route.id
	        set(value) { throw RuntimeException() }
		fun findDomain() : DomainContext? = getRuleContext(solver.getType("DomainContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).enterRoute(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).exitRoute(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is emailaddressVisitor ) return (visitor as emailaddressVisitor<out T>).visitRoute(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  route() : RouteContext {
		var _localctx : RouteContext = RouteContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_route.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 70
			match(T__4) as Token
			this.state = 71
			domain()
			this.state = 72
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

	open class AddrspecContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_addrspec.id
	        set(value) { throw RuntimeException() }
		fun findLocalpart() : LocalpartContext? = getRuleContext(solver.getType("LocalpartContext"),0)
		fun findDomain() : DomainContext? = getRuleContext(solver.getType("DomainContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).enterAddrspec(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).exitAddrspec(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is emailaddressVisitor ) return (visitor as emailaddressVisitor<out T>).visitAddrspec(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  addrspec() : AddrspecContext {
		var _localctx : AddrspecContext = AddrspecContext(context, state)
		enterRule(_localctx, 10, Rules.RULE_addrspec.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 74
			localpart()
			this.state = 75
			match(T__4) as Token
			this.state = 76
			domain()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class LocalpartContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_localpart.id
	        set(value) { throw RuntimeException() }
		fun findWord() : List<WordContext> = getRuleContexts(solver.getType("WordContext"))
		fun findWord(i: Int) : WordContext? = getRuleContext(solver.getType("WordContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).enterLocalpart(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).exitLocalpart(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is emailaddressVisitor ) return (visitor as emailaddressVisitor<out T>).visitLocalpart(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  localpart() : LocalpartContext {
		var _localctx : LocalpartContext = LocalpartContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_localpart.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 78
			word()
			this.state = 83
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__5) {
				if (true){
				if (true){
				this.state = 79
				match(T__5) as Token
				this.state = 80
				word()
				}
				}
				this.state = 85
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

	open class DomainContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_domain.id
	        set(value) { throw RuntimeException() }
		fun findSubdomain() : List<SubdomainContext> = getRuleContexts(solver.getType("SubdomainContext"))
		fun findSubdomain(i: Int) : SubdomainContext? = getRuleContext(solver.getType("SubdomainContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).enterDomain(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).exitDomain(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is emailaddressVisitor ) return (visitor as emailaddressVisitor<out T>).visitDomain(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  domain() : DomainContext {
		var _localctx : DomainContext = DomainContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_domain.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 86
			subdomain()
			this.state = 91
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__5) {
				if (true){
				if (true){
				this.state = 87
				match(T__5) as Token
				this.state = 88
				subdomain()
				}
				}
				this.state = 93
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

	open class SubdomainContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_subdomain.id
	        set(value) { throw RuntimeException() }
		fun findDomainref() : DomainrefContext? = getRuleContext(solver.getType("DomainrefContext"),0)
		fun findDomainliteral() : DomainliteralContext? = getRuleContext(solver.getType("DomainliteralContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).enterSubdomain(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).exitSubdomain(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is emailaddressVisitor ) return (visitor as emailaddressVisitor<out T>).visitSubdomain(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  subdomain() : SubdomainContext {
		var _localctx : SubdomainContext = SubdomainContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_subdomain.id)
		try {
			this.state = 96
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			CHAR  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 94
			domainref()
			}}
			T__7  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 95
			domainliteral()
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

	open class DomainrefContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_domainref.id
	        set(value) { throw RuntimeException() }
		fun findAtom() : AtomContext? = getRuleContext(solver.getType("AtomContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).enterDomainref(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).exitDomainref(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is emailaddressVisitor ) return (visitor as emailaddressVisitor<out T>).visitDomainref(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  domainref() : DomainrefContext {
		var _localctx : DomainrefContext = DomainrefContext(context, state)
		enterRule(_localctx, 18, Rules.RULE_domainref.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 98
			atom()
			}
		}
		catch (re: RecognitionException) {
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
		fun findWord() : List<WordContext> = getRuleContexts(solver.getType("WordContext"))
		fun findWord(i: Int) : WordContext? = getRuleContext(solver.getType("WordContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).enterPhrase(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).exitPhrase(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is emailaddressVisitor ) return (visitor as emailaddressVisitor<out T>).visitPhrase(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  phrase() : PhraseContext {
		var _localctx : PhraseContext = PhraseContext(context, state)
		enterRule(_localctx, 20, Rules.RULE_phrase.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 101 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 100
				word()
				}
				}
				this.state = 103 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__9 || _la==CHAR )
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class WordContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_word.id
	        set(value) { throw RuntimeException() }
		fun findAtom() : AtomContext? = getRuleContext(solver.getType("AtomContext"),0)
		fun findQuotedstring() : QuotedstringContext? = getRuleContext(solver.getType("QuotedstringContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).enterWord(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).exitWord(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is emailaddressVisitor ) return (visitor as emailaddressVisitor<out T>).visitWord(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  word() : WordContext {
		var _localctx : WordContext = WordContext(context, state)
		enterRule(_localctx, 22, Rules.RULE_word.id)
		try {
			this.state = 107
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			CHAR  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 105
			atom()
			}}
			T__9  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 106
			quotedstring()
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

	open class LwspcharContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_lwspchar.id
	        set(value) { throw RuntimeException() }
		fun SPACE() : TerminalNode? = getToken(emailaddressParser.Tokens.SPACE.id, 0)
		fun HTAB() : TerminalNode? = getToken(emailaddressParser.Tokens.HTAB.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).enterLwspchar(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).exitLwspchar(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is emailaddressVisitor ) return (visitor as emailaddressVisitor<out T>).visitLwspchar(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  lwspchar() : LwspcharContext {
		var _localctx : LwspcharContext = LwspcharContext(context, state)
		enterRule(_localctx, 24, Rules.RULE_lwspchar.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 109
			_la = _input!!.LA(1)
			if ( !(_la==SPACE || _la==HTAB) ) {
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

	open class LwspContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_lwsp.id
	        set(value) { throw RuntimeException() }
		fun findLwspchar() : List<LwspcharContext> = getRuleContexts(solver.getType("LwspcharContext"))
		fun findLwspchar(i: Int) : LwspcharContext? = getRuleContext(solver.getType("LwspcharContext"),i)
		fun CRLF() : List<TerminalNode> = getTokens(emailaddressParser.Tokens.CRLF.id)
		fun CRLF(i: Int) : TerminalNode = getToken(emailaddressParser.Tokens.CRLF.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).enterLwsp(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).exitLwsp(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is emailaddressVisitor ) return (visitor as emailaddressVisitor<out T>).visitLwsp(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  lwsp() : LwspContext {
		var _localctx : LwspContext = LwspContext(context, state)
		enterRule(_localctx, 26, Rules.RULE_lwsp.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 115 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 112
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				if (_la==CRLF) {
					if (true){
					this.state = 111
					match(CRLF) as Token
					}
				}

				this.state = 114
				lwspchar()
				}
				}
				this.state = 117 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl SPACE) or (1L shl HTAB) or (1L shl CRLF))) != 0L) )
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class DelimetersContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_delimeters.id
	        set(value) { throw RuntimeException() }
		fun SPECIALS() : TerminalNode? = getToken(emailaddressParser.Tokens.SPECIALS.id, 0)
		fun findLwsp() : LwspContext? = getRuleContext(solver.getType("LwspContext"),0)
		fun findComment() : CommentContext? = getRuleContext(solver.getType("CommentContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).enterDelimeters(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).exitDelimeters(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is emailaddressVisitor ) return (visitor as emailaddressVisitor<out T>).visitDelimeters(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  delimeters() : DelimetersContext {
		var _localctx : DelimetersContext = DelimetersContext(context, state)
		enterRule(_localctx, 28, Rules.RULE_delimeters.id)
		try {
			this.state = 122
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			SPECIALS  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 119
			match(SPECIALS) as Token
			}}
			SPACE , HTAB , CRLF  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 120
			lwsp()
			}}
			T__10  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 121
			comment()
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

	open class AtomContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_atom.id
	        set(value) { throw RuntimeException() }
		fun CHAR() : List<TerminalNode> = getTokens(emailaddressParser.Tokens.CHAR.id)
		fun CHAR(i: Int) : TerminalNode = getToken(emailaddressParser.Tokens.CHAR.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).enterAtom(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).exitAtom(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is emailaddressVisitor ) return (visitor as emailaddressVisitor<out T>).visitAtom(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  atom() : AtomContext {
		var _localctx : AtomContext = AtomContext(context, state)
		enterRule(_localctx, 30, Rules.RULE_atom.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 125 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				if (true){
				this.state = 124
				match(CHAR) as Token
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 127 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,12,context)
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

	open class QuotedpairContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_quotedpair.id
	        set(value) { throw RuntimeException() }
		fun CHAR() : TerminalNode? = getToken(emailaddressParser.Tokens.CHAR.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).enterQuotedpair(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).exitQuotedpair(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is emailaddressVisitor ) return (visitor as emailaddressVisitor<out T>).visitQuotedpair(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  quotedpair() : QuotedpairContext {
		var _localctx : QuotedpairContext = QuotedpairContext(context, state)
		enterRule(_localctx, 32, Rules.RULE_quotedpair.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 129
			match(T__6) as Token
			this.state = 130
			match(CHAR) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class DomainliteralContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_domainliteral.id
	        set(value) { throw RuntimeException() }
		fun DTEXT() : List<TerminalNode> = getTokens(emailaddressParser.Tokens.DTEXT.id)
		fun DTEXT(i: Int) : TerminalNode = getToken(emailaddressParser.Tokens.DTEXT.id, i) as TerminalNode
		fun findQuotedpair() : List<QuotedpairContext> = getRuleContexts(solver.getType("QuotedpairContext"))
		fun findQuotedpair(i: Int) : QuotedpairContext? = getRuleContext(solver.getType("QuotedpairContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).enterDomainliteral(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).exitDomainliteral(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is emailaddressVisitor ) return (visitor as emailaddressVisitor<out T>).visitDomainliteral(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  domainliteral() : DomainliteralContext {
		var _localctx : DomainliteralContext = DomainliteralContext(context, state)
		enterRule(_localctx, 34, Rules.RULE_domainliteral.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 132
			match(T__7) as Token
			this.state = 137
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__6 || _la==DTEXT) {
				if (true){
				this.state = 135
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				DTEXT  ->  /*LL1AltBlock*/{if (true){
				this.state = 133
				match(DTEXT) as Token
				}}
				T__6  ->  /*LL1AltBlock*/{if (true){
				this.state = 134
				quotedpair()
				}}
				else -> throw NoViableAltException(this)
				}
				}
				this.state = 139
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 140
			match(T__8) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class QuotedstringContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_quotedstring.id
	        set(value) { throw RuntimeException() }
		fun QTEXT() : List<TerminalNode> = getTokens(emailaddressParser.Tokens.QTEXT.id)
		fun QTEXT(i: Int) : TerminalNode = getToken(emailaddressParser.Tokens.QTEXT.id, i) as TerminalNode
		fun findQuotedpair() : List<QuotedpairContext> = getRuleContexts(solver.getType("QuotedpairContext"))
		fun findQuotedpair(i: Int) : QuotedpairContext? = getRuleContext(solver.getType("QuotedpairContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).enterQuotedstring(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).exitQuotedstring(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is emailaddressVisitor ) return (visitor as emailaddressVisitor<out T>).visitQuotedstring(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  quotedstring() : QuotedstringContext {
		var _localctx : QuotedstringContext = QuotedstringContext(context, state)
		enterRule(_localctx, 36, Rules.RULE_quotedstring.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 142
			match(T__9) as Token
			this.state = 147
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__6 || _la==QTEXT) {
				if (true){
				this.state = 145
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				QTEXT  ->  /*LL1AltBlock*/{if (true){
				this.state = 143
				match(QTEXT) as Token
				}}
				T__6  ->  /*LL1AltBlock*/{if (true){
				this.state = 144
				quotedpair()
				}}
				else -> throw NoViableAltException(this)
				}
				}
				this.state = 149
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 150
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

	open class CommentContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_comment.id
	        set(value) { throw RuntimeException() }
		fun CTEXT() : List<TerminalNode> = getTokens(emailaddressParser.Tokens.CTEXT.id)
		fun CTEXT(i: Int) : TerminalNode = getToken(emailaddressParser.Tokens.CTEXT.id, i) as TerminalNode
		fun findQuotedpair() : List<QuotedpairContext> = getRuleContexts(solver.getType("QuotedpairContext"))
		fun findQuotedpair(i: Int) : QuotedpairContext? = getRuleContext(solver.getType("QuotedpairContext"),i)
		fun findComment() : List<CommentContext> = getRuleContexts(solver.getType("CommentContext"))
		fun findComment(i: Int) : CommentContext? = getRuleContext(solver.getType("CommentContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).enterComment(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is emailaddressListener ) (listener as emailaddressListener).exitComment(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is emailaddressVisitor ) return (visitor as emailaddressVisitor<out T>).visitComment(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  comment() : CommentContext {
		var _localctx : CommentContext = CommentContext(context, state)
		enterRule(_localctx, 38, Rules.RULE_comment.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 152
			match(T__10) as Token
			this.state = 158
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__6) or (1L shl T__10) or (1L shl CTEXT))) != 0L)) {
				if (true){
				this.state = 156
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				CTEXT  ->  /*LL1AltBlock*/{if (true){
				this.state = 153
				match(CTEXT) as Token
				}}
				T__6  ->  /*LL1AltBlock*/{if (true){
				this.state = 154
				quotedpair()
				}}
				T__10  ->  /*LL1AltBlock*/{if (true){
				this.state = 155
				comment()
				}}
				else -> throw NoViableAltException(this)
				}
				}
				this.state = 160
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 161
			match(T__11) as Token
			}
		}
		catch (re: RecognitionException) {
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