package runnerpackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/java/features" },
				glue = { "stepdefinition" }, 
				tags= {"@updatescenario,@placingorderscenario"},monochrome = true, 
				dryRun = false, 
				strict=true,
				plugin = {"pretty",
						"json: reports/report.json",
						"junit: reports/report.xml"
						}
					)

public class JunitRunner {

}
