Feature: Login as User functionality

  @Positive
  Scenario: Test Case 3 - User successfully login as User
    Given user is on Login page
    When user input Username User
    And user input Password User
    And user click button Login
    Then user navigated to Dashboard page