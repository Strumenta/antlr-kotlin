package com.strumenta.kotlinmultiplatform

actual class UUID {

/*
    The layout of a variant 2 (Leach-Salz) UUID is as follows: The most significant long consists of the following unsigned fields:

     0xFFFFFFFF00000000 time_low
     0x00000000FFFF0000 time_mid
     0x000000000000F000 version
     0x0000000000000FFF time_hi

    The least significant long consists of the following unsigned fields:
     0xC000000000000000 variant
     0x3FFF000000000000 clock_seq
     0x0000FFFFFFFFFFFF node
 */

    private val timeLow: Long
    private val timeMid: Long
    private val version: Long
    private val timeHi: Long
    private val variant: Long
    private val clock_seq: Long
    private val node: Long

    enum class Variant(val value: Int, val bitsLength: Int) {
        VARIANT_0(0,3),
        VARIANT_1(1, 2),
        VARIANT_2(2, 3),
        VARIANT_FUTURE(3, 3)
    }

    actual companion object {
        actual fun fromString(encoded: String) : UUID {
            val parts = encoded.split("-")
            require(parts.size == 5)
            require(parts[0].length == 8)
            require(parts[1].length == 4)
            require(parts[2].length == 4)
            require(parts[3].length == 4)
            require(parts[4].length == 12)

            // time_hi_and_version	4-bit "version" in the most significant bits, followed by the high 12 bits of the time
            val time_hi_and_version = parts[2].toLong(radix = 16)

            // clock_seq_hi_and_res 	1-3 bit "variant" in the most significant bits, followed by the 13-15 bit clock sequence
            val clock_seq_hi_and_res = parts[3].toLong(radix = 16)

            val topBit1st = clock_seq_hi_and_res.shr(15)
            val topBit2nd = clock_seq_hi_and_res.shr(14).and(0x1L)
            val topBit3nd = clock_seq_hi_and_res.shr(13).and(0x1L)

            val variantEnum : Variant = when {
                topBit1st == 0L -> /* Variant 0 */ throw UnsupportedOperationException()
                topBit1st == 1L && topBit2nd == 1L && topBit3nd == 1L -> /* Variant future */ throw UnsupportedOperationException()
                topBit1st == 1L && topBit2nd == 0L -> Variant.VARIANT_1
                topBit1st == 1L && topBit2nd == 1L && topBit3nd == 0L -> Variant.VARIANT_2
                else -> throw UnsupportedOperationException()
            }

            val version = time_hi_and_version.shr(12)
            val timeLow = parts[0].toLong(radix = 16)
            val timeMid = parts[1].toLong(radix = 16)
            val timeHi = time_hi_and_version.and(0xFFFL)
            val variant = 2L // TODO fixme variantEnum.value.toLong()
            val clock_seq = when (variantEnum.bitsLength) {
                2 ->  clock_seq_hi_and_res.and(0x3FFFL)
                3 ->  clock_seq_hi_and_res.and(0x1FFFL)
                else -> throw UnsupportedOperationException()
            }
            val node = parts[4].toLong(radix = 16)
            return UUID(version, timeLow, timeMid, timeHi, variant, clock_seq, node)
        }
    }

    actual constructor(most: Long, least: Long) {
        this.timeLow = most.shr(32)
        this.timeMid = most.and(0xFFFF0000L).shr(16)
        this.version = most.and(0xF000L).shr(12)
        this.timeHi = most.and(0xFFFL)
        val variantLayout = least.shr(62)
        // TODO fixme
        this.variant = 2L
        this.clock_seq = least.shr(48).and(0x3FFFL)
        this.node = least.and(0xFFFFFFFFFFFFL)
    }

    constructor(version: Long, timeLow: Long, timeMid: Long, timeHi: Long, variant: Long, clock_seq: Long, node: Long) {
        this.version = version
        this.timeLow = timeLow
        this.timeMid = timeMid
        this.timeHi = timeHi
        this.variant = variant
        this.clock_seq = clock_seq
        this.node = node
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class.js != other::class.js) return false

        other as UUID

        if (timeLow != other.timeLow) return false
        if (timeMid != other.timeMid) return false
        if (version != other.version) return false
        if (timeHi != other.timeHi) return false
        if (variant != other.variant) return false
        if (clock_seq != other.clock_seq) return false
        if (node != other.node) return false

        return true
    }

    override fun hashCode(): Int {
        var result = timeLow.hashCode()
        result = 31 * result + timeMid.hashCode()
        result = 31 * result + version.hashCode()
        result = 31 * result + timeHi.hashCode()
        result = 31 * result + variant.hashCode()
        result = 31 * result + clock_seq.hashCode()
        result = 31 * result + node.hashCode()
        return result
    }

    override fun toString(): String {
        return "UUID(timeLow=$timeLow, timeMid=$timeMid, version=$version, timeHi=$timeHi, variant=$variant, clock_seq=$clock_seq, node=$node)"
    }


}