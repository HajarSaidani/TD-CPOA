package com.iut.as.interfaces;

import java.util.List;

import com.iut.as.modele.Compte;

public interface IDaoCompte extends IDao<Compte> {

	void getCompteParClient(String numeroClient);
	List<Compte> getListeCompteParClient(String numeroClient);
}