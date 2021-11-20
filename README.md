
# BON-Betaed
This is a modified fork of original project [bearded-octo-nemesis](https://github.com/immibis/bearded-octo-nemesis). The license of the project allows using, copying, modifying, merging, publishing, distributing, sublicensing, etc. including original project author's name. [Link to the original license file.](https://github.com/WaterfallFlower/BON-Betaed/blob/master/LICENSE_ORIGINAL)

This project is forked and slightly modified to make it process older minecraft versions.

## Building the jar.
Firstly, download or fork repository.
Then assemble the ready-to-launch jar file:
1. Using any IDE that can automatically work with Maven projects.

	Just open it as a maven project, then run task `assembly:single`.
3. Without IDE (maven should be installed).

	Open command prompt/powershell/terminal in folder and run:
	```
	mvn install
	mvn clean compile assembly:single
	```

## Original README.txt (part of it)
```text
Simple GUI version: Compile into a jar file, or download from the link above, then run it.

Command line version (for experts only):
	Run: java -cp BON.jar immibis.bon.cui.MCPRemap
	for a detailed list of command-line arguments.

Now automatically deletes META-INF, you don't need to do that yourself.
```
