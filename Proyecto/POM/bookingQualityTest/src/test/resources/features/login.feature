Feature: Login
  I as a web user, logged in to the website

  Scenario: Login Succesful
    Given the user is on the login page
    When the user enters the credentials
    Then the user will see a captcha

  Scenario: Failed login due to insertion of numerical data
    Given the user is on the login page
    When the user enters numbers in email
    Then The user will see an error on the page

  Scenario: Login failed due to insertion of special characters
    Given the user is on the login page
    When the user enter special characters in email
    Then The user will see an error on the page

  Scenario: Login Fail Email
    Given the user is on the login page
    When the user enter wrong email
    Then The user will see an error on the page

  Scenario: Login Fail Password
    Given the user is on the login page
    When the user enter wrong pass
    Then the user will see a captcha

  Scenario: Login Empty email Field
    Given the user is on the login page
    When the user does not enter email
    Then The user will see an error on the page

  Scenario: Login Empty Password Field
    Given the user is on the login page
    When The user does not enter password
    Then The user will see an error on the page
