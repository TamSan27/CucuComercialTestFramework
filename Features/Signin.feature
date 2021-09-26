Feature: Sign in to the Amazon India sites 

Background:
Given open the browser
 
Scenario Outline: Sign in to the Amazon India site
Given open the application
When <User> enters username and password
|Password|
|Username| 
Then click on continue 

Examples:
|Username 						|Password |User|
|Se.tamil333@gmail.com|Idiot@123|Tamil|
|Se.tamil333@gmail.com|Idiot@123|Siva|

Scenario: Sign in to the Facebook
Given open the application
When "Tamil" enters username
