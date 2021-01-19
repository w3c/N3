// Generated from turtlestar.g4 by ANTLR 4.7.2

    package w3c.n3dev.parser.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link turtlestarParser}.
 */
public interface turtlestarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link turtlestarParser#turtleStarDoc}.
	 * @param ctx the parse tree
	 */
	void enterTurtleStarDoc(turtlestarParser.TurtleStarDocContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtlestarParser#turtleStarDoc}.
	 * @param ctx the parse tree
	 */
	void exitTurtleStarDoc(turtlestarParser.TurtleStarDocContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtlestarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(turtlestarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtlestarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(turtlestarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtlestarParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(turtlestarParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtlestarParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(turtlestarParser.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtlestarParser#prefixID}.
	 * @param ctx the parse tree
	 */
	void enterPrefixID(turtlestarParser.PrefixIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtlestarParser#prefixID}.
	 * @param ctx the parse tree
	 */
	void exitPrefixID(turtlestarParser.PrefixIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtlestarParser#base}.
	 * @param ctx the parse tree
	 */
	void enterBase(turtlestarParser.BaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtlestarParser#base}.
	 * @param ctx the parse tree
	 */
	void exitBase(turtlestarParser.BaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtlestarParser#sparqlBase}.
	 * @param ctx the parse tree
	 */
	void enterSparqlBase(turtlestarParser.SparqlBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtlestarParser#sparqlBase}.
	 * @param ctx the parse tree
	 */
	void exitSparqlBase(turtlestarParser.SparqlBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtlestarParser#sparqlPrefix}.
	 * @param ctx the parse tree
	 */
	void enterSparqlPrefix(turtlestarParser.SparqlPrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtlestarParser#sparqlPrefix}.
	 * @param ctx the parse tree
	 */
	void exitSparqlPrefix(turtlestarParser.SparqlPrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtlestarParser#triples}.
	 * @param ctx the parse tree
	 */
	void enterTriples(turtlestarParser.TriplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtlestarParser#triples}.
	 * @param ctx the parse tree
	 */
	void exitTriples(turtlestarParser.TriplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtlestarParser#predicateObjectList}.
	 * @param ctx the parse tree
	 */
	void enterPredicateObjectList(turtlestarParser.PredicateObjectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtlestarParser#predicateObjectList}.
	 * @param ctx the parse tree
	 */
	void exitPredicateObjectList(turtlestarParser.PredicateObjectListContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtlestarParser#objectList}.
	 * @param ctx the parse tree
	 */
	void enterObjectList(turtlestarParser.ObjectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtlestarParser#objectList}.
	 * @param ctx the parse tree
	 */
	void exitObjectList(turtlestarParser.ObjectListContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtlestarParser#verb}.
	 * @param ctx the parse tree
	 */
	void enterVerb(turtlestarParser.VerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtlestarParser#verb}.
	 * @param ctx the parse tree
	 */
	void exitVerb(turtlestarParser.VerbContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtlestarParser#subject}.
	 * @param ctx the parse tree
	 */
	void enterSubject(turtlestarParser.SubjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtlestarParser#subject}.
	 * @param ctx the parse tree
	 */
	void exitSubject(turtlestarParser.SubjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtlestarParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(turtlestarParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtlestarParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(turtlestarParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtlestarParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(turtlestarParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtlestarParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(turtlestarParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtlestarParser#tripleX}.
	 * @param ctx the parse tree
	 */
	void enterTripleX(turtlestarParser.TripleXContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtlestarParser#tripleX}.
	 * @param ctx the parse tree
	 */
	void exitTripleX(turtlestarParser.TripleXContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtlestarParser#subjectX}.
	 * @param ctx the parse tree
	 */
	void enterSubjectX(turtlestarParser.SubjectXContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtlestarParser#subjectX}.
	 * @param ctx the parse tree
	 */
	void exitSubjectX(turtlestarParser.SubjectXContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtlestarParser#objectX}.
	 * @param ctx the parse tree
	 */
	void enterObjectX(turtlestarParser.ObjectXContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtlestarParser#objectX}.
	 * @param ctx the parse tree
	 */
	void exitObjectX(turtlestarParser.ObjectXContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtlestarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(turtlestarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtlestarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(turtlestarParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtlestarParser#blankNodePropertyList}.
	 * @param ctx the parse tree
	 */
	void enterBlankNodePropertyList(turtlestarParser.BlankNodePropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtlestarParser#blankNodePropertyList}.
	 * @param ctx the parse tree
	 */
	void exitBlankNodePropertyList(turtlestarParser.BlankNodePropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtlestarParser#collection}.
	 * @param ctx the parse tree
	 */
	void enterCollection(turtlestarParser.CollectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtlestarParser#collection}.
	 * @param ctx the parse tree
	 */
	void exitCollection(turtlestarParser.CollectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtlestarParser#rdfLiteral}.
	 * @param ctx the parse tree
	 */
	void enterRdfLiteral(turtlestarParser.RdfLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtlestarParser#rdfLiteral}.
	 * @param ctx the parse tree
	 */
	void exitRdfLiteral(turtlestarParser.RdfLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtlestarParser#iri}.
	 * @param ctx the parse tree
	 */
	void enterIri(turtlestarParser.IriContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtlestarParser#iri}.
	 * @param ctx the parse tree
	 */
	void exitIri(turtlestarParser.IriContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtlestarParser#prefixedName}.
	 * @param ctx the parse tree
	 */
	void enterPrefixedName(turtlestarParser.PrefixedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtlestarParser#prefixedName}.
	 * @param ctx the parse tree
	 */
	void exitPrefixedName(turtlestarParser.PrefixedNameContext ctx);
}