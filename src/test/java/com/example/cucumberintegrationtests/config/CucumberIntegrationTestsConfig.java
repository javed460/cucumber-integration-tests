package com.example.cucumberintegrationtests.config;

import com.example.cucumberintegrationtests.helper.CucumberRestApiCalls;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class CucumberIntegrationTestsConfig {

    @Bean
    public CucumberRestApiCalls cucumberRestApiCalls() {
        RestTemplate restTemplateCucumber = new RestTemplate();
        return new CucumberRestApiCalls(restTemplateCucumber);
    }
}
