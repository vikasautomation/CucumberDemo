package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//features/Test.feature", 
		glue="stepDefinitions",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","junit:target/reports/results1_junit.xml"})
public class Run {

}
