@regression
Feature: Testing ABM Contact page of Sales Inquiries

  Background: Navigating to ABM CONTACT Menu Bar
    Given a user is on ABM contact web "https://www.abm.com/contact/" SALES INQUIRIES page

  @test_one
  Scenario Outline: Complete "TELL US ABOUT YOUR SERVICE REQUEST" Form using mandatory fields Data Table One
    And I enter  "<fName>" "<lName>" "<email>" "<phone>" "<industry>" "<services>" "<country>" the fields in the request form
    When I click on Yes dialog box
    And I click on Submit button
    Then I should see "What can ABM do for you?"
    Examples:
      | fName | lName | email      | phone | industry            | services               | country |
      | Tsedi | Ada   | ada@cc.com | 1234  | Aviation            | ABM Stimulus Solutions | Canada  |
      | Hami  | Sel   | sel@cc.com | 5678  | Banking & Financial | Aviation Services      | Canada  |

  @test_two
  Scenario: Complete "TELL US ABOUT YOUR SERVICE REQUEST" Form using mandatory fields Data Table Two
    And I enter in the fields
      | fName | lName | email      | phone | industry            | services          | country |
      | Rass  | Lib   | lib@cc.com | 91012 | Banking & Financial | Aviation Services | Canada  |
    When I click on Yes dialog box
    And I click on Submit button
    Then I should see "What can ABM do for you?"


  @test_three
  Scenario: Complete "TELL US ABOUT YOUR SERVICE REQUEST" Form using mandatory fields without use of data table
    And I enter first name as  "Ale"
    * I enter last name as "Negu"
    * I enter email address as "ne@cc.com"
    And I enter phone number as "1234"
    And I select "Aviation" from industry list
    And I select "Aviation Services" from services list and
    And I select "Canada" from country list
    And I click on Yes dialog box
    And I click on Submit button
    Then I should see "What can ABM do for you?"



#  First

#  Last
#  Email:*
#  Enter Email

#  Confirm Email
#  Phone:*
#  (xxx) xxx-xxxx
#  Fax:
#  (xxx) xxx-xxxx
#  Address:*
#  Street Address
#
#  City
#  State
#
#  ZIP Code
#  Inquiry:
#  Area of Inquiry*

#  Select
#  Topic of Inquiry*
#
#  Select
#  Parking Specific Inquiries
#
#  Select
#  Customer Number
#  Please Enter Your Parking Customer Number
#  Parking Location
#  Please Enter the Address of the Parking Location Being Referred
#  Street Address
#
#  City
#  State
#
#  ZIP Code
#  Additional Information
#  Comments*
