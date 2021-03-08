/*
 * Copyright (C) 2021 Strumenta
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.strumenta.kotlinmultiplatform

actual class UUID {

    private val _wrapped: java.util.UUID

    actual constructor(most: Long, least: Long) {
        _wrapped = java.util.UUID(most, least)
    }

    constructor(wrapped: java.util.UUID) {
        this._wrapped = wrapped
    }

    actual companion object {
        actual fun fromString(encoded: String): UUID {
            return UUID(java.util.UUID.fromString(encoded))
        }
    }

    override fun equals(other: Any?): Boolean {
        return other is UUID && this._wrapped == other._wrapped
    }

    override fun hashCode(): Int {
        return _wrapped.hashCode()
    }

    override fun toString(): String {
        return _wrapped.toString()
    }
}
