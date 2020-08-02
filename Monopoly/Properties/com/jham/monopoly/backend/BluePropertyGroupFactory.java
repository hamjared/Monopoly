package com.jham.monopoly.backend;

public class BluePropertyGroupFactory extends StandardPropertyGroupFactory {
	private static final String[] PROPERTY_NAMES = {"Park Place", "Boardwalk"};
    private static final int[] PROPERTY_COST = {350, 400};
    private static final Integer[][] PROPERTY_RENTS = {
            {35, 175, 500, 1100, 1300, 1500},
            {50, 200, 600, 1400, 1700, 2000}
    };
    private static final int HOUSE_COST = 200;
    private static final int[] SPACES_FROM_GO = {37,39};
    
    
    public BluePropertyGroupFactory(){
        propertyNames = PROPERTY_NAMES;
        propertyCost = PROPERTY_COST;
        propertyRents = PROPERTY_RENTS;
        houseCost = HOUSE_COST;
        color = Color.Blue;
        spacesFromGo = SPACES_FROM_GO;
       
    }
}
