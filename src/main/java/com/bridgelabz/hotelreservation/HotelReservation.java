package com.bridgelabz.hotelreservation;

import java.util.ArrayList;
import java.util.List;

public class HotelReservation {
    List<Hotels> hotels = new ArrayList<>();

    /**
     * This method is used to add hotel to the Hotel List
     */
    public boolean addHotel(Hotels hotel) {

        return hotels.add(hotel);
    }
}