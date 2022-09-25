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

    }


    //methods
    public void openDoor(){
        doorOpen = true;
    }
    public void closeDoor(){
        doorOpen = false;
    }
    public void goUp(int desiredFloor){
        if(doorOpen){
            desiredFloor = currentFloor;
        }if (desiredFloor > currentFloor && desiredFloor <= numberOfFloors){
            currentFloor = desiredFloor;
        }
    }
    public void goDown(int desiredFloor) {
        if (doorOpen) {
            desiredFloor = currentFloor;
            doorOpen = false;
        }

        if (desiredFloor < currentFloor && desiredFloor >= 1) {
            currentFloor = desiredFloor;

        }


    }

}
