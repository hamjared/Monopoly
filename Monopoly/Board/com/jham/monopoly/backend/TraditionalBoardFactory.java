package com.jham.monopoly.backend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TraditionalBoardFactory implements BoardFactory {

	@Override
	public List<BoardSpace> makeBoard() {
		
		List<Property> properties = new StandardPropertyFactory().makeProperties();
		List<BoardSpace> boardSpaces = new ArrayList<>();
		
		for (Property property: properties) {
			boardSpaces.add(new PropertySpaceFactory().makeBoardSpace(property, property.getSpacesFromGo()));
		}
		
		boardSpaces.add(new GoSpace());
		boardSpaces.add(new CommunityChestSpace(2));
		boardSpaces.add(new IncomeTaxSpace(4));
		boardSpaces.add(new ChanceSpace(7));
		boardSpaces.add(new JailSpace(10));
		boardSpaces.add(new CommunityChestSpace(17));
		boardSpaces.add(new FreeParkingSpace(20));
		boardSpaces.add(new ChanceSpace(22));
		boardSpaces.add(new GoToJailSpace(30));
		boardSpaces.add(new CommunityChestSpace(33));
		boardSpaces.add(new ChanceSpace(36));
		boardSpaces.add(new LuxuryTaxSpace(38));
		
		Collections.sort(boardSpaces, new Comparator<BoardSpace>() {
            @Override
            public int compare(BoardSpace o1, BoardSpace o2) {
                return o1.spacesFromGo - o2.spacesFromGo;
            } 
		});
		
		
		return boardSpaces;
		
		
	}

}
