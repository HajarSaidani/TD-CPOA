package com.iut.as.factory;

import java.util.ArrayList;
import java.util.List;

import com.iut.as.modele.Client;

public class ClientFactory {
	
	
	private static List<Client> clients;

	/* on rend la liste singleton */
	public static List<Client> getListClients() {
		if (clients == null) {
			clients = getList();
		}
		return clients;
	}
	

		private static List<Client> getList() {
			List<Client> clients = new ArrayList<>();
			// Je construis un client et je l'ajoute à la liste de clients
			Client client1 = new Client("1", "SAIDANI", "Creutzwald");
			clients.add(client1);
			Client client2 = new Client("2", "DUDA", "Metz");
			clients.add(client2);
			Client client3 = new Client("2", "AGOSSOU", "Metz");
			clients.add(client3);
			return clients;
		}

	}
