package com.strumenta.antlrkotlin.runtime

/**
 * Prints the line separator to the standard error stream.
 */
internal expect fun platformPrintErrLn()

/**
 * Prints the give error message and the line separator to the standard error stream.
 */
internal expect fun platformPrintErrLn(message: String)

/**
 * Prints the give error message to the standard error stream.
 */
internal expect fun platformPrintErr(message: String)
