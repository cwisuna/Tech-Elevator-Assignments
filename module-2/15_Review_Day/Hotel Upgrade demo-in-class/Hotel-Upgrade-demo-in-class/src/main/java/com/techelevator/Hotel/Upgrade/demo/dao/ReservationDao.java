package com.techelevator.Hotel.Upgrade.demo.dao;

import com.techelevator.Hotel.Upgrade.demo.model.Reservation;

import java.util.List;

public interface ReservationDao {

    List<Reservation> findAll();

    List<Reservation> findByHotel(int hotelID);

    Reservation get(int reservationID);

    Reservation create(Reservation reservation, int hotelID);

    Reservation update(Reservation reservation, int id);

    void delete(int id);

}