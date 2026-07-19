@@regression
Feature:  Multiple city Activity Suggestion

  Scenario Outline: User gets an activity suggestion for multiple cities

    Given the Activity Predictor application is open
    When I enter "<city>" as the city
    And I click the Get Activity Suggestion button
    Then an activity suggestion should be displayed

    Examples:
      | city     |
      | Paris   |
      | Cork     |
      | Galway   |
      | London |

