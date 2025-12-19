// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.util

import com.goncalossilva.resources.Resource

/**
 * Loads a test resource, typically located under the `/resources` directory, as a byte sequence.
 *
 * @see loadBytes
 */
fun loadResourceBytes(path: String): ByteArray {
  val resource = Resource(path)
  return resource.readBytes()
}

/**
 * Loads a test resource, typically located under the `/resources` directory, as UTF-8 encoded text.
 *
 * @see loadText
 */
fun loadResourceText(path: String): String {
  val resource = Resource(path)
  return resource.readText()
}

/**
 * Utility extension function to load bytes from a string representing a resource path.
 *
 * @see loadResourceBytes
 */
fun String.loadBytes(): ByteArray = loadResourceBytes(this)

/**
 * Utility extension function to load text from a string representing a resource path.
 *
 * @see loadResourceText
 */
fun String.loadText(): String = loadResourceText(this)
