package MavenSeleniumProj;

public class M1Intro {

	public static void main(String[] args) {
		// central depository to get dependencies (nvmrepository), don't need jars, write xml dependencies
			// go to website and pass 4 lines of code (dependency tag) into pom xil file -> only change version number
			// maintaining common structure across the organization -> BUILD MANAGEMENT TOOL -> Maven in 5 min webpage
				// if you build maven proj, it will have same proj organization
			// flexibility in integrating with CI (continuous integration) tools
				// Jenkins is CI tool that works with Maven
			// Plugins for test framework integration
				// support TestNG or JUnit plugins
		// Install maven 
			// search maven download, get the binary bin, add path (C:\Users\nsun\Desktop\apache-maven-3.6.3) to Sys variable as MAVEN_HOME
			// get file to bin folder and add to path (C:\Users\nsun\Desktop\apache-maven-3.6.3\bin)
			// cmd -> mvn --version to see if mvn is configured
		// Terminology:
			// Artifact: file (usually a JAR) that's deployed to a Maven repository
			// Groupid: identifies project uniquely across all projects (e.g. org.seleniumhq.selenium)
			// archetype:generate will create a new project based on a specified archetype
			// artifactId: uniquely identifies a jar (e.g. selenium.java)
		// Creating a project
			// 
			// must pass groupId (project name), artifactid (actual jar from main groupId proj)
			// -D means pass parameter
			// maven-archetype-quickstart is used most often artifactArtifactId (template for testing)
			// need .classpath and .project files to import maven proj to eclipse (go inside maven proj dir, run mvn eclipse:eclipse)
		// all recent eclipise comes with maven plugin -> window, preferences, should see maven
			// if for some reason it is missing, go to Eclipse Maven Integration and follow instructions on webpage
			// windows, prefernces, user settings, .m2\repository folder will hold all the jars needed for a project
		// Import Project file, import, maven, existing project
			// artifactId is project name, groupId will be package name
		// pom.xml has the dependencies list
			// get 4 lines of code from mvnrepository and paste the dependency tag to this file
		// created 2 dummy tests in src/test/java/MavenSeleniumProj dir
			// we want to run the 2 files (4 test cases)
			// pom.xml must contain all the dependecnies (i.e. selenium jars, etc.)
		// Need Surefire plugin to run the 4 tests, go to maven website Surefire plugin, click on usage, copy build tag to pom.xml
		// cmd to project dir and can enter following commands:
			// mvn clean: deletes all temp files and previous references and builds (preferred to use before test)
			// mvn compile: will check syntax errors of your code
				// ran into error: "target and source 5, need 7, so just check xml for solution in properties tag
			// mvn test: will trigger test operation (actually run it), by default, test will clean and compile, then start test
				// it will read all dependencies, go to .m2 folder and see if jars are present (not directly to mvnrepository.org)
				// if not in .m2 dir, then it will download the jars
		// MAKE SURE "Test" is last word in test dir file names (maven algorithm to find tests to run)
				
	}

}
