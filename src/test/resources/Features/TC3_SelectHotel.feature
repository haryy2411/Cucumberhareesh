@Select
Feature: Verifying Adactin Select Hotel details

Background:
    Given User is on Adactin Hotel login page
    When User should enter "<userName>" , "<password>" and click login
    Then User should verify after login "Hello luciferdevil786!"
    When User should enter all fields in search hotel "<location>","<hotels>","<roomType>","<roomNos>","<datePickIn>","<datePickOut>","<adultRoom>","<childRoom>" and click search
    Then User should verify after search whether it is navigating to select hotel page "Select Hotel"
    
@Selectvalid
  Scenario Outline: Verifying Adactin select hotel page by selecting hotel

    When User should select the hotel and click continue
    Then User should verify after continue whether it is navigating to book a hotel page "Book A Hotel"

    Examples: 
      | userName        | password  | location | hotels        | roomType     | roomNos   | datePickIn | datePickOut | adultRoom | childRoom |
      | luciferdevil786 | 123456789 | London   | Hotel Cornice | Super Deluxe | 3 - Three | 04/07/2022 | 04/07/2022  | 2 - Two   | 1 - One   |

  Scenario Outline: Verifying Adactin select hotel page without selecting hotel

    When User should not select the hotel and click continue
    Then User should verify error message in select hotel after continue "Please Select a Hotel"

    Examples: 
      | userName        | password  | location | hotels        | roomType     | roomNos   | datePickIn | datePickOut | adultRoom | childRoom |
      | luciferdevil786 | 123456789 | London   | Hotel Cornice | Super Deluxe | 3 - Three | 04/07/2022 | 04/07/2022  | 2 - Two   | 1 - One   |
