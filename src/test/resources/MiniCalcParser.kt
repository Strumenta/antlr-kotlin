// Generated from java-escape by ANTLR 4.7.1
import com.strumenta.kotlinmultiplatform.Arrays
import org.antlr.v4.kotlinruntime.facade.*

class MiniCalcParser(input: TokenStream) : Parser("MiniCalcParser.g4", input) {
	// TODO verify version of runtime is compatible

    enum class Tokens(val id: Int) {
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

        val VOCABULARY = VocabularyImpl(LITERAL_NAMES, SYMBOLIC_NAMES)

        val serializedIntegersATN =
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
        	decisionToDFA = Array<DFA>(ATN.getNumberOfDecisions(), {
        		createDFA(ATN.getDecisionState(it), it)
        	})
        }
	}

	private val interpreter : ParserATNSimulator



	init {
		interpreter = createParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	class MiniCalcFileContext : ParserRuleContext {
		var lines: LineContext? = null
		fun line() : List<LineContext> = getRuleContexts("LineContext")
		fun line(i: Int) : LineContext? = getRuleContext("LineContext",i)
		constructor(parent: ParserRuleContext, invokingState: Int) : super(parent, invokingState){
		}
		override fun getRuleIndex() = Rules.RULE_miniCalcFile.id
		fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterMiniCalcFile(this)
		}
		fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitMiniCalcFile(this)
		}
	}

	fun  miniCalcFile() : MiniCalcFileContext {
		var _localctx : MiniCalcFileContext = MiniCalcFileContext(_ctx, getState())
		enterRule(_localctx, 0, RULE_miniCalcFile)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			{
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				(_localctx as MiniCalcFileContext).lines = line();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) and 0x3f.inv) == 0 && ((1L shl _la) and ((1L shl INPUT) or (1L shl VAR) or (1L shl PRINT) or (1L shl ID))) != 0) )
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	class LineContext : ParserRuleContext {
		fun statement() : StatementContext? = getRuleContext("StatementContext",0)
		fun NEWLINE() : TerminalNode = return getToken(MiniCalcParser.NEWLINE, 0)
		fun EOF() : TerminalNode = return getToken(MiniCalcParser.EOF, 0)
		constructor(parent: ParserRuleContext, invokingState: Int) : super(parent, invokingState){
		}
		override fun getRuleIndex() = Rules.RULE_line.id
		fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterLine(this)
		}
		fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitLine(this)
		}
	}

	fun  line() : LineContext {
		var _localctx : LineContext = LineContext(_ctx, getState())
		enterRule(_localctx, 2, RULE_line)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			{
			setState(25);
			statement();
			setState(26);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NEWLINE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	class StatementContext : ParserRuleContext {
		constructor(parent: ParserRuleContext, invokingState: Int) : super(parent, invokingState){
		}
		override fun getRuleIndex() = Rules.RULE_statement.id
	 
		constructor () { }
		fun copyFrom(ctx: StatementContext) {
			super.copyFrom(ctx)
		}
	}
	class PrintStatementContext : StatementContext {
		fun print() : PrintContext? = getRuleContext("PrintContext",0)
		constructor(ctx: StatementContext) { copyFrom(ctx) }
		fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterPrintStatement(this)
		}
		fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitPrintStatement(this)
		}
	}
	class AssignmentStatementContext : StatementContext {
		fun assignment() : AssignmentContext? = getRuleContext("AssignmentContext",0)
		constructor(ctx: StatementContext) { copyFrom(ctx) }
		fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterAssignmentStatement(this)
		}
		fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitAssignmentStatement(this)
		}
	}
	class InputDeclarationStatementContext : StatementContext {
		fun inputDeclaration() : InputDeclarationContext? = getRuleContext("InputDeclarationContext",0)
		constructor(ctx: StatementContext) { copyFrom(ctx) }
		fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterInputDeclarationStatement(this)
		}
		fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitInputDeclarationStatement(this)
		}
	}
	class VarDeclarationStatementContext : StatementContext {
		fun varDeclaration() : VarDeclarationContext? = getRuleContext("VarDeclarationContext",0)
		constructor(ctx: StatementContext) { copyFrom(ctx) }
		fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterVarDeclarationStatement(this)
		}
		fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitVarDeclarationStatement(this)
		}
	}

	fun  statement() : StatementContext {
		var _localctx : StatementContext = StatementContext(_ctx, getState())
		enterRule(_localctx, 4, RULE_statement)
		try {
			setState(32);
			_errHandler.sync(this);
			when (_input.LA(1)) {
			INPUT -> 
				_localctx = InputDeclarationStatementContext(_localctx)
				enterOuterAlt(_localctx, 1)
				{
				setState(28);
				inputDeclaration();
				}
			VAR -> 
				_localctx = VarDeclarationStatementContext(_localctx)
				enterOuterAlt(_localctx, 2)
				{
				setState(29);
				varDeclaration();
				}
			ID -> 
				_localctx = AssignmentStatementContext(_localctx)
				enterOuterAlt(_localctx, 3)
				{
				setState(30);
				assignment();
				}
			PRINT -> 
				_localctx = PrintStatementContext(_localctx)
				enterOuterAlt(_localctx, 4)
				{
				setState(31);
				print();
				}
			else -> throw NoViableAltException(this)
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	class PrintContext : ParserRuleContext {
		fun PRINT() : TerminalNode = return getToken(MiniCalcParser.PRINT, 0)
		fun LPAREN() : TerminalNode = return getToken(MiniCalcParser.LPAREN, 0)
		fun expression() : ExpressionContext? = getRuleContext("ExpressionContext",0)
		fun RPAREN() : TerminalNode = return getToken(MiniCalcParser.RPAREN, 0)
		constructor(parent: ParserRuleContext, invokingState: Int) : super(parent, invokingState){
		}
		override fun getRuleIndex() = Rules.RULE_print.id
		fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterPrint(this)
		}
		fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitPrint(this)
		}
	}

	fun  print() : PrintContext {
		var _localctx : PrintContext = PrintContext(_ctx, getState())
		enterRule(_localctx, 6, RULE_print)
		try {
			enterOuterAlt(_localctx, 1)
			{
			setState(34);
			match(PRINT);
			setState(35);
			match(LPAREN);
			setState(36);
			expression(0);
			setState(37);
			match(RPAREN);
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	class InputDeclarationContext : ParserRuleContext {
		var name: Token? = null
		fun INPUT() : TerminalNode = return getToken(MiniCalcParser.INPUT, 0)
		fun type() : TypeContext? = getRuleContext("TypeContext",0)
		fun ID() : TerminalNode = return getToken(MiniCalcParser.ID, 0)
		constructor(parent: ParserRuleContext, invokingState: Int) : super(parent, invokingState){
		}
		override fun getRuleIndex() = Rules.RULE_inputDeclaration.id
		fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterInputDeclaration(this)
		}
		fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitInputDeclaration(this)
		}
	}

	fun  inputDeclaration() : InputDeclarationContext {
		var _localctx : InputDeclarationContext = InputDeclarationContext(_ctx, getState())
		enterRule(_localctx, 8, RULE_inputDeclaration)
		try {
			enterOuterAlt(_localctx, 1)
			{
			setState(39);
			match(INPUT);
			setState(40);
			type();
			setState(41);
			(_localctx as InputDeclarationContext).name = match(ID);
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	class VarDeclarationContext : ParserRuleContext {
		fun VAR() : TerminalNode = return getToken(MiniCalcParser.VAR, 0)
		fun assignment() : AssignmentContext? = getRuleContext("AssignmentContext",0)
		constructor(parent: ParserRuleContext, invokingState: Int) : super(parent, invokingState){
		}
		override fun getRuleIndex() = Rules.RULE_varDeclaration.id
		fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterVarDeclaration(this)
		}
		fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitVarDeclaration(this)
		}
	}

	fun  varDeclaration() : VarDeclarationContext {
		var _localctx : VarDeclarationContext = VarDeclarationContext(_ctx, getState())
		enterRule(_localctx, 10, RULE_varDeclaration)
		try {
			enterOuterAlt(_localctx, 1)
			{
			setState(43);
			match(VAR);
			setState(44);
			assignment();
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	class AssignmentContext : ParserRuleContext {
		fun ID() : TerminalNode = return getToken(MiniCalcParser.ID, 0)
		fun ASSIGN() : TerminalNode = return getToken(MiniCalcParser.ASSIGN, 0)
		fun expression() : ExpressionContext? = getRuleContext("ExpressionContext",0)
		constructor(parent: ParserRuleContext, invokingState: Int) : super(parent, invokingState){
		}
		override fun getRuleIndex() = Rules.RULE_assignment.id
		fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterAssignment(this)
		}
		fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitAssignment(this)
		}
	}

	fun  assignment() : AssignmentContext {
		var _localctx : AssignmentContext = AssignmentContext(_ctx, getState())
		enterRule(_localctx, 12, RULE_assignment)
		try {
			enterOuterAlt(_localctx, 1)
			{
			setState(46);
			match(ID);
			setState(47);
			match(ASSIGN);
			setState(48);
			expression(0);
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	class ExpressionContext : ParserRuleContext {
		constructor(parent: ParserRuleContext, invokingState: Int) : super(parent, invokingState){
		}
		override fun getRuleIndex() = Rules.RULE_expression.id
	 
		constructor () { }
		fun copyFrom(ctx: ExpressionContext) {
			super.copyFrom(ctx)
		}
	}
	class DecimalLiteralContext : ExpressionContext {
		fun DECLIT() : TerminalNode = return getToken(MiniCalcParser.DECLIT, 0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterDecimalLiteral(this)
		}
		fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitDecimalLiteral(this)
		}
	}
	class MinusExpressionContext : ExpressionContext {
		fun MINUS() : TerminalNode = return getToken(MiniCalcParser.MINUS, 0)
		fun expression() : ExpressionContext? = getRuleContext("ExpressionContext",0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterMinusExpression(this)
		}
		fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitMinusExpression(this)
		}
	}
	class ValueReferenceContext : ExpressionContext {
		fun ID() : TerminalNode = return getToken(MiniCalcParser.ID, 0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterValueReference(this)
		}
		fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitValueReference(this)
		}
	}
	class StringLiteralContext : ExpressionContext {
		public var stringLiteralContent: StringLiteralContentContext
		public var parts : List<StringLiteralContentContext>= ArrayList<StringLiteralContentContext>()
		fun STRING_OPEN() : TerminalNode = return getToken(MiniCalcParser.STRING_OPEN, 0)
		fun STRING_CLOSE() : TerminalNode = return getToken(MiniCalcParser.STRING_CLOSE, 0)
		fun stringLiteralContent() : List<StringLiteralContentContext> = getRuleContexts("StringLiteralContentContext")
		fun stringLiteralContent(i: Int) : StringLiteralContentContext? = getRuleContext("StringLiteralContentContext",i)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterStringLiteral(this)
		}
		fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitStringLiteral(this)
		}
	}
	class IntLiteralContext : ExpressionContext {
		fun INTLIT() : TerminalNode = return getToken(MiniCalcParser.INTLIT, 0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterIntLiteral(this)
		}
		fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitIntLiteral(this)
		}
	}
	class ParenExpressionContext : ExpressionContext {
		fun LPAREN() : TerminalNode = return getToken(MiniCalcParser.LPAREN, 0)
		fun expression() : ExpressionContext? = getRuleContext("ExpressionContext",0)
		fun RPAREN() : TerminalNode = return getToken(MiniCalcParser.RPAREN, 0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterParenExpression(this)
		}
		fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitParenExpression(this)
		}
	}
	class BinaryOperationContext : ExpressionContext {
		public var left: ExpressionContext
		public var operator: Token
		public var right: ExpressionContext
		fun expression() : List<ExpressionContext> = getRuleContexts("ExpressionContext")
		fun expression(i: Int) : ExpressionContext? = getRuleContext("ExpressionContext",i)
		fun DIVISION() : TerminalNode = return getToken(MiniCalcParser.DIVISION, 0)
		fun ASTERISK() : TerminalNode = return getToken(MiniCalcParser.ASTERISK, 0)
		fun PLUS() : TerminalNode = return getToken(MiniCalcParser.PLUS, 0)
		fun MINUS() : TerminalNode = return getToken(MiniCalcParser.MINUS, 0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterBinaryOperation(this)
		}
		fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitBinaryOperation(this)
		}
	}
	class TypeConversionContext : ExpressionContext {
		public var value: ExpressionContext
		public var targetType: TypeContext
		fun AS() : TerminalNode = return getToken(MiniCalcParser.AS, 0)
		fun expression() : ExpressionContext? = getRuleContext("ExpressionContext",0)
		fun type() : TypeContext? = getRuleContext("TypeContext",0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterTypeConversion(this)
		}
		fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitTypeConversion(this)
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(_p: Int) {
		_parentctx : ParserRuleContext= _ctx
		_parentState : Int = getState()
		_localctx : ExpressionContext= ExpressionContext(_ctx, _parentState)
		_prevctx : ExpressionContext= _localctx
		_startState : Int = 14
		enterRecursionRule(_localctx, 14, RULE_expression, _p)
		var _la: Int
		try {
			_alt: Int
			enterOuterAlt(_localctx, 1)
			{
			setState(68);
			_errHandler.sync(this);
			when (_input.LA(1)) {
			LPAREN -> 
				{
				_localctx = ParenExpressionContext(_localctx)
				_ctx = _localctx
				_prevctx = _localctx

				setState(51);
				match(LPAREN);
				setState(52);
				expression(0);
				setState(53);
				match(RPAREN);
				}
			ID -> 
				{
				_localctx = ValueReferenceContext(_localctx)
				_ctx = _localctx
				_prevctx = _localctx
				setState(55);
				match(ID);
				}
			MINUS -> 
				{
				_localctx = MinusExpressionContext(_localctx)
				_ctx = _localctx
				_prevctx = _localctx
				setState(56);
				match(MINUS);
				setState(57);
				expression(4);
				}
			STRING_OPEN -> 
				{
				_localctx = StringLiteralContext(_localctx)
				_ctx = _localctx
				_prevctx = _localctx
				setState(58);
				match(STRING_OPEN);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==INTERPOLATION_OPEN || _la==STRING_CONTENT) {
					{
					{
					setState(59);
					(_localctx as StringLiteralContext).stringLiteralContent = stringLiteralContent();
					(_localctx as StringLiteralContext).parts.add((_localctx as StringLiteralContext).stringLiteralContent);
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(65);
				match(STRING_CLOSE);
				}
			INTLIT -> 
				{
				_localctx = IntLiteralContext(_localctx)
				_ctx = _localctx
				_prevctx = _localctx
				setState(66);
				match(INTLIT);
				}
			DECLIT -> 
				{
				_localctx = DecimalLiteralContext(_localctx)
				_ctx = _localctx
				_prevctx = _localctx
				setState(67);
				match(DECLIT);
				}
			else -> throw NoViableAltException(this)
			}
			_ctx.stop = _input.LT(-1);
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					_prevctx = _localctx
					{
					setState(79);
					_errHandler.sync(this);
					when ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					1 -> {
					_localctx = BinaryOperationContext(ExpressionContext(_parentctx, _parentState))
					((BinaryOperationContext)_localctx).left = _prevctx
					pushNewRecursionContext(_localctx, _startState, RULE_expression)
					setState(70);
					if (!(precpred(_ctx, 9))) throw FailedPredicateException(this, "precpred(_ctx, 9)");
					setState(71);
					(_localctx as BinaryOperationContext).operator = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ASTERISK || _la==DIVISION) ) {
						(_localctx as BinaryOperationContext).operator = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(72);
					(_localctx as BinaryOperationContext).right = expression(10);
					}
					2 -> {
					_localctx = BinaryOperationContext(ExpressionContext(_parentctx, _parentState))
					((BinaryOperationContext)_localctx).left = _prevctx
					pushNewRecursionContext(_localctx, _startState, RULE_expression)
					setState(73);
					if (!(precpred(_ctx, 8))) throw FailedPredicateException(this, "precpred(_ctx, 8)");
					setState(74);
					(_localctx as BinaryOperationContext).operator = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
						(_localctx as BinaryOperationContext).operator = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(75);
					(_localctx as BinaryOperationContext).right = expression(9);
					}
					3 -> {
					_localctx = TypeConversionContext(ExpressionContext(_parentctx, _parentState))
					((TypeConversionContext)_localctx).value = _prevctx
					pushNewRecursionContext(_localctx, _startState, RULE_expression)
					setState(76);
					if (!(precpred(_ctx, 7))) throw FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(77);
					match(AS);
					setState(78);
					(_localctx as TypeConversionContext).targetType = type();
					}
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	class StringLiteralContentContext : ParserRuleContext {
		constructor(parent: ParserRuleContext, invokingState: Int) : super(parent, invokingState){
		}
		override fun getRuleIndex() = Rules.RULE_stringLiteralContent.id
	 
		constructor () { }
		fun copyFrom(ctx: StringLiteralContentContext) {
			super.copyFrom(ctx)
		}
	}
	class InterpolatedValueContext : StringLiteralContentContext {
		fun INTERPOLATION_OPEN() : TerminalNode = return getToken(MiniCalcParser.INTERPOLATION_OPEN, 0)
		fun expression() : ExpressionContext? = getRuleContext("ExpressionContext",0)
		fun INTERPOLATION_CLOSE() : TerminalNode = return getToken(MiniCalcParser.INTERPOLATION_CLOSE, 0)
		constructor(ctx: StringLiteralContentContext) { copyFrom(ctx) }
		fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterInterpolatedValue(this)
		}
		fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitInterpolatedValue(this)
		}
	}
	class ConstantStringContext : StringLiteralContentContext {
		fun STRING_CONTENT() : TerminalNode = return getToken(MiniCalcParser.STRING_CONTENT, 0)
		constructor(ctx: StringLiteralContentContext) { copyFrom(ctx) }
		fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterConstantString(this)
		}
		fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitConstantString(this)
		}
	}

	fun  stringLiteralContent() : StringLiteralContentContext {
		var _localctx : StringLiteralContentContext = StringLiteralContentContext(_ctx, getState())
		enterRule(_localctx, 16, RULE_stringLiteralContent)
		try {
			setState(89);
			_errHandler.sync(this);
			when (_input.LA(1)) {
			STRING_CONTENT -> 
				_localctx = ConstantStringContext(_localctx)
				enterOuterAlt(_localctx, 1)
				{
				setState(84);
				match(STRING_CONTENT);
				}
			INTERPOLATION_OPEN -> 
				_localctx = InterpolatedValueContext(_localctx)
				enterOuterAlt(_localctx, 2)
				{
				setState(85);
				match(INTERPOLATION_OPEN);
				setState(86);
				expression(0);
				setState(87);
				match(INTERPOLATION_CLOSE);
				}
			else -> throw NoViableAltException(this)
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	class TypeContext : ParserRuleContext {
		constructor(parent: ParserRuleContext, invokingState: Int) : super(parent, invokingState){
		}
		override fun getRuleIndex() = Rules.RULE_type.id
	 
		constructor () { }
		fun copyFrom(ctx: TypeContext) {
			super.copyFrom(ctx)
		}
	}
	class StringContext : TypeContext {
		fun STRING() : TerminalNode = return getToken(MiniCalcParser.STRING, 0)
		constructor(ctx: TypeContext) { copyFrom(ctx) }
		fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterString(this)
		}
		fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitString(this)
		}
	}
	class IntegerContext : TypeContext {
		fun INT() : TerminalNode = return getToken(MiniCalcParser.INT, 0)
		constructor(ctx: TypeContext) { copyFrom(ctx) }
		fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterInteger(this)
		}
		fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitInteger(this)
		}
	}
	class DecimalContext : TypeContext {
		fun DECIMAL() : TerminalNode = return getToken(MiniCalcParser.DECIMAL, 0)
		constructor(ctx: TypeContext) { copyFrom(ctx) }
		fun enterRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).enterDecimal(this)
		}
		fun exitRule(listener: ParseTreeListener) {
			if ( listener is MiniCalcParserListener ) (listener as MiniCalcParserListener).exitDecimal(this)
		}
	}

	fun  type() : TypeContext {
		var _localctx : TypeContext = TypeContext(_ctx, getState())
		enterRule(_localctx, 18, RULE_type)
		try {
			setState(94);
			_errHandler.sync(this);
			when (_input.LA(1)) {
			INT -> 
				_localctx = IntegerContext(_localctx)
				enterOuterAlt(_localctx, 1)
				{
				setState(91);
				match(INT);
				}
			DECIMAL -> 
				_localctx = DecimalContext(_localctx)
				enterOuterAlt(_localctx, 2)
				{
				setState(92);
				match(DECIMAL);
				}
			STRING -> 
				_localctx = StringContext(_localctx)
				enterOuterAlt(_localctx, 3)
				{
				setState(93);
				match(STRING);
				}
			else -> throw NoViableAltException(this)
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	fun sempred(_localctx: RuleContext, ruleIndex: Int, predIndex: Int) : Boolean {
		when (ruleIndex) {
		7 -> return expression_sempred((ExpressionContext)_localctx, predIndex)
		}
		return true
	}
	private fun expression_sempred(ExpressionContext _localctx, int predIndex) : Boolean {
		when (predIndex) {
		    0 -> return precpred(_ctx, 9)
		    1 -> return precpred(_ctx, 8)
		    2 -> return precpred(_ctx, 7)
		}
		return true
	}

}