package com.example.cucumberintegrationtests.helper;

import com.example.cucumberintegrationtests.dto.HotelInfoDTO;
import com.example.cucumberintegrationtests.dto.HotelsNearbyDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Slf4j
public class CucumberRestApiCalls {
    private static final String BASE_URL = "http://localhost:8080/hotelapp";

    private final RestTemplate restTemplateCucumber;

    public HotelsNearbyDTO callHotelsNearbyApi() {
        ResponseEntity<HotelsNearbyDTO> response = restTemplateCucumber
                .getForEntity(BASE_URL + "/hotels-near-by", HotelsNearbyDTO.class);

        log.info("Hotels Nearby API response={}", response);
        return response.getBody();
    }

    private HttpHeaders getHttpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }

    public HotelInfoDTO getHotelInfo(String hotelName) {
        ResponseEntity<HotelInfoDTO> response = restTemplateCucumber
                .getForEntity(BASE_URL + "/hotel/"+hotelName, HotelInfoDTO.class);

        log.info("Hotel info response={}", response);
        return response.getBody();
    }
}
