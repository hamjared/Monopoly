package com.jham.monopoly.backend;

public class RedPropertyGroupFactory extends StandardPropertyGroupFactory {
    private static final String[] PROPERTY_NAMES = {"Kentucky Avenue", "Indiana Avenue", "Illinois Avenue"};
    private static final int[] PROPERTY_COST = {220, 220, 240};
    private static final Integer[][] PROPERTY_RENTS = {
            {18, 90, 250, 700, 875, 1050},
            {18, 90, 250, 700, 875, 1050},
            {20, 100, 300, 750, 925, 1100}
    };
    private static final int HOUSE_COST = 150;
    private static final int[] SPACES_FROM_GO = {21, 23, 24};
    
    public RedPropertyGroupFactory(){
        propertyNames = PROPERTY_NAMES;
        propertyCost = PROPERTY_COST;
        propertyRents = PROPERTY_RENTS;
        houseCost = HOUSE_COST;
        color = Color.Red;
        spacesFromGo = SPACES_FROM_GO;
    }
}
