package com.jham.monopoly.backend;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
        List<Integer> throwDice = Die.getInstance().throw2Dice();
        
        if (throwDice.get(0) == throwDice.get(1)) {
            myDoublesInARow++;
        }
        
        myCurDiceRoll = throwDice.get(0) + throwDice.get(1);
        
    }
     
    public List<Property> getPropertiesOfColor(Color c){
    	return myProperties.stream()
    			.filter(prop -> prop.myColor == c)
    			.collect(Collectors.toList());
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
    	if(myProperties.contains(property)) {
    		return;
    	}
        myProperties.add(property);
        property.setMyOwner(this);
    }
    
    public void removeProperty(Property property) {
        myProperties.remove(property);
        property.setMyOwner(null);
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
