package step_definitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import locators.SalesInquiriesFormLocators;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilites.for_misl.ExcelReader;
import utilites.for_helper_methods.HelperClass;

import java.util.List;
import java.util.Map;

public class SalesInquiriesFormStepDef {

    private SalesInquiriesFormLocators locators;

    public SalesInquiriesFormStepDef() {
        this.locators = new SalesInquiriesFormLocators();
        PageFactory.initElements(HelperClass.getDriver(), locators);
    }


    @Given("a user is on ABM contact web {string} SALES INQUIRIES page")
    public void i_am_on_abm_contact_web_sales_inquiries_page(String url)  {
        HelperClass.openPage(url);
        HelperClass.scrollToAnElement(locators.cookiesSetting);
        HelperClass.click(locators.cookiesSetting);
        HelperClass.scrollToAnElement(locators.cookiesReject);
        HelperClass.click(locators.cookiesReject);
    }


    @Given("I enter  {string} {string} {string} {string} {string} {string} {string} the fields in the request form")
    public void i_enter_the_fields_in_the_request_form(String fname, String lname, String email, String phone, String industry, String services, String country) {
       HelperClass.sendKey(locators.firstName,fname);
       HelperClass.sendKey(locators.lastName,lname);
       HelperClass.sendKey(locators.email,email);
       HelperClass.sendKey(locators.phoneNumber,phone);
       HelperClass.sendKey(locators.industry,industry);
       HelperClass.sendKey(locators.services,services);
       HelperClass.sendKey(locators.country,country);

    }


    @When("I click on Yes dialog box")
    public void i_click_on_yes_dialog_box() {
        HelperClass.moveToElementAndClick(locators.checkBox);
    }

    @When("I click on Submit button")
    public void i_click_on_submit_button() {

        HelperClass.moveToElementAndClick(locators.buttonClick);

    }

    @Then("I should see {string}")
    public void i_should_see(String string) {
      String actual =  HelperClass.getText(locators.textVerifier);
        Assert.assertTrue(actual.contains(string));
    }

    @Given("I enter first name as  {string}")
    public void i_enter_first_name_as(String string)  {
        HelperClass.waitExplicit();
        HelperClass.sendKey(locators.firstName,string);
    }

    @Given("I enter last name as {string}")
    public void i_enter_last_name_as(String string) {
        HelperClass.sendKey(locators.lastName,string);
    }

    @Given("I enter email address as {string}")
    public void i_enter_email_address_as(String string) {
        HelperClass.sendKey(locators.email,string);
    }

    @Given("I enter phone number as {string}")
    public void i_enter_phone_number_as(String string) {
        HelperClass.sendKey(locators.phoneNumber,string);
    }

    @Given("I select {string} from industry list")
    public void i_select_from_industry_list(String string) {
        HelperClass.selectByValue(locators.industry,string);
    }

    @Given("I select {string} from services list and")
    public void i_enter_from_services_list_and(String string) {
        HelperClass.selectByValue(locators.services,string);
    }

    @Given("I select {string} from country list")
    public void i_select_from_country_list(String string) {
        HelperClass.selectByValue(locators.country,string);
    }

    @Given("I enter in the fields")
    public void i_enter_in_the_fields(DataTable dataTable) {

        List<List<String>> data = dataTable.asLists(String.class);

        HelperClass.sendKey(locators.firstName,data.get(1).get(0));
        HelperClass.sendKey(locators.lastName,data.get(1).get(1));
        HelperClass.sendKey(locators.email,data.get(1).get(2));
        HelperClass.sendKey(locators.phoneNumber,data.get(1).get(3));
        HelperClass.sendKey(locators.industry,data.get(1).get(4));
        HelperClass.sendKey(locators.services,data.get(1).get(5));
        HelperClass.sendKey(locators.country,data.get(1).get(6));

    }

    public void newData(){
        String path="";
        String sheetName="";
        ExcelReader data = new ExcelReader();
        List<Map<String,String>> read = data.getData(path,sheetName);
    }
}
