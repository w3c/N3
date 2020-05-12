// Generated from n3.g4 by ANTLR 4.6
// jshint ignore: start
var antlr4 = require('antlr4/index');

// This class defines a complete generic visitor for a parse tree produced by n3Parser.

function n3Visitor() {
	antlr4.tree.ParseTreeVisitor.call(this);
	return this;
}

n3Visitor.prototype = Object.create(antlr4.tree.ParseTreeVisitor.prototype);
n3Visitor.prototype.constructor = n3Visitor;

// Visit a parse tree produced by n3Parser#n3Doc.
n3Visitor.prototype.visitN3Doc = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by n3Parser#n3Statement.
n3Visitor.prototype.visitN3Statement = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by n3Parser#n3Directive.
n3Visitor.prototype.visitN3Directive = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by n3Parser#sparqlDirective.
n3Visitor.prototype.visitSparqlDirective = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by n3Parser#sparqlBase.
n3Visitor.prototype.visitSparqlBase = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by n3Parser#sparqlPrefix.
n3Visitor.prototype.visitSparqlPrefix = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by n3Parser#prefixID.
n3Visitor.prototype.visitPrefixID = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by n3Parser#base.
n3Visitor.prototype.visitBase = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by n3Parser#triples.
n3Visitor.prototype.visitTriples = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by n3Parser#predicateObjectList.
n3Visitor.prototype.visitPredicateObjectList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by n3Parser#objectList.
n3Visitor.prototype.visitObjectList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by n3Parser#verb.
n3Visitor.prototype.visitVerb = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by n3Parser#subject.
n3Visitor.prototype.visitSubject = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by n3Parser#predicate.
n3Visitor.prototype.visitPredicate = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by n3Parser#object.
n3Visitor.prototype.visitObject = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by n3Parser#expression.
n3Visitor.prototype.visitExpression = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by n3Parser#path.
n3Visitor.prototype.visitPath = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by n3Parser#pathItem.
n3Visitor.prototype.visitPathItem = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by n3Parser#literal.
n3Visitor.prototype.visitLiteral = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by n3Parser#blankNodePropertyList.
n3Visitor.prototype.visitBlankNodePropertyList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by n3Parser#collection.
n3Visitor.prototype.visitCollection = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by n3Parser#formula.
n3Visitor.prototype.visitFormula = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by n3Parser#formulaContent.
n3Visitor.prototype.visitFormulaContent = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by n3Parser#numericLiteral.
n3Visitor.prototype.visitNumericLiteral = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by n3Parser#rdfLiteral.
n3Visitor.prototype.visitRdfLiteral = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by n3Parser#iri.
n3Visitor.prototype.visitIri = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by n3Parser#iriList.
n3Visitor.prototype.visitIriList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by n3Parser#prefixedName.
n3Visitor.prototype.visitPrefixedName = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by n3Parser#blankNode.
n3Visitor.prototype.visitBlankNode = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by n3Parser#quickVar.
n3Visitor.prototype.visitQuickVar = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by n3Parser#existential.
n3Visitor.prototype.visitExistential = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by n3Parser#universal.
n3Visitor.prototype.visitUniversal = function(ctx) {
  return this.visitChildren(ctx);
};



exports.n3Visitor = n3Visitor;