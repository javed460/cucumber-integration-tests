@HotelSearchTest
Feature: Test Hotel App functionality

  Scenario: Test Hotels Nearby feature
    Given I want to search hotels nearby
    When I search for hotels nearby
    Then I should get the list of hotels nearby

  Scenario: Should fetch Hotel info
    Given I want to get hotel info "Blue Star Hotel"
    When I search for hotel
    Then I should get the hotel info