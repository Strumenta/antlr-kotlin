// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime

import kotlin.wasm.WasmImport
import kotlin.wasm.unsafe.Pointer
import kotlin.wasm.unsafe.UnsafeWasmMemoryApi
import kotlin.wasm.unsafe.withScopedMemoryAllocator

/**
 * See [environ_sizes_get](https://wasix.org/docs/api-reference/wasi/environ_sizes_get).
 */
@WasmImport("wasi_snapshot_preview1", "environ_sizes_get")
private external fun wasiRawEnvironSizesGet(environCountPtr: Int, environBufSizePtr: Int): Int

/**
 * See [environ_get](https://wasix.org/docs/api-reference/wasi/environ_get).
 */
@WasmImport("wasi_snapshot_preview1", "environ_get")
private external fun wasiRawEnvironGet(environPtr: Int, environBufPtr: Int): Int

// Cache the environment variables map
private val envVars: Map<String, String> by lazy {
  @OptIn(UnsafeWasmMemoryApi::class)
  withScopedMemoryAllocator { allocator ->
    val environCountPtr = allocator.allocate(4)
    val environBufSizePtr = allocator.allocate(4)
    var result = wasiRawEnvironSizesGet(
      environCountPtr = environCountPtr.address.toInt(),
      environBufSizePtr = environBufSizePtr.address.toInt(),
    )

    if (result != 0) {
      throw IllegalStateException("WASI error code: $result")
    }

    val environCount = environCountPtr.loadInt()
    val environBufSize = environBufSizePtr.loadInt()
    val environBufPtr = allocator.allocate(environBufSize)
    val environPtr = allocator.allocate(environCount * Int.SIZE_BYTES)
    result = wasiRawEnvironGet(
      environPtr = environPtr.address.toInt(),
      environBufPtr = environBufPtr.address.toInt(),
    )

    if (result != 0) {
      throw IllegalStateException("WASI error code: $result")
    }

    val startAddress = (environPtr + 2 * Int.SIZE_BYTES).loadInt().toUInt()
    val endAddress = environBufPtr.address + environBufSize.toUInt()
    decodeBuffer(environBufSize, startAddress, endAddress)
  }
}

@OptIn(UnsafeWasmMemoryApi::class)
private fun decodeBuffer(size: Int, startAddress: UInt, endAddress: UInt): Map<String, String> {
  val buffer = ByteArray(size)
  val result = LinkedHashMap<String, String>()
  var currentPtr = Pointer(startAddress)
  var currentIndex = 0

  while (currentPtr.address < endAddress) {
    val byte = currentPtr.loadByte()

    if (byte.toInt() == 0) {
      val keyValue = buffer.decodeToString(0, currentIndex)
      val (key, value) = keyValue.split("=")
      result[key] = value
      currentIndex = 0
    } else {
      buffer[currentIndex++] = byte
    }

    currentPtr += 1
  }

  return result
}

internal actual fun platformGetEnv(name: String): String? =
  envVars[name]
