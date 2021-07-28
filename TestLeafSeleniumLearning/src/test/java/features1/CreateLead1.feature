Feature: Create Lead functionality in LeafTaps

Scenario: Create a lead details in leaftaps application

Given open the chrome browser 
And load the application url 
And enter username as demosalesmanager  
And enter password as crmsfa 
And click on the login button 
And click on the crmsfa link  
And click on the leads link 
And click on the create lead 
And enter the company name 
And enter the first name
And enter the last name 
And click on create lead submit button
When status is assigned 
Then lead is created successfully
  




 
