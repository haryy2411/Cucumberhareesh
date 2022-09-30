@Book
Feature: Verifying Adactin Book Hotel Booking details

  Background: 
    Given User is on Adactin Hotel login page
    When User should enter "<userName>" , "<password>" and click login
    Then User should verify after login "Hello luciferdevil786!"
    When User should enter all fields in search hotel "<location>","<hotels>","<roomType>","<roomNos>","<datePickIn>","<datePickOut>","<adultRoom>","<childRoom>" and click search
    Then User should verify after search whether it is navigating to select hotel page "Select Hotel"
    When User should select the hotel and click continue
    Then User should verify after continue whether it is navigating to book a hotel page "Book A Hotel"

  Scenario Outline: Verifying Adactin book hotel page by entering all fields
    When User should book a hotel "<firstName>","<lastName>" and "<address>"
      | cardno           | cardType         | cardMonth | cardyear | cardCvv |
      | 7418529637418521 | American Express | January   |     2011 |     245 |
      | 9785529637418792 | VISA             | March     |     2012 |     456 |
      | 6218529637418854 | Master Card      | May       |     2014 |     178 |
      | 2528529637418525 | Other            | October   |     2015 |     345 |
    Then User should verify after book now whether it is navigating to booking confirmation page "Booking Confirmation"

    Examples: 
      | userName        | password  | location | hotels        | roomType     | roomNos   | datePickIn | datePickOut | adultRoom | childRoom | firstName | lastName | address    |
      | luciferdevil786 | 123456789 | London   | Hotel Cornice | Super Deluxe | 3 - Three | 04/07/2022 | 04/07/2022  | 2 - Two   | 1 - One   | Harry     | jack     | anna nagar |

  Scenario Outline: Verifying Adactin book hotel page by not entering any fields
    When User should not enter any field in book a hotel page and click book now
    Then User should verify error mgs in Book a Hotel page after book noow "Please Enter your First Name","Please Enter you Last Name","Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month" and "Please Enter your Credit Card CVV Number"

    Examples: 
      | userName        | password  | location | hotels        | roomType     | roomNos   | datePickIn | datePickOut | adultRoom | childRoom |
      | luciferdevil786 | 123456789 | London   | Hotel Cornice | Super Deluxe | 3 - Three | 12/07/2022 | 13/07/2022  | 2 - Two   | 1 - One   |
