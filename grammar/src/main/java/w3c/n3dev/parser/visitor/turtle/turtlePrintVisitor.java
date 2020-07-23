package w3c.n3dev.parser.visitor.turtle;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import w3c.n3dev.parser.antlr.turtleParser;
import wvw.utils.log.Log;

public class turtlePrintVisitor extends turtleDefaultVisitor {

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
	public Void visitTurtleDoc(turtleParser.TurtleDocContext ctx) {
		print("TurtleDoc");
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
	public Void visitStatement(turtleParser.StatementContext ctx) {
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
	public Void visitDirective(turtleParser.DirectiveContext ctx) {
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
	public Void visitPrefixID(turtleParser.PrefixIDContext ctx) {
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
	public Void visitBase(turtleParser.BaseContext ctx) {
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
	public Void visitSparqlBase(turtleParser.SparqlBaseContext ctx) {
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
	public Void visitSparqlPrefix(turtleParser.SparqlPrefixContext ctx) {
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
	public Void visitTriples(turtleParser.TriplesContext ctx) {
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
	public Void visitPredicateObjectList(turtleParser.PredicateObjectListContext ctx) {
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
	public Void visitObjectList(turtleParser.ObjectListContext ctx) {
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
	public Void visitVerb(turtleParser.VerbContext ctx) {
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
	public Void visitSubject(turtleParser.SubjectContext ctx) {
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
	public Void visitPredicate(turtleParser.PredicateContext ctx) {
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
	public Void visitObject(turtleParser.ObjectContext ctx) {
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
	public Void visitLiteral(turtleParser.LiteralContext ctx) {
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
	public Void visitBlankNodePropertyList(turtleParser.BlankNodePropertyListContext ctx) {
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
	public Void visitCollection(turtleParser.CollectionContext ctx) {
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
	public Void visitRdfLiteral(turtleParser.RdfLiteralContext ctx) {
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
	public Void visitIri(turtleParser.IriContext ctx) {
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
	public Void visitPrefixedName(turtleParser.PrefixedNameContext ctx) {
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
					out += " (" + turtleParser.tokenNames[type] + ")";
				print(out);

			} else {
				Void childResult = c.accept(this);
				result = aggregateResult(result, childResult);
			}
		}

		return result;
	}
}
