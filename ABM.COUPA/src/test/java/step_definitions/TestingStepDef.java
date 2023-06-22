package step_definitions;

import io.cucumber.java.en.Given;
import locators.TestingLocatorPage;
import org.openqa.selenium.support.PageFactory;
import utilites.for_helper_methods.HelperClass;

public class TestingStepDef {

    private TestingLocatorPage locator;

    public TestingStepDef(){
        this.locator =new TestingLocatorPage();
        PageFactory.initElements(HelperClass.getDriver(),locator);

    }

    @Given("I am on google home page {string}")
    public void i_am_on_google_home_page(String url) {
        HelperClass.openPage(url);

    }

}
