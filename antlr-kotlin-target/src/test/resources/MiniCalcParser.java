// Generated from src/test/resources/MiniCalcParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniCalcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, WS=2, INPUT=3, VAR=4, PRINT=5, AS=6, INT=7, DECIMAL=8, STRING=9, 
		ID=10, INTLIT=11, DECLIT=12, PLUS=13, MINUS=14, ASTERISK=15, DIVISION=16, 
		ASSIGN=17, LPAREN=18, RPAREN=19, STRING_OPEN=20, UNMATCHED=21, ESCAPE_STRING_DELIMITER=22, 
		ESCAPE_SLASH=23, ESCAPE_NEWLINE=24, ESCAPE_SHARP=25, STRING_CLOSE=26, 
		INTERPOLATION_OPEN=27, STRING_CONTENT=28, INTERPOLATION_CLOSE=29;
	public static final int
		RULE_miniCalcFile = 0, RULE_line = 1, RULE_statement = 2, RULE_print = 3, 
		RULE_inputDeclaration = 4, RULE_varDeclaration = 5, RULE_assignment = 6, 
		RULE_expression = 7, RULE_stringLiteralContent = 8, RULE_type = 9;
	public static final String[] ruleNames = {
		"miniCalcFile", "line", "statement", "print", "inputDeclaration", "varDeclaration", 
		"assignment", "expression", "stringLiteralContent", "type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'input'", "'var'", "'print'", null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"'\\\"'", "'\\\\'", "'\\n'", "'\\#'", null, "'#{'", null, "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NEWLINE", "WS", "INPUT", "VAR", "PRINT", "AS", "INT", "DECIMAL", 
		"STRING", "ID", "INTLIT", "DECLIT", "PLUS", "MINUS", "ASTERISK", "DIVISION", 
		"ASSIGN", "LPAREN", "RPAREN", "STRING_OPEN", "UNMATCHED", "ESCAPE_STRING_DELIMITER", 
		"ESCAPE_SLASH", "ESCAPE_NEWLINE", "ESCAPE_SHARP", "STRING_CLOSE", "INTERPOLATION_OPEN", 
		"STRING_CONTENT", "INTERPOLATION_CLOSE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MiniCalcParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniCalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MiniCalcFileContext extends ParserRuleContext {
		public LineContext lines;
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public MiniCalcFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_miniCalcFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).enterMiniCalcFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).exitMiniCalcFile(this);
		}
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

	public static class LineContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MiniCalcParser.NEWLINE, 0); }
		public TerminalNode EOF() { return getToken(MiniCalcParser.EOF, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).exitLine(this);
		}
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintStatementContext extends StatementContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
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
		public InputDeclarationContext inputDeclaration() {
			return getRuleContext(InputDeclarationContext.class,0);
		}
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
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(MiniCalcParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(MiniCalcParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniCalcParser.RPAREN, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).exitPrint(this);
		}
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

	public static class InputDeclarationContext extends ParserRuleContext {
		public Token name;
		public TerminalNode INPUT() { return getToken(MiniCalcParser.INPUT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniCalcParser.ID, 0); }
		public InputDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).enterInputDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).exitInputDeclaration(this);
		}
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MiniCalcParser.VAR, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).exitVarDeclaration(this);
		}
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniCalcParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(MiniCalcParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCalcParserListener ) ((MiniCalcParserListener)listener).exitAssignment(this);
		}
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends ExpressionContext {
		public TerminalNode DECLIT() { return getToken(MiniCalcParser.DECLIT, 0); }
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
		public TerminalNode MINUS() { return getToken(MiniCalcParser.MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		public TerminalNode ID() { return getToken(MiniCalcParser.ID, 0); }
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
		public StringLiteralContentContext stringLiteralContent;
		public List<StringLiteralContentContext> parts = new ArrayList<StringLiteralContentContext>();
		public TerminalNode STRING_OPEN() { return getToken(MiniCalcParser.STRING_OPEN, 0); }
		public TerminalNode STRING_CLOSE() { return getToken(MiniCalcParser.STRING_CLOSE, 0); }
		public List<StringLiteralContentContext> stringLiteralContent() {
			return getRuleContexts(StringLiteralContentContext.class);
		}
		public StringLiteralContentContext stringLiteralContent(int i) {
			return getRuleContext(StringLiteralContentContext.class,i);
		}
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
		public TerminalNode INTLIT() { return getToken(MiniCalcParser.INTLIT, 0); }
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
		public TerminalNode LPAREN() { return getToken(MiniCalcParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniCalcParser.RPAREN, 0); }
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
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIVISION() { return getToken(MiniCalcParser.DIVISION, 0); }
		public TerminalNode ASTERISK() { return getToken(MiniCalcParser.ASTERISK, 0); }
		public TerminalNode PLUS() { return getToken(MiniCalcParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MiniCalcParser.MINUS, 0); }
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
		public ExpressionContext value;
		public TypeContext targetType;
		public TerminalNode AS() { return getToken(MiniCalcParser.AS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
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

	public static class StringLiteralContentContext extends ParserRuleContext {
		public StringLiteralContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteralContent; }
	 
		public StringLiteralContentContext() { }
		public void copyFrom(StringLiteralContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InterpolatedValueContext extends StringLiteralContentContext {
		public TerminalNode INTERPOLATION_OPEN() { return getToken(MiniCalcParser.INTERPOLATION_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INTERPOLATION_CLOSE() { return getToken(MiniCalcParser.INTERPOLATION_CLOSE, 0); }
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
		public TerminalNode STRING_CONTENT() { return getToken(MiniCalcParser.STRING_CONTENT, 0); }
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringContext extends TypeContext {
		public TerminalNode STRING() { return getToken(MiniCalcParser.STRING, 0); }
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
		public TerminalNode INT() { return getToken(MiniCalcParser.INT, 0); }
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
		public TerminalNode DECIMAL() { return getToken(MiniCalcParser.DECIMAL, 0); }
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37c\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\6\2\30\n\2\r\2\16\2\31\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4#\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t?\n\t\f\t\16\tB\13\t\3\t\3\t\3\t\5\tG\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tR\n\t\f\t\16\tU\13\t\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\\\n\n\3\13\3\13\3\13\5\13a\n\13\3\13\2\3\20\f\2\4\6\b"+
		"\n\f\16\20\22\24\2\5\3\3\3\3\3\2\21\22\3\2\17\20\2h\2\27\3\2\2\2\4\33"+
		"\3\2\2\2\6\"\3\2\2\2\b$\3\2\2\2\n)\3\2\2\2\f-\3\2\2\2\16\60\3\2\2\2\20"+
		"F\3\2\2\2\22[\3\2\2\2\24`\3\2\2\2\26\30\5\4\3\2\27\26\3\2\2\2\30\31\3"+
		"\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\3\3\2\2\2\33\34\5\6\4\2\34\35\t"+
		"\2\2\2\35\5\3\2\2\2\36#\5\n\6\2\37#\5\f\7\2 #\5\16\b\2!#\5\b\5\2\"\36"+
		"\3\2\2\2\"\37\3\2\2\2\" \3\2\2\2\"!\3\2\2\2#\7\3\2\2\2$%\7\7\2\2%&\7\24"+
		"\2\2&\'\5\20\t\2\'(\7\25\2\2(\t\3\2\2\2)*\7\5\2\2*+\5\24\13\2+,\7\f\2"+
		"\2,\13\3\2\2\2-.\7\6\2\2./\5\16\b\2/\r\3\2\2\2\60\61\7\f\2\2\61\62\7\23"+
		"\2\2\62\63\5\20\t\2\63\17\3\2\2\2\64\65\b\t\1\2\65\66\7\24\2\2\66\67\5"+
		"\20\t\2\678\7\25\2\28G\3\2\2\29G\7\f\2\2:;\7\20\2\2;G\5\20\t\6<@\7\26"+
		"\2\2=?\5\22\n\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3"+
		"\2\2\2CG\7\34\2\2DG\7\r\2\2EG\7\16\2\2F\64\3\2\2\2F9\3\2\2\2F:\3\2\2\2"+
		"F<\3\2\2\2FD\3\2\2\2FE\3\2\2\2GS\3\2\2\2HI\f\13\2\2IJ\t\3\2\2JR\5\20\t"+
		"\fKL\f\n\2\2LM\t\4\2\2MR\5\20\t\13NO\f\t\2\2OP\7\b\2\2PR\5\24\13\2QH\3"+
		"\2\2\2QK\3\2\2\2QN\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\21\3\2\2\2U"+
		"S\3\2\2\2V\\\7\36\2\2WX\7\35\2\2XY\5\20\t\2YZ\7\37\2\2Z\\\3\2\2\2[V\3"+
		"\2\2\2[W\3\2\2\2\\\23\3\2\2\2]a\7\t\2\2^a\7\n\2\2_a\7\13\2\2`]\3\2\2\2"+
		"`^\3\2\2\2`_\3\2\2\2a\25\3\2\2\2\n\31\"@FQS[`";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}