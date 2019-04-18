package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] tab = new int[0];

		boolean quitter = false;
		
		while (!quitter) {
			
			System.out.println("Selectionnez une option : ");
			System.out.println("1 . Ajouter un Nombre");
			System.out.println("2 . Afficher les nombres existants");

			Scanner scanner = new Scanner(System.in);

			int optionNum = scanner.nextInt();
			
			
			if (optionNum == 1) {
				System.out.println("Tapez le nombre à ajouter");
				int nb = scanner.nextInt();
				int[] tabTemp = new int[tab.length + 1];
				
				if (tab.length == 0) { // si tab.length == 0 c'est qu'aucun nombre n'est encore entré dans le tableau
					tabTemp[0] = nb;
				} else {
					for (int i = 0; i < tabTemp.length; i++) {
						tabTemp[i] = tab[i];
					}
					tabTemp[tabTemp.length] = nb;
					for (int i = 0; i < tabTemp.length; i++) {
						tab[i] = tabTemp[i];
					}
				}
			} else if (optionNum == 2) {
				if (tab.length != 0) {
					for (int i : tab) {
						System.out.println("le tableau contient les valeurs suivantes :");
						System.out.println(i);
					}
				} else {
					System.out.println("le tableau est vide");
				}
			} 
			
		}
		
		
		

		

		
		
		
		
	}

}
