package jchess.core;

public class Time {

	int min;
	int sec;
	public Time(int min, int sec) {
		super();
		this.min = min;
		this.sec = sec;
		if(this.sec >= 60){
			this.min++;
			this.sec = 0;
		}
	}
	
	public Time(){
		this.min = 0;
		this.sec = 0;
	}
	
	
	public void incremente(){
		this.sec++;
		if(this.sec == 60){
			this.min++;
			this.sec = 0;
		}
	}
	public String toString(){
		return this.min+" mn : "+this.sec+" sec";
	}
}
