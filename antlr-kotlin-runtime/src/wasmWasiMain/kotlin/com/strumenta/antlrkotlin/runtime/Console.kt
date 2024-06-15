// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime

import kotlin.wasm.WasmImport
import kotlin.wasm.unsafe.UnsafeWasmMemoryApi
import kotlin.wasm.unsafe.withScopedMemoryAllocator

internal actual fun platformPrintErrLn(): Unit =
  wasiPrintErr("", lineFeed = true)

internal actual fun platformPrintErrLn(message: String): Unit =
  wasiPrintErr(message, lineFeed = true)

internal actual fun platformPrintErr(message: String): Unit =
  wasiPrintErr(message, lineFeed = false)

@WasmImport("wasi_snapshot_preview1", "fd_write")
private external fun fdWrite(descriptor: Int, scatterPtr: Int, scatterSize: Int, errorPtr: Int): Int

@OptIn(UnsafeWasmMemoryApi::class)
private fun wasiPrintErr(message: String, lineFeed: Boolean) {
  withScopedMemoryAllocator {
    val data = message.encodeToByteArray()
    val dataSize = data.size
    val memorySize = dataSize + (if (lineFeed) 1 else 0)

    if (memorySize == 0) {
      return
    }

    val ptr = it.allocate(memorySize)
    var currentPtr = ptr

    for (byte in data) {
      currentPtr.storeByte(byte)
      currentPtr += 1
    }

    if (lineFeed) {
      (ptr + dataSize).storeByte(0x0A)
    }

    val scatterPtr = it.allocate(8)
    (scatterPtr + 0).storeInt(ptr.address.toInt())
    (scatterPtr + 4).storeInt(memorySize)

    val rp0 = it.allocate(4)
    fdWrite(
      descriptor = 2, // STDERR
      scatterPtr = scatterPtr.address.toInt(),
      scatterSize = 1,
      errorPtr = rp0.address.toInt(),
    )

    // Note(Edoardo): we could handle the fd_write return value here,
    //  but for now we can skip it as it is not really important,
    //  and it would require a lot more code
  }
}
