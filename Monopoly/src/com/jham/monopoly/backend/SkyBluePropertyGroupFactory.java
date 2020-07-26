package com.jham.monopoly.backend;

public class SkyBluePropertyGroupFactory
        extends PropertyGroupFactory
{
    private static final String[] PROPERTY_NAMES = {"Oriental Avenue", "Vermont Avenue", "Connecticut Avenue"};
    private static final int[] PROPERTY_COST = {100, 100, 120};
    private static final Integer[][] PROPERTY_RENTS = {
            {6, 30, 90, 270, 400, 550},
            {6, 30, 90, 270, 400, 550},
            {6, 40, 100, 300, 450, 600}
    };
    private static final int HOUSE_COST = 50;
    
    public SkyBluePropertyGroupFactory(){
        propertyNames = PROPERTY_NAMES;
        propertyCost = PROPERTY_COST;
        propertyRents = PROPERTY_RENTS;
        houseCost = HOUSE_COST;
    }
}
