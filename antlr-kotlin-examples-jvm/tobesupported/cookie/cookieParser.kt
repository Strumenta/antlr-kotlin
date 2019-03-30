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

class cookieParser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(cookieParser.CookieContext::class,
                                                              cookieParser.NameContext::class,
                                                              cookieParser.Av_pairsContext::class,
                                                              cookieParser.Av_pairContext::class,
                                                              cookieParser.AttrContext::class,
                                                              cookieParser.ValueContext::class,
                                                              cookieParser.WordContext::class,
                                                              cookieParser.TokenContext::class,
                                                              cookieParser.Quoted_stringContext::class)
    }

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "cookie.g4"

    override val tokenNames: Array<String?>?
        get() = cookieParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = cookieParser.Companion.ruleNames
    override val atn: ATN
        get() = cookieParser.Companion.ATN

    enum class Tokens(val id: Int) {
        EOF(-1),
        T__0(1),
        T__1(2),
        STRING(3),
        TOKEN(4),
        DIGIT(5),
        WS(6)
    }

    enum class Rules(val id: Int) {
        RULE_cookie(0),
        RULE_name(1),
        RULE_av_pairs(2),
        RULE_av_pair(3),
        RULE_attr(4),
        RULE_value(5),
        RULE_word(6),
        RULE_token(7),
        RULE_quoted_string(8)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("cookie", "name", "av_pairs", "av_pair", 
                                "attr", "value", "word", "token", "quoted_string")

        private val LITERAL_NAMES = Arrays.asList<String?>(null, "';'", 
                                                           "'='")
        private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, null, 
                                                            null, "STRING", 
                                                            "TOKEN", "DIGIT", 
                                                            "WS")

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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u0008\u0036\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0003\u0002\u0007\u0002\u0016\u000a\u0002\u000c\u0002\u000e\u0002\u0019\u000b\u0002\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0007\u0004\u0020\u000a\u0004\u000c\u0004\u000e\u0004\u0023\u000b\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005\u0028\u000a\u0005\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0005\u0008\u0030\u000a\u0008\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0002\u0002\u000b\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0002\u0002\u0002\u0030\u0002\u0017\u0003\u0002\u0002\u0002\u0004\u001a\u0003\u0002\u0002\u0002\u0006\u001c\u0003\u0002\u0002\u0002\u0008\u0024\u0003\u0002\u0002\u0002\u000a\u0029\u0003\u0002\u0002\u0002\u000c\u002b\u0003\u0002\u0002\u0002\u000e\u002f\u0003\u0002\u0002\u0002\u0010\u0031\u0003\u0002\u0002\u0002\u0012\u0033\u0003\u0002\u0002\u0002\u0014\u0016\u0005\u0006\u0004\u0002\u0015\u0014\u0003\u0002\u0002\u0002\u0016\u0019\u0003\u0002\u0002\u0002\u0017\u0015\u0003\u0002\u0002\u0002\u0017\u0018\u0003\u0002\u0002\u0002\u0018\u0003\u0003\u0002\u0002\u0002\u0019\u0017\u0003\u0002\u0002\u0002\u001a\u001b\u0005\u000a\u0006\u0002\u001b\u0005\u0003\u0002\u0002\u0002\u001c\u0021\u0005\u0008\u0005\u0002\u001d\u001e\u0007\u0003\u0002\u0002\u001e\u0020\u0005\u0008\u0005\u0002\u001f\u001d\u0003\u0002\u0002\u0002\u0020\u0023\u0003\u0002\u0002\u0002\u0021\u001f\u0003\u0002\u0002\u0002\u0021\u0022\u0003\u0002\u0002\u0002\u0022\u0007\u0003\u0002\u0002\u0002\u0023\u0021\u0003\u0002\u0002\u0002\u0024\u0027\u0005\u000a\u0006\u0002\u0025\u0026\u0007\u0004\u0002\u0002\u0026\u0028\u0005\u000c\u0007\u0002\u0027\u0025\u0003\u0002\u0002\u0002\u0027\u0028\u0003\u0002\u0002\u0002\u0028\u0009\u0003\u0002\u0002\u0002\u0029\u002a\u0005\u0010\u0009\u0002\u002a\u000b\u0003\u0002\u0002\u0002\u002b\u002c\u0005\u000e\u0008\u0002\u002c\u000d\u0003\u0002\u0002\u0002\u002d\u0030\u0005\u0010\u0009\u0002\u002e\u0030\u0005\u0012\u000a\u0002\u002f\u002d\u0003\u0002\u0002\u0002\u002f\u002e\u0003\u0002\u0002\u0002\u0030\u000f\u0003\u0002\u0002\u0002\u0031\u0032\u0007\u0006\u0002\u0002\u0032\u0011\u0003\u0002\u0002\u0002\u0033\u0034\u0007\u0005\u0002\u0002\u0034\u0013\u0003\u0002\u0002\u0002\u0006\u0017\u0021\u0027\u002f"

        val ATN = ATNDeserializer().deserialize(serializedATN.toCharArray())
        init {
        	decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
        		DFA(ATN.getDecisionState(it)!!, it)
        	})


        }
	}

    private val T__0 = Tokens.T__0.id
    private val T__1 = Tokens.T__1.id
    private val STRING = Tokens.STRING.id
    private val TOKEN = Tokens.TOKEN.id
    private val DIGIT = Tokens.DIGIT.id
    private val WS = Tokens.WS.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class CookieContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_cookie.id
	        set(value) { throw RuntimeException() }
		fun findAv_pairs() : List<Av_pairsContext> = getRuleContexts(solver.getType("Av_pairsContext"))
		fun findAv_pairs(i: Int) : Av_pairsContext? = getRuleContext(solver.getType("Av_pairsContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is cookieListener ) (listener as cookieListener).enterCookie(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is cookieListener ) (listener as cookieListener).exitCookie(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is cookieVisitor ) return (visitor as cookieVisitor<out T>).visitCookie(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  cookie() : CookieContext {
		var _localctx : CookieContext = CookieContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_cookie.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 21
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==TOKEN) {
				if (true){
				if (true){
				this.state = 18
				av_pairs()
				}
				}
				this.state = 23
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

	open class NameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_name.id
	        set(value) { throw RuntimeException() }
		fun findAttr() : AttrContext? = getRuleContext(solver.getType("AttrContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is cookieListener ) (listener as cookieListener).enterName(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is cookieListener ) (listener as cookieListener).exitName(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is cookieVisitor ) return (visitor as cookieVisitor<out T>).visitName(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  name() : NameContext {
		var _localctx : NameContext = NameContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_name.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 24
			attr()
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

	open class Av_pairsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_av_pairs.id
	        set(value) { throw RuntimeException() }
		fun findAv_pair() : List<Av_pairContext> = getRuleContexts(solver.getType("Av_pairContext"))
		fun findAv_pair(i: Int) : Av_pairContext? = getRuleContext(solver.getType("Av_pairContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is cookieListener ) (listener as cookieListener).enterAv_pairs(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is cookieListener ) (listener as cookieListener).exitAv_pairs(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is cookieVisitor ) return (visitor as cookieVisitor<out T>).visitAv_pairs(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  av_pairs() : Av_pairsContext {
		var _localctx : Av_pairsContext = Av_pairsContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_av_pairs.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 26
			av_pair()
			this.state = 31
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__0) {
				if (true){
				if (true){
				this.state = 27
				match(T__0) as Token
				this.state = 28
				av_pair()
				}
				}
				this.state = 33
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

	open class Av_pairContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_av_pair.id
	        set(value) { throw RuntimeException() }
		fun findAttr() : AttrContext? = getRuleContext(solver.getType("AttrContext"),0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is cookieListener ) (listener as cookieListener).enterAv_pair(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is cookieListener ) (listener as cookieListener).exitAv_pair(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is cookieVisitor ) return (visitor as cookieVisitor<out T>).visitAv_pair(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  av_pair() : Av_pairContext {
		var _localctx : Av_pairContext = Av_pairContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_av_pair.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 34
			attr()
			this.state = 37
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__1) {
				if (true){
				this.state = 35
				match(T__1) as Token
				this.state = 36
				value()
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

	open class AttrContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_attr.id
	        set(value) { throw RuntimeException() }
		fun findToken() : TokenContext? = getRuleContext(solver.getType("TokenContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is cookieListener ) (listener as cookieListener).enterAttr(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is cookieListener ) (listener as cookieListener).exitAttr(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is cookieVisitor ) return (visitor as cookieVisitor<out T>).visitAttr(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  attr() : AttrContext {
		var _localctx : AttrContext = AttrContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_attr.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 39
			token()
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

	open class ValueContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_value.id
	        set(value) { throw RuntimeException() }
		fun findWord() : WordContext? = getRuleContext(solver.getType("WordContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is cookieListener ) (listener as cookieListener).enterValue(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is cookieListener ) (listener as cookieListener).exitValue(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is cookieVisitor ) return (visitor as cookieVisitor<out T>).visitValue(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  value() : ValueContext {
		var _localctx : ValueContext = ValueContext(context, state)
		enterRule(_localctx, 10, Rules.RULE_value.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 41
			word()
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
		fun findToken() : TokenContext? = getRuleContext(solver.getType("TokenContext"),0)
		fun findQuoted_string() : Quoted_stringContext? = getRuleContext(solver.getType("Quoted_stringContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is cookieListener ) (listener as cookieListener).enterWord(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is cookieListener ) (listener as cookieListener).exitWord(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is cookieVisitor ) return (visitor as cookieVisitor<out T>).visitWord(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  word() : WordContext {
		var _localctx : WordContext = WordContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_word.id)
		try {
			this.state = 45
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			TOKEN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 43
			token()
			}}
			STRING  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 44
			quoted_string()
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

	open class TokenContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_token.id
	        set(value) { throw RuntimeException() }
		fun TOKEN() : TerminalNode? = getToken(cookieParser.Tokens.TOKEN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is cookieListener ) (listener as cookieListener).enterToken(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is cookieListener ) (listener as cookieListener).exitToken(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is cookieVisitor ) return (visitor as cookieVisitor<out T>).visitToken(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  token() : TokenContext {
		var _localctx : TokenContext = TokenContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_token.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 47
			match(TOKEN) as Token
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

	open class Quoted_stringContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_quoted_string.id
	        set(value) { throw RuntimeException() }
		fun STRING() : TerminalNode? = getToken(cookieParser.Tokens.STRING.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is cookieListener ) (listener as cookieListener).enterQuoted_string(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is cookieListener ) (listener as cookieListener).exitQuoted_string(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is cookieVisitor ) return (visitor as cookieVisitor<out T>).visitQuoted_string(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  quoted_string() : Quoted_stringContext {
		var _localctx : Quoted_stringContext = Quoted_stringContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_quoted_string.id)
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

}