Feature: This is to log in the user
Scenario Outline: registration process
Given the browser is launched
When the user "<user name>" enter his user name
And he enters his firstname "<first name>" 
And he enters his lastname "<last name>"
And he enters his  password"<password>"
And he enters his  confirms pass"<confirm password>"
And he enters his gender
And he enters his email "<email>"
And he enters his mobileno "<contact num>"
And he enters his dob "<dob>"
And he enters his address "<address>"
And he enters his question "<security question>"
And he enters his answer "<answer>"
Then he clicks on register button
Then the User is successfully registered
Examples:
|user name|first name|last name|password|confirm password|email|contact num|dob|address|security question|answer|
|renugag|renuga|govindaraj|123renu|123renu|renu@gmail.com|9677342867|31/10/1997|1,main st,chennai|2|red|


