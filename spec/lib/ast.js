function AstPrinter(onAstLine, onError) {
	this.onAstLine = onAstLine
	this.onError = onError
}
AstPrinter.prototype.syntaxError = 
	function(recognizer, offendingSymbol, line, column, msg, err) {
		// parser error
		if (offendingSymbol)
			this.onError(`${offendingSymbol}\nline ${line}, col ${column}: ${msg}`)
		// lexer error
		else
			this.onError(`line ${line}, col ${column}: ${msg}`)
}

AstPrinter.prototype.reportAmbiguity = 
	function(recognizer, dfa, startIndex, stopIndex, exact, ambigAlts, configs) {
		this.onError(`reportAmbiguity: startIndex: ${startIndex}, stopIndex: ${stopIndex}, exact: ${exact}, ambigAlts: ${ambigAlts}`)
}

AstPrinter.prototype.reportAttemptingFullContext = 
	function(recognizer, dfa, startIndex, stopIndex, conflictingAlts, configs) {
		this.onError(`reportAttemptingFullContext: startIndex: ${startIndex}, stopIndex: ${stopIndex}, conflictingAlts: ${conflictingAlts}`)
}

AstPrinter.prototype.reportContextSensitivity = 
	function(recognizer, dfa, startIndex, stopIndex, prediction, configs) {
		this.onError(`reportContextSensitivity: startIndex: ${startIndex}, stopIndex: ${stopIndex}, prediction: ${prediction}`)
}

AstPrinter.prototype.newAstLine = function(line) {
	line = line.replaceAll(" ", "&nbsp;").replaceAll("\n", "<br />")
	this.onAstLine(line)
}

function doAst(formula, onAstLine, onError, lib) {
	var printer = new AstPrinter(onAstLine, onError)
	lib.parse(formula, printer)
}

n3.ast = function(formula, onAstLine, onError) {
	doAst(formula, onAstLine, onError, n3);
}

turtlestar.ast = function(formula, onAstLine, onError) {
	doAst(formula, onAstLine, onError, turtlestar);
}