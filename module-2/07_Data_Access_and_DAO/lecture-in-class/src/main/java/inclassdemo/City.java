package inclassdemo;

import org.springframework.jdbc.support.rowset.SqlRowSet;

public class City {


    public City(){

    }

    public City(int cityId, String cityName, String stateAbbreviation, String state_name, int population, double area) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.stateAbbreviation = stateAbbreviation;
        this.state_name = state_name;
        this.population = population;
        this.area = area;
    }

    private  int cityId;
    private String cityName;
    private String stateAbbreviation;


    private String state_name;
    private int population;
    private double area;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateAbbreviation() {
        return stateAbbreviation;
    }

    public void setStateAbbreviation(String stateAbbreviation) {
        this.stateAbbreviation = stateAbbreviation;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getState_name() {
        return state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }
    @Override
    public String toString() {
        return String.format("%s, %s  - %s (ID: %d)", getCityName(), getStateAbbreviation(), getState_name(), getCityId());
    }
}
