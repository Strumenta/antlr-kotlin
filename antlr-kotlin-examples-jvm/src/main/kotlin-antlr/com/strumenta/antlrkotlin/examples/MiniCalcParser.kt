// Generated from java-escape by ANTLR 4.7.1
package com.strumenta.antlrkotlin.examples;
import com.strumenta.kotlinmultiplatform.asCharArray
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
import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor
import kotlin.reflect.KClass

class MiniCalcParser(input: TokenStream) : Parser(input) {

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

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "MiniCalcParser.g4"

    override val tokenNames: Array<String?>?
        get() = MiniCalcParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = MiniCalcParser.Companion.ruleNames
    override val atn: ATN
        get() = MiniCalcParser.Companion.ATN
    override val vocabulary: Vocabulary
        get() = MiniCalcParser.Companion.VOCABULARY

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

	@ThreadLocal
	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("miniCalcFile", "line", "statement", "print", 
                                "inputDeclaration", "varDeclaration", "assignment", 
                                "expression", "stringLiteralContent", "type")

        private val LITERAL_NAMES: List<String?> = listOf(null, null, null, 
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
        private val SYMBOLIC_NAMES: List<String?> = listOf(null, "NEWLINE", 
                                                           "WS", "INPUT", 
                                                           "VAR", "PRINT", 
                                                           "AS", "INT", 
                                                           "DECIMAL", "STRING", 
                                                           "ID", "INTLIT", 
                                                           "DECLIT", "PLUS", 
                                                           "MINUS", "ASTERISK", 
                                                           "DIVISION", "ASSIGN", 
                                                           "LPAREN", "RPAREN", 
                                                           "STRING_OPEN", 
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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u001f\u0063\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0003\u0002\u0006\u0002\u0018\u000a\u0002\u000d\u0002\u000e\u0002\u0019\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0005\u0004\u0023\u000a\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0007\u0009\u003f\u000a\u0009\u000c\u0009\u000e\u0009\u0042\u000b\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0005\u0009\u0047\u000a\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0007\u0009\u0052\u000a\u0009\u000c\u0009\u000e\u0009\u0055\u000b\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0005\u000a\u005c\u000a\u000a\u0003\u000b\u0003\u000b\u0003\u000b\u0005\u000b\u0061\u000a\u000b\u0003\u000b\u0002\u0003\u0010\u000c\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0002\u0005\u0003\u0003\u0003\u0003\u0003\u0002\u0011\u0012\u0003\u0002\u000f\u0010\u0002\u0068\u0002\u0017\u0003\u0002\u0002\u0002\u0004\u001b\u0003\u0002\u0002\u0002\u0006\u0022\u0003\u0002\u0002\u0002\u0008\u0024\u0003\u0002\u0002\u0002\u000a\u0029\u0003\u0002\u0002\u0002\u000c\u002d\u0003\u0002\u0002\u0002\u000e\u0030\u0003\u0002\u0002\u0002\u0010\u0046\u0003\u0002\u0002\u0002\u0012\u005b\u0003\u0002\u0002\u0002\u0014\u0060\u0003\u0002\u0002\u0002\u0016\u0018\u0005\u0004\u0003\u0002\u0017\u0016\u0003\u0002\u0002\u0002\u0018\u0019\u0003\u0002\u0002\u0002\u0019\u0017\u0003\u0002\u0002\u0002\u0019\u001a\u0003\u0002\u0002\u0002\u001a\u0003\u0003\u0002\u0002\u0002\u001b\u001c\u0005\u0006\u0004\u0002\u001c\u001d\u0009\u0002\u0002\u0002\u001d\u0005\u0003\u0002\u0002\u0002\u001e\u0023\u0005\u000a\u0006\u0002\u001f\u0023\u0005\u000c\u0007\u0002\u0020\u0023\u0005\u000e\u0008\u0002\u0021\u0023\u0005\u0008\u0005\u0002\u0022\u001e\u0003\u0002\u0002\u0002\u0022\u001f\u0003\u0002\u0002\u0002\u0022\u0020\u0003\u0002\u0002\u0002\u0022\u0021\u0003\u0002\u0002\u0002\u0023\u0007\u0003\u0002\u0002\u0002\u0024\u0025\u0007\u0007\u0002\u0002\u0025\u0026\u0007\u0014\u0002\u0002\u0026\u0027\u0005\u0010\u0009\u0002\u0027\u0028\u0007\u0015\u0002\u0002\u0028\u0009\u0003\u0002\u0002\u0002\u0029\u002a\u0007\u0005\u0002\u0002\u002a\u002b\u0005\u0014\u000b\u0002\u002b\u002c\u0007\u000c\u0002\u0002\u002c\u000b\u0003\u0002\u0002\u0002\u002d\u002e\u0007\u0006\u0002\u0002\u002e\u002f\u0005\u000e\u0008\u0002\u002f\u000d\u0003\u0002\u0002\u0002\u0030\u0031\u0007\u000c\u0002\u0002\u0031\u0032\u0007\u0013\u0002\u0002\u0032\u0033\u0005\u0010\u0009\u0002\u0033\u000f\u0003\u0002\u0002\u0002\u0034\u0035\u0008\u0009\u0001\u0002\u0035\u0036\u0007\u0014\u0002\u0002\u0036\u0037\u0005\u0010\u0009\u0002\u0037\u0038\u0007\u0015\u0002\u0002\u0038\u0047\u0003\u0002\u0002\u0002\u0039\u0047\u0007\u000c\u0002\u0002\u003a\u003b\u0007\u0010\u0002\u0002\u003b\u0047\u0005\u0010\u0009\u0006\u003c\u0040\u0007\u0016\u0002\u0002\u003d\u003f\u0005\u0012\u000a\u0002\u003e\u003d\u0003\u0002\u0002\u0002\u003f\u0042\u0003\u0002\u0002\u0002\u0040\u003e\u0003\u0002\u0002\u0002\u0040\u0041\u0003\u0002\u0002\u0002\u0041\u0043\u0003\u0002\u0002\u0002\u0042\u0040\u0003\u0002\u0002\u0002\u0043\u0047\u0007\u001c\u0002\u0002\u0044\u0047\u0007\u000d\u0002\u0002\u0045\u0047\u0007\u000e\u0002\u0002\u0046\u0034\u0003\u0002\u0002\u0002\u0046\u0039\u0003\u0002\u0002\u0002\u0046\u003a\u0003\u0002\u0002\u0002\u0046\u003c\u0003\u0002\u0002\u0002\u0046\u0044\u0003\u0002\u0002\u0002\u0046\u0045\u0003\u0002\u0002\u0002\u0047\u0053\u0003\u0002\u0002\u0002\u0048\u0049\u000c\u000b\u0002\u0002\u0049\u004a\u0009\u0003\u0002\u0002\u004a\u0052\u0005\u0010\u0009\u000c\u004b\u004c\u000c\u000a\u0002\u0002\u004c\u004d\u0009\u0004\u0002\u0002\u004d\u0052\u0005\u0010\u0009\u000b\u004e\u004f\u000c\u0009\u0002\u0002\u004f\u0050\u0007\u0008\u0002\u0002\u0050\u0052\u0005\u0014\u000b\u0002\u0051\u0048\u0003\u0002\u0002\u0002\u0051\u004b\u0003\u0002\u0002\u0002\u0051\u004e\u0003\u0002\u0002\u0002\u0052\u0055\u0003\u0002\u0002\u0002\u0053\u0051\u0003\u0002\u0002\u0002\u0053\u0054\u0003\u0002\u0002\u0002\u0054\u0011\u0003\u0002\u0002\u0002\u0055\u0053\u0003\u0002\u0002\u0002\u0056\u005c\u0007\u001e\u0002\u0002\u0057\u0058\u0007\u001d\u0002\u0002\u0058\u0059\u0005\u0010\u0009\u0002\u0059\u005a\u0007\u001f\u0002\u0002\u005a\u005c\u0003\u0002\u0002\u0002\u005b\u0056\u0003\u0002\u0002\u0002\u005b\u0057\u0003\u0002\u0002\u0002\u005c\u0013\u0003\u0002\u0002\u0002\u005d\u0061\u0007\u0009\u0002\u0002\u005e\u0061\u0007\u000a\u0002\u0002\u005f\u0061\u0007\u000b\u0002\u0002\u0060\u005d\u0003\u0002\u0002\u0002\u0060\u005e\u0003\u0002\u0002\u0002\u0060\u005f\u0003\u0002\u0002\u0002\u0061\u0015\u0003\u0002\u0002\u0002\u000a\u0019\u0022\u0040\u0046\u0051\u0053\u005b\u0060"

        val ATN = ATNDeserializer().deserialize(serializedATN.asCharArray())
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
		fun NEWLINE() : TerminalNode? = getToken(MiniCalcParser.Tokens.NEWLINE.id, 0)
		fun EOF() : TerminalNode? = getToken(MiniCalcParser.Tokens.EOF.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
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
	open class PrintStatementContext : StatementContext {
		fun findPrint() : PrintContext? = getRuleContext(solver.getType("PrintContext"),0)
		constructor(ctx: StatementContext) { copyFrom(ctx) }
	}
	open class AssignmentStatementContext : StatementContext {
		fun findAssignment() : AssignmentContext? = getRuleContext(solver.getType("AssignmentContext"),0)
		constructor(ctx: StatementContext) { copyFrom(ctx) }
	}
	open class InputDeclarationStatementContext : StatementContext {
		fun findInputDeclaration() : InputDeclarationContext? = getRuleContext(solver.getType("InputDeclarationContext"),0)
		constructor(ctx: StatementContext) { copyFrom(ctx) }
	}
	open class VarDeclarationStatementContext : StatementContext {
		fun findVarDeclaration() : VarDeclarationContext? = getRuleContext(solver.getType("VarDeclarationContext"),0)
		constructor(ctx: StatementContext) { copyFrom(ctx) }
	}

	fun  statement() : StatementContext {
		var _localctx : StatementContext = StatementContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_statement.id)
		try {
			this.state = 32
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			INPUT  ->  /*LL1AltBlock*/{_localctx = InputDeclarationStatementContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 28
			inputDeclaration()
			}}
			VAR  ->  /*LL1AltBlock*/{_localctx = VarDeclarationStatementContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 29
			varDeclaration()
			}}
			ID  ->  /*LL1AltBlock*/{_localctx = AssignmentStatementContext(_localctx)
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 30
			assignment()
			}}
			PRINT  ->  /*LL1AltBlock*/{_localctx = PrintStatementContext(_localctx)
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
		fun PRINT() : TerminalNode? = getToken(MiniCalcParser.Tokens.PRINT.id, 0)
		fun LPAREN() : TerminalNode? = getToken(MiniCalcParser.Tokens.LPAREN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RPAREN() : TerminalNode? = getToken(MiniCalcParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
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
		fun INPUT() : TerminalNode? = getToken(MiniCalcParser.Tokens.INPUT.id, 0)
		fun findType() : TypeContext? = getRuleContext(solver.getType("TypeContext"),0)
		fun ID() : TerminalNode? = getToken(MiniCalcParser.Tokens.ID.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
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
		fun VAR() : TerminalNode? = getToken(MiniCalcParser.Tokens.VAR.id, 0)
		fun findAssignment() : AssignmentContext? = getRuleContext(solver.getType("AssignmentContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
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
		fun ID() : TerminalNode? = getToken(MiniCalcParser.Tokens.ID.id, 0)
		fun ASSIGN() : TerminalNode? = getToken(MiniCalcParser.Tokens.ASSIGN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
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
	open class DecimalLiteralContext : ExpressionContext {
		fun DECLIT() : TerminalNode? = getToken(MiniCalcParser.Tokens.DECLIT.id, 0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
	}
	open class MinusExpressionContext : ExpressionContext {
		fun MINUS() : TerminalNode? = getToken(MiniCalcParser.Tokens.MINUS.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
	}
	open class ValueReferenceContext : ExpressionContext {
		fun ID() : TerminalNode? = getToken(MiniCalcParser.Tokens.ID.id, 0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
	}
	open class StringLiteralContext : ExpressionContext {
		public var stringLiteralContent: StringLiteralContentContext? = null
		public var parts : MutableList<StringLiteralContentContext> = ArrayList<StringLiteralContentContext>()
		fun STRING_OPEN() : TerminalNode? = getToken(MiniCalcParser.Tokens.STRING_OPEN.id, 0)
		fun STRING_CLOSE() : TerminalNode? = getToken(MiniCalcParser.Tokens.STRING_CLOSE.id, 0)
		fun findStringLiteralContent() : List<StringLiteralContentContext> = getRuleContexts(solver.getType("StringLiteralContentContext"))
		fun findStringLiteralContent(i: Int) : StringLiteralContentContext? = getRuleContext(solver.getType("StringLiteralContentContext"),i)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
	}
	open class IntLiteralContext : ExpressionContext {
		fun INTLIT() : TerminalNode? = getToken(MiniCalcParser.Tokens.INTLIT.id, 0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
	}
	open class ParenExpressionContext : ExpressionContext {
		fun LPAREN() : TerminalNode? = getToken(MiniCalcParser.Tokens.LPAREN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RPAREN() : TerminalNode? = getToken(MiniCalcParser.Tokens.RPAREN.id, 0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
	}
	open class BinaryOperationContext : ExpressionContext {
		public var left: ExpressionContext? = null
		public var operator: Token? = null
		public var right: ExpressionContext? = null
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun DIVISION() : TerminalNode? = getToken(MiniCalcParser.Tokens.DIVISION.id, 0)
		fun ASTERISK() : TerminalNode? = getToken(MiniCalcParser.Tokens.ASTERISK.id, 0)
		fun PLUS() : TerminalNode? = getToken(MiniCalcParser.Tokens.PLUS.id, 0)
		fun MINUS() : TerminalNode? = getToken(MiniCalcParser.Tokens.MINUS.id, 0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
	}
	open class TypeConversionContext : ExpressionContext {
		public var value: ExpressionContext? = null
		public var targetType: TypeContext? = null
		fun AS() : TerminalNode? = getToken(MiniCalcParser.Tokens.AS.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun findType() : TypeContext? = getRuleContext(solver.getType("TypeContext"),0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
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
			LPAREN  ->  /*LL1AltBlock*/{if (true){
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
			ID  ->  /*LL1AltBlock*/{if (true){
			_localctx = ValueReferenceContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 55
			match(ID) as Token
			}}
			MINUS  ->  /*LL1AltBlock*/{if (true){
			_localctx = MinusExpressionContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 56
			match(MINUS) as Token
			this.state = 57
			expression(4)
			}}
			STRING_OPEN  ->  /*LL1AltBlock*/{if (true){
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
			INTLIT  ->  /*LL1AltBlock*/{if (true){
			_localctx = IntLiteralContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 66
			match(INTLIT) as Token
			}}
			DECLIT  ->  /*LL1AltBlock*/{if (true){
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
					1 -> {if (true){
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
					}}
					2 -> {if (true){
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
					}}
					3 -> {if (true){
					_localctx = TypeConversionContext(ExpressionContext(_parentctx, _parentState))
					(_localctx as TypeConversionContext).value = _prevctx
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_expression.id)
					this.state = 76
					if (!(precpred(context!!, 7))) throw FailedPredicateException(this, "precpred(context!!, 7)")
					this.state = 77
					match(AS) as Token
					this.state = 78
					(_localctx as TypeConversionContext).targetType = type()
					}}
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
	open class InterpolatedValueContext : StringLiteralContentContext {
		fun INTERPOLATION_OPEN() : TerminalNode? = getToken(MiniCalcParser.Tokens.INTERPOLATION_OPEN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun INTERPOLATION_CLOSE() : TerminalNode? = getToken(MiniCalcParser.Tokens.INTERPOLATION_CLOSE.id, 0)
		constructor(ctx: StringLiteralContentContext) { copyFrom(ctx) }
	}
	open class ConstantStringContext : StringLiteralContentContext {
		fun STRING_CONTENT() : TerminalNode? = getToken(MiniCalcParser.Tokens.STRING_CONTENT.id, 0)
		constructor(ctx: StringLiteralContentContext) { copyFrom(ctx) }
	}

	fun  stringLiteralContent() : StringLiteralContentContext {
		var _localctx : StringLiteralContentContext = StringLiteralContentContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_stringLiteralContent.id)
		try {
			this.state = 89
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			STRING_CONTENT  ->  /*LL1AltBlock*/{_localctx = ConstantStringContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 84
			match(STRING_CONTENT) as Token
			}}
			INTERPOLATION_OPEN  ->  /*LL1AltBlock*/{_localctx = InterpolatedValueContext(_localctx)
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
	open class StringContext : TypeContext {
		fun STRING() : TerminalNode? = getToken(MiniCalcParser.Tokens.STRING.id, 0)
		constructor(ctx: TypeContext) { copyFrom(ctx) }
	}
	open class IntegerContext : TypeContext {
		fun INT() : TerminalNode? = getToken(MiniCalcParser.Tokens.INT.id, 0)
		constructor(ctx: TypeContext) { copyFrom(ctx) }
	}
	open class DecimalContext : TypeContext {
		fun DECIMAL() : TerminalNode? = getToken(MiniCalcParser.Tokens.DECIMAL.id, 0)
		constructor(ctx: TypeContext) { copyFrom(ctx) }
	}

	fun  type() : TypeContext {
		var _localctx : TypeContext = TypeContext(context, state)
		enterRule(_localctx, 18, Rules.RULE_type.id)
		try {
			this.state = 94
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			INT  ->  /*LL1AltBlock*/{_localctx = IntegerContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 91
			match(INT) as Token
			}}
			DECIMAL  ->  /*LL1AltBlock*/{_localctx = DecimalContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 92
			match(DECIMAL) as Token
			}}
			STRING  ->  /*LL1AltBlock*/{_localctx = StringContext(_localctx)
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