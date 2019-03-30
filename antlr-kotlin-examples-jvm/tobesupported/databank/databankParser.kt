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

class databankParser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(databankParser.DatabankContext::class,
                                                              databankParser.DatedseriesContext::class,
                                                              databankParser.UndatedseriesContext::class,
                                                              databankParser.DatatypeContext::class,
                                                              databankParser.DatelineContext::class,
                                                              databankParser.SampleContext::class,
                                                              databankParser.NumberContext::class)
    }

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "databank.g4"

    override val tokenNames: Array<String?>?
        get() = databankParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = databankParser.Companion.ruleNames
    override val atn: ATN
        get() = databankParser.Companion.ATN

    enum class Tokens(val id: Int) {
        EOF(-1),
        T__0(1),
        T__1(2),
        T__2(3),
        T__3(4),
        FLOATINGPOINT(5),
        COMMENT(6),
        EOL(7),
        WS(8)
    }

    enum class Rules(val id: Int) {
        RULE_databank(0),
        RULE_datedseries(1),
        RULE_undatedseries(2),
        RULE_datatype(3),
        RULE_dateline(4),
        RULE_sample(5),
        RULE_number(6)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("databank", "datedseries", "undatedseries", 
                                "datatype", "dateline", "sample", "number")

        private val LITERAL_NAMES = Arrays.asList<String?>(null, "'-1'", 
                                                           "'-4'", "'-12'", 
                                                           "'NA'")
        private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, null, 
                                                            null, null, 
                                                            null, "FLOATINGPOINT", 
                                                            "COMMENT", "EOL", 
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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u000a\u0036\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0003\u0002\u0007\u0002\u0012\u000a\u0002\u000c\u0002\u000e\u0002\u0015\u000b\u0002\u0003\u0002\u0003\u0002\u0005\u0002\u0019\u000a\u0002\u0003\u0002\u0006\u0002\u001c\u000a\u0002\u000d\u0002\u000e\u0002\u001d\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0005\u0007\u002f\u000a\u0007\u0003\u0007\u0005\u0007\u0032\u000a\u0007\u0003\u0008\u0003\u0008\u0003\u0008\u0002\u0002\u0009\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0002\u0003\u0003\u0002\u0003\u0005\u0002\u0033\u0002\u0013\u0003\u0002\u0002\u0002\u0004\u001f\u0003\u0002\u0002\u0002\u0006\u0023\u0003\u0002\u0002\u0002\u0008\u0026\u0003\u0002\u0002\u0002\u000a\u0029\u0003\u0002\u0002\u0002\u000c\u002e\u0003\u0002\u0002\u0002\u000e\u0033\u0003\u0002\u0002\u0002\u0010\u0012\u0007\u0009\u0002\u0002\u0011\u0010\u0003\u0002\u0002\u0002\u0012\u0015\u0003\u0002\u0002\u0002\u0013\u0011\u0003\u0002\u0002\u0002\u0013\u0014\u0003\u0002\u0002\u0002\u0014\u0018\u0003\u0002\u0002\u0002\u0015\u0013\u0003\u0002\u0002\u0002\u0016\u0019\u0005\u0004\u0003\u0002\u0017\u0019\u0005\u0006\u0004\u0002\u0018\u0016\u0003\u0002\u0002\u0002\u0018\u0017\u0003\u0002\u0002\u0002\u0019\u001b\u0003\u0002\u0002\u0002\u001a\u001c\u0005\u000c\u0007\u0002\u001b\u001a\u0003\u0002\u0002\u0002\u001c\u001d\u0003\u0002\u0002\u0002\u001d\u001b\u0003\u0002\u0002\u0002\u001d\u001e\u0003\u0002\u0002\u0002\u001e\u0003\u0003\u0002\u0002\u0002\u001f\u0020\u0005\u0008\u0005\u0002\u0020\u0021\u0005\u000a\u0006\u0002\u0021\u0022\u0005\u000a\u0006\u0002\u0022\u0005\u0003\u0002\u0002\u0002\u0023\u0024\u0005\u000a\u0006\u0002\u0024\u0025\u0005\u000a\u0006\u0002\u0025\u0007\u0003\u0002\u0002\u0002\u0026\u0027\u0009\u0002\u0002\u0002\u0027\u0028\u0007\u0009\u0002\u0002\u0028\u0009\u0003\u0002\u0002\u0002\u0029\u002a\u0005\u000e\u0008\u0002\u002a\u002b\u0007\u0009\u0002\u0002\u002b\u000b\u0003\u0002\u0002\u0002\u002c\u002f\u0005\u000e\u0008\u0002\u002d\u002f\u0007\u0006\u0002\u0002\u002e\u002c\u0003\u0002\u0002\u0002\u002e\u002d\u0003\u0002\u0002\u0002\u002f\u0031\u0003\u0002\u0002\u0002\u0030\u0032\u0007\u0009\u0002\u0002\u0031\u0030\u0003\u0002\u0002\u0002\u0031\u0032\u0003\u0002\u0002\u0002\u0032\u000d\u0003\u0002\u0002\u0002\u0033\u0034\u0007\u0007\u0002\u0002\u0034\u000f\u0003\u0002\u0002\u0002\u0007\u0013\u0018\u001d\u002e\u0031"

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
    private val T__3 = Tokens.T__3.id
    private val FLOATINGPOINT = Tokens.FLOATINGPOINT.id
    private val COMMENT = Tokens.COMMENT.id
    private val EOL = Tokens.EOL.id
    private val WS = Tokens.WS.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class DatabankContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_databank.id
	        set(value) { throw RuntimeException() }
		fun findDatedseries() : DatedseriesContext? = getRuleContext(solver.getType("DatedseriesContext"),0)
		fun findUndatedseries() : UndatedseriesContext? = getRuleContext(solver.getType("UndatedseriesContext"),0)
		fun EOL() : List<TerminalNode> = getTokens(databankParser.Tokens.EOL.id)
		fun EOL(i: Int) : TerminalNode = getToken(databankParser.Tokens.EOL.id, i) as TerminalNode
		fun findSample() : List<SampleContext> = getRuleContexts(solver.getType("SampleContext"))
		fun findSample(i: Int) : SampleContext? = getRuleContext(solver.getType("SampleContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is databankListener ) (listener as databankListener).enterDatabank(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is databankListener ) (listener as databankListener).exitDatabank(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is databankVisitor ) return (visitor as databankVisitor<out T>).visitDatabank(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  databank() : DatabankContext {
		var _localctx : DatabankContext = DatabankContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_databank.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 17
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==EOL) {
				if (true){
				if (true){
				this.state = 14
				match(EOL) as Token
				}
				}
				this.state = 19
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 22
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			T__0 , T__1 , T__2  ->  /*LL1AltBlock*/{if (true){
			this.state = 20
			datedseries()
			}}
			FLOATINGPOINT  ->  /*LL1AltBlock*/{if (true){
			this.state = 21
			undatedseries()
			}}
			else -> throw NoViableAltException(this)
			}
			this.state = 25 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 24
				sample()
				}
				}
				this.state = 27 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__3 || _la==FLOATINGPOINT )
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

	open class DatedseriesContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_datedseries.id
	        set(value) { throw RuntimeException() }
		fun findDatatype() : DatatypeContext? = getRuleContext(solver.getType("DatatypeContext"),0)
		fun findDateline() : List<DatelineContext> = getRuleContexts(solver.getType("DatelineContext"))
		fun findDateline(i: Int) : DatelineContext? = getRuleContext(solver.getType("DatelineContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is databankListener ) (listener as databankListener).enterDatedseries(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is databankListener ) (listener as databankListener).exitDatedseries(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is databankVisitor ) return (visitor as databankVisitor<out T>).visitDatedseries(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  datedseries() : DatedseriesContext {
		var _localctx : DatedseriesContext = DatedseriesContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_datedseries.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 29
			datatype()
			this.state = 30
			dateline()
			this.state = 31
			dateline()
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

	open class UndatedseriesContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_undatedseries.id
	        set(value) { throw RuntimeException() }
		fun findDateline() : List<DatelineContext> = getRuleContexts(solver.getType("DatelineContext"))
		fun findDateline(i: Int) : DatelineContext? = getRuleContext(solver.getType("DatelineContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is databankListener ) (listener as databankListener).enterUndatedseries(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is databankListener ) (listener as databankListener).exitUndatedseries(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is databankVisitor ) return (visitor as databankVisitor<out T>).visitUndatedseries(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  undatedseries() : UndatedseriesContext {
		var _localctx : UndatedseriesContext = UndatedseriesContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_undatedseries.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 33
			dateline()
			this.state = 34
			dateline()
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

	open class DatatypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_datatype.id
	        set(value) { throw RuntimeException() }
		fun EOL() : TerminalNode? = getToken(databankParser.Tokens.EOL.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is databankListener ) (listener as databankListener).enterDatatype(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is databankListener ) (listener as databankListener).exitDatatype(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is databankVisitor ) return (visitor as databankVisitor<out T>).visitDatatype(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  datatype() : DatatypeContext {
		var _localctx : DatatypeContext = DatatypeContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_datatype.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 36
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__0) or (1L shl T__1) or (1L shl T__2))) != 0L)) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 37
			match(EOL) as Token
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

	open class DatelineContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_dateline.id
	        set(value) { throw RuntimeException() }
		fun findNumber() : NumberContext? = getRuleContext(solver.getType("NumberContext"),0)
		fun EOL() : TerminalNode? = getToken(databankParser.Tokens.EOL.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is databankListener ) (listener as databankListener).enterDateline(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is databankListener ) (listener as databankListener).exitDateline(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is databankVisitor ) return (visitor as databankVisitor<out T>).visitDateline(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  dateline() : DatelineContext {
		var _localctx : DatelineContext = DatelineContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_dateline.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 39
			number()
			this.state = 40
			match(EOL) as Token
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

	open class SampleContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_sample.id
	        set(value) { throw RuntimeException() }
		fun findNumber() : NumberContext? = getRuleContext(solver.getType("NumberContext"),0)
		fun EOL() : TerminalNode? = getToken(databankParser.Tokens.EOL.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is databankListener ) (listener as databankListener).enterSample(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is databankListener ) (listener as databankListener).exitSample(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is databankVisitor ) return (visitor as databankVisitor<out T>).visitSample(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  sample() : SampleContext {
		var _localctx : SampleContext = SampleContext(context, state)
		enterRule(_localctx, 10, Rules.RULE_sample.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 44
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			FLOATINGPOINT  ->  /*LL1AltBlock*/{if (true){
			this.state = 42
			number()
			}}
			T__3  ->  /*LL1AltBlock*/{if (true){
			this.state = 43
			match(T__3) as Token
			}}
			else -> throw NoViableAltException(this)
			}
			this.state = 47
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==EOL) {
				if (true){
				this.state = 46
				match(EOL) as Token
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

	open class NumberContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_number.id
	        set(value) { throw RuntimeException() }
		fun FLOATINGPOINT() : TerminalNode? = getToken(databankParser.Tokens.FLOATINGPOINT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is databankListener ) (listener as databankListener).enterNumber(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is databankListener ) (listener as databankListener).exitNumber(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is databankVisitor ) return (visitor as databankVisitor<out T>).visitNumber(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  number() : NumberContext {
		var _localctx : NumberContext = NumberContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_number.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 49
			match(FLOATINGPOINT) as Token
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