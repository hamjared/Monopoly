package com.jham.monopoly.backend;

public enum Color {
	Brown(2), 
	SkyBlue(3),
	Purple(3),
	Orange(3), 
	Red(3), 
	Yellow(3), 
	Green(3), 
	Blue(3), 
	Railroad(4), 
	Utility(2);

	private int numProperties;
	private Color(int i) {
		numProperties = i;
	}
	public int getNumProperties() {
		return numProperties;
	}

}
