 Feature: signup functionality
Background:
Given User is Logged into application

Scenario Outline: signup to functionality 
Given User is at signup page
When user enters name as "<name>" in the form of
And user enters the <age>
And User confrim gender as "<gender>"
Then user will get created

Examples:
|name|age|gender|
|Sumit|28|Male|
|Aishwarya|26|Female|
|Dani|23|male|