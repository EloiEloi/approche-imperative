package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Entrez un nombre entre 1 et 10");
		
		Scanner scanner = new Scanner(System.in) ;
		
		int nb = scanner.nextInt() ;
		
		boolean reussite = false;
		
		
		do {
			
			if (nb >= 1 && nb <= 10) {
				reussite = true;
				System.out.println("Table de multiplication de " + nb + " : ");
				
				for (int i = 1; i <= 10; i++) {
					System.out.println(nb + " * " + i + " = " + nb*i);
				}
				
				
			} else {
				System.out.println("Entrez un nombre entre 1 et 10");
				 nb = scanner.nextInt() ;
			}
			
		} while (!reussite);
		
		
		
		
	}
	
	

}
