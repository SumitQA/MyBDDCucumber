Feature: Login Functionality
Scenario: Login to Application
Given I am at login page
When I enter Username
And  I enter password 
And I click on lgin button
Then I should get Logged in application 

Scenario: Verification of Title
Given I am at login page
Then  I should able to see Title of page
