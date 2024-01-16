// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime.misc

import kotlin.math.max
import kotlin.math.min

/**
 * An immutable inclusive interval `a..b`.
 */
@Suppress("MemberVisibilityCanBePrivate")
public class Interval(public var a: Int, public var b: Int) {
  public companion object {
    public const val INTERVAL_POOL_MAX_VALUE: Int = 1000
    public val INVALID: Interval = Interval(-1, -2)

    internal val cache = arrayOfNulls<Interval>(INTERVAL_POOL_MAX_VALUE + 1)

    /**
     * Interval objects are used readonly so share all with the
     * same single value `a == b` up to some max size.
     *
     * Use an array as a perfect hash.
     *
     * Return a shared object for `0..`[INTERVAL_POOL_MAX_VALUE] or a new
     * [Interval] object with [a]..[a] in it.
     */
    public fun of(a: Int, b: Int): Interval {
      // Cache just a..a
      if (a != b || a < 0 || a > INTERVAL_POOL_MAX_VALUE) {
        return Interval(a, b)
      }

      var interval = cache[a]

      if (interval == null) {
        interval = Interval(a, a)
        cache[a] = interval
      }

      return interval
    }
  }

  /**
   * Return the number of elements between [a] and [b] inclusively.
   *
   * - `x..x`, then length is `1`
   * - if `b > a`, then length is `0`
   * - `9..10`, then length is `2`
   */
  public fun length(): Int =
    if (b < a) 0 else b - a + 1

  /**
   * Does `this` start completely before [other]? Disjoint.
   */
  public fun startsBeforeDisjoint(other: Interval): Boolean =
    a < other.a && b < other.a

  /**
   * Does `this` start at or before [other]? Nondisjoint.
   */
  public fun startsBeforeNonDisjoint(other: Interval): Boolean =
    other.a in a..b

  /**
   * Does `this.`[a] start after [other].b? May or may not be disjoint.
   */
  public fun startsAfter(other: Interval): Boolean =
    a > other.a

  /**
   * Does `this` start completely after [other]? Disjoint.
   */
  public fun startsAfterDisjoint(other: Interval): Boolean =
    a > other.b

  /**
   * Does `this` start after [other]? NonDisjoint.
   */
  public fun startsAfterNonDisjoint(other: Interval): Boolean =
    a > other.a && a <= other.b

  /**
   * Are both ranges disjoint? i.e., no overlap?
   */
  public fun disjoint(other: Interval): Boolean =
    startsBeforeDisjoint(other) || startsAfterDisjoint(other)

  /**
   * Are two intervals adjacent such as `0..41` and `42..42`?
   */
  public fun adjacent(other: Interval): Boolean =
    a == other.b + 1 || b == other.a - 1

  public fun properlyContains(other: Interval): Boolean =
    other.a >= a && other.b <= b

  /**
   * Return the interval computed from combining `this` and [other].
   */
  public fun union(other: Interval): Interval =
    of(min(a, other.a), max(b, other.b))

  /**
   * Return the interval in common between `this` and [other].
   */
  public fun intersection(other: Interval): Interval =
    of(max(a, other.a), min(b, other.b))

  /**
   * Return the interval with elements from `this` not in [other].
   *
   * [other] must not be totally enclosed (properly contained)
   * within `this`, which would result in two disjoint intervals
   * instead of the single one returned by this method.
   */
  public fun differenceNotProperlyContained(other: Interval): Interval? {
    var diff: Interval? = null

    // other.a to left of this.a (or same)
    if (other.startsBeforeNonDisjoint(this)) {
      diff = of(max(a, other.b + 1), b)
    }
    // other.a to right of this.a
    else if (other.startsAfterNonDisjoint(this)) {
      diff = of(a, other.a - 1)
    }

    return diff
  }

  override fun equals(other: Any?): Boolean =
    other is Interval && a == other.a && b == other.b

  override fun hashCode(): Int {
    var hash = 23
    hash = hash * 31 + a
    hash = hash * 31 + b
    return hash
  }

  override fun toString(): String =
    "$a..$b"
}
