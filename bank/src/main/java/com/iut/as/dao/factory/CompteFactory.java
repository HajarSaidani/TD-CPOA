package com.iut.as.dao.factory;

import java.util.ArrayList;
import java.util.List;

import com.iut.as.modele.Compte;

public class CompteFactory {

	private static List<Compte> comptes;

	/* on rend la liste singleton */
	public static List<Compte> getListComptes() {
		if (comptes == null) {
			comptes = getList();
		}
		return comptes;
	}

	private static List<Compte> getList(String numeroClient) {
		List<Compte> comptes = new ArrayList<>();
		// ici je construit un étudiant --> Je porrai le déléguer à une autre factory ..
		comptes.add(etudiant);
		Etudiant etudiant2 = new Etudiant();
		etudiant2.setId(2);
		etudiant2.setNom("JOYEUX");
		etudiant2.setPrenom("Julie");
		etudiants.add(etudiant2);
		return etudiants;
	}

}