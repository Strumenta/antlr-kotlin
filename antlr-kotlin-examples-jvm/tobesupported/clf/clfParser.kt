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

class clfParser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(clfParser.LogContext::class,
                                                              clfParser.LineContext::class,
                                                              clfParser.HostContext::class,
                                                              clfParser.LognameContext::class,
                                                              clfParser.UsernameContext::class,
                                                              clfParser.DatetimetzContext::class,
                                                              clfParser.RefererContext::class,
                                                              clfParser.RequestContext::class,
                                                              clfParser.UseragentContext::class,
                                                              clfParser.StatuscodeContext::class,
                                                              clfParser.BytesContext::class)
    }

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "clf.g4"

    override val tokenNames: Array<String?>?
        get() = clfParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = clfParser.Companion.ruleNames
    override val atn: ATN
        get() = clfParser.Companion.ATN

    enum class Tokens(val id: Int) {
        EOF(-1),
        T__0(1),
        T__1(2),
        T__2(3),
        DATE(4),
        TIME(5),
        TZ(6),
        LITERAL(7),
        IP(8),
        STRING(9),
        EOL(10),
        WS(11)
    }

    enum class Rules(val id: Int) {
        RULE_log(0),
        RULE_line(1),
        RULE_host(2),
        RULE_logname(3),
        RULE_username(4),
        RULE_datetimetz(5),
        RULE_referer(6),
        RULE_request(7),
        RULE_useragent(8),
        RULE_statuscode(9),
        RULE_bytes(10)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("log", "line", "host", "logname", "username", 
                                "datetimetz", "referer", "request", "useragent", 
                                "statuscode", "bytes")

        private val LITERAL_NAMES = Arrays.asList<String?>(null, "'['", 
                                                           "':'", "']'")
        private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, null, 
                                                            null, null, 
                                                            "DATE", "TIME", 
                                                            "TZ", "LITERAL", 
                                                            "IP", "STRING", 
                                                            "EOL", "WS")

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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u000d\u0047\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0003\u0002\u0005\u0002\u001a\u000a\u0002\u0003\u0002\u0006\u0002\u001d\u000a\u0002\u000d\u0002\u000e\u0002\u001e\u0003\u0002\u0005\u0002\u0022\u000a\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0005\u0003\u002e\u000a\u0003\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000b\u0003\u000b\u0003\u000c\u0003\u000c\u0003\u000c\u0002\u0002\u000d\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0002\u0003\u0003\u0002\u000a\u000b\u0002\u003f\u0002\u001c\u0003\u0002\u0002\u0002\u0004\u0023\u0003\u0002\u0002\u0002\u0006\u002f\u0003\u0002\u0002\u0002\u0008\u0031\u0003\u0002\u0002\u0002\u000a\u0033\u0003\u0002\u0002\u0002\u000c\u0035\u0003\u0002\u0002\u0002\u000e\u003c\u0003\u0002\u0002\u0002\u0010\u003e\u0003\u0002\u0002\u0002\u0012\u0040\u0003\u0002\u0002\u0002\u0014\u0042\u0003\u0002\u0002\u0002\u0016\u0044\u0003\u0002\u0002\u0002\u0018\u001a\u0005\u0004\u0003\u0002\u0019\u0018\u0003\u0002\u0002\u0002\u0019\u001a\u0003\u0002\u0002\u0002\u001a\u001b\u0003\u0002\u0002\u0002\u001b\u001d\u0007\u000c\u0002\u0002\u001c\u0019\u0003\u0002\u0002\u0002\u001d\u001e\u0003\u0002\u0002\u0002\u001e\u001c\u0003\u0002\u0002\u0002\u001e\u001f\u0003\u0002\u0002\u0002\u001f\u0021\u0003\u0002\u0002\u0002\u0020\u0022\u0005\u0004\u0003\u0002\u0021\u0020\u0003\u0002\u0002\u0002\u0021\u0022\u0003\u0002\u0002\u0002\u0022\u0003\u0003\u0002\u0002\u0002\u0023\u0024\u0005\u0006\u0004\u0002\u0024\u0025\u0005\u0008\u0005\u0002\u0025\u0026\u0005\u000a\u0006\u0002\u0026\u0027\u0005\u000c\u0007\u0002\u0027\u0028\u0005\u0010\u0009\u0002\u0028\u0029\u0005\u0014\u000b\u0002\u0029\u002d\u0005\u0016\u000c\u0002\u002a\u002b\u0005\u000e\u0008\u0002\u002b\u002c\u0005\u0012\u000a\u0002\u002c\u002e\u0003\u0002\u0002\u0002\u002d\u002a\u0003\u0002\u0002\u0002\u002d\u002e\u0003\u0002\u0002\u0002\u002e\u0005\u0003\u0002\u0002\u0002\u002f\u0030\u0009\u0002\u0002\u0002\u0030\u0007\u0003\u0002\u0002\u0002\u0031\u0032\u0007\u000b\u0002\u0002\u0032\u0009\u0003\u0002\u0002\u0002\u0033\u0034\u0007\u000b\u0002\u0002\u0034\u000b\u0003\u0002\u0002\u0002\u0035\u0036\u0007\u0003\u0002\u0002\u0036\u0037\u0007\u0006\u0002\u0002\u0037\u0038\u0007\u0004\u0002\u0002\u0038\u0039\u0007\u0007\u0002\u0002\u0039\u003a\u0007\u0008\u0002\u0002\u003a\u003b\u0007\u0005\u0002\u0002\u003b\u000d\u0003\u0002\u0002\u0002\u003c\u003d\u0007\u0009\u0002\u0002\u003d\u000f\u0003\u0002\u0002\u0002\u003e\u003f\u0007\u0009\u0002\u0002\u003f\u0011\u0003\u0002\u0002\u0002\u0040\u0041\u0007\u0009\u0002\u0002\u0041\u0013\u0003\u0002\u0002\u0002\u0042\u0043\u0007\u000b\u0002\u0002\u0043\u0015\u0003\u0002\u0002\u0002\u0044\u0045\u0007\u000b\u0002\u0002\u0045\u0017\u0003\u0002\u0002\u0002\u0006\u0019\u001e\u0021\u002d"

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
    private val DATE = Tokens.DATE.id
    private val TIME = Tokens.TIME.id
    private val TZ = Tokens.TZ.id
    private val LITERAL = Tokens.LITERAL.id
    private val IP = Tokens.IP.id
    private val STRING = Tokens.STRING.id
    private val EOL = Tokens.EOL.id
    private val WS = Tokens.WS.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class LogContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_log.id
	        set(value) { throw RuntimeException() }
		fun EOL() : List<TerminalNode> = getTokens(clfParser.Tokens.EOL.id)
		fun EOL(i: Int) : TerminalNode = getToken(clfParser.Tokens.EOL.id, i) as TerminalNode
		fun findLine() : List<LineContext> = getRuleContexts(solver.getType("LineContext"))
		fun findLine(i: Int) : LineContext? = getRuleContext(solver.getType("LineContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is clfListener ) (listener as clfListener).enterLog(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is clfListener ) (listener as clfListener).exitLog(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is clfVisitor ) return (visitor as clfVisitor<out T>).visitLog(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  log() : LogContext {
		var _localctx : LogContext = LogContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_log.id)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 26 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				if (true){
				this.state = 23
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				if (_la==IP || _la==STRING) {
					if (true){
					this.state = 22
					line()
					}
				}

				this.state = 25
				match(EOL) as Token
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 28 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,1,context)
			} while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER )
			this.state = 31
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==IP || _la==STRING) {
				if (true){
				this.state = 30
				line()
				}
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

	open class LineContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_line.id
	        set(value) { throw RuntimeException() }
		fun findHost() : HostContext? = getRuleContext(solver.getType("HostContext"),0)
		fun findLogname() : LognameContext? = getRuleContext(solver.getType("LognameContext"),0)
		fun findUsername() : UsernameContext? = getRuleContext(solver.getType("UsernameContext"),0)
		fun findDatetimetz() : DatetimetzContext? = getRuleContext(solver.getType("DatetimetzContext"),0)
		fun findRequest() : RequestContext? = getRuleContext(solver.getType("RequestContext"),0)
		fun findStatuscode() : StatuscodeContext? = getRuleContext(solver.getType("StatuscodeContext"),0)
		fun findBytes() : BytesContext? = getRuleContext(solver.getType("BytesContext"),0)
		fun findReferer() : RefererContext? = getRuleContext(solver.getType("RefererContext"),0)
		fun findUseragent() : UseragentContext? = getRuleContext(solver.getType("UseragentContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is clfListener ) (listener as clfListener).enterLine(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is clfListener ) (listener as clfListener).exitLine(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is clfVisitor ) return (visitor as clfVisitor<out T>).visitLine(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  line() : LineContext {
		var _localctx : LineContext = LineContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_line.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 33
			host()
			this.state = 34
			logname()
			this.state = 35
			username()
			this.state = 36
			datetimetz()
			this.state = 37
			request()
			this.state = 38
			statuscode()
			this.state = 39
			bytes()
			this.state = 43
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LITERAL) {
				if (true){
				this.state = 40
				referer()
				this.state = 41
				useragent()
				}
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

	open class HostContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_host.id
	        set(value) { throw RuntimeException() }
		fun STRING() : TerminalNode? = getToken(clfParser.Tokens.STRING.id, 0)
		fun IP() : TerminalNode? = getToken(clfParser.Tokens.IP.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is clfListener ) (listener as clfListener).enterHost(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is clfListener ) (listener as clfListener).exitHost(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is clfVisitor ) return (visitor as clfVisitor<out T>).visitHost(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  host() : HostContext {
		var _localctx : HostContext = HostContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_host.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 45
			_la = _input!!.LA(1)
			if ( !(_la==IP || _la==STRING) ) {
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

	open class LognameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_logname.id
	        set(value) { throw RuntimeException() }
		fun STRING() : TerminalNode? = getToken(clfParser.Tokens.STRING.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is clfListener ) (listener as clfListener).enterLogname(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is clfListener ) (listener as clfListener).exitLogname(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is clfVisitor ) return (visitor as clfVisitor<out T>).visitLogname(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  logname() : LognameContext {
		var _localctx : LognameContext = LognameContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_logname.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 47
			match(STRING) as Token
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

	open class UsernameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_username.id
	        set(value) { throw RuntimeException() }
		fun STRING() : TerminalNode? = getToken(clfParser.Tokens.STRING.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is clfListener ) (listener as clfListener).enterUsername(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is clfListener ) (listener as clfListener).exitUsername(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is clfVisitor ) return (visitor as clfVisitor<out T>).visitUsername(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  username() : UsernameContext {
		var _localctx : UsernameContext = UsernameContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_username.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 49
			match(STRING) as Token
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

	open class DatetimetzContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_datetimetz.id
	        set(value) { throw RuntimeException() }
		fun DATE() : TerminalNode? = getToken(clfParser.Tokens.DATE.id, 0)
		fun TIME() : TerminalNode? = getToken(clfParser.Tokens.TIME.id, 0)
		fun TZ() : TerminalNode? = getToken(clfParser.Tokens.TZ.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is clfListener ) (listener as clfListener).enterDatetimetz(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is clfListener ) (listener as clfListener).exitDatetimetz(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is clfVisitor ) return (visitor as clfVisitor<out T>).visitDatetimetz(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  datetimetz() : DatetimetzContext {
		var _localctx : DatetimetzContext = DatetimetzContext(context, state)
		enterRule(_localctx, 10, Rules.RULE_datetimetz.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 51
			match(T__0) as Token
			this.state = 52
			match(DATE) as Token
			this.state = 53
			match(T__1) as Token
			this.state = 54
			match(TIME) as Token
			this.state = 55
			match(TZ) as Token
			this.state = 56
			match(T__2) as Token
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

	open class RefererContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_referer.id
	        set(value) { throw RuntimeException() }
		fun LITERAL() : TerminalNode? = getToken(clfParser.Tokens.LITERAL.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is clfListener ) (listener as clfListener).enterReferer(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is clfListener ) (listener as clfListener).exitReferer(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is clfVisitor ) return (visitor as clfVisitor<out T>).visitReferer(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  referer() : RefererContext {
		var _localctx : RefererContext = RefererContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_referer.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 58
			match(LITERAL) as Token
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

	open class RequestContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_request.id
	        set(value) { throw RuntimeException() }
		fun LITERAL() : TerminalNode? = getToken(clfParser.Tokens.LITERAL.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is clfListener ) (listener as clfListener).enterRequest(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is clfListener ) (listener as clfListener).exitRequest(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is clfVisitor ) return (visitor as clfVisitor<out T>).visitRequest(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  request() : RequestContext {
		var _localctx : RequestContext = RequestContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_request.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 60
			match(LITERAL) as Token
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

	open class UseragentContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_useragent.id
	        set(value) { throw RuntimeException() }
		fun LITERAL() : TerminalNode? = getToken(clfParser.Tokens.LITERAL.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is clfListener ) (listener as clfListener).enterUseragent(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is clfListener ) (listener as clfListener).exitUseragent(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is clfVisitor ) return (visitor as clfVisitor<out T>).visitUseragent(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  useragent() : UseragentContext {
		var _localctx : UseragentContext = UseragentContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_useragent.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 62
			match(LITERAL) as Token
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

	open class StatuscodeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_statuscode.id
	        set(value) { throw RuntimeException() }
		fun STRING() : TerminalNode? = getToken(clfParser.Tokens.STRING.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is clfListener ) (listener as clfListener).enterStatuscode(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is clfListener ) (listener as clfListener).exitStatuscode(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is clfVisitor ) return (visitor as clfVisitor<out T>).visitStatuscode(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  statuscode() : StatuscodeContext {
		var _localctx : StatuscodeContext = StatuscodeContext(context, state)
		enterRule(_localctx, 18, Rules.RULE_statuscode.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 64
			match(STRING) as Token
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

	open class BytesContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_bytes.id
	        set(value) { throw RuntimeException() }
		fun STRING() : TerminalNode? = getToken(clfParser.Tokens.STRING.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is clfListener ) (listener as clfListener).enterBytes(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is clfListener ) (listener as clfListener).exitBytes(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is clfVisitor ) return (visitor as clfVisitor<out T>).visitBytes(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  bytes() : BytesContext {
		var _localctx : BytesContext = BytesContext(context, state)
		enterRule(_localctx, 20, Rules.RULE_bytes.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 66
			match(STRING) as Token
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