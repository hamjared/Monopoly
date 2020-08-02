package com.jham.monopoly.backend;

import java.util.List;

public class Board {
	List<BoardSpace> board;
	
	public Board(BoardFactory boardFactory) {
		board = boardFactory.makeBoard();
	}
	
	public BoardSpace getNextSpace(BoardSpace curSpace, int increment) {
		
		int curIndex = board.indexOf(curSpace);
		int newIndex = curIndex + increment;
		return board.get(newIndex);
		
	}

	public List<BoardSpace> getBoard() {
		return board;
	}

	public List<BoardSpace> getSpacesPassed(BoardSpace prevSpace, BoardSpace nextSpace) {
		int firstIndex = board.indexOf(prevSpace);
		int secondIndex = board.indexOf(nextSpace);
		return board.subList(firstIndex, secondIndex);
	}
}
