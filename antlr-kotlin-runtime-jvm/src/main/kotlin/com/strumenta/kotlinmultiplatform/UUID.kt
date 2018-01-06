package com.strumenta.kotlinmultiplatform

actual class UUID {

    private val _wrapped : java.util.UUID

    actual constructor(most: Long, least: Long) {
        _wrapped = java.util.UUID(most, least)
    }

    constructor(wrapped: java.util.UUID) {
        this._wrapped = wrapped
    }

    actual companion object {
        actual fun fromString(encoded: String) : UUID {
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