Feature: To validate the Amazon signIn functionality



#Without header
#Scenario: To validate the email and login field
#Given To launch the browser and maximize the browser
#When To launch the URL
#And To pass the email in email field
#|parg@gmail.com|sharmi@gmail.com|paruu@gmail.com|
#And To pass the password in password field
#|12|34|56|
#|78|90|123|
#|456|789|0123|
#And To click the signin button
#Then To close the entire browser

#With header
Scenario: To validate the email and login field
#Given To launch the browser and maximize the browser
When To launch the URL
And To pass the email in email field
|email1|parg@gmail.com|
|email2|paruu@gmail.com|
|email3|sharmi@gmail.com|
And To pass the password in password field
|password1|password2|password3|
|12|34|56|
|78|90|123|
|456|789|0123|
And To click the signin button
#Then To close the entire browser