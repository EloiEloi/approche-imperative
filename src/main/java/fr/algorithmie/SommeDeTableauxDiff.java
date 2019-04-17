package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 };
		
//		int longueurMax;
//		int longueurMini;
		
		int[] arraySomme = null;
		int[] tableauGrand = null;
		int[] tableauPetit = null;
		
		
		if (array1.length > array2.length) {
			
			arraySomme = new int[array1.length];
			
			
			 tableauGrand = array1;
			 tableauPetit = array2;
			
			
		} else {
			
			 arraySomme = new int[array2.length];
		
			tableauGrand = array2;
			 tableauPetit = array1;
		}
	
	
	
		
		
			
		for (int i = 0; i < arraySomme.length; i++) {
			if (i < tableauPetit.length) {
				arraySomme[i] = tableauGrand[i] + tableauPetit[i];
			} else {
				arraySomme[i] = tableauGrand[i] + 0;
			}
			
		}
		
		for (int i = 0; i < arraySomme.length; i++) {
			System.out.println(arraySomme[i]);
		}
		
		
	}

}
