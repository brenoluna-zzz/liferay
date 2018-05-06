Feature: An error message is displayed for each input field when form is submitted with all fields empty

	Scenario: Submission of empty form
    Given User is on Liferay form page
    When User clicks the submit button
    Then Error message is displayed under all inputs
    And Browser is closed