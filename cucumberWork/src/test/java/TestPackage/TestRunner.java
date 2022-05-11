package TestPackage;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/Features", glue = "StepDefinitions")
public class TestRunner extends AbstractTestNGCucumberTests {

}
