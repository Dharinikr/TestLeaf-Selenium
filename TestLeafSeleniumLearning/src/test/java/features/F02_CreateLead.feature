Feature: Create Lead functionality in LeafTaps

#Background:  
#Given open the chrome browser
#And load the application url

#@smoke @functional
Scenario: Create Lead with only mandatory fields
Given enter the username as demo123
And enter the password as crmsfa
When click on login button
Then homepage should be displayed 
Given click on crmsfa link 
And click on Lead link



#Background cannot be shared across multiple feature files

