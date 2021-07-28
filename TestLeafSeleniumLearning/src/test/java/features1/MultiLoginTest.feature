Feature: Testing leaftaps application login 



@positive
Scenario Outline: give multiple login details to check the pass scenario

Given Open the chrome browser 
And Load the leaftaps application url
And enter the login username as <username> 
And enter the login password as <password>
When Click on the leaftaps login button
Then Homepage should be displayed


Examples:
|username|password|
|demosalesmanager|crmsfa| 
|demoCSR|crmsfa|
#|DEMOSALESMANA12|crmsfa|
#|demosalesmanager|ccmsfc|
#|demosalesmanager|CRMSFA|

@negative
Scenario: give multiple login details to check the fail scenario
Given Open the chrome browser 
And Load the leaftaps application url
And enter the login username as demo123
And enter the login password as crmsfa
When Click on the leaftaps login button
But Error message should be displayed


