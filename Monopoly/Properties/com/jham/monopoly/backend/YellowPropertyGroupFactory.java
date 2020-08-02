package com.jham.monopoly.backend;

public class YellowPropertyGroupFactory extends StandardPropertyGroupFactory {
    private static final String[] PROPERTY_NAMES = {"Atlantic Avenue", "Ventnor Avenue", "Marvin Gardens"};
    private static final int[] PROPERTY_COST = {260, 260, 280};
    private static final Integer[][] PROPERTY_RENTS = {
            {22, 110, 330, 800, 975, 1150},
            {22, 110, 330, 800, 975, 1150},
            {24, 120, 360, 850, 1025, 1200}
    };
    private static final int HOUSE_COST = 150;
    private static final int[] SPACES_FROM_GO = {26, 27, 29};
    
    public YellowPropertyGroupFactory(){
        propertyNames = PROPERTY_NAMES;
        propertyCost = PROPERTY_COST;
        propertyRents = PROPERTY_RENTS;
        houseCost = HOUSE_COST;
        color = Color.Yellow;
        spacesFromGo = SPACES_FROM_GO;
    }
}
