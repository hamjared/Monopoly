package com.jham.monopoly.backend;

public abstract class Card {
    public enum Deck {CHANCE, COMMUNITY_CHEST};
    private Deck myDeck;
    protected String myDescription;
    
    public Card(Deck deck) {
        
    }
    
    public abstract void performAction(Player player);
}
