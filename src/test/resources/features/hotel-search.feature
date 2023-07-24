Feature: Test Hotel App functionality
  @HotelSearchTest
  Scenario: Test Hotels Nearby feature
    Given I want to search hotels nearby
    When I search for hotels nearby
    Then I should get the list of hotels nearby