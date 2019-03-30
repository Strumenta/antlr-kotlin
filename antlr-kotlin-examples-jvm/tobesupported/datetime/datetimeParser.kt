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

class datetimeParser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(datetimeParser.Date_timeContext::class,
                                                              datetimeParser.DayContext::class,
                                                              datetimeParser.DateContext::class,
                                                              datetimeParser.MonthContext::class,
                                                              datetimeParser.TimeContext::class,
                                                              datetimeParser.HourContext::class,
                                                              datetimeParser.ZoneContext::class,
                                                              datetimeParser.Two_digitContext::class,
                                                              datetimeParser.Four_digitContext::class,
                                                              datetimeParser.AlphanumericContext::class)
    }

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "datetime.g4"

    override val tokenNames: Array<String?>?
        get() = datetimeParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = datetimeParser.Companion.ruleNames
    override val atn: ATN
        get() = datetimeParser.Companion.ATN

    enum class Tokens(val id: Int) {
        EOF(-1),
        T__0(1),
        T__1(2),
        T__2(3),
        T__3(4),
        T__4(5),
        T__5(6),
        T__6(7),
        T__7(8),
        T__8(9),
        T__9(10),
        T__10(11),
        T__11(12),
        T__12(13),
        T__13(14),
        T__14(15),
        T__15(16),
        T__16(17),
        T__17(18),
        T__18(19),
        T__19(20),
        T__20(21),
        T__21(22),
        T__22(23),
        T__23(24),
        T__24(25),
        T__25(26),
        T__26(27),
        T__27(28),
        T__28(29),
        T__29(30),
        T__30(31),
        T__31(32),
        T__32(33),
        ALPHA(34),
        DIGIT(35),
        WS(36)
    }

    enum class Rules(val id: Int) {
        RULE_date_time(0),
        RULE_day(1),
        RULE_date(2),
        RULE_month(3),
        RULE_time(4),
        RULE_hour(5),
        RULE_zone(6),
        RULE_two_digit(7),
        RULE_four_digit(8),
        RULE_alphanumeric(9)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("date_time", "day", "date", "month", "time", 
                                "hour", "zone", "two_digit", "four_digit", 
                                "alphanumeric")

        private val LITERAL_NAMES = Arrays.asList<String?>(null, "','", 
                                                           "'Mon'", "'Tue'", 
                                                           "'Wed'", "'Thu'", 
                                                           "'Fri'", "'Sat'", 
                                                           "'Sun'", "'Jan'", 
                                                           "'Feb'", "'Mar'", 
                                                           "'Apr'", "'May'", 
                                                           "'Jun'", "'Jul'", 
                                                           "'Aug'", "'Sep'", 
                                                           "'Oct'", "'Nov'", 
                                                           "'Dec'", "':'", 
                                                           "'UT'", "'GMT'", 
                                                           "'EST'", "'EDT'", 
                                                           "'CST'", "'CDT'", 
                                                           "'MST'", "'MDT'", 
                                                           "'PST'", "'PDT'", 
                                                           "'+'", "'-'")
        private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            "ALPHA", "DIGIT", 
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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u0026\u004e\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0003\u0002\u0003\u0002\u0003\u0002\u0005\u0002\u001a\u000a\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0004\u0006\u0004\u0022\u000a\u0004\u000d\u0004\u000e\u0004\u0023\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0005\u0007\u0033\u000a\u0007\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0005\u0008\u0042\u000a\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000b\u0003\u000b\u0003\u000b\u0002\u0002\u000c\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0002\u0006\u0003\u0002\u0004\u000a\u0003\u0002\u000b\u0016\u0003\u0002\u0022\u0023\u0003\u0002\u0024\u0025\u0002\u0051\u0002\u0019\u0003\u0002\u0002\u0002\u0004\u001e\u0003\u0002\u0002\u0002\u0006\u0021\u0003\u0002\u0002\u0002\u0008\u0028\u0003\u0002\u0002\u0002\u000a\u002a\u0003\u0002\u0002\u0002\u000c\u002d\u0003\u0002\u0002\u0002\u000e\u0041\u0003\u0002\u0002\u0002\u0010\u0043\u0003\u0002\u0002\u0002\u0012\u0046\u0003\u0002\u0002\u0002\u0014\u004b\u0003\u0002\u0002\u0002\u0016\u0017\u0005\u0004\u0003\u0002\u0017\u0018\u0007\u0003\u0002\u0002\u0018\u001a\u0003\u0002\u0002\u0002\u0019\u0016\u0003\u0002\u0002\u0002\u0019\u001a\u0003\u0002\u0002\u0002\u001a\u001b\u0003\u0002\u0002\u0002\u001b\u001c\u0005\u0006\u0004\u0002\u001c\u001d\u0005\u000a\u0006\u0002\u001d\u0003\u0003\u0002\u0002\u0002\u001e\u001f\u0009\u0002\u0002\u0002\u001f\u0005\u0003\u0002\u0002\u0002\u0020\u0022\u0005\u0010\u0009\u0002\u0021\u0020\u0003\u0002\u0002\u0002\u0022\u0023\u0003\u0002\u0002\u0002\u0023\u0021\u0003\u0002\u0002\u0002\u0023\u0024\u0003\u0002\u0002\u0002\u0024\u0025\u0003\u0002\u0002\u0002\u0025\u0026\u0005\u0008\u0005\u0002\u0026\u0027\u0005\u0010\u0009\u0002\u0027\u0007\u0003\u0002\u0002\u0002\u0028\u0029\u0009\u0003\u0002\u0002\u0029\u0009\u0003\u0002\u0002\u0002\u002a\u002b\u0005\u000c\u0007\u0002\u002b\u002c\u0005\u000e\u0008\u0002\u002c\u000b\u0003\u0002\u0002\u0002\u002d\u002e\u0005\u0010\u0009\u0002\u002e\u002f\u0007\u0017\u0002\u0002\u002f\u0032\u0005\u0010\u0009\u0002\u0030\u0031\u0007\u0017\u0002\u0002\u0031\u0033\u0005\u0010\u0009\u0002\u0032\u0030\u0003\u0002\u0002\u0002\u0032\u0033\u0003\u0002\u0002\u0002\u0033\u000d\u0003\u0002\u0002\u0002\u0034\u0042\u0007\u0018\u0002\u0002\u0035\u0042\u0007\u0019\u0002\u0002\u0036\u0042\u0007\u001a\u0002\u0002\u0037\u0042\u0007\u001b\u0002\u0002\u0038\u0042\u0007\u001c\u0002\u0002\u0039\u0042\u0007\u001d\u0002\u0002\u003a\u0042\u0007\u001e\u0002\u0002\u003b\u0042\u0007\u001f\u0002\u0002\u003c\u0042\u0007\u0020\u0002\u0002\u003d\u0042\u0007\u0021\u0002\u0002\u003e\u0042\u0007\u0024\u0002\u0002\u003f\u0040\u0009\u0004\u0002\u0002\u0040\u0042\u0005\u0012\u000a\u0002\u0041\u0034\u0003\u0002\u0002\u0002\u0041\u0035\u0003\u0002\u0002\u0002\u0041\u0036\u0003\u0002\u0002\u0002\u0041\u0037\u0003\u0002\u0002\u0002\u0041\u0038\u0003\u0002\u0002\u0002\u0041\u0039\u0003\u0002\u0002\u0002\u0041\u003a\u0003\u0002\u0002\u0002\u0041\u003b\u0003\u0002\u0002\u0002\u0041\u003c\u0003\u0002\u0002\u0002\u0041\u003d\u0003\u0002\u0002\u0002\u0041\u003e\u0003\u0002\u0002\u0002\u0041\u003f\u0003\u0002\u0002\u0002\u0042\u000f\u0003\u0002\u0002\u0002\u0043\u0044\u0005\u0014\u000b\u0002\u0044\u0045\u0005\u0014\u000b\u0002\u0045\u0011\u0003\u0002\u0002\u0002\u0046\u0047\u0005\u0014\u000b\u0002\u0047\u0048\u0005\u0014\u000b\u0002\u0048\u0049\u0005\u0014\u000b\u0002\u0049\u004a\u0005\u0014\u000b\u0002\u004a\u0013\u0003\u0002\u0002\u0002\u004b\u004c\u0009\u0005\u0002\u0002\u004c\u0015\u0003\u0002\u0002\u0002\u0006\u0019\u0023\u0032\u0041"

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
    private val T__4 = Tokens.T__4.id
    private val T__5 = Tokens.T__5.id
    private val T__6 = Tokens.T__6.id
    private val T__7 = Tokens.T__7.id
    private val T__8 = Tokens.T__8.id
    private val T__9 = Tokens.T__9.id
    private val T__10 = Tokens.T__10.id
    private val T__11 = Tokens.T__11.id
    private val T__12 = Tokens.T__12.id
    private val T__13 = Tokens.T__13.id
    private val T__14 = Tokens.T__14.id
    private val T__15 = Tokens.T__15.id
    private val T__16 = Tokens.T__16.id
    private val T__17 = Tokens.T__17.id
    private val T__18 = Tokens.T__18.id
    private val T__19 = Tokens.T__19.id
    private val T__20 = Tokens.T__20.id
    private val T__21 = Tokens.T__21.id
    private val T__22 = Tokens.T__22.id
    private val T__23 = Tokens.T__23.id
    private val T__24 = Tokens.T__24.id
    private val T__25 = Tokens.T__25.id
    private val T__26 = Tokens.T__26.id
    private val T__27 = Tokens.T__27.id
    private val T__28 = Tokens.T__28.id
    private val T__29 = Tokens.T__29.id
    private val T__30 = Tokens.T__30.id
    private val T__31 = Tokens.T__31.id
    private val T__32 = Tokens.T__32.id
    private val ALPHA = Tokens.ALPHA.id
    private val DIGIT = Tokens.DIGIT.id
    private val WS = Tokens.WS.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class Date_timeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_date_time.id
	        set(value) { throw RuntimeException() }
		fun findDate() : DateContext? = getRuleContext(solver.getType("DateContext"),0)
		fun findTime() : TimeContext? = getRuleContext(solver.getType("TimeContext"),0)
		fun findDay() : DayContext? = getRuleContext(solver.getType("DayContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is datetimeListener ) (listener as datetimeListener).enterDate_time(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is datetimeListener ) (listener as datetimeListener).exitDate_time(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is datetimeVisitor ) return (visitor as datetimeVisitor<out T>).visitDate_time(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  date_time() : Date_timeContext {
		var _localctx : Date_timeContext = Date_timeContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_date_time.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 23
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__1) or (1L shl T__2) or (1L shl T__3) or (1L shl T__4) or (1L shl T__5) or (1L shl T__6) or (1L shl T__7))) != 0L)) {
				if (true){
				this.state = 20
				day()
				this.state = 21
				match(T__0) as Token
				}
			}

			this.state = 25
			date()
			this.state = 26
			time()
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

	open class DayContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_day.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is datetimeListener ) (listener as datetimeListener).enterDay(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is datetimeListener ) (listener as datetimeListener).exitDay(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is datetimeVisitor ) return (visitor as datetimeVisitor<out T>).visitDay(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  day() : DayContext {
		var _localctx : DayContext = DayContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_day.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 28
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__1) or (1L shl T__2) or (1L shl T__3) or (1L shl T__4) or (1L shl T__5) or (1L shl T__6) or (1L shl T__7))) != 0L)) ) {
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

	open class DateContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_date.id
	        set(value) { throw RuntimeException() }
		fun findMonth() : MonthContext? = getRuleContext(solver.getType("MonthContext"),0)
		fun findTwo_digit() : List<Two_digitContext> = getRuleContexts(solver.getType("Two_digitContext"))
		fun findTwo_digit(i: Int) : Two_digitContext? = getRuleContext(solver.getType("Two_digitContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is datetimeListener ) (listener as datetimeListener).enterDate(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is datetimeListener ) (listener as datetimeListener).exitDate(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is datetimeVisitor ) return (visitor as datetimeVisitor<out T>).visitDate(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  date() : DateContext {
		var _localctx : DateContext = DateContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_date.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 31 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 30
				two_digit()
				}
				}
				this.state = 33 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==ALPHA || _la==DIGIT )
			this.state = 35
			month()
			this.state = 36
			two_digit()
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

	open class MonthContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_month.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is datetimeListener ) (listener as datetimeListener).enterMonth(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is datetimeListener ) (listener as datetimeListener).exitMonth(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is datetimeVisitor ) return (visitor as datetimeVisitor<out T>).visitMonth(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  month() : MonthContext {
		var _localctx : MonthContext = MonthContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_month.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 38
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__8) or (1L shl T__9) or (1L shl T__10) or (1L shl T__11) or (1L shl T__12) or (1L shl T__13) or (1L shl T__14) or (1L shl T__15) or (1L shl T__16) or (1L shl T__17) or (1L shl T__18) or (1L shl T__19))) != 0L)) ) {
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

	open class TimeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_time.id
	        set(value) { throw RuntimeException() }
		fun findHour() : HourContext? = getRuleContext(solver.getType("HourContext"),0)
		fun findZone() : ZoneContext? = getRuleContext(solver.getType("ZoneContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is datetimeListener ) (listener as datetimeListener).enterTime(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is datetimeListener ) (listener as datetimeListener).exitTime(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is datetimeVisitor ) return (visitor as datetimeVisitor<out T>).visitTime(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  time() : TimeContext {
		var _localctx : TimeContext = TimeContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_time.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 40
			hour()
			this.state = 41
			zone()
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

	open class HourContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_hour.id
	        set(value) { throw RuntimeException() }
		fun findTwo_digit() : List<Two_digitContext> = getRuleContexts(solver.getType("Two_digitContext"))
		fun findTwo_digit(i: Int) : Two_digitContext? = getRuleContext(solver.getType("Two_digitContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is datetimeListener ) (listener as datetimeListener).enterHour(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is datetimeListener ) (listener as datetimeListener).exitHour(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is datetimeVisitor ) return (visitor as datetimeVisitor<out T>).visitHour(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  hour() : HourContext {
		var _localctx : HourContext = HourContext(context, state)
		enterRule(_localctx, 10, Rules.RULE_hour.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 43
			two_digit()
			this.state = 44
			match(T__20) as Token
			this.state = 45
			two_digit()
			this.state = 48
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__20) {
				if (true){
				this.state = 46
				match(T__20) as Token
				this.state = 47
				two_digit()
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

	open class ZoneContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_zone.id
	        set(value) { throw RuntimeException() }
		fun ALPHA() : TerminalNode? = getToken(datetimeParser.Tokens.ALPHA.id, 0)
		fun findFour_digit() : Four_digitContext? = getRuleContext(solver.getType("Four_digitContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is datetimeListener ) (listener as datetimeListener).enterZone(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is datetimeListener ) (listener as datetimeListener).exitZone(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is datetimeVisitor ) return (visitor as datetimeVisitor<out T>).visitZone(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  zone() : ZoneContext {
		var _localctx : ZoneContext = ZoneContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_zone.id)
		var _la: Int
		try {
			this.state = 63
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			T__21  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 50
			match(T__21) as Token
			}}
			T__22  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 51
			match(T__22) as Token
			}}
			T__23  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 52
			match(T__23) as Token
			}}
			T__24  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 53
			match(T__24) as Token
			}}
			T__25  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 54
			match(T__25) as Token
			}}
			T__26  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 55
			match(T__26) as Token
			}}
			T__27  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 56
			match(T__27) as Token
			}}
			T__28  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 8)
			if (true){
			this.state = 57
			match(T__28) as Token
			}}
			T__29  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 9)
			if (true){
			this.state = 58
			match(T__29) as Token
			}}
			T__30  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 10)
			if (true){
			this.state = 59
			match(T__30) as Token
			}}
			ALPHA  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 11)
			if (true){
			this.state = 60
			match(ALPHA) as Token
			}}
			T__31 , T__32  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 12)
			if (true){
			if (true){
			this.state = 61
			_la = _input!!.LA(1)
			if ( !(_la==T__31 || _la==T__32) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 62
			four_digit()
			}
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

	open class Two_digitContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_two_digit.id
	        set(value) { throw RuntimeException() }
		fun findAlphanumeric() : List<AlphanumericContext> = getRuleContexts(solver.getType("AlphanumericContext"))
		fun findAlphanumeric(i: Int) : AlphanumericContext? = getRuleContext(solver.getType("AlphanumericContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is datetimeListener ) (listener as datetimeListener).enterTwo_digit(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is datetimeListener ) (listener as datetimeListener).exitTwo_digit(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is datetimeVisitor ) return (visitor as datetimeVisitor<out T>).visitTwo_digit(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  two_digit() : Two_digitContext {
		var _localctx : Two_digitContext = Two_digitContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_two_digit.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 65
			alphanumeric()
			this.state = 66
			alphanumeric()
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

	open class Four_digitContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_four_digit.id
	        set(value) { throw RuntimeException() }
		fun findAlphanumeric() : List<AlphanumericContext> = getRuleContexts(solver.getType("AlphanumericContext"))
		fun findAlphanumeric(i: Int) : AlphanumericContext? = getRuleContext(solver.getType("AlphanumericContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is datetimeListener ) (listener as datetimeListener).enterFour_digit(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is datetimeListener ) (listener as datetimeListener).exitFour_digit(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is datetimeVisitor ) return (visitor as datetimeVisitor<out T>).visitFour_digit(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  four_digit() : Four_digitContext {
		var _localctx : Four_digitContext = Four_digitContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_four_digit.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 68
			alphanumeric()
			this.state = 69
			alphanumeric()
			this.state = 70
			alphanumeric()
			this.state = 71
			alphanumeric()
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

	open class AlphanumericContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_alphanumeric.id
	        set(value) { throw RuntimeException() }
		fun ALPHA() : TerminalNode? = getToken(datetimeParser.Tokens.ALPHA.id, 0)
		fun DIGIT() : TerminalNode? = getToken(datetimeParser.Tokens.DIGIT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is datetimeListener ) (listener as datetimeListener).enterAlphanumeric(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is datetimeListener ) (listener as datetimeListener).exitAlphanumeric(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is datetimeVisitor ) return (visitor as datetimeVisitor<out T>).visitAlphanumeric(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  alphanumeric() : AlphanumericContext {
		var _localctx : AlphanumericContext = AlphanumericContext(context, state)
		enterRule(_localctx, 18, Rules.RULE_alphanumeric.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 73
			_la = _input!!.LA(1)
			if ( !(_la==ALPHA || _la==DIGIT) ) {
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