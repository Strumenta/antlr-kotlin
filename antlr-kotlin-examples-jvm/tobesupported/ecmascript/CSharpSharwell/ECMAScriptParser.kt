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

class ECMAScriptParser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(ECMAScriptParser.ProgramContext::class,
                                                              ECMAScriptParser.SourceElementsContext::class,
                                                              ECMAScriptParser.SourceElementContext::class,
                                                              ECMAScriptParser.StatementContext::class,
                                                              ECMAScriptParser.BlockContext::class,
                                                              ECMAScriptParser.StatementListContext::class,
                                                              ECMAScriptParser.VariableStatementContext::class,
                                                              ECMAScriptParser.VariableDeclarationListContext::class,
                                                              ECMAScriptParser.VariableDeclarationContext::class,
                                                              ECMAScriptParser.InitialiserContext::class,
                                                              ECMAScriptParser.EmptyStatementContext::class,
                                                              ECMAScriptParser.ExpressionStatementContext::class,
                                                              ECMAScriptParser.IfStatementContext::class,
                                                              ECMAScriptParser.IterationStatementContext::class,
                                                              ECMAScriptParser.ContinueStatementContext::class,
                                                              ECMAScriptParser.BreakStatementContext::class,
                                                              ECMAScriptParser.ReturnStatementContext::class,
                                                              ECMAScriptParser.WithStatementContext::class,
                                                              ECMAScriptParser.SwitchStatementContext::class,
                                                              ECMAScriptParser.CaseBlockContext::class,
                                                              ECMAScriptParser.CaseClausesContext::class,
                                                              ECMAScriptParser.CaseClauseContext::class,
                                                              ECMAScriptParser.DefaultClauseContext::class,
                                                              ECMAScriptParser.LabelledStatementContext::class,
                                                              ECMAScriptParser.ThrowStatementContext::class,
                                                              ECMAScriptParser.TryStatementContext::class,
                                                              ECMAScriptParser.CatchProductionContext::class,
                                                              ECMAScriptParser.FinallyProductionContext::class,
                                                              ECMAScriptParser.DebuggerStatementContext::class,
                                                              ECMAScriptParser.FunctionDeclarationContext::class,
                                                              ECMAScriptParser.FormalParameterListContext::class,
                                                              ECMAScriptParser.FunctionBodyContext::class,
                                                              ECMAScriptParser.ArrayLiteralContext::class,
                                                              ECMAScriptParser.ElementListContext::class,
                                                              ECMAScriptParser.ElisionContext::class,
                                                              ECMAScriptParser.ObjectLiteralContext::class,
                                                              ECMAScriptParser.PropertyNameAndValueListContext::class,
                                                              ECMAScriptParser.PropertyAssignmentContext::class,
                                                              ECMAScriptParser.PropertyNameContext::class,
                                                              ECMAScriptParser.PropertySetParameterListContext::class,
                                                              ECMAScriptParser.ArgumentsContext::class,
                                                              ECMAScriptParser.ArgumentListContext::class,
                                                              ECMAScriptParser.ExpressionSequenceContext::class,
                                                              ECMAScriptParser.SingleExpressionContext::class,
                                                              ECMAScriptParser.AssignmentOperatorContext::class,
                                                              ECMAScriptParser.LiteralContext::class,
                                                              ECMAScriptParser.NumericLiteralContext::class,
                                                              ECMAScriptParser.IdentifierNameContext::class,
                                                              ECMAScriptParser.ReservedWordContext::class,
                                                              ECMAScriptParser.KeywordContext::class,
                                                              ECMAScriptParser.FutureReservedWordContext::class,
                                                              ECMAScriptParser.GetterContext::class,
                                                              ECMAScriptParser.SetterContext::class,
                                                              ECMAScriptParser.EosContext::class,
                                                              ECMAScriptParser.EofContext::class)
    }

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "ECMAScript.g4"

    override val tokenNames: Array<String?>?
        get() = ECMAScriptParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = ECMAScriptParser.Companion.ruleNames
    override val atn: ATN
        get() = ECMAScriptParser.Companion.ATN

    enum class Tokens(val id: Int) {
        EOF(-1),
        RegularExpressionLiteral(1),
        LineTerminator(2),
        OpenBracket(3),
        CloseBracket(4),
        OpenParen(5),
        CloseParen(6),
        OpenBrace(7),
        CloseBrace(8),
        SemiColon(9),
        Comma(10),
        Assign(11),
        QuestionMark(12),
        Colon(13),
        Dot(14),
        PlusPlus(15),
        MinusMinus(16),
        Plus(17),
        Minus(18),
        BitNot(19),
        Not(20),
        Multiply(21),
        Divide(22),
        Modulus(23),
        RightShiftArithmetic(24),
        LeftShiftArithmetic(25),
        RightShiftLogical(26),
        LessThan(27),
        MoreThan(28),
        LessThanEquals(29),
        GreaterThanEquals(30),
        Equals_(31),
        NotEquals(32),
        IdentityEquals(33),
        IdentityNotEquals(34),
        BitAnd(35),
        BitXOr(36),
        BitOr(37),
        And(38),
        Or(39),
        MultiplyAssign(40),
        DivideAssign(41),
        ModulusAssign(42),
        PlusAssign(43),
        MinusAssign(44),
        LeftShiftArithmeticAssign(45),
        RightShiftArithmeticAssign(46),
        RightShiftLogicalAssign(47),
        BitAndAssign(48),
        BitXorAssign(49),
        BitOrAssign(50),
        NullLiteral(51),
        BooleanLiteral(52),
        DecimalLiteral(53),
        HexIntegerLiteral(54),
        OctalIntegerLiteral(55),
        Break(56),
        Do(57),
        Instanceof(58),
        Typeof(59),
        Case(60),
        Else(61),
        New(62),
        Var(63),
        Catch(64),
        Finally(65),
        Return(66),
        Void(67),
        Continue(68),
        For(69),
        Switch(70),
        While(71),
        Debugger(72),
        Function(73),
        This(74),
        With(75),
        Default(76),
        If(77),
        Throw(78),
        Delete(79),
        In(80),
        Try(81),
        Class(82),
        Enum(83),
        Extends(84),
        Super(85),
        Const(86),
        Export(87),
        Import(88),
        Implements(89),
        Let(90),
        Private(91),
        Public(92),
        Interface(93),
        Package(94),
        Protected(95),
        Static(96),
        Yield(97),
        Identifier(98),
        StringLiteral(99),
        WhiteSpaces(100),
        MultiLineComment(101),
        SingleLineComment(102),
        HtmlComment(103),
        UnexpectedCharacter(104)
    }

    enum class Rules(val id: Int) {
        RULE_program(0),
        RULE_sourceElements(1),
        RULE_sourceElement(2),
        RULE_statement(3),
        RULE_block(4),
        RULE_statementList(5),
        RULE_variableStatement(6),
        RULE_variableDeclarationList(7),
        RULE_variableDeclaration(8),
        RULE_initialiser(9),
        RULE_emptyStatement(10),
        RULE_expressionStatement(11),
        RULE_ifStatement(12),
        RULE_iterationStatement(13),
        RULE_continueStatement(14),
        RULE_breakStatement(15),
        RULE_returnStatement(16),
        RULE_withStatement(17),
        RULE_switchStatement(18),
        RULE_caseBlock(19),
        RULE_caseClauses(20),
        RULE_caseClause(21),
        RULE_defaultClause(22),
        RULE_labelledStatement(23),
        RULE_throwStatement(24),
        RULE_tryStatement(25),
        RULE_catchProduction(26),
        RULE_finallyProduction(27),
        RULE_debuggerStatement(28),
        RULE_functionDeclaration(29),
        RULE_formalParameterList(30),
        RULE_functionBody(31),
        RULE_arrayLiteral(32),
        RULE_elementList(33),
        RULE_elision(34),
        RULE_objectLiteral(35),
        RULE_propertyNameAndValueList(36),
        RULE_propertyAssignment(37),
        RULE_propertyName(38),
        RULE_propertySetParameterList(39),
        RULE_arguments(40),
        RULE_argumentList(41),
        RULE_expressionSequence(42),
        RULE_singleExpression(43),
        RULE_assignmentOperator(44),
        RULE_literal(45),
        RULE_numericLiteral(46),
        RULE_identifierName(47),
        RULE_reservedWord(48),
        RULE_keyword(49),
        RULE_futureReservedWord(50),
        RULE_getter(51),
        RULE_setter(52),
        RULE_eos(53),
        RULE_eof(54)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("program", "sourceElements", "sourceElement", 
                                "statement", "block", "statementList", "variableStatement", 
                                "variableDeclarationList", "variableDeclaration", 
                                "initialiser", "emptyStatement", "expressionStatement", 
                                "ifStatement", "iterationStatement", "continueStatement", 
                                "breakStatement", "returnStatement", "withStatement", 
                                "switchStatement", "caseBlock", "caseClauses", 
                                "caseClause", "defaultClause", "labelledStatement", 
                                "throwStatement", "tryStatement", "catchProduction", 
                                "finallyProduction", "debuggerStatement", 
                                "functionDeclaration", "formalParameterList", 
                                "functionBody", "arrayLiteral", "elementList", 
                                "elision", "objectLiteral", "propertyNameAndValueList", 
                                "propertyAssignment", "propertyName", "propertySetParameterList", 
                                "arguments", "argumentList", "expressionSequence", 
                                "singleExpression", "assignmentOperator", 
                                "literal", "numericLiteral", "identifierName", 
                                "reservedWord", "keyword", "futureReservedWord", 
                                "getter", "setter", "eos", "eof")

        private val LITERAL_NAMES = Arrays.asList<String?>(null, null, null, 
                                                           "'['", "']'", 
                                                           "'('", "')'", 
                                                           "'{'", "'}'", 
                                                           "';'", "','", 
                                                           "'='", "'?'", 
                                                           "':'", "'.'", 
                                                           "'++'", "'--'", 
                                                           "'+'", "'-'", 
                                                           "'~'", "'!'", 
                                                           "'*'", "'/'", 
                                                           "'%'", "'>>'", 
                                                           "'<<'", "'>>>'", 
                                                           "'<'", "'>'", 
                                                           "'<='", "'>='", 
                                                           "'=='", "'!='", 
                                                           "'==='", "'!=='", 
                                                           "'&'", "'^'", 
                                                           "'|'", "'&&'", 
                                                           "'||'", "'*='", 
                                                           "'/='", "'%='", 
                                                           "'+='", "'-='", 
                                                           "'<<='", "'>>='", 
                                                           "'>>>='", "'&='", 
                                                           "'^='", "'|='", 
                                                           "'null'", null, 
                                                           null, null, null, 
                                                           "'break'", "'do'", 
                                                           "'instanceof'", 
                                                           "'typeof'", "'case'", 
                                                           "'else'", "'new'", 
                                                           "'var'", "'catch'", 
                                                           "'finally'", 
                                                           "'return'", "'void'", 
                                                           "'continue'", 
                                                           "'for'", "'switch'", 
                                                           "'while'", "'debugger'", 
                                                           "'function'", 
                                                           "'this'", "'with'", 
                                                           "'default'", 
                                                           "'if'", "'throw'", 
                                                           "'delete'", "'in'", 
                                                           "'try'", "'class'", 
                                                           "'enum'", "'extends'", 
                                                           "'super'", "'const'", 
                                                           "'export'", "'import'")
        private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, "RegularExpressionLiteral", 
                                                            "LineTerminator", 
                                                            "OpenBracket", 
                                                            "CloseBracket", 
                                                            "OpenParen", 
                                                            "CloseParen", 
                                                            "OpenBrace", 
                                                            "CloseBrace", 
                                                            "SemiColon", 
                                                            "Comma", "Assign", 
                                                            "QuestionMark", 
                                                            "Colon", "Dot", 
                                                            "PlusPlus", 
                                                            "MinusMinus", 
                                                            "Plus", "Minus", 
                                                            "BitNot", "Not", 
                                                            "Multiply", 
                                                            "Divide", "Modulus", 
                                                            "RightShiftArithmetic", 
                                                            "LeftShiftArithmetic", 
                                                            "RightShiftLogical", 
                                                            "LessThan", 
                                                            "MoreThan", 
                                                            "LessThanEquals", 
                                                            "GreaterThanEquals", 
                                                            "Equals_", "NotEquals", 
                                                            "IdentityEquals", 
                                                            "IdentityNotEquals", 
                                                            "BitAnd", "BitXOr", 
                                                            "BitOr", "And", 
                                                            "Or", "MultiplyAssign", 
                                                            "DivideAssign", 
                                                            "ModulusAssign", 
                                                            "PlusAssign", 
                                                            "MinusAssign", 
                                                            "LeftShiftArithmeticAssign", 
                                                            "RightShiftArithmeticAssign", 
                                                            "RightShiftLogicalAssign", 
                                                            "BitAndAssign", 
                                                            "BitXorAssign", 
                                                            "BitOrAssign", 
                                                            "NullLiteral", 
                                                            "BooleanLiteral", 
                                                            "DecimalLiteral", 
                                                            "HexIntegerLiteral", 
                                                            "OctalIntegerLiteral", 
                                                            "Break", "Do", 
                                                            "Instanceof", 
                                                            "Typeof", "Case", 
                                                            "Else", "New", 
                                                            "Var", "Catch", 
                                                            "Finally", "Return", 
                                                            "Void", "Continue", 
                                                            "For", "Switch", 
                                                            "While", "Debugger", 
                                                            "Function", 
                                                            "This", "With", 
                                                            "Default", "If", 
                                                            "Throw", "Delete", 
                                                            "In", "Try", 
                                                            "Class", "Enum", 
                                                            "Extends", "Super", 
                                                            "Const", "Export", 
                                                            "Import", "Implements", 
                                                            "Let", "Private", 
                                                            "Public", "Interface", 
                                                            "Package", "Protected", 
                                                            "Static", "Yield", 
                                                            "Identifier", 
                                                            "StringLiteral", 
                                                            "WhiteSpaces", 
                                                            "MultiLineComment", 
                                                            "SingleLineComment", 
                                                            "HtmlComment", 
                                                            "UnexpectedCharacter")

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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u006a\u0270\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0004\u001c\u0009\u001c\u0004\u001d\u0009\u001d\u0004\u001e\u0009\u001e\u0004\u001f\u0009\u001f\u0004\u0020\u0009\u0020\u0004\u0021\u0009\u0021\u0004\u0022\u0009\u0022\u0004\u0023\u0009\u0023\u0004\u0024\u0009\u0024\u0004\u0025\u0009\u0025\u0004\u0026\u0009\u0026\u0004\u0027\u0009\u0027\u0004\u0028\u0009\u0028\u0004\u0029\u0009\u0029\u0004\u002a\u0009\u002a\u0004\u002b\u0009\u002b\u0004\u002c\u0009\u002c\u0004\u002d\u0009\u002d\u0004\u002e\u0009\u002e\u0004\u002f\u0009\u002f\u0004\u0030\u0009\u0030\u0004\u0031\u0009\u0031\u0004\u0032\u0009\u0032\u0004\u0033\u0009\u0033\u0004\u0034\u0009\u0034\u0004\u0035\u0009\u0035\u0004\u0036\u0009\u0036\u0004\u0037\u0009\u0037\u0004\u0038\u0009\u0038\u0003\u0002\u0005\u0002\u0072\u000a\u0002\u0003\u0002\u0003\u0002\u0003\u0003\u0006\u0003\u0077\u000a\u0003\u000d\u0003\u000e\u0003\u0078\u0003\u0004\u0003\u0004\u0005\u0004\u007d\u000a\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005\u008e\u000a\u0005\u0003\u0006\u0003\u0006\u0005\u0006\u0092\u000a\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0006\u0007\u0097\u000a\u0007\u000d\u0007\u000e\u0007\u0098\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0007\u0009\u00a2\u000a\u0009\u000c\u0009\u000e\u0009\u00a5\u000b\u0009\u0003\u000a\u0003\u000a\u0005\u000a\u00a9\u000a\u000a\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000c\u0003\u000c\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0005\u000e\u00bb\u000a\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0005\u000f\u00ce\u000a\u000f\u0003\u000f\u0003\u000f\u0005\u000f\u00d2\u000a\u000f\u0003\u000f\u0003\u000f\u0005\u000f\u00d6\u000a\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0005\u000f\u00e0\u000a\u000f\u0003\u000f\u0003\u000f\u0005\u000f\u00e4\u000a\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0005\u000f\u00fa\u000a\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0005\u0010\u00ff\u000a\u0010\u0003\u0010\u0003\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0005\u0011\u0106\u000a\u0011\u0003\u0011\u0003\u0011\u0003\u0012\u0003\u0012\u0003\u0012\u0005\u0012\u010d\u000a\u0012\u0003\u0012\u0003\u0012\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0015\u0003\u0015\u0005\u0015\u011f\u000a\u0015\u0003\u0015\u0003\u0015\u0005\u0015\u0123\u000a\u0015\u0005\u0015\u0125\u000a\u0015\u0003\u0015\u0003\u0015\u0003\u0016\u0006\u0016\u012a\u000a\u0016\u000d\u0016\u000e\u0016\u012b\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0005\u0017\u0132\u000a\u0017\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u0137\u000a\u0018\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0005\u001b\u014f\u000a\u001b\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0005\u001f\u0161\u000a\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u0020\u0003\u0020\u0003\u0020\u0007\u0020\u016b\u000a\u0020\u000c\u0020\u000e\u0020\u016e\u000b\u0020\u0003\u0021\u0005\u0021\u0171\u000a\u0021\u0003\u0022\u0003\u0022\u0005\u0022\u0175\u000a\u0022\u0003\u0022\u0005\u0022\u0178\u000a\u0022\u0003\u0022\u0005\u0022\u017b\u000a\u0022\u0003\u0022\u0003\u0022\u0003\u0023\u0005\u0023\u0180\u000a\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0005\u0023\u0185\u000a\u0023\u0003\u0023\u0007\u0023\u0188\u000a\u0023\u000c\u0023\u000e\u0023\u018b\u000b\u0023\u0003\u0024\u0006\u0024\u018e\u000a\u0024\u000d\u0024\u000e\u0024\u018f\u0003\u0025\u0003\u0025\u0005\u0025\u0194\u000a\u0025\u0003\u0025\u0005\u0025\u0197\u000a\u0025\u0003\u0025\u0003\u0025\u0003\u0026\u0003\u0026\u0003\u0026\u0007\u0026\u019e\u000a\u0026\u000c\u0026\u000e\u0026\u01a1\u000b\u0026\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0005\u0027\u01b6\u000a\u0027\u0003\u0028\u0003\u0028\u0003\u0028\u0005\u0028\u01bb\u000a\u0028\u0003\u0029\u0003\u0029\u0003\u002a\u0003\u002a\u0005\u002a\u01c1\u000a\u002a\u0003\u002a\u0003\u002a\u0003\u002b\u0003\u002b\u0003\u002b\u0007\u002b\u01c8\u000a\u002b\u000c\u002b\u000e\u002b\u01cb\u000b\u002b\u0003\u002c\u0003\u002c\u0003\u002c\u0007\u002c\u01d0\u000a\u002c\u000c\u002c\u000e\u002c\u01d3\u000b\u002c\u0003\u002d\u0003\u002d\u0003\u002d\u0005\u002d\u01d8\u000a\u002d\u0003\u002d\u0003\u002d\u0005\u002d\u01dc\u000a\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0005\u002d\u01e6\u000a\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0005\u002d\u0203\u000a\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0007\u002d\u0246\u000a\u002d\u000c\u002d\u000e\u002d\u0249\u000b\u002d\u0003\u002e\u0003\u002e\u0003\u002f\u0003\u002f\u0005\u002f\u024f\u000a\u002f\u0003\u0030\u0003\u0030\u0003\u0031\u0003\u0031\u0005\u0031\u0255\u000a\u0031\u0003\u0032\u0003\u0032\u0003\u0032\u0005\u0032\u025a\u000a\u0032\u0003\u0033\u0003\u0033\u0003\u0034\u0003\u0034\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0036\u0003\u0036\u0003\u0036\u0003\u0036\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0005\u0037\u026c\u000a\u0037\u0003\u0038\u0003\u0038\u0003\u0038\u0002\u0003\u0058\u0039\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0020\u0022\u0024\u0026\u0028\u002a\u002c\u002e\u0030\u0032\u0034\u0036\u0038\u003a\u003c\u003e\u0040\u0042\u0044\u0046\u0048\u004a\u004c\u004e\u0050\u0052\u0054\u0056\u0058\u005a\u005c\u005e\u0060\u0062\u0064\u0066\u0068\u006a\u006c\u006e\u0002\u000d\u0003\u0002\u0017\u0019\u0003\u0002\u0013\u0014\u0003\u0002\u001a\u001c\u0003\u0002\u001d\u0020\u0003\u0002\u0021\u0024\u0003\u0002\u002a\u0034\u0005\u0002\u0003\u0003\u0035\u0036\u0065\u0065\u0003\u0002\u0037\u0039\u0003\u0002\u0035\u0036\u0003\u0002\u003a\u0053\u0003\u0002\u0054\u0063\u0002\u02a5\u0002\u0071\u0003\u0002\u0002\u0002\u0004\u0076\u0003\u0002\u0002\u0002\u0006\u007c\u0003\u0002\u0002\u0002\u0008\u008d\u0003\u0002\u0002\u0002\u000a\u008f\u0003\u0002\u0002\u0002\u000c\u0096\u0003\u0002\u0002\u0002\u000e\u009a\u0003\u0002\u0002\u0002\u0010\u009e\u0003\u0002\u0002\u0002\u0012\u00a6\u0003\u0002\u0002\u0002\u0014\u00aa\u0003\u0002\u0002\u0002\u0016\u00ad\u0003\u0002\u0002\u0002\u0018\u00af\u0003\u0002\u0002\u0002\u001a\u00b3\u0003\u0002\u0002\u0002\u001c\u00f9\u0003\u0002\u0002\u0002\u001e\u00fb\u0003\u0002\u0002\u0002\u0020\u0102\u0003\u0002\u0002\u0002\u0022\u0109\u0003\u0002\u0002\u0002\u0024\u0110\u0003\u0002\u0002\u0002\u0026\u0116\u0003\u0002\u0002\u0002\u0028\u011c\u0003\u0002\u0002\u0002\u002a\u0129\u0003\u0002\u0002\u0002\u002c\u012d\u0003\u0002\u0002\u0002\u002e\u0133\u0003\u0002\u0002\u0002\u0030\u0138\u0003\u0002\u0002\u0002\u0032\u013c\u0003\u0002\u0002\u0002\u0034\u014e\u0003\u0002\u0002\u0002\u0036\u0150\u0003\u0002\u0002\u0002\u0038\u0156\u0003\u0002\u0002\u0002\u003a\u0159\u0003\u0002\u0002\u0002\u003c\u015c\u0003\u0002\u0002\u0002\u003e\u0167\u0003\u0002\u0002\u0002\u0040\u0170\u0003\u0002\u0002\u0002\u0042\u0172\u0003\u0002\u0002\u0002\u0044\u017f\u0003\u0002\u0002\u0002\u0046\u018d\u0003\u0002\u0002\u0002\u0048\u0191\u0003\u0002\u0002\u0002\u004a\u019a\u0003\u0002\u0002\u0002\u004c\u01b5\u0003\u0002\u0002\u0002\u004e\u01ba\u0003\u0002\u0002\u0002\u0050\u01bc\u0003\u0002\u0002\u0002\u0052\u01be\u0003\u0002\u0002\u0002\u0054\u01c4\u0003\u0002\u0002\u0002\u0056\u01cc\u0003\u0002\u0002\u0002\u0058\u0202\u0003\u0002\u0002\u0002\u005a\u024a\u0003\u0002\u0002\u0002\u005c\u024e\u0003\u0002\u0002\u0002\u005e\u0250\u0003\u0002\u0002\u0002\u0060\u0254\u0003\u0002\u0002\u0002\u0062\u0259\u0003\u0002\u0002\u0002\u0064\u025b\u0003\u0002\u0002\u0002\u0066\u025d\u0003\u0002\u0002\u0002\u0068\u025f\u0003\u0002\u0002\u0002\u006a\u0263\u0003\u0002\u0002\u0002\u006c\u026b\u0003\u0002\u0002\u0002\u006e\u026d\u0003\u0002\u0002\u0002\u0070\u0072\u0005\u0004\u0003\u0002\u0071\u0070\u0003\u0002\u0002\u0002\u0071\u0072\u0003\u0002\u0002\u0002\u0072\u0073\u0003\u0002\u0002\u0002\u0073\u0074\u0007\u0002\u0002\u0003\u0074\u0003\u0003\u0002\u0002\u0002\u0075\u0077\u0005\u0006\u0004\u0002\u0076\u0075\u0003\u0002\u0002\u0002\u0077\u0078\u0003\u0002\u0002\u0002\u0078\u0076\u0003\u0002\u0002\u0002\u0078\u0079\u0003\u0002\u0002\u0002\u0079\u0005\u0003\u0002\u0002\u0002\u007a\u007d\u0005\u0008\u0005\u0002\u007b\u007d\u0005\u003c\u001f\u0002\u007c\u007a\u0003\u0002\u0002\u0002\u007c\u007b\u0003\u0002\u0002\u0002\u007d\u0007\u0003\u0002\u0002\u0002\u007e\u008e\u0005\u000a\u0006\u0002\u007f\u008e\u0005\u000e\u0008\u0002\u0080\u008e\u0005\u0016\u000c\u0002\u0081\u008e\u0005\u0018\u000d\u0002\u0082\u008e\u0005\u001a\u000e\u0002\u0083\u008e\u0005\u001c\u000f\u0002\u0084\u008e\u0005\u001e\u0010\u0002\u0085\u008e\u0005\u0020\u0011\u0002\u0086\u008e\u0005\u0022\u0012\u0002\u0087\u008e\u0005\u0024\u0013\u0002\u0088\u008e\u0005\u0030\u0019\u0002\u0089\u008e\u0005\u0026\u0014\u0002\u008a\u008e\u0005\u0032\u001a\u0002\u008b\u008e\u0005\u0034\u001b\u0002\u008c\u008e\u0005\u003a\u001e\u0002\u008d\u007e\u0003\u0002\u0002\u0002\u008d\u007f\u0003\u0002\u0002\u0002\u008d\u0080\u0003\u0002\u0002\u0002\u008d\u0081\u0003\u0002\u0002\u0002\u008d\u0082\u0003\u0002\u0002\u0002\u008d\u0083\u0003\u0002\u0002\u0002\u008d\u0084\u0003\u0002\u0002\u0002\u008d\u0085\u0003\u0002\u0002\u0002\u008d\u0086\u0003\u0002\u0002\u0002\u008d\u0087\u0003\u0002\u0002\u0002\u008d\u0088\u0003\u0002\u0002\u0002\u008d\u0089\u0003\u0002\u0002\u0002\u008d\u008a\u0003\u0002\u0002\u0002\u008d\u008b\u0003\u0002\u0002\u0002\u008d\u008c\u0003\u0002\u0002\u0002\u008e\u0009\u0003\u0002\u0002\u0002\u008f\u0091\u0007\u0009\u0002\u0002\u0090\u0092\u0005\u000c\u0007\u0002\u0091\u0090\u0003\u0002\u0002\u0002\u0091\u0092\u0003\u0002\u0002\u0002\u0092\u0093\u0003\u0002\u0002\u0002\u0093\u0094\u0007\u000a\u0002\u0002\u0094\u000b\u0003\u0002\u0002\u0002\u0095\u0097\u0005\u0008\u0005\u0002\u0096\u0095\u0003\u0002\u0002\u0002\u0097\u0098\u0003\u0002\u0002\u0002\u0098\u0096\u0003\u0002\u0002\u0002\u0098\u0099\u0003\u0002\u0002\u0002\u0099\u000d\u0003\u0002\u0002\u0002\u009a\u009b\u0007\u0041\u0002\u0002\u009b\u009c\u0005\u0010\u0009\u0002\u009c\u009d\u0005\u006c\u0037\u0002\u009d\u000f\u0003\u0002\u0002\u0002\u009e\u00a3\u0005\u0012\u000a\u0002\u009f\u00a0\u0007\u000c\u0002\u0002\u00a0\u00a2\u0005\u0012\u000a\u0002\u00a1\u009f\u0003\u0002\u0002\u0002\u00a2\u00a5\u0003\u0002\u0002\u0002\u00a3\u00a1\u0003\u0002\u0002\u0002\u00a3\u00a4\u0003\u0002\u0002\u0002\u00a4\u0011\u0003\u0002\u0002\u0002\u00a5\u00a3\u0003\u0002\u0002\u0002\u00a6\u00a8\u0007\u0064\u0002\u0002\u00a7\u00a9\u0005\u0014\u000b\u0002\u00a8\u00a7\u0003\u0002\u0002\u0002\u00a8\u00a9\u0003\u0002\u0002\u0002\u00a9\u0013\u0003\u0002\u0002\u0002\u00aa\u00ab\u0007\u000d\u0002\u0002\u00ab\u00ac\u0005\u0058\u002d\u0002\u00ac\u0015\u0003\u0002\u0002\u0002\u00ad\u00ae\u0007\u000b\u0002\u0002\u00ae\u0017\u0003\u0002\u0002\u0002\u00af\u00b0\u0006\u000d\u0002\u0002\u00b0\u00b1\u0005\u0056\u002c\u0002\u00b1\u00b2\u0005\u006c\u0037\u0002\u00b2\u0019\u0003\u0002\u0002\u0002\u00b3\u00b4\u0007\u004f\u0002\u0002\u00b4\u00b5\u0007\u0007\u0002\u0002\u00b5\u00b6\u0005\u0056\u002c\u0002\u00b6\u00b7\u0007\u0008\u0002\u0002\u00b7\u00ba\u0005\u0008\u0005\u0002\u00b8\u00b9\u0007\u003f\u0002\u0002\u00b9\u00bb\u0005\u0008\u0005\u0002\u00ba\u00b8\u0003\u0002\u0002\u0002\u00ba\u00bb\u0003\u0002\u0002\u0002\u00bb\u001b\u0003\u0002\u0002\u0002\u00bc\u00bd\u0007\u003b\u0002\u0002\u00bd\u00be\u0005\u0008\u0005\u0002\u00be\u00bf\u0007\u0049\u0002\u0002\u00bf\u00c0\u0007\u0007\u0002\u0002\u00c0\u00c1\u0005\u0056\u002c\u0002\u00c1\u00c2\u0007\u0008\u0002\u0002\u00c2\u00c3\u0005\u006c\u0037\u0002\u00c3\u00fa\u0003\u0002\u0002\u0002\u00c4\u00c5\u0007\u0049\u0002\u0002\u00c5\u00c6\u0007\u0007\u0002\u0002\u00c6\u00c7\u0005\u0056\u002c\u0002\u00c7\u00c8\u0007\u0008\u0002\u0002\u00c8\u00c9\u0005\u0008\u0005\u0002\u00c9\u00fa\u0003\u0002\u0002\u0002\u00ca\u00cb\u0007\u0047\u0002\u0002\u00cb\u00cd\u0007\u0007\u0002\u0002\u00cc\u00ce\u0005\u0056\u002c\u0002\u00cd\u00cc\u0003\u0002\u0002\u0002\u00cd\u00ce\u0003\u0002\u0002\u0002\u00ce\u00cf\u0003\u0002\u0002\u0002\u00cf\u00d1\u0007\u000b\u0002\u0002\u00d0\u00d2\u0005\u0056\u002c\u0002\u00d1\u00d0\u0003\u0002\u0002\u0002\u00d1\u00d2\u0003\u0002\u0002\u0002\u00d2\u00d3\u0003\u0002\u0002\u0002\u00d3\u00d5\u0007\u000b\u0002\u0002\u00d4\u00d6\u0005\u0056\u002c\u0002\u00d5\u00d4\u0003\u0002\u0002\u0002\u00d5\u00d6\u0003\u0002\u0002\u0002\u00d6\u00d7\u0003\u0002\u0002\u0002\u00d7\u00d8\u0007\u0008\u0002\u0002\u00d8\u00fa\u0005\u0008\u0005\u0002\u00d9\u00da\u0007\u0047\u0002\u0002\u00da\u00db\u0007\u0007\u0002\u0002\u00db\u00dc\u0007\u0041\u0002\u0002\u00dc\u00dd\u0005\u0010\u0009\u0002\u00dd\u00df\u0007\u000b\u0002\u0002\u00de\u00e0\u0005\u0056\u002c\u0002\u00df\u00de\u0003\u0002\u0002\u0002\u00df\u00e0\u0003\u0002\u0002\u0002\u00e0\u00e1\u0003\u0002\u0002\u0002\u00e1\u00e3\u0007\u000b\u0002\u0002\u00e2\u00e4\u0005\u0056\u002c\u0002\u00e3\u00e2\u0003\u0002\u0002\u0002\u00e3\u00e4\u0003\u0002\u0002\u0002\u00e4\u00e5\u0003\u0002\u0002\u0002\u00e5\u00e6\u0007\u0008\u0002\u0002\u00e6\u00e7\u0005\u0008\u0005\u0002\u00e7\u00fa\u0003\u0002\u0002\u0002\u00e8\u00e9\u0007\u0047\u0002\u0002\u00e9\u00ea\u0007\u0007\u0002\u0002\u00ea\u00eb\u0005\u0058\u002d\u0002\u00eb\u00ec\u0007\u0052\u0002\u0002\u00ec\u00ed\u0005\u0056\u002c\u0002\u00ed\u00ee\u0007\u0008\u0002\u0002\u00ee\u00ef\u0005\u0008\u0005\u0002\u00ef\u00fa\u0003\u0002\u0002\u0002\u00f0\u00f1\u0007\u0047\u0002\u0002\u00f1\u00f2\u0007\u0007\u0002\u0002\u00f2\u00f3\u0007\u0041\u0002\u0002\u00f3\u00f4\u0005\u0012\u000a\u0002\u00f4\u00f5\u0007\u0052\u0002\u0002\u00f5\u00f6\u0005\u0056\u002c\u0002\u00f6\u00f7\u0007\u0008\u0002\u0002\u00f7\u00f8\u0005\u0008\u0005\u0002\u00f8\u00fa\u0003\u0002\u0002\u0002\u00f9\u00bc\u0003\u0002\u0002\u0002\u00f9\u00c4\u0003\u0002\u0002\u0002\u00f9\u00ca\u0003\u0002\u0002\u0002\u00f9\u00d9\u0003\u0002\u0002\u0002\u00f9\u00e8\u0003\u0002\u0002\u0002\u00f9\u00f0\u0003\u0002\u0002\u0002\u00fa\u001d\u0003\u0002\u0002\u0002\u00fb\u00fe\u0007\u0046\u0002\u0002\u00fc\u00fd\u0006\u0010\u0003\u0002\u00fd\u00ff\u0007\u0064\u0002\u0002\u00fe\u00fc\u0003\u0002\u0002\u0002\u00fe\u00ff\u0003\u0002\u0002\u0002\u00ff\u0100\u0003\u0002\u0002\u0002\u0100\u0101\u0005\u006c\u0037\u0002\u0101\u001f\u0003\u0002\u0002\u0002\u0102\u0105\u0007\u003a\u0002\u0002\u0103\u0104\u0006\u0011\u0004\u0002\u0104\u0106\u0007\u0064\u0002\u0002\u0105\u0103\u0003\u0002\u0002\u0002\u0105\u0106\u0003\u0002\u0002\u0002\u0106\u0107\u0003\u0002\u0002\u0002\u0107\u0108\u0005\u006c\u0037\u0002\u0108\u0021\u0003\u0002\u0002\u0002\u0109\u010c\u0007\u0044\u0002\u0002\u010a\u010b\u0006\u0012\u0005\u0002\u010b\u010d\u0005\u0056\u002c\u0002\u010c\u010a\u0003\u0002\u0002\u0002\u010c\u010d\u0003\u0002\u0002\u0002\u010d\u010e\u0003\u0002\u0002\u0002\u010e\u010f\u0005\u006c\u0037\u0002\u010f\u0023\u0003\u0002\u0002\u0002\u0110\u0111\u0007\u004d\u0002\u0002\u0111\u0112\u0007\u0007\u0002\u0002\u0112\u0113\u0005\u0056\u002c\u0002\u0113\u0114\u0007\u0008\u0002\u0002\u0114\u0115\u0005\u0008\u0005\u0002\u0115\u0025\u0003\u0002\u0002\u0002\u0116\u0117\u0007\u0048\u0002\u0002\u0117\u0118\u0007\u0007\u0002\u0002\u0118\u0119\u0005\u0056\u002c\u0002\u0119\u011a\u0007\u0008\u0002\u0002\u011a\u011b\u0005\u0028\u0015\u0002\u011b\u0027\u0003\u0002\u0002\u0002\u011c\u011e\u0007\u0009\u0002\u0002\u011d\u011f\u0005\u002a\u0016\u0002\u011e\u011d\u0003\u0002\u0002\u0002\u011e\u011f\u0003\u0002\u0002\u0002\u011f\u0124\u0003\u0002\u0002\u0002\u0120\u0122\u0005\u002e\u0018\u0002\u0121\u0123\u0005\u002a\u0016\u0002\u0122\u0121\u0003\u0002\u0002\u0002\u0122\u0123\u0003\u0002\u0002\u0002\u0123\u0125\u0003\u0002\u0002\u0002\u0124\u0120\u0003\u0002\u0002\u0002\u0124\u0125\u0003\u0002\u0002\u0002\u0125\u0126\u0003\u0002\u0002\u0002\u0126\u0127\u0007\u000a\u0002\u0002\u0127\u0029\u0003\u0002\u0002\u0002\u0128\u012a\u0005\u002c\u0017\u0002\u0129\u0128\u0003\u0002\u0002\u0002\u012a\u012b\u0003\u0002\u0002\u0002\u012b\u0129\u0003\u0002\u0002\u0002\u012b\u012c\u0003\u0002\u0002\u0002\u012c\u002b\u0003\u0002\u0002\u0002\u012d\u012e\u0007\u003e\u0002\u0002\u012e\u012f\u0005\u0056\u002c\u0002\u012f\u0131\u0007\u000f\u0002\u0002\u0130\u0132\u0005\u000c\u0007\u0002\u0131\u0130\u0003\u0002\u0002\u0002\u0131\u0132\u0003\u0002\u0002\u0002\u0132\u002d\u0003\u0002\u0002\u0002\u0133\u0134\u0007\u004e\u0002\u0002\u0134\u0136\u0007\u000f\u0002\u0002\u0135\u0137\u0005\u000c\u0007\u0002\u0136\u0135\u0003\u0002\u0002\u0002\u0136\u0137\u0003\u0002\u0002\u0002\u0137\u002f\u0003\u0002\u0002\u0002\u0138\u0139\u0007\u0064\u0002\u0002\u0139\u013a\u0007\u000f\u0002\u0002\u013a\u013b\u0005\u0008\u0005\u0002\u013b\u0031\u0003\u0002\u0002\u0002\u013c\u013d\u0007\u0050\u0002\u0002\u013d\u013e\u0006\u001a\u0006\u0002\u013e\u013f\u0005\u0056\u002c\u0002\u013f\u0140\u0005\u006c\u0037\u0002\u0140\u0033\u0003\u0002\u0002\u0002\u0141\u0142\u0007\u0053\u0002\u0002\u0142\u0143\u0005\u000a\u0006\u0002\u0143\u0144\u0005\u0036\u001c\u0002\u0144\u014f\u0003\u0002\u0002\u0002\u0145\u0146\u0007\u0053\u0002\u0002\u0146\u0147\u0005\u000a\u0006\u0002\u0147\u0148\u0005\u0038\u001d\u0002\u0148\u014f\u0003\u0002\u0002\u0002\u0149\u014a\u0007\u0053\u0002\u0002\u014a\u014b\u0005\u000a\u0006\u0002\u014b\u014c\u0005\u0036\u001c\u0002\u014c\u014d\u0005\u0038\u001d\u0002\u014d\u014f\u0003\u0002\u0002\u0002\u014e\u0141\u0003\u0002\u0002\u0002\u014e\u0145\u0003\u0002\u0002\u0002\u014e\u0149\u0003\u0002\u0002\u0002\u014f\u0035\u0003\u0002\u0002\u0002\u0150\u0151\u0007\u0042\u0002\u0002\u0151\u0152\u0007\u0007\u0002\u0002\u0152\u0153\u0007\u0064\u0002\u0002\u0153\u0154\u0007\u0008\u0002\u0002\u0154\u0155\u0005\u000a\u0006\u0002\u0155\u0037\u0003\u0002\u0002\u0002\u0156\u0157\u0007\u0043\u0002\u0002\u0157\u0158\u0005\u000a\u0006\u0002\u0158\u0039\u0003\u0002\u0002\u0002\u0159\u015a\u0007\u004a\u0002\u0002\u015a\u015b\u0005\u006c\u0037\u0002\u015b\u003b\u0003\u0002\u0002\u0002\u015c\u015d\u0007\u004b\u0002\u0002\u015d\u015e\u0007\u0064\u0002\u0002\u015e\u0160\u0007\u0007\u0002\u0002\u015f\u0161\u0005\u003e\u0020\u0002\u0160\u015f\u0003\u0002\u0002\u0002\u0160\u0161\u0003\u0002\u0002\u0002\u0161\u0162\u0003\u0002\u0002\u0002\u0162\u0163\u0007\u0008\u0002\u0002\u0163\u0164\u0007\u0009\u0002\u0002\u0164\u0165\u0005\u0040\u0021\u0002\u0165\u0166\u0007\u000a\u0002\u0002\u0166\u003d\u0003\u0002\u0002\u0002\u0167\u016c\u0007\u0064\u0002\u0002\u0168\u0169\u0007\u000c\u0002\u0002\u0169\u016b\u0007\u0064\u0002\u0002\u016a\u0168\u0003\u0002\u0002\u0002\u016b\u016e\u0003\u0002\u0002\u0002\u016c\u016a\u0003\u0002\u0002\u0002\u016c\u016d\u0003\u0002\u0002\u0002\u016d\u003f\u0003\u0002\u0002\u0002\u016e\u016c\u0003\u0002\u0002\u0002\u016f\u0171\u0005\u0004\u0003\u0002\u0170\u016f\u0003\u0002\u0002\u0002\u0170\u0171\u0003\u0002\u0002\u0002\u0171\u0041\u0003\u0002\u0002\u0002\u0172\u0174\u0007\u0005\u0002\u0002\u0173\u0175\u0005\u0044\u0023\u0002\u0174\u0173\u0003\u0002\u0002\u0002\u0174\u0175\u0003\u0002\u0002\u0002\u0175\u0177\u0003\u0002\u0002\u0002\u0176\u0178\u0007\u000c\u0002\u0002\u0177\u0176\u0003\u0002\u0002\u0002\u0177\u0178\u0003\u0002\u0002\u0002\u0178\u017a\u0003\u0002\u0002\u0002\u0179\u017b\u0005\u0046\u0024\u0002\u017a\u0179\u0003\u0002\u0002\u0002\u017a\u017b\u0003\u0002\u0002\u0002\u017b\u017c\u0003\u0002\u0002\u0002\u017c\u017d\u0007\u0006\u0002\u0002\u017d\u0043\u0003\u0002\u0002\u0002\u017e\u0180\u0005\u0046\u0024\u0002\u017f\u017e\u0003\u0002\u0002\u0002\u017f\u0180\u0003\u0002\u0002\u0002\u0180\u0181\u0003\u0002\u0002\u0002\u0181\u0189\u0005\u0058\u002d\u0002\u0182\u0184\u0007\u000c\u0002\u0002\u0183\u0185\u0005\u0046\u0024\u0002\u0184\u0183\u0003\u0002\u0002\u0002\u0184\u0185\u0003\u0002\u0002\u0002\u0185\u0186\u0003\u0002\u0002\u0002\u0186\u0188\u0005\u0058\u002d\u0002\u0187\u0182\u0003\u0002\u0002\u0002\u0188\u018b\u0003\u0002\u0002\u0002\u0189\u0187\u0003\u0002\u0002\u0002\u0189\u018a\u0003\u0002\u0002\u0002\u018a\u0045\u0003\u0002\u0002\u0002\u018b\u0189\u0003\u0002\u0002\u0002\u018c\u018e\u0007\u000c\u0002\u0002\u018d\u018c\u0003\u0002\u0002\u0002\u018e\u018f\u0003\u0002\u0002\u0002\u018f\u018d\u0003\u0002\u0002\u0002\u018f\u0190\u0003\u0002\u0002\u0002\u0190\u0047\u0003\u0002\u0002\u0002\u0191\u0193\u0007\u0009\u0002\u0002\u0192\u0194\u0005\u004a\u0026\u0002\u0193\u0192\u0003\u0002\u0002\u0002\u0193\u0194\u0003\u0002\u0002\u0002\u0194\u0196\u0003\u0002\u0002\u0002\u0195\u0197\u0007\u000c\u0002\u0002\u0196\u0195\u0003\u0002\u0002\u0002\u0196\u0197\u0003\u0002\u0002\u0002\u0197\u0198\u0003\u0002\u0002\u0002\u0198\u0199\u0007\u000a\u0002\u0002\u0199\u0049\u0003\u0002\u0002\u0002\u019a\u019f\u0005\u004c\u0027\u0002\u019b\u019c\u0007\u000c\u0002\u0002\u019c\u019e\u0005\u004c\u0027\u0002\u019d\u019b\u0003\u0002\u0002\u0002\u019e\u01a1\u0003\u0002\u0002\u0002\u019f\u019d\u0003\u0002\u0002\u0002\u019f\u01a0\u0003\u0002\u0002\u0002\u01a0\u004b\u0003\u0002\u0002\u0002\u01a1\u019f\u0003\u0002\u0002\u0002\u01a2\u01a3\u0005\u004e\u0028\u0002\u01a3\u01a4\u0007\u000f\u0002\u0002\u01a4\u01a5\u0005\u0058\u002d\u0002\u01a5\u01b6\u0003\u0002\u0002\u0002\u01a6\u01a7\u0005\u0068\u0035\u0002\u01a7\u01a8\u0007\u0007\u0002\u0002\u01a8\u01a9\u0007\u0008\u0002\u0002\u01a9\u01aa\u0007\u0009\u0002\u0002\u01aa\u01ab\u0005\u0040\u0021\u0002\u01ab\u01ac\u0007\u000a\u0002\u0002\u01ac\u01b6\u0003\u0002\u0002\u0002\u01ad\u01ae\u0005\u006a\u0036\u0002\u01ae\u01af\u0007\u0007\u0002\u0002\u01af\u01b0\u0005\u0050\u0029\u0002\u01b0\u01b1\u0007\u0008\u0002\u0002\u01b1\u01b2\u0007\u0009\u0002\u0002\u01b2\u01b3\u0005\u0040\u0021\u0002\u01b3\u01b4\u0007\u000a\u0002\u0002\u01b4\u01b6\u0003\u0002\u0002\u0002\u01b5\u01a2\u0003\u0002\u0002\u0002\u01b5\u01a6\u0003\u0002\u0002\u0002\u01b5\u01ad\u0003\u0002\u0002\u0002\u01b6\u004d\u0003\u0002\u0002\u0002\u01b7\u01bb\u0005\u0060\u0031\u0002\u01b8\u01bb\u0007\u0065\u0002\u0002\u01b9\u01bb\u0005\u005e\u0030\u0002\u01ba\u01b7\u0003\u0002\u0002\u0002\u01ba\u01b8\u0003\u0002\u0002\u0002\u01ba\u01b9\u0003\u0002\u0002\u0002\u01bb\u004f\u0003\u0002\u0002\u0002\u01bc\u01bd\u0007\u0064\u0002\u0002\u01bd\u0051\u0003\u0002\u0002\u0002\u01be\u01c0\u0007\u0007\u0002\u0002\u01bf\u01c1\u0005\u0054\u002b\u0002\u01c0\u01bf\u0003\u0002\u0002\u0002\u01c0\u01c1\u0003\u0002\u0002\u0002\u01c1\u01c2\u0003\u0002\u0002\u0002\u01c2\u01c3\u0007\u0008\u0002\u0002\u01c3\u0053\u0003\u0002\u0002\u0002\u01c4\u01c9\u0005\u0058\u002d\u0002\u01c5\u01c6\u0007\u000c\u0002\u0002\u01c6\u01c8\u0005\u0058\u002d\u0002\u01c7\u01c5\u0003\u0002\u0002\u0002\u01c8\u01cb\u0003\u0002\u0002\u0002\u01c9\u01c7\u0003\u0002\u0002\u0002\u01c9\u01ca\u0003\u0002\u0002\u0002\u01ca\u0055\u0003\u0002\u0002\u0002\u01cb\u01c9\u0003\u0002\u0002\u0002\u01cc\u01d1\u0005\u0058\u002d\u0002\u01cd\u01ce\u0007\u000c\u0002\u0002\u01ce\u01d0\u0005\u0058\u002d\u0002\u01cf\u01cd\u0003\u0002\u0002\u0002\u01d0\u01d3\u0003\u0002\u0002\u0002\u01d1\u01cf\u0003\u0002\u0002\u0002\u01d1\u01d2\u0003\u0002\u0002\u0002\u01d2\u0057\u0003\u0002\u0002\u0002\u01d3\u01d1\u0003\u0002\u0002\u0002\u01d4\u01d5\u0008\u002d\u0001\u0002\u01d5\u01d7\u0007\u004b\u0002\u0002\u01d6\u01d8\u0007\u0064\u0002\u0002\u01d7\u01d6\u0003\u0002\u0002\u0002\u01d7\u01d8\u0003\u0002\u0002\u0002\u01d8\u01d9\u0003\u0002\u0002\u0002\u01d9\u01db\u0007\u0007\u0002\u0002\u01da\u01dc\u0005\u003e\u0020\u0002\u01db\u01da\u0003\u0002\u0002\u0002\u01db\u01dc\u0003\u0002\u0002\u0002\u01dc\u01dd\u0003\u0002\u0002\u0002\u01dd\u01de\u0007\u0008\u0002\u0002\u01de\u01df\u0007\u0009\u0002\u0002\u01df\u01e0\u0005\u0040\u0021\u0002\u01e0\u01e1\u0007\u000a\u0002\u0002\u01e1\u0203\u0003\u0002\u0002\u0002\u01e2\u01e3\u0007\u0040\u0002\u0002\u01e3\u01e5\u0005\u0058\u002d\u0002\u01e4\u01e6\u0005\u0052\u002a\u0002\u01e5\u01e4\u0003\u0002\u0002\u0002\u01e5\u01e6\u0003\u0002\u0002\u0002\u01e6\u0203\u0003\u0002\u0002\u0002\u01e7\u01e8\u0007\u0051\u0002\u0002\u01e8\u0203\u0005\u0058\u002d\u0020\u01e9\u01ea\u0007\u0045\u0002\u0002\u01ea\u0203\u0005\u0058\u002d\u001f\u01eb\u01ec\u0007\u003d\u0002\u0002\u01ec\u0203\u0005\u0058\u002d\u001e\u01ed\u01ee\u0007\u0011\u0002\u0002\u01ee\u0203\u0005\u0058\u002d\u001d\u01ef\u01f0\u0007\u0012\u0002\u0002\u01f0\u0203\u0005\u0058\u002d\u001c\u01f1\u01f2\u0007\u0013\u0002\u0002\u01f2\u0203\u0005\u0058\u002d\u001b\u01f3\u01f4\u0007\u0014\u0002\u0002\u01f4\u0203\u0005\u0058\u002d\u001a\u01f5\u01f6\u0007\u0015\u0002\u0002\u01f6\u0203\u0005\u0058\u002d\u0019\u01f7\u01f8\u0007\u0016\u0002\u0002\u01f8\u0203\u0005\u0058\u002d\u0018\u01f9\u0203\u0007\u004c\u0002\u0002\u01fa\u0203\u0007\u0064\u0002\u0002\u01fb\u0203\u0005\u005c\u002f\u0002\u01fc\u0203\u0005\u0042\u0022\u0002\u01fd\u0203\u0005\u0048\u0025\u0002\u01fe\u01ff\u0007\u0007\u0002\u0002\u01ff\u0200\u0005\u0056\u002c\u0002\u0200\u0201\u0007\u0008\u0002\u0002\u0201\u0203\u0003\u0002\u0002\u0002\u0202\u01d4\u0003\u0002\u0002\u0002\u0202\u01e2\u0003\u0002\u0002\u0002\u0202\u01e7\u0003\u0002\u0002\u0002\u0202\u01e9\u0003\u0002\u0002\u0002\u0202\u01eb\u0003\u0002\u0002\u0002\u0202\u01ed\u0003\u0002\u0002\u0002\u0202\u01ef\u0003\u0002\u0002\u0002\u0202\u01f1\u0003\u0002\u0002\u0002\u0202\u01f3\u0003\u0002\u0002\u0002\u0202\u01f5\u0003\u0002\u0002\u0002\u0202\u01f7\u0003\u0002\u0002\u0002\u0202\u01f9\u0003\u0002\u0002\u0002\u0202\u01fa\u0003\u0002\u0002\u0002\u0202\u01fb\u0003\u0002\u0002\u0002\u0202\u01fc\u0003\u0002\u0002\u0002\u0202\u01fd\u0003\u0002\u0002\u0002\u0202\u01fe\u0003\u0002\u0002\u0002\u0203\u0247\u0003\u0002\u0002\u0002\u0204\u0205\u000c\u0017\u0002\u0002\u0205\u0206\u0009\u0002\u0002\u0002\u0206\u0246\u0005\u0058\u002d\u0018\u0207\u0208\u000c\u0016\u0002\u0002\u0208\u0209\u0009\u0003\u0002\u0002\u0209\u0246\u0005\u0058\u002d\u0017\u020a\u020b\u000c\u0015\u0002\u0002\u020b\u020c\u0009\u0004\u0002\u0002\u020c\u0246\u0005\u0058\u002d\u0016\u020d\u020e\u000c\u0014\u0002\u0002\u020e\u020f\u0009\u0005\u0002\u0002\u020f\u0246\u0005\u0058\u002d\u0015\u0210\u0211\u000c\u0013\u0002\u0002\u0211\u0212\u0007\u003c\u0002\u0002\u0212\u0246\u0005\u0058\u002d\u0014\u0213\u0214\u000c\u0012\u0002\u0002\u0214\u0215\u0007\u0052\u0002\u0002\u0215\u0246\u0005\u0058\u002d\u0013\u0216\u0217\u000c\u0011\u0002\u0002\u0217\u0218\u0009\u0006\u0002\u0002\u0218\u0246\u0005\u0058\u002d\u0012\u0219\u021a\u000c\u0010\u0002\u0002\u021a\u021b\u0007\u0025\u0002\u0002\u021b\u0246\u0005\u0058\u002d\u0011\u021c\u021d\u000c\u000f\u0002\u0002\u021d\u021e\u0007\u0026\u0002\u0002\u021e\u0246\u0005\u0058\u002d\u0010\u021f\u0220\u000c\u000e\u0002\u0002\u0220\u0221\u0007\u0027\u0002\u0002\u0221\u0246\u0005\u0058\u002d\u000f\u0222\u0223\u000c\u000d\u0002\u0002\u0223\u0224\u0007\u0028\u0002\u0002\u0224\u0246\u0005\u0058\u002d\u000e\u0225\u0226\u000c\u000c\u0002\u0002\u0226\u0227\u0007\u0029\u0002\u0002\u0227\u0246\u0005\u0058\u002d\u000d\u0228\u0229\u000c\u000b\u0002\u0002\u0229\u022a\u0007\u000e\u0002\u0002\u022a\u022b\u0005\u0058\u002d\u0002\u022b\u022c\u0007\u000f\u0002\u0002\u022c\u022d\u0005\u0058\u002d\u000c\u022d\u0246\u0003\u0002\u0002\u0002\u022e\u022f\u000c\u000a\u0002\u0002\u022f\u0230\u0007\u000d\u0002\u0002\u0230\u0246\u0005\u0058\u002d\u000b\u0231\u0232\u000c\u0009\u0002\u0002\u0232\u0233\u0005\u005a\u002e\u0002\u0233\u0234\u0005\u0058\u002d\u000a\u0234\u0246\u0003\u0002\u0002\u0002\u0235\u0236\u000c\u0026\u0002\u0002\u0236\u0237\u0007\u0005\u0002\u0002\u0237\u0238\u0005\u0056\u002c\u0002\u0238\u0239\u0007\u0006\u0002\u0002\u0239\u0246\u0003\u0002\u0002\u0002\u023a\u023b\u000c\u0025\u0002\u0002\u023b\u023c\u0007\u0010\u0002\u0002\u023c\u0246\u0005\u0060\u0031\u0002\u023d\u023e\u000c\u0024\u0002\u0002\u023e\u0246\u0005\u0052\u002a\u0002\u023f\u0240\u000c\u0022\u0002\u0002\u0240\u0241\u0006\u002d\u001a\u0002\u0241\u0246\u0007\u0011\u0002\u0002\u0242\u0243\u000c\u0021\u0002\u0002\u0243\u0244\u0006\u002d\u001c\u0002\u0244\u0246\u0007\u0012\u0002\u0002\u0245\u0204\u0003\u0002\u0002\u0002\u0245\u0207\u0003\u0002\u0002\u0002\u0245\u020a\u0003\u0002\u0002\u0002\u0245\u020d\u0003\u0002\u0002\u0002\u0245\u0210\u0003\u0002\u0002\u0002\u0245\u0213\u0003\u0002\u0002\u0002\u0245\u0216\u0003\u0002\u0002\u0002\u0245\u0219\u0003\u0002\u0002\u0002\u0245\u021c\u0003\u0002\u0002\u0002\u0245\u021f\u0003\u0002\u0002\u0002\u0245\u0222\u0003\u0002\u0002\u0002\u0245\u0225\u0003\u0002\u0002\u0002\u0245\u0228\u0003\u0002\u0002\u0002\u0245\u022e\u0003\u0002\u0002\u0002\u0245\u0231\u0003\u0002\u0002\u0002\u0245\u0235\u0003\u0002\u0002\u0002\u0245\u023a\u0003\u0002\u0002\u0002\u0245\u023d\u0003\u0002\u0002\u0002\u0245\u023f\u0003\u0002\u0002\u0002\u0245\u0242\u0003\u0002\u0002\u0002\u0246\u0249\u0003\u0002\u0002\u0002\u0247\u0245\u0003\u0002\u0002\u0002\u0247\u0248\u0003\u0002\u0002\u0002\u0248\u0059\u0003\u0002\u0002\u0002\u0249\u0247\u0003\u0002\u0002\u0002\u024a\u024b\u0009\u0007\u0002\u0002\u024b\u005b\u0003\u0002\u0002\u0002\u024c\u024f\u0009\u0008\u0002\u0002\u024d\u024f\u0005\u005e\u0030\u0002\u024e\u024c\u0003\u0002\u0002\u0002\u024e\u024d\u0003\u0002\u0002\u0002\u024f\u005d\u0003\u0002\u0002\u0002\u0250\u0251\u0009\u0009\u0002\u0002\u0251\u005f\u0003\u0002\u0002\u0002\u0252\u0255\u0007\u0064\u0002\u0002\u0253\u0255\u0005\u0062\u0032\u0002\u0254\u0252\u0003\u0002\u0002\u0002\u0254\u0253\u0003\u0002\u0002\u0002\u0255\u0061\u0003\u0002\u0002\u0002\u0256\u025a\u0005\u0064\u0033\u0002\u0257\u025a\u0005\u0066\u0034\u0002\u0258\u025a\u0009\u000a\u0002\u0002\u0259\u0256\u0003\u0002\u0002\u0002\u0259\u0257\u0003\u0002\u0002\u0002\u0259\u0258\u0003\u0002\u0002\u0002\u025a\u0063\u0003\u0002\u0002\u0002\u025b\u025c\u0009\u000b\u0002\u0002\u025c\u0065\u0003\u0002\u0002\u0002\u025d\u025e\u0009\u000c\u0002\u0002\u025e\u0067\u0003\u0002\u0002\u0002\u025f\u0260\u0006\u0035\u001d\u0002\u0260\u0261\u0007\u0064\u0002\u0002\u0261\u0262\u0005\u004e\u0028\u0002\u0262\u0069\u0003\u0002\u0002\u0002\u0263\u0264\u0006\u0036\u001e\u0002\u0264\u0265\u0007\u0064\u0002\u0002\u0265\u0266\u0005\u004e\u0028\u0002\u0266\u006b\u0003\u0002\u0002\u0002\u0267\u026c\u0007\u000b\u0002\u0002\u0268\u026c\u0007\u0002\u0002\u0003\u0269\u026c\u0006\u0037\u001f\u0002\u026a\u026c\u0006\u0037\u0020\u0002\u026b\u0267\u0003\u0002\u0002\u0002\u026b\u0268\u0003\u0002\u0002\u0002\u026b\u0269\u0003\u0002\u0002\u0002\u026b\u026a\u0003\u0002\u0002\u0002\u026c\u006d\u0003\u0002\u0002\u0002\u026d\u026e\u0007\u0002\u0002\u0003\u026e\u006f\u0003\u0002\u0002\u0002\u0037\u0071\u0078\u007c\u008d\u0091\u0098\u00a3\u00a8\u00ba\u00cd\u00d1\u00d5\u00df\u00e3\u00f9\u00fe\u0105\u010c\u011e\u0122\u0124\u012b\u0131\u0136\u014e\u0160\u016c\u0170\u0174\u0177\u017a\u017f\u0184\u0189\u018f\u0193\u0196\u019f\u01b5\u01ba\u01c0\u01c9\u01d1\u01d7\u01db\u01e5\u0202\u0245\u0247\u024e\u0254\u0259\u026b"

        val ATN = ATNDeserializer().deserialize(serializedATN.toCharArray())
        init {
        	decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
        		DFA(ATN.getDecisionState(it)!!, it)
        	})


        }
	}

    private val RegularExpressionLiteral = Tokens.RegularExpressionLiteral.id
    private val LineTerminator = Tokens.LineTerminator.id
    private val OpenBracket = Tokens.OpenBracket.id
    private val CloseBracket = Tokens.CloseBracket.id
    private val OpenParen = Tokens.OpenParen.id
    private val CloseParen = Tokens.CloseParen.id
    private val OpenBrace = Tokens.OpenBrace.id
    private val CloseBrace = Tokens.CloseBrace.id
    private val SemiColon = Tokens.SemiColon.id
    private val Comma = Tokens.Comma.id
    private val Assign = Tokens.Assign.id
    private val QuestionMark = Tokens.QuestionMark.id
    private val Colon = Tokens.Colon.id
    private val Dot = Tokens.Dot.id
    private val PlusPlus = Tokens.PlusPlus.id
    private val MinusMinus = Tokens.MinusMinus.id
    private val Plus = Tokens.Plus.id
    private val Minus = Tokens.Minus.id
    private val BitNot = Tokens.BitNot.id
    private val Not = Tokens.Not.id
    private val Multiply = Tokens.Multiply.id
    private val Divide = Tokens.Divide.id
    private val Modulus = Tokens.Modulus.id
    private val RightShiftArithmetic = Tokens.RightShiftArithmetic.id
    private val LeftShiftArithmetic = Tokens.LeftShiftArithmetic.id
    private val RightShiftLogical = Tokens.RightShiftLogical.id
    private val LessThan = Tokens.LessThan.id
    private val MoreThan = Tokens.MoreThan.id
    private val LessThanEquals = Tokens.LessThanEquals.id
    private val GreaterThanEquals = Tokens.GreaterThanEquals.id
    private val Equals_ = Tokens.Equals_.id
    private val NotEquals = Tokens.NotEquals.id
    private val IdentityEquals = Tokens.IdentityEquals.id
    private val IdentityNotEquals = Tokens.IdentityNotEquals.id
    private val BitAnd = Tokens.BitAnd.id
    private val BitXOr = Tokens.BitXOr.id
    private val BitOr = Tokens.BitOr.id
    private val And = Tokens.And.id
    private val Or = Tokens.Or.id
    private val MultiplyAssign = Tokens.MultiplyAssign.id
    private val DivideAssign = Tokens.DivideAssign.id
    private val ModulusAssign = Tokens.ModulusAssign.id
    private val PlusAssign = Tokens.PlusAssign.id
    private val MinusAssign = Tokens.MinusAssign.id
    private val LeftShiftArithmeticAssign = Tokens.LeftShiftArithmeticAssign.id
    private val RightShiftArithmeticAssign = Tokens.RightShiftArithmeticAssign.id
    private val RightShiftLogicalAssign = Tokens.RightShiftLogicalAssign.id
    private val BitAndAssign = Tokens.BitAndAssign.id
    private val BitXorAssign = Tokens.BitXorAssign.id
    private val BitOrAssign = Tokens.BitOrAssign.id
    private val NullLiteral = Tokens.NullLiteral.id
    private val BooleanLiteral = Tokens.BooleanLiteral.id
    private val DecimalLiteral = Tokens.DecimalLiteral.id
    private val HexIntegerLiteral = Tokens.HexIntegerLiteral.id
    private val OctalIntegerLiteral = Tokens.OctalIntegerLiteral.id
    private val Break = Tokens.Break.id
    private val Do = Tokens.Do.id
    private val Instanceof = Tokens.Instanceof.id
    private val Typeof = Tokens.Typeof.id
    private val Case = Tokens.Case.id
    private val Else = Tokens.Else.id
    private val New = Tokens.New.id
    private val Var = Tokens.Var.id
    private val Catch = Tokens.Catch.id
    private val Finally = Tokens.Finally.id
    private val Return = Tokens.Return.id
    private val Void = Tokens.Void.id
    private val Continue = Tokens.Continue.id
    private val For = Tokens.For.id
    private val Switch = Tokens.Switch.id
    private val While = Tokens.While.id
    private val Debugger = Tokens.Debugger.id
    private val Function = Tokens.Function.id
    private val This = Tokens.This.id
    private val With = Tokens.With.id
    private val Default = Tokens.Default.id
    private val If = Tokens.If.id
    private val Throw = Tokens.Throw.id
    private val Delete = Tokens.Delete.id
    private val In = Tokens.In.id
    private val Try = Tokens.Try.id
    private val Class = Tokens.Class.id
    private val Enum = Tokens.Enum.id
    private val Extends = Tokens.Extends.id
    private val Super = Tokens.Super.id
    private val Const = Tokens.Const.id
    private val Export = Tokens.Export.id
    private val Import = Tokens.Import.id
    private val Implements = Tokens.Implements.id
    private val Let = Tokens.Let.id
    private val Private = Tokens.Private.id
    private val Public = Tokens.Public.id
    private val Interface = Tokens.Interface.id
    private val Package = Tokens.Package.id
    private val Protected = Tokens.Protected.id
    private val Static = Tokens.Static.id
    private val Yield = Tokens.Yield.id
    private val Identifier = Tokens.Identifier.id
    private val StringLiteral = Tokens.StringLiteral.id
    private val WhiteSpaces = Tokens.WhiteSpaces.id
    private val MultiLineComment = Tokens.MultiLineComment.id
    private val SingleLineComment = Tokens.SingleLineComment.id
    private val HtmlComment = Tokens.HtmlComment.id
    private val UnexpectedCharacter = Tokens.UnexpectedCharacter.id

    /* Named actions */

	  
	    ///<summary>Returns <c>true</c> iff on the current index of the parser's
	    ///token stream a token of the given <c>type</c> exists on the
	    ///<c>Hidden</c> channel.</summary>
	    ///<param name="type">the type of the token on the <c>Hidden</c> channel
	    ///to check.</param>
	    ///<returns><c>true</c> iff on the current index of the parser's
	    ///token stream a token of the given <c>type</c> exists on the
	    ///<c>Hidden</c> channel.</returns>
	    private bool here(int type) {

	        // Get the token ahead of the current index.
	        int possibleIndexEosToken = this.CurrentToken.TokenIndex - 1;
	        IToken ahead = _input.Get(possibleIndexEosToken);

	        // Check if the token resides on the Hidden channel and if it's of the
	        // provided type.
	        return (ahead.Channel == Lexer.Hidden) && (ahead.Type == type);
	    }

	    ///<summary>Returns <c>true</c> iff on the current index of the parser's
	    ///token stream a token exists on the <c>Hidden</c> channel which
	    ///either is a line terminator, or is a multi line comment that
	    ///contains a line terminator.</summary>
	    ///<returns><c>true</c> iff on the current index of the parser's
	    ///token stream a token exists on the <c>Hidden</c> channel which
	    ///either is a line terminator, or is a multi line comment that
	    ///contains a line terminator.</returns>
	    private bool lineTerminatorAhead() {

	        // Get the token ahead of the current index.
	        int possibleIndexEosToken = this.CurrentToken.TokenIndex - 1;
	        IToken ahead = _input.Get(possibleIndexEosToken);

	        if (ahead.Channel != Lexer.Hidden) {
	            // We're only interested in tokens on the Hidden channel.
	            return false;
	        }

	        if (ahead.Type == LineTerminator) {
	            // There is definitely a line terminator ahead.
	            return true;
	        }

	        if (ahead.Type == WhiteSpaces) {
	            // Get the token ahead of the current whitespaces.
	            possibleIndexEosToken = this.CurrentToken.TokenIndex - 2;
	            ahead = _input.Get(possibleIndexEosToken);
	        }

	        // Get the token's text and type.
	        string text = ahead.Text;
	        int type = ahead.Type;

	        // Check if the token is, or contains a line terminator.
	        return (type == MultiLineComment && (text.Contains("\r") || text.Contains("\n"))) ||
	                (type == LineTerminator);
	    }                                

	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class ProgramContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_program.id
	        set(value) { throw RuntimeException() }
		fun EOF() : TerminalNode? = getToken(ECMAScriptParser.Tokens.EOF.id, 0)
		fun findSourceElements() : SourceElementsContext? = getRuleContext(solver.getType("SourceElementsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterProgram(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitProgram(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitProgram(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  program() : ProgramContext {
		var _localctx : ProgramContext = ProgramContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_program.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 111
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,0,context) ) {
			1   -> if (true){
			this.state = 110
			sourceElements()
			}
			}
			this.state = 113
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

	open class SourceElementsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_sourceElements.id
	        set(value) { throw RuntimeException() }
		fun findSourceElement() : List<SourceElementContext> = getRuleContexts(solver.getType("SourceElementContext"))
		fun findSourceElement(i: Int) : SourceElementContext? = getRuleContext(solver.getType("SourceElementContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterSourceElements(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitSourceElements(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitSourceElements(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  sourceElements() : SourceElementsContext {
		var _localctx : SourceElementsContext = SourceElementsContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_sourceElements.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 116 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				if (true){
				this.state = 115
				sourceElement()
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 118 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,1,context)
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

	open class SourceElementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_sourceElement.id
	        set(value) { throw RuntimeException() }
		fun findStatement() : StatementContext? = getRuleContext(solver.getType("StatementContext"),0)
		fun findFunctionDeclaration() : FunctionDeclarationContext? = getRuleContext(solver.getType("FunctionDeclarationContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterSourceElement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitSourceElement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitSourceElement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  sourceElement() : SourceElementContext {
		var _localctx : SourceElementContext = SourceElementContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_sourceElement.id)
		try {
			this.state = 122
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,2,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 120
			statement()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 121
			functionDeclaration()
			}}
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
		fun findBlock() : BlockContext? = getRuleContext(solver.getType("BlockContext"),0)
		fun findVariableStatement() : VariableStatementContext? = getRuleContext(solver.getType("VariableStatementContext"),0)
		fun findEmptyStatement() : EmptyStatementContext? = getRuleContext(solver.getType("EmptyStatementContext"),0)
		fun findExpressionStatement() : ExpressionStatementContext? = getRuleContext(solver.getType("ExpressionStatementContext"),0)
		fun findIfStatement() : IfStatementContext? = getRuleContext(solver.getType("IfStatementContext"),0)
		fun findIterationStatement() : IterationStatementContext? = getRuleContext(solver.getType("IterationStatementContext"),0)
		fun findContinueStatement() : ContinueStatementContext? = getRuleContext(solver.getType("ContinueStatementContext"),0)
		fun findBreakStatement() : BreakStatementContext? = getRuleContext(solver.getType("BreakStatementContext"),0)
		fun findReturnStatement() : ReturnStatementContext? = getRuleContext(solver.getType("ReturnStatementContext"),0)
		fun findWithStatement() : WithStatementContext? = getRuleContext(solver.getType("WithStatementContext"),0)
		fun findLabelledStatement() : LabelledStatementContext? = getRuleContext(solver.getType("LabelledStatementContext"),0)
		fun findSwitchStatement() : SwitchStatementContext? = getRuleContext(solver.getType("SwitchStatementContext"),0)
		fun findThrowStatement() : ThrowStatementContext? = getRuleContext(solver.getType("ThrowStatementContext"),0)
		fun findTryStatement() : TryStatementContext? = getRuleContext(solver.getType("TryStatementContext"),0)
		fun findDebuggerStatement() : DebuggerStatementContext? = getRuleContext(solver.getType("DebuggerStatementContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitStatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  statement() : StatementContext {
		var _localctx : StatementContext = StatementContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_statement.id)
		try {
			this.state = 139
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,3,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 124
			block()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 125
			variableStatement()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 126
			emptyStatement()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 127
			expressionStatement()
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 128
			ifStatement()
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 129
			iterationStatement()
			}}
			7 -> {
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 130
			continueStatement()
			}}
			8 -> {
			enterOuterAlt(_localctx, 8)
			if (true){
			this.state = 131
			breakStatement()
			}}
			9 -> {
			enterOuterAlt(_localctx, 9)
			if (true){
			this.state = 132
			returnStatement()
			}}
			10 -> {
			enterOuterAlt(_localctx, 10)
			if (true){
			this.state = 133
			withStatement()
			}}
			11 -> {
			enterOuterAlt(_localctx, 11)
			if (true){
			this.state = 134
			labelledStatement()
			}}
			12 -> {
			enterOuterAlt(_localctx, 12)
			if (true){
			this.state = 135
			switchStatement()
			}}
			13 -> {
			enterOuterAlt(_localctx, 13)
			if (true){
			this.state = 136
			throwStatement()
			}}
			14 -> {
			enterOuterAlt(_localctx, 14)
			if (true){
			this.state = 137
			tryStatement()
			}}
			15 -> {
			enterOuterAlt(_localctx, 15)
			if (true){
			this.state = 138
			debuggerStatement()
			}}
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

	open class BlockContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_block.id
	        set(value) { throw RuntimeException() }
		fun findStatementList() : StatementListContext? = getRuleContext(solver.getType("StatementListContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterBlock(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitBlock(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitBlock(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  block() : BlockContext {
		var _localctx : BlockContext = BlockContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_block.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 141
			match(OpenBrace) as Token
			this.state = 143
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,4,context) ) {
			1   -> if (true){
			this.state = 142
			statementList()
			}
			}
			this.state = 145
			match(CloseBrace) as Token
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

	open class StatementListContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_statementList.id
	        set(value) { throw RuntimeException() }
		fun findStatement() : List<StatementContext> = getRuleContexts(solver.getType("StatementContext"))
		fun findStatement(i: Int) : StatementContext? = getRuleContext(solver.getType("StatementContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterStatementList(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitStatementList(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitStatementList(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  statementList() : StatementListContext {
		var _localctx : StatementListContext = StatementListContext(context, state)
		enterRule(_localctx, 10, Rules.RULE_statementList.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 148 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				if (true){
				this.state = 147
				statement()
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 150 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,5,context)
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

	open class VariableStatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_variableStatement.id
	        set(value) { throw RuntimeException() }
		fun Var() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Var.id, 0)
		fun findVariableDeclarationList() : VariableDeclarationListContext? = getRuleContext(solver.getType("VariableDeclarationListContext"),0)
		fun findEos() : EosContext? = getRuleContext(solver.getType("EosContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterVariableStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitVariableStatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitVariableStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  variableStatement() : VariableStatementContext {
		var _localctx : VariableStatementContext = VariableStatementContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_variableStatement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 152
			match(Var) as Token
			this.state = 153
			variableDeclarationList()
			this.state = 154
			eos()
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

	open class VariableDeclarationListContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_variableDeclarationList.id
	        set(value) { throw RuntimeException() }
		fun findVariableDeclaration() : List<VariableDeclarationContext> = getRuleContexts(solver.getType("VariableDeclarationContext"))
		fun findVariableDeclaration(i: Int) : VariableDeclarationContext? = getRuleContext(solver.getType("VariableDeclarationContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterVariableDeclarationList(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitVariableDeclarationList(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitVariableDeclarationList(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  variableDeclarationList() : VariableDeclarationListContext {
		var _localctx : VariableDeclarationListContext = VariableDeclarationListContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_variableDeclarationList.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 156
			variableDeclaration()
			this.state = 161
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,6,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 157
					match(Comma) as Token
					this.state = 158
					variableDeclaration()
					}
					} 
				}
				this.state = 163
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,6,context)
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

	open class VariableDeclarationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_variableDeclaration.id
	        set(value) { throw RuntimeException() }
		fun Identifier() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Identifier.id, 0)
		fun findInitialiser() : InitialiserContext? = getRuleContext(solver.getType("InitialiserContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterVariableDeclaration(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitVariableDeclaration(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitVariableDeclaration(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  variableDeclaration() : VariableDeclarationContext {
		var _localctx : VariableDeclarationContext = VariableDeclarationContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_variableDeclaration.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 164
			match(Identifier) as Token
			this.state = 166
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,7,context) ) {
			1   -> if (true){
			this.state = 165
			initialiser()
			}
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

	open class InitialiserContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_initialiser.id
	        set(value) { throw RuntimeException() }
		fun findSingleExpression() : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterInitialiser(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitInitialiser(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitInitialiser(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  initialiser() : InitialiserContext {
		var _localctx : InitialiserContext = InitialiserContext(context, state)
		enterRule(_localctx, 18, Rules.RULE_initialiser.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 168
			match(Assign) as Token
			this.state = 169
			singleExpression(0)
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

	open class EmptyStatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_emptyStatement.id
	        set(value) { throw RuntimeException() }
		fun SemiColon() : TerminalNode? = getToken(ECMAScriptParser.Tokens.SemiColon.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterEmptyStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitEmptyStatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitEmptyStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  emptyStatement() : EmptyStatementContext {
		var _localctx : EmptyStatementContext = EmptyStatementContext(context, state)
		enterRule(_localctx, 20, Rules.RULE_emptyStatement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 171
			match(SemiColon) as Token
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

	open class ExpressionStatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_expressionStatement.id
	        set(value) { throw RuntimeException() }
		fun findExpressionSequence() : ExpressionSequenceContext? = getRuleContext(solver.getType("ExpressionSequenceContext"),0)
		fun findEos() : EosContext? = getRuleContext(solver.getType("EosContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterExpressionStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitExpressionStatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitExpressionStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  expressionStatement() : ExpressionStatementContext {
		var _localctx : ExpressionStatementContext = ExpressionStatementContext(context, state)
		enterRule(_localctx, 22, Rules.RULE_expressionStatement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 173
			if (!((_input.La(1) != OpenBrace) && (_input.La(1) != Function))) throw FailedPredicateException(this, "(_input.La(1) != OpenBrace) && (_input.La(1) != Function)")
			this.state = 174
			expressionSequence()
			this.state = 175
			eos()
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

	open class IfStatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_ifStatement.id
	        set(value) { throw RuntimeException() }
		fun If() : TerminalNode? = getToken(ECMAScriptParser.Tokens.If.id, 0)
		fun findExpressionSequence() : ExpressionSequenceContext? = getRuleContext(solver.getType("ExpressionSequenceContext"),0)
		fun findStatement() : List<StatementContext> = getRuleContexts(solver.getType("StatementContext"))
		fun findStatement(i: Int) : StatementContext? = getRuleContext(solver.getType("StatementContext"),i)
		fun Else() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Else.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterIfStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitIfStatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitIfStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  ifStatement() : IfStatementContext {
		var _localctx : IfStatementContext = IfStatementContext(context, state)
		enterRule(_localctx, 24, Rules.RULE_ifStatement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 177
			match(If) as Token
			this.state = 178
			match(OpenParen) as Token
			this.state = 179
			expressionSequence()
			this.state = 180
			match(CloseParen) as Token
			this.state = 181
			statement()
			this.state = 184
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,8,context) ) {
			1   -> if (true){
			this.state = 182
			match(Else) as Token
			this.state = 183
			statement()
			}
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

	open class IterationStatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_iterationStatement.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	 
		constructor() : super() { }
		fun copyFrom(ctx: IterationStatementContext) {
			super.copyFrom(ctx)
		}
	}
	open class DoStatementContext : IterationStatementContext {
		fun Do() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Do.id, 0)
		fun findStatement() : StatementContext? = getRuleContext(solver.getType("StatementContext"),0)
		fun While() : TerminalNode? = getToken(ECMAScriptParser.Tokens.While.id, 0)
		fun findExpressionSequence() : ExpressionSequenceContext? = getRuleContext(solver.getType("ExpressionSequenceContext"),0)
		fun findEos() : EosContext? = getRuleContext(solver.getType("EosContext"),0)
		constructor(ctx: IterationStatementContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterDoStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitDoStatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitDoStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class ForVarStatementContext : IterationStatementContext {
		fun For() : TerminalNode? = getToken(ECMAScriptParser.Tokens.For.id, 0)
		fun Var() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Var.id, 0)
		fun findVariableDeclarationList() : VariableDeclarationListContext? = getRuleContext(solver.getType("VariableDeclarationListContext"),0)
		fun findStatement() : StatementContext? = getRuleContext(solver.getType("StatementContext"),0)
		fun findExpressionSequence() : List<ExpressionSequenceContext> = getRuleContexts(solver.getType("ExpressionSequenceContext"))
		fun findExpressionSequence(i: Int) : ExpressionSequenceContext? = getRuleContext(solver.getType("ExpressionSequenceContext"),i)
		constructor(ctx: IterationStatementContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterForVarStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitForVarStatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitForVarStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class ForVarInStatementContext : IterationStatementContext {
		fun For() : TerminalNode? = getToken(ECMAScriptParser.Tokens.For.id, 0)
		fun Var() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Var.id, 0)
		fun findVariableDeclaration() : VariableDeclarationContext? = getRuleContext(solver.getType("VariableDeclarationContext"),0)
		fun In() : TerminalNode? = getToken(ECMAScriptParser.Tokens.In.id, 0)
		fun findExpressionSequence() : ExpressionSequenceContext? = getRuleContext(solver.getType("ExpressionSequenceContext"),0)
		fun findStatement() : StatementContext? = getRuleContext(solver.getType("StatementContext"),0)
		constructor(ctx: IterationStatementContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterForVarInStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitForVarInStatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitForVarInStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class WhileStatementContext : IterationStatementContext {
		fun While() : TerminalNode? = getToken(ECMAScriptParser.Tokens.While.id, 0)
		fun findExpressionSequence() : ExpressionSequenceContext? = getRuleContext(solver.getType("ExpressionSequenceContext"),0)
		fun findStatement() : StatementContext? = getRuleContext(solver.getType("StatementContext"),0)
		constructor(ctx: IterationStatementContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterWhileStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitWhileStatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitWhileStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class ForStatementContext : IterationStatementContext {
		fun For() : TerminalNode? = getToken(ECMAScriptParser.Tokens.For.id, 0)
		fun findStatement() : StatementContext? = getRuleContext(solver.getType("StatementContext"),0)
		fun findExpressionSequence() : List<ExpressionSequenceContext> = getRuleContexts(solver.getType("ExpressionSequenceContext"))
		fun findExpressionSequence(i: Int) : ExpressionSequenceContext? = getRuleContext(solver.getType("ExpressionSequenceContext"),i)
		constructor(ctx: IterationStatementContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterForStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitForStatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitForStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class ForInStatementContext : IterationStatementContext {
		fun For() : TerminalNode? = getToken(ECMAScriptParser.Tokens.For.id, 0)
		fun findSingleExpression() : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),0)
		fun In() : TerminalNode? = getToken(ECMAScriptParser.Tokens.In.id, 0)
		fun findExpressionSequence() : ExpressionSequenceContext? = getRuleContext(solver.getType("ExpressionSequenceContext"),0)
		fun findStatement() : StatementContext? = getRuleContext(solver.getType("StatementContext"),0)
		constructor(ctx: IterationStatementContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterForInStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitForInStatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitForInStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  iterationStatement() : IterationStatementContext {
		var _localctx : IterationStatementContext = IterationStatementContext(context, state)
		enterRule(_localctx, 26, Rules.RULE_iterationStatement.id)
		var _la: Int
		try {
			this.state = 247
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,14,context) ) {
			1 -> {_localctx = DoStatementContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 186
			match(Do) as Token
			this.state = 187
			statement()
			this.state = 188
			match(While) as Token
			this.state = 189
			match(OpenParen) as Token
			this.state = 190
			expressionSequence()
			this.state = 191
			match(CloseParen) as Token
			this.state = 192
			eos()
			}}
			2 -> {_localctx = WhileStatementContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 194
			match(While) as Token
			this.state = 195
			match(OpenParen) as Token
			this.state = 196
			expressionSequence()
			this.state = 197
			match(CloseParen) as Token
			this.state = 198
			statement()
			}}
			3 -> {_localctx = ForStatementContext(_localctx)
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 200
			match(For) as Token
			this.state = 201
			match(OpenParen) as Token
			this.state = 203
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl RegularExpressionLiteral) or (1L shl OpenBracket) or (1L shl OpenParen) or (1L shl OpenBrace) or (1L shl PlusPlus) or (1L shl MinusMinus) or (1L shl Plus) or (1L shl Minus) or (1L shl BitNot) or (1L shl Not) or (1L shl NullLiteral) or (1L shl BooleanLiteral) or (1L shl DecimalLiteral) or (1L shl HexIntegerLiteral) or (1L shl OctalIntegerLiteral) or (1L shl Typeof) or (1L shl New))) != 0L) || ((((_la - 67)) and 0x3f.inv()) == 0 && ((1L shl (_la - 67)) and ((1L shl (Void - 67)) or (1L shl (Function - 67)) or (1L shl (This - 67)) or (1L shl (Delete - 67)) or (1L shl (Identifier - 67)) or (1L shl (StringLiteral - 67)))) != 0L)) {
				if (true){
				this.state = 202
				expressionSequence()
				}
			}

			this.state = 205
			match(SemiColon) as Token
			this.state = 207
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl RegularExpressionLiteral) or (1L shl OpenBracket) or (1L shl OpenParen) or (1L shl OpenBrace) or (1L shl PlusPlus) or (1L shl MinusMinus) or (1L shl Plus) or (1L shl Minus) or (1L shl BitNot) or (1L shl Not) or (1L shl NullLiteral) or (1L shl BooleanLiteral) or (1L shl DecimalLiteral) or (1L shl HexIntegerLiteral) or (1L shl OctalIntegerLiteral) or (1L shl Typeof) or (1L shl New))) != 0L) || ((((_la - 67)) and 0x3f.inv()) == 0 && ((1L shl (_la - 67)) and ((1L shl (Void - 67)) or (1L shl (Function - 67)) or (1L shl (This - 67)) or (1L shl (Delete - 67)) or (1L shl (Identifier - 67)) or (1L shl (StringLiteral - 67)))) != 0L)) {
				if (true){
				this.state = 206
				expressionSequence()
				}
			}

			this.state = 209
			match(SemiColon) as Token
			this.state = 211
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl RegularExpressionLiteral) or (1L shl OpenBracket) or (1L shl OpenParen) or (1L shl OpenBrace) or (1L shl PlusPlus) or (1L shl MinusMinus) or (1L shl Plus) or (1L shl Minus) or (1L shl BitNot) or (1L shl Not) or (1L shl NullLiteral) or (1L shl BooleanLiteral) or (1L shl DecimalLiteral) or (1L shl HexIntegerLiteral) or (1L shl OctalIntegerLiteral) or (1L shl Typeof) or (1L shl New))) != 0L) || ((((_la - 67)) and 0x3f.inv()) == 0 && ((1L shl (_la - 67)) and ((1L shl (Void - 67)) or (1L shl (Function - 67)) or (1L shl (This - 67)) or (1L shl (Delete - 67)) or (1L shl (Identifier - 67)) or (1L shl (StringLiteral - 67)))) != 0L)) {
				if (true){
				this.state = 210
				expressionSequence()
				}
			}

			this.state = 213
			match(CloseParen) as Token
			this.state = 214
			statement()
			}}
			4 -> {_localctx = ForVarStatementContext(_localctx)
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 215
			match(For) as Token
			this.state = 216
			match(OpenParen) as Token
			this.state = 217
			match(Var) as Token
			this.state = 218
			variableDeclarationList()
			this.state = 219
			match(SemiColon) as Token
			this.state = 221
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl RegularExpressionLiteral) or (1L shl OpenBracket) or (1L shl OpenParen) or (1L shl OpenBrace) or (1L shl PlusPlus) or (1L shl MinusMinus) or (1L shl Plus) or (1L shl Minus) or (1L shl BitNot) or (1L shl Not) or (1L shl NullLiteral) or (1L shl BooleanLiteral) or (1L shl DecimalLiteral) or (1L shl HexIntegerLiteral) or (1L shl OctalIntegerLiteral) or (1L shl Typeof) or (1L shl New))) != 0L) || ((((_la - 67)) and 0x3f.inv()) == 0 && ((1L shl (_la - 67)) and ((1L shl (Void - 67)) or (1L shl (Function - 67)) or (1L shl (This - 67)) or (1L shl (Delete - 67)) or (1L shl (Identifier - 67)) or (1L shl (StringLiteral - 67)))) != 0L)) {
				if (true){
				this.state = 220
				expressionSequence()
				}
			}

			this.state = 223
			match(SemiColon) as Token
			this.state = 225
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl RegularExpressionLiteral) or (1L shl OpenBracket) or (1L shl OpenParen) or (1L shl OpenBrace) or (1L shl PlusPlus) or (1L shl MinusMinus) or (1L shl Plus) or (1L shl Minus) or (1L shl BitNot) or (1L shl Not) or (1L shl NullLiteral) or (1L shl BooleanLiteral) or (1L shl DecimalLiteral) or (1L shl HexIntegerLiteral) or (1L shl OctalIntegerLiteral) or (1L shl Typeof) or (1L shl New))) != 0L) || ((((_la - 67)) and 0x3f.inv()) == 0 && ((1L shl (_la - 67)) and ((1L shl (Void - 67)) or (1L shl (Function - 67)) or (1L shl (This - 67)) or (1L shl (Delete - 67)) or (1L shl (Identifier - 67)) or (1L shl (StringLiteral - 67)))) != 0L)) {
				if (true){
				this.state = 224
				expressionSequence()
				}
			}

			this.state = 227
			match(CloseParen) as Token
			this.state = 228
			statement()
			}}
			5 -> {_localctx = ForInStatementContext(_localctx)
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 230
			match(For) as Token
			this.state = 231
			match(OpenParen) as Token
			this.state = 232
			singleExpression(0)
			this.state = 233
			match(In) as Token
			this.state = 234
			expressionSequence()
			this.state = 235
			match(CloseParen) as Token
			this.state = 236
			statement()
			}}
			6 -> {_localctx = ForVarInStatementContext(_localctx)
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 238
			match(For) as Token
			this.state = 239
			match(OpenParen) as Token
			this.state = 240
			match(Var) as Token
			this.state = 241
			variableDeclaration()
			this.state = 242
			match(In) as Token
			this.state = 243
			expressionSequence()
			this.state = 244
			match(CloseParen) as Token
			this.state = 245
			statement()
			}}
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

	open class ContinueStatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_continueStatement.id
	        set(value) { throw RuntimeException() }
		fun Continue() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Continue.id, 0)
		fun findEos() : EosContext? = getRuleContext(solver.getType("EosContext"),0)
		fun Identifier() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Identifier.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterContinueStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitContinueStatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitContinueStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  continueStatement() : ContinueStatementContext {
		var _localctx : ContinueStatementContext = ContinueStatementContext(context, state)
		enterRule(_localctx, 28, Rules.RULE_continueStatement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 249
			match(Continue) as Token
			this.state = 252
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,15,context) ) {
			1   -> if (true){
			this.state = 250
			if (!(!here(LineTerminator))) throw FailedPredicateException(this, "!here(LineTerminator)")
			this.state = 251
			match(Identifier) as Token
			}
			}
			this.state = 254
			eos()
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

	open class BreakStatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_breakStatement.id
	        set(value) { throw RuntimeException() }
		fun Break() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Break.id, 0)
		fun findEos() : EosContext? = getRuleContext(solver.getType("EosContext"),0)
		fun Identifier() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Identifier.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterBreakStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitBreakStatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitBreakStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  breakStatement() : BreakStatementContext {
		var _localctx : BreakStatementContext = BreakStatementContext(context, state)
		enterRule(_localctx, 30, Rules.RULE_breakStatement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 256
			match(Break) as Token
			this.state = 259
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,16,context) ) {
			1   -> if (true){
			this.state = 257
			if (!(!here(LineTerminator))) throw FailedPredicateException(this, "!here(LineTerminator)")
			this.state = 258
			match(Identifier) as Token
			}
			}
			this.state = 261
			eos()
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

	open class ReturnStatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_returnStatement.id
	        set(value) { throw RuntimeException() }
		fun Return() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Return.id, 0)
		fun findEos() : EosContext? = getRuleContext(solver.getType("EosContext"),0)
		fun findExpressionSequence() : ExpressionSequenceContext? = getRuleContext(solver.getType("ExpressionSequenceContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterReturnStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitReturnStatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitReturnStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  returnStatement() : ReturnStatementContext {
		var _localctx : ReturnStatementContext = ReturnStatementContext(context, state)
		enterRule(_localctx, 32, Rules.RULE_returnStatement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 263
			match(Return) as Token
			this.state = 266
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,17,context) ) {
			1   -> if (true){
			this.state = 264
			if (!(!here(LineTerminator))) throw FailedPredicateException(this, "!here(LineTerminator)")
			this.state = 265
			expressionSequence()
			}
			}
			this.state = 268
			eos()
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

	open class WithStatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_withStatement.id
	        set(value) { throw RuntimeException() }
		fun With() : TerminalNode? = getToken(ECMAScriptParser.Tokens.With.id, 0)
		fun findExpressionSequence() : ExpressionSequenceContext? = getRuleContext(solver.getType("ExpressionSequenceContext"),0)
		fun findStatement() : StatementContext? = getRuleContext(solver.getType("StatementContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterWithStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitWithStatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitWithStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  withStatement() : WithStatementContext {
		var _localctx : WithStatementContext = WithStatementContext(context, state)
		enterRule(_localctx, 34, Rules.RULE_withStatement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 270
			match(With) as Token
			this.state = 271
			match(OpenParen) as Token
			this.state = 272
			expressionSequence()
			this.state = 273
			match(CloseParen) as Token
			this.state = 274
			statement()
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

	open class SwitchStatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_switchStatement.id
	        set(value) { throw RuntimeException() }
		fun Switch() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Switch.id, 0)
		fun findExpressionSequence() : ExpressionSequenceContext? = getRuleContext(solver.getType("ExpressionSequenceContext"),0)
		fun findCaseBlock() : CaseBlockContext? = getRuleContext(solver.getType("CaseBlockContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterSwitchStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitSwitchStatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitSwitchStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  switchStatement() : SwitchStatementContext {
		var _localctx : SwitchStatementContext = SwitchStatementContext(context, state)
		enterRule(_localctx, 36, Rules.RULE_switchStatement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 276
			match(Switch) as Token
			this.state = 277
			match(OpenParen) as Token
			this.state = 278
			expressionSequence()
			this.state = 279
			match(CloseParen) as Token
			this.state = 280
			caseBlock()
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

	open class CaseBlockContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_caseBlock.id
	        set(value) { throw RuntimeException() }
		fun findCaseClauses() : List<CaseClausesContext> = getRuleContexts(solver.getType("CaseClausesContext"))
		fun findCaseClauses(i: Int) : CaseClausesContext? = getRuleContext(solver.getType("CaseClausesContext"),i)
		fun findDefaultClause() : DefaultClauseContext? = getRuleContext(solver.getType("DefaultClauseContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterCaseBlock(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitCaseBlock(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitCaseBlock(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  caseBlock() : CaseBlockContext {
		var _localctx : CaseBlockContext = CaseBlockContext(context, state)
		enterRule(_localctx, 38, Rules.RULE_caseBlock.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 282
			match(OpenBrace) as Token
			this.state = 284
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Case) {
				if (true){
				this.state = 283
				caseClauses()
				}
			}

			this.state = 290
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Default) {
				if (true){
				this.state = 286
				defaultClause()
				this.state = 288
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				if (_la==Case) {
					if (true){
					this.state = 287
					caseClauses()
					}
				}

				}
			}

			this.state = 292
			match(CloseBrace) as Token
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

	open class CaseClausesContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_caseClauses.id
	        set(value) { throw RuntimeException() }
		fun findCaseClause() : List<CaseClauseContext> = getRuleContexts(solver.getType("CaseClauseContext"))
		fun findCaseClause(i: Int) : CaseClauseContext? = getRuleContext(solver.getType("CaseClauseContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterCaseClauses(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitCaseClauses(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitCaseClauses(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  caseClauses() : CaseClausesContext {
		var _localctx : CaseClausesContext = CaseClausesContext(context, state)
		enterRule(_localctx, 40, Rules.RULE_caseClauses.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 295 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 294
				caseClause()
				}
				}
				this.state = 297 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==Case )
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

	open class CaseClauseContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_caseClause.id
	        set(value) { throw RuntimeException() }
		fun Case() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Case.id, 0)
		fun findExpressionSequence() : ExpressionSequenceContext? = getRuleContext(solver.getType("ExpressionSequenceContext"),0)
		fun findStatementList() : StatementListContext? = getRuleContext(solver.getType("StatementListContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterCaseClause(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitCaseClause(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitCaseClause(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  caseClause() : CaseClauseContext {
		var _localctx : CaseClauseContext = CaseClauseContext(context, state)
		enterRule(_localctx, 42, Rules.RULE_caseClause.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 299
			match(Case) as Token
			this.state = 300
			expressionSequence()
			this.state = 301
			match(Colon) as Token
			this.state = 303
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,22,context) ) {
			1   -> if (true){
			this.state = 302
			statementList()
			}
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

	open class DefaultClauseContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_defaultClause.id
	        set(value) { throw RuntimeException() }
		fun Default() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Default.id, 0)
		fun findStatementList() : StatementListContext? = getRuleContext(solver.getType("StatementListContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterDefaultClause(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitDefaultClause(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitDefaultClause(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  defaultClause() : DefaultClauseContext {
		var _localctx : DefaultClauseContext = DefaultClauseContext(context, state)
		enterRule(_localctx, 44, Rules.RULE_defaultClause.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 305
			match(Default) as Token
			this.state = 306
			match(Colon) as Token
			this.state = 308
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,23,context) ) {
			1   -> if (true){
			this.state = 307
			statementList()
			}
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

	open class LabelledStatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_labelledStatement.id
	        set(value) { throw RuntimeException() }
		fun Identifier() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Identifier.id, 0)
		fun findStatement() : StatementContext? = getRuleContext(solver.getType("StatementContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterLabelledStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitLabelledStatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitLabelledStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  labelledStatement() : LabelledStatementContext {
		var _localctx : LabelledStatementContext = LabelledStatementContext(context, state)
		enterRule(_localctx, 46, Rules.RULE_labelledStatement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 310
			match(Identifier) as Token
			this.state = 311
			match(Colon) as Token
			this.state = 312
			statement()
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

	open class ThrowStatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_throwStatement.id
	        set(value) { throw RuntimeException() }
		fun Throw() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Throw.id, 0)
		fun findExpressionSequence() : ExpressionSequenceContext? = getRuleContext(solver.getType("ExpressionSequenceContext"),0)
		fun findEos() : EosContext? = getRuleContext(solver.getType("EosContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterThrowStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitThrowStatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitThrowStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  throwStatement() : ThrowStatementContext {
		var _localctx : ThrowStatementContext = ThrowStatementContext(context, state)
		enterRule(_localctx, 48, Rules.RULE_throwStatement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 314
			match(Throw) as Token
			this.state = 315
			if (!(!here(LineTerminator))) throw FailedPredicateException(this, "!here(LineTerminator)")
			this.state = 316
			expressionSequence()
			this.state = 317
			eos()
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

	open class TryStatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_tryStatement.id
	        set(value) { throw RuntimeException() }
		fun Try() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Try.id, 0)
		fun findBlock() : BlockContext? = getRuleContext(solver.getType("BlockContext"),0)
		fun findCatchProduction() : CatchProductionContext? = getRuleContext(solver.getType("CatchProductionContext"),0)
		fun findFinallyProduction() : FinallyProductionContext? = getRuleContext(solver.getType("FinallyProductionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterTryStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitTryStatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitTryStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  tryStatement() : TryStatementContext {
		var _localctx : TryStatementContext = TryStatementContext(context, state)
		enterRule(_localctx, 50, Rules.RULE_tryStatement.id)
		try {
			this.state = 332
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,24,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 319
			match(Try) as Token
			this.state = 320
			block()
			this.state = 321
			catchProduction()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 323
			match(Try) as Token
			this.state = 324
			block()
			this.state = 325
			finallyProduction()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 327
			match(Try) as Token
			this.state = 328
			block()
			this.state = 329
			catchProduction()
			this.state = 330
			finallyProduction()
			}}
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

	open class CatchProductionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_catchProduction.id
	        set(value) { throw RuntimeException() }
		fun Catch() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Catch.id, 0)
		fun Identifier() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Identifier.id, 0)
		fun findBlock() : BlockContext? = getRuleContext(solver.getType("BlockContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterCatchProduction(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitCatchProduction(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitCatchProduction(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  catchProduction() : CatchProductionContext {
		var _localctx : CatchProductionContext = CatchProductionContext(context, state)
		enterRule(_localctx, 52, Rules.RULE_catchProduction.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 334
			match(Catch) as Token
			this.state = 335
			match(OpenParen) as Token
			this.state = 336
			match(Identifier) as Token
			this.state = 337
			match(CloseParen) as Token
			this.state = 338
			block()
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

	open class FinallyProductionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_finallyProduction.id
	        set(value) { throw RuntimeException() }
		fun Finally() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Finally.id, 0)
		fun findBlock() : BlockContext? = getRuleContext(solver.getType("BlockContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterFinallyProduction(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitFinallyProduction(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitFinallyProduction(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  finallyProduction() : FinallyProductionContext {
		var _localctx : FinallyProductionContext = FinallyProductionContext(context, state)
		enterRule(_localctx, 54, Rules.RULE_finallyProduction.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 340
			match(Finally) as Token
			this.state = 341
			block()
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

	open class DebuggerStatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_debuggerStatement.id
	        set(value) { throw RuntimeException() }
		fun Debugger() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Debugger.id, 0)
		fun findEos() : EosContext? = getRuleContext(solver.getType("EosContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterDebuggerStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitDebuggerStatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitDebuggerStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  debuggerStatement() : DebuggerStatementContext {
		var _localctx : DebuggerStatementContext = DebuggerStatementContext(context, state)
		enterRule(_localctx, 56, Rules.RULE_debuggerStatement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 343
			match(Debugger) as Token
			this.state = 344
			eos()
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

	open class FunctionDeclarationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_functionDeclaration.id
	        set(value) { throw RuntimeException() }
		fun Function() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Function.id, 0)
		fun Identifier() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Identifier.id, 0)
		fun findFunctionBody() : FunctionBodyContext? = getRuleContext(solver.getType("FunctionBodyContext"),0)
		fun findFormalParameterList() : FormalParameterListContext? = getRuleContext(solver.getType("FormalParameterListContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterFunctionDeclaration(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitFunctionDeclaration(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitFunctionDeclaration(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  functionDeclaration() : FunctionDeclarationContext {
		var _localctx : FunctionDeclarationContext = FunctionDeclarationContext(context, state)
		enterRule(_localctx, 58, Rules.RULE_functionDeclaration.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 346
			match(Function) as Token
			this.state = 347
			match(Identifier) as Token
			this.state = 348
			match(OpenParen) as Token
			this.state = 350
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Identifier) {
				if (true){
				this.state = 349
				formalParameterList()
				}
			}

			this.state = 352
			match(CloseParen) as Token
			this.state = 353
			match(OpenBrace) as Token
			this.state = 354
			functionBody()
			this.state = 355
			match(CloseBrace) as Token
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

	open class FormalParameterListContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_formalParameterList.id
	        set(value) { throw RuntimeException() }
		fun Identifier() : List<TerminalNode> = getTokens(ECMAScriptParser.Tokens.Identifier.id)
		fun Identifier(i: Int) : TerminalNode = getToken(ECMAScriptParser.Tokens.Identifier.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterFormalParameterList(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitFormalParameterList(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitFormalParameterList(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  formalParameterList() : FormalParameterListContext {
		var _localctx : FormalParameterListContext = FormalParameterListContext(context, state)
		enterRule(_localctx, 60, Rules.RULE_formalParameterList.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 357
			match(Identifier) as Token
			this.state = 362
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==Comma) {
				if (true){
				if (true){
				this.state = 358
				match(Comma) as Token
				this.state = 359
				match(Identifier) as Token
				}
				}
				this.state = 364
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

	open class FunctionBodyContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_functionBody.id
	        set(value) { throw RuntimeException() }
		fun findSourceElements() : SourceElementsContext? = getRuleContext(solver.getType("SourceElementsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterFunctionBody(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitFunctionBody(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitFunctionBody(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  functionBody() : FunctionBodyContext {
		var _localctx : FunctionBodyContext = FunctionBodyContext(context, state)
		enterRule(_localctx, 62, Rules.RULE_functionBody.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 366
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,27,context) ) {
			1   -> if (true){
			this.state = 365
			sourceElements()
			}
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

	open class ArrayLiteralContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_arrayLiteral.id
	        set(value) { throw RuntimeException() }
		fun findElementList() : ElementListContext? = getRuleContext(solver.getType("ElementListContext"),0)
		fun findElision() : ElisionContext? = getRuleContext(solver.getType("ElisionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterArrayLiteral(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitArrayLiteral(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitArrayLiteral(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  arrayLiteral() : ArrayLiteralContext {
		var _localctx : ArrayLiteralContext = ArrayLiteralContext(context, state)
		enterRule(_localctx, 64, Rules.RULE_arrayLiteral.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 368
			match(OpenBracket) as Token
			this.state = 370
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,28,context) ) {
			1   -> if (true){
			this.state = 369
			elementList()
			}
			}
			this.state = 373
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,29,context) ) {
			1   -> if (true){
			this.state = 372
			match(Comma) as Token
			}
			}
			this.state = 376
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Comma) {
				if (true){
				this.state = 375
				elision()
				}
			}

			this.state = 378
			match(CloseBracket) as Token
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

	open class ElementListContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_elementList.id
	        set(value) { throw RuntimeException() }
		fun findSingleExpression() : List<SingleExpressionContext> = getRuleContexts(solver.getType("SingleExpressionContext"))
		fun findSingleExpression(i: Int) : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),i)
		fun findElision() : List<ElisionContext> = getRuleContexts(solver.getType("ElisionContext"))
		fun findElision(i: Int) : ElisionContext? = getRuleContext(solver.getType("ElisionContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterElementList(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitElementList(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitElementList(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  elementList() : ElementListContext {
		var _localctx : ElementListContext = ElementListContext(context, state)
		enterRule(_localctx, 66, Rules.RULE_elementList.id)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 381
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Comma) {
				if (true){
				this.state = 380
				elision()
				}
			}

			this.state = 383
			singleExpression(0)
			this.state = 391
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,33,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 384
					match(Comma) as Token
					this.state = 386
					errorHandler.sync(this)
					_la = _input!!.LA(1)
					if (_la==Comma) {
						if (true){
						this.state = 385
						elision()
						}
					}

					this.state = 388
					singleExpression(0)
					}
					} 
				}
				this.state = 393
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,33,context)
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

	open class ElisionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_elision.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterElision(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitElision(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitElision(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  elision() : ElisionContext {
		var _localctx : ElisionContext = ElisionContext(context, state)
		enterRule(_localctx, 68, Rules.RULE_elision.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 395 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 394
				match(Comma) as Token
				}
				}
				this.state = 397 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==Comma )
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

	open class ObjectLiteralContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_objectLiteral.id
	        set(value) { throw RuntimeException() }
		fun findPropertyNameAndValueList() : PropertyNameAndValueListContext? = getRuleContext(solver.getType("PropertyNameAndValueListContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterObjectLiteral(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitObjectLiteral(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitObjectLiteral(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  objectLiteral() : ObjectLiteralContext {
		var _localctx : ObjectLiteralContext = ObjectLiteralContext(context, state)
		enterRule(_localctx, 70, Rules.RULE_objectLiteral.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 399
			match(OpenBrace) as Token
			this.state = 401
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,35,context) ) {
			1   -> if (true){
			this.state = 400
			propertyNameAndValueList()
			}
			}
			this.state = 404
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Comma) {
				if (true){
				this.state = 403
				match(Comma) as Token
				}
			}

			this.state = 406
			match(CloseBrace) as Token
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

	open class PropertyNameAndValueListContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_propertyNameAndValueList.id
	        set(value) { throw RuntimeException() }
		fun findPropertyAssignment() : List<PropertyAssignmentContext> = getRuleContexts(solver.getType("PropertyAssignmentContext"))
		fun findPropertyAssignment(i: Int) : PropertyAssignmentContext? = getRuleContext(solver.getType("PropertyAssignmentContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterPropertyNameAndValueList(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitPropertyNameAndValueList(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitPropertyNameAndValueList(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  propertyNameAndValueList() : PropertyNameAndValueListContext {
		var _localctx : PropertyNameAndValueListContext = PropertyNameAndValueListContext(context, state)
		enterRule(_localctx, 72, Rules.RULE_propertyNameAndValueList.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 408
			propertyAssignment()
			this.state = 413
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,37,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 409
					match(Comma) as Token
					this.state = 410
					propertyAssignment()
					}
					} 
				}
				this.state = 415
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,37,context)
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

	open class PropertyAssignmentContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_propertyAssignment.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	 
		constructor() : super() { }
		fun copyFrom(ctx: PropertyAssignmentContext) {
			super.copyFrom(ctx)
		}
	}
	open class PropertyExpressionAssignmentContext : PropertyAssignmentContext {
		fun findPropertyName() : PropertyNameContext? = getRuleContext(solver.getType("PropertyNameContext"),0)
		fun findSingleExpression() : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),0)
		constructor(ctx: PropertyAssignmentContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterPropertyExpressionAssignment(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitPropertyExpressionAssignment(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitPropertyExpressionAssignment(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class PropertySetterContext : PropertyAssignmentContext {
		fun findSetter() : SetterContext? = getRuleContext(solver.getType("SetterContext"),0)
		fun findPropertySetParameterList() : PropertySetParameterListContext? = getRuleContext(solver.getType("PropertySetParameterListContext"),0)
		fun findFunctionBody() : FunctionBodyContext? = getRuleContext(solver.getType("FunctionBodyContext"),0)
		constructor(ctx: PropertyAssignmentContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterPropertySetter(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitPropertySetter(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitPropertySetter(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class PropertyGetterContext : PropertyAssignmentContext {
		fun findGetter() : GetterContext? = getRuleContext(solver.getType("GetterContext"),0)
		fun findFunctionBody() : FunctionBodyContext? = getRuleContext(solver.getType("FunctionBodyContext"),0)
		constructor(ctx: PropertyAssignmentContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterPropertyGetter(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitPropertyGetter(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitPropertyGetter(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  propertyAssignment() : PropertyAssignmentContext {
		var _localctx : PropertyAssignmentContext = PropertyAssignmentContext(context, state)
		enterRule(_localctx, 74, Rules.RULE_propertyAssignment.id)
		try {
			this.state = 435
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,38,context) ) {
			1 -> {_localctx = PropertyExpressionAssignmentContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 416
			propertyName()
			this.state = 417
			match(Colon) as Token
			this.state = 418
			singleExpression(0)
			}}
			2 -> {_localctx = PropertyGetterContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 420
			getter()
			this.state = 421
			match(OpenParen) as Token
			this.state = 422
			match(CloseParen) as Token
			this.state = 423
			match(OpenBrace) as Token
			this.state = 424
			functionBody()
			this.state = 425
			match(CloseBrace) as Token
			}}
			3 -> {_localctx = PropertySetterContext(_localctx)
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 427
			setter()
			this.state = 428
			match(OpenParen) as Token
			this.state = 429
			propertySetParameterList()
			this.state = 430
			match(CloseParen) as Token
			this.state = 431
			match(OpenBrace) as Token
			this.state = 432
			functionBody()
			this.state = 433
			match(CloseBrace) as Token
			}}
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

	open class PropertyNameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_propertyName.id
	        set(value) { throw RuntimeException() }
		fun findIdentifierName() : IdentifierNameContext? = getRuleContext(solver.getType("IdentifierNameContext"),0)
		fun StringLiteral() : TerminalNode? = getToken(ECMAScriptParser.Tokens.StringLiteral.id, 0)
		fun findNumericLiteral() : NumericLiteralContext? = getRuleContext(solver.getType("NumericLiteralContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterPropertyName(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitPropertyName(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitPropertyName(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  propertyName() : PropertyNameContext {
		var _localctx : PropertyNameContext = PropertyNameContext(context, state)
		enterRule(_localctx, 76, Rules.RULE_propertyName.id)
		try {
			this.state = 440
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			NullLiteral , BooleanLiteral , Break , Do , Instanceof , Typeof , Case , Else , New , Var , Catch , Finally , Return , Void , Continue , For , Switch , While , Debugger , Function , This , With , Default , If , Throw , Delete , In , Try , Class , Enum , Extends , Super , Const , Export , Import , Implements , Let , Private , Public , Interface , Package , Protected , Static , Yield , Identifier  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 437
			identifierName()
			}}
			StringLiteral  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 438
			match(StringLiteral) as Token
			}}
			DecimalLiteral , HexIntegerLiteral , OctalIntegerLiteral  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 439
			numericLiteral()
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

	open class PropertySetParameterListContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_propertySetParameterList.id
	        set(value) { throw RuntimeException() }
		fun Identifier() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Identifier.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterPropertySetParameterList(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitPropertySetParameterList(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitPropertySetParameterList(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  propertySetParameterList() : PropertySetParameterListContext {
		var _localctx : PropertySetParameterListContext = PropertySetParameterListContext(context, state)
		enterRule(_localctx, 78, Rules.RULE_propertySetParameterList.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 442
			match(Identifier) as Token
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

	open class ArgumentsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_arguments.id
	        set(value) { throw RuntimeException() }
		fun findArgumentList() : ArgumentListContext? = getRuleContext(solver.getType("ArgumentListContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterArguments(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitArguments(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitArguments(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  arguments() : ArgumentsContext {
		var _localctx : ArgumentsContext = ArgumentsContext(context, state)
		enterRule(_localctx, 80, Rules.RULE_arguments.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 444
			match(OpenParen) as Token
			this.state = 446
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl RegularExpressionLiteral) or (1L shl OpenBracket) or (1L shl OpenParen) or (1L shl OpenBrace) or (1L shl PlusPlus) or (1L shl MinusMinus) or (1L shl Plus) or (1L shl Minus) or (1L shl BitNot) or (1L shl Not) or (1L shl NullLiteral) or (1L shl BooleanLiteral) or (1L shl DecimalLiteral) or (1L shl HexIntegerLiteral) or (1L shl OctalIntegerLiteral) or (1L shl Typeof) or (1L shl New))) != 0L) || ((((_la - 67)) and 0x3f.inv()) == 0 && ((1L shl (_la - 67)) and ((1L shl (Void - 67)) or (1L shl (Function - 67)) or (1L shl (This - 67)) or (1L shl (Delete - 67)) or (1L shl (Identifier - 67)) or (1L shl (StringLiteral - 67)))) != 0L)) {
				if (true){
				this.state = 445
				argumentList()
				}
			}

			this.state = 448
			match(CloseParen) as Token
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

	open class ArgumentListContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_argumentList.id
	        set(value) { throw RuntimeException() }
		fun findSingleExpression() : List<SingleExpressionContext> = getRuleContexts(solver.getType("SingleExpressionContext"))
		fun findSingleExpression(i: Int) : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterArgumentList(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitArgumentList(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitArgumentList(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  argumentList() : ArgumentListContext {
		var _localctx : ArgumentListContext = ArgumentListContext(context, state)
		enterRule(_localctx, 82, Rules.RULE_argumentList.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 450
			singleExpression(0)
			this.state = 455
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==Comma) {
				if (true){
				if (true){
				this.state = 451
				match(Comma) as Token
				this.state = 452
				singleExpression(0)
				}
				}
				this.state = 457
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

	open class ExpressionSequenceContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_expressionSequence.id
	        set(value) { throw RuntimeException() }
		fun findSingleExpression() : List<SingleExpressionContext> = getRuleContexts(solver.getType("SingleExpressionContext"))
		fun findSingleExpression(i: Int) : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterExpressionSequence(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitExpressionSequence(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitExpressionSequence(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  expressionSequence() : ExpressionSequenceContext {
		var _localctx : ExpressionSequenceContext = ExpressionSequenceContext(context, state)
		enterRule(_localctx, 84, Rules.RULE_expressionSequence.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 458
			singleExpression(0)
			this.state = 463
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,42,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 459
					match(Comma) as Token
					this.state = 460
					singleExpression(0)
					}
					} 
				}
				this.state = 465
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,42,context)
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

	open class SingleExpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_singleExpression.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	 
		constructor() : super() { }
		fun copyFrom(ctx: SingleExpressionContext) {
			super.copyFrom(ctx)
		}
	}
	open class TernaryExpressionContext : SingleExpressionContext {
		fun findSingleExpression() : List<SingleExpressionContext> = getRuleContexts(solver.getType("SingleExpressionContext"))
		fun findSingleExpression(i: Int) : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),i)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterTernaryExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitTernaryExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitTernaryExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class LogicalAndExpressionContext : SingleExpressionContext {
		fun findSingleExpression() : List<SingleExpressionContext> = getRuleContexts(solver.getType("SingleExpressionContext"))
		fun findSingleExpression(i: Int) : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),i)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterLogicalAndExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitLogicalAndExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitLogicalAndExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class PreIncrementExpressionContext : SingleExpressionContext {
		fun findSingleExpression() : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),0)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterPreIncrementExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitPreIncrementExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitPreIncrementExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class ObjectLiteralExpressionContext : SingleExpressionContext {
		fun findObjectLiteral() : ObjectLiteralContext? = getRuleContext(solver.getType("ObjectLiteralContext"),0)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterObjectLiteralExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitObjectLiteralExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitObjectLiteralExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class InExpressionContext : SingleExpressionContext {
		fun findSingleExpression() : List<SingleExpressionContext> = getRuleContexts(solver.getType("SingleExpressionContext"))
		fun findSingleExpression(i: Int) : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),i)
		fun In() : TerminalNode? = getToken(ECMAScriptParser.Tokens.In.id, 0)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterInExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitInExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitInExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class LogicalOrExpressionContext : SingleExpressionContext {
		fun findSingleExpression() : List<SingleExpressionContext> = getRuleContexts(solver.getType("SingleExpressionContext"))
		fun findSingleExpression(i: Int) : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),i)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterLogicalOrExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitLogicalOrExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitLogicalOrExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class NotExpressionContext : SingleExpressionContext {
		fun findSingleExpression() : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),0)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterNotExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitNotExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitNotExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class PreDecreaseExpressionContext : SingleExpressionContext {
		fun findSingleExpression() : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),0)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterPreDecreaseExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitPreDecreaseExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitPreDecreaseExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class ArgumentsExpressionContext : SingleExpressionContext {
		fun findSingleExpression() : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),0)
		fun findArguments() : ArgumentsContext? = getRuleContext(solver.getType("ArgumentsContext"),0)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterArgumentsExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitArgumentsExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitArgumentsExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class ThisExpressionContext : SingleExpressionContext {
		fun This() : TerminalNode? = getToken(ECMAScriptParser.Tokens.This.id, 0)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterThisExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitThisExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitThisExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class FunctionExpressionContext : SingleExpressionContext {
		fun Function() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Function.id, 0)
		fun findFunctionBody() : FunctionBodyContext? = getRuleContext(solver.getType("FunctionBodyContext"),0)
		fun Identifier() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Identifier.id, 0)
		fun findFormalParameterList() : FormalParameterListContext? = getRuleContext(solver.getType("FormalParameterListContext"),0)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterFunctionExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitFunctionExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitFunctionExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class UnaryMinusExpressionContext : SingleExpressionContext {
		fun findSingleExpression() : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),0)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterUnaryMinusExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitUnaryMinusExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitUnaryMinusExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class AssignmentExpressionContext : SingleExpressionContext {
		fun findSingleExpression() : List<SingleExpressionContext> = getRuleContexts(solver.getType("SingleExpressionContext"))
		fun findSingleExpression(i: Int) : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),i)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterAssignmentExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitAssignmentExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitAssignmentExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class PostDecreaseExpressionContext : SingleExpressionContext {
		fun findSingleExpression() : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),0)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterPostDecreaseExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitPostDecreaseExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitPostDecreaseExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class TypeofExpressionContext : SingleExpressionContext {
		fun Typeof() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Typeof.id, 0)
		fun findSingleExpression() : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),0)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterTypeofExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitTypeofExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitTypeofExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class InstanceofExpressionContext : SingleExpressionContext {
		fun findSingleExpression() : List<SingleExpressionContext> = getRuleContexts(solver.getType("SingleExpressionContext"))
		fun findSingleExpression(i: Int) : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),i)
		fun Instanceof() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Instanceof.id, 0)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterInstanceofExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitInstanceofExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitInstanceofExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class UnaryPlusExpressionContext : SingleExpressionContext {
		fun findSingleExpression() : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),0)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterUnaryPlusExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitUnaryPlusExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitUnaryPlusExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class DeleteExpressionContext : SingleExpressionContext {
		fun Delete() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Delete.id, 0)
		fun findSingleExpression() : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),0)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterDeleteExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitDeleteExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitDeleteExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class EqualityExpressionContext : SingleExpressionContext {
		fun findSingleExpression() : List<SingleExpressionContext> = getRuleContexts(solver.getType("SingleExpressionContext"))
		fun findSingleExpression(i: Int) : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),i)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterEqualityExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitEqualityExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitEqualityExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class BitXOrExpressionContext : SingleExpressionContext {
		fun findSingleExpression() : List<SingleExpressionContext> = getRuleContexts(solver.getType("SingleExpressionContext"))
		fun findSingleExpression(i: Int) : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),i)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterBitXOrExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitBitXOrExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitBitXOrExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class MultiplicativeExpressionContext : SingleExpressionContext {
		fun findSingleExpression() : List<SingleExpressionContext> = getRuleContexts(solver.getType("SingleExpressionContext"))
		fun findSingleExpression(i: Int) : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),i)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterMultiplicativeExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitMultiplicativeExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitMultiplicativeExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class BitShiftExpressionContext : SingleExpressionContext {
		fun findSingleExpression() : List<SingleExpressionContext> = getRuleContexts(solver.getType("SingleExpressionContext"))
		fun findSingleExpression(i: Int) : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),i)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterBitShiftExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitBitShiftExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitBitShiftExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class ParenthesizedExpressionContext : SingleExpressionContext {
		fun findExpressionSequence() : ExpressionSequenceContext? = getRuleContext(solver.getType("ExpressionSequenceContext"),0)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterParenthesizedExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitParenthesizedExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitParenthesizedExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class AdditiveExpressionContext : SingleExpressionContext {
		fun findSingleExpression() : List<SingleExpressionContext> = getRuleContexts(solver.getType("SingleExpressionContext"))
		fun findSingleExpression(i: Int) : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),i)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterAdditiveExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitAdditiveExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitAdditiveExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class RelationalExpressionContext : SingleExpressionContext {
		fun findSingleExpression() : List<SingleExpressionContext> = getRuleContexts(solver.getType("SingleExpressionContext"))
		fun findSingleExpression(i: Int) : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),i)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterRelationalExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitRelationalExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitRelationalExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class PostIncrementExpressionContext : SingleExpressionContext {
		fun findSingleExpression() : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),0)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterPostIncrementExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitPostIncrementExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitPostIncrementExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class BitNotExpressionContext : SingleExpressionContext {
		fun findSingleExpression() : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),0)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterBitNotExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitBitNotExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitBitNotExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class NewExpressionContext : SingleExpressionContext {
		fun New() : TerminalNode? = getToken(ECMAScriptParser.Tokens.New.id, 0)
		fun findSingleExpression() : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),0)
		fun findArguments() : ArgumentsContext? = getRuleContext(solver.getType("ArgumentsContext"),0)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterNewExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitNewExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitNewExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class LiteralExpressionContext : SingleExpressionContext {
		fun findLiteral() : LiteralContext? = getRuleContext(solver.getType("LiteralContext"),0)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterLiteralExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitLiteralExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitLiteralExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class ArrayLiteralExpressionContext : SingleExpressionContext {
		fun findArrayLiteral() : ArrayLiteralContext? = getRuleContext(solver.getType("ArrayLiteralContext"),0)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterArrayLiteralExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitArrayLiteralExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitArrayLiteralExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class MemberDotExpressionContext : SingleExpressionContext {
		fun findSingleExpression() : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),0)
		fun findIdentifierName() : IdentifierNameContext? = getRuleContext(solver.getType("IdentifierNameContext"),0)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterMemberDotExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitMemberDotExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitMemberDotExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class MemberIndexExpressionContext : SingleExpressionContext {
		fun findSingleExpression() : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),0)
		fun findExpressionSequence() : ExpressionSequenceContext? = getRuleContext(solver.getType("ExpressionSequenceContext"),0)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterMemberIndexExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitMemberIndexExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitMemberIndexExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class IdentifierExpressionContext : SingleExpressionContext {
		fun Identifier() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Identifier.id, 0)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterIdentifierExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitIdentifierExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitIdentifierExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class BitAndExpressionContext : SingleExpressionContext {
		fun findSingleExpression() : List<SingleExpressionContext> = getRuleContexts(solver.getType("SingleExpressionContext"))
		fun findSingleExpression(i: Int) : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),i)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterBitAndExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitBitAndExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitBitAndExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class BitOrExpressionContext : SingleExpressionContext {
		fun findSingleExpression() : List<SingleExpressionContext> = getRuleContexts(solver.getType("SingleExpressionContext"))
		fun findSingleExpression(i: Int) : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),i)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterBitOrExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitBitOrExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitBitOrExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class AssignmentOperatorExpressionContext : SingleExpressionContext {
		fun findSingleExpression() : List<SingleExpressionContext> = getRuleContexts(solver.getType("SingleExpressionContext"))
		fun findSingleExpression(i: Int) : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),i)
		fun findAssignmentOperator() : AssignmentOperatorContext? = getRuleContext(solver.getType("AssignmentOperatorContext"),0)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterAssignmentOperatorExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitAssignmentOperatorExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitAssignmentOperatorExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class VoidExpressionContext : SingleExpressionContext {
		fun Void() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Void.id, 0)
		fun findSingleExpression() : SingleExpressionContext? = getRuleContext(solver.getType("SingleExpressionContext"),0)
		constructor(ctx: SingleExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterVoidExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitVoidExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitVoidExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	 fun singleExpression() : SingleExpressionContext {
		return singleExpression(0);
	}

	private fun singleExpression(_p: Int) : SingleExpressionContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : SingleExpressionContext= SingleExpressionContext(context, _parentState)
		var _prevctx : SingleExpressionContext= _localctx
		var _startState : Int = 86
		enterRecursionRule(_localctx, 86, Rules.RULE_singleExpression.id, _p)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 512
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			Function  ->  /*LL1AltBlock*/{if (true){
			_localctx = FunctionExpressionContext(_localctx)
			context = _localctx
			_prevctx = _localctx

			this.state = 467
			match(Function) as Token
			this.state = 469
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Identifier) {
				if (true){
				this.state = 468
				match(Identifier) as Token
				}
			}

			this.state = 471
			match(OpenParen) as Token
			this.state = 473
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Identifier) {
				if (true){
				this.state = 472
				formalParameterList()
				}
			}

			this.state = 475
			match(CloseParen) as Token
			this.state = 476
			match(OpenBrace) as Token
			this.state = 477
			functionBody()
			this.state = 478
			match(CloseBrace) as Token
			}}
			New  ->  /*LL1AltBlock*/{if (true){
			_localctx = NewExpressionContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 480
			match(New) as Token
			this.state = 481
			singleExpression(0)
			this.state = 483
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,45,context) ) {
			1   -> if (true){
			this.state = 482
			arguments()
			}
			}
			}}
			Delete  ->  /*LL1AltBlock*/{if (true){
			_localctx = DeleteExpressionContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 485
			match(Delete) as Token
			this.state = 486
			singleExpression(30)
			}}
			Void  ->  /*LL1AltBlock*/{if (true){
			_localctx = VoidExpressionContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 487
			match(Void) as Token
			this.state = 488
			singleExpression(29)
			}}
			Typeof  ->  /*LL1AltBlock*/{if (true){
			_localctx = TypeofExpressionContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 489
			match(Typeof) as Token
			this.state = 490
			singleExpression(28)
			}}
			PlusPlus  ->  /*LL1AltBlock*/{if (true){
			_localctx = PreIncrementExpressionContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 491
			match(PlusPlus) as Token
			this.state = 492
			singleExpression(27)
			}}
			MinusMinus  ->  /*LL1AltBlock*/{if (true){
			_localctx = PreDecreaseExpressionContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 493
			match(MinusMinus) as Token
			this.state = 494
			singleExpression(26)
			}}
			Plus  ->  /*LL1AltBlock*/{if (true){
			_localctx = UnaryPlusExpressionContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 495
			match(Plus) as Token
			this.state = 496
			singleExpression(25)
			}}
			Minus  ->  /*LL1AltBlock*/{if (true){
			_localctx = UnaryMinusExpressionContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 497
			match(Minus) as Token
			this.state = 498
			singleExpression(24)
			}}
			BitNot  ->  /*LL1AltBlock*/{if (true){
			_localctx = BitNotExpressionContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 499
			match(BitNot) as Token
			this.state = 500
			singleExpression(23)
			}}
			Not  ->  /*LL1AltBlock*/{if (true){
			_localctx = NotExpressionContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 501
			match(Not) as Token
			this.state = 502
			singleExpression(22)
			}}
			This  ->  /*LL1AltBlock*/{if (true){
			_localctx = ThisExpressionContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 503
			match(This) as Token
			}}
			Identifier  ->  /*LL1AltBlock*/{if (true){
			_localctx = IdentifierExpressionContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 504
			match(Identifier) as Token
			}}
			RegularExpressionLiteral , NullLiteral , BooleanLiteral , DecimalLiteral , HexIntegerLiteral , OctalIntegerLiteral , StringLiteral  ->  /*LL1AltBlock*/{if (true){
			_localctx = LiteralExpressionContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 505
			literal()
			}}
			OpenBracket  ->  /*LL1AltBlock*/{if (true){
			_localctx = ArrayLiteralExpressionContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 506
			arrayLiteral()
			}}
			OpenBrace  ->  /*LL1AltBlock*/{if (true){
			_localctx = ObjectLiteralExpressionContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 507
			objectLiteral()
			}}
			OpenParen  ->  /*LL1AltBlock*/{if (true){
			_localctx = ParenthesizedExpressionContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 508
			match(OpenParen) as Token
			this.state = 509
			expressionSequence()
			this.state = 510
			match(CloseParen) as Token
			}}
			else -> throw NoViableAltException(this)
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 581
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,48,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					this.state = 579
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,47,context) ) {
					1 -> {if (true){
					_localctx = MultiplicativeExpressionContext(SingleExpressionContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_singleExpression.id)
					this.state = 514
					if (!(precpred(context!!, 21))) throw FailedPredicateException(this, "precpred(context!!, 21)")
					this.state = 515
					_la = _input!!.LA(1)
					if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Multiply) or (1L shl Divide) or (1L shl Modulus))) != 0L)) ) {
						errorHandler.recoverInline(this)
					}
					else {
						if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
						errorHandler.reportMatch(this)
						consume()
					}
					this.state = 516
					singleExpression(22)
					}}
					2 -> {if (true){
					_localctx = AdditiveExpressionContext(SingleExpressionContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_singleExpression.id)
					this.state = 517
					if (!(precpred(context!!, 20))) throw FailedPredicateException(this, "precpred(context!!, 20)")
					this.state = 518
					_la = _input!!.LA(1)
					if ( !(_la==Plus || _la==Minus) ) {
						errorHandler.recoverInline(this)
					}
					else {
						if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
						errorHandler.reportMatch(this)
						consume()
					}
					this.state = 519
					singleExpression(21)
					}}
					3 -> {if (true){
					_localctx = BitShiftExpressionContext(SingleExpressionContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_singleExpression.id)
					this.state = 520
					if (!(precpred(context!!, 19))) throw FailedPredicateException(this, "precpred(context!!, 19)")
					this.state = 521
					_la = _input!!.LA(1)
					if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl RightShiftArithmetic) or (1L shl LeftShiftArithmetic) or (1L shl RightShiftLogical))) != 0L)) ) {
						errorHandler.recoverInline(this)
					}
					else {
						if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
						errorHandler.reportMatch(this)
						consume()
					}
					this.state = 522
					singleExpression(20)
					}}
					4 -> {if (true){
					_localctx = RelationalExpressionContext(SingleExpressionContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_singleExpression.id)
					this.state = 523
					if (!(precpred(context!!, 18))) throw FailedPredicateException(this, "precpred(context!!, 18)")
					this.state = 524
					_la = _input!!.LA(1)
					if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl LessThan) or (1L shl MoreThan) or (1L shl LessThanEquals) or (1L shl GreaterThanEquals))) != 0L)) ) {
						errorHandler.recoverInline(this)
					}
					else {
						if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
						errorHandler.reportMatch(this)
						consume()
					}
					this.state = 525
					singleExpression(19)
					}}
					5 -> {if (true){
					_localctx = InstanceofExpressionContext(SingleExpressionContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_singleExpression.id)
					this.state = 526
					if (!(precpred(context!!, 17))) throw FailedPredicateException(this, "precpred(context!!, 17)")
					this.state = 527
					match(Instanceof) as Token
					this.state = 528
					singleExpression(18)
					}}
					6 -> {if (true){
					_localctx = InExpressionContext(SingleExpressionContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_singleExpression.id)
					this.state = 529
					if (!(precpred(context!!, 16))) throw FailedPredicateException(this, "precpred(context!!, 16)")
					this.state = 530
					match(In) as Token
					this.state = 531
					singleExpression(17)
					}}
					7 -> {if (true){
					_localctx = EqualityExpressionContext(SingleExpressionContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_singleExpression.id)
					this.state = 532
					if (!(precpred(context!!, 15))) throw FailedPredicateException(this, "precpred(context!!, 15)")
					this.state = 533
					_la = _input!!.LA(1)
					if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Equals_) or (1L shl NotEquals) or (1L shl IdentityEquals) or (1L shl IdentityNotEquals))) != 0L)) ) {
						errorHandler.recoverInline(this)
					}
					else {
						if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
						errorHandler.reportMatch(this)
						consume()
					}
					this.state = 534
					singleExpression(16)
					}}
					8 -> {if (true){
					_localctx = BitAndExpressionContext(SingleExpressionContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_singleExpression.id)
					this.state = 535
					if (!(precpred(context!!, 14))) throw FailedPredicateException(this, "precpred(context!!, 14)")
					this.state = 536
					match(BitAnd) as Token
					this.state = 537
					singleExpression(15)
					}}
					9 -> {if (true){
					_localctx = BitXOrExpressionContext(SingleExpressionContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_singleExpression.id)
					this.state = 538
					if (!(precpred(context!!, 13))) throw FailedPredicateException(this, "precpred(context!!, 13)")
					this.state = 539
					match(BitXOr) as Token
					this.state = 540
					singleExpression(14)
					}}
					10 -> {if (true){
					_localctx = BitOrExpressionContext(SingleExpressionContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_singleExpression.id)
					this.state = 541
					if (!(precpred(context!!, 12))) throw FailedPredicateException(this, "precpred(context!!, 12)")
					this.state = 542
					match(BitOr) as Token
					this.state = 543
					singleExpression(13)
					}}
					11 -> {if (true){
					_localctx = LogicalAndExpressionContext(SingleExpressionContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_singleExpression.id)
					this.state = 544
					if (!(precpred(context!!, 11))) throw FailedPredicateException(this, "precpred(context!!, 11)")
					this.state = 545
					match(And) as Token
					this.state = 546
					singleExpression(12)
					}}
					12 -> {if (true){
					_localctx = LogicalOrExpressionContext(SingleExpressionContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_singleExpression.id)
					this.state = 547
					if (!(precpred(context!!, 10))) throw FailedPredicateException(this, "precpred(context!!, 10)")
					this.state = 548
					match(Or) as Token
					this.state = 549
					singleExpression(11)
					}}
					13 -> {if (true){
					_localctx = TernaryExpressionContext(SingleExpressionContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_singleExpression.id)
					this.state = 550
					if (!(precpred(context!!, 9))) throw FailedPredicateException(this, "precpred(context!!, 9)")
					this.state = 551
					match(QuestionMark) as Token
					this.state = 552
					singleExpression(0)
					this.state = 553
					match(Colon) as Token
					this.state = 554
					singleExpression(10)
					}}
					14 -> {if (true){
					_localctx = AssignmentExpressionContext(SingleExpressionContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_singleExpression.id)
					this.state = 556
					if (!(precpred(context!!, 8))) throw FailedPredicateException(this, "precpred(context!!, 8)")
					this.state = 557
					match(Assign) as Token
					this.state = 558
					singleExpression(9)
					}}
					15 -> {if (true){
					_localctx = AssignmentOperatorExpressionContext(SingleExpressionContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_singleExpression.id)
					this.state = 559
					if (!(precpred(context!!, 7))) throw FailedPredicateException(this, "precpred(context!!, 7)")
					this.state = 560
					assignmentOperator()
					this.state = 561
					singleExpression(8)
					}}
					16 -> {if (true){
					_localctx = MemberIndexExpressionContext(SingleExpressionContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_singleExpression.id)
					this.state = 563
					if (!(precpred(context!!, 36))) throw FailedPredicateException(this, "precpred(context!!, 36)")
					this.state = 564
					match(OpenBracket) as Token
					this.state = 565
					expressionSequence()
					this.state = 566
					match(CloseBracket) as Token
					}}
					17 -> {if (true){
					_localctx = MemberDotExpressionContext(SingleExpressionContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_singleExpression.id)
					this.state = 568
					if (!(precpred(context!!, 35))) throw FailedPredicateException(this, "precpred(context!!, 35)")
					this.state = 569
					match(Dot) as Token
					this.state = 570
					identifierName()
					}}
					18 -> {if (true){
					_localctx = ArgumentsExpressionContext(SingleExpressionContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_singleExpression.id)
					this.state = 571
					if (!(precpred(context!!, 34))) throw FailedPredicateException(this, "precpred(context!!, 34)")
					this.state = 572
					arguments()
					}}
					19 -> {if (true){
					_localctx = PostIncrementExpressionContext(SingleExpressionContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_singleExpression.id)
					this.state = 573
					if (!(precpred(context!!, 32))) throw FailedPredicateException(this, "precpred(context!!, 32)")
					this.state = 574
					if (!(!here(LineTerminator))) throw FailedPredicateException(this, "!here(LineTerminator)")
					this.state = 575
					match(PlusPlus) as Token
					}}
					20 -> {if (true){
					_localctx = PostDecreaseExpressionContext(SingleExpressionContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_singleExpression.id)
					this.state = 576
					if (!(precpred(context!!, 31))) throw FailedPredicateException(this, "precpred(context!!, 31)")
					this.state = 577
					if (!(!here(LineTerminator))) throw FailedPredicateException(this, "!here(LineTerminator)")
					this.state = 578
					match(MinusMinus) as Token
					}}
					}
					} 
				}
				this.state = 583
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,48,context)
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

	open class AssignmentOperatorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_assignmentOperator.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterAssignmentOperator(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitAssignmentOperator(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitAssignmentOperator(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  assignmentOperator() : AssignmentOperatorContext {
		var _localctx : AssignmentOperatorContext = AssignmentOperatorContext(context, state)
		enterRule(_localctx, 88, Rules.RULE_assignmentOperator.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 584
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl MultiplyAssign) or (1L shl DivideAssign) or (1L shl ModulusAssign) or (1L shl PlusAssign) or (1L shl MinusAssign) or (1L shl LeftShiftArithmeticAssign) or (1L shl RightShiftArithmeticAssign) or (1L shl RightShiftLogicalAssign) or (1L shl BitAndAssign) or (1L shl BitXorAssign) or (1L shl BitOrAssign))) != 0L)) ) {
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

	open class LiteralContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_literal.id
	        set(value) { throw RuntimeException() }
		fun NullLiteral() : TerminalNode? = getToken(ECMAScriptParser.Tokens.NullLiteral.id, 0)
		fun BooleanLiteral() : TerminalNode? = getToken(ECMAScriptParser.Tokens.BooleanLiteral.id, 0)
		fun StringLiteral() : TerminalNode? = getToken(ECMAScriptParser.Tokens.StringLiteral.id, 0)
		fun RegularExpressionLiteral() : TerminalNode? = getToken(ECMAScriptParser.Tokens.RegularExpressionLiteral.id, 0)
		fun findNumericLiteral() : NumericLiteralContext? = getRuleContext(solver.getType("NumericLiteralContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterLiteral(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitLiteral(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitLiteral(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  literal() : LiteralContext {
		var _localctx : LiteralContext = LiteralContext(context, state)
		enterRule(_localctx, 90, Rules.RULE_literal.id)
		var _la: Int
		try {
			this.state = 588
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			RegularExpressionLiteral , NullLiteral , BooleanLiteral , StringLiteral  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 586
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl RegularExpressionLiteral) or (1L shl NullLiteral) or (1L shl BooleanLiteral))) != 0L) || _la==StringLiteral) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			DecimalLiteral , HexIntegerLiteral , OctalIntegerLiteral  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 587
			numericLiteral()
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

	open class NumericLiteralContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_numericLiteral.id
	        set(value) { throw RuntimeException() }
		fun DecimalLiteral() : TerminalNode? = getToken(ECMAScriptParser.Tokens.DecimalLiteral.id, 0)
		fun HexIntegerLiteral() : TerminalNode? = getToken(ECMAScriptParser.Tokens.HexIntegerLiteral.id, 0)
		fun OctalIntegerLiteral() : TerminalNode? = getToken(ECMAScriptParser.Tokens.OctalIntegerLiteral.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterNumericLiteral(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitNumericLiteral(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitNumericLiteral(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  numericLiteral() : NumericLiteralContext {
		var _localctx : NumericLiteralContext = NumericLiteralContext(context, state)
		enterRule(_localctx, 92, Rules.RULE_numericLiteral.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 590
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DecimalLiteral) or (1L shl HexIntegerLiteral) or (1L shl OctalIntegerLiteral))) != 0L)) ) {
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

	open class IdentifierNameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_identifierName.id
	        set(value) { throw RuntimeException() }
		fun Identifier() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Identifier.id, 0)
		fun findReservedWord() : ReservedWordContext? = getRuleContext(solver.getType("ReservedWordContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterIdentifierName(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitIdentifierName(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitIdentifierName(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  identifierName() : IdentifierNameContext {
		var _localctx : IdentifierNameContext = IdentifierNameContext(context, state)
		enterRule(_localctx, 94, Rules.RULE_identifierName.id)
		try {
			this.state = 594
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			Identifier  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 592
			match(Identifier) as Token
			}}
			NullLiteral , BooleanLiteral , Break , Do , Instanceof , Typeof , Case , Else , New , Var , Catch , Finally , Return , Void , Continue , For , Switch , While , Debugger , Function , This , With , Default , If , Throw , Delete , In , Try , Class , Enum , Extends , Super , Const , Export , Import , Implements , Let , Private , Public , Interface , Package , Protected , Static , Yield  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 593
			reservedWord()
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

	open class ReservedWordContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_reservedWord.id
	        set(value) { throw RuntimeException() }
		fun findKeyword() : KeywordContext? = getRuleContext(solver.getType("KeywordContext"),0)
		fun findFutureReservedWord() : FutureReservedWordContext? = getRuleContext(solver.getType("FutureReservedWordContext"),0)
		fun NullLiteral() : TerminalNode? = getToken(ECMAScriptParser.Tokens.NullLiteral.id, 0)
		fun BooleanLiteral() : TerminalNode? = getToken(ECMAScriptParser.Tokens.BooleanLiteral.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterReservedWord(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitReservedWord(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitReservedWord(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  reservedWord() : ReservedWordContext {
		var _localctx : ReservedWordContext = ReservedWordContext(context, state)
		enterRule(_localctx, 96, Rules.RULE_reservedWord.id)
		var _la: Int
		try {
			this.state = 599
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			Break , Do , Instanceof , Typeof , Case , Else , New , Var , Catch , Finally , Return , Void , Continue , For , Switch , While , Debugger , Function , This , With , Default , If , Throw , Delete , In , Try  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 596
			keyword()
			}}
			Class , Enum , Extends , Super , Const , Export , Import , Implements , Let , Private , Public , Interface , Package , Protected , Static , Yield  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 597
			futureReservedWord()
			}}
			NullLiteral , BooleanLiteral  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 598
			_la = _input!!.LA(1)
			if ( !(_la==NullLiteral || _la==BooleanLiteral) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
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

	open class KeywordContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_keyword.id
	        set(value) { throw RuntimeException() }
		fun Break() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Break.id, 0)
		fun Do() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Do.id, 0)
		fun Instanceof() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Instanceof.id, 0)
		fun Typeof() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Typeof.id, 0)
		fun Case() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Case.id, 0)
		fun Else() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Else.id, 0)
		fun New() : TerminalNode? = getToken(ECMAScriptParser.Tokens.New.id, 0)
		fun Var() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Var.id, 0)
		fun Catch() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Catch.id, 0)
		fun Finally() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Finally.id, 0)
		fun Return() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Return.id, 0)
		fun Void() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Void.id, 0)
		fun Continue() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Continue.id, 0)
		fun For() : TerminalNode? = getToken(ECMAScriptParser.Tokens.For.id, 0)
		fun Switch() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Switch.id, 0)
		fun While() : TerminalNode? = getToken(ECMAScriptParser.Tokens.While.id, 0)
		fun Debugger() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Debugger.id, 0)
		fun Function() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Function.id, 0)
		fun This() : TerminalNode? = getToken(ECMAScriptParser.Tokens.This.id, 0)
		fun With() : TerminalNode? = getToken(ECMAScriptParser.Tokens.With.id, 0)
		fun Default() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Default.id, 0)
		fun If() : TerminalNode? = getToken(ECMAScriptParser.Tokens.If.id, 0)
		fun Throw() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Throw.id, 0)
		fun Delete() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Delete.id, 0)
		fun In() : TerminalNode? = getToken(ECMAScriptParser.Tokens.In.id, 0)
		fun Try() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Try.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterKeyword(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitKeyword(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitKeyword(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  keyword() : KeywordContext {
		var _localctx : KeywordContext = KeywordContext(context, state)
		enterRule(_localctx, 98, Rules.RULE_keyword.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 601
			_la = _input!!.LA(1)
			if ( !(((((_la - 56)) and 0x3f.inv()) == 0 && ((1L shl (_la - 56)) and ((1L shl (Break - 56)) or (1L shl (Do - 56)) or (1L shl (Instanceof - 56)) or (1L shl (Typeof - 56)) or (1L shl (Case - 56)) or (1L shl (Else - 56)) or (1L shl (New - 56)) or (1L shl (Var - 56)) or (1L shl (Catch - 56)) or (1L shl (Finally - 56)) or (1L shl (Return - 56)) or (1L shl (Void - 56)) or (1L shl (Continue - 56)) or (1L shl (For - 56)) or (1L shl (Switch - 56)) or (1L shl (While - 56)) or (1L shl (Debugger - 56)) or (1L shl (Function - 56)) or (1L shl (This - 56)) or (1L shl (With - 56)) or (1L shl (Default - 56)) or (1L shl (If - 56)) or (1L shl (Throw - 56)) or (1L shl (Delete - 56)) or (1L shl (In - 56)) or (1L shl (Try - 56)))) != 0L)) ) {
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

	open class FutureReservedWordContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_futureReservedWord.id
	        set(value) { throw RuntimeException() }
		fun Class() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Class.id, 0)
		fun Enum() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Enum.id, 0)
		fun Extends() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Extends.id, 0)
		fun Super() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Super.id, 0)
		fun Const() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Const.id, 0)
		fun Export() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Export.id, 0)
		fun Import() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Import.id, 0)
		fun Implements() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Implements.id, 0)
		fun Let() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Let.id, 0)
		fun Private() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Private.id, 0)
		fun Public() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Public.id, 0)
		fun Interface() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Interface.id, 0)
		fun Package() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Package.id, 0)
		fun Protected() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Protected.id, 0)
		fun Static() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Static.id, 0)
		fun Yield() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Yield.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterFutureReservedWord(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitFutureReservedWord(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitFutureReservedWord(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  futureReservedWord() : FutureReservedWordContext {
		var _localctx : FutureReservedWordContext = FutureReservedWordContext(context, state)
		enterRule(_localctx, 100, Rules.RULE_futureReservedWord.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 603
			_la = _input!!.LA(1)
			if ( !(((((_la - 82)) and 0x3f.inv()) == 0 && ((1L shl (_la - 82)) and ((1L shl (Class - 82)) or (1L shl (Enum - 82)) or (1L shl (Extends - 82)) or (1L shl (Super - 82)) or (1L shl (Const - 82)) or (1L shl (Export - 82)) or (1L shl (Import - 82)) or (1L shl (Implements - 82)) or (1L shl (Let - 82)) or (1L shl (Private - 82)) or (1L shl (Public - 82)) or (1L shl (Interface - 82)) or (1L shl (Package - 82)) or (1L shl (Protected - 82)) or (1L shl (Static - 82)) or (1L shl (Yield - 82)))) != 0L)) ) {
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

	open class GetterContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_getter.id
	        set(value) { throw RuntimeException() }
		fun Identifier() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Identifier.id, 0)
		fun findPropertyName() : PropertyNameContext? = getRuleContext(solver.getType("PropertyNameContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterGetter(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitGetter(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitGetter(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  getter() : GetterContext {
		var _localctx : GetterContext = GetterContext(context, state)
		enterRule(_localctx, 102, Rules.RULE_getter.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 605
			if (!(_input.Lt(1).Text.Equals("get"))) throw FailedPredicateException(this, "_input.Lt(1).Text.Equals(\"get\")")
			this.state = 606
			match(Identifier) as Token
			this.state = 607
			propertyName()
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

	open class SetterContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_setter.id
	        set(value) { throw RuntimeException() }
		fun Identifier() : TerminalNode? = getToken(ECMAScriptParser.Tokens.Identifier.id, 0)
		fun findPropertyName() : PropertyNameContext? = getRuleContext(solver.getType("PropertyNameContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterSetter(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitSetter(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitSetter(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  setter() : SetterContext {
		var _localctx : SetterContext = SetterContext(context, state)
		enterRule(_localctx, 104, Rules.RULE_setter.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 609
			if (!(_input.Lt(1).Text.Equals("set"))) throw FailedPredicateException(this, "_input.Lt(1).Text.Equals(\"set\")")
			this.state = 610
			match(Identifier) as Token
			this.state = 611
			propertyName()
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

	open class EosContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_eos.id
	        set(value) { throw RuntimeException() }
		fun SemiColon() : TerminalNode? = getToken(ECMAScriptParser.Tokens.SemiColon.id, 0)
		fun EOF() : TerminalNode? = getToken(ECMAScriptParser.Tokens.EOF.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterEos(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitEos(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitEos(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  eos() : EosContext {
		var _localctx : EosContext = EosContext(context, state)
		enterRule(_localctx, 106, Rules.RULE_eos.id)
		try {
			this.state = 617
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,52,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 613
			match(SemiColon) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 614
			match(EOF) as Token
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 615
			if (!(lineTerminatorAhead())) throw FailedPredicateException(this, "lineTerminatorAhead()")
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 616
			if (!(_input.Lt(1).Type == CloseBrace)) throw FailedPredicateException(this, "_input.Lt(1).Type == CloseBrace")
			}}
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

	open class EofContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_eof.id
	        set(value) { throw RuntimeException() }
		fun EOF() : TerminalNode? = getToken(ECMAScriptParser.Tokens.EOF.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).enterEof(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is ECMAScriptListener ) (listener as ECMAScriptListener).exitEof(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is ECMAScriptVisitor ) return (visitor as ECMAScriptVisitor<out T>).visitEof(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  eof() : EofContext {
		var _localctx : EofContext = EofContext(context, state)
		enterRule(_localctx, 108, Rules.RULE_eof.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 619
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

	override fun sempred(_localctx: RuleContext?, ruleIndex: Int, predIndex: Int) : Boolean {
		when (ruleIndex) {
		11 -> return expressionStatement_sempred(_localctx as ExpressionStatementContext, predIndex)
		14 -> return continueStatement_sempred(_localctx as ContinueStatementContext, predIndex)
		15 -> return breakStatement_sempred(_localctx as BreakStatementContext, predIndex)
		16 -> return returnStatement_sempred(_localctx as ReturnStatementContext, predIndex)
		24 -> return throwStatement_sempred(_localctx as ThrowStatementContext, predIndex)
		43 -> return singleExpression_sempred(_localctx as SingleExpressionContext, predIndex)
		51 -> return getter_sempred(_localctx as GetterContext, predIndex)
		52 -> return setter_sempred(_localctx as SetterContext, predIndex)
		53 -> return eos_sempred(_localctx as EosContext, predIndex)
		}
		return true
	}
	private fun expressionStatement_sempred( _localctx : ExpressionStatementContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    0 -> return (_input.La(1) != OpenBrace) && (_input.La(1) != Function)
		}
		return true
	}
	private fun continueStatement_sempred( _localctx : ContinueStatementContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    1 -> return !here(LineTerminator)
		}
		return true
	}
	private fun breakStatement_sempred( _localctx : BreakStatementContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    2 -> return !here(LineTerminator)
		}
		return true
	}
	private fun returnStatement_sempred( _localctx : ReturnStatementContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    3 -> return !here(LineTerminator)
		}
		return true
	}
	private fun throwStatement_sempred( _localctx : ThrowStatementContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    4 -> return !here(LineTerminator)
		}
		return true
	}
	private fun singleExpression_sempred( _localctx : SingleExpressionContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    5 -> return precpred(context!!, 21)
		    6 -> return precpred(context!!, 20)
		    7 -> return precpred(context!!, 19)
		    8 -> return precpred(context!!, 18)
		    9 -> return precpred(context!!, 17)
		    10 -> return precpred(context!!, 16)
		    11 -> return precpred(context!!, 15)
		    12 -> return precpred(context!!, 14)
		    13 -> return precpred(context!!, 13)
		    14 -> return precpred(context!!, 12)
		    15 -> return precpred(context!!, 11)
		    16 -> return precpred(context!!, 10)
		    17 -> return precpred(context!!, 9)
		    18 -> return precpred(context!!, 8)
		    19 -> return precpred(context!!, 7)
		    20 -> return precpred(context!!, 36)
		    21 -> return precpred(context!!, 35)
		    22 -> return precpred(context!!, 34)
		    23 -> return precpred(context!!, 32)
		    24 -> return !here(LineTerminator)
		    25 -> return precpred(context!!, 31)
		    26 -> return !here(LineTerminator)
		}
		return true
	}
	private fun getter_sempred( _localctx : GetterContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    27 -> return _input.Lt(1).Text.Equals("get")
		}
		return true
	}
	private fun setter_sempred( _localctx : SetterContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    28 -> return _input.Lt(1).Text.Equals("set")
		}
		return true
	}
	private fun eos_sempred( _localctx : EosContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    29 -> return lineTerminatorAhead()
		    30 -> return _input.Lt(1).Type == CloseBrace
		}
		return true
	}

}