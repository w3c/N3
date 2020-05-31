package w3c.n3dev.parser.event;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import w3c.n3dev.parser.n3ParserErrorListener;
import w3c.n3dev.parser.n3PrefixException;
import w3c.n3dev.parser.antlr.n3BaseListener;
import w3c.n3dev.parser.antlr.n3Parser;
import w3c.n3dev.parser.n3PrefixException.PrefixErrors;

public class n3EventHandler extends n3BaseListener {

	protected String baseUri = null;
	protected String docUri = null;
	protected Map<String, String> prefixUris = new HashMap<>();

	private n3ParserErrorListener listener;

	public n3EventHandler(String docUri, n3ParserErrorListener listener) {
		this.docUri = docUri;
		this.listener = listener;
	}

	@Override
	public void exitPrefixID(n3Parser.PrefixIDContext ctx) {
		processPrefix(ctx.PNAME_NS(), ctx.IRIREF());
	}

	@Override
	public void exitSparqlPrefix(n3Parser.SparqlPrefixContext ctx) {
		processPrefix(ctx.PNAME_NS(), ctx.IRIREF());
	}

	private void processPrefix(TerminalNode pNameNs, TerminalNode iriRef) {
		if (pNameNs == null)
			return;

		String prefix = pNameNs.getText().trim();
		prefix = prefix.substring(0, prefix.length() - 1);

		String uri = iri(iriRef);
		prefixUris.put(prefix, uri);
	}

	@Override
	public void exitBase(n3Parser.BaseContext ctx) {
		processBase(ctx.IRIREF());
	}

	@Override
	public void exitSparqlBase(n3Parser.SparqlBaseContext ctx) {
		processBase(ctx.IRIREF());
	}

	private void processBase(TerminalNode iriRef) {
		baseUri = iriRef.getText().trim();
		baseUri = baseUri.substring(1, baseUri.length() - 1);
	}

	@Override
	public void exitPrefixedName(n3Parser.PrefixedNameContext ctx) {
		TerminalNode pNameLn = ctx.PNAME_LN();

		if (pNameLn != null) {
			String pName = pNameLn.getText().trim();
			String prefix = pName.substring(0, pName.indexOf(":")).trim();

			if (prefix.isEmpty())
				return;

			if (!prefixUris.containsKey(prefix))
				listener.prefixError(prefix, pName, new n3PrefixException(PrefixErrors.UNKNOWN_PREFIX));
		}
	}

	protected String resolvePName(String ns, String name) {
		String prefix = (ns == null || ns.isEmpty() ? getBaseUri() : prefixUris.get(ns));

		return prefix + name;
	}

	protected String getBaseUri() {
		return (baseUri == null ? docUri : baseUri);
	}

	protected String text(ParseTree node) {
		if (node == null)
			return null;
		return node.getText().trim();
	}

	protected String text(Token token) {
		if (token == null)
			return null;
		return token.getText().trim();
	}

	protected String iri(TerminalNode n) {
		String s = text(n);

		return s.substring(1, s.length() - 1);
	}

	protected String collectText(RuleContext ctx, String separator) {
		StringBuffer str = new StringBuffer();

		for (int i = 0; i < ctx.getChildCount(); i++) {
			if (str.length() > 0)
				str.append(separator);
			str.append(ctx.getChild(i));
		}

		return str.toString();
	}
}
