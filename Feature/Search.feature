@Search
Feature: Ebay functionality feature in test

Scenario: I am able to enter text successfully with valid credentials

  Given I am on the home page
  When I enter text
  And I click on search button
  And I click on paperback
  And I click on  Sourthern keto
  And I click on add to watchlist
  Then I successfully get the page
  