Feature: Opening the bank account
Scenario: Registration with Nominee
Given User should be at registration page
When User enters the data in following manner
|firstname|lastname|email|Mobile|
|Asish|smith|asish.eder1@gmail.com|8766552567|  
|Rock|dwayne|rock.d34@gmail.com|1234567890|
And user click on submit button
Then account should get created