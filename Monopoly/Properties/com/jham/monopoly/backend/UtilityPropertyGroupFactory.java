package com.jham.monopoly.backend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UtilityPropertyGroupFactory extends IPropertyGroupFactory {

	private static final String[] PROPERTY_NAMES = { "Water Works", "Utility Company"};
	private static final int[] PROPERTY_COST = { 150, 150 };
	private static final Integer[][] PROPERTY_RENTS = { { 4, 10 }, { 4, 10 } };
	private static final int[] SPACES_FROM_GO = {28, 12};

	public UtilityPropertyGroupFactory() {
		propertyNames = PROPERTY_NAMES;
		propertyCost = PROPERTY_COST;
		propertyRents = PROPERTY_RENTS;
		color = Color.Utility;
		spacesFromGo = SPACES_FROM_GO;

	}

	@Override
	public List<Property> makePropertyGroup() {
		List<Property> properties = new ArrayList<Property>();
		for (int i = 0; i < propertyNames.length; i++) {
			properties.add(new UtilityProperty(propertyNames[i], 
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
