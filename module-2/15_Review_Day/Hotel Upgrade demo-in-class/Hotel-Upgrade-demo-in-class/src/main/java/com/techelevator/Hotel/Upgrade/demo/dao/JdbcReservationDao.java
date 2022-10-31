package com.techelevator.Hotel.Upgrade.demo.dao;

import com.techelevator.Hotel.Upgrade.demo.model.Reservation;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JdbcReservationDao implements ReservationDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcReservationDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Reservation> findAll() {
        return null;
    }

    @Override
    public List<Reservation> findByHotel(int hotelID) {
        return null;
    }

    @Override
    public Reservation get(int reservationID) {
        return null;
    }

    @Override
    public Reservation create(Reservation reservation, int hotelID) {
        return null;
    }

    @Override
    public Reservation update(Reservation reservation, int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
