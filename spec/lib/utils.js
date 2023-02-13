function escapeHtml(html) {
	var text = document.createTextNode(html);
	var p = document.createElement('p');
	p.appendChild(text);
	return p.innerHTML;
}

// based on
// https://www.w3schools.com/howto/howto_js_copy_clipboard.asp
function copyText(source, tooltip) {
	navigator.clipboard.writeText($(source).text());

	// alert("Copied code to clipboard");
	$(tooltip).html("Copied to clipboard!");
} 

function resetCopyTip(tooltip) {
  	$(tooltip).html("Copy to clipboard");
}