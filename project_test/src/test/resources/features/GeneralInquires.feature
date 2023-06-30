@regression
Feature: Testing ABM Contact page of General Inquiries

  Background: Navigating to General Inquiries form
    Given a user is navigated to "https://www.abm.com/contact/" page
    And user click on GENERAL INQUIRIES button
    Then user should see "General Inquiries" page

  Scenario: Complete "TELL US ABOUT YOU" form after entering mandatory fields using Data Table
    And user enter the mandatory fields
      | First name | Last Name | Email        | Confirm email | Phone      | Street Address    | City         | State    | ZIP | Area of Inquiry | Topic of Inquiry | Comments       |
      | Kaleb      | Biden     | biden@cc.com | biden@cc.com  | 1234567891 | 620 Perry Parkway | Gaithersburg | Maryland | 877 | Corporate       | Service          | This is a test |
    When user click on Submit button
    Then user should see a reply "Thanks for contacting us! We will get in touch with you shortly."

  @useExcel
  Scenario: Complete "TELL US ABOUT YOU" form after entering mandatory fields using an Excel file
    And user should be able to enter their information
      | File Name            | File Location                                                                                      | Sheet Name |
      | GenInquiresFile.xlsx |../project_test/files_for_use/GenInquiresFile.xlsx| genInqry   |
    When user click on Submit button
    Then user should see a reply "Thanks for contacting us! We will get in touch with you shortly."


