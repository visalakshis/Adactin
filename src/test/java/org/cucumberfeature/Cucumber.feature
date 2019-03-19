@TC
Feature: Login functionality for the Adactinhotel application

Background: User launch browser
Given User should launch the browser and navigate to application

@TC1
 Scenario: Verify user for login validation credentials
 When User should enter the username in the login page
 And User should enter the password ih the login page
 And User click on the login button in the login page
 And User Wait for '3' seconds
 And User click the logout button in homepage
 
@TC2
Scenario: Verify user for login validation credentials
When User should enter the username in the login page
And User should enter the password ih the login page
And User click on the login button in the login page
And User should enter the Location using drop down
And User should select the hotel using drop down
And User should select the room using drop down
And User select the no of rooms 
And User select the Check-in-date today date
And User select the Checkout date today date
And User select the Adult room
And User select the children room
Then User click on search button
Then User should get error message if checkin date is previous date

 @TC3
 Scenario: Verify user for login validation credentials
When User should enter the username in the login page
And User should enter the password ih the login page
And User click on the login button in the login page
And User should enter the Location using drop down
And User should select the hotel using drop down
And User should select the room using drop down
And User select the no of rooms 
And User select the Check-in-date today date
And User select the Checkout date today date
And User select the Adult room
And User select the children room
Then User click on search button
Then User should get error message if checkout date is previous date


 @TC4
 Scenario Outline: Verify user for login validation credentials
When User should enter the username in the login page
And User should enter the password ih the login page
And User click on the login button in the login page
And User should enter the Location using drop down 
And User should select the hotel using drop down
And User should select the room using drop down
And User select the no of rooms 
And User select the Check-in-date as today date
And User select the Checkout date as today date
And User select the Adult room
And User select the children room
And User click on search button
Then User should verify the Location same in next page using parameter "<Location>"

Examples:
#we pass index value so i put 1
|Location|
|Sydney  | 
 
 @TC5
 Scenario Outline: Verify user for login validation credentials
When User should enter the username in the login page
And User should enter the password ih the login page
And User click on the login button in the login page
And User should enter the Location using drop down 
And User should select the hotel using drop down
And User should select the room using drop down
And User select the no of rooms 
And User select the Check-in-date as today date
And User select the Checkout date as today date
And User select the Adult room
And User select the children room
And User click on search button
And User should verify the Location same in next page using parameter "<Location>"
And User should verify the check in and check out date is same after search button "<Datecheckin>"
Then User should verify the check out date is same after search button "<Datecheckout>"
Examples:
|Location| |Datecheckin||Datecheckout|
|Sydney  | |11/04/2019||12/04/2019|

 @TC6
 Scenario Outline: Verify user for login validation credentials
When User should enter the username in the login page
And User should enter the password ih the login page
And User click on the login button in the login page
And User should enter the Location using drop down 
And User should select the hotel using drop down
And User should select the room using drop down
And User select the no of rooms 
And User select the Check-in-date as today date
And User select the Checkout date as today date
And User select the Adult room
And User select the children room
And User click on search button
And User should verify the Location same in next page using parameter "<Location>"
And User should verify the check in and check out date is same after search button "<Datecheckin>"
And User should verify the check out date is same after search button "<Datecheckout>" 
Then User should verify the no of rooms is same after search button "<Noofdays>"
Examples:
|Location| |Datecheckin||Datecheckout||Noofdays|
|Sydney  | |11/04/2019||12/04/2019|   |1 Days|


 @TC7
 Scenario Outline: Verify user for login validation credentials
When User should enter the username in the login page
And User should enter the password ih the login page
And User click on the login button in the login page
And User should enter the Location using drop down 
And User should select the hotel using drop down
And User should select the room using drop down
And User select the no of rooms 
And User select the Check-in-date as today date
And User select the Checkout date as today date
And User select the Adult room
And User select the children room
And User click on search button
And User should verify the Location same in next page using parameter "<Location>"
And User should verify the check in and check out date is same after search button "<Datecheckin>"
And User should verify the check out date is same after search button "<Datecheckout>" 
And User should verify the no of rooms is same after search button "<Noofdays>"
Then User should verify the room type is same after search in homepage "<roomtype>"

Examples:
|Location| |Datecheckin||Datecheckout||Noofdays||roomtype|
|Sydney  | |11/04/2019||12/04/2019|   |1 Days|  |Standard|

 @TC8
 Scenario Outline: Verify user for login validation credentials
When User should enter the username in the login page
And User should enter the password ih the login page
And User click on the login button in the login page
And User should enter the Location using drop down 
And User should select the hotel using drop down
And User should select the room using drop down
And User select the no of rooms "<No of Rooms>"
And User select the Check-in-date as today date
And User select the Checkoutdate after 2days from checkin date
And User select the Adult room
And User select the children room
And User click on search button
And User should verify the Location same in next page using parameter "<Location>"
And User should verify the check in and check out date is same after search button "<Datecheckin>"
And User should verify the check out date is same after search button "<Datecheckout>" 
And User should verify the no of rooms is same after search button "<Noofdays>"
And User should verify the room type is same after search in homepage "<roomtype>"
Then User should verify the total price being the calculate per night excluding gst "<Totalprice>"

Examples:
|Location| |Datecheckin||Datecheckout||No of Rooms||Noofdays||roomtype||Totalprice|
|Sydney  | |11/04/2019||12/04/2019|   | 2  | |1 Days|  |Standard||AUD $ 250|

