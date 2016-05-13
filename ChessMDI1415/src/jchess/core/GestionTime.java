package jchess.core;

public class GestionTime extends Thread {

	public void run(){
		while(true){
			Chessboard.timeCoup.incremente();
			try {
				this.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
