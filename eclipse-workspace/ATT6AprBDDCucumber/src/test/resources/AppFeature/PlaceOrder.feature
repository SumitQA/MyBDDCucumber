Feature: Place order functionality
Scenario: Order confirmation validation
Given I should be at product page
When i click on add to cart button
Then Product should get added
When i click on place order button
Then order should get confirm