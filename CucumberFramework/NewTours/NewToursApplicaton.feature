Feature: NewTours Applicaton Login Functionality

Scenario Outline: Validating Login Functionality

Given Open Firefox Browser and navigate to newTours Applicaton
When User enters valid "<Username>" and "<Password>" and click on signin
Then User should be able to successfully login in and close the applicaton 
Given click on the register 
When user enters all the information required on the form 
And click on submit button
Then User should be successfully registered

Examples:
| Username | Password |
| tutorial | tutorial |
| admin	 | mercury |
