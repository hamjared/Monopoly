package com.jham.monopoly.backend;

public abstract class BoardSpace {
	
	protected int spacesFromGo;
	
	public BoardSpace(int spacesFromGo) {
		this.spacesFromGo = spacesFromGo;
	}
	
	public abstract void playerLanded(Player player);
	public abstract void playerPassed(Player player);
	

}
