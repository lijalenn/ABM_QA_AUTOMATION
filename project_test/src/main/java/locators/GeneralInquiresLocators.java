package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GeneralInquiresLocators {

    // Cookies
    @FindBy(xpath = "//button[normalize-space()='Cookies Settings']") public WebElement cookiesSetting;
    @FindBy(xpath = "//button[normalize-space()='Reject All']") public WebElement cookiesReject;

    @FindBy(xpath = "//div[@class='formContent']/ul/li[2]/a") public WebElement genInquiresButton;

    //  *********** TELL US ABOUT YOU
    @FindBy(css = "input[id=input_1_7_3]") public WebElement genFirstName;
    @FindBy(css = "input[id=input_1_7_6]") public WebElement genLastName;

    @FindBy(css = "input[id=input_1_9]") public WebElement genEmail;
    @FindBy(css = "input[id=input_1_9_2]") public WebElement genConfirmEmail;

    @FindBy(css = "input[id=input_1_8]") public WebElement genPhone;
    @FindBy(css = "input[id=input_1_10]") public WebElement genFax;

    // Address for General
    @FindBy(css = "input[id=input_1_11_1]") public WebElement genStreetAddress;
    @FindBy(css = "input[id=input_1_11_3]") public WebElement genCityAddress;
    @FindBy(css = "select[id=input_1_11_4]") public WebElement genStateAddress;
    @FindBy(css = "input[id=input_1_11_5]") public WebElement genZIPAddress;

    // Address for General inquiry
    @FindBy(css = "select[id=input_1_13]") public WebElement genAreaOfInquiry;
    @FindBy(css = "select[id=input_1_14]") public WebElement genTopOfInquiry;
    @FindBy(css = "select[id=input_1_18]") public WebElement genParkingSpecificInquiry;

    @FindBy(css = "input[id=input_1_19]") public WebElement genCustomerNum;

    @FindBy(css = "input[id=input_1_20_1]") public WebElement genParkingAddress;
    @FindBy(css = "input[id=input_1_20_3]") public WebElement genParkingCityAddress;
    @FindBy(css = "select[id=input_1_20_4]") public WebElement genParkingStateAddress;
    @FindBy(css = "input[id=input_1_20_5]") public WebElement genParkingZIPAddress;

    @FindBy(css = "textarea[id=input_1_16]") public WebElement genTextAreaComments;

    @FindBy(xpath = "(//div[@class='formContent']//h2)[2]") public WebElement verifyGenInqryResult;
    @FindBy(id = "gform_submit_button_1") public WebElement genSubmitButton;
    @FindBy(id = "gform_confirmation_message_1") public WebElement verifyGenInqryPageText;

    // gform_confirmation_message_1
}
