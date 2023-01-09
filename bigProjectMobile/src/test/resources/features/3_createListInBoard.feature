Feature: Board Menu

  Scenario: Test Case 3 - User can create New List in Board
    Given user is on Home page
    When user click Choose Company Name
    Then user is on Current Company Page
    And user click Choose Team Name
    Then user is on Current Team Page
    When user click Board Menu button
    Then user is on Current Board Page
#    When user click Board Menu button
    And user click Add New List
    And user input Board Name
    And user click Submit button
    Then user see success create Board