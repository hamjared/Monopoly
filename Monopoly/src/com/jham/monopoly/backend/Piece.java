package com.jham.monopoly.backend;

import java.util.List;

public class Piece {
	
	private BoardSpace myCurSpace;
	private Player myPlayer;
	private Board myBoard;
	
	public Piece(Player player, Board board) {
		this.myPlayer = player;
		this.myBoard = board;
	}
	
	
	public void movePiece(int numSpaces) {
		BoardSpace prevSpace = myCurSpace;
		myCurSpace = myBoard.getNextSpace(myCurSpace, numSpaces);
		myCurSpace.playerLanded(myPlayer);
		
		List<BoardSpace> spacesPassed = myBoard.getSpacesPassed(prevSpace, myCurSpace);
		spacesPassed.forEach(space -> space.playerPassed(myPlayer));
	}
	
	public void movePieceToSpace(BoardSpace space, boolean triggerSpacePassed) {
		BoardSpace prevSpace = myCurSpace;
		myCurSpace = space;
		myCurSpace.playerLanded(myPlayer);
		
		if(triggerSpacePassed) {
			List<BoardSpace> spacesPassed = myBoard.getSpacesPassed(prevSpace, myCurSpace);
			spacesPassed.forEach(s -> s.playerPassed(myPlayer));
		}
	}

}
