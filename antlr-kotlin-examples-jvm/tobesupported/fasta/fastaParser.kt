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

class fastaParser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(fastaParser.SequenceContext::class,
                                                              fastaParser.SectionContext::class,
                                                              fastaParser.SequencelinesContext::class,
                                                              fastaParser.DescriptionlineContext::class,
                                                              fastaParser.CommentlineContext::class)
    }

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "fasta.g4"

    override val tokenNames: Array<String?>?
        get() = fastaParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = fastaParser.Companion.ruleNames
    override val atn: ATN
        get() = fastaParser.Companion.ATN

    enum class Tokens(val id: Int) {
        EOF(-1),
        COMMENTLINE(1),
        DESCRIPTIONLINE(2),
        TEXT(3),
        EOL(4),
        SEQUENCELINE(5)
    }

    enum class Rules(val id: Int) {
        RULE_sequence(0),
        RULE_section(1),
        RULE_sequencelines(2),
        RULE_descriptionline(3),
        RULE_commentline(4)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("sequence", "section", "sequencelines", 
                                "descriptionline", "commentline")

        private val LITERAL_NAMES = Arrays.asList<String?>()
        private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, "COMMENTLINE", 
                                                            "DESCRIPTIONLINE", 
                                                            "TEXT", "EOL", 
                                                            "SEQUENCELINE")

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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u0007\u0020\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0003\u0002\u0006\u0002\u000e\u000a\u0002\u000d\u0002\u000e\u0002\u000f\u0003\u0003\u0003\u0003\u0003\u0003\u0005\u0003\u0015\u000a\u0003\u0003\u0004\u0006\u0004\u0018\u000a\u0004\u000d\u0004\u000e\u0004\u0019\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0002\u0002\u0007\u0002\u0004\u0006\u0008\u000a\u0002\u0002\u0002\u001e\u0002\u000d\u0003\u0002\u0002\u0002\u0004\u0014\u0003\u0002\u0002\u0002\u0006\u0017\u0003\u0002\u0002\u0002\u0008\u001b\u0003\u0002\u0002\u0002\u000a\u001d\u0003\u0002\u0002\u0002\u000c\u000e\u0005\u0004\u0003\u0002\u000d\u000c\u0003\u0002\u0002\u0002\u000e\u000f\u0003\u0002\u0002\u0002\u000f\u000d\u0003\u0002\u0002\u0002\u000f\u0010\u0003\u0002\u0002\u0002\u0010\u0003\u0003\u0002\u0002\u0002\u0011\u0015\u0005\u0008\u0005\u0002\u0012\u0015\u0005\u0006\u0004\u0002\u0013\u0015\u0005\u000a\u0006\u0002\u0014\u0011\u0003\u0002\u0002\u0002\u0014\u0012\u0003\u0002\u0002\u0002\u0014\u0013\u0003\u0002\u0002\u0002\u0015\u0005\u0003\u0002\u0002\u0002\u0016\u0018\u0007\u0007\u0002\u0002\u0017\u0016\u0003\u0002\u0002\u0002\u0018\u0019\u0003\u0002\u0002\u0002\u0019\u0017\u0003\u0002\u0002\u0002\u0019\u001a\u0003\u0002\u0002\u0002\u001a\u0007\u0003\u0002\u0002\u0002\u001b\u001c\u0007\u0004\u0002\u0002\u001c\u0009\u0003\u0002\u0002\u0002\u001d\u001e\u0007\u0003\u0002\u0002\u001e\u000b\u0003\u0002\u0002\u0002\u0005\u000f\u0014\u0019"

        val ATN = ATNDeserializer().deserialize(serializedATN.toCharArray())
        init {
        	decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
        		DFA(ATN.getDecisionState(it)!!, it)
        	})


        }
	}

    private val COMMENTLINE = Tokens.COMMENTLINE.id
    private val DESCRIPTIONLINE = Tokens.DESCRIPTIONLINE.id
    private val TEXT = Tokens.TEXT.id
    private val EOL = Tokens.EOL.id
    private val SEQUENCELINE = Tokens.SEQUENCELINE.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class SequenceContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_sequence.id
	        set(value) { throw RuntimeException() }
		fun findSection() : List<SectionContext> = getRuleContexts(solver.getType("SectionContext"))
		fun findSection(i: Int) : SectionContext? = getRuleContext(solver.getType("SectionContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is fastaListener ) (listener as fastaListener).enterSequence(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is fastaListener ) (listener as fastaListener).exitSequence(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is fastaVisitor ) return (visitor as fastaVisitor<out T>).visitSequence(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  sequence() : SequenceContext {
		var _localctx : SequenceContext = SequenceContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_sequence.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 11 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 10
				section()
				}
				}
				this.state = 13 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl COMMENTLINE) or (1L shl DESCRIPTIONLINE) or (1L shl SEQUENCELINE))) != 0L) )
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

	open class SectionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_section.id
	        set(value) { throw RuntimeException() }
		fun findDescriptionline() : DescriptionlineContext? = getRuleContext(solver.getType("DescriptionlineContext"),0)
		fun findSequencelines() : SequencelinesContext? = getRuleContext(solver.getType("SequencelinesContext"),0)
		fun findCommentline() : CommentlineContext? = getRuleContext(solver.getType("CommentlineContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is fastaListener ) (listener as fastaListener).enterSection(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is fastaListener ) (listener as fastaListener).exitSection(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is fastaVisitor ) return (visitor as fastaVisitor<out T>).visitSection(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  section() : SectionContext {
		var _localctx : SectionContext = SectionContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_section.id)
		try {
			this.state = 18
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			DESCRIPTIONLINE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 15
			descriptionline()
			}}
			SEQUENCELINE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 16
			sequencelines()
			}}
			COMMENTLINE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 17
			commentline()
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

	open class SequencelinesContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_sequencelines.id
	        set(value) { throw RuntimeException() }
		fun SEQUENCELINE() : List<TerminalNode> = getTokens(fastaParser.Tokens.SEQUENCELINE.id)
		fun SEQUENCELINE(i: Int) : TerminalNode = getToken(fastaParser.Tokens.SEQUENCELINE.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is fastaListener ) (listener as fastaListener).enterSequencelines(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is fastaListener ) (listener as fastaListener).exitSequencelines(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is fastaVisitor ) return (visitor as fastaVisitor<out T>).visitSequencelines(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  sequencelines() : SequencelinesContext {
		var _localctx : SequencelinesContext = SequencelinesContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_sequencelines.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 21 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				if (true){
				this.state = 20
				match(SEQUENCELINE) as Token
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 23 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,2,context)
			} while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER )
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

	open class DescriptionlineContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_descriptionline.id
	        set(value) { throw RuntimeException() }
		fun DESCRIPTIONLINE() : TerminalNode? = getToken(fastaParser.Tokens.DESCRIPTIONLINE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is fastaListener ) (listener as fastaListener).enterDescriptionline(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is fastaListener ) (listener as fastaListener).exitDescriptionline(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is fastaVisitor ) return (visitor as fastaVisitor<out T>).visitDescriptionline(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  descriptionline() : DescriptionlineContext {
		var _localctx : DescriptionlineContext = DescriptionlineContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_descriptionline.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 25
			match(DESCRIPTIONLINE) as Token
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

	open class CommentlineContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_commentline.id
	        set(value) { throw RuntimeException() }
		fun COMMENTLINE() : TerminalNode? = getToken(fastaParser.Tokens.COMMENTLINE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is fastaListener ) (listener as fastaListener).enterCommentline(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is fastaListener ) (listener as fastaListener).exitCommentline(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is fastaVisitor ) return (visitor as fastaVisitor<out T>).visitCommentline(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  commentline() : CommentlineContext {
		var _localctx : CommentlineContext = CommentlineContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_commentline.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 27
			match(COMMENTLINE) as Token
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