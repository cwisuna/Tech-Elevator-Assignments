package com.techelevator.Hotel.Upgrade.demo.dao;

import com.techelevator.Hotel.Upgrade.demo.model.Hotel;

import java.util.List;

public interface HotelDao {

    List<Hotel> list();

    void create(Hotel hotel);

    Hotel get(int id);

}