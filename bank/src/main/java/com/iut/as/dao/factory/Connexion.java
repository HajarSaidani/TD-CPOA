package com.iut.as.dao.factory;

import java.sql.*;


public class Connexion {

		private String url = "jdbc:mysql://devbdd.iutmetz.univ-lorraine.fr:3306/saidani3u_bank";
		private String login = "saidani3u_appli";
		private String pwd = "31118884"; 
		
		private static Connection maConnexion;
		
		try { 
			maConnexion = DriverManager.getConnection(url, login, pwd);
			} catch (SQLException sqle) {
				System.out.println("Erreur connexion" + sqle.getMessage());
				}
		
		public static Connection getInstance(){
	        if(maConnexion == null){
	            new Connexion();
	            System.out.println("INSTANCIATION DE LA CONNEXION SQL ! ");
	        }
		}
		
		return maConnexion;
	}
	
}