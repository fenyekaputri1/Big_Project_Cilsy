@Regression1
Feature:Board Feature

  Background:Succesfully login to Cilsy
    Given User login with existing email
    When User navigate to home page
    And User select the team

  @Board-001 @PositiveTest
  Scenario:Successfully add new list on kanban board
    Given User already on kanban board page
    And User click add list
    And User type list name "Big Project 8"
    When User click create button
    Then User should be success create new list

  @Board-002 @NegativeTest
    Scenario:Failed not fill list name on board page
    Given User already on kanban board page
    And User click add list
    And User not fill list name
    When User click create button
    Then User should be failed create new list

  @Board-003 @PositiveTest
    Scenario:Successfully create new card on board page
    Given User already on kanban board page
    And User click add card icon
    And User type card name "Test Case 7"
    When User click add card button
    Then User should be success add new card


  @Board-004 @NegativeTest
    Scenario:Failed fill card name on board page
    Given User already on kanban board page
    And User click add card icon
    And User not fill card name
    When User click add card button
    Then User should be failed add card

  @Board-005 @PositiveTest
    Scenario:Successfully add notes on small card
    Given User already on kanban board page
    And User click small card
    And User click notes button
    And User fill notes "Don't forget create test case"
    When User click save
    Then User should be success fill notes

  @Board-006 @PositiveTest
  Scenario:Successfully add attachments on small card
    Given User already on kanban board page
    And User click small card
    When User click menu attach file
    Then User should be success attached the files

  @Board-007
    Scenario:Successfully add card members
    Given User already on kanban board page
    And User click small card
    And User click add card members
    And User type team members "Risya"
    And User select team members
    When User click apply members button
    Then User should be success add new members

  @Board-008
  Scenario:Successfully Add Label Card
    Given User already on kanban board page
    And User click small card
    And User click labels card
    And User type label name "Test 6"
    When User click create apply label button
    Then User should be success add labels

#  @Board-009
#  Scenario:Failed add new labels when not fill labels name
#    Given User already on kanban board page
#    And User click small card
#    And User click labels card
#    And User not fill labels name
#    When User click create label button
#    Then Then User should be can't add labels

  @Board-010
  Scenario:Successfully add comments on small card board
    Given User already on kanban board page
    And User click small card
    And User fill add comments "Completed the card part II"
    When User click post button
    Then User should be success create new comments

  @Board-016
  Scenario:Successfully archive the list on list action
    Given User already on kanban board page
    When User click archive menu
    Then User should be success archived the card

  @Board-018
  Scenario:Successfully unarchived the list on menu archived items
    Given User already on kanban board page
    When User restore cards from archived items "Big Project 5"
    Then User Should be success unarchived lists














