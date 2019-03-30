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

class folLexer(val input: CharStream) : Lexer(input) {
	// TODO Verify the runtime version is correct

    override val ruleNames: Array<String>?
        get() = Rules.values().map { it.name }.toTypedArray()

    override val grammarFileName: String
        get() = "fol.g4"

    override val atn: ATN
		get() = folLexer.Companion.ATN

	companion object {
		val decisionToDFA : Array<DFA>
		val sharedContextCache = PredictionContextCache()

		private val LITERAL_NAMES = Arrays.asList<String?>(null, "'?'", "'_'", 
		                                                   "'#'", "'.'", "','", 
		                                                   "'('", "')'", "'='", 
		                                                   "'!'", "'Forall'", 
		                                                   "'Exists'", null, "'\\/'", 
		                                                   "'^'", "'->'", "'<->'")
		private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, null, null, 
		                                                    null, null, null, 
		                                                    "LPAREN", "RPAREN", 
		                                                    "EQUAL", "NOT", "FORALL", 
		                                                    "EXISTS", "CHARACTER", 
		                                                    "CONJ", "DISJ", "IMPL", 
		                                                    "BICOND", "ENDLINE", 
		                                                    "WHITESPACE")

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

		private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0002\u0014\u0061\u0008\u0001\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000d\u0003\u000d\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000f\u0003\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0012\u0006\u0012\u0057\u000a\u0012\u000d\u0012\u000e\u0012\u0058\u0003\u0013\u0006\u0013\u005c\u000a\u0013\u000d\u0013\u000e\u0013\u005d\u0003\u0013\u0003\u0013\u0002\u0002\u0014\u0003\u0003\u0005\u0004\u0007\u0005\u0009\u0006\u000b\u0007\u000d\u0008\u000f\u0009\u0011\u000a\u0013\u000b\u0015\u000c\u0017\u000d\u0019\u000e\u001b\u000f\u001d\u0010\u001f\u0011\u0021\u0012\u0023\u0013\u0025\u0014\u0003\u0002\u0005\u0005\u0002\u0032\u003b\u0043\u005c\u0063\u007c\u0004\u0002\u000c\u000c\u000f\u000f\u0004\u0002\u000b\u000b\u0022\u0022\u0002\u0062\u0002\u0003\u0003\u0002\u0002\u0002\u0002\u0005\u0003\u0002\u0002\u0002\u0002\u0007\u0003\u0002\u0002\u0002\u0002\u0009\u0003\u0002\u0002\u0002\u0002\u000b\u0003\u0002\u0002\u0002\u0002\u000d\u0003\u0002\u0002\u0002\u0002\u000f\u0003\u0002\u0002\u0002\u0002\u0011\u0003\u0002\u0002\u0002\u0002\u0013\u0003\u0002\u0002\u0002\u0002\u0015\u0003\u0002\u0002\u0002\u0002\u0017\u0003\u0002\u0002\u0002\u0002\u0019\u0003\u0002\u0002\u0002\u0002\u001b\u0003\u0002\u0002\u0002\u0002\u001d\u0003\u0002\u0002\u0002\u0002\u001f\u0003\u0002\u0002\u0002\u0002\u0021\u0003\u0002\u0002\u0002\u0002\u0023\u0003\u0002\u0002\u0002\u0002\u0025\u0003\u0002\u0002\u0002\u0003\u0027\u0003\u0002\u0002\u0002\u0005\u0029\u0003\u0002\u0002\u0002\u0007\u002b\u0003\u0002\u0002\u0002\u0009\u002d\u0003\u0002\u0002\u0002\u000b\u002f\u0003\u0002\u0002\u0002\u000d\u0031\u0003\u0002\u0002\u0002\u000f\u0033\u0003\u0002\u0002\u0002\u0011\u0035\u0003\u0002\u0002\u0002\u0013\u0037\u0003\u0002\u0002\u0002\u0015\u0039\u0003\u0002\u0002\u0002\u0017\u0040\u0003\u0002\u0002\u0002\u0019\u0047\u0003\u0002\u0002\u0002\u001b\u0049\u0003\u0002\u0002\u0002\u001d\u004c\u0003\u0002\u0002\u0002\u001f\u004e\u0003\u0002\u0002\u0002\u0021\u0051\u0003\u0002\u0002\u0002\u0023\u0056\u0003\u0002\u0002\u0002\u0025\u005b\u0003\u0002\u0002\u0002\u0027\u0028\u0007\u0041\u0002\u0002\u0028\u0004\u0003\u0002\u0002\u0002\u0029\u002a\u0007\u0061\u0002\u0002\u002a\u0006\u0003\u0002\u0002\u0002\u002b\u002c\u0007\u0025\u0002\u0002\u002c\u0008\u0003\u0002\u0002\u0002\u002d\u002e\u0007\u0030\u0002\u0002\u002e\u000a\u0003\u0002\u0002\u0002\u002f\u0030\u0007\u002e\u0002\u0002\u0030\u000c\u0003\u0002\u0002\u0002\u0031\u0032\u0007\u002a\u0002\u0002\u0032\u000e\u0003\u0002\u0002\u0002\u0033\u0034\u0007\u002b\u0002\u0002\u0034\u0010\u0003\u0002\u0002\u0002\u0035\u0036\u0007\u003f\u0002\u0002\u0036\u0012\u0003\u0002\u0002\u0002\u0037\u0038\u0007\u0023\u0002\u0002\u0038\u0014\u0003\u0002\u0002\u0002\u0039\u003a\u0007\u0048\u0002\u0002\u003a\u003b\u0007\u0071\u0002\u0002\u003b\u003c\u0007\u0074\u0002\u0002\u003c\u003d\u0007\u0063\u0002\u0002\u003d\u003e\u0007\u006e\u0002\u0002\u003e\u003f\u0007\u006e\u0002\u0002\u003f\u0016\u0003\u0002\u0002\u0002\u0040\u0041\u0007\u0047\u0002\u0002\u0041\u0042\u0007\u007a\u0002\u0002\u0042\u0043\u0007\u006b\u0002\u0002\u0043\u0044\u0007\u0075\u0002\u0002\u0044\u0045\u0007\u0076\u0002\u0002\u0045\u0046\u0007\u0075\u0002\u0002\u0046\u0018\u0003\u0002\u0002\u0002\u0047\u0048\u0009\u0002\u0002\u0002\u0048\u001a\u0003\u0002\u0002\u0002\u0049\u004a\u0007\u005e\u0002\u0002\u004a\u004b\u0007\u0031\u0002\u0002\u004b\u001c\u0003\u0002\u0002\u0002\u004c\u004d\u0007\u0060\u0002\u0002\u004d\u001e\u0003\u0002\u0002\u0002\u004e\u004f\u0007\u002f\u0002\u0002\u004f\u0050\u0007\u0040\u0002\u0002\u0050\u0020\u0003\u0002\u0002\u0002\u0051\u0052\u0007\u003e\u0002\u0002\u0052\u0053\u0007\u002f\u0002\u0002\u0053\u0054\u0007\u0040\u0002\u0002\u0054\u0022\u0003\u0002\u0002\u0002\u0055\u0057\u0009\u0003\u0002\u0002\u0056\u0055\u0003\u0002\u0002\u0002\u0057\u0058\u0003\u0002\u0002\u0002\u0058\u0056\u0003\u0002\u0002\u0002\u0058\u0059\u0003\u0002\u0002\u0002\u0059\u0024\u0003\u0002\u0002\u0002\u005a\u005c\u0009\u0004\u0002\u0002\u005b\u005a\u0003\u0002\u0002\u0002\u005c\u005d\u0003\u0002\u0002\u0002\u005d\u005b\u0003\u0002\u0002\u0002\u005d\u005e\u0003\u0002\u0002\u0002\u005e\u005f\u0003\u0002\u0002\u0002\u005f\u0060\u0008\u0013\u0002\u0002\u0060\u0026\u0003\u0002\u0002\u0002\u0005\u0002\u0058\u005d\u0003\u0008\u0002\u0002"

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
	    LPAREN(6),
	    RPAREN(7),
	    EQUAL(8),
	    NOT(9),
	    FORALL(10),
	    EXISTS(11),
	    CHARACTER(12),
	    CONJ(13),
	    DISJ(14),
	    IMPL(15),
	    BICOND(16),
	    ENDLINE(17),
	    WHITESPACE(18)
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
	    LPAREN,
	    RPAREN,
	    EQUAL,
	    NOT,
	    FORALL,
	    EXISTS,
	    CHARACTER,
	    CONJ,
	    DISJ,
	    IMPL,
	    BICOND,
	    ENDLINE,
	    WHITESPACE
	}


	init {
		this.interpreter = LexerATNSimulator(this, ATN, decisionToDFA as Array<DFA?>, sharedContextCache)
	}

}