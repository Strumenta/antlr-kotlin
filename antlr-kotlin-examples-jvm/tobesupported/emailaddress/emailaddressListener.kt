// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link emailaddressParser}.
 */
interface emailaddressListener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#emailaddress}.
	 * @param ctx the parse tree
	 */
	fun enterEmailaddress(ctx: emailaddressParser.EmailaddressContext)
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#emailaddress}.
	 * @param ctx the parse tree
	 */
	fun exitEmailaddress(ctx: emailaddressParser.EmailaddressContext)
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#group}.
	 * @param ctx the parse tree
	 */
	fun enterGroup(ctx: emailaddressParser.GroupContext)
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#group}.
	 * @param ctx the parse tree
	 */
	fun exitGroup(ctx: emailaddressParser.GroupContext)
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#mailbox}.
	 * @param ctx the parse tree
	 */
	fun enterMailbox(ctx: emailaddressParser.MailboxContext)
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#mailbox}.
	 * @param ctx the parse tree
	 */
	fun exitMailbox(ctx: emailaddressParser.MailboxContext)
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#routeaddr}.
	 * @param ctx the parse tree
	 */
	fun enterRouteaddr(ctx: emailaddressParser.RouteaddrContext)
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#routeaddr}.
	 * @param ctx the parse tree
	 */
	fun exitRouteaddr(ctx: emailaddressParser.RouteaddrContext)
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#route}.
	 * @param ctx the parse tree
	 */
	fun enterRoute(ctx: emailaddressParser.RouteContext)
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#route}.
	 * @param ctx the parse tree
	 */
	fun exitRoute(ctx: emailaddressParser.RouteContext)
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#addrspec}.
	 * @param ctx the parse tree
	 */
	fun enterAddrspec(ctx: emailaddressParser.AddrspecContext)
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#addrspec}.
	 * @param ctx the parse tree
	 */
	fun exitAddrspec(ctx: emailaddressParser.AddrspecContext)
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#localpart}.
	 * @param ctx the parse tree
	 */
	fun enterLocalpart(ctx: emailaddressParser.LocalpartContext)
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#localpart}.
	 * @param ctx the parse tree
	 */
	fun exitLocalpart(ctx: emailaddressParser.LocalpartContext)
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#domain}.
	 * @param ctx the parse tree
	 */
	fun enterDomain(ctx: emailaddressParser.DomainContext)
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#domain}.
	 * @param ctx the parse tree
	 */
	fun exitDomain(ctx: emailaddressParser.DomainContext)
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#subdomain}.
	 * @param ctx the parse tree
	 */
	fun enterSubdomain(ctx: emailaddressParser.SubdomainContext)
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#subdomain}.
	 * @param ctx the parse tree
	 */
	fun exitSubdomain(ctx: emailaddressParser.SubdomainContext)
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#domainref}.
	 * @param ctx the parse tree
	 */
	fun enterDomainref(ctx: emailaddressParser.DomainrefContext)
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#domainref}.
	 * @param ctx the parse tree
	 */
	fun exitDomainref(ctx: emailaddressParser.DomainrefContext)
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#phrase}.
	 * @param ctx the parse tree
	 */
	fun enterPhrase(ctx: emailaddressParser.PhraseContext)
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#phrase}.
	 * @param ctx the parse tree
	 */
	fun exitPhrase(ctx: emailaddressParser.PhraseContext)
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#word}.
	 * @param ctx the parse tree
	 */
	fun enterWord(ctx: emailaddressParser.WordContext)
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#word}.
	 * @param ctx the parse tree
	 */
	fun exitWord(ctx: emailaddressParser.WordContext)
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#lwspchar}.
	 * @param ctx the parse tree
	 */
	fun enterLwspchar(ctx: emailaddressParser.LwspcharContext)
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#lwspchar}.
	 * @param ctx the parse tree
	 */
	fun exitLwspchar(ctx: emailaddressParser.LwspcharContext)
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#lwsp}.
	 * @param ctx the parse tree
	 */
	fun enterLwsp(ctx: emailaddressParser.LwspContext)
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#lwsp}.
	 * @param ctx the parse tree
	 */
	fun exitLwsp(ctx: emailaddressParser.LwspContext)
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#delimeters}.
	 * @param ctx the parse tree
	 */
	fun enterDelimeters(ctx: emailaddressParser.DelimetersContext)
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#delimeters}.
	 * @param ctx the parse tree
	 */
	fun exitDelimeters(ctx: emailaddressParser.DelimetersContext)
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#atom}.
	 * @param ctx the parse tree
	 */
	fun enterAtom(ctx: emailaddressParser.AtomContext)
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#atom}.
	 * @param ctx the parse tree
	 */
	fun exitAtom(ctx: emailaddressParser.AtomContext)
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#quotedpair}.
	 * @param ctx the parse tree
	 */
	fun enterQuotedpair(ctx: emailaddressParser.QuotedpairContext)
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#quotedpair}.
	 * @param ctx the parse tree
	 */
	fun exitQuotedpair(ctx: emailaddressParser.QuotedpairContext)
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#domainliteral}.
	 * @param ctx the parse tree
	 */
	fun enterDomainliteral(ctx: emailaddressParser.DomainliteralContext)
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#domainliteral}.
	 * @param ctx the parse tree
	 */
	fun exitDomainliteral(ctx: emailaddressParser.DomainliteralContext)
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#quotedstring}.
	 * @param ctx the parse tree
	 */
	fun enterQuotedstring(ctx: emailaddressParser.QuotedstringContext)
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#quotedstring}.
	 * @param ctx the parse tree
	 */
	fun exitQuotedstring(ctx: emailaddressParser.QuotedstringContext)
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#comment}.
	 * @param ctx the parse tree
	 */
	fun enterComment(ctx: emailaddressParser.CommentContext)
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#comment}.
	 * @param ctx the parse tree
	 */
	fun exitComment(ctx: emailaddressParser.CommentContext)
}