@Regression
Feature:Check-Ins Feature

  Background:Succesfully login to Cilsy
    Given User login with existing email
    When User navigate to home page
    And User select the team

  @CI-001 @PositiveTest
  Scenario:Successfully navigate to Check Ins page through box menu checkIn
    Given User is on team page
    When User go to Check Ins page through box menu
    Then User should see create CheckIn button

  @CI-003 @PositiveTest
  Scenario:Successfully navigate to New Question Page
    Given User is on the Check Ins Page
    When User go to New Question Page through Create CheckIn button
    Then User should see start collecting answers button

  @CI-004 @PositiveTest
  Scenario:Successfully set the title on new question using alphabetic
    Given User is on the new question page
    When User fill the Question title with alphabetic "Yuk Mulai Diskusi"
    And User create question through Start collecting answers button
    Then User should be success create new question

  @CI-007 @PositiveTest
  Scenario:Successfully archive created question on the Check Ins page
    Given User is on the Check Ins Page
    When User choose one of question to be archived "Ini coba pertanyaan"
    Then User should be success archived the question





















    












