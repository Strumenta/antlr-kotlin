package com.strumenta.antlrkotlin.examples

import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.atn.EmptyPredictionContext
import org.antlr.v4.kotlinruntime.atn.PredictionContext
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class TestingLexer {

    @Test
    fun firstTokenDebug1() {
        val input = CharStreams.fromString("1 + 2")
        val lexer = MiniCalcLexer(input)
        val interpreter = lexer.interpreter
        val result = interpreter!!.match(input, 0)
        assertEquals(11, result)
    }

    @Test
    fun checkMaxs() {
        assertEquals(2147483647, PredictionContext.EMPTY_RETURN_STATE)
    }

    @Test
    fun emptyPredictionContext() {
        assertEquals(true, EmptyPredictionContext().hasEmptyPath())
        assertEquals(true, EmptyPredictionContext().isEmpty)
    }

    @Test
    fun firstTokenDebug2() {
        val input = CharStreams.fromString("1 + 2")
        val lexer = MiniCalcLexer(input)
        val interpreter = lexer.interpreter
        val decisionToDFA = interpreter!!.decisionToDFA
        val mode = 0
        val dfa = decisionToDFA[mode]
        assertNotNull(dfa)
        val s0 = dfa.s0
        assertNotNull(s0)
        assertEquals(0, s0.stateNumber)
    }

    @Test
    fun firstToken() {
        val input = CharStreams.fromString("1 + 2")
        val lexer = MiniCalcLexer(input)
        val token = lexer.nextToken()

        assertEquals("1", token.text)
        assertEquals(MiniCalcLexer.Tokens.INTLIT.id, token.type)
    }

    @Test
    fun simpleTokens() {
        val input = CharStreams.fromString("1 + 2")
        val lexer = MiniCalcLexer(input)
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
