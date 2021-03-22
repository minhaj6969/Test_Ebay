@dropdown
Feature: Ebay dropdown feature functionality test

Scenario: I am able to do dropdown with valid credentials
   Given I am on the home page
   When I click on the dropdown
   And I click on the books
   Then I successfully land on books page
    