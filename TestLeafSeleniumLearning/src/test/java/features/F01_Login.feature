Feature: Login functinality for LeafTaps application

#Background:  
#Given open the chrome browser
#And load the application url 
 
 #@regression
 Scenario Outline: Test login with positive credentials

#Given is to denote given condition. if there are lot lines together we can even use And
# we can give either given or and
#Background is to keep common steps across all the scenarios

Given enter the username as <username>
And enter the password as <password>
When click on login button 
Then homepage should be displayed 

Examples:
|username|password|
|demosalesmanager|crmsfa|
|demoCSR|crmsfa|

#@functional
Scenario: Test login with negtative credentials

Given enter the username as demo123
And enter the password as crmsfa
When click on login button 
But error message should be displayed 


#Scenario: Test login with positive credentials
#Given open the chrome browser 
#And load the application url 
#And enter the username as demosalesmanager
#(And enter the username as demoCSR-to test with another data)
#And enter the password as crmsfa 
#When click on login button 
#Then homepage should be displayed 