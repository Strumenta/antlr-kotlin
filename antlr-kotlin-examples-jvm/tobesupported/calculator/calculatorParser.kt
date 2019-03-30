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

class calculatorParser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(calculatorParser.EquationContext::class,
                                                              calculatorParser.ExpressionContext::class,
                                                              calculatorParser.MultiplyingExpressionContext::class,
                                                              calculatorParser.PowExpressionContext::class,
                                                              calculatorParser.SignedAtomContext::class,
                                                              calculatorParser.AtomContext::class,
                                                              calculatorParser.ScientificContext::class,
                                                              calculatorParser.ConstantContext::class,
                                                              calculatorParser.VariableContext::class,
                                                              calculatorParser.FuncContext::class,
                                                              calculatorParser.FuncnameContext::class,
                                                              calculatorParser.RelopContext::class)
    }

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "calculator.g4"

    override val tokenNames: Array<String?>?
        get() = calculatorParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = calculatorParser.Companion.ruleNames
    override val atn: ATN
        get() = calculatorParser.Companion.ATN

    enum class Tokens(val id: Int) {
        EOF(-1),
        COS(1),
        SIN(2),
        TAN(3),
        ACOS(4),
        ASIN(5),
        ATAN(6),
        LN(7),
        LOG(8),
        SQRT(9),
        LPAREN(10),
        RPAREN(11),
        PLUS(12),
        MINUS(13),
        TIMES(14),
        DIV(15),
        GT(16),
        LT(17),
        EQ(18),
        COMMA(19),
        POINT(20),
        POW(21),
        PI(22),
        EULER(23),
        I(24),
        VARIABLE(25),
        SCIENTIFIC_NUMBER(26),
        WS(27)
    }

    enum class Rules(val id: Int) {
        RULE_equation(0),
        RULE_expression(1),
        RULE_multiplyingExpression(2),
        RULE_powExpression(3),
        RULE_signedAtom(4),
        RULE_atom(5),
        RULE_scientific(6),
        RULE_constant(7),
        RULE_variable(8),
        RULE_func(9),
        RULE_funcname(10),
        RULE_relop(11)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("equation", "expression", "multiplyingExpression", 
                                "powExpression", "signedAtom", "atom", "scientific", 
                                "constant", "variable", "func", "funcname", 
                                "relop")

        private val LITERAL_NAMES = Arrays.asList<String?>(null, "'cos'", 
                                                           "'sin'", "'tan'", 
                                                           "'acos'", "'asin'", 
                                                           "'atan'", "'ln'", 
                                                           "'log'", "'sqrt'", 
                                                           "'('", "')'", 
                                                           "'+'", "'-'", 
                                                           "'*'", "'/'", 
                                                           "'>'", "'<'", 
                                                           "'='", "','", 
                                                           "'.'", "'^'", 
                                                           "'pi'", null, 
                                                           "'i'")
        private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, "COS", 
                                                            "SIN", "TAN", 
                                                            "ACOS", "ASIN", 
                                                            "ATAN", "LN", 
                                                            "LOG", "SQRT", 
                                                            "LPAREN", "RPAREN", 
                                                            "PLUS", "MINUS", 
                                                            "TIMES", "DIV", 
                                                            "GT", "LT", 
                                                            "EQ", "COMMA", 
                                                            "POINT", "POW", 
                                                            "PI", "EULER", 
                                                            "I", "VARIABLE", 
                                                            "SCIENTIFIC_NUMBER", 
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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u001d\u005e\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0007\u0003\u0022\u000a\u0003\u000c\u0003\u000e\u0003\u0025\u000b\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0007\u0004\u002a\u000a\u0004\u000c\u0004\u000e\u0004\u002d\u000b\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0007\u0005\u0032\u000a\u0005\u000c\u0005\u000e\u0005\u0035\u000b\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0005\u0006\u003d\u000a\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0005\u0007\u0046\u000a\u0007\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0007\u000b\u0053\u000a\u000b\u000c\u000b\u000e\u000b\u0056\u000b\u000b\u0003\u000b\u0003\u000b\u0003\u000c\u0003\u000c\u0003\u000d\u0003\u000d\u0003\u000d\u0002\u0002\u000e\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u0002\u0007\u0003\u0002\u000e\u000f\u0003\u0002\u0010\u0011\u0003\u0002\u0018\u001a\u0003\u0002\u0003\u000b\u0003\u0002\u0012\u0014\u0002\u005b\u0002\u001a\u0003\u0002\u0002\u0002\u0004\u001e\u0003\u0002\u0002\u0002\u0006\u0026\u0003\u0002\u0002\u0002\u0008\u002e\u0003\u0002\u0002\u0002\u000a\u003c\u0003\u0002\u0002\u0002\u000c\u0045\u0003\u0002\u0002\u0002\u000e\u0047\u0003\u0002\u0002\u0002\u0010\u0049\u0003\u0002\u0002\u0002\u0012\u004b\u0003\u0002\u0002\u0002\u0014\u004d\u0003\u0002\u0002\u0002\u0016\u0059\u0003\u0002\u0002\u0002\u0018\u005b\u0003\u0002\u0002\u0002\u001a\u001b\u0005\u0004\u0003\u0002\u001b\u001c\u0005\u0018\u000d\u0002\u001c\u001d\u0005\u0004\u0003\u0002\u001d\u0003\u0003\u0002\u0002\u0002\u001e\u0023\u0005\u0006\u0004\u0002\u001f\u0020\u0009\u0002\u0002\u0002\u0020\u0022\u0005\u0006\u0004\u0002\u0021\u001f\u0003\u0002\u0002\u0002\u0022\u0025\u0003\u0002\u0002\u0002\u0023\u0021\u0003\u0002\u0002\u0002\u0023\u0024\u0003\u0002\u0002\u0002\u0024\u0005\u0003\u0002\u0002\u0002\u0025\u0023\u0003\u0002\u0002\u0002\u0026\u002b\u0005\u0008\u0005\u0002\u0027\u0028\u0009\u0003\u0002\u0002\u0028\u002a\u0005\u0008\u0005\u0002\u0029\u0027\u0003\u0002\u0002\u0002\u002a\u002d\u0003\u0002\u0002\u0002\u002b\u0029\u0003\u0002\u0002\u0002\u002b\u002c\u0003\u0002\u0002\u0002\u002c\u0007\u0003\u0002\u0002\u0002\u002d\u002b\u0003\u0002\u0002\u0002\u002e\u0033\u0005\u000a\u0006\u0002\u002f\u0030\u0007\u0017\u0002\u0002\u0030\u0032\u0005\u000a\u0006\u0002\u0031\u002f\u0003\u0002\u0002\u0002\u0032\u0035\u0003\u0002\u0002\u0002\u0033\u0031\u0003\u0002\u0002\u0002\u0033\u0034\u0003\u0002\u0002\u0002\u0034\u0009\u0003\u0002\u0002\u0002\u0035\u0033\u0003\u0002\u0002\u0002\u0036\u0037\u0007\u000e\u0002\u0002\u0037\u003d\u0005\u000a\u0006\u0002\u0038\u0039\u0007\u000f\u0002\u0002\u0039\u003d\u0005\u000a\u0006\u0002\u003a\u003d\u0005\u0014\u000b\u0002\u003b\u003d\u0005\u000c\u0007\u0002\u003c\u0036\u0003\u0002\u0002\u0002\u003c\u0038\u0003\u0002\u0002\u0002\u003c\u003a\u0003\u0002\u0002\u0002\u003c\u003b\u0003\u0002\u0002\u0002\u003d\u000b\u0003\u0002\u0002\u0002\u003e\u0046\u0005\u000e\u0008\u0002\u003f\u0046\u0005\u0012\u000a\u0002\u0040\u0046\u0005\u0010\u0009\u0002\u0041\u0042\u0007\u000c\u0002\u0002\u0042\u0043\u0005\u0004\u0003\u0002\u0043\u0044\u0007\u000d\u0002\u0002\u0044\u0046\u0003\u0002\u0002\u0002\u0045\u003e\u0003\u0002\u0002\u0002\u0045\u003f\u0003\u0002\u0002\u0002\u0045\u0040\u0003\u0002\u0002\u0002\u0045\u0041\u0003\u0002\u0002\u0002\u0046\u000d\u0003\u0002\u0002\u0002\u0047\u0048\u0007\u001c\u0002\u0002\u0048\u000f\u0003\u0002\u0002\u0002\u0049\u004a\u0009\u0004\u0002\u0002\u004a\u0011\u0003\u0002\u0002\u0002\u004b\u004c\u0007\u001b\u0002\u0002\u004c\u0013\u0003\u0002\u0002\u0002\u004d\u004e\u0005\u0016\u000c\u0002\u004e\u004f\u0007\u000c\u0002\u0002\u004f\u0054\u0005\u0004\u0003\u0002\u0050\u0051\u0007\u0015\u0002\u0002\u0051\u0053\u0005\u0004\u0003\u0002\u0052\u0050\u0003\u0002\u0002\u0002\u0053\u0056\u0003\u0002\u0002\u0002\u0054\u0052\u0003\u0002\u0002\u0002\u0054\u0055\u0003\u0002\u0002\u0002\u0055\u0057\u0003\u0002\u0002\u0002\u0056\u0054\u0003\u0002\u0002\u0002\u0057\u0058\u0007\u000d\u0002\u0002\u0058\u0015\u0003\u0002\u0002\u0002\u0059\u005a\u0009\u0005\u0002\u0002\u005a\u0017\u0003\u0002\u0002\u0002\u005b\u005c\u0009\u0006\u0002\u0002\u005c\u0019\u0003\u0002\u0002\u0002\u0008\u0023\u002b\u0033\u003c\u0045\u0054"

        val ATN = ATNDeserializer().deserialize(serializedATN.toCharArray())
        init {
        	decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
        		DFA(ATN.getDecisionState(it)!!, it)
        	})


        }
	}

    private val COS = Tokens.COS.id
    private val SIN = Tokens.SIN.id
    private val TAN = Tokens.TAN.id
    private val ACOS = Tokens.ACOS.id
    private val ASIN = Tokens.ASIN.id
    private val ATAN = Tokens.ATAN.id
    private val LN = Tokens.LN.id
    private val LOG = Tokens.LOG.id
    private val SQRT = Tokens.SQRT.id
    private val LPAREN = Tokens.LPAREN.id
    private val RPAREN = Tokens.RPAREN.id
    private val PLUS = Tokens.PLUS.id
    private val MINUS = Tokens.MINUS.id
    private val TIMES = Tokens.TIMES.id
    private val DIV = Tokens.DIV.id
    private val GT = Tokens.GT.id
    private val LT = Tokens.LT.id
    private val EQ = Tokens.EQ.id
    private val COMMA = Tokens.COMMA.id
    private val POINT = Tokens.POINT.id
    private val POW = Tokens.POW.id
    private val PI = Tokens.PI.id
    private val EULER = Tokens.EULER.id
    private val I = Tokens.I.id
    private val VARIABLE = Tokens.VARIABLE.id
    private val SCIENTIFIC_NUMBER = Tokens.SCIENTIFIC_NUMBER.id
    private val WS = Tokens.WS.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class EquationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_equation.id
	        set(value) { throw RuntimeException() }
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun findRelop() : RelopContext? = getRuleContext(solver.getType("RelopContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is calculatorListener ) (listener as calculatorListener).enterEquation(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is calculatorListener ) (listener as calculatorListener).exitEquation(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is calculatorVisitor ) return (visitor as calculatorVisitor<out T>).visitEquation(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  equation() : EquationContext {
		var _localctx : EquationContext = EquationContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_equation.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 24
			expression()
			this.state = 25
			relop()
			this.state = 26
			expression()
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

	open class ExpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_expression.id
	        set(value) { throw RuntimeException() }
		fun findMultiplyingExpression() : List<MultiplyingExpressionContext> = getRuleContexts(solver.getType("MultiplyingExpressionContext"))
		fun findMultiplyingExpression(i: Int) : MultiplyingExpressionContext? = getRuleContext(solver.getType("MultiplyingExpressionContext"),i)
		fun PLUS() : List<TerminalNode> = getTokens(calculatorParser.Tokens.PLUS.id)
		fun PLUS(i: Int) : TerminalNode = getToken(calculatorParser.Tokens.PLUS.id, i) as TerminalNode
		fun MINUS() : List<TerminalNode> = getTokens(calculatorParser.Tokens.MINUS.id)
		fun MINUS(i: Int) : TerminalNode = getToken(calculatorParser.Tokens.MINUS.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is calculatorListener ) (listener as calculatorListener).enterExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is calculatorListener ) (listener as calculatorListener).exitExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is calculatorVisitor ) return (visitor as calculatorVisitor<out T>).visitExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  expression() : ExpressionContext {
		var _localctx : ExpressionContext = ExpressionContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_expression.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 28
			multiplyingExpression()
			this.state = 33
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==PLUS || _la==MINUS) {
				if (true){
				if (true){
				this.state = 29
				_la = _input!!.LA(1)
				if ( !(_la==PLUS || _la==MINUS) ) {
					errorHandler.recoverInline(this)
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				this.state = 30
				multiplyingExpression()
				}
				}
				this.state = 35
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

	open class MultiplyingExpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_multiplyingExpression.id
	        set(value) { throw RuntimeException() }
		fun findPowExpression() : List<PowExpressionContext> = getRuleContexts(solver.getType("PowExpressionContext"))
		fun findPowExpression(i: Int) : PowExpressionContext? = getRuleContext(solver.getType("PowExpressionContext"),i)
		fun TIMES() : List<TerminalNode> = getTokens(calculatorParser.Tokens.TIMES.id)
		fun TIMES(i: Int) : TerminalNode = getToken(calculatorParser.Tokens.TIMES.id, i) as TerminalNode
		fun DIV() : List<TerminalNode> = getTokens(calculatorParser.Tokens.DIV.id)
		fun DIV(i: Int) : TerminalNode = getToken(calculatorParser.Tokens.DIV.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is calculatorListener ) (listener as calculatorListener).enterMultiplyingExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is calculatorListener ) (listener as calculatorListener).exitMultiplyingExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is calculatorVisitor ) return (visitor as calculatorVisitor<out T>).visitMultiplyingExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  multiplyingExpression() : MultiplyingExpressionContext {
		var _localctx : MultiplyingExpressionContext = MultiplyingExpressionContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_multiplyingExpression.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 36
			powExpression()
			this.state = 41
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==TIMES || _la==DIV) {
				if (true){
				if (true){
				this.state = 37
				_la = _input!!.LA(1)
				if ( !(_la==TIMES || _la==DIV) ) {
					errorHandler.recoverInline(this)
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				this.state = 38
				powExpression()
				}
				}
				this.state = 43
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

	open class PowExpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_powExpression.id
	        set(value) { throw RuntimeException() }
		fun findSignedAtom() : List<SignedAtomContext> = getRuleContexts(solver.getType("SignedAtomContext"))
		fun findSignedAtom(i: Int) : SignedAtomContext? = getRuleContext(solver.getType("SignedAtomContext"),i)
		fun POW() : List<TerminalNode> = getTokens(calculatorParser.Tokens.POW.id)
		fun POW(i: Int) : TerminalNode = getToken(calculatorParser.Tokens.POW.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is calculatorListener ) (listener as calculatorListener).enterPowExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is calculatorListener ) (listener as calculatorListener).exitPowExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is calculatorVisitor ) return (visitor as calculatorVisitor<out T>).visitPowExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  powExpression() : PowExpressionContext {
		var _localctx : PowExpressionContext = PowExpressionContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_powExpression.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 44
			signedAtom()
			this.state = 49
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==POW) {
				if (true){
				if (true){
				this.state = 45
				match(POW) as Token
				this.state = 46
				signedAtom()
				}
				}
				this.state = 51
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

	open class SignedAtomContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_signedAtom.id
	        set(value) { throw RuntimeException() }
		fun PLUS() : TerminalNode? = getToken(calculatorParser.Tokens.PLUS.id, 0)
		fun findSignedAtom() : SignedAtomContext? = getRuleContext(solver.getType("SignedAtomContext"),0)
		fun MINUS() : TerminalNode? = getToken(calculatorParser.Tokens.MINUS.id, 0)
		fun findFunc() : FuncContext? = getRuleContext(solver.getType("FuncContext"),0)
		fun findAtom() : AtomContext? = getRuleContext(solver.getType("AtomContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is calculatorListener ) (listener as calculatorListener).enterSignedAtom(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is calculatorListener ) (listener as calculatorListener).exitSignedAtom(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is calculatorVisitor ) return (visitor as calculatorVisitor<out T>).visitSignedAtom(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  signedAtom() : SignedAtomContext {
		var _localctx : SignedAtomContext = SignedAtomContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_signedAtom.id)
		try {
			this.state = 58
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			PLUS  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 52
			match(PLUS) as Token
			this.state = 53
			signedAtom()
			}}
			MINUS  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 54
			match(MINUS) as Token
			this.state = 55
			signedAtom()
			}}
			COS , SIN , TAN , ACOS , ASIN , ATAN , LN , LOG , SQRT  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 56
			func()
			}}
			LPAREN , PI , EULER , I , VARIABLE , SCIENTIFIC_NUMBER  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 57
			atom()
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

	open class AtomContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_atom.id
	        set(value) { throw RuntimeException() }
		fun findScientific() : ScientificContext? = getRuleContext(solver.getType("ScientificContext"),0)
		fun findVariable() : VariableContext? = getRuleContext(solver.getType("VariableContext"),0)
		fun findConstant() : ConstantContext? = getRuleContext(solver.getType("ConstantContext"),0)
		fun LPAREN() : TerminalNode? = getToken(calculatorParser.Tokens.LPAREN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RPAREN() : TerminalNode? = getToken(calculatorParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is calculatorListener ) (listener as calculatorListener).enterAtom(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is calculatorListener ) (listener as calculatorListener).exitAtom(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is calculatorVisitor ) return (visitor as calculatorVisitor<out T>).visitAtom(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  atom() : AtomContext {
		var _localctx : AtomContext = AtomContext(context, state)
		enterRule(_localctx, 10, Rules.RULE_atom.id)
		try {
			this.state = 67
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			SCIENTIFIC_NUMBER  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 60
			scientific()
			}}
			VARIABLE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 61
			variable()
			}}
			PI , EULER , I  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 62
			constant()
			}}
			LPAREN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 63
			match(LPAREN) as Token
			this.state = 64
			expression()
			this.state = 65
			match(RPAREN) as Token
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

	open class ScientificContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_scientific.id
	        set(value) { throw RuntimeException() }
		fun SCIENTIFIC_NUMBER() : TerminalNode? = getToken(calculatorParser.Tokens.SCIENTIFIC_NUMBER.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is calculatorListener ) (listener as calculatorListener).enterScientific(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is calculatorListener ) (listener as calculatorListener).exitScientific(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is calculatorVisitor ) return (visitor as calculatorVisitor<out T>).visitScientific(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  scientific() : ScientificContext {
		var _localctx : ScientificContext = ScientificContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_scientific.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 69
			match(SCIENTIFIC_NUMBER) as Token
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

	open class ConstantContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_constant.id
	        set(value) { throw RuntimeException() }
		fun PI() : TerminalNode? = getToken(calculatorParser.Tokens.PI.id, 0)
		fun EULER() : TerminalNode? = getToken(calculatorParser.Tokens.EULER.id, 0)
		fun I() : TerminalNode? = getToken(calculatorParser.Tokens.I.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is calculatorListener ) (listener as calculatorListener).enterConstant(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is calculatorListener ) (listener as calculatorListener).exitConstant(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is calculatorVisitor ) return (visitor as calculatorVisitor<out T>).visitConstant(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  constant() : ConstantContext {
		var _localctx : ConstantContext = ConstantContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_constant.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 71
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl PI) or (1L shl EULER) or (1L shl I))) != 0L)) ) {
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

	open class VariableContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_variable.id
	        set(value) { throw RuntimeException() }
		fun VARIABLE() : TerminalNode? = getToken(calculatorParser.Tokens.VARIABLE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is calculatorListener ) (listener as calculatorListener).enterVariable(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is calculatorListener ) (listener as calculatorListener).exitVariable(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is calculatorVisitor ) return (visitor as calculatorVisitor<out T>).visitVariable(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  variable() : VariableContext {
		var _localctx : VariableContext = VariableContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_variable.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 73
			match(VARIABLE) as Token
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

	open class FuncContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_func.id
	        set(value) { throw RuntimeException() }
		fun findFuncname() : FuncnameContext? = getRuleContext(solver.getType("FuncnameContext"),0)
		fun LPAREN() : TerminalNode? = getToken(calculatorParser.Tokens.LPAREN.id, 0)
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun RPAREN() : TerminalNode? = getToken(calculatorParser.Tokens.RPAREN.id, 0)
		fun COMMA() : List<TerminalNode> = getTokens(calculatorParser.Tokens.COMMA.id)
		fun COMMA(i: Int) : TerminalNode = getToken(calculatorParser.Tokens.COMMA.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is calculatorListener ) (listener as calculatorListener).enterFunc(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is calculatorListener ) (listener as calculatorListener).exitFunc(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is calculatorVisitor ) return (visitor as calculatorVisitor<out T>).visitFunc(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  func() : FuncContext {
		var _localctx : FuncContext = FuncContext(context, state)
		enterRule(_localctx, 18, Rules.RULE_func.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 75
			funcname()
			this.state = 76
			match(LPAREN) as Token
			this.state = 77
			expression()
			this.state = 82
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COMMA) {
				if (true){
				if (true){
				this.state = 78
				match(COMMA) as Token
				this.state = 79
				expression()
				}
				}
				this.state = 84
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 85
			match(RPAREN) as Token
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

	open class FuncnameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_funcname.id
	        set(value) { throw RuntimeException() }
		fun COS() : TerminalNode? = getToken(calculatorParser.Tokens.COS.id, 0)
		fun TAN() : TerminalNode? = getToken(calculatorParser.Tokens.TAN.id, 0)
		fun SIN() : TerminalNode? = getToken(calculatorParser.Tokens.SIN.id, 0)
		fun ACOS() : TerminalNode? = getToken(calculatorParser.Tokens.ACOS.id, 0)
		fun ATAN() : TerminalNode? = getToken(calculatorParser.Tokens.ATAN.id, 0)
		fun ASIN() : TerminalNode? = getToken(calculatorParser.Tokens.ASIN.id, 0)
		fun LOG() : TerminalNode? = getToken(calculatorParser.Tokens.LOG.id, 0)
		fun LN() : TerminalNode? = getToken(calculatorParser.Tokens.LN.id, 0)
		fun SQRT() : TerminalNode? = getToken(calculatorParser.Tokens.SQRT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is calculatorListener ) (listener as calculatorListener).enterFuncname(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is calculatorListener ) (listener as calculatorListener).exitFuncname(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is calculatorVisitor ) return (visitor as calculatorVisitor<out T>).visitFuncname(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  funcname() : FuncnameContext {
		var _localctx : FuncnameContext = FuncnameContext(context, state)
		enterRule(_localctx, 20, Rules.RULE_funcname.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 87
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl COS) or (1L shl SIN) or (1L shl TAN) or (1L shl ACOS) or (1L shl ASIN) or (1L shl ATAN) or (1L shl LN) or (1L shl LOG) or (1L shl SQRT))) != 0L)) ) {
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

	open class RelopContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_relop.id
	        set(value) { throw RuntimeException() }
		fun EQ() : TerminalNode? = getToken(calculatorParser.Tokens.EQ.id, 0)
		fun GT() : TerminalNode? = getToken(calculatorParser.Tokens.GT.id, 0)
		fun LT() : TerminalNode? = getToken(calculatorParser.Tokens.LT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is calculatorListener ) (listener as calculatorListener).enterRelop(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is calculatorListener ) (listener as calculatorListener).exitRelop(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is calculatorVisitor ) return (visitor as calculatorVisitor<out T>).visitRelop(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  relop() : RelopContext {
		var _localctx : RelopContext = RelopContext(context, state)
		enterRule(_localctx, 22, Rules.RULE_relop.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 89
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl GT) or (1L shl LT) or (1L shl EQ))) != 0L)) ) {
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