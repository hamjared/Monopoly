package com.jham.monopoly.backend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RailRoadPropertyGroupFactory extends IPropertyGroupFactory {

	private static final String[] PROPERTY_NAMES = { "Reading Railroad", "Pennsylvania Railroad", "B&O Railroad",
			"Short Line" };
	private static final int[] PROPERTY_COST = { 200, 200, 200, 200 };
	private static final Integer[][] PROPERTY_RENTS = { 
			{ 25, 50, 100, 200 }, { 25, 50, 100, 200 },
			{ 25, 50, 100, 200 }, { 25, 50, 100, 200 } };
	
	private static final int[] SPACES_FROM_GO = {5, 15, 25, 35};

	public RailRoadPropertyGroupFactory() {
		propertyNames = PROPERTY_NAMES;
		propertyCost = PROPERTY_COST;
		propertyRents = PROPERTY_RENTS;
		color = Color.Railroad;
		spacesFromGo = SPACES_FROM_GO;

	}

	@Override
	public List<Property> makePropertyGroup() {
		List<Property> properties = new ArrayList<Property>();
		for (int i = 0; i < propertyNames.length; i++) {
			properties.add(new RailRoadProperty(propertyNames[i], 
					propertyCost[i], 
					(int) (propertyCost[i] * 0.5),
					Arrays.asList(propertyRents[i]), 
					color,
					spacesFromGo[i]
					));
		}

		return properties;
	}
}
