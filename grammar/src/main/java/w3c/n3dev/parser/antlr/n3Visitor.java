// Generated from n3.g4 by ANTLR 4.7.2

    package w3c.n3dev.parser.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link n3Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface n3Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link n3Parser#n3Doc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN3Doc(n3Parser.N3DocContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3Parser#n3Statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN3Statement(n3Parser.N3StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3Parser#n3Directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN3Directive(n3Parser.N3DirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3Parser#sparqlDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSparqlDirective(n3Parser.SparqlDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3Parser#sparqlBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSparqlBase(n3Parser.SparqlBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3Parser#sparqlPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSparqlPrefix(n3Parser.SparqlPrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3Parser#prefixID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixID(n3Parser.PrefixIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3Parser#base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase(n3Parser.BaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3Parser#triples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriples(n3Parser.TriplesContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3Parser#predicateObjectList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateObjectList(n3Parser.PredicateObjectListContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3Parser#objectList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectList(n3Parser.ObjectListContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3Parser#verb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerb(n3Parser.VerbContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3Parser#subject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubject(n3Parser.SubjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3Parser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(n3Parser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3Parser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(n3Parser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(n3Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3Parser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(n3Parser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3Parser#pathItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathItem(n3Parser.PathItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(n3Parser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3Parser#blankNodePropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlankNodePropertyList(n3Parser.BlankNodePropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3Parser#iriPropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIriPropertyList(n3Parser.IriPropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3Parser#collection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection(n3Parser.CollectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3Parser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormula(n3Parser.FormulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3Parser#formulaContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormulaContent(n3Parser.FormulaContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3Parser#numericLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(n3Parser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3Parser#rdfLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRdfLiteral(n3Parser.RdfLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3Parser#iri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIri(n3Parser.IriContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3Parser#prefixedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixedName(n3Parser.PrefixedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3Parser#blankNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlankNode(n3Parser.BlankNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3Parser#quickVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuickVar(n3Parser.QuickVarContext ctx);
}