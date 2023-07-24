package com.example.cucumberintegrationtests.service;

import com.example.cucumberintegrationtests.dao.HotelDao;
import com.example.cucumberintegrationtests.domain.HotelInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HotelService {
    private final HotelDao hotelDao;

    public List<HotelInfo> getHotelsNearby() {
        return hotelDao.getHotelsNearby();
    }
}
