package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Entrez un nombre entre 1 et 10");
		
		Scanner scanner = new Scanner(System.in) ;
		
		int nb = scanner.nextInt() ;
		
		boolean reussite = false;
		
		
		do {
			
			if (nb >= 1 && nb <= 10) {
				reussite = true;
				System.out.println("Vous avez indiqué : " + nb);
			} else {
				System.out.println("Entrez un nombre entre 1 et 10");
				 nb = scanner.nextInt() ;
			}
			
		} while (!reussite);
		
		
		
		
	}

}
