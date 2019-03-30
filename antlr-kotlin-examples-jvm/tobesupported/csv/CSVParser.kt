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

class CSVParser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(CSVParser.CsvFileContext::class,
                                                              CSVParser.HdrContext::class,
                                                              CSVParser.RowContext::class,
                                                              CSVParser.FieldContext::class)
    }

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "CSV.g4"

    override val tokenNames: Array<String?>?
        get() = CSVParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = CSVParser.Companion.ruleNames
    override val atn: ATN
        get() = CSVParser.Companion.ATN

    enum class Tokens(val id: Int) {
        EOF(-1),
        T__0(1),
        T__1(2),
        T__2(3),
        TEXT(4),
        STRING(5)
    }

    enum class Rules(val id: Int) {
        RULE_csvFile(0),
        RULE_hdr(1),
        RULE_row(2),
        RULE_field(3)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("csvFile", "hdr", "row", "field")

        private val LITERAL_NAMES = Arrays.asList<String?>(null, "','", 
                                                           "'\r'", "'\n'")
        private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, null, 
                                                            null, null, 
                                                            "TEXT", "STRING")

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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u0007\u0025\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0003\u0002\u0003\u0002\u0006\u0002\u000d\u000a\u0002\u000d\u0002\u000e\u0002\u000e\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0007\u0004\u0016\u000a\u0004\u000c\u0004\u000e\u0004\u0019\u000b\u0004\u0003\u0004\u0005\u0004\u001c\u000a\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005\u0023\u000a\u0005\u0003\u0005\u0002\u0002\u0006\u0002\u0004\u0006\u0008\u0002\u0002\u0002\u0025\u0002\u000a\u0003\u0002\u0002\u0002\u0004\u0010\u0003\u0002\u0002\u0002\u0006\u0012\u0003\u0002\u0002\u0002\u0008\u0022\u0003\u0002\u0002\u0002\u000a\u000c\u0005\u0004\u0003\u0002\u000b\u000d\u0005\u0006\u0004\u0002\u000c\u000b\u0003\u0002\u0002\u0002\u000d\u000e\u0003\u0002\u0002\u0002\u000e\u000c\u0003\u0002\u0002\u0002\u000e\u000f\u0003\u0002\u0002\u0002\u000f\u0003\u0003\u0002\u0002\u0002\u0010\u0011\u0005\u0006\u0004\u0002\u0011\u0005\u0003\u0002\u0002\u0002\u0012\u0017\u0005\u0008\u0005\u0002\u0013\u0014\u0007\u0003\u0002\u0002\u0014\u0016\u0005\u0008\u0005\u0002\u0015\u0013\u0003\u0002\u0002\u0002\u0016\u0019\u0003\u0002\u0002\u0002\u0017\u0015\u0003\u0002\u0002\u0002\u0017\u0018\u0003\u0002\u0002\u0002\u0018\u001b\u0003\u0002\u0002\u0002\u0019\u0017\u0003\u0002\u0002\u0002\u001a\u001c\u0007\u0004\u0002\u0002\u001b\u001a\u0003\u0002\u0002\u0002\u001b\u001c\u0003\u0002\u0002\u0002\u001c\u001d\u0003\u0002\u0002\u0002\u001d\u001e\u0007\u0005\u0002\u0002\u001e\u0007\u0003\u0002\u0002\u0002\u001f\u0023\u0007\u0006\u0002\u0002\u0020\u0023\u0007\u0007\u0002\u0002\u0021\u0023\u0003\u0002\u0002\u0002\u0022\u001f\u0003\u0002\u0002\u0002\u0022\u0020\u0003\u0002\u0002\u0002\u0022\u0021\u0003\u0002\u0002\u0002\u0023\u0009\u0003\u0002\u0002\u0002\u0006\u000e\u0017\u001b\u0022"

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
    private val TEXT = Tokens.TEXT.id
    private val STRING = Tokens.STRING.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class CsvFileContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_csvFile.id
	        set(value) { throw RuntimeException() }
		fun findHdr() : HdrContext? = getRuleContext(solver.getType("HdrContext"),0)
		fun findRow() : List<RowContext> = getRuleContexts(solver.getType("RowContext"))
		fun findRow(i: Int) : RowContext? = getRuleContext(solver.getType("RowContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CSVListener ) (listener as CSVListener).enterCsvFile(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CSVListener ) (listener as CSVListener).exitCsvFile(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CSVVisitor ) return (visitor as CSVVisitor<out T>).visitCsvFile(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  csvFile() : CsvFileContext {
		var _localctx : CsvFileContext = CsvFileContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_csvFile.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 8
			hdr()
			this.state = 10 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 9
				row()
				}
				}
				this.state = 12 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__0) or (1L shl T__1) or (1L shl T__2) or (1L shl TEXT) or (1L shl STRING))) != 0L) )
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

	open class HdrContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_hdr.id
	        set(value) { throw RuntimeException() }
		fun findRow() : RowContext? = getRuleContext(solver.getType("RowContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CSVListener ) (listener as CSVListener).enterHdr(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CSVListener ) (listener as CSVListener).exitHdr(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CSVVisitor ) return (visitor as CSVVisitor<out T>).visitHdr(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  hdr() : HdrContext {
		var _localctx : HdrContext = HdrContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_hdr.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 14
			row()
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

	open class RowContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_row.id
	        set(value) { throw RuntimeException() }
		fun findField() : List<FieldContext> = getRuleContexts(solver.getType("FieldContext"))
		fun findField(i: Int) : FieldContext? = getRuleContext(solver.getType("FieldContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CSVListener ) (listener as CSVListener).enterRow(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CSVListener ) (listener as CSVListener).exitRow(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CSVVisitor ) return (visitor as CSVVisitor<out T>).visitRow(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  row() : RowContext {
		var _localctx : RowContext = RowContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_row.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 16
			field()
			this.state = 21
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__0) {
				if (true){
				if (true){
				this.state = 17
				match(T__0) as Token
				this.state = 18
				field()
				}
				}
				this.state = 23
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 25
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__1) {
				if (true){
				this.state = 24
				match(T__1) as Token
				}
			}

			this.state = 27
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

	open class FieldContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_field.id
	        set(value) { throw RuntimeException() }
		fun TEXT() : TerminalNode? = getToken(CSVParser.Tokens.TEXT.id, 0)
		fun STRING() : TerminalNode? = getToken(CSVParser.Tokens.STRING.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CSVListener ) (listener as CSVListener).enterField(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CSVListener ) (listener as CSVListener).exitField(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CSVVisitor ) return (visitor as CSVVisitor<out T>).visitField(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  field() : FieldContext {
		var _localctx : FieldContext = FieldContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_field.id)
		try {
			this.state = 32
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			TEXT  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 29
			match(TEXT) as Token
			}}
			STRING  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 30
			match(STRING) as Token
			}}
			T__0 , T__1 , T__2  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
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

}