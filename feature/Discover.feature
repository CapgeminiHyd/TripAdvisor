Feature: Ixigo Website

Scenario: Login through OTP
Given I am on ixigo website
When I click on Log in/Sign up
And I enter my mobile number as "7337050642"
And I click on continue
Then I should be logged in succesfully

Scenario: Invalid mobile number for Login
Given I am on ixigo website
When I click on Log in/Sign up
And I enter my mobile number as "98765430"
Then I should see an error that mobile number is invalid

Scenario: Flight available in ixigo oneway
Given I am on ixigo homepage
When I enter destination in From
And I enter destination in To
And I click on search button
Then I should be able to view all the flights available oneway

Scenario: Flight available in ixigo RoundTrip
Given I am on ixigo homepage
When I click on RoundTrip
And I enter destination in From
And I enter destination in To
And I click on search button
Then I should be able to view all the flights avaialble Roundtrip 

Scenario: Vistara Flight Status Details
Given I am on ixigo homepage
And I scroll down to popular domestic airlines
When I click on vistara flights
And I scroll down the window
And I click on Vistara flight status details
Then I should be able to know the details of status of the vistara flight








 
 
	
	
  
  
  
 