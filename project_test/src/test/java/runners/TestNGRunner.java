package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = "src/test/resources/features",
        glue = "step_definitions",
        plugin = {"pretty",
                "html:target/cucumber-reports.html",
                "json:target/cucumber-reports.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true,
        tags = "@regression",
        dryRun = false,
        publish = true


)
public class TestNGRunner extends AbstractTestNGCucumberTests {
}
