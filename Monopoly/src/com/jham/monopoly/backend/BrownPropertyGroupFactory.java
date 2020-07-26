package com.jham.monopoly.backend;

public class BrownPropertyGroupFactory
        extends PropertyGroupFactory
{
    

    private static final String[] PROPERTY_NAMES = {"Mediterranean Avenue", "Baltic Avenue"};
    private static final int[] PROPERTY_COST = {60, 60};
    private static final Integer[][] PROPERTY_RENTS = {
            {2, 10, 30, 90, 160, 250},
            {4, 20, 60, 180, 320, 450}
    };
    private static final int HOUSE_COST = 50;
    
    public BrownPropertyGroupFactory(){
        propertyNames = PROPERTY_NAMES;
        propertyCost = PROPERTY_COST;
        propertyRents = PROPERTY_RENTS;
        houseCost = HOUSE_COST;
    }


}
