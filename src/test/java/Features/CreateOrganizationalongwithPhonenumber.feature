Feature: Organization

Scenario: create organization along with the phone number

 		
 		When enter the userName "admin" and password "admin" and click on submit button
 		When Enter the Organization name and phonenumber
 		|chandankumara|8971715600|
 		|Sri|8971715601|
		When click on the save
 		When validate the created Organization Name
 		Then logout the application