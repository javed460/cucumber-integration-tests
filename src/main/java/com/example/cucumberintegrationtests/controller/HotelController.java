package com.example.cucumberintegrationtests.controller;

import com.example.cucumberintegrationtests.domain.HotelInfo;
import com.example.cucumberintegrationtests.dto.HotelsNearbyDTO;
import com.example.cucumberintegrationtests.service.HotelService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.example.cucumberintegrationtests.transformer.HotelInfoDTOTransformer.transformToHotelInfoDTO;

@RestController
@RequiredArgsConstructor
@Slf4j
public class HotelController {
    private final HotelService hotelService;

    @GetMapping("hotels-near-by")
    public HotelsNearbyDTO getHotelsNearby() {
        log.info("Getting all hotels near by");
        List<HotelInfo> hotelInfo = hotelService.getHotelsNearby();
        HotelsNearbyDTO hotelsNearby = transformToHotelInfoDTO(hotelInfo);
        log.info("Returning hotel list");
        return hotelsNearby;
    }

}
