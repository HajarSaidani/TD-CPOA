package com.iut.as.modele;

public class CompteSansDecouvert extends Compte {
	
	/*
	 * Constructeur
	 */
	 
	public CompteSansDecouvert() {
		super();
	}
	
	public CompteSansDecouvert(double solde, String numeroCompte) {
		super(solde, numeroCompte);
	}
	
	
	public CompteSansDecouvert(Client client) {
		super(client);
	}
	
	public void debiter(double montant)
	{
		this.setSolde(this.getSolde()-montant);
	}


	@Override
	protected double getDecouvertAutorise() {
		// TODO Auto-generated method stub
		return 0;
	}



	

}
