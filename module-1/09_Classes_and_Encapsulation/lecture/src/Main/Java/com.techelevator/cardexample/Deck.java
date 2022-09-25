package com.techelevator.cardexample;

import  java.util.ArrayList;
import  java.util.Collections;
import  java.util.List;
import  java.util.Random;


public class Deck {
    private List<Cards> listOfCards = new ArrayList<>();

    public Deck(int[] suits, int [] ranks) {
        this(suits, ranks, new Card[]);


    }

    public Deck(int[] suits, int [] ranks, Card[] additionalCards){
        for(int suit : suits){
            for(int rank: ranks){
                listOfCards.add(new Card(suit, rank));
            }
        }

        for(Card card : additionalCards) {
            listOfCards.add(card);
        }
    }

    public Card dealOne(){
        if(listOfCards.size() !=0){
            return listOfCards.remove(0);
        }else {
            return null;
        }
    }
    public void(){
        Collections.shuffle(listOfCards);
    }


}
