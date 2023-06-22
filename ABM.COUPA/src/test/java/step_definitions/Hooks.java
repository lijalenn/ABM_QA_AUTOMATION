package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilites.for_helper_methods.HelperClass;

public class Hooks {
    @Before
    public static void setUp() {

        HelperClass.setUpDriver();
    }
    @AfterStep
    public static void screenShot(Scenario scenario){
        if (scenario.isFailed()){
            System.out.println("Test Step failed");
            final byte[] screenshot = ((TakesScreenshot) HelperClass.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }else {
            System.out.println("Test step Passed");
            final byte[] screenshot = ((TakesScreenshot) HelperClass.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());}
    }

    @After
    public static void tearDown() {

        HelperClass.tearDown();
    }
}
