package com.techelevator.UnitedStates.dao;

import com.techelevator.UnitedStates.model.Park;

import java.util.List;

public interface ParkDao {

    List<Park> getAllParks();

    Park getOnePark(int parkId);
}
