/*
 [The "BSD licence"]
 Copyright (c) 2019, William Van Woensel (W3C N3 Community Group),
 Łukasz Szeremeta (University of Bialystok, http://www.uwb.edu.pl/)
 Dominik Tomaszuk (University of Bialystok, W3C N3 Community Group)
  					 
 All rights reserved.

 Based on ANTLR TURTLE grammar
 (https://github.com/antlr/grammars-v4/blob/master/turtle/TURTLE.g4)
 distributed under BSD licence.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
*/

grammar n3;

@header {
    package w3c.n3dev.parser.antlr;
}

n3Doc
	: (n3Statement '.' | sparqlDirective)* EOF
	;

COMMENT
	: '#' ~[\r\n\f]* -> skip
  	/* N3 nor Turtle syntax actually allows for comments (?) */
	;

n3Statement 
	: n3Directive
	| triples
	;

n3Directive
	: prefixID 
	| base
	;
	
sparqlDirective
	: sparqlBase 
	| sparqlPrefix
	;

sparqlBase 
	: BASE IRIREF
	;
	
sparqlPrefix
	: PREFIX PNAME_NS IRIREF
	;

prefixID 
	: '@prefix' PNAME_NS IRIREF
	;

base 
	: '@base' IRIREF
	;

triples 
	: subject predicateObjectList?
	;
	
predicateObjectList 
	: verb objectList (';' (verb objectList)?)*
	;
	
objectList 
	: object (',' object)*
	;
	
verb 
	: predicate 
	| 'a' 
	| 'has' expression 
	| 'is' expression 'of'
	| '=' 
	| '<=' 
	| '=>'
	;
	
subject 
	: expression
	;
	
predicate
	: (expression | '<-' expression)
/* allow first predicate in a path to also be inverted */
	;
	
object 
	: expression
   	;

expression
	: path
	;

path
	: pathItem ('!' path | '^' path)?
	;
	
pathItem 
	: iri 
	| blankNode 
	| quickVar 
	| collection 
	| blankNodePropertyList 
	| literal 
	| formula
	;

literal 
	: rdfLiteral 
	| numericLiteral 
	| BooleanLiteral
	;
	
blankNodePropertyList 
	: '[' predicateObjectList ']'
	;
		
collection 
	: '(' object* ')'
	;
	
formula 
	: '{' formulaContent? '}'
	;

formulaContent 
	: n3Statement ('.' formulaContent?)?
	| sparqlDirective formulaContent?
	;

numericLiteral 
	: INTEGER 
	| DECIMAL 
	| DOUBLE
	;
   
rdfLiteral 
	: String (LANGTAG | '^^' iri)?
	;
	
BooleanLiteral 
	: 'true' 
	| 'false'
	;
	
String 
	: STRING_LITERAL_QUOTE 
	| STRING_LITERAL_SINGLE_QUOTE 
	| STRING_LITERAL_LONG_SINGLE_QUOTE 
	| STRING_LITERAL_LONG_QUOTE
	;
	
iri 
	: IRIREF 
	| prefixedName
	;
	
prefixedName 
	: PNAME_NS
	| PNAME_LN
/* PNAME_NS will be matched for ':' (i.e., "empty") prefixedNames
 * hence this cannot be a lexer rule; for s/p/o of only ':', PNAME_NS will be returned
 * instead of PrefixedName token */
	;

blankNode 
	: BLANK_NODE_LABEL 
	| ANON
	;
	
quickVar 
	: QuickVarName
	// only made this a parser rule for consistency 
	// (all other path-items are also parser rules)
	;
	
IRIREF 
	: '<' (~[\u0000-\u0020<>"{}|^`\\] | UCHAR)* '>' /* #x00=NULL #01-#x1F=control codes #x20=space */
/* production below allows non-encoded spaces */
// 	: '<' (~[\u0000-\u001F<>"{}|^`\\] | UCHAR)* '>'
	;
	
PNAME_NS 
	: PN_PREFIX? ':'
/* when using PrefixedName (i.e., lexer rule), this must occur *before* PrefixedName
 * 		else, PNAME_NS will not be chosen for prefix decl (e.g., turtle-syntax-bnode-01)
 * regardless, it should occur before PNAME_LN
 */
	;
	
PNAME_LN
	: PNAME_NS PN_LOCAL
/* rule must be above PN_LOCAL */
	;
	
BLANK_NODE_LABEL 
	: '_:' (PN_CHARS_U | [0-9]) ((PN_CHARS | '.')* PN_CHARS)?
	;
	
LANGTAG 
	: '@' [a-zA-Z]+ ('-' [a-zA-Z0-9]+)*
	;
	
INTEGER 
	: [+-]? [0-9]+
	;
	
DECIMAL 
	: [+-]? [0-9]* '.' [0-9]+
	;
	
DOUBLE 
	: [+-]? ([0-9]+ '.' [0-9]* EXPONENT | '.' [0-9]+ EXPONENT | [0-9]+ EXPONENT)
	;
	
EXPONENT 
	: [eE] [+-]? [0-9]+
	;
	
STRING_LITERAL_LONG_SINGLE_QUOTE 
	: '\'\'\'' (('\'' | '\'\'')? (~['\\] | ECHAR | UCHAR))* '\'\'\''
/* needs to be above the "regular" quotes ; else first two '' will be matched as empty string */
	;
	
STRING_LITERAL_LONG_QUOTE 
	: '"""' (('"' | '""')? (~["\\] | ECHAR | UCHAR))* '"""'
/* needs to be above the "regular" quotes ; else first two "" will be matched as empty string */
	;
	
STRING_LITERAL_QUOTE 
	: '"' (~[\u0022\u005C\u000A\u000D] | ECHAR | UCHAR)* '"' /* #x22=" #x5C=\ #xA=new line #xD=carriage return */
	;
	
STRING_LITERAL_SINGLE_QUOTE 
	: '\'' (~[\u0027\u005C\u000A\u000D] | ECHAR | UCHAR)* '\'' /* #x27=' #x5C=\ #xA=new line #xD=carriage return */
	;
	
UCHAR 
	: '\\u' HEX HEX HEX HEX | '\\U' HEX HEX HEX HEX HEX HEX HEX HEX
	;
	
ECHAR 
	: '\\' [tbnrf"'\\]
	;
	
WS 
	: [\u0020\u0009\u000D\u000A] -> skip /* #x20=space #x9=character tabulation #xD=carriage return #xA=new line */
	;
	
 ANON 
 	: '[' WS* ']'
	;

QuickVarName
	: '?' PN_CHARS_U PN_CHARS*
/* approximating "barename" with PN_CHARS - they seem similar enough */
	;

PN_CHARS_U 
	: PN_CHARS_BASE 
	| '_'
	;
		
PN_CHARS_BASE 
	: [A-Z] | [a-z] | [\u00C0-\u00D6] | [\u00D8-\u00F6] | [\u00F8-\u02FF] | [\u0370-\u037D] | [\u037F-\u1FFF] | [\u200C-\u200D] | [\u2070-\u218F] | [\u2C00-\u2FEF] | [\u3001-\uD7FF] | [\uF900-\uFDCF] | [\uFDF0-\uFFFD]
/* antlr cannot include (at least on Java) the following: #x10000-#xEFFFF */
	;
	
PN_CHARS 
	: PN_CHARS_U | '-' | [0-9] | '\u00B7' | [\u0300-\u036F] | [\u203F-\u2040]
	;
	
BASE:
	('B'|'b') ('A'|'a') ('S'|'s') ('E'|'e')
	;
	
PREFIX:
	('P'|'p') ('R'|'r') ('E'|'e') ('F'|'f') ('I'|'i') ('X'|'x')
/* BASE and PREFIX must be case-insensitive, hence these monstrosities */
/* BASE and PREFIX must be above PN_PREFIX, PN_LOCAL */
	;
	
PN_PREFIX 
	: PN_CHARS_BASE ((PN_CHARS | '.')* PN_CHARS)?
	;
	
PN_LOCAL 
	: (PN_CHARS_U | ':' | [0-9] | PLX) ((PN_CHARS | '.' | ':' | PLX)* (PN_CHARS | ':' | PLX))?
	;
	
PLX 
	: PERCENT 
	| PN_LOCAL_ESC
	;
	
PERCENT 
	: '%' HEX HEX
	;
	
HEX 
	: [0-9] | [A-F] | [a-f]
	;
	
PN_LOCAL_ESC 
	: '\\' ('_' | '~' | '.' | '-' | '!' | '$' | '&' | '\'' | '(' | ')' | '*' | '+' | ',' | ';' | '=' | '/' | '?' | '#' | '@' | '%')
	;
