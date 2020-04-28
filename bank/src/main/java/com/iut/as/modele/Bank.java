package com.iut.as.modele;

import java.util.Map;

public class Bank {

    private Map<String, Client> clients;

    public Bank() {
    }

    public Map<String, Client> getClients() {
        return clients;
    }

    public void setClients(Map<String, Client> clients) {
        this.clients = clients;
    }
    

	public void retrait(String num_compte, String nom_client, double montant)
	{
		if (Compte compte(num_compte instanceof Compte))
		compte.debiter
		
	}
	
	public void depot(String num_compte, String nom_client, double montant)
	{

		
	}
	
	
	public void ouverture_compte(String nomClient) {
		Client client = new Client();
		client.setNom(nomClient);
	 
		
	}
	
	
	public void consultation(String num_compte) {
		
	}
	
	/*
	public double conversionFromEuro(double montant)
	{
		
		
	}	
	
	public double conversionToEuro(double montant) {
		return montant*0.92;
	}*/
}
