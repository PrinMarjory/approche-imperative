package fr.algorithmie;
import java.util.Scanner;

public class InteractifTableMult {
	
	public static void main(String[] args) {
		
		//Demande à l'utilisateur d'un nombre entre 1 et 10
		Scanner scanner = new Scanner(System.in);
		System.out.println("Saisir un nombre entre 1 et 10 :");
		int nb = scanner.nextInt();
		
		//Vérification du nombre choisi
		while (nb<1 || nb>10) {
			System.out.println("Le nombre saisi n'est pas compris entre 1 et 10, veuillez saisir un autre nombre :");
			nb = scanner.nextInt();
		}
		
		// Affichage de la table du nombre choisi par l'utilisateur
		System.out.println("\nTable de " + nb + " :");
		for (int i = 1; i<11; i++) {
			System.out.println(nb + " x " + i + " = " + (i*nb));
		}
	}
}
