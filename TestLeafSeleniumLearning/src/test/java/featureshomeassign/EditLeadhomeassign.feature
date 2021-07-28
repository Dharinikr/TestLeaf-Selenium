Feature: Edit Lead functionality in LeafTaps

Scenario: Edit company name for a lead

Given click on leads link 
And click on find leads 
And click on phone tab 
And enter phone number 
And click on find leads1
And click on first result
And click on edit
And get the existing company name
And delete the existing company name
And give the new company name
And click update
Then print the updated company name

