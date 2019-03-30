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

class bnfLexer(val input: CharStream) : Lexer(input) {
	// TODO Verify the runtime version is correct

    override val ruleNames: Array<String>?
        get() = Rules.values().map { it.name }.toTypedArray()

    override val grammarFileName: String
        get() = "bnf.g4"

    override val atn: ATN
		get() = bnfLexer.Companion.ATN

	companion object {
		val decisionToDFA : Array<DFA>
		val sharedContextCache = PredictionContextCache()

		private val LITERAL_NAMES = Arrays.asList<String?>(null, "'::='", "')'", 
		                                                   "'('", "'}'", "'{'", 
		                                                   "']'", "'['", "'|'", 
		                                                   "'>'", "'<'")
		private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, "ASSIGN", "LPAREN", 
		                                                    "RPAREN", "LBRACE", 
		                                                    "RBRACE", "LEND", 
		                                                    "REND", "BAR", "GT", 
		                                                    "LT", "ID", "WS")

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

		private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0002\u000e\u003b\u0008\u0001\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000b\u0003\u000b\u0003\u000c\u0003\u000c\u0006\u000c\u0034\u000a\u000c\u000d\u000c\u000e\u000c\u0035\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0002\u0002\u000e\u0003\u0003\u0005\u0004\u0007\u0005\u0009\u0006\u000b\u0007\u000d\u0008\u000f\u0009\u0011\u000a\u0013\u000b\u0015\u000c\u0017\u000d\u0019\u000e\u0003\u0002\u0005\u0004\u0002\u0043\u005c\u0063\u007c\u0007\u0002\u0022\u0022\u002f\u002f\u0032\u003b\u0043\u005c\u0063\u007c\u0005\u0002\u000b\u000c\u000f\u000f\u0022\u0022\u0002\u003b\u0002\u0003\u0003\u0002\u0002\u0002\u0002\u0005\u0003\u0002\u0002\u0002\u0002\u0007\u0003\u0002\u0002\u0002\u0002\u0009\u0003\u0002\u0002\u0002\u0002\u000b\u0003\u0002\u0002\u0002\u0002\u000d\u0003\u0002\u0002\u0002\u0002\u000f\u0003\u0002\u0002\u0002\u0002\u0011\u0003\u0002\u0002\u0002\u0002\u0013\u0003\u0002\u0002\u0002\u0002\u0015\u0003\u0002\u0002\u0002\u0002\u0017\u0003\u0002\u0002\u0002\u0002\u0019\u0003\u0002\u0002\u0002\u0003\u001b\u0003\u0002\u0002\u0002\u0005\u001f\u0003\u0002\u0002\u0002\u0007\u0021\u0003\u0002\u0002\u0002\u0009\u0023\u0003\u0002\u0002\u0002\u000b\u0025\u0003\u0002\u0002\u0002\u000d\u0027\u0003\u0002\u0002\u0002\u000f\u0029\u0003\u0002\u0002\u0002\u0011\u002b\u0003\u0002\u0002\u0002\u0013\u002d\u0003\u0002\u0002\u0002\u0015\u002f\u0003\u0002\u0002\u0002\u0017\u0031\u0003\u0002\u0002\u0002\u0019\u0037\u0003\u0002\u0002\u0002\u001b\u001c\u0007\u003c\u0002\u0002\u001c\u001d\u0007\u003c\u0002\u0002\u001d\u001e\u0007\u003f\u0002\u0002\u001e\u0004\u0003\u0002\u0002\u0002\u001f\u0020\u0007\u002b\u0002\u0002\u0020\u0006\u0003\u0002\u0002\u0002\u0021\u0022\u0007\u002a\u0002\u0002\u0022\u0008\u0003\u0002\u0002\u0002\u0023\u0024\u0007\u007f\u0002\u0002\u0024\u000a\u0003\u0002\u0002\u0002\u0025\u0026\u0007\u007d\u0002\u0002\u0026\u000c\u0003\u0002\u0002\u0002\u0027\u0028\u0007\u005f\u0002\u0002\u0028\u000e\u0003\u0002\u0002\u0002\u0029\u002a\u0007\u005d\u0002\u0002\u002a\u0010\u0003\u0002\u0002\u0002\u002b\u002c\u0007\u007e\u0002\u0002\u002c\u0012\u0003\u0002\u0002\u0002\u002d\u002e\u0007\u0040\u0002\u0002\u002e\u0014\u0003\u0002\u0002\u0002\u002f\u0030\u0007\u003e\u0002\u0002\u0030\u0016\u0003\u0002\u0002\u0002\u0031\u0033\u0009\u0002\u0002\u0002\u0032\u0034\u0009\u0003\u0002\u0002\u0033\u0032\u0003\u0002\u0002\u0002\u0034\u0035\u0003\u0002\u0002\u0002\u0035\u0033\u0003\u0002\u0002\u0002\u0035\u0036\u0003\u0002\u0002\u0002\u0036\u0018\u0003\u0002\u0002\u0002\u0037\u0038\u0009\u0004\u0002\u0002\u0038\u0039\u0003\u0002\u0002\u0002\u0039\u003a\u0008\u000d\u0002\u0002\u003a\u001a\u0003\u0002\u0002\u0002\u0004\u0002\u0035\u0003\u0008\u0002\u0002"

		val ATN = ATNDeserializer().deserialize(serializedATN.toCharArray())
		init {
			decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
				DFA(ATN.getDecisionState(it)!!, it)
			})


		}
	}

    enum class Tokens(val id: Int) {
	    ASSIGN(1),
	    LPAREN(2),
	    RPAREN(3),
	    LBRACE(4),
	    RBRACE(5),
	    LEND(6),
	    REND(7),
	    BAR(8),
	    GT(9),
	    LT(10),
	    ID(11),
	    WS(12)
    }

	enum class Channels(val id: Int) {
		DEFAULT_TOKEN_CHANNEL(0),
		HIDDEN(1),
	}

	enum class Modes(val id: Int) {
		DEFAULT_MODE(0),
	}

	enum class Rules {
	    ASSIGN,
	    LPAREN,
	    RPAREN,
	    LBRACE,
	    RBRACE,
	    LEND,
	    REND,
	    BAR,
	    GT,
	    LT,
	    ID,
	    WS
	}


	init {
		this.interpreter = LexerATNSimulator(this, ATN, decisionToDFA as Array<DFA?>, sharedContextCache)
	}

}