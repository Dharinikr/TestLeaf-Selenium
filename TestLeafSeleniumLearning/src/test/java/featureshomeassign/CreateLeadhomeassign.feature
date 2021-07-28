Feature: Create Lead functionality in LeafTaps

Scenario: Create a lead details in leaftaps application

Given Click on the leads link
And Click on the create lead 
And Enter the company name 
And Enter the first name
And Enter the last name 
And Click on create lead submit button
When Status is assigned 
Then Lead is created successfully
  