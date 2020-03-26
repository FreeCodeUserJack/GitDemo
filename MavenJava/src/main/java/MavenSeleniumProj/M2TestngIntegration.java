package MavenSeleniumProj;

public class M2TestngIntegration {
	// need to add testng.xml to the src/test/java dir so you can fine tune the testing
		// want to trigger that testng.xml file from maven (this file will be in project level)
	// we only want to run selenium tests and not RestAPI tests
		// under surefire plugin on Maven website, click "using testng"
		// check under heading "using suite xml files"
		// need to configure SUREFIRE plugin tag in pom.xml with a CONFIGURATION TAG right below version tag
			// you can add multiple .xml files with suiteXMLFile tags
			// we just put testng.xml bc it is in proj level or else you need to give path
	// what if you only want to run a single test (one class file? e.g. RestAPITest)
		// go to surefire plugin maven and click on running a single test tab
		// you need to pass that class file name in cmd to run (mvn -Dtest=TestCircle test)
	
	
	// MAVEN PROFILING
		// use profiles tag in pom.xml and profile to detail each profile (below properties tag)
		// take the entire build tag and put it inside profile tag
		// smoke (only selenium tests) vs regression (all tests)? what do these names mean?
		// can pass profile parameter from cmd -> mvn test -PRegression where p is selecting profile
		
}
