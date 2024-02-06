// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime.ext

import kotlin.math.min

/**
 * Returns the code points in this string.
 */
public fun String.codePointIndices(): IntArray {
  val (array, size) = codePointIndicesFast(this)
  return array.copyOfRange(0, size)
}

/**
 * Returns the code points in [str], and the real size
 * of the returned array, since it is not trimmed to avoid
 * an additional potentially expensive allocation.
 */
internal fun codePointIndicesFast(str: String): Pair<IntArray, Int> {
  val strLength = str.length
  val intArray = IntArray(strLength + 1)
  var size = 0
  var i = 1

  intArray[size++] = 0

  while (i < strLength) {
    if (!hasSurrogatePairAtFast(str, i)) {
      intArray[size++] = i
    }

    i++
  }

  return Pair(intArray, min(size, strLength))
}

/**
 * Returns whether [str] has a unicode surrogate pair at the specified [index].
 */
private fun hasSurrogatePairAtFast(str: String, index: Int): Boolean {
  // Note(Edoardo): keep it like this for performance reasons.
  //  A const val is normally inlined, but it does not work in JS
  //  when that const val is inside a companion object, since it
  //  is lazily initialized.
  //  Without proper inlining you will have a null check (two calls deep)
  //  for every character in the string, losing significant time
  if (str[index - 1].code in /* MIN_HIGH_SURROGATE */ 0xD800..0xDBFF /* MAX_HIGH_SURROGATE */) {
    return str[index].code in /* MIN_LOW_SURROGATE */ 0xDC00..0xDFFF /* MAX_LOW_SURROGATE */
  }

  return false
}
