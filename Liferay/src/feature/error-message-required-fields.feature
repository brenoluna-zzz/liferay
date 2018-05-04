Feature: An error message is displayed for each input field when form is submitted with all fields empty

	Scenario: Submission of empty form
    Given User is on Liferay form
    When User submits the form
    Then Form is not submitted
    And Error message is displayed under any empty input