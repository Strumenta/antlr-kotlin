// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.AbstractParseTreeVisitor

/**
 * This class provides an empty implementation of {@link emailaddressVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
open class emailaddressBaseVisitor<T> : AbstractParseTreeVisitor<T>(), emailaddressVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitEmailaddress(ctx : emailaddressParser.EmailaddressContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitGroup(ctx : emailaddressParser.GroupContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitMailbox(ctx : emailaddressParser.MailboxContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitRouteaddr(ctx : emailaddressParser.RouteaddrContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitRoute(ctx : emailaddressParser.RouteContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitAddrspec(ctx : emailaddressParser.AddrspecContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitLocalpart(ctx : emailaddressParser.LocalpartContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitDomain(ctx : emailaddressParser.DomainContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitSubdomain(ctx : emailaddressParser.SubdomainContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitDomainref(ctx : emailaddressParser.DomainrefContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitPhrase(ctx : emailaddressParser.PhraseContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitWord(ctx : emailaddressParser.WordContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitLwspchar(ctx : emailaddressParser.LwspcharContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitLwsp(ctx : emailaddressParser.LwspContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitDelimeters(ctx : emailaddressParser.DelimetersContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitAtom(ctx : emailaddressParser.AtomContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitQuotedpair(ctx : emailaddressParser.QuotedpairContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitDomainliteral(ctx : emailaddressParser.DomainliteralContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitQuotedstring(ctx : emailaddressParser.QuotedstringContext ) : T { return this!!.visitChildren(ctx)!! }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	override fun visitComment(ctx : emailaddressParser.CommentContext ) : T { return this!!.visitChildren(ctx)!! }
}