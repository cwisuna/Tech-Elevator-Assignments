package com.techelevator;

public class GumballContainer {

    private int counter;
    private int maxNumberOfGumballs ;

    public GumballContainer(){
        this.maxNumberOfGumballs = 100;
        this.counter = 0;
    }
    public boolean isEmpty(){
         return counter <= 0;
    }

    public boolean releaseGumball(){
        if (!isEmpty()) {
            counter--;
            return true;
        }
        return false;
    }
    public void reset(){
        counter = 100;
    }

}
