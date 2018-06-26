@endtoen
Feature: Login on the gmail home page
As a returning user
I want to login to the application
So that i can view my account.
Background:
Given  the user is on gmail home login page
@goodlogin
Scenario: The user should be able to login with valid information
When the user enters valid username and password
Then the user should be able to successfully login to inbox
Scenario: The user should not be able to login with invalid information
When the user enters bad credentials
Then the user should not be able to login


