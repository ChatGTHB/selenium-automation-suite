Feature: Login Functionality

  Background:
    Given Navigate to the ParaBank

  Scenario Outline: Login Successfully

    When Enter your valid "<username>" and "<password>"
    And Click login button
    Then User should successfully login to the system
    And User should logout from the system

    Examples:
      | username | password |
      | Kerem    | password |


  Scenario Outline: Login Failure1

    When Enter valid "<username>" and invalid "<password>"
    And Click login button
    Then Unsuccessfull attempt should be displayed

    Examples:
      | username | password |
      | Kerem    | passwor  |


  Scenario Outline: Login Failure2

    When Enter invalid "<username>" and valid "<password>"
    And Click login button
    Then Unsuccessfull attempt should be displayed

    Examples:
      | username | password |
      | KeremY   | password |