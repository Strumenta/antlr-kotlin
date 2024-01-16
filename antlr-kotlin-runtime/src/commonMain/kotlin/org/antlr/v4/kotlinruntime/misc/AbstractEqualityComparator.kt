// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime.misc

/**
 * This abstract base class is provided so performance-critical applications can
 * use virtual-dispatch instead of interface-dispatch when calling comparator methods.
 *
 * @author Sam Harwell
 */
public abstract class AbstractEqualityComparator<in T> : EqualityComparator<T>
