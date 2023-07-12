Feature:To validate the gmail login page

#Scenario:To validate login with the valid username and invalid password
#
#Given To launch the browser and maximize the browser
#When To launch the URL
#And To give the valid username in email
#And To give the invalid password
#And To click the login button 
#Then To close the entire browser
#
#Scenario Outline:To validate facebook login with positive and negative functionality
#Given User to launch the browser and maximize the browser
#When User to launch the URL
#And User to pass the username "<emaildatas>" in email field
#And User to pass the password "<passworddatas>" in email field
#And User to click the login button
#Then User to close the entire browser
#
#Examples:
#|emaildatas           |passworddatas|
#|paruu@gmail.com      |paruu|
#|paru@gmail.com       |1234|
#|pargavi@gmail.com    |pargavi|
#|shar@gmail.com       |shar|
#|sharmi@gmail.com     |sharmi|
#|parushar@gmail.com   |123456|

Scenario Outline:To validate gmail login with different functionality
Given To launch the chrome browser and maximize the chrome browser
When To launch the given URL
And To pass the different gmail "<emaildatas>" in email field
And To click the next button
Then To close the entire chrome browser

Examples:
|emaildatas             |
|pargavi2@gamil.com     |
|pargavi20@gamil.com    |
|pargavi2001@gamil.com  |
|pargavi200198@gamil.com|
|sharmi2@gamil.com      |
|sharmi20@gamil.com     |