package com.techelevator.cardexample;

public class Card {
    private int suit;
    private int rank;
    private boolean faceDown = true;

    public Card(int suit, int rank){
        this.rank = rank;
        this.suit = suit;
    }
    public Flip(){
        faceDown = !faceDown;
    }
    public int getSuit(){
        return this.suit
    }

    public int getRank(){
        return this.rank;
    }

    public boolean isFaceDown(){
        return this.faceDown;
    }

    public String cardString(){
        return cardString(this.faceDown)

    }

    public String cardString(boolean faceDown){
        if(faceDown){
            return "##";
        }else {
            return Game.getRankedName(rank) + " of " + Game.getSuitnName(suit) + " - " + Game.getSuitSymbol(suit);
        }
    }


}
