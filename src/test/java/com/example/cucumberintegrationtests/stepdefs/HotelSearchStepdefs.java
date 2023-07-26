package com.example.cucumberintegrationtests.stepdefs;

import com.example.cucumberintegrationtests.dto.HotelsNearbyDTO;
import com.example.cucumberintegrationtests.helper.CucumberRestApiCalls;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@Slf4j
public class HotelSearchStepdefs {
    private HotelsNearbyDTO hotelsNearbyDTO;

    @Autowired
    private CucumberRestApiCalls cucumberRestApiCalls;

    @Given("I want to search hotels nearby")
    public void iWantToSearchHotelsNearby() {
    }

    @When("I search for hotels nearby")
    public void iSearchForHotelsNearby() {
        HotelsNearbyDTO hotelsNearbyDTO = cucumberRestApiCalls.callHotelsNearbyApi();
        this.hotelsNearbyDTO = hotelsNearbyDTO;
        assertNotNull(hotelsNearbyDTO);
    }

    @Then("I should get the list of hotels nearby")
    public void iShouldGetTheListOfHotelsNearby() {
        assertThat(hotelsNearbyDTO.getHotelInfoDTOS().size()).isGreaterThan(1);
    }
}
