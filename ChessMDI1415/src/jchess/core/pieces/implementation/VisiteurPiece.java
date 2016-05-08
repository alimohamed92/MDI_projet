package jchess.core.pieces.implementation;

public interface VisiteurPiece {
		 public int visite(Bishop b);
		 public int visite(King k);
		 public int visite(Knight kn);
		 public int visite(Pawn p);
		 public int visite(Queen q);
		 public int visite(Rook r);
}
