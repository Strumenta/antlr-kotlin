// Generated from java-escape by ANTLR 4.7.1
import com.strumenta.kotlinmultiplatform.Arrays
import com.strumenta.kotlinmultiplatform.getType
import com.strumenta.kotlinmultiplatform.TypeDeclarator
import org.antlr.v4.kotlinruntime.*
import org.antlr.v4.kotlinruntime.atn.*
import org.antlr.v4.kotlinruntime.atn.ATNDeserializer
import org.antlr.v4.kotlinruntime.atn.ParserATNSimulator
import org.antlr.v4.kotlinruntime.atn.PredictionContextCache
import org.antlr.v4.kotlinruntime.dfa.*
import org.antlr.v4.kotlinruntime.tree.ParseTreeListener
import org.antlr.v4.kotlinruntime.tree.TerminalNode
import org.antlr.v4.kotlinruntime.atn.ATN.Companion.INVALID_ALT_NUMBER
import kotlin.reflect.KClass

object solver : TypeDeclarator {
	override val classesByName : List<KClass<*>> = listOf(MiniCalcParser.MiniCalcFileContext::class,
                                                       MiniCalcParser.LineContext::class,
                                                       MiniCalcParser.StatementContext::class,
                                                       MiniCalcParser.PrintContext::class,
                                                       MiniCalcParser.InputDeclarationContext::class,
                                                       MiniCalcParser.VarDeclarationContext::class,
                                                       MiniCalcParser.AssignmentContext::class,
                                                       MiniCalcParser.ExpressionContext::class,
                                                       MiniCalcParser.StringLiteralContentContext::class,
                                                       MiniCalcParser.TypeContext::class)
}

class MiniCalcParser(input: TokenStream) : Parser(input) {
	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "MiniCalcParser.g4"

    override val tokenNames: Array<String?>?
        get() = MiniCalcParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = MiniCalcParser.Companion.ruleNames
    override val atn: ATN
        get() = MiniCalcParser.Companion.ATN

    enum class Tokens(val id: Int) {
        EOF(-1),
        NEWLINE(1),
        WS(2),
        INPUT(3),
        VAR(4),
        PRINT(5),
        AS(6),
        INT(7),
        DECIMAL(8),
        STRING(9),
        ID(10),
        INTLIT(11),
        DECLIT(12),
        PLUS(13),
        MINUS(14),
        ASTERISK(15),
        DIVISION(16),
        ASSIGN(17),
        LPAREN(18),
        RPAREN(19),
        STRING_OPEN(20),
        UNMATCHED(21),
        ESCAPE_STRING_DELIMITER(22),
        ESCAPE_SLASH(23),
        ESCAPE_NEWLINE(24),
        ESCAPE_SHARP(25),
        STRING_CLOSE(26),
        INTERPOLATION_OPEN(27),
        STRING_CONTENT(28),
        INTERPOLATION_CLOSE(29)
    }

    enum class Rules(val id: Int) {
        RULE_miniCalcFile(0),
        RULE_line(1),
        RULE_statement(2),
        RULE_print(3),
        RULE_inputDeclaration(4),
        RULE_varDeclaration(5),
        RULE_assignment(6),
        RULE_expression(7),
        RULE_stringLiteralContent(8),
        RULE_type(9)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("miniCalcFile", "line", "statement", "print", 
                                "inputDeclaration", "varDeclaration", "assignment", 
                                "expression", "stringLiteralContent", "type")

        private val LITERAL_NAMES = Arrays.asList<String?>(null, null, null, 
                                                           "'input'", "'var'", 
                                                           "'print'", null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           "'\\\"'", "'\\\\'", 
                                                           "'\\n'", "'\\#'", 
                                                           null, "'#{'", 
                                                           null, "'}'")
        private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, "NEWLINE", 
                                                            "WS", "INPUT", 
                                                            "VAR", "PRINT", 
                                                            "AS", "INT", 
                                                            "DECIMAL", "STRING", 
                                                            "ID", "INTLIT", 
                                                            "DECLIT", "PLUS", 
                                                            "MINUS", "ASTERISK", 
                                                            "DIVISION", 
                                                            "ASSIGN", "LPAREN", 
                                                            "RPAREN", "STRING_OPEN", 
                                                            "UNMATCHED", 
                                                            "ESCAPE_STRING_DELIMITER", 
                                                            "ESCAPE_SLASH", 
                                                            "ESCAPE_NEWLINE", 
                                                            "ESCAPE_SHARP", 
                                                            "STRING_CLOSE", 
                                                            "INTERPOLATION_OPEN", 
                                                            "STRING_CONTENT", 
                                                            "INTERPOLATION_CLOSE")

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

        private val serializedIntegersATN =
        	arrayOf(3, 24715, 42794, 33075, 47597, 16764, 15335, 30598, 22884, 
        	3, 31, 99, 4, 2, 9, 2, 4, 3, 9, 3, 4, 4, 9, 4, 4, 5, 9, 5, 4, 6, 
        	9, 6, 4, 7, 9, 7, 4, 8, 9, 8, 4, 9, 9, 9, 4, 10, 9, 10, 4, 11, 
        	9, 11, 3, 2, 6, 2, 24, 10, 2, 13, 2, 14, 2, 25, 3, 3, 3, 3, 3, 
        	3, 3, 4, 3, 4, 3, 4, 3, 4, 5, 4, 35, 10, 4, 3, 5, 3, 5, 3, 5, 3, 
        	5, 3, 5, 3, 6, 3, 6, 3, 6, 3, 6, 3, 7, 3, 7, 3, 7, 3, 8, 3, 8, 
        	3, 8, 3, 8, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 
        	9, 3, 9, 7, 9, 63, 10, 9, 12, 9, 14, 9, 66, 11, 9, 3, 9, 3, 9, 
        	3, 9, 5, 9, 71, 10, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 
        	3, 9, 3, 9, 7, 9, 82, 10, 9, 12, 9, 14, 9, 85, 11, 9, 3, 10, 3, 
        	10, 3, 10, 3, 10, 3, 10, 5, 10, 92, 10, 10, 3, 11, 3, 11, 3, 11, 
        	5, 11, 97, 10, 11, 3, 11, 2, 3, 16, 12, 2, 4, 6, 8, 10, 12, 14, 
        	16, 18, 20, 2, 5, 3, 3, 3, 3, 3, 2, 17, 18, 3, 2, 15, 16, 2, 104, 
        	2, 23, 3, 2, 2, 2, 4, 27, 3, 2, 2, 2, 6, 34, 3, 2, 2, 2, 8, 36, 
        	3, 2, 2, 2, 10, 41, 3, 2, 2, 2, 12, 45, 3, 2, 2, 2, 14, 48, 3, 
        	2, 2, 2, 16, 70, 3, 2, 2, 2, 18, 91, 3, 2, 2, 2, 20, 96, 3, 2, 
        	2, 2, 22, 24, 5, 4, 3, 2, 23, 22, 3, 2, 2, 2, 24, 25, 3, 2, 2, 
        	2, 25, 23, 3, 2, 2, 2, 25, 26, 3, 2, 2, 2, 26, 3, 3, 2, 2, 2, 27, 
        	28, 5, 6, 4, 2, 28, 29, 9, 2, 2, 2, 29, 5, 3, 2, 2, 2, 30, 35, 
        	5, 10, 6, 2, 31, 35, 5, 12, 7, 2, 32, 35, 5, 14, 8, 2, 33, 35, 
        	5, 8, 5, 2, 34, 30, 3, 2, 2, 2, 34, 31, 3, 2, 2, 2, 34, 32, 3, 
        	2, 2, 2, 34, 33, 3, 2, 2, 2, 35, 7, 3, 2, 2, 2, 36, 37, 7, 7, 2, 
        	2, 37, 38, 7, 20, 2, 2, 38, 39, 5, 16, 9, 2, 39, 40, 7, 21, 2, 
        	2, 40, 9, 3, 2, 2, 2, 41, 42, 7, 5, 2, 2, 42, 43, 5, 20, 11, 2, 
        	43, 44, 7, 12, 2, 2, 44, 11, 3, 2, 2, 2, 45, 46, 7, 6, 2, 2, 46, 
        	47, 5, 14, 8, 2, 47, 13, 3, 2, 2, 2, 48, 49, 7, 12, 2, 2, 49, 50, 
        	7, 19, 2, 2, 50, 51, 5, 16, 9, 2, 51, 15, 3, 2, 2, 2, 52, 53, 8, 
        	9, 1, 2, 53, 54, 7, 20, 2, 2, 54, 55, 5, 16, 9, 2, 55, 56, 7, 21, 
        	2, 2, 56, 71, 3, 2, 2, 2, 57, 71, 7, 12, 2, 2, 58, 59, 7, 16, 2, 
        	2, 59, 71, 5, 16, 9, 6, 60, 64, 7, 22, 2, 2, 61, 63, 5, 18, 10, 
        	2, 62, 61, 3, 2, 2, 2, 63, 66, 3, 2, 2, 2, 64, 62, 3, 2, 2, 2, 
        	64, 65, 3, 2, 2, 2, 65, 67, 3, 2, 2, 2, 66, 64, 3, 2, 2, 2, 67, 
        	71, 7, 28, 2, 2, 68, 71, 7, 13, 2, 2, 69, 71, 7, 14, 2, 2, 70, 
        	52, 3, 2, 2, 2, 70, 57, 3, 2, 2, 2, 70, 58, 3, 2, 2, 2, 70, 60, 
        	3, 2, 2, 2, 70, 68, 3, 2, 2, 2, 70, 69, 3, 2, 2, 2, 71, 83, 3, 
        	2, 2, 2, 72, 73, 12, 11, 2, 2, 73, 74, 9, 3, 2, 2, 74, 82, 5, 16, 
        	9, 12, 75, 76, 12, 10, 2, 2, 76, 77, 9, 4, 2, 2, 77, 82, 5, 16, 
        	9, 11, 78, 79, 12, 9, 2, 2, 79, 80, 7, 8, 2, 2, 80, 82, 5, 20, 
        	11, 2, 81, 72, 3, 2, 2, 2, 81, 75, 3, 2, 2, 2, 81, 78, 3, 2, 2, 
        	2, 82, 85, 3, 2, 2, 2, 83, 81, 3, 2, 2, 2, 83, 84, 3, 2, 2, 2, 
        	84, 17, 3, 2, 2, 2, 85, 83, 3, 2, 2, 2, 86, 92, 7, 30, 2, 2, 87, 
        	88, 7, 29, 2, 2, 88, 89, 5, 16, 9, 2, 89, 90, 7, 31, 2, 2, 90, 
        	92, 3, 2, 2, 2, 91, 86, 3, 2, 2, 2, 91, 87, 3, 2, 2, 2, 92, 19, 
        	3, 2, 2, 2, 93, 97, 7, 9, 2, 2, 94, 97, 7, 10, 2, 2, 95, 97, 7, 
        	11, 2, 2, 96, 93, 3, 2, 2, 2, 96, 94, 3, 2, 2, 2, 96, 95, 3, 2, 
        	2, 2, 97, 21, 3, 2, 2, 2, 10, 25, 34, 64, 70, 81, 83, 91, 96)
        val ATN = ATNDeserializer().deserializeIntegers(serializedIntegersATN)
        init {
        	decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
        		DFA(ATN.getDecisionState(it)!!, it)
        	})


        }
	}

    private val NEWLINE = Tokens.NEWLINE.id
    private val WS = Tokens.WS.id
    private val INPUT = Tokens.INPUT.id
    private val VAR = Tokens.VAR.id
    private val PRINT = Tokens.PRINT.id
    private val AS = Tokens.AS.id
    private val INT = Tokens.INT.id
    private val DECIMAL = Tokens.DECIMAL.id
    private val STRING = Tokens.STRING.id
    private val ID = Tokens.ID.id
    private val INTLIT = Tokens.INTLIT.id
    private val DECLIT = Tokens.DECLIT.id
    private val PLUS = Tokens.PLUS.id
    private val MINUS = Tokens.MINUS.id
    private val ASTERISK = Tokens.ASTERISK.id
    private val DIVISION = Tokens.DIVISION.id
    private val ASSIGN = Tokens.ASSIGN.id
    private val LPAREN = Tokens.LPAREN.id
    private val RPAREN = Tokens.RPAREN.id
    private val STRING_OPEN = Tokens.STRING_OPEN.id
    private val UNMATCHED = Tokens.UNMATCHED.id
    private val ESCAPE_STRING_DELIMITER = Tokens.ESCAPE_STRING_DELIMITER.id
    private val ESCAPE_SLASH = Tokens.ESCAPE_SLASH.id
    private val ESCAPE_NEWLINE = Tokens.ESCAPE_NEWLINE.id
    private val ESCAPE_SHARP = Tokens.ESCAPE_SHARP.id
    private val STRING_CLOSE = Tokens.STRING_CLOSE.id
    private val INTERPOLATION_OPEN = Tokens.INTERPOLATION_OPEN.id
    private val STRING_CONTENT = Tokens.STRING_CONTENT.id
    private val INTERPOLATION_CLOSE = Tokens.INTERPOLATION_CLOSE.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class MiniCalcFileContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_miniCalcFile.id
	        set(value) { throw RuntimeException() }
		var lines: LineContext? = null
		fun findLine() : List<LineContext> = getRuleContexts(solver.getType("LineContext"))
		fun findLine(i: Int) : LineContext? = getRuleContext(solver.getType("LineContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterMiniCalcFile(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitMiniCalcFile(this)
		}
	}

	fun  miniCalcFile() : MiniCalcFileContext {
		var _localctx : MiniCalcFileContext = MiniCalcFileContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_miniCalcFile.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 21 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 20
				(_localctx as MiniCalcFileContext).lines = line()
				}
				}
				this.state = 23 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl INPUT) or (1L shl VAR) or (1L shl PRINT) or (1L shl ID))) != 0L) )
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
		fun findStatement() : StatementContext? = getRuleContext(solver.getType("StatementContext"),0)
		fun NEWLINE() : TerminalNode = getToken(MiniCalcParser.Tokens.NEWLINE.id, 0) as TerminalNode
		fun EOF() : TerminalNode = getToken(MiniCalcParser.Tokens.EOF.id, 0) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterLine(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitLine(this)
		}
	}

	fun  line() : LineContext {
		var _localctx : LineContext = LineContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_line.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 25
			statement()
			this.state = 26
			_la = _input!!.LA(1)
			if ( !(_la==EOF || _la==NEWLINE) ) {
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

	open class StatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_statement.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	 
		constructor() : super() { }
		fun copyFrom(ctx: StatementContext) {
			super.copyFrom(ctx)
		}
	}
	class PrintStatementContext : StatementContext {
		fun findPrint() : PrintContext? = getRuleContext(solver.getType("PrintContext"),0)
		constructor(ctx: StatementContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterPrintStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitPrintStatement(this)
		}
	}
	class AssignmentStatementContext : StatementContext {
		fun findAssignment() : AssignmentContext? = getRuleContext(solver.getType("AssignmentContext"),0)
		constructor(ctx: StatementContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterAssignmentStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitAssignmentStatement(this)
		}
	}
	class InputDeclarationStatementContext : StatementContext {
		fun findInputDeclaration() : InputDeclarationContext? = getRuleContext(solver.getType("InputDeclarationContext"),0)
		constructor(ctx: StatementContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterInputDeclarationStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitInputDeclarationStatement(this)
		}
	}
	class VarDeclarationStatementContext : StatementContext {
		fun findVarDeclaration() : VarDeclarationContext? = getRuleContext(solver.getType("VarDeclarationContext"),0)
		constructor(ctx: StatementContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterVarDeclarationStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitVarDeclarationStatement(this)
		}
	}

	fun  statement() : StatementContext {
		var _localctx : StatementContext = StatementContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_statement.id)
		try {
			this.state = 32
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			INPUT ->  /*LL1AltBlock*/{_localctx = InputDeclarationStatementContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 28
			inputDeclaration()
			}}
			VAR ->  /*LL1AltBlock*/{_localctx = VarDeclarationStatementContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 29
			varDeclaration()
			}}
			ID ->  /*LL1AltBlock*/{_localctx = AssignmentStatementContext(_localctx)
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 30
			assignment()
			}}
			PRINT ->  /*LL1AltBlock*/{_localctx = PrintStatementContext(_localctx)
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 31
			print()
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

	open class PrintContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_print.id
	        set(value) { throw RuntimeException() }
		fun PRINT() : TerminalNode = getToken(MiniCalcParser.Tokens.PRINT.id, 0) as TerminalNode
		fun LPAREN() : TerminalNode = getToken(MiniCalcParser.Tokens.LPAREN.id, 0) as TerminalNode
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RPAREN() : TerminalNode = getToken(MiniCalcParser.Tokens.RPAREN.id, 0) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterPrint(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitPrint(this)
		}
	}

	fun  print() : PrintContext {
		var _localctx : PrintContext = PrintContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_print.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 34
			match(PRINT) as Token
			this.state = 35
			match(LPAREN) as Token
			this.state = 36
			expression(0)
			this.state = 37
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

	open class InputDeclarationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_inputDeclaration.id
	        set(value) { throw RuntimeException() }
		var name: Token? = null
		fun INPUT() : TerminalNode = getToken(MiniCalcParser.Tokens.INPUT.id, 0) as TerminalNode
		fun findType() : TypeContext? = getRuleContext(solver.getType("TypeContext"),0)
		fun ID() : TerminalNode = getToken(MiniCalcParser.Tokens.ID.id, 0) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterInputDeclaration(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitInputDeclaration(this)
		}
	}

	fun  inputDeclaration() : InputDeclarationContext {
		var _localctx : InputDeclarationContext = InputDeclarationContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_inputDeclaration.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 39
			match(INPUT) as Token
			this.state = 40
			type()
			this.state = 41
			(_localctx as InputDeclarationContext).name = match(ID) as Token
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

	open class VarDeclarationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_varDeclaration.id
	        set(value) { throw RuntimeException() }
		fun VAR() : TerminalNode = getToken(MiniCalcParser.Tokens.VAR.id, 0) as TerminalNode
		fun findAssignment() : AssignmentContext? = getRuleContext(solver.getType("AssignmentContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterVarDeclaration(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitVarDeclaration(this)
		}
	}

	fun  varDeclaration() : VarDeclarationContext {
		var _localctx : VarDeclarationContext = VarDeclarationContext(context, state)
		enterRule(_localctx, 10, Rules.RULE_varDeclaration.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 43
			match(VAR) as Token
			this.state = 44
			assignment()
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

	open class AssignmentContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_assignment.id
	        set(value) { throw RuntimeException() }
		fun ID() : TerminalNode = getToken(MiniCalcParser.Tokens.ID.id, 0) as TerminalNode
		fun ASSIGN() : TerminalNode = getToken(MiniCalcParser.Tokens.ASSIGN.id, 0) as TerminalNode
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterAssignment(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitAssignment(this)
		}
	}

	fun  assignment() : AssignmentContext {
		var _localctx : AssignmentContext = AssignmentContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_assignment.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 46
			match(ID) as Token
			this.state = 47
			match(ASSIGN) as Token
			this.state = 48
			expression(0)
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
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	 
		constructor() : super() { }
		fun copyFrom(ctx: ExpressionContext) {
			super.copyFrom(ctx)
		}
	}
	class DecimalLiteralContext : ExpressionContext {
		fun DECLIT() : TerminalNode = getToken(MiniCalcParser.Tokens.DECLIT.id, 0) as TerminalNode
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterDecimalLiteral(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitDecimalLiteral(this)
		}
	}
	class MinusExpressionContext : ExpressionContext {
		fun MINUS() : TerminalNode = getToken(MiniCalcParser.Tokens.MINUS.id, 0) as TerminalNode
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterMinusExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitMinusExpression(this)
		}
	}
	class ValueReferenceContext : ExpressionContext {
		fun ID() : TerminalNode = getToken(MiniCalcParser.Tokens.ID.id, 0) as TerminalNode
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterValueReference(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitValueReference(this)
		}
	}
	class StringLiteralContext : ExpressionContext {
		public var stringLiteralContent: StringLiteralContentContext? = null
		public var parts : MutableList<StringLiteralContentContext> = ArrayList<StringLiteralContentContext>()
		fun STRING_OPEN() : TerminalNode = getToken(MiniCalcParser.Tokens.STRING_OPEN.id, 0) as TerminalNode
		fun STRING_CLOSE() : TerminalNode = getToken(MiniCalcParser.Tokens.STRING_CLOSE.id, 0) as TerminalNode
		fun findStringLiteralContent() : List<StringLiteralContentContext> = getRuleContexts(solver.getType("StringLiteralContentContext"))
		fun findStringLiteralContent(i: Int) : StringLiteralContentContext? = getRuleContext(solver.getType("StringLiteralContentContext"),i)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterStringLiteral(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitStringLiteral(this)
		}
	}
	class IntLiteralContext : ExpressionContext {
		fun INTLIT() : TerminalNode = getToken(MiniCalcParser.Tokens.INTLIT.id, 0) as TerminalNode
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterIntLiteral(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitIntLiteral(this)
		}
	}
	class ParenExpressionContext : ExpressionContext {
		fun LPAREN() : TerminalNode = getToken(MiniCalcParser.Tokens.LPAREN.id, 0) as TerminalNode
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RPAREN() : TerminalNode = getToken(MiniCalcParser.Tokens.RPAREN.id, 0) as TerminalNode
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterParenExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitParenExpression(this)
		}
	}
	class BinaryOperationContext : ExpressionContext {
		public var left: ExpressionContext? = null
		public var operator: Token? = null
		public var right: ExpressionContext? = null
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun DIVISION() : TerminalNode = getToken(MiniCalcParser.Tokens.DIVISION.id, 0) as TerminalNode
		fun ASTERISK() : TerminalNode = getToken(MiniCalcParser.Tokens.ASTERISK.id, 0) as TerminalNode
		fun PLUS() : TerminalNode = getToken(MiniCalcParser.Tokens.PLUS.id, 0) as TerminalNode
		fun MINUS() : TerminalNode = getToken(MiniCalcParser.Tokens.MINUS.id, 0) as TerminalNode
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterBinaryOperation(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitBinaryOperation(this)
		}
	}
	class TypeConversionContext : ExpressionContext {
		public var value: ExpressionContext? = null
		public var targetType: TypeContext? = null
		fun AS() : TerminalNode = getToken(MiniCalcParser.Tokens.AS.id, 0) as TerminalNode
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun findType() : TypeContext? = getRuleContext(solver.getType("TypeContext"),0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterTypeConversion(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitTypeConversion(this)
		}
	}

	 fun expression() : ExpressionContext {
		return expression(0);
	}

	private fun expression(_p: Int) : ExpressionContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : ExpressionContext= ExpressionContext(context, _parentState)
		var _prevctx : ExpressionContext= _localctx
		var _startState : Int = 14
		enterRecursionRule(_localctx, 14, Rules.RULE_expression.id, _p)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 68
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			LPAREN ->  /*LL1AltBlock*/{if (true){
			_localctx = ParenExpressionContext(_localctx)
			context = _localctx
			_prevctx = _localctx

			this.state = 51
			match(LPAREN) as Token
			this.state = 52
			expression(0)
			this.state = 53
			match(RPAREN) as Token
			}}
			ID ->  /*LL1AltBlock*/{if (true){
			_localctx = ValueReferenceContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 55
			match(ID) as Token
			}}
			MINUS ->  /*LL1AltBlock*/{if (true){
			_localctx = MinusExpressionContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 56
			match(MINUS) as Token
			this.state = 57
			expression(4)
			}}
			STRING_OPEN ->  /*LL1AltBlock*/{if (true){
			_localctx = StringLiteralContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 58
			match(STRING_OPEN) as Token
			this.state = 62
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==INTERPOLATION_OPEN || _la==STRING_CONTENT) {
				if (true){
				if (true){
				this.state = 59
				(_localctx as StringLiteralContext).stringLiteralContent = stringLiteralContent()
				(_localctx as StringLiteralContext).parts.add((_localctx as StringLiteralContext).stringLiteralContent!!)
				}
				}
				this.state = 64
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 65
			match(STRING_CLOSE) as Token
			}}
			INTLIT ->  /*LL1AltBlock*/{if (true){
			_localctx = IntLiteralContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 66
			match(INTLIT) as Token
			}}
			DECLIT ->  /*LL1AltBlock*/{if (true){
			_localctx = DecimalLiteralContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 67
			match(DECLIT) as Token
			}}
			else -> throw NoViableAltException(this)
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 81
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,5,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					this.state = 79
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,4,context) ) {
					1 -> if (true){
					_localctx = BinaryOperationContext(ExpressionContext(_parentctx, _parentState))
					(_localctx as BinaryOperationContext).left = _prevctx
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_expression.id)
					this.state = 70
					if (!(precpred(context!!, 9))) throw FailedPredicateException(this, "precpred(context!!, 9)")
					this.state = 71
					(_localctx as BinaryOperationContext).operator = _input!!.LT(1)
					_la = _input!!.LA(1)
					if ( !(_la==ASTERISK || _la==DIVISION) ) {
						(_localctx as BinaryOperationContext).operator = errorHandler.recoverInline(this) as Token
					}
					else {
						if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
						errorHandler.reportMatch(this)
						consume()
					}
					this.state = 72
					(_localctx as BinaryOperationContext).right = expression(10)
					}
					2 -> if (true){
					_localctx = BinaryOperationContext(ExpressionContext(_parentctx, _parentState))
					(_localctx as BinaryOperationContext).left = _prevctx
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_expression.id)
					this.state = 73
					if (!(precpred(context!!, 8))) throw FailedPredicateException(this, "precpred(context!!, 8)")
					this.state = 74
					(_localctx as BinaryOperationContext).operator = _input!!.LT(1)
					_la = _input!!.LA(1)
					if ( !(_la==PLUS || _la==MINUS) ) {
						(_localctx as BinaryOperationContext).operator = errorHandler.recoverInline(this) as Token
					}
					else {
						if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
						errorHandler.reportMatch(this)
						consume()
					}
					this.state = 75
					(_localctx as BinaryOperationContext).right = expression(9)
					}
					3 -> if (true){
					_localctx = TypeConversionContext(ExpressionContext(_parentctx, _parentState))
					(_localctx as TypeConversionContext).value = _prevctx
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_expression.id)
					this.state = 76
					if (!(precpred(context!!, 7))) throw FailedPredicateException(this, "precpred(context!!, 7)")
					this.state = 77
					match(AS) as Token
					this.state = 78
					(_localctx as TypeConversionContext).targetType = type()
					}
					}
					} 
				}
				this.state = 83
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,5,context)
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

	open class StringLiteralContentContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_stringLiteralContent.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	 
		constructor() : super() { }
		fun copyFrom(ctx: StringLiteralContentContext) {
			super.copyFrom(ctx)
		}
	}
	class InterpolatedValueContext : StringLiteralContentContext {
		fun INTERPOLATION_OPEN() : TerminalNode = getToken(MiniCalcParser.Tokens.INTERPOLATION_OPEN.id, 0) as TerminalNode
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun INTERPOLATION_CLOSE() : TerminalNode = getToken(MiniCalcParser.Tokens.INTERPOLATION_CLOSE.id, 0) as TerminalNode
		constructor(ctx: StringLiteralContentContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterInterpolatedValue(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitInterpolatedValue(this)
		}
	}
	class ConstantStringContext : StringLiteralContentContext {
		fun STRING_CONTENT() : TerminalNode = getToken(MiniCalcParser.Tokens.STRING_CONTENT.id, 0) as TerminalNode
		constructor(ctx: StringLiteralContentContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterConstantString(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitConstantString(this)
		}
	}

	fun  stringLiteralContent() : StringLiteralContentContext {
		var _localctx : StringLiteralContentContext = StringLiteralContentContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_stringLiteralContent.id)
		try {
			this.state = 89
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			STRING_CONTENT ->  /*LL1AltBlock*/{_localctx = ConstantStringContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 84
			match(STRING_CONTENT) as Token
			}}
			INTERPOLATION_OPEN ->  /*LL1AltBlock*/{_localctx = InterpolatedValueContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 85
			match(INTERPOLATION_OPEN) as Token
			this.state = 86
			expression(0)
			this.state = 87
			match(INTERPOLATION_CLOSE) as Token
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

	open class TypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_type.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	 
		constructor() : super() { }
		fun copyFrom(ctx: TypeContext) {
			super.copyFrom(ctx)
		}
	}
	class StringContext : TypeContext {
		fun STRING() : TerminalNode = getToken(MiniCalcParser.Tokens.STRING.id, 0) as TerminalNode
		constructor(ctx: TypeContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterString(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitString(this)
		}
	}
	class IntegerContext : TypeContext {
		fun INT() : TerminalNode = getToken(MiniCalcParser.Tokens.INT.id, 0) as TerminalNode
		constructor(ctx: TypeContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterInteger(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitInteger(this)
		}
	}
	class DecimalContext : TypeContext {
		fun DECIMAL() : TerminalNode = getToken(MiniCalcParser.Tokens.DECIMAL.id, 0) as TerminalNode
		constructor(ctx: TypeContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterDecimal(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitDecimal(this)
		}
	}

	fun  type() : TypeContext {
		var _localctx : TypeContext = TypeContext(context, state)
		enterRule(_localctx, 18, Rules.RULE_type.id)
		try {
			this.state = 94
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			INT ->  /*LL1AltBlock*/{_localctx = IntegerContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 91
			match(INT) as Token
			}}
			DECIMAL ->  /*LL1AltBlock*/{_localctx = DecimalContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 92
			match(DECIMAL) as Token
			}}
			STRING ->  /*LL1AltBlock*/{_localctx = StringContext(_localctx)
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 93
			match(STRING) as Token
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

	override fun sempred(_localctx: RuleContext?, ruleIndex: Int, predIndex: Int) : Boolean {
		when (ruleIndex) {
		7 -> return expression_sempred(_localctx as ExpressionContext, predIndex)
		}
		return true
	}
	private fun expression_sempred( _localctx : ExpressionContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    0 -> return precpred(context!!, 9)
		    1 -> return precpred(context!!, 8)
		    2 -> return precpred(context!!, 7)
		}
		return true
	}

}