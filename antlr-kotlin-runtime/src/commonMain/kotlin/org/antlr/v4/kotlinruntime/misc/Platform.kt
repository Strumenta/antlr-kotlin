package org.antlr.v4.kotlinruntime.misc

public expect object Platform {
  public fun readFile(fileName: String, encoding: String = "UTF8"): String
}
