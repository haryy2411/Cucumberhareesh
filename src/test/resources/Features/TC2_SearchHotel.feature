@Search
Feature: Verifying Adactin Search Hotel details

  Background: 
    Given User is on Adactin Hotel login page
    When User should enter "userName" , "password" and click login
    Then User should verify after login "Hello luciferdevil786!"

  @searchValid
  Scenario Outline: Verifying Adactin search hotel page by entering all fields
    When User should enter all fields in search hotel "<location>","<hotels>","<roomType>","<roomNos>","<datePickIn>","<datePickOut>","<adultRoom>","<childRoom>" and click search
    Then User should verify after search whether it is navigating to select hotel page "Select Hotel"

    Examples: 
      | userName        | password  | location | hotels        | roomType     | roomNos   | datePickIn | datePickOut | adultRoom | childRoom |
      | luciferdevil786 | 123456789 | London   | Hotel Cornice | Super Deluxe | 3 - Three | 12/07/2022 | 13/07/2022  | 2 - Two   | 1 - One   |

  Scenario Outline: Verifying Adactin search hotel page by entering only mandatory fields
    When User should enter mandatory fields in search hotel "<location>","<roomNos>","<datePickIn>","<datePickOut>","<adultRoom>" and click search
    Then User should verify after search whether it is navigating to select hotel page "Select Hotel"

    Examples: 
      | userName        | password  | location | roomNos   | datePickIn | datePickOut | adultRoom |
      | luciferdevil786 | 123456789 | London   | 3 - Three | 04/07/2022 | 04/07/2022  | 2 - Two   |

  Scenario Outline: Verifying Adactin search hotel page by enter invalid date
    When User should enter all fields in search hotel "<location>","<hotels>","<roomType>","<roomNos>","<datePickIn>","<datePickOut>","<adultRoom>","<childRoom>" and click search
    Then User should verify after search, date error message "Check-In Date shall be before than Check-Out Date","Check-Out Date shall be after than Check-In Date"

    Examples: 
      | userName        | password  | location | hotels        | roomType     | roomNos   | datePickIn | datePickOut | adultRoom | childRoom |
      | luciferdevil786 | 123456789 | London   | Hotel Cornice | Super Deluxe | 3 - Three | 12/07/2022 | 04/07/2022  | 2 - Two   | 1 - One   |

  Scenario Outline: Verifying Adactin search hotel page without entering any fields
    When User should not enter any field in search hotel page and click search
    Then User should verify error message after search in search hotel"Please Select a Location"

    Examples: 
      | userName        | password  |
      | luciferdevil786 | 123456789 |
