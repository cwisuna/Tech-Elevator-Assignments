package com.techelevator.farm;

public class Tractor implements Singable {

    private String name;
    private String sound;

    public Tractor() {
       this. name = "Tractor";
       this. sound = "vroom vroom";
    }

    public String getName() { return this.name;}

    public String getSound(){ return this.sound;}
}
