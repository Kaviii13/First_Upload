package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = "src/test/resources/Feature/datas.feature",
		glue = "steps",
		plugin = {"pretty","html:target/output.html"}
		
		
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
