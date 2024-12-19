
Feature: Adactin Login

Scenario: Login with Credentials
Given the user is on the login page
When the user enters the username and password
Then the user should be able to login successfully

Scenario: Login with invalid Credentials
Given the user is on login page
When the user enters the invalid username and password
Then "Invalid username or Password" error will appear on the screen


 