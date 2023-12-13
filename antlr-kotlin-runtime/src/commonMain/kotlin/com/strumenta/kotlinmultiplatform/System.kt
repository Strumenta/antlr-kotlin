package com.strumenta.kotlinmultiplatform

public object System {
  @Suppress("SpellCheckingInspection")
  public fun getenv(name: String, defaultValue: String? = null): String? =
    platformGetEnv(name) ?: defaultValue

  public fun <T> arraycopy(src: Array<T>, srcPos: Int, dest: Array<T>, destPos: Int, length: Int) {
    src.copyInto(dest, destPos, srcPos, srcPos + length)
  }

  public fun arraycopy(src: IntArray, srcPos: Int, dest: IntArray, destPos: Int, length: Int) {
    src.copyInto(dest, destPos, srcPos, srcPos + length)
  }

  public val out: PrintStream = StdPrintStream
  public val err: PrintStream = ErrPrintStream

  public interface PrintStream {
    public fun println(message: String)
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
