Feature: User functionality

  @Positive
  Scenario: Test Case 2 - User successfully add New User
    Given user is on Login page
    When user input Username Admin
    And user input Password Admin
    And user click button Login
    Then user navigated to Dashboard page
    When user click menu PIM
    And user click button Add Employee
    And user input First Name
    And user input Middle Name
    And user input Last Name
    And user click switch Create Login Details
    And user input Username for New User
    And user input Password for New User
    And user input Confirm Password for New User
    And user click button Save
    Then user navigated to Personal Details page