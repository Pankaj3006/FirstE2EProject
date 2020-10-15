package Resources.FirstE2EProject;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="E:\\DRIVER\\FirstE2EProject\\src\\test\\java\\features",
		glue="StepDefinition")
public class testRunnerE2E  {
//public class testRunnerE2E extends AbstractTestNGCucumberTests {
	

}
