package TestRun;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
	    features = ".//Features/login.feature", // Path to the feature files
	    glue = "stepDef",                 // Package containing step definitions
	    plugin = {"pretty", "html:target/cucumber-reports.html"} // Reports
//	    tags = "@SmokeTest",                      // Tags to filter scenarios
//	    monochrome = true                         // Makes console output readable
	)

public class runner {

}
