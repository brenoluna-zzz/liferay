
Feature: Find text string within form

  Scenario: A specific text string exists on the form
    Given User is on Liferay form page
    Then Text "party rock" is on the form
    And Browser is closed

