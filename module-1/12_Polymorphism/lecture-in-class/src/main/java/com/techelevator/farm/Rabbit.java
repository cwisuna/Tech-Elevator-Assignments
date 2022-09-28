package com.techelevator.farm;

import java.math.BigDecimal;

public class Rabbit extends FarmAnimal implements Sellable {

    private BigDecimal price;
    public Rabbit(){

        super("Rabbit", "");
        this.price = BigDecimal.valueOf(7.50);
    }


    @Override
    public BigDecimal getPrice() {
        return this.price;
    }
}
