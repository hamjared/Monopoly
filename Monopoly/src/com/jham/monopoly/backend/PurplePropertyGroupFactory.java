package com.jham.monopoly.backend;

public class PurplePropertyGroupFactory
        extends PropertyGroupFactory
{
    private static final String[] PROPERTY_NAMES = {"St. Charles Place", "States Avenue", "Virginia Avenue"};
    private static final int[] PROPERTY_COST = {140, 140, 160};
    private static final Integer[][] PROPERTY_RENTS = {
            {10, 50, 150, 450, 625, 750},
            {6, 30, 90, 270, 400, 550},
            {6, 40, 100, 300, 450, 600}
    };
    private static final int HOUSE_COST = 50;
    
    public PurplePropertyGroupFactory(){
        propertyNames = PROPERTY_NAMES;
        propertyCost = PROPERTY_COST;
        propertyRents = PROPERTY_RENTS;
        houseCost = HOUSE_COST;
    }
}
