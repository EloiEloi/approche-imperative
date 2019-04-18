package fr.algorithmie;

public class TriParSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		
		int IndexPlusPetitElement;
		int elementTemp;
		
		for (int i = 0; i < array2.length; i++) {
			IndexPlusPetitElement = i;
			for (int j = i+1; j < array2.length; j++) {
				if (array2[j] < array2[IndexPlusPetitElement]) {
					IndexPlusPetitElement = j;
				}
			}
			elementTemp = array2[i];
			array2[i] = array2[IndexPlusPetitElement];
			array2[IndexPlusPetitElement] = elementTemp;		
		}
	
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
	
	}

}
