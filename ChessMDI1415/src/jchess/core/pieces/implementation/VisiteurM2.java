package jchess.core.pieces.implementation;

public class VisiteurM2 implements VisiteurPiece {

	@Override
	public int visite(Bishop b) {
		return 3;
	}

	@Override
	public int visite(King k) {
		return 1000;
	}

	@Override
	public int visite(Knight kn) {
		return 3;
	}

	@Override
	public int visite(Pawn p) {
		return 1;
	}

	@Override
	public int visite(Queen q) {
		return 10;
	}

	@Override
	public int visite(Rook r) {
		return 5;

	}

}
