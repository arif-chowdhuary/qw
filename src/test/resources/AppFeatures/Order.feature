Feature: Amazon Order Page
	In order to check my order details
	As a registered user
	I want to specify the feature of order details page


Background:
	Given a registered user exists
	Given user is on Amazon login page
	When user enters username
	And user enters password
	And user clicks on login button
	Then user navigates to order page

Scenario: Check Previous Order Deatils
	When user clicks on Orders link
	Then user checks the previous order details

Scenario: Check Open Order Deatils
	When user clicks on Orders link
	Then user checks the open order details

Scenario: Check Cancelled Order Deatils
	When user clicks on Cancelled link
	Then user checks the cancelled order details
