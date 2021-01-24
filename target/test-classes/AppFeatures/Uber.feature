
@All
Feature: Uber Booking Feature

@Smoke @qa-ready @US-1001 @Epic-900
Scenario: Bookin Cab Sedan
	Given User wants to select a car type "sedan" from uber application 
	When user select car "sedan" and pickup point "Hollywood" and drop location "Miami"
	Then Driver starts the journey
	And Driver ends the journey
	Then User pays 100 USD

@Regression @Smoke
Scenario: Bookin Cab SUV
	Given User wants to select a car type "suv" from uber application 
	When user select car "sedan" and pickup point "Hollywood" and drop location "Sunrise"
	Then Driver starts the journey
	And Driver ends the journey
	Then User pays 100 USD

@Prod
Scenario: Bookin Cab Mini
	Given User wants to select a car type "mini" from uber application 
	When user select car "sedan" and pickup point "WestpumBeach" and drop location "Miami"
	Then Driver starts the journey
	And Driver ends the journey
	Then User pays 100 USD
