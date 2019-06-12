package com.strumenta.antlrkotlin.examples

import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.CommonTokenStream

fun main(args: Array<String>) {

//    if (MiniCalcLexer.serializedATN.length != MiniCalcLexer.serializedIntegersATN.size) {
//        throw RuntimeException("DIFFERENT LENGTHS")
//    }
//    for (i in 0..MiniCalcLexer.serializedATN.length) {
//        if (MiniCalcLexer.serializedATN[i].toInt() != MiniCalcLexer.serializedIntegersATN[i]) {
//            throw RuntimeException("DIFFERENT AT $i ${MiniCalcLexer.serializedATN[i].toInt()} ${MiniCalcLexer.serializedIntegersATN[i]}")
//        }
//    }

    val input = CharStreams.fromString("input Int width\n")
    val lexer = MiniCalcLexer(input)
    val parser = MiniCalcParser(CommonTokenStream(lexer))
    try {
        val root = parser.miniCalcFile()
        println("Parsed: ${root.javaClass}")
        println("Parsed: ${root.childCount}")
        println("Parsed: ${root.children!![0].javaClass}")
    } catch (e: Throwable) {
        println("Error: $e")
    }
}
