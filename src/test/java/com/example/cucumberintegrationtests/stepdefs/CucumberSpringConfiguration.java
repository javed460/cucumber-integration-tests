package com.example.cucumberintegrationtests.stepdefs;

import com.example.cucumberintegrationtests.config.CucumberIntegrationTestsConfig;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = CucumberIntegrationTestsConfig.class)
public class CucumberSpringConfiguration {


}
