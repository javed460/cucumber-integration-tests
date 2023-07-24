package com.example.cucumberintegrationtests.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HotelInfoDTO {
    private String hotelName;
    private String location;
    private String stars;
}
