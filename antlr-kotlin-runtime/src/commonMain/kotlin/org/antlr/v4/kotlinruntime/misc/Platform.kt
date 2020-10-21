package org.antlr.v4.kotlinruntime.misc

expect object Platform {
    suspend fun readFile(fileName: String): String
}
