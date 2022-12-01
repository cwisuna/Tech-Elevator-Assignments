package com.techelevator.model.kanban;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private Long id;
    private String title;
    private String backgroundColor;
    private List<Card> cards;

    public Board(){
        this.cards = new ArrayList<Card>();
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public List<Card> getCards() {
        return this.cards;
//        return this.cards == null ? new ArrayList<Card>() : this.cards;

    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
