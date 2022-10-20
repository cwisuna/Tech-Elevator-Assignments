package com.techelevator.dao;

import com.techelevator.model.Park;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcParkDao implements ParkDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcParkDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Park getPark(int parkId) {


        Park park  = new Park();
        String sql = "SELECT park_id, park_name, date_established, area, has_camping " +
                "FROM park " +
                "WHERE park_id = ? ";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql, parkId);
        //if youre expecting single results use an if statement
        if(result.next()){
            park = mapRowToPark(result);
        }

        return park;
    }

    @Override
    public List<Park> getParksByState(String stateAbbreviation) {
        List<Park> parks = new ArrayList<>();
        String sql = "SELECT park.park_id, park.park_name, park.date_established, area, has_camping " +
                   "FROM park " +
                "INNER JOIN park_state " +
                "ON park.park_id = park_state.park_id " +
                "WHERE park_state.state_abbreviation = ? ";

        SqlRowSet result = jdbcTemplate.queryForRowSet(sql, stateAbbreviation);
        //if youre expecting multiple results require a while loop
        while(result.next()){
         parks.add(mapRowToPark(result));
        }
        return parks;
    }

    @Override
    public Park createPark(Park park) {
        Integer newId;
        String sql = " INSERT INTO park (park_name, date_established, area, has_camping) VALUES(?,?,?,?) RETURNING park_id; ";
        newId = jdbcTemplate.queryForObject(sql, Integer.class, park.getParkName(), park.getDateEstablished(), park.getArea(), park.getHasCamping());

        return getPark(newId);
    }

    @Override
    public void updatePark(Park park) {

       String sql = "UPDATE park " +
               "SET park_name = ?, date_established = ?, area = ? , has_camping = ? " +
               "WHERE park_id = ?";
       jdbcTemplate.update(sql, park.getParkName(), park.getDateEstablished(), park.getArea(), park.getHasCamping(), park.getParkId());

    }

    @Override
    public void deletePark(int parkId) {
        String sql = "DELETE FROM parK " +
                "WHERE park_id = ?";
        jdbcTemplate.update(sql, parkId);
    }

    @Override
    public void addParkToState(int parkId, String stateAbbreviation) {

    String sql = "INSERT INTO park_state (park_id, state_abbreviation) VALUES(?, ?)";
        jdbcTemplate.update(sql, parkId, stateAbbreviation);

    }

    @Override
    public void removeParkFromState(int parkId, String stateAbbreviation) {
        String sql = "DELETE FROM parK_state " +
                " WHERE park_id = ? ";
        jdbcTemplate.update(sql, parkId);
    }

    private Park mapRowToPark(SqlRowSet rowSet) {
        Park park = new Park();
        park.setParkId(rowSet.getInt("park_id"));
        park.setParkName(rowSet.getString("park_name"));
        park.setDateEstablished(rowSet.getDate("date_established").toLocalDate());
        park.setArea(rowSet.getDouble("area"));
        park.setHasCamping(rowSet.getBoolean("has_camping"));

        return park;
    }
}
