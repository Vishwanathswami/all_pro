Feature: login

Scenario: user successfully login with valid creadential

Given user launch the browser
And user lanch portal "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When user add emailID "Admin" and password "admin123"
And capture login page title
And click on login button
Then capture home page title
And click on logout button
 