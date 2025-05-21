@func
Feature: Google search

  @smoke @valid
  Scenario: gooogle search with valid data
    Given User should be in google search page
    When User enters sample test and submit
    Then User should get search reults
   