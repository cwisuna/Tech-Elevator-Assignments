package com.techelevator;

public class CoinDispenser {

    private int  counter ;
    private int maxNumberOfCoins;

    public CoinDispenser(){
        this.counter = 0;
        this.maxNumberOfCoins = 100;
    }

    public boolean isChangeFull(){
       return  counter >= maxNumberOfCoins;
    }

    public boolean acceptCoin(){
        if(!isChangeFull()) {
            try {
                //more coin validation
                counter++;
            } catch (Exception e) {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }

    protected void emptyChangebox(){
        counter = 0;
    }
}
