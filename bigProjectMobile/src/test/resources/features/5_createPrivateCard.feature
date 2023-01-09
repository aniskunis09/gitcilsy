Feature: Board Menu

  Scenario: Test Case 5 - User can create New Private Card
    Given user is on Home page
    When user click Choose Company Name
    Then user is on Current Company Page
    And user click Choose Team Name
    Then user is on Current Team Page
    When user click Board Menu button
    Then user is on Current Board Page
    When user click Add New Private Card
    And user input Private Card Name
    And user click Private card toggle button
    And user click Tick On Private Card Name
    Then user see Private Card created