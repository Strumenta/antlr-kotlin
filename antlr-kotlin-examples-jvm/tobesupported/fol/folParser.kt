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

class folParser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(folParser.ConditionContext::class,
                                                              folParser.FormulaContext::class,
                                                              folParser.TermContext::class,
                                                              folParser.Bin_connectiveContext::class,
                                                              folParser.VariableContext::class,
                                                              folParser.Pred_constantContext::class,
                                                              folParser.Ind_constantContext::class,
                                                              folParser.Func_constantContext::class,
                                                              folParser.SeparatorContext::class)
    }

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "fol.g4"

    override val tokenNames: Array<String?>?
        get() = folParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = folParser.Companion.ruleNames
    override val atn: ATN
        get() = folParser.Companion.ATN

    enum class Tokens(val id: Int) {
        EOF(-1),
        T__0(1),
        T__1(2),
        T__2(3),
        T__3(4),
        T__4(5),
        LPAREN(6),
        RPAREN(7),
        EQUAL(8),
        NOT(9),
        FORALL(10),
        EXISTS(11),
        CHARACTER(12),
        CONJ(13),
        DISJ(14),
        IMPL(15),
        BICOND(16),
        ENDLINE(17),
        WHITESPACE(18)
    }

    enum class Rules(val id: Int) {
        RULE_condition(0),
        RULE_formula(1),
        RULE_term(2),
        RULE_bin_connective(3),
        RULE_variable(4),
        RULE_pred_constant(5),
        RULE_ind_constant(6),
        RULE_func_constant(7),
        RULE_separator(8)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("condition", "formula", "term", "bin_connective", 
                                "variable", "pred_constant", "ind_constant", 
                                "func_constant", "separator")

        private val LITERAL_NAMES = Arrays.asList<String?>(null, "'?'", 
                                                           "'_'", "'#'", 
                                                           "'.'", "','", 
                                                           "'('", "')'", 
                                                           "'='", "'!'", 
                                                           "'Forall'", "'Exists'", 
                                                           null, "'\\/'", 
                                                           "'^'", "'->'", 
                                                           "'<->'")
        private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            "LPAREN", "RPAREN", 
                                                            "EQUAL", "NOT", 
                                                            "FORALL", "EXISTS", 
                                                            "CHARACTER", 
                                                            "CONJ", "DISJ", 
                                                            "IMPL", "BICOND", 
                                                            "ENDLINE", "WHITESPACE")

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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u0014\u0086\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0003\u0002\u0003\u0002\u0003\u0002\u0007\u0002\u0018\u000a\u0002\u000c\u0002\u000e\u0002\u001b\u000b\u0002\u0003\u0002\u0007\u0002\u001e\u000a\u0002\u000c\u0002\u000e\u0002\u0021\u000b\u0002\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0007\u0003\u003f\u000a\u0003\u000c\u0003\u000e\u0003\u0042\u000b\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0005\u0003\u004a\u000a\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0007\u0003\u0050\u000a\u0003\u000c\u0003\u000e\u0003\u0053\u000b\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0007\u0004\u005d\u000a\u0004\u000c\u0004\u000e\u0004\u0060\u000b\u0004\u0003\u0004\u0003\u0004\u0005\u0004\u0064\u000a\u0004\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0007\u0006\u006a\u000a\u0006\u000c\u0006\u000e\u0006\u006d\u000b\u0006\u0003\u0007\u0003\u0007\u0007\u0007\u0071\u000a\u0007\u000c\u0007\u000e\u0007\u0074\u000b\u0007\u0003\u0008\u0003\u0008\u0007\u0008\u0078\u000a\u0008\u000c\u0008\u000e\u0008\u007b\u000b\u0008\u0003\u0009\u0003\u0009\u0007\u0009\u007f\u000a\u0009\u000c\u0009\u000e\u0009\u0082\u000b\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0002\u0003\u0004\u000b\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0002\u0003\u0003\u0002\u000f\u0012\u0002\u008c\u0002\u0014\u0003\u0002\u0002\u0002\u0004\u0049\u0003\u0002\u0002\u0002\u0006\u0063\u0003\u0002\u0002\u0002\u0008\u0065\u0003\u0002\u0002\u0002\u000a\u0067\u0003\u0002\u0002\u0002\u000c\u006e\u0003\u0002\u0002\u0002\u000e\u0075\u0003\u0002\u0002\u0002\u0010\u007c\u0003\u0002\u0002\u0002\u0012\u0083\u0003\u0002\u0002\u0002\u0014\u0019\u0005\u0004\u0003\u0002\u0015\u0016\u0007\u0013\u0002\u0002\u0016\u0018\u0005\u0004\u0003\u0002\u0017\u0015\u0003\u0002\u0002\u0002\u0018\u001b\u0003\u0002\u0002\u0002\u0019\u0017\u0003\u0002\u0002\u0002\u0019\u001a\u0003\u0002\u0002\u0002\u001a\u001f\u0003\u0002\u0002\u0002\u001b\u0019\u0003\u0002\u0002\u0002\u001c\u001e\u0007\u0013\u0002\u0002\u001d\u001c\u0003\u0002\u0002\u0002\u001e\u0021\u0003\u0002\u0002\u0002\u001f\u001d\u0003\u0002\u0002\u0002\u001f\u0020\u0003\u0002\u0002\u0002\u0020\u0022\u0003\u0002\u0002\u0002\u0021\u001f\u0003\u0002\u0002\u0002\u0022\u0023\u0007\u0002\u0002\u0003\u0023\u0003\u0003\u0002\u0002\u0002\u0024\u0025\u0008\u0003\u0001\u0002\u0025\u0026\u0007\u000b\u0002\u0002\u0026\u0027\u0005\u0004\u0003\u0002\u0027\u0028\u0005\u0008\u0005\u0002\u0028\u0029\u0005\u0004\u0003\u0008\u0029\u004a\u0003\u0002\u0002\u0002\u002a\u002b\u0007\u000b\u0002\u0002\u002b\u004a\u0005\u0004\u0003\u0007\u002c\u002d\u0007\u000c\u0002\u0002\u002d\u002e\u0007\u0008\u0002\u0002\u002e\u002f\u0005\u000a\u0006\u0002\u002f\u0030\u0007\u0009\u0002\u0002\u0030\u0031\u0005\u0004\u0003\u0006\u0031\u004a\u0003\u0002\u0002\u0002\u0032\u0033\u0007\u000d\u0002\u0002\u0033\u0034\u0007\u0008\u0002\u0002\u0034\u0035\u0005\u000a\u0006\u0002\u0035\u0036\u0007\u0009\u0002\u0002\u0036\u0037\u0005\u0004\u0003\u0005\u0037\u004a\u0003\u0002\u0002\u0002\u0038\u0039\u0005\u000c\u0007\u0002\u0039\u003a\u0007\u0008\u0002\u0002\u003a\u0040\u0005\u0006\u0004\u0002\u003b\u003c\u0005\u0012\u000a\u0002\u003c\u003d\u0005\u0006\u0004\u0002\u003d\u003f\u0003\u0002\u0002\u0002\u003e\u003b\u0003\u0002\u0002\u0002\u003f\u0042\u0003\u0002\u0002\u0002\u0040\u003e\u0003\u0002\u0002\u0002\u0040\u0041\u0003\u0002\u0002\u0002\u0041\u0043\u0003\u0002\u0002\u0002\u0042\u0040\u0003\u0002\u0002\u0002\u0043\u0044\u0007\u0009\u0002\u0002\u0044\u004a\u0003\u0002\u0002\u0002\u0045\u0046\u0005\u0006\u0004\u0002\u0046\u0047\u0007\u000a\u0002\u0002\u0047\u0048\u0005\u0006\u0004\u0002\u0048\u004a\u0003\u0002\u0002\u0002\u0049\u0024\u0003\u0002\u0002\u0002\u0049\u002a\u0003\u0002\u0002\u0002\u0049\u002c\u0003\u0002\u0002\u0002\u0049\u0032\u0003\u0002\u0002\u0002\u0049\u0038\u0003\u0002\u0002\u0002\u0049\u0045\u0003\u0002\u0002\u0002\u004a\u0051\u0003\u0002\u0002\u0002\u004b\u004c\u000c\u0009\u0002\u0002\u004c\u004d\u0005\u0008\u0005\u0002\u004d\u004e\u0005\u0004\u0003\u000a\u004e\u0050\u0003\u0002\u0002\u0002\u004f\u004b\u0003\u0002\u0002\u0002\u0050\u0053\u0003\u0002\u0002\u0002\u0051\u004f\u0003\u0002\u0002\u0002\u0051\u0052\u0003\u0002\u0002\u0002\u0052\u0005\u0003\u0002\u0002\u0002\u0053\u0051\u0003\u0002\u0002\u0002\u0054\u0064\u0005\u000e\u0008\u0002\u0055\u0064\u0005\u000a\u0006\u0002\u0056\u0057\u0005\u0010\u0009\u0002\u0057\u0058\u0007\u0008\u0002\u0002\u0058\u005e\u0005\u0006\u0004\u0002\u0059\u005a\u0005\u0012\u000a\u0002\u005a\u005b\u0005\u0006\u0004\u0002\u005b\u005d\u0003\u0002\u0002\u0002\u005c\u0059\u0003\u0002\u0002\u0002\u005d\u0060\u0003\u0002\u0002\u0002\u005e\u005c\u0003\u0002\u0002\u0002\u005e\u005f\u0003\u0002\u0002\u0002\u005f\u0061\u0003\u0002\u0002\u0002\u0060\u005e\u0003\u0002\u0002\u0002\u0061\u0062\u0007\u0009\u0002\u0002\u0062\u0064\u0003\u0002\u0002\u0002\u0063\u0054\u0003\u0002\u0002\u0002\u0063\u0055\u0003\u0002\u0002\u0002\u0063\u0056\u0003\u0002\u0002\u0002\u0064\u0007\u0003\u0002\u0002\u0002\u0065\u0066\u0009\u0002\u0002\u0002\u0066\u0009\u0003\u0002\u0002\u0002\u0067\u006b\u0007\u0003\u0002\u0002\u0068\u006a\u0007\u000e\u0002\u0002\u0069\u0068\u0003\u0002\u0002\u0002\u006a\u006d\u0003\u0002\u0002\u0002\u006b\u0069\u0003\u0002\u0002\u0002\u006b\u006c\u0003\u0002\u0002\u0002\u006c\u000b\u0003\u0002\u0002\u0002\u006d\u006b\u0003\u0002\u0002\u0002\u006e\u0072\u0007\u0004\u0002\u0002\u006f\u0071\u0007\u000e\u0002\u0002\u0070\u006f\u0003\u0002\u0002\u0002\u0071\u0074\u0003\u0002\u0002\u0002\u0072\u0070\u0003\u0002\u0002\u0002\u0072\u0073\u0003\u0002\u0002\u0002\u0073\u000d\u0003\u0002\u0002\u0002\u0074\u0072\u0003\u0002\u0002\u0002\u0075\u0079\u0007\u0005\u0002\u0002\u0076\u0078\u0007\u000e\u0002\u0002\u0077\u0076\u0003\u0002\u0002\u0002\u0078\u007b\u0003\u0002\u0002\u0002\u0079\u0077\u0003\u0002\u0002\u0002\u0079\u007a\u0003\u0002\u0002\u0002\u007a\u000f\u0003\u0002\u0002\u0002\u007b\u0079\u0003\u0002\u0002\u0002\u007c\u0080\u0007\u0006\u0002\u0002\u007d\u007f\u0007\u000e\u0002\u0002\u007e\u007d\u0003\u0002\u0002\u0002\u007f\u0082\u0003\u0002\u0002\u0002\u0080\u007e\u0003\u0002\u0002\u0002\u0080\u0081\u0003\u0002\u0002\u0002\u0081\u0011\u0003\u0002\u0002\u0002\u0082\u0080\u0003\u0002\u0002\u0002\u0083\u0084\u0007\u0007\u0002\u0002\u0084\u0013\u0003\u0002\u0002\u0002\u000d\u0019\u001f\u0040\u0049\u0051\u005e\u0063\u006b\u0072\u0079\u0080"

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
    private val LPAREN = Tokens.LPAREN.id
    private val RPAREN = Tokens.RPAREN.id
    private val EQUAL = Tokens.EQUAL.id
    private val NOT = Tokens.NOT.id
    private val FORALL = Tokens.FORALL.id
    private val EXISTS = Tokens.EXISTS.id
    private val CHARACTER = Tokens.CHARACTER.id
    private val CONJ = Tokens.CONJ.id
    private val DISJ = Tokens.DISJ.id
    private val IMPL = Tokens.IMPL.id
    private val BICOND = Tokens.BICOND.id
    private val ENDLINE = Tokens.ENDLINE.id
    private val WHITESPACE = Tokens.WHITESPACE.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class ConditionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_condition.id
	        set(value) { throw RuntimeException() }
		fun findFormula() : List<FormulaContext> = getRuleContexts(solver.getType("FormulaContext"))
		fun findFormula(i: Int) : FormulaContext? = getRuleContext(solver.getType("FormulaContext"),i)
		fun EOF() : TerminalNode? = getToken(folParser.Tokens.EOF.id, 0)
		fun ENDLINE() : List<TerminalNode> = getTokens(folParser.Tokens.ENDLINE.id)
		fun ENDLINE(i: Int) : TerminalNode = getToken(folParser.Tokens.ENDLINE.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is folListener ) (listener as folListener).enterCondition(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is folListener ) (listener as folListener).exitCondition(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is folVisitor ) return (visitor as folVisitor<out T>).visitCondition(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  condition() : ConditionContext {
		var _localctx : ConditionContext = ConditionContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_condition.id)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 18
			formula(0)
			this.state = 23
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,0,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 19
					match(ENDLINE) as Token
					this.state = 20
					formula(0)
					}
					} 
				}
				this.state = 25
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,0,context)
			}
			this.state = 29
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ENDLINE) {
				if (true){
				if (true){
				this.state = 26
				match(ENDLINE) as Token
				}
				}
				this.state = 31
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 32
			match(EOF) as Token
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

	open class FormulaContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_formula.id
	        set(value) { throw RuntimeException() }
		fun NOT() : TerminalNode? = getToken(folParser.Tokens.NOT.id, 0)
		fun findFormula() : List<FormulaContext> = getRuleContexts(solver.getType("FormulaContext"))
		fun findFormula(i: Int) : FormulaContext? = getRuleContext(solver.getType("FormulaContext"),i)
		fun findBin_connective() : Bin_connectiveContext? = getRuleContext(solver.getType("Bin_connectiveContext"),0)
		fun FORALL() : TerminalNode? = getToken(folParser.Tokens.FORALL.id, 0)
		fun LPAREN() : TerminalNode? = getToken(folParser.Tokens.LPAREN.id, 0)
		fun findVariable() : VariableContext? = getRuleContext(solver.getType("VariableContext"),0)
		fun RPAREN() : TerminalNode? = getToken(folParser.Tokens.RPAREN.id, 0)
		fun EXISTS() : TerminalNode? = getToken(folParser.Tokens.EXISTS.id, 0)
		fun findPred_constant() : Pred_constantContext? = getRuleContext(solver.getType("Pred_constantContext"),0)
		fun findTerm() : List<TermContext> = getRuleContexts(solver.getType("TermContext"))
		fun findTerm(i: Int) : TermContext? = getRuleContext(solver.getType("TermContext"),i)
		fun findSeparator() : List<SeparatorContext> = getRuleContexts(solver.getType("SeparatorContext"))
		fun findSeparator(i: Int) : SeparatorContext? = getRuleContext(solver.getType("SeparatorContext"),i)
		fun EQUAL() : TerminalNode? = getToken(folParser.Tokens.EQUAL.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is folListener ) (listener as folListener).enterFormula(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is folListener ) (listener as folListener).exitFormula(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is folVisitor ) return (visitor as folVisitor<out T>).visitFormula(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun formula() : FormulaContext {
		return formula(0);
	}

	private fun formula(_p: Int) : FormulaContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : FormulaContext= FormulaContext(context, _parentState)
		var _prevctx : FormulaContext= _localctx
		var _startState : Int = 2
		enterRecursionRule(_localctx, 2, Rules.RULE_formula.id, _p)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 71
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,3,context) ) {
			1 -> {if (true){
			this.state = 35
			match(NOT) as Token
			this.state = 36
			formula(0)
			this.state = 37
			bin_connective()
			this.state = 38
			formula(6)
			}}
			2 -> {if (true){
			this.state = 40
			match(NOT) as Token
			this.state = 41
			formula(5)
			}}
			3 -> {if (true){
			this.state = 42
			match(FORALL) as Token
			this.state = 43
			match(LPAREN) as Token
			this.state = 44
			variable()
			this.state = 45
			match(RPAREN) as Token
			this.state = 46
			formula(4)
			}}
			4 -> {if (true){
			this.state = 48
			match(EXISTS) as Token
			this.state = 49
			match(LPAREN) as Token
			this.state = 50
			variable()
			this.state = 51
			match(RPAREN) as Token
			this.state = 52
			formula(3)
			}}
			5 -> {if (true){
			this.state = 54
			pred_constant()
			this.state = 55
			match(LPAREN) as Token
			this.state = 56
			term()
			this.state = 62
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__4) {
				if (true){
				if (true){
				this.state = 57
				separator()
				this.state = 58
				term()
				}
				}
				this.state = 64
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 65
			match(RPAREN) as Token
			}}
			6 -> {if (true){
			this.state = 67
			term()
			this.state = 68
			match(EQUAL) as Token
			this.state = 69
			term()
			}}
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 79
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,4,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					if (true){
					_localctx = FormulaContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_formula.id)
					this.state = 73
					if (!(precpred(context!!, 7))) throw FailedPredicateException(this, "precpred(context!!, 7)")
					this.state = 74
					bin_connective()
					this.state = 75
					formula(8)
					}
					} 
				}
				this.state = 81
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,4,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class TermContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_term.id
	        set(value) { throw RuntimeException() }
		fun findInd_constant() : Ind_constantContext? = getRuleContext(solver.getType("Ind_constantContext"),0)
		fun findVariable() : VariableContext? = getRuleContext(solver.getType("VariableContext"),0)
		fun findFunc_constant() : Func_constantContext? = getRuleContext(solver.getType("Func_constantContext"),0)
		fun LPAREN() : TerminalNode? = getToken(folParser.Tokens.LPAREN.id, 0)
		fun findTerm() : List<TermContext> = getRuleContexts(solver.getType("TermContext"))
		fun findTerm(i: Int) : TermContext? = getRuleContext(solver.getType("TermContext"),i)
		fun RPAREN() : TerminalNode? = getToken(folParser.Tokens.RPAREN.id, 0)
		fun findSeparator() : List<SeparatorContext> = getRuleContexts(solver.getType("SeparatorContext"))
		fun findSeparator(i: Int) : SeparatorContext? = getRuleContext(solver.getType("SeparatorContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is folListener ) (listener as folListener).enterTerm(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is folListener ) (listener as folListener).exitTerm(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is folVisitor ) return (visitor as folVisitor<out T>).visitTerm(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  term() : TermContext {
		var _localctx : TermContext = TermContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_term.id)
		var _la: Int
		try {
			this.state = 97
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			T__2  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 82
			ind_constant()
			}}
			T__0  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 83
			variable()
			}}
			T__3  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 84
			func_constant()
			this.state = 85
			match(LPAREN) as Token
			this.state = 86
			term()
			this.state = 92
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__4) {
				if (true){
				if (true){
				this.state = 87
				separator()
				this.state = 88
				term()
				}
				}
				this.state = 94
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 95
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

	open class Bin_connectiveContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_bin_connective.id
	        set(value) { throw RuntimeException() }
		fun CONJ() : TerminalNode? = getToken(folParser.Tokens.CONJ.id, 0)
		fun DISJ() : TerminalNode? = getToken(folParser.Tokens.DISJ.id, 0)
		fun IMPL() : TerminalNode? = getToken(folParser.Tokens.IMPL.id, 0)
		fun BICOND() : TerminalNode? = getToken(folParser.Tokens.BICOND.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is folListener ) (listener as folListener).enterBin_connective(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is folListener ) (listener as folListener).exitBin_connective(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is folVisitor ) return (visitor as folVisitor<out T>).visitBin_connective(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  bin_connective() : Bin_connectiveContext {
		var _localctx : Bin_connectiveContext = Bin_connectiveContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_bin_connective.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 99
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl CONJ) or (1L shl DISJ) or (1L shl IMPL) or (1L shl BICOND))) != 0L)) ) {
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
		fun CHARACTER() : List<TerminalNode> = getTokens(folParser.Tokens.CHARACTER.id)
		fun CHARACTER(i: Int) : TerminalNode = getToken(folParser.Tokens.CHARACTER.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is folListener ) (listener as folListener).enterVariable(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is folListener ) (listener as folListener).exitVariable(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is folVisitor ) return (visitor as folVisitor<out T>).visitVariable(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  variable() : VariableContext {
		var _localctx : VariableContext = VariableContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_variable.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 101
			match(T__0) as Token
			this.state = 105
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,7,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 102
					match(CHARACTER) as Token
					}
					} 
				}
				this.state = 107
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,7,context)
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

	open class Pred_constantContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_pred_constant.id
	        set(value) { throw RuntimeException() }
		fun CHARACTER() : List<TerminalNode> = getTokens(folParser.Tokens.CHARACTER.id)
		fun CHARACTER(i: Int) : TerminalNode = getToken(folParser.Tokens.CHARACTER.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is folListener ) (listener as folListener).enterPred_constant(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is folListener ) (listener as folListener).exitPred_constant(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is folVisitor ) return (visitor as folVisitor<out T>).visitPred_constant(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  pred_constant() : Pred_constantContext {
		var _localctx : Pred_constantContext = Pred_constantContext(context, state)
		enterRule(_localctx, 10, Rules.RULE_pred_constant.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 108
			match(T__1) as Token
			this.state = 112
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==CHARACTER) {
				if (true){
				if (true){
				this.state = 109
				match(CHARACTER) as Token
				}
				}
				this.state = 114
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

	open class Ind_constantContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_ind_constant.id
	        set(value) { throw RuntimeException() }
		fun CHARACTER() : List<TerminalNode> = getTokens(folParser.Tokens.CHARACTER.id)
		fun CHARACTER(i: Int) : TerminalNode = getToken(folParser.Tokens.CHARACTER.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is folListener ) (listener as folListener).enterInd_constant(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is folListener ) (listener as folListener).exitInd_constant(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is folVisitor ) return (visitor as folVisitor<out T>).visitInd_constant(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  ind_constant() : Ind_constantContext {
		var _localctx : Ind_constantContext = Ind_constantContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_ind_constant.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 115
			match(T__2) as Token
			this.state = 119
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,9,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 116
					match(CHARACTER) as Token
					}
					} 
				}
				this.state = 121
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,9,context)
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

	open class Func_constantContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_func_constant.id
	        set(value) { throw RuntimeException() }
		fun CHARACTER() : List<TerminalNode> = getTokens(folParser.Tokens.CHARACTER.id)
		fun CHARACTER(i: Int) : TerminalNode = getToken(folParser.Tokens.CHARACTER.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is folListener ) (listener as folListener).enterFunc_constant(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is folListener ) (listener as folListener).exitFunc_constant(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is folVisitor ) return (visitor as folVisitor<out T>).visitFunc_constant(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  func_constant() : Func_constantContext {
		var _localctx : Func_constantContext = Func_constantContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_func_constant.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 122
			match(T__3) as Token
			this.state = 126
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==CHARACTER) {
				if (true){
				if (true){
				this.state = 123
				match(CHARACTER) as Token
				}
				}
				this.state = 128
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

	open class SeparatorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_separator.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is folListener ) (listener as folListener).enterSeparator(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is folListener ) (listener as folListener).exitSeparator(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is folVisitor ) return (visitor as folVisitor<out T>).visitSeparator(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  separator() : SeparatorContext {
		var _localctx : SeparatorContext = SeparatorContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_separator.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 129
			match(T__4) as Token
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

	override fun sempred(_localctx: RuleContext?, ruleIndex: Int, predIndex: Int) : Boolean {
		when (ruleIndex) {
		1 -> return formula_sempred(_localctx as FormulaContext, predIndex)
		}
		return true
	}
	private fun formula_sempred( _localctx : FormulaContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    0 -> return precpred(context!!, 7)
		}
		return true
	}

}