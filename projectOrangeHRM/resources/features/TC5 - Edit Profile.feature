Feature: Personal Details User functionality

  @Positive
  Scenario: Test Case 5 - User successfully Edit Profile Current User
    Given user is on Login page
    When user input Username User
    And user input Password User
    And user click button Login
    Then user navigated to Dashboard page
#    When user click menu My Info
#    And user click button Add Employee
#    And user input First Name
#    And user input Middle Name
#    And user input Last Name
#    And user click switch Create Login Details
#    And user input Username for New User
#    And user input Password for New User
#    And user input Confirm Password for New User
#    And user click button Save
#    Then user navigated to Personal Details page