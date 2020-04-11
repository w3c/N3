package analyze;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.TerminalNode;

import parser.antlr.n3Parser;
import parser.visitor.n3PrefixVisitor;

public class n3BuiltinVisitor extends n3PrefixVisitor {

	private Map<String, Integer> uris = new HashMap<>();
	private Map<String, PrefixEntry> prefixes = new HashMap<>();

	private boolean capturing = false;

	public Map<String, Integer> getUriOcc() {
		return uris;
	}

	public Map<String, PrefixEntry> getPrefixOcc() {
		return prefixes;
	}

	@Override
	public Void visitPredicate(n3Parser.PredicateContext ctx) {
		capturing = true;

		visitChildren(ctx);

		capturing = false;

		return null;
	}

	@Override
	public Void visitIri(n3Parser.IriContext ctx) {
		if (!capturing)
			return null;

		TerminalNode iriRef = ctx.IRIREF();
		if (iriRef != null)
			return visitIriRef(iriRef);

		n3Parser.PrefixedNameContext pn = ctx.prefixedName();
		if (pn != null)
			return visitPrefixedName(pn);

		System.err.println("empty IRI context: " + ctx);

		return null;
	}

	public Void visitIriRef(TerminalNode iriRef) {
		if (!capturing)
			return null;

		String iriRefStr = iriRef.toString().trim();
		iriRefStr = iriRefStr.substring(1, iriRefStr.length() - 1);

		if (iriRefStr.indexOf("#") > 0 || iriRefStr.indexOf("/") > 0) {
			String prefix = iriRefStr.substring(0,
					(iriRefStr.contains("#") ? iriRefStr.indexOf("#") : iriRefStr.lastIndexOf("/")) - 1);

			processStr(prefix, iriRefStr);
		}

		return null;
	}

	@Override
	public Void visitPrefixedName(n3Parser.PrefixedNameContext ctx) {
		if (!capturing)
			return null;

		TerminalNode pName = ctx.PNAME_LN();
		if (pName != null) {
			String pNameStr = pName.getText().trim();

			String ns = pNameStr.substring(0, pNameStr.indexOf(":"));
			String ln = pNameStr.substring(pNameStr.indexOf(":") + 1);

			if (prefixUris.containsKey(ns)) {
				String prefix = prefixUris.get(ns);
				prefix = prefix.substring(1, prefix.length() - 1);

				processStr(prefix, prefix + ln);
			}
		}

		return null;
	}

	private void processStr(String prefix, String uri) {
		if (prefix.contains("swap")) {
			uris.put(uri, uris.containsKey(uri) ? uris.get(uri) + 1 : 1);

			PrefixEntry entry = prefixes.get(prefix);
			if (entry == null) {
				entry = new PrefixEntry();
				prefixes.put(prefix, entry);
			}

			entry.incr(uri);
		}
	}

	public class PrefixEntry {

		private int totalCnt = 0;
		private Map<String, Integer> uriOcc = new HashMap<>();

		public void incr(String uri) {
			totalCnt++;

			uriOcc.put(uri, uriOcc.containsKey(uri) ? uriOcc.get(uri) + 1 : 1);
		}

		public int getTotalCnt() {
			return totalCnt;
		}

		public Map<String, Integer> getUriOcc() {
			return uriOcc;
		}
	}
}
