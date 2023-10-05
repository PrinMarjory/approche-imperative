package fr.algorithmie;
import java.util.Scanner;
import java.util.Random;

public class Interactif21Batons {
	
	public static void main(String[] args) {
		
		// Initialisation
		int nbBatons = 21;
		int choixUser = 0;
		int choixOrdi = 0;
		String affichageBatons = "|||||||||||||||||||||";
		System.out.println("Règle du jeu des batons :  Chacun votre tour vous pouvez retirer 1 à 3 batons. Celui qui retire le dernier baton perd." 
				+ "\n\nVous disposez de 21 batons : \n" + affichageBatons + "\n");
		Scanner scanner = new Scanner(System.in);
		
		
		/// Boucle du jeu jusqu'à victoire ou défaite ///
		while (nbBatons > 1) {
			
			
			/// TOUR DE L'UTILISATEUR ///
			
			System.out.println("C'est votre tour, combien de baton voulez vous retirer ? (1, 2 ou 3)");
			choixUser = scanner.nextInt();
			
			//Vérification nombre compris entre 1 et 3
			while (choixUser<1 || choixUser>3) {
				System.out.println("\nLe nombre saisi n'est pas compris entre 1 et 3, veuillez saisir un autre nombre :");
				choixUser = scanner.nextInt();
			}
			
			//Calcul nombre de batons restants + défaite si il ne reste plus de batons
			nbBatons = nbBatons - choixUser;
			if (nbBatons<1){
				System.out.println("\nVous avez retiré le dernier baton, c'est perdu...");
				continue;
			}
			
			//Affichage du nombre de batons restants
			affichageBatons = "|";
			for (int i = 1; i<nbBatons; i++) {
				affichageBatons = affichageBatons + "|";
			}
			System.out.println("\nVous avez retiré " + choixUser + " batons, il reste " + nbBatons + " batons en jeu :\n" + affichageBatons + "\n");
			
			//Sorti de la boucle en cas de victoire
			if (nbBatons==1) {
				continue;
			}
			
			
			/// TOUR DE L'ORDINATEUR ///
			
			// Si moins de 4 batons choix défini, sinon génération d'un nombre random entre 1 et 3
			if (nbBatons<5) {
				choixOrdi = nbBatons-1;
			}else {
			Random rand = new Random();
			choixOrdi = rand.nextInt(3)+1;
			}
			
			//Calcul et affichage du nombre de batons restants
			nbBatons = nbBatons - choixOrdi;
			affichageBatons = "|";
			for (int i = 1; i<nbBatons; i++) {
				affichageBatons = affichageBatons + "|";
			}
			System.out.println("Votre adversaire à retiré " + choixOrdi + " batons, il reste " + nbBatons + " batons en jeu :\n" + affichageBatons + "\n");
			
			//Analyse si défaite
			if (nbBatons==1) {
				System.out.println("Dommage, il ne reste qu'un baton, vous avez perdu...");
				continue;
			}
		}
		
		//Message en cas de victoire
		System.out.println("Bravo, vous avez gagné!");
		
	}
}
