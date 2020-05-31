function AstOutput() {
	this.reset()

}
AstOutput.prototype.syntaxError = 
	function(recognizer, offendingSymbol, line, column, msg, err) {
		console.error(`${offendingSymbol} line ${line}, col ${column}: ${msg}`)
		
		$("#error").show()
		$("#error .content").append(`${offendingSymbol}<br />
			&nbsp;&nbsp;&nbsp;&nbsp;
			line ${line}, col ${column}: ${msg}`
		)
	}

AstOutput.prototype.ast = 
	function(el) {
		el = el.replace(/\n/g, "<br/>").replace(/\s/g, "&nbsp;")
	
		$("#ast").show()
		$("#ast .content").append(el)
	}

AstOutput.prototype.reset = 
	function() {
		$("#error").hide()
		$("#error .content").empty()
		
		$("#ast").hide()
		$("#ast .content").empty()
	}