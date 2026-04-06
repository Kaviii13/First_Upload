Feature: Facebook login

Background:
 Given user enter the url

  Scenario:
   
    When user enter the username
    When user enter the password
    When user click the button
    Then successfully entered the homepage

@kavi
  Scenario:
 
    When user enter the username "java@gmail.com"
    When user enter the password "java"
    When user click the button
    Then successfully entered the homepage

  Scenario Outline:
  
    When user enter the username "<username>"
    When user enter the password "<password>"
    When user click the button
    Then successfully entered the homepage

    Examples:
      | username | password |
      | priya    | 123      |
      | kavi     | 234      |
      | ram      | 456      |
