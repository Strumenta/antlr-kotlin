
import org.antlr.v4.kotlinruntime.ANTLRInputStream
import org.antlr.v4.kotlinruntime.CharStream
import org.antlr.v4.kotlinruntime.Token
import java.lang.RuntimeException

fun main(args: Array<String>) {

//    if (MiniCalcLexer.serializedATN.length != MiniCalcLexer.serializedIntegersATN.size) {
//        throw RuntimeException("DIFFERENT LENGTHS")
//    }
//    for (i in 0..MiniCalcLexer.serializedATN.length) {
//        if (MiniCalcLexer.serializedATN[i].toInt() != MiniCalcLexer.serializedIntegersATN[i]) {
//            throw RuntimeException("DIFFERENT AT $i ${MiniCalcLexer.serializedATN[i].toInt()} ${MiniCalcLexer.serializedIntegersATN[i]}")
//        }
//    }

    val input = ANTLRInputStream("1 + 2")
    val lexer = MiniCalcLexer(input)
    var token : Token? = null
    do {
        token = lexer.nextToken()
        println("TOKEN $token")

    } while (token?.type != -1)
}