Feature: Form submission

  Scenario: Successful form submission
    Given User is on Liferay form page
    When User fills all fields with valid values
    And User clicks the submit button
    Then User is redirected to success page
    And Browser is closed