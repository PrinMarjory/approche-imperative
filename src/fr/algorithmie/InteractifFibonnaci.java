package fr.algorithmie;
import java.util.Scanner;

public class InteractifFibonnaci {
	
	public static void main(String[] args) {		
		// Demande à l'utilisateur de saisir un nombre plus grand que 1
		Scanner scanner = new Scanner(System.in);
		System.out.println("Saisir le rang de la suite de Fibonacci voulu :");
		int nb = scanner.nextInt();
		
		//Vérification du nombre choisi
		while (nb<=1) {
			System.out.println("Le nombre saisi n'est pas plus grand que 1, veuillez saisir un autre nombre :");
			nb = scanner.nextInt();
		}
		
		// Remplissage d'un tableau avec les éléments de la suite de Fibonacci jusqu'au rang choisi
		int[] fibonnaci = new int [nb+1];
		fibonnaci[0] = 0;
		fibonnaci[1] = 1;
		for (int i = 2; i<fibonnaci.length; i++) {
			fibonnaci[i] = fibonnaci[i-1]+fibonnaci[i-2];
		}
		
		// Affichage du résultat
		System.out.println("La suite de Fibonnaci jusqu'au rang " + nb + " est la suivante :");
		for (int i = 0; i<fibonnaci.length; i++) {
			System.out.println("Rang " + i + ": " + fibonnaci[i]);
		}
	}
}
