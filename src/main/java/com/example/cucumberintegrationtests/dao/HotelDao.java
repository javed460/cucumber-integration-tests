package com.example.cucumberintegrationtests.dao;

import com.example.cucumberintegrationtests.domain.HotelInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

import static java.util.Arrays.asList;

@Repository
public class HotelDao {

    public List<HotelInfo> getHotelsNearby() {
        return prepareDummyList();
    }

    private List<HotelInfo> prepareDummyList() {
        HotelInfo hotelInfo1 = new HotelInfo();
        hotelInfo1.setHotelName("Blue Star Hotel");
        hotelInfo1.setLocation("High street near railway station");
        hotelInfo1.setStars("***");

        HotelInfo hotelInfo2 = new HotelInfo();
        hotelInfo2.setHotelName("Diamond Hotel");
        hotelInfo2.setLocation("Darson road near clock tower");
        hotelInfo2.setStars("****");

        return asList(hotelInfo1, hotelInfo2);
    }
}
