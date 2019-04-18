package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Entrez un nombre");
		
		Scanner scanner = new Scanner(System.in) ;
		
		int resultat = 0;
		
		int nb = scanner.nextInt() ;
		
		for (int i = 1; i <= nb; i++) {
			resultat = resultat + i;
		}
		
		System.out.println(resultat);
		
	}

}
