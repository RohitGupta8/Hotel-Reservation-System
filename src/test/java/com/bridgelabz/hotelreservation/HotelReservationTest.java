package com.bridgelabz.hotelreservation;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {
    HotelReservation hotelReservation = new HotelReservation();

    @Test
    public void whenAddedHotelShouldReturnAddedHotel() {
        try {
            boolean isValid1 = hotelReservation.addHotel(new Hotels("LakeWood", 110));
            Assert.assertTrue(isValid1);
            boolean isValid2 = hotelReservation.addHotel(new Hotels("BridgeWood", 160));
            Assert.assertTrue(isValid2);
            boolean isValid3 = hotelReservation.addHotel(new Hotels("RidgeWood", 220));
            Assert.assertTrue(isValid3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

