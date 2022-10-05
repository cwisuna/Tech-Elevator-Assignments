package com.techelevator;

public class GumballMachine {

    private GumballContainer gumballContainer;

    public GumballContainer getGumballContainer() {
        return gumballContainer;
    }

    public CoinDispenser getCoinDispenser() {
        return coinDispenser;
    }

    private CoinDispenser coinDispenser;

    public GumballMachine(){
        this.gumballContainer = new GumballContainer();
        this.coinDispenser = new CoinDispenser();
    }
}
