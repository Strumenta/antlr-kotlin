import org.antlr.v4.kotlinruntime.ANTLRInputStream
import org.antlr.v4.kotlinruntime.atn.EmptyPredictionContext
import org.antlr.v4.kotlinruntime.atn.PredictionContext
import org.antlr.v4.kotlinruntime.atn.PredictionContextCache
import org.junit.Test as test
import org.junit.Assert.*

class TestingLexer {

    @test fun firstTokenDebug1() {
        val input = ANTLRInputStream("1 + 2")
        val lexer = MiniCalcLexer(input)
        val interpreter = lexer.interpreter
        val result = interpreter!!.match(input, 0)
        assertEquals(11, result)
    }

    @test fun checkMaxs() {
        assertEquals(2147483647, PredictionContext.EMPTY_RETURN_STATE)
    }

    @test fun emptyPredictionContext() {
        assertEquals(true, EmptyPredictionContext().hasEmptyPath())
        assertEquals(true, EmptyPredictionContext().isEmpty)
    }

    @test fun firstTokenDebug2() {
        val input = ANTLRInputStream("1 + 2")
        val lexer = MiniCalcLexer(input)
        val interpreter = lexer.interpreter
        val decisionToDFA = interpreter!!.decisionToDFA
        val mode = 0
        val dfa = decisionToDFA[mode]
        assertEquals(true, dfa!!.s0 != null)
        assertEquals(0, dfa!!.s0!!.stateNumber)
    }

    @test fun simpleTokens() {
        val lexer = MiniCalcLexer(ANTLRInputStream("1 + 2"))
        val tokens = lexer.allTokens
        assertEquals(5, tokens.size)

        var i = 0
        assertEquals("1", tokens[i].text)
        assertEquals(MiniCalcLexer.Tokens.INTLIT.id, tokens[i].type)

        i++
        assertEquals(" ", tokens[i].text)
        assertEquals(MiniCalcLexer.Tokens.WS.id, tokens[i].type)

        i++
        assertEquals("+", tokens[i].text)
        assertEquals(MiniCalcLexer.Tokens.PLUS.id, tokens[i].type)

        i++
        assertEquals(" ", tokens[i].text)
        assertEquals(MiniCalcLexer.Tokens.WS.id, tokens[i].type)

        i++
        assertEquals("2", tokens[i].text)
        assertEquals(MiniCalcLexer.Tokens.INTLIT.id, tokens[i].type)
    }
}