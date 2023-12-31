package com.example.cucumberintegrationtests.transformer;

import com.example.cucumberintegrationtests.domain.HotelInfo;
import com.example.cucumberintegrationtests.dto.HotelInfoDTO;
import com.example.cucumberintegrationtests.dto.HotelsNearbyDTO;

import java.util.List;
import java.util.stream.Collectors;

public final class HotelInfoDTOTransformer {

    public static HotelsNearbyDTO transformToHotelsNearbyDTO(List<HotelInfo> hotelInfoList) {
        List<HotelInfoDTO> hotelInfoDTOS = hotelInfoList.stream()
                .map(HotelInfoDTOTransformer::transformToHotelInfoDTO)
                .collect(Collectors.toList());

        HotelsNearbyDTO hotelsNearbyDTO = new HotelsNearbyDTO();
        hotelsNearbyDTO.setHotelInfoDTOS(hotelInfoDTOS);

        return hotelsNearbyDTO;
    }

    public static HotelInfoDTO transformToHotelInfoDTO(HotelInfo hotelInfo) {
        HotelInfoDTO hotelInfoDTO = new HotelInfoDTO();
        hotelInfoDTO.setHotelName(hotelInfo.getHotelName());
        hotelInfoDTO.setLocation(hotelInfo.getLocation());
        hotelInfoDTO.setStars(hotelInfo.getStars());
        return hotelInfoDTO;
    }
}
