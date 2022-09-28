package com.techelevator;

public class SquareWall extends RectangleWall{

    //instance variables
    private int sideLength;


    //constructor
    public SquareWall(String name, String color, int sideLength) {

        super(name, color, sideLength, sideLength);
        this.sideLength = sideLength;
    }

    //method
    public String toString(){
        return getName() + " (" + sideLength + "x" + sideLength + ") " + "square";
    }







}
