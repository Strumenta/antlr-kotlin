/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
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
