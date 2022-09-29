package com.techelevator.farm;

public class Cat extends FarmAnimal{

    public Cat() {
        super("Cat", "Meow");
    }

    @Override
    public String eat() {
        return "Eating cat food ...";
    }

//    @Override
//    public String getSound(){
//        return "Meow";
//    }
}
