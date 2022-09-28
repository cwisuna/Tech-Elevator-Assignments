package com.techelevator;

    public abstract class Wall {
        //instance variables
    private String name;
    private String color;

        //getters
        public String getName() {
            return name;
        }

        public String getColor() {
            return color;
        }
        //constructors
        public Wall(String name, String color){
        this.name = name;
        this.color = color;
    }

    public abstract int getArea();

}
