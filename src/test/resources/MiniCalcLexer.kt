// Generated from src/test/resources/MiniCalcLexer.g4 by ANTLR 4.7.1
import com.strumenta.kotlinmultiplatform.Arrays
import org.antlr.v4.kotlinruntime.facade.*

class MiniCalcLexer(val input: String) : Lexer("MiniCalcLexer.g4", input) {
	// TODO Verify the runtime version is correct

	companion object {
		lateinit var decisionToDFA : Array<DFA>
		val sharedContextCache = PredictionContextCache()

		private val LITERAL_NAMES = Arrays.asList<String?>(null, null, null, "'input'", 
		                                                   "'var'", "'print'", 
		                                                   null, null, null, null, 
		                                                   null, null, null, null, 
		                                                   null, null, null, null, 
		                                                   null, null, null, null, 
		                                                   "'\\\"'", "'\\\\'", 
		                                                   "'\\n'", "'\\#'", null, 
		                                                   "'#{'", null, "'}'")
		private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, "NEWLINE", "WS", 
		                                                    "INPUT", "VAR", "PRINT", 
		                                                    "AS", "INT", "DECIMAL", 
		                                                    "STRING", "ID", "INTLIT", 
		                                                    "DECLIT", "PLUS", 
		                                                    "MINUS", "ASTERISK", 
		                                                    "DIVISION", "ASSIGN", 
		                                                    "LPAREN", "RPAREN", 
		                                                    "STRING_OPEN", "UNMATCHED", 
		                                                    "ESCAPE_STRING_DELIMITER", 
		                                                    "ESCAPE_SLASH", "ESCAPE_NEWLINE", 
		                                                    "ESCAPE_SHARP", "STRING_CLOSE", 
		                                                    "INTERPOLATION_OPEN", 
		                                                    "STRING_CONTENT", 
		                                                    "INTERPOLATION_CLOSE")

		val VOCABULARY = VocabularyImpl(LITERAL_NAMES, SYMBOLIC_NAMES)

		val serializedIntegersATN =
			arrayOf()
		val ATN = ATNDeserializer().deserializeIntegers(serializedIntegersATN)
		init {
			decisionToDFA = Array<DFA>(ATN.getNumberOfDecisions(), {
				createDFA(ATN.getDecisionState(it), it)
			})
		}
	}

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

	enum class Channels(val id: Int) {
		DEFAULT_TOKEN_CHANNEL(0),
		HIDDEN(1),
		WHITESPACE(2)
	}

	enum class Modes(val id: Int) {
		DEFAULT_MODE(0),
		MODE_IN_STRING(1),
		MODE_IN_INTERPOLATION(2)
	}

	enum class Rules {
	    NEWLINE,
	    WS,
	    INPUT,
	    VAR,
	    PRINT,
	    AS,
	    INT,
	    DECIMAL,
	    STRING,
	    ID,
	    INTLIT,
	    DECLIT,
	    PLUS,
	    MINUS,
	    ASTERISK,
	    DIVISION,
	    ASSIGN,
	    LPAREN,
	    RPAREN,
	    STRING_OPEN,
	    UNMATCHED,
	    ESCAPE_STRING_DELIMITER,
	    ESCAPE_SLASH,
	    ESCAPE_NEWLINE,
	    ESCAPE_SHARP,
	    STRING_CLOSE,
	    INTERPOLATION_OPEN,
	    STRING_CONTENT,
	    STR_UNMATCHED,
	    INTERPOLATION_CLOSE,
	    INTERP_WS,
	    INTERP_AS,
	    INTERP_INT,
	    INTERP_DECIMAL,
	    INTERP_STRING,
	    INTERP_INTLIT,
	    INTERP_DECLIT,
	    INTERP_PLUS,
	    INTERP_MINUS,
	    INTERP_ASTERISK,
	    INTERP_DIVISION,
	    INTERP_ASSIGN,
	    INTERP_LPAREN,
	    INTERP_RPAREN,
	    INTERP_ID,
	    INTERP_STRING_OPEN,
	    INTERP_UNMATCHED
	}


	init {
		setInterpreter(createLexerATNSimulator(this, ATN, decisionToDFA, sharedContextCache))
	}

}