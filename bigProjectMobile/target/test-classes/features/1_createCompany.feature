Feature: Home Menu

  Scenario: Test Case 1 - User can create new Company

    Given user is on Home page
    When user verify new Notifications
    And user click Create New Company button
    And user input Company Name
    And user input Company Description
    And user click Create Company button
    Then user see success create Company notification