package fr.algorithmie;
import java.util.Scanner;

public class InteractifPlusGrand {
	
	public static void main(String[] args) {
		
		//Demande à l'utilisateur de saisir 10 nombres et comparaison pour trouver le plus grand
		Scanner scanner = new Scanner(System.in);
		System.out.println("Saisir 10 nombres :");
		System.out.println("Nombre 1 :");
		int max = scanner.nextInt();
		
		for (int i = 2; i<11; i++) {
			System.out.println("Nombre " + i + " :");
			int nb = scanner.nextInt();
			if (nb > max) {
				max = nb;
			}
		}
		
		// Affichage du nombre max
		System.out.println("Le plus grand nombre des nombres saisis est " + max);
	}
}
