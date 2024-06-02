Feature: Order Infromation
Background:                                                         //Common_Steps             
Given User Should Be Logged Into Application
When User Clicks On Order Link
Then User Redirect to the Order Page

Scenario: fecthing Currently Placed order
When User Clicks on Currently Placed Order button
Then User Should See Current Order infromation

Scenario: fecthing past order information
When User Clicks on past Order button
Then User Should See past Order infromation

Scenario: fecthing cancelled order information
When User Clicks cancel Order button
Then User Should cancel Order infromation

