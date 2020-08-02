package com.jham.monopoly.backend;

public class PropertySpaceFactory implements BoardSpaceFactory {

	@Override
	public BoardSpace makeBoardSpace(Property property, int spacesFromGo) {
		
		return new PropertySpace(property, spacesFromGo);
	}

}
