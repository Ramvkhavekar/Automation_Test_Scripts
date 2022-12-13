Feature: Login

Scenario: User enters valid username and password and try to login home page should be displayed

Given open the browser and enter the test url
Then login page should be displayed
When user enter valid username and password
And click on login button
Then home page should be displayed
