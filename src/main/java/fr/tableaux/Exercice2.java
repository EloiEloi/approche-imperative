package fr.tableaux;

public class Exercice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] tab = new int[2][];
		tab[0] = new int [] {1, 2, 3};
		tab[1] = new int [] {1, 2, 3, 4, 5};
		System.out.println(tab.length);
		System.out.println(tab[0].length);
		System.out.println(tab[1].length);
		System.out.println(tab[0][0]);
		
		
		
		
		System.out.println(tab[tab.length-1][tab[tab.length-1].length-1]);
		
		
	}
	
}
