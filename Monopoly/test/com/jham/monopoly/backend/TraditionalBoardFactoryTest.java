package com.jham.monopoly.backend;

import junit.framework.TestCase;

public class TraditionalBoardFactoryTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void test() {
		Board board = new Board(new TraditionalBoardFactory());
		assertEquals(40, board.getBoard().size());
		for(int i = 0 ; i < board.getBoard().size(); i++) {
			assertEquals(i, board.getBoard().get(i).spacesFromGo);
		}
	}

}
