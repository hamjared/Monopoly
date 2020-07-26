package com.jham.monopoly.backend;

import java.util.List;

public abstract class PropertyGroup
{
    private List<Property> myRequiredProperties;
    
    public PropertyGroup(List<Property> requiredPrioerties) {
        myRequiredProperties = requiredPrioerties;
    }
    
    public boolean isMonopoly(List<Property> properties) {
        
        return properties.equals(properties);
    }
    
}
