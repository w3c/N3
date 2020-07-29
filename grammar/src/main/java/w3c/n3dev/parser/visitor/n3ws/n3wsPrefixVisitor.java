package w3c.n3dev.parser.visitor.n3ws;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.TerminalNode;

import w3c.n3dev.parser.antlr.n3wsParser;

public class n3wsPrefixVisitor extends n3wsDefaultVisitor {

	protected Map<String, String> prefixUris = new HashMap<>();

	@Override
	public Void visitSparqlPrefix(n3wsParser.SparqlPrefixContext ctx) {
		processPrefix(ctx.PNAME_NS(), ctx.IRIREF());

		return null;
	}

	@Override
	public Void visitPrefixID(n3wsParser.PrefixIDContext ctx) {
		processPrefix(ctx.PNAME_NS(), ctx.IRIREF());

		return null;
	}

	private void processPrefix(TerminalNode pNameNs, TerminalNode iriref) {
		// String decl = collectText(ctx, " ");

		if (pNameNs == null)
			return;

		String prefix = pNameNs.getText().trim();
		prefix = prefix.substring(0, prefix.length() - 1);

//		if (prefixUris.containsKey(prefix))
//			listener.prefixError(prefix, decl, new n3PrefixException(PrefixErrors.REDEF_PREFIX));

		String iri = iriref.getText().trim();
		prefixUris.put(prefix, iri);
	}

	public Map<String, String> getPrefixUris() {
		return prefixUris;
	}
}