package com.jham.monopoly.backend;

public class OrangePropertyGroupFactory extends StandardPropertyGroupFactory {
    private static final String[] PROPERTY_NAMES = {"New York Avenue", "Tennessee Avenue", "St James Place"};
    private static final int[] PROPERTY_COST = {200, 180, 180};
    private static final Integer[][] PROPERTY_RENTS = {
            {16, 80, 220, 600, 800, 1000},
            {14, 70, 200, 550, 750, 950},
            {14, 70, 200, 550, 750, 950}
    };
    private static final int HOUSE_COST = 100;
    private static final int[] SPACES_FROM_GO = {19, 18, 16};
    
    public OrangePropertyGroupFactory(){
        propertyNames = PROPERTY_NAMES;
        propertyCost = PROPERTY_COST;
        propertyRents = PROPERTY_RENTS;
        houseCost = HOUSE_COST;
        color = Color.Orange;
        spacesFromGo = SPACES_FROM_GO;
    }
}
