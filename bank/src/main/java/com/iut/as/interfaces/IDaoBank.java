package com.iut.as.interfaces;

import com.iut.as.modele.Bank;


public interface IDaoBank extends IDao<Bank>{

	public void consulterCompte();
	public void retrait(double montant);
	public void depot(String num_compte, String nom_client, double montant);

}
