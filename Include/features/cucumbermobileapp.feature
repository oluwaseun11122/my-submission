@tag
Feature: Testing a mobile app
  I want to use this template for my feature file

  @tag1
  Scenario Outline: view movie option
    Given i start the application
    When click on image object
    Then return to the home page

  @tag2
  Scenario: filter by popularity
    Given i start application
    When view filter list
    And click on popular
    Then click on refresh
