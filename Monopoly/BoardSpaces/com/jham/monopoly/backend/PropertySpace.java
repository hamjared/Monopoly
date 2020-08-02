package com.jham.monopoly.backend;

public class PropertySpace extends BoardSpace {
	
	private Property property;
	
	public PropertySpace(Property property, int spacesFromGo) {
		super(spacesFromGo);
		this.property = property;
	}

	@Override
	public void playerLanded(Player player) {
		// TODO Auto-generated method stub

	}

	@Override
	public void playerPassed(Player player) {
		// TODO Auto-generated method stub

	}

}
