// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link emailaddressParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
interface emailaddressVisitor<T> : ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link emailaddressParser#emailaddress}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEmailaddress(ctx : emailaddressParser.EmailaddressContext) : T
	/**
	 * Visit a parse tree produced by {@link emailaddressParser#group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGroup(ctx : emailaddressParser.GroupContext) : T
	/**
	 * Visit a parse tree produced by {@link emailaddressParser#mailbox}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMailbox(ctx : emailaddressParser.MailboxContext) : T
	/**
	 * Visit a parse tree produced by {@link emailaddressParser#routeaddr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRouteaddr(ctx : emailaddressParser.RouteaddrContext) : T
	/**
	 * Visit a parse tree produced by {@link emailaddressParser#route}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRoute(ctx : emailaddressParser.RouteContext) : T
	/**
	 * Visit a parse tree produced by {@link emailaddressParser#addrspec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAddrspec(ctx : emailaddressParser.AddrspecContext) : T
	/**
	 * Visit a parse tree produced by {@link emailaddressParser#localpart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLocalpart(ctx : emailaddressParser.LocalpartContext) : T
	/**
	 * Visit a parse tree produced by {@link emailaddressParser#domain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDomain(ctx : emailaddressParser.DomainContext) : T
	/**
	 * Visit a parse tree produced by {@link emailaddressParser#subdomain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSubdomain(ctx : emailaddressParser.SubdomainContext) : T
	/**
	 * Visit a parse tree produced by {@link emailaddressParser#domainref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDomainref(ctx : emailaddressParser.DomainrefContext) : T
	/**
	 * Visit a parse tree produced by {@link emailaddressParser#phrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPhrase(ctx : emailaddressParser.PhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link emailaddressParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitWord(ctx : emailaddressParser.WordContext) : T
	/**
	 * Visit a parse tree produced by {@link emailaddressParser#lwspchar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLwspchar(ctx : emailaddressParser.LwspcharContext) : T
	/**
	 * Visit a parse tree produced by {@link emailaddressParser#lwsp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLwsp(ctx : emailaddressParser.LwspContext) : T
	/**
	 * Visit a parse tree produced by {@link emailaddressParser#delimeters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDelimeters(ctx : emailaddressParser.DelimetersContext) : T
	/**
	 * Visit a parse tree produced by {@link emailaddressParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAtom(ctx : emailaddressParser.AtomContext) : T
	/**
	 * Visit a parse tree produced by {@link emailaddressParser#quotedpair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitQuotedpair(ctx : emailaddressParser.QuotedpairContext) : T
	/**
	 * Visit a parse tree produced by {@link emailaddressParser#domainliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDomainliteral(ctx : emailaddressParser.DomainliteralContext) : T
	/**
	 * Visit a parse tree produced by {@link emailaddressParser#quotedstring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitQuotedstring(ctx : emailaddressParser.QuotedstringContext) : T
	/**
	 * Visit a parse tree produced by {@link emailaddressParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitComment(ctx : emailaddressParser.CommentContext) : T
}