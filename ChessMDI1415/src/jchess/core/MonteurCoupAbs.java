package jchess.core;

public abstract class MonteurCoupAbs {
protected Coup coup;
	
	public abstract MonteurCoupAbs xFrom(int x);
	public abstract MonteurCoupAbs xTo(int x);
	public abstract MonteurCoupAbs yForm(int y);
	public abstract MonteurCoupAbs yTo(int y);
	public  Coup construire(){
		return this.coup;
	}
	public MonteurCoupAbs() {
		//super();
		this.coup = new Coup();
	}
	
}
