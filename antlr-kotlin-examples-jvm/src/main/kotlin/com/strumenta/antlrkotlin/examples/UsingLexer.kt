package com.strumenta.antlrkotlin.examples

import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.Token

fun main(args: Array<String>) {

//    if (MiniCalcLexer.serializedATN.length != MiniCalcLexer.serializedIntegersATN.size) {
//        throw RuntimeException("DIFFERENT LENGTHS")
//    }
//    for (i in 0..MiniCalcLexer.serializedATN.length) {
//        if (MiniCalcLexer.serializedATN[i].toInt() != MiniCalcLexer.serializedIntegersATN[i]) {
//            throw RuntimeException("DIFFERENT AT $i ${MiniCalcLexer.serializedATN[i].toInt()} ${MiniCalcLexer.serializedIntegersATN[i]}")
//        }
//    }

    val input = CharStreams.fromString("1 + 2")
    val lexer = MiniCalcLexer(input)
    var token: Token?
    do {
        token = lexer.nextToken()
        println("TOKEN $token")
    } while (token?.type != -1)
}
