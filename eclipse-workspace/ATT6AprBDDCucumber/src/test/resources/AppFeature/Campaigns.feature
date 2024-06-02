@sumit
Feature: Sending email campaign
@Regression
Scenario: Create Campaign
Given user is at campaign page
When user click on create campaign button
And user enters the details
Then Campaign get created

@functional @sanity
Scenario: Scheduling Campaign
Given user is at campaign page
When user click on edit  campaign button
And user enters the schedule
Then Campaign get scheduled

@sanity
Scenario: Validating send campaign
Given user is at campaign page
And user should have sent campaign
Then user should have see count of campaign
