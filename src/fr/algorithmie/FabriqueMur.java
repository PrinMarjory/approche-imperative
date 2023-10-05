package fr.algorithmie;

public class FabriqueMur {
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
	
	static boolean fabriqueMur(int nbSmall, int nbBig, int longueur) {
		
		boolean resultat = false;
		
		// Cas où on utilise seulement les petites briques
		if (nbSmall >= longueur) {
			resultat = true;
		} 
		
		//Cas où on utilise les grandes briques
		int i = 1;
		int modulo = 0;
		while (nbBig>=i && longueur >= i*5) {
			modulo = longueur % i*5; 
			if (modulo >= 0 || nbSmall >= modulo ) {
				resultat = true;
			}
		}
		
		return resultat;
	}
	
	private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {
		if (!fabriqueMur(nbSmall, nbBig, longueur) == b) {
			System.err.println("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") NON passant.");
		}
	}
}
