Feature: Login feature

Scenario Outline: Verify whether user is able to login sucessfully
Given Open the "http://www.qaclickacademy.com/" on chrome
And Press login button
When Enter the email <username> and password <password>
Then Click on login button
And capture the error message
And close the Browser


Examples:
|username         		|password         |
|Pankajkit@gmail.com    |123456789           |
|test99@gmail.com       |123456           |



#Scenario: Verify whether user is able to get Bar sucessfully
#Given Open the "http://www.qaclickacademy.com/" on chrome
#When get the address of Navigation Bar
#Then Check whether Bar is Displayed
#And close the Browser
#Scenario: Verify whether user is able to get Title sucessfully
#Given Open the "http://www.qaclickacademy.com/" on chrome
#When Get the Address of title
#Then Check whether title is matching
#And close the Browser
