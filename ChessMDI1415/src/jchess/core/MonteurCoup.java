package jchess.core;

public class MonteurCoup extends MonteurCoupAbs{

	@Override
	public MonteurCoupAbs xFrom(int x) {
		this.coup.setxFrom(x);
		return this;
	}

	@Override
	public MonteurCoupAbs xTo(int x) {
		this.coup.setxTo(x);
		return this;
	}

	@Override
	public MonteurCoupAbs yForm(int y) {
		this.coup.setyFrom(y);
		return this;
	}

	@Override
	public MonteurCoupAbs yTo(int y) {
		this.coup.setyTo(y);
		return this;
	}


	public static  MonteurCoupAbs create() {
		return new MonteurCoup();
	}

}
