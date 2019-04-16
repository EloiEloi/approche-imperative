package fr.tableaux;

public class Exercice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] entiers = {1 , 2, 3, 4, 5, 6 ,7 ,8 ,9, 10};
		System.out.println("entiers[0] = " + entiers[0]);
		System.out.println("entiers[" + entiers.length + "] = " + entiers[(entiers.length-1)]);
		System.out.println("longueur tableau  = " + (entiers.length));
		for (int i = 0; i < entiers.length; i++) {
			if (entiers[i] == 5) {
				System.out.println("index de l'entier 5 = " + i);
			}
		}
		entiers[4] = 8;
	}

}
