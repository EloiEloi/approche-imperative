package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] arrayCopy = new int[array.length];
		
		int DernierIndexArray = array.length-1 ;
		
		for (int i = 0; i < array.length; i++) {
			arrayCopy[i] = array[DernierIndexArray-i];
		}
		
		
		
		for (int i=0 ; i< array.length; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}
		
		System.out.println("-----------------");
		
		for (int i=0 ; i< arrayCopy.length; i++) {
			System.out.println("arrayCopy[" + i + "] = " + arrayCopy[i]);
		}
		
	
	}

}
