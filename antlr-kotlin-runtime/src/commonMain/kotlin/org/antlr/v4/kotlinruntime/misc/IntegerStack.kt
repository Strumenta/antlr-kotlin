// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime.misc

/**
 * @author Sam Harwell
 */
public class IntegerStack : IntegerList {
  public constructor()
  public constructor(capacity: Int) : super(capacity)
  public constructor(list: IntegerStack) : super(list)

  public fun push(value: Int): Unit =
    add(value)

  public fun pop(): Int =
    removeAt(size() - 1)

  public fun peek(): Int =
    get(size() - 1)
}
