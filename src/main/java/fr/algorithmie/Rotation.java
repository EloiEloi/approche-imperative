package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} ;
		
		int temp = array2[array2.length-1];
		
		
		for (int i = array2.length-1; i >0; i--) {
			
			
				array2[i] = array2[i-1];
			
			
		}
		array2[0]=temp;
		
		
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);	
		}
		
	}

}
