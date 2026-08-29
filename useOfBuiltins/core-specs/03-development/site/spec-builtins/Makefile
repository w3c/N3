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
	curl -s https://www.w3.org/publications/spec-generator/ -F file=@index.bs -F type=bikeshed-spec -F die-on=nothing > index.html
