package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDao;
import com.techelevator.reservations.dao.MemoryHotelDao;
import com.techelevator.reservations.dao.MemoryReservationDao;
import com.techelevator.reservations.dao.ReservationDao;
import com.techelevator.reservations.model.Hotel;
import com.techelevator.reservations.model.Reservation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/hotels")

public class HotelController {

    private HotelDao hotelDao;
    private ReservationDao reservationDao;

    public HotelController() {
        this.hotelDao = new MemoryHotelDao();
        this.reservationDao = new MemoryReservationDao(hotelDao);
    }

    /**
     * Return All Hotels
     *
     * @return a list of all hotels in the system
     */
    @RequestMapping(path = "/hotels", method = RequestMethod.GET)
    public List<Hotel> list() {
        return hotelDao.list();
    }

    /**
     * Return hotel information
     *
     * @param id the id of the hotel
     * @return all info for a given hotel
     */
    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Hotel get(@PathVariable int id) {
        return hotelDao.get(id);
    }


    //---------------------------------------------------------
    //RESERVATIONS
    // ---------------------------------------------------------


    /* @RequestMapping (path = "/reservations", method = RequestMethod.GET)
    public List<Reservation> listReservations(){
        return reservationDao.findAll();
    }

    @RequestMapping (path = "/reservation{id}", method = RequestMethod.GET)
    public Reservation getReservation(@PathVariable int id){
        return reservationDao.get(id);
    }

    @RequestMapping (path = "/hotels/{id}/reservations", method = RequestMethod.GET)
    public List<Reservation> listReservationsByHotel(@PathVariable ("id") int hotelId){
        return reservationDao.findByHotel(hotelId);
    }
*/
    //----------------------------------------------
    // SEARCH
    //----------------------------------------------

    @RequestMapping (path = "/search", method = RequestMethod.GET)
    public List<Hotel> hotelsByCityAndState(@RequestParam String state,@RequestParam(required = false) String city){

        List<Hotel> filteredHotelList = new ArrayList<>();

        List<Hotel> hotels = hotelDao.list();

        for(Hotel hotel : hotels){

            if(city != null){

                if(hotel.getAddress().getCity().toLowerCase().equals(city.toLowerCase()) &&

                        hotel.getAddress().getState().toLowerCase().equals(state.toLowerCase())){

                    filteredHotelList.add(hotel);
                }

            }else{

                if(hotel.getAddress().getState().toLowerCase().equals(state.toLowerCase())){
                    filteredHotelList.add(hotel);
                }
            }
        }
        return filteredHotelList;
    }


    //----------------------------------------------
    // CREATE
    //----------------------------------------------


    @RequestMapping (path = "/reservations", method = RequestMethod.POST)
    public Reservation addReservation(@RequestBody Reservation reservation){

        return reservationDao.create(reservation, reservation.getHotelID());
    }



}
