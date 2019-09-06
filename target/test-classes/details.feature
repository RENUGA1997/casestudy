
Feature: login page 
  
 Scenario Outline: login
 Given the browse is launched and opening testme app
 When the user enters the "<search>"
 And the user add the product to cart
 Then the login page is displayed
 Examples:
 |search|
 |Headphone|
 
