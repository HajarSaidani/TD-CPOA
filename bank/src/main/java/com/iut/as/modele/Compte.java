package com.iut.as.modele;

public class Compte {

	private double solde;
	
	private String numeroCompte;
	
	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public void debiter(double montant)
	{
		this.setSolde(this.getSolde()-montant);
	}
	
	public void crediter(double montant)
	{
		this.setSolde(this.getSolde()+montant);
	}
	
	
}