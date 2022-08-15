Feature: Organization



@sanity
    Scenario: CreateOrganization
 		Given lanuch the browser
 		And navigate the url "http://localhost:8888"
 		When enter the userName "admin" and password "admin" and click on submit button
 		When Enter the Organization name
		When click on the save
 		When validate the created Organization Name
 		Then logout the application
 
 
