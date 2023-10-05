package fr.algorithmie;
import java.util.Scanner;

public class InteractifStockageNombre {
	
	public static void main(String[] args) {
		
		//Initialisation	
		int[] array = new int[0];
		int nb = 0;
		
		//Demande à l'utilisateur de choisir une option entre ajouter un nombre et consulter les nombres existants
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Ajouter un nombre \n2. Afficher les nombres existants \n3. Stop"
				+ "\nVeuillez saisir 1 pour l'option 1, 2 pour l'option 2 ou 3 pour arrêter le programme et afficher le tableau final :");
		int option = scanner.nextInt();
		
		while (option != 3) {
			switch (option) {
				case (1) : // Ajout d'un nombre dans le tableau
					System.out.println("Saisir un nombre à ajouter au tableau :");
					nb = scanner.nextInt();
					int[] arrayTemp = new int[array.length+1];
					for (int i = 0; i<array.length; i++) {
						arrayTemp[i] = array[i];
					}
					arrayTemp[arrayTemp.length-1]=nb;
					array = arrayTemp;
					break;
				case (2) : // Affichage du tableau
					if (array.length == 0) {
						System.out.println("Il n'y a pas de nombre stocké dans le tableau !");
					} else {
						System.out.println("Les nombres stockés dans le tableau sont :");
						for (int i = 0; i<array.length; i++) {
							System.out.println("Index " + i + ": " + array[i]);
						}
					}
					break;
				default : // Affichage d'un message d'erreur
					System.out.println("Le chiffre saisi ne correpond pas à une option, veuillez en saisir un autre ! ");
					break;
			}
			System.out.println("1. Ajouter un nombre \n2. Afficher les nombres existants \n3. Stop");
			option = scanner.nextInt();
		}	
		
		//Affichage du tableau final
		if (array.length == 0) {
			System.out.println("Il n'y a pas de nombre stocké dans le tableau !");
		} else {
			System.out.println("Les nombres stockés dans le tableau sont :");
			for (int i = 0; i<array.length; i++) {
				System.out.println("Index " + i + ": " + array[i]);
			}
		}
		
	}
}
