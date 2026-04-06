Feature: DataTable Demo

  
    @asList
  Scenario:
    Given user enter the google
    When user enter the searching keyWords
      | java     |
      | selenium |
      | testNG   |
      | cucumber |
    Then successfully Searched
@asLists
  Scenario:
    Given user enter the url
    When user enter the username and password
      | priya | 123 |
      | kavi  | 234 |
      | ram   | 456 |
    Then successfully entered the homepage
