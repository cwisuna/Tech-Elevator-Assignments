package com.techelevator.cardexample;

public class MainProgram {
    public static void main(String[] args) {
        Game game = new Game();


        System.out.println("Unshuffled deck:");
        System.out.println(game.getDeck().deckString());

    }


}
