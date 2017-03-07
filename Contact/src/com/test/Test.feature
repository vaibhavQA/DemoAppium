@test
Feature: contact 
Scenario: Verify user is able to Add contact
Given User is landed on App Home page
When user taps on Add contact button 
Then user navigates to Add contact page
When user Adds a contact using name "monu", mobile "87467577578" and email "asgd@v.com"
Then verify the name "monu" under the list