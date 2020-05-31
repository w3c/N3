// Generated from turtle.g4 by ANTLR 4.7.2

    package w3c.n3dev.parser.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link turtleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface turtleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link turtleParser#turtleDoc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTurtleDoc(turtleParser.TurtleDocContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtleParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(turtleParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtleParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective(turtleParser.DirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtleParser#prefixID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixID(turtleParser.PrefixIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtleParser#base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase(turtleParser.BaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtleParser#sparqlBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSparqlBase(turtleParser.SparqlBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtleParser#sparqlPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSparqlPrefix(turtleParser.SparqlPrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtleParser#triples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriples(turtleParser.TriplesContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtleParser#predicateObjectList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateObjectList(turtleParser.PredicateObjectListContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtleParser#objectList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectList(turtleParser.ObjectListContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtleParser#verb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerb(turtleParser.VerbContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtleParser#subject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubject(turtleParser.SubjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtleParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(turtleParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtleParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(turtleParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtleParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(turtleParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtleParser#blankNodePropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlankNodePropertyList(turtleParser.BlankNodePropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtleParser#collection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection(turtleParser.CollectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtleParser#rdfLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRdfLiteral(turtleParser.RdfLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtleParser#iri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIri(turtleParser.IriContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtleParser#prefixedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixedName(turtleParser.PrefixedNameContext ctx);
}