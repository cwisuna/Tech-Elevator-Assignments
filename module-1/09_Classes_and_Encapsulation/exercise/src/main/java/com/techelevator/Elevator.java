package com.techelevator;

public class Elevator {
    //instance variables
    private int currentFloor;
    private int numberOfFloors;
    private boolean doorOpen;


    //constructor
    public Elevator(int numberOfLevels){
        this.numberOfFloors = numberOfLevels;
        this.currentFloor = 1;
        doorOpen = false;

    }


    //methods
    public void openDoor(){
        if(doorOpen == false){
            doorOpen = true;
        }
    }
    public void closeDoor(){
        if(doorOpen == true){
            doorOpen = false;
        }
    }
    public void goUp(int desiredFloor){

    }
    public void goDown(int desiredFloor) {

    }

}
