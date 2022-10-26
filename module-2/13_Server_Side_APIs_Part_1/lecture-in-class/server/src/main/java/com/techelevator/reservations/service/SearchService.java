package com.techelevator.reservations.service;

import com.techelevator.reservations.dao.HotelDao;
import com.techelevator.reservations.dao.MemoryHotelDao;
import com.techelevator.reservations.dao.MemoryReservationDao;
import com.techelevator.reservations.dao.ReservationDao;
import com.techelevator.reservations.model.Hotel;

import java.util.ArrayList;
import java.util.List;

public class SearchService {


    private HotelDao hotelDao;
    private ReservationDao reservationDao;

    public SearchService(){
        this.hotelDao = new MemoryHotelDao();
        this.reservationDao = new MemoryReservationDao(hotelDao);
    }

    public List<Hotel> getHotelsByCityAndState(String city, String state){
        List<Hotel> filteredHotelList = new ArrayList<>();

        List<Hotel> hotels = hotelDao.list();

        for (Hotel hotel : hotels){

            if (city != null){
                if (hotel.getAddress().getCity().toLowerCase().equals(city.toLowerCase()) &&
                        hotel.getAddress().getState().toLowerCase().equals(state.toLowerCase())) {
                    filteredHotelList.add(hotel);
                }
            } else {
                if ( hotel.getAddress().getState().toLowerCase().equals(state.toLowerCase())){
                    filteredHotelList.add(hotel);
                }
            }


        }

        return filteredHotelList;
    }
}
