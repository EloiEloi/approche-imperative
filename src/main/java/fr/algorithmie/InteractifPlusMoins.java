package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random aleatoire = new Random();
		int monIntAleatoire = aleatoire.nextInt(100)+1;
		int nbrDeCoups = 0;
		
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("essayez de trouver le nombre");
		int nb = scanner.nextInt() ;
		nbrDeCoups++;
		
		while (nb != monIntAleatoire) {
			if (nb < monIntAleatoire) {
				System.out.println("Manqué, vous avez êtes en dessous");	
			} else if (nb > monIntAleatoire) {
				System.out.println("Manqué, vous avez êtes au dessus");
			}
			nb = scanner.nextInt() ;
			nbrDeCoups++;
		}
		System.out.println("Bravo, vous avez trouvé en " + nbrDeCoups + " coups ");
	}
}
