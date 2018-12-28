package api.testing;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

//Associates Cucumber-JVM with the Junit runner
@RunWith(Cucumber.class)
@CucumberOptions(format = {"html:target/cucumber-htmlreport", 
		"json:target/cucumber-json-report.json"})

public class RunCukesTest {

}
