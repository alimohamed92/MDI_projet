package jchess.core;

public class CoupTemp extends DecoratorCoup{
	private Time time;
	public CoupTemp(Coup cp) {
		this.coup = cp;
		this.time = new Time();
	}
	
	public void setTime(Time t){
		this.time = t;
	}
	public Time getTime(){
		return time;
	}

}
