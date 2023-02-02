Feature: Login as Admin functionality

  @Positive
  Scenario: Test Case 1 - User successfully login as Admin
    Given user is on Login page
    When user input Username Admin
    And user input Password Admin
    And user click button Login
    Then user navigated to Dashboard page