package com.iut.as.modele;

public class CompteSansDecouvert extends Compte {
	
	public void debiter(double montant)
	{
		this.setSolde(this.getSolde()-montant);
	}
	

}
