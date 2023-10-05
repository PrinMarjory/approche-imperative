package fr.algorithmie;
import java.util.Scanner;

public class InteractifSommeArithmetique {
	
	public static void main(String[] args) {
		
		// Demande à l'utilisateur de saisir un nombre plus grand que 1
		Scanner scanner = new Scanner(System.in);
		System.out.println("Saisir un nombre plus grand que 1 :");
		int nb = scanner.nextInt();
		
		//Vérification du nombre choisi
		while (nb<=1) {
			System.out.println("Le nombre saisi n'est pas plus grand que 1, veuillez saisir un autre nombre :");
			nb = scanner.nextInt();
		}
		
		// Calcul de la somme de 1 au nombre choisi
		int result = 1;
		for (int i = 2 ; i<nb+1; i++) {
			result = result + i;
		}
		
		// Affichage du résultat
		System.out.println("La somme de 1 à " + nb + " est égale à " + result);
	}
}
