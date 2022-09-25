package com.techelevator.cardexample;


public class Game {
    private Deck deck;

    public Game() {
        int[] pokerSuits = new int[] {SPADES, DIAMONDS, CLUBS, HEARTS};
        int[] pokerRanks = new int[] {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};
        deck = new Deck(pokerSuits, pokerRanks);


    }

    public Deck getDeck() {
        return this.deck;
    }

    public static String getSuit (int suit){
        return suitNames[suit];
    }

    public static char getSuitSymbol(int suit){
        return suitSymbols[suit];
    }

    public static String getRankName(int rank){
        return rankNames[rank];
    }




    public static final int NIL =0;
    public static final int SPADES=1;
    public static final int DIAMONDS=2;
    public static final int CLUBS=3;
    public static final int HEARTS=4;

    public static final int JOKER=0;
    public static final int ACE=1;
    public static final int TW0=2;
    public static final int THREE=3;
    public static final int FOUR=4;
    public static final int FIVE=5;
    public static final int SIX=6;
    public static final int SEVEN =7;
    public static final int EIGHT=8;
    public static final int NINE=9;
    public static final int TEN=10;
    public static final int JACK=11;
    public static final int QUEEN=12;
    public static final int KING=13;


    private static String[] suitNames = new String[] {"Nil", "Spades", "Diamonds", "Clubs", "Hearts"};
    private static char[] suitSymbols = new char[] {'\u0000', '\u2660', '\u2666', '\u2663', '\u2665'};
    private static String[] rankNames = new String[] {"Joker", "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};






}
