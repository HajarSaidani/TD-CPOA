package com.iut.as.modele;

import javax.persistence.*;

public class Compte {

    /* 
     * Le solde du compte.
     */
    @Column(name = "solde")
    protected double solde;
	
	@Id
	@Column(name = "numeroCompte")
	protected String numeroCompte;


	
	/*
	 * Constructeur avec solde et numeroCompte
	 */
	 
	public Compte(double solde, String numeroCompte){
		this.setSolde(solde);
		this.setNumeroCompte(numeroCompte);
	}
	
	
	
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
