package com.techelevator;

public class Main {

    public static void main(String[] args) {

            // initialize our gumball machine
        GumballMachine gumballMachine = new GumballMachine();
        boolean success = true;


        while(success){

            if (getUserInput()) {
                success = dispenseTheGumball(gumballMachine);
            } else {
                success = false;
            }
        }
    }

    public static boolean getUserInput(){
        return true;
    }

    public static boolean dispenseTheGumball(GumballMachine gumballMachine){
        if (gumballMachine.getGumballContainer().releaseGumball() && gumballMachine.getCoinDispenser().acceptCoin()){
            return true;
        }
        return false;
    }
}
