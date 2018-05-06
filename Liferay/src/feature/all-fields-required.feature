Feature: All input fields are required. The form cannot be submitted unless all fields are filled.

  Scenario: Verify name field is required
    Given User is on Liferay form page
    When User fills the date of birth field with valid value
    And User fills the text area
    And User clicks the submit button
    Then Error message is displayed under any empty input
    And Browser is closed
    
  Scenario: Verify date of birth field is required
    Given User is on Liferay form page
    When User fills the name field
    And User fills the text area
    And User clicks the submit button
    Then Error message is displayed under any empty input
    And Browser is closed
    
  Scenario: Verify text area is required
    Given User is on Liferay form page
    When User fills the name field
    And User fills the date of birth field with valid value
    And User clicks the submit button
    Then Error message is displayed under any empty input
    And Browser is closed