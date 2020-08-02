package com.jham.monopoly.backend;

public class GreenPropertyGroupFactory extends StandardPropertyGroupFactory {
    private static final String[] PROPERTY_NAMES = {"Pacific Avenue", "North Carolina Avenue", "Pennsylvania Avenue"};
    private static final int[] PROPERTY_COST = {300, 300, 320};
    private static final Integer[][] PROPERTY_RENTS = {
            {26, 130, 390, 900, 1100, 1275},
            {26, 130, 390, 900, 1100, 1275},
            {28, 150, 450, 1000, 1200, 1400}
    };
    private static final int HOUSE_COST = 200;
    private static final int[] SPACES_FROM_GO = {31, 32, 34};
    
    public GreenPropertyGroupFactory(){
        propertyNames = PROPERTY_NAMES;
        propertyCost = PROPERTY_COST;
        propertyRents = PROPERTY_RENTS;
        houseCost = HOUSE_COST;
        color = Color.Green;
        spacesFromGo = SPACES_FROM_GO;
    }
}
