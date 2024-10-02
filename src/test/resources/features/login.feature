@Login
Feature: Login

  @positive-test
  Scenario: Login using valid email and valid password
    Given User is on Login page
    And User input email with "dro@gmail.com"
    And User input password with "andro123"
    When User click login button
    Then User is on Home page

#  @negative-test
#  Scenario: Login using valid username and invalid password
#    Given User is on Login page
#    And User input username with "johndoe"
#    And User input password with "wrong_pass"
#    When User click login button
#    Then User got error message
