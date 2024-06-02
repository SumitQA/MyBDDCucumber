Feature: Profile Creation

Background: 
Given User should present on Home page

Scenario: Creation of profile
When User Clicks on add profile button
And user enters the data
Then profile should get created

Scenario: Updation of profile
When User Clicks on edit the  profile button
And user update the data
Then profile should get modified

Scenario: Delete of profile
When User Clicks on Delete the  profile button
And user delete the data
Then profile should get Deleted