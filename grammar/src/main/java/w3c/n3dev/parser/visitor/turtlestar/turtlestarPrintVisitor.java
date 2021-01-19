package w3c.n3dev.parser.visitor.turtlestar;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import w3c.n3dev.parser.antlr.turtlestarParser;
import wvw.utils.log.Log;

public class turtlestarPrintVisitor extends turtlestarDefaultVisitor {

	private int lvl = 0;

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitTurtleStarDoc(turtlestarParser.TurtleStarDocContext ctx) {
		print("TurtleStarDoc");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitStatement(turtlestarParser.StatementContext ctx) {
		print("Statement");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitDirective(turtlestarParser.DirectiveContext ctx) {
		print("Directive");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitPrefixID(turtlestarParser.PrefixIDContext ctx) {
		print("PrefixID");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitBase(turtlestarParser.BaseContext ctx) {
		print("Base");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitSparqlBase(turtlestarParser.SparqlBaseContext ctx) {
		print("SparqlBase");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitSparqlPrefix(turtlestarParser.SparqlPrefixContext ctx) {
		print("SparqlPrefix");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitTriples(turtlestarParser.TriplesContext ctx) {
		print("Triples");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitPredicateObjectList(turtlestarParser.PredicateObjectListContext ctx) {
		print("PredicateObjectList");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitObjectList(turtlestarParser.ObjectListContext ctx) {
		print("ObjectList");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitVerb(turtlestarParser.VerbContext ctx) {
		print("Verb");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitTripleX(turtlestarParser.TripleXContext ctx) {
		print("TripleX");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitSubjectX(turtlestarParser.SubjectXContext ctx) {
		print("SubjectX");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitObjectX(turtlestarParser.ObjectXContext ctx) {
		print("ObjectX");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitSubject(turtlestarParser.SubjectContext ctx) {
		print("Subject");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitPredicate(turtlestarParser.PredicateContext ctx) {
		print("Predicate");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitObject(turtlestarParser.ObjectContext ctx) {
		print("Object");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitLiteral(turtlestarParser.LiteralContext ctx) {
		print("Literal");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitBlankNodePropertyList(turtlestarParser.BlankNodePropertyListContext ctx) {
		print("BlankNodePropertyList");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitCollection(turtlestarParser.CollectionContext ctx) {
		print("Collection");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitRdfLiteral(turtlestarParser.RdfLiteralContext ctx) {
		print("RdfLiteral");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitIri(turtlestarParser.IriContext ctx) {
		print("Iri");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitPrefixedName(turtlestarParser.PrefixedNameContext ctx) {
		print("PrefixedName");
		return doVisitChildren(ctx);
	}

	private void print(String element) {
		StringBuffer str = new StringBuffer();
		for (int i = 0; i < lvl; i++)
			str.append(" ");

		str.append(element);
		Log.i(str);
	}

	private Void doVisitChildren(RuleNode ctx) {
		lvl++;
		Void ret = visitChildren(ctx);
		lvl--;

		return ret;
	}

	@Override
	public Void visitChildren(RuleNode node) {
		Void result = defaultResult();
		int n = node.getChildCount();
		for (int i = 0; i < n; i++) {
			if (!shouldVisitNextChild(node, result)) {
				break;
			}

			ParseTree c = node.getChild(i);
			if (c instanceof TerminalNode) {
				TerminalNode t = (TerminalNode) c;
				String out = c.toString();
				int type = t.getSymbol().getType();
				if (type != -1)
					out += " (" + turtlestarParser.tokenNames[type] + ")";
				print(out);

			} else {
				Void childResult = c.accept(this);
				result = aggregateResult(result, childResult);
			}
		}

		return result;
	}
}
