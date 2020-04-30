package com.iut.as.modele;

public class CompteAvecDecouvert extends Compte {
	
	/*
	 * Constructeur
	 */
	public CompteAvecDecouvert() {
		super();
	}
	
	public CompteAvecDecouvert(double solde, String numeroCompte) {
		super(solde, numeroCompte);
	}
	
	
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
