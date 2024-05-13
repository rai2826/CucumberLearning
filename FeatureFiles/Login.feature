Feature: User Login

  Scenario: Successful Login
    Given The user is on Saucelab page
    When User enters the valid username and password (username:"standard_user",password:"secret_sauce")
    And User clicks on login button
    Then User is redirected to landing page

  Scenario Outline: Data driven Login

    Given The user is on Saucelab page
    When User enters the valid username and password (username:"<user>",password:"<pwd>")
    And User clicks on login button
    Then User is redirected to landing page

    Examples:
    |user|pwd|
    |standard_user|secret_sauce|
    |problem_user |secret_sauce|