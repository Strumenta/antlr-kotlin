package org.antlr.v4.kotlinruntime.misc

public actual object Platform {
  public actual fun readFile(fileName: String, encoding: String): String {
    TODO("Not yet supported for Node.js and browser")
  }
}
