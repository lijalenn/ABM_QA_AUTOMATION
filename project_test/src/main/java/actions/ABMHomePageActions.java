package actions;

import locators.ABMHomePageLocators;
import org.openqa.selenium.support.PageFactory;
import utilites.for_helper_methods.HelperClass;

public class ABMHomePageActions {
    private ABMHomePageLocators locators;

    public ABMHomePageActions() {
        this.locators = new ABMHomePageLocators();
        PageFactory.initElements(HelperClass.getDriver(), locators);
    }

    public void clickOnIndustriesLink() {
//        locators.industriesLink.click();
        HelperClass.click(locators.industriesLink);
    }

    public void clickOnOverviewLink() {
//        locators.overviewInIndustries.click();
        HelperClass.click(locators.overviewInIndustries);
    }

    public void clickOnServicesLin() {
//        locators.servicesLink.click();
        HelperClass.click(locators.servicesLink);
    }

    public void clickOnServicesOverviewLink() {
//        locators.servicesOverviewLink.click();
        HelperClass.click(locators.servicesOverviewLink);
    }

    public void clickOnResourceLink() {
//        locators.resourcesLink.click();
        HelperClass.click(locators.resourcesLink);
    }

    public void clickOnCareerLink() {
//       locators.careersLink.click();
       HelperClass.click(locators.careersLink);
    }

    public void clickOnAboutLink() {
//        locators.aboutLink.click();
        HelperClass.click(locators.aboutLink);
    }

    public void clickOnCompanyOverviewLink() {
//        locators.companyOverviewLink.click();
        HelperClass.click(locators.companyOverviewLink);
    }


}
