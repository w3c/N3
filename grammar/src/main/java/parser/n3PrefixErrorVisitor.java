package parser;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.TerminalNode;

import parser.n3PrefixException.PrefixErrors;
import parser.antlr.n3Parser;

public class n3PrefixErrorVisitor extends n3DefaultVisitor {

	private Map<String, String> prefixUris = new HashMap<>();

	private n3AbstractParserErrorListener listener;

	public n3PrefixErrorVisitor(n3AbstractParserErrorListener listener) {
		this.listener = listener;
	}

	@Override
	public Void visitPrefixID(n3Parser.PrefixIDContext ctx) {
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

	@Override
	public Void visitPrefixedName(n3Parser.PrefixedNameContext ctx) {
		TerminalNode pNameLn = ctx.PNAME_LN();

		if (pNameLn != null) {
			String pName = pNameLn.getText().trim();
			String prefix = pName.substring(0, pName.indexOf(":")).trim();

			if (prefix.isEmpty())
				return null;

			if (!prefixUris.containsKey(prefix))
				listener.prefixError(prefix, pName, new n3PrefixException(PrefixErrors.UNKNOWN_PREFIX));
		}

		return null;
	}

}
