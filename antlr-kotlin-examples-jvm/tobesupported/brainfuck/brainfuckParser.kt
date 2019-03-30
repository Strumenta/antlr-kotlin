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

class brainfuckParser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(brainfuckParser.FileContext::class,
                                                              brainfuckParser.OpcodeContext::class)
    }

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "brainfuck.g4"

    override val tokenNames: Array<String?>?
        get() = brainfuckParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = brainfuckParser.Companion.ruleNames
    override val atn: ATN
        get() = brainfuckParser.Companion.ATN

    enum class Tokens(val id: Int) {
        EOF(-1),
        GT(1),
        LT(2),
        PLUS(3),
        MINUS(4),
        DOT(5),
        COMMA(6),
        LPAREN(7),
        RPAREN(8),
        WS(9)
    }

    enum class Rules(val id: Int) {
        RULE_file(0),
        RULE_opcode(1)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("file", "opcode")

        private val LITERAL_NAMES = Arrays.asList<String?>(null, "'>'", 
                                                           "'<'", "'+'", 
                                                           "'-'", "'.'", 
                                                           "','", "'['", 
                                                           "']'")
        private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, "GT", 
                                                            "LT", "PLUS", 
                                                            "MINUS", "DOT", 
                                                            "COMMA", "LPAREN", 
                                                            "RPAREN", "WS")

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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u000b\u000e\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0003\u0002\u0006\u0002\u0008\u000a\u0002\u000d\u0002\u000e\u0002\u0009\u0003\u0003\u0003\u0003\u0003\u0003\u0002\u0002\u0004\u0002\u0004\u0002\u0003\u0003\u0002\u0003\u000a\u0002\u000c\u0002\u0007\u0003\u0002\u0002\u0002\u0004\u000b\u0003\u0002\u0002\u0002\u0006\u0008\u0005\u0004\u0003\u0002\u0007\u0006\u0003\u0002\u0002\u0002\u0008\u0009\u0003\u0002\u0002\u0002\u0009\u0007\u0003\u0002\u0002\u0002\u0009\u000a\u0003\u0002\u0002\u0002\u000a\u0003\u0003\u0002\u0002\u0002\u000b\u000c\u0009\u0002\u0002\u0002\u000c\u0005\u0003\u0002\u0002\u0002\u0003\u0009"

        val ATN = ATNDeserializer().deserialize(serializedATN.toCharArray())
        init {
        	decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
        		DFA(ATN.getDecisionState(it)!!, it)
        	})


        }
	}

    private val GT = Tokens.GT.id
    private val LT = Tokens.LT.id
    private val PLUS = Tokens.PLUS.id
    private val MINUS = Tokens.MINUS.id
    private val DOT = Tokens.DOT.id
    private val COMMA = Tokens.COMMA.id
    private val LPAREN = Tokens.LPAREN.id
    private val RPAREN = Tokens.RPAREN.id
    private val WS = Tokens.WS.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class FileContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_file.id
	        set(value) { throw RuntimeException() }
		fun findOpcode() : List<OpcodeContext> = getRuleContexts(solver.getType("OpcodeContext"))
		fun findOpcode(i: Int) : OpcodeContext? = getRuleContext(solver.getType("OpcodeContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is brainfuckListener ) (listener as brainfuckListener).enterFile(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is brainfuckListener ) (listener as brainfuckListener).exitFile(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is brainfuckVisitor ) return (visitor as brainfuckVisitor<out T>).visitFile(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  file() : FileContext {
		var _localctx : FileContext = FileContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_file.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 5 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 4
				opcode()
				}
				}
				this.state = 7 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl GT) or (1L shl LT) or (1L shl PLUS) or (1L shl MINUS) or (1L shl DOT) or (1L shl COMMA) or (1L shl LPAREN) or (1L shl RPAREN))) != 0L) )
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

	open class OpcodeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_opcode.id
	        set(value) { throw RuntimeException() }
		fun GT() : TerminalNode? = getToken(brainfuckParser.Tokens.GT.id, 0)
		fun LT() : TerminalNode? = getToken(brainfuckParser.Tokens.LT.id, 0)
		fun PLUS() : TerminalNode? = getToken(brainfuckParser.Tokens.PLUS.id, 0)
		fun MINUS() : TerminalNode? = getToken(brainfuckParser.Tokens.MINUS.id, 0)
		fun DOT() : TerminalNode? = getToken(brainfuckParser.Tokens.DOT.id, 0)
		fun COMMA() : TerminalNode? = getToken(brainfuckParser.Tokens.COMMA.id, 0)
		fun LPAREN() : TerminalNode? = getToken(brainfuckParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(brainfuckParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is brainfuckListener ) (listener as brainfuckListener).enterOpcode(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is brainfuckListener ) (listener as brainfuckListener).exitOpcode(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is brainfuckVisitor ) return (visitor as brainfuckVisitor<out T>).visitOpcode(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  opcode() : OpcodeContext {
		var _localctx : OpcodeContext = OpcodeContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_opcode.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 9
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl GT) or (1L shl LT) or (1L shl PLUS) or (1L shl MINUS) or (1L shl DOT) or (1L shl COMMA) or (1L shl LPAREN) or (1L shl RPAREN))) != 0L)) ) {
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

}