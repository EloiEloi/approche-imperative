package fr.algorithmie;

public class TriABulles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		
		boolean doitPermuter = true;
		int temp;
		
		while (doitPermuter) {
			doitPermuter = false ;
			
			for (int i = 0; i < array2.length-1; i++) {
				if (array2[i] > array2[i+1]) {
					temp = array2[i];
					array2[i] = array2[i+1];
					array2[i+1] = temp;
					doitPermuter = true;
				}
			}
			
			
		}
		
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		
		
		
	}

}
