package com.jham.monopoly.backend;

import java.util.List;

public class RailRoadProperty extends Property {

	public RailRoadProperty(String name, int cost, int mortgageValue, List<Integer> rent, Color color, int spacesFromGo) {
		super(name, cost, mortgageValue, rent, color, spacesFromGo);
	}

	@Override
	public int getRent() {
		int numProperties = myOwner.getPropertiesOfColor(myColor).size();
		return myRents.get(numProperties);
	}

}
