// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime

import platform.android.ANDROID_LOG_ERROR
import platform.android.__android_log_print

internal actual fun androidPrintErr(message: String) {
  __android_log_print(ANDROID_LOG_ERROR.toInt(), "antlr-kotlin", message)
}
