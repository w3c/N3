package w3c.n3dev.parser.visitor.n3ws;

import org.antlr.v4.runtime.tree.TerminalNode;

import w3c.n3dev.parser.ParserErrorListener;
import w3c.n3dev.parser.PrefixException;
import w3c.n3dev.parser.PrefixException.PrefixErrors;
import w3c.n3dev.parser.antlr.n3wsParser;

public class n3wsPrefixErrorVisitor extends n3wsPrefixVisitor {

	private ParserErrorListener listener;

	public n3wsPrefixErrorVisitor(ParserErrorListener listener) {
		this.listener = listener;
	}

	@Override
	public Void visitPrefixedName(n3wsParser.PrefixedNameContext ctx) {
		TerminalNode pNameLn = ctx.PNAME_LN();

		if (pNameLn != null) {
			String pName = pNameLn.getText().trim();
			String prefix = pName.substring(0, pName.indexOf(":")).trim();

			if (prefix.isEmpty())
				return null;

			if (!prefixUris.containsKey(prefix))
				listener.prefixError(prefix, pName, new PrefixException(PrefixErrors.UNKNOWN_PREFIX));
		}

		return null;
	}
}