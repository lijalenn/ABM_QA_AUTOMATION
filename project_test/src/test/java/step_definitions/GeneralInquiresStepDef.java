package step_definitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.*;
import locators.GeneralInquiresLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import utilites.for_excel.ExcelConfiguration;
import utilites.for_excel.ExcelDataReader;
import utilites.for_excel.IDataReader;
import utilites.for_helper_methods.HelperClass;

import java.util.List;
import java.util.Map;

public class GeneralInquiresStepDef {

    private GeneralInquiresLocators locators;

    public GeneralInquiresStepDef() {
        this.locators = new GeneralInquiresLocators();
        PageFactory.initElements(HelperClass.getDriver(), locators);
    }

    @Given("a user is navigated to {string} page")
    public void a_user_is_navigated_to_page(String url) throws InterruptedException {
        HelperClass.openPage(url);

    }

    @Given("user click on GENERAL INQUIRIES button")
    public void user_click_on_general_inquiries_button() {
        HelperClass.clickUsingJS(locators.genInquiresButton);
        HelperClass.click(locators.cookiesSetting);
        HelperClass.click(locators.cookiesReject);
    }

    @Then("user should see {string} page")
    public void user_should_see_page(String verifyGenInqPage) {
        String actual = HelperClass.getText(locators.verifyGenInqryResult);
        Reporter.log("Expected result should be - "+ verifyGenInqPage);
        Reporter.log("Actual found is  - "+ actual);
        Assert.assertTrue(actual.contains(verifyGenInqPage));
    }

    @Then("user enter the mandatory fields")
    public void user_enter_the_mandatory_fields(DataTable dataTable) {
        List<List<String>> list = dataTable.asLists(String.class);

        System.out.println(list.get(0).get(0));
        System.out.println(list.get(0).get(1));
        System.out.println(list.get(1).get(0));
        System.out.println(list.get(1).get(1));
        HelperClass.sendKey(locators.genFirstName,list.get(1).get(0));
        HelperClass.sendKey(locators.genLastName,list.get(1).get(1));
        HelperClass.sendKey(locators.genEmail,list.get(1).get(2));
        HelperClass.sendKey(locators.genConfirmEmail,list.get(1).get(3));
        HelperClass.sendKey(locators.genPhone,list.get(1).get(4));
        HelperClass.sendKey(locators.genStreetAddress,list.get(1).get(5));
        HelperClass.sendKey(locators.genCityAddress,list.get(1).get(6));
        HelperClass.selectByVisibleText(locators.genStateAddress,list.get(1).get(7));
        HelperClass.sendKey(locators.genZIPAddress,list.get(1).get(8));

        HelperClass.selectByVisibleText(locators.genAreaOfInquiry,list.get(1).get(9));
        HelperClass.selectByVisibleText(locators.genTopOfInquiry,list.get(1).get(10));

        HelperClass.sendKey(locators.genTextAreaComments,list.get(1).get(11));


    }
        @Then("user should be able to enter their information")
    public void user_should_be_able_to_enter_their_information(IDataReader dataTable) {

        List<Map<String, String>> list = dataTable.getAllRows();

        HelperClass.sendKey(locators.genFirstName,list.get(0).get("FirstName"));
        HelperClass.sendKey(locators.genLastName,list.get(0).get("LastName"));
        HelperClass.sendKey(locators.genEmail,list.get(0).get("Email"));
        HelperClass.sendKey(locators.genConfirmEmail,list.get(0).get("ConfirmEmail"));
        HelperClass.sendKey(locators.genPhone,list.get(0).get("Phone"));
        HelperClass.sendKey(locators.genStreetAddress,list.get(0).get("StreetAddress"));
        HelperClass.sendKey(locators.genCityAddress,list.get(0).get("City"));
        HelperClass.selectByVisibleText(locators.genStateAddress,list.get(0).get("State"));
        HelperClass.sendKey(locators.genZIPAddress,list.get(0).get("ZIP"));

        HelperClass.selectByVisibleText(locators.genAreaOfInquiry,list.get(0).get("AreaofInquiry"));
        HelperClass.selectByVisibleText(locators.genTopOfInquiry,list.get(0).get("TopicofInquiry"));

        HelperClass.sendKey(locators.genTextAreaComments,list.get(0).get("Comments"));

    }
    @DataTableType
    public IDataReader excelToDataTable(Map<String, String> entry) {
        ExcelConfiguration config = new ExcelConfiguration.ExcelConfigurationBuilder()
                .setFileName(entry.get("File Name"))
                .setFileLocation(entry.get("File Location"))
                .setSheetName(entry.get("Sheet Name"))
                .setIndex(Integer.valueOf(entry.getOrDefault("Index", "0")))
                .build();
        return new ExcelDataReader(config);
    }



    @When("user click on Submit button")
    public void user_click_on_submit_button() throws InterruptedException {
        HelperClass.click(locators.genSubmitButton);
        Thread.sleep(3000);
    }

    @Then("user should see a reply {string}")
    public void user_should_see_a_reply(String verifyText) {
        HelperClass.moveToElement(locators.verifyGenInqryPageText);
        String actual = HelperClass.getText(locators.verifyGenInqryPageText);
        Reporter.log("Expected result should be - "+ verifyText);
        Reporter.log("Actual found is  - "+ actual);
        Assert.assertTrue(actual.equals(verifyText));

    }
}
