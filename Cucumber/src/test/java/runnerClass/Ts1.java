package runnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"C:\\Users\\sai\\eclipse-workspace\\Cucumber\\src\\test\\java\\featureFile\\Login.feature"},
		glue= {"stepDefinition"},
		monochrome = false,
		dryRun = false,
		plugin= {"pretty","html:reports\\Login.html"}
		
		
		)

public class Ts1 extends AbstractTestNGCucumberTests{

}
