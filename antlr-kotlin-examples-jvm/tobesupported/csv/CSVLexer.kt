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

class CSVLexer(val input: CharStream) : Lexer(input) {
	// TODO Verify the runtime version is correct

    override val ruleNames: Array<String>?
        get() = Rules.values().map { it.name }.toTypedArray()

    override val grammarFileName: String
        get() = "CSV.g4"

    override val atn: ATN
		get() = CSVLexer.Companion.ATN

	companion object {
		val decisionToDFA : Array<DFA>
		val sharedContextCache = PredictionContextCache()

		private val LITERAL_NAMES = Arrays.asList<String?>(null, "','", "'\r'", 
		                                                   "'\n'")
		private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, null, null, 
		                                                    null, "TEXT", "STRING")

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

		private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0002\u0007\u0023\u0008\u0001\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0005\u0006\u0005\u0015\u000a\u0005\u000d\u0005\u000e\u0005\u0016\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0007\u0006\u001d\u000a\u0006\u000c\u0006\u000e\u0006\u0020\u000b\u0006\u0003\u0006\u0003\u0006\u0002\u0002\u0007\u0003\u0003\u0005\u0004\u0007\u0005\u0009\u0006\u000b\u0007\u0003\u0002\u0004\u0006\u0002\u000c\u000c\u000f\u000f\u0024\u0024\u002e\u002e\u0003\u0002\u0024\u0024\u0002\u0025\u0002\u0003\u0003\u0002\u0002\u0002\u0002\u0005\u0003\u0002\u0002\u0002\u0002\u0007\u0003\u0002\u0002\u0002\u0002\u0009\u0003\u0002\u0002\u0002\u0002\u000b\u0003\u0002\u0002\u0002\u0003\u000d\u0003\u0002\u0002\u0002\u0005\u000f\u0003\u0002\u0002\u0002\u0007\u0011\u0003\u0002\u0002\u0002\u0009\u0014\u0003\u0002\u0002\u0002\u000b\u0018\u0003\u0002\u0002\u0002\u000d\u000e\u0007\u002e\u0002\u0002\u000e\u0004\u0003\u0002\u0002\u0002\u000f\u0010\u0007\u000f\u0002\u0002\u0010\u0006\u0003\u0002\u0002\u0002\u0011\u0012\u0007\u000c\u0002\u0002\u0012\u0008\u0003\u0002\u0002\u0002\u0013\u0015\u000a\u0002\u0002\u0002\u0014\u0013\u0003\u0002\u0002\u0002\u0015\u0016\u0003\u0002\u0002\u0002\u0016\u0014\u0003\u0002\u0002\u0002\u0016\u0017\u0003\u0002\u0002\u0002\u0017\u000a\u0003\u0002\u0002\u0002\u0018\u001e\u0007\u0024\u0002\u0002\u0019\u001a\u0007\u0024\u0002\u0002\u001a\u001d\u0007\u0024\u0002\u0002\u001b\u001d\u000a\u0003\u0002\u0002\u001c\u0019\u0003\u0002\u0002\u0002\u001c\u001b\u0003\u0002\u0002\u0002\u001d\u0020\u0003\u0002\u0002\u0002\u001e\u001c\u0003\u0002\u0002\u0002\u001e\u001f\u0003\u0002\u0002\u0002\u001f\u0021\u0003\u0002\u0002\u0002\u0020\u001e\u0003\u0002\u0002\u0002\u0021\u0022\u0007\u0024\u0002\u0002\u0022\u000c\u0003\u0002\u0002\u0002\u0006\u0002\u0016\u001c\u001e\u0002"

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
	    TEXT(4),
	    STRING(5)
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
	    TEXT,
	    STRING
	}


	init {
		this.interpreter = LexerATNSimulator(this, ATN, decisionToDFA as Array<DFA?>, sharedContextCache)
	}

}