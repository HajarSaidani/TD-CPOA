package com.iut.as;
import java.util.Scanner;

import com.iut.as.modele.Mathematic;


public class StartPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Hello World TD3");
		Mathematic maths = new Mathematic();
		System.out.println("Le resultat de 2 + 3 est " + maths.addition(2, 3));
		//try {
		//	System.out.println("Le resultat de 4 / 2 est " + maths.division(4, 2));
		//} catch (Exception e) {
		//	System.out.println(e.getMessage());
		//}
		
		System.out.println("Rentrer une première valeur :");
		Integer a = sc.nextInt();
		
		System.out.println("Rentrer une seconde valeur :");
		Integer b = sc.nextInt();
		
		System.out.println("L'addition des deux valeurs est : " + maths.addition(a, b));
	}

}
