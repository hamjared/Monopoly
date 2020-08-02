package com.jham.monopoly.backend;

public class GoSpace extends BoardSpace {
	
	private static final int PASSED_GO_MONEY = 200;
	private static final int LANDED_ON_GO_MULTIPLIER = 1;

	public GoSpace() {
		super(0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void playerLanded(Player player) {
		player.incrementMoney(LANDED_ON_GO_MULTIPLIER * PASSED_GO_MONEY);

	}

	@Override
	public void playerPassed(Player player) {
		player.incrementMoney(PASSED_GO_MONEY);

	}

}
