package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		for (int i = 0; i < array.length; i++) {
			int maValeur = array[i];
			if (maValeur >= 3) {
				System.out.println("valeur à index " + i + " = "+ maValeur + " est supérieur à 3");
			} 
		}
		
		
		for (int i = 0; i < array.length; i++) {
			int maValeur = array[i];
			if (maValeur % 2 == 0) {
				System.out.println("valeur à index " + i + " = "+ maValeur + " est un entier pair");
			} 
		}
		
		
		for (int i = 0; i < array.length; i++) {
			int maValeur = array[i];
			if (i%2 == 0) {
				System.out.println("valeur à index " + i + " = "+ maValeur );
			}
		}
		
		
		for (int i = 0; i < array.length; i++) {
			int maValeur = array[i];
			if (maValeur % 2 != 0) {
				System.out.println("valeur à index " + i + " = "+ maValeur + " est un entier impair");
			} 
		}

		
		
		
	}

}
