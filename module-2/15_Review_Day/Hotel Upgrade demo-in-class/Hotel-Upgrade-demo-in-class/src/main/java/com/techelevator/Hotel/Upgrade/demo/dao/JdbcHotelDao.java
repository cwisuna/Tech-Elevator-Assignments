package com.techelevator.Hotel.Upgrade.demo.dao;

import com.techelevator.Hotel.Upgrade.demo.model.Address;
import com.techelevator.Hotel.Upgrade.demo.model.Hotel;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcHotelDao implements HotelDao{

    private JdbcTemplate jdbcTemplate;

    public JdbcHotelDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Hotel> list() {
        List<Hotel> hotels = new ArrayList<>();
//        hotels.add(new Hotel(1,
//                "Aloft Cleveland",
//                new Address("1111 W 10th St","","Cleveland","Ohio","44115"),
//                4,
//                48,274));

        String sql ="SELECT hotel.hotel_id, hotel.hotel_name, hotel.stars, hotel.rooms_available, hotel.cost_per_night, hotel.cover_image, " +
                " address.address_id, address.address, address.address2, address.city, address.state_name, address.postal_code " +
                " FROM hotel " +
                " INNER JOIN address " +
                "   ON address.hotel_id = hotel.hotel_id " +
                " ORDER BY hotel.hotel_id;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);

        while (results.next()){

            hotels.add( mapRowToHotel(results) );
        }


        return hotels;
    }

    //TODO:  Verify this works
    private Hotel mapRowToHotel(SqlRowSet results) {
        Hotel hotel = new Hotel(
                results.getInt("hotel_id"),
                results.getString("hotel_name"),
                new Address (
                        Integer.toString( results.getInt("address_id")),
                        results.getString("address"),
                        results.getString("address2"),
                        results.getString("city"),
                        results.getString("state_name"),
                        results.getString("postal_code")
                ),
                results.getInt("stars"),
                results.getInt("rooms_available"),
                results.getDouble("cost_per_night"),
                results.getString("cover_image")
        );

            return hotel;
    }

    @Override
    public void create(Hotel hotel) {

    }

    @Override
    public Hotel get(int id) {
        return null;
    }
}
