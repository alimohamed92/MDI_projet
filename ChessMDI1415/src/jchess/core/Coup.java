package jchess.core;

public class Coup {
	protected int xFrom;
	protected int yFrom;
	protected int xTo;
	protected int yTo;
	
	public Coup(int xFrom, int yFrom, int xTo, int yTo) {
		super();
		this.xFrom = xFrom;
		this.yFrom = yFrom;
		this.xTo = xTo;
		this.yTo = yTo;
	}
	
	public Coup(){
		
	}

	public int getxFrom() {
		return xFrom;
	}

	public void setxFrom(int xFrom) {
		this.xFrom = xFrom;
	}

	public int getyFrom() {
		return yFrom;
	}

	public void setyFrom(int yFrom) {
		this.yFrom = yFrom;
	}

	public int getxTo() {
		return xTo;
	}

	public void setxTo(int xTo) {
		this.xTo = xTo;
	}

	public int getyTo() {
		return yTo;
	}

	public void setyTo(int yTo) {
		this.yTo = yTo;
	}
	public String getDescription(){
		return "";
	}
	
	/*public static void main(String[] args){
		Chessboard  board =new Game().getChessboard();
		board.move(MonteurCoup.create().xFrom(4).yForm(6).xTo(4).yTo(4).construire());

	}*/
}
