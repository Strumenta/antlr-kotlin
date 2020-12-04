package org.antlr.v4.kotlinruntime.misc

import java.io.File

actual object Platform {
    actual suspend fun readFile(fileName: String): String {
        return File(fileName)
                .readLines()
                .joinToString("\n")
    }
}
