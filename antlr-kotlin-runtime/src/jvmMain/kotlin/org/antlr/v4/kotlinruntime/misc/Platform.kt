package org.antlr.v4.kotlinruntime.misc

import java.io.File
import java.nio.charset.Charset

public actual object Platform {
  public actual fun readFile(fileName: String, encoding: String): String =
    File(fileName)
      .readLines(Charset.forName(encoding))
      .joinToString("\n")
}
