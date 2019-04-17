package fr.algorithmie;

public class FabriquerMur {
	public static void main(String[] args) {
		// Tests de vérification
		verifier(3, 1, 8, true);
		verifier(3, 1, 9, false);
		verifier(3, 2, 10, true);
		verifier(3, 2, 8, true);
		verifier(3, 2, 9, false);
		verifier(6, 1, 11, true);
		verifier(6, 0, 11, false);
		verifier(1, 4, 11, true);
		verifier(0, 3, 10, true);
		verifier(1, 4, 12, false);
		verifier(3, 1, 7, true);
		verifier(1, 1, 7, false);
	}

	static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
		boolean resultat = false;

		// TODO: implémenter l'algo
		
		int dimSmall = 1;
		int dimBig = 5;
		int sommeSmall = nbSmall*dimSmall;
		int sommeBig = nbBig*dimBig;
		int dimTotale = sommeSmall + sommeBig;
		
		int possibleEnCombienDeBig = longueur/dimBig;
		int possibleEnCombienDeSmall = longueur/dimSmall;

		
		if (dimTotale == longueur) {
			resultat = true;
		} else if (sommeSmall == longueur || sommeBig == longueur) {
			resultat = true;
		} else if ((sommeSmall == 0 && possibleEnCombienDeBig <= nbBig) || (sommeBig == 0 && possibleEnCombienDeSmall <= nbSmall)) {
			resultat = true;	
		} else if ((dimTotale > longueur) && (nbSmall >= longueur%dimBig) ) {
			resultat = true;
		}	
		
		return resultat;
	}

	private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {
		if (!fabriquerMur(nbSmall, nbBig, longueur) == b) {
			System.out.println("Test (" + nbSmall + ", " + nbBig + ", " +

					longueur + ") NON passant.");

		}
	}
}