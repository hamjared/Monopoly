package com.jham.monopoly.backend;

import java.util.List;

import junit.framework.TestCase;

public class RailRoadPropertyTest extends TestCase {
	
	List<Property> railroadProperties; 

	protected void setUp() throws Exception {
		super.setUp();
		railroadProperties = new RailRoadPropertyGroupFactory().makePropertyGroup();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testGetRent() {
		Player player = new Player(0, null);
		player.addProperty(railroadProperties.get(0));
		assertEquals(railroadProperties.get(0).getRent(), 25);
		
	}

}
