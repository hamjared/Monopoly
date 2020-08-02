package com.jham.monopoly.backend;

import java.util.List;

public abstract class Property {
    

	protected String myName;
    protected int myPrice;
    protected List<Integer> myRents;
    protected int myMortgageValue;
    protected Color myColor;
    protected boolean isMortgaged = false;
    protected Player myOwner = null;
    protected int spacesFromGo;
    

    
    public Property(String name, int cost,
            int mortgageValue, List<Integer> rent, Color color, int spacesFromGo)
    {
           myName = name;
           myPrice = cost;
           myRents = rent;
           myMortgageValue = mortgageValue;
           myColor = color;
           this.spacesFromGo = spacesFromGo;

    }
    
    public int getSpacesFromGo() {
		return spacesFromGo;
	}

	@Override
    public boolean equals(Object object) {
        if(!(object instanceof Property)) {
            return false;
        }
        Property property = (Property) object;
        
        return myName.equals(property.getName());
    }

    public String getName()
    {
        return myName;
    }
    
    public void mortgage() {
    	// TODO: mortgage
    	
    }
    
    public void unMortgage() {
    	// TODO: unMortgage
    	
    }
    
    public void setMyOwner(Player player) {
    	myOwner = player;
    }
    
    public abstract int getRent();
    

}
