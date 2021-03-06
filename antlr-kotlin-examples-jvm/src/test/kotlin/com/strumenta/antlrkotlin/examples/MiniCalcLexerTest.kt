/*
 * Copyright (C) 2021 Strumenta
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
