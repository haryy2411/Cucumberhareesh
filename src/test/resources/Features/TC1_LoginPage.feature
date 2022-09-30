@Login
Feature: Verifying Adactin Hotel details

  Background: 
    Given User is on Adactin Hotel login page

  @ValidLogin
  Scenario Outline: Verifying Adactin Hotel login page with valid credentials
    When User should enter "<userName>" , "<password>" and click login
    Then User should verify after login "Hello luciferdevil786!"

    Examples: 
      | userName        | password  |
      | luciferdevil786 | 123456789 |

  Scenario Outline: Verifying Adactin Hotel login page with valid credentials using enter
    When User should enter "<userName>" , "<password>" and press enter
    Then User should verify after login "Hello luciferdevil786!"

    Examples: 
      | userName        | password  |
      | luciferdevil786 | 123456789 |

  Scenario Outline: Verifying Adactin Hotel login page with invalid credentials
    When User should enter "<userName>" , "<password>" and press enter
    Then User should verify after login contains "Invalid Login details or Your Password might have expired."

    Examples: 
      | userName     | password  |
      | luciferdevil | harry@663 |
