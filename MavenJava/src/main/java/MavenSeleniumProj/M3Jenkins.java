package MavenSeleniumProj;

public class M3Jenkins {
	// Jenkins is a CI tool
	// there are 500 test cases that might take 7 hours to run
		// need to do them overnight and trigger tests around 2am - 3am
	// Jenkins allows us to creat a job and set a time to run the test suite
		// Jenkins allow a common version of testng or maven when running tests
		// have a link to jenkins, cick build now and see the tests
	// download Jenkins as Generic java package .war file
	// navigate to that dir containing the .war file and then use the following command in cmd:
		// java -jar jenkins.war --httpPort=9090 -> will execute the war file at specified port
			// have to specify the httpPort bc dashboard-view plugin is not installed (?)
	// JENKINS ONLY COMPATIBLE with JAVA 8 and JAVA 11!!!!
	// download java 11 SE, set it above java 13 in path, run command again
		// wait for "jenkins is fully up and running"
	// you can now go to localhost:9090 and login in with admin password (2f337b18ce7e433ead2423323def60c2)
	// click no suggested or custom install (i think custom is better if all you need is Maven or Java)
	// Click on Manage Jenkins on the left (after creating first admin user (username is admin)
		// global tool configuration: you can add jdk, click add, uncheck installer, enter name and JAVA_HOME, click save
		// do the same for maven
	
	// Jenkins workspace: you can add project from source code (e.g. github)
		// click new item for new job: enter new name and click freestyle project
		// click on advanced, use custom workspace, copy proj to .jenkins home dir (in c://user/nsun/.jenkins)
		// in proj dir, enter ${JENKINS_HOME}/ProjName, will search in home dir for the project name
		// BUILD PERIODICALLY will allow you to schedule the time to run the tests
		// under build environment, click delete workspace... to clear it before running tests (clear the job folder(?))
		// go down to build, click on invoke top-level maven targets
		// goal: need to provide mvn command (don't need to mention mvn though) -> test -PRegression
		// click save
	// Click on BUILD NOW to the left to run the test
		// click on the test when it is done (it will have timestamp)
		// click on console output and check results
}
