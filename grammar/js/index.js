var antlr4 = require('antlr4');
var N3Lexer = require('./n3Lexer').n3Lexer;
var N3Parser = require('./n3Parser').n3Parser;
var N3PrintVisitor = require('./n3PrintVisitor').n3PrintVisitor;
var N3PrefixListener = require('./n3PrefixListener').n3PrefixListener;

function validate(input, output) {
	var chars = new antlr4.InputStream(input);
	
	var n3Lexer = new N3Lexer(chars);
	n3Lexer.removeErrorListeners();
	n3Lexer.addErrorListener(output);
	
	var tokens = new antlr4.CommonTokenStream(n3Lexer);
	
	var n3Parser = new N3Parser(tokens);
	n3Parser.removeErrorListeners();
	n3Parser.addErrorListener(output);
	
	var prefixListener = new N3PrefixListener(output)
	n3Parser.removeParseListeners();
	n3Parser.addParseListener(prefixListener);
	
	if (output.ast) {
		var n3Visitor = new N3PrintVisitor(output);
		n3Parser.buildParseTrees = true;
		
		var tree = n3Parser.n3Doc();
		tree.accept(n3Visitor);
	
	} else
		n3Parser.n3Doc()
}

exports.validate = validate;