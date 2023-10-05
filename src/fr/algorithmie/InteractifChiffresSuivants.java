package fr.algorithmie;
import java.util.Scanner;

public class InteractifChiffresSuivants {
	
	public static void main(String[] args) {
		
		//Demande à l'utilisateur de saisir un nombre
		Scanner scanner = new Scanner(System.in);
		System.out.println("Saisir un nombre :");
		int nb = scanner.nextInt();
		
		// Affichage des 10 nombres suivant le nombre choisi
		String result = "";
		System.out.println("\nLes 10 nombres suivant le nombre " + nb + " sont :");
		for (int i = nb + 1 ; i<nb+11; i++) {
			result = result + i + " ";
		}
		
		System.out.println(result);
	}
}
