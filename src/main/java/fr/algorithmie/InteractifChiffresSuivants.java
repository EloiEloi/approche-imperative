package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Entrez un nombre");
		
		Scanner scanner = new Scanner(System.in) ;
		
		int nb = scanner.nextInt() ;
		
		for (int i = nb+1; i <= nb+10; i++) {
			System.out.println(i);
		}
		
		
		
		
		
		
	}

}
