@smoke
Feature: Activity Suggestion

  Scenario: 1 Dublin User gets an activity suggestion

    Given the Activity Predictor application is open
    When I enter "Dublin" as the city
    And I click the Get Activity Suggestion button
    Then an activity suggestion should be displayed


  Scenario: 2 Limerick
    Given the Activity Predictor application is open
    When I enter "Limerick" as the city
    And I click the Get Activity Suggestion button
    Then an activity suggestion should be displayed