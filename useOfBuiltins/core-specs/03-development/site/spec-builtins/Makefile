help:
	@echo "Generate HTML from a Bikeshed source document:"
	@echo " [builtins.n3]"
	@echo
	@echo "  make builtins Generate builtins.n3 from src/ input files"
	@echo "  make valid    Validate builtin examples in src/"
	@echo
	@echo " [index.html]"
	@echo
	@echo "  make index    Generate index.bs"
	@echo
	@echo "  Choose one of:"
	@echo
	@echo "  make spec     Generate index.html from index.bs"
	@echo "  make watch    Generate index.html each time the source index.bs changes"
	@echo "  make web      Generate index.html (without docker)"

index:
	@ ./gen_bs.sh
	
spec:
	@ docker run --rm --platform linux/amd64 -v "`pwd`:/spec" -w /spec netwerkdigitaalerfgoed/bikeshed:1.7.0

watch:
	@ docker run --rm --platform linux/amd64 -v "`pwd`:/spec" -w /spec netwerkdigitaalerfgoed/bikeshed:1.7.0 sh -c "bikeshed watch"

web:
	@ curl -s https://api.csswg.org/bikeshed/ -F file=@index.bs -F force=1 > index.html	

builtins:
	@ find src -type f -name '*.n3' | paste -s -d ' ' - | xargs eye --nope --quiet --pass > builtins.n3

valid:
	@ find src -type f -name '*.n3' | xargs -n 1 ./example_tester.sh 
