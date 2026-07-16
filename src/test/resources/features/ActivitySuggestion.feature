Feature: Activity Suggestion

  Scenario: User gets an activity suggestion

    Given the Activity Predictor application is open
    When I enter "Dublin" as the city
    And I click the Get Activity Suggestion button
    Then an activity suggestion should be displayed