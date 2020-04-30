package com.iut.as.connexion;

import java.sql.*;


public class Connexion {
	public Connection creeConnexion() {
		String url = "jdbc:mysql://devbdd.iutmetz.univ-lorraine.fr:3306/saidani3u_bank";
		String login = "saidani3u_appli";
		String pwd = "31118884"; 
		Connection maConnexion = null;
		try { 
			maConnexion = DriverManager.getConnection(url, login, pwd);
			} catch (SQLException sqle) {
				System.out.println("Erreur connexion" + sqle.getMessage());
				}
		return maConnexion;
	}
	
}
