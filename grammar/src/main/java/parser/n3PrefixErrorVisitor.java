package parser;

import org.antlr.v4.runtime.tree.TerminalNode;

import parser.n3PrefixException.PrefixErrors;
import parser.antlr.n3Parser;

public class n3PrefixErrorVisitor extends n3PrefixVisitor {

	private n3AbstractParserErrorListener listener;

	public n3PrefixErrorVisitor(n3AbstractParserErrorListener listener) {
		this.listener = listener;
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
