package jchess.core.pieces.implementation;

import jchess.core.Chessboard;
import jchess.core.Player;
import jchess.core.pieces.Piece;
import jchess.core.pieces.traits.behaviors.implementation.KingBehavior;

public class RandomPiece extends Piece{

	public RandomPiece(Chessboard chessboard, Player player) {
	
		   super(chessboard, player);
	        this.symbol = "RP";
	      //  this.addBehavior(new RandomBehavior(this));
		// TODO Auto-generated constructor stub
	}

	@Override
	public int acceptVisiteurM2(VisiteurM2 v) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void acceptVisiteurM1(VisiteurM1 v) {
		// TODO Auto-generated method stub
		
	}

}
