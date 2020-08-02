package com.jham.monopoly.backend;

import java.util.List;

import junit.framework.TestCase;

public class MonopolyCheckerTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	
	public void testMonopolyCheckWithMonopoly() {
		List<Property> yellowProperties = new YellowPropertyGroupFactory().makePropertyGroup();
		
		assertTrue(MonopolyChecker.isMonopoly(yellowProperties));
	}
	
	public void testMonopolyCheckWithoutMonopoly() {
		
		List<Property> yellowProperties = new YellowPropertyGroupFactory().makePropertyGroup();
		yellowProperties.remove(0);
		
		assertFalse(MonopolyChecker.isMonopoly(yellowProperties));
	}

}
