Feature: Home Page Functionality
@sanity
Scenario: Verify the title of page
Given User is at landing page
Then Page title should contain "Shopping"

@functional
Scenario: Verify cart Icon
Given User is at landing page
Then cart icon should get display

@Regression
Scenario: Check deals Section
Given User is at landing page
When User clciks on deals section
Then User should redirect to home decor section

