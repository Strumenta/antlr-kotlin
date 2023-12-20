package com.strumenta.kotlinmultiplatform

/**
 * Prints the line separator to the standard error stream.
 */
internal expect inline fun platformPrintErrLn()

/**
 * Prints the give error message and the line separator to the standard error stream.
 */
internal expect inline fun platformPrintErrLn(message: String)

/**
 * Prints the give error message to the standard error stream.
 */
internal expect inline fun platformPrintErr(message: String)
