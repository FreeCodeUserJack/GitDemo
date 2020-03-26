package MavenSeleniumProj;

public class M4JenkinsReport {
	// once running test in jenkins, refresh your proj, you will see src and target dir at project level
		// open up surefire-reports, index.html will display the results
		// take note of testng-results.xml -> pass to testng to prepare a report to Jenkins
	// need testng reports plugin -> manage jenkins, manage plugins, go to available, install without restart
	// click on the MavenJava job, click configure to the left
		// under post-build actions dropdown, select Publich TestNG Results
		// click save
	// workspace setting has the source code files
	
	// scheduling jenkins report: select "build periodically" -> in configure project
		// have to give minutes, hours, daymonth, month, and dayweek -> jenkins scheduling documentation
		// put star for values you don't want to specify -> * means run daily, every week, every month
		// e.g. 30 6 * * * -> 6:30am every morning every day, every month
	// if you build again, you can see the TestNG results or after done building, go to job and click results
		// click on the package name "MavenSeleniumProj" to see specific details
}
