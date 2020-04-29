/* Description:- This is the main runner class of our project.This is the heart of the project.All the running configurations
 * are done here.
 * 
 * Link:- "pom.xml" is using this class to run the project.
 */


package runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/features/",
		glue = "stepDefinitions",
		format = {"pretty","html:test-output","json:test-output/Cucumber.json","junit:test-output/Cucumber.xml"},
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:test-output/ExtentReport.html"},
		monochrome = true,
		tags = {"@FunctionalTest,@SanityTest,@RegressionTest"},
		dryRun = true
		)

public class TestRunner {
	@AfterClass
	 public static void writeExtentReport() {
	 Reporter.loadXMLConfig(new File(System.getProperty("user.dir")+"/src/main/java/config//extent-config.xml"));
	 Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
     Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
     Reporter.setSystemInfo("Machine", "Mac OS X" + "64 Bit");
     Reporter.setSystemInfo("Selenium", "3.141.59");
     Reporter.setSystemInfo("Maven", "3.5.2");
     Reporter.setSystemInfo("Java Version", "12.0.2"); 
	}
}
