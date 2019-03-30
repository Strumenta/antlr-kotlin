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

class bnfParser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(bnfParser.RulelistContext::class,
                                                              bnfParser.Rule_Context::class,
                                                              bnfParser.LhsContext::class,
                                                              bnfParser.RhsContext::class,
                                                              bnfParser.AlternativesContext::class,
                                                              bnfParser.AlternativeContext::class,
                                                              bnfParser.ElementContext::class,
                                                              bnfParser.OptionalContext::class,
                                                              bnfParser.ZeroormoreContext::class,
                                                              bnfParser.OneormoreContext::class,
                                                              bnfParser.TextContext::class,
                                                              bnfParser.IdContext::class,
                                                              bnfParser.RuleidContext::class)
    }

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "bnf.g4"

    override val tokenNames: Array<String?>?
        get() = bnfParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = bnfParser.Companion.ruleNames
    override val atn: ATN
        get() = bnfParser.Companion.ATN

    enum class Tokens(val id: Int) {
        EOF(-1),
        ASSIGN(1),
        LPAREN(2),
        RPAREN(3),
        LBRACE(4),
        RBRACE(5),
        LEND(6),
        REND(7),
        BAR(8),
        GT(9),
        LT(10),
        ID(11),
        WS(12)
    }

    enum class Rules(val id: Int) {
        RULE_rulelist(0),
        RULE_rule_(1),
        RULE_lhs(2),
        RULE_rhs(3),
        RULE_alternatives(4),
        RULE_alternative(5),
        RULE_element(6),
        RULE_optional(7),
        RULE_zeroormore(8),
        RULE_oneormore(9),
        RULE_text(10),
        RULE_id(11),
        RULE_ruleid(12)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("rulelist", "rule_", "lhs", "rhs", "alternatives", 
                                "alternative", "element", "optional", "zeroormore", 
                                "oneormore", "text", "id", "ruleid")

        private val LITERAL_NAMES = Arrays.asList<String?>(null, "'::='", 
                                                           "')'", "'('", 
                                                           "'}'", "'{'", 
                                                           "']'", "'['", 
                                                           "'|'", "'>'", 
                                                           "'<'")
        private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, "ASSIGN", 
                                                            "LPAREN", "RPAREN", 
                                                            "LBRACE", "RBRACE", 
                                                            "LEND", "REND", 
                                                            "BAR", "GT", 
                                                            "LT", "ID", 
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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u000e\u0056\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0003\u0002\u0007\u0002\u001e\u000a\u0002\u000c\u0002\u000e\u0002\u0021\u000b\u0002\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0007\u0006\u0030\u000a\u0006\u000c\u0006\u000e\u0006\u0033\u000b\u0006\u0003\u0007\u0007\u0007\u0036\u000a\u0007\u000c\u0007\u000e\u0007\u0039\u000b\u0007\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0005\u0008\u0040\u000a\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000c\u0003\u000c\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000e\u0003\u000e\u0003\u000e\u0002\u0002\u000f\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0002\u0002\u0002\u004f\u0002\u001f\u0003\u0002\u0002\u0002\u0004\u0024\u0003\u0002\u0002\u0002\u0006\u0028\u0003\u0002\u0002\u0002\u0008\u002a\u0003\u0002\u0002\u0002\u000a\u002c\u0003\u0002\u0002\u0002\u000c\u0037\u0003\u0002\u0002\u0002\u000e\u003f\u0003\u0002\u0002\u0002\u0010\u0041\u0003\u0002\u0002\u0002\u0012\u0045\u0003\u0002\u0002\u0002\u0014\u0049\u0003\u0002\u0002\u0002\u0016\u004d\u0003\u0002\u0002\u0002\u0018\u004f\u0003\u0002\u0002\u0002\u001a\u0053\u0003\u0002\u0002\u0002\u001c\u001e\u0005\u0004\u0003\u0002\u001d\u001c\u0003\u0002\u0002\u0002\u001e\u0021\u0003\u0002\u0002\u0002\u001f\u001d\u0003\u0002\u0002\u0002\u001f\u0020\u0003\u0002\u0002\u0002\u0020\u0022\u0003\u0002\u0002\u0002\u0021\u001f\u0003\u0002\u0002\u0002\u0022\u0023\u0007\u0002\u0002\u0003\u0023\u0003\u0003\u0002\u0002\u0002\u0024\u0025\u0005\u0006\u0004\u0002\u0025\u0026\u0007\u0003\u0002\u0002\u0026\u0027\u0005\u0008\u0005\u0002\u0027\u0005\u0003\u0002\u0002\u0002\u0028\u0029\u0005\u0018\u000d\u0002\u0029\u0007\u0003\u0002\u0002\u0002\u002a\u002b\u0005\u000a\u0006\u0002\u002b\u0009\u0003\u0002\u0002\u0002\u002c\u0031\u0005\u000c\u0007\u0002\u002d\u002e\u0007\u000a\u0002\u0002\u002e\u0030\u0005\u000c\u0007\u0002\u002f\u002d\u0003\u0002\u0002\u0002\u0030\u0033\u0003\u0002\u0002\u0002\u0031\u002f\u0003\u0002\u0002\u0002\u0031\u0032\u0003\u0002\u0002\u0002\u0032\u000b\u0003\u0002\u0002\u0002\u0033\u0031\u0003\u0002\u0002\u0002\u0034\u0036\u0005\u000e\u0008\u0002\u0035\u0034\u0003\u0002\u0002\u0002\u0036\u0039\u0003\u0002\u0002\u0002\u0037\u0035\u0003\u0002\u0002\u0002\u0037\u0038\u0003\u0002\u0002\u0002\u0038\u000d\u0003\u0002\u0002\u0002\u0039\u0037\u0003\u0002\u0002\u0002\u003a\u0040\u0005\u0010\u0009\u0002\u003b\u0040\u0005\u0012\u000a\u0002\u003c\u0040\u0005\u0014\u000b\u0002\u003d\u0040\u0005\u0016\u000c\u0002\u003e\u0040\u0005\u0018\u000d\u0002\u003f\u003a\u0003\u0002\u0002\u0002\u003f\u003b\u0003\u0002\u0002\u0002\u003f\u003c\u0003\u0002\u0002\u0002\u003f\u003d\u0003\u0002\u0002\u0002\u003f\u003e\u0003\u0002\u0002\u0002\u0040\u000f\u0003\u0002\u0002\u0002\u0041\u0042\u0007\u0009\u0002\u0002\u0042\u0043\u0005\u000a\u0006\u0002\u0043\u0044\u0007\u0008\u0002\u0002\u0044\u0011\u0003\u0002\u0002\u0002\u0045\u0046\u0007\u0007\u0002\u0002\u0046\u0047\u0005\u000a\u0006\u0002\u0047\u0048\u0007\u0006\u0002\u0002\u0048\u0013\u0003\u0002\u0002\u0002\u0049\u004a\u0007\u0005\u0002\u0002\u004a\u004b\u0005\u000a\u0006\u0002\u004b\u004c\u0007\u0004\u0002\u0002\u004c\u0015\u0003\u0002\u0002\u0002\u004d\u004e\u0007\u000d\u0002\u0002\u004e\u0017\u0003\u0002\u0002\u0002\u004f\u0050\u0007\u000c\u0002\u0002\u0050\u0051\u0005\u001a\u000e\u0002\u0051\u0052\u0007\u000b\u0002\u0002\u0052\u0019\u0003\u0002\u0002\u0002\u0053\u0054\u0007\u000d\u0002\u0002\u0054\u001b\u0003\u0002\u0002\u0002\u0006\u001f\u0031\u0037\u003f"

        val ATN = ATNDeserializer().deserialize(serializedATN.toCharArray())
        init {
        	decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
        		DFA(ATN.getDecisionState(it)!!, it)
        	})


        }
	}

    private val ASSIGN = Tokens.ASSIGN.id
    private val LPAREN = Tokens.LPAREN.id
    private val RPAREN = Tokens.RPAREN.id
    private val LBRACE = Tokens.LBRACE.id
    private val RBRACE = Tokens.RBRACE.id
    private val LEND = Tokens.LEND.id
    private val REND = Tokens.REND.id
    private val BAR = Tokens.BAR.id
    private val GT = Tokens.GT.id
    private val LT = Tokens.LT.id
    private val ID = Tokens.ID.id
    private val WS = Tokens.WS.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class RulelistContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_rulelist.id
	        set(value) { throw RuntimeException() }
		fun EOF() : TerminalNode? = getToken(bnfParser.Tokens.EOF.id, 0)
		fun findRule_() : List<Rule_Context> = getRuleContexts(solver.getType("Rule_Context"))
		fun findRule_(i: Int) : Rule_Context? = getRuleContext(solver.getType("Rule_Context"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is bnfListener ) (listener as bnfListener).enterRulelist(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is bnfListener ) (listener as bnfListener).exitRulelist(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is bnfVisitor ) return (visitor as bnfVisitor<out T>).visitRulelist(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  rulelist() : RulelistContext {
		var _localctx : RulelistContext = RulelistContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_rulelist.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 29
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LT) {
				if (true){
				if (true){
				this.state = 26
				rule_()
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

	open class Rule_Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_rule_.id
	        set(value) { throw RuntimeException() }
		fun findLhs() : LhsContext? = getRuleContext(solver.getType("LhsContext"),0)
		fun ASSIGN() : TerminalNode? = getToken(bnfParser.Tokens.ASSIGN.id, 0)
		fun findRhs() : RhsContext? = getRuleContext(solver.getType("RhsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is bnfListener ) (listener as bnfListener).enterRule_(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is bnfListener ) (listener as bnfListener).exitRule_(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is bnfVisitor ) return (visitor as bnfVisitor<out T>).visitRule_(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  rule_() : Rule_Context {
		var _localctx : Rule_Context = Rule_Context(context, state)
		enterRule(_localctx, 2, Rules.RULE_rule_.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 34
			lhs()
			this.state = 35
			match(ASSIGN) as Token
			this.state = 36
			rhs()
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

	open class LhsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_lhs.id
	        set(value) { throw RuntimeException() }
		fun findId() : IdContext? = getRuleContext(solver.getType("IdContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is bnfListener ) (listener as bnfListener).enterLhs(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is bnfListener ) (listener as bnfListener).exitLhs(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is bnfVisitor ) return (visitor as bnfVisitor<out T>).visitLhs(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  lhs() : LhsContext {
		var _localctx : LhsContext = LhsContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_lhs.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 38
			id()
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

	open class RhsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_rhs.id
	        set(value) { throw RuntimeException() }
		fun findAlternatives() : AlternativesContext? = getRuleContext(solver.getType("AlternativesContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is bnfListener ) (listener as bnfListener).enterRhs(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is bnfListener ) (listener as bnfListener).exitRhs(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is bnfVisitor ) return (visitor as bnfVisitor<out T>).visitRhs(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  rhs() : RhsContext {
		var _localctx : RhsContext = RhsContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_rhs.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 40
			alternatives()
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

	open class AlternativesContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_alternatives.id
	        set(value) { throw RuntimeException() }
		fun findAlternative() : List<AlternativeContext> = getRuleContexts(solver.getType("AlternativeContext"))
		fun findAlternative(i: Int) : AlternativeContext? = getRuleContext(solver.getType("AlternativeContext"),i)
		fun BAR() : List<TerminalNode> = getTokens(bnfParser.Tokens.BAR.id)
		fun BAR(i: Int) : TerminalNode = getToken(bnfParser.Tokens.BAR.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is bnfListener ) (listener as bnfListener).enterAlternatives(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is bnfListener ) (listener as bnfListener).exitAlternatives(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is bnfVisitor ) return (visitor as bnfVisitor<out T>).visitAlternatives(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  alternatives() : AlternativesContext {
		var _localctx : AlternativesContext = AlternativesContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_alternatives.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 42
			alternative()
			this.state = 47
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==BAR) {
				if (true){
				if (true){
				this.state = 43
				match(BAR) as Token
				this.state = 44
				alternative()
				}
				}
				this.state = 49
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

	open class AlternativeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_alternative.id
	        set(value) { throw RuntimeException() }
		fun findElement() : List<ElementContext> = getRuleContexts(solver.getType("ElementContext"))
		fun findElement(i: Int) : ElementContext? = getRuleContext(solver.getType("ElementContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is bnfListener ) (listener as bnfListener).enterAlternative(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is bnfListener ) (listener as bnfListener).exitAlternative(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is bnfVisitor ) return (visitor as bnfVisitor<out T>).visitAlternative(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  alternative() : AlternativeContext {
		var _localctx : AlternativeContext = AlternativeContext(context, state)
		enterRule(_localctx, 10, Rules.RULE_alternative.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 53
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,2,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 50
					element()
					}
					} 
				}
				this.state = 55
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,2,context)
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

	open class ElementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_element.id
	        set(value) { throw RuntimeException() }
		fun findOptional() : OptionalContext? = getRuleContext(solver.getType("OptionalContext"),0)
		fun findZeroormore() : ZeroormoreContext? = getRuleContext(solver.getType("ZeroormoreContext"),0)
		fun findOneormore() : OneormoreContext? = getRuleContext(solver.getType("OneormoreContext"),0)
		fun findText() : TextContext? = getRuleContext(solver.getType("TextContext"),0)
		fun findId() : IdContext? = getRuleContext(solver.getType("IdContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is bnfListener ) (listener as bnfListener).enterElement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is bnfListener ) (listener as bnfListener).exitElement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is bnfVisitor ) return (visitor as bnfVisitor<out T>).visitElement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  element() : ElementContext {
		var _localctx : ElementContext = ElementContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_element.id)
		try {
			this.state = 61
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			REND  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 56
			optional()
			}}
			RBRACE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 57
			zeroormore()
			}}
			RPAREN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 58
			oneormore()
			}}
			ID  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 59
			text()
			}}
			LT  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 60
			id()
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

	open class OptionalContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_optional.id
	        set(value) { throw RuntimeException() }
		fun REND() : TerminalNode? = getToken(bnfParser.Tokens.REND.id, 0)
		fun findAlternatives() : AlternativesContext? = getRuleContext(solver.getType("AlternativesContext"),0)
		fun LEND() : TerminalNode? = getToken(bnfParser.Tokens.LEND.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is bnfListener ) (listener as bnfListener).enterOptional(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is bnfListener ) (listener as bnfListener).exitOptional(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is bnfVisitor ) return (visitor as bnfVisitor<out T>).visitOptional(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  optional() : OptionalContext {
		var _localctx : OptionalContext = OptionalContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_optional.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 63
			match(REND) as Token
			this.state = 64
			alternatives()
			this.state = 65
			match(LEND) as Token
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

	open class ZeroormoreContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_zeroormore.id
	        set(value) { throw RuntimeException() }
		fun RBRACE() : TerminalNode? = getToken(bnfParser.Tokens.RBRACE.id, 0)
		fun findAlternatives() : AlternativesContext? = getRuleContext(solver.getType("AlternativesContext"),0)
		fun LBRACE() : TerminalNode? = getToken(bnfParser.Tokens.LBRACE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is bnfListener ) (listener as bnfListener).enterZeroormore(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is bnfListener ) (listener as bnfListener).exitZeroormore(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is bnfVisitor ) return (visitor as bnfVisitor<out T>).visitZeroormore(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  zeroormore() : ZeroormoreContext {
		var _localctx : ZeroormoreContext = ZeroormoreContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_zeroormore.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 67
			match(RBRACE) as Token
			this.state = 68
			alternatives()
			this.state = 69
			match(LBRACE) as Token
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

	open class OneormoreContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_oneormore.id
	        set(value) { throw RuntimeException() }
		fun RPAREN() : TerminalNode? = getToken(bnfParser.Tokens.RPAREN.id, 0)
		fun findAlternatives() : AlternativesContext? = getRuleContext(solver.getType("AlternativesContext"),0)
		fun LPAREN() : TerminalNode? = getToken(bnfParser.Tokens.LPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is bnfListener ) (listener as bnfListener).enterOneormore(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is bnfListener ) (listener as bnfListener).exitOneormore(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is bnfVisitor ) return (visitor as bnfVisitor<out T>).visitOneormore(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  oneormore() : OneormoreContext {
		var _localctx : OneormoreContext = OneormoreContext(context, state)
		enterRule(_localctx, 18, Rules.RULE_oneormore.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 71
			match(RPAREN) as Token
			this.state = 72
			alternatives()
			this.state = 73
			match(LPAREN) as Token
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

	open class TextContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_text.id
	        set(value) { throw RuntimeException() }
		fun ID() : TerminalNode? = getToken(bnfParser.Tokens.ID.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is bnfListener ) (listener as bnfListener).enterText(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is bnfListener ) (listener as bnfListener).exitText(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is bnfVisitor ) return (visitor as bnfVisitor<out T>).visitText(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  text() : TextContext {
		var _localctx : TextContext = TextContext(context, state)
		enterRule(_localctx, 20, Rules.RULE_text.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 75
			match(ID) as Token
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

	open class IdContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_id.id
	        set(value) { throw RuntimeException() }
		fun LT() : TerminalNode? = getToken(bnfParser.Tokens.LT.id, 0)
		fun findRuleid() : RuleidContext? = getRuleContext(solver.getType("RuleidContext"),0)
		fun GT() : TerminalNode? = getToken(bnfParser.Tokens.GT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is bnfListener ) (listener as bnfListener).enterId(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is bnfListener ) (listener as bnfListener).exitId(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is bnfVisitor ) return (visitor as bnfVisitor<out T>).visitId(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  id() : IdContext {
		var _localctx : IdContext = IdContext(context, state)
		enterRule(_localctx, 22, Rules.RULE_id.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 77
			match(LT) as Token
			this.state = 78
			ruleid()
			this.state = 79
			match(GT) as Token
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

	open class RuleidContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_ruleid.id
	        set(value) { throw RuntimeException() }
		fun ID() : TerminalNode? = getToken(bnfParser.Tokens.ID.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is bnfListener ) (listener as bnfListener).enterRuleid(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is bnfListener ) (listener as bnfListener).exitRuleid(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is bnfVisitor ) return (visitor as bnfVisitor<out T>).visitRuleid(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  ruleid() : RuleidContext {
		var _localctx : RuleidContext = RuleidContext(context, state)
		enterRule(_localctx, 24, Rules.RULE_ruleid.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 81
			match(ID) as Token
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