Here, you can find the current draft of the N3 specification document.

You can read it in HTML here: [https://w3c.github.io/N3/spec/](https://w3c.github.io/N3/spec/) (GitHub Pages)

## Local Editing

Some files will be dynamically loaded by the ReSpec code (using the `data-include` feature; notably, `n3.html`). As a result, 
if you try to view the document from your filesystem, you will run into the **same-origin security restriction**. 
This is documented on the [ReSpec Wiki](https://github.com/w3c/respec/wiki/ReSpec-Editor's-Guide#inclusions--transformations).

You can **run a local HTTP server** to view the specification document on your local machine. The "www" folder should be the github repository root folder (files
are loaded relative to that root folder).

For instance, if you have Python installed, you can simply run the following (with the repository root folder as cwd): `python -m http.server`. Then, you can visit [localhost:8000/spec/](http://localhost:8000/spec/) to view the document.
