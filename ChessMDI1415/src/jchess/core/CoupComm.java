package jchess.core;

import javax.swing.JOptionPane;

public class CoupComm extends DecoratorCoup{
	private String commentaire;
	
	public CoupComm(Coup cp) {
		this.coup = cp;
		this.commentaire ="";
	}
	
	public void setComm(){
		this.commentaire = JOptionPane.showInputDialog(null, "Vous pensez quoi de ce coup ?");
		if(this.commentaire == null)
			this.commentaire = "";
		 
	}
	public String getComm(){
		return commentaire;
		
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.coup.getDescription()+"'*"+ this.commentaire+"*'";
	}
}
