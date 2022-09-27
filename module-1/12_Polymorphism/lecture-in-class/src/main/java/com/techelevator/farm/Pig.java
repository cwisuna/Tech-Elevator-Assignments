package com.techelevator.farm;

import java.math.BigDecimal;

public class Pig extends FarmAnimal implements Singable, Sellable{

    private BigDecimal price;

    public Pig(){
        super("Pig", "Oink, oink");
        this.price = BigDecimal.valueOf(2000);
    }


    @Override
    public BigDecimal getPrice() {
        return this.price;
    }
}
