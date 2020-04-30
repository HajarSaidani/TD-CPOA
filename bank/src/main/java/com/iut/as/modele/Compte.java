package com.iut.as.modele;

import javax.persistence.*;

public abstract class Compte {

    /* 
     * Le solde du compte.
     */
    @Column(name = "solde")
    protected double solde;
	
	@Id
	@Column(name = "numeroCompte")
	protected String numeroCompte;
	
	protected Client client;


	/*
	 * Constructeur universel
	 */
	
	public Compte() {
		
	}
	
	
	/*
	 * Constructeur avec client, solde, numero compte
	 */
	 
	protected Compte(Client client, double solde, String numeroCompte){
		this.client=client;
		this.setSolde(solde);
		this.numeroCompte=numeroCompte;
	}
	
	
	/*
	 * Constructeur avec solde et numero compte
	 */
	 
	protected Compte(double solde, String numeroCompte){
		this.setSolde(solde);
		this.numeroCompte=numeroCompte;
	}

	
	/*
	 * Constructeur avec numero compte
	 */
	 
	protected Compte(Client client){
		this.client=client;
	}
	
	
	
	protected double getSolde() {
		return solde;
	}
	

	protected void setSolde(double solde) {
		this.solde = solde;
	}

	protected String getNumeroCompte() {
		return numeroCompte;
	}

	protected void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	protected Client getClient() {
		return client;
	}

	protected void setClient(Client client) {
		this.client = client;
	}	
	
	
	protected void debiter(double montant){
		
		this.setSolde(this.getSolde()-montant);
	}
	
	protected void crediter(double montant)
	{
		this.setSolde(this.getSolde()+montant);
	}


	protected abstract double getDecouvertAutorise();
	
	
}
