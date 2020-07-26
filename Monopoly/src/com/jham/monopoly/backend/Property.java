package com.jham.monopoly.backend;

import java.util.List;

public class Property {
    

    private String myName;
    private int myPrice;
    private List<Integer> myRents;
    private int myHouseCost;
    private int myMortgageValue;
    private Class<?> myPropertyGroup;
    
    private boolean hasHotel = false;
    private int myNumHouses = 0;
    private boolean isMortgaged = false;
    private Player myOwner = null;
    

    
    public Property(String name, int cost,
            int mortgageValue, List<Integer> rent, int houseCost, Class<?> propertyGroup)
    {
           myName = name;
           myPrice = cost;
           myRents = rent;
           myHouseCost = houseCost;
           myMortgageValue = mortgageValue;
           myPropertyGroup = propertyGroup;
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


}
