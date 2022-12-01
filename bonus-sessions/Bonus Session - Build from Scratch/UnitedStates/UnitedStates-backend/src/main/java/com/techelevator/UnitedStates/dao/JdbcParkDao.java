package com.techelevator.UnitedStates.dao;

import com.techelevator.UnitedStates.model.Park;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcParkDao implements ParkDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcParkDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Park> getAllParks() {
        List<Park> results = new ArrayList<Park>();

        String sql = " select park.park_id, park.park_name, state.state_name " +
                " from park  " +
                " inner join park_state " +
                " on park_state.park_id = park.park_id " +
                " inner join state " +
                " on state.state_abbreviation = park_state.state_abbreviation ;";

        SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sql);

        while(rowSet.next()){
            Park park = mapRowToPark(rowSet);
            results.add(park);
        }
        return results;
    }

    @Override
    public Park getOnePark(int parkId) {
        Park result = new Park();

        String sql = " select park.park_id, park.park_name, state.state_name " +
                " from park  " +
                " inner join park_state " +
                " on park_state.park_id = park.park_id " +
                " inner join state " +
                " on state.state_abbreviation = park_state.state_abbreviation " +
                " WHERE park.park_id = ?";

        SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sql, parkId);

        while(rowSet.next()){
            Park park = mapRowToPark(rowSet);
            result = park;
        }

        return result;
    }

    private Park mapRowToPark(SqlRowSet rowSet) {
        Park result = new Park();

        result.setParkId(rowSet.getInt("park_id"));
        result.setParkName(rowSet.getString("park_name"));
        result.setStateName(rowSet.getString("state_name"));

        return result;
    }


}
