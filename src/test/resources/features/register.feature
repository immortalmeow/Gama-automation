@Register
Feature: Register
  @positive-test
  Scenario: Register using valid user's data
    Given User is on Register page
    And user input firstname with "budi"
    And user input lastname with "boom"
    And user input email with "budidi@gmail.com"
    And user input password with "andro123"
    And user click register button
    And user select their gender
    And user click next button
    And user input age field with "20"
    And user input height field with "170"
    And user input weight field with "60"
    When User click simpan button
    Then User successfully registered