package com.techelevator.farm;

import java.math.BigDecimal;

public class Goat extends FarmAnimal implements Singable, Sellable{

    private BigDecimal price;

    public Goat(){

        super("Goat", "AaaaarrrrggggggggHHHHHHHHH!");
        this.price = new BigDecimal("5.00");
    }

    @Override
    public BigDecimal getPrice() {
        return this.price;
    }
}
