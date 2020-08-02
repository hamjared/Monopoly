package com.jham.monopoly.backend;

import java.util.List;

public abstract class IPropertyGroupFactory {
	
	protected String[] propertyNames;
    protected int[] propertyCost;
    protected Integer[][] propertyRents;
    protected Color color;
    protected int spacesFromGo[];
	
	public abstract List<Property> makePropertyGroup();

}
