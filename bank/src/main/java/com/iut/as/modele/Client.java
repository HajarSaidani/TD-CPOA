package com.iut.as.modele;

public class Client {

	private String numeroClient;
	
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	private String adresse;
	
	private String nom;
	
	public String getNumClient()
	{
		return numeroClient;
	}
	
	public void setNumClient(String numClient)
	{
		this.numeroClient=numClient;
	}
	
	
}
