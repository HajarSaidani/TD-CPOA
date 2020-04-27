package com.iut.as.modele;

public class Client {

	private String numeroClient;
	private String nom;
	private String adresse;
	
	
	// Constructeur
	public Client(String numeroClient, String nom, String adresse) {
		this.setNumClient(numeroClient);
		this.setNom(nom);
		this.setAdresse(adresse);
	}
	
	
	public String getNumClient()
	{
		return numeroClient;
	}
	
	public void setNumClient(String numClient)
	{
		this.numeroClient=numClient;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		if (nom==null || nom.trim().length()==0) {
			throw new IllegalArgumentException("Nom du client vide");
			}
		this.nom = nom;
	}
	
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		if (adresse==null || adresse.trim().length()==0) {
			throw new IllegalArgumentException("Adresse du client vide");
			}
		this.adresse = adresse;
	}

	
	
	@Override
	public String toString() {
		return "numero client = " + this.numeroClient + "; nom = " + this.nom + "; adresse = " + this.adresse;
	}
	
}
