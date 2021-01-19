package w3c.n3dev.parser.visitor.turtlestar;

import org.antlr.v4.runtime.tree.TerminalNode;

import w3c.n3dev.parser.ParserErrorListener;
import w3c.n3dev.parser.PrefixException;
import w3c.n3dev.parser.PrefixException.PrefixErrors;
import w3c.n3dev.parser.antlr.turtlestarParser;

public class turtlestarPrefixErrorVisitor extends turtlestarPrefixVisitor {

	private ParserErrorListener listener;

	public turtlestarPrefixErrorVisitor(ParserErrorListener listener) {
		this.listener = listener;
	}

	@Override
	public Void visitPrefixedName(turtlestarParser.PrefixedNameContext ctx) {
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
