package com.strumenta.kotlinmultiplatform

object System {
  fun <T> arraycopy(src: Array<T>, srcPos: Int, dest: Array<T>, destPos: Int, length: Int) {
    src.copyInto(dest, destPos, srcPos, srcPos + length)
  }

  fun arraycopy(src: IntArray, srcPos: Int, dest: IntArray, destPos: Int, length: Int) {
    src.copyInto(dest, destPos, srcPos, srcPos + length)
  }

  val out: PrintStream = StdPrintStream
  val err: PrintStream = ErrPrintStream

  interface PrintStream {
    fun println(message: String)
  }

  private object StdPrintStream : PrintStream {
    override fun println(message: String) {
      kotlin.io.println(message)
    }
  }

  private object ErrPrintStream : PrintStream {
    override fun println(message: String) {
      logError(message)
    }
  }
}
