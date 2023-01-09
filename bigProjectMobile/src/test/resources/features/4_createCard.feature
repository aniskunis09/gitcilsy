Feature: Board Menu

  Scenario: Test Case 4 - User can create New Card
    Given user is on Home page
    When user click Choose Company Name
    Then user is on Current Company Page
    And user click Choose Team Name
    Then user is on Current Team Page
    When user click Board Menu button
    Then user is on Current Board Page
    When user click Add New Card button
    And user input Card Name
    And user click Tick On Card Name
    Then user see success create Card