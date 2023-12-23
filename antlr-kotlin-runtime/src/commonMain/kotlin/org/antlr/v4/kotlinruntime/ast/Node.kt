package org.antlr.v4.kotlinruntime.ast

/**
 * The Abstract Syntax Tree will be constituted by instances of [Node].
 */
public interface Node {
  public val parent: Node?
  public val position: Position?
}
