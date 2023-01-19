function SyntaxValidator(onSuggestion) {
	this.output = []
	this.onSuggestion = onSuggestion
}

SyntaxValidator.prototype.syntaxError = function (recognizer, offendingSymbol,
	line, column, msg, err) {

	line -= 1

	// parser error
	if (offendingSymbol) {
		var start = offendingSymbol.start
		var end = offendingSymbol.stop + 1

		// this.consoleError("parser", line, start, end, msg)
		this.output.push({
			message: msg,
			severity: "error",
			from: {
				line: line,
				ch: start
			},
			to: {
				line: line,
				ch: end
			}
		})

		// lexer error
	} else {
		var str = err.input.strdata
		var start = column
		var end = column + str.length

		// this.consoleError("lexer", line, start, end, msg)
		this.output.push({
			message: msg,
			severity: "error",
			from: {
				line: line,
				ch: start
			},
			to: {
				line: line,
				ch: end
			}
		})
	}
}

SyntaxValidator.prototype.builtinNamespaces = {
	math: 'http://www.w3.org/2000/10/swap/math#',
	string: 'http://www.w3.org/2000/10/swap/string#',
	list: 'http://www.w3.org/2000/10/swap/list#',
	log: 'http://www.w3.org/2000/10/swap/log#',
	crypto: 'http://www.w3.org/2000/10/swap/crypto#',
	os: 'http://www.w3.org/2000/10/swap/os#'
}

SyntaxValidator.prototype.unknownPrefix = function (prefix, pName, line, start, end) {
	// if (namespaces[prefix]) {
	// 	if (this.onSuggestion && this.onSuggestion.namespace(prefix, namespaces[prefix]))
	// 		return
	// }

	line -= 1

	var msg = `unknown prefix "${prefix}" in "${pName}`
	// this.consoleError("parser", line, start, end, msg)

	this.output.push({
		message: msg,
		severity: "error",
		from: {
			line: line,
			ch: start
		},
		to: {
			line: line,
			ch: end
		}
	})
}

SyntaxValidator.prototype.consoleError = function (type, line, start, end, msg) {
	console.error(`[${type}] line ${line}, col ${start}-${end}: ${msg}`)
}

function doLint(text, options, editor, onSuggestion, lib) {
	var output = []
	text = editor.getDoc().getValue()

	var validator = new SyntaxValidator(onSuggestion)

	try {
		lib.parse(text, validator)
		// console.log(validator.output)
		return validator.output

	} catch (e) {
		// console.error(e);
	}
}

n3Lint = function (onSuggestion, n3) {
	return function (text, options, editor) {
		return doLint(text, options, editor, onSuggestion, n3)
	}
}

// doesn't seem to work for me
// tried adding it to codemirror addon folder (copying setup from other
// lints); re-installing codemirror (npm install), ..

// CodeMirror.registerHelper("lint", "n3", validator);
