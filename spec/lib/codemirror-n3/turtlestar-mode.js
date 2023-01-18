// CodeMirror, copyright (c) by Marijn Haverbeke and others
// Distributed under an MIT license: https://codemirror.net/LICENSE

(function(mod) {
	if (typeof exports == "object" && typeof module == "object") // CommonJS
		mod(require("../../lib/codemirror"));
	else if (typeof define == "function" && define.amd) // AMD
		define([ "../../lib/codemirror" ], mod);
	else
		// Plain browser env
		mod(CodeMirror);
})(function(CodeMirror) {
	"use strict";

	CodeMirror.defineMode("turtlestar", function(config) {
		var indentUnit = config.indentUnit;
		var curPunc;

		function wordRegexp(words) {
			return new RegExp("^(?:" + words.join("|") + ")$", "i");
		}
		var ops = wordRegexp([]);
		// is a look-ahead for any of these keywords
		var keywords = wordRegexp([ "@prefix", "@base", "a" ]);
		var operatorChars = /[*+\-<>=&|]/;
		var langTag = /@[^\s]*/

		function tokenBase(stream, state) {
			var ch = stream.next();
			curPunc = null;
			// checks for nested statements
			if ((ch == "<" && stream.peek() == "<") || 
				(ch == ">" && stream.peek() == ">")) {
				stream.next();
				curPunc = (ch == "<" ? "<<" : ">>");
				return "double-brackets";
			}
			// looks ahead to ensure none the chars are given
			else if (ch == "<" && !stream.match(/^[\s\u00a0=]/, false)) {
				// will consume anything matching the regex
				stream.match(/^[^\s\u00a0>]*>?/);
				return "atom";
			} else if (ch == "\"" || ch == "'") {
				// consume all tokens until (non-esc) closing quote
				state.tokenize = tokenLiteral(ch);
				return state.tokenize(stream, state);
				
			// allows keeping separate state per nested element
			} else if (/[{}\(\),\.;\[\]]/.test(ch)) {
				curPunc = ch;
				return null;
			// eat entire comment
			} else if (ch == "#") {
				stream.skipToEnd();
				return "comment";
			// eat all operator chars
			} else if (operatorChars.test(ch)) {
				stream.eatWhile(operatorChars);
				return null;
			}
			// retain ":" to better differentiate keywords
			// else if (ch == ":") {
				// return "operator";
			// } 
			else {
				// ignore these chars
				stream.eatWhile(/[_\w\d]/);
				
				// prefixes in prefixed-names
				if (stream.peek() == ":") {
					return "variable-3";
				} else {
					var word = stream.current();
					if (keywords.test(word)) {
						return "meta";
					}					
					if (ch >= "A" && ch <= "Z") {
						return "comment";
					} else {
						return "keyword";
					}
				}
			}
		}

		function tokenLiteral(quote) {
			return function(stream, state) {
				var escaped = false, ch;
				while ((ch = stream.next()) != null) {
					if (ch == quote && !escaped) {
						state.tokenize = tokenBase;
						break;
					}
					escaped = !escaped && ch == "\\";
				}
				return "string";
			};
		}

		function pushContext(state, type, col) {
			state.context = {
				prev : state.context,
				indent : state.indent,
				col : col,
				type : type
			};
		}
		function popContext(state) {
			state.indent = state.context.indent;
			state.context = state.context.prev;
		}

		return {
			startState : function() {
				return {
					tokenize : tokenBase,
					context : null,
					indent : 0,
					col : 0
				};
			},

			token : function(stream, state) {
				// console.log("curPunc", curPunc);
				// console.log("token.context", state.context);
				if (stream.sol()) {
					if (state.context && state.context.align == null)
						state.context.align = false;
					state.indent = stream.indentation();
				}
				if (stream.eatSpace())
					return null;
				
				var style = state.tokenize(stream, state);
				// console.log(style);
				// if we're inside a nested structure &
				// no terms have yet been found ..
				if (style != "comment" && state.context
						&& state.context.align == null
						&& state.context.type != "pattern") {
					state.context.align = true;
				}
				
				// if opening char for nested structure is found: 
				// push expected closing char on context stack
				if (curPunc == "(")
					pushContext(state, ")", stream.column());
				else if (curPunc == "[")
					pushContext(state, "]", stream.column());
				else if (curPunc == "{")
					pushContext(state, "}", stream.column());
				else if (curPunc == "<<") {
					pushContext(state, ">>", stream.column());
				}
				// if closing char for nested structure is found
				else if (/\]|\}|\)|>>/.test(curPunc)) {
					// pop anything from context stack that is nested content
					while (state.context && state.context.type == "pattern")
						popContext(state);
					// if closing char matches top of context stack, pop stack
					if (state.context && curPunc == state.context.type)
						popContext(state);
						
				// if at end of statement
				} else if (curPunc == "." && state.context
						&& state.context.type == "pattern")
						
					popContext(state);
				
				// if we're inside a nested structure
				// if a term is found
				else if (/atom|string|variable/.test(style) && state.context) {
					// no other pattern has yet been pushed on context stack
					if (/[\}\]]/.test(state.context.type))
						pushContext(state, "pattern", stream.column());
					
					// another pattern has already been pushed on context stack
					else if (state.context.type == "pattern"
							&& !state.context.align) {
							
						// do some aligning
						state.context.align = true;
						state.context.col = stream.column();
					}
				}

				return style;
			},

			indent : function(state, textAfter) {
				var firstChar = textAfter && textAfter.charAt(0);
				var context = state.context;
				if (/[\]\}]/.test(firstChar))
					while (context && context.type == "pattern")
						context = context.prev;

				var closing = context && firstChar == context.type;
				if (!context)
					return 0;
				else if (context.type == "pattern")
					return context.col;
				else if (context.align)
					return context.col + (closing ? 0 : 1);
				else
					return context.indent + (closing ? 0 : indentUnit);
			},

			lineComment : "#"
		};
	});

	CodeMirror.defineMIME("text/n3", "n3");
});