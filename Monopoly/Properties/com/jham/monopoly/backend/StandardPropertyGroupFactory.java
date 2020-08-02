package com.jham.monopoly.backend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class StandardPropertyGroupFactory extends IPropertyGroupFactory
{
    

    protected int houseCost;

    public List<Property> makePropertyGroup()
    {
        List<Property> properties = new ArrayList<Property>();
        for (int i = 0; i < propertyNames.length; i++) {
            properties.add(new StandardProperty(
                    propertyNames[i],
                    propertyCost[i], 
                    (int) (propertyCost[i] * 0.5),
                    Arrays.asList(propertyRents[i]),
                    houseCost,
                    color,
                    spacesFromGo[i]
                    ));
        }
        
        return properties;
    }
}
