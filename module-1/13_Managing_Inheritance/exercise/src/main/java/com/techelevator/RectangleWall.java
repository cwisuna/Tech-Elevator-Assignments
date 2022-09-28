package com.techelevator;

public class RectangleWall extends Wall{
    //instance variables
    private int length;
    private int height;

    //constructor
    public RectangleWall(String name, String color, int length, int height) {
        super(name, color);
        this.length = length;
        this.height = height;
    }

    //getters
    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    //method
    @Override
    public int getArea() {
        return length*height;
    }

    public String toString(){
        return getName() + " (" + length + "x" + height + ") " + "rectangle";
    }



}
