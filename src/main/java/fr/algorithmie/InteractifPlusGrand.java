package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[] tabNombres = new int[10];
		
		
		for (int i = 0; i < tabNombres.length; i++) {
			System.out.println("Entrez un nombre (" + (i+1) + " / " + tabNombres.length +")");
			Scanner scanner = new Scanner(System.in) ;
			tabNombres[i] = scanner.nextInt() ;
		}
		
		int nbrMax = tabNombres[0];
		for (int i = 1; i < tabNombres.length; i++) {
			
			if (tabNombres[i] > nbrMax) {
				nbrMax = tabNombres[i];
			}
			
		}
		
		System.out.println("le nombre le plus grand est : " + nbrMax);
		
		
	}

}
