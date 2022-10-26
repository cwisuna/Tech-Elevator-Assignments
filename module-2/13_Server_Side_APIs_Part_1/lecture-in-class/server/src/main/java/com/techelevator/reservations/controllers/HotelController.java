package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDao;
import com.techelevator.reservations.dao.MemoryHotelDao;
import com.techelevator.reservations.dao.MemoryReservationDao;
import com.techelevator.reservations.dao.ReservationDao;
import com.techelevator.reservations.model.Hotel;
import com.techelevator.reservations.model.Reservation;
import com.techelevator.reservations.service.SearchService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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
    @RequestMapping( method = RequestMethod.GET)
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

    /**
     *
     * @param id id is the hotel
     * @param rid rid is the reservation id
     * @return hotel object
     */
    @RequestMapping(path = "/{id}/reservations/{rid}", method = RequestMethod.GET)
    public Hotel get(@PathVariable int id, @PathVariable int rid) {
        return hotelDao.get(id);
    }

    /**
     *
     * @param id
     */
    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable int id) {
         hotelDao.remove(id);

    }
    @RequestMapping(path = "/{id}/reservations", method = RequestMethod.GET)
    public List<Reservation> listReservationsByHotel(@PathVariable("id") int hotelID){
        return reservationDao.findByHotel(hotelID);
    }


    //================================
    // RESERVATIONS
    //================================

//    @RequestMapping(path="/reservations", method = RequestMethod.GET)
//    public List<Reservation> listReservations(){
//         return reservationDao.findAll();
//    }
//
//    @RequestMapping(path="/reservations/{id}", method= RequestMethod.GET)
//    public Reservation getReservation(@PathVariable int id){
//         return reservationDao.get(id);
//    }
//
//    @RequestMapping(path="/reservations", method = RequestMethod.POST)
//    public Reservation addReservation(@RequestBody Reservation reservation){
//        return reservationDao.create(reservation, reservation.getHotelID());
//
//    }

    @RequestMapping(path="/{id}/reservations", method = RequestMethod.POST)
    public Reservation addReservation(@RequestBody Reservation reservation, @PathVariable Integer id){
        return reservationDao.create(reservation, id);

    }

    //===============================
    //  Search
    //===============================

    @RequestMapping(path="/search", method = RequestMethod.GET)
    public List<Hotel> hotelsByCityAndState(@RequestParam String state, @RequestParam(required=false) String city){
//        List<Hotel> filteredHotelList = new ArrayList<>();
//
//        List<Hotel> hotels = hotelDao.list();
//
//        for (Hotel hotel : hotels){
//
//            if (city != null){
//               if (hotel.getAddress().getCity().toLowerCase().equals(city.toLowerCase()) &&
//                   hotel.getAddress().getState().toLowerCase().equals(state.toLowerCase())) {
//                    filteredHotelList.add(hotel);
//                }
//            } else {
//                if ( hotel.getAddress().getState().toLowerCase().equals(state.toLowerCase())){
//                    filteredHotelList.add(hotel);
//                }
//            }
//
//
//        }


        SearchService searchService = new SearchService();
        return searchService.getHotelsByCityAndState(city, state);

    }

    @RequestMapping(path="/zip", method = RequestMethod.GET)
    public List<Hotel> hotelsByCityAndState(@RequestParam String zipcode){
        List<Hotel> filteredHotelList = new ArrayList<>();

        List<Hotel> hotels = hotelDao.list();

        for (Hotel hotel : hotels){


                if ( hotel.getAddress().getZip().toLowerCase().equals(zipcode.toLowerCase())){
                    filteredHotelList.add(hotel);
                }

        }

        return filteredHotelList;

    }
}
