package com.techelevator.farm;

import java.math.BigDecimal;

public class Cow extends FarmAnimal implements Singable, Sellable {

	private BigDecimal price;

	public Cow() {

		super("Cow", "moo!");
		this.price = BigDecimal.valueOf(1500.00);

	}
	public void milkCow(){
		System.out.println("Cow has been milked!");
	}

	@Override
	public BigDecimal getPrice() {
		return this.price;
	}

}