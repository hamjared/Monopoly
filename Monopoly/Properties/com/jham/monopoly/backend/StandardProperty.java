package com.jham.monopoly.backend;

import java.util.List;

public class StandardProperty extends Property {
	
    private int myHouseCost;
    private boolean hasHotel = false;
    private int myNumHouses = 0;

	public StandardProperty(String name, int cost, int mortgageValue, List<Integer> rent, int houseCost,
			Color color, int spacesFromGo) {
		super(name, cost, mortgageValue, rent, color, spacesFromGo);
        myHouseCost = houseCost;

	}

	@Override
	public int getRent() {
		// TODO: StandardProperty: getRent
		return 0;
	}

}
