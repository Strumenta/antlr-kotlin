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

class fenParser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(fenParser.FenContext::class,
                                                              fenParser.ColorContext::class,
                                                              fenParser.CastlingContext::class,
                                                              fenParser.EnpassantContext::class,
                                                              fenParser.PositionContext::class,
                                                              fenParser.HalfmoveclockContext::class,
                                                              fenParser.FullmoveclockContext::class,
                                                              fenParser.PlacementContext::class,
                                                              fenParser.RankContext::class,
                                                              fenParser.PieceContext::class)
    }

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "fen.g4"

    override val tokenNames: Array<String?>?
        get() = fenParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = fenParser.Companion.ruleNames
    override val atn: ATN
        get() = fenParser.Companion.ATN

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
        NUMBER(24),
        WS(25)
    }

    enum class Rules(val id: Int) {
        RULE_fen(0),
        RULE_color(1),
        RULE_castling(2),
        RULE_enpassant(3),
        RULE_position(4),
        RULE_halfmoveclock(5),
        RULE_fullmoveclock(6),
        RULE_placement(7),
        RULE_rank(8),
        RULE_piece(9)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("fen", "color", "castling", "enpassant", 
                                "position", "halfmoveclock", "fullmoveclock", 
                                "placement", "rank", "piece")

        private val LITERAL_NAMES = Arrays.asList<String?>(null, "' '", 
                                                           "'w'", "'b'", 
                                                           "'-'", "'Q'", 
                                                           "'K'", "'k'", 
                                                           "'q'", "'a'", 
                                                           "'c'", "'d'", 
                                                           "'e'", "'f'", 
                                                           "'g'", "'h'", 
                                                           "'/'", "'p'", 
                                                           "'r'", "'n'", 
                                                           "'P'", "'R'", 
                                                           "'N'", "'B'")
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
                                                            "NUMBER", "WS")

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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u001b\u0047\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0006\u0004\u0027\u000a\u0004\u000d\u0004\u000e\u0004\u0028\u0005\u0004\u002b\u000a\u0004\u0003\u0005\u0003\u0005\u0005\u0005\u002f\u000a\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0006\u0009\u003b\u000a\u0009\u000d\u0009\u000e\u0009\u003c\u0003\u000a\u0003\u000a\u0006\u000a\u0041\u000a\u000a\u000d\u000a\u000e\u000a\u0042\u0003\u000b\u0003\u000b\u0003\u000b\u0002\u0002\u000c\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0002\u0006\u0003\u0002\u0004\u0005\u0003\u0002\u0007\u000a\u0004\u0002\u0005\u0005\u000b\u0011\u0005\u0002\u0005\u0005\u0007\u000a\u0013\u0019\u0002\u0042\u0002\u0016\u0003\u0002\u0002\u0002\u0004\u0022\u0003\u0002\u0002\u0002\u0006\u002a\u0003\u0002\u0002\u0002\u0008\u002e\u0003\u0002\u0002\u0002\u000a\u0030\u0003\u0002\u0002\u0002\u000c\u0033\u0003\u0002\u0002\u0002\u000e\u0035\u0003\u0002\u0002\u0002\u0010\u0037\u0003\u0002\u0002\u0002\u0012\u0040\u0003\u0002\u0002\u0002\u0014\u0044\u0003\u0002\u0002\u0002\u0016\u0017\u0005\u0010\u0009\u0002\u0017\u0018\u0007\u0003\u0002\u0002\u0018\u0019\u0005\u0004\u0003\u0002\u0019\u001a\u0007\u0003\u0002\u0002\u001a\u001b\u0005\u0006\u0004\u0002\u001b\u001c\u0007\u0003\u0002\u0002\u001c\u001d\u0005\u0008\u0005\u0002\u001d\u001e\u0007\u0003\u0002\u0002\u001e\u001f\u0005\u000c\u0007\u0002\u001f\u0020\u0007\u0003\u0002\u0002\u0020\u0021\u0005\u000e\u0008\u0002\u0021\u0003\u0003\u0002\u0002\u0002\u0022\u0023\u0009\u0002\u0002\u0002\u0023\u0005\u0003\u0002\u0002\u0002\u0024\u002b\u0007\u0006\u0002\u0002\u0025\u0027\u0009\u0003\u0002\u0002\u0026\u0025\u0003\u0002\u0002\u0002\u0027\u0028\u0003\u0002\u0002\u0002\u0028\u0026\u0003\u0002\u0002\u0002\u0028\u0029\u0003\u0002\u0002\u0002\u0029\u002b\u0003\u0002\u0002\u0002\u002a\u0024\u0003\u0002\u0002\u0002\u002a\u0026\u0003\u0002\u0002\u0002\u002b\u0007\u0003\u0002\u0002\u0002\u002c\u002f\u0007\u0006\u0002\u0002\u002d\u002f\u0005\u000a\u0006\u0002\u002e\u002c\u0003\u0002\u0002\u0002\u002e\u002d\u0003\u0002\u0002\u0002\u002f\u0009\u0003\u0002\u0002\u0002\u0030\u0031\u0009\u0004\u0002\u0002\u0031\u0032\u0007\u001a\u0002\u0002\u0032\u000b\u0003\u0002\u0002\u0002\u0033\u0034\u0007\u001a\u0002\u0002\u0034\u000d\u0003\u0002\u0002\u0002\u0035\u0036\u0007\u001a\u0002\u0002\u0036\u000f\u0003\u0002\u0002\u0002\u0037\u003a\u0005\u0012\u000a\u0002\u0038\u0039\u0007\u0012\u0002\u0002\u0039\u003b\u0005\u0012\u000a\u0002\u003a\u0038\u0003\u0002\u0002\u0002\u003b\u003c\u0003\u0002\u0002\u0002\u003c\u003a\u0003\u0002\u0002\u0002\u003c\u003d\u0003\u0002\u0002\u0002\u003d\u0011\u0003\u0002\u0002\u0002\u003e\u0041\u0005\u0014\u000b\u0002\u003f\u0041\u0007\u001a\u0002\u0002\u0040\u003e\u0003\u0002\u0002\u0002\u0040\u003f\u0003\u0002\u0002\u0002\u0041\u0042\u0003\u0002\u0002\u0002\u0042\u0040\u0003\u0002\u0002\u0002\u0042\u0043\u0003\u0002\u0002\u0002\u0043\u0013\u0003\u0002\u0002\u0002\u0044\u0045\u0009\u0005\u0002\u0002\u0045\u0015\u0003\u0002\u0002\u0002\u0008\u0028\u002a\u002e\u003c\u0040\u0042"

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
    private val NUMBER = Tokens.NUMBER.id
    private val WS = Tokens.WS.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class FenContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_fen.id
	        set(value) { throw RuntimeException() }
		fun findPlacement() : PlacementContext? = getRuleContext(solver.getType("PlacementContext"),0)
		fun findColor() : ColorContext? = getRuleContext(solver.getType("ColorContext"),0)
		fun findCastling() : CastlingContext? = getRuleContext(solver.getType("CastlingContext"),0)
		fun findEnpassant() : EnpassantContext? = getRuleContext(solver.getType("EnpassantContext"),0)
		fun findHalfmoveclock() : HalfmoveclockContext? = getRuleContext(solver.getType("HalfmoveclockContext"),0)
		fun findFullmoveclock() : FullmoveclockContext? = getRuleContext(solver.getType("FullmoveclockContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is fenListener ) (listener as fenListener).enterFen(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is fenListener ) (listener as fenListener).exitFen(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is fenVisitor ) return (visitor as fenVisitor<out T>).visitFen(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  fen() : FenContext {
		var _localctx : FenContext = FenContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_fen.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 20
			placement()
			this.state = 21
			match(T__0) as Token
			this.state = 22
			color()
			this.state = 23
			match(T__0) as Token
			this.state = 24
			castling()
			this.state = 25
			match(T__0) as Token
			this.state = 26
			enpassant()
			this.state = 27
			match(T__0) as Token
			this.state = 28
			halfmoveclock()
			this.state = 29
			match(T__0) as Token
			this.state = 30
			fullmoveclock()
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

	open class ColorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_color.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is fenListener ) (listener as fenListener).enterColor(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is fenListener ) (listener as fenListener).exitColor(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is fenVisitor ) return (visitor as fenVisitor<out T>).visitColor(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  color() : ColorContext {
		var _localctx : ColorContext = ColorContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_color.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 32
			_la = _input!!.LA(1)
			if ( !(_la==T__1 || _la==T__2) ) {
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

	open class CastlingContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_castling.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is fenListener ) (listener as fenListener).enterCastling(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is fenListener ) (listener as fenListener).exitCastling(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is fenVisitor ) return (visitor as fenVisitor<out T>).visitCastling(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  castling() : CastlingContext {
		var _localctx : CastlingContext = CastlingContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_castling.id)
		var _la: Int
		try {
			this.state = 40
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			T__3  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 34
			match(T__3) as Token
			}}
			T__4 , T__5 , T__6 , T__7  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 36 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 35
				_la = _input!!.LA(1)
				if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__4) or (1L shl T__5) or (1L shl T__6) or (1L shl T__7))) != 0L)) ) {
					errorHandler.recoverInline(this)
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				}
				}
				this.state = 38 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__4) or (1L shl T__5) or (1L shl T__6) or (1L shl T__7))) != 0L) )
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

	open class EnpassantContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_enpassant.id
	        set(value) { throw RuntimeException() }
		fun findPosition() : PositionContext? = getRuleContext(solver.getType("PositionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is fenListener ) (listener as fenListener).enterEnpassant(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is fenListener ) (listener as fenListener).exitEnpassant(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is fenVisitor ) return (visitor as fenVisitor<out T>).visitEnpassant(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  enpassant() : EnpassantContext {
		var _localctx : EnpassantContext = EnpassantContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_enpassant.id)
		try {
			this.state = 44
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			T__3  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 42
			match(T__3) as Token
			}}
			T__2 , T__8 , T__9 , T__10 , T__11 , T__12 , T__13 , T__14  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 43
			position()
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

	open class PositionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_position.id
	        set(value) { throw RuntimeException() }
		fun NUMBER() : TerminalNode? = getToken(fenParser.Tokens.NUMBER.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is fenListener ) (listener as fenListener).enterPosition(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is fenListener ) (listener as fenListener).exitPosition(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is fenVisitor ) return (visitor as fenVisitor<out T>).visitPosition(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  position() : PositionContext {
		var _localctx : PositionContext = PositionContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_position.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 46
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__2) or (1L shl T__8) or (1L shl T__9) or (1L shl T__10) or (1L shl T__11) or (1L shl T__12) or (1L shl T__13) or (1L shl T__14))) != 0L)) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 47
			match(NUMBER) as Token
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

	open class HalfmoveclockContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_halfmoveclock.id
	        set(value) { throw RuntimeException() }
		fun NUMBER() : TerminalNode? = getToken(fenParser.Tokens.NUMBER.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is fenListener ) (listener as fenListener).enterHalfmoveclock(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is fenListener ) (listener as fenListener).exitHalfmoveclock(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is fenVisitor ) return (visitor as fenVisitor<out T>).visitHalfmoveclock(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  halfmoveclock() : HalfmoveclockContext {
		var _localctx : HalfmoveclockContext = HalfmoveclockContext(context, state)
		enterRule(_localctx, 10, Rules.RULE_halfmoveclock.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 49
			match(NUMBER) as Token
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

	open class FullmoveclockContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_fullmoveclock.id
	        set(value) { throw RuntimeException() }
		fun NUMBER() : TerminalNode? = getToken(fenParser.Tokens.NUMBER.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is fenListener ) (listener as fenListener).enterFullmoveclock(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is fenListener ) (listener as fenListener).exitFullmoveclock(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is fenVisitor ) return (visitor as fenVisitor<out T>).visitFullmoveclock(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  fullmoveclock() : FullmoveclockContext {
		var _localctx : FullmoveclockContext = FullmoveclockContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_fullmoveclock.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 51
			match(NUMBER) as Token
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

	open class PlacementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_placement.id
	        set(value) { throw RuntimeException() }
		fun findRank() : List<RankContext> = getRuleContexts(solver.getType("RankContext"))
		fun findRank(i: Int) : RankContext? = getRuleContext(solver.getType("RankContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is fenListener ) (listener as fenListener).enterPlacement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is fenListener ) (listener as fenListener).exitPlacement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is fenVisitor ) return (visitor as fenVisitor<out T>).visitPlacement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  placement() : PlacementContext {
		var _localctx : PlacementContext = PlacementContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_placement.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 53
			rank()
			this.state = 56 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 54
				match(T__15) as Token
				this.state = 55
				rank()
				}
				}
				this.state = 58 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==T__15 )
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

	open class RankContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_rank.id
	        set(value) { throw RuntimeException() }
		fun findPiece() : List<PieceContext> = getRuleContexts(solver.getType("PieceContext"))
		fun findPiece(i: Int) : PieceContext? = getRuleContext(solver.getType("PieceContext"),i)
		fun NUMBER() : List<TerminalNode> = getTokens(fenParser.Tokens.NUMBER.id)
		fun NUMBER(i: Int) : TerminalNode = getToken(fenParser.Tokens.NUMBER.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is fenListener ) (listener as fenListener).enterRank(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is fenListener ) (listener as fenListener).exitRank(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is fenVisitor ) return (visitor as fenVisitor<out T>).visitRank(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  rank() : RankContext {
		var _localctx : RankContext = RankContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_rank.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 62 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				this.state = 62
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				T__2 , T__4 , T__5 , T__6 , T__7 , T__16 , T__17 , T__18 , T__19 , T__20 , T__21 , T__22  ->  /*LL1AltBlock*/{if (true){
				this.state = 60
				piece()
				}}
				NUMBER  ->  /*LL1AltBlock*/{if (true){
				this.state = 61
				match(NUMBER) as Token
				}}
				else -> throw NoViableAltException(this)
				}
				}
				this.state = 64 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__2) or (1L shl T__4) or (1L shl T__5) or (1L shl T__6) or (1L shl T__7) or (1L shl T__16) or (1L shl T__17) or (1L shl T__18) or (1L shl T__19) or (1L shl T__20) or (1L shl T__21) or (1L shl T__22) or (1L shl NUMBER))) != 0L) )
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

	open class PieceContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_piece.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is fenListener ) (listener as fenListener).enterPiece(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is fenListener ) (listener as fenListener).exitPiece(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is fenVisitor ) return (visitor as fenVisitor<out T>).visitPiece(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  piece() : PieceContext {
		var _localctx : PieceContext = PieceContext(context, state)
		enterRule(_localctx, 18, Rules.RULE_piece.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 66
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__2) or (1L shl T__4) or (1L shl T__5) or (1L shl T__6) or (1L shl T__7) or (1L shl T__16) or (1L shl T__17) or (1L shl T__18) or (1L shl T__19) or (1L shl T__20) or (1L shl T__21) or (1L shl T__22))) != 0L)) ) {
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