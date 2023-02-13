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
})
(function(CodeMirror) {
	"use strict";

	function validator(text, options, editor) {
		text = editor.getDoc().getValue()
		console.log("input: " + text)
		
		n3.validate(text, {
			syntaxError : function(recognizer,
					offendingSymbol, line, column, msg, err) {
				
				line -= 1
				console.error(`${offendingSymbol} line ${line}, col ${column}: ${msg}`)

				output.push({
					message : msg,
					severity : "error",
					from : {
						line : line,
						ch : offendingSymbol.start
					},
					to : {
						line : line,
						ch : offendingSymbol.stop + 1
					},
				})
			}
		})

		console.log(output)
		return output
	}

	CodeMirror.registerHelper("lint", "n3", validator);
});