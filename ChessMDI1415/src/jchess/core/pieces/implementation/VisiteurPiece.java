package jchess.core.pieces.implementation;

public interface VisiteurPiece {
 public void visite(Bishop b);
 public void visite(King k);
 public void visite(Knight kn);
 public void visite(Pawn p);
 public void visite(Queen q);
 public void visite(Rook r);
}
