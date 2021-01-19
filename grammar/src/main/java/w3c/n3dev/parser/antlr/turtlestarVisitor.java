// Generated from turtlestar.g4 by ANTLR 4.7.2

    package w3c.n3dev.parser.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link turtlestarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface turtlestarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link turtlestarParser#turtleStarDoc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTurtleStarDoc(turtlestarParser.TurtleStarDocContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtlestarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(turtlestarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtlestarParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective(turtlestarParser.DirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtlestarParser#prefixID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixID(turtlestarParser.PrefixIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtlestarParser#base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase(turtlestarParser.BaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtlestarParser#sparqlBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSparqlBase(turtlestarParser.SparqlBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtlestarParser#sparqlPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSparqlPrefix(turtlestarParser.SparqlPrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtlestarParser#triples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriples(turtlestarParser.TriplesContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtlestarParser#predicateObjectList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateObjectList(turtlestarParser.PredicateObjectListContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtlestarParser#objectList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectList(turtlestarParser.ObjectListContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtlestarParser#verb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerb(turtlestarParser.VerbContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtlestarParser#subject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubject(turtlestarParser.SubjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtlestarParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(turtlestarParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtlestarParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(turtlestarParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtlestarParser#tripleX}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTripleX(turtlestarParser.TripleXContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtlestarParser#subjectX}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubjectX(turtlestarParser.SubjectXContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtlestarParser#objectX}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectX(turtlestarParser.ObjectXContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtlestarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(turtlestarParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtlestarParser#blankNodePropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlankNodePropertyList(turtlestarParser.BlankNodePropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtlestarParser#collection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection(turtlestarParser.CollectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtlestarParser#rdfLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRdfLiteral(turtlestarParser.RdfLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtlestarParser#iri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIri(turtlestarParser.IriContext ctx);
	/**
	 * Visit a parse tree produced by {@link turtlestarParser#prefixedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixedName(turtlestarParser.PrefixedNameContext ctx);
}