// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc
import com.strumenta.kotlinmultiplatform.Arrays
import org.antlr.v4.runtime.misc.Utils
import org.antlr.v4.kotlinruntime.CharStream
import org.antlr.v4.kotlinruntime.Lexer
import org.antlr.v4.kotlinruntime.VocabularyImpl
import org.antlr.v4.kotlinruntime.atn.ATN
import org.antlr.v4.kotlinruntime.atn.ATNDeserializer
import org.antlr.v4.kotlinruntime.atn.LexerATNSimulator
import org.antlr.v4.kotlinruntime.atn.PredictionContextCache
import org.antlr.v4.kotlinruntime.dfa.DFA

class emailaddressLexer(val input: CharStream) : Lexer(input) {
	// TODO Verify the runtime version is correct

    override val ruleNames: Array<String>?
        get() = Rules.values().map { it.name }.toTypedArray()

    override val grammarFileName: String
        get() = "emailaddress.g4"

    override val atn: ATN
		get() = emailaddressLexer.Companion.ATN

	companion object {
		val decisionToDFA : Array<DFA>
		val sharedContextCache = PredictionContextCache()

		private val LITERAL_NAMES = Arrays.asList<String?>(null, "':'", "';'", 
		                                                   "'<'", "'>'", "'@'", 
		                                                   "'.'", "'\\'", "'['", 
		                                                   "']'", "'''", "'('", 
		                                                   "')'", null, null, 
		                                                   null, null, "'\n'", 
		                                                   "'\r'", "' '", "'\t'", 
		                                                   "'\r\n'", null, "'\"'")
		private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, null, null, 
		                                                    null, null, null, 
		                                                    null, null, null, 
		                                                    null, null, null, 
		                                                    null, "CHAR", "ALPHA", 
		                                                    "DIGIT", "CTL", "CR", 
		                                                    "LF", "SPACE", "HTAB", 
		                                                    "CRLF", "SPECIALS", 
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

		private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0002\u001c\u006c\u0008\u0001\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000b\u0003\u000b\u0003\u000c\u0003\u000c\u0003\u000d\u0003\u000d\u0003\u000e\u0003\u000e\u0003\u000f\u0003\u000f\u0003\u0010\u0003\u0010\u0003\u0011\u0003\u0011\u0003\u0012\u0003\u0012\u0003\u0013\u0003\u0013\u0003\u0014\u0003\u0014\u0003\u0015\u0003\u0015\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0017\u0003\u0017\u0003\u0018\u0003\u0018\u0003\u0019\u0003\u0019\u0003\u001a\u0003\u001a\u0003\u001b\u0003\u001b\u0002\u0002\u001c\u0003\u0003\u0005\u0004\u0007\u0005\u0009\u0006\u000b\u0007\u000d\u0008\u000f\u0009\u0011\u000a\u0013\u000b\u0015\u000c\u0017\u000d\u0019\u000e\u001b\u000f\u001d\u0010\u001f\u0011\u0021\u0012\u0023\u0013\u0025\u0014\u0027\u0015\u0029\u0016\u002b\u0017\u002d\u0018\u002f\u0019\u0031\u001a\u0033\u001b\u0035\u001c\u0003\u0002\u000a\u0003\u0002\u0002\u0129\u0003\u0002\u0067\u0092\u0003\u0002\u004a\u0059\u0003\u0002\u0002\u0033\u0009\u0002\u0029\u002b\u002e\u002e\u0030\u0030\u003c\u003e\u0040\u0040\u0042\u0042\u005d\u005f\u0004\u0002\u000c\u000c\u000f\u000f\u0004\u0002\u000c\u000c\u005d\u005f\u0005\u0002\u000c\u000c\u002a\u002b\u005e\u005e\u0002\u006b\u0002\u0003\u0003\u0002\u0002\u0002\u0002\u0005\u0003\u0002\u0002\u0002\u0002\u0007\u0003\u0002\u0002\u0002\u0002\u0009\u0003\u0002\u0002\u0002\u0002\u000b\u0003\u0002\u0002\u0002\u0002\u000d\u0003\u0002\u0002\u0002\u0002\u000f\u0003\u0002\u0002\u0002\u0002\u0011\u0003\u0002\u0002\u0002\u0002\u0013\u0003\u0002\u0002\u0002\u0002\u0015\u0003\u0002\u0002\u0002\u0002\u0017\u0003\u0002\u0002\u0002\u0002\u0019\u0003\u0002\u0002\u0002\u0002\u001b\u0003\u0002\u0002\u0002\u0002\u001d\u0003\u0002\u0002\u0002\u0002\u001f\u0003\u0002\u0002\u0002\u0002\u0021\u0003\u0002\u0002\u0002\u0002\u0023\u0003\u0002\u0002\u0002\u0002\u0025\u0003\u0002\u0002\u0002\u0002\u0027\u0003\u0002\u0002\u0002\u0002\u0029\u0003\u0002\u0002\u0002\u0002\u002b\u0003\u0002\u0002\u0002\u0002\u002d\u0003\u0002\u0002\u0002\u0002\u002f\u0003\u0002\u0002\u0002\u0002\u0031\u0003\u0002\u0002\u0002\u0002\u0033\u0003\u0002\u0002\u0002\u0002\u0035\u0003\u0002\u0002\u0002\u0003\u0037\u0003\u0002\u0002\u0002\u0005\u0039\u0003\u0002\u0002\u0002\u0007\u003b\u0003\u0002\u0002\u0002\u0009\u003d\u0003\u0002\u0002\u0002\u000b\u003f\u0003\u0002\u0002\u0002\u000d\u0041\u0003\u0002\u0002\u0002\u000f\u0043\u0003\u0002\u0002\u0002\u0011\u0045\u0003\u0002\u0002\u0002\u0013\u0047\u0003\u0002\u0002\u0002\u0015\u0049\u0003\u0002\u0002\u0002\u0017\u004b\u0003\u0002\u0002\u0002\u0019\u004d\u0003\u0002\u0002\u0002\u001b\u004f\u0003\u0002\u0002\u0002\u001d\u0051\u0003\u0002\u0002\u0002\u001f\u0053\u0003\u0002\u0002\u0002\u0021\u0055\u0003\u0002\u0002\u0002\u0023\u0057\u0003\u0002\u0002\u0002\u0025\u0059\u0003\u0002\u0002\u0002\u0027\u005b\u0003\u0002\u0002\u0002\u0029\u005d\u0003\u0002\u0002\u0002\u002b\u005f\u0003\u0002\u0002\u0002\u002d\u0062\u0003\u0002\u0002\u0002\u002f\u0064\u0003\u0002\u0002\u0002\u0031\u0066\u0003\u0002\u0002\u0002\u0033\u0068\u0003\u0002\u0002\u0002\u0035\u006a\u0003\u0002\u0002\u0002\u0037\u0038\u0007\u003c\u0002\u0002\u0038\u0004\u0003\u0002\u0002\u0002\u0039\u003a\u0007\u003d\u0002\u0002\u003a\u0006\u0003\u0002\u0002\u0002\u003b\u003c\u0007\u003e\u0002\u0002\u003c\u0008\u0003\u0002\u0002\u0002\u003d\u003e\u0007\u0040\u0002\u0002\u003e\u000a\u0003\u0002\u0002\u0002\u003f\u0040\u0007\u0042\u0002\u0002\u0040\u000c\u0003\u0002\u0002\u0002\u0041\u0042\u0007\u0030\u0002\u0002\u0042\u000e\u0003\u0002\u0002\u0002\u0043\u0044\u0007\u005e\u0002\u0002\u0044\u0010\u0003\u0002\u0002\u0002\u0045\u0046\u0007\u005d\u0002\u0002\u0046\u0012\u0003\u0002\u0002\u0002\u0047\u0048\u0007\u005f\u0002\u0002\u0048\u0014\u0003\u0002\u0002\u0002\u0049\u004a\u0007\u0029\u0002\u0002\u004a\u0016\u0003\u0002\u0002\u0002\u004b\u004c\u0007\u002a\u0002\u0002\u004c\u0018\u0003\u0002\u0002\u0002\u004d\u004e\u0007\u002b\u0002\u0002\u004e\u001a\u0003\u0002\u0002\u0002\u004f\u0050\u0009\u0002\u0002\u0002\u0050\u001c\u0003\u0002\u0002\u0002\u0051\u0052\u0009\u0003\u0002\u0002\u0052\u001e\u0003\u0002\u0002\u0002\u0053\u0054\u0009\u0004\u0002\u0002\u0054\u0020\u0003\u0002\u0002\u0002\u0055\u0056\u0009\u0005\u0002\u0002\u0056\u0022\u0003\u0002\u0002\u0002\u0057\u0058\u0007\u000c\u0002\u0002\u0058\u0024\u0003\u0002\u0002\u0002\u0059\u005a\u0007\u000f\u0002\u0002\u005a\u0026\u0003\u0002\u0002\u0002\u005b\u005c\u0007\u0022\u0002\u0002\u005c\u0028\u0003\u0002\u0002\u0002\u005d\u005e\u0007\u000b\u0002\u0002\u005e\u002a\u0003\u0002\u0002\u0002\u005f\u0060\u0007\u000f\u0002\u0002\u0060\u0061\u0007\u000c\u0002\u0002\u0061\u002c\u0003\u0002\u0002\u0002\u0062\u0063\u0009\u0006\u0002\u0002\u0063\u002e\u0003\u0002\u0002\u0002\u0064\u0065\u0007\u0024\u0002\u0002\u0065\u0030\u0003\u0002\u0002\u0002\u0066\u0067\u000a\u0007\u0002\u0002\u0067\u0032\u0003\u0002\u0002\u0002\u0068\u0069\u000a\u0008\u0002\u0002\u0069\u0034\u0003\u0002\u0002\u0002\u006a\u006b\u000a\u0009\u0002\u0002\u006b\u0036\u0003\u0002\u0002\u0002\u0003\u0002\u0002"

		val ATN = ATNDeserializer().deserialize(serializedATN.toCharArray())
		init {
			decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
				DFA(ATN.getDecisionState(it)!!, it)
			})


		}
	}

    enum class Tokens(val id: Int) {
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

	enum class Channels(val id: Int) {
		DEFAULT_TOKEN_CHANNEL(0),
		HIDDEN(1),
	}

	enum class Modes(val id: Int) {
		DEFAULT_MODE(0),
	}

	enum class Rules {
	    T__0,
	    T__1,
	    T__2,
	    T__3,
	    T__4,
	    T__5,
	    T__6,
	    T__7,
	    T__8,
	    T__9,
	    T__10,
	    T__11,
	    CHAR,
	    ALPHA,
	    DIGIT,
	    CTL,
	    CR,
	    LF,
	    SPACE,
	    HTAB,
	    CRLF,
	    SPECIALS,
	    QUOTE,
	    QTEXT,
	    DTEXT,
	    CTEXT
	}


	init {
		this.interpreter = LexerATNSimulator(this, ATN, decisionToDFA as Array<DFA?>, sharedContextCache)
	}

}