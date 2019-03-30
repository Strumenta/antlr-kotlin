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

class fastaLexer(val input: CharStream) : Lexer(input) {
	// TODO Verify the runtime version is correct

    override val ruleNames: Array<String>?
        get() = Rules.values().map { it.name }.toTypedArray()

    override val grammarFileName: String
        get() = "fasta.g4"

    override val atn: ATN
		get() = fastaLexer.Companion.ATN

	companion object {
		val decisionToDFA : Array<DFA>
		val sharedContextCache = PredictionContextCache()

		private val LITERAL_NAMES = Arrays.asList<String?>()
		private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, "COMMENTLINE", 
		                                                    "DESCRIPTIONLINE", 
		                                                    "TEXT", "EOL", "SEQUENCELINE")

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

		private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0002\u0007\u0040\u0008\u0001\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0003\u0002\u0003\u0002\u0007\u0002\u0016\u000a\u0002\u000c\u0002\u000e\u0002\u0019\u000b\u0002\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0007\u0003\u0021\u000a\u0003\u000c\u0003\u000e\u0003\u0024\u000b\u0003\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0006\u0004\u002b\u000a\u0004\u000d\u0004\u000e\u0004\u002c\u0003\u0005\u0005\u0005\u0030\u000a\u0005\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0009\u0006\u0009\u003b\u000a\u0009\u000d\u0009\u000e\u0009\u003c\u0003\u0009\u0003\u0009\u0003\u0017\u0002\u000a\u0003\u0003\u0005\u0004\u0007\u0005\u0009\u0006\u000b\u0002\u000d\u0002\u000f\u0002\u0011\u0007\u0003\u0002\u0005\u0003\u0002\u0032\u003b\u0004\u0002\u0043\u005c\u0063\u007c\u0009\u0002\u0022\u0022\u0028\u002b\u002d\u0031\u003c\u003c\u005d\u005d\u005f\u005f\u0061\u0061\u0002\u0043\u0002\u0003\u0003\u0002\u0002\u0002\u0002\u0005\u0003\u0002\u0002\u0002\u0002\u0007\u0003\u0002\u0002\u0002\u0002\u0009\u0003\u0002\u0002\u0002\u0002\u0011\u0003\u0002\u0002\u0002\u0003\u0013\u0003\u0002\u0002\u0002\u0005\u001c\u0003\u0002\u0002\u0002\u0007\u002a\u0003\u0002\u0002\u0002\u0009\u002f\u0003\u0002\u0002\u0002\u000b\u0033\u0003\u0002\u0002\u0002\u000d\u0035\u0003\u0002\u0002\u0002\u000f\u0037\u0003\u0002\u0002\u0002\u0011\u003a\u0003\u0002\u0002\u0002\u0013\u0017\u0007\u003d\u0002\u0002\u0014\u0016\u000b\u0002\u0002\u0002\u0015\u0014\u0003\u0002\u0002\u0002\u0016\u0019\u0003\u0002\u0002\u0002\u0017\u0018\u0003\u0002\u0002\u0002\u0017\u0015\u0003\u0002\u0002\u0002\u0018\u001a\u0003\u0002\u0002\u0002\u0019\u0017\u0003\u0002\u0002\u0002\u001a\u001b\u0005\u0009\u0005\u0002\u001b\u0004\u0003\u0002\u0002\u0002\u001c\u001d\u0007\u0040\u0002\u0002\u001d\u0022\u0005\u0007\u0004\u0002\u001e\u001f\u0007\u007e\u0002\u0002\u001f\u0021\u0005\u0007\u0004\u0002\u0020\u001e\u0003\u0002\u0002\u0002\u0021\u0024\u0003\u0002\u0002\u0002\u0022\u0020\u0003\u0002\u0002\u0002\u0022\u0023\u0003\u0002\u0002\u0002\u0023\u0025\u0003\u0002\u0002\u0002\u0024\u0022\u0003\u0002\u0002\u0002\u0025\u0026\u0005\u0009\u0005\u0002\u0026\u0006\u0003\u0002\u0002\u0002\u0027\u002b\u0005\u000b\u0006\u0002\u0028\u002b\u0005\u000d\u0007\u0002\u0029\u002b\u0005\u000f\u0008\u0002\u002a\u0027\u0003\u0002\u0002\u0002\u002a\u0028\u0003\u0002\u0002\u0002\u002a\u0029\u0003\u0002\u0002\u0002\u002b\u002c\u0003\u0002\u0002\u0002\u002c\u002a\u0003\u0002\u0002\u0002\u002c\u002d\u0003\u0002\u0002\u0002\u002d\u0008\u0003\u0002\u0002\u0002\u002e\u0030\u0007\u000f\u0002\u0002\u002f\u002e\u0003\u0002\u0002\u0002\u002f\u0030\u0003\u0002\u0002\u0002\u0030\u0031\u0003\u0002\u0002\u0002\u0031\u0032\u0007\u000c\u0002\u0002\u0032\u000a\u0003\u0002\u0002\u0002\u0033\u0034\u0009\u0002\u0002\u0002\u0034\u000c\u0003\u0002\u0002\u0002\u0035\u0036\u0009\u0003\u0002\u0002\u0036\u000e\u0003\u0002\u0002\u0002\u0037\u0038\u0009\u0004\u0002\u0002\u0038\u0010\u0003\u0002\u0002\u0002\u0039\u003b\u0005\u000d\u0007\u0002\u003a\u0039\u0003\u0002\u0002\u0002\u003b\u003c\u0003\u0002\u0002\u0002\u003c\u003a\u0003\u0002\u0002\u0002\u003c\u003d\u0003\u0002\u0002\u0002\u003d\u003e\u0003\u0002\u0002\u0002\u003e\u003f\u0005\u0009\u0005\u0002\u003f\u0012\u0003\u0002\u0002\u0002\u0009\u0002\u0017\u0022\u002a\u002c\u002f\u003c\u0002"

		val ATN = ATNDeserializer().deserialize(serializedATN.toCharArray())
		init {
			decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
				DFA(ATN.getDecisionState(it)!!, it)
			})


		}
	}

    enum class Tokens(val id: Int) {
	    COMMENTLINE(1),
	    DESCRIPTIONLINE(2),
	    TEXT(3),
	    EOL(4),
	    SEQUENCELINE(5)
    }

	enum class Channels(val id: Int) {
		DEFAULT_TOKEN_CHANNEL(0),
		HIDDEN(1),
	}

	enum class Modes(val id: Int) {
		DEFAULT_MODE(0),
	}

	enum class Rules {
	    COMMENTLINE,
	    DESCRIPTIONLINE,
	    TEXT,
	    EOL,
	    DIGIT,
	    LETTER,
	    SYMBOL,
	    SEQUENCELINE
	}


	init {
		this.interpreter = LexerATNSimulator(this, ATN, decisionToDFA as Array<DFA?>, sharedContextCache)
	}

}