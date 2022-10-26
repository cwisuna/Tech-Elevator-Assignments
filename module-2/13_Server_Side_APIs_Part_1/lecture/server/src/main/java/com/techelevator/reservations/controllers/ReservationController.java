package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDao;
import com.techelevator.reservations.dao.MemoryHotelDao;
import com.techelevator.reservations.dao.MemoryReservationDao;
import com.techelevator.reservations.dao.ReservationDao;
import com.techelevator.reservations.model.Reservation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

        private HotelDao hotelDao;
        private ReservationDao reservationDao;


    public ReservationController() {
        this.hotelDao = new MemoryHotelDao();
        this.reservationDao = new MemoryReservationDao(hotelDao);
    }


    @RequestMapping (path = "/reservations", method = RequestMethod.GET)
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
}
