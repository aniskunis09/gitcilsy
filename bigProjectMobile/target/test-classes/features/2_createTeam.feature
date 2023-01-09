Feature: Home Menu

  Scenario: Test Case 2 - User can create new Team

    Given user is on Home page
    When user click Choose Company Name
    Then user is on Current Company Page
    When user click Add Yellow button
    And user choose Add New Team button
    And user input Team Name
    And user input Team Description
    And user click Create Team button