package com.example.cucumberintegrationtests.config;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = {"com.example.cucumberintegrationtests.stepdefs"},
        plugin = {"pretty", "html:target/cucumber-html-report.html"},
        tags = "@HotelSearchTest")
public class CucumberIntegrationTestsRunner {
}
