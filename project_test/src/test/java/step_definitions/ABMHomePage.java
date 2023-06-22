package step_definitions;

import actions.ABMHomePageActions;
import io.cucumber.java.en.*;
import locators.ABMHomePageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilites.for_helper_methods.HelperClass;

public class ABMHomePage {

    ABMHomePageActions actions = new ABMHomePageActions();
    private ABMHomePageLocators locators;

    public ABMHomePage() {
        this.locators = new ABMHomePageLocators();
        PageFactory.initElements(HelperClass.getDriver(), locators);
    }


    @Given("User is on ABMHome page {string}")
    public void user_is_on_abm_home_page(String url) {
        HelperClass.openPage(url);
        HelperClass.click(locators.cookiesSetting);
        HelperClass.click(locators.cookiesReject);

//        HelperClass.getDriver().findElement(By.xpath("//button[normalize-space()='Cookies Settings']")).click();
//        HelperClass.getDriver().findElement(By.xpath("//button[normalize-space()='Reject All']")).click();
    }

    @Given("User click on Industries Menu")
    public void user_click_on_industries_menu() {
        HelperClass.click(locators.lickOnFirstOption);
        HelperClass.moveToElementAndClick(locators.industriesLink);
    }

    @When("User click on Industries Overview link")
    public void user_click_on_industries_overview_link() {
        HelperClass.moveToElementAndClick(locators.overviewInIndustries);
    }

    @Then("User should see {string} page title")
    public void user_should_see_page_title(String string) {
       String actual = HelperClass.getDriver().getTitle();
        Assert.assertEquals(actual,string);

    }

    @Given("User click on Services Menu")
    public void user_click_on_services_menu() {
        HelperClass.click(locators.lickOnFirstOption);
        HelperClass.moveToElementAndClick(locators.servicesLink);
    }
    @When("User click on Services link")
    public void user_click_on_services_link() {
        HelperClass.moveToElementAndClick(locators.servicesOverviewLink);
    }

    @Given("User click on Resources Menu")
    public void user_click_on_resources_menu() {
        HelperClass.click(locators.lickOnFirstOption);
        HelperClass.moveToElementAndClick(locators.resourcesLink);
    }
    @Given("User click on Careers Menu")
    public void user_click_on_careers_menu() {
        HelperClass.click(locators.lickOnFirstOption);
        HelperClass.moveToElementAndClick(locators.careersLink);
    }

    @Given("User click on About Menu")
    public void user_click_on_about_menu() {
        HelperClass.click(locators.lickOnFirstOption);
        HelperClass.moveToElementAndClick(locators.aboutLink);
    }
    @When("User click on Company overview link")
    public void user_click_on_company_overview_link() {
        HelperClass.click(locators.lickOnFirstOption);
        HelperClass.moveToElementAndClick(locators.companyOverviewLink);
    }
}
