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

class COOLParser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(COOLParser.ProgramContext::class,
                                                              COOLParser.ProgramBlocksContext::class,
                                                              COOLParser.ClassDefineContext::class,
                                                              COOLParser.FeatureContext::class,
                                                              COOLParser.FormalContext::class,
                                                              COOLParser.ExpressionContext::class)
    }

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "COOL.g4"

    override val tokenNames: Array<String?>?
        get() = COOLParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = COOLParser.Companion.ruleNames
    override val atn: ATN
        get() = COOLParser.Companion.ATN

    enum class Tokens(val id: Int) {
        EOF(-1),
        T__0(1),
        T__1(2),
        T__2(3),
        T__3(4),
        T__4(5),
        T__5(6),
        T__6(7),
        T__7(8),
        T__8(9),
        CLASS(10),
        ELSE(11),
        FALSE(12),
        FI(13),
        IF(14),
        IN(15),
        INHERITS(16),
        ISVOID(17),
        LET(18),
        LOOP(19),
        POOL(20),
        THEN(21),
        WHILE(22),
        CASE(23),
        ESAC(24),
        NEW(25),
        OF(26),
        NOT(27),
        TRUE(28),
        STRING(29),
        INT(30),
        TYPEID(31),
        OBJECTID(32),
        ASSIGNMENT(33),
        CASE_ARROW(34),
        ADD(35),
        MINUS(36),
        MULTIPLY(37),
        DIVISION(38),
        LESS_THAN(39),
        LESS_EQUAL(40),
        EQUAL(41),
        INTEGER_NEGATIVE(42),
        OPEN_COMMENT(43),
        CLOSE_COMMENT(44),
        COMMENT(45),
        ONE_LINE_COMMENT(46),
        WHITESPACE(47)
    }

    enum class Rules(val id: Int) {
        RULE_program(0),
        RULE_programBlocks(1),
        RULE_classDefine(2),
        RULE_feature(3),
        RULE_formal(4),
        RULE_expression(5)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("program", "programBlocks", "classDefine", 
                                "feature", "formal", "expression")

        private val LITERAL_NAMES = Arrays.asList<String?>(null, "';'", 
                                                           "'{'", "'}'", 
                                                           "'('", "','", 
                                                           "')'", "':'", 
                                                           "'@'", "'.'", 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, "'<-'", 
                                                           "'=>'", "'+'", 
                                                           "'-'", "'*'", 
                                                           "'/'", "'<'", 
                                                           "'<='", "'='", 
                                                           "'~'", "'(*'", 
                                                           "'*)'")
        private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            "CLASS", "ELSE", 
                                                            "FALSE", "FI", 
                                                            "IF", "IN", 
                                                            "INHERITS", 
                                                            "ISVOID", "LET", 
                                                            "LOOP", "POOL", 
                                                            "THEN", "WHILE", 
                                                            "CASE", "ESAC", 
                                                            "NEW", "OF", 
                                                            "NOT", "TRUE", 
                                                            "STRING", "INT", 
                                                            "TYPEID", "OBJECTID", 
                                                            "ASSIGNMENT", 
                                                            "CASE_ARROW", 
                                                            "ADD", "MINUS", 
                                                            "MULTIPLY", 
                                                            "DIVISION", 
                                                            "LESS_THAN", 
                                                            "LESS_EQUAL", 
                                                            "EQUAL", "INTEGER_NEGATIVE", 
                                                            "OPEN_COMMENT", 
                                                            "CLOSE_COMMENT", 
                                                            "COMMENT", "ONE_LINE_COMMENT", 
                                                            "WHITESPACE")

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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u0031\u00e2\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0005\u0003\u0016\u000a\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0005\u0004\u001c\u000a\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0007\u0004\u0022\u000a\u0004\u000c\u0004\u000e\u0004\u0025\u000b\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0007\u0005\u002e\u000a\u0005\u000c\u0005\u000e\u0005\u0031\u000b\u0005\u0007\u0005\u0033\u000a\u0005\u000c\u0005\u000e\u0005\u0036\u000b\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005\u0044\u000a\u0005\u0005\u0005\u0046\u000a\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0007\u0007\u0052\u000a\u0007\u000c\u0007\u000e\u0007\u0055\u000b\u0007\u0007\u0007\u0057\u000a\u0007\u000c\u0007\u000e\u0007\u005a\u000b\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0006\u0007\u006f\u000a\u0007\u000d\u0007\u000e\u0007\u0070\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0005\u0007\u007b\u000a\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0005\u0007\u0083\u000a\u0007\u0007\u0007\u0085\u000a\u0007\u000c\u0007\u000e\u0007\u0088\u000b\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0006\u0007\u0096\u000a\u0007\u000d\u0007\u000e\u0007\u0097\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0005\u0007\u00b0\u000a\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0005\u0007\u00ca\u000a\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0007\u0007\u00d2\u000a\u0007\u000c\u0007\u000e\u0007\u00d5\u000b\u0007\u0007\u0007\u00d7\u000a\u0007\u000c\u0007\u000e\u0007\u00da\u000b\u0007\u0003\u0007\u0007\u0007\u00dd\u000a\u0007\u000c\u0007\u000e\u0007\u00e0\u000b\u0007\u0003\u0007\u0002\u0003\u000c\u0008\u0002\u0004\u0006\u0008\u000a\u000c\u0002\u0002\u0002\u0104\u0002\u000e\u0003\u0002\u0002\u0002\u0004\u0015\u0003\u0002\u0002\u0002\u0006\u0017\u0003\u0002\u0002\u0002\u0008\u0045\u0003\u0002\u0002\u0002\u000a\u0047\u0003\u0002\u0002\u0002\u000c\u00af\u0003\u0002\u0002\u0002\u000e\u000f\u0005\u0004\u0003\u0002\u000f\u0003\u0003\u0002\u0002\u0002\u0010\u0011\u0005\u0006\u0004\u0002\u0011\u0012\u0007\u0003\u0002\u0002\u0012\u0013\u0005\u0004\u0003\u0002\u0013\u0016\u0003\u0002\u0002\u0002\u0014\u0016\u0007\u0002\u0002\u0003\u0015\u0010\u0003\u0002\u0002\u0002\u0015\u0014\u0003\u0002\u0002\u0002\u0016\u0005\u0003\u0002\u0002\u0002\u0017\u0018\u0007\u000c\u0002\u0002\u0018\u001b\u0007\u0021\u0002\u0002\u0019\u001a\u0007\u0012\u0002\u0002\u001a\u001c\u0007\u0021\u0002\u0002\u001b\u0019\u0003\u0002\u0002\u0002\u001b\u001c\u0003\u0002\u0002\u0002\u001c\u001d\u0003\u0002\u0002\u0002\u001d\u0023\u0007\u0004\u0002\u0002\u001e\u001f\u0005\u0008\u0005\u0002\u001f\u0020\u0007\u0003\u0002\u0002\u0020\u0022\u0003\u0002\u0002\u0002\u0021\u001e\u0003\u0002\u0002\u0002\u0022\u0025\u0003\u0002\u0002\u0002\u0023\u0021\u0003\u0002\u0002\u0002\u0023\u0024\u0003\u0002\u0002\u0002\u0024\u0026\u0003\u0002\u0002\u0002\u0025\u0023\u0003\u0002\u0002\u0002\u0026\u0027\u0007\u0005\u0002\u0002\u0027\u0007\u0003\u0002\u0002\u0002\u0028\u0029\u0007\u0022\u0002\u0002\u0029\u0034\u0007\u0006\u0002\u0002\u002a\u002f\u0005\u000a\u0006\u0002\u002b\u002c\u0007\u0007\u0002\u0002\u002c\u002e\u0005\u000a\u0006\u0002\u002d\u002b\u0003\u0002\u0002\u0002\u002e\u0031\u0003\u0002\u0002\u0002\u002f\u002d\u0003\u0002\u0002\u0002\u002f\u0030\u0003\u0002\u0002\u0002\u0030\u0033\u0003\u0002\u0002\u0002\u0031\u002f\u0003\u0002\u0002\u0002\u0032\u002a\u0003\u0002\u0002\u0002\u0033\u0036\u0003\u0002\u0002\u0002\u0034\u0032\u0003\u0002\u0002\u0002\u0034\u0035\u0003\u0002\u0002\u0002\u0035\u0037\u0003\u0002\u0002\u0002\u0036\u0034\u0003\u0002\u0002\u0002\u0037\u0038\u0007\u0008\u0002\u0002\u0038\u0039\u0007\u0009\u0002\u0002\u0039\u003a\u0007\u0021\u0002\u0002\u003a\u003b\u0007\u0004\u0002\u0002\u003b\u003c\u0005\u000c\u0007\u0002\u003c\u003d\u0007\u0005\u0002\u0002\u003d\u0046\u0003\u0002\u0002\u0002\u003e\u003f\u0007\u0022\u0002\u0002\u003f\u0040\u0007\u0009\u0002\u0002\u0040\u0043\u0007\u0021\u0002\u0002\u0041\u0042\u0007\u0023\u0002\u0002\u0042\u0044\u0005\u000c\u0007\u0002\u0043\u0041\u0003\u0002\u0002\u0002\u0043\u0044\u0003\u0002\u0002\u0002\u0044\u0046\u0003\u0002\u0002\u0002\u0045\u0028\u0003\u0002\u0002\u0002\u0045\u003e\u0003\u0002\u0002\u0002\u0046\u0009\u0003\u0002\u0002\u0002\u0047\u0048\u0007\u0022\u0002\u0002\u0048\u0049\u0007\u0009\u0002\u0002\u0049\u004a\u0007\u0021\u0002\u0002\u004a\u000b\u0003\u0002\u0002\u0002\u004b\u004c\u0008\u0007\u0001\u0002\u004c\u004d\u0007\u0022\u0002\u0002\u004d\u0058\u0007\u0006\u0002\u0002\u004e\u0053\u0005\u000c\u0007\u0002\u004f\u0050\u0007\u0007\u0002\u0002\u0050\u0052\u0005\u000c\u0007\u0002\u0051\u004f\u0003\u0002\u0002\u0002\u0052\u0055\u0003\u0002\u0002\u0002\u0053\u0051\u0003\u0002\u0002\u0002\u0053\u0054\u0003\u0002\u0002\u0002\u0054\u0057\u0003\u0002\u0002\u0002\u0055\u0053\u0003\u0002\u0002\u0002\u0056\u004e\u0003\u0002\u0002\u0002\u0057\u005a\u0003\u0002\u0002\u0002\u0058\u0056\u0003\u0002\u0002\u0002\u0058\u0059\u0003\u0002\u0002\u0002\u0059\u005b\u0003\u0002\u0002\u0002\u005a\u0058\u0003\u0002\u0002\u0002\u005b\u00b0\u0007\u0008\u0002\u0002\u005c\u005d\u0007\u0010\u0002\u0002\u005d\u005e\u0005\u000c\u0007\u0002\u005e\u005f\u0007\u0017\u0002\u0002\u005f\u0060\u0005\u000c\u0007\u0002\u0060\u0061\u0007\u000d\u0002\u0002\u0061\u0062\u0005\u000c\u0007\u0002\u0062\u0063\u0007\u000f\u0002\u0002\u0063\u00b0\u0003\u0002\u0002\u0002\u0064\u0065\u0007\u0018\u0002\u0002\u0065\u0066\u0005\u000c\u0007\u0002\u0066\u0067\u0007\u0015\u0002\u0002\u0067\u0068\u0005\u000c\u0007\u0002\u0068\u0069\u0007\u0016\u0002\u0002\u0069\u00b0\u0003\u0002\u0002\u0002\u006a\u006e\u0007\u0004\u0002\u0002\u006b\u006c\u0005\u000c\u0007\u0002\u006c\u006d\u0007\u0003\u0002\u0002\u006d\u006f\u0003\u0002\u0002\u0002\u006e\u006b\u0003\u0002\u0002\u0002\u006f\u0070\u0003\u0002\u0002\u0002\u0070\u006e\u0003\u0002\u0002\u0002\u0070\u0071\u0003\u0002\u0002\u0002\u0071\u0072\u0003\u0002\u0002\u0002\u0072\u0073\u0007\u0005\u0002\u0002\u0073\u00b0\u0003\u0002\u0002\u0002\u0074\u0075\u0007\u0014\u0002\u0002\u0075\u0076\u0007\u0022\u0002\u0002\u0076\u0077\u0007\u0009\u0002\u0002\u0077\u007a\u0007\u0021\u0002\u0002\u0078\u0079\u0007\u0023\u0002\u0002\u0079\u007b\u0005\u000c\u0007\u0002\u007a\u0078\u0003\u0002\u0002\u0002\u007a\u007b\u0003\u0002\u0002\u0002\u007b\u0086\u0003\u0002\u0002\u0002\u007c\u007d\u0007\u0007\u0002\u0002\u007d\u007e\u0007\u0022\u0002\u0002\u007e\u007f\u0007\u0009\u0002\u0002\u007f\u0082\u0007\u0021\u0002\u0002\u0080\u0081\u0007\u0023\u0002\u0002\u0081\u0083\u0005\u000c\u0007\u0002\u0082\u0080\u0003\u0002\u0002\u0002\u0082\u0083\u0003\u0002\u0002\u0002\u0083\u0085\u0003\u0002\u0002\u0002\u0084\u007c\u0003\u0002\u0002\u0002\u0085\u0088\u0003\u0002\u0002\u0002\u0086\u0084\u0003\u0002\u0002\u0002\u0086\u0087\u0003\u0002\u0002\u0002\u0087\u0089\u0003\u0002\u0002\u0002\u0088\u0086\u0003\u0002\u0002\u0002\u0089\u008a\u0007\u0011\u0002\u0002\u008a\u00b0\u0005\u000c\u0007\u0016\u008b\u008c\u0007\u0019\u0002\u0002\u008c\u008d\u0005\u000c\u0007\u0002\u008d\u0095\u0007\u001c\u0002\u0002\u008e\u008f\u0007\u0022\u0002\u0002\u008f\u0090\u0007\u0009\u0002\u0002\u0090\u0091\u0007\u0021\u0002\u0002\u0091\u0092\u0007\u0024\u0002\u0002\u0092\u0093\u0005\u000c\u0007\u0002\u0093\u0094\u0007\u0003\u0002\u0002\u0094\u0096\u0003\u0002\u0002\u0002\u0095\u008e\u0003\u0002\u0002\u0002\u0096\u0097\u0003\u0002\u0002\u0002\u0097\u0095\u0003\u0002\u0002\u0002\u0097\u0098\u0003\u0002\u0002\u0002\u0098\u0099\u0003\u0002\u0002\u0002\u0099\u009a\u0007\u001a\u0002\u0002\u009a\u00b0\u0003\u0002\u0002\u0002\u009b\u009c\u0007\u001b\u0002\u0002\u009c\u00b0\u0007\u0021\u0002\u0002\u009d\u009e\u0007\u002c\u0002\u0002\u009e\u00b0\u0005\u000c\u0007\u0013\u009f\u00a0\u0007\u0013\u0002\u0002\u00a0\u00b0\u0005\u000c\u0007\u0012\u00a1\u00a2\u0007\u001d\u0002\u0002\u00a2\u00b0\u0005\u000c\u0007\u000a\u00a3\u00a4\u0007\u0006\u0002\u0002\u00a4\u00a5\u0005\u000c\u0007\u0002\u00a5\u00a6\u0007\u0008\u0002\u0002\u00a6\u00b0\u0003\u0002\u0002\u0002\u00a7\u00b0\u0007\u0022\u0002\u0002\u00a8\u00b0\u0007\u0020\u0002\u0002\u00a9\u00b0\u0007\u001f\u0002\u0002\u00aa\u00b0\u0007\u001e\u0002\u0002\u00ab\u00b0\u0007\u000e\u0002\u0002\u00ac\u00ad\u0007\u0022\u0002\u0002\u00ad\u00ae\u0007\u0023\u0002\u0002\u00ae\u00b0\u0005\u000c\u0007\u0003\u00af\u004b\u0003\u0002\u0002\u0002\u00af\u005c\u0003\u0002\u0002\u0002\u00af\u0064\u0003\u0002\u0002\u0002\u00af\u006a\u0003\u0002\u0002\u0002\u00af\u0074\u0003\u0002\u0002\u0002\u00af\u008b\u0003\u0002\u0002\u0002\u00af\u009b\u0003\u0002\u0002\u0002\u00af\u009d\u0003\u0002\u0002\u0002\u00af\u009f\u0003\u0002\u0002\u0002\u00af\u00a1\u0003\u0002\u0002\u0002\u00af\u00a3\u0003\u0002\u0002\u0002\u00af\u00a7\u0003\u0002\u0002\u0002\u00af\u00a8\u0003\u0002\u0002\u0002\u00af\u00a9\u0003\u0002\u0002\u0002\u00af\u00aa\u0003\u0002\u0002\u0002\u00af\u00ab\u0003\u0002\u0002\u0002\u00af\u00ac\u0003\u0002\u0002\u0002\u00b0\u00de\u0003\u0002\u0002\u0002\u00b1\u00b2\u000c\u0011\u0002\u0002\u00b2\u00b3\u0007\u0027\u0002\u0002\u00b3\u00dd\u0005\u000c\u0007\u0012\u00b4\u00b5\u000c\u0010\u0002\u0002\u00b5\u00b6\u0007\u0028\u0002\u0002\u00b6\u00dd\u0005\u000c\u0007\u0011\u00b7\u00b8\u000c\u000f\u0002\u0002\u00b8\u00b9\u0007\u0025\u0002\u0002\u00b9\u00dd\u0005\u000c\u0007\u0010\u00ba\u00bb\u000c\u000e\u0002\u0002\u00bb\u00bc\u0007\u0026\u0002\u0002\u00bc\u00dd\u0005\u000c\u0007\u000f\u00bd\u00be\u000c\u000d\u0002\u0002\u00be\u00bf\u0007\u0029\u0002\u0002\u00bf\u00dd\u0005\u000c\u0007\u000e\u00c0\u00c1\u000c\u000c\u0002\u0002\u00c1\u00c2\u0007\u002a\u0002\u0002\u00c2\u00dd\u0005\u000c\u0007\u000d\u00c3\u00c4\u000c\u000b\u0002\u0002\u00c4\u00c5\u0007\u002b\u0002\u0002\u00c5\u00dd\u0005\u000c\u0007\u000c\u00c6\u00c9\u000c\u001b\u0002\u0002\u00c7\u00c8\u0007\u000a\u0002\u0002\u00c8\u00ca\u0007\u0021\u0002\u0002\u00c9\u00c7\u0003\u0002\u0002\u0002\u00c9\u00ca\u0003\u0002\u0002\u0002\u00ca\u00cb\u0003\u0002\u0002\u0002\u00cb\u00cc\u0007\u000b\u0002\u0002\u00cc\u00cd\u0007\u0022\u0002\u0002\u00cd\u00d8\u0007\u0006\u0002\u0002\u00ce\u00d3\u0005\u000c\u0007\u0002\u00cf\u00d0\u0007\u0007\u0002\u0002\u00d0\u00d2\u0005\u000c\u0007\u0002\u00d1\u00cf\u0003\u0002\u0002\u0002\u00d2\u00d5\u0003\u0002\u0002\u0002\u00d3\u00d1\u0003\u0002\u0002\u0002\u00d3\u00d4\u0003\u0002\u0002\u0002\u00d4\u00d7\u0003\u0002\u0002\u0002\u00d5\u00d3\u0003\u0002\u0002\u0002\u00d6\u00ce\u0003\u0002\u0002\u0002\u00d7\u00da\u0003\u0002\u0002\u0002\u00d8\u00d6\u0003\u0002\u0002\u0002\u00d8\u00d9\u0003\u0002\u0002\u0002\u00d9\u00db\u0003\u0002\u0002\u0002\u00da\u00d8\u0003\u0002\u0002\u0002\u00db\u00dd\u0007\u0008\u0002\u0002\u00dc\u00b1\u0003\u0002\u0002\u0002\u00dc\u00b4\u0003\u0002\u0002\u0002\u00dc\u00b7\u0003\u0002\u0002\u0002\u00dc\u00ba\u0003\u0002\u0002\u0002\u00dc\u00bd\u0003\u0002\u0002\u0002\u00dc\u00c0\u0003\u0002\u0002\u0002\u00dc\u00c3\u0003\u0002\u0002\u0002\u00dc\u00c6\u0003\u0002\u0002\u0002\u00dd\u00e0\u0003\u0002\u0002\u0002\u00de\u00dc\u0003\u0002\u0002\u0002\u00de\u00df\u0003\u0002\u0002\u0002\u00df\u000d\u0003\u0002\u0002\u0002\u00e0\u00de\u0003\u0002\u0002\u0002\u0016\u0015\u001b\u0023\u002f\u0034\u0043\u0045\u0053\u0058\u0070\u007a\u0082\u0086\u0097\u00af\u00c9\u00d3\u00d8\u00dc\u00de"

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
    private val T__5 = Tokens.T__5.id
    private val T__6 = Tokens.T__6.id
    private val T__7 = Tokens.T__7.id
    private val T__8 = Tokens.T__8.id
    private val CLASS = Tokens.CLASS.id
    private val ELSE = Tokens.ELSE.id
    private val FALSE = Tokens.FALSE.id
    private val FI = Tokens.FI.id
    private val IF = Tokens.IF.id
    private val IN = Tokens.IN.id
    private val INHERITS = Tokens.INHERITS.id
    private val ISVOID = Tokens.ISVOID.id
    private val LET = Tokens.LET.id
    private val LOOP = Tokens.LOOP.id
    private val POOL = Tokens.POOL.id
    private val THEN = Tokens.THEN.id
    private val WHILE = Tokens.WHILE.id
    private val CASE = Tokens.CASE.id
    private val ESAC = Tokens.ESAC.id
    private val NEW = Tokens.NEW.id
    private val OF = Tokens.OF.id
    private val NOT = Tokens.NOT.id
    private val TRUE = Tokens.TRUE.id
    private val STRING = Tokens.STRING.id
    private val INT = Tokens.INT.id
    private val TYPEID = Tokens.TYPEID.id
    private val OBJECTID = Tokens.OBJECTID.id
    private val ASSIGNMENT = Tokens.ASSIGNMENT.id
    private val CASE_ARROW = Tokens.CASE_ARROW.id
    private val ADD = Tokens.ADD.id
    private val MINUS = Tokens.MINUS.id
    private val MULTIPLY = Tokens.MULTIPLY.id
    private val DIVISION = Tokens.DIVISION.id
    private val LESS_THAN = Tokens.LESS_THAN.id
    private val LESS_EQUAL = Tokens.LESS_EQUAL.id
    private val EQUAL = Tokens.EQUAL.id
    private val INTEGER_NEGATIVE = Tokens.INTEGER_NEGATIVE.id
    private val OPEN_COMMENT = Tokens.OPEN_COMMENT.id
    private val CLOSE_COMMENT = Tokens.CLOSE_COMMENT.id
    private val COMMENT = Tokens.COMMENT.id
    private val ONE_LINE_COMMENT = Tokens.ONE_LINE_COMMENT.id
    private val WHITESPACE = Tokens.WHITESPACE.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class ProgramContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_program.id
	        set(value) { throw RuntimeException() }
		fun findProgramBlocks() : ProgramBlocksContext? = getRuleContext(solver.getType("ProgramBlocksContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).enterProgram(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).exitProgram(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is COOLVisitor ) return (visitor as COOLVisitor<out T>).visitProgram(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  program() : ProgramContext {
		var _localctx : ProgramContext = ProgramContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_program.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 12
			programBlocks()
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

	open class ProgramBlocksContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_programBlocks.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	 
		constructor() : super() { }
		fun copyFrom(ctx: ProgramBlocksContext) {
			super.copyFrom(ctx)
		}
	}
	open class ClassesContext : ProgramBlocksContext {
		fun findClassDefine() : ClassDefineContext? = getRuleContext(solver.getType("ClassDefineContext"),0)
		fun findProgramBlocks() : ProgramBlocksContext? = getRuleContext(solver.getType("ProgramBlocksContext"),0)
		constructor(ctx: ProgramBlocksContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).enterClasses(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).exitClasses(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is COOLVisitor ) return (visitor as COOLVisitor<out T>).visitClasses(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class EofContext : ProgramBlocksContext {
		fun EOF() : TerminalNode? = getToken(COOLParser.Tokens.EOF.id, 0)
		constructor(ctx: ProgramBlocksContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).enterEof(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).exitEof(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is COOLVisitor ) return (visitor as COOLVisitor<out T>).visitEof(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  programBlocks() : ProgramBlocksContext {
		var _localctx : ProgramBlocksContext = ProgramBlocksContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_programBlocks.id)
		try {
			this.state = 19
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			CLASS  ->  /*LL1AltBlock*/{_localctx = ClassesContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 14
			classDefine()
			this.state = 15
			match(T__0) as Token
			this.state = 16
			programBlocks()
			}}
			EOF  ->  /*LL1AltBlock*/{_localctx = EofContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 18
			match(EOF) as Token
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

	open class ClassDefineContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_classDefine.id
	        set(value) { throw RuntimeException() }
		fun CLASS() : TerminalNode? = getToken(COOLParser.Tokens.CLASS.id, 0)
		fun TYPEID() : List<TerminalNode> = getTokens(COOLParser.Tokens.TYPEID.id)
		fun TYPEID(i: Int) : TerminalNode = getToken(COOLParser.Tokens.TYPEID.id, i) as TerminalNode
		fun INHERITS() : TerminalNode? = getToken(COOLParser.Tokens.INHERITS.id, 0)
		fun findFeature() : List<FeatureContext> = getRuleContexts(solver.getType("FeatureContext"))
		fun findFeature(i: Int) : FeatureContext? = getRuleContext(solver.getType("FeatureContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).enterClassDefine(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).exitClassDefine(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is COOLVisitor ) return (visitor as COOLVisitor<out T>).visitClassDefine(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  classDefine() : ClassDefineContext {
		var _localctx : ClassDefineContext = ClassDefineContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_classDefine.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 21
			match(CLASS) as Token
			this.state = 22
			match(TYPEID) as Token
			this.state = 25
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==INHERITS) {
				if (true){
				this.state = 23
				match(INHERITS) as Token
				this.state = 24
				match(TYPEID) as Token
				}
			}

			this.state = 27
			match(T__1) as Token
			this.state = 33
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==OBJECTID) {
				if (true){
				if (true){
				this.state = 28
				feature()
				this.state = 29
				match(T__0) as Token
				}
				}
				this.state = 35
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 36
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

	open class FeatureContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_feature.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	 
		constructor() : super() { }
		fun copyFrom(ctx: FeatureContext) {
			super.copyFrom(ctx)
		}
	}
	open class MethodContext : FeatureContext {
		fun OBJECTID() : TerminalNode? = getToken(COOLParser.Tokens.OBJECTID.id, 0)
		fun TYPEID() : TerminalNode? = getToken(COOLParser.Tokens.TYPEID.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun findFormal() : List<FormalContext> = getRuleContexts(solver.getType("FormalContext"))
		fun findFormal(i: Int) : FormalContext? = getRuleContext(solver.getType("FormalContext"),i)
		constructor(ctx: FeatureContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).enterMethod(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).exitMethod(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is COOLVisitor ) return (visitor as COOLVisitor<out T>).visitMethod(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class PropertyContext : FeatureContext {
		fun OBJECTID() : TerminalNode? = getToken(COOLParser.Tokens.OBJECTID.id, 0)
		fun TYPEID() : TerminalNode? = getToken(COOLParser.Tokens.TYPEID.id, 0)
		fun ASSIGNMENT() : TerminalNode? = getToken(COOLParser.Tokens.ASSIGNMENT.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		constructor(ctx: FeatureContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).enterProperty(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).exitProperty(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is COOLVisitor ) return (visitor as COOLVisitor<out T>).visitProperty(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  feature() : FeatureContext {
		var _localctx : FeatureContext = FeatureContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_feature.id)
		var _la: Int
		try {
			this.state = 67
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,6,context) ) {
			1 -> {_localctx = MethodContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 38
			match(OBJECTID) as Token
			this.state = 39
			match(T__3) as Token
			this.state = 50
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==OBJECTID) {
				if (true){
				if (true){
				this.state = 40
				formal()
				this.state = 45
				errorHandler.sync(this);
				_la = _input!!.LA(1)
				while (_la==T__4) {
					if (true){
					if (true){
					this.state = 41
					match(T__4) as Token
					this.state = 42
					formal()
					}
					}
					this.state = 47
					errorHandler.sync(this)
					_la = _input!!.LA(1)
				}
				}
				}
				this.state = 52
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 53
			match(T__5) as Token
			this.state = 54
			match(T__6) as Token
			this.state = 55
			match(TYPEID) as Token
			this.state = 56
			match(T__1) as Token
			this.state = 57
			expression(0)
			this.state = 58
			match(T__2) as Token
			}}
			2 -> {_localctx = PropertyContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 60
			match(OBJECTID) as Token
			this.state = 61
			match(T__6) as Token
			this.state = 62
			match(TYPEID) as Token
			this.state = 65
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ASSIGNMENT) {
				if (true){
				this.state = 63
				match(ASSIGNMENT) as Token
				this.state = 64
				expression(0)
				}
			}

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

	open class FormalContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_formal.id
	        set(value) { throw RuntimeException() }
		fun OBJECTID() : TerminalNode? = getToken(COOLParser.Tokens.OBJECTID.id, 0)
		fun TYPEID() : TerminalNode? = getToken(COOLParser.Tokens.TYPEID.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).enterFormal(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).exitFormal(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is COOLVisitor ) return (visitor as COOLVisitor<out T>).visitFormal(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  formal() : FormalContext {
		var _localctx : FormalContext = FormalContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_formal.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 69
			match(OBJECTID) as Token
			this.state = 70
			match(T__6) as Token
			this.state = 71
			match(TYPEID) as Token
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
	open class LetInContext : ExpressionContext {
		fun LET() : TerminalNode? = getToken(COOLParser.Tokens.LET.id, 0)
		fun OBJECTID() : List<TerminalNode> = getTokens(COOLParser.Tokens.OBJECTID.id)
		fun OBJECTID(i: Int) : TerminalNode = getToken(COOLParser.Tokens.OBJECTID.id, i) as TerminalNode
		fun TYPEID() : List<TerminalNode> = getTokens(COOLParser.Tokens.TYPEID.id)
		fun TYPEID(i: Int) : TerminalNode = getToken(COOLParser.Tokens.TYPEID.id, i) as TerminalNode
		fun IN() : TerminalNode? = getToken(COOLParser.Tokens.IN.id, 0)
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun ASSIGNMENT() : List<TerminalNode> = getTokens(COOLParser.Tokens.ASSIGNMENT.id)
		fun ASSIGNMENT(i: Int) : TerminalNode = getToken(COOLParser.Tokens.ASSIGNMENT.id, i) as TerminalNode
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).enterLetIn(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).exitLetIn(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is COOLVisitor ) return (visitor as COOLVisitor<out T>).visitLetIn(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class MinusContext : ExpressionContext {
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun MINUS() : TerminalNode? = getToken(COOLParser.Tokens.MINUS.id, 0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).enterMinus(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).exitMinus(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is COOLVisitor ) return (visitor as COOLVisitor<out T>).visitMinus(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class StringContext : ExpressionContext {
		fun STRING() : TerminalNode? = getToken(COOLParser.Tokens.STRING.id, 0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).enterString(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).exitString(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is COOLVisitor ) return (visitor as COOLVisitor<out T>).visitString(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class IsvoidContext : ExpressionContext {
		fun ISVOID() : TerminalNode? = getToken(COOLParser.Tokens.ISVOID.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).enterIsvoid(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).exitIsvoid(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is COOLVisitor ) return (visitor as COOLVisitor<out T>).visitIsvoid(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class WhileContext : ExpressionContext {
		fun WHILE() : TerminalNode? = getToken(COOLParser.Tokens.WHILE.id, 0)
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun LOOP() : TerminalNode? = getToken(COOLParser.Tokens.LOOP.id, 0)
		fun POOL() : TerminalNode? = getToken(COOLParser.Tokens.POOL.id, 0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).enterWhile(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).exitWhile(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is COOLVisitor ) return (visitor as COOLVisitor<out T>).visitWhile(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class DivisionContext : ExpressionContext {
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun DIVISION() : TerminalNode? = getToken(COOLParser.Tokens.DIVISION.id, 0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).enterDivision(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).exitDivision(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is COOLVisitor ) return (visitor as COOLVisitor<out T>).visitDivision(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class NegativeContext : ExpressionContext {
		fun INTEGER_NEGATIVE() : TerminalNode? = getToken(COOLParser.Tokens.INTEGER_NEGATIVE.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).enterNegative(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).exitNegative(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is COOLVisitor ) return (visitor as COOLVisitor<out T>).visitNegative(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class BoolNotContext : ExpressionContext {
		fun NOT() : TerminalNode? = getToken(COOLParser.Tokens.NOT.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).enterBoolNot(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).exitBoolNot(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is COOLVisitor ) return (visitor as COOLVisitor<out T>).visitBoolNot(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class LessThanContext : ExpressionContext {
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun LESS_THAN() : TerminalNode? = getToken(COOLParser.Tokens.LESS_THAN.id, 0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).enterLessThan(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).exitLessThan(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is COOLVisitor ) return (visitor as COOLVisitor<out T>).visitLessThan(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class BlockContext : ExpressionContext {
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).enterBlock(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).exitBlock(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is COOLVisitor ) return (visitor as COOLVisitor<out T>).visitBlock(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class IdContext : ExpressionContext {
		fun OBJECTID() : TerminalNode? = getToken(COOLParser.Tokens.OBJECTID.id, 0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).enterId(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).exitId(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is COOLVisitor ) return (visitor as COOLVisitor<out T>).visitId(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class MultiplyContext : ExpressionContext {
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun MULTIPLY() : TerminalNode? = getToken(COOLParser.Tokens.MULTIPLY.id, 0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).enterMultiply(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).exitMultiply(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is COOLVisitor ) return (visitor as COOLVisitor<out T>).visitMultiply(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class IfContext : ExpressionContext {
		fun IF() : TerminalNode? = getToken(COOLParser.Tokens.IF.id, 0)
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun THEN() : TerminalNode? = getToken(COOLParser.Tokens.THEN.id, 0)
		fun ELSE() : TerminalNode? = getToken(COOLParser.Tokens.ELSE.id, 0)
		fun FI() : TerminalNode? = getToken(COOLParser.Tokens.FI.id, 0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).enterIf(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).exitIf(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is COOLVisitor ) return (visitor as COOLVisitor<out T>).visitIf(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class CaseContext : ExpressionContext {
		fun CASE() : TerminalNode? = getToken(COOLParser.Tokens.CASE.id, 0)
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun OF() : TerminalNode? = getToken(COOLParser.Tokens.OF.id, 0)
		fun ESAC() : TerminalNode? = getToken(COOLParser.Tokens.ESAC.id, 0)
		fun OBJECTID() : List<TerminalNode> = getTokens(COOLParser.Tokens.OBJECTID.id)
		fun OBJECTID(i: Int) : TerminalNode = getToken(COOLParser.Tokens.OBJECTID.id, i) as TerminalNode
		fun TYPEID() : List<TerminalNode> = getTokens(COOLParser.Tokens.TYPEID.id)
		fun TYPEID(i: Int) : TerminalNode = getToken(COOLParser.Tokens.TYPEID.id, i) as TerminalNode
		fun CASE_ARROW() : List<TerminalNode> = getTokens(COOLParser.Tokens.CASE_ARROW.id)
		fun CASE_ARROW(i: Int) : TerminalNode = getToken(COOLParser.Tokens.CASE_ARROW.id, i) as TerminalNode
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).enterCase(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).exitCase(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is COOLVisitor ) return (visitor as COOLVisitor<out T>).visitCase(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class OwnMethodCallContext : ExpressionContext {
		fun OBJECTID() : TerminalNode? = getToken(COOLParser.Tokens.OBJECTID.id, 0)
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).enterOwnMethodCall(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).exitOwnMethodCall(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is COOLVisitor ) return (visitor as COOLVisitor<out T>).visitOwnMethodCall(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class AddContext : ExpressionContext {
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun ADD() : TerminalNode? = getToken(COOLParser.Tokens.ADD.id, 0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).enterAdd(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).exitAdd(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is COOLVisitor ) return (visitor as COOLVisitor<out T>).visitAdd(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class NewContext : ExpressionContext {
		fun NEW() : TerminalNode? = getToken(COOLParser.Tokens.NEW.id, 0)
		fun TYPEID() : TerminalNode? = getToken(COOLParser.Tokens.TYPEID.id, 0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).enterNew(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).exitNew(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is COOLVisitor ) return (visitor as COOLVisitor<out T>).visitNew(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class ParenthesesContext : ExpressionContext {
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).enterParentheses(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).exitParentheses(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is COOLVisitor ) return (visitor as COOLVisitor<out T>).visitParentheses(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class AssignmentContext : ExpressionContext {
		fun OBJECTID() : TerminalNode? = getToken(COOLParser.Tokens.OBJECTID.id, 0)
		fun ASSIGNMENT() : TerminalNode? = getToken(COOLParser.Tokens.ASSIGNMENT.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).enterAssignment(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).exitAssignment(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is COOLVisitor ) return (visitor as COOLVisitor<out T>).visitAssignment(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class FalseContext : ExpressionContext {
		fun FALSE() : TerminalNode? = getToken(COOLParser.Tokens.FALSE.id, 0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).enterFalse(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).exitFalse(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is COOLVisitor ) return (visitor as COOLVisitor<out T>).visitFalse(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class IntContext : ExpressionContext {
		fun INT() : TerminalNode? = getToken(COOLParser.Tokens.INT.id, 0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).enterInt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).exitInt(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is COOLVisitor ) return (visitor as COOLVisitor<out T>).visitInt(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class EqualContext : ExpressionContext {
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun EQUAL() : TerminalNode? = getToken(COOLParser.Tokens.EQUAL.id, 0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).enterEqual(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).exitEqual(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is COOLVisitor ) return (visitor as COOLVisitor<out T>).visitEqual(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class TrueContext : ExpressionContext {
		fun TRUE() : TerminalNode? = getToken(COOLParser.Tokens.TRUE.id, 0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).enterTrue(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).exitTrue(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is COOLVisitor ) return (visitor as COOLVisitor<out T>).visitTrue(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class LessEqualContext : ExpressionContext {
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun LESS_EQUAL() : TerminalNode? = getToken(COOLParser.Tokens.LESS_EQUAL.id, 0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).enterLessEqual(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).exitLessEqual(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is COOLVisitor ) return (visitor as COOLVisitor<out T>).visitLessEqual(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class MethodCallContext : ExpressionContext {
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun OBJECTID() : TerminalNode? = getToken(COOLParser.Tokens.OBJECTID.id, 0)
		fun TYPEID() : TerminalNode? = getToken(COOLParser.Tokens.TYPEID.id, 0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).enterMethodCall(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is COOLListener ) (listener as COOLListener).exitMethodCall(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is COOLVisitor ) return (visitor as COOLVisitor<out T>).visitMethodCall(this)
			else return visitor.visitChildren(this)!!
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
		var _startState : Int = 10
		enterRecursionRule(_localctx, 10, Rules.RULE_expression.id, _p)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 173
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,14,context) ) {
			1 -> {if (true){
			_localctx = OwnMethodCallContext(_localctx)
			context = _localctx
			_prevctx = _localctx

			this.state = 74
			match(OBJECTID) as Token
			this.state = 75
			match(T__3) as Token
			this.state = 86
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__1) or (1L shl T__3) or (1L shl FALSE) or (1L shl IF) or (1L shl ISVOID) or (1L shl LET) or (1L shl WHILE) or (1L shl CASE) or (1L shl NEW) or (1L shl NOT) or (1L shl TRUE) or (1L shl STRING) or (1L shl INT) or (1L shl OBJECTID) or (1L shl INTEGER_NEGATIVE))) != 0L)) {
				if (true){
				if (true){
				this.state = 76
				expression(0)
				this.state = 81
				errorHandler.sync(this);
				_la = _input!!.LA(1)
				while (_la==T__4) {
					if (true){
					if (true){
					this.state = 77
					match(T__4) as Token
					this.state = 78
					expression(0)
					}
					}
					this.state = 83
					errorHandler.sync(this)
					_la = _input!!.LA(1)
				}
				}
				}
				this.state = 88
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 89
			match(T__5) as Token
			}}
			2 -> {if (true){
			_localctx = IfContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 90
			match(IF) as Token
			this.state = 91
			expression(0)
			this.state = 92
			match(THEN) as Token
			this.state = 93
			expression(0)
			this.state = 94
			match(ELSE) as Token
			this.state = 95
			expression(0)
			this.state = 96
			match(FI) as Token
			}}
			3 -> {if (true){
			_localctx = WhileContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 98
			match(WHILE) as Token
			this.state = 99
			expression(0)
			this.state = 100
			match(LOOP) as Token
			this.state = 101
			expression(0)
			this.state = 102
			match(POOL) as Token
			}}
			4 -> {if (true){
			_localctx = BlockContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 104
			match(T__1) as Token
			this.state = 108 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 105
				expression(0)
				this.state = 106
				match(T__0) as Token
				}
				}
				this.state = 110 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__1) or (1L shl T__3) or (1L shl FALSE) or (1L shl IF) or (1L shl ISVOID) or (1L shl LET) or (1L shl WHILE) or (1L shl CASE) or (1L shl NEW) or (1L shl NOT) or (1L shl TRUE) or (1L shl STRING) or (1L shl INT) or (1L shl OBJECTID) or (1L shl INTEGER_NEGATIVE))) != 0L) )
			this.state = 112
			match(T__2) as Token
			}}
			5 -> {if (true){
			_localctx = LetInContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 114
			match(LET) as Token
			this.state = 115
			match(OBJECTID) as Token
			this.state = 116
			match(T__6) as Token
			this.state = 117
			match(TYPEID) as Token
			this.state = 120
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ASSIGNMENT) {
				if (true){
				this.state = 118
				match(ASSIGNMENT) as Token
				this.state = 119
				expression(0)
				}
			}

			this.state = 132
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__4) {
				if (true){
				if (true){
				this.state = 122
				match(T__4) as Token
				this.state = 123
				match(OBJECTID) as Token
				this.state = 124
				match(T__6) as Token
				this.state = 125
				match(TYPEID) as Token
				this.state = 128
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				if (_la==ASSIGNMENT) {
					if (true){
					this.state = 126
					match(ASSIGNMENT) as Token
					this.state = 127
					expression(0)
					}
				}

				}
				}
				this.state = 134
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 135
			match(IN) as Token
			this.state = 136
			expression(20)
			}}
			6 -> {if (true){
			_localctx = CaseContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 137
			match(CASE) as Token
			this.state = 138
			expression(0)
			this.state = 139
			match(OF) as Token
			this.state = 147 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 140
				match(OBJECTID) as Token
				this.state = 141
				match(T__6) as Token
				this.state = 142
				match(TYPEID) as Token
				this.state = 143
				match(CASE_ARROW) as Token
				this.state = 144
				expression(0)
				this.state = 145
				match(T__0) as Token
				}
				}
				this.state = 149 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==OBJECTID )
			this.state = 151
			match(ESAC) as Token
			}}
			7 -> {if (true){
			_localctx = NewContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 153
			match(NEW) as Token
			this.state = 154
			match(TYPEID) as Token
			}}
			8 -> {if (true){
			_localctx = NegativeContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 155
			match(INTEGER_NEGATIVE) as Token
			this.state = 156
			expression(17)
			}}
			9 -> {if (true){
			_localctx = IsvoidContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 157
			match(ISVOID) as Token
			this.state = 158
			expression(16)
			}}
			10 -> {if (true){
			_localctx = BoolNotContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 159
			match(NOT) as Token
			this.state = 160
			expression(8)
			}}
			11 -> {if (true){
			_localctx = ParenthesesContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 161
			match(T__3) as Token
			this.state = 162
			expression(0)
			this.state = 163
			match(T__5) as Token
			}}
			12 -> {if (true){
			_localctx = IdContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 165
			match(OBJECTID) as Token
			}}
			13 -> {if (true){
			_localctx = IntContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 166
			match(INT) as Token
			}}
			14 -> {if (true){
			_localctx = StringContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 167
			match(STRING) as Token
			}}
			15 -> {if (true){
			_localctx = TrueContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 168
			match(TRUE) as Token
			}}
			16 -> {if (true){
			_localctx = FalseContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 169
			match(FALSE) as Token
			}}
			17 -> {if (true){
			_localctx = AssignmentContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 170
			match(OBJECTID) as Token
			this.state = 171
			match(ASSIGNMENT) as Token
			this.state = 172
			expression(1)
			}}
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 220
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,19,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					this.state = 218
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,18,context) ) {
					1 -> {if (true){
					_localctx = MultiplyContext(ExpressionContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_expression.id)
					this.state = 175
					if (!(precpred(context!!, 15))) throw FailedPredicateException(this, "precpred(context!!, 15)")
					this.state = 176
					match(MULTIPLY) as Token
					this.state = 177
					expression(16)
					}}
					2 -> {if (true){
					_localctx = DivisionContext(ExpressionContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_expression.id)
					this.state = 178
					if (!(precpred(context!!, 14))) throw FailedPredicateException(this, "precpred(context!!, 14)")
					this.state = 179
					match(DIVISION) as Token
					this.state = 180
					expression(15)
					}}
					3 -> {if (true){
					_localctx = AddContext(ExpressionContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_expression.id)
					this.state = 181
					if (!(precpred(context!!, 13))) throw FailedPredicateException(this, "precpred(context!!, 13)")
					this.state = 182
					match(ADD) as Token
					this.state = 183
					expression(14)
					}}
					4 -> {if (true){
					_localctx = MinusContext(ExpressionContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_expression.id)
					this.state = 184
					if (!(precpred(context!!, 12))) throw FailedPredicateException(this, "precpred(context!!, 12)")
					this.state = 185
					match(MINUS) as Token
					this.state = 186
					expression(13)
					}}
					5 -> {if (true){
					_localctx = LessThanContext(ExpressionContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_expression.id)
					this.state = 187
					if (!(precpred(context!!, 11))) throw FailedPredicateException(this, "precpred(context!!, 11)")
					this.state = 188
					match(LESS_THAN) as Token
					this.state = 189
					expression(12)
					}}
					6 -> {if (true){
					_localctx = LessEqualContext(ExpressionContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_expression.id)
					this.state = 190
					if (!(precpred(context!!, 10))) throw FailedPredicateException(this, "precpred(context!!, 10)")
					this.state = 191
					match(LESS_EQUAL) as Token
					this.state = 192
					expression(11)
					}}
					7 -> {if (true){
					_localctx = EqualContext(ExpressionContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_expression.id)
					this.state = 193
					if (!(precpred(context!!, 9))) throw FailedPredicateException(this, "precpred(context!!, 9)")
					this.state = 194
					match(EQUAL) as Token
					this.state = 195
					expression(10)
					}}
					8 -> {if (true){
					_localctx = MethodCallContext(ExpressionContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_expression.id)
					this.state = 196
					if (!(precpred(context!!, 25))) throw FailedPredicateException(this, "precpred(context!!, 25)")
					this.state = 199
					errorHandler.sync(this)
					_la = _input!!.LA(1)
					if (_la==T__7) {
						if (true){
						this.state = 197
						match(T__7) as Token
						this.state = 198
						match(TYPEID) as Token
						}
					}

					this.state = 201
					match(T__8) as Token
					this.state = 202
					match(OBJECTID) as Token
					this.state = 203
					match(T__3) as Token
					this.state = 214
					errorHandler.sync(this);
					_la = _input!!.LA(1)
					while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__1) or (1L shl T__3) or (1L shl FALSE) or (1L shl IF) or (1L shl ISVOID) or (1L shl LET) or (1L shl WHILE) or (1L shl CASE) or (1L shl NEW) or (1L shl NOT) or (1L shl TRUE) or (1L shl STRING) or (1L shl INT) or (1L shl OBJECTID) or (1L shl INTEGER_NEGATIVE))) != 0L)) {
						if (true){
						if (true){
						this.state = 204
						expression(0)
						this.state = 209
						errorHandler.sync(this);
						_la = _input!!.LA(1)
						while (_la==T__4) {
							if (true){
							if (true){
							this.state = 205
							match(T__4) as Token
							this.state = 206
							expression(0)
							}
							}
							this.state = 211
							errorHandler.sync(this)
							_la = _input!!.LA(1)
						}
						}
						}
						this.state = 216
						errorHandler.sync(this)
						_la = _input!!.LA(1)
					}
					this.state = 217
					match(T__5) as Token
					}}
					}
					} 
				}
				this.state = 222
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,19,context)
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

	override fun sempred(_localctx: RuleContext?, ruleIndex: Int, predIndex: Int) : Boolean {
		when (ruleIndex) {
		5 -> return expression_sempred(_localctx as ExpressionContext, predIndex)
		}
		return true
	}
	private fun expression_sempred( _localctx : ExpressionContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    0 -> return precpred(context!!, 15)
		    1 -> return precpred(context!!, 14)
		    2 -> return precpred(context!!, 13)
		    3 -> return precpred(context!!, 12)
		    4 -> return precpred(context!!, 11)
		    5 -> return precpred(context!!, 10)
		    6 -> return precpred(context!!, 9)
		    7 -> return precpred(context!!, 25)
		}
		return true
	}

}