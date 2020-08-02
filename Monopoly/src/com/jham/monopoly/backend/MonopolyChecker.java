package com.jham.monopoly.backend;

import java.util.List;

public class MonopolyChecker {
	
	public static boolean isMonopoly(List<Property> properties) {
		
		Color color = properties.get(0).myColor;
		
		if ( !properties.stream().allMatch(prop -> prop.myColor == color)) {
			return false;
		}
		
		if(properties.size() == color.getNumProperties()) {
			return true;
		}
		
		
		return false;
	}

}
