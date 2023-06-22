package actions;

import locators.TestingLocatorPage;
import org.openqa.selenium.support.PageFactory;
import utilites.for_helper_methods.HelperClass;

public class TestingActionPage {
    private TestingLocatorPage locate;

    public TestingActionPage() {
        this.locate=new TestingLocatorPage();
        PageFactory.initElements(HelperClass.getDriver(),locate);
    }
}
