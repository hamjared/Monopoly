package com.jham.monopoly.backend;

import java.util.List;

import junit.framework.TestCase;

public class StandardPropertyFactoryTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testMakeProperties() {
		List<Property> allProperties = new StandardPropertyFactory().makeProperties();
		int expectedNumProperties = 28;
		
		assertEquals(expectedNumProperties, allProperties.size());
	}

}
