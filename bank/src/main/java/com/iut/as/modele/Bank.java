package com.iut.as.modele;

import java.util.Map;

public class Bank {

    private Map<String, Client> clients;
    private Map<Compte, Client> comptes;
    
    public double tauxDeChangeEuro=1.09;
    public double tauxDeChangeDollar=0.92;

    public Bank() {
    }

    public Map<String, Client> getClients() {
        return clients;
    }
    
    public Map<Compte, Client> getComptes() {
        return comptes;
    }
    
    

    public void setClients(Map<String, Client> clients) {
        this.clients = clients;
    }
    
    public void setComptes(Map<Compte, Client> comptes) {
        this.comptes = comptes;
    }
    

	public void retrait(Compte compte, double montant)
	{
		if (comptes.containsKey(compte)) {
			if(compte instanceof CompteAvecDecouvert) {
				try {
					if(compte.getSolde()-montant<=compte.getDecouvertAutorise()) {
				compte.debiter(montant);
					}
			} catch(Exception e) {
				System.out.println("Montant non autorisé!");
				}
			}
			
			if(compte instanceof CompteSansDecouvert) {
				try {
					if (comptes.containsKey(compte)) {
							compte.debiter(montant);
					}
				} catch (Exception e){
					System.out.println("Retrait non autorisé!");
				}
			}
		}
	}
		
		
	public void depot(Compte compte, double montant){
		if (comptes.containsKey(compte)) {
			compte.crediter(montant);
		}
	}
	
	
	public void ouverture_compte(Client client) {
		if (clients.containsKey(client)) {
			Compte compte = new CompteSansDecouvert(client);
			comptes.put(compte,client);	
		}
		else {
			Compte compte = new CompteSansDecouvert(client);
			clients.put("-1", client);
			comptes.put(compte,client);	
		}
	}
	
	
	public void consultation(Compte compte) {
		if (comptes.containsKey(compte)) {
			compte.getSolde();
		}
		
	}
	

	public double conversionFromEuro(double montant){
		return montant*tauxDeChangeEuro;	
	}	
	
	
	public double conversionToEuro(double montant) {
		return montant*tauxDeChangeDollar;
	}
}
