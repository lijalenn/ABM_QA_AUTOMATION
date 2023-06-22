package actions;

import locators.SalesInquiriesFormLocators;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilites.for_helper_methods.HelperClass;

public class SalesInquiriesFormActions {
    private SalesInquiriesFormLocators locators;

    public SalesInquiriesFormActions() {
        this.locators = new SalesInquiriesFormLocators();
        PageFactory.initElements(HelperClass.getDriver(), locators);
    }

    public void select(){
        Select sel = new Select(locators.industry);
        sel.selectByValue("");
    }
}
