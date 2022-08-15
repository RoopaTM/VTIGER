Feature: Organization

Background:
 Given lanuch the browser
 And navigate the url "http://localhost:8888"
 When enter the userName "admin" and password "admin" and click on submit button
 When Enter the Organization name

@sanity
Scenario: CreateOrganization
When click on the save
 When validate the created Organization Name
 Then logout the application
 
 
@regression 
 Scenario:
 When click on the cancel
 Then logout the application