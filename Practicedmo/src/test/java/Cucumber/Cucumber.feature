Feature: Loginpage for saucedemo app
Scenario: Check login success in navigating to dashboard screen
Given User is in login page
When User enter valid username and password
And User click on login button
Then User is Navigating to dashboard
And Close the browser