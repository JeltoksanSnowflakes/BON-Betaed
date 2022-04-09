
# BON-Betaed
This is a modified fork of original project [bearded-octo-nemesis](https://github.com/immibis/bearded-octo-nemesis). The project is forked and slightly modified to make it process older minecraft versions without lots of bugs.

The license of the project allows using, copying, modifying, merging, publishing, distributing, sublicensing, etc. including original project author's name. [Link to the original license file.](https://github.com/WaterfallFlower/BON-Betaed/blob/master/LICENSE_ORIGINAL)

## Building the jar.
1. Using IDEs with inbuilt/plugin-supported Maven (Eclipse/Intellij IDEA/NetBeans).

	Open the downloaded or forked repository as a maven project, run task `assembly:single`.
3. Without IDE (maven should be installed).

	Commands that have to be typed in terminal:
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
