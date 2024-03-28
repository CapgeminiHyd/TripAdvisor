Feature: Ixigo Website

#Scenario: Login through OTP
#Given I am on ixigo website
#When I click on Log in/Sign up
#And I enter my mobile number as "7337050642"
#And I enter otp to verify
#Then I should be logged in succesfully

Scenario: Flight available in ixigo
Given I am on ixigo homepage
When I enter From as "HYD - Hyderabad"
And I enter To as "DEL - New Delhi"
And I click on search button
Then I should be able to view all the flights available 



 
 
	
	
  
  
  
 