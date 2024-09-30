Feature: Flight Search

  Scenario: Search for a one-way flight
    Given I am on the flight search page
    When I enter "New York" as the departure city
    And I enter "London" as the arrival city
    And I select "01-12-2023" as the departure date
    And I click the "Search Flights" button
#    Then I should see a list of available flights

#  Scenario: No flights available
#    Given I am on the flight search page
#    When I enter "Atlantis" as the departure city
#    And I enter "Narnia" as the arrival city
#    And I select "2023-12-01" as the departure date
#    And I click the "Search Flights" button
#    Then I should see a message "No flights available"