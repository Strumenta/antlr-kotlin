// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CLIFParser}.
 */
interface CLIFListener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CLIFParser#termseq}.
	 * @param ctx the parse tree
	 */
	fun enterTermseq(ctx: CLIFParser.TermseqContext)
	/**
	 * Exit a parse tree produced by {@link CLIFParser#termseq}.
	 * @param ctx the parse tree
	 */
	fun exitTermseq(ctx: CLIFParser.TermseqContext)
	/**
	 * Enter a parse tree produced by {@link CLIFParser#interpretedname}.
	 * @param ctx the parse tree
	 */
	fun enterInterpretedname(ctx: CLIFParser.InterpretednameContext)
	/**
	 * Exit a parse tree produced by {@link CLIFParser#interpretedname}.
	 * @param ctx the parse tree
	 */
	fun exitInterpretedname(ctx: CLIFParser.InterpretednameContext)
	/**
	 * Enter a parse tree produced by {@link CLIFParser#interpretablename}.
	 * @param ctx the parse tree
	 */
	fun enterInterpretablename(ctx: CLIFParser.InterpretablenameContext)
	/**
	 * Exit a parse tree produced by {@link CLIFParser#interpretablename}.
	 * @param ctx the parse tree
	 */
	fun exitInterpretablename(ctx: CLIFParser.InterpretablenameContext)
	/**
	 * Enter a parse tree produced by {@link CLIFParser#name}.
	 * @param ctx the parse tree
	 */
	fun enterName(ctx: CLIFParser.NameContext)
	/**
	 * Exit a parse tree produced by {@link CLIFParser#name}.
	 * @param ctx the parse tree
	 */
	fun exitName(ctx: CLIFParser.NameContext)
	/**
	 * Enter a parse tree produced by {@link CLIFParser#term}.
	 * @param ctx the parse tree
	 */
	fun enterTerm(ctx: CLIFParser.TermContext)
	/**
	 * Exit a parse tree produced by {@link CLIFParser#term}.
	 * @param ctx the parse tree
	 */
	fun exitTerm(ctx: CLIFParser.TermContext)
	/**
	 * Enter a parse tree produced by {@link CLIFParser#operator}.
	 * @param ctx the parse tree
	 */
	fun enterOperator(ctx: CLIFParser.OperatorContext)
	/**
	 * Exit a parse tree produced by {@link CLIFParser#operator}.
	 * @param ctx the parse tree
	 */
	fun exitOperator(ctx: CLIFParser.OperatorContext)
	/**
	 * Enter a parse tree produced by {@link CLIFParser#equation}.
	 * @param ctx the parse tree
	 */
	fun enterEquation(ctx: CLIFParser.EquationContext)
	/**
	 * Exit a parse tree produced by {@link CLIFParser#equation}.
	 * @param ctx the parse tree
	 */
	fun exitEquation(ctx: CLIFParser.EquationContext)
	/**
	 * Enter a parse tree produced by {@link CLIFParser#sentence}.
	 * @param ctx the parse tree
	 */
	fun enterSentence(ctx: CLIFParser.SentenceContext)
	/**
	 * Exit a parse tree produced by {@link CLIFParser#sentence}.
	 * @param ctx the parse tree
	 */
	fun exitSentence(ctx: CLIFParser.SentenceContext)
	/**
	 * Enter a parse tree produced by {@link CLIFParser#atomsent}.
	 * @param ctx the parse tree
	 */
	fun enterAtomsent(ctx: CLIFParser.AtomsentContext)
	/**
	 * Exit a parse tree produced by {@link CLIFParser#atomsent}.
	 * @param ctx the parse tree
	 */
	fun exitAtomsent(ctx: CLIFParser.AtomsentContext)
	/**
	 * Enter a parse tree produced by {@link CLIFParser#atom}.
	 * @param ctx the parse tree
	 */
	fun enterAtom(ctx: CLIFParser.AtomContext)
	/**
	 * Exit a parse tree produced by {@link CLIFParser#atom}.
	 * @param ctx the parse tree
	 */
	fun exitAtom(ctx: CLIFParser.AtomContext)
	/**
	 * Enter a parse tree produced by {@link CLIFParser#predicate}.
	 * @param ctx the parse tree
	 */
	fun enterPredicate(ctx: CLIFParser.PredicateContext)
	/**
	 * Exit a parse tree produced by {@link CLIFParser#predicate}.
	 * @param ctx the parse tree
	 */
	fun exitPredicate(ctx: CLIFParser.PredicateContext)
	/**
	 * Enter a parse tree produced by {@link CLIFParser#boolsent}.
	 * @param ctx the parse tree
	 */
	fun enterBoolsent(ctx: CLIFParser.BoolsentContext)
	/**
	 * Exit a parse tree produced by {@link CLIFParser#boolsent}.
	 * @param ctx the parse tree
	 */
	fun exitBoolsent(ctx: CLIFParser.BoolsentContext)
	/**
	 * Enter a parse tree produced by {@link CLIFParser#quantsent}.
	 * @param ctx the parse tree
	 */
	fun enterQuantsent(ctx: CLIFParser.QuantsentContext)
	/**
	 * Exit a parse tree produced by {@link CLIFParser#quantsent}.
	 * @param ctx the parse tree
	 */
	fun exitQuantsent(ctx: CLIFParser.QuantsentContext)
	/**
	 * Enter a parse tree produced by {@link CLIFParser#boundlist}.
	 * @param ctx the parse tree
	 */
	fun enterBoundlist(ctx: CLIFParser.BoundlistContext)
	/**
	 * Exit a parse tree produced by {@link CLIFParser#boundlist}.
	 * @param ctx the parse tree
	 */
	fun exitBoundlist(ctx: CLIFParser.BoundlistContext)
	/**
	 * Enter a parse tree produced by {@link CLIFParser#commentsent}.
	 * @param ctx the parse tree
	 */
	fun enterCommentsent(ctx: CLIFParser.CommentsentContext)
	/**
	 * Exit a parse tree produced by {@link CLIFParser#commentsent}.
	 * @param ctx the parse tree
	 */
	fun exitCommentsent(ctx: CLIFParser.CommentsentContext)
	/**
	 * Enter a parse tree produced by {@link CLIFParser#module}.
	 * @param ctx the parse tree
	 */
	fun enterModule(ctx: CLIFParser.ModuleContext)
	/**
	 * Exit a parse tree produced by {@link CLIFParser#module}.
	 * @param ctx the parse tree
	 */
	fun exitModule(ctx: CLIFParser.ModuleContext)
	/**
	 * Enter a parse tree produced by {@link CLIFParser#phrase}.
	 * @param ctx the parse tree
	 */
	fun enterPhrase(ctx: CLIFParser.PhraseContext)
	/**
	 * Exit a parse tree produced by {@link CLIFParser#phrase}.
	 * @param ctx the parse tree
	 */
	fun exitPhrase(ctx: CLIFParser.PhraseContext)
	/**
	 * Enter a parse tree produced by {@link CLIFParser#text}.
	 * @param ctx the parse tree
	 */
	fun enterText(ctx: CLIFParser.TextContext)
	/**
	 * Exit a parse tree produced by {@link CLIFParser#text}.
	 * @param ctx the parse tree
	 */
	fun exitText(ctx: CLIFParser.TextContext)
	/**
	 * Enter a parse tree produced by {@link CLIFParser#cltext}.
	 * @param ctx the parse tree
	 */
	fun enterCltext(ctx: CLIFParser.CltextContext)
	/**
	 * Exit a parse tree produced by {@link CLIFParser#cltext}.
	 * @param ctx the parse tree
	 */
	fun exitCltext(ctx: CLIFParser.CltextContext)
	/**
	 * Enter a parse tree produced by {@link CLIFParser#namedtext}.
	 * @param ctx the parse tree
	 */
	fun enterNamedtext(ctx: CLIFParser.NamedtextContext)
	/**
	 * Exit a parse tree produced by {@link CLIFParser#namedtext}.
	 * @param ctx the parse tree
	 */
	fun exitNamedtext(ctx: CLIFParser.NamedtextContext)
}