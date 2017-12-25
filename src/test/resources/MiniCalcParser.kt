// Generated from java-escape by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

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
	}

	private val interpreter : ParserATNSimulator

	val serializedIntegersATN =
		arrayOf(3, 24715, 42794, 33075, 47597, 16764, 15335, 30598, 22884, 3, 
		31, 99, 4, 2, 9, 2, 4, 3, 9, 3, 4, 4, 9, 4, 4, 5, 9, 5, 4, 6, 9, 6, 4, 
		7, 9, 7, 4, 8, 9, 8, 4, 9, 9, 9, 4, 10, 9, 10, 4, 11, 9, 11, 3, 2, 6, 
		2, 24, 10, 2, 13, 2, 14, 2, 25, 3, 3, 3, 3, 3, 3, 3, 4, 3, 4, 3, 4, 3, 
		4, 5, 4, 35, 10, 4, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 6, 3, 6, 3, 6, 3, 
		6, 3, 7, 3, 7, 3, 7, 3, 8, 3, 8, 3, 8, 3, 8, 3, 9, 3, 9, 3, 9, 3, 9, 3, 
		9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 7, 9, 63, 10, 9, 12, 9, 14, 9, 66, 11, 
		9, 3, 9, 3, 9, 3, 9, 5, 9, 71, 10, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 
		9, 3, 9, 3, 9, 3, 9, 7, 9, 82, 10, 9, 12, 9, 14, 9, 85, 11, 9, 3, 10, 
		3, 10, 3, 10, 3, 10, 3, 10, 5, 10, 92, 10, 10, 3, 11, 3, 11, 3, 11, 5, 
		11, 97, 10, 11, 3, 11, 2, 3, 16, 12, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 
		2, 5, 3, 3, 3, 3, 3, 2, 17, 18, 3, 2, 15, 16, 2, 104, 2, 23, 3, 2, 2, 
		2, 4, 27, 3, 2, 2, 2, 6, 34, 3, 2, 2, 2, 8, 36, 3, 2, 2, 2, 10, 41, 3, 
		2, 2, 2, 12, 45, 3, 2, 2, 2, 14, 48, 3, 2, 2, 2, 16, 70, 3, 2, 2, 2, 18, 
		91, 3, 2, 2, 2, 20, 96, 3, 2, 2, 2, 22, 24, 5, 4, 3, 2, 23, 22, 3, 2, 
		2, 2, 24, 25, 3, 2, 2, 2, 25, 23, 3, 2, 2, 2, 25, 26, 3, 2, 2, 2, 26, 
		3, 3, 2, 2, 2, 27, 28, 5, 6, 4, 2, 28, 29, 9, 2, 2, 2, 29, 5, 3, 2, 2, 
		2, 30, 35, 5, 10, 6, 2, 31, 35, 5, 12, 7, 2, 32, 35, 5, 14, 8, 2, 33, 
		35, 5, 8, 5, 2, 34, 30, 3, 2, 2, 2, 34, 31, 3, 2, 2, 2, 34, 32, 3, 2, 
		2, 2, 34, 33, 3, 2, 2, 2, 35, 7, 3, 2, 2, 2, 36, 37, 7, 7, 2, 2, 37, 38, 
		7, 20, 2, 2, 38, 39, 5, 16, 9, 2, 39, 40, 7, 21, 2, 2, 40, 9, 3, 2, 2, 
		2, 41, 42, 7, 5, 2, 2, 42, 43, 5, 20, 11, 2, 43, 44, 7, 12, 2, 2, 44, 
		11, 3, 2, 2, 2, 45, 46, 7, 6, 2, 2, 46, 47, 5, 14, 8, 2, 47, 13, 3, 2, 
		2, 2, 48, 49, 7, 12, 2, 2, 49, 50, 7, 19, 2, 2, 50, 51, 5, 16, 9, 2, 51, 
		15, 3, 2, 2, 2, 52, 53, 8, 9, 1, 2, 53, 54, 7, 20, 2, 2, 54, 55, 5, 16, 
		9, 2, 55, 56, 7, 21, 2, 2, 56, 71, 3, 2, 2, 2, 57, 71, 7, 12, 2, 2, 58, 
		59, 7, 16, 2, 2, 59, 71, 5, 16, 9, 6, 60, 64, 7, 22, 2, 2, 61, 63, 5, 
		18, 10, 2, 62, 61, 3, 2, 2, 2, 63, 66, 3, 2, 2, 2, 64, 62, 3, 2, 2, 2, 
		64, 65, 3, 2, 2, 2, 65, 67, 3, 2, 2, 2, 66, 64, 3, 2, 2, 2, 67, 71, 7, 
		28, 2, 2, 68, 71, 7, 13, 2, 2, 69, 71, 7, 14, 2, 2, 70, 52, 3, 2, 2, 2, 
		70, 57, 3, 2, 2, 2, 70, 58, 3, 2, 2, 2, 70, 60, 3, 2, 2, 2, 70, 68, 3, 
		2, 2, 2, 70, 69, 3, 2, 2, 2, 71, 83, 3, 2, 2, 2, 72, 73, 12, 11, 2, 2, 
		73, 74, 9, 3, 2, 2, 74, 82, 5, 16, 9, 12, 75, 76, 12, 10, 2, 2, 76, 77, 
		9, 4, 2, 2, 77, 82, 5, 16, 9, 11, 78, 79, 12, 9, 2, 2, 79, 80, 7, 8, 2, 
		2, 80, 82, 5, 20, 11, 2, 81, 72, 3, 2, 2, 2, 81, 75, 3, 2, 2, 2, 81, 78, 
		3, 2, 2, 2, 82, 85, 3, 2, 2, 2, 83, 81, 3, 2, 2, 2, 83, 84, 3, 2, 2, 2, 
		84, 17, 3, 2, 2, 2, 85, 83, 3, 2, 2, 2, 86, 92, 7, 30, 2, 2, 87, 88, 7, 
		29, 2, 2, 88, 89, 5, 16, 9, 2, 89, 90, 7, 31, 2, 2, 90, 92, 3, 2, 2, 2, 
		91, 86, 3, 2, 2, 2, 91, 87, 3, 2, 2, 2, 92, 19, 3, 2, 2, 2, 93, 97, 7, 
		9, 2, 2, 94, 97, 7, 10, 2, 2, 95, 97, 7, 11, 2, 2, 96, 93, 3, 2, 2, 2, 
		96, 94, 3, 2, 2, 2, 96, 95, 3, 2, 2, 2, 97, 21, 3, 2, 2, 2, 10, 25, 34, 
		64, 70, 81, 83, 91, 96)
	val ATN = ATNDeserializer().deserializeIntegers(serializedIntegersATN)
	init {
		decisionToDFA = Array<DFA>(ATN.getNumberOfDecisions(), {
			createDFA(ATN.getDecisionState(it), it)
		})
	}

	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	class MiniCalcFileContext : ParserRuleContext {
		var lines: LineContext
		fun line() : List<LineContext> = getRuleContexts(LineContext.class);
		fun line(i: Int) : LineContext = getRuleContext(LineContext.class,i)
		constructor(parent: ParserRuleContext, invokingState: Int) : super(parent, invokingState){
		}
		override fun getRuleIndex() = Rules.RULE_miniCalcFile
		/*@Override
	public void enterRule(ParseTreeListener listener) {
		if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).enterMiniCalcFile(this);
	}
	@Override
	public void exitRule(ParseTreeListener listener) {
		if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).exitMiniCalcFile(this);
	}
	*/
	}

	public final MiniCalcFileContext miniCalcFile() throws RecognitionException {
		MiniCalcFileContext _localctx = new MiniCalcFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_miniCalcFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				((MiniCalcFileContext)_localctx).lines = line();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << VAR) | (1L << PRINT) | (1L << ID))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	class LineContext : ParserRuleContext {
		fun statement() : StatementContext = getRuleContext(StatementContext.class,0)
		fun NEWLINE() : TerminalNode = return getToken(MiniCalcParser.NEWLINE, 0)
		fun EOF() : TerminalNode = return getToken(MiniCalcParser.EOF, 0)
		constructor(parent: ParserRuleContext, invokingState: Int) : super(parent, invokingState){
		}
		override fun getRuleIndex() = Rules.RULE_line
		/*@Override
	public void enterRule(ParseTreeListener listener) {
		if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).enterLine(this);
	}
	@Override
	public void exitRule(ParseTreeListener listener) {
		if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).exitLine(this);
	}
	*/
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
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
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	class StatementContext : ParserRuleContext {
		constructor(parent: ParserRuleContext, invokingState: Int) : super(parent, invokingState){
		}
		override fun getRuleIndex() = Rules.RULE_statement
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
		/*
	*/
	}
	public static class PrintStatementContext extends StatementContext {
		fun print() : PrintContext = getRuleContext(PrintContext.class,0)
		public PrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).exitPrintStatement(this);
		}
	}
	public static class AssignmentStatementContext extends StatementContext {
		fun assignment() : AssignmentContext = getRuleContext(AssignmentContext.class,0)
		public AssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).exitAssignmentStatement(this);
		}
	}
	public static class InputDeclarationStatementContext extends StatementContext {
		fun inputDeclaration() : InputDeclarationContext = getRuleContext(InputDeclarationContext.class,0)
		public InputDeclarationStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).enterInputDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).exitInputDeclarationStatement(this);
		}
	}
	public static class VarDeclarationStatementContext extends StatementContext {
		fun varDeclaration() : VarDeclarationContext = getRuleContext(VarDeclarationContext.class,0)
		public VarDeclarationStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).enterVarDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).exitVarDeclarationStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT:
				_localctx = new InputDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				inputDeclaration();
				}
				break;
			case VAR:
				_localctx = new VarDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				varDeclaration();
				}
				break;
			case ID:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				assignment();
				}
				break;
			case PRINT:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(31);
				print();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	class PrintContext : ParserRuleContext {
		fun PRINT() : TerminalNode = return getToken(MiniCalcParser.PRINT, 0)
		fun LPAREN() : TerminalNode = return getToken(MiniCalcParser.LPAREN, 0)
		fun expression() : ExpressionContext = getRuleContext(ExpressionContext.class,0)
		fun RPAREN() : TerminalNode = return getToken(MiniCalcParser.RPAREN, 0)
		constructor(parent: ParserRuleContext, invokingState: Int) : super(parent, invokingState){
		}
		override fun getRuleIndex() = Rules.RULE_print
		/*@Override
	public void enterRule(ParseTreeListener listener) {
		if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).enterPrint(this);
	}
	@Override
	public void exitRule(ParseTreeListener listener) {
		if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).exitPrint(this);
	}
	*/
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
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
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	class InputDeclarationContext : ParserRuleContext {
		var name: Token
		fun INPUT() : TerminalNode = return getToken(MiniCalcParser.INPUT, 0)
		fun type() : TypeContext = getRuleContext(TypeContext.class,0)
		fun ID() : TerminalNode = return getToken(MiniCalcParser.ID, 0)
		constructor(parent: ParserRuleContext, invokingState: Int) : super(parent, invokingState){
		}
		override fun getRuleIndex() = Rules.RULE_inputDeclaration
		/*@Override
	public void enterRule(ParseTreeListener listener) {
		if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).enterInputDeclaration(this);
	}
	@Override
	public void exitRule(ParseTreeListener listener) {
		if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).exitInputDeclaration(this);
	}
	*/
	}

	public final InputDeclarationContext inputDeclaration() throws RecognitionException {
		InputDeclarationContext _localctx = new InputDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_inputDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(INPUT);
			setState(40);
			type();
			setState(41);
			((InputDeclarationContext)_localctx).name = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	class VarDeclarationContext : ParserRuleContext {
		fun VAR() : TerminalNode = return getToken(MiniCalcParser.VAR, 0)
		fun assignment() : AssignmentContext = getRuleContext(AssignmentContext.class,0)
		constructor(parent: ParserRuleContext, invokingState: Int) : super(parent, invokingState){
		}
		override fun getRuleIndex() = Rules.RULE_varDeclaration
		/*@Override
	public void enterRule(ParseTreeListener listener) {
		if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).enterVarDeclaration(this);
	}
	@Override
	public void exitRule(ParseTreeListener listener) {
		if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).exitVarDeclaration(this);
	}
	*/
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(VAR);
			setState(44);
			assignment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	class AssignmentContext : ParserRuleContext {
		fun ID() : TerminalNode = return getToken(MiniCalcParser.ID, 0)
		fun ASSIGN() : TerminalNode = return getToken(MiniCalcParser.ASSIGN, 0)
		fun expression() : ExpressionContext = getRuleContext(ExpressionContext.class,0)
		constructor(parent: ParserRuleContext, invokingState: Int) : super(parent, invokingState){
		}
		override fun getRuleIndex() = Rules.RULE_assignment
		/*@Override
	public void enterRule(ParseTreeListener listener) {
		if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).enterAssignment(this);
	}
	@Override
	public void exitRule(ParseTreeListener listener) {
		if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).exitAssignment(this);
	}
	*/
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(ID);
			setState(47);
			match(ASSIGN);
			setState(48);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	class ExpressionContext : ParserRuleContext {
		constructor(parent: ParserRuleContext, invokingState: Int) : super(parent, invokingState){
		}
		override fun getRuleIndex() = Rules.RULE_expression
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
		/*
	*/
	}
	public static class DecimalLiteralContext extends ExpressionContext {
		fun DECLIT() : TerminalNode = return getToken(MiniCalcParser.DECLIT, 0)
		public DecimalLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).exitDecimalLiteral(this);
		}
	}
	public static class MinusExpressionContext extends ExpressionContext {
		fun MINUS() : TerminalNode = return getToken(MiniCalcParser.MINUS, 0)
		fun expression() : ExpressionContext = getRuleContext(ExpressionContext.class,0)
		public MinusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).enterMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).exitMinusExpression(this);
		}
	}
	public static class ValueReferenceContext extends ExpressionContext {
		fun ID() : TerminalNode = return getToken(MiniCalcParser.ID, 0)
		public ValueReferenceContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).enterValueReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).exitValueReference(this);
		}
	}
	public static class StringLiteralContext extends ExpressionContext {
		public stringLiteralContent: StringLiteralContentContext;
		public List<StringLiteralContentContext> parts = new ArrayList<StringLiteralContentContext>();
		fun STRING_OPEN() : TerminalNode = return getToken(MiniCalcParser.STRING_OPEN, 0)
		fun STRING_CLOSE() : TerminalNode = return getToken(MiniCalcParser.STRING_CLOSE, 0)
		fun stringLiteralContent() : List<StringLiteralContentContext> = getRuleContexts(StringLiteralContentContext.class);
		fun stringLiteralContent(i: Int) : StringLiteralContentContext = getRuleContext(StringLiteralContentContext.class,i)
		public StringLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).exitStringLiteral(this);
		}
	}
	public static class IntLiteralContext extends ExpressionContext {
		fun INTLIT() : TerminalNode = return getToken(MiniCalcParser.INTLIT, 0)
		public IntLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).enterIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).exitIntLiteral(this);
		}
	}
	public static class ParenExpressionContext extends ExpressionContext {
		fun LPAREN() : TerminalNode = return getToken(MiniCalcParser.LPAREN, 0)
		fun expression() : ExpressionContext = getRuleContext(ExpressionContext.class,0)
		fun RPAREN() : TerminalNode = return getToken(MiniCalcParser.RPAREN, 0)
		public ParenExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).enterParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).exitParenExpression(this);
		}
	}
	public static class BinaryOperationContext extends ExpressionContext {
		public left: ExpressionContext;
		public operator: Token;
		public right: ExpressionContext;
		fun expression() : List<ExpressionContext> = getRuleContexts(ExpressionContext.class);
		fun expression(i: Int) : ExpressionContext = getRuleContext(ExpressionContext.class,i)
		fun DIVISION() : TerminalNode = return getToken(MiniCalcParser.DIVISION, 0)
		fun ASTERISK() : TerminalNode = return getToken(MiniCalcParser.ASTERISK, 0)
		fun PLUS() : TerminalNode = return getToken(MiniCalcParser.PLUS, 0)
		fun MINUS() : TerminalNode = return getToken(MiniCalcParser.MINUS, 0)
		public BinaryOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).enterBinaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).exitBinaryOperation(this);
		}
	}
	public static class TypeConversionContext extends ExpressionContext {
		public value: ExpressionContext;
		public targetType: TypeContext;
		fun AS() : TerminalNode = return getToken(MiniCalcParser.AS, 0)
		fun expression() : ExpressionContext = getRuleContext(ExpressionContext.class,0)
		fun type() : TypeContext = getRuleContext(TypeContext.class,0)
		public TypeConversionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).enterTypeConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).exitTypeConversion(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(51);
				match(LPAREN);
				setState(52);
				expression(0);
				setState(53);
				match(RPAREN);
				}
				break;
			case ID:
				{
				_localctx = new ValueReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				match(ID);
				}
				break;
			case MINUS:
				{
				_localctx = new MinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				match(MINUS);
				setState(57);
				expression(4);
				}
				break;
			case STRING_OPEN:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				match(STRING_OPEN);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==INTERPOLATION_OPEN || _la==STRING_CONTENT) {
					{
					{
					setState(59);
					((StringLiteralContext)_localctx).stringLiteralContent = stringLiteralContent();
					((StringLiteralContext)_localctx).parts.add(((StringLiteralContext)_localctx).stringLiteralContent);
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(65);
				match(STRING_CLOSE);
				}
				break;
			case INTLIT:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				match(INTLIT);
				}
				break;
			case DECLIT:
				{
				_localctx = new DecimalLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				match(DECLIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(79);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(70);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(71);
						((BinaryOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ASTERISK || _la==DIVISION) ) {
							((BinaryOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(72);
						((BinaryOperationContext)_localctx).right = expression(10);
						}
						break;
					case 2:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(73);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(74);
						((BinaryOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((BinaryOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(75);
						((BinaryOperationContext)_localctx).right = expression(9);
						}
						break;
					case 3:
						{
						_localctx = new TypeConversionContext(new ExpressionContext(_parentctx, _parentState));
						((TypeConversionContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(76);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(77);
						match(AS);
						setState(78);
						((TypeConversionContext)_localctx).targetType = type();
						}
						break;
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
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	class StringLiteralContentContext : ParserRuleContext {
		constructor(parent: ParserRuleContext, invokingState: Int) : super(parent, invokingState){
		}
		override fun getRuleIndex() = Rules.RULE_stringLiteralContent
	 
		public StringLiteralContentContext() { }
		public void copyFrom(StringLiteralContentContext ctx) {
			super.copyFrom(ctx);
		}
		/*
	*/
	}
	public static class InterpolatedValueContext extends StringLiteralContentContext {
		fun INTERPOLATION_OPEN() : TerminalNode = return getToken(MiniCalcParser.INTERPOLATION_OPEN, 0)
		fun expression() : ExpressionContext = getRuleContext(ExpressionContext.class,0)
		fun INTERPOLATION_CLOSE() : TerminalNode = return getToken(MiniCalcParser.INTERPOLATION_CLOSE, 0)
		public InterpolatedValueContext(StringLiteralContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).enterInterpolatedValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).exitInterpolatedValue(this);
		}
	}
	public static class ConstantStringContext extends StringLiteralContentContext {
		fun STRING_CONTENT() : TerminalNode = return getToken(MiniCalcParser.STRING_CONTENT, 0)
		public ConstantStringContext(StringLiteralContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).enterConstantString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).exitConstantString(this);
		}
	}

	public final StringLiteralContentContext stringLiteralContent() throws RecognitionException {
		StringLiteralContentContext _localctx = new StringLiteralContentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stringLiteralContent);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_CONTENT:
				_localctx = new ConstantStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(STRING_CONTENT);
				}
				break;
			case INTERPOLATION_OPEN:
				_localctx = new InterpolatedValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(INTERPOLATION_OPEN);
				setState(86);
				expression(0);
				setState(87);
				match(INTERPOLATION_CLOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	class TypeContext : ParserRuleContext {
		constructor(parent: ParserRuleContext, invokingState: Int) : super(parent, invokingState){
		}
		override fun getRuleIndex() = Rules.RULE_type
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
		/*
	*/
	}
	public static class StringContext extends TypeContext {
		fun STRING() : TerminalNode = return getToken(MiniCalcParser.STRING, 0)
		public StringContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).exitString(this);
		}
	}
	public static class IntegerContext extends TypeContext {
		fun INT() : TerminalNode = return getToken(MiniCalcParser.INT, 0)
		public IntegerContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).exitInteger(this);
		}
	}
	public static class DecimalContext extends TypeContext {
		fun DECIMAL() : TerminalNode = return getToken(MiniCalcParser.DECIMAL, 0)
		public DecimalContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).exitDecimal(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(INT);
				}
				break;
			case DECIMAL:
				_localctx = new DecimalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(DECIMAL);
				}
				break;
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		}
		return true;
	}


}