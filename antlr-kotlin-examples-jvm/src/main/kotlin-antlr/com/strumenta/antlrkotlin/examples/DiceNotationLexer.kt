// Generated from java-escape by ANTLR 4.7.1
package com.strumenta.antlrkotlin.examples

import com.strumenta.kotlinmultiplatform.asCharArray
import org.antlr.v4.kotlinruntime.CharStream
import org.antlr.v4.kotlinruntime.Lexer
import org.antlr.v4.kotlinruntime.ThreadLocal
import org.antlr.v4.kotlinruntime.Vocabulary
import org.antlr.v4.kotlinruntime.VocabularyImpl
import org.antlr.v4.kotlinruntime.atn.ATN
import org.antlr.v4.kotlinruntime.atn.ATNDeserializer
import org.antlr.v4.kotlinruntime.atn.LexerATNSimulator
import org.antlr.v4.kotlinruntime.atn.PredictionContextCache
import org.antlr.v4.kotlinruntime.dfa.DFA

class DiceNotationLexer(val input: CharStream) : Lexer(input) {
	// TODO Verify the runtime version is correct

    override val ruleNames: Array<String>?
        get() = Rules.values().map { it.name }.toTypedArray()

    override val grammarFileName: String
        get() = "DiceNotationLexer.g4"

    override val atn: ATN
		get() = DiceNotationLexer.Companion.ATN

    override val vocabulary: Vocabulary
        get() = DiceNotationLexer.Companion.VOCABULARY

	@ThreadLocal
	companion object {
		val decisionToDFA : Array<DFA>
		val sharedContextCache = PredictionContextCache()

		private val LITERAL_NAMES: List<String?> = listOf(null, null, "'+'", "'-'")
		private val SYMBOLIC_NAMES: List<String?> = listOf(null, "OPERATOR", "ADD", 
		                                                   "SUB", "DSEPARATOR", 
		                                                   "DIGIT", "WS")

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

		private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0002\u0008\u0025\u0008\u0001\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0003\u0002\u0003\u0002\u0005\u0002\u0012\u000a\u0002\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0006\u0006\u0006\u001b\u000a\u0006\u000d\u0006\u000e\u0006\u001c\u0003\u0007\u0006\u0007\u0020\u000a\u0007\u000d\u0007\u000e\u0007\u0021\u0003\u0007\u0003\u0007\u0002\u0002\u0008\u0003\u0003\u0005\u0004\u0007\u0005\u0009\u0006\u000b\u0007\u000d\u0008\u0003\u0002\u0004\u0004\u0002\u0046\u0046\u0066\u0066\u0004\u0002\u000b\u000c\u000f\u000f\u0002\u0027\u0002\u0003\u0003\u0002\u0002\u0002\u0002\u0005\u0003\u0002\u0002\u0002\u0002\u0007\u0003\u0002\u0002\u0002\u0002\u0009\u0003\u0002\u0002\u0002\u0002\u000b\u0003\u0002\u0002\u0002\u0002\u000d\u0003\u0002\u0002\u0002\u0003\u0011\u0003\u0002\u0002\u0002\u0005\u0013\u0003\u0002\u0002\u0002\u0007\u0015\u0003\u0002\u0002\u0002\u0009\u0017\u0003\u0002\u0002\u0002\u000b\u001a\u0003\u0002\u0002\u0002\u000d\u001f\u0003\u0002\u0002\u0002\u000f\u0012\u0005\u0005\u0003\u0002\u0010\u0012\u0005\u0007\u0004\u0002\u0011\u000f\u0003\u0002\u0002\u0002\u0011\u0010\u0003\u0002\u0002\u0002\u0012\u0004\u0003\u0002\u0002\u0002\u0013\u0014\u0007\u002d\u0002\u0002\u0014\u0006\u0003\u0002\u0002\u0002\u0015\u0016\u0007\u002f\u0002\u0002\u0016\u0008\u0003\u0002\u0002\u0002\u0017\u0018\u0009\u0002\u0002\u0002\u0018\u000a\u0003\u0002\u0002\u0002\u0019\u001b\u0004\u0032\u003b\u0002\u001a\u0019\u0003\u0002\u0002\u0002\u001b\u001c\u0003\u0002\u0002\u0002\u001c\u001a\u0003\u0002\u0002\u0002\u001c\u001d\u0003\u0002\u0002\u0002\u001d\u000c\u0003\u0002\u0002\u0002\u001e\u0020\u0009\u0003\u0002\u0002\u001f\u001e\u0003\u0002\u0002\u0002\u0020\u0021\u0003\u0002\u0002\u0002\u0021\u001f\u0003\u0002\u0002\u0002\u0021\u0022\u0003\u0002\u0002\u0002\u0022\u0023\u0003\u0002\u0002\u0002\u0023\u0024\u0008\u0007\u0002\u0002\u0024\u000e\u0003\u0002\u0002\u0002\u0006\u0002\u0011\u001c\u0021\u0003\u0008\u0002\u0002"

		val ATN = ATNDeserializer().deserialize(serializedATN.asCharArray())
		init {
			decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
				DFA(ATN.getDecisionState(it)!!, it)
			})


		}
	}

    enum class Tokens(val id: Int) {
	    OPERATOR(1),
	    ADD(2),
	    SUB(3),
	    DSEPARATOR(4),
	    DIGIT(5),
	    WS(6)
    }

	enum class Channels(val id: Int) {
		DEFAULT_TOKEN_CHANNEL(0),
		HIDDEN(1),
	}

	override val channelNames = Channels.values().map(Channels::name).toTypedArray()

	enum class Modes(val id: Int) {
		DEFAULT_MODE(0),
	}

	enum class Rules {
	    OPERATOR,
	    ADD,
	    SUB,
	    DSEPARATOR,
	    DIGIT,
	    WS
	}


	init {
		this.interpreter = LexerATNSimulator(this, ATN, decisionToDFA as Array<DFA?>, sharedContextCache)
	}

}