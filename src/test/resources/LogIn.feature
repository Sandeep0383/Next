@login
Feature:
  As a user
  I want login in site
  So that i can do shopping
  @login
  Scenario:log in
    Given I am on Homepage
    When  I click the myaccount link
    And  move to accont page
    Then I enter the email and pass word
    Then  I able to sign in
