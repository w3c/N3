// Generated from n3ws.g4 by ANTLR 4.7.2

    package w3c.n3dev.parser.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link n3wsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface n3wsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link n3wsParser#n3Doc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN3Doc(n3wsParser.N3DocContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3wsParser#n3Statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN3Statement(n3wsParser.N3StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3wsParser#n3Directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN3Directive(n3wsParser.N3DirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3wsParser#sparqlDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSparqlDirective(n3wsParser.SparqlDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3wsParser#sparqlBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSparqlBase(n3wsParser.SparqlBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3wsParser#sparqlPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSparqlPrefix(n3wsParser.SparqlPrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3wsParser#prefixID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixID(n3wsParser.PrefixIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3wsParser#base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase(n3wsParser.BaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3wsParser#triples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriples(n3wsParser.TriplesContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3wsParser#predicateObjectList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateObjectList(n3wsParser.PredicateObjectListContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3wsParser#objectList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectList(n3wsParser.ObjectListContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3wsParser#verb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerb(n3wsParser.VerbContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3wsParser#subject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubject(n3wsParser.SubjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3wsParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(n3wsParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3wsParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(n3wsParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3wsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(n3wsParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3wsParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(n3wsParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3wsParser#pathItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathItem(n3wsParser.PathItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3wsParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(n3wsParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3wsParser#blankNodePropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlankNodePropertyList(n3wsParser.BlankNodePropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3wsParser#collection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection(n3wsParser.CollectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3wsParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormula(n3wsParser.FormulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3wsParser#formulaContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormulaContent(n3wsParser.FormulaContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3wsParser#numericLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(n3wsParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3wsParser#rdfLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRdfLiteral(n3wsParser.RdfLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3wsParser#iri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIri(n3wsParser.IriContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3wsParser#iriList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIriList(n3wsParser.IriListContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3wsParser#prefixedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixedName(n3wsParser.PrefixedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3wsParser#blankNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlankNode(n3wsParser.BlankNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3wsParser#quickVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuickVar(n3wsParser.QuickVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3wsParser#existential}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistential(n3wsParser.ExistentialContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3wsParser#universal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniversal(n3wsParser.UniversalContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3wsParser#langTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLangTag(n3wsParser.LangTagContext ctx);
}