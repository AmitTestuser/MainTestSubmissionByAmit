Feature: Add City
Scenario: adding new city 
Given chrome browser
When user opens URL "https://products.pisystindia.com/Ecommerce/admin"
And user enters emails as "admin@gmail.com" and password as "123456"
And user click on login
When user click on location
When user click on city
When user click on add new city
And user enters city as "Banana"
And user click on update button
And closes browser

