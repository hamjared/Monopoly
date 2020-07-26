package com.jham.monopoly.backend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class PropertyGroupFactory
{
    
    
    
    protected String[] propertyNames;
    protected int[] propertyCost;
    protected Integer[][] propertyRents;
    protected int houseCost;

    public List<Property> makePropertyGroup()
    {
        List<Property> properties = new ArrayList<Property>();
        for (int i = 0; i < propertyNames.length; i++) {
            properties.add(new Property(
                    propertyNames[i],
                    propertyCost[i], 
                    (int) (propertyCost[i] * 0.5),
                    Arrays.asList(propertyRents[i]),
                    houseCost,
                    this.getClass()
                    ));
        }
        
        return properties;
    }
}
