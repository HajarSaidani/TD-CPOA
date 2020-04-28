package com.iut.as.dao.factory;

import java.util.ArrayList;
import java.util.List;

import com.iut.as.modele.Compte;

public class ClientFactory {

		private static List<Compte> comptes;

		private static getList() {
			List<Client> clients = new ArrayList<>();
			// ici je construit un étudiant --> Je porrai le déléguer à une autre factory ..
			Client client = new Client();
			etudiant.setId(1);
			etudiant.setNom("JOYEUX");
			etudiant.setPrenom("Stéphane");
			etudiants.add(etudiant);
			Etudiant etudiant2 = new Etudiant();
			etudiant2.setId(2);
			etudiant2.setNom("JOYEUX");
			etudiant2.setPrenom("Julie");
			etudiants.add(etudiant2);
			return etudiants;
		}

	}
