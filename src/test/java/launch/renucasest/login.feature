Feature: login


Scenario Outline: login process
Given the browser is launched
Given the login page is displayed
When the user enters username "<username>"
When the user enters the password "<password>"
When click on login button
Examples:
|username|password|
|Lalitha |Password123|


