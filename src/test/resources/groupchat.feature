@Regression2
Feature:Group Chat Feature

  Background:Succesfully login to Cilsy
    Given User login with existing email
    When User navigate to home page
    And User select the team

  @GC-001
  Scenario:Successfully add message on group chat
    Given User already on group chat page
    And User type a message "Haloo"
    When User click send button
    Then User should be success send a message

  @GC-002
  Scenario:Successfully delete message on group chat
    Given User already on group chat page
    When User deleted an existing chat message
    Then User should be success delete message "This message was deleted"
    And Appear pop up message "Delete group chat message success"

  @Board-003
  Scenario:Successfully Attach the files on group chat
    Given User already on group chat page
    When User attach the files
    Then User should be success attach files










    












