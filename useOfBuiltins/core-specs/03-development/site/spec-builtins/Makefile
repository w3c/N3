help:
	@echo "Generate HTML from a Bikeshed source document:"
	@echo "  make spec    Generate HTML"
	@echo "  make watch   Generate HTML each time the source changes"
	@echo "  make web     Generate HTML (without docker)"

spec:
	docker run --rm --platform linux/amd64 -v "`pwd`:/spec" -w /spec netwerkdigitaalerfgoed/bikeshed:1.7.0

watch:
	docker run --rm --platform linux/amd64 -v "`pwd`:/spec" -w /spec netwerkdigitaalerfgoed/bikeshed:1.7.0 sh -c "bikeshed watch"

web:
	curl -s https://api.csswg.org/bikeshed/ -F file=@index.bs -F force=1 > index.html	
