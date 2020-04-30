package com.iut.as.factory;
import com.iut.as.modele.*;

import java.util.*;




public class CompteFactory {

	private static List<Compte> comptes;

	/* on rend la liste singleton */
	public static List<Compte> getListComptes() {
		if (comptes == null) {
			comptes = getListComptes();
		}
		return comptes;
	}

	
	
	/*
	 * Je vais créer un compte que je vais mettre en lien à un client
	*/
	
    private Compte creerCompte(double solde, Client client){
    	if (solde<0) {
    		CompteAvecDecouvert compte= new CompteAvecDecouvert(solde, "001");
    		compte.setClient(client);
    	}
    	else {
    		CompteSansDecouvert compte= new CompteSansDecouvert(solde, "001");
    	}
    }
    	

    
    
	

}