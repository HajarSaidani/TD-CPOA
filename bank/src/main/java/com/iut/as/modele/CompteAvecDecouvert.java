package com.iut.as.modele;

public class CompteAvecDecouvert extends Compte {
	
	private double decouvertAutorise;

	public double getDecouvertAutorise() {
		return decouvertAutorise;
	}

	public void setDecouvertAutorise(double decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
	}

	public void debiter(double montant)
	{
		this.setSolde(this.getSolde()-montant);
	}
	
	
	
}
