Feature: Form submittion

  Scenario: Successful form submission
    Given User is on Liferay form
    When User fills all fields
    And User submits the form
    Then Form is submitted
    And User is redirected to success page