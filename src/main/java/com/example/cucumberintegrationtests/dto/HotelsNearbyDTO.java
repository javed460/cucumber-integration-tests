package com.example.cucumberintegrationtests.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class HotelsNearbyDTO {
    private List<HotelInfoDTO> hotelInfoDTOS;
}
