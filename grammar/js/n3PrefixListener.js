var n3Listener = require('./n3Listener').n3Listener;

function n3PrefixListener(listener) {
	n3Listener.call(this);
	this.listener = listener;
	this.prefixes = {};
	
	return this;
}

n3PrefixListener.prototype = Object.create(n3Listener.prototype);
n3PrefixListener.prototype.constructor = n3PrefixListener;

// Exit a parse tree produced by n3Parser#sparqlPrefix.
n3PrefixListener.prototype.exitSparqlPrefix = function(ctx) {
	this.processPrefix(ctx.PNAME_NS(), ctx.IRIREF());
};

// Exit a parse tree produced by n3Parser#prefixID.
n3PrefixListener.prototype.exitPrefixID = function(ctx) {
	this.processPrefix(ctx.PNAME_NS(), ctx.IRIREF());
};

n3PrefixListener.prototype.processPrefix = function(pNameNs, iriRef) {
	if (pNameNs == null)
		return

	var prefix = pNameNs.getText().trim();
	prefix = prefix.substring(0, prefix.length - 1)

	var uri = this.iri(iriRef);
	this.prefixes[prefix] = uri;
}

// Exit a parse tree produced by n3Parser#prefixedName.
n3PrefixListener.prototype.exitPrefixedName = function(ctx) {
	var pNameLn = ctx.PNAME_LN();

	if (pNameLn != null) {
		var pName = pNameLn.getText().trim();
		var prefix = pName.substring(0, pName.indexOf(":")).trim();

		if (prefix == "")
			return;
		
		if (this.prefixes[prefix] === undefined) {
			var line = ctx.start.line
			var start = ctx.start.column
			var end = start + prefix.length
			
			this.listener.unknownPrefix(prefix, pName, line, start, end);
		}
	}
};

n3PrefixListener.prototype.text = function(node) {
	if (node == null)
		return null;
	
	return node.getText().trim();
}

n3PrefixListener.prototype.iri = function(node) {
	var s = this.text(node);
	return s.substring(1, s.length - 1);
}

exports.n3PrefixListener = n3PrefixListener;