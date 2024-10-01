Feature: Hotel Search
  As a user
  I want to search for hotels
  So that I can find accommodation for my trip

  Scenario: Search for hotels in a city
    Given I am on the hotel search page
    When I enter "Dubai" in the destination field
    And I select "01-12-2024" as check-in date
    And I select "10-12-2024" as check-out date
    And I click on the search button
#    Then I should see a list of available hotels in Dubai