@Cancel
Feature: Verifying Adactin Hotel Cancel Booking details

  Background: 
    Given User is on Adactin Hotel login page
    When User should enter "<userName>" , "<password>" and click login
    Then User should verify after login "Hello luciferdevil786!"

  Scenario Outline: Verifying Adactin Hotel booking cancellation
    When User should enter all fields in search hotel "<location>","<hotels>","<roomType>","<roomNos>","<datePickIn>","<datePickOut>","<adultRoom>","<childRoom>" and click search
    Then User should verify after search whether it is navigating to select hotel page "Select Hotel"
    When User should select the hotel and click continue
    Then User should verify after continue whether it is navigating to book a hotel page "Book A Hotel"
    When User should book a hotel "<firstName>","<lastName>" and "<address>"
      | cardno           | cardType         | cardMonth | cardyear | cardCvv |
      | 7418529637418521 | American Express | January   |     2011 |     245 |
      | 9785529637418792 | VISA             | March     |     2012 |     456 |
      | 6218529637418853 | Master Card      | May       |     2014 |     178 |
      | 2528529637418524 | Other            | October   |     2015 |     345 |
    Then User should verify after book now whether it is navigating to booking confirmation page "Booking Confirmation"
    When User should cancel booking
    Then User should verify after cancel "The booking has been cancelled." message in booked itinerary page

    Examples: 
      | userName        | password  | location | hotels        | roomType     | roomNos   | datePickIn | datePickOut | adultRoom | childRoom | firstName | lastName | address    |
      | luciferdevil786 | 123456789 | London   | Hotel Cornice | Super Deluxe | 3 - Three | 04/07/2022 | 04/07/2022  | 2 - Two   | 1 - One   | Harry     | jack     | anna nagar |

  Scenario Outline: Verifying Adactin Hotel existing order id cancellation
    When User should cancel the booked order id "<orderId>"
    Then User should verify after cancel "The booking has been cancelled." message in booked itinerary page

    Examples: 
      | userName        | password  | orderId    |
      | luciferdevil786 | 123456789 | BC9NWE7572 |
