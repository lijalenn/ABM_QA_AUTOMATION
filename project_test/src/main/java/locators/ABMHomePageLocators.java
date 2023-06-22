package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ABMHomePageLocators {

    // Cookies
    @FindBy(xpath = "//button[normalize-space()='Cookies Settings']") public WebElement cookiesSetting;
    @FindBy(xpath = "//button[normalize-space()='Reject All']") public WebElement cookiesReject;

    // ***** Industries Link
    @FindBy(xpath = "//li[@class='dropdown']//a[contains(text(),'Industries')]")
    public WebElement industriesLink;
    @FindBy(xpath = "//div[@class='main_menu']//a[contains(text(),'Industries')]")
    public WebElement industriesLinkOp1;
    @FindBy(xpath = "//span[normalize-space()='Industries Overview']")
    public WebElement overviewInIndustries;

    //******* Services Link
    @FindBy(xpath = "(//a[contains(text(),'Services')])[2]") public WebElement servicesLink;
    @FindBy(xpath = "//a[normalize-space()='Services Overview']") public WebElement servicesOverviewLink;
    // Services - Building Maintenance and Facility Services

    //********** Resources Link
    @FindBy(xpath = "(//a[normalize-space()='Resources'])[1]") public WebElement resourcesLink;

    //********** Careers Link
    @FindBy(xpath = "//ul[@class='navBar']//a[normalize-space()='Careers']") public WebElement careersLink;

    //********** About Link
    @FindBy(xpath = "//li[@class='dropdown']//a[contains(text(),'About')]") public WebElement aboutLink;
    @FindBy(xpath = "(//a[normalize-space()='Company Overview'])[1]") public WebElement companyOverviewLink;
//    @FindBy(xpath = "(//button[@role='button'])[1]") public WebElement  lickOnFirstOption;
    @FindBy(css = "section[class='homebanner banner'] button:nth-child(1)") public WebElement  lickOnFirstOption;





}
