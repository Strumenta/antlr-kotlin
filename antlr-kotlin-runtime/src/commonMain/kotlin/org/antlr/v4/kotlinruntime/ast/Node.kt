package org.antlr.v4.kotlinruntime.ast

/**
 * The Abstract Syntax Tree will be constituted by instances of Node.
 */
interface Node {
    val parent: Node?
    val position: Position?
}
