package com.techelevator.UnitedStates.model;

public class Park {
    private int parkId;
    private  String parkName;
    private String stateName;

    public Park(){

    }

    public Park(int parkId, String parkName, String stateName) {
        this.parkId = parkId;
        this.parkName = parkName;
        this.stateName = stateName;
    }

    public int getParkId() {
        return parkId;
    }

    public void setParkId(int parkId) {
        this.parkId = parkId;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
}
