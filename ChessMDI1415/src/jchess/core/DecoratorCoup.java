package jchess.core;

public abstract class DecoratorCoup extends Coup{
	protected Coup coup;
	
	
	
	public Coup getCoup() {
		return coup;
	}

	public void setCoup(Coup coup) {
		this.coup = coup;
	}


	
}
