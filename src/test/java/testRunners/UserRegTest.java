package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeatures/Registration.feature"},
		glue = {"stepDefinations"},
				//tags = "@Smoke or @Regression or @Prod",
				//tags = "@Smoke and @Regression and @Prod",
				//tags = "@Smoke and @Regression and @Prod",
				//tags = "not @Prod",
				//tags = "@All",
				//mvn test -Dcucumber.options.tags = "@Smoke or @Regression" [for cucumber 4 maven ]
				//mvn test -Dcucumber.filter.tags = "@Smoke or @Regression"  [for cucumber 6 maven ]
						plugin = {"pretty:target/MyReport/report.txt",
						//"html:target/MyReport/report-html",
						"json:target/MyReport/report.json",
						"junit:target/MyReport/report.xml"},
				//publish = true
				monochrome = true,
				dryRun = false
				//strict = true
				)


public class UserRegTest {

}
