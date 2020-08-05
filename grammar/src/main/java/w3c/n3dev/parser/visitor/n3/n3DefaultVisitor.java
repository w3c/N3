package w3c.n3dev.parser.visitor.n3;

import org.antlr.v4.runtime.tree.TerminalNode;

import w3c.n3dev.parser.antlr.n3BaseVisitor;

// add any code here that is useful for printing and finding prefix-errors, for instance

public class n3DefaultVisitor extends n3BaseVisitor<Void> {
	
	protected String processIriRef(TerminalNode iriRef) {
		return iriRef.toString().replaceAll("\\s", "");
	}
}
