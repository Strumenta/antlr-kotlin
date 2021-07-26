// Generated from java-escape by ANTLR 4.7.1
package com.strumenta.antlrkotlin.examples;
import com.strumenta.kotlinmultiplatform.asCharArray
import com.strumenta.kotlinmultiplatform.getType
import com.strumenta.kotlinmultiplatform.TypeDeclarator
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

class DiceNotationParser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(DiceNotationParser.ParseContext::class,
                                                              DiceNotationParser.FunctionContext::class,
                                                              DiceNotationParser.BinaryOpContext::class,
                                                              DiceNotationParser.DiceContext::class)
    }

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "DiceNotation.g4"

    override val tokenNames: Array<String?>?
        get() = DiceNotationParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = DiceNotationParser.Companion.ruleNames
    override val atn: ATN
        get() = DiceNotationParser.Companion.ATN
    override val vocabulary: Vocabulary
        get() = DiceNotationParser.Companion.VOCABULARY

    enum class Tokens(val id: Int) {
        EOF(-1),
        OPERATOR(1),
        ADD(2),
        SUB(3),
        DSEPARATOR(4),
        DIGIT(5),
        WS(6)
    }

    enum class Rules(val id: Int) {
        RULE_parse(0),
        RULE_function(1),
        RULE_binaryOp(2),
        RULE_dice(3)
    }

	@ThreadLocal
	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("parse", "function", "binaryOp", "dice")

        private val LITERAL_NAMES: List<String?> = listOf(null, null, "'+'", 
                                                          "'-'")
        private val SYMBOLIC_NAMES: List<String?> = listOf(null, "OPERATOR", 
                                                           "ADD", "SUB", 
                                                           "DSEPARATOR", 
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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u0008\u001f\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0005\u0003\u0010\u000a\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0005\u0004\u0019\u000a\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0002\u0002\u0006\u0002\u0004\u0006\u0008\u0002\u0002\u0002\u001d\u0002\u000a\u0003\u0002\u0002\u0002\u0004\u000f\u0003\u0002\u0002\u0002\u0006\u0018\u0003\u0002\u0002\u0002\u0008\u001a\u0003\u0002\u0002\u0002\u000a\u000b\u0005\u0004\u0003\u0002\u000b\u0003\u0003\u0002\u0002\u0002\u000c\u0010\u0005\u0008\u0005\u0002\u000d\u0010\u0005\u0006\u0004\u0002\u000e\u0010\u0007\u0007\u0002\u0002\u000f\u000c\u0003\u0002\u0002\u0002\u000f\u000d\u0003\u0002\u0002\u0002\u000f\u000e\u0003\u0002\u0002\u0002\u0010\u0005\u0003\u0002\u0002\u0002\u0011\u0012\u0005\u0008\u0005\u0002\u0012\u0013\u0007\u0003\u0002\u0002\u0013\u0014\u0005\u0004\u0003\u0002\u0014\u0019\u0003\u0002\u0002\u0002\u0015\u0016\u0007\u0007\u0002\u0002\u0016\u0017\u0007\u0003\u0002\u0002\u0017\u0019\u0005\u0004\u0003\u0002\u0018\u0011\u0003\u0002\u0002\u0002\u0018\u0015\u0003\u0002\u0002\u0002\u0019\u0007\u0003\u0002\u0002\u0002\u001a\u001b\u0007\u0007\u0002\u0002\u001b\u001c\u0007\u0006\u0002\u0002\u001c\u001d\u0007\u0007\u0002\u0002\u001d\u0009\u0003\u0002\u0002\u0002\u0004\u000f\u0018"

        val ATN = ATNDeserializer().deserialize(serializedATN.asCharArray())
        init {
        	decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
        		DFA(ATN.getDecisionState(it)!!, it)
        	})


        }
	}

    private val OPERATOR = Tokens.OPERATOR.id
    private val ADD = Tokens.ADD.id
    private val SUB = Tokens.SUB.id
    private val DSEPARATOR = Tokens.DSEPARATOR.id
    private val DIGIT = Tokens.DIGIT.id
    private val WS = Tokens.WS.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class ParseContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_parse.id
	        set(value) { throw RuntimeException() }
		fun findFunction() : FunctionContext? = getRuleContext(solver.getType("FunctionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  parse() : ParseContext {
		var _localctx : ParseContext = ParseContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_parse.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 8
			function()
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

	open class FunctionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_function.id
	        set(value) { throw RuntimeException() }
		fun findDice() : DiceContext? = getRuleContext(solver.getType("DiceContext"),0)
		fun findBinaryOp() : BinaryOpContext? = getRuleContext(solver.getType("BinaryOpContext"),0)
		fun DIGIT() : TerminalNode? = getToken(DiceNotationParser.Tokens.DIGIT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  function() : FunctionContext {
		var _localctx : FunctionContext = FunctionContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_function.id)
		try {
			this.state = 13
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,0,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 10
			dice()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 11
			binaryOp()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 12
			match(DIGIT) as Token
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

	open class BinaryOpContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_binaryOp.id
	        set(value) { throw RuntimeException() }
		fun findDice() : DiceContext? = getRuleContext(solver.getType("DiceContext"),0)
		fun OPERATOR() : TerminalNode? = getToken(DiceNotationParser.Tokens.OPERATOR.id, 0)
		fun findFunction() : FunctionContext? = getRuleContext(solver.getType("FunctionContext"),0)
		fun DIGIT() : TerminalNode? = getToken(DiceNotationParser.Tokens.DIGIT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  binaryOp() : BinaryOpContext {
		var _localctx : BinaryOpContext = BinaryOpContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_binaryOp.id)
		try {
			this.state = 22
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,1,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 15
			dice()
			this.state = 16
			match(OPERATOR) as Token
			this.state = 17
			function()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 19
			match(DIGIT) as Token
			this.state = 20
			match(OPERATOR) as Token
			this.state = 21
			function()
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

	open class DiceContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_dice.id
	        set(value) { throw RuntimeException() }
		fun DIGIT() : List<TerminalNode> = getTokens(DiceNotationParser.Tokens.DIGIT.id)
		fun DIGIT(i: Int) : TerminalNode = getToken(DiceNotationParser.Tokens.DIGIT.id, i) as TerminalNode
		fun DSEPARATOR() : TerminalNode? = getToken(DiceNotationParser.Tokens.DSEPARATOR.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  dice() : DiceContext {
		var _localctx : DiceContext = DiceContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_dice.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 24
			match(DIGIT) as Token
			this.state = 25
			match(DSEPARATOR) as Token
			this.state = 26
			match(DIGIT) as Token
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