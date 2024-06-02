Feature: Login functionality with data
Scenario: Login to application with data
Given User should be at login page 
When I enter Username as "testuser"
And  I enter password  as "Test@1234"
And I click on lgin 1 button
Then I should be able to Logged in
