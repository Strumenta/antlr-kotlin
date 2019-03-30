// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CLIFParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
interface CLIFVisitor<T> : ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CLIFParser#termseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTermseq(ctx : CLIFParser.TermseqContext) : T
	/**
	 * Visit a parse tree produced by {@link CLIFParser#interpretedname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInterpretedname(ctx : CLIFParser.InterpretednameContext) : T
	/**
	 * Visit a parse tree produced by {@link CLIFParser#interpretablename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInterpretablename(ctx : CLIFParser.InterpretablenameContext) : T
	/**
	 * Visit a parse tree produced by {@link CLIFParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitName(ctx : CLIFParser.NameContext) : T
	/**
	 * Visit a parse tree produced by {@link CLIFParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTerm(ctx : CLIFParser.TermContext) : T
	/**
	 * Visit a parse tree produced by {@link CLIFParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOperator(ctx : CLIFParser.OperatorContext) : T
	/**
	 * Visit a parse tree produced by {@link CLIFParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEquation(ctx : CLIFParser.EquationContext) : T
	/**
	 * Visit a parse tree produced by {@link CLIFParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSentence(ctx : CLIFParser.SentenceContext) : T
	/**
	 * Visit a parse tree produced by {@link CLIFParser#atomsent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAtomsent(ctx : CLIFParser.AtomsentContext) : T
	/**
	 * Visit a parse tree produced by {@link CLIFParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAtom(ctx : CLIFParser.AtomContext) : T
	/**
	 * Visit a parse tree produced by {@link CLIFParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPredicate(ctx : CLIFParser.PredicateContext) : T
	/**
	 * Visit a parse tree produced by {@link CLIFParser#boolsent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBoolsent(ctx : CLIFParser.BoolsentContext) : T
	/**
	 * Visit a parse tree produced by {@link CLIFParser#quantsent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitQuantsent(ctx : CLIFParser.QuantsentContext) : T
	/**
	 * Visit a parse tree produced by {@link CLIFParser#boundlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBoundlist(ctx : CLIFParser.BoundlistContext) : T
	/**
	 * Visit a parse tree produced by {@link CLIFParser#commentsent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCommentsent(ctx : CLIFParser.CommentsentContext) : T
	/**
	 * Visit a parse tree produced by {@link CLIFParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitModule(ctx : CLIFParser.ModuleContext) : T
	/**
	 * Visit a parse tree produced by {@link CLIFParser#phrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPhrase(ctx : CLIFParser.PhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link CLIFParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitText(ctx : CLIFParser.TextContext) : T
	/**
	 * Visit a parse tree produced by {@link CLIFParser#cltext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCltext(ctx : CLIFParser.CltextContext) : T
	/**
	 * Visit a parse tree produced by {@link CLIFParser#namedtext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNamedtext(ctx : CLIFParser.NamedtextContext) : T
}