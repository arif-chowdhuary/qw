
Feature: User Registration

Scenario: user registration with different data
	Given User is on registration page
	When User enters following user details
			|Arif|Chowdhuary|ac@gmail.com|0123455|USA|
			|Ashraf|Hossain|ah@gmail.com|787855|Japan|
			|Akash|Matsin|am@gmail.com|09873455|Dhaka|
	Then user registration should be successful
		
		
		