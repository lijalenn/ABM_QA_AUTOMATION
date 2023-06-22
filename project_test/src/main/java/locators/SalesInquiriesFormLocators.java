package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class SalesInquiriesFormLocators {
    // Cookies
    @FindBy(xpath = "//button[normalize-space()='Cookies Settings']") public WebElement cookiesSetting;
    @FindBy(xpath = "//button[normalize-space()='Reject All']") public WebElement cookiesReject;
    @FindBy(id = "FirstName")
    public WebElement firstName;
    @FindBy(id = "LastName")
    public WebElement lastName;
    @FindBy(id = "Email")
    public WebElement email;
    @FindBy(id = "Phone")
    public WebElement phoneNumber;
    @FindBy(id = "Vertical_Market_Update__c")
    public WebElement industry;
    @FindBy(id = "Country")
    public WebElement country;
    @FindBy(id = "Primary_Service_Interest__c") public WebElement services;
    @FindBy(xpath = "//label[@id='LblmktoOpt_In_on_Form__c']") public WebElement checkBox;
    @FindBy(css = "button[type='submit']") public WebElement buttonClick;
    @FindBy(css = "h1:nth-child(1)") public WebElement textVerifier;





}
