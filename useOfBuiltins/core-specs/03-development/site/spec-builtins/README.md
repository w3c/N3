# Notifications in Value-Adding Networks

This is the template for the https://www.eventnotifications.net website.

Requirements are written in [Markdown](https://daringfireball.net/projects/markdown/) and transformed to HTML using the [Bikeshed preprocessor](https://tabatkins.github.io/bikeshed/).

## Generate HTML

### Using Docker

To view HTML output locally (using a [Docker container](https://github.com/netwerk-digitaal-erfgoed/bikeshed-docker)),
run:

```bash
make spec
```

and open the `index.html` file:

```bash
open index.html
```

Alternatively, to update the HTML every time you make changes to [the source document](index.bs):

```bash
make watch
```

### Without Docker

When Docker is not available on your machine use the `web` target which uses a cloud based
Bikeshed processor

```bash
make web
```

and open the `index.html` file:

```bash
open index.html
```

## Contributor hints

- All diagrams should be provided in SVG with the [Diagrams.net](https://app.diagrams.net) sources stored in the `diagrams` folder
- All JSON-LD examples should be provided as seperate documents in the `examples` folder

### Steps to contribute

1. In the upper right part of the [Git repo](https://github.com/MellonScholarlyCommunication/spec-notifications) click on **Fork** and create a new fork
2. Clone a copy of the code on your computer. E.g.

```
git clone git@github.com:{your-git-account-name}/spec-notifications.git
```

3. Make a new branch. E.g. `pr/fixing-typos`

```
git checkout -b pr/fixing-typos
```

4. Make your edits. Test and make sure you're happy with the result

5. Commit all your changes

```
git add newfile # if you added a new file
git commit -a # provide a description of your edits
git push -u origin pr/fixing-typos # push changes to your own repository
``` 

6. In your own repository create a pull request

## Update your fork with latest changes

1. In your forked repo webpage click on the button `Sync fork`
2. On your computer make sure you are in the `main` branch

```
git checkout main
```

3. Pull in the most recent version

```
git pull
```

4. Now you are ready to start a fresh editing process