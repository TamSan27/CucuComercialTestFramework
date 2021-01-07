Feature: Sign in to the Amazon India sites 
Scenario Outline: Sign in to the Amazon India site
Given open the application
When <User> enters username and password 
|Username|
|Password|
Then click on continue 
Examples:
|User |Username 						|Password |
|Tamil|Se.tamil333@gmail.com|Idiot@123|

Scenario: check it
Given check it

