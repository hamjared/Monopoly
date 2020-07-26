package com.jham.monopoly.backend;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Player
{

    private int myMoney;
    private List<Property> myProperties;
    private Piece myPiece;
    private List<Card> myCards;
    private int myDoublesInARow;
    private int myCurDiceRoll;
   

    public Player(int money, Piece piece)
    {
        myMoney = money;
        myPiece = piece;
        myProperties = new LinkedList<Property>();
        myCards = new ArrayList<Card>();
        myDoublesInARow = 0;
        myCurDiceRoll = 0;
        
    }
    
    public void throwDice() {
        int die1 = (int) Math.round((Math.random() * 5)) + 1;
        int die2 = (int) Math.round((Math.random() * 5)) + 1;
        
        if (die1 == die2) {
            myDoublesInARow++;
        }
        
        myCurDiceRoll = die1 + die2;
        
    }
    
    public void incrementMoney(int amount) {
        assert(amount >= 0);
        myMoney += amount;
    }
    
    public void decrementMoney(int amount) {
        assert(amount >= 0);
        myMoney -= amount;
    }
    
    public void giveCard(Card card) {
        myCards.add(card);
    }
    
    public void useCard(Card card) {
        myCards.remove(card);
    }
    
    public void addProperty(Property property) {
        myProperties.add(property);
    }
    
    public void removeProperty(Property property) {
        myProperties.remove(property);
    }

    public int getMyMoney()
    {
        return myMoney;
    }

    public List<Property> getProperties()
    {
        return myProperties;
    }

    public Piece getMyPiece()
    {
        return myPiece;
    }

    public List<Card> getMyCards()
    {
        return myCards;
    }

    public int getMyDoublesInARow()
    {
        return myDoublesInARow;
    }

    public int getMyCurDiceRoll()
    {
        return myCurDiceRoll;
    }

}
