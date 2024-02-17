// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime

/**
 * A typealias for Kotlin's `JsName` in the `js` and `wasmJs` targets,
 * and a non-retained annotation for all the other targets.
 *
 * It should be used **only** in `Kotlin.stg`.
 *
 * See [issues/175](https://github.com/Strumenta/antlr-kotlin/issues/175) for more details.
 */
@Target(
  AnnotationTarget.CLASS,
  AnnotationTarget.FUNCTION,
  AnnotationTarget.PROPERTY,
  AnnotationTarget.CONSTRUCTOR,
  AnnotationTarget.PROPERTY_GETTER,
  AnnotationTarget.PROPERTY_SETTER,
)
@Retention(AnnotationRetention.SOURCE)
public expect annotation class JsName(val name: String)
