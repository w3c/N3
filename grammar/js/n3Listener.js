// Generated from n3.g4 by ANTLR 4.6
// jshint ignore: start
var antlr4 = require('antlr4/index');

// This class defines a complete listener for a parse tree produced by n3Parser.
function n3Listener() {
	antlr4.tree.ParseTreeListener.call(this);
	return this;
}

n3Listener.prototype = Object.create(antlr4.tree.ParseTreeListener.prototype);
n3Listener.prototype.constructor = n3Listener;

// Enter a parse tree produced by n3Parser#n3Doc.
n3Listener.prototype.enterN3Doc = function(ctx) {
};

// Exit a parse tree produced by n3Parser#n3Doc.
n3Listener.prototype.exitN3Doc = function(ctx) {
};


// Enter a parse tree produced by n3Parser#n3Statement.
n3Listener.prototype.enterN3Statement = function(ctx) {
};

// Exit a parse tree produced by n3Parser#n3Statement.
n3Listener.prototype.exitN3Statement = function(ctx) {
};


// Enter a parse tree produced by n3Parser#n3Directive.
n3Listener.prototype.enterN3Directive = function(ctx) {
};

// Exit a parse tree produced by n3Parser#n3Directive.
n3Listener.prototype.exitN3Directive = function(ctx) {
};


// Enter a parse tree produced by n3Parser#sparqlDirective.
n3Listener.prototype.enterSparqlDirective = function(ctx) {
};

// Exit a parse tree produced by n3Parser#sparqlDirective.
n3Listener.prototype.exitSparqlDirective = function(ctx) {
};


// Enter a parse tree produced by n3Parser#sparqlBase.
n3Listener.prototype.enterSparqlBase = function(ctx) {
};

// Exit a parse tree produced by n3Parser#sparqlBase.
n3Listener.prototype.exitSparqlBase = function(ctx) {
};


// Enter a parse tree produced by n3Parser#sparqlPrefix.
n3Listener.prototype.enterSparqlPrefix = function(ctx) {
};

// Exit a parse tree produced by n3Parser#sparqlPrefix.
n3Listener.prototype.exitSparqlPrefix = function(ctx) {
};


// Enter a parse tree produced by n3Parser#prefixID.
n3Listener.prototype.enterPrefixID = function(ctx) {
};

// Exit a parse tree produced by n3Parser#prefixID.
n3Listener.prototype.exitPrefixID = function(ctx) {
};


// Enter a parse tree produced by n3Parser#base.
n3Listener.prototype.enterBase = function(ctx) {
};

// Exit a parse tree produced by n3Parser#base.
n3Listener.prototype.exitBase = function(ctx) {
};


// Enter a parse tree produced by n3Parser#triples.
n3Listener.prototype.enterTriples = function(ctx) {
};

// Exit a parse tree produced by n3Parser#triples.
n3Listener.prototype.exitTriples = function(ctx) {
};


// Enter a parse tree produced by n3Parser#predicateObjectList.
n3Listener.prototype.enterPredicateObjectList = function(ctx) {
};

// Exit a parse tree produced by n3Parser#predicateObjectList.
n3Listener.prototype.exitPredicateObjectList = function(ctx) {
};


// Enter a parse tree produced by n3Parser#objectList.
n3Listener.prototype.enterObjectList = function(ctx) {
};

// Exit a parse tree produced by n3Parser#objectList.
n3Listener.prototype.exitObjectList = function(ctx) {
};


// Enter a parse tree produced by n3Parser#verb.
n3Listener.prototype.enterVerb = function(ctx) {
};

// Exit a parse tree produced by n3Parser#verb.
n3Listener.prototype.exitVerb = function(ctx) {
};


// Enter a parse tree produced by n3Parser#subject.
n3Listener.prototype.enterSubject = function(ctx) {
};

// Exit a parse tree produced by n3Parser#subject.
n3Listener.prototype.exitSubject = function(ctx) {
};


// Enter a parse tree produced by n3Parser#predicate.
n3Listener.prototype.enterPredicate = function(ctx) {
};

// Exit a parse tree produced by n3Parser#predicate.
n3Listener.prototype.exitPredicate = function(ctx) {
};


// Enter a parse tree produced by n3Parser#object.
n3Listener.prototype.enterObject = function(ctx) {
};

// Exit a parse tree produced by n3Parser#object.
n3Listener.prototype.exitObject = function(ctx) {
};


// Enter a parse tree produced by n3Parser#expression.
n3Listener.prototype.enterExpression = function(ctx) {
};

// Exit a parse tree produced by n3Parser#expression.
n3Listener.prototype.exitExpression = function(ctx) {
};


// Enter a parse tree produced by n3Parser#path.
n3Listener.prototype.enterPath = function(ctx) {
};

// Exit a parse tree produced by n3Parser#path.
n3Listener.prototype.exitPath = function(ctx) {
};


// Enter a parse tree produced by n3Parser#pathItem.
n3Listener.prototype.enterPathItem = function(ctx) {
};

// Exit a parse tree produced by n3Parser#pathItem.
n3Listener.prototype.exitPathItem = function(ctx) {
};


// Enter a parse tree produced by n3Parser#literal.
n3Listener.prototype.enterLiteral = function(ctx) {
};

// Exit a parse tree produced by n3Parser#literal.
n3Listener.prototype.exitLiteral = function(ctx) {
};


// Enter a parse tree produced by n3Parser#blankNodePropertyList.
n3Listener.prototype.enterBlankNodePropertyList = function(ctx) {
};

// Exit a parse tree produced by n3Parser#blankNodePropertyList.
n3Listener.prototype.exitBlankNodePropertyList = function(ctx) {
};


// Enter a parse tree produced by n3Parser#collection.
n3Listener.prototype.enterCollection = function(ctx) {
};

// Exit a parse tree produced by n3Parser#collection.
n3Listener.prototype.exitCollection = function(ctx) {
};


// Enter a parse tree produced by n3Parser#formula.
n3Listener.prototype.enterFormula = function(ctx) {
};

// Exit a parse tree produced by n3Parser#formula.
n3Listener.prototype.exitFormula = function(ctx) {
};


// Enter a parse tree produced by n3Parser#formulaContent.
n3Listener.prototype.enterFormulaContent = function(ctx) {
};

// Exit a parse tree produced by n3Parser#formulaContent.
n3Listener.prototype.exitFormulaContent = function(ctx) {
};


// Enter a parse tree produced by n3Parser#numericLiteral.
n3Listener.prototype.enterNumericLiteral = function(ctx) {
};

// Exit a parse tree produced by n3Parser#numericLiteral.
n3Listener.prototype.exitNumericLiteral = function(ctx) {
};


// Enter a parse tree produced by n3Parser#rdfLiteral.
n3Listener.prototype.enterRdfLiteral = function(ctx) {
};

// Exit a parse tree produced by n3Parser#rdfLiteral.
n3Listener.prototype.exitRdfLiteral = function(ctx) {
};


// Enter a parse tree produced by n3Parser#iri.
n3Listener.prototype.enterIri = function(ctx) {
};

// Exit a parse tree produced by n3Parser#iri.
n3Listener.prototype.exitIri = function(ctx) {
};


// Enter a parse tree produced by n3Parser#iriList.
n3Listener.prototype.enterIriList = function(ctx) {
};

// Exit a parse tree produced by n3Parser#iriList.
n3Listener.prototype.exitIriList = function(ctx) {
};


// Enter a parse tree produced by n3Parser#prefixedName.
n3Listener.prototype.enterPrefixedName = function(ctx) {
};

// Exit a parse tree produced by n3Parser#prefixedName.
n3Listener.prototype.exitPrefixedName = function(ctx) {
};


// Enter a parse tree produced by n3Parser#blankNode.
n3Listener.prototype.enterBlankNode = function(ctx) {
};

// Exit a parse tree produced by n3Parser#blankNode.
n3Listener.prototype.exitBlankNode = function(ctx) {
};


// Enter a parse tree produced by n3Parser#quickVar.
n3Listener.prototype.enterQuickVar = function(ctx) {
};

// Exit a parse tree produced by n3Parser#quickVar.
n3Listener.prototype.exitQuickVar = function(ctx) {
};


// Enter a parse tree produced by n3Parser#existential.
n3Listener.prototype.enterExistential = function(ctx) {
};

// Exit a parse tree produced by n3Parser#existential.
n3Listener.prototype.exitExistential = function(ctx) {
};


// Enter a parse tree produced by n3Parser#universal.
n3Listener.prototype.enterUniversal = function(ctx) {
};

// Exit a parse tree produced by n3Parser#universal.
n3Listener.prototype.exitUniversal = function(ctx) {
};



exports.n3Listener = n3Listener;