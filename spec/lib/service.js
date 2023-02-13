// import { eyebrow } from "../../lib/eyebrow/eyebrow.js";

const serviceUrl = (config.http.port !== undefined ? 
					`${config.http.hostname}:${config.http.port}/n3` :
					`${config.http.hostname}/n3`);

window.loadedEyebrow = function() {
	doneLoading();

	window.eyebrowCtu();
}

window.eyebrowCtu = function() {
	let [ options, onSuccess, onError ] = window.eyebrowParams;
	
	window.eyebrow(options, options.formula, (output) => {
		if (output.success !== undefined)
			onSuccess(output.success);
		else
			onError(output.error);
	});
}

function exec(options, onSuccess, onError) {
	switch (options.system) {
		case 'eyebrow':
			window.eyebrowParams = [ options, onSuccess, onError ];

			// TODO instead of this mess, 
			// do this properly with requirejs
			if (!window.eyebrow) {
				startLoading();

				var load_eyebrow = document.createElement('script');
				load_eyebrow.setAttribute('type', 'module');
				load_eyebrow.setAttribute('src', 'lib/load_eyebrow.js');

				document.head.appendChild(load_eyebrow);

			} else
				window.eyebrowCtu();

			break;

		default:
			// console.log("serviceUrl? ", serviceUrl);
			$.post(serviceUrl, options, (output, status) => {
				// console.log(status, output)

				switch (status) {

					case 'success':
						if (output.success !== undefined)
							onSuccess(output.success)
						else
							onError(output.error)
						break

					default:
						onError("Error reaching N3 service: ", status)
						break
				}
			}).fail((response) => {
				onError("Error reaching N3 service:", response)
			})
			break;
	}
}

function generate_link(formula, format, onSuccess, onError) {
	$.post(serviceUrl, {
		task: 'generate_link',
		formula: formula,
		format: format

	}, (output, status) => {
		// console.log(status, output)

		if (output.success !== undefined)
			onSuccess(output.success)
		else
			onError(output.error)
	})
}

function resolve_link(id, onSuccess, onError) {
	$.post(serviceUrl, {
		task: 'resolve_link',
		id: id

	}, (output, status) => {
		// console.log(status, output)

		if (output.success !== undefined)
			onSuccess(output.success)
		else
			onError(output.error)
	})
}

window.service = { exec: exec, generate_link: generate_link, resolve_link: resolve_link }

// yes it's needed here
loaded();