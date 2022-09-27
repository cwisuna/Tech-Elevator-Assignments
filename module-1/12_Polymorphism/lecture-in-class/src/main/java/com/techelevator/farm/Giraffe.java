package com.techelevator.farm;

import java.math.BigDecimal;

public class Giraffe extends FarmAnimal implements Sellable{

    private BigDecimal price;
    public Giraffe(){

        super("Giraffe", "");
        this.price = new BigDecimal("1000000");
    }

    @Override
    public BigDecimal getPrice() {
        return this.price;
    }
}
