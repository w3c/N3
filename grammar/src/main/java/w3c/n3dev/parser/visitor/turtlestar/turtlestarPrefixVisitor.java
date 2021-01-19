package w3c.n3dev.parser.visitor.turtlestar;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.TerminalNode;

import w3c.n3dev.parser.antlr.turtlestarParser;

public class turtlestarPrefixVisitor extends turtlestarDefaultVisitor {

	protected Map<String, String> prefixUris = new HashMap<>();

	@Override
	public Void visitPrefixID(turtlestarParser.PrefixIDContext ctx) {
//		String decl = collectText(ctx, " ");

		TerminalNode pNameNs = ctx.PNAME_NS();
		if (pNameNs == null)
			return null;

		String prefix = pNameNs.getText().trim();
		prefix = prefix.substring(0, prefix.length() - 1);

//		if (prefixUris.containsKey(prefix))
//			listener.prefixError(prefix, decl, new n3PrefixException(PrefixErrors.REDEF_PREFIX));

		String uri = ctx.IRIREF().getText().trim();
		prefixUris.put(prefix, uri);

		return null;
	}

	public Map<String, String> getPrefixUris() {
		return prefixUris;
	}
}