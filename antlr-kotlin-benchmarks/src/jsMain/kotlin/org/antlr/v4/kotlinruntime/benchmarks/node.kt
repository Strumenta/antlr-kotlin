// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
@file:JsModule("node:fs")

package org.antlr.v4.kotlinruntime.benchmarks

internal external fun readFileSync(path: String, options: dynamic): String
