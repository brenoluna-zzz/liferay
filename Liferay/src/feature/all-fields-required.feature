Feature: All input fields are required. The form cannot be submitted unless all fields are filled.

  Scenario: Verify name field is required
    Given User is on Liferay form
    When User fills the date of birth field
    And User fills the text area
    And User submits the form
    Then Form is not submitted
    And Error message is displayed under any empty input
    
  Scenario: Verify date of birth field is required
    Given User is on Liferay form
    When User fills the name field
    And User fills the text area
    And User submits the form
    Then Form is not submitted
    And Error message is displayed under any empty input
    
  Scenario: Verify text area is required
    Given User is on Liferay form
    When User fills the name field
    And User fills the date of birth field
    And User submits the form
    Then Form is not submitted
    And Error message is displayed under any empty input