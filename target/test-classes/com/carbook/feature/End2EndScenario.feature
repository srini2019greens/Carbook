@Carbook
Feature: Carbook web application end to end test scenarios
Validating homepage, pricing page and contact page

Scenario: Verify the Homepage content present on the Header
Given User should launch the car book application
Then User should verify the logo present in the header
And User should verify the page title 'Carbook - Free Bootstrap 4 Template by Colorlib'
And User should see Home Menu 
And User should see About Menu
And User should see Services Menu
And User should see pricing Menu
And User should see Cars menu
And User should see Blog menu
And User should see contact menu


Scenario: Verify the Make your trip functionality
And User scroll down to '0' and '300'
When User enter the pickup location "Chennai"
And User enter the drop off location "Bangalore"
And User enter the pickup date "12/25/2019"
And User enter the dropoff date "12/26/2019"
And User enter the pick up time "12:00am"
And User click on rent a car now
Then User should verify the logo present in the header
And User wait for '5'

Scenario: Verify the contact address and number is valid
When User click on contact menu
And User scroll down to '0' and '300'
And User wait for '5'
Then User should see Address feild is present
And User should see the phone number "+ 1235 2355 98"
And User should see the email "info@yoursite.com"