Feature: The customer should be able to view their accout info

Background:
Given the user opens a browser
Given the user navigates to the login page
Given the user enters valid credentials
Scenario: the user should be able to make payment
Given the user clicks on make payment
And the user enters credit card info
And the user verifies
Then the user should be able to tranfer money
And the user should see confirmation message
