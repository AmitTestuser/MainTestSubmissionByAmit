Feature: Add Country
Scenario: adding new Country 
Given chrome browser
When user opens URL "https://xlogist.pisystindia.com/admin/login"
And user enters emails as "admin@gmail.com" and password as "Charlie123"
And user click on login
When user click on location
When user click on Country
When user click on add new Country
And user enters city as "India"
And user click on update button
And closes browser