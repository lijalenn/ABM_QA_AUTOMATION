@abmHome
Feature: Testing ABMHome page as a sample to verify the Framework is working as expected

  Background: Navigate to ABMHome page
    Given User is on ABMHome page "https://www.abm.com/"

  Scenario: Verify that the Industries Link is working as expected
    And User click on Industries Menu
    When User click on Industries Overview link
    Then User should see "ABM Industry Services" page title

  Scenario: Verify that the Services Link is working as expected
    And User click on Services Menu
    When User click on Services link
    Then User should see "Services - Building Maintenance and Facility Services" page title

  Scenario: Verify that the Resources Link is working as expected
    And User click on Resources Menu
    Then User should see "Resources - Building Maintenance and Facility Services" page title

    Scenario: Verify that the Careers Link is working as expected
    And User click on Careers Menu
    Then User should see "Build a Career and a Life at ABM" page title

  Scenario: Verify that the About Link is working as expected
    And User click on About Menu
    When User click on Company overview link
    Then User should see "About ABM" page title


