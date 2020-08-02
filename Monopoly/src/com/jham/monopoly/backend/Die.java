package com.jham.monopoly.backend;

import java.util.ArrayList;
import java.util.List;

public class Die {
	
	private static Die die = null;
	private List<Integer> lastDieThrow;
	
	
	
	private Die() {
		lastDieThrow = new ArrayList<Integer>();
	}
	
	public static Die getInstance() {
		if(die == null) {
			die = new Die();
		}
		
		return die;
	}
	
	public int throwDie() {
		return (int) Math.round((Math.random() * 5)) + 1;
	}
	
	public  List<Integer> throw2Dice() {
		lastDieThrow.clear();
		for ( int i = 0 ; i < 2; i++) {
			lastDieThrow.add(throwDie());
		}
		
		return lastDieThrow;
	}
	
	public List<Integer> getLastDieThrow() {
		return lastDieThrow;
	}

}
