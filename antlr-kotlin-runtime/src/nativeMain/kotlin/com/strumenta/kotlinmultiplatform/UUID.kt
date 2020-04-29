package com.strumenta.kotlinmultiplatform

import com.benasher44.uuid.Uuid
import com.benasher44.uuid.uuidFrom

actual class UUID {

    private val _wrapped: Uuid

    actual constructor(most: Long, least: Long) {
        _wrapped = Uuid(most, least)
    }

    constructor(wrapped: Uuid) {
        this._wrapped = wrapped
    }

    actual companion object {
        actual fun fromString(encoded: String): UUID {
            return UUID(uuidFrom(encoded))
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
