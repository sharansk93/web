Feature: Reqres app
Scenario: To get the Last name
Given Hit the uri
When I post the get request and get the status code and the last name of last id
Then validate the status code