package fr.algorithmie;
import java.util.Scanner;
import java.util.Random;

public class InteractifPlusMoins {
	
	public static void main(String[] args) {
		
		// Génération d'un nombre random entre 1 et 100
		Random rand = new Random();
		int solution = rand.nextInt(100)+1;	
		
		// Initialisation	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Devinez le nombre aléatoire compris entre 1 et 100");
		int nb = scanner.nextInt();
		int nbEssai = 1;
		
		// Boucle de recherche du nombre aléatoire
		while (nb != solution) {
			if (nb>solution) {
				System.out.println("Trop grand !");
				nb = scanner.nextInt();
				nbEssai++;
			} if (nb<solution) {
				System.out.println("Trop petit !");
				nb = scanner.nextInt();
				nbEssai++;
			}
		}
		
		// Affichage du message de réussite
		System.out.println("Bravo, vous avez trouvé en " + nbEssai + " coups !");
	}
}
