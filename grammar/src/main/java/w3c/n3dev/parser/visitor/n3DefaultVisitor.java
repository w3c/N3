package w3c.n3dev.parser.visitor;

import org.antlr.v4.runtime.RuleContext;

import w3c.n3dev.parser.antlr.n3BaseVisitor;

public class n3DefaultVisitor extends n3BaseVisitor<Void> {

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
