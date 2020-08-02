package com.jham.monopoly.backend;

import java.util.List;

public class UtilityProperty extends Property {

	public UtilityProperty(String name, int cost, int mortgageValue, List<Integer> rent, Color color, int spacesFromGo) {
		super(name, cost, mortgageValue, rent, color, spacesFromGo);

	}

	@Override
	public int getRent() {
		int numOfColor = myOwner.getPropertiesOfColor(myColor).size();
		return myRents.get(numOfColor);
	}

}
